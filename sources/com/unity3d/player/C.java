package com.unity3d.player;

/* JADX INFO: loaded from: classes4.dex */
class C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Runnable f12713b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected j6.c f12712a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f12714c = true;

    protected C(Runnable runnable) {
        this.f12713b = runnable;
    }

    protected void registerOnBackPressedCallback() {
        if (this.f12712a != null) {
            return;
        }
        this.f12712a = new B(this.f12713b);
    }

    protected void unregisterOnBackPressedCallback() {
        this.f12712a = null;
    }
}
