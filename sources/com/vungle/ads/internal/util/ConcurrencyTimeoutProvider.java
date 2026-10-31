package com.vungle.ads.internal.util;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.k;

/* JADX INFO: compiled from: ConcurrencyTimeoutProvider.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ConcurrencyTimeoutProvider {
    public static final Companion Companion = new Companion(null);
    private static final long OPERATION_TIMEOUT = TimeUnit.SECONDS.toMillis(4);

    /* JADX INFO: compiled from: ConcurrencyTimeoutProvider.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public final long getTimeout() {
        if (ThreadUtil.INSTANCE.isMainThread()) {
            return OPERATION_TIMEOUT;
        }
        return Long.MAX_VALUE;
    }
}
