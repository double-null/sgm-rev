package io.bidmachine.ads.networks.gam_dynamic;

import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import java.util.Map;

/* JADX INFO: compiled from: GAMBannerAd.java */
/* JADX INFO: loaded from: classes4.dex */
class h extends vb.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f16623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    x f16624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    w f16625c;

    /* JADX INFO: compiled from: GAMBannerAd.java */
    static final class a extends i<w, vb.f> implements x {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final h f16626b;

        a(vb.f fVar, h hVar) {
            super(fVar);
            this.f16626b = hVar;
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.v
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(w wVar) {
            this.f16626b.f16625c = wVar;
            if (wVar.m().getOverrideCallbacks()) {
                f().setVisibilitySource(io.bidmachine.core.j.BidMachine);
            }
            f().onAdLoaded(wVar.K());
        }
    }

    protected h(o oVar) {
        this.f16623a = oVar;
    }

    @Override // vb.b
    public Map<String, Object> a() {
        w wVar = this.f16625c;
        if (wVar != null) {
            return wVar.getCustomParamsMap();
        }
        return null;
    }

    @Override // vb.b
    public void d() {
        this.f16624b = null;
        w wVar = this.f16625c;
        if (wVar != null) {
            wVar.i();
            this.f16625c = null;
        }
    }

    @Override // vb.b
    public void g() {
        super.g();
        w wVar = this.f16625c;
        if (wVar != null) {
            wVar.D();
        }
    }

    @Override // vb.b
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void b(ContextProvider contextProvider, vb.f fVar, vb.g gVar, vb.k kVar, NetworkAdUnit networkAdUnit) throws Throwable {
        a aVar = new a(fVar, this);
        this.f16624b = aVar;
        this.f16623a.g(networkAdUnit, aVar);
    }
}
