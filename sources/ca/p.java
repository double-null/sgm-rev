package ca;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import v8.o0;

/* JADX INFO: compiled from: H264Reader.java */
/* JADX INFO: loaded from: classes4.dex */
public final class p implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g0 f5278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f5279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f5280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f5281d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f5285h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f5287j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private o0 f5288k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f5289l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f5290m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f5292o;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean[] f5286i = new boolean[3];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w f5282e = new w(7, 128);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w f5283f = new w(8, 128);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w f5284g = new w(6, 128);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f5291n = -9223372036854775807L;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final x7.a0 f5293p = new x7.a0();

    /* JADX INFO: compiled from: H264Reader.java */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o0 f5294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f5295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f5296c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final SparseArray<y7.f.m> f5297d = new SparseArray<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final SparseArray<y7.f.l> f5298e = new SparseArray<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final y7.h f5299f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte[] f5300g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f5301h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f5302i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f5303j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f5304k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f5305l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private a f5306m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private a f5307n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f5308o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private long f5309p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private long f5310q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f5311r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f5312s;

        /* JADX INFO: compiled from: H264Reader.java */
        private static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f5313a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f5314b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private y7.f.m f5315c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f5316d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f5317e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f5318f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f5319g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private boolean f5320h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private boolean f5321i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private boolean f5322j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private boolean f5323k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private int f5324l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private int f5325m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private int f5326n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private int f5327o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private int f5328p;

            private a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean c(a aVar) {
                int i10;
                int i11;
                int i12;
                boolean z10;
                if (!this.f5313a) {
                    return false;
                }
                if (!aVar.f5313a) {
                    return true;
                }
                y7.f.m mVar = (y7.f.m) x7.a.i(this.f5315c);
                y7.f.m mVar2 = (y7.f.m) x7.a.i(aVar.f5315c);
                return (this.f5318f == aVar.f5318f && this.f5319g == aVar.f5319g && this.f5320h == aVar.f5320h && (!this.f5321i || !aVar.f5321i || this.f5322j == aVar.f5322j) && (((i10 = this.f5316d) == (i11 = aVar.f5316d) || (i10 != 0 && i11 != 0)) && (((i12 = mVar.f28767n) != 0 || mVar2.f28767n != 0 || (this.f5325m == aVar.f5325m && this.f5326n == aVar.f5326n)) && ((i12 != 1 || mVar2.f28767n != 1 || (this.f5327o == aVar.f5327o && this.f5328p == aVar.f5328p)) && (z10 = this.f5323k) == aVar.f5323k && (!z10 || this.f5324l == aVar.f5324l))))) ? false : true;
            }

            public void b() {
                this.f5314b = false;
                this.f5313a = false;
            }

            public boolean d() {
                int i10;
                return this.f5314b && ((i10 = this.f5317e) == 7 || i10 == 2);
            }

            public void e(y7.f.m mVar, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
                this.f5315c = mVar;
                this.f5316d = i10;
                this.f5317e = i11;
                this.f5318f = i12;
                this.f5319g = i13;
                this.f5320h = z10;
                this.f5321i = z11;
                this.f5322j = z12;
                this.f5323k = z13;
                this.f5324l = i14;
                this.f5325m = i15;
                this.f5326n = i16;
                this.f5327o = i17;
                this.f5328p = i18;
                this.f5313a = true;
                this.f5314b = true;
            }

            public void f(int i10) {
                this.f5317e = i10;
                this.f5314b = true;
            }
        }

        public b(o0 o0Var, boolean z10, boolean z11) {
            this.f5294a = o0Var;
            this.f5295b = z10;
            this.f5296c = z11;
            this.f5306m = new a();
            this.f5307n = new a();
            byte[] bArr = new byte[128];
            this.f5300g = bArr;
            this.f5299f = new y7.h(bArr, 0, 0);
            g();
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
            long j10 = this.f5310q;
            if (j10 != -9223372036854775807L) {
                long j11 = this.f5303j;
                long j12 = this.f5309p;
                if (j11 == j12) {
                    return;
                }
                boolean z10 = this.f5311r;
                this.f5294a.f(j10, z10 ? 1 : 0, (int) (j11 - j12), i10, null);
            }
        }

        private void h() {
            boolean zD = this.f5295b ? this.f5307n.d() : this.f5312s;
            boolean z10 = this.f5311r;
            int i10 = this.f5302i;
            boolean z11 = true;
            if (i10 != 5 && (!zD || i10 != 1)) {
                z11 = false;
            }
            this.f5311r = z10 | z11;
        }

        /* JADX WARN: Code duplicated, block: B:53:0x00ff  */
        /* JADX WARN: Code duplicated, block: B:54:0x0102  */
        /* JADX WARN: Code duplicated, block: B:56:0x0106  */
        /* JADX WARN: Code duplicated, block: B:58:0x010e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:59:0x010f  */
        /* JADX WARN: Code duplicated, block: B:60:0x0118  */
        /* JADX WARN: Code duplicated, block: B:63:0x011e  */
        /* JADX WARN: Code duplicated, block: B:65:0x0128 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:66:0x0129  */
        /* JADX WARN: Code duplicated, block: B:74:0x0152  */
        public void a(byte[] bArr, int i10, int i11) {
            boolean z10;
            boolean z11;
            boolean zE;
            boolean z12;
            int i12;
            int i13;
            int i14;
            int iH;
            int i15;
            int iH2;
            int iF;
            if (this.f5304k) {
                int i16 = i11 - i10;
                byte[] bArr2 = this.f5300g;
                int length = bArr2.length;
                int i17 = this.f5301h;
                if (length < i17 + i16) {
                    this.f5300g = Arrays.copyOf(bArr2, (i17 + i16) * 2);
                }
                System.arraycopy(bArr, i10, this.f5300g, this.f5301h, i16);
                int i18 = this.f5301h + i16;
                this.f5301h = i18;
                this.f5299f.j(this.f5300g, 0, i18);
                if (this.f5299f.c(8)) {
                    this.f5299f.l();
                    int iF2 = this.f5299f.f(2);
                    this.f5299f.m(5);
                    if (this.f5299f.d()) {
                        this.f5299f.i();
                        if (this.f5299f.d()) {
                            int i19 = this.f5299f.i();
                            if (!this.f5296c) {
                                this.f5304k = false;
                                this.f5307n.f(i19);
                                return;
                            }
                            if (this.f5299f.d()) {
                                int i20 = this.f5299f.i();
                                if (this.f5298e.indexOfKey(i20) < 0) {
                                    this.f5304k = false;
                                    return;
                                }
                                y7.f.l lVar = this.f5298e.get(i20);
                                y7.f.m mVar = this.f5297d.get(lVar.f28752b);
                                if (mVar.f28764k) {
                                    if (!this.f5299f.c(2)) {
                                        return;
                                    } else {
                                        this.f5299f.m(2);
                                    }
                                }
                                if (this.f5299f.c(mVar.f28766m)) {
                                    int iF3 = this.f5299f.f(mVar.f28766m);
                                    if (!mVar.f28765l) {
                                        if (this.f5299f.c(1)) {
                                            boolean zE2 = this.f5299f.e();
                                            if (!zE2) {
                                                z10 = zE2;
                                                z11 = false;
                                            } else {
                                                if (!this.f5299f.c(1)) {
                                                    return;
                                                }
                                                z10 = zE2;
                                                z11 = true;
                                                zE = this.f5299f.e();
                                            }
                                            if (this.f5302i == 5) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            if (z12) {
                                                i12 = 0;
                                            } else if (!this.f5299f.d()) {
                                                return;
                                            } else {
                                                i12 = this.f5299f.i();
                                            }
                                            i13 = mVar.f28767n;
                                            if (i13 != 0) {
                                                if (this.f5299f.c(mVar.f28768o)) {
                                                    iF = this.f5299f.f(mVar.f28768o);
                                                    if (lVar.f28753c || z10) {
                                                        i14 = iF;
                                                        iH = 0;
                                                    } else {
                                                        if (!this.f5299f.d()) {
                                                            return;
                                                        }
                                                        iH = this.f5299f.h();
                                                        i14 = iF;
                                                        i15 = 0;
                                                    }
                                                    iH2 = i15;
                                                    this.f5307n.e(mVar, iF2, i19, iF3, i20, z10, z11, zE, z12, i12, i14, iH, i15, iH2);
                                                    this.f5304k = false;
                                                }
                                                return;
                                            }
                                            if (i13 == 1 || mVar.f28769p) {
                                                i14 = 0;
                                                iH = 0;
                                            } else {
                                                if (!this.f5299f.d()) {
                                                    return;
                                                }
                                                int iH3 = this.f5299f.h();
                                                if (!lVar.f28753c || z10) {
                                                    i15 = iH3;
                                                    i14 = 0;
                                                    iH = 0;
                                                    iH2 = 0;
                                                } else {
                                                    if (!this.f5299f.d()) {
                                                        return;
                                                    }
                                                    iH2 = this.f5299f.h();
                                                    i15 = iH3;
                                                    i14 = 0;
                                                    iH = 0;
                                                }
                                            }
                                            this.f5307n.e(mVar, iF2, i19, iF3, i20, z10, z11, zE, z12, i12, i14, iH, i15, iH2);
                                            this.f5304k = false;
                                            i15 = iH;
                                            iH2 = i15;
                                            this.f5307n.e(mVar, iF2, i19, iF3, i20, z10, z11, zE, z12, i12, i14, iH, i15, iH2);
                                            this.f5304k = false;
                                        }
                                        return;
                                    }
                                    z10 = false;
                                    z11 = false;
                                    zE = z11;
                                    if (this.f5302i == 5) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        i12 = 0;
                                    } else if (!this.f5299f.d()) {
                                        return;
                                    } else {
                                        i12 = this.f5299f.i();
                                    }
                                    i13 = mVar.f28767n;
                                    if (i13 != 0) {
                                        if (i13 == 1) {
                                        }
                                        i14 = 0;
                                        iH = 0;
                                    } else {
                                        if (this.f5299f.c(mVar.f28768o)) {
                                            return;
                                        }
                                        iF = this.f5299f.f(mVar.f28768o);
                                        if (lVar.f28753c) {
                                        }
                                        i14 = iF;
                                        iH = 0;
                                    }
                                    i15 = iH;
                                    iH2 = i15;
                                    this.f5307n.e(mVar, iF2, i19, iF3, i20, z10, z11, zE, z12, i12, i14, iH, i15, iH2);
                                    this.f5304k = false;
                                }
                            }
                        }
                    }
                }
            }
        }

        public boolean b(long j10, int i10, boolean z10) {
            if (this.f5302i == 9 || (this.f5296c && this.f5307n.c(this.f5306m))) {
                if (z10 && this.f5308o) {
                    d(i10 + ((int) (j10 - this.f5303j)));
                }
                this.f5309p = this.f5303j;
                this.f5310q = this.f5305l;
                this.f5311r = false;
                this.f5308o = true;
            }
            h();
            this.f5302i = 24;
            return this.f5311r;
        }

        public boolean c() {
            return this.f5296c;
        }

        public void e(y7.f.l lVar) {
            this.f5298e.append(lVar.f28751a, lVar);
        }

        public void f(y7.f.m mVar) {
            this.f5297d.append(mVar.f28757d, mVar);
        }

        public void g() {
            this.f5304k = false;
            this.f5308o = false;
            this.f5307n.b();
        }

        public void i(long j10, int i10, long j11, boolean z10) {
            this.f5302i = i10;
            this.f5305l = j11;
            this.f5303j = j10;
            this.f5312s = z10;
            if (!this.f5295b || i10 != 1) {
                if (!this.f5296c) {
                    return;
                }
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            }
            a aVar = this.f5306m;
            this.f5306m = this.f5307n;
            this.f5307n = aVar;
            aVar.b();
            this.f5301h = 0;
            this.f5304k = true;
        }
    }

    public p(g0 g0Var, boolean z10, boolean z11, String str) {
        this.f5278a = g0Var;
        this.f5279b = z10;
        this.f5280c = z11;
        this.f5281d = str;
    }

    private void a() {
        x7.a.i(this.f5288k);
        x7.l0.i(this.f5289l);
    }

    private void g(long j10, int i10, int i11, long j11) {
        if (!this.f5290m || this.f5289l.c()) {
            this.f5282e.b(i11);
            this.f5283f.b(i11);
            if (this.f5290m) {
                if (this.f5282e.c()) {
                    w wVar = this.f5282e;
                    y7.f.m mVarC = y7.f.C(wVar.f5433d, 3, wVar.f5434e);
                    this.f5278a.g(mVarC.f28773t);
                    this.f5289l.f(mVarC);
                    this.f5282e.d();
                } else if (this.f5283f.c()) {
                    w wVar2 = this.f5283f;
                    this.f5289l.e(y7.f.A(wVar2.f5433d, 3, wVar2.f5434e));
                    this.f5283f.d();
                }
            } else if (this.f5282e.c() && this.f5283f.c()) {
                ArrayList arrayList = new ArrayList();
                w wVar3 = this.f5282e;
                arrayList.add(Arrays.copyOf(wVar3.f5433d, wVar3.f5434e));
                w wVar4 = this.f5283f;
                arrayList.add(Arrays.copyOf(wVar4.f5433d, wVar4.f5434e));
                w wVar5 = this.f5282e;
                y7.f.m mVarC2 = y7.f.C(wVar5.f5433d, 3, wVar5.f5434e);
                w wVar6 = this.f5283f;
                y7.f.l lVarA = y7.f.A(wVar6.f5433d, 3, wVar6.f5434e);
                this.f5288k.a(new u7.q.b().f0(this.f5287j).U(this.f5281d).u0("video/avc").S(x7.i.d(mVarC2.f28754a, mVarC2.f28755b, mVarC2.f28756c)).B0(mVarC2.f28759f).d0(mVarC2.f28760g).T(new u7.g.b().d(mVarC2.f28770q).c(mVarC2.f28771r).e(mVarC2.f28772s).g(mVarC2.f28762i + 8).b(mVarC2.f28763j + 8).a()).q0(mVarC2.f28761h).g0(arrayList).l0(mVarC2.f28773t).N());
                this.f5290m = true;
                this.f5278a.g(mVarC2.f28773t);
                this.f5289l.f(mVarC2);
                this.f5289l.e(lVarA);
                this.f5282e.d();
                this.f5283f.d();
            }
        }
        if (this.f5284g.b(i11)) {
            w wVar7 = this.f5284g;
            this.f5293p.U(this.f5284g.f5433d, y7.f.L(wVar7.f5433d, wVar7.f5434e));
            this.f5293p.W(4);
            this.f5278a.c(j11, this.f5293p);
        }
        if (this.f5289l.b(j10, i10, this.f5290m)) {
            this.f5292o = false;
        }
    }

    private void h(byte[] bArr, int i10, int i11) {
        if (!this.f5290m || this.f5289l.c()) {
            this.f5282e.a(bArr, i10, i11);
            this.f5283f.a(bArr, i10, i11);
        }
        this.f5284g.a(bArr, i10, i11);
        this.f5289l.a(bArr, i10, i11);
    }

    private void i(long j10, int i10, long j11) {
        if (!this.f5290m || this.f5289l.c()) {
            this.f5282e.e(i10);
            this.f5283f.e(i10);
        }
        this.f5284g.e(i10);
        this.f5289l.i(j10, i10, j11, this.f5292o);
    }

    @Override // ca.m
    public void b() {
        this.f5285h = 0L;
        this.f5292o = false;
        this.f5291n = -9223372036854775807L;
        y7.f.c(this.f5286i);
        this.f5282e.d();
        this.f5283f.d();
        this.f5284g.d();
        this.f5278a.b();
        b bVar = this.f5289l;
        if (bVar != null) {
            bVar.g();
        }
    }

    @Override // ca.m
    public void c(x7.a0 a0Var) {
        int i10;
        a();
        int iF = a0Var.f();
        int iG = a0Var.g();
        byte[] bArrE = a0Var.e();
        this.f5285h += (long) a0Var.a();
        this.f5288k.b(a0Var, a0Var.a());
        while (true) {
            int iE = y7.f.e(bArrE, iF, iG, this.f5286i);
            if (iE == iG) {
                h(bArrE, iF, iG);
                return;
            }
            int iJ = y7.f.j(bArrE, iE);
            if (iE <= 0 || bArrE[iE - 1] != 0) {
                i10 = 3;
            } else {
                iE--;
                i10 = 4;
            }
            int i11 = iE;
            int i12 = i10;
            int i13 = i11 - iF;
            if (i13 > 0) {
                h(bArrE, iF, i11);
            }
            int i14 = iG - i11;
            long j10 = this.f5285h - ((long) i14);
            g(j10, i14, i13 < 0 ? -i13 : 0, this.f5291n);
            i(j10, iJ, this.f5291n);
            iF = i11 + i12;
        }
    }

    @Override // ca.m
    public void d(v8.r rVar, l0.d dVar) {
        dVar.a();
        this.f5287j = dVar.b();
        o0 o0VarE = rVar.e(dVar.c(), 2);
        this.f5288k = o0VarE;
        this.f5289l = new b(o0VarE, this.f5279b, this.f5280c);
        this.f5278a.d(rVar, dVar);
    }

    @Override // ca.m
    public void e(boolean z10) {
        a();
        if (z10) {
            this.f5278a.e();
            g(this.f5285h, 0, 0, this.f5291n);
            i(this.f5285h, 9, this.f5291n);
            g(this.f5285h, 0, 0, this.f5291n);
        }
    }

    @Override // ca.m
    public void f(long j10, int i10) {
        this.f5291n = j10;
        this.f5292o |= (i10 & 2) != 0;
    }
}
