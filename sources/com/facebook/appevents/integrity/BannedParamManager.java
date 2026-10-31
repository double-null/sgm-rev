package com.facebook.appevents.integrity;

import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.HashSet;
import org.json.JSONArray;

/* JADX INFO: compiled from: BannedParamManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class BannedParamManager {
    private static final String BANNED_PARAMS_KEY = "_bannedParams";
    public static final BannedParamManager INSTANCE = new BannedParamManager();
    private static HashSet<String> bannedParamsConfig = new HashSet<>();
    private static boolean enabled;

    private BannedParamManager() {
    }

    public static final void disable() {
        if (CrashShieldHandler.isObjectCrashing(BannedParamManager.class)) {
            return;
        }
        try {
            enabled = false;
            bannedParamsConfig = new HashSet<>();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, BannedParamManager.class);
        }
    }

    public static final void enable() {
        if (CrashShieldHandler.isObjectCrashing(BannedParamManager.class)) {
            return;
        }
        try {
            if (enabled) {
                return;
            }
            INSTANCE.loadConfigs();
            enabled = !bannedParamsConfig.isEmpty();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, BannedParamManager.class);
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
            bannedParamsConfig = loadSet(fetchedAppSettingsQueryAppSettings.getBannedParams());
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

    public static final void processFilterBannedParams(Bundle bundle) {
        if (CrashShieldHandler.isObjectCrashing(BannedParamManager.class)) {
            return;
        }
        try {
            if (enabled && bundle != null) {
                JSONArray jSONArray = new JSONArray();
                for (String str : bannedParamsConfig) {
                    if (bundle.containsKey(str)) {
                        bundle.remove(str);
                        jSONArray.put(str);
                    }
                }
                if (jSONArray.length() > 0) {
                    bundle.putString(BANNED_PARAMS_KEY, jSONArray.toString());
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, BannedParamManager.class);
        }
    }
}
