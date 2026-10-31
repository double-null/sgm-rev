package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.facebook.appevents.AppEventsConstants;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map f8854e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f8855f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f8856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AppLovinAdSize f8858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AppLovinAdType f8859d;

    private u(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str, boolean z10, boolean z11) {
        String lowerCase;
        if (TextUtils.isEmpty(str) && (appLovinAdType == null || appLovinAdSize == null)) {
            throw new IllegalArgumentException("No zone identifier or type or size specified");
        }
        this.f8858c = appLovinAdSize;
        this.f8859d = appLovinAdType;
        if (StringUtils.isValidString(str)) {
            lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
        } else {
            lowerCase = (appLovinAdSize.getLabel() + "_" + appLovinAdType.getLabel()).toLowerCase(Locale.ENGLISH);
        }
        if (z10) {
            lowerCase = lowerCase + "_bidding";
        }
        if (z11) {
            lowerCase = lowerCase + "_direct_sold";
        }
        this.f8857b = lowerCase;
    }

    public static u a(String str) {
        return a(null, null, str);
    }

    public static u b(String str) {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED, str);
    }

    public static u c() {
        return a(AppLovinAdSize.BANNER, AppLovinAdType.REGULAR);
    }

    public static u h() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED);
    }

    public static u j() {
        return a(AppLovinAdSize.LEADER, AppLovinAdType.REGULAR);
    }

    public static u k() {
        return a(AppLovinAdSize.MREC, AppLovinAdType.REGULAR);
    }

    public static u l() {
        return a(AppLovinAdSize.NATIVE, AppLovinAdType.NATIVE);
    }

    public static u m() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.REGULAR);
    }

    public MaxAdFormat d() {
        AppLovinAdSize appLovinAdSizeF = f();
        if (appLovinAdSizeF == AppLovinAdSize.BANNER) {
            return MaxAdFormat.BANNER;
        }
        if (appLovinAdSizeF == AppLovinAdSize.LEADER) {
            return MaxAdFormat.LEADER;
        }
        if (appLovinAdSizeF == AppLovinAdSize.MREC) {
            return MaxAdFormat.MREC;
        }
        if (appLovinAdSizeF != AppLovinAdSize.INTERSTITIAL) {
            if (appLovinAdSizeF == AppLovinAdSize.NATIVE) {
                return MaxAdFormat.NATIVE;
            }
            return null;
        }
        if (g() == AppLovinAdType.REGULAR) {
            return MaxAdFormat.INTERSTITIAL;
        }
        if (g() == AppLovinAdType.APP_OPEN) {
            return MaxAdFormat.APP_OPEN;
        }
        if (g() == AppLovinAdType.INCENTIVIZED) {
            return MaxAdFormat.REWARDED;
        }
        return null;
    }

    public String e() {
        return this.f8857b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        return this.f8857b.equalsIgnoreCase(((u) obj).f8857b);
    }

    public AppLovinAdSize f() {
        if (this.f8858c == null && JsonUtils.valueExists(this.f8856a, "ad_size")) {
            this.f8858c = AppLovinAdSize.fromString(JsonUtils.getString(this.f8856a, "ad_size", null));
        }
        return this.f8858c;
    }

    public AppLovinAdType g() {
        if (this.f8859d == null && JsonUtils.valueExists(this.f8856a, AppEventsConstants.EVENT_PARAM_AD_TYPE)) {
            this.f8859d = AppLovinAdType.fromString(JsonUtils.getString(this.f8856a, AppEventsConstants.EVENT_PARAM_AD_TYPE, null));
        }
        return this.f8859d;
    }

    public int hashCode() {
        return this.f8857b.hashCode();
    }

    public boolean i() {
        return a().contains(this);
    }

    public String toString() {
        return "AdZone{id=" + this.f8857b + ", zoneObject=" + this.f8856a + '}';
    }

    public static u a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType) {
        return a(appLovinAdSize, appLovinAdType, null);
    }

    public static u b() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.APP_OPEN);
    }

    public static u a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str) {
        return a(appLovinAdSize, appLovinAdType, str, false, false);
    }

    public static u a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str, boolean z10, boolean z11) {
        u uVar = new u(appLovinAdSize, appLovinAdType, str, z10, z11);
        synchronized (f8855f) {
            String str2 = uVar.f8857b;
            Map map = f8854e;
            if (map.containsKey(str2)) {
                uVar = (u) map.get(str2);
            } else {
                map.put(str2, uVar);
            }
        }
        return uVar;
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("ad_size") && jSONObject.has(AppEventsConstants.EVENT_PARAM_AD_TYPE)) {
            synchronized (f8855f) {
                u uVar = (u) f8854e.get(JsonUtils.getString(jSONObject, "zone_id", ""));
                if (uVar != null) {
                    uVar.f8858c = AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, "ad_size", ""));
                    uVar.f8859d = AppLovinAdType.fromString(JsonUtils.getString(jSONObject, AppEventsConstants.EVENT_PARAM_AD_TYPE, ""));
                }
            }
        }
    }

    public static Collection a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(7);
        Collections.addAll(linkedHashSet, c(), k(), j(), m(), b(), h(), l());
        return Collections.unmodifiableSet(linkedHashSet);
    }
}
