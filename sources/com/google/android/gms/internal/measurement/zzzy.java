package com.google.android.gms.internal.measurement;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzzy extends zzaaa {
    private final zzzj zza;
    private final zzzj zzb;
    private final int[] zzc;
    private final int zzd;

    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* synthetic */ zzzy(zzzj zzzjVar, zzzj zzzjVar2, byte[] bArr) {
        super(null);
        this.zza = zzzjVar;
        this.zzb = zzzjVar2;
        int iZza = zzzjVar2.zza();
        zzabr.zzb(iZza <= 28, "metadata size too large");
        int[] iArr = new int[iZza];
        this.zzc = iArr;
        long j10 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i10 < iArr.length) {
            zzyl zzylVarZzd = zzd(i10);
            long jZzi = zzylVarZzd.zzi() | j10;
            if (jZzi == j10) {
                int i12 = 0;
                while (true) {
                    if (i12 >= i11) {
                        i12 = -1;
                        break;
                    } else if (zzylVarZzd.equals(zzd(iArr[i12] & 31))) {
                        break;
                    } else {
                        i12++;
                    }
                }
                if (i12 != -1) {
                    iArr[i12] = zzylVarZzd.zzf() ? iArr[i12] | (1 << (i10 + 4)) : i10;
                } else {
                    iArr[i11] = i10;
                    i11++;
                }
            } else {
                iArr[i11] = i10;
                i11++;
            }
            i10++;
            j10 = jZzi;
        }
        this.zzd = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final zzyl zzd(int i10) {
        zzzj zzzjVar = this.zza;
        int iZza = zzzjVar.zza();
        if (i10 >= iZza) {
            zzzjVar = this.zzb;
            i10 -= iZza;
        }
        return zzzjVar.zzb(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final Object zze(int i10) {
        zzzj zzzjVar = this.zza;
        int iZza = zzzjVar.zza();
        if (i10 >= iZza) {
            zzzjVar = this.zzb;
            i10 -= iZza;
        }
        return zzzjVar.zzc(i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzaaa
    public final void zza(zzzq zzzqVar, Object obj) {
        for (int i10 = 0; i10 < this.zzd; i10++) {
            int i11 = this.zzc[i10];
            zzyl zzylVarZzd = zzd(i11 & 31);
            if (zzylVarZzd.zzf()) {
                zzzqVar.zzb(zzylVarZzd, new zzzx(this, zzylVarZzd, i11, null), obj);
            } else {
                zzzqVar.zza(zzylVarZzd, zzylVarZzd.zze(zze(i11)), obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaaa
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzaaa
    public final Set zzc() {
        return new zzzw(this);
    }

    final /* synthetic */ int[] zzf() {
        return this.zzc;
    }

    final /* synthetic */ int zzg() {
        return this.zzd;
    }
}
