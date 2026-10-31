package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import d5.LXP.wcAlQCOdREZdI;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzij {
    private static final Pattern zza = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    private static final Pattern zzb = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static long zza(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = zzb.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    public static long zzb(String str, String str2) {
        long j10 = -1;
        if (!TextUtils.isEmpty(str)) {
            try {
                j10 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 28);
                sb2.append("Unexpected Content-Length [");
                sb2.append(str);
                sb2.append("]");
                zzeg.zze("HttpUtil", sb2.toString());
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j10;
        }
        Matcher matcher = zza.matcher(str2);
        if (!matcher.matches()) {
            return j10;
        }
        try {
            String strGroup = matcher.group(2);
            strGroup.getClass();
            long j11 = Long.parseLong(strGroup);
            String strGroup2 = matcher.group(1);
            strGroup2.getClass();
            long j12 = (j11 - Long.parseLong(strGroup2)) + 1;
            if (j10 < 0) {
                return j12;
            }
            if (j10 == j12) {
                return j10;
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(str2).length() + 1);
            sb3.append("Inconsistent headers [");
            sb3.append(str);
            sb3.append("] [");
            sb3.append(str2);
            sb3.append("]");
            zzeg.zzc("HttpUtil", sb3.toString());
            return Math.max(j10, j12);
        } catch (NumberFormatException unused2) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(str2).length() + 27);
            sb4.append(wcAlQCOdREZdI.QGHuGtztXYv);
            sb4.append(str2);
            sb4.append("]");
            zzeg.zze("HttpUtil", sb4.toString());
            return j10;
        }
    }
}
