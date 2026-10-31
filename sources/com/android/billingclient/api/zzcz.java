package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzjg;
import com.google.android.gms.internal.play_billing.zzjk;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzju;
import com.google.android.gms.internal.play_billing.zzky;
import com.google.android.gms.internal.play_billing.zzlb;
import com.google.android.gms.internal.play_billing.zzlf;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes.dex */
interface zzcz {
    public static final /* synthetic */ int zza = 0;

    static {
        com.google.android.gms.internal.play_billing.zzcd.zzc("com.android.vending.billing.PURCHASES_UPDATED", zzju.PURCHASES_UPDATED_ACTION, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", zzju.LOCAL_PURCHASES_UPDATED_ACTION, "com.android.vending.billing.ALTERNATIVE_BILLING", zzju.ALTERNATIVE_BILLING_ACTION);
    }

    void zza(zzjg zzjgVar);

    void zzb(zzjg zzjgVar, int i10);

    void zzc(zzjg zzjgVar, int i10, long j10);

    void zzd(zzjg zzjgVar, long j10, boolean z10);

    void zze(zzjg zzjgVar, int i10, long j10, boolean z10);

    void zzf(zzjk zzjkVar);

    void zzg(zzjk zzjkVar, int i10);

    void zzh(zzjk zzjkVar, long j10, boolean z10);

    void zzi(zzjs zzjsVar);

    void zzj(BillingResult billingResult, long j10);

    void zzk(long j10);

    void zzl(zzky zzkyVar);

    void zzm(zzlb zzlbVar);

    void zzn(zzlf zzlfVar);
}
