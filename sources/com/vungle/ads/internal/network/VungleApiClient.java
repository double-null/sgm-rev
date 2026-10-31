package com.vungle.ads.internal.network;

import af.e;
import af.f;
import af.m;
import af.q;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.URLUtil;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.appevents.eventdeactivation.ksG.UomBEukHFwrS;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.TimeIntervalMetric;
import com.vungle.ads.UserAgentError;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleAds;
import com.vungle.ads.VungleCSBData;
import com.vungle.ads.fpd.FirstPartyData;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.AdvertisingInfo;
import com.vungle.ads.internal.model.AppNode;
import com.vungle.ads.internal.model.CommonRequestBody;
import com.vungle.ads.internal.model.ConfigPayload;
import com.vungle.ads.internal.model.Cookie;
import com.vungle.ads.internal.model.DeviceNode;
import com.vungle.ads.internal.model.ErrorInfo;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.platform.AndroidPlatform;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.privacy.COPPA;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import fe.d;
import fe.u;
import io.bidmachine.analytics.internal.n.QQJ.WKirgUEJJ;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.collections.s;
import kotlin.jvm.internal.i0;
import kotlin.jvm.internal.t;
import kotlinx.serialization.json.d0;
import kotlinx.serialization.json.e0;
import me.a0;
import me.b0;
import me.c0;
import me.v;
import me.w;
import me.x;
import me.y;
import me.z;
import od.h;
import sc.NfwM.XDucgbzInpQa;
import wc.k;
import wc.o;

