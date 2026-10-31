package com.google.androidgamesdk;

import android.view.Window;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f11429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ SwappyDisplayManager f11430b;

    c(SwappyDisplayManager swappyDisplayManager, int i10) {
        this.f11430b = swappyDisplayManager;
        this.f11429a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Window window = this.f11430b.mActivity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.preferredDisplayModeId = this.f11429a;
        window.setAttributes(attributes);
    }
}
