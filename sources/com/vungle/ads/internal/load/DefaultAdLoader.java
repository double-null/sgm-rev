package com.vungle.ads.internal.load;

import android.content.Context;
import com.vungle.ads.APIFailedStatusCodeError;
import com.vungle.ads.AdResponseEmptyError;
import com.vungle.ads.AdRetryActiveError;
import com.vungle.ads.AdRetryError;
import com.vungle.ads.NetworkTimeoutError;
import com.vungle.ads.NetworkUnreachable;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.network.Call;
import com.vungle.ads.internal.network.Callback;
import com.vungle.ads.internal.network.Response;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.omsdk.OMInjector;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.PathProvider;
import java.net.SocketTimeoutException;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: DefaultAdLoader.kt */
/* JADX INFO: loaded from: classes4.dex */
public class DefaultAdLoader extends BaseAdLoader {

    /* JADX INFO: renamed from: com.vungle.ads.internal.load.DefaultAdLoader$fetchAdMetadata$1, reason: invalid class name */
    /* JADX INFO: compiled from: DefaultAdLoader.kt */
    public static final class AnonymousClass1 implements Callback<AdPayload> {
        final /* synthetic */ Placement $placement;

        AnonymousClass1(Placement placement) {
            this.$placement = placement;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: onFailure$lambda-1, reason: not valid java name */
        public static final void m264onFailure$lambda1(DefaultAdLoader this$0, Throwable th) {
            t.f(this$0, "this$0");
            this$0.onAdLoadFailed(this$0.retrofitToVungleError(th).setLogEntry$vungle_ads_release(this$0.getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: onResponse$lambda-0, reason: not valid java name */
        public static final void m265onResponse$lambda0(DefaultAdLoader this$0, Placement placement, Response response) {
            t.f(this$0, "this$0");
            t.f(placement, "$placement");
            if (this$0.getVungleApiClient().getRetryAfterHeaderValue(placement.getReferenceId()) > 0) {
                this$0.onAdLoadFailed(new AdRetryError().setLogEntry$vungle_ads_release(this$0.getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
                return;
            }
            boolean z10 = false;
            if (response != null && !response.isSuccessful()) {
                z10 = true;
            }
            if (z10) {
                this$0.onAdLoadFailed(new APIFailedStatusCodeError(this$0.getApiErrorPrefix() + " API: " + response.code()).setLogEntry$vungle_ads_release(this$0.getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
                return;
            }
            AdPayload adPayload = response != null ? (AdPayload) response.body() : null;
            if ((adPayload != null ? adPayload.adUnit() : null) != null) {
                this$0.handleAdMetaData$vungle_ads_release(adPayload, new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.CONFIG_LOADED_FROM_AD_LOAD));
                return;
            }
            this$0.onAdLoadFailed(new AdResponseEmptyError(this$0.getApiErrorPrefix() + " ad response is empty").setLogEntry$vungle_ads_release(this$0.getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
        }

        @Override // com.vungle.ads.internal.network.Callback
        public void onFailure(Call<AdPayload> call, final Throwable th) {
            VungleThreadPoolExecutor backgroundExecutor = DefaultAdLoader.this.getSdkExecutors().getBackgroundExecutor();
            final DefaultAdLoader defaultAdLoader = DefaultAdLoader.this;
            backgroundExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.load.f
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultAdLoader.AnonymousClass1.m264onFailure$lambda1(defaultAdLoader, th);
                }
            });
        }

        @Override // com.vungle.ads.internal.network.Callback
        public void onResponse(Call<AdPayload> call, final Response<AdPayload> response) {
            VungleThreadPoolExecutor backgroundExecutor = DefaultAdLoader.this.getSdkExecutors().getBackgroundExecutor();
            final DefaultAdLoader defaultAdLoader = DefaultAdLoader.this;
            final Placement placement = this.$placement;
            backgroundExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.load.e
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultAdLoader.AnonymousClass1.m265onResponse$lambda0(defaultAdLoader, placement, response);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultAdLoader(Context context, VungleApiClient vungleApiClient, Executors sdkExecutors, OMInjector omInjector, Downloader downloader, PathProvider pathProvider, AdRequest adRequest) {
        super(context, vungleApiClient, sdkExecutors, omInjector, downloader, pathProvider, adRequest);
        t.f(context, "context");
        t.f(vungleApiClient, "vungleApiClient");
        t.f(sdkExecutors, "sdkExecutors");
        t.f(omInjector, "omInjector");
        t.f(downloader, "downloader");
        t.f(pathProvider, "pathProvider");
        t.f(adRequest, "adRequest");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VungleError retrofitToVungleError(Throwable th) {
        if (th instanceof SocketTimeoutException) {
            return new NetworkTimeoutError();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getApiErrorPrefix());
        sb2.append(" request fail: ");
        sb2.append(th != null ? th.getMessage() : null);
        return new NetworkUnreachable(sb2.toString());
    }

    protected void fetchAdMetadata(VungleAdSize vungleAdSize, Placement placement) {
        t.f(placement, "placement");
        if (getVungleApiClient().checkIsRetryAfterActive(placement.getReferenceId())) {
            onAdLoadFailed(new AdRetryActiveError().setLogEntry$vungle_ads_release(getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
            return;
        }
        Call<AdPayload> adCall = getAdCall(placement.getReferenceId(), vungleAdSize);
        if (adCall != null) {
            adCall.enqueue(new AnonymousClass1(placement));
            return;
        }
        onAdLoadFailed(new NetworkUnreachable(getApiErrorPrefix() + " is null").setLogEntry$vungle_ads_release(getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
    }

    public Call<AdPayload> getAdCall(String placement, VungleAdSize vungleAdSize) {
        t.f(placement, "placement");
        return getVungleApiClient().requestAd(placement, vungleAdSize);
    }

    public String getApiErrorPrefix() {
        return "ads";
    }

    @Override // com.vungle.ads.internal.load.BaseAdLoader
    protected void requestAd() {
        fetchAdMetadata(getAdRequest().getRequestAdSize(), getAdRequest().getPlacement());
    }

    @Override // com.vungle.ads.internal.load.BaseAdLoader
    public void onAdLoadReady() {
    }
}
