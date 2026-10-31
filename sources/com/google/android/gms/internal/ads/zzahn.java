package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzahn {
    public final List zza;
    public final int zzb;
    public final String zzc;
    public final int zzd;

    private zzahn(List list, int i10, String str, int i11) {
        this.zza = list;
        this.zzb = i10;
        this.zzc = str;
        this.zzd = i11;
    }

    public static zzahn zza(zzet zzetVar) throws zzat {
        int iZzs;
        int iZzs2;
        int i10;
        int i11;
        int i12;
        try {
            if (zzetVar.zzB() != 0) {
                throw zzat.zzb("Unsupported VVC version", null);
            }
            int iZzs3 = zzetVar.zzs();
            int i13 = iZzs3 >> 1;
            int i14 = 1;
            String str = "L";
            if ((iZzs3 & 1) != 0) {
                zzetVar.zzk(1);
                int iZzs4 = zzetVar.zzs() >> 4;
                iZzs = zzetVar.zzs() >> 5;
                int iZzs5 = zzetVar.zzs() & 63;
                int iZzs6 = zzetVar.zzs();
                i10 = iZzs6 >> 1;
                str = (iZzs6 & 1) != 0 ? "H" : "L";
                iZzs2 = zzetVar.zzs();
                zzetVar.zzk(iZzs5);
                int i15 = iZzs4 & 7;
                if (i15 > 1) {
                    int iZzs7 = zzetVar.zzs();
                    for (int i16 = 0; i16 < i15 - 1; i16++) {
                        if (((iZzs7 >> (7 - i16)) & 1) != 0) {
                            zzetVar.zzk(1);
                        }
                    }
                }
                zzetVar.zzk(zzetVar.zzs() * 4);
                zzetVar.zzk(6);
            } else {
                iZzs = 0;
                iZzs2 = 0;
                i10 = 0;
            }
            int iZzs8 = zzetVar.zzs();
            int iZzg = zzetVar.zzg();
            int i17 = 0;
            int i18 = 0;
            while (true) {
                i11 = 12;
                i12 = 13;
                if (i17 >= iZzs8) {
                    break;
                }
                int iZzs9 = zzetVar.zzs() & 31;
                int iZzt = (iZzs9 == 13 || iZzs9 == 12) ? 1 : zzetVar.zzt();
                for (int i19 = 0; i19 < iZzt; i19++) {
                    int iZzt2 = zzetVar.zzt();
                    i18 += iZzt2 + 4;
                    zzetVar.zzk(iZzt2);
                }
                i17++;
            }
            zzetVar.zzh(iZzg);
            byte[] bArr = new byte[i18];
            int i20 = 0;
            int i21 = 0;
            while (i20 < iZzs8) {
                int iZzs10 = zzetVar.zzs() & 31;
                int iZzt3 = (iZzs10 == i12 || iZzs10 == i11) ? i14 : zzetVar.zzt();
                for (int i22 = 0; i22 < iZzt3; i22++) {
                    int iZzt4 = zzetVar.zzt();
                    System.arraycopy(zzgp.zza, 0, bArr, i21, 4);
                    int i23 = i21 + 4;
                    zzetVar.zzm(bArr, i23, iZzt4);
                    i21 = i23 + iZzt4;
                }
                i20++;
                i14 = 1;
                i11 = 12;
                i12 = 13;
            }
            return new zzahn(zzgwm.zzj(bArr), (i13 & 3) + 1, String.format(Locale.US, "vvc1.%d.%s%d", Integer.valueOf(i10), str, Integer.valueOf(iZzs2)), iZzs + 8);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw zzat.zzb("Error parsing VVC configuration", e10);
        }
    }
}
