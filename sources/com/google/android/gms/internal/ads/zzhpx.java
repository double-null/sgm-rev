package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhpx {
    public static zzhoj zza(zzhec zzhecVar, zzhnk zzhnkVar) throws GeneralSecurityException {
        zziaz zziazVarZzd;
        zzhdz zzhdzVarZzc = ((zzheb) zzhecVar).zzc();
        zzhna zzhnaVar = new zzhna();
        for (int i10 = 0; i10 < zzhecVar.zzd(); i10++) {
            zzhdz zzhdzVarZze = ((zzheb) zzhecVar).zze(i10);
            if (zzhdzVarZze.zzb().equals(zzhds.zza)) {
                zzhoj zzhojVar = (zzhoj) zzhnkVar.zza(zzhdzVarZze);
                zzhdq zzhdqVarZza = zzhdzVarZze.zza();
                if (zzhdqVarZza instanceof zzhox) {
                    zziazVarZzd = ((zzhox) zzhdqVarZza).zze();
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
                zzhnaVar.zza(zziazVarZzd, zzhojVar);
            }
        }
        return new zzhpw(zzhnaVar.zzb(), (zzhoj) zzhnkVar.zza(zzhdzVarZzc), null);
    }
}
