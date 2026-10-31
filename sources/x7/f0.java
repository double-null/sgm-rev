package x7;

import java.util.Arrays;

/* JADX INFO: compiled from: TimedValueQueue.java */
/* JADX INFO: loaded from: classes4.dex */
public final class f0<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f28116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private V[] f28117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f28119d;

    public f0() {
        this(10);
    }

    private void b(long j10, V v10) {
        int i10 = this.f28118c;
        int i11 = this.f28119d;
        V[] vArr = this.f28117b;
        int length = (i10 + i11) % vArr.length;
        this.f28116a[length] = j10;
        vArr[length] = v10;
        this.f28119d = i11 + 1;
    }

    private void d(long j10) {
        int i10 = this.f28119d;
        if (i10 > 0) {
            if (j10 <= this.f28116a[((this.f28118c + i10) - 1) % this.f28117b.length]) {
                c();
            }
        }
    }

    private void e() {
        int length = this.f28117b.length;
        if (this.f28119d < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        V[] vArr = (V[]) f(i10);
        int i11 = this.f28118c;
        int i12 = length - i11;
        System.arraycopy(this.f28116a, i11, jArr, 0, i12);
        System.arraycopy(this.f28117b, this.f28118c, vArr, 0, i12);
        int i13 = this.f28118c;
        if (i13 > 0) {
            System.arraycopy(this.f28116a, 0, jArr, i12, i13);
            System.arraycopy(this.f28117b, 0, vArr, i12, this.f28118c);
        }
        this.f28116a = jArr;
        this.f28117b = vArr;
        this.f28118c = 0;
    }

    private static <V> V[] f(int i10) {
        return (V[]) new Object[i10];
    }

    private V h(long j10, boolean z10) {
        V vK = null;
        long j11 = Long.MAX_VALUE;
        while (this.f28119d > 0) {
            long j12 = j10 - this.f28116a[this.f28118c];
            if (j12 < 0 && (z10 || (-j12) >= j11)) {
                break;
            }
            vK = k();
            j11 = j12;
        }
        return vK;
    }

    private V k() {
        a.g(this.f28119d > 0);
        V[] vArr = this.f28117b;
        int i10 = this.f28118c;
        V v10 = vArr[i10];
        vArr[i10] = null;
        this.f28118c = (i10 + 1) % vArr.length;
        this.f28119d--;
        return v10;
    }

    public synchronized void a(long j10, V v10) {
        d(j10);
        e();
        b(j10, v10);
    }

    public synchronized void c() {
        this.f28118c = 0;
        this.f28119d = 0;
        Arrays.fill(this.f28117b, (Object) null);
    }

    public synchronized V g(long j10) {
        return h(j10, false);
    }

    public synchronized V i() {
        return this.f28119d == 0 ? null : k();
    }

    public synchronized V j(long j10) {
        return h(j10, true);
    }

    public synchronized int l() {
        return this.f28119d;
    }

    public f0(int i10) {
        this.f28116a = new long[i10];
        this.f28117b = (V[]) f(i10);
    }
}
