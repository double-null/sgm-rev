package io.bidmachine.media3.exoplayer.hls;

import b8.u;
import io.bidmachine.media3.decoder.DecoderInputBuffer;
import java.io.IOException;
import n8.s;

/* JADX INFO: compiled from: HlsSampleStream.java */
/* JADX INFO: loaded from: classes4.dex */
final class h implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f18798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18799c = -1;

    public h(l lVar, int i10) {
        this.f18798b = lVar;
        this.f18797a = i10;
    }

    private boolean c() {
        int i10 = this.f18799c;
        return (i10 == -1 || i10 == -3 || i10 == -2) ? false : true;
    }

    @Override // n8.s
    public void a() throws IOException {
        int i10 = this.f18799c;
        if (i10 == -2) {
            throw new SampleQueueMappingException(this.f18798b.t().b(this.f18797a).a(0).f26252o);
        }
        if (i10 == -1) {
            this.f18798b.W();
        } else if (i10 != -3) {
            this.f18798b.X(i10);
        }
    }

    public void b() {
        x7.a.a(this.f18799c == -1);
        this.f18799c = this.f18798b.z(this.f18797a);
    }

    public void d() {
        if (this.f18799c != -1) {
            this.f18798b.s0(this.f18797a);
            this.f18799c = -1;
        }
    }

    @Override // n8.s
    public int e(u uVar, DecoderInputBuffer decoderInputBuffer, int i10) {
        if (this.f18799c == -3) {
            decoderInputBuffer.e(4);
            return -4;
        }
        if (c()) {
            return this.f18798b.h0(this.f18799c, uVar, decoderInputBuffer, i10);
        }
        return -3;
    }

    @Override // n8.s
    public boolean h() {
        return this.f18799c == -3 || (c() && this.f18798b.R(this.f18799c));
    }

    @Override // n8.s
    public int r(long j10) {
        if (c()) {
            return this.f18798b.r0(this.f18799c, j10);
        }
        return 0;
    }
}
