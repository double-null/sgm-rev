package io.bidmachine.media3.extractor.flv;

import io.bidmachine.media3.common.ParserException;
import u7.q;
import v8.o0;
import x7.a0;
import y7.f;

/* JADX INFO: compiled from: VideoTagPayloadReader.java */
/* JADX INFO: loaded from: classes4.dex */
final class d extends TagPayloadReader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a0 f20040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a0 f20041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f20043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f20044f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f20045g;

    public d(o0 o0Var) {
        super(o0Var);
        this.f20040b = new a0(f.f28694a);
        this.f20041c = new a0(4);
    }

    @Override // io.bidmachine.media3.extractor.flv.TagPayloadReader
    protected boolean b(a0 a0Var) throws TagPayloadReader.UnsupportedFormatException {
        int iH = a0Var.H();
        int i10 = (iH >> 4) & 15;
        int i11 = iH & 15;
        if (i11 == 7) {
            this.f20045g = i10;
            return i10 != 5;
        }
        throw new TagPayloadReader.UnsupportedFormatException("Video format not supported: " + i11);
    }

    @Override // io.bidmachine.media3.extractor.flv.TagPayloadReader
    protected boolean c(a0 a0Var, long j10) throws ParserException {
        int iH = a0Var.H();
        long jR = j10 + (((long) a0Var.r()) * 1000);
        if (iH == 0 && !this.f20043e) {
            a0 a0Var2 = new a0(new byte[a0Var.a()]);
            a0Var.l(a0Var2.e(), 0, a0Var.a());
            v8.d dVarB = v8.d.b(a0Var2);
            this.f20042d = dVarB.f27272b;
            this.f20015a.a(new q.b().U("video/x-flv").u0("video/avc").S(dVarB.f27282l).B0(dVarB.f27273c).d0(dVarB.f27274d).q0(dVarB.f27281k).g0(dVarB.f27271a).N());
            this.f20043e = true;
            return false;
        }
        if (iH != 1 || !this.f20043e) {
            return false;
        }
        int i10 = this.f20045g == 1 ? 1 : 0;
        if (!this.f20044f && i10 == 0) {
            return false;
        }
        byte[] bArrE = this.f20041c.e();
        bArrE[0] = 0;
        bArrE[1] = 0;
        bArrE[2] = 0;
        int i11 = 4 - this.f20042d;
        int i12 = 0;
        while (a0Var.a() > 0) {
            a0Var.l(this.f20041c.e(), i11, this.f20042d);
            this.f20041c.W(0);
            int iL = this.f20041c.L();
            this.f20040b.W(0);
            this.f20015a.b(this.f20040b, 4);
            this.f20015a.b(a0Var, iL);
            i12 = i12 + 4 + iL;
        }
        this.f20015a.f(jR, i10, i12, 0, null);
        this.f20044f = true;
        return true;
    }
}
