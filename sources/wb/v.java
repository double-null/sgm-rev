package wb;

/* JADX INFO: compiled from: SafeRunnable.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface v extends Runnable {
    default void b(Throwable throwable) throws Throwable {
        kotlin.jvm.internal.t.f(throwable, "throwable");
    }

    void p() throws Throwable;

    @Override // java.lang.Runnable
    default void run() {
        try {
            p();
        } catch (Throwable th) {
            try {
                b(th);
                wc.g0 g0Var = wc.g0.f27756a;
            } catch (Throwable unused) {
            }
        }
    }
}
