package com.adjust.sdk;

/* JADX INFO: loaded from: classes.dex */
class c1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler.m f5729a;

    public c1(ActivityHandler.m mVar) {
        this.f5729a = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OnAttributionReadListener onAttributionReadListener = this.f5729a.f5599a.getOnAttributionReadListener();
        if (onAttributionReadListener != null) {
            onAttributionReadListener.onAttributionRead(null);
        }
        this.f5729a.f5599a.setOnAttributionReadListener(null);
    }
}
