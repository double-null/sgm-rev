package com.facebook.appevents.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.aam.MetadataIndexer;
import com.facebook.appevents.codeless.CodelessManager;
import com.facebook.appevents.iap.InAppPurchaseManager;
import com.facebook.appevents.suggestedevents.SuggestedEventsManager;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.google.firebase.provider.fH.UyXgnuLGEkgnZE;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.t;
import rd.f0;
import wc.g0;

/* JADX INFO: compiled from: ActivityLifecycleTracker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ActivityLifecycleTracker {
    private static final String INCORRECT_IMPL_WARNING = "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method";
    public static final ActivityLifecycleTracker INSTANCE = new ActivityLifecycleTracker();
    private static final long INTERRUPTION_THRESHOLD_MILLISECONDS = 1000;
    private static final String TAG;
    private static int activityReferences;
    private static String appId;
    private static WeakReference<Activity> currActivity;
    private static long currentActivityAppearTime;
    private static volatile ScheduledFuture<?> currentFuture;
    private static final Object currentFutureLock;
    private static volatile SessionInfo currentSession;
    private static final AtomicInteger foregroundActivityCount;
    private static final ScheduledExecutorService iapExecutor;
    private static String previousActivityName;
    private static final ScheduledExecutorService singleThreadExecutor;
    private static final AtomicBoolean tracking;

    static {
        String canonicalName = ActivityLifecycleTracker.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        TAG = canonicalName;
        singleThreadExecutor = Executors.newSingleThreadScheduledExecutor();
        iapExecutor = Executors.newSingleThreadScheduledExecutor();
        currentFutureLock = new Object();
        foregroundActivityCount = new AtomicInteger(0);
        tracking = new AtomicBoolean(false);
    }

    private ActivityLifecycleTracker() {
    }

    private final void cancelCurrentTask() {
        ScheduledFuture<?> scheduledFuture;
        synchronized (currentFutureLock) {
            if (currentFuture != null && (scheduledFuture = currentFuture) != null) {
                scheduledFuture.cancel(false);
            }
            currentFuture = null;
            g0 g0Var = g0.f27756a;
        }
    }

    public static final Activity getCurrentActivity() {
        WeakReference<Activity> weakReference = currActivity;
        if (weakReference == null || weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public static final UUID getCurrentSessionGuid() {
        SessionInfo sessionInfo;
        if (currentSession == null || (sessionInfo = currentSession) == null) {
            return null;
        }
        return sessionInfo.getSessionId();
    }

    private final int getSessionTimeoutInSeconds() {
        FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
        return appSettingsWithoutQuery == null ? Constants.getDefaultAppEventsSessionTimeoutInSeconds() : appSettingsWithoutQuery.getSessionTimeoutInSeconds();
    }

    public static final boolean isInBackground() {
        return activityReferences == 0;
    }

    public static final boolean isTracking() {
        return tracking.get();
    }

    public static final void onActivityCreated(Activity activity) {
        singleThreadExecutor.execute(new Runnable() { // from class: com.facebook.appevents.internal.f
            @Override // java.lang.Runnable
            public final void run() {
                ActivityLifecycleTracker.onActivityCreated$lambda$1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onActivityCreated$lambda$1() {
        if (currentSession == null) {
            currentSession = SessionInfo.Companion.getStoredSessionInfo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onActivityDestroyed(Activity activity) {
        CodelessManager.onActivityDestroyed(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onActivityPaused(Activity activity) {
        AtomicInteger atomicInteger = foregroundActivityCount;
        if (atomicInteger.decrementAndGet() < 0) {
            atomicInteger.set(0);
            Log.w(TAG, INCORRECT_IMPL_WARNING);
        }
        cancelCurrentTask();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final String activityName = Utility.getActivityName(activity);
        CodelessManager.onActivityPaused(activity);
        singleThreadExecutor.execute(new Runnable() { // from class: com.facebook.appevents.internal.a
            @Override // java.lang.Runnable
            public final void run() {
                ActivityLifecycleTracker.onActivityPaused$lambda$7(jCurrentTimeMillis, activityName);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onActivityPaused$lambda$7(final long j10, final String activityName) {
        t.f(activityName, "$activityName");
        if (currentSession == null) {
            currentSession = new SessionInfo(Long.valueOf(j10), null, null, 4, null);
        }
        SessionInfo sessionInfo = currentSession;
        if (sessionInfo != null) {
            sessionInfo.setSessionLastEventTime(Long.valueOf(j10));
        }
        if (foregroundActivityCount.get() <= 0) {
            Runnable runnable = new Runnable() { // from class: com.facebook.appevents.internal.d
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityLifecycleTracker.onActivityPaused$lambda$7$lambda$5(j10, activityName);
                }
            };
            synchronized (currentFutureLock) {
                currentFuture = singleThreadExecutor.schedule(runnable, INSTANCE.getSessionTimeoutInSeconds(), TimeUnit.SECONDS);
                g0 g0Var = g0.f27756a;
            }
        }
        long j11 = currentActivityAppearTime;
        AutomaticAnalyticsLogger.logActivityTimeSpentEvent(activityName, j11 > 0 ? (j10 - j11) / ((long) 1000) : 0L);
        SessionInfo sessionInfo2 = currentSession;
        if (sessionInfo2 != null) {
            sessionInfo2.writeSessionToDisk();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onActivityPaused$lambda$7$lambda$5(long j10, String activityName) {
        t.f(activityName, "$activityName");
        if (currentSession == null) {
            currentSession = new SessionInfo(Long.valueOf(j10), null, null, 4, null);
        }
        if (foregroundActivityCount.get() <= 0) {
            SessionLogger.logDeactivateApp(activityName, currentSession, appId);
            SessionInfo.Companion.clearSavedSessionFromDisk();
            currentSession = null;
        }
        synchronized (currentFutureLock) {
            currentFuture = null;
            g0 g0Var = g0.f27756a;
        }
    }

    public static final void onActivityResumed(Activity activity) {
        t.f(activity, "activity");
        currActivity = new WeakReference<>(activity);
        foregroundActivityCount.incrementAndGet();
        INSTANCE.cancelCurrentTask();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        currentActivityAppearTime = jCurrentTimeMillis;
        final String activityName = Utility.getActivityName(activity);
        CodelessManager.onActivityResumed(activity);
        MetadataIndexer.onActivityResumed(activity);
        SuggestedEventsManager.trackActivity(activity);
        String str = previousActivityName;
        boolean z10 = false;
        if (str != null && f0.U(str, "ProxyBillingActivity", false, 2, null)) {
            z10 = true;
        }
        if (z10 && !t.a(activityName, "ProxyBillingActivity")) {
            iapExecutor.execute(new Runnable() { // from class: com.facebook.appevents.internal.b
                @Override // java.lang.Runnable
                public final void run() {
                    InAppPurchaseManager.startTracking();
                }
            });
        }
        final Context applicationContext = activity.getApplicationContext();
        singleThreadExecutor.execute(new Runnable() { // from class: com.facebook.appevents.internal.c
            @Override // java.lang.Runnable
            public final void run() {
                ActivityLifecycleTracker.onActivityResumed$lambda$3(jCurrentTimeMillis, activityName, applicationContext);
            }
        });
        previousActivityName = activityName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onActivityResumed$lambda$3(long j10, String activityName, Context appContext) {
        SessionInfo sessionInfo;
        t.f(activityName, "$activityName");
        SessionInfo sessionInfo2 = currentSession;
        Long sessionLastEventTime = sessionInfo2 != null ? sessionInfo2.getSessionLastEventTime() : null;
        if (currentSession == null) {
            currentSession = new SessionInfo(Long.valueOf(j10), null, null, 4, null);
            String str = appId;
            t.e(appContext, "appContext");
            SessionLogger.logActivateApp(activityName, null, str, appContext);
        } else if (sessionLastEventTime != null) {
            long jLongValue = j10 - sessionLastEventTime.longValue();
            if (jLongValue > INSTANCE.getSessionTimeoutInSeconds() * 1000) {
                SessionLogger.logDeactivateApp(activityName, currentSession, appId);
                String str2 = appId;
                t.e(appContext, "appContext");
                SessionLogger.logActivateApp(activityName, null, str2, appContext);
                currentSession = new SessionInfo(Long.valueOf(j10), null, null, 4, null);
            } else if (jLongValue > INTERRUPTION_THRESHOLD_MILLISECONDS && (sessionInfo = currentSession) != null) {
                sessionInfo.incrementInterruptionCount();
            }
        }
        SessionInfo sessionInfo3 = currentSession;
        if (sessionInfo3 != null) {
            sessionInfo3.setSessionLastEventTime(Long.valueOf(j10));
        }
        SessionInfo sessionInfo4 = currentSession;
        if (sessionInfo4 != null) {
            sessionInfo4.writeSessionToDisk();
        }
    }

    public static final void startTracking(Application application, String str) {
        t.f(application, "application");
        if (tracking.compareAndSet(false, true)) {
            FeatureManager.checkFeature(FeatureManager.Feature.CodelessEvents, new FeatureManager.Callback() { // from class: com.facebook.appevents.internal.e
                @Override // com.facebook.internal.FeatureManager.Callback
                public final void onCompleted(boolean z10) {
                    ActivityLifecycleTracker.startTracking$lambda$0(z10);
                }
            });
            appId = str;
            application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.facebook.appevents.internal.ActivityLifecycleTracker.startTracking.2
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    t.f(activity, "activity");
                    Logger.Companion.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.TAG, "onActivityCreated");
                    AppEventUtility.assertIsMainThread();
                    ActivityLifecycleTracker.onActivityCreated(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(Activity activity) {
                    t.f(activity, "activity");
                    Logger.Companion.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.TAG, "onActivityDestroyed");
                    ActivityLifecycleTracker.INSTANCE.onActivityDestroyed(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(Activity activity) {
                    t.f(activity, "activity");
                    Logger.Companion.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.TAG, "onActivityPaused");
                    AppEventUtility.assertIsMainThread();
                    ActivityLifecycleTracker.INSTANCE.onActivityPaused(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(Activity activity) {
                    t.f(activity, "activity");
                    Logger.Companion.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.TAG, "onActivityResumed");
                    AppEventUtility.assertIsMainThread();
                    ActivityLifecycleTracker.onActivityResumed(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(Activity activity) {
                    t.f(activity, "activity");
                    ActivityLifecycleTracker.activityReferences++;
                    Logger.Companion.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.TAG, "onActivityStarted");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(Activity activity) {
                    t.f(activity, "activity");
                    Logger.Companion.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.TAG, "onActivityStopped");
                    AppEventsLogger.Companion.onContextStop();
                    ActivityLifecycleTracker.activityReferences--;
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
                    t.f(activity, UyXgnuLGEkgnZE.xxhwqPm);
                    t.f(outState, "outState");
                    Logger.Companion.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.TAG, "onActivitySaveInstanceState");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTracking$lambda$0(boolean z10) {
        if (z10) {
            CodelessManager.enable();
        } else {
            CodelessManager.disable();
        }
    }
}
