package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzakz {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzet zzf;
    private final zzet zzg;
    private int zzh;
    private int zzi;

    public zzakz(zzet zzetVar, zzet zzetVar2, boolean z10) throws zzat {
        this.zzg = zzetVar;
        this.zzf = zzetVar2;
        this.zze = z10;
        zzetVar2.zzh(12);
        this.zza = zzetVar2.zzH();
        zzetVar.zzh(12);
        this.zzi = zzetVar.zzH();
        zzagc.zza(zzetVar.zzB() == 1, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        int i10 = this.zzb + 1;
        this.zzb = i10;
        if (i10 == this.zza) {
            return false;
        }
        this.zzd = this.zze ? this.zzf.zzJ() : this.zzf.zzz();
        if (this.zzb == this.zzh) {
            zzet zzetVar = this.zzg;
            this.zzc = zzetVar.zzH();
            zzetVar.zzk(4);
            int i11 = this.zzi - 1;
            this.zzi = i11;
            this.zzh = i11 > 0 ? (-1) + zzetVar.zzH() : -1;
        }
        return true;
    }
}
