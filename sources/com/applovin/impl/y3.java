package com.applovin.impl;

import android.content.Context;
import android.text.TextUtils;
import b2.Bo.yeILL;
import c2.YDwL.tFQWuE;
import com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.ads.AdSize;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.internal.persistence.mP.RHIpdOnfgiYkEj;
import io.bidmachine.BidMachine;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;
import rd.PSo.cNMUz;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final TreeMap f9135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f9136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List f9137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static JSONArray f9138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map f9139e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f9140f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Map f9141g = Collections.synchronizedMap(new HashMap(1));

    public static List a(com.applovin.impl.sdk.l lVar) {
        HashSet hashSet;
        ArrayList arrayList = new ArrayList(lVar.c(t3.f8816x7));
        if (!((Boolean) lVar.a(t3.f8818y7)).booleanValue()) {
            return arrayList;
        }
        synchronized (f9140f) {
            hashSet = new HashSet(f9139e.keySet());
        }
        arrayList.retainAll(hashSet);
        return arrayList;
    }

    public static JSONArray b(com.applovin.impl.sdk.l lVar) {
        synchronized (f9140f) {
            if (f9138d != null) {
                d(lVar);
                return f9138d;
            }
            f9138d = new JSONArray();
            for (String str : f9137c) {
                MaxAdapter maxAdapterA = a(str, lVar);
                if (maxAdapterA != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("name", f9135a.get(str));
                        jSONObject.put("class", str);
                        jSONObject.put("sdk_version", a(maxAdapterA));
                        jSONObject.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, maxAdapterA.getAdapterVersion());
                        jSONObject.put("is_supported", a(maxAdapterA, str));
                    } catch (Throwable unused) {
                    }
                    f9138d.put(jSONObject);
                    f9139e.put(str, new MaxMediatedNetworkInfoImpl(jSONObject));
                }
            }
            return f9138d;
        }
    }

    private static void c(JSONObject jSONObject, String str, com.applovin.impl.sdk.l lVar) {
        synchronized (f9140f) {
            if (StringUtils.isValidString(JsonUtils.getString(jSONObject, "sdk_version", ""))) {
                return;
            }
            MaxAdapter maxAdapterA = a(str, lVar);
            if (maxAdapterA == null) {
                return;
            }
            String strA = a(maxAdapterA);
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            JsonUtils.putString(jSONObject, "sdk_version", strA);
            f9139e.put(str, new MaxMediatedNetworkInfoImpl(jSONObject));
        }
    }

    private static void d(com.applovin.impl.sdk.l lVar) {
        synchronized (f9140f) {
            for (int i10 = 0; i10 < f9138d.length(); i10++) {
                JSONObject jSONObject = JsonUtils.getJSONObject(f9138d, i10, (JSONObject) null);
                String string = JsonUtils.getString(jSONObject, "class", "");
                b(jSONObject, string, lVar);
                c(jSONObject, string, lVar);
            }
        }
    }

    public static void e(com.applovin.impl.sdk.l lVar) {
        JSONArray jSONArrayB = b(lVar);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayB.length(); i10++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArrayB, i10, (JSONObject) null);
            if (!JsonUtils.getBoolean(jSONObject, "is_supported", Boolean.TRUE).booleanValue()) {
                arrayList.add(JsonUtils.getString(jSONObject, "name", "unknown") + " (" + JsonUtils.getString(jSONObject, ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, "unknown") + ")");
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        String strJoin = StringUtils.join(", ", arrayList);
        String str = "Please update to the latest adapter versions. Incompatible adapter(s) found: " + strJoin;
        if (q7.c(lVar)) {
            throw new IllegalArgumentException(str);
        }
        com.applovin.impl.sdk.p.h("MediationUtils", str);
        HashMap map = new HashMap();
        CollectionUtils.putStringIfValid("details", strJoin, map);
        lVar.E().d(f2.f6472b1, map);
    }

    static {
        TreeMap treeMap = new TreeMap();
        f9135a = treeMap;
        treeMap.put("com.applovin.mediation.adapters.AdjoeAdsMediationAdapter", "adjoe Ads");
        treeMap.put("com.applovin.mediation.adapters.AmazonAdMarketplaceMediationAdapter", "Amazon Publisher Services");
        treeMap.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", "AppLovin");
        treeMap.put("com.applovin.mediation.adapters.BidMachineMediationAdapter", BidMachine.NAME);
        treeMap.put("com.applovin.mediation.adapters.BigoAdsMediationAdapter", "Bigo Ads");
        treeMap.put("com.applovin.mediation.adapters.ByteDanceMediationAdapter", "Pangle");
        treeMap.put("com.applovin.mediation.adapters.ChartboostMediationAdapter", "Chartboost");
        treeMap.put("com.applovin.mediation.adapters.CSJMediationAdapter", "CSJ");
        treeMap.put("com.applovin.mediation.adapters.DataseatMediationAdapter", "Dataseat");
        treeMap.put("com.applovin.mediation.adapters.FacebookMediationAdapter", "Facebook");
        treeMap.put("com.applovin.mediation.adapters.GoogleMediationAdapter", "AdMob");
        treeMap.put("com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter", cNMUz.EVOJMTfzZwkV);
        treeMap.put("com.applovin.mediation.adapters.HyprMXMediationAdapter", "HyprMX");
        treeMap.put("com.applovin.mediation.adapters.InMobiMediationAdapter", "InMobi");
        treeMap.put("com.applovin.mediation.adapters.InneractiveMediationAdapter", "Fyber");
        treeMap.put("com.applovin.mediation.adapters.IronSourceMediationAdapter", "ironSource");
        treeMap.put("com.applovin.mediation.adapters.LineMediationAdapter", RHIpdOnfgiYkEj.WBEyi);
        treeMap.put("com.applovin.mediation.adapters.MaioMediationAdapter", "Maio");
        treeMap.put("com.applovin.mediation.adapters.MintegralMediationAdapter", "Mintegral");
        treeMap.put("com.applovin.mediation.adapters.MobileFuseMediationAdapter", "MobileFuse");
        treeMap.put("com.applovin.mediation.adapters.MolocoMediationAdapter", "Moloco");
        treeMap.put("com.applovin.mediation.adapters.MyTargetMediationAdapter", "myTarget");
        treeMap.put("com.applovin.mediation.adapters.OguryMediationAdapter", "Ogury");
        treeMap.put("com.applovin.mediation.adapters.OguryPresageMediationAdapter", "Ogury Presage");
        treeMap.put("com.applovin.mediation.adapters.PangleMediationAdapter", "Pangle");
        treeMap.put("com.applovin.mediation.adapters.PubMaticMediationAdapter", "PubMatic");
        treeMap.put("com.applovin.mediation.adapters.SayGamesMediationAdapter", "SayGames");
        treeMap.put("com.applovin.mediation.adapters.SmaatoMediationAdapter", "Smaato");
        treeMap.put("com.applovin.mediation.adapters.TencentMediationAdapter", "Tencent");
        treeMap.put("com.applovin.mediation.adapters.UnityAdsMediationAdapter", "Unity Ads");
        treeMap.put("com.applovin.mediation.adapters.VerveMediationAdapter", "Verve");
        treeMap.put("com.applovin.mediation.adapters.VungleMediationAdapter", BuildConfig.OMSDK_PARTNER_NAME);
        treeMap.put("com.applovin.mediation.adapters.YandexMediationAdapter", "Yandex");
        treeMap.put("com.applovin.mediation.adapters.AdColonyMediationAdapter", "AdColony");
        treeMap.put("com.applovin.mediation.adapters.AmazonMediationAdapter", "Amazon");
        treeMap.put("com.applovin.mediation.adapters.AmazonPublisherServicesMediationAdapter", "Amazon Publisher Services");
        treeMap.put("com.applovin.mediation.adapters.CriteoMediationAdapter", "Criteo");
        treeMap.put("com.applovin.mediation.adapters.NendMediationAdapter", "Nend");
        treeMap.put("com.applovin.mediation.adapters.SnapMediationAdapter", "Snap");
        treeMap.put("com.applovin.mediation.adapters.TapjoyMediationAdapter", "Tapjoy");
        treeMap.put("com.applovin.mediation.adapters.VerizonAdsMediationAdapter", "Verizon");
        treeMap.put("com.applovin.mediation.adapters.YahooMediationAdapter", "Yahoo");
        treeMap.put("com.applovin.mediation.ALYsoNetworkMediationAdapter", "YSO Network");
        treeMap.put("com.applovin.mediation.adapters.YsoNetworkMediationAdapter", "YSO Network");
        f9137c = new ArrayList(treeMap.keySet());
        HashMap map = new HashMap();
        f9136b = map;
        map.put("com.applovin.mediation.adapters.BidMachineMediationAdapter", "3.0.1.1");
        map.put("com.applovin.mediation.adapters.ByteDanceMediationAdapter", "6.5.0.8.1");
        map.put("com.applovin.mediation.adapters.ChartboostMediationAdapter", "9.7.0.3");
        map.put("com.applovin.mediation.adapters.FacebookMediationAdapter", "6.17.0.1");
        map.put("com.applovin.mediation.adapters.GoogleMediationAdapter", "23.3.0.1");
        map.put("com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter", "23.3.0.1");
        map.put("com.applovin.mediation.adapters.HyprMXMediationAdapter", "6.4.2.1");
        map.put("com.applovin.mediation.adapters.InMobiMediationAdapter", "10.7.7.1");
        map.put("com.applovin.mediation.adapters.InneractiveMediationAdapter", "8.3.6.1");
        map.put("com.applovin.mediation.adapters.IronSourceMediationAdapter", "8.3.0.0.2");
        map.put("com.applovin.mediation.adapters.LineMediationAdapter", "2024.8.27.1");
        map.put("com.applovin.mediation.adapters.MintegralMediationAdapter", "16.8.51.1");
        map.put("com.applovin.mediation.adapters.MobileFuseMediationAdapter", "1.7.6.1");
        map.put("com.applovin.mediation.adapters.MolocoMediationAdapter", "3.1.0.1");
        map.put("com.applovin.mediation.adapters.MyTargetMediationAdapter", "5.22.1.1");
        map.put("com.applovin.mediation.adapters.PubMaticMediationAdapter", tFQWuE.LGwEEgB);
        map.put("com.applovin.mediation.adapters.SmaatoMediationAdapter", "22.7.0.1");
        map.put("com.applovin.mediation.adapters.UnityAdsMediationAdapter", "4.12.2.1");
        map.put("com.applovin.mediation.adapters.VerveMediationAdapter", "3.0.4.1");
        map.put("com.applovin.mediation.adapters.VungleMediationAdapter", "7.4.1.1");
        map.put("com.applovin.mediation.adapters.YandexMediationAdapter", "7.4.0.1");
    }

    public static String a(MaxAdapter maxAdapter) {
        try {
            return StringUtils.emptyIfNull(maxAdapter.getSdkVersion());
        } catch (Throwable th) {
            com.applovin.impl.sdk.p.c("MediationUtils", "Failed to retrieve SDK version for adapter: " + maxAdapter, th);
            return "";
        }
    }

    public static MaxMediatedNetworkInfo a(String str) {
        MaxMediatedNetworkInfo maxMediatedNetworkInfo;
        synchronized (f9140f) {
            maxMediatedNetworkInfo = (MaxMediatedNetworkInfo) f9139e.get(str);
        }
        if (maxMediatedNetworkInfo != null) {
            return maxMediatedNetworkInfo;
        }
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "class", str);
        return new MaxMediatedNetworkInfoImpl(jSONObject);
    }

    public static Map c(com.applovin.impl.sdk.l lVar) {
        HashMap map = new HashMap(4);
        String strEmptyIfNull = StringUtils.emptyIfNull(lVar.y0().e());
        if (!((Boolean) lVar.a(z4.N3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        map.put("{PLACEMENT}", "");
        map.put("{CUSTOM_DATA}", "");
        map.put("{CREATIVE_ID}", "");
        return map;
    }

    public static boolean a(MaxAdapter maxAdapter, String str) {
        String str2 = (String) f9136b.get(str);
        return TextUtils.isEmpty(str2) || q7.a(maxAdapter.getAdapterVersion(), str2) >= 0;
    }

    private static void b(JSONObject jSONObject, String str, com.applovin.impl.sdk.l lVar) {
        synchronized (f9140f) {
            Integer numA = lVar.U().a(str);
            if (numA == null) {
                return;
            }
            JsonUtils.putInt(jSONObject, "initialization_status", numA.intValue());
            f9139e.put(str, new MaxMediatedNetworkInfoImpl(jSONObject));
        }
    }

    public static MaxAdapter a(String str, com.applovin.impl.sdk.l lVar) {
        if (TextUtils.isEmpty(str)) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().b("AppLovinSdk", "Failed to create adapter instance. No class name provided");
            }
            return null;
        }
        try {
            Class<?> cls = Class.forName(str);
            if (MaxAdapter.class.isAssignableFrom(cls)) {
                return (MaxAdapter) cls.getConstructor(AppLovinSdk.class).newInstance(lVar.A0());
            }
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().b("AppLovinSdk", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
            }
            return null;
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().a("AppLovinSdk", "Failed to load: " + str, th);
            }
        }
    }

    public static boolean b(Object obj) {
        return (obj instanceof a3) && "APPLOVIN".equals(((a3) obj).k());
    }

    public static AppLovinSdkUtils.Size b(int i10, MaxAdFormat maxAdFormat, Context context) {
        try {
            int i11 = AdSize.FULL_WIDTH;
            Method method = AdSize.class.getMethod("getCurrentOrientationAnchoredAdaptiveBannerAdSize", Context.class, Integer.TYPE);
            Method method2 = AdSize.class.getMethod("getWidth", null);
            Method method3 = AdSize.class.getMethod("getHeight", null);
            Object objInvoke = method.invoke(null, context, Integer.valueOf(i10));
            AppLovinSdkUtils.Size size = new AppLovinSdkUtils.Size(((Integer) method2.invoke(objInvoke, null)).intValue(), ((Integer) method3.invoke(objInvoke, null)).intValue());
            f9141g.put(Integer.valueOf(i10), size);
            return size;
        } catch (Throwable unused) {
            return maxAdFormat.getSize();
        }
    }

    public static boolean a(Object obj) {
        return (obj instanceof com.applovin.impl.sdk.ad.b) && StringUtils.isValidString(((com.applovin.impl.sdk.ad.b) obj).getMediationServeId());
    }

    public static AppLovinSdkUtils.Size a(int i10, MaxAdFormat maxAdFormat, Context context) {
        if (i10 < 0) {
            i10 = AppLovinSdkUtils.pxToDp(context, p0.a(context).x);
        }
        Map map = f9141g;
        if (map.containsKey(Integer.valueOf(i10))) {
            return (AppLovinSdkUtils.Size) map.get(Integer.valueOf(i10));
        }
        if (Boolean.TRUE.equals((Boolean) c5.a(b5.J, Boolean.FALSE, context))) {
            return a(i10, context);
        }
        return b(i10, maxAdFormat, context);
    }

    public static AppLovinSdkUtils.Size a(int i10, Context context) {
        int iRound;
        if (i10 >= 600) {
            iRound = Math.round(i10 / 8.088889f);
        } else if (i10 > 450) {
            iRound = Math.round(i10 / 7.8f);
        } else {
            iRound = Math.round(i10 / 6.4f);
        }
        AppLovinSdkUtils.Size size = new AppLovinSdkUtils.Size(i10, Math.max(50, Math.min(iRound, Math.min(90, Math.round(AppLovinSdkUtils.pxToDp(context, p0.b(context).y) * 0.15f)))));
        f9141g.put(Integer.valueOf(i10), size);
        return size;
    }

    public static boolean a(JSONObject jSONObject, String str, com.applovin.impl.sdk.l lVar) {
        if (!JsonUtils.containsJSONObjectContainingInt(jSONObject.optJSONArray(yeILL.BTqHRm), 1035, "code")) {
            return false;
        }
        lVar.E().a(f2.f6472b1, "invalid_or_disabled_ad_unit_id", CollectionUtils.hashMap("ad_unit_id", str), "invalid_or_disabled_ad_unit_id" + str);
        return true;
    }

    public static Map a(a3 a3Var, com.applovin.impl.sdk.l lVar) {
        HashMap map = new HashMap(4);
        String strEmptyIfNull = StringUtils.emptyIfNull(lVar.y0().e());
        if (!((Boolean) lVar.a(z4.N3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        map.put("{PLACEMENT}", StringUtils.emptyIfNull(a3Var.getPlacement()));
        map.put("{CUSTOM_DATA}", StringUtils.emptyIfNull(a3Var.e()));
        map.put("{CREATIVE_ID}", StringUtils.emptyIfNull(a3Var.getCreativeId()));
        return map;
    }
}
