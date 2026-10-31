package com.applovin.shadow.okhttp3;

import com.android.billingclient.gp.VRfCTjjLv;
import com.google.firebase.crashlytics.internal.RPrM.UICvx;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.o0;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: Challenge.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Challenge {
    private final Map<String, String> authParams;
    private final String scheme;

    public Challenge(String scheme, Map<String, String> authParams) {
        String lowerCase;
        t.f(scheme, "scheme");
        t.f(authParams, "authParams");
        this.scheme = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : authParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale US = Locale.US;
                t.e(US, "US");
                lowerCase = key.toLowerCase(US);
                t.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, value);
        }
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        t.e(mapUnmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.authParams = mapUnmodifiableMap;
    }

    /* JADX INFO: renamed from: -deprecated_authParams, reason: not valid java name */
    public final Map<String, String> m26deprecated_authParams() {
        return this.authParams;
    }

    /* JADX INFO: renamed from: -deprecated_charset, reason: not valid java name */
    public final Charset m27deprecated_charset() {
        return charset();
    }

    /* JADX INFO: renamed from: -deprecated_realm, reason: not valid java name */
    public final String m28deprecated_realm() {
        return realm();
    }

    /* JADX INFO: renamed from: -deprecated_scheme, reason: not valid java name */
    public final String m29deprecated_scheme() {
        return this.scheme;
    }

    public final Map<String, String> authParams() {
        return this.authParams;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Challenge) {
            Challenge challenge = (Challenge) obj;
            if (t.a(challenge.scheme, this.scheme) && t.a(challenge.authParams, this.authParams)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((899 + this.scheme.hashCode()) * 31) + this.authParams.hashCode();
    }

    public final String realm() {
        return this.authParams.get("realm");
    }

    public final String scheme() {
        return this.scheme;
    }

    public final Challenge withCharset(Charset charset) {
        t.f(charset, "charset");
        Map mapU = o0.u(this.authParams);
        String strName = charset.name();
        t.e(strName, "charset.name()");
        mapU.put("charset", strName);
        return new Challenge(this.scheme, (Map<String, String>) mapU);
    }

    public final Charset charset() {
        String str = this.authParams.get(VRfCTjjLv.eer);
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                t.e(charsetForName, "forName(charset)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
        t.e(ISO_8859_1, "ISO_8859_1");
        return ISO_8859_1;
    }

    public String toString() {
        return this.scheme + UICvx.GmTnWlwTqACtPK + this.authParams;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Challenge(String scheme, String realm) {
        t.f(scheme, "scheme");
        t.f(realm, "realm");
        Map mapSingletonMap = Collections.singletonMap("realm", realm);
        t.e(mapSingletonMap, "singletonMap(\"realm\", realm)");
        this(scheme, (Map<String, String>) mapSingletonMap);
    }
}
