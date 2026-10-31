package com.applovin.shadow.okio;

import java.util.zip.Deflater;

/* JADX INFO: renamed from: com.applovin.shadow.okio.-DeflaterSinkExtensions, reason: invalid class name */
/* JADX INFO: compiled from: DeflaterSink.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DeflaterSinkExtensions {
    public static final DeflaterSink deflate(Sink sink, Deflater deflater) {
        kotlin.jvm.internal.t.f(sink, "<this>");
        kotlin.jvm.internal.t.f(deflater, "deflater");
        return new DeflaterSink(sink, deflater);
    }

    public static /* synthetic */ DeflaterSink deflate$default(Sink sink, Deflater deflater, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            deflater = new Deflater();
        }
        kotlin.jvm.internal.t.f(sink, "<this>");
        kotlin.jvm.internal.t.f(deflater, "deflater");
        return new DeflaterSink(sink, deflater);
    }
}
