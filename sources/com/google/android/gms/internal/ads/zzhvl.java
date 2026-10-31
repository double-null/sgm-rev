package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.network.converters.vY.cTJaRZ;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhvl extends zzhxk {
    private final zzhve zza;
    private final zziaz zzb;
    private final zziaz zzc;
    private final Integer zzd;

    private zzhvl(zzhve zzhveVar, zziaz zziazVar, zziaz zziazVar2, Integer num) {
        this.zza = zzhveVar;
        this.zzb = zziazVar;
        this.zzc = zziazVar2;
        this.zzd = num;
    }

    @Override // com.google.android.gms.internal.ads.zzhxk, com.google.android.gms.internal.ads.zzhdq
    public final /* synthetic */ zzheh zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdq
    public final Integer zzb() {
        return this.zzd;
    }

    public final zziaz zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhxk
    public final zziaz zze() {
        return this.zzc;
    }

    public final zzhve zzf() {
        return this.zza;
    }

    public static zzhvl zzc(zzhvd zzhvdVar, zziaz zziazVar, Integer num) throws GeneralSecurityException {
        zziaz zziazVarZza;
        zzhve zzhveVarZzb = zzhve.zzb(zzhvdVar);
        zzhvd zzhvdVar2 = zzhvd.zzd;
        if (!zzhvdVar.equals(zzhvdVar2) && num == null) {
            String string = zzhvdVar.toString();
            StringBuilder sb2 = new StringBuilder(string.length() + 62);
            sb2.append("For given Variant ");
            sb2.append(string);
            sb2.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(sb2.toString());
        }
        if (zzhvdVar.equals(zzhvdVar2) && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zziazVar.zzd() == 32) {
            if (zzhveVarZzb.zzc() == zzhvdVar2) {
                zziazVarZza = zzhms.zza;
            } else if (zzhveVarZzb.zzc() != zzhvd.zzb && zzhveVarZzb.zzc() != zzhvd.zzc) {
                if (zzhveVarZzb.zzc() == zzhvd.zza) {
                    zziazVarZza = zzhms.zzb(num.intValue());
                } else {
                    throw new IllegalStateException("Unknown Variant: ".concat(zzhveVarZzb.zzc().toString()));
                }
            } else {
                zziazVarZza = zzhms.zza(num.intValue());
            }
            return new zzhvl(zzhveVarZzb, zziazVar, zziazVarZza, num);
        }
        int iZzd = zziazVar.zzd();
        StringBuilder sb3 = new StringBuilder(String.valueOf(iZzd).length() + 65);
        sb3.append(cTJaRZ.ZFfKvwsesyPlZeV);
        sb3.append(iZzd);
        throw new GeneralSecurityException(sb3.toString());
    }
}
