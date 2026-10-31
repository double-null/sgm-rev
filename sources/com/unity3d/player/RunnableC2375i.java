package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class RunnableC2375i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IAssetPackManagerMobileDataConfirmationCallback f12910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f12911b;

    RunnableC2375i(IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback, boolean z10) {
        this.f12910a = iAssetPackManagerMobileDataConfirmationCallback;
        this.f12911b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12910a.onMobileDataConfirmationResult(this.f12911b);
    }
}
