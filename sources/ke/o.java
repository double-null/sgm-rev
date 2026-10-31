package ke;

/* JADX INFO: compiled from: ArrayPools.kt */
/* JADX INFO: loaded from: classes5.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kotlin.collections.i<char[]> f21388a = new kotlin.collections.i<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21389b;

    protected final void a(char[] array) {
        kotlin.jvm.internal.t.f(array, "array");
        synchronized (this) {
            if (this.f21389b + array.length < k.f21372a) {
                this.f21389b += array.length;
                this.f21388a.addLast(array);
            }
            wc.g0 g0Var = wc.g0.f27756a;
        }
    }

    protected final char[] b(int i10) {
        char[] cArrB;
        synchronized (this) {
            cArrB = this.f21388a.B();
            if (cArrB != null) {
                this.f21389b -= cArrB.length;
            } else {
                cArrB = null;
            }
        }
        return cArrB == null ? new char[i10] : cArrB;
    }
}
