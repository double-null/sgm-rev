package com.facebook.internal;

import rd.c0;

/* JADX INFO: compiled from: InternalSettings.kt */
/* JADX INFO: loaded from: classes.dex */
public final class InternalSettings {
    public static final InternalSettings INSTANCE = new InternalSettings();
    private static final String UNITY_PREFIX = "Unity.";
    private static volatile String customUserAgent;

    private InternalSettings() {
    }

    public static final String getCustomUserAgent() {
        return customUserAgent;
    }

    public static final boolean isUnityApp() {
        String str = customUserAgent;
        return str != null && c0.O(str, UNITY_PREFIX, false, 2, null);
    }

    public static final void setCustomUserAgent(String value) {
        kotlin.jvm.internal.t.f(value, "value");
        customUserAgent = value;
    }

    public static /* synthetic */ void isUnityApp$annotations() {
    }
}
