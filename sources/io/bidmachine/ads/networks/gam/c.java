package io.bidmachine.ads.networks.gam;

import io.bidmachine.ads.networks.gam.i0;

/* JADX INFO: compiled from: GAMFullscreenAdListener.java */
/* JADX INFO: loaded from: classes4.dex */
class c<GAMAdType extends i0> extends b<GAMAdType, vb.i> implements j0 {
    c(vb.i iVar) {
        super(iVar);
    }

    @Override // io.bidmachine.ads.networks.gam.j0
    public void e() {
        f().d();
    }

    public void g(GAMAdType gamadtype) {
        f().onAdLoaded();
    }

    @Override // io.bidmachine.ads.networks.gam.j0
    public void onAdClosed() {
        f().onAdClosed();
    }
}
