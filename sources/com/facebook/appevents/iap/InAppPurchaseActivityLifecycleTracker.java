package com.facebook.appevents.iap;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.t;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: InAppPurchaseActivityLifecycleTracker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class InAppPurchaseActivityLifecycleTracker {
    private static final String BILLING_ACTIVITY_NAME = "com.android.billingclient.api.ProxyBillingActivity";
    private static final String SERVICE_INTERFACE_NAME = "com.android.vending.billing.IInAppBillingService$Stub";
    private static InAppPurchaseUtils.BillingClientVersion billingClientVersion;
    private static Application.ActivityLifecycleCallbacks callbacks;
    private static Boolean hasBillingActivity;
    private static Boolean hasBillingService;
    private static Object inAppBillingObj;
    private static Intent intent;
    private static ServiceConnection serviceConnection;
    public static final InAppPurchaseActivityLifecycleTracker INSTANCE = new InAppPurchaseActivityLifecycleTracker();
    private static final String TAG = InAppPurchaseActivityLifecycleTracker.class.getCanonicalName();
    private static final AtomicBoolean isTracking = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.facebook.appevents.iap.InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$2, reason: invalid class name */
    /* JADX INFO: compiled from: InAppPurchaseActivityLifecycleTracker.kt */
    public static final class AnonymousClass2 implements Application.ActivityLifecycleCallbacks {
        AnonymousClass2() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onActivityResumed$lambda$0() {
            Context applicationContext = FacebookSdk.getApplicationContext();
            ArrayList<String> purchasesInapp = InAppPurchaseEventManager.getPurchasesInapp(applicationContext, InAppPurchaseActivityLifecycleTracker.inAppBillingObj);
            InAppPurchaseActivityLifecycleTracker inAppPurchaseActivityLifecycleTracker = InAppPurchaseActivityLifecycleTracker.INSTANCE;
            inAppPurchaseActivityLifecycleTracker.logPurchase(applicationContext, purchasesInapp, false);
            inAppPurchaseActivityLifecycleTracker.logPurchase(applicationContext, InAppPurchaseEventManager.getPurchasesSubs(applicationContext, InAppPurchaseActivityLifecycleTracker.inAppBillingObj), true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onActivityStopped$lambda$1() {
            Context applicationContext = FacebookSdk.getApplicationContext();
            ArrayList<String> purchasesInapp = InAppPurchaseEventManager.getPurchasesInapp(applicationContext, InAppPurchaseActivityLifecycleTracker.inAppBillingObj);
            if (purchasesInapp.isEmpty()) {
                purchasesInapp = InAppPurchaseEventManager.getPurchaseHistoryInapp(applicationContext, InAppPurchaseActivityLifecycleTracker.inAppBillingObj);
            }
            InAppPurchaseActivityLifecycleTracker.INSTANCE.logPurchase(applicationContext, purchasesInapp, false);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            t.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            t.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            t.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            t.f(activity, "activity");
            try {
                FacebookSdk.getExecutor().execute(new Runnable() { // from class: com.facebook.appevents.iap.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        InAppPurchaseActivityLifecycleTracker.AnonymousClass2.onActivityResumed$lambda$0();
                    }
                });
            } catch (Exception unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            t.f(activity, "activity");
            t.f(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            t.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            t.f(activity, "activity");
            try {
                if (t.a(InAppPurchaseActivityLifecycleTracker.hasBillingActivity, Boolean.TRUE) && t.a(activity.getLocalClassName(), InAppPurchaseActivityLifecycleTracker.BILLING_ACTIVITY_NAME)) {
                    FacebookSdk.getExecutor().execute(new Runnable() { // from class: com.facebook.appevents.iap.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            InAppPurchaseActivityLifecycleTracker.AnonymousClass2.onActivityStopped$lambda$1();
                        }
                    });
                }
            } catch (Exception unused) {
            }
        }
    }

    private InAppPurchaseActivityLifecycleTracker() {
    }

    private final void initializeIfNotInitialized() {
        if (hasBillingService != null) {
            return;
        }
        Boolean boolValueOf = Boolean.valueOf(InAppPurchaseUtils.getClass(SERVICE_INTERFACE_NAME) != null);
        hasBillingService = boolValueOf;
        if (t.a(boolValueOf, Boolean.FALSE)) {
            return;
        }
        hasBillingActivity = Boolean.valueOf(InAppPurchaseUtils.getClass(BILLING_ACTIVITY_NAME) != null);
        InAppPurchaseEventManager.clearSkuDetailsCache();
        Intent intent2 = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
        t.e(intent2, "Intent(\"com.android.vend…ge(\"com.android.vending\")");
        intent = intent2;
        serviceConnection = new ServiceConnection() { // from class: com.facebook.appevents.iap.InAppPurchaseActivityLifecycleTracker.initializeIfNotInitialized.1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName name, IBinder service) {
                t.f(name, "name");
                t.f(service, "service");
                InAppPurchaseActivityLifecycleTracker inAppPurchaseActivityLifecycleTracker = InAppPurchaseActivityLifecycleTracker.INSTANCE;
                InAppPurchaseActivityLifecycleTracker.inAppBillingObj = InAppPurchaseEventManager.asInterface(FacebookSdk.getApplicationContext(), service);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName name) {
                t.f(name, "name");
            }
        };
        callbacks = new AnonymousClass2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logPurchase(Context context, ArrayList<String> arrayList, boolean z10) {
        if (arrayList.isEmpty()) {
            return;
        }
        HashMap map = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        for (String purchase : arrayList) {
            try {
                String sku = new JSONObject(purchase).getString("productId");
                t.e(sku, "sku");
                t.e(purchase, "purchase");
                map.put(sku, purchase);
                arrayList2.add(sku);
            } catch (JSONException e10) {
                Log.e(TAG, "Error parsing in-app purchase data.", e10);
            }
        }
        for (Map.Entry<String, String> entry : InAppPurchaseEventManager.getSkuDetails(context, arrayList2, inAppBillingObj, z10).entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            String str = (String) map.get(key);
            if (str != null) {
                AutomaticAnalyticsLogger.logPurchase$default(str, value, z10, billingClientVersion, false, 16, null);
            }
        }
    }

    public static final void startIapLogging(InAppPurchaseUtils.BillingClientVersion billingClientVersion2) {
        t.f(billingClientVersion2, "billingClientVersion");
        InAppPurchaseActivityLifecycleTracker inAppPurchaseActivityLifecycleTracker = INSTANCE;
        inAppPurchaseActivityLifecycleTracker.initializeIfNotInitialized();
        if (!t.a(hasBillingService, Boolean.FALSE) && AutomaticAnalyticsLogger.isImplicitPurchaseLoggingEnabled()) {
            billingClientVersion = billingClientVersion2;
            inAppPurchaseActivityLifecycleTracker.startTracking();
        }
    }

    private final void startTracking() {
        if (isTracking.compareAndSet(false, true)) {
            Context applicationContext = FacebookSdk.getApplicationContext();
            if (applicationContext instanceof Application) {
                Application application = (Application) applicationContext;
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = callbacks;
                ServiceConnection serviceConnection2 = null;
                if (activityLifecycleCallbacks == null) {
                    t.u("callbacks");
                    activityLifecycleCallbacks = null;
                }
                application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                Intent intent2 = intent;
                if (intent2 == null) {
                    t.u(SDKConstants.PARAM_INTENT);
                    intent2 = null;
                }
                ServiceConnection serviceConnection3 = serviceConnection;
                if (serviceConnection3 == null) {
                    t.u("serviceConnection");
                } else {
                    serviceConnection2 = serviceConnection3;
                }
                applicationContext.bindService(intent2, serviceConnection2, 1);
            }
        }
    }
}
