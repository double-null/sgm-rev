package com.vungle.ads.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.vungle.ads.internal.ui.PresenterAdOpenCallback;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import wc.g0;
import wc.r;
import wc.s;

/* JADX INFO: compiled from: ActivityManager.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ActivityManager implements Application.ActivityLifecycleCallbacks {
    private static final String TAG = "ActivityManager";
    private volatile int foregroundActivityCount;
    private volatile boolean isAppInForeground;
    private volatile TargetActivityInfo targetActivityInfo;
    public static final Companion Companion = new Companion(null);
    private static final ActivityManager instance = new ActivityManager();
    private final AtomicBoolean isInitialized = new AtomicBoolean(false);
    private final CopyOnWriteArraySet<LifeCycleCallback> callbacks = new CopyOnWriteArraySet<>();

    /* JADX INFO: compiled from: ActivityManager.kt */
    private static final class TargetActivityInfo {
        private final PresenterAdOpenCallback adOpenCallback;
        private final WeakReference<Context> context;
        private final Intent deepLinkOverrideIntent;
        private final Intent defaultIntent;

        public TargetActivityInfo(WeakReference<Context> context, Intent intent, Intent intent2, PresenterAdOpenCallback presenterAdOpenCallback) {
            t.f(context, "context");
            this.context = context;
            this.deepLinkOverrideIntent = intent;
            this.defaultIntent = intent2;
            this.adOpenCallback = presenterAdOpenCallback;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TargetActivityInfo copy$default(TargetActivityInfo targetActivityInfo, WeakReference weakReference, Intent intent, Intent intent2, PresenterAdOpenCallback presenterAdOpenCallback, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weakReference = targetActivityInfo.context;
            }
            if ((i10 & 2) != 0) {
                intent = targetActivityInfo.deepLinkOverrideIntent;
            }
            if ((i10 & 4) != 0) {
                intent2 = targetActivityInfo.defaultIntent;
            }
            if ((i10 & 8) != 0) {
                presenterAdOpenCallback = targetActivityInfo.adOpenCallback;
            }
            return targetActivityInfo.copy(weakReference, intent, intent2, presenterAdOpenCallback);
        }

        public final WeakReference<Context> component1() {
            return this.context;
        }

        public final Intent component2() {
            return this.deepLinkOverrideIntent;
        }

        public final Intent component3() {
            return this.defaultIntent;
        }

        public final PresenterAdOpenCallback component4() {
            return this.adOpenCallback;
        }

        public final TargetActivityInfo copy(WeakReference<Context> context, Intent intent, Intent intent2, PresenterAdOpenCallback presenterAdOpenCallback) {
            t.f(context, "context");
            return new TargetActivityInfo(context, intent, intent2, presenterAdOpenCallback);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TargetActivityInfo)) {
                return false;
            }
            TargetActivityInfo targetActivityInfo = (TargetActivityInfo) obj;
            return t.a(this.context, targetActivityInfo.context) && t.a(this.deepLinkOverrideIntent, targetActivityInfo.deepLinkOverrideIntent) && t.a(this.defaultIntent, targetActivityInfo.defaultIntent) && t.a(this.adOpenCallback, targetActivityInfo.adOpenCallback);
        }

        public final PresenterAdOpenCallback getAdOpenCallback() {
            return this.adOpenCallback;
        }

        public final WeakReference<Context> getContext() {
            return this.context;
        }

        public final Intent getDeepLinkOverrideIntent() {
            return this.deepLinkOverrideIntent;
        }

        public final Intent getDefaultIntent() {
            return this.defaultIntent;
        }

        public int hashCode() {
            int iHashCode = this.context.hashCode() * 31;
            Intent intent = this.deepLinkOverrideIntent;
            int iHashCode2 = (iHashCode + (intent == null ? 0 : intent.hashCode())) * 31;
            Intent intent2 = this.defaultIntent;
            int iHashCode3 = (iHashCode2 + (intent2 == null ? 0 : intent2.hashCode())) * 31;
            PresenterAdOpenCallback presenterAdOpenCallback = this.adOpenCallback;
            return iHashCode3 + (presenterAdOpenCallback != null ? presenterAdOpenCallback.hashCode() : 0);
        }

        public String toString() {
            return "TargetActivityInfo(context=" + this.context + ", deepLinkOverrideIntent=" + this.deepLinkOverrideIntent + ", defaultIntent=" + this.defaultIntent + ", adOpenCallback=" + this.adOpenCallback + ')';
        }
    }

    private ActivityManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addListener(LifeCycleCallback lifeCycleCallback) {
        this.callbacks.add(lifeCycleCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deInit(Context context) {
        Context applicationContext = context.getApplicationContext();
        t.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
        this.isInitialized.set(false);
        this.targetActivityInfo = null;
        this.foregroundActivityCount = 0;
        this.isAppInForeground = false;
        this.callbacks.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void init(Context context) {
        Object objC;
        if (this.isInitialized.getAndSet(true)) {
            return;
        }
        try {
            r.a aVar = r.f27774b;
            Context applicationContext = context.getApplicationContext();
            t.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            objC = r.c(g0.f27756a);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            objC = r.c(s.a(th));
        }
        Throwable thG = r.g(objC);
        if (thG != null) {
            Logger.Companion.e(TAG, "Error initializing ActivityManager", thG);
            this.isInitialized.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isAppInForeground() {
        return !this.isInitialized.get() || this.isAppInForeground;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean startActivitySafely(Context context, Intent intent, Intent intent2, PresenterAdOpenCallback presenterAdOpenCallback) {
        try {
            if (intent == null) {
                if (intent2 != null) {
                    context.startActivity(intent2);
                }
                return false;
            }
            context.startActivity(intent);
            if (presenterAdOpenCallback != null) {
                presenterAdOpenCallback.onDeeplinkClick(true);
            }
            return true;
        } catch (Exception e10) {
            Logger.Companion.e(TAG, "Failed to start activity: " + e10);
            if (intent != null && presenterAdOpenCallback != null) {
                try {
                    presenterAdOpenCallback.onDeeplinkClick(false);
                    if (intent != null) {
                        context.startActivity(intent2);
                        return true;
                    }
                } catch (Exception unused) {
                }
            } else if (intent != null && intent2 != null) {
                context.startActivity(intent2);
                return true;
            }
        }
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
        Iterator<T> it = this.callbacks.iterator();
        while (it.hasNext()) {
            ((LifeCycleCallback) it.next()).onActivityPaused(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        t.f(activity, "activity");
        Iterator<T> it = this.callbacks.iterator();
        while (it.hasNext()) {
            ((LifeCycleCallback) it.next()).onActivityResumed(activity);
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
        this.foregroundActivityCount++;
        if (this.isAppInForeground || this.foregroundActivityCount != 1) {
            return;
        }
        this.isAppInForeground = true;
        TargetActivityInfo targetActivityInfo = this.targetActivityInfo;
        if (targetActivityInfo != null) {
            Context it = targetActivityInfo.getContext().get();
            if (it != null) {
                Companion companion = Companion;
                t.e(it, "it");
                companion.startWhenForeground(it, targetActivityInfo.getDeepLinkOverrideIntent(), targetActivityInfo.getDefaultIntent(), targetActivityInfo.getAdOpenCallback());
            }
            this.targetActivityInfo = null;
        }
        Iterator<T> it2 = this.callbacks.iterator();
        while (it2.hasNext()) {
            ((LifeCycleCallback) it2.next()).onForeground();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        t.f(activity, "activity");
        this.foregroundActivityCount--;
        if (this.isAppInForeground && this.foregroundActivityCount == 0) {
            this.isAppInForeground = false;
            Iterator<T> it = this.callbacks.iterator();
            while (it.hasNext()) {
                ((LifeCycleCallback) it.next()).onBackground();
            }
        }
    }

    public final void removeListener(LifeCycleCallback callback) {
        t.f(callback, "callback");
        this.callbacks.remove(callback);
    }

    /* JADX INFO: compiled from: ActivityManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final void addLifecycleListener(LifeCycleCallback listener) {
            t.f(listener, "listener");
            getInstance$vungle_ads_release().addListener(listener);
        }

        public final void deInit$vungle_ads_release(Context context) {
            t.f(context, "context");
            getInstance$vungle_ads_release().deInit(context);
        }

        public final ActivityManager getInstance$vungle_ads_release() {
            return ActivityManager.instance;
        }

        public final void init(Context context) {
            t.f(context, "context");
            getInstance$vungle_ads_release().init(context);
        }

        public final boolean isForeground() {
            return getInstance$vungle_ads_release().isAppInForeground();
        }

        public final void removeLifecycleListener(LifeCycleCallback listener) {
            t.f(listener, "listener");
            getInstance$vungle_ads_release().removeListener(listener);
        }

        public final boolean startWhenForeground(Context context, Intent intent, Intent intent2, PresenterAdOpenCallback presenterAdOpenCallback) {
            t.f(context, "context");
            if (isForeground()) {
                return getInstance$vungle_ads_release().startActivitySafely(context, intent, intent2, presenterAdOpenCallback);
            }
            getInstance$vungle_ads_release().targetActivityInfo = new TargetActivityInfo(new WeakReference(context), intent, intent2, presenterAdOpenCallback);
            return false;
        }

        public static /* synthetic */ void getInstance$vungle_ads_release$annotations() {
        }
    }

    /* JADX INFO: compiled from: ActivityManager.kt */
    public static class LifeCycleCallback {
        public void onActivityPaused(Activity activity) {
            t.f(activity, "activity");
        }

        public void onActivityResumed(Activity activity) {
            t.f(activity, "activity");
        }

        public void onBackground() {
        }

        public void onForeground() {
        }
    }
}
