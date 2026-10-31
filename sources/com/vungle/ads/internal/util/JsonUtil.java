package com.vungle.ads.internal.util;

import kotlin.collections.o0;
import kotlin.jvm.internal.t;
import kotlinx.serialization.json.d0;
import kotlinx.serialization.json.i;
import kotlinx.serialization.json.k;

/* JADX INFO: compiled from: JsonUtil.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class JsonUtil {
    public static final JsonUtil INSTANCE = new JsonUtil();

    private JsonUtil() {
    }

    public final String getContentStringValue(d0 json, String key) {
        t.f(json, "json");
        t.f(key, "key");
        try {
            return k.k((i) o0.i(json, key)).a();
        } catch (Exception unused) {
            return null;
        }
    }
}
