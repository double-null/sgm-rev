package com.google.android.gms.internal.ads;

import android.graphics.PointF;
import com.vungle.ads.internal.persistence.mP.RHIpdOnfgiYkEj;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaod {
    private static final Pattern zzc = Pattern.compile("\\{([^}]*)\\}");
    private static final Pattern zzd;
    private static final Pattern zze;
    private static final Pattern zzf;
    public final int zza;
    public final PointF zzb;

    static {
        String str = zzfl.zza;
        Locale locale = Locale.US;
        zzd = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        zze = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        zzf = Pattern.compile("\\\\an(\\d+)");
    }

    private zzaod(int i10, PointF pointF) {
        this.zza = i10;
        this.zzb = pointF;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0084  */
    /* JADX WARN: Code duplicated, block: B:24:0x0091 A[Catch: RuntimeException -> 0x000a, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x000a, blocks: (B:22:0x0085, B:24:0x0091, B:26:0x0098), top: B:37:0x0085 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x000a A[SYNTHETIC] */
    public static zzaod zza(String str) {
        Matcher matcher;
        int iZzd;
        PointF pointF;
        String strGroup;
        String strGroup2;
        Matcher matcher2 = zzc.matcher(str);
        PointF pointF2 = null;
        int i10 = -1;
        while (matcher2.find()) {
            String strGroup3 = matcher2.group(1);
            strGroup3.getClass();
            try {
                Matcher matcher3 = zzd.matcher(strGroup3);
                Matcher matcher4 = zze.matcher(strGroup3);
                boolean zFind = matcher3.find();
                boolean zFind2 = matcher4.find();
                try {
                    if (zFind) {
                        if (zFind2) {
                            StringBuilder sb2 = new StringBuilder(strGroup3.length() + 82);
                            sb2.append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
                            sb2.append(strGroup3);
                            sb2.append("'");
                            zzeg.zzb("SsaStyle.Overrides", sb2.toString());
                        }
                        strGroup = matcher3.group(1);
                        strGroup2 = matcher3.group(2);
                    } else {
                        if (zFind2) {
                            strGroup = matcher4.group(1);
                            strGroup2 = matcher4.group(2);
                        } else {
                            pointF = null;
                        }
                        if (pointF != null) {
                            pointF2 = pointF;
                        }
                        matcher = zzf.matcher(strGroup3);
                        if (matcher.find()) {
                            String strGroup4 = matcher.group(1);
                            strGroup4.getClass();
                            iZzd = zzaoe.zzd(strGroup4);
                        } else {
                            iZzd = -1;
                        }
                        if (iZzd != -1) {
                            i10 = iZzd;
                        }
                    }
                    matcher = zzf.matcher(strGroup3);
                    if (matcher.find()) {
                        String strGroup5 = matcher.group(1);
                        strGroup5.getClass();
                        iZzd = zzaoe.zzd(strGroup5);
                    } else {
                        iZzd = -1;
                    }
                    if (iZzd != -1) {
                        i10 = iZzd;
                    }
                } catch (RuntimeException unused) {
                }
                strGroup.getClass();
                float f10 = Float.parseFloat(strGroup.trim());
                strGroup2.getClass();
                pointF = new PointF(f10, Float.parseFloat(strGroup2.trim()));
                if (pointF != null) {
                    pointF2 = pointF;
                }
            } catch (RuntimeException unused2) {
            }
        }
        return new zzaod(i10, pointF2);
    }

    public static String zzb(String str) {
        return zzc.matcher(str).replaceAll(RHIpdOnfgiYkEj.juEuMiF);
    }
}
