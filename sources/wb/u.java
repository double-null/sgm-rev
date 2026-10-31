package wb;

/* JADX INFO: compiled from: SafeExecutable.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface u<T> extends i<T> {
    void a(T t10) throws Throwable;

    default void b(Throwable throwable) throws Throwable {
        kotlin.jvm.internal.t.f(throwable, "throwable");
    }

    @Override // wb.i
    default void execute(T t10) {
        try {
            a(t10);
        } catch (Throwable th) {
            try {
                b(th);
                wc.g0 g0Var = wc.g0.f27756a;
            } catch (Throwable unused) {
            }
        }
    }
}
