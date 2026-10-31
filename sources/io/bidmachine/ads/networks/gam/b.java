package io.bidmachine.ads.networks.gam;

import io.bidmachine.ads.networks.gam.c0;
import vb.c;

/* JADX INFO: compiled from: GAMBaseAdListener.java */
/* JADX INFO: loaded from: classes4.dex */
abstract class b<GAMAdType extends c0, UnifiedAdCallbackType extends vb.c> implements d0<GAMAdType>, e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UnifiedAdCallbackType f16519a;

    b(UnifiedAdCallbackType unifiedadcallbacktype) {
        this.f16519a = unifiedadcallbacktype;
    }

    @Override // io.bidmachine.ads.networks.gam.e0
    public void a() {
        this.f16519a.a();
    }

    @Override // io.bidmachine.ads.networks.gam.e0
    public void b(oc.a aVar) {
        this.f16519a.b(aVar);
    }

    @Override // io.bidmachine.ads.networks.gam.d0
    public void c(oc.a aVar) {
        this.f16519a.c(aVar);
    }

    UnifiedAdCallbackType f() {
        return this.f16519a;
    }

    @Override // io.bidmachine.ads.networks.gam.e0
    public void j() {
        this.f16519a.j();
    }

    @Override // io.bidmachine.ads.networks.gam.e0
    public void onAdClicked() {
        this.f16519a.onAdClicked();
    }
}
