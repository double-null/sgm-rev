package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzwf {
    public static final /* synthetic */ int zza = 0;
    private static final HashMap zzb = new HashMap();

    public static zzvm zza() throws zzvx {
        List listZzb = zzb("audio/raw", false, false);
        if (listZzb.isEmpty()) {
            return null;
        }
        return (zzvm) listZzb.get(0);
    }

    public static synchronized List zzb(String str, boolean z10, boolean z11) throws zzvx {
        zzvw zzvwVar = new zzvw(str, z10, z11);
        HashMap map = zzb;
        List list = (List) map.get(zzvwVar);
        if (list != null) {
            return list;
        }
        ArrayList arrayListZzh = zzh(zzvwVar, new zzwa(z10, z11, str.equals("video/mv-hevc")));
        if (z10) {
            arrayListZzh.isEmpty();
        }
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayListZzh.size() == 1 && ((zzvm) arrayListZzh.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayListZzh.add(zzvm.zza("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            zzj(arrayListZzh, zzwb.zza);
        }
        if (Build.VERSION.SDK_INT < 32 && arrayListZzh.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzvm) arrayListZzh.get(0)).zza)) {
            arrayListZzh.add((zzvm) arrayListZzh.remove(0));
        }
        zzgwm zzgwmVarZzq = zzgwm.zzq(arrayListZzh);
        map.put(zzvwVar, zzgwmVarZzq);
        return zzgwmVarZzq;
    }

    public static List zzc(zzvv zzvvVar, zzv zzvVar, boolean z10, boolean z11) throws zzvx {
        List listZza = zzvvVar.zza(zzvVar.zzp, z10, z11);
        List listZzd = zzd(zzvvVar, zzvVar, z10, z11);
        int i10 = zzgwm.zzd;
        zzgwj zzgwjVar = new zzgwj();
        zzgwjVar.zzh(listZza);
        zzgwjVar.zzh(listZzd);
        return zzgwjVar.zzi();
    }

    public static List zzd(zzvv zzvvVar, zzv zzvVar, boolean z10, boolean z11) throws zzvx {
        String strZzg = zzg(zzvVar);
        return strZzg == null ? zzgwm.zzi() : zzvvVar.zza(strZzg, z10, z11);
    }

    public static List zze(final Context context, List list, final zzv zzvVar) {
        ArrayList arrayList = new ArrayList(list);
        zzj(arrayList, new zzwe() { // from class: com.google.android.gms.internal.ads.zzwd
            @Override // com.google.android.gms.internal.ads.zzwe
            public final /* synthetic */ int zza(Object obj) {
                int i10 = zzwf.zza;
                return ((zzvm) obj).zzd(context, zzvVar) ? 1 : 0;
            }
        });
        return arrayList;
    }

    public static MediaCodecInfo.CodecProfileLevel zzf(int i10, int i11) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i10;
        codecProfileLevel.level = i11;
        return codecProfileLevel;
    }

    public static String zzg(zzv zzvVar) {
        zzdp zzdpVarZzf;
        String str = zzvVar.zzp;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str) && (zzdpVarZzf = zzdq.zzf(zzvVar)) != null && zzdpVarZzf.zzc()) {
            int iZza = zzdpVarZzf.zza();
            if (iZza == 16 || iZza == 256) {
                return "video/hevc";
            }
            if (iZza == 512) {
                return "video/avc";
            }
            if (iZza == 1024) {
                zzi zziVar = zzvVar.zzF;
                if (zziVar != null && zziVar.zzd == 6 && zziVar.zzc == 1) {
                    return null;
                }
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return "video/hevc";
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x019d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x0209 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00af A[EDGE_INSN: B:39:0x00af->B:57:0x00ee BREAK  A[LOOP:1: B:17:0x005c->B:21:0x006b]] */
    /* JADX WARN: Code duplicated, block: B:69:0x011c  */
    /* JADX WARN: Code duplicated, block: B:70:0x011e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0120  */
    /* JADX WARN: Code duplicated, block: B:74:0x0128 A[Catch: Exception -> 0x01ce, TryCatch #0 {Exception -> 0x01ce, blocks: (B:59:0x00f2, B:66:0x010e, B:72:0x0122, B:74:0x0128, B:79:0x0138, B:81:0x0142, B:82:0x0147, B:84:0x0157, B:86:0x015f, B:75:0x012d), top: B:117:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x012d A[Catch: Exception -> 0x01ce, TryCatch #0 {Exception -> 0x01ce, blocks: (B:59:0x00f2, B:66:0x010e, B:72:0x0122, B:74:0x0128, B:79:0x0138, B:81:0x0142, B:82:0x0147, B:84:0x0157, B:86:0x015f, B:75:0x012d), top: B:117:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0133  */
    /* JADX WARN: Code duplicated, block: B:78:0x0136  */
    /* JADX WARN: Code duplicated, block: B:81:0x0142 A[Catch: Exception -> 0x01ce, TryCatch #0 {Exception -> 0x01ce, blocks: (B:59:0x00f2, B:66:0x010e, B:72:0x0122, B:74:0x0128, B:79:0x0138, B:81:0x0142, B:82:0x0147, B:84:0x0157, B:86:0x015f, B:75:0x012d), top: B:117:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0147 A[Catch: Exception -> 0x01ce, TryCatch #0 {Exception -> 0x01ce, blocks: (B:59:0x00f2, B:66:0x010e, B:72:0x0122, B:74:0x0128, B:79:0x0138, B:81:0x0142, B:82:0x0147, B:84:0x0157, B:86:0x015f, B:75:0x012d), top: B:117:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0157 A[Catch: Exception -> 0x01ce, TryCatch #0 {Exception -> 0x01ce, blocks: (B:59:0x00f2, B:66:0x010e, B:72:0x0122, B:74:0x0128, B:79:0x0138, B:81:0x0142, B:82:0x0147, B:84:0x0157, B:86:0x015f, B:75:0x012d), top: B:117:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x016a  */
    /* JADX WARN: Code duplicated, block: B:91:0x016e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:9:0x0033  */
    private static ArrayList zzh(zzvw zzvwVar, zzvy zzvyVar) throws zzvx {
        String str;
        String str2;
        String str3;
        int i10;
        String str4;
        int i11;
        String str5;
        boolean zZzd;
        boolean z10;
        int i12;
        boolean zIsHardwareAccelerated;
        String strZza;
        boolean zIsVendor;
        zzvw zzvwVar2 = zzvwVar;
        String str6 = "secure-playback";
        String str7 = "tunneled-playback";
        try {
            ArrayList arrayList = new ArrayList();
            String str8 = zzvwVar2.zza;
            int iZza = zzvyVar.zza();
            boolean zZzc = zzvyVar.zzc();
            int i13 = 0;
            while (i13 < iZza) {
                MediaCodecInfo mediaCodecInfoZzb = zzvyVar.zzb(i13);
                if (Build.VERSION.SDK_INT < 29 || !mediaCodecInfoZzb.isAlias()) {
                    String name = mediaCodecInfoZzb.getName();
                    if (mediaCodecInfoZzb.isEncoder() || (!zZzc && name.endsWith(".secure"))) {
                        str6 = str6;
                        str3 = str7;
                        i11 = i13;
                        i10 = iZza;
                        str4 = str8;
                    } else {
                        String[] supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                        int length = supportedTypes.length;
                        int i14 = i13;
                        int i15 = 0;
                        while (true) {
                            if (i15 < length) {
                                int i16 = length;
                                str = supportedTypes[i15];
                                if (!str.equalsIgnoreCase(str8)) {
                                    i15++;
                                    length = i16;
                                }
                            } else if (str8.equals("video/dolby-vision")) {
                                if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                    if (!"OMX.RTK.video.decoder".equals(name) && !"OMX.realtek.video.decoder.tunneled".equals(name)) {
                                        str2 = null;
                                        break;
                                    }
                                    str = "video/dv_hevc";
                                } else {
                                    str = "video/hevcdv";
                                }
                            } else if (str8.equals("video/mv-hevc")) {
                                if (!"c2.qti.mvhevc.decoder".equals(name) && !"c2.qti.mvhevc.decoder.secure".equals(name)) {
                                    str2 = null;
                                    break;
                                }
                                str = "video/x-mvhevc";
                            } else if (str8.equals("audio/alac") && "OMX.lge.alac.decoder".equals(name)) {
                                str = "audio/x-lg-alac";
                            } else if (str8.equals("audio/flac") && "OMX.lge.flac.decoder".equals(name)) {
                                str = "audio/x-lg-flac";
                            } else {
                                if (!str8.equals("audio/ac3") || !"OMX.lge.ac3.decoder".equals(name)) {
                                    str2 = null;
                                    break;
                                }
                                str = "audio/lg-ac3";
                            }
                            str2 = str;
                            break;
                        }
                        if (str2 != null) {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoZzb.getCapabilitiesForType(str2);
                                boolean zZzd2 = zzvyVar.zzd(str7, str2, capabilitiesForType);
                                boolean zZze = zzvyVar.zze(str7, str2, capabilitiesForType);
                                str3 = str7;
                                if (zzvwVar2.zzc) {
                                    if (zZzd2) {
                                        zZzd = zzvyVar.zzd(str6, str2, capabilitiesForType);
                                        boolean zZze2 = zzvyVar.zze(str6, str2, capabilitiesForType);
                                        z10 = zzvwVar2.zzb;
                                        if (z10) {
                                            if (z10) {
                                                if (zZzd) {
                                                    zZzd = true;
                                                }
                                            }
                                            i12 = Build.VERSION.SDK_INT;
                                            if (i12 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (zzi(mediaCodecInfoZzb, str8)) {
                                                zIsHardwareAccelerated = false;
                                            } else {
                                                zIsHardwareAccelerated = true;
                                            }
                                            boolean zZzi = zzi(mediaCodecInfoZzb, str8);
                                            str6 = str6;
                                            if (i12 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzgss.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZzc) {
                                            }
                                            str5 = name;
                                            i10 = iZza;
                                            str4 = str8;
                                            i11 = i14;
                                            if (zZzc) {
                                                continue;
                                            }
                                        } else {
                                            if (z10) {
                                                if (zZzd) {
                                                    zZzd = true;
                                                }
                                            }
                                            i12 = Build.VERSION.SDK_INT;
                                            if (i12 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (zzi(mediaCodecInfoZzb, str8)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            boolean zZzi2 = zzi(mediaCodecInfoZzb, str8);
                                            str6 = str6;
                                            if (i12 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzgss.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZzc) {
                                            }
                                            str5 = name;
                                            i10 = iZza;
                                            str4 = str8;
                                            i11 = i14;
                                            if (zZzc) {
                                                continue;
                                            }
                                        }
                                    }
                                } else if (!zZze) {
                                    zZzd = zzvyVar.zzd(str6, str2, capabilitiesForType);
                                    boolean zZze3 = zzvyVar.zze(str6, str2, capabilitiesForType);
                                    z10 = zzvwVar2.zzb;
                                    if (z10 || !zZze3) {
                                        if (z10) {
                                            if (zZzd) {
                                                zZzd = true;
                                            }
                                        }
                                        i12 = Build.VERSION.SDK_INT;
                                        if (i12 >= 29) {
                                            zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                        } else if (zzi(mediaCodecInfoZzb, str8)) {
                                            zIsHardwareAccelerated = true;
                                        } else {
                                            zIsHardwareAccelerated = false;
                                        }
                                        boolean zZzi3 = zzi(mediaCodecInfoZzb, str8);
                                        str6 = str6;
                                        if (i12 >= 29) {
                                            zIsVendor = mediaCodecInfoZzb.isVendor();
                                        } else {
                                            strZza = zzgss.zza(mediaCodecInfoZzb.getName());
                                            if (strZza.startsWith("omx.google.") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google.")) {
                                                zIsVendor = false;
                                            } else {
                                                zIsVendor = true;
                                            }
                                        }
                                        if ((zZzc || z10 != zZzd) && (zZzc || z10)) {
                                            str5 = name;
                                            i10 = iZza;
                                            str4 = str8;
                                            i11 = i14;
                                            if (zZzc && zZzd) {
                                                try {
                                                    StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 7);
                                                    sb2.append(str5);
                                                    sb2.append(".secure");
                                                    arrayList.add(zzvm.zza(sb2.toString(), str4, str2, capabilitiesForType, zIsHardwareAccelerated, zZzi3, zIsVendor, false, true));
                                                    break;
                                                } catch (Exception e10) {
                                                    e = e10;
                                                    StringBuilder sb3 = new StringBuilder(String.valueOf(str5).length() + 24 + str2.length() + 1);
                                                    sb3.append("Failed to query codec ");
                                                    sb3.append(str5);
                                                    sb3.append(" (");
                                                    sb3.append(str2);
                                                    sb3.append(")");
                                                    zzeg.zze("MediaCodecUtil", sb3.toString());
                                                    throw e;
                                                }
                                            }
                                        } else {
                                            i11 = i14;
                                            i10 = iZza;
                                            str4 = str8;
                                            try {
                                                arrayList.add(zzvm.zza(name, str8, str2, capabilitiesForType, zIsHardwareAccelerated, zZzi3, zIsVendor, false, false));
                                            } catch (Exception e11) {
                                                e = e11;
                                                str5 = name;
                                                StringBuilder sb4 = new StringBuilder(String.valueOf(str5).length() + 24 + str2.length() + 1);
                                                sb4.append("Failed to query codec ");
                                                sb4.append(str5);
                                                sb4.append(" (");
                                                sb4.append(str2);
                                                sb4.append(")");
                                                zzeg.zze("MediaCodecUtil", sb4.toString());
                                                throw e;
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e12) {
                                e = e12;
                                str5 = name;
                            }
                        } else {
                            str3 = str7;
                        }
                        i10 = iZza;
                        str4 = str8;
                        i11 = i14;
                    }
                } else {
                    str6 = str6;
                    str3 = str7;
                    i11 = i13;
                    i10 = iZza;
                    str4 = str8;
                }
                i13 = i11 + 1;
                zzvwVar2 = zzvwVar;
                str7 = str3;
                str6 = str6;
                iZza = i10;
                str8 = str4;
            }
            return arrayList;
        } catch (Exception e13) {
            throw new zzvx(e13, null);
        }
    }

    private static boolean zzi(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzas.zza(str)) {
            return true;
        }
        String strZza = zzgss.zza(mediaCodecInfo.getName());
        if (strZza.startsWith("arc.")) {
            return false;
        }
        if (strZza.startsWith("omx.google.") || strZza.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strZza.startsWith("omx.sec.") && strZza.contains(".sw.")) || strZza.equals("omx.qcom.video.decoder.hevcswvdec") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google.")) {
            return true;
        }
        return (strZza.startsWith("omx.") || strZza.startsWith("c2.")) ? false : true;
    }

    private static void zzj(List list, final zzwe zzweVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzwc
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                int i10 = zzwf.zza;
                zzwe zzweVar2 = zzweVar;
                return zzweVar2.zza(obj2) - zzweVar2.zza(obj);
            }
        });
    }
}
