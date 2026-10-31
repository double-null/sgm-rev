package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzama implements zzahb {
    private final long zza;
    private final zzamb[] zzb;
    private final int zzc;

    public zzama(long j10, zzamb[] zzambVarArr, int i10) {
        this.zza = j10;
        this.zzb = zzambVarArr;
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final boolean zzb() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0077 A[PHI: r10
      0x0077: PHI (r10v2 long) = (r10v1 long), (r10v4 long) binds: [B:23:0x0060, B:25:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x0091  */
    /* JADX WARN: Code duplicated, block: B:32:0x0098  */
    @Override // com.google.android.gms.internal.ads.zzahb
    public final zzagz zzc(long j10) {
        long j11;
        long j12;
        long j13;
        long j14;
        int i10;
        long jZzh;
        long jZzh2;
        zzaml zzamlVar;
        int iZzb;
        zzamb[] zzambVarArr = this.zzb;
        if (zzambVarArr.length == 0) {
            zzahc zzahcVar = zzahc.zza;
            return new zzagz(zzahcVar, zzahcVar);
        }
        int i11 = this.zzc;
        long j15 = -9223372036854775807L;
        if (i11 != -1) {
            zzaml zzamlVar2 = zzambVarArr[i11].zzb;
            int iZzl = zzamc.zzl(zzamlVar2, j10);
            if (iZzl == -1) {
                zzahc zzahcVar2 = zzahc.zza;
                return new zzagz(zzahcVar2, zzahcVar2);
            }
            long[] jArr = zzamlVar2.zzf;
            j12 = jArr[iZzl];
            long[] jArr2 = zzamlVar2.zzc;
            j11 = jArr2[iZzl];
            if (j12 < j10 && iZzl < zzamlVar2.zzb - 1 && (iZzb = zzamlVar2.zzb(j10)) != -1 && iZzb != iZzl) {
                j13 = jArr[iZzb];
                j14 = jArr2[iZzb];
            }
            i10 = 0;
            jZzh = j11;
            jZzh2 = j14;
            while (i10 < zzambVarArr.length) {
                if (i10 != i11) {
                    zzamlVar = zzambVarArr[i10].zzb;
                    jZzh = zzamc.zzh(zzamlVar, j12, jZzh);
                    if (j13 != j15) {
                        jZzh2 = zzamc.zzh(zzamlVar, j13, jZzh2);
                    }
                }
                i10++;
                j15 = -9223372036854775807L;
            }
            long j16 = jZzh2;
            zzahc zzahcVar3 = new zzahc(j12, jZzh);
            return j13 == -9223372036854775807L ? new zzagz(zzahcVar3, zzahcVar3) : new zzagz(zzahcVar3, new zzahc(j13, j16));
        }
        j11 = Long.MAX_VALUE;
        j12 = j10;
        j13 = -9223372036854775807L;
        j14 = -1;
        i10 = 0;
        jZzh = j11;
        jZzh2 = j14;
        while (i10 < zzambVarArr.length) {
            if (i10 != i11) {
                zzamlVar = zzambVarArr[i10].zzb;
                jZzh = zzamc.zzh(zzamlVar, j12, jZzh);
                if (j13 != j15) {
                    jZzh2 = zzamc.zzh(zzamlVar, j13, jZzh2);
                }
            }
            i10++;
            j15 = -9223372036854775807L;
        }
        long j17 = jZzh2;
        zzahc zzahcVar4 = new zzahc(j12, jZzh);
        if (j13 == -9223372036854775807L) {
        }
    }
}
