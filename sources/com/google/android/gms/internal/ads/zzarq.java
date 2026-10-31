package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzarq implements zzafy {
    private zzagb zza;
    private zzahk zzb;
    private zzarn zze;
    private int zzc = 0;
    private long zzd = -1;
    private int zzf = -1;
    private long zzg = -1;

    static {
        int i10 = zzarp.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zza(zzafz zzafzVar) throws IOException {
        return zzart.zza(zzafzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc(zzagb zzagbVar) {
        this.zza = zzagbVar;
        this.zzb = zzagbVar.zzu(0, 1);
        zzagbVar.zzv();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0106  */
    @Override // com.google.android.gms.internal.ads.zzafy
    public final int zzd(zzafz zzafzVar, zzagy zzagyVar) throws IOException {
        int iZzB;
        int i10;
        this.zzb.getClass();
        String str = zzfl.zza;
        int i11 = this.zzc;
        if (i11 == 0) {
            zzgtj.zzi(zzafzVar.zzn() == 0);
            int i12 = this.zzf;
            if (i12 != -1) {
                zzafzVar.zzf(i12);
                this.zzc = 4;
            } else {
                if (!zzart.zza(zzafzVar)) {
                    throw zzat.zzb("Unsupported or unrecognized wav file type.", null);
                }
                zzafzVar.zzf((int) (zzafzVar.zzm() - zzafzVar.zzn()));
                this.zzc = 1;
            }
            return 0;
        }
        long jZzE = -1;
        if (i11 == 1) {
            int i13 = zzart.zza;
            zzet zzetVar = new zzet(8);
            zzars zzarsVarZza = zzars.zza(zzafzVar, zzetVar);
            if (zzarsVarZza.zza != 1685272116) {
                zzafzVar.zzl();
            } else {
                zzafzVar.zzk(8);
                zzetVar.zzh(0);
                zzafzVar.zzi(zzetVar.zzi(), 0, 8);
                jZzE = zzetVar.zzE();
                zzafzVar.zzf(((int) zzarsVarZza.zzb) + 8);
            }
            this.zzd = jZzE;
            this.zzc = 2;
            return 0;
        }
        if (i11 == 2) {
            zzarr zzarrVarZzb = zzart.zzb(zzafzVar);
            int i14 = zzarrVarZzb.zza;
            if (i14 == 17) {
                this.zze = new zzarm(this.zza, this.zzb, zzarrVarZzb);
            } else if (i14 == 6) {
                this.zze = new zzaro(this.zza, this.zzb, zzarrVarZzb, "audio/g711-alaw", -1);
            } else if (i14 == 7) {
                this.zze = new zzaro(this.zza, this.zzb, zzarrVarZzb, "audio/g711-mlaw", -1);
            } else {
                int i15 = zzarrVarZzb.zze;
                if (i14 == 1) {
                    iZzB = zzfl.zzB(i15, ByteOrder.LITTLE_ENDIAN);
                    i10 = iZzB;
                } else if (i14 == 3) {
                    iZzB = zzfl.zzC(i15);
                    i10 = iZzB;
                } else if (i14 != 65534) {
                    i10 = 0;
                } else {
                    iZzB = zzfl.zzB(i15, ByteOrder.LITTLE_ENDIAN);
                    i10 = iZzB;
                }
                if (i10 == 0) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i14).length() + 29);
                    sb2.append("Unsupported WAV format type: ");
                    sb2.append(i14);
                    throw zzat.zzc(sb2.toString());
                }
                this.zze = new zzaro(this.zza, this.zzb, zzarrVarZzb, "audio/raw", i10);
            }
            this.zzc = 3;
            return 0;
        }
        if (i11 != 3) {
            zzgtj.zzi(this.zzg != -1);
            long jZzn = this.zzg - zzafzVar.zzn();
            zzarn zzarnVar = this.zze;
            zzarnVar.getClass();
            return zzarnVar.zzc(zzafzVar, jZzn) ? -1 : 0;
        }
        Pair pairZzc = zzart.zzc(zzafzVar);
        this.zzf = ((Long) pairZzc.first).intValue();
        long jLongValue = ((Long) pairZzc.second).longValue();
        long j10 = this.zzd;
        if (j10 != -1 && jLongValue == 4294967295L) {
            jLongValue = j10;
        }
        long j11 = ((long) this.zzf) + jLongValue;
        this.zzg = j11;
        long jZzo = zzafzVar.zzo();
        if (jZzo != -1 && j11 > jZzo) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(j11).length() + 29 + String.valueOf(jZzo).length());
            sb3.append("Data exceeds input length: ");
            sb3.append(j11);
            sb3.append(", ");
            sb3.append(jZzo);
            zzeg.zzc("WavExtractor", sb3.toString());
            this.zzg = jZzo;
            j11 = jZzo;
        }
        zzarn zzarnVar2 = this.zze;
        zzarnVar2.getClass();
        zzarnVar2.zzb(this.zzf, j11);
        this.zzc = 4;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zze(long j10, long j11) {
        this.zzc = j10 == 0 ? 0 : 4;
        zzarn zzarnVar = this.zze;
        if (zzarnVar != null) {
            zzarnVar.zza(j11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzf() {
    }
}
