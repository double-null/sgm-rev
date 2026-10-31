package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhe {
    public static int zza(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i10 >>>= 1;
            i11++;
        }
        return i11;
    }

    public static zzhb zzb(zzet zzetVar, boolean z10, boolean z11) throws zzat {
        if (z10) {
            zzc(3, zzetVar, false);
        }
        String strZzK = zzetVar.zzK((int) zzetVar.zzA(), StandardCharsets.UTF_8);
        int length = strZzK.length();
        long jZzA = zzetVar.zzA();
        String[] strArr = new String[(int) jZzA];
        int length2 = length + 15;
        for (int i10 = 0; i10 < jZzA; i10++) {
            String strZzK2 = zzetVar.zzK((int) zzetVar.zzA(), StandardCharsets.UTF_8);
            strArr[i10] = strZzK2;
            length2 = length2 + 4 + strZzK2.length();
        }
        if (z11 && (zzetVar.zzs() & 1) == 0) {
            throw zzat.zzb("framing bit expected to be set", null);
        }
        return new zzhb(strZzK, strArr, length2 + 1);
    }

    public static boolean zzc(int i10, zzet zzetVar, boolean z10) throws zzat {
        if (zzetVar.zzd() < 7) {
            if (z10) {
                return false;
            }
            int iZzd = zzetVar.zzd();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzd).length() + 18);
            sb2.append("too short header: ");
            sb2.append(iZzd);
            throw zzat.zzb(sb2.toString(), null);
        }
        if (zzetVar.zzs() != i10) {
            if (z10) {
                return false;
            }
            throw zzat.zzb("expected header type ".concat(String.valueOf(Integer.toHexString(i10))), null);
        }
        if (zzetVar.zzs() == 118 && zzetVar.zzs() == 111 && zzetVar.zzs() == 114 && zzetVar.zzs() == 98 && zzetVar.zzs() == 105 && zzetVar.zzs() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw zzat.zzb("expected characters 'vorbis'", null);
    }
}