/* JADX INFO: compiled from: VungleApiClient.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class VungleApiClient {
    private static final String TAG = "VungleApiClient";
    private AdvertisingInfo advertisingInfo;
    private VungleApi api;
    private AppNode appBody;
    private final Context applicationContext;
    private DeviceNode baseDeviceInfo;
    private final FilePreferences filePreferences;
    private VungleApi gzipApi;
    private Boolean isGooglePlayServicesAvailable;
    private final Platform platform;
    private v responseInterceptor;
    private Map<String, Long> retryAfterDataMap;
    private final k signalManager$delegate;
    private String uaString;
    public static final Companion Companion = new Companion(null);
    private static final String BASE_URL = "https://config.ads.vungle.com/";
    private static final Set<v> networkInterceptors = new HashSet();
    private static final Set<v> logInterceptors = new HashSet();
    private static final kotlinx.serialization.json.b json = kotlinx.serialization.json.v.b(null, VungleApiClient$Companion$json$1.INSTANCE, 1, null);

    /* JADX INFO: compiled from: VungleApiClient.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final String getBASE_URL$vungle_ads_release() {
            return VungleApiClient.BASE_URL;
        }

        public final void reset$vungle_ads_release() {
            VungleHeader.INSTANCE.reset();
        }
    }

    /* JADX INFO: compiled from: VungleApiClient.kt */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ConnectionTypeDetail {
        public static final String CDMA_1XRTT = "cdma_1xrtt";
        public static final String CDMA_EVDO_0 = "cdma_evdo_0";
        public static final String CDMA_EVDO_A = "cdma_evdo_a";
        public static final String CDMA_EVDO_B = "cdma_evdo_b";
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final String EDGE = "edge";
        public static final String FIFTH_G = "5g";
        public static final String GPRS = "gprs";
        public static final String HRPD = "hrpd";
        public static final String HSDPA = "hsdpa";
        public static final String HSUPA = "hsupa";
        public static final String LTE = "lte";
        public static final String UNKNOWN = "unknown";
        public static final String WCDMA = "wcdma";

        /* JADX INFO: compiled from: VungleApiClient.kt */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final String CDMA_1XRTT = "cdma_1xrtt";
            public static final String CDMA_EVDO_0 = "cdma_evdo_0";
            public static final String CDMA_EVDO_A = "cdma_evdo_a";
            public static final String CDMA_EVDO_B = "cdma_evdo_b";
            public static final String EDGE = "edge";
            public static final String FIFTH_G = "5g";
            public static final String GPRS = "gprs";
            public static final String HRPD = "hrpd";
            public static final String HSDPA = "hsdpa";
            public static final String HSUPA = "hsupa";
            public static final String LTE = "lte";
            public static final String UNKNOWN = "unknown";
            public static final String WCDMA = "wcdma";

            private Companion() {
            }
        }
    }

    /* JADX INFO: compiled from: VungleApiClient.kt */
    public static final class GzipRequestInterceptor implements v {
        private static final String CONTENT_ENCODING = "Content-Encoding";
        public static final Companion Companion = new Companion(null);
        private static final String GZIP = "gzip";

        /* JADX INFO: compiled from: VungleApiClient.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                this();
            }
        }

        private final a0 gzip(final a0 a0Var) throws IOException {
            final e eVar = new e();
            f fVarC = q.c(new m(eVar));
            a0Var.writeTo(fVarC);
            fVarC.close();
            return new a0() { // from class: com.vungle.ads.internal.network.VungleApiClient$GzipRequestInterceptor$gzip$1
                @Override // me.a0
                public long contentLength() {
                    return eVar.size();
                }

                @Override // me.a0
                public w contentType() {
                    return a0Var.contentType();
                }

                @Override // me.a0
                public void writeTo(f sink) throws IOException {
                    t.f(sink, "sink");
                    sink.D(eVar.B());
                }
            };
        }

        @Override // me.v
        public b0 intercept(v.a chain) throws IOException {
            t.f(chain, "chain");
            z zVarRequest = chain.request();
            a0 a0VarA = zVarRequest.a();
            return (a0VarA == null || zVarRequest.d(CONTENT_ENCODING) != null) ? chain.a(zVarRequest) : chain.a(zVarRequest.i().e(CONTENT_ENCODING, GZIP).g(zVarRequest.h(), gzip(a0VarA)).b());
        }
    }

    private final String bodyToString(a0 a0Var) {
        try {
            e eVar = new e();
            if (a0Var == null) {
                return "";
            }
            a0Var.writeTo(eVar);
            return eVar.readUtf8();
        } catch (Exception unused) {
            return "";
        }
    }

    private final b0 defaultErrorResponse(z zVar) {
        return new b0.a().s(zVar).g(500).q(y.HTTP_1_1).n("Server is busy").b(c0.Companion.c("{\"Error\":\"Server is busy\"}", w.f22559e.b("application/json"))).c();
    }

    public static /* synthetic */ void getAppBody$vungle_ads_release$annotations() {
    }

    private final DeviceNode getBasicDeviceBody(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = context.getSystemService("window");
        t.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        String MANUFACTURER = Build.MANUFACTURER;
        t.e(MANUFACTURER, "MANUFACTURER");
        String MODEL = Build.MODEL;
        t.e(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        t.e(RELEASE, "RELEASE");
        DeviceNode deviceNode = new DeviceNode(MANUFACTURER, MODEL, RELEASE, AndroidPlatform.Companion.getCarrierName$vungle_ads_release(context), t.a("Amazon", MANUFACTURER) ? "amazon" : "android", displayMetrics.widthPixels, displayMetrics.heightPixels, this.uaString, (String) null, (Integer) null, (DeviceNode.VungleExt) null, 1792, (kotlin.jvm.internal.k) null);
        try {
            String userAgent = this.platform.getUserAgent();
            this.uaString = userAgent;
            deviceNode.setUa(userAgent);
            initUserAgentLazy();
            AdvertisingInfo advertisingInfo = this.advertisingInfo;
            if (advertisingInfo == null) {
                advertisingInfo = this.platform.getAdvertisingInfo();
            }
            this.advertisingInfo = advertisingInfo;
        } catch (Exception e10) {
            Logger.Companion.e(TAG, "Cannot Get UserAgent. Setting Default Device UserAgent." + e10.getLocalizedMessage());
        }
        return deviceNode;
    }

    private final String getConnectionType() {
        if (androidx.core.content.a.a(this.applicationContext, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return null;
        }
        Object systemService = this.applicationContext.getSystemService("connectivity");
        t.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return "NONE";
        }
        int type = activeNetworkInfo.getType();
        if (type == 0) {
            return "MOBILE";
        }
        if (type == 1 || type == 6) {
            return "WIFI";
        }
        if (type != 7) {
            return type != 9 ? "UNKNOWN" : "ETHERNET";
        }
        return "BLUETOOTH";
    }

    private final DeviceNode getDeviceBody() throws IllegalStateException {
        return getDeviceBody$vungle_ads_release(false);
    }

    static /* synthetic */ CommonRequestBody.RequestExt getExtBody$default(VungleApiClient vungleApiClient, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return vungleApiClient.getExtBody(z10);
    }

    public static /* synthetic */ void getGzipApi$vungle_ads_release$annotations() {
    }

    private final String getPlacementID(a0 a0Var) {
        List<String> placements;
        String str;
        try {
            kotlinx.serialization.json.b bVar = json;
            String strBodyToString = bodyToString(a0Var);
            d<Object> dVarB = u.b(bVar.a(), i0.j(CommonRequestBody.class));
            t.d(dVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            CommonRequestBody.RequestParam request = ((CommonRequestBody) bVar.c(dVarB, strBodyToString)).getRequest();
            return (request == null || (placements = request.getPlacements()) == null || (str = placements.get(0)) == null) ? "" : str;
        } catch (Exception unused) {
            return "";
        }
    }

    public static /* synthetic */ void getResponseInterceptor$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getRetryAfterDataMap$vungle_ads_release$annotations() {
    }

    private final SignalManager getSignalManager() {
        return (SignalManager) this.signalManager$delegate.getValue();
    }

    private final CommonRequestBody.User getUserBody(boolean z10) {
        CommonRequestBody.User user = new CommonRequestBody.User((CommonRequestBody.GDPR) null, (CommonRequestBody.CCPA) null, (CommonRequestBody.COPPA) null, (FirstPartyData) null, (CommonRequestBody.IAB) null, 31, (kotlin.jvm.internal.k) null);
        PrivacyManager privacyManager = PrivacyManager.INSTANCE;
        user.setGdpr(new CommonRequestBody.GDPR(privacyManager.getConsentStatus(), privacyManager.getConsentSource(), privacyManager.getConsentTimestamp(), privacyManager.getConsentMessageVersion()));
        user.setCcpa(new CommonRequestBody.CCPA(privacyManager.getCcpaStatus()));
        if (privacyManager.getCoppaStatus() != COPPA.COPPA_NOTSET) {
            user.setCoppa(new CommonRequestBody.COPPA(privacyManager.getCoppaStatus().getValue()));
        }
        if (privacyManager.shouldSendTCFString()) {
            user.setIab(new CommonRequestBody.IAB(privacyManager.getIABTCFString()));
        }
        if (z10) {
            user.setFpd(VungleAds.firstPartyData);
        }
        return user;
    }

    static /* synthetic */ CommonRequestBody.User getUserBody$default(VungleApiClient vungleApiClient, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return vungleApiClient.getUserBody(z10);
    }

    private final void initUserAgentLazy() {
        final TimeIntervalMetric timeIntervalMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.USER_AGENT_LOAD_DURATION_MS);
        timeIntervalMetric.markStart();
        this.platform.getUserAgentLazy(new w.b<String>() { // from class: com.vungle.ads.internal.network.VungleApiClient.initUserAgentLazy.1
            @Override // w.b
            public void accept(String str) {
                if (str == null || str.length() == 0) {
                    String str2 = VungleApiClient.this.uaString;
                    if (str2 == null || str2.length() == 0) {
                        str = VungleApiClient.this.platform.getUserAgent();
                    }
                }
                if (str == null || str.length() == 0) {
                    Logger.Companion.e(VungleApiClient.TAG, "All UA sources failed, logging USER_AGENT_ERROR");
                    new UserAgentError().logErrorNoReturnValue$vungle_ads_release();
                } else {
                    timeIntervalMetric.markEnd();
                    AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, timeIntervalMetric, (LogEntry) null, (String) null, 6, (Object) null);
                    VungleApiClient.this.uaString = str;
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ErrorInfo pingTPAT$default(VungleApiClient vungleApiClient, String str, Map map, String str2, HttpMethod httpMethod, LogEntry logEntry, int i10, Object obj) {
        Map map2 = (i10 & 2) != 0 ? null : map;
        String str3 = (i10 & 4) != 0 ? null : str2;
        if ((i10 & 8) != 0) {
            httpMethod = HttpMethod.GET;
        }
        return vungleApiClient.pingTPAT(str, map2, str3, httpMethod, (i10 & 16) != 0 ? null : logEntry);
    }

    public static /* synthetic */ CommonRequestBody requestBody$default(VungleApiClient vungleApiClient, boolean z10, boolean z11, int i10, Object obj) throws IllegalStateException {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        return vungleApiClient.requestBody(z10, z11);
    }

    private final b0 safeErrorResponse(z zVar) {
        try {
            return new b0.a().s(zVar).g(500).q(y.HTTP_1_1).n("OOM").b(c0.Companion.h(new byte[0], null)).c();
        } catch (OutOfMemoryError e10) {
            throw e10;
        }
    }

    public final void addPlaySvcAvailabilityInCookie(boolean z10) {
        this.filePreferences.put(Cookie.IS_PLAY_SERVICE_AVAILABLE, z10).apply();
    }

    public final boolean checkIsRetryAfterActive(String placementID) {
        t.f(placementID, "placementID");
        Long l10 = this.retryAfterDataMap.get(placementID);
        if ((l10 != null ? l10.longValue() : 0L) > System.currentTimeMillis()) {
            return true;
        }
        this.retryAfterDataMap.remove(placementID);
        return false;
    }

    public final Call<ConfigPayload> config() throws IOException {
        AppNode appNode = this.appBody;
        if (appNode == null) {
            return null;
        }
        CommonRequestBody commonRequestBody = new CommonRequestBody(getDeviceBody$vungle_ads_release(true), appNode, getUserBody$default(this, false, 1, null), (CommonRequestBody.RequestExt) null, (CommonRequestBody.RequestParam) null, 24, (kotlin.jvm.internal.k) null);
        CommonRequestBody.RequestExt extBody$default = getExtBody$default(this, false, 1, null);
        if (extBody$default != null) {
            commonRequestBody.setExt(extBody$default);
        }
        FileUtility fileUtility = FileUtility.INSTANCE;
        String str = BASE_URL;
        if (!fileUtility.isValidUrl(str)) {
            str = "https://config.ads.vungle.com/";
        }
        if (!rd.c0.A(str, "/", false, 2, null)) {
            str = str + '/';
        }
        return this.api.config(VungleHeader.INSTANCE.getHeaderUa(), str + "config", commonRequestBody);
    }

    public final AppNode getAppBody$vungle_ads_release() {
        return this.appBody;
    }

    public final String getConnectionTypeDetail(int i10) {
        if (i10 == 1) {
            return "gprs";
        }
        if (i10 == 2) {
            return "edge";
        }
        if (i10 == 20) {
            return "5g";
        }
        switch (i10) {
            case 4:
                return "wcdma";
            case 5:
                return "cdma_evdo_0";
            case 6:
                return "cdma_evdo_a";
            case 7:
                return "cdma_1xrtt";
            case 8:
                return "hsdpa";
            case 9:
                return "hsupa";
            default:
                switch (i10) {
                    case 12:
                        return "cdma_evdo_b";
                    case 13:
                        return "lte";
                    case 14:
                        return "hrpd";
                    default:
                        return "unknown";
                }
        }
    }

    public final String getConnectionTypeDetail$vungle_ads_release() {
        if (androidx.core.content.a.a(this.applicationContext, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return null;
        }
        Object systemService = this.applicationContext.getSystemService("connectivity");
        t.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        return activeNetworkInfo != null ? getConnectionTypeDetail(activeNetworkInfo.getSubtype()) : "unknown";
    }

    public final synchronized DeviceNode getDeviceBody$vungle_ads_release(boolean z10) throws IllegalStateException {
        DeviceNode deviceNodeCopy;
        DeviceNode.VungleExt vungleExt;
        String str;
        boolean zHasSystemFeature;
        DeviceNode basicDeviceBody = this.baseDeviceInfo;
        if (basicDeviceBody == null) {
            basicDeviceBody = getBasicDeviceBody(this.applicationContext);
            this.baseDeviceInfo = basicDeviceBody;
        }
        DeviceNode deviceNode = basicDeviceBody;
        deviceNodeCopy = deviceNode.copy((2047 & 1) != 0 ? deviceNode.make : null, (2047 & 2) != 0 ? deviceNode.model : null, (2047 & 4) != 0 ? deviceNode.osv : null, (2047 & 8) != 0 ? deviceNode.carrier : null, (2047 & 16) != 0 ? deviceNode.os : null, (2047 & 32) != 0 ? deviceNode.f13075w : 0, (2047 & 64) != 0 ? deviceNode.f13073h : 0, (2047 & 128) != 0 ? deviceNode.f13074ua : null, (2047 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? deviceNode.ifa : null, (2047 & 512) != 0 ? deviceNode.lmt : null, (2047 & 1024) != 0 ? deviceNode.ext : null);
        DeviceNode.VungleExt vungleExt2 = new DeviceNode.VungleExt(false, (String) null, (Integer) null, 0.0f, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0.0f, 0, false, 0, false, (String) null, (String) null, (Long) null, (Long) null, (Long) null, (Long) null, (String) null, 8388607, (kotlin.jvm.internal.k) null);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = this.applicationContext.getSystemService("window");
        t.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        deviceNodeCopy.setH(displayMetrics.heightPixels);
        deviceNodeCopy.setW(displayMetrics.widthPixels);
        AdvertisingInfo advertisingInfo = this.advertisingInfo;
        if (advertisingInfo == null) {
            advertisingInfo = this.platform.getAdvertisingInfo();
        }
        this.advertisingInfo = advertisingInfo;
        String advertisingId = advertisingInfo != null ? advertisingInfo.getAdvertisingId() : null;
        AdvertisingInfo advertisingInfo2 = this.advertisingInfo;
        Boolean boolValueOf = advertisingInfo2 != null ? Boolean.valueOf(advertisingInfo2.getLimitAdTracking()) : null;
        PrivacyManager privacyManager = PrivacyManager.INSTANCE;
        if (!privacyManager.shouldSendAdIds()) {
            vungleExt = vungleExt2;
        } else if (advertisingId != null) {
            if (t.a("Amazon", Build.MANUFACTURER)) {
                vungleExt = vungleExt2;
                vungleExt.setAmazonAdvertisingId(advertisingId);
            } else {
                vungleExt = vungleExt2;
                vungleExt.setGaid(advertisingId);
            }
            deviceNodeCopy.setIfa(advertisingId);
        } else {
            vungleExt = vungleExt2;
            deviceNodeCopy.setIfa("");
        }
        if (z10 || !privacyManager.shouldSendAdIds()) {
            deviceNodeCopy.setIfa(null);
            vungleExt.setGaid(null);
            vungleExt.setAmazonAdvertisingId(null);
        }
        Boolean bool = Boolean.TRUE;
        deviceNodeCopy.setLmt(t.a(boolValueOf, bool) ? 1 : 0);
        vungleExt.setGooglePlayServicesAvailable(t.a(bool, isGooglePlayServicesAvailable()));
        if (privacyManager.allowDeviceIDFromTCF() != PrivacyManager.DeviceIdAllowed.DISABLE_ID) {
            String appSetId = this.platform.getAppSetId();
            if (appSetId != null) {
                vungleExt.setAppSetId(appSetId);
            }
            Integer appSetIdScope = this.platform.getAppSetIdScope();
            if (appSetIdScope != null) {
                vungleExt.setAppSetIdScope(Integer.valueOf(appSetIdScope.intValue()));
            }
        }
        Intent intentRegisterReceiver = this.applicationContext.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            int intExtra = intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
            int intExtra2 = intentRegisterReceiver.getIntExtra("scale", -1);
            if (intExtra > 0 && intExtra2 > 0) {
                vungleExt.setBatteryLevel(intExtra / intExtra2);
            }
            int intExtra3 = intentRegisterReceiver.getIntExtra(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, -1);
            if (intExtra3 == -1) {
                str = "UNKNOWN";
            } else if (intExtra3 == 2 || intExtra3 == 5) {
                int intExtra4 = intentRegisterReceiver.getIntExtra("plugged", -1);
                if (intExtra4 == 1) {
                    str = "BATTERY_PLUGGED_AC";
                } else if (intExtra4 != 2) {
                    str = intExtra4 != 4 ? "BATTERY_PLUGGED_OTHERS" : "BATTERY_PLUGGED_WIRELESS";
                } else {
                    str = "BATTERY_PLUGGED_USB";
                }
            } else {
                str = "NOT_CHARGING";
            }
        } else {
            str = "UNKNOWN";
        }
        vungleExt.setBatteryState(str);
        vungleExt.setBatterySaverEnabled(this.platform.isBatterySaverEnabled() ? 1 : 0);
        String connectionType = getConnectionType();
        if (connectionType != null) {
            vungleExt.setConnectionType(connectionType);
        }
        String connectionTypeDetail$vungle_ads_release = getConnectionTypeDetail$vungle_ads_release();
        if (connectionTypeDetail$vungle_ads_release != null) {
            vungleExt.setConnectionTypeDetail(connectionTypeDetail$vungle_ads_release);
        }
        vungleExt.setLocale(Locale.getDefault().toString());
        vungleExt.setLanguage(Locale.getDefault().getLanguage());
        vungleExt.setTimeZone(TimeZone.getDefault().getID());
        vungleExt.setVolumeLevel(this.platform.getVolumeLevel());
        vungleExt.setSoundEnabled(this.platform.isSoundEnabled() ? 1 : 0);
        if (t.a("Amazon", Build.MANUFACTURER)) {
            zHasSystemFeature = this.applicationContext.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
        } else {
            Object systemService2 = this.applicationContext.getSystemService("uimode");
            t.d(systemService2, "null cannot be cast to non-null type android.app.UiModeManager");
            zHasSystemFeature = ((UiModeManager) systemService2).getCurrentModeType() == 4;
        }
        vungleExt.setTv(zHasSystemFeature);
        vungleExt.setSideloadEnabled(this.platform.isSideLoaded());
        vungleExt.setSdCardAvailable(this.platform.isSdCardPresent() ? 1 : 0);
        if (ConfigManager.INSTANCE.otEnabled()) {
            vungleExt.setSit(Long.valueOf(this.platform.getSDKInstallationTime()));
            vungleExt.setOit(Long.valueOf(this.platform.getOSInstallationTime()));
            vungleExt.setOrt(Long.valueOf(this.platform.getLastBootTime()));
            vungleExt.setObt(Long.valueOf(this.platform.getBuildTime()));
        }
        vungleExt.setGpVersion(this.platform.getGPVersion());
        deviceNodeCopy.setUa(this.uaString);
        deviceNodeCopy.setExt(vungleExt);
        return deviceNodeCopy;
    }

    public final VungleApi getGzipApi$vungle_ads_release() {
        return this.gzipApi;
    }

    public final Boolean getPlayServicesAvailabilityFromAPI() {
        Boolean boolValueOf = null;
        try {
            GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.getInstance();
            t.e(googleApiAvailabilityLight, "getInstance()");
            boolValueOf = Boolean.valueOf(googleApiAvailabilityLight.isGooglePlayServicesAvailable(this.applicationContext) == 0);
            addPlaySvcAvailabilityInCookie(boolValueOf.booleanValue());
            return boolValueOf;
        } catch (Exception unused) {
            Logger.Companion.w(TAG, "Unexpected exception from Play services lib.");
            return boolValueOf;
        } catch (NoClassDefFoundError unused2) {
            Logger.Companion.w(TAG, "Play services Not available");
            Boolean bool = Boolean.FALSE;
            try {
                addPlaySvcAvailabilityInCookie(false);
                return bool;
            } catch (Exception unused3) {
                Logger.Companion.w(TAG, "Failure to write GPS availability to DB");
                return bool;
            }
        }
    }

    public final Boolean getPlayServicesAvailabilityFromCookie() {
        return this.filePreferences.getBoolean(Cookie.IS_PLAY_SERVICE_AVAILABLE);
    }

    public final v getResponseInterceptor$vungle_ads_release() {
        return this.responseInterceptor;
    }

    public final Map<String, Long> getRetryAfterDataMap$vungle_ads_release() {
        return this.retryAfterDataMap;
    }

    public final long getRetryAfterHeaderValue(String placementID) {
        t.f(placementID, "placementID");
        Long l10 = this.retryAfterDataMap.get(placementID);
        if (l10 != null) {
            return l10.longValue();
        }
        return 0L;
    }

    public final synchronized void initialize(String appId) {
        PackageInfo packageInfo;
        t.f(appId, "appId");
        VungleHeader.INSTANCE.setAppId(appId);
        String str = "1.0";
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                packageInfo = this.applicationContext.getPackageManager().getPackageInfo(this.applicationContext.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
                t.e(packageInfo, "{\n                    ap…      )\n                }");
            } else {
                packageInfo = this.applicationContext.getPackageManager().getPackageInfo(this.applicationContext.getPackageName(), 0);
                t.e(packageInfo, "{\n                    ap…      )\n                }");
            }
            String str2 = packageInfo.versionName;
            t.e(str2, "packageInfo.versionName");
            str = str2;
        } catch (Exception unused) {
        }
        VungleHeader.INSTANCE.setAppVersion(str);
        this.baseDeviceInfo = getBasicDeviceBody(this.applicationContext);
        String packageName = this.applicationContext.getPackageName();
        t.e(packageName, "applicationContext.packageName");
        this.appBody = new AppNode(packageName, str, appId);
        this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromAPI();
    }

    public final Boolean isGooglePlayServicesAvailable() {
        if (this.isGooglePlayServicesAvailable == null) {
            this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromCookie();
        }
        if (this.isGooglePlayServicesAvailable == null) {
            this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromAPI();
        }
        return this.isGooglePlayServicesAvailable;
    }

    public final ErrorInfo pingTPAT(String url, Map<String, String> map, String str, HttpMethod requestType, LogEntry logEntry) {
        b0 b0VarRaw;
        t.f(url, "url");
        t.f(requestType, "requestType");
        if (!FileUtility.INSTANCE.isValidUrl(url)) {
            return new ErrorInfo("Invalid URL", true, false, 4, null);
        }
        try {
            if (!NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(new URL(url).getHost()) && URLUtil.isHttpUrl(url)) {
                return new ErrorInfo("Clear Text Traffic is blocked", false, false, 6, null);
            }
            try {
                String str2 = this.uaString;
                if (str2 == null) {
                    str2 = "";
                }
                Response<Void> responseExecute = this.api.pingTPAT(str2, url, requestType, map, str != null ? a0.Companion.c(str, w.f22559e.b("application/json")) : null).execute();
                if (responseExecute != null && responseExecute.isSuccessful()) {
                    return null;
                }
                Integer numValueOf = (responseExecute == null || (b0VarRaw = responseExecute.raw()) == null) ? null : Integer.valueOf(b0VarRaw.h());
                if (kotlin.collections.b0.G(kotlin.collections.t.n(Integer.valueOf(Sdk.SDKError.Reason.MRAID_ERROR_VALUE), Integer.valueOf(Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE), 307, 308), numValueOf)) {
                    AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.NOTIFICATION_REDIRECT, 0L, logEntry, url, 2, null);
                    return null;
                }
                boolean z10 = numValueOf != null && new h(500, 599).g(numValueOf.intValue());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("unsuccessful response, error code: ");
                sb2.append(numValueOf);
                sb2.append(", message: ");
                sb2.append(responseExecute != null ? responseExecute.message() : null);
                return new ErrorInfo(sb2.toString(), false, z10, 2, null);
            } catch (Throwable th) {
                String localizedMessage = th.getLocalizedMessage();
                if (localizedMessage == null) {
                    localizedMessage = "IOException";
                }
                return new ErrorInfo(localizedMessage, false, true, 2, null);
            }
        } catch (MalformedURLException e10) {
            String localizedMessage2 = e10.getLocalizedMessage();
            if (localizedMessage2 == null) {
                localizedMessage2 = "MalformedURLException";
            }
            return new ErrorInfo(localizedMessage2, true, false, 4, null);
        }
    }

    public final void reportErrors(BlockingQueue<Sdk.SDKError.Builder> errors, final AnalyticsClient.RequestListener requestListener) {
        t.f(errors, "errors");
        t.f(requestListener, "requestListener");
        String errorLoggingEndpoint = ConfigManager.INSTANCE.getErrorLoggingEndpoint();
        if (errorLoggingEndpoint.length() == 0) {
            requestListener.onFailure();
            return;
        }
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        for (Sdk.SDKError.Builder builder : errors) {
            builder.setSessionId(getSignalManager().getUuid());
            Placement placement = ConfigManager.INSTANCE.getPlacement(builder.getPlacementReferenceId());
            if (placement != null) {
                String type = placement.getType();
                if (type == null) {
                    type = "";
                }
                builder.setPlacementType(type);
            }
            String connectionType = getConnectionType();
            if (connectionType != null) {
                builder.setConnectionType(connectionType);
            }
            String connectionTypeDetail$vungle_ads_release = getConnectionTypeDetail$vungle_ads_release();
            if (connectionTypeDetail$vungle_ads_release != null) {
                builder.setConnectionTypeDetail(connectionTypeDetail$vungle_ads_release);
            }
            Sdk.SDKError sDKErrorBuild = builder.build();
            Logger.Companion.e(TAG, "Sending Error: " + sDKErrorBuild.getReason());
            linkedBlockingQueue.add(sDKErrorBuild);
        }
        Sdk.SDKErrorBatch sDKErrorBatchBuild = Sdk.SDKErrorBatch.newBuilder().addAllErrors(linkedBlockingQueue).build();
        a0.a aVar = a0.Companion;
        byte[] byteArray = sDKErrorBatchBuild.toByteArray();
        t.e(byteArray, "batch.toByteArray()");
        this.api.sendErrors(VungleHeader.INSTANCE.getHeaderUa(), errorLoggingEndpoint, aVar.m(byteArray, w.f22559e.b("application/x-protobuf"), 0, sDKErrorBatchBuild.toByteArray().length)).enqueue(new Callback<Void>() { // from class: com.vungle.ads.internal.network.VungleApiClient.reportErrors.2
            @Override // com.vungle.ads.internal.network.Callback
            public void onFailure(Call<Void> call, Throwable th) {
                requestListener.onFailure();
            }

            @Override // com.vungle.ads.internal.network.Callback
            public void onResponse(Call<Void> call, Response<Void> response) {
                requestListener.onSuccess();
            }
        });
    }

    public final void reportMetrics(BlockingQueue<Sdk.SDKMetric.Builder> metrics, final AnalyticsClient.RequestListener requestListener) {
        t.f(metrics, "metrics");
        t.f(requestListener, "requestListener");
        String metricsEndpoint = ConfigManager.INSTANCE.getMetricsEndpoint();
        if (metricsEndpoint.length() == 0) {
            requestListener.onFailure();
            return;
        }
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        for (Sdk.SDKMetric.Builder builder : metrics) {
            builder.setSessionId(getSignalManager().getUuid());
            Placement placement = ConfigManager.INSTANCE.getPlacement(builder.getPlacementReferenceId());
            if (placement != null) {
                String type = placement.getType();
                if (type == null) {
                    type = "";
                }
                builder.setPlacementType(type);
            }
            String connectionType = getConnectionType();
            if (connectionType != null) {
                builder.setConnectionType(connectionType);
            }
            String connectionTypeDetail$vungle_ads_release = getConnectionTypeDetail$vungle_ads_release();
            if (connectionTypeDetail$vungle_ads_release != null) {
                builder.setConnectionTypeDetail(connectionTypeDetail$vungle_ads_release);
            }
            Sdk.SDKMetric sDKMetricBuild = builder.build();
            Logger.Companion.e(TAG, "Sending Metric: " + sDKMetricBuild.getType());
            linkedBlockingQueue.add(sDKMetricBuild);
        }
        Sdk.MetricBatch metricBatchBuild = Sdk.MetricBatch.newBuilder().addAllMetrics(linkedBlockingQueue).build();
        a0.a aVar = a0.Companion;
        w wVarB = w.f22559e.b("application/x-protobuf");
        byte[] byteArray = metricBatchBuild.toByteArray();
        t.e(byteArray, "batch.toByteArray()");
        this.api.sendMetrics(VungleHeader.INSTANCE.getHeaderUa(), metricsEndpoint, a0.a.n(aVar, wVarB, byteArray, 0, 0, 12, null)).enqueue(new Callback<Void>() { // from class: com.vungle.ads.internal.network.VungleApiClient.reportMetrics.2
            @Override // com.vungle.ads.internal.network.Callback
            public void onFailure(Call<Void> call, Throwable th) {
                requestListener.onFailure();
            }

            @Override // com.vungle.ads.internal.network.Callback
            public void onResponse(Call<Void> call, Response<Void> response) {
                requestListener.onSuccess();
            }
        });
    }

    public final Call<AdPayload> requestAd(String placement, VungleAdSize vungleAdSize) throws IllegalStateException {
        t.f(placement, "placement");
        ConfigManager configManager = ConfigManager.INSTANCE;
        String adsEndpoint = configManager.getAdsEndpoint();
        CommonRequestBody commonRequestBodyRequestBody = requestBody(!configManager.signalsDisabled(), configManager.fpdEnabled());
        CommonRequestBody.RequestParam requestParam = new CommonRequestBody.RequestParam(s.e(placement), (CommonRequestBody.AdSizeParam) null, (Long) null, (String) null, (String) null, (String) null, (CommonRequestBody.CSBParam) null, 126, (kotlin.jvm.internal.k) null);
        if (vungleAdSize != null) {
            requestParam.setAdSize(new CommonRequestBody.AdSizeParam(vungleAdSize.getWidth(), vungleAdSize.getHeight()));
        }
        commonRequestBodyRequestBody.setRequest(requestParam);
        return this.gzipApi.ads(VungleHeader.INSTANCE.getHeaderUa(), adsEndpoint, commonRequestBodyRequestBody);
    }

    public final CommonRequestBody requestBody(boolean z10, boolean z11) throws IllegalStateException {
        CommonRequestBody commonRequestBody = new CommonRequestBody(getDeviceBody(), this.appBody, getUserBody(z11), (CommonRequestBody.RequestExt) null, (CommonRequestBody.RequestParam) null, 24, (kotlin.jvm.internal.k) null);
        CommonRequestBody.RequestExt extBody = getExtBody(z10);
        if (extBody != null) {
            commonRequestBody.setExt(extBody);
        }
        return commonRequestBody;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0064  */
    public final Call<AdPayload> requestCSBAd(String placement, VungleAdSize vungleAdSize, VungleCSBData vungleCSBData) throws IllegalStateException {
        CommonRequestBody.CSBParam cSBParam;
        d0 d0VarA;
        t.f(placement, "placement");
        ConfigManager configManager = ConfigManager.INSTANCE;
        String cSBEndpoint = configManager.getCSBEndpoint();
        CommonRequestBody commonRequestBodyRequestBody = requestBody(!configManager.signalsDisabled(), configManager.fpdEnabled());
        if (vungleCSBData != null) {
            Map<String, String> extras = vungleCSBData.getExtras();
            if (extras == null) {
                d0VarA = null;
            } else {
                if (!(!extras.isEmpty())) {
                    extras = null;
                }
                if (extras != null) {
                    e0 e0Var = new e0();
                    for (Map.Entry<String, String> entry : extras.entrySet()) {
                        e0Var.b(entry.getKey(), kotlinx.serialization.json.k.c(entry.getValue()));
                    }
                    d0VarA = e0Var.a();
                } else {
                    d0VarA = null;
                }
            }
            cSBParam = new CommonRequestBody.CSBParam(vungleCSBData.getBidFloor(), vungleCSBData.getPhase(), vungleCSBData.isVXWinner(), vungleCSBData.getAuctionId(), vungleCSBData.getCreativeId(), vungleCSBData.getAdUnitId(), d0VarA != null ? d0VarA.toString() : null);
        } else {
            cSBParam = null;
        }
        CommonRequestBody.RequestParam requestParam = new CommonRequestBody.RequestParam(s.e(placement), (CommonRequestBody.AdSizeParam) null, (Long) null, (String) null, (String) null, (String) null, cSBParam, 62, (kotlin.jvm.internal.k) null);
        if (vungleAdSize != null) {
            requestParam.setAdSize(new CommonRequestBody.AdSizeParam(vungleAdSize.getWidth(), vungleAdSize.getHeight()));
        }
        commonRequestBodyRequestBody.setRequest(requestParam);
        return this.gzipApi.ads(VungleHeader.INSTANCE.getHeaderUa(), cSBEndpoint, commonRequestBodyRequestBody);
    }

    public final Call<Void> ri(CommonRequestBody.RequestParam request) {
        AppNode appNode;
        t.f(request, "request");
        String riEndpoint = ConfigManager.INSTANCE.getRiEndpoint();
        if ((riEndpoint == null || riEndpoint.length() == 0) || (appNode = this.appBody) == null) {
            return null;
        }
        CommonRequestBody commonRequestBody = new CommonRequestBody(getDeviceBody(), appNode, getUserBody$default(this, false, 1, null), (CommonRequestBody.RequestExt) null, (CommonRequestBody.RequestParam) null, 24, (kotlin.jvm.internal.k) null);
        commonRequestBody.setRequest(request);
        CommonRequestBody.RequestExt extBody$default = getExtBody$default(this, false, 1, null);
        if (extBody$default != null) {
            commonRequestBody.setExt(extBody$default);
        }
        return this.api.ri(VungleHeader.INSTANCE.getHeaderUa(), riEndpoint, commonRequestBody);
    }

    public final void sendAdMarkup(String adMarkup, String endpoint) {
        t.f(adMarkup, "adMarkup");
        t.f(endpoint, "endpoint");
        this.api.sendAdMarkup(endpoint, a0.Companion.c(adMarkup, w.f22559e.b("application/json"))).enqueue(new Callback<Void>() { // from class: com.vungle.ads.internal.network.VungleApiClient.sendAdMarkup.1
            @Override // com.vungle.ads.internal.network.Callback
            public void onFailure(Call<Void> call, Throwable th) {
            }

            @Override // com.vungle.ads.internal.network.Callback
            public void onResponse(Call<Void> call, Response<Void> response) {
            }
        });
    }

    public final void setAppBody$vungle_ads_release(AppNode appNode) {
        this.appBody = appNode;
    }

    public final void setGzipApi$vungle_ads_release(VungleApi vungleApi) {
        t.f(vungleApi, "<set-?>");
        this.gzipApi = vungleApi;
    }

    public final void setResponseInterceptor$vungle_ads_release(v vVar) {
        t.f(vVar, "<set-?>");
        this.responseInterceptor = vVar;
    }

    public final void setRetryAfterDataMap$vungle_ads_release(Map<String, Long> map) {
        t.f(map, "<set-?>");
        this.retryAfterDataMap = map;
    }

    public VungleApiClient(Context applicationContext, Platform platform, FilePreferences filePreferences) {
        t.f(applicationContext, "applicationContext");
        t.f(platform, "platform");
        t.f(filePreferences, WKirgUEJJ.vSeWTvQl);
        this.applicationContext = applicationContext;
        this.platform = platform;
        this.filePreferences = filePreferences;
        this.uaString = System.getProperty("http.agent");
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        this.signalManager$delegate = wc.m.b(o.SYNCHRONIZED, new VungleApiClient$special$$inlined$inject$1(applicationContext));
        this.retryAfterDataMap = new ConcurrentHashMap();
        this.responseInterceptor = new v() { // from class: com.vungle.ads.internal.network.b
            @Override // me.v
            public final b0 intercept(v.a aVar) {
                return VungleApiClient.m269responseInterceptor$lambda0(this.f13080a, aVar);
            }
        };
        x.a aVar = new x.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        x.a aVarK = aVar.L(60L, timeUnit).d(60L, timeUnit).a(this.responseInterceptor).K(new ProxySelector() { // from class: com.vungle.ads.internal.network.VungleApiClient$builder$1
            @Override // java.net.ProxySelector
            public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
                try {
                    ProxySelector.getDefault().connectFailed(uri, socketAddress, iOException);
                } catch (Exception unused) {
                }
            }

            @Override // java.net.ProxySelector
            public List<Proxy> select(URI uri) {
                try {
                    List<Proxy> listSelect = ProxySelector.getDefault().select(uri);
                    t.e(listSelect, "{\n                      …ri)\n                    }");
                    return listSelect;
                } catch (Exception unused) {
                    return s.e(Proxy.NO_PROXY);
                }
            }
        });
        x xVarB = aVarK.b();
        x xVarB2 = aVarK.a(new GzipRequestInterceptor()).b();
        this.api = new VungleApiImpl(xVarB);
        this.gzipApi = new VungleApiImpl(xVarB2);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0017  */
    private final CommonRequestBody.RequestExt getExtBody(boolean z10) {
        boolean z11;
        String strGenerateSignals;
        String configExtension = ConfigManager.INSTANCE.getConfigExtension();
        boolean z12 = true;
        if (configExtension == null) {
            z11 = false;
        } else {
            if (configExtension.length() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        if (z11) {
            configExtension = this.filePreferences.getString(Cookie.CONFIG_EXTENSION);
        }
        if (z10) {
            try {
                strGenerateSignals = getSignalManager().generateSignals();
            } catch (Exception e10) {
                Logger.Companion.e(TAG, UomBEukHFwrS.oMJlFSfBjBIvQu + e10.getMessage());
                strGenerateSignals = null;
            }
        } else {
            strGenerateSignals = null;
        }
        if (configExtension == null || configExtension.length() == 0) {
            if (strGenerateSignals != null && strGenerateSignals.length() != 0) {
                z12 = false;
            }
            if (z12) {
                return null;
            }
        }
        return new CommonRequestBody.RequestExt(configExtension, strGenerateSignals, Long.valueOf(ConfigManager.INSTANCE.configLastValidatedTimestamp()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: responseInterceptor$lambda-0, reason: not valid java name */
    public static final b0 m269responseInterceptor$lambda0(VungleApiClient this$0, v.a chain) {
        t.f(this$0, "this$0");
        t.f(chain, "chain");
        z zVarRequest = chain.request();
        try {
            try {
                b0 b0VarA = chain.a(zVarRequest);
                String strA = b0VarA.s().a("Retry-After");
                boolean z10 = true;
                if (strA == null || strA.length() == 0) {
                    return b0VarA;
                }
                try {
                    long j10 = Long.parseLong(strA);
                    if (j10 <= 0) {
                        return b0VarA;
                    }
                    String strD = zVarRequest.j().d();
                    long jCurrentTimeMillis = (j10 * ((long) 1000)) + System.currentTimeMillis();
                    if (!rd.c0.A(strD, "ads", false, 2, null)) {
                        return b0VarA;
                    }
                    String placementID = this$0.getPlacementID(zVarRequest.a());
                    if (placementID.length() <= 0) {
                        z10 = false;
                    }
                    if (!z10) {
                        return b0VarA;
                    }
                    this$0.retryAfterDataMap.put(placementID, Long.valueOf(jCurrentTimeMillis));
                    return b0VarA;
                } catch (Exception unused) {
                    Logger.Companion.d(TAG, "Retry-After value is not an valid value");
                    return b0VarA;
                }
            } catch (OutOfMemoryError unused2) {
                Logger.Companion.e(TAG, "OOM for " + zVarRequest.j());
                return this$0.safeErrorResponse(zVarRequest);
            }
        } catch (Exception e10) {
            Logger.Companion.e(TAG, XDucgbzInpQa.wCyb + e10.getMessage() + " for " + zVarRequest.j());
            return this$0.defaultErrorResponse(zVarRequest);
        }
    }
}
