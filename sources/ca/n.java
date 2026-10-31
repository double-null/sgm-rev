package ca;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;
import v8.o0;

/* JADX INFO: compiled from: H262Reader.java */
/* JADX INFO: loaded from: classes4.dex */
public final class n implements m {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final double[] f5225r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f5226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private o0 f5227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n0 f5228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f5229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x7.a0 f5230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w f5231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean[] f5232g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a f5233h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f5234i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f5235j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f5236k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f5237l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f5238m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f5239n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f5240o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f5241p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f5242q;

    /* JADX INFO: compiled from: H262Reader.java */
    private static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final byte[] f5243e = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f5244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5246c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f5247d;

        public a(int i10) {
            this.f5247d = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f5244a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f5247d;
                int length = bArr2.length;
                int i13 = this.f5245b;
                if (length < i13 + i12) {
                    this.f5247d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f5247d, this.f5245b, i12);
                this.f5245b += i12;
            }
        }

        public boolean b(int i10, int i11) {
            if (this.f5244a) {
                int i12 = this.f5245b - i11;
                this.f5245b = i12;
                if (this.f5246c != 0 || i10 != 181) {
                    this.f5244a = false;
                    return true;
                }
                this.f5246c = i12;
            } else if (i10 == 179) {
                this.f5244a = true;
            }
            byte[] bArr = f5243e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f5244a = false;
            this.f5245b = 0;
            this.f5246c = 0;
        }
    }

    public n(String str) {
        this(null, str);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0077  */
    /* JADX WARN: Code duplicated, block: B:16:0x007c  */
    /* JADX WARN: Code duplicated, block: B:18:0x008b  */
    /* JADX WARN: Code duplicated, block: B:20:0x009c  */
    private static Pair<u7.q, Long> a(a aVar, String str, String str2) {
        float f10;
        int i10;
        float f11;
        int i11;
        long j10;
        double[] dArr;
        double d10;
        int i12;
        int i13;
        byte[] bArrCopyOf = Arrays.copyOf(aVar.f5247d, aVar.f5245b);
        int i14 = bArrCopyOf[4] & 255;
        int i15 = bArrCopyOf[5] & 255;
        int i16 = (i14 << 4) | (i15 >> 4);
        int i17 = ((i15 & 15) << 8) | (bArrCopyOf[6] & 255);
        int i18 = (bArrCopyOf[7] & 240) >> 4;
        if (i18 == 2) {
            f10 = i17 * 4;
            i10 = i16 * 3;
        } else {
            if (i18 != 3) {
                if (i18 != 4) {
                    f11 = 1.0f;
                } else {
                    f10 = i17 * 121;
                    i10 = i16 * 100;
                }
                u7.q qVarN = new u7.q.b().f0(str).U(str2).u0("video/mpeg2").B0(i16).d0(i17).q0(f11).g0(Collections.singletonList(bArrCopyOf)).N();
                i11 = (bArrCopyOf[7] & 15) - 1;
                if (i11 >= 0) {
                    dArr = f5225r;
                    if (i11 < dArr.length) {
                        d10 = dArr[i11];
                        byte b10 = bArrCopyOf[aVar.f5246c + 9];
                        i12 = (b10 & 96) >> 5;
                        i13 = b10 & 31;
                        if (i12 != i13) {
                            d10 *= (((double) i12) + 1.0d) / ((double) (i13 + 1));
                        }
                        j10 = (long) (1000000.0d / d10);
                    } else {
                        j10 = 0;
                    }
                } else {
                    j10 = 0;
                }
                return Pair.create(qVarN, Long.valueOf(j10));
            }
            f10 = i17 * 16;
            i10 = i16 * 9;
        }
        f11 = f10 / i10;
        u7.q qVarN2 = new u7.q.b().f0(str).U(str2).u0("video/mpeg2").B0(i16).d0(i17).q0(f11).g0(Collections.singletonList(bArrCopyOf)).N();
        i11 = (bArrCopyOf[7] & 15) - 1;
        if (i11 >= 0) {
            dArr = f5225r;
            if (i11 < dArr.length) {
                d10 = dArr[i11];
                byte b11 = bArrCopyOf[aVar.f5246c + 9];
                i12 = (b11 & 96) >> 5;
                i13 = b11 & 31;
                if (i12 != i13) {
                    d10 *= (((double) i12) + 1.0d) / ((double) (i13 + 1));
                }
                j10 = (long) (1000000.0d / d10);
            } else {
                j10 = 0;
            }
        } else {
            j10 = 0;
        }
        return Pair.create(qVarN2, Long.valueOf(j10));
    }

    @Override // ca.m
    public void b() {
        y7.f.c(this.f5232g);
        this.f5233h.c();
        w wVar = this.f5231f;
        if (wVar != null) {
            wVar.d();
        }
        this.f5234i = 0L;
        this.f5235j = false;
        this.f5238m = -9223372036854775807L;
        this.f5240o = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0114  */
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
    @Override // ca.m
    public void c(x7.a0 a0Var) {
        boolean z10;
        int i10;
        x7.a.i(this.f5227b);
        int iF = a0Var.f();
        int iG = a0Var.g();
        byte[] bArrE = a0Var.e();
        this.f5234i += (long) a0Var.a();
        this.f5227b.b(a0Var, a0Var.a());
        while (true) {
            int iE = y7.f.e(bArrE, iF, iG, this.f5232g);
            if (iE == iG) {
                break;
            }
            int i11 = iE + 3;
            int i12 = a0Var.e()[i11] & 255;
            int i13 = iE - iF;
            if (!this.f5236k) {
                if (i13 > 0) {
                    this.f5233h.a(bArrE, iF, iE);
                }
                if (this.f5233h.b(i12, i13 < 0 ? -i13 : 0)) {
                    Pair<u7.q, Long> pairA = a(this.f5233h, (String) x7.a.e(this.f5226a), this.f5229d);
                    this.f5227b.a((u7.q) pairA.first);
                    this.f5237l = ((Long) pairA.second).longValue();
                    this.f5236k = true;
                }
            }
            w wVar = this.f5231f;
            if (wVar != null) {
                if (i13 > 0) {
                    wVar.a(bArrE, iF, iE);
                    i10 = 0;
                } else {
                    i10 = -i13;
                }
                if (this.f5231f.b(i10)) {
                    w wVar2 = this.f5231f;
                    ((x7.a0) x7.l0.i(this.f5230e)).U(this.f5231f.f5433d, y7.f.L(wVar2.f5433d, wVar2.f5434e));
                    ((n0) x7.l0.i(this.f5228c)).a(this.f5240o, this.f5230e);
                }
                if (i12 == 178 && a0Var.e()[iE + 2] == 1) {
                    this.f5231f.e(i12);
                }
            }
            if (i12 == 0 || i12 == 179) {
                int i14 = iG - iE;
                if (this.f5242q && this.f5236k) {
                    long j10 = this.f5240o;
                    if (j10 != -9223372036854775807L) {
                        this.f5227b.f(j10, this.f5241p ? 1 : 0, ((int) (this.f5234i - this.f5239n)) - i14, i14, null);
                    }
                }
                if (!this.f5235j || this.f5242q) {
                    this.f5239n = this.f5234i - ((long) i14);
                    long j11 = this.f5238m;
                    if (j11 == -9223372036854775807L) {
                        long j12 = this.f5240o;
                        j11 = j12 != -9223372036854775807L ? j12 + this.f5237l : -9223372036854775807L;
                    }
                    this.f5240o = j11;
                    this.f5241p = false;
                    this.f5238m = -9223372036854775807L;
                    z10 = true;
                    this.f5235j = true;
                } else {
                    z10 = true;
                }
                this.f5242q = i12 == 0 ? z10 : false;
            } else if (i12 == 184) {
                this.f5241p = true;
            }
            iF = i11;
        }
        if (!this.f5236k) {
            this.f5233h.a(bArrE, iF, iG);
        }
        w wVar3 = this.f5231f;
        if (wVar3 != null) {
            wVar3.a(bArrE, iF, iG);
        }
    }

    @Override // ca.m
    public void d(v8.r rVar, l0.d dVar) {
        dVar.a();
        this.f5226a = dVar.b();
        this.f5227b = rVar.e(dVar.c(), 2);
        n0 n0Var = this.f5228c;
        if (n0Var != null) {
            n0Var.b(rVar, dVar);
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
    @Override // ca.m
    public void e(boolean z10) {
        x7.a.i(this.f5227b);
        if (z10) {
            boolean z11 = this.f5241p;
            this.f5227b.f(this.f5240o, z11 ? 1 : 0, (int) (this.f5234i - this.f5239n), 0, null);
        }
    }

    @Override // ca.m
    public void f(long j10, int i10) {
        this.f5238m = j10;
    }

    n(n0 n0Var, String str) {
        this.f5228c = n0Var;
        this.f5229d = str;
        this.f5232g = new boolean[4];
        this.f5233h = new a(128);
        if (n0Var != null) {
            this.f5231f = new w(178, 128);
            this.f5230e = new x7.a0();
        } else {
            this.f5231f = null;
            this.f5230e = null;
        }
        this.f5238m = -9223372036854775807L;
        this.f5240o = -9223372036854775807L;
    }
}
