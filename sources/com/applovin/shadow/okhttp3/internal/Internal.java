package com.applovin.shadow.okhttp3.internal;

import com.applovin.shadow.okhttp3.Cache;
import com.applovin.shadow.okhttp3.ConnectionSpec;
import com.applovin.shadow.okhttp3.Cookie;
import com.applovin.shadow.okhttp3.Headers;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.applovin.shadow.okhttp3.Request;
import com.applovin.shadow.okhttp3.Response;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: internal.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Internal {
    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String line) {
        t.f(builder, "builder");
        t.f(line, "line");
        return builder.addLenient$okhttp(line);
    }

    public static final void applyConnectionSpec(ConnectionSpec connectionSpec, SSLSocket sslSocket, boolean z10) {
        t.f(connectionSpec, "connectionSpec");
        t.f(sslSocket, "sslSocket");
        connectionSpec.apply$okhttp(sslSocket, z10);
    }

    public static final Response cacheGet(Cache cache, Request request) {
        t.f(cache, "cache");
        t.f(request, "request");
        return cache.get$okhttp(request);
    }

    public static final String cookieToString(Cookie cookie, boolean z10) {
        t.f(cookie, "cookie");
        return cookie.toString$okhttp(z10);
    }

    public static final Cookie parseCookie(long j10, HttpUrl url, String setCookie) {
        t.f(url, "url");
        t.f(setCookie, "setCookie");
        return Cookie.Companion.parse$okhttp(j10, url, setCookie);
    }

    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String name, String value) {
        t.f(builder, "builder");
        t.f(name, "name");
        t.f(value, "value");
        return builder.addLenient$okhttp(name, value);
    }
}
