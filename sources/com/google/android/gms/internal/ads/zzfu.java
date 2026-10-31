package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfu {
    public final String zza;

    private zzfu(int i10, int i11, String str) {
        this.zza = str;
    }

    public static zzfu zza(zzet zzetVar) {
        String str;
        zzetVar.zzk(2);
        int iZzs = zzetVar.zzs();
        int i10 = iZzs >> 1;
        int i11 = iZzs & 1;
        int iZzs2 = zzetVar.zzs() >> 3;
        if (i10 == 4 || i10 == 5 || i10 == 7 || i10 == 8) {
            str = "dvhe";
        } else if (i10 == 9) {
            str = "dvav";
        } else {
            if (i10 != 10) {
                return null;
            }
            str = "dav1";
        }
        int i12 = iZzs2 | (i11 << 5);
        String str2 = i10 < 10 ? ".0" : ".";
        int length = str2.length() + 4;
        int length2 = String.valueOf(i10).length();
        int length3 = String.valueOf(i12).length();
        String str3 = i12 >= 10 ? "." : ".0";
        StringBuilder sb2 = new StringBuilder(length + length2 + str3.length() + length3);
        sb2.append(str);
        sb2.append(str2);
        sb2.append(i10);
        sb2.append(str3);
        sb2.append(i12);
        return new zzfu(i10, i12, sb2.toString());
    }
}
