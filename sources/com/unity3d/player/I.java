package com.unity3d.player;

import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
final class I implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IPermissionRequestCallbacks f12738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f12739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f12740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f12741d;

    I(IPermissionRequestCallbacks iPermissionRequestCallbacks, String str, int i10, boolean z10) {
        this.f12738a = iPermissionRequestCallbacks;
        this.f12739b = str;
        this.f12740c = i10;
        this.f12741d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f12740c;
        if (i10 != -1) {
            if (i10 == 0) {
                this.f12738a.onPermissionGranted(this.f12739b);
            }
        } else if (Build.VERSION.SDK_INT >= 30 || this.f12741d) {
            this.f12738a.onPermissionDenied(this.f12739b);
        } else {
            this.f12738a.onPermissionDeniedAndDontAskAgain(this.f12739b);
        }
    }
}
