package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzje;
import com.google.android.gms.internal.play_billing.zzjg;
import com.google.android.gms.internal.play_billing.zzji;
import com.google.android.gms.internal.play_billing.zzjk;
import com.google.android.gms.internal.play_billing.zzjl;
import com.google.android.gms.internal.play_billing.zzjn;
import com.google.android.gms.internal.play_billing.zzjp;
import com.google.android.gms.internal.play_billing.zzju;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzcy {
    public static final /* synthetic */ int zza = 0;

    static {
        int i10 = zzcz.zza;
    }

    public static String zza(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String str = exc.getClass().getSimpleName() + ":" + com.google.android.gms.internal.play_billing.zzbo.zzc(exc.getMessage());
            int i10 = com.google.android.gms.internal.play_billing.zzc.zza;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    public static zzjg zzb(zzjn zzjnVar, int i10, BillingResult billingResult, String str, zzju zzjuVar) {
        try {
            zzjl zzjlVarZza = zzjp.zza();
            zzjlVarZza.zzp(billingResult.getResponseCode());
            zzjlVarZza.zzb(billingResult.getDebugMessage());
            if (billingResult.getOnPurchasesUpdatedSubResponseCode() != 0) {
                zzjlVarZza.zzd(billingResult.getOnPurchasesUpdatedSubResponseCode());
            }
            if (zzjnVar != null) {
                zzjlVarZza.zze(zzjnVar);
            }
            if (str != null) {
                zzjlVarZza.zza(str);
            }
            zzje zzjeVarZza = zzjg.zza();
            zzjeVarZza.zzb(zzjlVarZza);
            zzjeVarZza.zzp(i10);
            if (!zzjuVar.equals(zzju.BROADCAST_ACTION_UNSPECIFIED)) {
                zzjeVarZza.zza(zzjuVar);
            }
            return (zzjg) zzjeVarZza.zzi();
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    public static zzjk zzc(int i10, zzju zzjuVar) {
        try {
            zzji zzjiVarZza = zzjk.zza();
            zzjiVarZza.zze(i10);
            if (!zzjuVar.equals(zzju.BROADCAST_ACTION_UNSPECIFIED)) {
                zzjiVarZza.zza(zzjuVar);
            }
            return (zzjk) zzjiVarZza.zzi();
        } catch (Exception e10) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to create logging payload", e10);
            return null;
        }
    }
}
