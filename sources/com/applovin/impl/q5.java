package com.applovin.impl;

/* JADX INFO: loaded from: classes.dex */
public class q5 extends k5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a f7998g;

    public interface a {
        void a(v.a aVar);
    }

    public q5(com.applovin.impl.sdk.l lVar, a aVar) {
        super("TaskCollectAdvertisingId", lVar, true);
        this.f7998g = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f7998g.a(this.f6990a.B().f());
    }
}
