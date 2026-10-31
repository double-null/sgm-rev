package com.facebook.appevents.integrity;

import com.facebook.FacebookSdk;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlin.jvm.internal.t;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: RedactedEventsManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class RedactedEventsManager {
    private static boolean enabled;
    public static final RedactedEventsManager INSTANCE = new RedactedEventsManager();
    private static Map<String, HashSet<String>> redactedEvents = new HashMap();

    private RedactedEventsManager() {
    }

    public static final void disable() {
        if (CrashShieldHandler.isObjectCrashing(RedactedEventsManager.class)) {
            return;
        }
        try {
            enabled = false;
            redactedEvents = new HashMap();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, RedactedEventsManager.class);
        }
    }

    public static final void enable() {
        if (CrashShieldHandler.isObjectCrashing(RedactedEventsManager.class)) {
            return;
        }
        try {
            INSTANCE.loadRedactedEvents();
            if (!redactedEvents.isEmpty()) {
                enabled = true;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, RedactedEventsManager.class);
        }
    }

    private final String getRedactionString(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            for (String str2 : redactedEvents.keySet()) {
                HashSet<String> hashSet = redactedEvents.get(str2);
                if (hashSet != null && hashSet.contains(str)) {
                    return str2;
                }
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final void loadRedactedEvents() {
        HashSet<String> hashSetConvertJSONArrayToHashSet;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            FetchedAppSettings fetchedAppSettingsQueryAppSettings = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false);
            if (fetchedAppSettingsQueryAppSettings == null) {
                return;
            }
            try {
                redactedEvents = new HashMap();
                JSONArray redactedEvents2 = fetchedAppSettingsQueryAppSettings.getRedactedEvents();
                if (redactedEvents2 == null || redactedEvents2.length() == 0) {
                    return;
                }
                int length = redactedEvents2.length();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject = redactedEvents2.getJSONObject(i10);
                    boolean zHas = jSONObject.has(SDKConstants.PARAM_KEY);
                    boolean zHas2 = jSONObject.has("value");
                    if (zHas && zHas2) {
                        String string = jSONObject.getString(SDKConstants.PARAM_KEY);
                        JSONArray jSONArray = jSONObject.getJSONArray("value");
                        if (string != null && (hashSetConvertJSONArrayToHashSet = Utility.convertJSONArrayToHashSet(jSONArray)) != null) {
                            redactedEvents.put(string, hashSetConvertJSONArrayToHashSet);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public static final String processEventsRedaction(String eventName) {
        String redactionString;
        if (CrashShieldHandler.isObjectCrashing(RedactedEventsManager.class)) {
            return null;
        }
        try {
            t.f(eventName, "eventName");
            return (!enabled || (redactionString = INSTANCE.getRedactionString(eventName)) == null) ? eventName : redactionString;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, RedactedEventsManager.class);
            return null;
        }
    }
}
