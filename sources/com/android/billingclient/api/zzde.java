package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzjn;
import com.google.android.gms.internal.play_billing.zzju;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzde {
    static void zza(zzjn zzjnVar, BillingResult billingResult, zzcz zzczVar, int i10, int i11) {
        int i12 = zzcy.zza;
        zzczVar.zzb(zzcy.zzb(zzjnVar, i10, billingResult, null, zzju.BROADCAST_ACTION_UNSPECIFIED), i11);
    }

    static void zzb(zzjn zzjnVar, BillingResult billingResult, zzcz zzczVar, int i10, int i11, String str) {
        int i12 = zzcy.zza;
        zzczVar.zzb(zzcy.zzb(zzjnVar, i10, billingResult, str, zzju.BROADCAST_ACTION_UNSPECIFIED), i11);
    }
}
