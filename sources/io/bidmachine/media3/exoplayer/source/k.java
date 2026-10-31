package io.bidmachine.media3.exoplayer.source;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import io.bidmachine.media3.decoder.DecoderInputBuffer;
import io.bidmachine.media3.exoplayer.k1;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: ExternallyLoadedMediaPeriod.java */
/* JADX INFO: loaded from: classes4.dex */
final class k implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f19634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f19635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n8.x f19636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f19637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f19638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReference<Throwable> f19639f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ListenableFuture<?> f19640g;

    /* JADX INFO: compiled from: ExternallyLoadedMediaPeriod.java */
    class a implements com.google.common.util.concurrent.v<Object> {
        a() {
        }

        @Override // com.google.common.util.concurrent.v
        public void onFailure(Throwable th) {
            k.this.f19639f.set(th);
        }

        @Override // com.google.common.util.concurrent.v
        public void onSuccess(Object obj) {
            k.this.f19638e.set(true);
        }
    }

    /* JADX INFO: compiled from: ExternallyLoadedMediaPeriod.java */
    private final class b implements n8.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f19642a = 0;

        public b() {
        }

        @Override // n8.s
        public void a() throws IOException {
            Throwable th = (Throwable) k.this.f19639f.get();
            if (th != null) {
                throw new IOException(th);
            }
        }

        @Override // n8.s
        public int e(b8.u uVar, DecoderInputBuffer decoderInputBuffer, int i10) {
            int i11 = this.f19642a;
            if (i11 == 2) {
                decoderInputBuffer.e(4);
                return -4;
            }
            if ((i10 & 2) != 0 || i11 == 0) {
                uVar.f4168b = k.this.f19636c.b(0).a(0);
                this.f19642a = 1;
                return -5;
            }
            if (!k.this.f19638e.get()) {
                return -3;
            }
            int length = k.this.f19637d.length;
            decoderInputBuffer.e(1);
            decoderInputBuffer.f18059f = 0L;
            if ((i10 & 4) == 0) {
                decoderInputBuffer.q(length);
                decoderInputBuffer.f18057d.put(k.this.f19637d, 0, length);
            }
            if ((i10 & 1) == 0) {
                this.f19642a = 2;
            }
            return -4;
        }

        @Override // n8.s
        public boolean h() {
            return k.this.f19638e.get();
        }

        @Override // n8.s
        public int r(long j10) {
            return 0;
        }
    }

    public k(Uri uri, String str, j jVar) {
        this.f19634a = uri;
        u7.q qVarN = new u7.q.b().u0(str).N();
        this.f19635b = jVar;
        this.f19636c = new n8.x(new u7.e0(qVarN));
        this.f19637d = uri.toString().getBytes(StandardCharsets.UTF_8);
        this.f19638e = new AtomicBoolean();
        this.f19639f = new AtomicReference<>();
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public long b() {
        return this.f19638e.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public boolean c(k1 k1Var) {
        return !this.f19638e.get();
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public long f() {
        return this.f19638e.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public long i(q8.q[] qVarArr, boolean[] zArr, n8.s[] sVarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < qVarArr.length; i10++) {
            if (sVarArr[i10] != null && (qVarArr[i10] == null || !zArr[i10])) {
                sVarArr[i10] = null;
            }
            if (sVarArr[i10] == null && qVarArr[i10] != null) {
                sVarArr[i10] = new b();
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public boolean isLoading() {
        return !this.f19638e.get();
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public long k() {
        return -9223372036854775807L;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public void l(q.a aVar, long j10) {
        aVar.e(this);
        ListenableFuture<?> listenableFutureA = this.f19635b.a(new j.a(this.f19634a));
        this.f19640g = listenableFutureA;
        com.google.common.util.concurrent.x.a(listenableFutureA, new a(), com.google.common.util.concurrent.g0.a());
    }

    public void n() {
        ListenableFuture<?> listenableFuture = this.f19640g;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public n8.x t() {
        return this.f19636c;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public void q() {
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public void g(long j10) {
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public long j(long j10) {
        return j10;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public long d(long j10, b8.a0 a0Var) {
        return j10;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public void u(long j10, boolean z10) {
    }
}
