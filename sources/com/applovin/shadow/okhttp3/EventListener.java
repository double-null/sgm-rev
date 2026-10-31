package com.applovin.shadow.okhttp3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: EventListener.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class EventListener {
    public static final Companion Companion = new Companion(null);
    public static final EventListener NONE = new EventListener() { // from class: com.applovin.shadow.okhttp3.EventListener$Companion$NONE$1
    };

    /* JADX INFO: compiled from: EventListener.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: EventListener.kt */
    public interface Factory {
        EventListener create(Call call);
    }

    public void cacheConditionalHit(Call call, Response cachedResponse) {
        t.f(call, "call");
        t.f(cachedResponse, "cachedResponse");
    }

    public void cacheHit(Call call, Response response) {
        t.f(call, "call");
        t.f(response, "response");
    }

    public void cacheMiss(Call call) {
        t.f(call, "call");
    }

    public void callEnd(Call call) {
        t.f(call, "call");
    }

    public void callFailed(Call call, IOException ioe) {
        t.f(call, "call");
        t.f(ioe, "ioe");
    }

    public void callStart(Call call) {
        t.f(call, "call");
    }

    public void canceled(Call call) {
        t.f(call, "call");
    }

    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        t.f(call, "call");
        t.f(inetSocketAddress, "inetSocketAddress");
        t.f(proxy, "proxy");
    }

    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException ioe) {
        t.f(call, "call");
        t.f(inetSocketAddress, "inetSocketAddress");
        t.f(proxy, "proxy");
        t.f(ioe, "ioe");
    }

    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        t.f(call, "call");
        t.f(inetSocketAddress, "inetSocketAddress");
        t.f(proxy, "proxy");
    }

    public void connectionAcquired(Call call, Connection connection) {
        t.f(call, "call");
        t.f(connection, "connection");
    }

    public void connectionReleased(Call call, Connection connection) {
        t.f(call, "call");
        t.f(connection, "connection");
    }

    public void dnsEnd(Call call, String domainName, List<InetAddress> inetAddressList) {
        t.f(call, "call");
        t.f(domainName, "domainName");
        t.f(inetAddressList, "inetAddressList");
    }

    public void dnsStart(Call call, String domainName) {
        t.f(call, "call");
        t.f(domainName, "domainName");
    }

    public void proxySelectEnd(Call call, HttpUrl url, List<Proxy> proxies) {
        t.f(call, "call");
        t.f(url, "url");
        t.f(proxies, "proxies");
    }

    public void proxySelectStart(Call call, HttpUrl url) {
        t.f(call, "call");
        t.f(url, "url");
    }

    public void requestBodyEnd(Call call, long j10) {
        t.f(call, "call");
    }

    public void requestBodyStart(Call call) {
        t.f(call, "call");
    }

    public void requestFailed(Call call, IOException ioe) {
        t.f(call, "call");
        t.f(ioe, "ioe");
    }

    public void requestHeadersEnd(Call call, Request request) {
        t.f(call, "call");
        t.f(request, "request");
    }

    public void requestHeadersStart(Call call) {
        t.f(call, "call");
    }

    public void responseBodyEnd(Call call, long j10) {
        t.f(call, "call");
    }

    public void responseBodyStart(Call call) {
        t.f(call, "call");
    }

    public void responseFailed(Call call, IOException ioe) {
        t.f(call, "call");
        t.f(ioe, "ioe");
    }

    public void responseHeadersEnd(Call call, Response response) {
        t.f(call, "call");
        t.f(response, "response");
    }

    public void responseHeadersStart(Call call) {
        t.f(call, "call");
    }

    public void satisfactionFailure(Call call, Response response) {
        t.f(call, "call");
        t.f(response, "response");
    }

    public void secureConnectEnd(Call call, Handshake handshake) {
        t.f(call, "call");
    }

    public void secureConnectStart(Call call) {
        t.f(call, "call");
    }
}
