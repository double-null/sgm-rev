package com.applovin.shadow.okio;

/* JADX INFO: renamed from: com.applovin.shadow.okio.-DeprecatedUtf8, reason: invalid class name */
/* JADX INFO: compiled from: -DeprecatedUtf8.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DeprecatedUtf8 {
    public static final DeprecatedUtf8 INSTANCE = new DeprecatedUtf8();

    private DeprecatedUtf8() {
    }

    public final long size(String string) {
        kotlin.jvm.internal.t.f(string, "string");
        return Utf8.size$default(string, 0, 0, 3, null);
    }

    public final long size(String string, int i10, int i11) {
        kotlin.jvm.internal.t.f(string, "string");
        return Utf8.size(string, i10, i11);
    }
}
