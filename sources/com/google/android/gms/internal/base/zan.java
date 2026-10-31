package com.google.android.gms.internal.base;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class zan {
    public static final int zaa;
    private static volatile boolean zab = false;
    private static volatile boolean zac = false;

    static {
        zaa = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }

    public static PendingIntent zaa(Context context, int i10, Intent intent, int i11) {
        return PendingIntent.getActivity(context, i10, intent, i11);
    }
}
