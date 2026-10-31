package io.bidmachine.ads.networks.gam_dynamic;

import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;

/* JADX INFO: compiled from: GAMInterstitialAd.java */
/* JADX INFO: loaded from: classes4.dex */
class n extends l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    z f16663c;

    /* JADX INFO: compiled from: GAMInterstitialAd.java */
    static final class a extends m<q6.p> implements z {
        a(vb.i iVar, l lVar) {
            super(iVar, lVar);
        }
    }

    protected n(o oVar) {
        super(oVar);
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.l, vb.b
    public void d() {
        this.f16663c = null;
        super.d();
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.l
    protected q6.o l() {
        return this.f16663c;
    }

    @Override // vb.b
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void b(ContextProvider contextProvider, vb.i iVar, vb.j jVar, vb.k kVar, NetworkAdUnit networkAdUnit) throws Throwable {
        a aVar = new a(iVar, this);
        this.f16663c = aVar;
        this.f16633a.c(networkAdUnit, aVar);
    }
}
