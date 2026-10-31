package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhlz extends zzhdq {
    private final zzhnm zza;

    public zzhlz(zzhnm zzhnmVar, zzhel zzhelVar) throws GeneralSecurityException {
        zze(zzhnmVar, zzhelVar);
        this.zza = zzhnmVar;
    }

    private static void zze(zzhnm zzhnmVar, zzhel zzhelVar) throws GeneralSecurityException {
        int i10 = zzhlx.zzb[zzhnmVar.zzc().ordinal()];
    }

    @Override // com.google.android.gms.internal.ads.zzhdq
    public final zzheh zza() {
        zzhnm zzhnmVar = this.zza;
        return new zzhly(zzhnmVar.zzg(), zzhnmVar.zzd(), null);
    }

    @Override // com.google.android.gms.internal.ads.zzhdq
    public final Integer zzb() {
        return this.zza.zze();
    }

    public final zzhnm zzc(zzhel zzhelVar) throws GeneralSecurityException {
        zzhnm zzhnmVar = this.zza;
        zze(zzhnmVar, zzhelVar);
        return zzhnmVar;
    }

    public final zziaz zzd() throws GeneralSecurityException {
        zzhnm zzhnmVar = this.zza;
        if (zzhnmVar.zzd().equals(zzhtm.RAW)) {
            return zziaz.zza(new byte[0]);
        }
        if (zzhnmVar.zzd().equals(zzhtm.TINK)) {
            return zzhms.zzb(zzhnmVar.zze().intValue());
        }
        if (zzhnmVar.zzd().equals(zzhtm.LEGACY) || zzhnmVar.zzd().equals(zzhtm.CRUNCHY)) {
            return zzhms.zza(zzhnmVar.zze().intValue());
        }
        throw new GeneralSecurityException("Unknown output prefix type");
    }
}
