package zd;

import com.vungle.ads.internal.network.converters.vY.vgmm;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import zd.o0;

/* JADX INFO: compiled from: ThreadSafeHeap.kt */
/* JADX INFO: loaded from: classes5.dex */
public class n0<T extends o0 & Comparable<? super T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f29218b = AtomicIntegerFieldUpdater.newUpdater(n0.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private T[] f29219a;

    private final void k(int i10) {
        f29218b.set(this, i10);
    }

    private final void l(int i10) {
        while (true) {
            int i11 = (i10 * 2) + 1;
            if (i11 >= c()) {
                return;
            }
            T[] tArr = this.f29219a;
            kotlin.jvm.internal.t.c(tArr);
            int i12 = i11 + 1;
            if (i12 < c()) {
                T t10 = tArr[i12];
                kotlin.jvm.internal.t.c(t10);
                T t11 = tArr[i11];
                kotlin.jvm.internal.t.c(t11);
                if (((Comparable) t10).compareTo(t11) < 0) {
                    i11 = i12;
                }
            }
            T t12 = tArr[i10];
            kotlin.jvm.internal.t.c(t12);
            T t13 = tArr[i11];
            kotlin.jvm.internal.t.c(t13);
            if (((Comparable) t12).compareTo(t13) <= 0) {
                return;
            }
            n(i10, i11);
            i10 = i11;
        }
    }

    private final void m(int i10) {
        while (i10 > 0) {
            T[] tArr = this.f29219a;
            kotlin.jvm.internal.t.c(tArr);
            int i11 = (i10 - 1) / 2;
            T t10 = tArr[i11];
            kotlin.jvm.internal.t.c(t10);
            T t11 = tArr[i10];
            kotlin.jvm.internal.t.c(t11);
            if (((Comparable) t10).compareTo(t11) <= 0) {
                return;
            }
            n(i10, i11);
            i10 = i11;
        }
    }

    private final void n(int i10, int i11) {
        T[] tArr = this.f29219a;
        kotlin.jvm.internal.t.c(tArr);
        T t10 = tArr[i11];
        kotlin.jvm.internal.t.c(t10);
        T t11 = tArr[i10];
        kotlin.jvm.internal.t.c(t11);
        tArr[i10] = t10;
        tArr[i11] = t11;
        t10.setIndex(i10);
        t11.setIndex(i11);
    }

    public final void a(T t10) {
        t10.a(this);
        o0[] o0VarArrG = g();
        int iC = c();
        k(iC + 1);
        o0VarArrG[iC] = t10;
        t10.setIndex(iC);
        m(iC);
    }

    public final T b() {
        T[] tArr = this.f29219a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int c() {
        return f29218b.get(this);
    }

    public final boolean e() {
        return c() == 0;
    }

    public final T f() {
        T t10;
        synchronized (this) {
            t10 = (T) b();
        }
        return t10;
    }

    public final boolean h(T t10) {
        boolean z10;
        synchronized (this) {
            if (t10.c() == null) {
                z10 = false;
            } else {
                i(t10.getIndex());
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003a  */
    public final T i(int i10) {
        T[] tArr = this.f29219a;
        kotlin.jvm.internal.t.c(tArr);
        k(c() - 1);
        if (i10 < c()) {
            n(i10, c());
            int i11 = (i10 - 1) / 2;
            if (i10 > 0) {
                T t10 = tArr[i10];
                kotlin.jvm.internal.t.c(t10);
                T t11 = tArr[i11];
                kotlin.jvm.internal.t.c(t11);
                if (((Comparable) t10).compareTo(t11) < 0) {
                    n(i10, i11);
                    m(i11);
                } else {
                    l(i10);
                }
            } else {
                l(i10);
            }
        }
        T t12 = tArr[c()];
        kotlin.jvm.internal.t.c(t12);
        t12.a(null);
        t12.setIndex(-1);
        tArr[c()] = null;
        return t12;
    }

    public final T j() {
        T t10;
        synchronized (this) {
            t10 = c() > 0 ? (T) i(0) : null;
        }
        return t10;
    }

    private final T[] g() {
        T[] tArr = this.f29219a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new o0[4];
            this.f29219a = tArr2;
            return tArr2;
        }
        if (c() < tArr.length) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, c() * 2);
        kotlin.jvm.internal.t.e(objArrCopyOf, vgmm.qibVunTydhKV);
        T[] tArr3 = (T[]) ((o0[]) objArrCopyOf);
        this.f29219a = tArr3;
        return tArr3;
    }
}
