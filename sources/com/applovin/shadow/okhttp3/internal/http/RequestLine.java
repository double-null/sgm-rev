package com.applovin.shadow.okhttp3.internal.http;

import com.applovin.shadow.okhttp3.HttpUrl;
import com.applovin.shadow.okhttp3.Request;
import java.net.Proxy;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: RequestLine.kt */
/* JADX INFO: loaded from: classes.dex */
public final class RequestLine {
    public static final RequestLine INSTANCE = new RequestLine();

    private RequestLine() {
    }

    private final boolean includeAuthorityInRequestLine(Request request, Proxy.Type type) {
        return !request.isHttps() && type == Proxy.Type.HTTP;
    }

    public final String get(Request request, Proxy.Type proxyType) {
        t.f(request, "request");
        t.f(proxyType, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.method());
        sb2.append(' ');
        RequestLine requestLine = INSTANCE;
        if (requestLine.includeAuthorityInRequestLine(request, proxyType)) {
            sb2.append(request.url());
        } else {
            sb2.append(requestLine.requestPath(request.url()));
        }
        sb2.append(" HTTP/1.1");
        String string = sb2.toString();
        t.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String requestPath(HttpUrl url) {
        t.f(url, "url");
        String strEncodedPath = url.encodedPath();
        String strEncodedQuery = url.encodedQuery();
        if (strEncodedQuery == null) {
            return strEncodedPath;
        }
        return strEncodedPath + '?' + strEncodedQuery;
    }
}
