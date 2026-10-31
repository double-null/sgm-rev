package ca;

import java.util.Collections;
import v8.o0;

/* JADX INFO: compiled from: H265Reader.java */
/* JADX INFO: loaded from: classes4.dex */
public final class q implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g0 f5329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f5331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private o0 f5332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f5333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f5334f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f5341m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean[] f5335g = new boolean[3];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w f5336h = new w(32, 128);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w f5337i = new w(33, 128);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final w f5338j = new w(34, 128);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final w f5339k = new w(39, 128);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final w f5340l = new w(40, 128);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f5342n = -9223372036854775807L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final x7.a0 f5343o = new x7.a0();

    /* JADX INFO: compiled from: H265Reader.java */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o0 f5344a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f5345b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f5346c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f5347d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f5348e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f5349f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f5350g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f5351h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f5352i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f5353j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f5354k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f5355l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f5356m;

        public a(o0 o0Var) {
            this.f5344a = o0Var;
        }

        private static boolean b(int i10) {
            return (32 <= i10 && i10 <= 35) || i10 == 39;
        }

        private static boolean c(int i10) {
            return i10 < 32 || i10 == 40;
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
        private void d(int i10) {
            long j10 = this.f5355l;
            if (j10 != -9223372036854775807L) {
                long j11 = this.f5345b;
                long j12 = this.f5354k;
                if (j11 == j12) {
                    return;
                }
                boolean z10 = this.f5356m;
                this.f5344a.f(j10, z10 ? 1 : 0, (int) (j11 - j12), i10, null);
            }
        }

        public void a(long j10, int i10, boolean z10) {
            if (this.f5353j && this.f5350g) {
                this.f5356m = this.f5346c;
                this.f5353j = false;
            } else if (this.f5351h || this.f5350g) {
                if (z10 && this.f5352i) {
                    d(i10 + ((int) (j10 - this.f5345b)));
                }
                this.f5354k = this.f5345b;
                this.f5355l = this.f5348e;
                this.f5356m = this.f5346c;
                this.f5352i = true;
            }
        }

        public void e(byte[] bArr, int i10, int i11) {
            if (this.f5349f) {
                int i12 = this.f5347d;
                int i13 = (i10 + 2) - i12;
                if (i13 >= i11) {
                    this.f5347d = i12 + (i11 - i10);
                } else {
                    this.f5350g = (bArr[i13] & 128) != 0;
                    this.f5349f = false;
                }
            }
        }

        public void f() {
            this.f5349f = false;
            this.f5350g = false;
            this.f5351h = false;
            this.f5352i = false;
            this.f5353j = false;
        }

        public void g(long j10, int i10, int i11, long j11, boolean z10) {
            this.f5350g = false;
            this.f5351h = false;
            this.f5348e = j11;
            this.f5347d = 0;
            this.f5345b = j10;
            if (!c(i11)) {
                if (this.f5352i && !this.f5353j) {
                    if (z10) {
                        d(i10);
                    }
                    this.f5352i = false;
                }
                if (b(i11)) {
                    this.f5351h = !this.f5353j;
                    this.f5353j = true;
                }
            }
            boolean z11 = i11 >= 16 && i11 <= 21;
            this.f5346c = z11;
            this.f5349f = z11 || i11 <= 9;
        }
    }

    public q(g0 g0Var, String str) {
        this.f5329a = g0Var;
        this.f5330b = str;
    }

    private void a() {
        x7.a.i(this.f5332d);
        x7.l0.i(this.f5333e);
    }

    private void g(long j10, int i10, int i11, long j11) {
        this.f5333e.a(j10, i10, this.f5334f);
        if (!this.f5334f) {
            this.f5336h.b(i11);
            this.f5337i.b(i11);
            this.f5338j.b(i11);
            if (this.f5336h.c() && this.f5337i.c() && this.f5338j.c()) {
                u7.q qVarI = i(this.f5331c, this.f5336h, this.f5337i, this.f5338j, this.f5330b);
                this.f5332d.a(qVarI);
                com.google.common.base.p.r(qVarI.f26254q != -1);
                this.f5329a.g(qVarI.f26254q);
                this.f5334f = true;
            }
        }
        if (this.f5339k.b(i11)) {
            w wVar = this.f5339k;
            this.f5343o.U(this.f5339k.f5433d, y7.f.L(wVar.f5433d, wVar.f5434e));
            this.f5343o.X(5);
            this.f5329a.c(j11, this.f5343o);
        }
        if (this.f5340l.b(i11)) {
            w wVar2 = this.f5340l;
            this.f5343o.U(this.f5340l.f5433d, y7.f.L(wVar2.f5433d, wVar2.f5434e));
            this.f5343o.X(5);
            this.f5329a.c(j11, this.f5343o);
        }
    }

    private void h(byte[] bArr, int i10, int i11) {
        this.f5333e.e(bArr, i10, i11);
        if (!this.f5334f) {
            this.f5336h.a(bArr, i10, i11);
            this.f5337i.a(bArr, i10, i11);
            this.f5338j.a(bArr, i10, i11);
        }
        this.f5339k.a(bArr, i10, i11);
        this.f5340l.a(bArr, i10, i11);
    }

    private static u7.q i(String str, w wVar, w wVar2, w wVar3, String str2) {
        int i10 = wVar.f5434e;
        byte[] bArr = new byte[wVar2.f5434e + i10 + wVar3.f5434e];
        System.arraycopy(wVar.f5433d, 0, bArr, 0, i10);
        System.arraycopy(wVar2.f5433d, 0, bArr, wVar.f5434e, wVar2.f5434e);
        System.arraycopy(wVar3.f5433d, 0, bArr, wVar.f5434e + wVar2.f5434e, wVar3.f5434e);
        y7.f.h hVarU = y7.f.u(wVar2.f5433d, 3, wVar2.f5434e, null);
        y7.f.c cVar = hVarU.f28729c;
        return new u7.q.b().f0(str).U(str2).u0("video/hevc").S(cVar != null ? x7.i.f(cVar.f28703a, cVar.f28704b, cVar.f28705c, cVar.f28706d, cVar.f28707e, cVar.f28708f) : null).B0(hVarU.f28734h).d0(hVarU.f28735i).T(new u7.g.b().d(hVarU.f28738l).c(hVarU.f28739m).e(hVarU.f28740n).g(hVarU.f28731e + 8).b(hVarU.f28732f + 8).a()).q0(hVarU.f28736j).l0(hVarU.f28737k).m0(hVarU.f28728b + 1).g0(Collections.singletonList(bArr)).N();
    }

    private void j(long j10, int i10, int i11, long j11) {
        this.f5333e.g(j10, i10, i11, j11, this.f5334f);
        if (!this.f5334f) {
            this.f5336h.e(i11);
            this.f5337i.e(i11);
            this.f5338j.e(i11);
        }
        this.f5339k.e(i11);
        this.f5340l.e(i11);
    }

    @Override // ca.m
    public void b() {
        this.f5341m = 0L;
        this.f5342n = -9223372036854775807L;
        y7.f.c(this.f5335g);
        this.f5336h.d();
        this.f5337i.d();
        this.f5338j.d();
        this.f5339k.d();
        this.f5340l.d();
        this.f5329a.b();
        a aVar = this.f5333e;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // ca.m
    public void c(x7.a0 a0Var) {
        int i10;
        a();
        while (a0Var.a() > 0) {
            int iF = a0Var.f();
            int iG = a0Var.g();
            byte[] bArrE = a0Var.e();
            this.f5341m += (long) a0Var.a();
            this.f5332d.b(a0Var, a0Var.a());
            while (iF < iG) {
                int iE = y7.f.e(bArrE, iF, iG, this.f5335g);
                if (iE == iG) {
                    h(bArrE, iF, iG);
                    return;
                }
                int i11 = y7.f.i(bArrE, iE);
                if (iE <= 0 || bArrE[iE - 1] != 0) {
                    i10 = 3;
                } else {
                    iE--;
                    i10 = 4;
                }
                int i12 = iE;
                int i13 = i10;
                int i14 = i12 - iF;
                if (i14 > 0) {
                    h(bArrE, iF, i12);
                }
                int i15 = iG - i12;
                long j10 = this.f5341m - ((long) i15);
                g(j10, i15, i14 < 0 ? -i14 : 0, this.f5342n);
                j(j10, i15, i11, this.f5342n);
                iF = i12 + i13;
            }
        }
    }

    @Override // ca.m
    public void d(v8.r rVar, l0.d dVar) {
        dVar.a();
        this.f5331c = dVar.b();
        o0 o0VarE = rVar.e(dVar.c(), 2);
        this.f5332d = o0VarE;
        this.f5333e = new a(o0VarE);
        this.f5329a.d(rVar, dVar);
    }

    @Override // ca.m
    public void e(boolean z10) {
        a();
        if (z10) {
            this.f5329a.e();
            g(this.f5341m, 0, 0, this.f5342n);
            j(this.f5341m, 0, 48, this.f5342n);
        }
    }

    @Override // ca.m
    public void f(long j10, int i10) {
        this.f5342n = j10;
    }
}
