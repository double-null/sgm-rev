package com.facebook.appevents.restrictivedatafilter;

import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.t;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: RestrictiveDataManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class RestrictiveDataManager {
    private static final String PROCESS_EVENT_NAME = "process_event_name";
    private static final String REPLACEMENT_STRING = "_removed_";
    private static final String RESTRICTIVE_PARAM = "restrictive_param";
    private static final String RESTRICTIVE_PARAM_KEY = "_restrictedParams";
    private static boolean enabled;
    public static final RestrictiveDataManager INSTANCE = new RestrictiveDataManager();
    private static final String TAG = RestrictiveDataManager.class.getCanonicalName();
    private static final List<RestrictiveParamFilter> restrictiveParamFilters = new ArrayList();
    private static final Set<String> restrictedEvents = new CopyOnWriteArraySet();

    /* JADX INFO: compiled from: RestrictiveDataManager.kt */
    public static final class RestrictiveParamFilter {
        private String eventName;
        private Map<String, String> restrictiveParams;

        public RestrictiveParamFilter(String eventName, Map<String, String> restrictiveParams) {
            t.f(eventName, "eventName");
            t.f(restrictiveParams, "restrictiveParams");
            this.eventName = eventName;
            this.restrictiveParams = restrictiveParams;
        }

        public final String getEventName() {
            return this.eventName;
        }

        public final Map<String, String> getRestrictiveParams() {
            return this.restrictiveParams;
        }

        public final void setEventName(String str) {
            t.f(str, "<set-?>");
            this.eventName = str;
        }

        public final void setRestrictiveParams(Map<String, String> map) {
            t.f(map, "<set-?>");
            this.restrictiveParams = map;
        }
    }

    private RestrictiveDataManager() {
    }

    public static final void enable() {
        if (CrashShieldHandler.isObjectCrashing(RestrictiveDataManager.class)) {
            return;
        }
        try {
            enabled = true;
            INSTANCE.initialize();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, RestrictiveDataManager.class);
        }
    }

    private final String getMatchedRuleType(String str, String str2) {
        try {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                for (RestrictiveParamFilter restrictiveParamFilter : new ArrayList(restrictiveParamFilters)) {
                    if (restrictiveParamFilter != null && t.a(str, restrictiveParamFilter.getEventName())) {
                        for (String str3 : restrictiveParamFilter.getRestrictiveParams().keySet()) {
                            if (t.a(str2, str3)) {
                                return restrictiveParamFilter.getRestrictiveParams().get(str3);
                            }
                        }
                    }
                }
            } catch (Exception e10) {
                Log.w(TAG, "getMatchedRuleType failed", e10);
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final void initialize() {
        String restrictiveDataSetting;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            FetchedAppSettings fetchedAppSettingsQueryAppSettings = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false);
            if (fetchedAppSettingsQueryAppSettings == null || (restrictiveDataSetting = fetchedAppSettingsQueryAppSettings.getRestrictiveDataSetting()) == null) {
                return;
            }
            if (restrictiveDataSetting.length() == 0) {
                return;
            }
            JSONObject jSONObject = new JSONObject(restrictiveDataSetting);
            restrictiveParamFilters.clear();
            restrictedEvents.clear();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String key = itKeys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                if (jSONObject2 != null) {
                    JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(RESTRICTIVE_PARAM);
                    t.e(key, "key");
                    RestrictiveParamFilter restrictiveParamFilter = new RestrictiveParamFilter(key, new HashMap());
                    if (jSONObjectOptJSONObject != null) {
                        restrictiveParamFilter.setRestrictiveParams(Utility.convertJSONObjectToStringMap(jSONObjectOptJSONObject));
                        restrictiveParamFilters.add(restrictiveParamFilter);
                    }
                    if (jSONObject2.has(PROCESS_EVENT_NAME)) {
                        restrictedEvents.add(restrictiveParamFilter.getEventName());
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final boolean isRestrictedEvent(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            return restrictedEvents.contains(str);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    public static final String processEvent(String eventName) {
        if (CrashShieldHandler.isObjectCrashing(RestrictiveDataManager.class)) {
            return null;
        }
        try {
            t.f(eventName, "eventName");
            return (enabled && INSTANCE.isRestrictedEvent(eventName)) ? REPLACEMENT_STRING : eventName;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, RestrictiveDataManager.class);
            return null;
        }
    }

    public static final void processParameters(Map<String, String> parameters, String eventName) {
        if (CrashShieldHandler.isObjectCrashing(RestrictiveDataManager.class)) {
            return;
        }
        try {
            t.f(parameters, "parameters");
            t.f(eventName, "eventName");
            if (enabled) {
                HashMap map = new HashMap();
                for (String str : new ArrayList(parameters.keySet())) {
                    String matchedRuleType = INSTANCE.getMatchedRuleType(eventName, str);
                    if (matchedRuleType != null) {
                        map.put(str, matchedRuleType);
                        parameters.remove(str);
                    }
                }
                if (!map.isEmpty()) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry entry : map.entrySet()) {
                            jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                        }
                        parameters.put(RESTRICTIVE_PARAM_KEY, jSONObject.toString());
                    } catch (JSONException unused) {
                    }
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, RestrictiveDataManager.class);
        }
    }
}
