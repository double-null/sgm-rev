package com.applovin.shadow.okio;

/* JADX INFO: renamed from: com.applovin.shadow.okio.-GzipSinkExtensions, reason: invalid class name */
/* JADX INFO: compiled from: GzipSink.kt */
/* JADX INFO: loaded from: classes.dex */
public final class GzipSinkExtensions {
    public static final GzipSink gzip(Sink sink) {
        kotlin.jvm.internal.t.f(sink, "<this>");
        return new GzipSink(sink);
    }
}
