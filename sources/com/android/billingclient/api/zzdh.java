package com.android.billingclient.api;

import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zzjn;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzdh {
    public static BillingResult zza(Bundle bundle, String str, int i10, zzcz zzczVar, int i11) {
        if (!bundle.containsKey("BILLING_RESULT")) {
            com.google.android.gms.internal.play_billing.zzc.zzo(str, "delegateToBackendAsync does not contain a billing result in the response");
            zzjn zzjnVar = zzjn.MISSING_BILLING_RESULT_IN_DELEGATE_TO_BACKEND_RESPONSE;
            BillingResult billingResult = zzdc.zzh;
            zzde.zza(zzjnVar, billingResult, zzczVar, i10, i11);
            return billingResult;
        }
        try {
            byte[] byteArray = bundle.getByteArray("BILLING_RESULT");
            if (byteArray == null) {
                throw new Exception("Billing result is null");
            }
            com.google.android.gms.internal.play_billing.zzeh zzehVarZzc = com.google.android.gms.internal.play_billing.zzeh.zzc(byteArray);
            BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
            builderNewBuilder.setResponseCode(zzehVarZzc.zza());
            builderNewBuilder.setDebugMessage(zzehVarZzc.zze());
            BillingResult billingResultBuild = builderNewBuilder.build();
            if (billingResultBuild.getResponseCode() != 0) {
                zzde.zza(zzjn.BILLING_RESULT_RECEIVED_FROM_PHONESKY, billingResultBuild, zzczVar, i10, i11);
                return billingResultBuild;
            }
            if (bundle.containsKey("RESPONSE_DATA")) {
                return billingResultBuild;
            }
            com.google.android.gms.internal.play_billing.zzc.zzo(str, "delegateToBackendAsync returned a bundle with neither an error nor response data");
            zzjn zzjnVar2 = zzjn.MISSING_RESPONSE_DATA_IN_DELEGATE_TO_BACKEND_RESPONSE;
            BillingResult billingResult2 = zzdc.zzh;
            zzde.zza(zzjnVar2, billingResult2, zzczVar, i10, i11);
            return billingResult2;
        } catch (Exception e10) {
            com.google.android.gms.internal.play_billing.zzc.zzp(str, "Failed parsing BillingResult.", e10);
            zzjn zzjnVar3 = zzjn.ERROR_DECODING_DELEGATE_TO_BACKEND_BILLING_RESULT;
            BillingResult billingResult3 = zzdc.zzh;
            zzde.zzb(zzjnVar3, billingResult3, zzczVar, i10, i11, zzcy.zza(e10));
            return billingResult3;
        }
    }
}
