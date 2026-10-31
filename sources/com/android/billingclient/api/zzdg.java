package com.android.billingclient.api;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.android.billingclient.BuildConfig;
import com.google.android.gms.internal.play_billing.zzih;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzdg {
    static Bundle zza(com.google.android.gms.internal.play_billing.zzej zzejVar, zzih zzihVar) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("REQUEST_METADATA", zzejVar.zzQ());
        bundle.putByteArray("REQUEST_PARAMS", zzihVar.zzQ());
        return bundle;
    }

    static com.google.android.gms.internal.play_billing.zzej zzb(String str, int i10, Context context, String str2) {
        String strValueOf;
        com.google.android.gms.internal.play_billing.zzei zzeiVarZza = com.google.android.gms.internal.play_billing.zzej.zza();
        zzeiVarZza.zzd(BuildConfig.VERSION_NAME);
        zzeiVarZza.zze(24);
        zzeiVarZza.zzb(context.getPackageName());
        zzeiVarZza.zzc(str2);
        try {
            strValueOf = String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            com.google.android.gms.internal.play_billing.zzc.zzo("DelegationApiParamsBuilder", "No version code is found!");
            strValueOf = null;
        }
        if (strValueOf != null) {
            zzeiVarZza.zza(strValueOf);
        }
        return (com.google.android.gms.internal.play_billing.zzej) zzeiVarZza.zzi();
    }
}
