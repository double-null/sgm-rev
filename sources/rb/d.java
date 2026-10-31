package rb;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public interface d {
    void a(Runnable runnable);

    void execute(Runnable runnable);

    default void schedule(Runnable runnable, long j10) {
        schedule(runnable, j10, TimeUnit.MILLISECONDS);
    }

    void schedule(Runnable runnable, long j10, TimeUnit timeUnit);
}
