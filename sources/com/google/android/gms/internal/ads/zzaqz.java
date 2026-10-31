package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaqz {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfi zza = new zzfi(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzet zzb = new zzet();

    zzaqz(int i10) {
    }

    private final int zze(zzafz zzafzVar) {
        byte[] bArr = zzfl.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
        this.zzc = true;
        zzafzVar.zzl();
        return 0;
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final int zzb(zzafz zzafzVar, zzagy zzagyVar, int i10) throws IOException {
        if (i10 <= 0) {
            zze(zzafzVar);
            return 0;
        }
        long j10 = -9223372036854775807L;
        if (!this.zze) {
            long jZzo = zzafzVar.zzo();
            int iMin = (int) Math.min(112800L, jZzo);
            long j11 = jZzo - ((long) iMin);
            if (zzafzVar.zzn() == j11) {
                zzet zzetVar = this.zzb;
                zzetVar.zza(iMin);
                zzafzVar.zzl();
                zzafzVar.zzi(zzetVar.zzi(), 0, iMin);
                int iZzg = zzetVar.zzg();
                int iZze = zzetVar.zze();
                for (int i11 = iZze - 188; i11 >= iZzg; i11--) {
                    byte[] bArrZzi = zzetVar.zzi();
                    int i12 = 0;
                    for (int i13 = -4; i13 <= 4; i13++) {
                        int i14 = (i13 * 188) + i11;
                        if (i14 >= iZzg && i14 < iZze && bArrZzi[i14] == 71) {
                            i12++;
                            if (i12 == 5) {
                                long jZzb = zzarj.zzb(zzetVar, i11, i10);
                                if (jZzb == -9223372036854775807L) {
                                    break;
                                }
                                j10 = jZzb;
                                break;
                            }
                        } else {
                            i12 = 0;
                        }
                    }
                }
                this.zzg = j10;
                this.zze = true;
                return 0;
            }
            zzagyVar.zza = j11;
        } else {
            if (this.zzg == -9223372036854775807L) {
                zze(zzafzVar);
                return 0;
            }
            if (this.zzd) {
                long j12 = this.zzf;
                if (j12 == -9223372036854775807L) {
                    zze(zzafzVar);
                    return 0;
                }
                zzfi zzfiVar = this.zza;
                this.zzh = zzfiVar.zzf(this.zzg) - zzfiVar.zze(j12);
                zze(zzafzVar);
                return 0;
            }
            int iMin2 = (int) Math.min(112800L, zzafzVar.zzo());
            if (zzafzVar.zzn() == 0) {
                zzet zzetVar2 = this.zzb;
                zzetVar2.zza(iMin2);
                zzafzVar.zzl();
                zzafzVar.zzi(zzetVar2.zzi(), 0, iMin2);
                int iZze2 = zzetVar2.zze();
                for (int iZzg2 = zzetVar2.zzg(); iZzg2 < iZze2; iZzg2++) {
                    if (zzetVar2.zzi()[iZzg2] == 71) {
                        long jZzb2 = zzarj.zzb(zzetVar2, iZzg2, i10);
                        if (jZzb2 != -9223372036854775807L) {
                            j10 = jZzb2;
                            break;
                        }
                    }
                }
                this.zzf = j10;
                this.zzd = true;
                return 0;
            }
            zzagyVar.zza = 0L;
        }
        return 1;
    }

    public final long zzc() {
        return this.zzh;
    }

    public final zzfi zzd() {
        return this.zza;
    }
}
