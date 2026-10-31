package com.unity3d.player;

import android.view.SurfaceHolder;

/* JADX INFO: renamed from: com.unity3d.player.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class SurfaceHolderCallbackC2374h0 implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2376i0 f12909a;

    SurfaceHolderCallbackC2374h0(C2376i0 c2376i0) {
        this.f12909a = c2376i0;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        this.f12909a.f12913b.updateGLDisplay(0, surfaceHolder.getSurface());
        this.f12909a.f12913b.sendSurfaceChangedEvent();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f12909a.f12913b.updateGLDisplay(0, surfaceHolder.getSurface());
        C2376i0 c2376i0 = this.f12909a;
        K k10 = c2376i0.f12914c;
        UnityPlayer unityPlayer = c2376i0.f12913b;
        J j10 = k10.f12745b;
        if (j10 == null || j10.getParent() != null) {
            return;
        }
        unityPlayer.addView(k10.f12745b);
        unityPlayer.bringChildToFront(k10.f12745b);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C2376i0 c2376i0 = this.f12909a;
        K k10 = c2376i0.f12914c;
        C2369f c2369f = c2376i0.f12912a;
        k10.getClass();
        if (PlatformSupport.NOUGAT_SUPPORT && k10.f12744a != null) {
            if (k10.f12745b == null) {
                k10.f12745b = new J(k10.f12744a);
            }
            k10.f12745b.a(c2369f);
        }
        this.f12909a.f12913b.updateGLDisplay(0, null);
    }
}
