package com.google.android.gms.internal.ads;

import ze.tmM.zKUlck;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaao extends zzaaq implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;

    @Override // com.google.android.gms.internal.ads.zzaaq
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzaao zzaaoVar) {
        zzgvz zzgvzVarZza = zzgvz.zzg().zzd(this.zzf, zzaaoVar.zzf).zza(Integer.valueOf(this.zzi), Integer.valueOf(zzaaoVar.zzi), zzgyg.zzb().zza());
        int i10 = this.zzj;
        zzgvz zzgvzVarZzb = zzgvzVarZza.zzb(i10, zzaaoVar.zzj);
        int i11 = this.zzk;
        zzgvz zzgvzVarZzb2 = zzgvzVarZzb.zzb(i11, zzaaoVar.zzk).zza(Integer.valueOf(this.zzl), Integer.valueOf(zzaaoVar.zzl), zzgyg.zzb().zza()).zzd(this.zzg, zzaaoVar.zzg).zza(Boolean.valueOf(this.zzh), Boolean.valueOf(zzaaoVar.zzh), i10 == 0 ? zzgyg.zzb() : zzgyg.zzb().zza()).zzb(this.zzm, zzaaoVar.zzm);
        if (i11 == 0) {
            zzgvzVarZzb2 = zzgvzVarZzb2.zzc(this.zzn, zzaaoVar.zzn);
        }
        return zzgvzVarZzb2.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaaq
    public final /* bridge */ /* synthetic */ boolean zzc(zzaaq zzaaqVar) {
        return false;
    }

    public zzaao(int i10, zzbg zzbgVar, int i11, zzaam zzaamVar, int i12, String str, String str2) {
        boolean z10;
        boolean z11;
        zzgwm zzgwmVarZzj;
        int iZzj;
        int i13;
        boolean z12;
        boolean z13;
        boolean z14;
        super(i10, zzbgVar, i11);
        int i14 = 0;
        this.zzf = zznc.zzac(i12, false);
        int i15 = this.zzd.zze;
        int i16 = zzaamVar.zzC;
        if (1 != (i15 & 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.zzg = z10;
        if ((i15 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.zzh = z11;
        if (str2 != null) {
            zzgwmVarZzj = zzgwm.zzj(str2);
        } else if (zzaamVar.zzy.isEmpty()) {
            zzgwmVarZzj = zzgwm.zzj(zKUlck.NFNqkRiPX);
        } else {
            zzgwmVarZzj = zzaamVar.zzy;
        }
        int i17 = 0;
        while (true) {
            if (i17 < zzgwmVarZzj.size()) {
                iZzj = zzaay.zzj(this.zzd, (String) zzgwmVarZzj.get(i17), false);
                if (iZzj > 0) {
                    break;
                } else {
                    i17++;
                }
            } else {
                iZzj = 0;
                i17 = Integer.MAX_VALUE;
                break;
            }
        }
        this.zzi = i17;
        this.zzj = iZzj;
        if (str2 != null) {
            i13 = 1088;
        } else {
            i13 = 0;
        }
        int iZzm = zzaay.zzm(this.zzd.zzf, i13);
        this.zzk = iZzm;
        zzv zzvVar = this.zzd;
        if ((1088 & zzvVar.zzf) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.zzn = z12;
        int iZzn = zzaay.zzn(zzvVar, zzaamVar.zzz);
        this.zzl = iZzn;
        if (zzaay.zzi(str) == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        int iZzj2 = zzaay.zzj(this.zzd, str, z13);
        this.zzm = iZzj2;
        if (iZzj <= 0 && ((!zzaamVar.zzy.isEmpty() || iZzm <= 0) && ((!zzaamVar.zzy.isEmpty() || iZzn == Integer.MAX_VALUE) && !this.zzg && (!this.zzh || iZzj2 <= 0)))) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (zznc.zzac(i12, zzaamVar.zzV) && z14) {
            i14 = 1;
        }
        this.zze = i14;
    }
}
