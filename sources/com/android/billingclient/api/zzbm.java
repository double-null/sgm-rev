package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzjn;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzbm implements Callable {
    final /* synthetic */ PurchasesResponseListener zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ BillingClientImpl zzd;

    zzbm(BillingClientImpl billingClientImpl, PurchasesResponseListener purchasesResponseListener, String str, boolean z10) {
        this.zza = purchasesResponseListener;
        this.zzb = str;
        this.zzc = z10;
        Objects.requireNonNull(billingClientImpl);
        this.zzd = billingClientImpl;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        BillingClientImpl billingClientImpl = this.zzd;
        if (!billingClientImpl.zzbo(zzdl.zzb())) {
            zzjn zzjnVar = zzjn.SERVICE_CONNECTION_NOT_READY;
            BillingResult billingResult = zzdc.zzj;
            billingClientImpl.zzbv(zzjnVar, 9, billingResult);
            this.zza.onQueryPurchasesResponse(billingResult, com.google.android.gms.internal.play_billing.zzca.zzk());
            return null;
        }
        String str = this.zzb;
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Please provide a valid product type.");
            zzjn zzjnVar2 = zzjn.EMPTY_PRODUCT_TYPE;
            BillingResult billingResult2 = zzdc.zze;
            billingClientImpl.zzbv(zzjnVar2, 9, billingResult2);
            this.zza.onQueryPurchasesResponse(billingResult2, com.google.android.gms.internal.play_billing.zzca.zzk());
            return null;
        }
        zzed zzedVarZzbt = billingClientImpl.zzbt(str, this.zzc, 9);
        if (zzedVarZzbt.zzb() != null) {
            this.zza.onQueryPurchasesResponse(zzedVarZzbt.zza(), zzedVarZzbt.zzb());
            return null;
        }
        this.zza.onQueryPurchasesResponse(zzedVarZzbt.zza(), com.google.android.gms.internal.play_billing.zzca.zzk());
        return null;
    }
}
