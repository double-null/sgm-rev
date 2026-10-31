package io.bidmachine.ads.networks.gam;

import android.app.Activity;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.RendererConfiguration;

/* JADX INFO: compiled from: GAMInterstitial.java */
/* JADX INFO: loaded from: classes4.dex */
class d extends vb.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f16535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f16536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private k0 f16537c;

    /* JADX INFO: compiled from: GAMInterstitial.java */
    private static final class b extends c<k0> implements l0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f16538b;

        @Override // io.bidmachine.ads.networks.gam.d0
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void d(k0 k0Var) {
            this.f16538b.f16537c = k0Var;
            super.g(k0Var);
        }

        private b(vb.i iVar, d dVar) {
            super(iVar);
            this.f16538b = dVar;
        }
    }

    protected d(o oVar) {
        this.f16535a = oVar;
    }

    @Override // vb.b
    public void d() {
        this.f16536b = null;
        k0 k0Var = this.f16537c;
        if (k0Var != null) {
            k0Var.h();
            this.f16537c = null;
        }
    }

    @Override // vb.b
    public void g() {
        super.g();
        k0 k0Var = this.f16537c;
        if (k0Var != null) {
            k0Var.D();
        }
    }

    @Override // vb.h
    public void k(ContextProvider contextProvider, vb.i iVar, RendererConfiguration rendererConfiguration) throws Throwable {
        Activity activity = contextProvider.getActivity();
        if (activity == null) {
            iVar.b(oc.a.i("Activity is null"));
            return;
        }
        k0 k0Var = this.f16537c;
        if (k0Var == null) {
            iVar.b(oc.a.i("InternalGAM interstitial object is null"));
            return;
        }
        if (k0Var.q()) {
            iVar.b(oc.a.i("InternalGAM interstitial object is expired"));
            return;
        }
        if (!this.f16537c.r()) {
            iVar.b(oc.a.i("InternalGAM interstitial object not loaded"));
            return;
        }
        b bVar = this.f16536b;
        if (bVar == null) {
            iVar.b(oc.a.i("InternalGAM interstitial listener is null"));
        } else {
            this.f16537c.J(activity, bVar);
        }
    }

    @Override // vb.b
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void b(ContextProvider contextProvider, vb.i iVar, vb.j jVar, vb.k kVar, NetworkAdUnit networkAdUnit) throws Throwable {
        if (new p(kVar).a(iVar)) {
            b bVar = new b(iVar, this);
            this.f16536b = bVar;
            this.f16535a.n(networkAdUnit, bVar);
        }
    }
}
