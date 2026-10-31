package io.bidmachine.media3.exoplayer.mediacodec;

import android.media.MediaCodecInfo;
import java.util.List;
import x7.l0;

/* JADX INFO: compiled from: MediaCodecPerformancePointCoverageProvider.java */
/* JADX INFO: loaded from: classes4.dex */
final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Boolean f19300a;

    /* JADX INFO: compiled from: MediaCodecPerformancePointCoverageProvider.java */
    private static final class a {
        public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
            List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
                return 0;
            }
            int iC = c(supportedPerformancePoints, new MediaCodecInfo.VideoCapabilities.PerformancePoint(i10, i11, (int) d10));
            if (iC == 1 && k.f19300a == null) {
                Boolean unused = k.f19300a = Boolean.valueOf(d());
                if (k.f19300a.booleanValue()) {
                    return 0;
                }
            }
            return iC;
        }

        private static int b(boolean z10) {
            List supportedPerformancePoints;
            try {
                u7.q qVarN = new u7.q.b().u0("video/avc").N();
                if (qVarN.f26252o != null) {
                    List<j> listM = MediaCodecUtil.m(l.f19301a, qVarN, z10, false);
                    for (int i10 = 0; i10 < listM.size(); i10++) {
                        if (listM.get(i10).f19291d != null && listM.get(i10).f19291d.getVideoCapabilities() != null && (supportedPerformancePoints = listM.get(i10).f19291d.getVideoCapabilities().getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                            return c(supportedPerformancePoints, new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60));
                        }
                    }
                }
            } catch (MediaCodecUtil.DecoderQueryException unused) {
            }
            return 0;
        }

        private static int c(List<MediaCodecInfo.VideoCapabilities.PerformancePoint> list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (list.get(i10).covers(performancePoint)) {
                    return 2;
                }
            }
            return 1;
        }

        private static boolean d() {
            if (l0.f28136a >= 35) {
                return false;
            }
            int iB = b(false);
            int iB2 = b(true);
            if (iB == 0) {
                return true;
            }
            if (iB2 == 0) {
                return iB != 2;
            }
            return (iB == 2 && iB2 == 2) ? false : true;
        }
    }

    public static int c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        if (l0.f28136a < 29) {
            return 0;
        }
        Boolean bool = f19300a;
        if (bool == null || !bool.booleanValue()) {
            return a.a(videoCapabilities, i10, i11, d10);
        }
        return 0;
    }
}
