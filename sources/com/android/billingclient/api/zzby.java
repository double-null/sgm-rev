package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.play_billing.zzjn;
import com.google.android.gms.internal.play_billing.zzju;
import org.json.JSONException;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzby extends com.google.android.gms.internal.play_billing.zzy {
    final ExternalOfferReportingDetailsListener zza;
    final zzcz zzb;
    final int zzc;

    /* synthetic */ zzby(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener, zzcz zzczVar, int i10, zzci zzciVar) {
        this.zza = externalOfferReportingDetailsListener;
        this.zzb = zzczVar;
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.zzz
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            zzcz zzczVar = this.zzb;
            zzjn zzjnVar = zzjn.NULL_BUNDLE_FROM_CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS_SERVICE_CALL;
            BillingResult billingResult = zzdc.zzh;
            int i10 = zzcy.zza;
            zzczVar.zzb(zzcy.zzb(zzjnVar, 24, billingResult, null, zzju.BROADCAST_ACTION_UNSPECIFIED), this.zzc);
            this.zza.onExternalOfferReportingDetailsResponse(billingResult, null);
            return;
        }
        int iZzb = com.google.android.gms.internal.play_billing.zzc.zzb(bundle, "BillingClient");
        BillingResult billingResultZza = zzdc.zza(iZzb, com.google.android.gms.internal.play_billing.zzc.zzk(bundle, "BillingClient"));
        if (iZzb != 0) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "createExternalOfferReportingDetailsAsync() failed. Response code: " + iZzb);
            zzcz zzczVar2 = this.zzb;
            zzjn zzjnVar2 = zzjn.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
            int i11 = zzcy.zza;
            zzczVar2.zzb(zzcy.zzb(zzjnVar2, 24, billingResultZza, null, zzju.BROADCAST_ACTION_UNSPECIFIED), this.zzc);
            this.zza.onExternalOfferReportingDetailsResponse(billingResultZza, null);
            return;
        }
        try {
            this.zza.onExternalOfferReportingDetailsResponse(billingResultZza, new ExternalOfferReportingDetails(bundle.getString("CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS")));
        } catch (JSONException e10) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Error when parsing invalid external offer reporting details. \n Exception: ", e10);
            zzcz zzczVar3 = this.zzb;
            zzjn zzjnVar3 = zzjn.ERROR_DECODING_EXTERNAL_OFFER_REPORTING_DETAILS;
            BillingResult billingResult2 = zzdc.zzh;
            int i12 = zzcy.zza;
            zzczVar3.zzb(zzcy.zzb(zzjnVar3, 24, billingResult2, null, zzju.BROADCAST_ACTION_UNSPECIFIED), this.zzc);
            this.zza.onExternalOfferReportingDetailsResponse(billingResult2, null);
        }
    }
}
