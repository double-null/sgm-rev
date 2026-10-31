package com.vungle.ads.internal.platform;

import com.vungle.ads.internal.model.AdvertisingInfo;

/* JADX INFO: compiled from: Platform.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface Platform {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String MANUFACTURER_AMAZON = "Amazon";

    /* JADX INFO: compiled from: Platform.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String MANUFACTURER_AMAZON = "Amazon";

        private Companion() {
        }
    }

    AdvertisingInfo getAdvertisingInfo();

    String getAppSetId();

    Integer getAppSetIdScope();

    long getBuildTime();

    String getCarrierName();

    String getGPVersion();

    long getLastBootTime();

    long getOSInstallationTime();

    long getSDKInstallationTime();

    String getUserAgent();

    void getUserAgentLazy(w.b<String> bVar);

    float getVolumeLevel();

    boolean isBatterySaverEnabled();

    boolean isProblematicMaliDevice();

    boolean isSdCardPresent();

    boolean isSideLoaded();

    boolean isSilentModeEnabled();

    boolean isSoundEnabled();
}
