package com.facebook.appevents.internal;

import android.content.Context;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.o0;
import kotlin.jvm.internal.t;
import org.json.JSONException;
import org.json.JSONObject;
import wc.w;

/* JADX INFO: compiled from: AppEventsLoggerUtility.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AppEventsLoggerUtility {
    public static final AppEventsLoggerUtility INSTANCE = new AppEventsLoggerUtility();
    private static final Map<GraphAPIActivityType, String> API_ACTIVITY_TYPE_TO_STRING = o0.j(w.a(GraphAPIActivityType.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL"), w.a(GraphAPIActivityType.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS"));

    /* JADX INFO: compiled from: AppEventsLoggerUtility.kt */
    public enum GraphAPIActivityType {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS
    }

    private AppEventsLoggerUtility() {
    }

    public static final JSONObject getJSONObjectForGraphAPICall(GraphAPIActivityType activityType, AttributionIdentifiers attributionIdentifiers, String str, boolean z10, Context context) throws JSONException {
        t.f(activityType, "activityType");
        t.f(context, "context");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", API_ACTIVITY_TYPE_TO_STRING.get(activityType));
        String userID = AppEventsLogger.Companion.getUserID();
        if (userID != null) {
            jSONObject.put("app_user_id", userID);
        }
        Utility.setAppEventAttributionParameters(jSONObject, attributionIdentifiers, str, z10, context);
        try {
            Utility.setAppEventExtendedDeviceInfoParameters(jSONObject, context);
        } catch (Exception e10) {
            Logger.Companion.log(LoggingBehavior.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e10.toString());
        }
        JSONObject dataProcessingOptions = Utility.getDataProcessingOptions();
        if (dataProcessingOptions != null) {
            Iterator<String> itKeys = dataProcessingOptions.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject.put(next, dataProcessingOptions.get(next));
            }
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}
