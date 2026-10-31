package com.unity3d.player;

import android.media.Image;
import android.media.ImageReader;

/* JADX INFO: renamed from: com.unity3d.player.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C2399u implements ImageReader.OnImageAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2403w f12981a;

    C2399u(C2403w c2403w) {
        this.f12981a = c2403w;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        if (C2403w.D.tryAcquire()) {
            Image imageAcquireNextImage = imageReader.acquireNextImage();
            if (imageAcquireNextImage != null) {
                Image.Plane[] planes = imageAcquireNextImage.getPlanes();
                if (imageAcquireNextImage.getFormat() == 35 && planes != null && planes.length == 3) {
                    ((Camera2Wrapper) this.f12981a.f12990a).a(planes[0].getBuffer(), planes[1].getBuffer(), planes[2].getBuffer(), planes[0].getRowStride(), planes[1].getRowStride(), planes[1].getPixelStride());
                } else {
                    AbstractC2409z.Log(6, "Camera2: Wrong image format.");
                }
                Image image = this.f12981a.f13005p;
                if (image != null) {
                    image.close();
                }
                this.f12981a.f13005p = imageAcquireNextImage;
            }
            C2403w.D.release();
        }
    }
}
