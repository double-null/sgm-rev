package com.facebook.appevents.iap;

import android.content.SharedPreferences;
import com.facebook.FacebookSdk;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.o0;
import kotlin.jvm.internal.t;
import org.json.JSONObject;
import rd.f0;

/* JADX INFO: compiled from: InAppPurchaseLoggerManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class InAppPurchaseLoggerManager {
    private static final long APPROXIMATE_IAP_ENHANCEMENT_RELEASE_TIME = 1736528400000L;
    private static final String APP_HAS_BEEN_LAUNCHED_KEY = "APP_HAS_BEEN_LAUNCHED_KEY";
    private static final String CACHED_PURCHASES_KEY = "PURCHASE_DETAILS_SET";
    private static final String IAP_CACHE_GPBLV2V7 = "com.facebook.internal.iap.IAP_CACHE_GPBLV2V7";
    private static final String IAP_CACHE_OLD = "com.facebook.internal.iap.PRODUCT_DETAILS";
    private static final String IAP_PURCHASE_CACHE_GPBLV1 = "com.facebook.internal.PURCHASE";
    private static final String IAP_SKU_CACHE_GPBLV1 = "com.facebook.internal.SKU_DETAILS";
    public static final InAppPurchaseLoggerManager INSTANCE = new InAppPurchaseLoggerManager();
    private static final double MILLISECONDS_IN_SECONDS = 1000.0d;
    private static final String PURCHASE_TIME = "purchaseTime";
    private static final String TIME_OF_LAST_LOGGED_PURCHASE_KEY = "TIME_OF_LAST_LOGGED_PURCHASE";
    private static final String TIME_OF_LAST_LOGGED_SUBSCRIPTION_KEY = "TIME_OF_LAST_LOGGED_SUBSCRIPTION";

    private InAppPurchaseLoggerManager() {
    }

    public static final void deleteOldCacheHistory() {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseLoggerManager.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences(IAP_SKU_CACHE_GPBLV1, 0);
            SharedPreferences sharedPreferences2 = FacebookSdk.getApplicationContext().getSharedPreferences(IAP_PURCHASE_CACHE_GPBLV1, 0);
            sharedPreferences.edit().clear().apply();
            sharedPreferences2.edit().clear().apply();
            FacebookSdk.getApplicationContext().getSharedPreferences(IAP_CACHE_OLD, 0).edit().clear().apply();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseLoggerManager.class);
        }
    }

    public static final void filterPurchaseLogging(Map<String, JSONObject> purchaseDetailsMap, Map<String, ? extends JSONObject> skuDetailsMap, boolean z10, String packageName, InAppPurchaseUtils.BillingClientVersion billingClientVersion, boolean z11) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseLoggerManager.class)) {
            return;
        }
        try {
            t.f(purchaseDetailsMap, "purchaseDetailsMap");
            t.f(skuDetailsMap, "skuDetailsMap");
            t.f(packageName, "packageName");
            t.f(billingClientVersion, "billingClientVersion");
            InAppPurchaseLoggerManager inAppPurchaseLoggerManager = INSTANCE;
            inAppPurchaseLoggerManager.logPurchases(inAppPurchaseLoggerManager.constructLoggingReadyMap$facebook_core_release(inAppPurchaseLoggerManager.cacheDeDupPurchase$facebook_core_release(purchaseDetailsMap, z10), skuDetailsMap, packageName), z10, billingClientVersion, z11);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseLoggerManager.class);
        }
    }

    public static final boolean getIsFirstAppLaunchWithNewIAP() {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseLoggerManager.class)) {
            return false;
        }
        try {
            return !FacebookSdk.getApplicationContext().getSharedPreferences(IAP_CACHE_GPBLV2V7, 0).contains(APP_HAS_BEEN_LAUNCHED_KEY);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseLoggerManager.class);
            return false;
        }
    }

    private final void logPurchases(Map<String, String> map, boolean z10, InAppPurchaseUtils.BillingClientVersion billingClientVersion, boolean z11) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                AutomaticAnalyticsLogger.logPurchase(entry.getKey(), entry.getValue(), z10, billingClientVersion, z11);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public static final void migrateOldCacheHistory() {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseLoggerManager.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences(IAP_CACHE_GPBLV2V7, 0);
            long jMax = Math.max(Math.max(sharedPreferences.getLong(TIME_OF_LAST_LOGGED_PURCHASE_KEY, 0L), sharedPreferences.getLong(TIME_OF_LAST_LOGGED_SUBSCRIPTION_KEY, 0L)), APPROXIMATE_IAP_ENHANCEMENT_RELEASE_TIME);
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            SharedPreferences sharedPreferences2 = FacebookSdk.getApplicationContext().getSharedPreferences(IAP_CACHE_OLD, 0);
            if (sharedPreferences2.contains(CACHED_PURCHASES_KEY)) {
                Set<String> stringSet = sharedPreferences2.getStringSet(CACHED_PURCHASES_KEY, new HashSet());
                if (stringSet == null) {
                    stringSet = new HashSet<>();
                }
                copyOnWriteArraySet.addAll(stringSet);
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    try {
                        long j10 = Long.parseLong((String) f0.K0((String) it.next(), new String[]{";"}, false, 2, 2, null).get(1)) * 1000;
                        if (Math.abs(String.valueOf(j10).length() - 13) < Math.log10(MILLISECONDS_IN_SECONDS)) {
                            jMax = Math.max(jMax, j10);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            sharedPreferences.edit().putLong(TIME_OF_LAST_LOGGED_SUBSCRIPTION_KEY, jMax).apply();
            sharedPreferences.edit().putLong(TIME_OF_LAST_LOGGED_PURCHASE_KEY, jMax).apply();
            deleteOldCacheHistory();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseLoggerManager.class);
        }
    }

    public static final void setAppHasBeenLaunchedWithNewIAP() {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseLoggerManager.class)) {
            return;
        }
        try {
            try {
                FacebookSdk.getApplicationContext().getSharedPreferences(IAP_CACHE_GPBLV2V7, 0).edit().putBoolean(APP_HAS_BEEN_LAUNCHED_KEY, true).apply();
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseLoggerManager.class);
        }
    }

    public static final void updateLatestPossiblePurchaseTime() {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseLoggerManager.class)) {
            return;
        }
        try {
            setAppHasBeenLaunchedWithNewIAP();
            try {
                SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences(IAP_CACHE_GPBLV2V7, 0);
                long jCurrentTimeMillis = System.currentTimeMillis();
                sharedPreferences.edit().putLong(TIME_OF_LAST_LOGGED_SUBSCRIPTION_KEY, jCurrentTimeMillis).apply();
                sharedPreferences.edit().putLong(TIME_OF_LAST_LOGGED_PURCHASE_KEY, jCurrentTimeMillis).apply();
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseLoggerManager.class);
        }
    }

    public final Map<String, JSONObject> cacheDeDupPurchase$facebook_core_release(Map<String, JSONObject> purchaseDetailsMap, boolean z10) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            t.f(purchaseDetailsMap, "purchaseDetailsMap");
            SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences(IAP_CACHE_GPBLV2V7, 0);
            long j10 = z10 ? sharedPreferences.getLong(TIME_OF_LAST_LOGGED_SUBSCRIPTION_KEY, APPROXIMATE_IAP_ENHANCEMENT_RELEASE_TIME) : sharedPreferences.getLong(TIME_OF_LAST_LOGGED_PURCHASE_KEY, APPROXIMATE_IAP_ENHANCEMENT_RELEASE_TIME);
            long jMax = 0;
            for (Map.Entry entry : o0.s(purchaseDetailsMap).entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                try {
                    if (jSONObject.has("purchaseToken") && jSONObject.has("purchaseTime")) {
                        long j11 = jSONObject.getLong("purchaseTime");
                        if (j11 <= j10) {
                            purchaseDetailsMap.remove(str);
                        }
                        jMax = Math.max(jMax, j11);
                    }
                } catch (Exception unused) {
                }
            }
            if (jMax >= j10) {
                if (z10) {
                    sharedPreferences.edit().putLong(TIME_OF_LAST_LOGGED_SUBSCRIPTION_KEY, jMax).apply();
                } else {
                    sharedPreferences.edit().putLong(TIME_OF_LAST_LOGGED_PURCHASE_KEY, jMax).apply();
                }
            }
            return new HashMap(purchaseDetailsMap);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final Map<String, String> constructLoggingReadyMap$facebook_core_release(Map<String, ? extends JSONObject> purchaseDetailsMap, Map<String, ? extends JSONObject> skuDetailsMap, String packageName) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            t.f(purchaseDetailsMap, "purchaseDetailsMap");
            t.f(skuDetailsMap, "skuDetailsMap");
            t.f(packageName, "packageName");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends JSONObject> entry : purchaseDetailsMap.entrySet()) {
                String key = entry.getKey();
                JSONObject value = entry.getValue();
                JSONObject jSONObject = skuDetailsMap.get(key);
                try {
                    value.put("packageName", packageName);
                    if (jSONObject != null) {
                        String string = value.toString();
                        t.e(string, "purchaseDetail.toString()");
                        String string2 = jSONObject.toString();
                        t.e(string2, "skuDetail.toString()");
                        linkedHashMap.put(string, string2);
                    }
                } catch (Exception unused) {
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }
}
