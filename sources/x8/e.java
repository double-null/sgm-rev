package x8;

import java.io.IOException;
import java.util.Arrays;
import v8.j0;
import v8.k0;
import v8.o0;
import v8.q;
import x7.l0;

/* JADX INFO: compiled from: ChunkReader.java */
/* JADX INFO: loaded from: classes4.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f28238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o0 f28239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f28240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f28241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f28242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f28243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f28244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f28245h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f28246i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f28247j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f28248k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f28249l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long[] f28250m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int[] f28251n;

    public e(int i10, d dVar, o0 o0Var) {
        this.f28238a = dVar;
        int iB = dVar.b();
        boolean z10 = true;
        if (iB != 1 && iB != 2) {
            z10 = false;
        }
        x7.a.a(z10);
        this.f28240c = d(i10, iB == 2 ? 1667497984 : 1651965952);
        this.f28242e = dVar.a();
        this.f28239b = o0Var;
        this.f28241d = iB == 2 ? d(i10, 1650720768) : -1;
        this.f28249l = -1L;
        this.f28250m = new long[512];
        this.f28251n = new int[512];
        this.f28243f = dVar.f28235e;
    }

    private static int d(int i10, int i11) {
        return (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48) | i11;
    }

    private long e(int i10) {
        return (this.f28242e * ((long) i10)) / ((long) this.f28243f);
    }

    private k0 h(int i10) {
        return new k0(((long) this.f28251n[i10]) * g(), this.f28250m[i10]);
    }

    public void a() {
        this.f28246i++;
    }

    public void b(long j10, boolean z10) {
        if (this.f28249l == -1) {
            this.f28249l = j10;
        }
        if (z10) {
            if (this.f28248k == this.f28251n.length) {
                long[] jArr = this.f28250m;
                this.f28250m = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.f28251n;
                this.f28251n = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.f28250m;
            int i10 = this.f28248k;
            jArr2[i10] = j10;
            this.f28251n[i10] = this.f28247j;
            this.f28248k = i10 + 1;
        }
        this.f28247j++;
    }

    public void c() {
        int i10;
        this.f28250m = Arrays.copyOf(this.f28250m, this.f28248k);
        this.f28251n = Arrays.copyOf(this.f28251n, this.f28248k);
        if (!k() || this.f28238a.f28237g == 0 || (i10 = this.f28248k) <= 0) {
            return;
        }
        this.f28243f = i10;
    }

    public long f() {
        return e(this.f28246i);
    }

    public long g() {
        return e(1);
    }

    public j0.a i(long j10) {
        if (this.f28248k == 0) {
            return new j0.a(new k0(0L, this.f28249l));
        }
        int iG = (int) (j10 / g());
        int iG2 = l0.g(this.f28251n, iG, true, true);
        if (this.f28251n[iG2] == iG) {
            return new j0.a(h(iG2));
        }
        k0 k0VarH = h(iG2);
        int i10 = iG2 + 1;
        return i10 < this.f28250m.length ? new j0.a(k0VarH, h(i10)) : new j0.a(k0VarH);
    }

    public boolean j(int i10) {
        return this.f28240c == i10 || this.f28241d == i10;
    }

    public boolean k() {
        return (this.f28240c & 1651965952) == 1651965952;
    }

    public boolean l() {
        return Arrays.binarySearch(this.f28251n, this.f28246i) >= 0;
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
    public boolean m(q qVar) throws IOException {
        int i10 = this.f28245h;
        int iC = i10 - this.f28239b.c(qVar, i10, false);
        this.f28245h = iC;
        boolean z10 = iC == 0;
        if (z10) {
            if (this.f28244g > 0) {
                this.f28239b.f(f(), l() ? 1 : 0, this.f28244g, 0, null);
            }
            a();
        }
        return z10;
    }

    public void n(int i10) {
        this.f28244g = i10;
        this.f28245h = i10;
    }

    public void o(long j10) {
        if (this.f28248k == 0) {
            this.f28246i = 0;
        } else {
            this.f28246i = this.f28251n[l0.h(this.f28250m, j10, true, true)];
        }
    }
}
