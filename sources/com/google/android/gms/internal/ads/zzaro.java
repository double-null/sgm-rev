package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaro implements zzarn {
    private final zzagb zza;
    private final zzahk zzb;
    private final zzarr zzc;
    private final zzv zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzaro(zzagb zzagbVar, zzahk zzahkVar, zzarr zzarrVar, String str, int i10) throws zzat {
        this.zza = zzagbVar;
        this.zzb = zzahkVar;
        this.zzc = zzarrVar;
        int i11 = zzarrVar.zzb * zzarrVar.zze;
        int i12 = zzarrVar.zzd;
        int i13 = i11 / 8;
        if (i12 != i13) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i13).length() + 28 + String.valueOf(i12).length());
            sb2.append("Expected block size: ");
            sb2.append(i13);
            sb2.append("; got: ");
            sb2.append(i12);
            throw zzat.zzb(sb2.toString(), null);
        }
        int i14 = zzarrVar.zzc * i13;
        int i15 = i14 * 8;
        int iMax = Math.max(i13, i14 / 10);
        this.zze = iMax;
        zzt zztVar = new zzt();
        zztVar.zzn("audio/wav");
        zztVar.zzo(str);
        zztVar.zzi(i15);
        zztVar.zzj(i15);
        zztVar.zzp(iMax);
        zztVar.zzG(zzarrVar.zzb);
        zztVar.zzH(zzarrVar.zzc);
        zztVar.zzI(i10);
        this.zzd = zztVar.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzarn
    public final void zza(long j10) {
        this.zzf = j10;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzarn
    public final void zzb(int i10, long j10) {
        zzaru zzaruVar = new zzaru(this.zzc, 1, i10, j10);
        this.zza.zzw(zzaruVar);
        zzahk zzahkVar = this.zzb;
        zzahkVar.zzA(this.zzd);
        zzahkVar.zzO(zzaruVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzarn
    public final boolean zzc(zzafz zzafzVar, long j10) throws IOException {
        int i10;
        int i11;
        long j11 = j10;
        while (j11 > 0 && (i10 = this.zzg) < (i11 = this.zze)) {
            int iZza = this.zzb.zza(zzafzVar, (int) Math.min(i11 - i10, j11), true);
            if (iZza == -1) {
                j11 = 0;
            } else {
                this.zzg += iZza;
                j11 -= (long) iZza;
            }
        }
        zzarr zzarrVar = this.zzc;
        int i12 = this.zzg;
        int i13 = zzarrVar.zzd;
        int i14 = i12 / i13;
        if (i14 > 0) {
            long jZzv = this.zzf + zzfl.zzv(this.zzh, 1000000L, zzarrVar.zzc, RoundingMode.DOWN);
            int i15 = i14 * i13;
            int i16 = this.zzg - i15;
            this.zzb.zze(jZzv, 1, i15, i16, null);
            this.zzh += (long) i14;
            this.zzg = i16;
        }
        return j11 <= 0;
    }
}
