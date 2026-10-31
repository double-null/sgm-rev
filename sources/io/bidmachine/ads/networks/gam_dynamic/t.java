package io.bidmachine.ads.networks.gam_dynamic;

import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;

/* JADX INFO: compiled from: GAMRewardedAd.java */
/* JADX INFO: loaded from: classes4.dex */
class t extends l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    a0 f16698c;

    /* JADX INFO: compiled from: GAMRewardedAd.java */
    static final class a extends m<q6.r> implements a0 {
        a(vb.i iVar, l lVar) {
            super(iVar, lVar);
        }
    }

    protected t(o oVar) {
        super(oVar);
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.l, vb.b
    public void d() {
        this.f16698c = null;
        super.d();
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.l
    protected q6.o l() {
        return this.f16698c;
    }

    @Override // vb.b
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void b(ContextProvider contextProvider, vb.i iVar, vb.j jVar, vb.k kVar, NetworkAdUnit networkAdUnit) throws Throwable {
        a aVar = new a(iVar, this);
        this.f16698c = aVar;
        this.f16633a.e(networkAdUnit, aVar);
    }
}
