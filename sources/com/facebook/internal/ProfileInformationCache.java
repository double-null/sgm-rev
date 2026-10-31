package com.facebook.internal;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: ProfileInformationCache.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ProfileInformationCache {
    public static final ProfileInformationCache INSTANCE = new ProfileInformationCache();
    private static final ConcurrentHashMap<String, JSONObject> infoCache = new ConcurrentHashMap<>();

    private ProfileInformationCache() {
    }

    public static final JSONObject getProfileInformation(String accessToken) {
        kotlin.jvm.internal.t.f(accessToken, "accessToken");
        return infoCache.get(accessToken);
    }

    public static final void putProfileInformation(String key, JSONObject value) {
        kotlin.jvm.internal.t.f(key, "key");
        kotlin.jvm.internal.t.f(value, "value");
        infoCache.put(key, value);
    }
}
