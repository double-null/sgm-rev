package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaqx implements zzafj {
    private final zzfi zza;
    private final zzet zzb = new zzet();
    private final int zzc;

    public zzaqx(int i10, zzfi zzfiVar, int i11) {
        this.zzc = i10;
        this.zza = zzfiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafj
    public final zzafi zza(zzafz zzafzVar, long j10) throws IOException {
        int iZza;
        int iZza2;
        long jZzn = zzafzVar.zzn();
        int iMin = (int) Math.min(112800L, zzafzVar.zzo() - jZzn);
        zzet zzetVar = this.zzb;
        zzetVar.zza(iMin);
        zzafzVar.zzi(zzetVar.zzi(), 0, iMin);
        int iZze = zzetVar.zze();
        long j11 = -1;
        long j12 = -9223372036854775807L;
        long j13 = -1;
        while (zzetVar.zzd() >= 188 && (iZza2 = (iZza = zzarj.zza(zzetVar.zzi(), zzetVar.zzg(), iZze)) + 188) <= iZze) {
            long jZzb = zzarj.zzb(zzetVar, iZza, this.zzc);
            if (jZzb != -9223372036854775807L) {
                long jZze = this.zza.zze(jZzb);
                if (jZze <= j10) {
                    j13 = iZza;
                    if (100000 + jZze <= j10) {
                        j12 = jZze;
                    }
                } else if (j12 == -9223372036854775807L) {
                    return zzafi.zza(jZze, jZzn);
                }
                return zzafi.zzc(jZzn + j13);
            }
            zzetVar.zzh(iZza2);
            j11 = iZza2;
        }
        return j12 != -9223372036854775807L ? zzafi.zzb(j12, jZzn + j11) : zzafi.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafj
    public final void zzb() {
        byte[] bArr = zzfl.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
    }
}
