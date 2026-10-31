package com.google.firebase.crashlytics.internal.common;

import android.content.Context;

/* JADX INFO: compiled from: InstallerPackageNameProvider.java */
/* JADX INFO: loaded from: classes4.dex */
class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f12184a;

    p0() {
    }

    private static String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    synchronized String a(Context context) {
        if (this.f12184a == null) {
            this.f12184a = b(context);
        }
        return "".equals(this.f12184a) ? null : this.f12184a;
    }
}
