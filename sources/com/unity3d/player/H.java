package com.unity3d.player;

/* JADX INFO: loaded from: classes4.dex */
final class H implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String[] f12728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ PermissionFragment f12729b;

    H(PermissionFragment permissionFragment, String[] strArr) {
        this.f12729b = permissionFragment;
        this.f12728a = strArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12729b.reportAllDenied(this.f12728a);
    }
}
