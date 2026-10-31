package com.android.billingclient.api;

import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zzjn;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzdq extends com.google.android.gms.internal.play_billing.zzab {
    final BillingConfigResponseListener zza;
    final zzcz zzb;
    final int zzc;

    zzdq(BillingConfigResponseListener billingConfigResponseListener, zzcz zzczVar, int i10) {
        billingConfigResponseListener.getClass();
        this.zza = billingConfigResponseListener;
        this.zzb = zzczVar;
        this.zzc = i10;
    }

    private final void zza(BillingResult billingResult) {
        BillingConfigResponseListener billingConfigResponseListener = this.zza;
        if (billingConfigResponseListener != null) {
            billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
        } else {
            zzde.zza(zzjn.NULL_LISTENER_IN_DELEGATE_TO_BACKEND_CALLBACK, billingResult, this.zzb, zzdf.GET_BILLING_CONFIG.zzb(), this.zzc);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzac
    public final void onDelegateToBackendResponse(Bundle bundle) {
        if (bundle == null) {
            zzcz zzczVar = this.zzb;
            zzjn zzjnVar = zzjn.NULL_BUNDLE_FROM_DELEGATE_TO_BACKEND_SERVICE_CALL;
            BillingResult billingResult = zzdc.zzh;
            zzde.zza(zzjnVar, billingResult, zzczVar, zzdf.GET_BILLING_CONFIG.zzb(), this.zzc);
            zza(billingResult);
            return;
        }
        BillingResult billingResultZza = zzdh.zza(bundle, "GetBillingConfigDelegateToBackendCallback", zzdf.GET_BILLING_CONFIG.zzb(), this.zzb, this.zzc);
        if (billingResultZza.getResponseCode() != 0) {
            zza(billingResultZza);
            return;
        }
        try {
            byte[] byteArray = bundle.getByteArray("RESPONSE_DATA");
            if (byteArray == null) {
                throw new IllegalArgumentException("Response data is null");
            }
            this.zza.onBillingConfigResponse(billingResultZza, BillingConfig.forCountryCode(com.google.android.gms.internal.play_billing.zzdx.zzb(byteArray).zzc()));
        } catch (Exception e10) {
            com.google.android.gms.internal.play_billing.zzc.zzp("GetBillingConfigDelegateToBackendCallback", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e10);
            zzcz zzczVar2 = this.zzb;
            zzjn zzjnVar2 = zzjn.ERROR_DECODING_DELEGATE_TO_BACKEND_RESPONSE_DATA;
            BillingResult billingResult2 = zzdc.zzh;
            zzde.zzb(zzjnVar2, billingResult2, zzczVar2, zzdf.GET_BILLING_CONFIG.zzb(), this.zzc, zzcy.zza(e10));
            zza(billingResult2);
        }
    }
}
