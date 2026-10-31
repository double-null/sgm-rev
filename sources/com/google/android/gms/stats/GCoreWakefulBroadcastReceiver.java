package com.google.android.gms.stats;

import android.content.Context;
import android.content.Intent;
import k0.a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-stats@@17.0.1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class GCoreWakefulBroadcastReceiver extends a {
    public static boolean completeWakefulIntent(Context context, Intent intent) {
        if (intent == null) {
            return false;
        }
        return a.completeWakefulIntent(intent);
    }
}
