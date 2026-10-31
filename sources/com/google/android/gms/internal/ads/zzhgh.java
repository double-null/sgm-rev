package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhgh extends zzhet {
    private final zzhgm zza;
    private final zzibb zzb;
    private final zziaz zzc;
    private final Integer zzd;

    private zzhgh(zzhgm zzhgmVar, zzibb zzibbVar, zziaz zziazVar, Integer num) {
        this.zza = zzhgmVar;
        this.zzb = zzibbVar;
        this.zzc = zziazVar;
        this.zzd = num;
    }

    public static zzhgh zzd(zzhgl zzhglVar, zzibb zzibbVar, Integer num) throws GeneralSecurityException {
        zziaz zziazVarZzb;
        zzhgl zzhglVar2 = zzhgl.zzc;
        if (zzhglVar != zzhglVar2 && num == null) {
            String string = zzhglVar.toString();
            StringBuilder sb2 = new StringBuilder(string.length() + 62);
            sb2.append("For given Variant ");
            sb2.append(string);
            sb2.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(sb2.toString());
        }
        if (zzhglVar == zzhglVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzibbVar.zzd() != 32) {
            int iZzd = zzibbVar.zzd();
            StringBuilder sb3 = new StringBuilder(String.valueOf(iZzd).length() + 74);
            sb3.append("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ");
            sb3.append(iZzd);
            throw new GeneralSecurityException(sb3.toString());
        }
        zzhgm zzhgmVarZzb = zzhgm.zzb(zzhglVar);
        if (zzhgmVarZzb.zzc() == zzhglVar2) {
            zziazVarZzb = zzhms.zza;
        } else if (zzhgmVarZzb.zzc() == zzhgl.zzb) {
            zziazVarZzb = zzhms.zza(num.intValue());
        } else {
            if (zzhgmVarZzb.zzc() != zzhgl.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzhgmVarZzb.zzc().toString()));
            }
            zziazVarZzb = zzhms.zzb(num.intValue());
        }
        return new zzhgh(zzhgmVarZzb, zzibbVar, zziazVarZzb, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhet, com.google.android.gms.internal.ads.zzhdq
    public final /* synthetic */ zzheh zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdq
    public final Integer zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhet
    public final zziaz zzc() {
        return this.zzc;
    }

    public final zzibb zze() {
        return this.zzb;
    }

    public final zzhgm zzf() {
        return this.zza;
    }
}
