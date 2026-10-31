package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.gatekeeper.GateKeeper;
import com.facebook.internal.gatekeeper.GateKeeperRuntimeCache;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.l0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: FetchedAppGateKeepersManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FetchedAppGateKeepersManager {
    private static final String APPLICATION_FIELDS = "fields";
    private static final long APPLICATION_GATEKEEPER_CACHE_TIMEOUT = 3600000;
    private static final String APPLICATION_GATEKEEPER_EDGE = "mobile_sdk_gk";
    private static final String APPLICATION_GATEKEEPER_FIELD = "gatekeepers";
    private static final String APPLICATION_GRAPH_DATA = "data";
    private static final String APPLICATION_PLATFORM = "platform";
    private static final String APPLICATION_SDK_VERSION = "sdk_version";
    private static final String APP_GATEKEEPERS_PREFS_KEY_FORMAT = "com.facebook.internal.APP_GATEKEEPERS.%s";
    private static final String APP_GATEKEEPERS_PREFS_STORE = "com.facebook.internal.preferences.APP_GATEKEEPERS";
    private static final String APP_PLATFORM = "android";
    private static final String TAG = "FetchedAppGateKeepersManager";
    private static volatile GateKeeperRuntimeCache gateKeeperRuntimeCache;
    private static volatile Long timestamp;
    public static final FetchedAppGateKeepersManager INSTANCE = new FetchedAppGateKeepersManager();
    private static final AtomicBoolean isLoading = new AtomicBoolean(false);
    private static final ConcurrentLinkedQueue<Callback> callbacks = new ConcurrentLinkedQueue<>();
    private static final Map<String, JSONObject> fetchedAppGateKeepers = new ConcurrentHashMap();

    /* JADX INFO: compiled from: FetchedAppGateKeepersManager.kt */
    public interface Callback {
        void onCompleted();
    }

    private FetchedAppGateKeepersManager() {
    }

    private final JSONObject getAppGateKeepersQueryResponse(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(APPLICATION_PLATFORM, "android");
        bundle.putString(APPLICATION_SDK_VERSION, FacebookSdk.getSdkVersion());
        bundle.putString("fields", APPLICATION_GATEKEEPER_FIELD);
        GraphRequest.Companion companion = GraphRequest.Companion;
        l0 l0Var = l0.f21527a;
        String str2 = String.format("app/%s", Arrays.copyOf(new Object[]{APPLICATION_GATEKEEPER_EDGE}, 1));
        kotlin.jvm.internal.t.e(str2, "format(format, *args)");
        GraphRequest graphRequestNewGraphPathRequest = companion.newGraphPathRequest(null, str2, null);
        graphRequestNewGraphPathRequest.setParameters(bundle);
        JSONObject jsonObject = graphRequestNewGraphPathRequest.executeAndWait().getJsonObject();
        return jsonObject == null ? new JSONObject() : jsonObject;
    }

    public static final boolean getGateKeeperForKey(String name, String str, boolean z10) {
        Boolean bool;
        kotlin.jvm.internal.t.f(name, "name");
        Map<String, Boolean> gateKeepersForApplication = INSTANCE.getGateKeepersForApplication(str);
        return (gateKeepersForApplication.containsKey(name) && (bool = gateKeepersForApplication.get(name)) != null) ? bool.booleanValue() : z10;
    }

    private final synchronized JSONObject getGateKeepersForAppId(String str) {
        return fetchedAppGateKeepers.get(str);
    }

    private final boolean isTimestampValid(Long l10) {
        return l10 != null && System.currentTimeMillis() - l10.longValue() < APPLICATION_GATEKEEPER_CACHE_TIMEOUT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadAppGateKeepersAsync$lambda$0(String applicationId, Context context, String gateKeepersKey) {
        kotlin.jvm.internal.t.f(applicationId, "$applicationId");
        kotlin.jvm.internal.t.f(context, "$context");
        kotlin.jvm.internal.t.f(gateKeepersKey, "$gateKeepersKey");
        FetchedAppGateKeepersManager fetchedAppGateKeepersManager = INSTANCE;
        JSONObject appGateKeepersQueryResponse = fetchedAppGateKeepersManager.getAppGateKeepersQueryResponse(applicationId);
        if (appGateKeepersQueryResponse.length() != 0) {
            parseAppGateKeepersFromJSON$facebook_core_release(applicationId, appGateKeepersQueryResponse);
            context.getSharedPreferences(APP_GATEKEEPERS_PREFS_STORE, 0).edit().putString(gateKeepersKey, appGateKeepersQueryResponse.toString()).apply();
            timestamp = Long.valueOf(System.currentTimeMillis());
        }
        fetchedAppGateKeepersManager.pollCallbacks();
        isLoading.set(false);
    }

    public static final synchronized JSONObject parseAppGateKeepersFromJSON$facebook_core_release(String applicationId, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray jSONArrayOptJSONArray;
        kotlin.jvm.internal.t.f(applicationId, "applicationId");
        JSONObject gateKeepersForAppId = INSTANCE.getGateKeepersForAppId(applicationId);
        jSONObject2 = gateKeepersForAppId != null ? new JSONObject(gateKeepersForAppId.toString()) : new JSONObject();
        JSONObject jSONObjectOptJSONObject = (jSONObject == null || (jSONArrayOptJSONArray = jSONObject.optJSONArray("data")) == null) ? null : jSONArrayOptJSONArray.optJSONObject(0);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray(APPLICATION_GATEKEEPER_FIELD);
        if (jSONArrayOptJSONArray2 == null) {
            jSONArrayOptJSONArray2 = new JSONArray();
        }
        int length = jSONArrayOptJSONArray2.length();
        for (int i10 = 0; i10 < length; i10++) {
            try {
                JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i10);
                jSONObject2.put(jSONObject3.getString(SDKConstants.PARAM_KEY), jSONObject3.getBoolean("value"));
            } catch (JSONException e10) {
                Utility.logd(Utility.LOG_TAG, e10);
            }
        }
        INSTANCE.setGateKeepersForAppId(applicationId, jSONObject2);
        return jSONObject2;
    }

    private final void pollCallbacks() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue<Callback> concurrentLinkedQueue = callbacks;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            final Callback callbackPoll = concurrentLinkedQueue.poll();
            if (callbackPoll != null) {
                handler.post(new Runnable() { // from class: com.facebook.internal.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        callbackPoll.onCompleted();
                    }
                });
            }
        }
    }

    public static final JSONObject queryAppGateKeepers(String applicationId, boolean z10) {
        JSONObject gateKeepersForAppId;
        kotlin.jvm.internal.t.f(applicationId, "applicationId");
        if (!z10 && (gateKeepersForAppId = INSTANCE.getGateKeepersForAppId(applicationId)) != null) {
            return gateKeepersForAppId;
        }
        JSONObject appGateKeepersQueryResponse = INSTANCE.getAppGateKeepersQueryResponse(applicationId);
        Context applicationContext = FacebookSdk.getApplicationContext();
        l0 l0Var = l0.f21527a;
        String str = String.format(APP_GATEKEEPERS_PREFS_KEY_FORMAT, Arrays.copyOf(new Object[]{applicationId}, 1));
        kotlin.jvm.internal.t.e(str, "format(format, *args)");
        applicationContext.getSharedPreferences(APP_GATEKEEPERS_PREFS_STORE, 0).edit().putString(str, appGateKeepersQueryResponse.toString()).apply();
        return parseAppGateKeepersFromJSON$facebook_core_release(applicationId, appGateKeepersQueryResponse);
    }

    public static final void resetRuntimeGateKeeperCache() {
        GateKeeperRuntimeCache gateKeeperRuntimeCache2 = gateKeeperRuntimeCache;
        if (gateKeeperRuntimeCache2 != null) {
            GateKeeperRuntimeCache.resetCache$default(gateKeeperRuntimeCache2, null, 1, null);
        }
    }

    private final synchronized void setGateKeepersForAppId(String str, JSONObject jSONObject) {
        fetchedAppGateKeepers.put(str, jSONObject);
    }

    public static final void setRuntimeGateKeeper(String applicationId, GateKeeper gateKeeper) {
        kotlin.jvm.internal.t.f(applicationId, "applicationId");
        kotlin.jvm.internal.t.f(gateKeeper, "gateKeeper");
        GateKeeperRuntimeCache gateKeeperRuntimeCache2 = gateKeeperRuntimeCache;
        if ((gateKeeperRuntimeCache2 != null ? gateKeeperRuntimeCache2.getGateKeeper(applicationId, gateKeeper.getName()) : null) == null) {
            Log.w(TAG, "Missing gatekeeper runtime cache");
            return;
        }
        GateKeeperRuntimeCache gateKeeperRuntimeCache3 = gateKeeperRuntimeCache;
        if (gateKeeperRuntimeCache3 != null) {
            gateKeeperRuntimeCache3.setGateKeeper(applicationId, gateKeeper);
        }
    }

    public static /* synthetic */ void setRuntimeGateKeeper$default(String str, GateKeeper gateKeeper, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = FacebookSdk.getApplicationId();
        }
        setRuntimeGateKeeper(str, gateKeeper);
    }

    public final Map<String, Boolean> getGateKeepersForApplication(String str) {
        loadAppGateKeepersAsync();
        if (str == null || getGateKeepersForAppId(str) == null) {
            return new HashMap();
        }
        GateKeeperRuntimeCache gateKeeperRuntimeCache2 = gateKeeperRuntimeCache;
        List<GateKeeper> listDumpGateKeepers = gateKeeperRuntimeCache2 != null ? gateKeeperRuntimeCache2.dumpGateKeepers(str) : null;
        if (listDumpGateKeepers != null) {
            HashMap map = new HashMap();
            for (GateKeeper gateKeeper : listDumpGateKeepers) {
                map.put(gateKeeper.getName(), Boolean.valueOf(gateKeeper.getValue()));
            }
            return map;
        }
        HashMap map2 = new HashMap();
        JSONObject gateKeepersForAppId = getGateKeepersForAppId(str);
        if (gateKeepersForAppId == null) {
            gateKeepersForAppId = new JSONObject();
        }
        Iterator<String> itKeys = gateKeepersForAppId.keys();
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            kotlin.jvm.internal.t.e(key, "key");
            map2.put(key, Boolean.valueOf(gateKeepersForAppId.optBoolean(key)));
        }
        GateKeeperRuntimeCache gateKeeperRuntimeCache3 = gateKeeperRuntimeCache;
        if (gateKeeperRuntimeCache3 == null) {
            gateKeeperRuntimeCache3 = new GateKeeperRuntimeCache();
        }
        ArrayList arrayList = new ArrayList(map2.size());
        for (Map.Entry entry : map2.entrySet()) {
            arrayList.add(new GateKeeper((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
        }
        gateKeeperRuntimeCache3.setGateKeepers(str, arrayList);
        gateKeeperRuntimeCache = gateKeeperRuntimeCache3;
        return map2;
    }

    public final void loadAppGateKeepersAsync() {
        loadAppGateKeepersAsync(null);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0040 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:17:0x0042 A[Catch: all -> 0x0081, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000a, B:8:0x0018, B:10:0x001e, B:13:0x0023, B:17:0x0042, B:19:0x0053, B:24:0x0062, B:25:0x0065, B:29:0x006d, B:33:0x0077, B:22:0x005b), top: B:39:0x0005, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0062 A[Catch: all -> 0x0081, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000a, B:8:0x0018, B:10:0x001e, B:13:0x0023, B:17:0x0042, B:19:0x0053, B:24:0x0062, B:25:0x0065, B:29:0x006d, B:33:0x0077, B:22:0x005b), top: B:39:0x0005, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x006b A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d A[Catch: all -> 0x0081, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000a, B:8:0x0018, B:10:0x001e, B:13:0x0023, B:17:0x0042, B:19:0x0053, B:24:0x0062, B:25:0x0065, B:29:0x006d, B:33:0x0077, B:22:0x005b), top: B:39:0x0005, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0075 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:33:0x0077 A[Catch: all -> 0x0081, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000a, B:8:0x0018, B:10:0x001e, B:13:0x0023, B:17:0x0042, B:19:0x0053, B:24:0x0062, B:25:0x0065, B:29:0x006d, B:33:0x0077, B:22:0x005b), top: B:39:0x0005, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:15:0x0040, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x006b, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x0075, please report this as an issue */
    public static final synchronized void loadAppGateKeepersAsync(Callback callback) {
        final String applicationId;
        FetchedAppGateKeepersManager fetchedAppGateKeepersManager;
        final Context applicationContext;
        final String str;
        JSONObject jSONObject;
        String string;
        Executor executor;
        if (callback == null) {
            applicationId = FacebookSdk.getApplicationId();
            fetchedAppGateKeepersManager = INSTANCE;
            if (!fetchedAppGateKeepersManager.isTimestampValid(timestamp)) {
            }
            applicationContext = FacebookSdk.getApplicationContext();
            l0 l0Var = l0.f21527a;
            str = String.format(APP_GATEKEEPERS_PREFS_KEY_FORMAT, Arrays.copyOf(new Object[]{applicationId}, 1));
            kotlin.jvm.internal.t.e(str, "format(format, *args)");
            if (applicationContext == null) {
                return;
            }
            jSONObject = null;
            string = applicationContext.getSharedPreferences(APP_GATEKEEPERS_PREFS_STORE, 0).getString(str, null);
            if (!Utility.isNullOrEmpty(string)) {
                jSONObject = new JSONObject(string);
                if (jSONObject != null) {
                    parseAppGateKeepersFromJSON$facebook_core_release(applicationId, jSONObject);
                }
            }
            executor = FacebookSdk.getExecutor();
            if (executor == null) {
                return;
            }
            if (isLoading.compareAndSet(false, true)) {
                executor.execute(new Runnable() { // from class: com.facebook.internal.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        FetchedAppGateKeepersManager.loadAppGateKeepersAsync$lambda$0(applicationId, applicationContext, str);
                    }
                });
                return;
            }
            return;
        }
        callbacks.add(callback);
        applicationId = FacebookSdk.getApplicationId();
        fetchedAppGateKeepersManager = INSTANCE;
        if (!fetchedAppGateKeepersManager.isTimestampValid(timestamp) && fetchedAppGateKeepersManager.getGateKeepersForAppId(applicationId) != null) {
            fetchedAppGateKeepersManager.pollCallbacks();
            return;
        }
        applicationContext = FacebookSdk.getApplicationContext();
        l0 l0Var2 = l0.f21527a;
        str = String.format(APP_GATEKEEPERS_PREFS_KEY_FORMAT, Arrays.copyOf(new Object[]{applicationId}, 1));
        kotlin.jvm.internal.t.e(str, "format(format, *args)");
        if (applicationContext == null) {
            return;
        }
        jSONObject = null;
        string = applicationContext.getSharedPreferences(APP_GATEKEEPERS_PREFS_STORE, 0).getString(str, null);
        if (!Utility.isNullOrEmpty(string)) {
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e10) {
                Utility.logd(Utility.LOG_TAG, e10);
            }
            if (jSONObject != null) {
                parseAppGateKeepersFromJSON$facebook_core_release(applicationId, jSONObject);
            }
        }
        executor = FacebookSdk.getExecutor();
        if (executor == null) {
            return;
        }
        if (isLoading.compareAndSet(false, true)) {
            return;
        }
        executor.execute(new Runnable() { // from class: com.facebook.internal.e
            @Override // java.lang.Runnable
            public final void run() {
                FetchedAppGateKeepersManager.loadAppGateKeepersAsync$lambda$0(applicationId, applicationContext, str);
            }
        });
        return;
        throw th;
    }
}
