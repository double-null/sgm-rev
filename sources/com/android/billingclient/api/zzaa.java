package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zzjg;
import com.google.android.gms.internal.play_billing.zzjn;
import com.google.android.gms.internal.play_billing.zzju;
import com.pairip.VMRunner;
import java.util.Objects;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaa extends BroadcastReceiver {
    final /* synthetic */ zzab zza;
    private boolean zzb;
    private final boolean zzc;

    zzaa(zzab zzabVar, boolean z10) {
        Objects.requireNonNull(zzabVar);
        this.zza = zzabVar;
        this.zzc = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(Bundle bundle, BillingResult billingResult, int i10, zzju zzjuVar, long j10, boolean z10) {
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
                this.zza.zzf.zzd(zzjg.zzc(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD")), j10, z10);
            } else {
                this.zza.zzf.zzd(zzcy.zzb(zzjn.BILLING_RESULT_RECEIVED_FROM_PHONESKY, i10, billingResult, null, zzjuVar), j10, z10);
            }
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        VMRunner.invoke("avZHlz2C496SBrzD", new Object[]{this, context, intent});
    }

    public final synchronized void zza(Context context, IntentFilter intentFilter) {
        if (this.zzb) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(this, intentFilter, true != this.zzc ? 4 : 2);
        } else {
            context.registerReceiver(this, intentFilter);
        }
        this.zzb = true;
    }

    public final synchronized void zzb(Context context, IntentFilter intentFilter, String str) {
        if (this.zzb) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.zzc ? 4 : 2);
        } else {
            context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
        }
        this.zzb = true;
    }

    public final synchronized void zzc(Context context) {
        if (!this.zzb) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.zzb = false;
        }
    }
}
