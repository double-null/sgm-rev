package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.pairip.VMRunner;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzec extends BroadcastReceiver {
    private BillingResult zza;
    private boolean zzb = false;
    private final zzcz zzc;

    zzec(zzcz zzczVar) {
        this.zzc = zzczVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        VMRunner.invoke("KZ54i2exH9dM8cCe", new Object[]{this, context, intent});
    }

    final BillingResult zza() {
        return this.zza;
    }

    final void zzb() {
        this.zza = null;
    }

    final boolean zzc() {
        return this.zzb;
    }
}
