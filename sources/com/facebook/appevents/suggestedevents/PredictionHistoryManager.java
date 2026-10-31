package com.facebook.appevents.suggestedevents;

import android.content.SharedPreferences;
import android.view.View;
import com.facebook.FacebookSdk;
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.o0;
import kotlin.jvm.internal.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PredictionHistoryManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PredictionHistoryManager {
    private static final String CLICKED_PATH_STORE = "com.facebook.internal.SUGGESTED_EVENTS_HISTORY";
    private static final String SUGGESTED_EVENTS_HISTORY = "SUGGESTED_EVENTS_HISTORY";
    private static SharedPreferences shardPreferences;
    public static final PredictionHistoryManager INSTANCE = new PredictionHistoryManager();
    private static final Map<String, String> clickedViewPaths = new LinkedHashMap();
    private static final AtomicBoolean initialized = new AtomicBoolean(false);

    private PredictionHistoryManager() {
    }

    public static final void addPrediction(String pathID, String predictedEvent) {
        if (CrashShieldHandler.isObjectCrashing(PredictionHistoryManager.class)) {
            return;
        }
        try {
            t.f(pathID, "pathID");
            t.f(predictedEvent, "predictedEvent");
            if (!initialized.get()) {
                INSTANCE.initAndWait();
            }
            Map<String, String> map = clickedViewPaths;
            map.put(pathID, predictedEvent);
            SharedPreferences sharedPreferences = shardPreferences;
            if (sharedPreferences == null) {
                t.u("shardPreferences");
                sharedPreferences = null;
            }
            sharedPreferences.edit().putString(SUGGESTED_EVENTS_HISTORY, Utility.mapToJsonStr(o0.s(map))).apply();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, PredictionHistoryManager.class);
        }
    }

    public static final String getPathID(View view, String text) {
        if (CrashShieldHandler.isObjectCrashing(PredictionHistoryManager.class)) {
            return null;
        }
        try {
            t.f(view, "view");
            t.f(text, "text");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("text", text);
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    jSONArray.put(view.getClass().getSimpleName());
                    view = ViewHierarchy.getParentOfView(view);
                }
                jSONObject.put(ViewHierarchyConstants.CLASS_NAME_KEY, jSONArray);
            } catch (JSONException unused) {
            }
            return Utility.sha256hash(jSONObject.toString());
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, PredictionHistoryManager.class);
            return null;
        }
    }

    private final void initAndWait() {
        String str = "";
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = initialized;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences(CLICKED_PATH_STORE, 0);
            t.e(sharedPreferences, "getApplicationContext()\n…RE, Context.MODE_PRIVATE)");
            shardPreferences = sharedPreferences;
            Map<String, String> map = clickedViewPaths;
            if (sharedPreferences == null) {
                t.u("shardPreferences");
                sharedPreferences = null;
            }
            String string = sharedPreferences.getString(SUGGESTED_EVENTS_HISTORY, "");
            if (string != null) {
                str = string;
            }
            map.putAll(Utility.jsonStrToMap(str));
            atomicBoolean.set(true);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public static final String queryEvent(String pathID) {
        if (CrashShieldHandler.isObjectCrashing(PredictionHistoryManager.class)) {
            return null;
        }
        try {
            t.f(pathID, "pathID");
            Map<String, String> map = clickedViewPaths;
            if (map.containsKey(pathID)) {
                return map.get(pathID);
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, PredictionHistoryManager.class);
            return null;
        }
    }
}
