package com.applovin.impl.mediation;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.ads.Zfi.OgqfiHA;
import com.facebook.internal.ServerProtocol;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class MaxMediatedNetworkInfoImpl implements MaxMediatedNetworkInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f7167a;

    public MaxMediatedNetworkInfoImpl(JSONObject jSONObject) {
        this.f7167a = jSONObject;
    }

    @Override // com.applovin.mediation.MaxMediatedNetworkInfo
    public String getAdapterClassName() {
        return JsonUtils.getString(this.f7167a, "class", "");
    }

    @Override // com.applovin.mediation.MaxMediatedNetworkInfo
    public String getAdapterVersion() {
        return JsonUtils.getString(this.f7167a, ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, "");
    }

    @Override // com.applovin.mediation.MaxMediatedNetworkInfo
    public MaxMediatedNetworkInfo.InitializationStatus getInitializationStatus() {
        return MaxMediatedNetworkInfo.InitializationStatus.fromCode(JsonUtils.getInt(this.f7167a, "initialization_status", MaxMediatedNetworkInfo.InitializationStatus.NOT_INITIALIZED.getCode()));
    }

    @Override // com.applovin.mediation.MaxMediatedNetworkInfo
    public String getName() {
        return JsonUtils.getString(this.f7167a, "name", "");
    }

    @Override // com.applovin.mediation.MaxMediatedNetworkInfo
    public String getSdkVersion() {
        return JsonUtils.getString(this.f7167a, "sdk_version", "");
    }

    public String toString() {
        return "MaxMediatedNetworkInfo{name=" + getName() + ", adapterClassName=" + getAdapterClassName() + ", adapterVersion=" + getAdapterVersion() + ", sdkVersion=" + getSdkVersion() + OgqfiHA.dDUGGdDUpQeN + getInitializationStatus() + '}';
    }
}
