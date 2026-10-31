package com.google.firebase.crashlytics.internal;

import e3.i0;
import z2.g;

/* JADX INFO: loaded from: classes4.dex */
public interface CrashlyticsNativeComponent {
    g getSessionFileProvider(String str);

    boolean hasCrashDataForCurrentSession();

    boolean hasCrashDataForSession(String str);

    void prepareNativeSession(String str, String str2, long j10, i0 i0Var);
}
