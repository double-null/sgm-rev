package io.bidmachine.ads.networks.gam;

import android.content.Context;
import android.text.TextUtils;
import io.bidmachine.AdsFormat;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.HeaderBiddingAdRequestParams;
import io.bidmachine.HeaderBiddingAdapter;
import io.bidmachine.HeaderBiddingCollectParamsCallback;
import io.bidmachine.InitializationParams;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfigParams;
import io.bidmachine.NetworkInitializationCallback;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class GAMAdapter extends HeaderBiddingAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o f16513a;

    GAMAdapter() {
        this("gam", "", "3.6.1.3", 16);
    }

    private Map<AdsFormat, r> b(String str) {
        r rVarA;
        HashMap map = new HashMap();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null && (rVarA = s.a(jSONObjectOptJSONObject)) != null) {
                    map.put(rVarA.a(), rVarA);
                }
            }
            return map;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String a() {
        return "GAM";
    }

    @Override // io.bidmachine.NetworkAdapter
    public void clearAuction(NetworkAdUnit networkAdUnit) throws Throwable {
        o oVar = this.f16513a;
        if (oVar != null) {
            oVar.r(networkAdUnit);
        }
    }

    @Override // io.bidmachine.NetworkAdapter
    public vb.e createBanner() {
        if (this.f16513a != null) {
            return new a(this.f16513a);
        }
        throw new IllegalArgumentException("GAMNetwork is null");
    }

    @Override // io.bidmachine.NetworkAdapter
    public vb.h createInterstitial() {
        if (this.f16513a != null) {
            return new d(this.f16513a);
        }
        throw new IllegalArgumentException("GAMNetwork is null");
    }

    @Override // io.bidmachine.NetworkAdapter
    public vb.h createRewarded() {
        if (this.f16513a != null) {
            return new q(this.f16513a);
        }
        throw new IllegalArgumentException("GAMNetwork is null");
    }

    @Override // io.bidmachine.NetworkAdapter
    public String getNetworkSdkVersion() throws Throwable {
        o oVar = this.f16513a;
        if (oVar != null) {
            return oVar.f();
        }
        return null;
    }

    @Override // io.bidmachine.NetworkAdapter
    protected boolean isNetworkInitializationStatusCheckSupported() {
        return true;
    }

    @Override // io.bidmachine.NetworkAdapter
    protected boolean isNetworkInitialized(ContextProvider contextProvider) throws Throwable {
        o oVar = this.f16513a;
        return oVar != null && oVar.h();
    }

    @Override // io.bidmachine.HeaderBiddingAdapter
    protected void onCollectHeaderBiddingParams(ContextProvider contextProvider, vb.d dVar, NetworkAdUnit networkAdUnit, HeaderBiddingAdRequestParams headerBiddingAdRequestParams, HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) throws Throwable {
        String mediationParameter = networkAdUnit.getMediationParameter("ad_unit_id");
        if (TextUtils.isEmpty(mediationParameter)) {
            headerBiddingCollectParamsCallback.onCollectFail(oc.a.b("ad_unit_id"));
            return;
        }
        o oVar = this.f16513a;
        if (oVar == null) {
            headerBiddingCollectParamsCallback.onCollectFail(oc.a.a("GAM network is null"));
            return;
        }
        t tVarQ = oVar.q(networkAdUnit, mediationParameter);
        this.f16513a.e(dVar.getAdRequestParameters().getAdsFormat());
        if (tVarQ == null) {
            headerBiddingCollectParamsCallback.onCollectFail(oc.a.a("Can't find idle ad"));
            return;
        }
        HashMap map = new HashMap();
        map.put("ad_unit_id", tVarQ.a());
        map.put("score", String.valueOf(tVarQ.d()));
        map.put("price", String.valueOf(tVarQ.c()));
        headerBiddingCollectParamsCallback.onCollectFinished(map);
    }

    @Override // io.bidmachine.NetworkAdapter
    public void onLossAuction(NetworkAdUnit networkAdUnit) throws Throwable {
        o oVar = this.f16513a;
        if (oVar != null) {
            oVar.r(networkAdUnit);
        }
    }

    @Override // io.bidmachine.NetworkAdapter
    protected void onNetworkInitialize(ContextProvider contextProvider, InitializationParams initializationParams, NetworkConfigParams networkConfigParams, NetworkInitializationCallback networkInitializationCallback) throws Throwable {
        String strRemoveFromNetworkParams = networkConfigParams.removeFromNetworkParams("supported_versions_range");
        if (TextUtils.isEmpty(strRemoveFromNetworkParams)) {
            networkInitializationCallback.onFail("supported_versions_range not provided");
            return;
        }
        m6.b bVarC = q0.c(strRemoveFromNetworkParams);
        if (bVarC == null) {
            networkInitializationCallback.onFail("Unsupported GAM version (VersionWrapper not found)");
            return;
        }
        Context applicationContext = contextProvider.getApplicationContext();
        if (!bVarC.d(applicationContext)) {
            networkInitializationCallback.onFail("GAM is absent or used unsupported version");
            return;
        }
        String strRemoveFromNetworkParams2 = networkConfigParams.removeFromNetworkParams("waterfall_configurations");
        if (TextUtils.isEmpty(strRemoveFromNetworkParams2)) {
            networkInitializationCallback.onFail("waterfall_configurations not provided");
            return;
        }
        Map<AdsFormat, r> mapB = b(strRemoveFromNetworkParams2);
        if (mapB == null || mapB.isEmpty()) {
            networkInitializationCallback.onFail("waterfall_configurations is empty");
            return;
        }
        o oVar = new o(applicationContext, bVarC, a(), mapB, networkConfigParams.removeFromNetworkParams("request_agent"), TimeUnit.SECONDS.toMillis(io.bidmachine.core.h.X(networkConfigParams.removeFromNetworkParams("expiration_time"), 3600)), Boolean.parseBoolean(networkConfigParams.removeFromNetworkParams("override_callbacks")));
        this.f16513a = oVar;
        oVar.g(applicationContext);
        this.f16513a.d();
        networkInitializationCallback.onSuccess();
    }

    protected GAMAdapter(String str, String str2, String str3, int i10) {
        this(str, str2, str3, i10, new AdsType[]{AdsType.Banner, AdsType.Interstitial, AdsType.Rewarded});
    }

    protected GAMAdapter(String str, String str2, String str3, int i10, AdsType[] adsTypeArr) {
        super(str, str2, str3, i10, adsTypeArr);
    }
}
