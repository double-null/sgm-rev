package u8;

import android.opengl.Matrix;
import io.bidmachine.media3.common.util.GlUtil;
import x7.f0;

/* JADX INFO: compiled from: FrameRotationQueue.java */
/* JADX INFO: loaded from: classes4.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f26548a = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f26549b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f0<float[]> f26550c = new f0<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f26551d;

    public static void a(float[] fArr, float[] fArr2) {
        GlUtil.k(fArr);
        float f10 = fArr2[10];
        float f11 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f10 * f10) + (f11 * f11));
        float f12 = fArr2[10];
        fArr[0] = f12 / fSqrt;
        float f13 = fArr2[8];
        fArr[2] = f13 / fSqrt;
        fArr[8] = (-f13) / fSqrt;
        fArr[10] = f12 / fSqrt;
    }

    private static void b(float[] fArr, float[] fArr2) {
        float f10 = fArr2[0];
        float f11 = -fArr2[1];
        float f12 = -fArr2[2];
        float length = Matrix.length(f10, f11, f12);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f10 / length, f11 / length, f12 / length);
        } else {
            GlUtil.k(fArr);
        }
    }

    public boolean c(float[] fArr, long j10) {
        float[] fArrJ = this.f26550c.j(j10);
        if (fArrJ == null) {
            return false;
        }
        b(this.f26549b, fArrJ);
        if (!this.f26551d) {
            a(this.f26548a, this.f26549b);
            this.f26551d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f26548a, 0, this.f26549b, 0);
        return true;
    }

    public void d() {
        this.f26550c.c();
        this.f26551d = false;
    }

    public void e(long j10, float[] fArr) {
        this.f26550c.a(j10, fArr);
    }
}
