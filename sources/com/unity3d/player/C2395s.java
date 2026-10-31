package com.unity3d.player;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;

/* JADX INFO: renamed from: com.unity3d.player.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C2395s extends CameraCaptureSession.StateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2403w f12975a;

    C2395s(C2403w c2403w) {
        this.f12975a = c2403w;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        AbstractC2409z.Log(6, "Camera2: CaptureSession configuration failed.");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        String str;
        C2403w c2403w = this.f12975a;
        if (c2403w.f12991b == null) {
            return;
        }
        synchronized (c2403w.f13008s) {
            C2403w c2403w2 = this.f12975a;
            c2403w2.f13007r = cameraCaptureSession;
            try {
                c2403w2.f13006q = c2403w2.f12991b.createCaptureRequest(1);
                C2403w c2403w3 = this.f12975a;
                c2403w3.f13006q.addTarget(c2403w3.f13011v);
                C2403w c2403w4 = this.f12975a;
                c2403w4.f13006q.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, c2403w4.f13003n);
                this.f12975a.g();
            } catch (CameraAccessException e10) {
                str = "Camera2: CameraAccessException " + e10;
                AbstractC2409z.Log(6, str);
            } catch (IllegalStateException e11) {
                str = "Camera2: IllegalStateException " + e11;
                AbstractC2409z.Log(6, str);
            }
        }
    }
}
