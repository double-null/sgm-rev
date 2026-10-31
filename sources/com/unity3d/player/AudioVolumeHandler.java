package com.unity3d.player;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class AudioVolumeHandler implements InterfaceC2389p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C2391q f12709a;

    AudioVolumeHandler(Context context) {
        C2391q c2391q = new C2391q(context);
        this.f12709a = c2391q;
        c2391q.a(this);
    }

    public final void a() {
        this.f12709a.a();
        this.f12709a = null;
    }

    @Override // com.unity3d.player.InterfaceC2389p
    public final native void onAudioVolumeChanged(int i10);
}
