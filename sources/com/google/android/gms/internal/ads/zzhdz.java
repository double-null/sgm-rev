package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhdz {
    private static final zzhdx zza = zzhdy.zza;
    private final zzhdq zzb;
    private final zzhds zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final zzhdx zzg;
    private final int zzh;

    /* synthetic */ zzhdz(zzhdq zzhdqVar, int i10, int i11, boolean z10, boolean z11, zzhdx zzhdxVar, byte[] bArr) {
        this.zzb = zzhdqVar;
        this.zzh = i10;
        int i12 = i10 - 2;
        this.zzc = i12 != 1 ? i12 != 3 ? zzhds.zzb : zzhds.zzc : zzhds.zza;
        this.zzd = i11;
        this.zze = z10;
        this.zzf = z11;
        this.zzg = zzhdxVar;
    }

    public final zzhdq zza() {
        this.zzg.zza(this);
        return this.zzb;
    }

    public final zzhds zzb() {
        return this.zzc;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final boolean zzd() {
        return this.zze;
    }

    final /* synthetic */ zzhdq zzf() {
        return this.zzb;
    }

    final /* synthetic */ int zzg() {
        return this.zzd;
    }

    final /* synthetic */ boolean zzh() {
        return this.zze;
    }

    final /* synthetic */ boolean zzi() {
        return this.zzf;
    }

    final /* synthetic */ int zzj() {
        return this.zzh;
    }
}
