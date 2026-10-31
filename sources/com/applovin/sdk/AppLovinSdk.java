package com.applovin.sdk;

import android.content.Context;
import android.net.Uri;
import com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.y3;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxSegmentCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AppLovinSdk {
    private static final String TAG = "AppLovinSdk";
    private static AppLovinSdk instance;
    private final l coreSdk;
    public static final String VERSION = getVersion();
    public static final int VERSION_CODE = getVersionCode();
    private static final Object instanceLock = new Object();

    public interface SdkInitializationListener {
        void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration);
    }

    private AppLovinSdk(l lVar) {
        this.coreSdk = lVar;
    }

    public static AppLovinSdk getInstance(Context context) {
        AppLovinSdk appLovinSdk;
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        synchronized (instanceLock) {
            if (instance == null) {
                l lVar = new l(new AppLovinSdkSettings(context), context);
                AppLovinSdk appLovinSdk2 = new AppLovinSdk(lVar);
                lVar.a(appLovinSdk2);
                instance = appLovinSdk2;
            }
            appLovinSdk = instance;
        }
        return appLovinSdk;
    }

    private static String getVersion() {
        return "13.6.2";
    }

    private static int getVersionCode() {
        return 13060299;
    }

    public l a() {
        return this.coreSdk;
    }

    public AppLovinAdService getAdService() {
        return this.coreSdk.l();
    }

    public List<MaxMediatedNetworkInfo> getAvailableMediatedNetworks() {
        JSONArray jSONArrayB = y3.b(this.coreSdk);
        ArrayList arrayList = new ArrayList(jSONArrayB.length());
        for (int i10 = 0; i10 < jSONArrayB.length(); i10++) {
            arrayList.add(new MaxMediatedNetworkInfoImpl(JsonUtils.getJSONObject(jSONArrayB, i10, (JSONObject) null)));
        }
        return arrayList;
    }

    public AppLovinCmpService getCmpService() {
        return this.coreSdk.t();
    }

    public AppLovinSdkConfiguration getConfiguration() {
        return this.coreSdk.w();
    }

    public AppLovinEventService getEventService() {
        return this.coreSdk.G();
    }

    public String getSdkKey() {
        return this.coreSdk.k0();
    }

    public MaxSegmentCollection getSegmentCollection() {
        return this.coreSdk.l0();
    }

    public AppLovinSdkSettings getSettings() {
        return this.coreSdk.p0();
    }

    public void initialize(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration, SdkInitializationListener sdkInitializationListener) {
        this.coreSdk.a(appLovinSdkInitializationConfiguration, sdkInitializationListener);
    }

    public boolean isInitialized() {
        return this.coreSdk.D0();
    }

    public void processDeepLink(Uri uri) {
        this.coreSdk.a(uri);
    }

    protected void reinitialize(Boolean bool, Boolean bool2) {
        if (this.coreSdk.F0()) {
            this.coreSdk.T0();
        }
        this.coreSdk.S0();
        if (bool != null) {
            this.coreSdk.Q();
            if (p.a()) {
                this.coreSdk.Q().d(TAG, "Toggled 'huc' to " + bool);
            }
            getEventService().trackEvent("huc", CollectionUtils.map("value", bool.toString()));
        }
        if (bool2 != null) {
            this.coreSdk.Q();
            if (p.a()) {
                this.coreSdk.Q().d(TAG, "Toggled 'dns' to " + bool2);
            }
            getEventService().trackEvent("dns", CollectionUtils.map("value", bool2.toString()));
        }
    }

    public void showCreativeDebugger() {
        this.coreSdk.X0();
    }

    public void showMediationDebugger() {
        this.coreSdk.Y0();
    }

    public String toString() {
        return "AppLovinSdk{sdkKey='" + getSdkKey() + "', isInitialized=" + isInitialized() + ", isFirstSession=" + this.coreSdk.E0() + '}';
    }

    public void showMediationDebugger(Map<String, List<?>> map) {
        this.coreSdk.a(map);
    }
}
