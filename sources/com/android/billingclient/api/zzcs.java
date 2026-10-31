package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzjn;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzcs implements com.google.android.gms.internal.play_billing.zzdd {
    final /* synthetic */ w.b zza;
    final /* synthetic */ Runnable zzb;
    final /* synthetic */ zzcw zzc;
    final /* synthetic */ int zzd;

    zzcs(zzcw zzcwVar, int i10, w.b bVar, Runnable runnable) {
        this.zzd = i10;
        this.zza = bVar;
        this.zzb = runnable;
        Objects.requireNonNull(zzcwVar);
        this.zzc = zzcwVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdd
    public final void zza(Throwable th) {
        if (th instanceof TimeoutException) {
            this.zzc.zzaR(zzjn.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT, 28, zzdc.zzF);
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            this.zzc.zzaR(zzjn.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, 28, zzdc.zzF);
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        this.zzb.run();
    }

    @Override // com.google.android.gms.internal.play_billing.zzdd
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        zzcw zzcwVar = this.zzc;
        if (!zzcw.zzaO(iIntValue)) {
            this.zzb.run();
        } else {
            this.zza.accept(zzcwVar.zzaP(this.zzd, num.intValue()));
        }
    }
}
