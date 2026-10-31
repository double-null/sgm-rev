package com.facebook.appevents.eventdeactivation;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEvent;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.t;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: EventDeactivationManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class EventDeactivationManager {
    private static boolean enabled;
    public static final EventDeactivationManager INSTANCE = new EventDeactivationManager();
    private static final List<DeprecatedParamFilter> deprecatedParamFilters = new ArrayList();
    private static final Set<String> deprecatedEvents = new HashSet();

    /* JADX INFO: compiled from: EventDeactivationManager.kt */
    public static final class DeprecatedParamFilter {
        private List<String> deprecateParams;
        private String eventName;

        public DeprecatedParamFilter(String eventName, List<String> deprecateParams) {
            t.f(eventName, "eventName");
            t.f(deprecateParams, "deprecateParams");
            this.eventName = eventName;
            this.deprecateParams = deprecateParams;
        }

        public final List<String> getDeprecateParams() {
            return this.deprecateParams;
        }

        public final String getEventName() {
            return this.eventName;
        }

        public final void setDeprecateParams(List<String> list) {
            t.f(list, "<set-?>");
            this.deprecateParams = list;
        }

        public final void setEventName(String str) {
            t.f(str, "<set-?>");
            this.eventName = str;
        }
    }

    private EventDeactivationManager() {
    }

    public static final void enable() {
        if (CrashShieldHandler.isObjectCrashing(EventDeactivationManager.class)) {
            return;
        }
        try {
            enabled = true;
            INSTANCE.initialize();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, EventDeactivationManager.class);
        }
    }

    private final synchronized void initialize() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            FetchedAppSettings fetchedAppSettingsQueryAppSettings = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false);
            if (fetchedAppSettingsQueryAppSettings == null) {
                return;
            }
            String restrictiveDataSetting = fetchedAppSettingsQueryAppSettings.getRestrictiveDataSetting();
            if (restrictiveDataSetting != null) {
                if (restrictiveDataSetting.length() > 0) {
                    JSONObject jSONObject = new JSONObject(restrictiveDataSetting);
                    deprecatedParamFilters.clear();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String key = itKeys.next();
                        JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                        if (jSONObject2 != null) {
                            if (jSONObject2.optBoolean("is_deprecated_event")) {
                                Set<String> set = deprecatedEvents;
                                t.e(key, "key");
                                set.add(key);
                            } else {
                                JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("deprecated_param");
                                t.e(key, "key");
                                DeprecatedParamFilter deprecatedParamFilter = new DeprecatedParamFilter(key, new ArrayList());
                                if (jSONArrayOptJSONArray != null) {
                                    deprecatedParamFilter.setDeprecateParams(Utility.convertJSONArrayToList(jSONArrayOptJSONArray));
                                }
                                deprecatedParamFilters.add(deprecatedParamFilter);
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public static final void processDeprecatedParameters(Map<String, String> parameters, String eventName) {
        if (CrashShieldHandler.isObjectCrashing(EventDeactivationManager.class)) {
            return;
        }
        try {
            t.f(parameters, "parameters");
            t.f(eventName, "eventName");
            if (enabled) {
                ArrayList<String> arrayList = new ArrayList(parameters.keySet());
                for (DeprecatedParamFilter deprecatedParamFilter : new ArrayList(deprecatedParamFilters)) {
                    if (t.a(deprecatedParamFilter.getEventName(), eventName)) {
                        for (String str : arrayList) {
                            if (deprecatedParamFilter.getDeprecateParams().contains(str)) {
                                parameters.remove(str);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, EventDeactivationManager.class);
        }
    }

    public static final void processEvents(List<AppEvent> events) {
        if (CrashShieldHandler.isObjectCrashing(EventDeactivationManager.class)) {
            return;
        }
        try {
            t.f(events, "events");
            if (enabled) {
                Iterator<AppEvent> it = events.iterator();
                while (it.hasNext()) {
                    if (deprecatedEvents.contains(it.next().getName())) {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, EventDeactivationManager.class);
        }
    }
}
