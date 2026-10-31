package com.unity3d.player;

/* JADX INFO: loaded from: classes4.dex */
final class T implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ U f12812a;

    T(U u10) {
        this.f12812a = u10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        S s10 = this.f12812a.f12817d;
        s10.a(s10.b(), true);
    }
}
