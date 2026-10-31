package com.facebook.bolts;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: AndroidExecutors.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidExecutors {
    private static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;
    public static final Companion Companion = new Companion(null);
    private static final AndroidExecutors INSTANCE = new AndroidExecutors();
    private static final long KEEP_ALIVE_TIME = 1;
    private static final int MAX_POOL_SIZE;
    private final Executor uiThread = new UIThreadExecutor();

    /* JADX INFO: compiled from: AndroidExecutors.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final ExecutorService newCachedThreadPool() {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(AndroidExecutors.CORE_POOL_SIZE, AndroidExecutors.MAX_POOL_SIZE, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return threadPoolExecutor;
        }

        public final Executor uiThread() {
            return AndroidExecutors.INSTANCE.uiThread;
        }
    }

    /* JADX INFO: compiled from: AndroidExecutors.kt */
    private static final class UIThreadExecutor implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable command) {
            t.f(command, "command");
            new Handler(Looper.getMainLooper()).post(command);
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = iAvailableProcessors;
        CORE_POOL_SIZE = iAvailableProcessors + 1;
        MAX_POOL_SIZE = (iAvailableProcessors * 2) + 1;
    }

    private AndroidExecutors() {
    }

    public static final ExecutorService newCachedThreadPool() {
        return Companion.newCachedThreadPool();
    }

    public static final Executor uiThread() {
        return Companion.uiThread();
    }
}
