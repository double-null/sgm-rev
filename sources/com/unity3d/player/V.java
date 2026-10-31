package com.unity3d.player;

/* JADX INFO: loaded from: classes4.dex */
final class V implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ X f12828a;

    V(X x10) {
        this.f12828a = x10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12828a.f12797c.requestFocus();
        this.f12828a.f();
    }
}
