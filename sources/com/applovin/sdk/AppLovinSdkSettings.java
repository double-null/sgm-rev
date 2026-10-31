package com.applovin.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.f2;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinSdkSettings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f9657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f9658b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f9661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f9662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f9663g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AppLovinTermsAndPrivacyPolicyFlowSettings f9666j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private l f9667k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f9668l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f9660d = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f9664h = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f9665i = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f9659c = true;

    AppLovinSdkSettings(Context context) {
        this.f9668l = "";
        if (context == null) {
            p.h("AppLovinSdkSettings", "context cannot be null. Please provide a valid context.");
        }
        Context contextE = q7.e(context);
        this.f9657a = q7.m(contextE);
        this.f9666j = v0.a(contextE);
        this.f9668l = contextE.getPackageName();
        a(contextE);
    }

    private void a(Context context) {
        int identifier = context.getResources().getIdentifier("applovin_settings", "raw", context.getPackageName());
        if (identifier == 0) {
            return;
        }
        String strA = q7.a(identifier, context, (l) null);
        this.f9664h.putAll(JsonUtils.tryToStringMap(StringUtils.isValidString(strA) ? JsonUtils.jsonObjectFromJsonString(strA, new JSONObject()) : new JSONObject()));
    }

    public void attachAppLovinSdk(l lVar) {
        this.f9667k = lVar;
        if (StringUtils.isValidString(this.f9661e)) {
            lVar.u0().a(Arrays.asList(this.f9661e.split(",")));
            this.f9661e = null;
        }
        if (this.f9662f != null) {
            lVar.Q();
            if (p.a()) {
                lVar.Q().a("AppLovinSdkSettings", "Setting user id: " + this.f9662f);
            }
            lVar.y0().a(this.f9662f);
            this.f9662f = null;
        }
        if (StringUtils.isValidString(this.f9663g)) {
            m.a(this.f9663g, lVar);
            this.f9663g = null;
        }
        for (Map.Entry entry : this.f9665i.entrySet()) {
            lVar.x0().a(f2.f6497k, "preInitExtraParameter", CollectionUtils.hashMap("details", ((String) entry.getKey()) + ":" + ((String) entry.getValue())));
        }
        this.f9665i.clear();
    }

    public Map<String, String> getExtraParameters() {
        Map<String, String> map;
        synchronized (this.f9664h) {
            map = CollectionUtils.map(this.f9664h);
        }
        return map;
    }

    public AppLovinTermsAndPrivacyPolicyFlowSettings getTermsAndPrivacyPolicyFlowSettings() {
        return this.f9666j;
    }

    public String getUserIdentifier() {
        l lVar = this.f9667k;
        return lVar == null ? this.f9662f : lVar.y0().e();
    }

    public boolean isCreativeDebuggerEnabled() {
        return this.f9659c;
    }

    public boolean isMuted() {
        return this.f9658b;
    }

    public boolean isVerboseLoggingEnabled() {
        return this.f9657a;
    }

    public void setCreativeDebuggerEnabled(boolean z10) {
        p.e("AppLovinSdkSettings", "setCreativeDebuggerEnabled(creativeDebuggerEnabled=" + z10 + ")");
        if (this.f9659c == z10) {
            return;
        }
        this.f9659c = z10;
        l lVar = this.f9667k;
        if (lVar == null) {
            return;
        }
        if (z10) {
            lVar.z().l();
        } else {
            lVar.z().k();
        }
    }

    public void setExtraParameter(String str, String str2) {
        p.e("AppLovinSdkSettings", "setExtraParameter(key=" + str + ", value=" + str2 + ")");
        if (TextUtils.isEmpty(str)) {
            p.h("AppLovinSdkSettings", "Failed to set extra parameter for null or empty key: " + str);
            return;
        }
        String strTrim = str2 != null ? str2.trim() : null;
        if ("test_mode_network".equalsIgnoreCase(str)) {
            if (this.f9667k == null) {
                this.f9661e = strTrim;
            } else if (StringUtils.isValidString(strTrim)) {
                this.f9667k.u0().a(Arrays.asList(strTrim.split(",")));
            } else {
                this.f9667k.u0().a((String) null);
            }
        } else if ("fan".equals(str) || "esc".equals(str)) {
            if (!this.f9668l.startsWith("com.unity.")) {
                return;
            }
        } else if ("disable_all_logs".equals(str)) {
            p.a(Boolean.parseBoolean(strTrim));
        } else if ("package_name_override".equals(str)) {
            l lVar = this.f9667k;
            if (lVar != null) {
                m.a(strTrim, lVar);
            } else {
                this.f9663g = strTrim;
            }
        }
        if (this.f9667k != null) {
            this.f9667k.x0().a(f2.f6497k, "postInitExtraParameter", CollectionUtils.hashMap("details", str + ":" + str2));
        } else {
            this.f9665i.put(str, strTrim);
        }
        this.f9664h.put(str, strTrim);
    }

    public void setMuted(boolean z10) {
        p.e("AppLovinSdkSettings", "setMuted(muted=" + z10 + ")");
        this.f9658b = z10;
    }

    public void setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(boolean z10) {
        p.e("AppLovinSdkSettings", "setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(shouldFailAdDisplayIfDontKeepActivitiesIsEnabled=" + z10 + ")");
        this.f9660d = z10;
    }

    public void setUserIdentifier(String str) {
        p.e("AppLovinSdkSettings", "setUserIdentifier(userIdentifier=" + str + ")");
        if (StringUtils.isValidString(str) && str.length() > q7.d(8)) {
            p.h("AppLovinSdk", "Provided user id longer than supported (" + str.length() + " bytes, " + q7.d(8) + " maximum)");
        }
        l lVar = this.f9667k;
        if (lVar == null) {
            this.f9662f = str;
            return;
        }
        lVar.Q();
        if (p.a()) {
            this.f9667k.Q().a("AppLovinSdkSettings", "Setting user id: " + str);
        }
        this.f9667k.y0().a(str);
    }

    public void setVerboseLogging(boolean z10) {
        p.e("AppLovinSdkSettings", "setVerboseLogging(isVerboseLoggingEnabled=" + z10 + ")");
        if (!q7.l()) {
            this.f9657a = z10;
            return;
        }
        p.h("AppLovinSdkSettings", "Ignoring setting of verbose logging - it is configured from Android manifest already.");
        if (q7.m(null) != z10) {
            p.h("AppLovinSdkSettings", "Attempted to programmatically set verbose logging flag to value different from value configured in Android Manifest.");
        }
    }

    public boolean shouldFailAdDisplayIfDontKeepActivitiesIsEnabled() {
        return this.f9660d;
    }

    public String toString() {
        return "AppLovinSdkSettings{isVerboseLoggingEnabled=" + this.f9657a + ", muted=" + this.f9658b + ", creativeDebuggerEnabled=" + this.f9659c + '}';
    }
}
