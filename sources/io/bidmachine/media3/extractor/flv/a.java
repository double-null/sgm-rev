package io.bidmachine.media3.extractor.flv;

import io.bidmachine.media3.common.ParserException;
import java.util.Collections;
import u7.q;
import v8.o0;
import x7.a0;

/* JADX INFO: compiled from: AudioTagPayloadReader.java */
/* JADX INFO: loaded from: classes4.dex */
final class a extends TagPayloadReader {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f20016e = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f20017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f20018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20019d;

    public a(o0 o0Var) {
        super(o0Var);
    }

    @Override // io.bidmachine.media3.extractor.flv.TagPayloadReader
    protected boolean b(a0 a0Var) throws TagPayloadReader.UnsupportedFormatException {
        if (this.f20017b) {
            a0Var.X(1);
        } else {
            int iH = a0Var.H();
            int i10 = (iH >> 4) & 15;
            this.f20019d = i10;
            if (i10 == 2) {
                this.f20015a.a(new q.b().U("video/x-flv").u0("audio/mpeg").R(1).v0(f20016e[(iH >> 2) & 3]).N());
                this.f20018c = true;
            } else if (i10 == 7 || i10 == 8) {
                this.f20015a.a(new q.b().U("video/x-flv").u0(i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").R(1).v0(8000).N());
                this.f20018c = true;
            } else if (i10 != 10) {
                throw new TagPayloadReader.UnsupportedFormatException("Audio format not supported: " + this.f20019d);
            }
            this.f20017b = true;
        }
        return true;
    }

    @Override // io.bidmachine.media3.extractor.flv.TagPayloadReader
    protected boolean c(a0 a0Var, long j10) throws ParserException {
        if (this.f20019d == 2) {
            int iA = a0Var.a();
            this.f20015a.b(a0Var, iA);
            this.f20015a.f(j10, 1, iA, 0, null);
            return true;
        }
        int iH = a0Var.H();
        if (iH != 0 || this.f20018c) {
            if (this.f20019d == 10 && iH != 1) {
                return false;
            }
            int iA2 = a0Var.a();
            this.f20015a.b(a0Var, iA2);
            this.f20015a.f(j10, 1, iA2, 0, null);
            return true;
        }
        int iA3 = a0Var.a();
        byte[] bArr = new byte[iA3];
        a0Var.l(bArr, 0, iA3);
        v8.a.b bVarE = v8.a.e(bArr);
        this.f20015a.a(new q.b().U("video/x-flv").u0("audio/mp4a-latm").S(bVarE.f27226c).R(bVarE.f27225b).v0(bVarE.f27224a).g0(Collections.singletonList(bArr)).N());
        this.f20018c = true;
        return false;
    }
}
