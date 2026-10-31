package io.bidmachine;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class BidTokenTaskManager {
    private static volatile sc.a instance;

    public static void cancel(sc.b bVar) {
        get().b(bVar);
    }

    public static void execute(Runnable runnable) {
        get().execute(runnable);
    }

    private static sc.a get() {
        sc.a aVar = instance;
        if (aVar == null) {
            synchronized (sc.a.class) {
                aVar = instance;
                if (aVar == null) {
                    aVar = new sc.a();
                    instance = aVar;
                }
            }
        }
        return aVar;
    }

    public static void schedule(sc.b bVar, long j10, TimeUnit timeUnit) {
        get().d(bVar, j10, timeUnit);
    }
}
