package com.applovin.shadow.okhttp3;

import com.applovin.shadow.okio.ByteString;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: WebSocketListener.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class WebSocketListener {
    public void onClosed(WebSocket webSocket, int i10, String reason) {
        t.f(webSocket, "webSocket");
        t.f(reason, "reason");
    }

    public void onClosing(WebSocket webSocket, int i10, String reason) {
        t.f(webSocket, "webSocket");
        t.f(reason, "reason");
    }

    public void onFailure(WebSocket webSocket, Throwable t10, Response response) {
        t.f(webSocket, "webSocket");
        t.f(t10, "t");
    }

    public void onMessage(WebSocket webSocket, ByteString bytes) {
        t.f(webSocket, "webSocket");
        t.f(bytes, "bytes");
    }

    public void onOpen(WebSocket webSocket, Response response) {
        t.f(webSocket, "webSocket");
        t.f(response, "response");
    }

    public void onMessage(WebSocket webSocket, String text) {
        t.f(webSocket, "webSocket");
        t.f(text, "text");
    }
}
