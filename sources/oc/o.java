package oc;

/* JADX INFO: compiled from: SafeRunnable.java */
/* JADX INFO: loaded from: classes5.dex */
public interface o extends Runnable {
    void b(Throwable th) throws Throwable;

    void p() throws Throwable;

    @Override // java.lang.Runnable
    default void run() {
        try {
            p();
        } catch (Throwable th) {
            try {
                b(th);
            } catch (Throwable unused) {
            }
        }
    }
}
