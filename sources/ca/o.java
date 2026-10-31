package ca;

import com.applovin.mediation.adapters.google.NK.ykDFMuXDQMaR;
import java.util.Arrays;
import java.util.Collections;
import v8.o0;

/* JADX INFO: compiled from: H263Reader.java */
/* JADX INFO: loaded from: classes4.dex */
public final class o implements m {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float[] f5251m = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n0 f5252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x7.a0 f5254c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w f5257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f5258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f5259h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f5260i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private o0 f5261j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f5262k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean[] f5255d = new boolean[4];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f5256e = new a(128);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f5263l = -9223372036854775807L;

    /* JADX INFO: compiled from: H263Reader.java */
    private static final class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final byte[] f5264f = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f5265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f5266b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5267c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f5268d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f5269e;

        public a(int i10) {
            this.f5269e = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f5265a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f5269e;
                int length = bArr2.length;
                int i13 = this.f5267c;
                if (length < i13 + i12) {
                    this.f5269e = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f5269e, this.f5267c, i12);
                this.f5267c += i12;
            }
        }

        public void c() {
            this.f5265a = false;
            this.f5267c = 0;
            this.f5266b = 0;
        }

        public boolean b(int i10, int i11) {
            int i12 = this.f5266b;
            if (i12 != 0) {
                String str = ykDFMuXDQMaR.QIXyscyF;
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i10 == 179 || i10 == 181) {
                                this.f5267c -= i11;
                                this.f5265a = false;
                                return true;
                            }
                        } else if ((i10 & 240) != 32) {
                            x7.r.h(str, "Unexpected start code value");
                            c();
                        } else {
                            this.f5268d = this.f5267c;
                            this.f5266b = 4;
                        }
                    } else if (i10 > 31) {
                        x7.r.h(str, "Unexpected start code value");
                        c();
                    } else {
                        this.f5266b = 3;
                    }
                } else if (i10 != 181) {
                    x7.r.h(str, "Unexpected start code value");
                    c();
                } else {
                    this.f5266b = 2;
                }
            } else if (i10 == 176) {
                this.f5266b = 1;
                this.f5265a = true;
            }
            byte[] bArr = f5264f;
            a(bArr, 0, bArr.length);
            return false;
        }
    }

    /* JADX INFO: compiled from: H263Reader.java */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o0 f5270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f5271b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f5272c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f5273d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f5274e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f5275f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f5276g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f5277h;

        public b(o0 o0Var) {
            this.f5270a = o0Var;
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f5272c) {
                int i12 = this.f5275f;
                int i13 = (i10 + 1) - i12;
                if (i13 >= i11) {
                    this.f5275f = i12 + (i11 - i10);
                } else {
                    this.f5273d = ((bArr[i13] & 192) >> 6) == 0;
                    this.f5272c = false;
                }
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public void b(long j10, int i10, boolean z10) {
            x7.a.g(this.f5277h != -9223372036854775807L);
            if (this.f5274e == 182 && z10 && this.f5271b) {
                this.f5270a.f(this.f5277h, this.f5273d ? 1 : 0, (int) (j10 - this.f5276g), i10, null);
            }
            if (this.f5274e != 179) {
                this.f5276g = j10;
            }
        }

        public void c(int i10, long j10) {
            this.f5274e = i10;
            this.f5273d = false;
            this.f5271b = i10 == 182 || i10 == 179;
            this.f5272c = i10 == 182;
            this.f5275f = 0;
            this.f5277h = j10;
        }

        public void d() {
            this.f5271b = false;
            this.f5272c = false;
            this.f5273d = false;
            this.f5274e = -1;
        }
    }

    o(n0 n0Var, String str) {
        this.f5252a = n0Var;
        this.f5253b = str;
        if (n0Var != null) {
            this.f5257f = new w(178, 128);
            this.f5254c = new x7.a0();
        } else {
            this.f5257f = null;
            this.f5254c = null;
        }
    }

    @Override // ca.m
    public void b() {
        y7.f.c(this.f5255d);
        this.f5256e.c();
        b bVar = this.f5258g;
        if (bVar != null) {
            bVar.d();
        }
        w wVar = this.f5257f;
        if (wVar != null) {
            wVar.d();
        }
        this.f5259h = 0L;
        this.f5263l = -9223372036854775807L;
    }

    @Override // ca.m
    public void c(x7.a0 a0Var) {
        x7.a.i(this.f5258g);
        x7.a.i(this.f5261j);
        int iF = a0Var.f();
        int iG = a0Var.g();
        byte[] bArrE = a0Var.e();
        this.f5259h += (long) a0Var.a();
        this.f5261j.b(a0Var, a0Var.a());
        while (true) {
            int iE = y7.f.e(bArrE, iF, iG, this.f5255d);
            if (iE == iG) {
                break;
            }
            int i10 = iE + 3;
            int i11 = a0Var.e()[i10] & 255;
            int i12 = iE - iF;
            int i13 = 0;
            if (!this.f5262k) {
                if (i12 > 0) {
                    this.f5256e.a(bArrE, iF, iE);
                }
                if (this.f5256e.b(i11, i12 < 0 ? -i12 : 0)) {
                    o0 o0Var = this.f5261j;
                    a aVar = this.f5256e;
                    o0Var.a(a(aVar, aVar.f5268d, (String) x7.a.e(this.f5260i), this.f5253b));
                    this.f5262k = true;
                }
            }
            this.f5258g.a(bArrE, iF, iE);
            w wVar = this.f5257f;
            if (wVar != null) {
                if (i12 > 0) {
                    wVar.a(bArrE, iF, iE);
                } else {
                    i13 = -i12;
                }
                if (this.f5257f.b(i13)) {
                    w wVar2 = this.f5257f;
                    ((x7.a0) x7.l0.i(this.f5254c)).U(this.f5257f.f5433d, y7.f.L(wVar2.f5433d, wVar2.f5434e));
                    ((n0) x7.l0.i(this.f5252a)).a(this.f5263l, this.f5254c);
                }
                if (i11 == 178 && a0Var.e()[iE + 2] == 1) {
                    this.f5257f.e(i11);
                }
            }
            int i14 = iG - iE;
            this.f5258g.b(this.f5259h - ((long) i14), i14, this.f5262k);
            this.f5258g.c(i11, this.f5263l);
            iF = i10;
        }
        if (!this.f5262k) {
            this.f5256e.a(bArrE, iF, iG);
        }
        this.f5258g.a(bArrE, iF, iG);
        w wVar3 = this.f5257f;
        if (wVar3 != null) {
            wVar3.a(bArrE, iF, iG);
        }
    }

    @Override // ca.m
    public void d(v8.r rVar, l0.d dVar) {
        dVar.a();
        this.f5260i = dVar.b();
        o0 o0VarE = rVar.e(dVar.c(), 2);
        this.f5261j = o0VarE;
        this.f5258g = new b(o0VarE);
        n0 n0Var = this.f5252a;
        if (n0Var != null) {
            n0Var.b(rVar, dVar);
        }
    }

    @Override // ca.m
    public void e(boolean z10) {
        x7.a.i(this.f5258g);
        if (z10) {
            this.f5258g.b(this.f5259h, 0, this.f5262k);
            this.f5258g.d();
        }
    }

    @Override // ca.m
    public void f(long j10, int i10) {
        this.f5263l = j10;
    }

    private static u7.q a(a aVar, int i10, String str, String str2) {
        byte[] bArrCopyOf = Arrays.copyOf(aVar.f5269e, aVar.f5267c);
        x7.z zVar = new x7.z(bArrCopyOf);
        zVar.s(i10);
        zVar.s(4);
        zVar.q();
        zVar.r(8);
        if (zVar.g()) {
            zVar.r(4);
            zVar.r(3);
        }
        int iH = zVar.h(4);
        float f10 = 1.0f;
        if (iH == 15) {
            int iH2 = zVar.h(8);
            int iH3 = zVar.h(8);
            if (iH3 == 0) {
                x7.r.h("H263Reader", "Invalid aspect ratio");
            } else {
                f10 = iH2 / iH3;
            }
        } else {
            float[] fArr = f5251m;
            if (iH < fArr.length) {
                f10 = fArr[iH];
            } else {
                x7.r.h("H263Reader", "Invalid aspect ratio");
            }
        }
        if (zVar.g()) {
            zVar.r(2);
            zVar.r(1);
            if (zVar.g()) {
                zVar.r(15);
                zVar.q();
                zVar.r(15);
                zVar.q();
                zVar.r(15);
                zVar.q();
                zVar.r(3);
                zVar.r(11);
                zVar.q();
                zVar.r(15);
                zVar.q();
            }
        }
        if (zVar.h(2) != 0) {
            x7.r.h("H263Reader", "Unhandled video object layer shape");
        }
        zVar.q();
        int iH4 = zVar.h(16);
        zVar.q();
        if (zVar.g()) {
            if (iH4 == 0) {
                x7.r.h("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i11 = 0;
                for (int i12 = iH4 - 1; i12 > 0; i12 >>= 1) {
                    i11++;
                }
                zVar.r(i11);
            }
        }
        zVar.q();
        int iH5 = zVar.h(13);
        zVar.q();
        int iH6 = zVar.h(13);
        zVar.q();
        zVar.q();
        return new u7.q.b().f0(str).U(str2).u0(ykDFMuXDQMaR.gpvLNuewwfPus).B0(iH5).d0(iH6).q0(f10).g0(Collections.singletonList(bArrCopyOf)).N();
    }
}
