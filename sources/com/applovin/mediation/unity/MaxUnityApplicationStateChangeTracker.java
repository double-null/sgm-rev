package com.applovin.mediation.unity;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import com.pairip.VMRunner;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class MaxUnityApplicationStateChangeTracker {
    private final AtomicBoolean applicationPaused = new AtomicBoolean();
    private final MaxUnityApplicationStateCallback callback;

    public interface MaxUnityApplicationStateCallback {
        void onApplicationStateChanged(boolean z10);
    }

    protected MaxUnityApplicationStateChangeTracker(MaxUnityApplicationStateCallback maxUnityApplicationStateCallback) {
        this.callback = maxUnityApplicationStateCallback;
        Application application = Utils.getCurrentActivity().getApplication();
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.applovin.mediation.unity.MaxUnityApplicationStateChangeTracker.1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                MaxUnityApplicationStateChangeTracker.this.notifyApplicationResumedIfNeeded();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }
        });
        application.registerComponentCallbacks(new ComponentCallbacks2() { // from class: com.applovin.mediation.unity.MaxUnityApplicationStateChangeTracker.2
            @Override // android.content.ComponentCallbacks2
            public void onTrimMemory(int i10) {
                if (i10 == 20) {
                    MaxUnityApplicationStateChangeTracker.this.notifyApplicationPausedIfNeeded();
                }
            }

            @Override // android.content.ComponentCallbacks
            public void onLowMemory() {
            }

            @Override // android.content.ComponentCallbacks
            public void onConfigurationChanged(Configuration configuration) {
            }
        });
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        application.registerReceiver(new BroadcastReceiver() { // from class: com.applovin.mediation.unity.MaxUnityApplicationStateChangeTracker.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                VMRunner.invoke("Hcerp0neniJXnqd9", new Object[]{this, context, intent});
            }
        }, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyApplicationPausedIfNeeded() {
        if (this.applicationPaused.compareAndSet(false, true)) {
            this.callback.onApplicationStateChanged(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyApplicationResumedIfNeeded() {
        if (this.applicationPaused.compareAndSet(true, false)) {
            this.callback.onApplicationStateChanged(false);
        }
    }
}
