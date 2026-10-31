package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.play_billing.zzjn;
import com.google.android.gms.internal.play_billing.zzju;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzce extends com.google.android.gms.internal.play_billing.zzal {
    final AlternativeBillingOnlyAvailabilityListener zza;
    final zzcz zzb;
    final int zzc;

    /* synthetic */ zzce(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener, zzcz zzczVar, int i10, zzci zzciVar) {
        this.zza = alternativeBillingOnlyAvailabilityListener;
        this.zzb = zzczVar;
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.zzam
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            zzcz zzczVar = this.zzb;
            zzjn zzjnVar = zzjn.NULL_BUNDLE_FROM_IS_ALTERNATIVE_BILLING_ONLY_AVAILABLE_SERVICE_CALL;
            BillingResult billingResult = zzdc.zzh;
            int i10 = zzcy.zza;
            zzczVar.zzb(zzcy.zzb(zzjnVar, 14, billingResult, null, zzju.BROADCAST_ACTION_UNSPECIFIED), this.zzc);
            this.zza.onAlternativeBillingOnlyAvailabilityResponse(billingResult);
            return;
        }
        int iZzb = com.google.android.gms.internal.play_billing.zzc.zzb(bundle, "BillingClient");
        BillingResult billingResultZza = zzdc.zza(iZzb, com.google.android.gms.internal.play_billing.zzc.zzk(bundle, "BillingClient"));
        if (iZzb != 0) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "isAlternativeBillingOnlyAvailableAsync() failed. Response code: " + iZzb);
            zzcz zzczVar2 = this.zzb;
            zzjn zzjnVar2 = zzjn.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
            int i11 = zzcy.zza;
            zzczVar2.zzb(zzcy.zzb(zzjnVar2, 14, billingResultZza, null, zzju.BROADCAST_ACTION_UNSPECIFIED), this.zzc);
        }
        this.zza.onAlternativeBillingOnlyAvailabilityResponse(billingResultZza);
    }
}
