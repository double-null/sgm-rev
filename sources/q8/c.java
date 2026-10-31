package q8;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import u7.e0;
import x7.l0;

/* JADX INFO: compiled from: BaseTrackSelection.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final e0 f24488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f24489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int[] f24490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f24491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final u7.q[] f24492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long[] f24493f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f24494g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f24495h;

    public c(e0 e0Var, int... iArr) {
        this(e0Var, iArr, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int w(u7.q qVar, u7.q qVar2) {
        return qVar2.f26247j - qVar.f26247j;
    }

    @Override // q8.q
    public boolean a(int i10, long j10) {
        return this.f24493f[i10] > j10;
    }

    @Override // q8.t
    public final int c(u7.q qVar) {
        for (int i10 = 0; i10 < this.f24489b; i10++) {
            if (this.f24492e[i10] == qVar) {
                return i10;
            }
        }
        return -1;
    }

    @Override // q8.t
    public final u7.q e(int i10) {
        return this.f24492e[i10];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f24488a.equals(cVar.f24488a) && Arrays.equals(this.f24490c, cVar.f24490c);
    }

    @Override // q8.t
    public final int f(int i10) {
        return this.f24490c[i10];
    }

    @Override // q8.q
    public boolean g(int i10, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zA = a(i10, jElapsedRealtime);
        int i11 = 0;
        while (i11 < this.f24489b && !zA) {
            zA = (i11 == i10 || a(i11, jElapsedRealtime)) ? false : true;
            i11++;
        }
        if (!zA) {
            return false;
        }
        long[] jArr = this.f24493f;
        jArr[i10] = Math.max(jArr[i10], l0.c(jElapsedRealtime, j10, Long.MAX_VALUE));
        return true;
    }

    public int hashCode() {
        if (this.f24494g == 0) {
            this.f24494g = (System.identityHashCode(this.f24488a) * 31) + Arrays.hashCode(this.f24490c);
        }
        return this.f24494g;
    }

    @Override // q8.t
    public final int k(int i10) {
        for (int i11 = 0; i11 < this.f24489b; i11++) {
            if (this.f24490c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // q8.t
    public final int length() {
        return this.f24490c.length;
    }

    @Override // q8.t
    public final e0 m() {
        return this.f24488a;
    }

    @Override // q8.q
    public void n(boolean z10) {
        this.f24495h = z10;
    }

    @Override // q8.q
    public int p(long j10, List<? extends o8.m> list) {
        return list.size();
    }

    @Override // q8.q
    public final int q() {
        return this.f24490c[b()];
    }

    @Override // q8.q
    public final u7.q s() {
        return this.f24492e[b()];
    }

    public c(e0 e0Var, int[] iArr, int i10) {
        x7.a.g(iArr.length > 0);
        this.f24491d = i10;
        this.f24488a = (e0) x7.a.e(e0Var);
        int length = iArr.length;
        this.f24489b = length;
        this.f24492e = new u7.q[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f24492e[i11] = e0Var.a(iArr[i11]);
        }
        Arrays.sort(this.f24492e, new Comparator() { // from class: q8.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return c.w((u7.q) obj, (u7.q) obj2);
            }
        });
        this.f24490c = new int[this.f24489b];
        int i12 = 0;
        while (true) {
            int i13 = this.f24489b;
            if (i12 >= i13) {
                this.f24493f = new long[i13];
                this.f24495h = false;
                return;
            } else {
                this.f24490c[i12] = e0Var.b(this.f24492e[i12]);
                i12++;
            }
        }
    }

    @Override // q8.q
    public void d() {
    }

    @Override // q8.q
    public void o() {
    }

    @Override // q8.q
    public void h(float f10) {
    }
}
