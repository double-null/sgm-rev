package u8;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: compiled from: OrientationListener.java */
/* JADX INFO: loaded from: classes4.dex */
final class d implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f26552a = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f26553b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float[] f26554c = new float[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f26555d = new float[3];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Display f26556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a[] f26557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f26558g;

    /* JADX INFO: compiled from: OrientationListener.java */
    public interface a {
        void a(float[] fArr, float f10);
    }

    public d(Display display, a... aVarArr) {
        this.f26556e = display;
        this.f26557f = aVarArr;
    }

    private float a(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, this.f26553b);
        SensorManager.getOrientation(this.f26553b, this.f26555d);
        return this.f26555d[2];
    }

    private void b(float[] fArr, float f10) {
        for (a aVar : this.f26557f) {
            aVar.a(fArr, f10);
        }
    }

    private void c(float[] fArr) {
        if (!this.f26558g) {
            c.a(this.f26554c, fArr);
            this.f26558g = true;
        }
        float[] fArr2 = this.f26553b;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f26553b, 0, this.f26554c, 0);
    }

    private void d(float[] fArr, int i10) {
        if (i10 != 0) {
            int i11 = Sdk.SDKError.Reason.EMPTY_TPAT_ERROR_VALUE;
            int i12 = 1;
            if (i10 == 1) {
                i12 = 129;
                i11 = 2;
            } else if (i10 == 2) {
                i12 = 130;
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException();
                }
                i11 = 130;
            }
            float[] fArr2 = this.f26553b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f26553b, i11, i12, fArr);
        }
    }

    private static void e(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f26552a, sensorEvent.values);
        d(this.f26552a, this.f26556e.getRotation());
        float fA = a(this.f26552a);
        e(this.f26552a);
        c(this.f26552a);
        b(this.f26552a, fA);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
