package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzakv {
    public final zzagv zza;
    public final long zzb;
    public final long zzc;
    public final zzakr zzd;
    public final int zze;
    public final int zzf;
    public final long[] zzg;

    private zzakv(zzagv zzagvVar, long j10, long j11, long[] jArr, zzakr zzakrVar, int i10, int i11) {
        this.zza = new zzagv(zzagvVar);
        this.zzb = j10;
        this.zzc = j11;
        this.zzg = jArr;
        this.zzd = zzakrVar;
        this.zze = i10;
        this.zzf = i11;
    }

    public static zzakv zza(zzagv zzagvVar, zzet zzetVar) {
        long[] jArr;
        int i10;
        int i11;
        zzakr zzakrVar;
        int iZzB = zzetVar.zzB();
        int iZzH = (iZzB & 1) != 0 ? zzetVar.zzH() : -1;
        long jZzz = (iZzB & 2) != 0 ? zzetVar.zzz() : -1L;
        if ((iZzB & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i12 = 0; i12 < 100; i12++) {
                jArr2[i12] = zzetVar.zzs();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((iZzB & 8) != 0) {
            zzetVar.zzk(4);
        }
        if (zzetVar.zzd() >= 24) {
            zzetVar.zzk(11);
            zzakr zzakrVarZzb = zzakr.zzb(Float.intBitsToFloat(zzetVar.zzB()), zzetVar.zzt(), zzetVar.zzt());
            zzetVar.zzk(2);
            int iZzx = zzetVar.zzx();
            i11 = iZzx & 4095;
            zzakrVar = zzakrVarZzb;
            i10 = iZzx >> 12;
        } else {
            i10 = -1;
            i11 = -1;
            zzakrVar = null;
        }
        return new zzakv(zzagvVar, iZzH, jZzz, jArr, zzakrVar, i10, i11);
    }

    public final long zzb() {
        long j10 = this.zzb;
        if (j10 == -1 || j10 == 0) {
            return -9223372036854775807L;
        }
        zzagv zzagvVar = this.zza;
        return zzfl.zzt((j10 * ((long) zzagvVar.zzg)) - 1, zzagvVar.zzd);
    }
}
