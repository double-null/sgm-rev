package r8;

import java.util.Arrays;
import x7.l0;

/* JADX INFO: compiled from: DefaultAllocator.java */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f24937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f24938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f24939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f24940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f24941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f24942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a[] f24943g;

    public g(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    @Override // r8.b
    public synchronized a a() {
        a aVar;
        this.f24941e++;
        int i10 = this.f24942f;
        if (i10 > 0) {
            a[] aVarArr = this.f24943g;
            int i11 = i10 - 1;
            this.f24942f = i11;
            aVar = (a) x7.a.e(aVarArr[i11]);
            this.f24943g[this.f24942f] = null;
        } else {
            aVar = new a(new byte[this.f24938b], 0);
            int i12 = this.f24941e;
            a[] aVarArr2 = this.f24943g;
            if (i12 > aVarArr2.length) {
                this.f24943g = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
            }
        }
        return aVar;
    }

    @Override // r8.b
    public synchronized void b(b.a aVar) {
        while (aVar != null) {
            a[] aVarArr = this.f24943g;
            int i10 = this.f24942f;
            this.f24942f = i10 + 1;
            aVarArr[i10] = aVar.a();
            this.f24941e--;
            aVar = aVar.next();
        }
        notifyAll();
    }

    @Override // r8.b
    public synchronized void c(a aVar) {
        a[] aVarArr = this.f24943g;
        int i10 = this.f24942f;
        this.f24942f = i10 + 1;
        aVarArr[i10] = aVar;
        this.f24941e--;
        notifyAll();
    }

    @Override // r8.b
    public synchronized void d() {
        int i10 = 0;
        int iMax = Math.max(0, l0.k(this.f24940d, this.f24938b) - this.f24941e);
        int i11 = this.f24942f;
        if (iMax >= i11) {
            return;
        }
        if (this.f24939c != null) {
            int i12 = i11 - 1;
            while (i10 <= i12) {
                a aVar = (a) x7.a.e(this.f24943g[i10]);
                if (aVar.f24927a == this.f24939c) {
                    i10++;
                } else {
                    a aVar2 = (a) x7.a.e(this.f24943g[i12]);
                    if (aVar2.f24927a != this.f24939c) {
                        i12--;
                    } else {
                        a[] aVarArr = this.f24943g;
                        aVarArr[i10] = aVar2;
                        aVarArr[i12] = aVar;
                        i12--;
                        i10++;
                    }
                }
            }
            iMax = Math.max(iMax, i10);
            if (iMax >= this.f24942f) {
                return;
            }
        }
        Arrays.fill(this.f24943g, iMax, this.f24942f, (Object) null);
        this.f24942f = iMax;
    }

    @Override // r8.b
    public int e() {
        return this.f24938b;
    }

    public synchronized int f() {
        return this.f24941e * this.f24938b;
    }

    public synchronized void g() {
        if (this.f24937a) {
            h(0);
        }
    }

    public synchronized void h(int i10) {
        boolean z10 = i10 < this.f24940d;
        this.f24940d = i10;
        if (z10) {
            d();
        }
    }

    public g(boolean z10, int i10, int i11) {
        x7.a.a(i10 > 0);
        x7.a.a(i11 >= 0);
        this.f24937a = z10;
        this.f24938b = i10;
        this.f24942f = i11;
        this.f24943g = new a[i11 + 100];
        if (i11 <= 0) {
            this.f24939c = null;
            return;
        }
        this.f24939c = new byte[i11 * i10];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f24943g[i12] = new a(this.f24939c, i12 * i10);
        }
    }
}
