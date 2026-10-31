package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class GmsClientFlags {
    private static volatile boolean zza = true;
    private static volatile boolean zzb = false;

    private GmsClientFlags() {
    }

    public static boolean isBindServiceOptimizationEnabled(String str) {
        return zza;
    }

    public static boolean zza() {
        return false;
    }
}
