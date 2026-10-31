package com.unity3d.player;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Range;
import android.util.Size;
import android.util.SizeF;
import android.view.Surface;
import g7.EinF.ZHgPsTG;
import java.util.Arrays;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.unity3d.player.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2403w {
    private static CameraManager B;
    private static String[] C;
    private static Semaphore D = new Semaphore(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j6.b f12990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CameraDevice f12991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HandlerThread f12992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Handler f12993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Rect f12994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Rect f12995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f12996g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f12997h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f13000k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f13001l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Range f13003n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Image f13005p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private CaptureRequest.Builder f13006q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f13009t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private SurfaceTexture f13010u;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f12998i = -1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f12999j = -1.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f13002m = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ImageReader f13004o = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private CameraCaptureSession f13007r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Object f13008s = new Object();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Surface f13011v = null;
    private int A = 3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private CameraCaptureSession.CaptureCallback f13012w = new C2393r(this);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final CameraDevice.StateCallback f13013x = new C2397t(this);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final ImageReader.OnImageAvailableListener f13014y = new C2399u(this);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final SurfaceTexture.OnFrameAvailableListener f13015z = new C2401v(this);

    protected C2403w(j6.b bVar) {
        this.f12990a = null;
        this.f12990a = bVar;
        e();
    }

    public static int a(Context context) {
        return b(context).length;
    }

    private void b() {
        try {
            Semaphore semaphore = D;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (!semaphore.tryAcquire(4L, timeUnit)) {
                AbstractC2409z.Log(5, "Camera2: Timeout waiting to lock camera for closing.");
                return;
            }
            this.f12991b.close();
            try {
                if (!D.tryAcquire(4L, timeUnit)) {
                    AbstractC2409z.Log(5, "Camera2: Timeout waiting to close camera.");
                }
            } catch (InterruptedException e10) {
                AbstractC2409z.Log(6, "Camera2: Interrupted while waiting to close camera " + e10);
            }
            this.f12991b = null;
            D.release();
        } catch (InterruptedException e11) {
            AbstractC2409z.Log(6, "Camera2: Interrupted while trying to lock camera for closing " + e11);
        }
    }

    public static int c(Context context, int i10) {
        try {
            return ((Integer) c(context).getCameraCharacteristics(b(context)[i10]).get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        } catch (CameraAccessException e10) {
            AbstractC2409z.Log(6, "Camera2: CameraAccessException " + e10);
            return 0;
        }
    }

    private void e() {
        HandlerThread handlerThread = new HandlerThread("CameraBackground");
        this.f12992c = handlerThread;
        handlerThread.start();
        this.f12993d = new Handler(this.f12992c.getLooper());
    }

    private void f() {
        try {
            CameraCaptureSession cameraCaptureSession = this.f13007r;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.stopRepeating();
                this.f13006q.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                this.f13006q.set(CaptureRequest.CONTROL_AF_MODE, 0);
                this.f13006q.setTag("Cancel focus");
                this.f13007r.capture(this.f13006q.build(), this.f13012w, this.f12993d);
            }
        } catch (CameraAccessException e10) {
            AbstractC2409z.Log(6, "Camera2: CameraAccessException " + e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x00bc A[Catch: CameraAccessException -> 0x00e1, TryCatch #0 {CameraAccessException -> 0x00e1, blocks: (B:2:0x0000, B:4:0x0004, B:8:0x0011, B:13:0x001d, B:14:0x00bc, B:16:0x00d3), top: B:22:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x00d3 A[Catch: CameraAccessException -> 0x00e1, TRY_LEAVE, TryCatch #0 {CameraAccessException -> 0x00e1, blocks: (B:2:0x0000, B:4:0x0004, B:8:0x0011, B:13:0x001d, B:14:0x00bc, B:16:0x00d3), top: B:22:0x0000 }] */
    public void g() {
        CameraCaptureSession cameraCaptureSession;
        try {
            if (this.f12997h != 0) {
                float f10 = this.f12998i;
                if (f10 < 0.0f || f10 > 1.0f) {
                    this.f13006q.set(CaptureRequest.CONTROL_AF_MODE, 4);
                    this.f13006q.setTag("Regular");
                    cameraCaptureSession = this.f13007r;
                    if (cameraCaptureSession != null) {
                        cameraCaptureSession.setRepeatingRequest(this.f13006q.build(), this.f13012w, this.f12993d);
                    }
                } else {
                    float f11 = this.f12999j;
                    if (f11 < 0.0f || f11 > 1.0f) {
                        this.f13006q.set(CaptureRequest.CONTROL_AF_MODE, 4);
                        this.f13006q.setTag("Regular");
                        cameraCaptureSession = this.f13007r;
                        if (cameraCaptureSession != null) {
                            cameraCaptureSession.setRepeatingRequest(this.f13006q.build(), this.f13012w, this.f12993d);
                        }
                    } else {
                        this.f13002m = true;
                        int iWidth = this.f12995f.width();
                        int i10 = this.f13000k;
                        int i11 = (int) (((iWidth - (i10 * 2)) * this.f12998i) + i10);
                        int iHeight = this.f12995f.height();
                        int i12 = this.f13001l;
                        int i13 = (int) (((1.0d - ((double) this.f12999j)) * ((double) (iHeight - (i12 * 2)))) + ((double) i12));
                        int iMax = Math.max(this.f12996g + 1, Math.min(i11, (this.f12995f.width() - this.f12996g) - 1));
                        int iMax2 = Math.max(this.f12996g + 1, Math.min(i13, (this.f12995f.height() - this.f12996g) - 1));
                        CaptureRequest.Builder builder = this.f13006q;
                        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_REGIONS;
                        int i14 = this.f12996g;
                        int i15 = i14 * 2;
                        builder.set(key, new MeteringRectangle[]{new MeteringRectangle(iMax - i14, iMax2 - i14, i15, i15, 999)});
                        this.f13006q.set(CaptureRequest.CONTROL_AF_MODE, 1);
                        this.f13006q.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                        this.f13006q.setTag("Focus");
                        this.f13007r.capture(this.f13006q.build(), this.f13012w, this.f12993d);
                    }
                }
            } else {
                this.f13006q.set(CaptureRequest.CONTROL_AF_MODE, 4);
                this.f13006q.setTag("Regular");
                cameraCaptureSession = this.f13007r;
                if (cameraCaptureSession != null) {
                    cameraCaptureSession.setRepeatingRequest(this.f13006q.build(), this.f13012w, this.f12993d);
                }
            }
        } catch (CameraAccessException e10) {
            AbstractC2409z.Log(6, "Camera2: CameraAccessException " + e10);
        }
    }

    public final void d() {
        synchronized (this.f13008s) {
            CameraCaptureSession cameraCaptureSession = this.f13007r;
            if (cameraCaptureSession != null) {
                try {
                    cameraCaptureSession.stopRepeating();
                    this.A = 2;
                } catch (CameraAccessException e10) {
                    AbstractC2409z.Log(6, "Camera2: CameraAccessException " + e10);
                }
            }
        }
    }

    public void h() {
        Surface surface;
        if (this.f13009t != 0) {
            if (this.f13011v == null) {
                SurfaceTexture surfaceTexture = new SurfaceTexture(this.f13009t);
                this.f13010u = surfaceTexture;
                surfaceTexture.setDefaultBufferSize(this.f12994e.width(), this.f12994e.height());
                this.f13010u.setOnFrameAvailableListener(this.f13015z, this.f12993d);
                surface = new Surface(this.f13010u);
                this.f13011v = surface;
            }
        } else if (this.f13011v == null && this.f13004o == null) {
            ImageReader imageReaderNewInstance = ImageReader.newInstance(this.f12994e.width(), this.f12994e.height(), 35, 2);
            this.f13004o = imageReaderNewInstance;
            imageReaderNewInstance.setOnImageAvailableListener(this.f13014y, this.f12993d);
            this.f13005p = null;
            surface = this.f13004o.getSurface();
            this.f13011v = surface;
        }
        try {
            CameraCaptureSession cameraCaptureSession = this.f13007r;
            if (cameraCaptureSession == null) {
                this.f12991b.createCaptureSession(Arrays.asList(this.f13011v), new C2395s(this), this.f12993d);
            } else if (this.A == 2) {
                cameraCaptureSession.setRepeatingRequest(this.f13006q.build(), this.f13012w, this.f12993d);
            }
            this.A = 1;
        } catch (CameraAccessException e10) {
            AbstractC2409z.Log(6, "Camera2: CameraAccessException " + e10);
        }
    }

    public final void i() {
        synchronized (this.f13008s) {
            CameraCaptureSession cameraCaptureSession = this.f13007r;
            if (cameraCaptureSession != null) {
                try {
                    cameraCaptureSession.abortCaptures();
                } catch (CameraAccessException e10) {
                    AbstractC2409z.Log(6, "Camera2: CameraAccessException " + e10);
                }
                this.f13007r.close();
                this.f13007r = null;
                this.A = 3;
            }
        }
    }

    public static int a(Context context, int i10) {
        try {
            CameraCharacteristics cameraCharacteristics = c(context).getCameraCharacteristics(b(context)[i10]);
            float[] fArr = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
            SizeF sizeF = (SizeF) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
            if (fArr.length > 0) {
                return (int) ((fArr[0] * 36.0f) / sizeF.getWidth());
            }
        } catch (CameraAccessException e10) {
            AbstractC2409z.Log(6, "Camera2: CameraAccessException " + e10);
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0038 A[LOOP:0: B:15:0x0035->B:17:0x0038, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0050 A[RETURN] */
    public static int[] b(Context context, int i10) {
        Size[] outputSizes;
        int[] iArr;
        int i11;
        try {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) c(context).getCameraCharacteristics(b(context)[i10]).get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamConfigurationMap != null) {
                outputSizes = streamConfigurationMap.getOutputSizes(35);
                if (outputSizes == null || outputSizes.length == 0) {
                }
                if (outputSizes != null) {
                    return null;
                }
                iArr = new int[outputSizes.length * 2];
                for (i11 = 0; i11 < outputSizes.length; i11++) {
                    int i12 = i11 * 2;
                    iArr[i12] = outputSizes[i11].getWidth();
                    iArr[i12 + 1] = outputSizes[i11].getHeight();
                }
                return iArr;
            }
            AbstractC2409z.Log(6, "Camera2: configuration map is not available.");
            outputSizes = null;
            if (outputSizes != null) {
                return null;
            }
            iArr = new int[outputSizes.length * 2];
            while (i11 < outputSizes.length) {
                int i13 = i11 * 2;
                iArr[i13] = outputSizes[i11].getWidth();
                iArr[i13 + 1] = outputSizes[i11].getHeight();
            }
            return iArr;
        } catch (CameraAccessException e10) {
            AbstractC2409z.Log(6, "Camera2: CameraAccessException " + e10);
            return null;
        }
    }

    public static boolean d(Context context, int i10) {
        try {
            return ((Integer) c(context).getCameraCharacteristics(b(context)[i10]).get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() > 0;
        } catch (CameraAccessException e10) {
            AbstractC2409z.Log(6, "Camera2: CameraAccessException " + e10);
            return false;
        }
    }

    public static boolean e(Context context, int i10) {
        try {
            return ((Integer) c(context).getCameraCharacteristics(b(context)[i10]).get(CameraCharacteristics.LENS_FACING)).intValue() == 0;
        } catch (CameraAccessException e10) {
            AbstractC2409z.Log(6, "Camera2: CameraAccessException " + e10);
            return false;
        }
    }

    public final Rect c() {
        return this.f12994e;
    }

    private static String[] b(Context context) {
        if (C == null) {
            try {
                C = c(context).getCameraIdList();
            } catch (CameraAccessException e10) {
                AbstractC2409z.Log(6, "Camera2: CameraAccessException " + e10);
                C = new String[0];
            }
        }
        return C;
    }

    private static CameraManager c(Context context) {
        if (B == null) {
            B = (CameraManager) context.getSystemService("camera");
        }
        return B;
    }

    public final void a() {
        if (this.f12991b != null) {
            i();
            b();
            this.f13012w = null;
            this.f13011v = null;
            this.f13010u = null;
            Image image = this.f13005p;
            if (image != null) {
                image.close();
                this.f13005p = null;
            }
            ImageReader imageReader = this.f13004o;
            if (imageReader != null) {
                imageReader.close();
                this.f13004o = null;
            }
        }
        this.f12992c.quit();
        try {
            this.f12992c.join(4000L);
            this.f12992c = null;
            this.f12993d = null;
        } catch (InterruptedException e10) {
            this.f12992c.interrupt();
            AbstractC2409z.Log(6, ZHgPsTG.dtlPyPXMmww + e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CameraDevice cameraDevice) {
        synchronized (this.f13008s) {
            this.f13007r = null;
        }
        cameraDevice.close();
        this.f12991b = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Object obj) {
        if (obj != "Focus") {
            if (obj == "Cancel focus") {
                synchronized (this.f13008s) {
                    if (this.f13007r != null) {
                        g();
                    }
                }
                return;
            }
            return;
        }
        this.f13002m = false;
        synchronized (this.f13008s) {
            if (this.f13007r != null) {
                try {
                    this.f13006q.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                    this.f13006q.setTag("Regular");
                    this.f13007r.setRepeatingRequest(this.f13006q.build(), this.f13012w, this.f12993d);
                } catch (CameraAccessException e10) {
                    AbstractC2409z.Log(6, "Camera2: CameraAccessException " + e10);
                }
            }
        }
    }

    public final boolean a(float f10, float f11) {
        if (this.f12997h <= 0) {
            return false;
        }
        if (this.f13002m) {
            AbstractC2409z.Log(5, "Camera2: Setting manual focus point already started.");
            return false;
        }
        this.f12998i = f10;
        this.f12999j = f11;
        synchronized (this.f13008s) {
            if (this.f13007r != null && this.A != 2) {
                f();
            }
        }
        return true;
    }

    public final boolean a(Context context, int i10, int i11, int i12, int i13, int i14, Surface surface) {
        int iIntValue = i13;
        try {
            CameraCharacteristics cameraCharacteristics = B.getCameraCharacteristics(b(context)[i10]);
            if (((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue() == 2) {
                AbstractC2409z.Log(5, "Camera2: only LEGACY hardware level is supported.");
            }
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            Size[] sizeArr = null;
            if (streamConfigurationMap == null) {
                AbstractC2409z.Log(6, "Camera2: configuration map is not available.");
            } else {
                Size[] outputSizes = streamConfigurationMap.getOutputSizes(35);
                if (outputSizes != null && outputSizes.length != 0) {
                    sizeArr = outputSizes;
                }
            }
            if (sizeArr == null || sizeArr.length == 0) {
                return false;
            }
            double d10 = i11;
            double d11 = i12;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            double d12 = Double.MAX_VALUE;
            while (i15 < sizeArr.length) {
                int width = sizeArr[i15].getWidth();
                int height = sizeArr[i15].getHeight();
                CameraCharacteristics cameraCharacteristics2 = cameraCharacteristics;
                double d13 = d10;
                double dAbs = Math.abs(Math.log(d11 / ((double) height))) + Math.abs(Math.log(d10 / ((double) width)));
                if (dAbs < d12) {
                    i16 = height;
                    d12 = dAbs;
                    i17 = width;
                }
                i15++;
                cameraCharacteristics = cameraCharacteristics2;
                d10 = d13;
            }
            CameraCharacteristics cameraCharacteristics3 = cameraCharacteristics;
            this.f12994e = new Rect(0, 0, i17, i16);
            Range[] rangeArr = (Range[]) cameraCharacteristics3.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            if (rangeArr == null || rangeArr.length == 0) {
                AbstractC2409z.Log(6, "Camera2: target FPS ranges are not avialable.");
                return false;
            }
            int i18 = -1;
            int i19 = 0;
            double d14 = Double.MAX_VALUE;
            while (true) {
                if (i19 >= rangeArr.length) {
                    iIntValue = ((Integer) (iIntValue > ((Integer) rangeArr[i18].getUpper()).intValue() ? rangeArr[i18].getUpper() : rangeArr[i18].getLower())).intValue();
                    break;
                }
                int iIntValue2 = ((Integer) rangeArr[i19].getLower()).intValue();
                int iIntValue3 = ((Integer) rangeArr[i19].getUpper()).intValue();
                float f10 = iIntValue;
                if (f10 + 0.1f > iIntValue2 && f10 - 0.1f < iIntValue3) {
                    break;
                }
                double dMin = Math.min(Math.abs(iIntValue - iIntValue2), Math.abs(iIntValue - iIntValue3));
                if (dMin < d14) {
                    i18 = i19;
                    d14 = dMin;
                }
                i19++;
            }
            this.f13003n = new Range(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue));
            try {
                Semaphore semaphore = D;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (!semaphore.tryAcquire(4L, timeUnit)) {
                    AbstractC2409z.Log(5, "Camera2: Timeout waiting to lock camera for opening.");
                    return false;
                }
                try {
                    B.openCamera(b(context)[i10], this.f13013x, this.f12993d);
                    try {
                        if (!D.tryAcquire(4L, timeUnit)) {
                            AbstractC2409z.Log(5, "Camera2: Timeout waiting to open camera.");
                            return false;
                        }
                        D.release();
                        this.f13009t = i14;
                        this.f13011v = surface;
                        int iIntValue4 = ((Integer) cameraCharacteristics3.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue();
                        this.f12997h = iIntValue4;
                        if (iIntValue4 > 0) {
                            Rect rect = (Rect) cameraCharacteristics3.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                            this.f12995f = rect;
                            float fWidth = rect.width() / this.f12995f.height();
                            float fWidth2 = this.f12994e.width() / this.f12994e.height();
                            if (fWidth2 > fWidth) {
                                this.f13000k = 0;
                                this.f13001l = (int) ((this.f12995f.height() - (this.f12995f.width() / fWidth2)) / 2.0f);
                            } else {
                                this.f13001l = 0;
                                this.f13000k = (int) ((this.f12995f.width() - (this.f12995f.height() * fWidth2)) / 2.0f);
                            }
                            this.f12996g = Math.min(this.f12995f.width(), this.f12995f.height()) / 20;
                        }
                        return this.f12991b != null;
                    } catch (InterruptedException e10) {
                        AbstractC2409z.Log(6, "Camera2: Interrupted while waiting to open camera " + e10);
                    }
                } catch (CameraAccessException e11) {
                    AbstractC2409z.Log(6, "Camera2: CameraAccessException " + e11);
                    D.release();
                    return false;
                }
            } catch (InterruptedException e12) {
                AbstractC2409z.Log(6, "Camera2: Interrupted while trying to lock camera for opening " + e12);
                return false;
            }
        } catch (CameraAccessException e13) {
            AbstractC2409z.Log(6, "Camera2: CameraAccessException " + e13);
            return false;
        }
    }
}
