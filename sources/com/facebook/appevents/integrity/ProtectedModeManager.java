package com.facebook.appevents.integrity;

import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.t;
import org.json.JSONArray;
import org.json.JSONObject;
import wc.k;
import wc.m;

/* JADX INFO: compiled from: ProtectedModeManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ProtectedModeManager {
    private static final String PROTECTED_MODE_IS_APPLIED_KEY = "pm";
    private static final String PROTECTED_MODE_IS_APPLIED_VALUE = "1";
    private static final String PROTECTED_MODE_METADATA_KEY = "pm_metadata";
    private static boolean enabled;
    private static HashSet<String> standardParams;
    public static final ProtectedModeManager INSTANCE = new ProtectedModeManager();
    private static final k defaultStandardParameterNames$delegate = m.a(ProtectedModeManager$defaultStandardParameterNames$2.INSTANCE);

    private ProtectedModeManager() {
    }

    private final HashSet<String> convertJSONArrayToHashSet(JSONArray jSONArray) {
        if (!CrashShieldHandler.isObjectCrashing(this) && jSONArray != null) {
            try {
                if (jSONArray.length() != 0) {
                    HashSet<String> hashSet = new HashSet<>();
                    int length = jSONArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        String string = jSONArray.getString(i10);
                        t.e(string, "jsonArray.getString(i)");
                        hashSet.add(string);
                    }
                    return hashSet;
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
        return null;
    }

    public static final void disable() {
        if (CrashShieldHandler.isObjectCrashing(ProtectedModeManager.class)) {
            return;
        }
        try {
            enabled = false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ProtectedModeManager.class);
        }
    }

    public static final void enable() {
        if (CrashShieldHandler.isObjectCrashing(ProtectedModeManager.class)) {
            return;
        }
        try {
            enabled = true;
            INSTANCE.loadStandardParams();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ProtectedModeManager.class);
        }
    }

    public static final boolean isEnabled() {
        if (CrashShieldHandler.isObjectCrashing(ProtectedModeManager.class)) {
            return false;
        }
        try {
            return enabled;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ProtectedModeManager.class);
            return false;
        }
    }

    private final void loadStandardParams() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            FetchedAppSettings fetchedAppSettingsQueryAppSettings = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false);
            if (fetchedAppSettingsQueryAppSettings == null) {
                return;
            }
            HashSet<String> hashSetConvertJSONArrayToHashSet = convertJSONArrayToHashSet(fetchedAppSettingsQueryAppSettings.getProtectedModeStandardParamsSetting());
            if (hashSetConvertJSONArrayToHashSet == null) {
                hashSetConvertJSONArrayToHashSet = getDefaultStandardParameterNames();
            }
            standardParams = hashSetConvertJSONArrayToHashSet;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public static final void processParametersForProtectedMode(Bundle bundle) {
        if (CrashShieldHandler.isObjectCrashing(ProtectedModeManager.class)) {
            return;
        }
        try {
            if (enabled && bundle != null && !bundle.isEmpty() && standardParams != null) {
                ArrayList<String> arrayList = new ArrayList();
                Set<String> setKeySet = bundle.keySet();
                t.e(setKeySet, "parameters.keySet()");
                for (String param : setKeySet) {
                    HashSet<String> hashSet = standardParams;
                    t.c(hashSet);
                    if (!hashSet.contains(param)) {
                        t.e(param, "param");
                        arrayList.add(param);
                    }
                }
                boolean z10 = false;
                for (String str : arrayList) {
                    if (bundle.containsKey(str)) {
                        bundle.remove(str);
                        z10 = true;
                    }
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("cd", z10);
                bundle.putString(PROTECTED_MODE_METADATA_KEY, jSONObject.toString());
                bundle.putString(PROTECTED_MODE_IS_APPLIED_KEY, "1");
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ProtectedModeManager.class);
        }
    }

    public final HashSet<String> getDefaultStandardParameterNames() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return (HashSet) defaultStandardParameterNames$delegate.getValue();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final boolean protectedModeIsApplied(Bundle bundle) {
        if (CrashShieldHandler.isObjectCrashing(this) || bundle == null) {
            return false;
        }
        try {
            return bundle.containsKey(PROTECTED_MODE_IS_APPLIED_KEY) && t.a(bundle.get(PROTECTED_MODE_IS_APPLIED_KEY), "1");
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }
}
