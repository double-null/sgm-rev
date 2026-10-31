package io.bidmachine.media3.exoplayer.mediacodec;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.adjust.sdk.Constants;
import com.applovin.shadow.okio.internal.MoA.edUJlCZxhVnO;
import com.google.common.collect.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import u7.w;
import x7.l0;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaCodecUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashMap<b, List<j>> f19224a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f19225b = -1;

    public static class DecoderQueryException extends Exception {
        private DecoderQueryException(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f19226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f19227b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f19228c;

        public b(String str, boolean z10, boolean z11) {
            this.f19226a = str;
            this.f19227b = z10;
            this.f19228c = z11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != b.class) {
                return false;
            }
            b bVar = (b) obj;
            return TextUtils.equals(this.f19226a, bVar.f19226a) && this.f19227b == bVar.f19227b && this.f19228c == bVar.f19228c;
        }

        public int hashCode() {
            return ((((this.f19226a.hashCode() + 31) * 31) + (this.f19227b ? 1231 : 1237)) * 31) + (this.f19228c ? 1231 : 1237);
        }
    }

    private interface c {
        MediaCodecInfo a(int i10);

        boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int d();

        boolean e();
    }

    private static final class d implements c {
        private d() {
        }

        @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public MediaCodecInfo a(int i10) {
            return MediaCodecList.getCodecInfoAt(i10);
        }

        @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public int d() {
            return MediaCodecList.getCodecCount();
        }

        @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public boolean e() {
            return false;
        }
    }

    private static final class e implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f19229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private MediaCodecInfo[] f19230b;

        public e(boolean z10, boolean z11, boolean z12) {
            this.f19229a = (z10 || z11 || z12) ? 1 : 0;
        }

        private void f() {
            if (this.f19230b == null) {
                this.f19230b = new MediaCodecList(this.f19229a).getCodecInfos();
            }
        }

        @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public MediaCodecInfo a(int i10) {
            f();
            return this.f19230b[i10];
        }

        @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public int d() {
            f();
            return this.f19230b.length;
        }

        @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public boolean e() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface f<T> {
        int a(T t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int A(j jVar) {
        String str = jVar.f19288a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (l0.f28136a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int B(u7.q qVar, j jVar) {
        return jVar.n(qVar) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int C(j jVar) {
        return (jVar.f19296i ? 2 : 0) + (!jVar.f19297j ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int D(f fVar, Object obj, Object obj2) {
        return fVar.a(obj2) - fVar.a(obj);
    }

    private static <T> void E(List<T> list, final f<T> fVar) {
        Collections.sort(list, new Comparator() { // from class: io.bidmachine.media3.exoplayer.mediacodec.p
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return MediaCodecUtil.D(fVar, obj, obj2);
            }
        });
    }

    private static void e(String str, List<j> list) {
        if ("audio/raw".equals(str)) {
            if (l0.f28136a < 26 && Build.DEVICE.equals("R9") && list.size() == 1 && list.get(0).f19288a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(j.D("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            E(list, new f() { // from class: io.bidmachine.media3.exoplayer.mediacodec.m
                @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecUtil.f
                public final int a(Object obj) {
                    return MediaCodecUtil.A((j) obj);
                }
            });
        }
        if (l0.f28136a >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).f19288a)) {
            return;
        }
        list.add(list.remove(0));
    }

    public static String f(u7.q qVar) {
        Pair<Integer, Integer> pairI;
        if ("audio/eac3-joc".equals(qVar.f26252o)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(qVar.f26252o) && (pairI = i(qVar)) != null) {
            int iIntValue = ((Integer) pairI.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(qVar.f26252o)) {
            return "video/hevc";
        }
        return null;
    }

    public static List<j> g(l lVar, u7.q qVar, boolean z10, boolean z11) throws DecoderQueryException {
        String strF = f(qVar);
        return strF == null ? u.H() : lVar.b(strF, z10, z11);
    }

    private static String h(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    @Deprecated
    public static Pair<Integer, Integer> i(u7.q qVar) {
        return x7.i.n(qVar);
    }

    public static j j(String str, boolean z10, boolean z11) throws DecoderQueryException {
        List<j> listK = k(str, z10, z11);
        if (listK.isEmpty()) {
            return null;
        }
        return listK.get(0);
    }

    public static synchronized List<j> k(String str, boolean z10, boolean z11) throws DecoderQueryException {
        b bVar = new b(str, z10, z11);
        HashMap<b, List<j>> map = f19224a;
        List<j> list = map.get(bVar);
        if (list != null) {
            return list;
        }
        ArrayList<j> arrayListL = l(bVar, new e(z10, z11, str.equals("video/mv-hevc")));
        if (z10 && arrayListL.isEmpty() && l0.f28136a <= 23) {
            arrayListL = l(bVar, new d());
            if (!arrayListL.isEmpty()) {
                x7.r.h("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + arrayListL.get(0).f19288a);
            }
        }
        e(str, arrayListL);
        u uVarB = u.B(arrayListL);
        map.put(bVar, uVarB);
        return uVarB;
    }

    public static List<j> m(l lVar, u7.q qVar, boolean z10, boolean z11) throws DecoderQueryException {
        List<j> listB = lVar.b(qVar.f26252o, z10, z11);
        return u.v().k(listB).k(g(lVar, qVar, z10, z11)).m();
    }

    public static List<j> n(List<j> list, final u7.q qVar) {
        ArrayList arrayList = new ArrayList(list);
        E(arrayList, new f() { // from class: io.bidmachine.media3.exoplayer.mediacodec.n
            @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecUtil.f
            public final int a(Object obj) {
                return MediaCodecUtil.B(qVar, (j) obj);
            }
        });
        return arrayList;
    }

    public static List<j> o(List<j> list) {
        ArrayList arrayList = new ArrayList(list);
        E(arrayList, new f() { // from class: io.bidmachine.media3.exoplayer.mediacodec.o
            @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecUtil.f
            public final int a(Object obj) {
                return MediaCodecUtil.C((j) obj);
            }
        });
        return u.B(arrayList);
    }

    public static j p() throws DecoderQueryException {
        return j("audio/raw", false, false);
    }

    public static Pair<Integer, Integer> q(u7.q qVar) {
        String strH = y7.f.h(qVar.f26255r);
        if (strH == null) {
            return null;
        }
        return x7.i.q(strH, l0.m1(strH.trim(), "\\."), qVar.C);
    }

    private static boolean r(MediaCodecInfo mediaCodecInfo) {
        return l0.f28136a >= 29 && s(mediaCodecInfo);
    }

    private static boolean s(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    private static boolean t(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z10 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = l0.f28136a;
        if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && Constants.REFERRER_API_SAMSUNG.equals(Build.MANUFACTURER))) {
            String str3 = Build.DEVICE;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        return (i10 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    private static boolean u(MediaCodecInfo mediaCodecInfo, String str) {
        return l0.f28136a >= 29 ? v(mediaCodecInfo) : !w(mediaCodecInfo, str);
    }

    private static boolean v(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private static boolean w(MediaCodecInfo mediaCodecInfo, String str) {
        if (l0.f28136a >= 29) {
            return x(mediaCodecInfo);
        }
        if (w.o(str)) {
            return true;
        }
        String strE = com.google.common.base.c.e(mediaCodecInfo.getName());
        if (strE.startsWith("arc.")) {
            return false;
        }
        if (strE.startsWith("omx.google.") || strE.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strE.startsWith("omx.sec.") && strE.contains(".sw.")) || strE.equals("omx.qcom.video.decoder.hevcswvdec") || strE.startsWith("c2.android.") || strE.startsWith("c2.google.")) {
            return true;
        }
        return (strE.startsWith("omx.") || strE.startsWith("c2.")) ? false : true;
    }

    private static boolean x(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    private static boolean y(MediaCodecInfo mediaCodecInfo) {
        if (l0.f28136a >= 29) {
            return z(mediaCodecInfo);
        }
        String strE = com.google.common.base.c.e(mediaCodecInfo.getName());
        return (strE.startsWith("omx.google.") || strE.startsWith("c2.android.") || strE.startsWith("c2.google.")) ? false : true;
    }

    private static boolean z(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0081  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:57:0x0101 A[Catch: Exception -> 0x0150, TRY_ENTER, TryCatch #0 {Exception -> 0x0150, blocks: (B:3:0x0008, B:5:0x001b, B:60:0x0120, B:8:0x002d, B:11:0x0038, B:54:0x00f9, B:57:0x0101, B:59:0x0107, B:61:0x012a, B:62:0x014e), top: B:67:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    /* JADX WARN: Code duplicated, block: B:81:0x012a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    private static ArrayList<j> l(b bVar, c cVar) throws DecoderQueryException {
        String strH;
        String str;
        String str2;
        int i10;
        boolean z10;
        int i11;
        b bVar2 = bVar;
        try {
            ArrayList<j> arrayList = new ArrayList<>();
            String str3 = bVar2.f19226a;
            int iD = cVar.d();
            boolean zE = cVar.e();
            int i12 = 0;
            while (i12 < iD) {
                MediaCodecInfo mediaCodecInfoA = cVar.a(i12);
                if (r(mediaCodecInfoA)) {
                    i10 = i12;
                    z10 = zE;
                    i11 = iD;
                } else {
                    String name = mediaCodecInfoA.getName();
                    if (t(mediaCodecInfoA, name, zE, str3) && (strH = h(mediaCodecInfoA, name, str3)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoA.getCapabilitiesForType(strH);
                            boolean zB = cVar.b("tunneled-playback", strH, capabilitiesForType);
                            boolean zC = cVar.c("tunneled-playback", strH, capabilitiesForType);
                            boolean z11 = bVar2.f19228c;
                            if ((z11 || !zC) && (!z11 || zB)) {
                                boolean zB2 = cVar.b("secure-playback", strH, capabilitiesForType);
                                boolean zC2 = cVar.c("secure-playback", strH, capabilitiesForType);
                                boolean z12 = bVar2.f19227b;
                                if ((z12 || !zC2) && (!z12 || zB2)) {
                                    boolean zU = u(mediaCodecInfoA, str3);
                                    boolean zW = w(mediaCodecInfoA, str3);
                                    boolean zY = y(mediaCodecInfoA);
                                    if (zE && bVar2.f19227b == zB2) {
                                        str = strH;
                                        i10 = i12;
                                        z10 = zE;
                                        i11 = iD;
                                        arrayList.add(j.D(name, str3, strH, capabilitiesForType, zU, zW, zY, false, false));
                                    } else if (zE) {
                                        str = strH;
                                        i10 = i12;
                                        z10 = zE;
                                        i11 = iD;
                                        if (!z10) {
                                            continue;
                                        }
                                    } else {
                                        try {
                                            if (bVar2.f19227b) {
                                                str = strH;
                                                i10 = i12;
                                                z10 = zE;
                                                i11 = iD;
                                                if (!z10 && zB2) {
                                                    StringBuilder sb2 = new StringBuilder();
                                                    try {
                                                        sb2.append(name);
                                                        sb2.append(".secure");
                                                        str2 = name;
                                                        try {
                                                            arrayList.add(j.D(sb2.toString(), str3, str, capabilitiesForType, zU, zW, zY, false, true));
                                                            return arrayList;
                                                        } catch (Exception e10) {
                                                            e = e10;
                                                            if (l0.f28136a <= 23 || arrayList.isEmpty()) {
                                                                x7.r.c("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + edUJlCZxhVnO.xeIOiMiOjkgNX);
                                                                throw e;
                                                            }
                                                            x7.r.c("MediaCodecUtil", "Skipping codec " + str2 + " (failed to query capabilities)");
                                                            i12 = i10 + 1;
                                                            bVar2 = bVar;
                                                            iD = i11;
                                                            zE = z10;
                                                        }
                                                    } catch (Exception e11) {
                                                        e = e11;
                                                        str2 = name;
                                                    }
                                                }
                                            } else {
                                                str = strH;
                                                i10 = i12;
                                                z10 = zE;
                                                i11 = iD;
                                                try {
                                                    arrayList.add(j.D(name, str3, strH, capabilitiesForType, zU, zW, zY, false, false));
                                                } catch (Exception e12) {
                                                    e = e12;
                                                    str2 = name;
                                                    if (l0.f28136a <= 23) {
                                                    }
                                                    x7.r.c("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + edUJlCZxhVnO.xeIOiMiOjkgNX);
                                                    throw e;
                                                }
                                            }
                                        } catch (Exception e13) {
                                            e = e13;
                                            str = strH;
                                            i10 = i12;
                                            z10 = zE;
                                            i11 = iD;
                                            str2 = name;
                                            if (l0.f28136a <= 23) {
                                            }
                                            x7.r.c("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + edUJlCZxhVnO.xeIOiMiOjkgNX);
                                            throw e;
                                        }
                                    }
                                } else {
                                    i10 = i12;
                                    z10 = zE;
                                    i11 = iD;
                                }
                            } else {
                                i10 = i12;
                                z10 = zE;
                                i11 = iD;
                            }
                        } catch (Exception e14) {
                            e = e14;
                            str = strH;
                            str2 = name;
                            i10 = i12;
                            z10 = zE;
                            i11 = iD;
                        }
                    } else {
                        i10 = i12;
                        z10 = zE;
                        i11 = iD;
                    }
                }
                i12 = i10 + 1;
                bVar2 = bVar;
                iD = i11;
                zE = z10;
            }
            return arrayList;
        } catch (Exception e15) {
            throw new DecoderQueryException(e15);
        }
    }
}
