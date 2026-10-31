package io.bidmachine.ads.networks.gam_dynamic;

import io.bidmachine.ads.networks.gam_dynamic.y;

/* JADX INFO: compiled from: GAMFullscreenAdListener.java */
/* JADX INFO: loaded from: classes4.dex */
class m<InternalAdType extends y> extends i<InternalAdType, vb.i> implements q6.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f16661b;

    m(vb.i iVar, l lVar) {
        super(iVar);
        this.f16661b = lVar;
    }

    @Override // q6.o
    public void e() {
        f().d();
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.v
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void d(InternalAdType internaladtype) {
        this.f16661b.f16634b = internaladtype;
        f().onAdLoaded();
    }

    @Override // q6.o
    public void onAdClosed() {
        f().onAdClosed();
    }
}
