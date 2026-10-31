package io.bidmachine.media3.exoplayer.dash;

import b8.u;
import io.bidmachine.media3.decoder.DecoderInputBuffer;
import java.io.IOException;
import n8.s;
import u7.q;
import x7.l0;

/* JADX INFO: compiled from: EventSampleStream.java */
/* JADX INFO: loaded from: classes4.dex */
final class e implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f18458a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long[] f18460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f18461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f8.f f18462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f18463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f18464g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g9.c f18459b = new g9.c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f18465h = -9223372036854775807L;

    public e(f8.f fVar, q qVar, boolean z10) {
        this.f18458a = qVar;
        this.f18462e = fVar;
        this.f18460c = fVar.f14697b;
        d(fVar, z10);
    }

    public String b() {
        return this.f18462e.a();
    }

    public void c(long j10) {
        int iD = l0.d(this.f18460c, j10, true, false);
        this.f18464g = iD;
        if (!(this.f18461d && iD == this.f18460c.length)) {
            j10 = -9223372036854775807L;
        }
        this.f18465h = j10;
    }

    public void d(f8.f fVar, boolean z10) {
        int i10 = this.f18464g;
        long j10 = i10 == 0 ? -9223372036854775807L : this.f18460c[i10 - 1];
        this.f18461d = z10;
        this.f18462e = fVar;
        long[] jArr = fVar.f14697b;
        this.f18460c = jArr;
        long j11 = this.f18465h;
        if (j11 != -9223372036854775807L) {
            c(j11);
        } else if (j10 != -9223372036854775807L) {
            this.f18464g = l0.d(jArr, j10, false, false);
        }
    }

    @Override // n8.s
    public int e(u uVar, DecoderInputBuffer decoderInputBuffer, int i10) {
        int i11 = this.f18464g;
        boolean z10 = i11 == this.f18460c.length;
        if (z10 && !this.f18461d) {
            decoderInputBuffer.o(4);
            return -4;
        }
        if ((i10 & 2) != 0 || !this.f18463f) {
            uVar.f4168b = this.f18458a;
            this.f18463f = true;
            return -5;
        }
        if (z10) {
            return -3;
        }
        if ((i10 & 1) == 0) {
            this.f18464g = i11 + 1;
        }
        if ((i10 & 4) == 0) {
            byte[] bArrA = this.f18459b.a(this.f18462e.f14696a[i11]);
            decoderInputBuffer.q(bArrA.length);
            decoderInputBuffer.f18057d.put(bArrA);
        }
        decoderInputBuffer.f18059f = this.f18460c[i11];
        decoderInputBuffer.o(1);
        return -4;
    }

    @Override // n8.s
    public boolean h() {
        return true;
    }

    @Override // n8.s
    public int r(long j10) {
        int iMax = Math.max(this.f18464g, l0.d(this.f18460c, j10, true, false));
        int i10 = iMax - this.f18464g;
        this.f18464g = iMax;
        return i10;
    }

    @Override // n8.s
    public void a() throws IOException {
    }
}
