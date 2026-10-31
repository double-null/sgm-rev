package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C2402v0 extends V0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f12986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f12987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f12988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ UnityPlayer f12989e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2402v0(UnityPlayer unityPlayer, boolean z10, String str, int i10) {
        super(unityPlayer);
        this.f12989e = unityPlayer;
        this.f12986b = z10;
        this.f12987c = str;
        this.f12988d = i10;
    }

    @Override // com.unity3d.player.V0
    public final void a() {
        if (this.f12986b) {
            this.f12989e.nativeSoftInputCanceled();
        } else {
            String str = this.f12987c;
            if (str != null) {
                this.f12989e.nativeSetInputString(str);
            }
        }
        if (this.f12988d == 1) {
            this.f12989e.nativeSoftInputClosed();
        }
    }
}
