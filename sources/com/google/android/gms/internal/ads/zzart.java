package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.util.Arrays;
import sc.NfwM.XDucgbzInpQa;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzart {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};
    private static final byte[] zzc = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static boolean zza(zzafz zzafzVar) throws IOException {
        zzet zzetVar = new zzet(8);
        int i10 = zzars.zza(zzafzVar, zzetVar).zza;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        zzafzVar.zzi(zzetVar.zzi(), 0, 4);
        zzetVar.zzh(0);
        int iZzB = zzetVar.zzB();
        if (iZzB == 1463899717) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzB).length() + 23);
        sb2.append("Unsupported form type: ");
        sb2.append(iZzB);
        zzeg.zze("WavHeaderReader", sb2.toString());
        return false;
    }

    public static Pair zzc(zzafz zzafzVar) throws IOException {
        zzafzVar.zzl();
        zzars zzarsVarZzd = zzd(1684108385, zzafzVar, new zzet(8));
        zzafzVar.zzf(8);
        return Pair.create(Long.valueOf(zzafzVar.zzn()), Long.valueOf(zzarsVarZzd.zzb));
    }

    private static zzars zzd(int i10, zzafz zzafzVar, zzet zzetVar) throws IOException {
        zzars zzarsVarZza = zzars.zza(zzafzVar, zzetVar);
        while (true) {
            int i11 = zzarsVarZza.zza;
            if (i11 == i10) {
                return zzarsVarZza;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 28);
            sb2.append("Ignoring unknown WAV chunk: ");
            sb2.append(i11);
            zzeg.zzc("WavHeaderReader", sb2.toString());
            long j10 = zzarsVarZza.zzb;
            long j11 = j10 & 1;
            long j12 = j10 + 8;
            if (j11 != 0) {
                j12++;
            }
            if (j12 > 2147483647L) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(i11).length() + 40);
                sb3.append("Chunk is too large (~2GB+) to skip; id: ");
                sb3.append(i11);
                throw zzat.zzc(sb3.toString());
            }
            zzafzVar.zzf((int) j12);
            zzarsVarZza = zzars.zza(zzafzVar, zzetVar);
        }
    }

    public static zzarr zzb(zzafz zzafzVar) throws IOException {
        byte[] bArr;
        int i10;
        zzet zzetVar = new zzet(16);
        long j10 = zzd(1718449184, zzafzVar, zzetVar).zzb;
        zzgtj.zzi(j10 >= 16);
        zzafzVar.zzi(zzetVar.zzi(), 0, 16);
        zzetVar.zzh(0);
        int iZzu = zzetVar.zzu();
        int iZzu2 = zzetVar.zzu();
        int iZzI = zzetVar.zzI();
        int iZzI2 = zzetVar.zzI();
        int iZzu3 = zzetVar.zzu();
        int iZzu4 = zzetVar.zzu();
        int i11 = ((int) j10) - 16;
        if (i11 > 0) {
            byte[] bArr2 = new byte[i11];
            zzafzVar.zzi(bArr2, 0, i11);
            if (iZzu != 65534) {
                i10 = iZzu;
                bArr = bArr2;
            } else if (i11 == 24) {
                zzet zzetVar2 = new zzet(bArr2);
                zzetVar2.zzu();
                int iZzu5 = zzetVar2.zzu();
                if (iZzu5 != 0 && iZzu5 != iZzu4) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzu5).length() + 33 + String.valueOf(iZzu4).length() + 19);
                    sb2.append("validBits ( ");
                    sb2.append(iZzu5);
                    sb2.append(")  != bitsPerSample( ");
                    sb2.append(iZzu4);
                    sb2.append(") are not supported");
                    throw zzat.zzc(sb2.toString());
                }
                int iZzI3 = zzetVar2.zzI();
                if ((iZzI3 >> 18) != 0) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(iZzI3).length() + 21);
                    sb3.append(XDucgbzInpQa.FHsU);
                    sb3.append(iZzI3);
                    throw zzat.zzc(sb3.toString());
                }
                if (iZzI3 != 0 && Integer.bitCount(iZzI3) != iZzu2) {
                    int iBitCount = Integer.bitCount(iZzI3);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(iBitCount).length() + 46 + String.valueOf(iZzI3).length());
                    sb4.append("invalid number of channels (");
                    sb4.append(iBitCount);
                    sb4.append(") in channel mask ");
                    sb4.append(iZzI3);
                    throw zzat.zzc(sb4.toString());
                }
                iZzu = zzetVar2.zzu();
                byte[] bArr3 = new byte[14];
                zzetVar2.zzm(bArr3, 0, 14);
                if (!Arrays.equals(bArr3, zzb) && !Arrays.equals(bArr3, zzc)) {
                    throw zzat.zzc("invalid wav format extension guid");
                }
                i10 = iZzu;
                bArr = bArr2;
            } else {
                bArr = bArr2;
                i10 = 65534;
            }
        } else {
            bArr = zzfl.zzb;
            i10 = iZzu;
        }
        zzafzVar.zzf((int) (zzafzVar.zzm() - zzafzVar.zzn()));
        return new zzarr(i10, iZzu2, iZzI, iZzI2, iZzu3, iZzu4, bArr);
    }
}
