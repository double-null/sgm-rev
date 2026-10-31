package com.unity3d.player;

/* JADX INFO: loaded from: classes4.dex */
final class G0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f12726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ UnityPlayer f12727b;

    G0(UnityPlayer unityPlayer, int i10) {
        this.f12727b = unityPlayer;
        this.f12726a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            UnityPlayer unityPlayer = this.f12727b;
            AbstractC2363c.a(unityPlayer.mActivity, unityPlayer, this.f12726a);
        } catch (Exception e10) {
            AbstractC2409z.Log(6, "Exception when opening Activity Indicator " + e10);
        }
    }
}
