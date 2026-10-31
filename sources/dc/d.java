package dc;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: TaskManager.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface d {
    void a(Runnable runnable);

    default boolean b(Runnable task, long j10) {
        Boolean bool;
        t.f(task, "task");
        try {
            schedule(task, j10);
            bool = Boolean.TRUE;
        } catch (Throwable unused) {
            bool = null;
        }
        return t.a(bool, Boolean.TRUE);
    }

    default boolean c(Runnable task) {
        Boolean bool;
        t.f(task, "task");
        try {
            execute(task);
            bool = Boolean.TRUE;
        } catch (Throwable unused) {
            bool = null;
        }
        return t.a(bool, Boolean.TRUE);
    }

    default void execute(Runnable task) throws Throwable {
        t.f(task, "task");
        schedule(task, 0L);
    }

    void schedule(Runnable runnable, long j10) throws Throwable;
}
