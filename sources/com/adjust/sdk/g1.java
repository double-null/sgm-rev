package com.adjust.sdk;

/* JADX INFO: loaded from: classes.dex */
class g1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdjustInstance.k f5752b;

    public g1(AdjustInstance.k kVar, String str) {
        this.f5752b = kVar;
        this.f5751a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5752b.f5649b.onAdidRead(this.f5751a);
    }
}
