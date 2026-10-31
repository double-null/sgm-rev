package com.facebook;

import android.content.SharedPreferences;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ProfileCache.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ProfileCache {
    public static final String CACHED_PROFILE_KEY = "com.facebook.ProfileManager.CachedProfile";
    public static final Companion Companion = new Companion(null);
    public static final String SHARED_PREFERENCES_NAME = "com.facebook.AccessTokenManager.SharedPreferences";
    private final SharedPreferences sharedPreferences;

    /* JADX INFO: compiled from: ProfileCache.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    public ProfileCache() {
        SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        kotlin.jvm.internal.t.e(sharedPreferences, "getApplicationContext()\n…ME, Context.MODE_PRIVATE)");
        this.sharedPreferences = sharedPreferences;
    }

    public final void clear() {
        this.sharedPreferences.edit().remove(CACHED_PROFILE_KEY).apply();
    }

    public final Profile load() {
        String string = this.sharedPreferences.getString(CACHED_PROFILE_KEY, null);
        if (string != null) {
            try {
                return new Profile(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final void save(Profile profile) {
        kotlin.jvm.internal.t.f(profile, "profile");
        JSONObject jSONObject = profile.toJSONObject();
        if (jSONObject != null) {
            this.sharedPreferences.edit().putString(CACHED_PROFILE_KEY, jSONObject.toString()).apply();
        }
    }
}
