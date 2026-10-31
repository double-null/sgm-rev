package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzahp implements zzafy {
    private static final int[] zza;
    private static final int[] zzb;
    private static final byte[] zzc;
    private static final byte[] zzd;
    private final byte[] zze;
    private final zzahk zzf;
    private boolean zzg;
    private long zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private zzagb zzn;
    private zzahk zzo;
    private zzahk zzp;
    private zzahb zzq;
    private long zzr;
    private boolean zzs;

    static {
        int i10 = zzaho.zza;
        zza = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
        zzb = new int[]{18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        String str = zzfl.zza;
        zzc = "#!AMR\n".getBytes(StandardCharsets.UTF_8);
        zzd = "#!AMR-WB\n".getBytes(StandardCharsets.UTF_8);
    }

    public zzahp() {
        throw null;
    }

    private final boolean zzh(zzafz zzafzVar) throws IOException {
        byte[] bArr = zzc;
        if (zzi(zzafzVar, bArr)) {
            this.zzg = false;
            zzafzVar.zzf(bArr.length);
            return true;
        }
        byte[] bArr2 = zzd;
        if (!zzi(zzafzVar, bArr2)) {
            return false;
        }
        this.zzg = true;
        zzafzVar.zzf(bArr2.length);
        return true;
    }

    private static boolean zzi(zzafz zzafzVar, byte[] bArr) throws IOException {
        zzafzVar.zzl();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        zzafzVar.zzi(bArr2, 0, length);
        return Arrays.equals(bArr2, bArr);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    private final int zzj(zzafz zzafzVar) throws IOException {
        int i10 = this.zzj;
        if (i10 == 0) {
            try {
                zzafzVar.zzl();
                byte[] bArr = this.zze;
                zzafzVar.zzi(bArr, 0, 1);
                byte b10 = bArr[0];
                if ((b10 & 131) > 0) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf((int) b10).length() + 38);
                    sb2.append("Invalid padding bits for frame header ");
                    sb2.append((int) b10);
                    throw zzat.zzb(sb2.toString(), null);
                }
                boolean z10 = this.zzg;
                int i11 = (b10 >> 3) & 15;
                if (!z10) {
                    if (!z10) {
                        if (i11 >= 12 && i11 <= 14) {
                        }
                    }
                    String str = true != z10 ? "NB" : "WB";
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i11).length() + 26);
                    sb3.append("Illegal AMR ");
                    sb3.append(str);
                    sb3.append(" frame type ");
                    sb3.append(i11);
                    throw zzat.zzb(sb3.toString(), null);
                }
                if (i11 >= 10 && i11 <= 13) {
                    if (!z10) {
                        if (i11 >= 12) {
                        }
                    }
                    if (true != z10) {
                    }
                    StringBuilder sb4 = new StringBuilder(String.valueOf(i11).length() + 26);
                    sb4.append("Illegal AMR ");
                    sb4.append(str);
                    sb4.append(" frame type ");
                    sb4.append(i11);
                    throw zzat.zzb(sb4.toString(), null);
                }
                i10 = z10 ? zzb[i11] : zza[i11];
                this.zzi = i10;
                this.zzj = i10;
                int i12 = this.zzk;
                if (i12 == -1) {
                    this.zzk = i10;
                    i12 = i10;
                }
                if (i12 == i10) {
                    this.zzl++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iZza = this.zzp.zza(zzafzVar, i10, true);
        if (iZza == -1) {
            return -1;
        }
        int i13 = this.zzj - iZza;
        this.zzj = i13;
        if (i13 > 0) {
            return 0;
        }
        this.zzp.zze(this.zzh, 1, this.zzi, 0, null);
        this.zzh += 20000;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zza(zzafz zzafzVar) throws IOException {
        return zzh(zzafzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc(zzagb zzagbVar) {
        this.zzn = zzagbVar;
        zzahk zzahkVarZzu = zzagbVar.zzu(0, 1);
        this.zzo = zzahkVarZzu;
        this.zzp = zzahkVarZzu;
        zzagbVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final int zzd(zzafz zzafzVar, zzagy zzagyVar) throws IOException {
        this.zzo.getClass();
        String str = zzfl.zza;
        if (zzafzVar.zzn() == 0 && !zzh(zzafzVar)) {
            throw zzat.zzb("Could not find AMR header.", null);
        }
        if (!this.zzs) {
            this.zzs = true;
            boolean z10 = this.zzg;
            String str2 = true != z10 ? "audio/amr" : "audio/amr-wb";
            String str3 = true != z10 ? "audio/3gpp" : "audio/amr-wb";
            int i10 = true != z10 ? 8000 : 16000;
            int i11 = z10 ? zzb[8] : zza[7];
            zzahk zzahkVar = this.zzo;
            zzt zztVar = new zzt();
            zztVar.zzn(str2);
            zztVar.zzo(str3);
            zztVar.zzp(i11);
            zztVar.zzG(1);
            zztVar.zzH(i10);
            zzahkVar.zzA(zztVar.zzO());
        }
        int iZzj = zzj(zzafzVar);
        if (this.zzq == null) {
            zzaha zzahaVar = new zzaha(-9223372036854775807L, 0L);
            this.zzq = zzahaVar;
            this.zzn.zzw(zzahaVar);
        }
        return iZzj == -1 ? -1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zze(long j10, long j11) {
        this.zzh = 0L;
        this.zzi = 0;
        this.zzj = 0;
        this.zzr = j11;
        this.zzm = 0L;
    }

    public zzahp(int i10) {
        this.zze = new byte[1];
        this.zzk = -1;
        zzafv zzafvVar = new zzafv();
        this.zzf = zzafvVar;
        this.zzp = zzafvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzf() {
    }
}
