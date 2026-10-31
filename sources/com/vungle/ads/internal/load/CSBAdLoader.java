package com.vungle.ads.internal.load;

import android.content.Context;
import com.vungle.ads.AdResponseEmptyError;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.network.Call;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.omsdk.OMInjector;
import com.vungle.ads.internal.util.PathProvider;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: CSBAdLoader.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class CSBAdLoader extends DefaultAdLoader {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CSBAdLoader(Context context, VungleApiClient vungleApiClient, Executors sdkExecutors, OMInjector omInjector, Downloader downloader, PathProvider pathProvider, AdRequest adRequest) {
        super(context, vungleApiClient, sdkExecutors, omInjector, downloader, pathProvider, adRequest);
        t.f(context, "context");
        t.f(vungleApiClient, "vungleApiClient");
        t.f(sdkExecutors, "sdkExecutors");
        t.f(omInjector, "omInjector");
        t.f(downloader, "downloader");
        t.f(pathProvider, "pathProvider");
        t.f(adRequest, "adRequest");
    }

    @Override // com.vungle.ads.internal.load.DefaultAdLoader
    public Call<AdPayload> getAdCall(String placement, VungleAdSize vungleAdSize) {
        t.f(placement, "placement");
        return getVungleApiClient().requestCSBAd(placement, vungleAdSize, getAdRequest().getCsbData());
    }

    @Override // com.vungle.ads.internal.load.DefaultAdLoader
    public String getApiErrorPrefix() {
        return "CSB";
    }

    @Override // com.vungle.ads.internal.load.BaseAdLoader
    public VungleError validateAdMetadata(AdPayload adPayload) {
        t.f(adPayload, "adPayload");
        VungleError vungleErrorValidateAdMetadata = super.validateAdMetadata(adPayload);
        if (vungleErrorValidateAdMetadata == null) {
            return adPayload.getCSBResponse() == null ? new AdResponseEmptyError("CSB response is missing from ad payload") : null;
        }
        return vungleErrorValidateAdMetadata;
    }
}
