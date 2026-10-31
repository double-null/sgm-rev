package com.android.billingclient.api;

import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zzjn;
import java.util.Objects;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzcd extends com.google.android.gms.internal.play_billing.zzaj {
    final zzbw zza;
    final Boolean zzb;
    final int zzc;
    final /* synthetic */ BillingClientImpl zzd;

    /* synthetic */ zzcd(BillingClientImpl billingClientImpl, zzbw zzbwVar, Boolean bool, int i10, zzci zzciVar) {
        Objects.requireNonNull(billingClientImpl);
        this.zzd = billingClientImpl;
        this.zza = zzbwVar;
        this.zzb = bool;
        this.zzc = i10;
    }

    private final void zzb(zzbw zzbwVar, BillingResult billingResult, zzjn zzjnVar, boolean z10, String str, int i10) {
        this.zzd.zzbj(0);
        zzbwVar.zzi(billingResult, zzjnVar, str, z10, i10);
        zzbwVar.zzk(billingResult);
    }

    @Override // com.google.android.gms.internal.play_billing.zzak
    public final void zza(Bundle bundle) {
        if (bundle == null) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Response bundle is null.");
            zzb(this.zza, zzdc.zzh, zzjn.NULL_BUNDLE_RETURNED_BY_PHONESKY, this.zzb.booleanValue(), null, this.zzc);
            return;
        }
        if (!bundle.containsKey("RESPONSE_CODE")) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Response bundle doesn't contain a response code");
            zzb(this.zza, zzdc.zzh, zzjn.RESPONSE_CODE_NOT_SET_IN_BUNDLE, this.zzb.booleanValue(), null, this.zzc);
            return;
        }
        if (bundle.getInt("RESPONSE_CODE") != 0) {
            zzb(this.zza, zzdc.zza(bundle.getInt("RESPONSE_CODE"), bundle.getString("DEBUG_MESSAGE", "")), zzjn.NON_OK_CODE_RETURNED_BY_PHONESKY, this.zzb.booleanValue(), "Response code from Phonesky: " + bundle.getInt("RESPONSE_CODE"), this.zzc);
            return;
        }
        if (!bundle.containsKey("BILLING_API_VERSION_KEY")) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Billing API version not found in response bundle.");
            zzb(this.zza, zzdc.zzh, zzjn.BILLING_API_VERSION_NOT_SET_IN_BUNDLE, this.zzb.booleanValue(), null, this.zzc);
            return;
        }
        int i10 = bundle.getInt("BILLING_API_VERSION_KEY");
        BillingClientImpl billingClientImpl = this.zzd;
        BillingClientImpl.zzao(billingClientImpl, i10);
        billingClientImpl.zzl = i10 >= 5;
        billingClientImpl.zzk = i10 >= 3;
        Bundle bundle2 = bundle.getBundle("EXPERIMENT_VALUES_KEY");
        if (bundle2 != null) {
            try {
                zzdl.zzg(bundle2.getBoolean("DELEGATION_API_ENABLED_KEY"));
            } catch (Throwable th) {
                com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Error reading EnableDelegationApi experiment flag: ".concat(bundle2.toString()), th);
            }
            try {
                zzdl.zzf(bundle2.getLong("AUTO_SERVICE_RECONNECTION_SYNCHRONOUS_TIMEOUT_MS_KEY"));
            } catch (Throwable th2) {
                com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Error reading AutoServiceReconnectionSynchronousTimeoutMs experiment flag: ".concat(bundle2.toString()), th2);
            }
            try {
                zzdl.zzd(bundle2.getLong("AUTO_SERVICE_RECONNECTION_ASYNCHRONOUS_TIMEOUT_MS_KEY"));
            } catch (Throwable th3) {
                com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Error reading AutoServiceReconnectionAsynchronousTimeoutMs experiment flag: ".concat(bundle2.toString()), th3);
            }
            try {
                zzdl.zze(bundle2.getInt("AUTO_SERVICE_RECONNECTION_MAX_NUM_RETRIES_KEY"));
            } catch (Throwable th4) {
                com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Error reading AutoServiceReconnectionMaxNumRetries experiment flag: ".concat(bundle2.toString()), th4);
            }
        }
        Bundle bundle3 = bundle.getBundle("ENABLED_SUBSCRIPTION_CLIENT_ACTIONS_KEY");
        if (bundle3 != null) {
            com.google.android.gms.internal.play_billing.zzce zzceVar = new com.google.android.gms.internal.play_billing.zzce();
            for (zzeo zzeoVar : zzeo.values()) {
                if (bundle3.getBoolean(zzeoVar.name(), false)) {
                    zzceVar.zzb(zzeoVar);
                }
            }
            BillingClientImpl billingClientImpl2 = this.zzd;
            billingClientImpl2.zzI = zzceVar.zzc();
            if (billingClientImpl2.zzf != null) {
                billingClientImpl2.zzf.zzk(billingClientImpl2.zzI);
            }
        }
        BillingClientImpl billingClientImpl3 = this.zzd;
        if (billingClientImpl3.zzm < 3) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "In-app billing API version 3 is not supported on this device.");
            zzb(this.zza, zzdc.zzb, zzjn.ONE_TIME_PRODUCT_NOT_SUPPORTED, this.zzb.booleanValue(), null, this.zzc);
            return;
        }
        zzbw zzbwVar = this.zza;
        Boolean bool = this.zzb;
        int i11 = this.zzc;
        boolean zBooleanValue = bool.booleanValue();
        BillingClientImpl.zzaq(billingClientImpl3, 0);
        synchronized (billingClientImpl3.zza) {
            if (billingClientImpl3.zzb == 3) {
                return;
            }
            zzbwVar.zzj(zBooleanValue, i11);
            zzbwVar.zzk(zzdc.zzi);
        }
    }
}
