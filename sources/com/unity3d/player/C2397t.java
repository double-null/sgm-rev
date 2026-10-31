package com.unity3d.player;

import android.hardware.camera2.CameraDevice;

/* JADX INFO: renamed from: com.unity3d.player.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C2397t extends CameraDevice.StateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2403w f12978a;

    C2397t(C2403w c2403w) {
        this.f12978a = c2403w;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        C2403w.D.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        AbstractC2409z.Log(5, "Camera2: CameraDevice disconnected.");
        this.f12978a.a(cameraDevice);
        C2403w.D.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i10) {
        AbstractC2409z.Log(6, "Camera2: Error opeining CameraDevice " + i10);
        this.f12978a.a(cameraDevice);
        C2403w.D.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        this.f12978a.f12991b = cameraDevice;
        C2403w.D.release();
    }
}
