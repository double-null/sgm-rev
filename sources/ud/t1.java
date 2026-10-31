package ud;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class t1 {
    public static final k0 a(Executor executor) {
        k0 k0Var;
        d1 d1Var = executor instanceof d1 ? (d1) executor : null;
        return (d1Var == null || (k0Var = d1Var.f26727a) == null) ? new s1(executor) : k0Var;
    }

    public static final r1 b(ExecutorService executorService) {
        return new s1(executorService);
    }
}
