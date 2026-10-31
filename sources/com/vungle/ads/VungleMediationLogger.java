package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: VungleMediationLogger.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class VungleMediationLogger {
    public static final VungleMediationLogger INSTANCE = new VungleMediationLogger();

    private VungleMediationLogger() {
    }

    public static final void logError(VungleAdType vungleAdType, String message) {
        t.f(message, "message");
        AnalyticsClient.INSTANCE.logError$vungle_ads_release(Sdk.SDKError.Reason.MEDIATION_ERROR, message, vungleAdType != null ? VungleMediationLoggerKt.getAdLogEntry(vungleAdType) : null);
    }
}
