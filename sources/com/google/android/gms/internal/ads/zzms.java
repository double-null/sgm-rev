package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzms {
    private static final zzxk zzu = new zzxk(new Object(), -1);
    public final zzbf zza;
    public final zzxk zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    public final zzjk zzf;
    public final boolean zzg;
    public final zzzn zzh;
    public final zzabi zzi;
    public final List zzj;
    public final zzxk zzk;
    public final boolean zzl;
    public final int zzm;
    public final int zzn;
    public final zzav zzo;
    public final boolean zzp = false;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;
    public volatile long zzt;

    public zzms(zzbf zzbfVar, zzxk zzxkVar, long j10, long j11, int i10, zzjk zzjkVar, boolean z10, zzzn zzznVar, zzabi zzabiVar, List list, zzxk zzxkVar2, boolean z11, int i11, int i12, zzav zzavVar, long j12, long j13, long j14, long j15, boolean z12) {
        this.zza = zzbfVar;
        this.zzb = zzxkVar;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = i10;
        this.zzf = zzjkVar;
        this.zzg = z10;
        this.zzh = zzznVar;
        this.zzi = zzabiVar;
        this.zzj = list;
        this.zzk = zzxkVar2;
        this.zzl = z11;
        this.zzm = i11;
        this.zzn = i12;
        this.zzo = zzavVar;
        this.zzq = j12;
        this.zzr = j13;
        this.zzs = j14;
        this.zzt = j15;
    }

    public static zzms zza(zzabi zzabiVar) {
        zzbf zzbfVar = zzbf.zza;
        zzxk zzxkVar = zzu;
        return new zzms(zzbfVar, zzxkVar, -9223372036854775807L, 0L, 1, null, false, zzzn.zza, zzabiVar, zzgwm.zzi(), zzxkVar, false, 1, 0, zzav.zza, 0L, 0L, 0L, 0L, false);
    }

    public static zzxk zzb() {
        return zzu;
    }

    public final zzms zzc(zzxk zzxkVar, long j10, long j11, long j12, long j13, zzzn zzznVar, zzabi zzabiVar, List list) {
        zzxk zzxkVar2 = this.zzk;
        boolean z10 = this.zzl;
        int i10 = this.zzm;
        int i11 = this.zzn;
        zzav zzavVar = this.zzo;
        long j14 = this.zzq;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        return new zzms(this.zza, zzxkVar, j11, j12, this.zze, this.zzf, this.zzg, zzznVar, zzabiVar, list, zzxkVar2, z10, i10, i11, zzavVar, j14, j13, j10, jElapsedRealtime, false);
    }

    public final zzms zzd(zzbf zzbfVar) {
        return new zzms(zzbfVar, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzms zze(int i10) {
        return new zzms(this.zza, this.zzb, this.zzc, this.zzd, i10, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzms zzf(zzjk zzjkVar) {
        return new zzms(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzjkVar, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzms zzg(boolean z10) {
        return new zzms(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, z10, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzms zzh(zzxk zzxkVar) {
        return new zzms(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzxkVar, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzms zzi(boolean z10, int i10, int i11) {
        return new zzms(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z10, i10, i11, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final boolean zzj() {
        return this.zze == 3 && this.zzl && this.zzn == 0;
    }
}
