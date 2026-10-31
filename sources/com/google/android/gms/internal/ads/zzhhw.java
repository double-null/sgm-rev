package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhhw extends zzhet {
    private final zzhib zza;
    private final zzibb zzb;
    private final zziaz zzc;
    private final Integer zzd;

    private zzhhw(zzhib zzhibVar, zzibb zzibbVar, zziaz zziazVar, Integer num) {
        this.zza = zzhibVar;
        this.zzb = zzibbVar;
        this.zzc = zziazVar;
        this.zzd = num;
    }

    public static zzhhw zzd(zzhib zzhibVar, zzibb zzibbVar, Integer num) throws GeneralSecurityException {
        zziaz zziazVarZzb;
        zzhia zzhiaVarZzc = zzhibVar.zzc();
        zzhia zzhiaVar = zzhia.zzb;
        if (zzhiaVarZzc != zzhiaVar && num == null) {
            String string = zzhibVar.zzc().toString();
            StringBuilder sb2 = new StringBuilder(string.length() + 62);
            sb2.append("For given Variant ");
            sb2.append(string);
            sb2.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(sb2.toString());
        }
        if (zzhibVar.zzc() == zzhiaVar && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzibbVar.zzd() != 32) {
            int iZzd = zzibbVar.zzd();
            StringBuilder sb3 = new StringBuilder(String.valueOf(iZzd).length() + 68);
            sb3.append("XAesGcmKey key must be constructed with key of length 32 bytes, not ");
            sb3.append(iZzd);
            throw new GeneralSecurityException(sb3.toString());
        }
        if (zzhibVar.zzc() == zzhiaVar) {
            zziazVarZzb = zzhms.zza;
        } else {
            if (zzhibVar.zzc() != zzhia.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzhibVar.zzc().toString()));
            }
            zziazVarZzb = zzhms.zzb(num.intValue());
        }
        return new zzhhw(zzhibVar, zzibbVar, zziazVarZzb, num);
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

    public final zzhib zzf() {
        return this.zza;
    }
}
