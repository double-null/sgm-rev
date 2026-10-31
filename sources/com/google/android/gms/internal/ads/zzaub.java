package com.google.android.gms.internal.ads;

import com.facebook.appevents.AppEventsConstants;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaub {
    public static zzasn zza(zzata zzataVar) {
        boolean z10;
        long j10;
        long j11;
        long j12;
        long j13;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = zzataVar.zzc;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jZzb = str != null ? zzb(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i10 = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z10 = false;
            j10 = 0;
            j11 = 0;
            while (i10 < strArrSplit.length) {
                String strTrim = strArrSplit[i10].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j11 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j10 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z10 = true;
                }
                i10++;
            }
            i10 = 1;
        } else {
            z10 = false;
            j10 = 0;
            j11 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jZzb2 = str3 != null ? zzb(str3) : 0L;
        String str4 = (String) map.get("Last-Modified");
        long jZzb3 = str4 != null ? zzb(str4) : 0L;
        String str5 = (String) map.get("ETag");
        if (i10 != 0) {
            j13 = jCurrentTimeMillis + (j11 * 1000);
            j12 = z10 ? j13 : (j10 * 1000) + j13;
        } else {
            j12 = 0;
            if (jZzb <= 0 || jZzb2 < jZzb) {
                j13 = 0;
            } else {
                j13 = jCurrentTimeMillis + (jZzb2 - jZzb);
                j12 = j13;
            }
        }
        zzasn zzasnVar = new zzasn();
        zzasnVar.zza = zzataVar.zzb;
        zzasnVar.zzb = str5;
        zzasnVar.zzf = j13;
        zzasnVar.zze = j12;
        zzasnVar.zzc = jZzb;
        zzasnVar.zzd = jZzb3;
        zzasnVar.zzg = map;
        zzasnVar.zzh = zzataVar.zzd;
        return zzasnVar;
    }

    public static long zzb(String str) {
        try {
            return zzd("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e10) {
            if (AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(str) || "-1".equals(str)) {
                zzatq.zza("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            zzatq.zzd(e10, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    static String zzc(long j10) {
        return zzd("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j10));
    }

    private static SimpleDateFormat zzd(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
