package com.unity3d.player;

import android.graphics.Rect;

/* JADX INFO: renamed from: com.unity3d.player.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C2408y0 extends V0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Rect f13020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ UnityPlayer f13021c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2408y0(UnityPlayer unityPlayer, Rect rect) {
        super(unityPlayer);
        this.f13021c = unityPlayer;
        this.f13020b = rect;
    }

    @Override // com.unity3d.player.V0
    public final void a() {
        UnityPlayer unityPlayer = this.f13021c;
        Rect rect = this.f13020b;
        unityPlayer.nativeSetInputArea(rect.left, rect.top, rect.right, rect.bottom);
    }
}
