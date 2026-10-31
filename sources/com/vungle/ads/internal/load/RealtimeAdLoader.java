package com.vungle.ads.internal.load;

import android.content.Context;
import com.vungle.ads.AdMarkupInvalidError;
import com.vungle.ads.InvalidBidPayloadError;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.BidPayload;
import com.vungle.ads.internal.network.TpatRequest;
import com.vungle.ads.internal.network.TpatSender;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.omsdk.OMInjector;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;
import wc.k;
import wc.m;
import wc.o;

/* JADX INFO: compiled from: RealtimeAdLoader.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class RealtimeAdLoader extends BaseAdLoader {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealtimeAdLoader(Context context, VungleApiClient vungleApiClient, Executors sdkExecutors, OMInjector omInjector, Downloader downloader, PathProvider pathProvider, AdRequest adRequest) {
        super(context, vungleApiClient, sdkExecutors, omInjector, downloader, pathProvider, adRequest);
        t.f(context, "context");
        t.f(vungleApiClient, "vungleApiClient");
        t.f(sdkExecutors, "sdkExecutors");
        t.f(omInjector, "omInjector");
        t.f(downloader, "downloader");
        t.f(pathProvider, "pathProvider");
        t.f(adRequest, "adRequest");
    }

    /* JADX INFO: renamed from: requestAd$lambda-0, reason: not valid java name */
    private static final VungleApiClient m266requestAd$lambda0(k<VungleApiClient> kVar) {
        return kVar.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000b  */
    private final void sendWinNotification(List<String> list) {
        boolean z10;
        if (list != null) {
            z10 = list.isEmpty();
        }
        if (z10) {
            return;
        }
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        k kVarB = m.b(o.SYNCHRONIZED, new RealtimeAdLoader$sendWinNotification$$inlined$inject$1(getContext()));
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                TpatSender.sendTpat$default(m267sendWinNotification$lambda2(kVarB), new TpatRequest.Builder((String) it.next()).tpatKey(Constants.WIN_NOTIFICATION).withLogEntry(getLogEntry$vungle_ads_release()).build(), false, 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: sendWinNotification$lambda-2, reason: not valid java name */
    private static final TpatSender m267sendWinNotification$lambda2(k<TpatSender> kVar) {
        return kVar.getValue();
    }

    @Override // com.vungle.ads.internal.load.BaseAdLoader
    public void onAdLoadReady() {
        AdPayload advertisement$vungle_ads_release = getAdvertisement$vungle_ads_release();
        sendWinNotification(advertisement$vungle_ads_release != null ? advertisement$vungle_ads_release.getWinNotifications() : null);
    }

    @Override // com.vungle.ads.internal.load.BaseAdLoader
    protected void requestAd() {
        BidPayload adMarkup = getAdRequest().getAdMarkup();
        if (adMarkup == null) {
            onAdLoadFailed(new InvalidBidPayloadError().setLogEntry$vungle_ads_release(getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
            return;
        }
        if (ConfigManager.INSTANCE.rtaDebuggingEnabled()) {
            try {
                String decodedAdsResponse = adMarkup.getDecodedAdsResponse();
                Logger.Companion.d("RTA_DEBUGGER", String.valueOf(decodedAdsResponse));
                ServiceLocator.Companion companion = ServiceLocator.Companion;
                k kVarB = m.b(o.SYNCHRONIZED, new RealtimeAdLoader$requestAd$$inlined$inject$1(getContext()));
                if (decodedAdsResponse != null) {
                    new RTADebugger(m266requestAd$lambda0(kVarB)).reportAdMarkup(decodedAdsResponse);
                }
            } catch (Throwable unused) {
            }
        }
        AdPayload adPayload = adMarkup.getAdPayload();
        Integer version = adMarkup.getVersion();
        if (version == null || version.intValue() != 2 || adPayload == null) {
            onAdLoadFailed(new AdMarkupInvalidError("The ad response did not contain valid ad markup").setLogEntry$vungle_ads_release(getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
        } else {
            handleAdMetaData$vungle_ads_release(adPayload, new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.CONFIG_LOADED_FROM_ADM_LOAD));
        }
    }
}
