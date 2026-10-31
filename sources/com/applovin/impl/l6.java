package com.applovin.impl;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class l6 extends k5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final WeakReference f7050g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f7051h;

    protected l6(u4 u4Var, Object obj, String str, com.applovin.impl.sdk.l lVar) {
        super(str, lVar);
        this.f7050g = new WeakReference(u4Var);
        this.f7051h = obj;
    }

    public static void a(long j10, u4 u4Var, Object obj, String str, com.applovin.impl.sdk.l lVar) {
        if (j10 <= 0) {
            return;
        }
        lVar.s0().a(new l6(u4Var, obj, str, lVar), f6.b.TIMEOUT, j10);
    }

    @Override // java.lang.Runnable
    public void run() {
        u4 u4Var = (u4) this.f7050g.get();
        if (u4Var == null || u4Var.d()) {
            return;
        }
        this.f6990a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f6990a.Q().d(this.f6991b, "Attempting to timeout pending task " + u4Var.c() + " with " + this.f7051h);
        }
        u4Var.c(this.f7051h);
    }
}
