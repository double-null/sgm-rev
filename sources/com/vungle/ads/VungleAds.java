package com.vungle.ads;

import android.app.Application;
import android.content.Context;
import com.vungle.ads.fpd.FirstPartyData;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.VungleInitializer;
import com.vungle.ads.internal.VungleInternal;
import com.vungle.ads.internal.model.Placement;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import rd.PSo.cNMUz;

/* JADX INFO: compiled from: VungleAds.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class VungleAds {
    public static final String TAG = "VungleAds";
    public static final Companion Companion = new Companion(null);
    private static VungleInternal vungleInternal = new VungleInternal();
    private static VungleInitializer initializer = new VungleInitializer();
    public static final FirstPartyData firstPartyData = new FirstPartyData();

    /* JADX INFO: compiled from: VungleAds.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final void getBiddingToken(Context context, BidTokenCallback callback) {
            t.f(context, "context");
            t.f(callback, "callback");
            VungleAds.vungleInternal.getAvailableBidTokensAsync(context, callback);
        }

        public final String getSdkVersion() {
            return VungleAds.vungleInternal.getSdkVersion();
        }

        public final void init(Context appContext, String appId, InitializationListener callback) {
            t.f(appContext, "context");
            t.f(appId, "appId");
            t.f(callback, "callback");
            if (!(appContext instanceof Application)) {
                appContext = appContext.getApplicationContext();
            }
            VungleInitializer vungleInitializer = VungleAds.initializer;
            t.e(appContext, "appContext");
            vungleInitializer.init(appId, appContext, callback);
        }

        public final boolean isInitialized() {
            return VungleAds.initializer.isInitialized();
        }

        public final boolean isInline(String placementId) {
            t.f(placementId, "placementId");
            Placement placement = ConfigManager.INSTANCE.getPlacement(placementId);
            if (placement != null) {
                return placement.isInline();
            }
            return false;
        }

        public final void setIntegrationName(String integrationName, String version) {
            t.f(integrationName, "integrationName");
            t.f(version, "version");
            VungleAds.initializer.setIntegrationName(integrationName, version);
        }

        public final void deInit(Context context) {
            t.f(context, cNMUz.hFDePQbzv);
            VungleAds.initializer.deInit$vungle_ads_release();
        }
    }

    public static final void deInit(Context context) {
        Companion.deInit(context);
    }

    public static final void getBiddingToken(Context context, BidTokenCallback bidTokenCallback) {
        Companion.getBiddingToken(context, bidTokenCallback);
    }

    public static final String getSdkVersion() {
        return Companion.getSdkVersion();
    }

    public static final void init(Context context, String str, InitializationListener initializationListener) {
        Companion.init(context, str, initializationListener);
    }

    public static final boolean isInitialized() {
        return Companion.isInitialized();
    }

    public static final boolean isInline(String str) {
        return Companion.isInline(str);
    }

    public static final void setIntegrationName(String str, String str2) {
        Companion.setIntegrationName(str, str2);
    }
}
