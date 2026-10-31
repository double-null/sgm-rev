package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class WakeLockTracker {
    private static final WakeLockTracker zza = new WakeLockTracker();

    public static WakeLockTracker getInstance() {
        return zza;
    }

    public void registerEvent(Context context, String str, int i10, String str2, String str3, String str4, int i11, List<String> list) {
    }

    public void registerEvent(Context context, String str, int i10, String str2, String str3, String str4, int i11, List<String> list, long j10) {
    }

    public void registerReleaseEvent(Context context, Intent intent) {
    }

    public void registerDeadlineEvent(Context context, String str, String str2, String str3, int i10, List<String> list, boolean z10, long j10) {
    }

    public void registerAcquireEvent(Context context, Intent intent, String str, String str2, String str3, int i10, String str4) {
    }
}
