package io.bidmachine.ads.networks.gam;

import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;

/* JADX INFO: compiled from: GAMBanner.java */
/* JADX INFO: loaded from: classes4.dex */
class a extends vb.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f16514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g0 f16515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f0 f16516c;

    /* JADX INFO: compiled from: GAMBanner.java */
    private static final class b extends io.bidmachine.ads.networks.gam.b<f0, vb.f> implements g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f16517b;

        @Override // io.bidmachine.ads.networks.gam.d0
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(f0 f0Var) {
            this.f16517b.f16516c = f0Var;
            f().onAdLoaded(f0Var.H());
        }

        private b(a aVar, vb.f fVar) {
            super(fVar);
            this.f16517b = aVar;
        }
    }

    protected a(o oVar) {
        this.f16514a = oVar;
    }

    @Override // vb.b
    public void d() {
        this.f16515b = null;
        f0 f0Var = this.f16516c;
        if (f0Var != null) {
            f0Var.h();
            this.f16516c = null;
        }
    }

    @Override // vb.b
    public void g() {
        super.g();
        f0 f0Var = this.f16516c;
        if (f0Var != null) {
            f0Var.D();
        }
    }

    @Override // vb.b
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void b(ContextProvider contextProvider, vb.f fVar, vb.g gVar, vb.k kVar, NetworkAdUnit networkAdUnit) throws Throwable {
        if (new p(kVar).a(fVar)) {
            if (!this.f16514a.i()) {
                fVar.setVisibilitySource(io.bidmachine.core.j.BidMachine);
            }
            b bVar = new b(fVar);
            this.f16515b = bVar;
            this.f16514a.m(networkAdUnit, bVar);
        }
    }
}
