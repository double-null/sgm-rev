package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;

/* JADX INFO: compiled from: AuthenticationTokenTracker.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class AuthenticationTokenTracker {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = AuthenticationTokenTracker.class.getSimpleName();
    private final n0.a broadcastManager;
    private boolean isTracking;
    private final BroadcastReceiver receiver;

    /* JADX INFO: compiled from: AuthenticationTokenTracker.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: AuthenticationTokenTracker.kt */
    private final class CurrentAuthenticationTokenBroadcastReceiver extends BroadcastReceiver {
        public CurrentAuthenticationTokenBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            kotlin.jvm.internal.t.f(context, "context");
            kotlin.jvm.internal.t.f(intent, "intent");
            if (kotlin.jvm.internal.t.a(AuthenticationTokenManager.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED, intent.getAction())) {
                Utility.logd(AuthenticationTokenTracker.TAG, "AuthenticationTokenChanged");
                AuthenticationTokenTracker.this.onCurrentAuthenticationTokenChanged((AuthenticationToken) intent.getParcelableExtra(AuthenticationTokenManager.EXTRA_OLD_AUTHENTICATION_TOKEN), (AuthenticationToken) intent.getParcelableExtra(AuthenticationTokenManager.EXTRA_NEW_AUTHENTICATION_TOKEN));
            }
        }
    }

    public AuthenticationTokenTracker() {
        Validate.sdkInitialized();
        this.receiver = new CurrentAuthenticationTokenBroadcastReceiver();
        n0.a aVarB = n0.a.b(FacebookSdk.getApplicationContext());
        kotlin.jvm.internal.t.e(aVarB, "getInstance(FacebookSdk.getApplicationContext())");
        this.broadcastManager = aVarB;
        startTracking();
    }

    private final void addBroadcastReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(AuthenticationTokenManager.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED);
        this.broadcastManager.c(this.receiver, intentFilter);
    }

    public final boolean isTracking() {
        return this.isTracking;
    }

    protected abstract void onCurrentAuthenticationTokenChanged(AuthenticationToken authenticationToken, AuthenticationToken authenticationToken2);

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
