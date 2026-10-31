package com.facebook;

import android.content.SharedPreferences;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: AuthenticationTokenCache.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AuthenticationTokenCache {
    public static final String CACHED_AUTHENTICATION_TOKEN_KEY = "com.facebook.AuthenticationManager.CachedAuthenticationToken";
    public static final Companion Companion = new Companion(null);
    private final SharedPreferences sharedPreferences;

    /* JADX INFO: compiled from: AuthenticationTokenCache.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    public AuthenticationTokenCache(SharedPreferences sharedPreferences) {
        kotlin.jvm.internal.t.f(sharedPreferences, "sharedPreferences");
        this.sharedPreferences = sharedPreferences;
    }

    private final AuthenticationToken getCachedAuthenticationToken() {
        String string = this.sharedPreferences.getString(CACHED_AUTHENTICATION_TOKEN_KEY, null);
        if (string == null) {
            return null;
        }
        try {
            return new AuthenticationToken(new JSONObject(string));
        } catch (JSONException unused) {
            return null;
        }
    }

    private final boolean hasCachedAuthenticationToken() {
        return this.sharedPreferences.contains(CACHED_AUTHENTICATION_TOKEN_KEY);
    }

    public final void clear() {
        this.sharedPreferences.edit().remove(CACHED_AUTHENTICATION_TOKEN_KEY).apply();
    }

    public final AuthenticationToken load() {
        if (hasCachedAuthenticationToken()) {
            return getCachedAuthenticationToken();
        }
        return null;
    }

    public final void save(AuthenticationToken authenticationToken) {
        kotlin.jvm.internal.t.f(authenticationToken, "authenticationToken");
        try {
            this.sharedPreferences.edit().putString(CACHED_AUTHENTICATION_TOKEN_KEY, authenticationToken.toJSONObject$facebook_core_release().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AuthenticationTokenCache() {
        SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences(AuthenticationTokenManager.SHARED_PREFERENCES_NAME, 0);
        kotlin.jvm.internal.t.e(sharedPreferences, "getApplicationContext()\n…ME, Context.MODE_PRIVATE)");
        this(sharedPreferences);
    }
}
