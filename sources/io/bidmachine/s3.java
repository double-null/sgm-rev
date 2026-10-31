package io.bidmachine;

import android.content.Context;
import android.os.Build;

/* JADX INFO: compiled from: HwInfoCache.java */
/* JADX INFO: loaded from: classes4.dex */
final class s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f20417a = Build.MANUFACTURER + Build.MODEL;

    s3() {
    }

    String a(Context context, String str) {
        return f2.h(context, str + f20417a);
    }

    void b(Context context, String str, String str2) {
        f2.I(context, str + f20417a, str2);
    }
}
