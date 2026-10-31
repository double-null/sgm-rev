package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzamn implements zzahb {
    final /* synthetic */ zzamo zza;

    /* synthetic */ zzamn(zzamo zzamoVar, byte[] bArr) {
        Objects.requireNonNull(zzamoVar);
        this.zza = zzamoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final long zza() {
        zzamo zzamoVar = this.zza;
        return zzamoVar.zzf().zzh(zzamoVar.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final zzagz zzc(long j10) {
        zzamo zzamoVar = this.zza;
        long jZzd = zzamoVar.zzd() + BigInteger.valueOf(zzamoVar.zzf().zzi(j10)).multiply(BigInteger.valueOf(zzamoVar.zze() - zzamoVar.zzd())).divide(BigInteger.valueOf(zzamoVar.zzg())).longValue();
        String str = zzfl.zza;
        zzahc zzahcVar = new zzahc(j10, Math.max(zzamoVar.zzd(), Math.min(jZzd - 30000, zzamoVar.zze() - 1)));
        return new zzagz(zzahcVar, zzahcVar);
    }
}
