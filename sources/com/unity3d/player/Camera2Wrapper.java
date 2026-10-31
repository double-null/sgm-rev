package com.unity3d.player;

import android.content.Context;
import android.graphics.Rect;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class Camera2Wrapper implements j6.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f12716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C2403w f12717b = null;

    public Camera2Wrapper(Context context) {
        this.f12716a = context;
        initCamera2Jni();
    }

    private final native void deinitCamera2Jni();

    private final native void initCamera2Jni();

    private final native void nativeFrameReady(Object obj, Object obj2, Object obj3, int i10, int i11, int i12);

    private final native void nativeSurfaceTextureReady(Object obj);

    public final void a() {
        deinitCamera2Jni();
        closeCamera2();
    }

    protected void closeCamera2() {
        C2403w c2403w = this.f12717b;
        if (c2403w != null) {
            c2403w.a();
        }
        this.f12717b = null;
    }

    protected int getCamera2Count() {
        return C2403w.a(this.f12716a);
    }

    protected int getCamera2FocalLengthEquivalent(int i10) {
        return C2403w.a(this.f12716a, i10);
    }

    protected int[] getCamera2Resolutions(int i10) {
        return C2403w.b(this.f12716a, i10);
    }

    protected int getCamera2SensorOrientation(int i10) {
        return C2403w.c(this.f12716a, i10);
    }

    protected Rect getFrameSizeCamera2() {
        C2403w c2403w = this.f12717b;
        return c2403w != null ? c2403w.c() : new Rect();
    }

    protected boolean initializeCamera2(int i10, int i11, int i12, int i13, int i14, Surface surface) {
        if (this.f12717b != null || UnityPlayer.currentActivity == null) {
            return false;
        }
        C2403w c2403w = new C2403w(this);
        this.f12717b = c2403w;
        return c2403w.a(this.f12716a, i10, i11, i12, i13, i14, surface);
    }

    protected boolean isCamera2AutoFocusPointSupported(int i10) {
        return C2403w.d(this.f12716a, i10);
    }

    protected boolean isCamera2FrontFacing(int i10) {
        return C2403w.e(this.f12716a, i10);
    }

    protected void pauseCamera2() {
        C2403w c2403w = this.f12717b;
        if (c2403w != null) {
            c2403w.d();
        }
    }

    protected boolean setAutoFocusPoint(float f10, float f11) {
        C2403w c2403w = this.f12717b;
        if (c2403w != null) {
            return c2403w.a(f10, f11);
        }
        return false;
    }

    protected void startCamera2() {
        C2403w c2403w = this.f12717b;
        if (c2403w != null) {
            c2403w.h();
        }
    }

    protected void stopCamera2() {
        C2403w c2403w = this.f12717b;
        if (c2403w != null) {
            c2403w.i();
        }
    }

    public final void a(Object obj) {
        nativeSurfaceTextureReady(obj);
    }

    public final void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10, int i11, int i12) {
        nativeFrameReady(byteBuffer, byteBuffer2, byteBuffer3, i10, i11, i12);
    }
}
