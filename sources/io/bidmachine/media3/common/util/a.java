package io.bidmachine.media3.common.util;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import x7.l0;

/* JADX INFO: compiled from: EGLSurfaceTexture.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f17997g = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f17998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f17999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private EGLDisplay f18000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private EGLContext f18001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private EGLSurface f18002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SurfaceTexture f18003f;

    /* JADX INFO: renamed from: io.bidmachine.media3.common.util.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: EGLSurfaceTexture.java */
    public interface InterfaceC0318a {
    }

    public a(Handler handler) {
        this(handler, null);
    }

    private static EGLConfig a(EGLDisplay eGLDisplay) throws GlUtil.GlException {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f17997g, 0, eGLConfigArr, 0, 1, iArr, 0);
        GlUtil.c(zEglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null, l0.G("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        return eGLConfigArr[0];
    }

    private static EGLContext c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) throws GlUtil.GlException {
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        GlUtil.c(eGLContextEglCreateContext != null, "eglCreateContext failed");
        return eGLContextEglCreateContext;
    }

    private static EGLSurface d(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i10) throws GlUtil.GlException {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (i10 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            GlUtil.c(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        GlUtil.c(EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext), "eglMakeCurrent failed");
        return eGLSurfaceEglCreatePbufferSurface;
    }

    private static void f(int[] iArr) throws GlUtil.GlException {
        GLES20.glGenTextures(1, iArr, 0);
        GlUtil.b();
    }

    private static EGLDisplay g() throws GlUtil.GlException {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        GlUtil.c(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        GlUtil.c(EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        return eGLDisplayEglGetDisplay;
    }

    public SurfaceTexture h() {
        return (SurfaceTexture) x7.a.e(this.f18003f);
    }

    public void i(int i10) throws GlUtil.GlException {
        EGLDisplay eGLDisplayG = g();
        this.f18000c = eGLDisplayG;
        EGLConfig eGLConfigA = a(eGLDisplayG);
        EGLContext eGLContextC = c(this.f18000c, eGLConfigA, i10);
        this.f18001d = eGLContextC;
        this.f18002e = d(this.f18000c, eGLConfigA, eGLContextC, i10);
        f(this.f17999b);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f17999b[0]);
        this.f18003f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j() {
        this.f17998a.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f18003f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f17999b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f18000c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f18000c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f18002e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f18000c, this.f18002e);
            }
            EGLContext eGLContext = this.f18001d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f18000c, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.f18000c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f18000c);
            }
            this.f18000c = null;
            this.f18001d = null;
            this.f18002e = null;
            this.f18003f = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f17998a.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        e();
        SurfaceTexture surfaceTexture = this.f18003f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public a(Handler handler, InterfaceC0318a interfaceC0318a) {
        this.f17998a = handler;
        this.f17999b = new int[1];
    }

    private void e() {
    }
}
