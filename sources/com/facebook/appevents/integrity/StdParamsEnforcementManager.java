package com.facebook.appevents.integrity;

import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.t;
import org.json.JSONArray;
import org.json.JSONObject;
import rd.o;

/* JADX INFO: compiled from: StdParamsEnforcementManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class StdParamsEnforcementManager {
    private static boolean enabled;
    public static final StdParamsEnforcementManager INSTANCE = new StdParamsEnforcementManager();
    private static Map<String, HashSet<String>> regexRestrictionsConfig = new HashMap();
    private static Map<String, HashSet<String>> enumRestrictionsConfig = new HashMap();

    private StdParamsEnforcementManager() {
    }

    private final void configureSchemaRestrictions(JSONArray jSONArray) {
        if (CrashShieldHandler.isObjectCrashing(this) || jSONArray == null) {
            return;
        }
        try {
            if (enabled) {
                return;
            }
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                String key = jSONObject.getString(SDKConstants.PARAM_KEY);
                if (!(key == null || key.length() == 0)) {
                    try {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                        int length2 = jSONArray2.length();
                        for (int i11 = 0; i11 < length2; i11++) {
                            boolean z10 = jSONArray2.getJSONObject(i11).getBoolean("require_exact_match");
                            HashSet<String> hashSetLoadSet = loadSet(jSONArray2.getJSONObject(i11).getJSONArray("potential_matches"));
                            if (z10) {
                                Map<String, HashSet<String>> map = enumRestrictionsConfig;
                                t.e(key, "key");
                                HashSet<String> hashSet = enumRestrictionsConfig.get(key);
                                if (hashSet != null) {
                                    hashSet.addAll(hashSetLoadSet);
                                    hashSetLoadSet = hashSet;
                                }
                                map.put(key, hashSetLoadSet);
                            } else {
                                Map<String, HashSet<String>> map2 = regexRestrictionsConfig;
                                t.e(key, "key");
                                HashSet<String> hashSet2 = regexRestrictionsConfig.get(key);
                                if (hashSet2 != null) {
                                    hashSet2.addAll(hashSetLoadSet);
                                    hashSetLoadSet = hashSet2;
                                }
                                map2.put(key, hashSetLoadSet);
                            }
                        }
                    } catch (Exception unused) {
                        enumRestrictionsConfig.remove(key);
                        regexRestrictionsConfig.remove(key);
                    }
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public static final void disable() {
        if (CrashShieldHandler.isObjectCrashing(StdParamsEnforcementManager.class)) {
            return;
        }
        try {
            enabled = false;
            regexRestrictionsConfig = new HashMap();
            enumRestrictionsConfig = new HashMap();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, StdParamsEnforcementManager.class);
        }
    }

    public static final void enable() {
        if (CrashShieldHandler.isObjectCrashing(StdParamsEnforcementManager.class)) {
            return;
        }
        try {
            if (enabled) {
                return;
            }
            INSTANCE.loadConfigs();
            enabled = (regexRestrictionsConfig.isEmpty() && enumRestrictionsConfig.isEmpty()) ? false : true;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, StdParamsEnforcementManager.class);
        }
    }

    private final boolean isAnyEnumMatched(String str, Set<String> set) {
        if (CrashShieldHandler.isObjectCrashing(this) || set == null) {
            return false;
        }
        try {
            if (set.isEmpty()) {
                return false;
            }
            for (String str2 : set) {
                Locale locale = Locale.ROOT;
                String lowerCase = str2.toLowerCase(locale);
                t.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                String lowerCase2 = str.toLowerCase(locale);
                t.e(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (t.a(lowerCase, lowerCase2)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean isAnyRegexMatched(String str, Set<String> set) {
        if (CrashShieldHandler.isObjectCrashing(this) || set == null) {
            return false;
        }
        try {
            if (set.isEmpty()) {
                return false;
            }
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                if (new o((String) it.next()).e(str)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final void loadConfigs() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            FetchedAppSettings fetchedAppSettingsQueryAppSettings = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false);
            if (fetchedAppSettingsQueryAppSettings == null) {
                return;
            }
            configureSchemaRestrictions(fetchedAppSettingsQueryAppSettings.getSchemaRestrictions());
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final HashSet<String> loadSet(JSONArray jSONArray) {
        HashSet<String> hashSet;
        try {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                hashSet = Utility.convertJSONArrayToHashSet(jSONArray);
                if (hashSet == null) {
                    hashSet = new HashSet<>();
                }
            } catch (Exception unused) {
                hashSet = new HashSet<>();
            }
            return hashSet;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public static final void processFilterParamSchemaBlocking(Bundle bundle) {
        if (CrashShieldHandler.isObjectCrashing(StdParamsEnforcementManager.class)) {
            return;
        }
        try {
            if (enabled && bundle != null) {
                ArrayList arrayList = new ArrayList();
                for (String key : bundle.keySet()) {
                    String strValueOf = String.valueOf(bundle.get(key));
                    boolean z10 = true;
                    boolean z11 = regexRestrictionsConfig.get(key) != null;
                    if (enumRestrictionsConfig.get(key) == null) {
                        z10 = false;
                    }
                    if (z11 || z10) {
                        StdParamsEnforcementManager stdParamsEnforcementManager = INSTANCE;
                        boolean zIsAnyRegexMatched = stdParamsEnforcementManager.isAnyRegexMatched(strValueOf, regexRestrictionsConfig.get(key));
                        boolean zIsAnyEnumMatched = stdParamsEnforcementManager.isAnyEnumMatched(strValueOf, enumRestrictionsConfig.get(key));
                        if (!zIsAnyRegexMatched && !zIsAnyEnumMatched) {
                            t.e(key, "key");
                            arrayList.add(key);
                        }
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    bundle.remove((String) it.next());
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, StdParamsEnforcementManager.class);
        }
    }
}
