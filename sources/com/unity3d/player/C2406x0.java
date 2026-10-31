package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C2406x0 extends V0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f13017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f13018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ UnityPlayer f13019d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2406x0(UnityPlayer unityPlayer, int i10, int i11) {
        super(unityPlayer);
        this.f13019d = unityPlayer;
        this.f13017b = i10;
        this.f13018c = i11;
    }

    @Override // com.unity3d.player.V0
    public final void a() {
        this.f13019d.nativeSetInputSelection(this.f13017b, this.f13018c);
    }
}
