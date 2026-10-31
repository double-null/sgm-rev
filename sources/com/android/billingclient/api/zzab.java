package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzab {
    private final Context zza;
    private final PurchasesUpdatedListener zzb;
    private final zzb zzc;
    private final UserChoiceBillingListener zzd;
    private final DeveloperProvidedBillingListener zze;
    private final zzcz zzf;
    private boolean zzi;
    private com.google.android.gms.internal.play_billing.zzcf zzj = com.google.android.gms.internal.play_billing.zzcf.zzk();
    private final zzaa zzg = new zzaa(this, true);
    private final zzaa zzh = new zzaa(this, false);

    zzab(Context context, PurchasesUpdatedListener purchasesUpdatedListener, zzdp zzdpVar, zzb zzbVar, UserChoiceBillingListener userChoiceBillingListener, DeveloperProvidedBillingListener developerProvidedBillingListener, zzcz zzczVar) {
        this.zza = context;
        this.zzb = purchasesUpdatedListener;
        this.zzc = zzbVar;
        this.zzd = userChoiceBillingListener;
        this.zze = developerProvidedBillingListener;
        this.zzf = zzczVar;
    }

    final DeveloperProvidedBillingListener zzd() {
        return this.zze;
    }

    final PurchasesUpdatedListener zzf() {
        return this.zzb;
    }

    final void zzi() {
        zzaa zzaaVar = this.zzg;
        Context context = this.zza;
        zzaaVar.zzc(context);
        this.zzh.zzc(context);
    }

    final void zzj(boolean z10) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.zzi = z10;
        zzaa zzaaVar = this.zzh;
        Context context = this.zza;
        zzaaVar.zza(context, intentFilter2);
        if (this.zzi) {
            this.zzg.zzb(context, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST");
        } else {
            this.zzg.zza(context, intentFilter);
        }
    }

    final void zzk(com.google.android.gms.internal.play_billing.zzcf zzcfVar) {
        this.zzj = zzcfVar;
    }
}
