package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.internal.Utility;
import com.vungle.ads.internal.persistence.mP.RHIpdOnfgiYkEj;

/* JADX INFO: compiled from: AuthenticationTokenManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AuthenticationTokenManager {
    public static final String ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED = "com.facebook.sdk.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED";
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_NEW_AUTHENTICATION_TOKEN = "com.facebook.sdk.EXTRA_NEW_AUTHENTICATION_TOKEN";
    public static final String EXTRA_OLD_AUTHENTICATION_TOKEN = "com.facebook.sdk.EXTRA_OLD_AUTHENTICATION_TOKEN";
    public static final String SHARED_PREFERENCES_NAME = "com.facebook.AuthenticationTokenManager.SharedPreferences";
    public static final String TAG = "AuthenticationTokenManager";
    private static AuthenticationTokenManager instanceField;
    private final AuthenticationTokenCache authenticationTokenCache;
    private AuthenticationToken currentAuthenticationTokenField;
    private final n0.a localBroadcastManager;

    /* JADX INFO: compiled from: AuthenticationTokenManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final AuthenticationTokenManager getInstance() {
            AuthenticationTokenManager authenticationTokenManager;
            AuthenticationTokenManager authenticationTokenManager2 = AuthenticationTokenManager.instanceField;
            if (authenticationTokenManager2 != null) {
                return authenticationTokenManager2;
            }
            synchronized (this) {
                authenticationTokenManager = AuthenticationTokenManager.instanceField;
                if (authenticationTokenManager == null) {
                    n0.a aVarB = n0.a.b(FacebookSdk.getApplicationContext());
                    kotlin.jvm.internal.t.e(aVarB, "getInstance(applicationContext)");
                    AuthenticationTokenManager authenticationTokenManager3 = new AuthenticationTokenManager(aVarB, new AuthenticationTokenCache());
                    AuthenticationTokenManager.instanceField = authenticationTokenManager3;
                    authenticationTokenManager = authenticationTokenManager3;
                }
            }
            return authenticationTokenManager;
        }
    }

    /* JADX INFO: compiled from: AuthenticationTokenManager.kt */
    /* JADX INFO: loaded from: classes2.dex */
    public static final class CurrentAuthenticationTokenChangedBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            kotlin.jvm.internal.t.f(context, RHIpdOnfgiYkEj.nxBCZm);
            kotlin.jvm.internal.t.f(intent, "intent");
        }
    }

    public AuthenticationTokenManager(n0.a localBroadcastManager, AuthenticationTokenCache authenticationTokenCache) {
        kotlin.jvm.internal.t.f(localBroadcastManager, "localBroadcastManager");
        kotlin.jvm.internal.t.f(authenticationTokenCache, "authenticationTokenCache");
        this.localBroadcastManager = localBroadcastManager;
        this.authenticationTokenCache = authenticationTokenCache;
    }

    public static final AuthenticationTokenManager getInstance() {
        return Companion.getInstance();
    }

    private final void sendCurrentAuthenticationTokenChangedBroadcastIntent(AuthenticationToken authenticationToken, AuthenticationToken authenticationToken2) {
        Intent intent = new Intent(FacebookSdk.getApplicationContext(), (Class<?>) CurrentAuthenticationTokenChangedBroadcastReceiver.class);
        intent.setAction(ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED);
        intent.putExtra(EXTRA_OLD_AUTHENTICATION_TOKEN, authenticationToken);
        intent.putExtra(EXTRA_NEW_AUTHENTICATION_TOKEN, authenticationToken2);
        this.localBroadcastManager.d(intent);
    }

    public final void currentAuthenticationTokenChanged() {
        sendCurrentAuthenticationTokenChangedBroadcastIntent(getCurrentAuthenticationToken(), getCurrentAuthenticationToken());
    }

    public final AuthenticationToken getCurrentAuthenticationToken() {
        return this.currentAuthenticationTokenField;
    }

    public final boolean loadCurrentAuthenticationToken() {
        AuthenticationToken authenticationTokenLoad = this.authenticationTokenCache.load();
        if (authenticationTokenLoad == null) {
            return false;
        }
        setCurrentAuthenticationToken(authenticationTokenLoad, false);
        return true;
    }

    public final void setCurrentAuthenticationToken(AuthenticationToken authenticationToken) {
        setCurrentAuthenticationToken(authenticationToken, true);
    }

    private final void setCurrentAuthenticationToken(AuthenticationToken authenticationToken, boolean z10) {
        AuthenticationToken currentAuthenticationToken = getCurrentAuthenticationToken();
        this.currentAuthenticationTokenField = authenticationToken;
        if (z10) {
            if (authenticationToken != null) {
                this.authenticationTokenCache.save(authenticationToken);
            } else {
                this.authenticationTokenCache.clear();
                Utility.clearFacebookCookies(FacebookSdk.getApplicationContext());
            }
        }
        if (Utility.areObjectsEqual(currentAuthenticationToken, authenticationToken)) {
            return;
        }
        sendCurrentAuthenticationTokenChangedBroadcastIntent(currentAuthenticationToken, authenticationToken);
    }
}
