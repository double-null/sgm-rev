package com.applovin.shadow.okhttp3.internal.connection;

import java.io.IOException;
import kotlin.jvm.internal.t;
import wc.f;

/* JADX INFO: compiled from: RouteException.kt */
/* JADX INFO: loaded from: classes.dex */
public final class RouteException extends RuntimeException {
    private final IOException firstConnectException;
    private IOException lastConnectException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteException(IOException firstConnectException) {
        super(firstConnectException);
        t.f(firstConnectException, "firstConnectException");
        this.firstConnectException = firstConnectException;
        this.lastConnectException = firstConnectException;
    }

    public final void addConnectException(IOException e10) {
        t.f(e10, "e");
        f.a(this.firstConnectException, e10);
        this.lastConnectException = e10;
    }

    public final IOException getFirstConnectException() {
        return this.firstConnectException;
    }

    public final IOException getLastConnectException() {
        return this.lastConnectException;
    }
}
