package v8;

import java.io.IOException;

/* JADX INFO: compiled from: TrueHdSampleRechunker.java */
/* JADX INFO: loaded from: classes4.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f27407a = new byte[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f27408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f27410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f27411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f27412f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f27413g;

    public void a(o0 o0Var, o0.a aVar) {
        if (this.f27409c > 0) {
            o0Var.f(this.f27410d, this.f27411e, this.f27412f, this.f27413g, aVar);
            this.f27409c = 0;
        }
    }

    public void b() {
        this.f27408b = false;
        this.f27409c = 0;
    }

    public void c(o0 o0Var, long j10, int i10, int i11, int i12, o0.a aVar) {
        x7.a.h(this.f27413g <= i11 + i12, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f27408b) {
            int i13 = this.f27409c;
            int i14 = i13 + 1;
            this.f27409c = i14;
            if (i13 == 0) {
                this.f27410d = j10;
                this.f27411e = i10;
                this.f27412f = 0;
            }
            this.f27412f += i11;
            this.f27413g = i12;
            if (i14 >= 16) {
                a(o0Var, aVar);
            }
        }
    }

    public void d(q qVar) throws IOException {
        if (this.f27408b) {
            return;
        }
        qVar.n(this.f27407a, 0, 10);
        qVar.d();
        if (b.j(this.f27407a) == 0) {
            return;
        }
        this.f27408b = true;
    }
}
