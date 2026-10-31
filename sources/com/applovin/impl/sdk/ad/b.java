package com.applovin.impl.sdk.ad;

import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import com.applovin.impl.h1;
import com.applovin.impl.h4;
import com.applovin.impl.j5;
import com.applovin.impl.o8;
import com.applovin.impl.p0;
import com.applovin.impl.q4;
import com.applovin.impl.q7;
import com.applovin.impl.s4;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.common.util.cS.EFLCCdIRcb;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sc.NfwM.XDucgbzInpQa;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends AppLovinAdImpl implements s4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f8280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f8281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f8282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicReference f8283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Bundle f8284h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f8285i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f8286j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f8287k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f8288l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f8289m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f8290n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private d f8291o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List f8292p;

    /* JADX INFO: renamed from: com.applovin.impl.sdk.ad.b$b, reason: collision with other inner class name */
    /* JADX INFO: loaded from: classes.dex */
    public enum EnumC0118b {
        UNSPECIFIED,
        DISMISS,
        DO_NOT_DISMISS
    }

    /* JADX INFO: loaded from: classes.dex */
    public enum c {
        DEFAULT,
        ACTIVITY_PORTRAIT,
        ACTIVITY_LANDSCAPE
    }

    /* JADX INFO: loaded from: classes.dex */
    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8302b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8303c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f8304d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f8305e;

        private d() {
            this.f8301a = AppLovinSdkUtils.dpToPx(com.applovin.impl.sdk.l.p(), b.this.p());
            this.f8302b = AppLovinSdkUtils.dpToPx(com.applovin.impl.sdk.l.p(), b.this.r());
            this.f8303c = AppLovinSdkUtils.dpToPx(com.applovin.impl.sdk.l.p(), b.this.n());
            this.f8304d = AppLovinSdkUtils.dpToPx(com.applovin.impl.sdk.l.p(), ((Integer) ((AppLovinAdBase) b.this).sdk.a(z4.f9297n1)).intValue());
            this.f8305e = AppLovinSdkUtils.dpToPx(com.applovin.impl.sdk.l.p(), ((Integer) ((AppLovinAdBase) b.this).sdk.a(z4.f9288m1)).intValue());
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public enum e {
        RESIZE_ASPECT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT
    }

    public b(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.l lVar) {
        super(jSONObject, jSONObject2, lVar);
        this.f8280d = Collections.synchronizedMap(new HashMap());
        this.f8281e = new AtomicBoolean();
        this.f8282f = new AtomicBoolean();
        this.f8283g = new AtomicReference();
        this.f8284h = new Bundle();
        this.f8292p = new ArrayList();
    }

    private List G() {
        return getIntegerListFromAdObject("multi_close_style", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List j(j5 j5Var) {
        return q7.a(j5Var.a("custom_tabs_tab_shown_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map l(j5 j5Var) {
        try {
            return JsonUtils.toStringMap(j5Var.a("http_headers_for_postbacks", new JSONObject()));
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    public AtomicBoolean A0() {
        return this.f8281e;
    }

    public boolean B0() {
        return getBooleanFromAdObject("lhs_skip_button", (Boolean) this.sdk.a(z4.f9199c2));
    }

    public boolean C0() {
        return getBooleanFromAdObject("video_clickable", Boolean.FALSE);
    }

    public abstract boolean D0();

    public boolean E() {
        return getBooleanFromAdObject("playback_requires_user_action", Boolean.TRUE);
    }

    public boolean E0() {
        return getBooleanFromAdObject("web_contents_debugging_enabled", Boolean.valueOf(q7.j(com.applovin.impl.sdk.l.p()) || q7.h(com.applovin.impl.sdk.l.p()) || ((Boolean) this.sdk.a(z4.D6)).booleanValue()));
    }

    public List F() {
        List listG = G();
        if (listG == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listG.size());
        Iterator it = listG.iterator();
        while (it.hasNext()) {
            arrayList.add(a(((Integer) it.next()).intValue()));
        }
        return arrayList;
    }

    public void F0() {
        this.f8289m++;
        s0();
    }

    public abstract void G0();

    public List H() {
        return getIntegerListFromAdObject("multi_close_delay_graphic", null);
    }

    public boolean H0() {
        return getBooleanFromAdObject("aarwdc", (Boolean) this.sdk.a(z4.A2));
    }

    public boolean I0() {
        return getBooleanFromAdObject("always_reward_user", (Boolean) this.sdk.a(z4.f9270k1));
    }

    public List J() {
        String stringFromAdObject = getStringFromAdObject("optional_html_resources", null);
        return stringFromAdObject != null ? CollectionUtils.explode(stringFromAdObject) : Collections.emptyList();
    }

    public boolean J0() {
        return getBooleanFromAdObject("should_apply_mute_setting_to_poststitial", Boolean.FALSE);
    }

    public abstract String K();

    public boolean K0() {
        return this.f8282f.get();
    }

    public Map L() {
        HashMap map = new HashMap();
        try {
            j5 j5Var = this.synchronizedAdObject;
            map.putAll(j5Var != null ? (Map) j5Var.a(new o.a() { // from class: com.applovin.impl.sdk.ad.q
                @Override // o.a
                public final Object apply(Object obj) {
                    return b.l((j5) obj);
                }
            }) : JsonUtils.toStringMap(getJsonObjectFromAdObject("http_headers_for_postbacks", new JSONObject())));
        } catch (JSONException e10) {
            this.sdk.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.sdk.Q().a("DirectAd", "Failed to retrieve http headers for postbacks", e10);
            }
        }
        if (getBooleanFromAdObject("use_webview_ua_for_postbacks", Boolean.FALSE)) {
            map.put("User-Agent", o8.a());
        }
        return map;
    }

    public boolean L0() {
        return U0() || S0() || T0();
    }

    public EnumC0118b M() {
        String stringFromAdObject = getStringFromAdObject("poststitial_dismiss_type", null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            if ("dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return EnumC0118b.DISMISS;
            }
            if ("no_dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return EnumC0118b.DO_NOT_DISMISS;
            }
        }
        return EnumC0118b.UNSPECIFIED;
    }

    public boolean M0() {
        return getBooleanFromAdObject("serfaad", (Boolean) this.sdk.a(z4.S0));
    }

    public int N() {
        return getColorFromAdObject("postitial_progress_bar_color", -922746881);
    }

    public boolean N0() {
        return getBooleanFromAdObject("fire_postbacks_from_webview", Boolean.FALSE);
    }

    public long O() {
        return getLongFromAdObject("postitial_progress_bar_total_ms", -1L);
    }

    public boolean O0() {
        return getBooleanFromAdObject("should_forward_close_button_tapped_to_poststitial", Boolean.FALSE);
    }

    public List P() {
        return getStringListFromAdObject("pbpn", this.sdk.c(z4.S6));
    }

    public boolean P0() {
        return getBooleanFromAdObject("fmsstwvoar", Boolean.FALSE);
    }

    public long Q() {
        long longFromAdObject = getLongFromAdObject("report_reward_duration", -1L);
        if (longFromAdObject >= 0) {
            return TimeUnit.SECONDS.toMillis(longFromAdObject);
        }
        return -1L;
    }

    public boolean Q0() {
        return getBooleanFromAdObject("sftbpn", Boolean.FALSE);
    }

    public int R() {
        return getIntFromAdObject("report_reward_percent", -1);
    }

    public boolean R0() {
        return getBooleanFromAdObject("fvcetwv", Boolean.FALSE);
    }

    public List S() {
        String stringFromAdObject = getStringFromAdObject("required_html_resources", null);
        return stringFromAdObject != null ? CollectionUtils.explode(stringFromAdObject) : Collections.emptyList();
    }

    public boolean S0() {
        return getStringListFromAdObject("system_bars_hide_list", this.sdk.c(z4.f9404z2)).contains("navigation");
    }

    public int T() {
        return this.f8288l;
    }

    public boolean T0() {
        return getStringListFromAdObject("system_bars_hide_list", this.sdk.c(z4.f9404z2)).contains("none");
    }

    public int U() {
        return this.f8289m;
    }

    public boolean U0() {
        return getStringListFromAdObject("system_bars_hide_list", this.sdk.c(z4.f9404z2)).contains(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS);
    }

    public List V() {
        String stringFromAdObject = getStringFromAdObject("resource_cache_prefix", null);
        ArrayList arrayList = stringFromAdObject != null ? new ArrayList(CollectionUtils.explode(stringFromAdObject)) : new ArrayList(this.sdk.c(z4.G0));
        if (q7.j(com.applovin.impl.sdk.l.p())) {
            arrayList.add("https://p.applov.in/");
        }
        return arrayList;
    }

    public boolean V0() {
        return getBooleanFromAdObject("avoms", Boolean.FALSE);
    }

    public List W() {
        return getStringListFromAdObject("rea", S());
    }

    public boolean W0() {
        return getBooleanFromAdObject("report_reward_percent_include_close_delay", Boolean.TRUE);
    }

    public com.applovin.impl.adview.e.a X() {
        int intFromAdObject = getIntFromAdObject("skip_style", -1);
        return intFromAdObject == -1 ? q() : a(intFromAdObject);
    }

    public boolean X0() {
        return getBooleanFromAdObject("require_interaction_for_click", Boolean.FALSE);
    }

    public List Y() {
        return getStringListFromAdObject("substrings_for_disabled_click_logic", Collections.emptyList());
    }

    public boolean Y0() {
        return getBooleanFromAdObject("sruifwvc", Boolean.FALSE);
    }

    public c Z() {
        c cVar = c.DEFAULT;
        String upperCase = getStringFromAdObject("ad_target", cVar.toString()).toUpperCase(Locale.ENGLISH);
        if ("ACTIVITY_PORTRAIT".equalsIgnoreCase(upperCase)) {
            return c.ACTIVITY_PORTRAIT;
        }
        return "ACTIVITY_LANDSCAPE".equalsIgnoreCase(upperCase) ? c.ACTIVITY_LANDSCAPE : cVar;
    }

    public boolean Z0() {
        return g() >= 0;
    }

    public String a0() {
        return this.f8290n;
    }

    public boolean a1() {
        return getBooleanFromAdObject("respect_adview_fully_watched", Boolean.FALSE);
    }

    public String b0() {
        return this.f8287k;
    }

    public boolean b1() {
        return getBooleanFromAdObject("sscomt", Boolean.FALSE);
    }

    public List c0() {
        return this.f8292p;
    }

    public boolean c1() {
        return getBooleanFromAdObject("sudbia", (Boolean) this.sdk.a(z4.R6));
    }

    public Uri d0() {
        String stringFromAdObject = getStringFromAdObject("unmute_image", "https://assets.applovin.com/sound_on.png");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public boolean d1() {
        return getBooleanFromAdObject("upiosp", Boolean.FALSE);
    }

    public List e() {
        List listA;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new o.a() { // from class: com.applovin.impl.sdk.ad.u
                @Override // o.a
                public final Object apply(Object obj) {
                    return this.f8332a.a((j5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = q7.a(getJsonObjectFromAdObject("ad_closed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    public abstract Uri e0();

    public long f() {
        return getLongFromAdObject("ad_dismiss_delay_on_app_launch_ms", TimeUnit.SECONDS.toMillis(3L));
    }

    public long f0() {
        return getLongFromAdObject("close_delay", 0L);
    }

    public long g() {
        return getLongFromAdObject("ad_reshow_delay_on_app_launch_ms", -1L);
    }

    public long g0() {
        return TimeUnit.SECONDS.toMillis(getLongFromAdObject("close_delay_max_buffering_time_seconds", 5L));
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.g4
    public abstract h4 getAdEventTracker();

    public String getCachePrefix() {
        return getStringFromAdObject("cache_prefix", null);
    }

    public Bundle getCustomTabsHeaders() {
        Map map;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            map = (Map) j5Var.a(new o.a() { // from class: com.applovin.impl.sdk.ad.t
                @Override // o.a
                public final Object apply(Object obj) {
                    return this.f8331a.c((j5) obj);
                }
            });
        } else {
            try {
                map = JsonUtils.toStringMap(getJsonObjectFromAdObject("custom_tabs_http_headers", new JSONObject()));
            } catch (JSONException e10) {
                this.sdk.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.sdk.Q().a("DirectAd", "Failed to retrieve http headers for Custom Tabs", e10);
                }
                map = new HashMap();
            }
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        if (getBooleanFromAdObject("custom_tabs_should_use_webview_ua", Boolean.FALSE)) {
            bundle.putString("User-Agent", o8.a());
        }
        return bundle;
    }

    public List getCustomTabsNavigationAbortedPostbacks() {
        List listA;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new o.a() { // from class: com.applovin.impl.sdk.ad.k
                @Override // o.a
                public final Object apply(Object obj) {
                    return this.f8324a.d((j5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = q7.a(getJsonObjectFromAdObject("custom_tabs_navigation_aborted_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    public List getCustomTabsNavigationFailedPostbacks() {
        List listA;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new o.a() { // from class: com.applovin.impl.sdk.ad.r
                @Override // o.a
                public final Object apply(Object obj) {
                    return this.f8329a.e((j5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = q7.a(getJsonObjectFromAdObject("custom_tabs_navigation_failed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    public List getCustomTabsNavigationFinishedPostbacks() {
        List listA;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new o.a() { // from class: com.applovin.impl.sdk.ad.i
                @Override // o.a
                public final Object apply(Object obj) {
                    return this.f8323a.f((j5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = q7.a(getJsonObjectFromAdObject("custom_tabs_navigation_finished_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    public List getCustomTabsNavigationStartedPostbacks() {
        List listA;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new o.a() { // from class: com.applovin.impl.sdk.ad.m
                @Override // o.a
                public final Object apply(Object obj) {
                    return this.f8325a.g((j5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = q7.a(getJsonObjectFromAdObject("custom_tabs_navigation_started_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    public h1 getCustomTabsSettings() {
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (h1) j5Var.a(new o.a() { // from class: com.applovin.impl.sdk.ad.j
                @Override // o.a
                public final Object apply(Object obj) {
                    return b.h((j5) obj);
                }
            });
        }
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("custom_tabs_settings", null);
        if (jsonObjectFromAdObject != null) {
            return new h1(jsonObjectFromAdObject);
        }
        return null;
    }

    public List getCustomTabsTabHiddenPostbacks() {
        List listA;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new o.a() { // from class: com.applovin.impl.sdk.ad.e
                @Override // o.a
                public final Object apply(Object obj) {
                    return this.f8316a.i((j5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = q7.a(getJsonObjectFromAdObject("custom_tabs_tab_hidden_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    public List getCustomTabsTabShownPostbacks() {
        List listA;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new o.a() { // from class: com.applovin.impl.sdk.ad.v
                @Override // o.a
                public final Object apply(Object obj) {
                    return this.f8333a.j((j5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = q7.a(getJsonObjectFromAdObject("custom_tabs_tab_shown_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    public List getCustomTabsWarmupUrls() {
        return getStringListFromAdObject("custom_tabs_warmup_urls", Collections.emptyList());
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.g4
    public String getOpenMeasurementContentUrl() {
        return getStringFromAdObject("omid_content_url", null);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.g4
    public String getOpenMeasurementCustomReferenceData() {
        return getStringFromAdObject("omid_custom_ref_data", "");
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.g4
    public List getOpenMeasurementVerificationScriptResources() {
        List list;
        final o.a aVar = new o.a() { // from class: com.applovin.impl.sdk.ad.n
            @Override // o.a
            public final Object apply(Object obj) {
                return this.f8326a.a((JSONArray) obj);
            }
        };
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new o.a() { // from class: com.applovin.impl.sdk.ad.o
                @Override // o.a
                public final Object apply(Object obj) {
                    return b.a(aVar, (j5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            list = (List) aVar.apply(getJsonArrayFromAdObject("omid_verification_script_resources", null));
        }
        return list;
    }

    public long h() {
        return getLongFromAdObject("ardorpgm", ((Long) this.sdk.a(z4.f9195b7)).longValue());
    }

    public int h0() {
        return q7.c(getIntFromAdObject("video_completion_percent", -1));
    }

    public Bundle i() {
        return this.f8284h;
    }

    public List i0() {
        List listA;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new o.a() { // from class: com.applovin.impl.sdk.ad.p
                @Override // o.a
                public final Object apply(Object obj) {
                    return this.f8328a.m((j5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = q7.a(getJsonObjectFromAdObject("video_end_urls", new JSONObject()), getClCode(), j0(), this.sdk);
        }
        return listA;
    }

    public boolean isCustomTabsClientWarmupEnabled() {
        return getBooleanFromAdObject("custom_tabs_client_warmup_enabled", Boolean.FALSE);
    }

    public boolean isCustomTabsEnabled() {
        return getBooleanFromAdObject("custom_tabs_enabled", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.g4
    public abstract boolean isOpenMeasurementEnabled();

    public List k() {
        List listA;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new o.a() { // from class: com.applovin.impl.sdk.ad.s
                @Override // o.a
                public final Object apply(Object obj) {
                    return this.f8330a.b((j5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = q7.a(getJsonObjectFromAdObject("app_killed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    public e k0() {
        String stringFromAdObject = getStringFromAdObject("video_gravity", null);
        if (ViewHierarchyConstants.DIMENSION_TOP_KEY.equals(stringFromAdObject)) {
            return e.TOP;
        }
        if ("bottom".equals(stringFromAdObject)) {
            return e.BOTTOM;
        }
        if (ViewHierarchyConstants.DIMENSION_LEFT_KEY.equals(stringFromAdObject)) {
            return e.LEFT;
        }
        return "right".equals(stringFromAdObject) ? e.RIGHT : e.RESIZE_ASPECT;
    }

    public int l0() {
        return getColorFromAdObject("progress_bar_color", -922746881);
    }

    public Map m() {
        return this.f8280d;
    }

    public boolean m0() {
        return getBooleanFromAdObject("progress_bar_enabled", Boolean.FALSE);
    }

    public int n() {
        return getIntFromAdObject("close_button_horizontal_margin", ((Integer) this.sdk.a(z4.Q1)).intValue());
    }

    public abstract Uri n0();

    public d o() {
        if (this.f8291o == null) {
            this.f8291o = new d();
        }
        return this.f8291o;
    }

    public int o0() {
        int i10;
        if (q7.a(getSize())) {
            i10 = 1;
        } else {
            i10 = ((Boolean) this.sdk.a(z4.f9239g6)).booleanValue() ? 0 : -1;
        }
        return getIntFromAdObject("whalt", i10);
    }

    public com.applovin.impl.adview.l p0() {
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (com.applovin.impl.adview.l) j5Var.a(new o.a() { // from class: com.applovin.impl.sdk.ad.l
                @Override // o.a
                public final Object apply(Object obj) {
                    return b.n((j5) obj);
                }
            });
        }
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("web_view_settings", null);
        if (jsonObjectFromAdObject != null) {
            return new com.applovin.impl.adview.l(jsonObjectFromAdObject);
        }
        return null;
    }

    public List q0() {
        return CollectionUtils.explode(getStringFromAdObject("wlh", null));
    }

    public List r0() {
        return CollectionUtils.explode(getStringFromAdObject("wls", ""));
    }

    public void s0() {
        this.f8288l++;
    }

    public boolean shouldCustomTabsTrackEvents() {
        return getBooleanFromAdObject("custom_tabs_should_track_events", Boolean.FALSE);
    }

    public boolean t0() {
        return this.f8288l > 0;
    }

    public boolean u0() {
        return getBooleanFromAdObject("bvde", (Boolean) this.sdk.a(z4.f9302n6));
    }

    public boolean v0() {
        return getBooleanFromAdObject("lhs_close_button", (Boolean) this.sdk.a(z4.P1));
    }

    public boolean w0() {
        return getBooleanFromAdObject("forward_lifecycle_events_to_webview", Boolean.FALSE);
    }

    public boolean x0() {
        return getBooleanFromAdObject("gase", Boolean.FALSE);
    }

    public boolean y0() {
        return getBooleanFromAdObject("lock_current_orientation", Boolean.FALSE);
    }

    public abstract boolean z0();

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List d(j5 j5Var) {
        return q7.a(j5Var.a("custom_tabs_navigation_aborted_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List f(j5 j5Var) {
        return q7.a(j5Var.a("custom_tabs_navigation_finished_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List g(j5 j5Var) {
        return q7.a(j5Var.a("custom_tabs_navigation_started_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ h1 h(j5 j5Var) {
        JSONObject jSONObjectA = j5Var.a("custom_tabs_settings", (JSONObject) null);
        if (jSONObjectA != null) {
            return new h1(jSONObjectA);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List i(j5 j5Var) {
        return q7.a(j5Var.a("custom_tabs_tab_hidden_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    private String j0() {
        String stringFromAdObject = getStringFromAdObject(XDucgbzInpQa.yzTgPAXNBwlTfi, null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace("{CLCODE}", getClCode());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List m(j5 j5Var) {
        return q7.a(j5Var.a("video_end_urls", new JSONObject()), getClCode(), j0(), this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.impl.adview.l n(j5 j5Var) {
        JSONObject jSONObjectA = j5Var.a("web_view_settings", (JSONObject) null);
        if (jSONObjectA != null) {
            return new com.applovin.impl.adview.l(jSONObjectA);
        }
        return null;
    }

    public long A() {
        return this.f8286j;
    }

    public List B() {
        List listA;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new o.a() { // from class: com.applovin.impl.sdk.ad.f
                @Override // o.a
                public final Object apply(Object obj) {
                    return this.f8317a.k((j5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = q7.a(getJsonObjectFromAdObject("imp_urls", new JSONObject()), getClCode(), null, null, L(), N0(), this.sdk);
        }
        return listA;
    }

    public int C() {
        return getIntFromAdObject("mdafra", ((Integer) this.sdk.a(z4.T0)).intValue());
    }

    public int D() {
        return getIntFromAdObject("mraorpg", ((Integer) this.sdk.a(z4.f9187a7)).intValue());
    }

    public Uri I() {
        String stringFromAdObject = getStringFromAdObject("mute_image", EFLCCdIRcb.qseMrOXoKLTLTz);
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public void b(String str) {
        this.f8290n = str;
    }

    public void c(String str) {
        this.f8287k = str;
    }

    public int p() {
        return getIntFromAdObject("close_button_size", ((Integer) this.sdk.a(z4.R1)).intValue());
    }

    public com.applovin.impl.adview.e.a q() {
        List listG = G();
        int intFromAdObject = getIntFromAdObject("close_style", (listG == null || listG.size() <= 0) ? -1 : ((Integer) listG.get(0)).intValue());
        return intFromAdObject == -1 ? a(hasVideoUrl()) : a(intFromAdObject);
    }

    public int r() {
        return getIntFromAdObject("close_button_top_margin", ((Integer) this.sdk.a(z4.S1)).intValue());
    }

    public long s() {
        List listH = H();
        long longFromAdObject = getLongFromAdObject("close_delay_graphic", (listH == null || listH.size() <= 0) ? 0L : ((Integer) listH.get(0)).intValue());
        if (longFromAdObject == -1 || longFromAdObject == -2) {
            return 0L;
        }
        return longFromAdObject;
    }

    public int t() {
        return getColorFromAdObject("countdown_color", -922746881);
    }

    public int u() {
        return getIntFromAdObject("countdown_length", 0);
    }

    public boolean v() {
        return getBooleanFromAdObject("dismiss_on_skip", Boolean.FALSE);
    }

    public String w() {
        return this.f8285i;
    }

    public int x() {
        return getIntFromAdObject("poststitial_dismiss_forward_delay_millis", -1);
    }

    public int y() {
        return getIntFromAdObject("poststitial_shown_forward_delay_millis", -1);
    }

    public int z() {
        return q7.a(getIntFromAdObject("graphic_completion_percent", -1), 90);
    }

    public void a(String str) {
        this.f8285i = str;
    }

    public void b(boolean z10) {
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            j5Var.a("html_resources_cached", z10);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putBoolean(this.adObject, "html_resources_cached", z10);
        }
    }

    public long c() {
        return getLongFromAdObject("batfort", TimeUnit.SECONDS.toMillis(1L));
    }

    public q4 j() {
        return (q4) this.f8283g.getAndSet(null);
    }

    public String l() {
        String stringFromAdObject = getStringFromAdObject("base_url", "/");
        if ("null".equalsIgnoreCase(stringFromAdObject)) {
            return null;
        }
        return stringFromAdObject;
    }

    private String c(MotionEvent motionEvent, boolean z10) {
        String stringFromAdObject = getStringFromAdObject("click_tracking_url", null);
        Map mapA = a(motionEvent, z10);
        if (stringFromAdObject != null) {
            return StringUtils.replace(stringFromAdObject, mapA);
        }
        return null;
    }

    public void a(long j10) {
        this.f8286j = j10;
    }

    public void d() {
        this.f8282f.set(true);
    }

    public void a(List list) {
        this.f8292p = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            try {
                URL url = new URL(JsonUtils.getString(jSONObject, "url", null));
                String string = JsonUtils.getString(jSONObject, "vendor_key", null);
                String string2 = JsonUtils.getString(jSONObject, "parameters", null);
                if (StringUtils.isValidString(string) && StringUtils.isValidString(string2)) {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(string, url, string2));
                } else {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                }
            } catch (Throwable th) {
                this.sdk.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.sdk.Q().a("DirectAd", "Failed to parse OMID verification script resource", th);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Map c(j5 j5Var) {
        try {
            return JsonUtils.toStringMap(j5Var.a("custom_tabs_http_headers", new JSONObject()));
        } catch (JSONException e10) {
            this.sdk.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.sdk.Q().a("DirectAd", "Failed to retrieve http headers for Custom Tabs", e10);
            }
            return new HashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List e(j5 j5Var) {
        return q7.a(j5Var.a("custom_tabs_navigation_failed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List k(j5 j5Var) {
        return q7.a(j5Var.a("imp_urls", new JSONObject()), getClCode(), null, null, L(), N0(), this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List b(j5 j5Var) {
        return q7.a(j5Var.a("app_killed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    private List b(final MotionEvent motionEvent, final boolean z10) {
        List listA;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new o.a() { // from class: com.applovin.impl.sdk.ad.h
                @Override // o.a
                public final Object apply(Object obj) {
                    return this.f8320a.a(motionEvent, z10, (j5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = q7.a(getJsonObjectFromAdObject("click_tracking_urls", new JSONObject()), a(motionEvent, z10), c(motionEvent, z10), L(), N0(), this.sdk);
        }
        return listA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List a(o.a aVar, j5 j5Var) {
        return (List) aVar.apply(j5Var.a("omid_verification_script_resources", (JSONArray) null));
    }

    public void a(String str, String str2) {
        this.f8280d.put(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List a(j5 j5Var) {
        return q7.a(j5Var.a(XDucgbzInpQa.EmUTUOclncZ, new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    public List b(final MotionEvent motionEvent) {
        List listA;
        List list;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            list = (List) j5Var.a(new o.a() { // from class: com.applovin.impl.sdk.ad.g
                @Override // o.a
                public final Object apply(Object obj) {
                    return this.f8318a.a(motionEvent, (j5) obj);
                }
            });
        } else {
            synchronized (this.adObjectLock) {
                listA = q7.a(getJsonObjectFromAdObject("video_click_tracking_urls", new JSONObject()), a(motionEvent, true), null, L(), N0(), this.sdk);
            }
            list = listA;
        }
        return list.isEmpty() ? b(motionEvent, true) : list;
    }

    public List a(MotionEvent motionEvent) {
        return b(motionEvent, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List a(MotionEvent motionEvent, boolean z10, j5 j5Var) {
        return q7.a(j5Var.a("click_tracking_urls", new JSONObject()), a(motionEvent, z10), c(motionEvent, z10), L(), N0(), this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List a(MotionEvent motionEvent, j5 j5Var) {
        return q7.a(j5Var.a("video_click_tracking_urls", new JSONObject()), a(motionEvent, true), null, L(), N0(), this.sdk);
    }

    private Map a(MotionEvent motionEvent, boolean z10) {
        Point pointB = p0.b(com.applovin.impl.sdk.l.p());
        HashMap map = new HashMap(7);
        map.put("{CLCODE}", getClCode());
        map.put("{CLICK_X}", String.valueOf(motionEvent != null ? motionEvent.getRawX() : -1.0f));
        map.put("{CLICK_Y}", String.valueOf(motionEvent != null ? motionEvent.getRawY() : -1.0f));
        map.put("{SCREEN_WIDTH}", String.valueOf(pointB.x));
        map.put("{SCREEN_HEIGHT}", String.valueOf(pointB.y));
        map.put("{IS_VIDEO_CLICK}", String.valueOf(z10));
        return map;
    }

    public void a(q4 q4Var) {
        this.f8283g.set(q4Var);
    }

    private com.applovin.impl.adview.e.a a(boolean z10) {
        return z10 ? com.applovin.impl.adview.e.a.WHITE_ON_TRANSPARENT : com.applovin.impl.adview.e.a.WHITE_ON_BLACK;
    }

    protected com.applovin.impl.adview.e.a a(int i10) {
        if (i10 == 1) {
            return com.applovin.impl.adview.e.a.WHITE_ON_TRANSPARENT;
        }
        if (i10 == 2) {
            return com.applovin.impl.adview.e.a.INVISIBLE;
        }
        if (i10 == 3) {
            return com.applovin.impl.adview.e.a.TRANSPARENT_SKIP;
        }
        return com.applovin.impl.adview.e.a.WHITE_ON_BLACK;
    }
}
