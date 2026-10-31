package me;

import io.bidmachine.analytics.internal.s.bOI.CwEo;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: Challenge.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, String> f22409b;

    public final Charset a() {
        String str = this.f22409b.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                kotlin.jvm.internal.t.e(charsetForName, "forName(charset)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
        kotlin.jvm.internal.t.e(ISO_8859_1, "ISO_8859_1");
        return ISO_8859_1;
    }

    public final String b() {
        return this.f22409b.get("realm");
    }

    public final String c() {
        return this.f22408a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (kotlin.jvm.internal.t.a(hVar.f22408a, this.f22408a) && kotlin.jvm.internal.t.a(hVar.f22409b, this.f22409b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((899 + this.f22408a.hashCode()) * 31) + this.f22409b.hashCode();
    }

    public String toString() {
        return this.f22408a + " authParams=" + this.f22409b;
    }

    public h(String str, Map<String, String> authParams) {
        String lowerCase;
        kotlin.jvm.internal.t.f(str, CwEo.WQwJptF);
        kotlin.jvm.internal.t.f(authParams, "authParams");
        this.f22408a = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : authParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key == null) {
                lowerCase = null;
            } else {
                Locale US = Locale.US;
                kotlin.jvm.internal.t.e(US, "US");
                lowerCase = key.toLowerCase(US);
                kotlin.jvm.internal.t.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            }
            linkedHashMap.put(lowerCase, value);
        }
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.t.e(mapUnmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f22409b = mapUnmodifiableMap;
    }
}
