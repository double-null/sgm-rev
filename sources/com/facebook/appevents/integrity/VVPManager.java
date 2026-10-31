package com.facebook.appevents.integrity;

import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.b0;
import kotlin.collections.u0;
import kotlin.jvm.internal.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: VVPManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class VVPManager {
    private static final String CONTENTS_KEY = "fb_content";
    private static final String ENABLED_KEY = "enabled";
    private static final String EVENT_NAME_SENTINEL = "1";
    private static final String IN_SCOPE_EVENT_NAMES_KEY = "inScopeEventNames";
    private static final String IS_SHADOW_ENABLED_KEY = "isShadowEnabled";
    private static final String KEY_NEGATIVE_REGEX_KEY = "keyNegativeRegex";
    private static final String KEY_REGEX_KEY = "keyRegex";
    public static final int PLACE_CUSTOM_DATA = 1;
    public static final int PLACE_EVENT_NAME = 3;
    private static final String PLACE_KEY = "place";
    private static final String RULES_KEY = "rules";
    private static final String SANITIZED_VALUE = "_removed_";
    private static final String STANDARD_PARAMS_KEY = "standardParams";
    private static final String VALUE_REGEX_KEY = "valueRegex";
    private static final String VP_RP = "vp_rp";
    private static final String VP_RP_EV = "vp_rp_ev";
    private static final String VVP_IS_APPLIED_KEY = "vvp";
    private static final String VVP_IS_APPLIED_VALUE = "1";
    private static final String VVP_METADATA_KEY = "vvp_md";
    private static volatile VVPConfig config;
    private static boolean enabled;
    public static final VVPManager INSTANCE = new VVPManager();
    private static final Set<String> CONTENT_ID_SANITIZE_KEYS = u0.i("fb_content_ids", AppEventsConstants.EVENT_PARAM_CONTENT_ID);

    /* JADX INFO: compiled from: VVPManager.kt */
    public static final class CompiledRule {
        private final Pattern keyNegativeRegex;
        private final Pattern keyRegex;
        private final int place;
        private final Pattern valueRegex;

        public CompiledRule(int i10, Pattern pattern, Pattern pattern2, Pattern pattern3) {
            this.place = i10;
            this.keyRegex = pattern;
            this.keyNegativeRegex = pattern2;
            this.valueRegex = pattern3;
        }

        public static /* synthetic */ CompiledRule copy$default(CompiledRule compiledRule, int i10, Pattern pattern, Pattern pattern2, Pattern pattern3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = compiledRule.place;
            }
            if ((i11 & 2) != 0) {
                pattern = compiledRule.keyRegex;
            }
            if ((i11 & 4) != 0) {
                pattern2 = compiledRule.keyNegativeRegex;
            }
            if ((i11 & 8) != 0) {
                pattern3 = compiledRule.valueRegex;
            }
            return compiledRule.copy(i10, pattern, pattern2, pattern3);
        }

        public final int component1() {
            return this.place;
        }

        public final Pattern component2() {
            return this.keyRegex;
        }

        public final Pattern component3() {
            return this.keyNegativeRegex;
        }

        public final Pattern component4() {
            return this.valueRegex;
        }

        public final CompiledRule copy(int i10, Pattern pattern, Pattern pattern2, Pattern pattern3) {
            return new CompiledRule(i10, pattern, pattern2, pattern3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CompiledRule)) {
                return false;
            }
            CompiledRule compiledRule = (CompiledRule) obj;
            return this.place == compiledRule.place && t.a(this.keyRegex, compiledRule.keyRegex) && t.a(this.keyNegativeRegex, compiledRule.keyNegativeRegex) && t.a(this.valueRegex, compiledRule.valueRegex);
        }

        public final Pattern getKeyNegativeRegex() {
            return this.keyNegativeRegex;
        }

        public final Pattern getKeyRegex() {
            return this.keyRegex;
        }

        public final int getPlace() {
            return this.place;
        }

        public final Pattern getValueRegex() {
            return this.valueRegex;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.place) * 31;
            Pattern pattern = this.keyRegex;
            int iHashCode2 = (iHashCode + (pattern == null ? 0 : pattern.hashCode())) * 31;
            Pattern pattern2 = this.keyNegativeRegex;
            int iHashCode3 = (iHashCode2 + (pattern2 == null ? 0 : pattern2.hashCode())) * 31;
            Pattern pattern3 = this.valueRegex;
            return iHashCode3 + (pattern3 != null ? pattern3.hashCode() : 0);
        }

        public String toString() {
            return "CompiledRule(place=" + this.place + ", keyRegex=" + this.keyRegex + ", keyNegativeRegex=" + this.keyNegativeRegex + ", valueRegex=" + this.valueRegex + ')';
        }
    }

    /* JADX INFO: compiled from: VVPManager.kt */
    public static final class VVPConfig {
        private final Set<String> inScopeEventNames;
        private final boolean isShadowEnabled;
        private final List<CompiledRule> rules;
        private final Set<String> standardParams;

        public VVPConfig(List<CompiledRule> rules, Set<String> standardParams, Set<String> set, boolean z10) {
            t.f(rules, "rules");
            t.f(standardParams, "standardParams");
            this.rules = rules;
            this.standardParams = standardParams;
            this.inScopeEventNames = set;
            this.isShadowEnabled = z10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ VVPConfig copy$default(VVPConfig vVPConfig, List list, Set set, Set set2, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = vVPConfig.rules;
            }
            if ((i10 & 2) != 0) {
                set = vVPConfig.standardParams;
            }
            if ((i10 & 4) != 0) {
                set2 = vVPConfig.inScopeEventNames;
            }
            if ((i10 & 8) != 0) {
                z10 = vVPConfig.isShadowEnabled;
            }
            return vVPConfig.copy(list, set, set2, z10);
        }

        public final List<CompiledRule> component1() {
            return this.rules;
        }

        public final Set<String> component2() {
            return this.standardParams;
        }

        public final Set<String> component3() {
            return this.inScopeEventNames;
        }

        public final boolean component4() {
            return this.isShadowEnabled;
        }

        public final VVPConfig copy(List<CompiledRule> rules, Set<String> standardParams, Set<String> set, boolean z10) {
            t.f(rules, "rules");
            t.f(standardParams, "standardParams");
            return new VVPConfig(rules, standardParams, set, z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VVPConfig)) {
                return false;
            }
            VVPConfig vVPConfig = (VVPConfig) obj;
            return t.a(this.rules, vVPConfig.rules) && t.a(this.standardParams, vVPConfig.standardParams) && t.a(this.inScopeEventNames, vVPConfig.inScopeEventNames) && this.isShadowEnabled == vVPConfig.isShadowEnabled;
        }

        public final Set<String> getInScopeEventNames() {
            return this.inScopeEventNames;
        }

        public final List<CompiledRule> getRules() {
            return this.rules;
        }

        public final Set<String> getStandardParams() {
            return this.standardParams;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v7, types: [int] */
        /* JADX WARN: Type inference failed for: r1v6, types: [int] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v9 */
        public int hashCode() {
            int iHashCode = ((this.rules.hashCode() * 31) + this.standardParams.hashCode()) * 31;
            Set<String> set = this.inScopeEventNames;
            int iHashCode2 = (iHashCode + (set == null ? 0 : set.hashCode())) * 31;
            boolean z10 = this.isShadowEnabled;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return iHashCode2 + r10;
        }

        public final boolean isShadowEnabled() {
            return this.isShadowEnabled;
        }

        public String toString() {
            return "VVPConfig(rules=" + this.rules + ", standardParams=" + this.standardParams + ", inScopeEventNames=" + this.inScopeEventNames + ", isShadowEnabled=" + this.isShadowEnabled + ')';
        }
    }

    private VVPManager() {
    }

    public static final void disable() {
        if (CrashShieldHandler.isObjectCrashing(VVPManager.class)) {
            return;
        }
        try {
            enabled = false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, VVPManager.class);
        }
    }

    public static final void enable() {
        if (CrashShieldHandler.isObjectCrashing(VVPManager.class)) {
            return;
        }
        try {
            enabled = true;
            INSTANCE.loadConfig$facebook_core_release();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, VVPManager.class);
        }
    }

    public static final boolean isEnabled() {
        if (CrashShieldHandler.isObjectCrashing(VVPManager.class)) {
            return false;
        }
        try {
            return enabled;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, VVPManager.class);
            return false;
        }
    }

    private final Pattern optRegex(JSONObject jSONObject, String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            if (jSONObject.has(str) && !jSONObject.isNull(str)) {
                String raw = jSONObject.optString(str, "");
                t.e(raw, "raw");
                if (raw.length() == 0) {
                    return null;
                }
                try {
                    return Pattern.compile(raw, 2);
                } catch (Exception unused) {
                    return null;
                }
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final Set<String> parseInScopeEventNames(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            if (!jSONObject.has(IN_SCOPE_EVENT_NAMES_KEY) || jSONObject.isNull(IN_SCOPE_EVENT_NAMES_KEY) || (jSONArrayOptJSONArray = jSONObject.optJSONArray(IN_SCOPE_EVENT_NAMES_KEY)) == null) {
                return null;
            }
            HashSet hashSet = new HashSet();
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                String s10 = jSONArrayOptJSONArray.optString(i10, "");
                t.e(s10, "s");
                if (s10.length() > 0) {
                    hashSet.add(s10);
                }
            }
            return hashSet;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final List<CompiledRule> parseRules(JSONObject jSONObject) {
        CompiledRule compiledRuleCompileRule$facebook_core_release;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(RULES_KEY);
            if (jSONArrayOptJSONArray == null) {
                return kotlin.collections.t.k();
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null && (compiledRuleCompileRule$facebook_core_release = compileRule$facebook_core_release(jSONObjectOptJSONObject)) != null) {
                    arrayList.add(compiledRuleCompileRule$facebook_core_release);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final Set<String> parseStandardParams(JSONObject jSONObject) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(STANDARD_PARAMS_KEY);
            if (jSONObjectOptJSONObject == null) {
                return u0.e();
            }
            HashSet hashSet = new HashSet();
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (jSONObjectOptJSONObject.optBoolean(next, false)) {
                    hashSet.add(next);
                }
            }
            return hashSet;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public static final void processParametersForVVP(String eventName, Bundle bundle) {
        VVPConfig vVPConfig;
        Matcher matcher;
        String string;
        Matcher matcher2;
        Matcher matcher3;
        Matcher matcher4;
        if (CrashShieldHandler.isObjectCrashing(VVPManager.class)) {
            return;
        }
        try {
            t.f(eventName, "eventName");
            if (!enabled || bundle == null || bundle.isEmpty() || (vVPConfig = config) == null) {
                return;
            }
            Set<String> inScopeEventNames = vVPConfig.getInScopeEventNames();
            if (inScopeEventNames == null || !(!inScopeEventNames.isEmpty()) || inScopeEventNames.contains(eventName)) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                boolean z10 = false;
                for (CompiledRule compiledRule : vVPConfig.getRules()) {
                    int place = compiledRule.getPlace();
                    if (place == 1) {
                        Set<String> setKeySet = bundle.keySet();
                        t.e(setKeySet, "parameters.keySet()");
                        for (String str : b0.p0(setKeySet)) {
                            Object obj = bundle.get(str);
                            if (obj != null && (string = obj.toString()) != null) {
                                Pattern keyRegex = compiledRule.getKeyRegex();
                                boolean zFind = (keyRegex == null || (matcher4 = keyRegex.matcher(str)) == null) ? true : matcher4.find();
                                Pattern keyNegativeRegex = compiledRule.getKeyNegativeRegex();
                                boolean z11 = zFind && !((keyNegativeRegex == null || (matcher3 = keyNegativeRegex.matcher(str)) == null) ? false : matcher3.find());
                                Pattern valueRegex = compiledRule.getValueRegex();
                                boolean zFind2 = (valueRegex == null || (matcher2 = valueRegex.matcher(string)) == null) ? true : matcher2.find();
                                if (z11 && zFind2) {
                                    linkedHashSet.add(str);
                                    z10 = true;
                                }
                            }
                        }
                    } else if (place == 3 && compiledRule.getKeyRegex() != null && compiledRule.getKeyRegex().matcher(eventName).find()) {
                        Pattern keyNegativeRegex2 = compiledRule.getKeyNegativeRegex();
                        if (!((keyNegativeRegex2 == null || (matcher = keyNegativeRegex2.matcher(eventName)) == null) ? false : matcher.find())) {
                            linkedHashSet2.add(AppEventsConstants.EVENT_PARAM_VALUE_YES);
                            z10 = true;
                        }
                    }
                }
                if (z10) {
                    if (!vVPConfig.isShadowEnabled() && (!vVPConfig.getStandardParams().isEmpty())) {
                        Set<String> setKeySet2 = bundle.keySet();
                        t.e(setKeySet2, "parameters.keySet()");
                        for (String str2 : b0.p0(setKeySet2)) {
                            if (!vVPConfig.getStandardParams().contains(str2)) {
                                if (CONTENT_ID_SANITIZE_KEYS.contains(str2)) {
                                    bundle.putString(str2, SANITIZED_VALUE);
                                } else {
                                    bundle.remove(str2);
                                }
                            }
                        }
                        INSTANCE.scrubIdInContentsArray$facebook_core_release(bundle);
                    }
                    bundle.putString(VVP_IS_APPLIED_KEY, AppEventsConstants.EVENT_PARAM_VALUE_YES);
                    if ((!linkedHashSet.isEmpty()) || (!linkedHashSet2.isEmpty())) {
                        JSONObject jSONObject = new JSONObject();
                        if (!linkedHashSet.isEmpty()) {
                            jSONObject.put(VP_RP, new JSONArray((Collection) b0.p0(linkedHashSet)));
                        }
                        if (!linkedHashSet2.isEmpty()) {
                            jSONObject.put(VP_RP_EV, new JSONArray((Collection) b0.p0(linkedHashSet2)));
                        }
                        bundle.putString(VVP_METADATA_KEY, jSONObject.toString());
                    }
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, VVPManager.class);
        }
    }

    public final void clearForTests$facebook_core_release() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            enabled = false;
            config = null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final CompiledRule compileRule$facebook_core_release(JSONObject ruleObj) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            t.f(ruleObj, "ruleObj");
            int iOptInt = ruleObj.optInt(PLACE_KEY, -1);
            if (iOptInt != 1 && iOptInt != 3) {
                return null;
            }
            Pattern patternOptRegex = optRegex(ruleObj, KEY_REGEX_KEY);
            Pattern patternOptRegex2 = optRegex(ruleObj, KEY_NEGATIVE_REGEX_KEY);
            Pattern patternOptRegex3 = optRegex(ruleObj, VALUE_REGEX_KEY);
            if (patternOptRegex == null && patternOptRegex3 == null) {
                return null;
            }
            return new CompiledRule(iOptInt, patternOptRegex, patternOptRegex2, patternOptRegex3);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final VVPConfig getConfig$facebook_core_release() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return config;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final void loadConfig$facebook_core_release() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            FetchedAppSettings fetchedAppSettingsQueryAppSettings = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false);
            VVPConfig config$facebook_core_release = null;
            String vvpConfig = fetchedAppSettingsQueryAppSettings != null ? fetchedAppSettingsQueryAppSettings.getVvpConfig() : null;
            if (!(vvpConfig == null || vvpConfig.length() == 0)) {
                config$facebook_core_release = parseConfig$facebook_core_release(vvpConfig);
            }
            config = config$facebook_core_release;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final VVPConfig parseConfig$facebook_core_release(String jsonStr) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            t.f(jsonStr, "jsonStr");
            try {
                JSONObject jSONObject = new JSONObject(jsonStr);
                if (!jSONObject.optBoolean(ENABLED_KEY, false)) {
                    return null;
                }
                List<CompiledRule> rules = parseRules(jSONObject);
                if (rules.isEmpty()) {
                    return null;
                }
                return new VVPConfig(rules, parseStandardParams(jSONObject), parseInScopeEventNames(jSONObject), jSONObject.optBoolean(IS_SHADOW_ENABLED_KEY, true));
            } catch (JSONException unused) {
                return null;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final void scrubIdInContentsArray$facebook_core_release(Bundle parameters) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            t.f(parameters, "parameters");
            String string = parameters.getString("fb_content");
            if (string == null) {
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray(string);
                int length = jSONArray.length();
                boolean z10 = false;
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has("id")) {
                        jSONObjectOptJSONObject.put("id", SANITIZED_VALUE);
                        z10 = true;
                    }
                }
                if (z10) {
                    parameters.putString("fb_content", jSONArray.toString());
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }
}
