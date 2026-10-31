package com.adjust.sdk;

/* JADX INFO: loaded from: classes.dex */
class h1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdjustAttribution f5756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdjustInstance.l f5757b;

    public h1(AdjustInstance.l lVar, AdjustAttribution adjustAttribution) {
        this.f5757b = lVar;
        this.f5756a = adjustAttribution;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5757b.f5653b.onAttributionRead(this.f5756a);
    }
}
