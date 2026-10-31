package ke;

/* JADX INFO: compiled from: ArrayPools.kt */
/* JADX INFO: loaded from: classes5.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kotlin.collections.i<byte[]> f21378a = new kotlin.collections.i<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21379b;

    protected final void a(byte[] array) {
        kotlin.jvm.internal.t.f(array, "array");
        synchronized (this) {
            if (this.f21379b + array.length < k.f21372a) {
                this.f21379b += array.length / 2;
                this.f21378a.addLast(array);
            }
            wc.g0 g0Var = wc.g0.f27756a;
        }
    }

    protected final byte[] b(int i10) {
        byte[] bArrB;
        synchronized (this) {
            bArrB = this.f21378a.B();
            if (bArrB != null) {
                this.f21379b -= bArrB.length / 2;
            } else {
                bArrB = null;
            }
        }
        return bArrB == null ? new byte[i10] : bArrB;
    }
}
