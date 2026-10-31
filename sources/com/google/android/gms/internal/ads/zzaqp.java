package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaqp {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfi zza = new zzfi(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzet zzb = new zzet();

    zzaqp() {
    }

    public static long zze(zzet zzetVar) {
        int iZzg = zzetVar.zzg();
        if (zzetVar.zzd() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzetVar.zzm(bArr, 0, 9);
        zzetVar.zzh(iZzg);
        byte b10 = bArr[0];
        if ((b10 & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b11 = bArr[2];
        if ((b11 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b12 = bArr[4];
        if ((b12 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j10 = b10;
        long j11 = b11;
        long j12 = (248 & j11) >> 3;
        long j13 = (j11 & 3) << 13;
        return j13 | ((bArr[1] & 255) << 20) | ((j10 & 3) << 28) | (((j10 & 56) >> 3) << 30) | (j12 << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b12) & 248) >> 3);
    }

    private final int zzf(zzafz zzafzVar) {
        byte[] bArr = zzfl.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
        this.zzc = true;
        zzafzVar.zzl();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final zzfi zzb() {
        return this.zza;
    }

    public final int zzc(zzafz zzafzVar, zzagy zzagyVar) throws IOException {
        long j10 = -9223372036854775807L;
        if (!this.zze) {
            long jZzo = zzafzVar.zzo();
            int iMin = (int) Math.min(20000L, jZzo);
            long j11 = jZzo - ((long) iMin);
            if (zzafzVar.zzn() != j11) {
                zzagyVar.zza = j11;
                return 1;
            }
            zzet zzetVar = this.zzb;
            zzetVar.zza(iMin);
            zzafzVar.zzl();
            zzafzVar.zzi(zzetVar.zzi(), 0, iMin);
            int iZzg = zzetVar.zzg();
            for (int iZze = zzetVar.zze() - 4; iZze >= iZzg; iZze--) {
                if (zzg(zzetVar.zzi(), iZze) == 442) {
                    zzetVar.zzh(iZze + 4);
                    long jZze = zze(zzetVar);
                    if (jZze != -9223372036854775807L) {
                        j10 = jZze;
                        break;
                    }
                }
            }
            this.zzg = j10;
            this.zze = true;
        } else {
            if (this.zzg == -9223372036854775807L) {
                zzf(zzafzVar);
                return 0;
            }
            if (this.zzd) {
                long j12 = this.zzf;
                if (j12 == -9223372036854775807L) {
                    zzf(zzafzVar);
                    return 0;
                }
                zzfi zzfiVar = this.zza;
                this.zzh = zzfiVar.zzf(this.zzg) - zzfiVar.zze(j12);
                zzf(zzafzVar);
                return 0;
            }
            int iMin2 = (int) Math.min(20000L, zzafzVar.zzo());
            if (zzafzVar.zzn() != 0) {
                zzagyVar.zza = 0L;
                return 1;
            }
            zzet zzetVar2 = this.zzb;
            zzetVar2.zza(iMin2);
            zzafzVar.zzl();
            zzafzVar.zzi(zzetVar2.zzi(), 0, iMin2);
            int iZze2 = zzetVar2.zze();
            for (int iZzg2 = zzetVar2.zzg(); iZzg2 < iZze2 - 3; iZzg2++) {
                if (zzg(zzetVar2.zzi(), iZzg2) == 442) {
                    zzetVar2.zzh(iZzg2 + 4);
                    long jZze2 = zze(zzetVar2);
                    if (jZze2 != -9223372036854775807L) {
                        j10 = jZze2;
                        break;
                    }
                }
            }
            this.zzf = j10;
            this.zzd = true;
        }
        return 0;
    }

    public final long zzd() {
        return this.zzh;
    }
}
