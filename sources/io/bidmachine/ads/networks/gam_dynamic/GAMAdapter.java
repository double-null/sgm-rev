package io.bidmachine.ads.networks.gam_dynamic;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.applovin.mediation.adapters.bidmachine.BuildConfig;
import com.explorestack.protobuf.Struct;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.ExtraParamsManager;
import io.bidmachine.HeaderBiddingAdRequestParams;
import io.bidmachine.HeaderBiddingAdapter;
import io.bidmachine.HeaderBiddingCollectParamsCallback;
import io.bidmachine.InitializationParams;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfigParams;
import io.bidmachine.NetworkInitializationCallback;
import io.bidmachine.protobuf.Waterfall;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class GAMAdapter extends HeaderBiddingAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    o f16601a;

    static class a extends q6.t {
        public a(String str, String str2) {
            super(str, str2);
        }

        @Override // q6.s
        public Struct b(Context context) {
            return ExtraParamsManager.get().getPrivateStruct(context);
        }
    }

    GAMAdapter(String str) {
        this(str, "", BuildConfig.VERSION_NAME, 16);
    }

    public String a() {
        return "GAMDynamic";
    }

    Waterfall.Context b(String str) {
        try {
            return Waterfall.Context.parseFrom(Base64.decode(str, 0));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // io.bidmachine.NetworkAdapter
    public void clearAuction(NetworkAdUnit networkAdUnit) throws Throwable {
        o oVar = this.f16601a;
        if (oVar != null) {
            oVar.d(networkAdUnit);
        }
    }

    @Override // io.bidmachine.NetworkAdapter
    public vb.e createBanner() {
        o oVar = this.f16601a;
        if (oVar != null) {
            return new h(oVar);
        }
        throw new IllegalArgumentException("GAMNetwork is null");
    }

    @Override // io.bidmachine.NetworkAdapter
    public vb.h createInterstitial() {
        o oVar = this.f16601a;
        if (oVar != null) {
            return new n(oVar);
        }
        throw new IllegalArgumentException("GAMNetwork is null");
    }

    @Override // io.bidmachine.NetworkAdapter
    public vb.h createRewarded() {
        o oVar = this.f16601a;
        if (oVar != null) {
            return new t(oVar);
        }
        throw new IllegalArgumentException("GAMNetwork is null");
    }

    @Override // io.bidmachine.NetworkAdapter
    public String getNetworkSdkVersion() throws Throwable {
        o oVar = this.f16601a;
        if (oVar != null) {
            return oVar.getVersion();
        }
        return null;
    }

    @Override // io.bidmachine.NetworkAdapter
    protected boolean isNetworkInitializationStatusCheckSupported() {
        return true;
    }

    @Override // io.bidmachine.NetworkAdapter
    protected boolean isNetworkInitialized(ContextProvider contextProvider) throws Throwable {
        o oVar = this.f16601a;
        return oVar != null && oVar.isInitialized();
    }

    @Override // io.bidmachine.HeaderBiddingAdapter
    protected void onCollectHeaderBiddingParams(ContextProvider contextProvider, vb.d dVar, NetworkAdUnit networkAdUnit, HeaderBiddingAdRequestParams headerBiddingAdRequestParams, HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) throws Throwable {
        o oVar = this.f16601a;
        if (oVar == null) {
            headerBiddingCollectParamsCallback.onCollectFail(oc.a.a("GAM network is null"));
            return;
        }
        q6.j jVarF = oVar.f(networkAdUnit, networkAdUnit.getAdFormat());
        if (jVarF == null) {
            headerBiddingCollectParamsCallback.onCollectFail(oc.a.a("Can't find idle ad"));
            return;
        }
        HashMap map = new HashMap();
        map.put("ad_unit_id", jVarF.getAdUnitId());
        map.put("price", String.valueOf(jVarF.getPrice()));
        for (Map.Entry<String, Object> entry : jVarF.getCustomParamsMap().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!TextUtils.isEmpty(key) && value != null) {
                map.put(key, String.valueOf(value));
            }
        }
        headerBiddingCollectParamsCallback.onCollectFinished(map);
    }

    @Override // io.bidmachine.NetworkAdapter
    public void onLossAuction(NetworkAdUnit networkAdUnit) throws Throwable {
        o oVar = this.f16601a;
        if (oVar != null) {
            oVar.d(networkAdUnit);
        }
    }

    @Override // io.bidmachine.NetworkAdapter
    protected void onNetworkInitialize(ContextProvider contextProvider, InitializationParams initializationParams, NetworkConfigParams networkConfigParams, NetworkInitializationCallback networkInitializationCallback) throws Throwable {
        String strRemoveFromNetworkParams = networkConfigParams.removeFromNetworkParams("supported_versions_range");
        if (TextUtils.isEmpty(strRemoveFromNetworkParams)) {
            networkInitializationCallback.onFail("supported_versions_range not provided");
            return;
        }
        r6.b bVarC = d0.c(strRemoveFromNetworkParams);
        if (bVarC == null) {
            networkInitializationCallback.onFail("Unsupported GAM version (VersionWrapper not found)");
            return;
        }
        Context applicationContext = contextProvider.getApplicationContext();
        if (!bVarC.d(applicationContext)) {
            networkInitializationCallback.onFail("GAM is absent or used unsupported version");
            return;
        }
        String strRemoveFromNetworkParams2 = networkConfigParams.removeFromNetworkParams("context");
        if (TextUtils.isEmpty(strRemoveFromNetworkParams2)) {
            networkInitializationCallback.onFail("context not provided");
            return;
        }
        Waterfall.Context contextB = b(strRemoveFromNetworkParams2);
        if (contextB == null) {
            networkInitializationCallback.onFail("context can't transform to model");
            return;
        }
        s sVar = new s(applicationContext, new a(getKey(), a()), contextB, bVarC);
        this.f16601a = sVar;
        sVar.h(applicationContext);
        this.f16601a.a();
        networkInitializationCallback.onSuccess();
    }

    protected GAMAdapter(String str, String str2, String str3, int i10) {
        this(str, str2, str3, i10, new AdsType[]{AdsType.Banner, AdsType.Interstitial, AdsType.Rewarded});
    }

    protected GAMAdapter(String str, String str2, String str3, int i10, AdsType[] adsTypeArr) {
        super(str, str2, str3, i10, adsTypeArr);
    }
}
