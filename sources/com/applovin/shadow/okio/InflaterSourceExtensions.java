package com.applovin.shadow.okio;

import b2.Bo.yeILL;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: com.applovin.shadow.okio.-InflaterSourceExtensions, reason: invalid class name */
/* JADX INFO: compiled from: InflaterSource.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class InflaterSourceExtensions {
    public static final InflaterSource inflate(Source source, Inflater inflater) {
        kotlin.jvm.internal.t.f(source, "<this>");
        kotlin.jvm.internal.t.f(inflater, "inflater");
        return new InflaterSource(source, inflater);
    }

    public static /* synthetic */ InflaterSource inflate$default(Source source, Inflater inflater, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            inflater = new Inflater();
        }
        kotlin.jvm.internal.t.f(source, "<this>");
        kotlin.jvm.internal.t.f(inflater, yeILL.bUzfhAys);
        return new InflaterSource(source, inflater);
    }
}
