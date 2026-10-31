package u8;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.WindowManager;
import io.bidmachine.media3.common.util.GlUtil;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: compiled from: SphericalGLSurfaceView.java */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends GLSurfaceView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f26603m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList<b> f26604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SensorManager f26605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Sensor f26606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f26607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f26608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final m f26609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i f26610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private SurfaceTexture f26611h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Surface f26612i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f26613j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f26614k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f26615l;

    /* JADX INFO: compiled from: SphericalGLSurfaceView.java */
    final class a implements GLSurfaceView.Renderer, m.a, d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i f26616a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float[] f26619d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float[] f26620e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float[] f26621f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f26622g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f26623h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float[] f26617b = new float[16];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float[] f26618c = new float[16];

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final float[] f26624i = new float[16];

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final float[] f26625j = new float[16];

        public a(i iVar) {
            float[] fArr = new float[16];
            this.f26619d = fArr;
            float[] fArr2 = new float[16];
            this.f26620e = fArr2;
            float[] fArr3 = new float[16];
            this.f26621f = fArr3;
            this.f26616a = iVar;
            GlUtil.k(fArr);
            GlUtil.k(fArr2);
            GlUtil.k(fArr3);
            this.f26623h = 3.1415927f;
        }

        private float c(float f10) {
            if (f10 > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f10))) * 2.0d);
            }
            return 90.0f;
        }

        private void d() {
            Matrix.setRotateM(this.f26620e, 0, -this.f26622g, (float) Math.cos(this.f26623h), (float) Math.sin(this.f26623h), 0.0f);
        }

        @Override // u8.d.a
        public synchronized void a(float[] fArr, float f10) {
            float[] fArr2 = this.f26619d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.f26623h = -f10;
            d();
        }

        @Override // u8.m.a
        public synchronized void b(PointF pointF) {
            this.f26622g = pointF.y;
            d();
            Matrix.setRotateM(this.f26621f, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f26625j, 0, this.f26619d, 0, this.f26621f, 0);
                Matrix.multiplyMM(this.f26624i, 0, this.f26620e, 0, this.f26625j, 0);
            }
            Matrix.multiplyMM(this.f26618c, 0, this.f26617b, 0, this.f26624i, 0);
            this.f26616a.d(this.f26618c, false);
        }

        @Override // u8.m.a
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return l.this.performClick();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
            float f10 = i10 / i11;
            Matrix.perspectiveM(this.f26617b, 0, c(f10), f10, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            l.this.g(this.f26616a.f());
        }
    }

    /* JADX INFO: compiled from: SphericalGLSurfaceView.java */
    public interface b {
        void B(Surface surface);

        void D(Surface surface);
    }

    public l(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        Surface surface = this.f26612i;
        if (surface != null) {
            Iterator<b> it = this.f26604a.iterator();
            while (it.hasNext()) {
                it.next().B(surface);
            }
        }
        h(this.f26611h, surface);
        this.f26611h = null;
        this.f26612i = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.f26611h;
        Surface surface = this.f26612i;
        Surface surface2 = new Surface(surfaceTexture);
        this.f26611h = surfaceTexture;
        this.f26612i = surface2;
        Iterator<b> it = this.f26604a.iterator();
        while (it.hasNext()) {
            it.next().D(surface2);
        }
        h(surfaceTexture2, surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(final SurfaceTexture surfaceTexture) {
        this.f26608e.post(new Runnable() { // from class: u8.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f26601a.f(surfaceTexture);
            }
        });
    }

    private static void h(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    private void j() {
        boolean z10 = this.f26613j && this.f26614k;
        Sensor sensor = this.f26606c;
        if (sensor == null || z10 == this.f26615l) {
            return;
        }
        if (z10) {
            this.f26605b.registerListener(this.f26607d, sensor, 0);
        } else {
            this.f26605b.unregisterListener(this.f26607d);
        }
        this.f26615l = z10;
    }

    public void d(b bVar) {
        this.f26604a.add(bVar);
    }

    public u8.a getCameraMotionListener() {
        return this.f26610g;
    }

    public t8.h getVideoFrameMetadataListener() {
        return this.f26610g;
    }

    public Surface getVideoSurface() {
        return this.f26612i;
    }

    public void i(b bVar) {
        this.f26604a.remove(bVar);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26608e.post(new Runnable() { // from class: u8.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f26600a.e();
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f26614k = false;
        j();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f26614k = true;
        j();
    }

    public void setDefaultStereoMode(int i10) {
        this.f26610g.h(i10);
    }

    public void setUseSensorRotation(boolean z10) {
        this.f26613j = z10;
        j();
    }

    public l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26604a = new CopyOnWriteArrayList<>();
        this.f26608e = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) x7.a.e(context.getSystemService("sensor"));
        this.f26605b = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.f26606c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        i iVar = new i();
        this.f26610g = iVar;
        a aVar = new a(iVar);
        m mVar = new m(context, aVar, 25.0f);
        this.f26609f = mVar;
        this.f26607d = new d(((WindowManager) x7.a.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), mVar, aVar);
        this.f26613j = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(mVar);
    }
}
