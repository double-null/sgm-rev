package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Base64;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzedx implements zzasa {
    final /* synthetic */ zzedy zza;

    zzedx(zzedy zzedyVar) {
        Objects.requireNonNull(zzedyVar);
        this.zza = zzedyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzasa
    public final void zza(int i10) {
        zzasb zzasbVarZzd;
        try {
            zzfqt zzfqtVarZza = zzfqu.zza();
            int i11 = 3;
            if (i10 != 0) {
                if (i10 == 1) {
                    i11 = 4;
                } else if (i10 != 2) {
                    i11 = i10 != 3 ? 7 : 6;
                } else {
                    i11 = 5;
                }
            }
            zzfqtVarZza.zzh(i11);
            if (i10 == 0 && (zzasbVarZzd = this.zza.zzc().zzd()) != null) {
                zzfqtVarZza.zzb(zzasbVarZzd.zzb());
                zzfqtVarZza.zzc(zzasbVarZzd.zzc());
                zzfqtVarZza.zzd(zzasbVarZzd.zzd());
                zzfqtVarZza.zze(zzasbVarZzd.zze());
                zzfqtVarZza.zzf(zzasbVarZzd.zzf());
                if (!TextUtils.isEmpty(zzasbVarZzd.zza())) {
                    zzfqtVarZza.zza(zzasbVarZzd.zza());
                }
                if (!TextUtils.isEmpty(zzasbVarZzd.zzg())) {
                    zzfqtVarZza.zzg(zzasbVarZzd.zzg());
                }
            }
            zzedy zzedyVar = this.zza;
            zzedyVar.zzc().zzc();
            zzdzl zzdzlVarZzd = zzedyVar.zzd();
            String strEncodeToString = Base64.encodeToString(((zzfqu) zzfqtVarZza.zzbu()).zzaN(), 1);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzfP)).booleanValue()) {
                zzdzk zzdzkVarZza = zzdzlVarZzd.zza();
                zzdzkVarZza.zzc("action", "irda");
                zzdzkVarZza.zzc("irdd", strEncodeToString);
                zzdzkVarZza.zzf();
            }
            zzedyVar.zze().zzQ(true);
        } catch (Exception e10) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzfQ)).booleanValue()) {
                zzedy zzedyVar2 = this.zza;
                if (zzedyVar2.zzb == null) {
                    zzedyVar2.zzb = zzbzy.zzc(zzedyVar2.zzb());
                }
                zzedyVar2.zzb.zzh(e10, "InstallReferrerUnsampled.onInstallReferrerSetupFinished");
                return;
            }
            zzedy zzedyVar3 = this.zza;
            if (zzedyVar3.zza == null) {
                zzedyVar3.zza = zzbzy.zza(zzedyVar3.zzb());
            }
            zzedyVar3.zza.zzh(e10, "InstallReferrer.onInstallReferrerSetupFinished");
        }
    }
}
