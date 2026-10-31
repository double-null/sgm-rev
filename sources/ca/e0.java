package ca;

/* JADX INFO: compiled from: SectionReader.java */
/* JADX INFO: loaded from: classes4.dex */
public final class e0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f5081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x7.a0 f5082b = new x7.a0(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f5083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f5084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f5085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f5086f;

    public e0(d0 d0Var) {
        this.f5081a = d0Var;
    }

    @Override // ca.l0
    public void a(x7.g0 g0Var, v8.r rVar, l0.d dVar) {
        this.f5081a.a(g0Var, rVar, dVar);
        this.f5086f = true;
    }

    @Override // ca.l0
    public void b() {
        this.f5086f = true;
    }

    @Override // ca.l0
    public void c(x7.a0 a0Var, int i10) {
        int iF;
        boolean z10 = (i10 & 1) != 0;
        if (z10) {
            iF = a0Var.f() + a0Var.H();
        } else {
            iF = -1;
        }
        if (this.f5086f) {
            if (!z10) {
                return;
            }
            this.f5086f = false;
            a0Var.W(iF);
            this.f5084d = 0;
        }
        while (a0Var.a() > 0) {
            int i11 = this.f5084d;
            if (i11 < 3) {
                if (i11 == 0) {
                    int iH = a0Var.H();
                    a0Var.W(a0Var.f() - 1);
                    if (iH == 255) {
                        this.f5086f = true;
                        return;
                    }
                }
                int iMin = Math.min(a0Var.a(), 3 - this.f5084d);
                a0Var.l(this.f5082b.e(), this.f5084d, iMin);
                int i12 = this.f5084d + iMin;
                this.f5084d = i12;
                if (i12 == 3) {
                    this.f5082b.W(0);
                    this.f5082b.V(3);
                    this.f5082b.X(1);
                    int iH2 = this.f5082b.H();
                    int iH3 = this.f5082b.H();
                    this.f5085e = (iH2 & 128) != 0;
                    this.f5083c = (((iH2 & 15) << 8) | iH3) + 3;
                    int iB = this.f5082b.b();
                    int i13 = this.f5083c;
                    if (iB < i13) {
                        this.f5082b.c(Math.min(4098, Math.max(i13, this.f5082b.b() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(a0Var.a(), this.f5083c - this.f5084d);
                a0Var.l(this.f5082b.e(), this.f5084d, iMin2);
                int i14 = this.f5084d + iMin2;
                this.f5084d = i14;
                int i15 = this.f5083c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.f5085e) {
                        this.f5082b.V(i15);
                    } else {
                        if (x7.l0.x(this.f5082b.e(), 0, this.f5083c, -1) != 0) {
                            this.f5086f = true;
                            return;
                        }
                        this.f5082b.V(this.f5083c - 4);
                    }
                    this.f5082b.W(0);
                    this.f5081a.c(this.f5082b);
                    this.f5084d = 0;
                }
            }
        }
    }
}
