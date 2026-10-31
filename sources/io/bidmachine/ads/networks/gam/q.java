package io.bidmachine.ads.networks.gam;

import android.app.Activity;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.RendererConfiguration;

/* JADX INFO: compiled from: GAMRewarded.java */
/* JADX INFO: loaded from: classes4.dex */
class q extends vb.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f16582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f16583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private m0 f16584c;

    /* JADX INFO: compiled from: GAMRewarded.java */
    private static final class b extends c<m0> implements n0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final q f16585b;

        @Override // io.bidmachine.ads.networks.gam.d0
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void d(m0 m0Var) {
            this.f16585b.f16584c = m0Var;
            super.g(m0Var);
        }

        private b(vb.i iVar, q qVar) {
            super(iVar);
            this.f16585b = qVar;
        }
    }

    protected q(o oVar) {
        this.f16582a = oVar;
    }

    @Override // vb.b
    public void d() {
        this.f16583b = null;
        m0 m0Var = this.f16584c;
        if (m0Var != null) {
            m0Var.h();
            this.f16584c = null;
        }
    }

    @Override // vb.b
    public void g() {
        super.g();
        m0 m0Var = this.f16584c;
        if (m0Var != null) {
            m0Var.D();
        }
    }

    @Override // vb.h
    public void k(ContextProvider contextProvider, vb.i iVar, RendererConfiguration rendererConfiguration) throws Throwable {
        Activity activity = contextProvider.getActivity();
        if (activity == null) {
            iVar.b(oc.a.i("Activity is null"));
            return;
        }
        m0 m0Var = this.f16584c;
        if (m0Var == null) {
            iVar.b(oc.a.i("InternalGAM rewarded object is null"));
            return;
        }
        if (m0Var.q()) {
            iVar.b(oc.a.i("InternalGAM rewarded object is expired"));
            return;
        }
        if (!this.f16584c.r()) {
            iVar.b(oc.a.i("InternalGAM rewarded object not loaded"));
            return;
        }
        b bVar = this.f16583b;
        if (bVar == null) {
            iVar.b(oc.a.i("InternalGAM rewarded listener is null"));
        } else {
            this.f16584c.J(activity, bVar);
        }
    }

    @Override // vb.b
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void b(ContextProvider contextProvider, vb.i iVar, vb.j jVar, vb.k kVar, NetworkAdUnit networkAdUnit) throws Throwable {
        if (new p(kVar).a(iVar)) {
            b bVar = new b(iVar, this);
            this.f16583b = bVar;
            this.f16582a.o(networkAdUnit, bVar);
        }
    }
}
