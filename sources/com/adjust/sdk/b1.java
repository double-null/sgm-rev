package com.adjust.sdk;

/* JADX INFO: loaded from: classes.dex */
class b1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler.l f5724a;

    public b1(ActivityHandler.l lVar) {
        this.f5724a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OnAdidReadListener onAdidReadListener = this.f5724a.f5593a.getOnAdidReadListener();
        if (onAdidReadListener != null) {
            onAdidReadListener.onAdidRead(null);
        }
        this.f5724a.f5593a.setOnAdidReadListener(null);
    }
}
