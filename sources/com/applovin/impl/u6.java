package com.applovin.impl;

/* JADX INFO: loaded from: classes.dex */
public class u6 extends k5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f8890g;

    public u6(com.applovin.impl.sdk.l lVar, String str, Runnable runnable) {
        this(lVar, false, str, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f8890g.run();
    }

    public u6(com.applovin.impl.sdk.l lVar, boolean z10, String str, Runnable runnable) {
        super("TaskRunnable:" + str, lVar, z10);
        this.f8890g = runnable;
    }
}
