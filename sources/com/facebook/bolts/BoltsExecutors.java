package com.facebook.bolts;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.t;
import rd.f0;

/* JADX INFO: compiled from: BoltsExecutors.kt */
/* JADX INFO: loaded from: classes.dex */
public final class BoltsExecutors {
    public static final Companion Companion = new Companion(null);
    private static final BoltsExecutors INSTANCE = new BoltsExecutors();
    private final ExecutorService background;
    private final Executor immediate;
    private final ScheduledExecutorService scheduled;

    /* JADX INFO: compiled from: BoltsExecutors.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isAndroidRuntime() {
            String property = System.getProperty("java.runtime.name");
            if (property == null) {
                return false;
            }
            Locale US = Locale.US;
            t.e(US, "US");
            String lowerCase = property.toLowerCase(US);
            t.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            return f0.U(lowerCase, "android", false, 2, null);
        }

        public final ExecutorService background() {
            return BoltsExecutors.INSTANCE.background;
        }

        public final Executor immediate$facebook_bolts_release() {
            return BoltsExecutors.INSTANCE.immediate;
        }

        public final ScheduledExecutorService scheduled$facebook_bolts_release() {
            return BoltsExecutors.INSTANCE.scheduled;
        }
    }

    /* JADX INFO: compiled from: BoltsExecutors.kt */
    private static final class ImmediateExecutor implements Executor {
        public static final Companion Companion = new Companion(null);
        private static final int MAX_DEPTH = 15;
        private final ThreadLocal<Integer> executionDepth = new ThreadLocal<>();

        /* JADX INFO: compiled from: BoltsExecutors.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                this();
            }
        }

        private final int decrementDepth() {
            Integer num = this.executionDepth.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() - 1;
            if (iIntValue == 0) {
                this.executionDepth.remove();
            } else {
                this.executionDepth.set(Integer.valueOf(iIntValue));
            }
            return iIntValue;
        }

        private final int incrementDepth() {
            Integer num = this.executionDepth.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() + 1;
            this.executionDepth.set(Integer.valueOf(iIntValue));
            return iIntValue;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable command) {
            t.f(command, "command");
            try {
                if (incrementDepth() <= 15) {
                    command.run();
                } else {
                    BoltsExecutors.Companion.background().execute(command);
                }
                decrementDepth();
            } catch (Throwable th) {
                decrementDepth();
                throw th;
            }
        }
    }

    private BoltsExecutors() {
        ExecutorService executorServiceNewCachedThreadPool;
        if (Companion.isAndroidRuntime()) {
            executorServiceNewCachedThreadPool = AndroidExecutors.Companion.newCachedThreadPool();
        } else {
            executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
            t.e(executorServiceNewCachedThreadPool, "newCachedThreadPool()");
        }
        this.background = executorServiceNewCachedThreadPool;
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        t.e(scheduledExecutorServiceNewSingleThreadScheduledExecutor, "newSingleThreadScheduledExecutor()");
        this.scheduled = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.immediate = new ImmediateExecutor();
    }

    public static final ExecutorService background() {
        return Companion.background();
    }
}
