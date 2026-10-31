package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhjy {
    public static zzhdi zza(zzhec zzhecVar, zzhnk zzhnkVar) throws GeneralSecurityException {
        zzhmd zzhmdVar;
        zzhmd zzhmdVarZza;
        zziaz zziazVarZzd;
        zzhna zzhnaVar = new zzhna();
        for (int i10 = 0; i10 < zzhecVar.zzd(); i10++) {
            zzhdz zzhdzVarZze = ((zzheb) zzhecVar).zze(i10);
            if (zzhdzVarZze.zzb().equals(zzhds.zza)) {
                zzhdq zzhdqVarZza = zzhdzVarZze.zza();
                if (zzhdqVarZza instanceof zzhet) {
                    zziazVarZzd = ((zzhet) zzhdqVarZza).zzc();
                } else {
                    if (!(zzhdqVarZza instanceof zzhlz)) {
                        String name = zzhdqVarZza.getClass().getName();
                        String strValueOf = String.valueOf(zzhdqVarZza.zza());
                        StringBuilder sb2 = new StringBuilder(name.length() + 59 + strValueOf.length());
                        sb2.append("Cannot get output prefix for key of class ");
                        sb2.append(name);
                        sb2.append(" with parameters ");
                        sb2.append(strValueOf);
                        throw new GeneralSecurityException(sb2.toString());
                    }
                    zziazVarZzd = ((zzhlz) zzhdqVarZza).zzd();
                }
                zzhnaVar.zza(zziazVarZzd, new zzhjw((zzhdi) zzhnkVar.zza(zzhdzVarZze), zzhdzVarZze.zzc()));
            }
        }
        zzhmc zzhmcVar = (zzhmc) zzhecVar.zzf(zzhmc.class);
        if (zzhmcVar == null || zzhmcVar.zza()) {
            zzhmdVar = zzhmg.zza;
            zzhmdVarZza = zzhmdVar;
        } else {
            zzhme zzhmeVarZzb = zzhmm.zza().zzb();
            zzhmd zzhmdVarZza2 = zzhmeVarZzb.zza(zzhecVar, zzhmcVar, "aead", "encrypt");
            zzhmdVarZza = zzhmeVarZzb.zza(zzhecVar, zzhmcVar, "aead", "decrypt");
            zzhmdVar = zzhmdVarZza2;
        }
        zzheb zzhebVar = (zzheb) zzhecVar;
        return new zzhjx(new zzhjw((zzhdi) zzhnkVar.zza(zzhebVar.zzc()), zzhebVar.zzc().zzc()), zzhnaVar.zzb(), zzhmdVar, zzhmdVarZza, null);
    }
}
