package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.firebase.provider.fH.UyXgnuLGEkgnZE;
import d5.LXP.wcAlQCOdREZdI;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzas {
    public static final /* synthetic */ int zza = 0;
    private static final ArrayList zzb = new ArrayList();
    private static final Pattern zzc = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean zza(String str) {
        return "audio".equals(zzj(str));
    }

    public static boolean zzb(String str) {
        return "video".equals(zzj(str));
    }

    public static boolean zzc(String str) {
        return "image".equals(zzj(str)) || "application/x-image-uri".equals(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:71:0x00fc  */
    public static boolean zzd(String str, String str2) {
        byte b10;
        zzar zzarVarZzi;
        int iZza;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2123537834:
                if (!str.equals("audio/eac3-joc")) {
                    b10 = -1;
                } else {
                    b10 = 10;
                }
                break;
            case -1354451219:
                if (!str.equals("application/vnd.dvb.ait")) {
                    b10 = -1;
                } else {
                    b10 = 16;
                }
                break;
            case -1348231605:
                if (!str.equals("application/x-icy")) {
                    b10 = -1;
                } else {
                    b10 = 15;
                }
                break;
            case -1265048566:
                if (!str.equals("application/x-camera-motion")) {
                    b10 = -1;
                } else {
                    b10 = 19;
                }
                break;
            case -1248341703:
                if (!str.equals(wcAlQCOdREZdI.uxWXVV)) {
                    b10 = -1;
                } else {
                    b10 = 12;
                }
                break;
            case -432837260:
                if (!str.equals("audio/mpeg-L1")) {
                    b10 = -1;
                } else {
                    b10 = 2;
                }
                break;
            case -432837259:
                if (!str.equals(wcAlQCOdREZdI.Ief)) {
                    b10 = -1;
                } else {
                    b10 = 3;
                }
                break;
            case -53558318:
                if (!str.equals("audio/mp4a-latm")) {
                    b10 = -1;
                } else {
                    b10 = 20;
                }
                break;
            case -43764892:
                if (!str.equals("application/meta")) {
                    b10 = -1;
                } else {
                    b10 = 17;
                }
                break;
            case 187078296:
                if (!str.equals("audio/ac3")) {
                    b10 = -1;
                } else {
                    b10 = 8;
                }
                break;
            case 187094639:
                if (!str.equals("audio/raw")) {
                    b10 = -1;
                } else {
                    b10 = 4;
                }
                break;
            case 469933706:
                if (!str.equals("application/x-media3-cues")) {
                    b10 = -1;
                } else {
                    b10 = 11;
                }
                break;
            case 1054472807:
                if (!str.equals("application/x-itut-t35")) {
                    b10 = -1;
                } else {
                    b10 = 18;
                }
                break;
            case 1154383568:
                if (!str.equals("application/x-emsg")) {
                    b10 = -1;
                } else {
                    b10 = 13;
                }
                break;
            case 1331836563:
                if (!str.equals("video/apv")) {
                    b10 = -1;
                } else {
                    b10 = 0;
                }
                break;
            case 1504578661:
                if (!str.equals("audio/eac3")) {
                    b10 = -1;
                } else {
                    b10 = 9;
                }
                break;
            case 1504619009:
                if (!str.equals("audio/flac")) {
                    b10 = -1;
                } else {
                    b10 = 7;
                }
                break;
            case 1504831518:
                if (!str.equals("audio/mpeg")) {
                    b10 = -1;
                } else {
                    b10 = 1;
                }
                break;
            case 1652648887:
                if (!str.equals("application/x-scte35")) {
                    b10 = -1;
                } else {
                    b10 = 14;
                }
                break;
            case 1903231877:
                if (!str.equals("audio/g711-alaw")) {
                    b10 = -1;
                } else {
                    b10 = 5;
                }
                break;
            case 1903589369:
                if (!str.equals("audio/g711-mlaw")) {
                    b10 = -1;
                } else {
                    b10 = 6;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                return true;
            case 20:
                return (str2 == null || (zzarVarZzi = zzi(str2)) == null || (iZza = zzarVarZzi.zza()) == 0 || iZza == 16) ? false : true;
            default:
                return false;
        }
    }

    public static String zze(int i10) {
        if (i10 == 32) {
            return "video/mp4v-es";
        }
        if (i10 == 33) {
            return "video/avc";
        }
        if (i10 == 35) {
            return "video/hevc";
        }
        if (i10 == 64) {
            return "audio/mp4a-latm";
        }
        if (i10 == 163) {
            return "video/wvc1";
        }
        if (i10 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i10 == 221) {
            return "audio/vorbis";
        }
        if (i10 == 165) {
            return "audio/ac3";
        }
        if (i10 == 166) {
            return "audio/eac3";
        }
        switch (i10) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i10) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static int zzf(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (zza(str)) {
            return 1;
        }
        if (zzb(str)) {
            return 2;
        }
        if ("text".equals(zzj(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if (zzc(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str) || "application/meta".equals(str) || "application/x-itut-t35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = zzb;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str2 = ((zzaq) arrayList.get(i10)).zza;
            if (str.equals(null)) {
                return 0;
            }
        }
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    public static String zzh(String str) {
        if (str == null) {
            return null;
        }
        String strZza = zzgss.zza(str);
        switch (strZza) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return "audio/flac";
            case "audio/mp3":
                return "audio/mpeg";
            case "audio/x-wav":
                return "audio/wav";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            default:
                return strZza;
        }
    }

    static zzar zzi(String str) {
        Matcher matcher = zzc.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new zzar(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static String zzj(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    public static int zzg(String str, String str2) {
        byte b10;
        zzar zzarVarZzi;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    b10 = 4;
                } else {
                    b10 = -1;
                }
                break;
            case -1365340241:
                if (str.equals("audio/vnd.dts.hd;profile=lbr")) {
                    b10 = 8;
                } else {
                    b10 = -1;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    b10 = 6;
                } else {
                    b10 = -1;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    b10 = 1;
                } else {
                    b10 = -1;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    b10 = 2;
                } else {
                    b10 = -1;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    b10 = 5;
                } else {
                    b10 = -1;
                }
                break;
            case 187081724:
                if (str.equals("audio/dsd")) {
                    b10 = 12;
                } else {
                    b10 = -1;
                }
                break;
            case 550520934:
                if (str.equals("audio/vnd.dts.uhd;profile=p2")) {
                    b10 = 9;
                } else {
                    b10 = -1;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    b10 = 3;
                } else {
                    b10 = -1;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    b10 = 0;
                } else {
                    b10 = -1;
                }
                break;
            case 1504891608:
                if (str.equals(UyXgnuLGEkgnZE.FITiEsBVRGIENhP)) {
                    b10 = 11;
                } else {
                    b10 = -1;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    b10 = 7;
                } else {
                    b10 = -1;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    b10 = 10;
                } else {
                    b10 = -1;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return 9;
            case 1:
                if (str2 == null || (zzarVarZzi = zzi(str2)) == null) {
                    return 0;
                }
                return zzarVarZzi.zza();
            case 2:
                return 5;
            case 3:
                return 6;
            case 4:
                return 18;
            case 5:
                return 17;
            case 6:
                return 7;
            case 7:
            case 8:
                return 8;
            case 9:
                return 30;
            case 10:
                return 14;
            case 11:
                return 20;
            case 12:
                return 31;
            default:
                return 0;
        }
    }
}
