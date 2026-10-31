package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzmc {
    public final zzxi zza;
    public final Object zzb;
    public final zzzc[] zzc;
    public boolean zzd;
    public boolean zze;
    public boolean zzf;
    public zzmd zzg;
    public boolean zzh;
    private final boolean[] zzi;
    private final zznc[] zzj;
    private final zzabh zzk;
    private final zzmr zzl;
    private zzmc zzm;
    private zzzn zzn;
    private zzabi zzo;
    private long zzp;

    public zzmc(zznc[] zzncVarArr, long j10, zzabh zzabhVar, zzabl zzablVar, zzmr zzmrVar, zzmd zzmdVar, zzabi zzabiVar, long j11) {
        this.zzj = zzncVarArr;
        this.zzp = j10;
        this.zzk = zzabhVar;
        this.zzl = zzmrVar;
        zzxk zzxkVar = zzmdVar.zza;
        this.zzb = zzxkVar.zza;
        this.zzg = zzmdVar;
        this.zzn = zzzn.zza;
        this.zzo = zzabiVar;
        this.zzc = new zzzc[2];
        this.zzi = new boolean[2];
        long j12 = zzmdVar.zzb;
        long j13 = zzmdVar.zze;
        zzxi zzxiVarZze = zzmrVar.zze(zzxkVar, zzablVar, j12);
        this.zza = j13 != -9223372036854775807L ? new zzwo(zzxiVarZze, true, 0L, j13) : zzxiVarZze;
    }

    private final void zzu() {
        if (!zzw()) {
            return;
        }
        int i10 = 0;
        while (true) {
            zzabi zzabiVar = this.zzo;
            if (i10 >= zzabiVar.zza) {
                return;
            }
            zzabiVar.zza(i10);
            zzaba zzabaVar = this.zzo.zzc[i10];
            i10++;
        }
    }

    private final void zzv() {
        if (!zzw()) {
            return;
        }
        int i10 = 0;
        while (true) {
            zzabi zzabiVar = this.zzo;
            if (i10 >= zzabiVar.zza) {
                return;
            }
            zzabiVar.zza(i10);
            zzaba zzabaVar = this.zzo.zzc[i10];
            i10++;
        }
    }

    private final boolean zzw() {
        return this.zzm == null;
    }

    public final long zza() {
        return this.zzp;
    }

    public final void zzb(long j10) {
        this.zzp = j10;
    }

    public final long zzc() {
        return this.zzg.zzb + this.zzp;
    }

    public final boolean zzd() {
        if (this.zze) {
            return !this.zzf || this.zza.zzi() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean zze() {
        if (this.zze) {
            return zzd() || zzf() - this.zzg.zzb >= -9223372036854775807L;
        }
        return false;
    }

    public final long zzf() {
        if (!this.zze) {
            return this.zzg.zzb;
        }
        long jZzi = this.zzf ? this.zza.zzi() : Long.MIN_VALUE;
        return jZzi == Long.MIN_VALUE ? this.zzg.zzf : jZzi;
    }

    public final long zzg() {
        if (this.zze) {
            return this.zza.zzl();
        }
        return 0L;
    }

    public final void zzh(float f10, zzbf zzbfVar, boolean z10) throws zzjk {
        this.zze = true;
        this.zzn = this.zza.zzd();
        zzabi zzabiVarZzk = zzk(f10, zzbfVar, z10);
        zzmd zzmdVar = this.zzg;
        long jMax = zzmdVar.zzb;
        long j10 = zzmdVar.zzf;
        if (j10 != -9223372036854775807L && jMax >= j10) {
            jMax = Math.max(0L, j10 - 1);
        }
        long jZzl = zzl(zzabiVarZzk, jMax, false);
        long j11 = this.zzp;
        zzmd zzmdVar2 = this.zzg;
        this.zzp = j11 + (zzmdVar2.zzb - jZzl);
        this.zzg = zzmdVar2.zza(jZzl, zzmdVar2.zzc);
    }

    public final void zzi(long j10) {
        zzgtj.zzi(zzw());
        if (this.zze) {
            this.zza.zzg(j10 - this.zzp);
        }
    }

    public final void zzj(zzma zzmaVar) {
        zzgtj.zzi(zzw());
        this.zza.zzm(zzmaVar);
    }

    public final zzabi zzk(float f10, zzbf zzbfVar, boolean z10) throws zzjk {
        zzzn zzznVar = this.zzn;
        zzxk zzxkVar = this.zzg.zza;
        zzabh zzabhVar = this.zzk;
        zznc[] zzncVarArr = this.zzj;
        zzabi zzabiVarZzr = zzabhVar.zzr(zzncVarArr, zzznVar, zzxkVar, zzbfVar);
        for (int i10 = 0; i10 < zzabiVarZzr.zza; i10++) {
            boolean z11 = true;
            if (zzabiVarZzr.zza(i10)) {
                if (zzabiVarZzr.zzc[i10] == null) {
                    zzncVarArr[i10].zza();
                    z11 = false;
                }
                zzgtj.zzi(z11);
            } else {
                zzgtj.zzi(zzabiVarZzr.zzc[i10] == null);
            }
        }
        for (zzaba zzabaVar : zzabiVarZzr.zzc) {
        }
        return zzabiVarZzr;
    }

    public final long zzl(zzabi zzabiVar, long j10, boolean z10) {
        return zzm(zzabiVar, j10, false, new boolean[2]);
    }

    public final long zzm(zzabi zzabiVar, long j10, boolean z10, boolean[] zArr) {
        zznc[] zzncVarArr;
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= zzabiVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzi;
            if (z10 || !zzabiVar.zzb(this.zzo, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        int i11 = 0;
        while (true) {
            zzncVarArr = this.zzj;
            if (i11 >= 2) {
                break;
            }
            zzncVarArr[i11].zza();
            i11++;
        }
        zzv();
        this.zzo = zzabiVar;
        zzu();
        zzxi zzxiVar = this.zza;
        zzaba[] zzabaVarArr = zzabiVar.zzc;
        boolean[] zArr3 = this.zzi;
        zzzc[] zzzcVarArr = this.zzc;
        long jZze = zzxiVar.zze(zzabaVarArr, zArr3, zzzcVarArr, zArr, j10);
        for (int i12 = 0; i12 < 2; i12++) {
            zzncVarArr[i12].zza();
        }
        this.zzf = false;
        for (int i13 = 0; i13 < 2; i13++) {
            if (zzzcVarArr[i13] != null) {
                zzgtj.zzi(zzabiVar.zza(i13));
                zzncVarArr[i13].zza();
                this.zzf = true;
            } else {
                zzgtj.zzi(zzabaVarArr[i13] == null);
            }
        }
        return jZze;
    }

    public final void zzn() {
        zzv();
        zzxi zzxiVar = this.zza;
        try {
            boolean z10 = zzxiVar instanceof zzwo;
            zzmr zzmrVar = this.zzl;
            if (z10) {
                zzmrVar.zzf(((zzwo) zzxiVar).zza);
            } else {
                zzmrVar.zzf(zzxiVar);
            }
        } catch (RuntimeException e10) {
            zzeg.zzf("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public final void zzo(zzmc zzmcVar) {
        if (zzmcVar == this.zzm) {
            return;
        }
        zzv();
        this.zzm = zzmcVar;
        zzu();
    }

    public final zzmc zzp() {
        return this.zzm;
    }

    public final zzzn zzq() {
        return this.zzn;
    }

    public final zzabi zzr() {
        return this.zzo;
    }

    public final void zzs() {
        zzxi zzxiVar = this.zza;
        if (zzxiVar instanceof zzwo) {
            long j10 = this.zzg.zze;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            ((zzwo) zzxiVar).zza(0L, j10);
        }
    }

    public final void zzt(zzxh zzxhVar, long j10) {
        this.zzd = true;
        this.zza.zzb(zzxhVar, j10);
    }
}
