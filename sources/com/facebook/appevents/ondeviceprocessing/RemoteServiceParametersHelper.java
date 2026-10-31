package com.facebook.appevents.ondeviceprocessing;

import android.os.Bundle;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.eventdeactivation.EventDeactivationManager;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.List;
import kotlin.collections.b0;
import kotlin.jvm.internal.t;
import org.json.JSONArray;

/* JADX INFO: compiled from: RemoteServiceParametersHelper.kt */
/* JADX INFO: loaded from: classes.dex */
public final class RemoteServiceParametersHelper {
    public static final RemoteServiceParametersHelper INSTANCE = new RemoteServiceParametersHelper();
    private static final String TAG = RemoteServiceWrapper.class.getSimpleName();

    private RemoteServiceParametersHelper() {
    }

    public static final Bundle buildEventsBundle(RemoteServiceWrapper.EventType eventType, String applicationId, List<AppEvent> appEvents) {
        if (CrashShieldHandler.isObjectCrashing(RemoteServiceParametersHelper.class)) {
            return null;
        }
        try {
            t.f(eventType, "eventType");
            t.f(applicationId, "applicationId");
            t.f(appEvents, "appEvents");
            Bundle bundle = new Bundle();
            bundle.putString("event", eventType.toString());
            bundle.putString("app_id", applicationId);
            if (RemoteServiceWrapper.EventType.CUSTOM_APP_EVENTS == eventType) {
                JSONArray jSONArrayBuildEventsJson = INSTANCE.buildEventsJson(appEvents, applicationId);
                if (jSONArrayBuildEventsJson.length() == 0) {
                    return null;
                }
                bundle.putString("custom_events", jSONArrayBuildEventsJson.toString());
            }
            return bundle;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, RemoteServiceParametersHelper.class);
            return null;
        }
    }

    private final JSONArray buildEventsJson(List<AppEvent> list, String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            List<AppEvent> listR0 = b0.r0(list);
            EventDeactivationManager.processEvents(listR0);
            boolean zIncludeImplicitEvents = includeImplicitEvents(str);
            for (AppEvent appEvent : listR0) {
                if ((!appEvent.isImplicit()) || (appEvent.isImplicit() && zIncludeImplicitEvents)) {
                    jSONArray.put(appEvent.getJsonObject());
                }
            }
            return jSONArray;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final boolean includeImplicitEvents(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            FetchedAppSettings fetchedAppSettingsQueryAppSettings = FetchedAppSettingsManager.queryAppSettings(str, false);
            if (fetchedAppSettingsQueryAppSettings != null) {
                return fetchedAppSettingsQueryAppSettings.supportsImplicitLogging();
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }
}
