package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import io.bidmachine.protobuf.EventTypeExtended;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzvm {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    private final boolean zzi;
    private int zzj;
    private int zzk;
    private float zzl;

    zzvm(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        str.getClass();
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z10;
        this.zze = z13;
        this.zzf = z15;
        this.zzh = z16;
        this.zzi = zzas.zzb(str2);
        this.zzl = -3.4028235E38f;
        this.zzj = -1;
        this.zzk = -1;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    public static zzvm zza(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        boolean z16 = codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback");
        boolean z17 = codecCapabilities != null && codecCapabilities.isFeatureSupported("tunneled-playback");
        boolean z18 = z14 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback"));
        if (Build.VERSION.SDK_INT < 35 || codecCapabilities == null || !codecCapabilities.isFeatureSupported("detached-surface")) {
            z15 = false;
        } else {
            String str4 = Build.MANUFACTURER;
            if (str4.equals("Xiaomi") || str4.equals("OPPO") || str4.equals("realme") || str4.equals("motorola") || str4.equals("LENOVO")) {
                z15 = false;
            } else {
                z15 = true;
            }
        }
        return new zzvm(str, str2, str3, codecCapabilities, z10, z11, z12, z16, z17, z18, z15);
    }

    private final boolean zzj(zzv zzvVar) {
        String str = this.zzb;
        return str.equals(zzvVar.zzp) || str.equals(zzwf.zzg(zzvVar));
    }

    private final boolean zzk(Context context, zzv zzvVar, boolean z10) {
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        zzdp zzdpVarZzf = zzdq.zzf(zzvVar);
        String str = zzvVar.zzp;
        byte b10 = -1;
        if (str != null && str.equals("video/mv-hevc")) {
            String strZzh = zzas.zzh(this.zzc);
            if (strZzh.equals("video/mv-hevc")) {
                return true;
            }
            if (strZzh.equals("video/hevc")) {
                int i10 = zzwf.zza;
                String strZzk = zzgp.zzk(zzvVar.zzs);
                if (strZzk == null) {
                    zzdpVarZzf = null;
                } else {
                    String strTrim = strZzk.trim();
                    String str2 = zzfl.zza;
                    zzdpVarZzf = zzdq.zzg(strZzk, strTrim.split("\\.", -1), zzvVar.zzF);
                }
            }
        }
        if (zzdpVarZzf == null) {
            return true;
        }
        if (!zzdpVarZzf.zzc()) {
            return false;
        }
        int iZza = zzdpVarZzf.zza();
        int iZzb = zzdpVarZzf.zzb();
        int i11 = 8;
        if ("video/dolby-vision".equals(str)) {
            String str3 = this.zzb;
            int iHashCode = str3.hashCode();
            if (iHashCode != -1662735862) {
                if (iHashCode != -1662541442) {
                    if (iHashCode == 1331836730 && str3.equals("video/avc")) {
                        b10 = 0;
                    }
                } else if (str3.equals("video/hevc")) {
                    b10 = 1;
                }
            } else if (str3.equals("video/av01")) {
                b10 = 2;
            }
            if (b10 == 0) {
                iZzb = 0;
                iZza = 8;
            } else if (b10 == 1 || b10 == 2) {
                iZzb = 0;
                iZza = 2;
            }
        }
        if (!this.zzi && !this.zzb.equals("audio/ac4") && iZza != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrZzb = zzb();
        String str4 = this.zzb;
        if (str4.equals("audio/ac4") && codecProfileLevelArrZzb.length == 0) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
            if (codecCapabilities != null && (audioCapabilities = codecCapabilities.getAudioCapabilities()) != null && audioCapabilities.getMaxInputChannelCount() > 18) {
                i11 = 16;
            }
            codecProfileLevelArrZzb = zzfl.zzQ(context) ? new MediaCodecInfo.CodecProfileLevel[]{zzwf.zzf(1026, i11)} : new MediaCodecInfo.CodecProfileLevel[]{zzwf.zzf(257, i11), zzwf.zzf(EventTypeExtended.EVENT_TYPE_EXTENDED_TOKEN_GENERATED_VALUE, i11), zzwf.zzf(EventTypeExtended.EVENT_TYPE_EXTENDED_IMPRESSION_OPPORTUNITY_VALUE, i11), zzwf.zzf(1026, i11), zzwf.zzf(1028, i11)};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArrZzb) {
            if (codecProfileLevel.profile == iZza && (codecProfileLevel.level >= iZzb || !z10)) {
                if ("video/hevc".equals(str4) && iZza == 2) {
                    String str5 = Build.DEVICE;
                    if ("sailfish".equals(str5) || "marlin".equals(str5)) {
                    }
                }
                return true;
            }
        }
        String str6 = zzvVar.zzk;
        String str7 = this.zzc;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str6).length() + 22 + str7.length());
        sb2.append("codec.profileLevel, ");
        sb2.append(str6);
        sb2.append(", ");
        sb2.append(str7);
        zzm(sb2.toString());
        return false;
    }

    private final boolean zzl(zzv zzvVar) {
        return (Objects.equals(zzvVar.zzp, "audio/flac") && zzvVar.zzJ == 22 && Build.VERSION.SDK_INT < 34 && this.zza.equals("c2.android.flac.decoder")) ? false : true;
    }

    private final void zzm(String str) {
        String str2 = zzfl.zza;
        String str3 = this.zzb;
        int length = String.valueOf(str3).length();
        int length2 = String.valueOf(str2).length();
        int length3 = str.length();
        String str4 = this.zza;
        StringBuilder sb2 = new StringBuilder(length3 + 14 + str4.length() + 2 + length + 3 + length2 + 1);
        sb2.append("NoSupport [");
        sb2.append(str);
        sb2.append("] [");
        sb2.append(str4);
        sb2.append(", ");
        sb2.append(str3);
        sb2.append("] [");
        sb2.append(str2);
        sb2.append("]");
        zzeg.zza("MediaCodecInfo", sb2.toString());
    }

    private static boolean zzn(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point pointZzo = zzo(videoCapabilities, i10, i11);
        int i12 = pointZzo.x;
        int i13 = pointZzo.y;
        if (d10 == -1.0d || d10 < 1.0d) {
            return videoCapabilities.isSizeSupported(i12, i13);
        }
        double dFloor = Math.floor(d10);
        if (!videoCapabilities.areSizeAndRateSupported(i12, i13, dFloor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i12, i13);
        return achievableFrameRatesFor == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
    }

    private static Point zzo(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        String str = zzfl.zza;
        return new Point((((i10 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i11 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final String toString() {
        return this.zza;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzb() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public final boolean zzc(Context context, zzv zzvVar) {
        int i10;
        int i11;
        if (!zzj(zzvVar) || !zzk(context, zzvVar, true) || !zzl(zzvVar)) {
            return false;
        }
        if (this.zzi) {
            int i12 = zzvVar.zzw;
            if (i12 <= 0 || (i11 = zzvVar.zzx) <= 0) {
                return true;
            }
            return zzg(i12, i11, zzvVar.zzA);
        }
        int i13 = zzvVar.zzI;
        if (i13 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
            if (codecCapabilities == null) {
                zzm("sampleRate.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                zzm("sampleRate.aCaps");
                return false;
            }
            if (!audioCapabilities.isSampleRateSupported(i13)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i13).length() + 20);
                sb2.append("sampleRate.support, ");
                sb2.append(i13);
                zzm(sb2.toString());
                return false;
            }
        }
        int i14 = zzvVar.zzH;
        if (i14 == -1) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
        if (codecCapabilities2 == null) {
            zzm("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
        if (audioCapabilities2 == null) {
            zzm("channelCount.aCaps");
            return false;
        }
        String str = this.zza;
        String str2 = this.zzb;
        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
        if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
            if ("audio/ac3".equals(str2)) {
                i10 = 6;
            } else {
                i10 = "audio/eac3".equals(str2) ? 16 : 30;
            }
            StringBuilder sb3 = new StringBuilder(str.length() + 32 + String.valueOf(maxInputChannelCount).length() + 4 + String.valueOf(i10).length() + 1);
            sb3.append("AssumedMaxChannelAdjustment: ");
            sb3.append(str);
            sb3.append(", [");
            sb3.append(maxInputChannelCount);
            sb3.append(" to ");
            sb3.append(i10);
            sb3.append("]");
            zzeg.zzc("MediaCodecInfo", sb3.toString());
            maxInputChannelCount = i10;
        }
        if (maxInputChannelCount >= i14) {
            return true;
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(i14).length() + 22);
        sb4.append("channelCount.support, ");
        sb4.append(i14);
        zzm(sb4.toString());
        return false;
    }

    public final boolean zzd(Context context, zzv zzvVar) {
        return zzj(zzvVar) && zzk(context, zzvVar, false) && zzl(zzvVar);
    }

    public final boolean zze(zzv zzvVar) {
        if (this.zzi) {
            return this.zze;
        }
        zzdp zzdpVarZzf = zzdq.zzf(zzvVar);
        return zzdpVarZzf != null && zzdpVarZzf.zzc() && zzdpVarZzf.zza() == 42;
    }

    public final zzjc zzf(zzv zzvVar, zzv zzvVar2) {
        int i10;
        String str = zzvVar.zzp;
        String str2 = zzvVar2.zzp;
        int i11 = true != Objects.equals(str, str2) ? 8 : 0;
        if (this.zzi) {
            if (zzvVar.zzB != zzvVar2.zzB) {
                i11 |= 1024;
            }
            boolean z10 = (zzvVar.zzw == zzvVar2.zzw && zzvVar.zzx == zzvVar2.zzx) ? false : true;
            if (!this.zze && z10) {
                i11 |= 512;
            }
            zzi zziVar = zzvVar.zzF;
            if ((!zzi.zza(zziVar) || !zzi.zza(zzvVar2.zzF)) && !Objects.equals(zziVar, zzvVar2.zzF)) {
                i11 |= 2048;
            }
            String str3 = this.zza;
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str3) && !zzvVar.zzd(zzvVar2)) {
                i11 |= 2;
            }
            int i12 = zzvVar.zzy;
            if (i12 != -1 && (i10 = zzvVar.zzz) != -1 && i12 == zzvVar2.zzy && i10 == zzvVar2.zzz && z10) {
                i11 |= 2;
            }
            if (i11 == 0 && Objects.equals(str2, "video/dolby-vision")) {
                Pair pairZze = zzdq.zze(zzvVar);
                Pair pairZze2 = zzdq.zze(zzvVar2);
                if (pairZze == null || pairZze2 == null || !((Integer) pairZze.first).equals(pairZze2.first)) {
                    i11 = 2;
                }
            }
            if (i11 == 0) {
                return new zzjc(str3, zzvVar, zzvVar2, true == zzvVar.zzd(zzvVar2) ? 3 : 2, 0);
            }
        } else {
            if (zzvVar.zzH != zzvVar2.zzH) {
                i11 |= 4096;
            }
            if (zzvVar.zzI != zzvVar2.zzI) {
                i11 |= 8192;
            }
            if (zzvVar.zzJ != zzvVar2.zzJ) {
                i11 |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
            if (i11 == 0) {
                String str4 = this.zzb;
                if (str4.equals("audio/mp4a-latm") || str4.equals("audio/ac4")) {
                    Pair pairZze3 = zzdq.zze(zzvVar);
                    Pair pairZze4 = zzdq.zze(zzvVar2);
                    if (pairZze3 != null && pairZze4 != null) {
                        int iIntValue = ((Integer) pairZze3.first).intValue();
                        int iIntValue2 = ((Integer) pairZze4.first).intValue();
                        if (iIntValue == 42 && iIntValue2 == 42) {
                            return new zzjc(this.zza, zzvVar, zzvVar2, 3, 0);
                        }
                        if (str4.equals("audio/ac4") && pairZze3.equals(pairZze4)) {
                            return new zzjc(this.zza, zzvVar, zzvVar2, 3, 0);
                        }
                    }
                }
            }
            if (i11 == 0) {
                String str5 = this.zzb;
                if (str5.equals("audio/eac3-joc") || str5.equals("audio/eac3")) {
                    return new zzjc(this.zza, zzvVar, zzvVar2, 3, 0);
                }
            }
            if (!zzvVar.zzd(zzvVar2)) {
                i11 |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i11 |= 2;
            }
            if (i11 == 0) {
                return new zzjc(this.zza, zzvVar, zzvVar2, 1, 0);
            }
        }
        return new zzjc(this.zza, zzvVar, zzvVar2, 0, i11);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    public final boolean zzg(int i10, int i11, double d10) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null) {
            zzm("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzm("sizeAndRate.vCaps");
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int iZza = zzvo.zza(videoCapabilities, i10, i11, d10);
            if (iZza != 2) {
                if (iZza == 1) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 20 + String.valueOf(i11).length() + 1 + String.valueOf(d10).length());
                    sb2.append("sizeAndRate.cover, ");
                    sb2.append(i10);
                    sb2.append("x");
                    sb2.append(i11);
                    sb2.append("@");
                    sb2.append(d10);
                    zzm(sb2.toString());
                    return false;
                }
                if (!zzn(videoCapabilities, i10, i11, d10)) {
                    if (i10 < i11) {
                        str = this.zza;
                        if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str)) {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 22 + String.valueOf(i11).length() + 1 + String.valueOf(d10).length());
                            sb3.append("sizeAndRate.rotated, ");
                            sb3.append(i10);
                            sb3.append("x");
                            sb3.append(i11);
                            sb3.append("@");
                            sb3.append(d10);
                            String string = sb3.toString();
                            String str2 = this.zzb;
                            int length = str.length();
                            String str3 = zzfl.zza;
                            int length2 = String.valueOf(str2).length();
                            StringBuilder sb4 = new StringBuilder(string.length() + 19 + length + 2 + length2 + 3 + String.valueOf(str3).length() + 1);
                            sb4.append("AssumedSupport [");
                            sb4.append(string);
                            sb4.append("] [");
                            sb4.append(str);
                            sb4.append(", ");
                            sb4.append(str2);
                            sb4.append("] [");
                            sb4.append(str3);
                            sb4.append("]");
                            zzeg.zza("MediaCodecInfo", sb4.toString());
                        } else {
                            StringBuilder sb5 = new StringBuilder(String.valueOf(i10).length() + 22 + String.valueOf(i11).length() + 1 + String.valueOf(d10).length());
                            sb5.append("sizeAndRate.rotated, ");
                            sb5.append(i10);
                            sb5.append("x");
                            sb5.append(i11);
                            sb5.append("@");
                            sb5.append(d10);
                            String string2 = sb5.toString();
                            String str4 = this.zzb;
                            int length3 = str.length();
                            String str5 = zzfl.zza;
                            int length4 = String.valueOf(str4).length();
                            StringBuilder sb6 = new StringBuilder(string2.length() + 19 + length3 + 2 + length4 + 3 + String.valueOf(str5).length() + 1);
                            sb6.append("AssumedSupport [");
                            sb6.append(string2);
                            sb6.append("] [");
                            sb6.append(str);
                            sb6.append(", ");
                            sb6.append(str4);
                            sb6.append("] [");
                            sb6.append(str5);
                            sb6.append("]");
                            zzeg.zza("MediaCodecInfo", sb6.toString());
                        }
                    }
                    StringBuilder sb7 = new StringBuilder(String.valueOf(i10).length() + 22 + String.valueOf(i11).length() + 1 + String.valueOf(d10).length());
                    sb7.append("sizeAndRate.support, ");
                    sb7.append(i10);
                    sb7.append("x");
                    sb7.append(i11);
                    sb7.append("@");
                    sb7.append(d10);
                    zzm(sb7.toString());
                    return false;
                }
            }
        } else if (!zzn(videoCapabilities, i10, i11, d10)) {
            if (i10 < i11) {
                str = this.zza;
                if (("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && zzn(videoCapabilities, i11, i10, d10)) {
                    StringBuilder sb8 = new StringBuilder(String.valueOf(i10).length() + 22 + String.valueOf(i11).length() + 1 + String.valueOf(d10).length());
                    sb8.append("sizeAndRate.rotated, ");
                    sb8.append(i10);
                    sb8.append("x");
                    sb8.append(i11);
                    sb8.append("@");
                    sb8.append(d10);
                    String string3 = sb8.toString();
                    String str6 = this.zzb;
                    int length5 = str.length();
                    String str7 = zzfl.zza;
                    int length6 = String.valueOf(str6).length();
                    StringBuilder sb9 = new StringBuilder(string3.length() + 19 + length5 + 2 + length6 + 3 + String.valueOf(str7).length() + 1);
                    sb9.append("AssumedSupport [");
                    sb9.append(string3);
                    sb9.append("] [");
                    sb9.append(str);
                    sb9.append(", ");
                    sb9.append(str6);
                    sb9.append("] [");
                    sb9.append(str7);
                    sb9.append("]");
                    zzeg.zza("MediaCodecInfo", sb9.toString());
                }
            }
            StringBuilder sb10 = new StringBuilder(String.valueOf(i10).length() + 22 + String.valueOf(i11).length() + 1 + String.valueOf(d10).length());
            sb10.append("sizeAndRate.support, ");
            sb10.append(i10);
            sb10.append("x");
            sb10.append(i11);
            sb10.append("@");
            sb10.append(d10);
            zzm(sb10.toString());
            return false;
        }
        return true;
    }

    public final float zzh(int i10, int i11) {
        if (!this.zzi) {
            return -3.4028235E38f;
        }
        float f10 = this.zzl;
        if (f10 != -3.4028235E38f && this.zzj == i10 && this.zzk == i11) {
            return f10;
        }
        float f11 = 1024.0f;
        if (!zzg(i10, i11, 1024.0d)) {
            float f12 = 0.0f;
            while (true) {
                float f13 = f11 - f12;
                if (Math.abs(f13) <= 5.0f) {
                    break;
                }
                float f14 = (f13 / 2.0f) + f12;
                boolean zZzg = zzg(i10, i11, f14);
                if (true == zZzg) {
                    f12 = f14;
                }
                if (true != zZzg) {
                    f11 = f14;
                }
            }
            f11 = f12;
        }
        this.zzl = f11;
        this.zzj = i10;
        this.zzk = i11;
        return f11;
    }

    public final Point zzi(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzo(videoCapabilities, i10, i11);
    }
}
