package io.bidmachine.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.applovin.impl.sdk.i0;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import x7.l0;

/* JADX INFO: compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
/* JADX INFO: loaded from: classes4.dex */
class c implements i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ArrayDeque<b> f19242g = new ArrayDeque<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f19243h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f19244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandlerThread f19245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f19246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference<RuntimeException> f19247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x7.k f19248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f19249f;

    /* JADX INFO: compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            c.this.j(message);
        }
    }

    /* JADX INFO: compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19252b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f19253c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f19254d = new MediaCodec.CryptoInfo();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f19255e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f19256f;

        b() {
        }

        public void a(int i10, int i11, int i12, long j10, int i13) {
            this.f19251a = i10;
            this.f19252b = i11;
            this.f19253c = i12;
            this.f19255e = j10;
            this.f19256f = i13;
        }
    }

    public c(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new x7.k());
    }

    private void f() throws InterruptedException {
        this.f19248e.c();
        ((Handler) x7.a.e(this.f19246c)).obtainMessage(3).sendToTarget();
        this.f19248e.a();
    }

    private static void g(a8.c cVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = cVar.f140f;
        cryptoInfo.numBytesOfClearData = i(cVar.f138d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = i(cVar.f139e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) x7.a.e(h(cVar.f136b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) x7.a.e(h(cVar.f135a, cryptoInfo.iv));
        cryptoInfo.mode = cVar.f137c;
        if (l0.f28136a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.f141g, cVar.f142h));
        }
    }

    private static byte[] h(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static int[] i(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(Message message) {
        b bVar;
        int i10 = message.what;
        if (i10 == 1) {
            bVar = (b) message.obj;
            k(bVar.f19251a, bVar.f19252b, bVar.f19253c, bVar.f19255e, bVar.f19256f);
        } else if (i10 != 2) {
            bVar = null;
            if (i10 == 3) {
                this.f19248e.e();
            } else if (i10 != 4) {
                i0.a(this.f19247d, null, new IllegalStateException(String.valueOf(message.what)));
            } else {
                m((Bundle) message.obj);
            }
        } else {
            bVar = (b) message.obj;
            l(bVar.f19251a, bVar.f19252b, bVar.f19254d, bVar.f19255e, bVar.f19256f);
        }
        if (bVar != null) {
            p(bVar);
        }
    }

    private void k(int i10, int i11, int i12, long j10, int i13) {
        try {
            this.f19244a.queueInputBuffer(i10, i11, i12, j10, i13);
        } catch (RuntimeException e10) {
            i0.a(this.f19247d, null, e10);
        }
    }

    private void l(int i10, int i11, MediaCodec.CryptoInfo cryptoInfo, long j10, int i12) {
        try {
            synchronized (f19243h) {
                this.f19244a.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
            }
        } catch (RuntimeException e10) {
            i0.a(this.f19247d, null, e10);
        }
    }

    private void m(Bundle bundle) {
        try {
            this.f19244a.setParameters(bundle);
        } catch (RuntimeException e10) {
            i0.a(this.f19247d, null, e10);
        }
    }

    private void n() throws InterruptedException {
        ((Handler) x7.a.e(this.f19246c)).removeCallbacksAndMessages(null);
        f();
    }

    private static b o() {
        ArrayDeque<b> arrayDeque = f19242g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new b();
            }
            return arrayDeque.removeFirst();
        }
    }

    private static void p(b bVar) {
        ArrayDeque<b> arrayDeque = f19242g;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.i
    public void a(int i10, int i11, a8.c cVar, long j10, int i12) {
        d();
        b bVarO = o();
        bVarO.a(i10, i11, 0, j10, i12);
        g(cVar, bVarO.f19254d);
        ((Handler) l0.i(this.f19246c)).obtainMessage(2, bVarO).sendToTarget();
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.i
    public void b(int i10, int i11, int i12, long j10, int i13) {
        d();
        b bVarO = o();
        bVarO.a(i10, i11, i12, j10, i13);
        ((Handler) l0.i(this.f19246c)).obtainMessage(1, bVarO).sendToTarget();
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.i
    public void c(Bundle bundle) {
        d();
        ((Handler) l0.i(this.f19246c)).obtainMessage(4, bundle).sendToTarget();
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.i
    public void d() {
        RuntimeException andSet = this.f19247d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.i
    public void flush() {
        if (this.f19249f) {
            try {
                n();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.i
    public void shutdown() {
        if (this.f19249f) {
            flush();
            this.f19245b.quit();
        }
        this.f19249f = false;
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.i
    public void start() {
        if (this.f19249f) {
            return;
        }
        this.f19245b.start();
        this.f19246c = new a(this.f19245b.getLooper());
        this.f19249f = true;
    }

    c(MediaCodec mediaCodec, HandlerThread handlerThread, x7.k kVar) {
        this.f19244a = mediaCodec;
        this.f19245b = handlerThread;
        this.f19248e = kVar;
        this.f19247d = new AtomicReference<>();
    }
}
