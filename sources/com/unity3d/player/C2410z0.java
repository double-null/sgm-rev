package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C2410z0 extends V0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f13023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ UnityPlayer f13024c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2410z0(UnityPlayer unityPlayer, boolean z10) {
        super(unityPlayer);
        this.f13024c = unityPlayer;
        this.f13023b = z10;
    }

    @Override // com.unity3d.player.V0
    public final void a() {
        this.f13024c.nativeSetKeyboardIsVisible(this.f13023b);
    }
}
