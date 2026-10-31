package io.bidmachine.analytics.internal.w;

import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes4.dex */
public enum c {
    Get("GET"),
    f17469c("POST");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f17471a;

    c(String str) {
        this.f17471a = str;
    }

    public final void a(URLConnection uRLConnection) throws ProtocolException {
        if (uRLConnection instanceof HttpURLConnection) {
            ((HttpURLConnection) uRLConnection).setRequestMethod(this.f17471a);
        }
    }
}
