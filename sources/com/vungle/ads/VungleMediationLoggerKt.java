package com.vungle.ads;

import com.vungle.ads.internal.util.LogEntry;

/* JADX INFO: compiled from: VungleMediationLogger.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class VungleMediationLoggerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final LogEntry getAdLogEntry(VungleAdType vungleAdType) {
        if (vungleAdType instanceof BaseAd) {
            return ((BaseAd) vungleAdType).getLogEntry$vungle_ads_release();
        }
        if (vungleAdType instanceof VungleBannerView) {
            return ((VungleBannerView) vungleAdType).getLogEntry$vungle_ads_release();
        }
        return null;
    }
}
