package com.applovin.shadow.okhttp3.internal.http;

import c2.YDwL.tFQWuE;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: HttpMethod.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class HttpMethod {
    public static final HttpMethod INSTANCE = new HttpMethod();

    private HttpMethod() {
    }

    public static final boolean permitsRequestBody(String method) {
        t.f(method, "method");
        return (t.a(method, "GET") || t.a(method, "HEAD")) ? false : true;
    }

    public static final boolean requiresRequestBody(String method) {
        t.f(method, "method");
        return t.a(method, "POST") || t.a(method, "PUT") || t.a(method, "PATCH") || t.a(method, "PROPPATCH") || t.a(method, "REPORT");
    }

    public final boolean redirectsToGet(String method) {
        t.f(method, "method");
        return !t.a(method, "PROPFIND");
    }

    public final boolean redirectsWithBody(String method) {
        t.f(method, "method");
        return t.a(method, "PROPFIND");
    }

    public final boolean invalidatesCache(String method) {
        t.f(method, "method");
        return t.a(method, tFQWuE.NfKo) || t.a(method, "PATCH") || t.a(method, "PUT") || t.a(method, "DELETE") || t.a(method, "MOVE");
    }
}
