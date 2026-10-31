package com.unity3d.player;

import android.graphics.SurfaceTexture;

/* JADX INFO: renamed from: com.unity3d.player.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C2401v implements SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2403w f12985a;

    C2401v(C2403w c2403w) {
        this.f12985a = c2403w;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        ((Camera2Wrapper) this.f12985a.f12990a).a(surfaceTexture);
    }
}
