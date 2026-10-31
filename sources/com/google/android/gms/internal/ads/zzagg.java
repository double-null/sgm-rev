package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzagg {
    public static boolean zza(zzet zzetVar, zzagl zzaglVar, int i10, zzagf zzagfVar) {
        int iZzg = zzetVar.zzg();
        long jZzz = zzetVar.zzz();
        long j10 = jZzz >>> 16;
        if (j10 != i10) {
            return false;
        }
        boolean z10 = (j10 & 1) == 1;
        long j11 = jZzz >> 12;
        long j12 = jZzz >> 8;
        long j13 = jZzz >> 4;
        long j14 = jZzz >> 1;
        long j15 = jZzz & 1;
        int i11 = (int) (j13 & 15);
        if (i11 <= 7) {
            if (i11 != zzaglVar.zzg - 1) {
                return false;
            }
        } else if (i11 > 10 || zzaglVar.zzg != 2) {
            return false;
        }
        int i12 = (int) (j14 & 7);
        if ((i12 != 0 && i12 != zzaglVar.zzi) || j15 == 1 || !zzd(zzetVar, zzaglVar, z10, zzagfVar)) {
            return false;
        }
        long j16 = zzagfVar.zza;
        int iZzc = zzc(zzetVar, (int) (j11 & 15));
        long j17 = zzaglVar.zzj;
        boolean z11 = j17 == 0 || j16 + ((long) iZzc) >= j17;
        if (iZzc == -1) {
            return false;
        }
        if ((!z11 && iZzc < zzaglVar.zza) || iZzc > zzaglVar.zzb) {
            return false;
        }
        int i13 = zzaglVar.zze;
        int i14 = (int) (j12 & 15);
        if (i14 != 0) {
            if (i14 <= 11) {
                if (i14 != zzaglVar.zzf) {
                    return false;
                }
            } else if (i14 == 12) {
                if (zzetVar.zzs() * 1000 != i13) {
                    return false;
                }
            } else {
                if (i14 > 14) {
                    return false;
                }
                int iZzt = zzetVar.zzt();
                if (i14 == 14) {
                    iZzt *= 10;
                }
                if (iZzt != i13) {
                    return false;
                }
            }
        }
        if (zzetVar.zzs() != zzfl.zzL(zzetVar.zzi(), iZzg, zzetVar.zzg() - 1, 0)) {
            return false;
        }
        if (zzetVar.zzd() == 0) {
            return true;
        }
        int iZzn = zzetVar.zzn();
        if ((iZzn & 128) != 0) {
            return false;
        }
        int i15 = (iZzn & 126) >> 1;
        if ((i15 < 2 || i15 > 7) && (i15 < 13 || i15 > 31)) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i15).length() + 57);
        sb2.append("Ignoring frame where first subframe has a reserved type: ");
        sb2.append(i15);
        zzeg.zzb("FlacFrameReader", sb2.toString());
        return false;
    }

    public static long zzb(zzafz zzafzVar, zzagl zzaglVar) throws IOException {
        zzafzVar.zzl();
        zzafzVar.zzk(1);
        byte[] bArr = new byte[1];
        zzafzVar.zzi(bArr, 0, 1);
        int i10 = bArr[0] & 1;
        boolean z10 = 1 == i10;
        zzafzVar.zzk(2);
        int i11 = 1 != i10 ? 6 : 7;
        zzet zzetVar = new zzet(i11);
        zzetVar.zzf(zzagc.zzb(zzafzVar, zzetVar.zzi(), 0, i11));
        zzafzVar.zzl();
        zzagf zzagfVar = new zzagf();
        if (zzd(zzetVar, zzaglVar, z10, zzagfVar)) {
            return zzagfVar.zza;
        }
        throw zzat.zzb(null, null);
    }

    public static int zzc(zzet zzetVar, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return zzetVar.zzs() + 1;
            case 7:
                return zzetVar.zzt() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return UserVerificationMethods.USER_VERIFY_HANDPRINT << (i10 - 8);
            default:
                return -1;
        }
    }

    private static boolean zzd(zzet zzetVar, zzagl zzaglVar, boolean z10, zzagf zzagfVar) {
        try {
            long jZzO = zzetVar.zzO();
            if (!z10) {
                jZzO *= (long) zzaglVar.zzb;
            }
            long j10 = zzaglVar.zzj;
            if (j10 != 0 && jZzO > j10) {
                return false;
            }
            zzagfVar.zza = jZzO;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
