package com.applovin.impl.mediation;

import com.applovin.impl.e3;
import com.applovin.impl.v2;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: classes.dex */
public class b implements a.InterfaceC0111a, c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f7345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f7346b;

    public b(com.applovin.impl.sdk.l lVar) {
        this.f7345a = new a(lVar);
        this.f7346b = new c(lVar, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void c(e3 e3Var) {
        h hVarB;
        if (e3Var == null || (hVarB = e3Var.B()) == null || !e3Var.x().compareAndSet(false, true)) {
            return;
        }
        e3Var.w().set(true);
        v2.e(hVarB.c(), e3Var);
    }

    @Override // com.applovin.impl.mediation.a.InterfaceC0111a
    public void b(final e3 e3Var) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f7609a.c(e3Var);
            }
        }, e3Var.p0());
    }

    public void e(e3 e3Var) {
        long jQ0 = e3Var.q0();
        if (jQ0 >= 0) {
            this.f7346b.a(e3Var, jQ0);
        }
        if (e3Var.B0() || e3Var.C0()) {
            this.f7345a.a(e3Var, this);
        }
    }

    public void a() {
        this.f7346b.a();
        this.f7345a.a();
    }

    @Override // com.applovin.impl.mediation.c.a
    public void a(e3 e3Var) {
        c(e3Var);
    }
}
