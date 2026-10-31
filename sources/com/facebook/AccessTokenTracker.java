package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;

/* JADX INFO: compiled from: AccessTokenTracker.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class AccessTokenTracker {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = AccessTokenTracker.class.getSimpleName();
    private final n0.a broadcastManager;
    private boolean isTracking;
    private final BroadcastReceiver receiver;

    /* JADX INFO: compiled from: AccessTokenTracker.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: AccessTokenTracker.kt */
    private final class CurrentAccessTokenBroadcastReceiver extends BroadcastReceiver {
        public CurrentAccessTokenBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            kotlin.jvm.internal.t.f(context, "context");
            kotlin.jvm.internal.t.f(intent, "intent");
            if (kotlin.jvm.internal.t.a(AccessTokenManager.ACTION_CURRENT_ACCESS_TOKEN_CHANGED, intent.getAction())) {
                Utility.logd(AccessTokenTracker.TAG, "AccessTokenChanged");
                AccessTokenTracker.this.onCurrentAccessTokenChanged((AccessToken) intent.getParcelableExtra(AccessTokenManager.EXTRA_OLD_ACCESS_TOKEN), (AccessToken) intent.getParcelableExtra(AccessTokenManager.EXTRA_NEW_ACCESS_TOKEN));
            }
        }
    }

    public AccessTokenTracker() {
        Validate.sdkInitialized();
        this.receiver = new CurrentAccessTokenBroadcastReceiver();
        n0.a aVarB = n0.a.b(FacebookSdk.getApplicationContext());
        kotlin.jvm.internal.t.e(aVarB, "getInstance(FacebookSdk.getApplicationContext())");
        this.broadcastManager = aVarB;
        startTracking();
    }

    private final void addBroadcastReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(AccessTokenManager.ACTION_CURRENT_ACCESS_TOKEN_CHANGED);
        this.broadcastManager.c(this.receiver, intentFilter);
    }

    public final boolean isTracking() {
        return this.isTracking;
    }

    protected abstract void onCurrentAccessTokenChanged(AccessToken accessToken, AccessToken accessToken2);

    public final void startTracking() {
        if (this.isTracking) {
            return;
        }
        addBroadcastReceiver();
        this.isTracking = true;
    }

    public final void stopTracking() {
        if (this.isTracking) {
            this.broadcastManager.e(this.receiver);
            this.isTracking = false;
        }
    }
}
