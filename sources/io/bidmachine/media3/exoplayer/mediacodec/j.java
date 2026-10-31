package io.bidmachine.media3.exoplayer.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Objects;
import sc.NfwM.XDucgbzInpQa;
import u7.w;
import x7.l0;

/* JADX INFO: compiled from: MediaCodecInfo.java */
/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f19291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f19292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f19293f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f19294g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f19295h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f19296i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f19297j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f19298k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f19299l;

    j(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f19288a = (String) x7.a.e(str);
        this.f19289b = str2;
        this.f19290c = str3;
        this.f19291d = codecCapabilities;
        this.f19295h = z10;
        this.f19296i = z11;
        this.f19297j = z12;
        this.f19292e = z13;
        this.f19293f = z14;
        this.f19294g = z15;
        this.f19298k = z16;
        this.f19299l = w.t(str2);
    }

    private static boolean A(String str) {
        if (l0.f28136a <= 22) {
            String str2 = Build.MODEL;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    private static boolean B(String str, int i10) {
        if ("video/hevc".equals(str) && 2 == i10) {
            String str2 = Build.DEVICE;
            if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean C(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(Build.DEVICE)) ? false : true;
    }

    public static j D(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return new j(str, str2, str3, codecCapabilities, z10, z11, z12, (z13 || codecCapabilities == null || !h(codecCapabilities) || A(str)) ? false : true, codecCapabilities != null && t(codecCapabilities), z14 || (codecCapabilities != null && s(codecCapabilities)), m(codecCapabilities));
    }

    private static int a(String str, String str2, int i10) {
        int i11;
        if (i10 > 1 || ((l0.f28136a >= 26 && i10 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i10;
        }
        if ("audio/ac3".equals(str2)) {
            i11 = 6;
        } else {
            i11 = "audio/eac3".equals(str2) ? 16 : 30;
        }
        x7.r.h("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i10 + " to " + i11 + "]");
        return i11;
    }

    private static Point b(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(l0.k(i10, widthAlignment) * widthAlignment, l0.k(i11, heightAlignment) * heightAlignment);
    }

    private static boolean d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point pointB = b(videoCapabilities, i10, i11);
        int i12 = pointB.x;
        int i13 = pointB.y;
        return (d10 == -1.0d || d10 < 1.0d) ? videoCapabilities.isSizeSupported(i12, i13) : videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
    }

    private static MediaCodecInfo.CodecProfileLevel[] f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        int i10;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int iIntValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
        if (iIntValue >= 180000000) {
            i10 = 1024;
        } else if (iIntValue >= 120000000) {
            i10 = 512;
        } else if (iIntValue >= 60000000) {
            i10 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
        } else if (iIntValue >= 30000000) {
            i10 = 128;
        } else if (iIntValue >= 18000000) {
            i10 = 64;
        } else if (iIntValue >= 12000000) {
            i10 = 32;
        } else if (iIntValue >= 7200000) {
            i10 = 16;
        } else if (iIntValue >= 3600000) {
            i10 = 8;
        } else if (iIntValue >= 1800000) {
            i10 = 4;
        } else {
            i10 = iIntValue >= 800000 ? 2 : 1;
        }
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i10;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    private static boolean h(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private boolean k(u7.q qVar, boolean z10) {
        Pair<Integer, Integer> pairI = MediaCodecUtil.i(qVar);
        String str = qVar.f26252o;
        if (str != null && str.equals("video/mv-hevc")) {
            String strU = w.u(this.f19290c);
            if (strU.equals("video/mv-hevc")) {
                return true;
            }
            if (strU.equals("video/hevc")) {
                pairI = MediaCodecUtil.q(qVar);
            }
        }
        if (pairI == null) {
            return true;
        }
        int iIntValue = ((Integer) pairI.first).intValue();
        int iIntValue2 = ((Integer) pairI.second).intValue();
        if ("video/dolby-vision".equals(qVar.f26252o)) {
            String str2 = this.f19289b;
            str2.hashCode();
            switch (str2) {
                case "video/av01":
                case "video/hevc":
                    iIntValue2 = 0;
                    iIntValue = 2;
                    break;
                case "video/avc":
                    iIntValue = 8;
                    iIntValue2 = 0;
                    break;
            }
        }
        if (!this.f19299l && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrG = g();
        if (l0.f28136a <= 23 && "video/x-vnd.on2.vp9".equals(this.f19289b) && codecProfileLevelArrG.length == 0) {
            codecProfileLevelArrG = f(this.f19291d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArrG) {
            if (codecProfileLevel.profile == iIntValue && ((codecProfileLevel.level >= iIntValue2 || !z10) && !B(this.f19289b, iIntValue))) {
                return true;
            }
        }
        w("codec.profileLevel, " + qVar.f26248k + ", " + this.f19290c);
        return false;
    }

    private boolean l(u7.q qVar) {
        return (Objects.equals(qVar.f26252o, "audio/flac") && qVar.G == 22 && l0.f28136a < 34 && this.f19288a.equals("c2.android.flac.decoder")) ? false : true;
    }

    private static boolean m(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return l0.f28136a >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface") && !z();
    }

    private boolean q(u7.q qVar) {
        return this.f19289b.equals(qVar.f26252o) || this.f19289b.equals(MediaCodecUtil.f(qVar));
    }

    private static boolean s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean t(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private void v(String str) {
        x7.r.b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f19288a + ", " + this.f19289b + "] [" + l0.f28140e + "]");
    }

    private void w(String str) {
        x7.r.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f19288a + ", " + this.f19289b + "] [" + l0.f28140e + "]");
    }

    private static boolean x(String str) {
        return "audio/opus".equals(str);
    }

    private static boolean y(String str) {
        return Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean z() {
        String str = Build.MANUFACTURER;
        return str.equals("Xiaomi") || str.equals("OPPO");
    }

    public Point c(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f19291d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return b(videoCapabilities, i10, i11);
    }

    public b8.c e(u7.q qVar, u7.q qVar2) {
        int i10 = !Objects.equals(qVar.f26252o, qVar2.f26252o) ? 8 : 0;
        if (this.f19299l) {
            if (qVar.f26262y != qVar2.f26262y) {
                i10 |= 1024;
            }
            if (!this.f19292e && (qVar.f26259v != qVar2.f26259v || qVar.f26260w != qVar2.f26260w)) {
                i10 |= 512;
            }
            if ((!u7.g.h(qVar.C) || !u7.g.h(qVar2.C)) && !Objects.equals(qVar.C, qVar2.C)) {
                i10 |= 2048;
            }
            if (y(this.f19288a) && !qVar.f(qVar2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new b8.c(this.f19288a, qVar, qVar2, qVar.f(qVar2) ? 3 : 2, 0);
            }
        } else {
            if (qVar.E != qVar2.E) {
                i10 |= 4096;
            }
            if (qVar.F != qVar2.F) {
                i10 |= 8192;
            }
            if (qVar.G != qVar2.G) {
                i10 |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
            if (i10 == 0 && "audio/mp4a-latm".equals(this.f19289b)) {
                Pair<Integer, Integer> pairI = MediaCodecUtil.i(qVar);
                Pair<Integer, Integer> pairI2 = MediaCodecUtil.i(qVar2);
                if (pairI != null && pairI2 != null) {
                    int iIntValue = ((Integer) pairI.first).intValue();
                    int iIntValue2 = ((Integer) pairI2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new b8.c(this.f19288a, qVar, qVar2, 3, 0);
                    }
                }
            }
            if (!qVar.f(qVar2)) {
                i10 |= 32;
            }
            if (x(this.f19289b)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new b8.c(this.f19288a, qVar, qVar2, 1, 0);
            }
        }
        return new b8.c(this.f19288a, qVar, qVar2, 0, i10);
    }

    public MediaCodecInfo.CodecProfileLevel[] g() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f19291d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean i(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f19291d;
        if (codecCapabilities == null) {
            w("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            w("channelCount.aCaps");
            return false;
        }
        if (a(this.f19288a, this.f19289b, audioCapabilities.getMaxInputChannelCount()) >= i10) {
            return true;
        }
        w("channelCount.support, " + i10);
        return false;
    }

    public boolean n(u7.q qVar) {
        return q(qVar) && k(qVar, false) && l(qVar);
    }

    public boolean o(u7.q qVar) throws MediaCodecUtil.DecoderQueryException {
        int i10;
        if (!q(qVar) || !k(qVar, true) || !l(qVar)) {
            return false;
        }
        if (this.f19299l) {
            int i11 = qVar.f26259v;
            if (i11 <= 0 || (i10 = qVar.f26260w) <= 0) {
                return true;
            }
            return u(i11, i10, qVar.f26261x);
        }
        int i12 = qVar.F;
        if (i12 != -1 && !j(i12)) {
            return false;
        }
        int i13 = qVar.E;
        return i13 == -1 || i(i13);
    }

    public boolean p() {
        if (l0.f28136a >= 29 && "video/x-vnd.on2.vp9".equals(this.f19289b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : g()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean r(u7.q qVar) {
        if (this.f19299l) {
            return this.f19292e;
        }
        Pair<Integer, Integer> pairI = MediaCodecUtil.i(qVar);
        return pairI != null && ((Integer) pairI.first).intValue() == 42;
    }

    public String toString() {
        return this.f19288a;
    }

    public boolean u(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f19291d;
        if (codecCapabilities == null) {
            w("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            w("sizeAndRate.vCaps");
            return false;
        }
        if (l0.f28136a >= 29) {
            int iC = k.c(videoCapabilities, i10, i11, d10);
            if (iC == 2) {
                return true;
            }
            if (iC == 1) {
                w("sizeAndRate.cover, " + i10 + "x" + i11 + "@" + d10);
                return false;
            }
        }
        if (!d(videoCapabilities, i10, i11, d10)) {
            if (i10 >= i11 || !C(this.f19288a) || !d(videoCapabilities, i11, i10, d10)) {
                w("sizeAndRate.support, " + i10 + "x" + i11 + "@" + d10);
                return false;
            }
            v("sizeAndRate.rotated, " + i10 + "x" + i11 + "@" + d10);
        }
        return true;
    }

    public boolean j(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f19291d;
        if (codecCapabilities == null) {
            w("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            w(XDucgbzInpQa.muVMsEpW);
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i10)) {
            return true;
        }
        w("sampleRate.support, " + i10);
        return false;
    }
}
