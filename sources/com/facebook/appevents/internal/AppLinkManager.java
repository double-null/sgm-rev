package com.facebook.appevents.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import kotlin.jvm.internal.t;
import org.json.JSONObject;
import wc.k;
import wc.m;

/* JADX INFO: compiled from: AppLinkManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AppLinkManager {
    public static final String APPLINK_DATA_KEY = "al_applink_data";
    public static final String APPLINK_INFO = "com.facebook.sdk.APPLINK_INFO";
    public static final String CAMPAIGN_IDS_KEY = "campaign_ids";
    public static final String CLICK_ID_KEY = "click_id";
    public static final Companion Companion = new Companion(null);
    private static volatile AppLinkManager instance;
    private final k preferences$delegate;

    /* JADX INFO: compiled from: AppLinkManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final AppLinkManager getInstance() {
            AppLinkManager appLinkManagerAccess$getInstance$cp = AppLinkManager.access$getInstance$cp();
            if (appLinkManagerAccess$getInstance$cp == null) {
                synchronized (this) {
                    kotlin.jvm.internal.k kVar = null;
                    if (!FacebookSdk.isInitialized()) {
                        return null;
                    }
                    appLinkManagerAccess$getInstance$cp = AppLinkManager.access$getInstance$cp();
                    if (appLinkManagerAccess$getInstance$cp == null) {
                        appLinkManagerAccess$getInstance$cp = new AppLinkManager(kVar);
                        AppLinkManager.access$setInstance$cp(appLinkManagerAccess$getInstance$cp);
                    }
                }
            }
            return appLinkManagerAccess$getInstance$cp;
        }
    }

    public /* synthetic */ AppLinkManager(kotlin.jvm.internal.k kVar) {
        this();
    }

    public static final /* synthetic */ AppLinkManager access$getInstance$cp() {
        if (CrashShieldHandler.isObjectCrashing(AppLinkManager.class)) {
            return null;
        }
        try {
            return instance;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppLinkManager.class);
            return null;
        }
    }

    public static final /* synthetic */ void access$setInstance$cp(AppLinkManager appLinkManager) {
        if (CrashShieldHandler.isObjectCrashing(AppLinkManager.class)) {
            return;
        }
        try {
            instance = appLinkManager;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppLinkManager.class);
        }
    }

    private final SharedPreferences getPreferences() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Object value = this.preferences$delegate.getValue();
            t.e(value, "<get-preferences>(...)");
            return (SharedPreferences) value;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final String getCampaignIDFromIntentExtra(Intent intent) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            t.f(intent, "intent");
            Bundle bundleExtra = intent.getBundleExtra("al_applink_data");
            if (bundleExtra == null) {
                return null;
            }
            return bundleExtra.getString(CAMPAIGN_IDS_KEY);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final String getCampaignIDFromUri(Uri uri) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            t.f(uri, "uri");
            String queryParameter = uri.getQueryParameter("al_applink_data");
            if (queryParameter == null) {
                return null;
            }
            try {
                return new JSONObject(queryParameter).getString(CAMPAIGN_IDS_KEY);
            } catch (Exception unused) {
                Log.d("AppLinkManager", "Fail to parse Applink data from Uri");
                return null;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final String getInfo(String key) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            t.f(key, "key");
            return getPreferences().getString(key, null);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final void handleURL(Activity activity) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            t.f(activity, "activity");
            Uri data = activity.getIntent().getData();
            if (data == null) {
                return;
            }
            Intent intent = activity.getIntent();
            t.e(intent, "activity.intent");
            processCampaignIds(data, intent);
            processClickId(data);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void processCampaignIds(Uri uri, Intent intent) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            t.f(uri, "uri");
            t.f(intent, "intent");
            String campaignIDFromUri = getCampaignIDFromUri(uri);
            if (campaignIDFromUri == null) {
                campaignIDFromUri = getCampaignIDFromIntentExtra(intent);
            }
            if (campaignIDFromUri != null) {
                getPreferences().edit().putString(CAMPAIGN_IDS_KEY, campaignIDFromUri).apply();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void processClickId(Uri uri) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            t.f(uri, "uri");
            String queryParameter = uri.getQueryParameter("fbclid");
            if (queryParameter == null || queryParameter.length() == 0) {
                return;
            }
            getPreferences().edit().putString(CLICK_ID_KEY, queryParameter).apply();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void setupLifecycleListener(Application application) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            t.f(application, "application");
            application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.facebook.appevents.internal.AppLinkManager.setupLifecycleListener.1
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
                    AppLinkManager companion = AppLinkManager.Companion.getInstance();
                    if (companion != null) {
                        companion.handleURL(activity);
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    t.f(activity, "activity");
                    t.f(bundle, "bundle");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(Activity activity) {
                    t.f(activity, "activity");
                    AppLinkManager companion = AppLinkManager.Companion.getInstance();
                    if (companion != null) {
                        companion.handleURL(activity);
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(Activity activity) {
                    t.f(activity, "activity");
                }
            });
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private AppLinkManager() {
        this.preferences$delegate = m.a(AppLinkManager$preferences$2.INSTANCE);
    }
}
