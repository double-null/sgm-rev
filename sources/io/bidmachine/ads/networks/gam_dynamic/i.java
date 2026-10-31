package io.bidmachine.ads.networks.gam_dynamic;

import io.bidmachine.ads.networks.gam_dynamic.u;
import vb.c;

/* JADX INFO: compiled from: GAMBaseAdListener.java */
/* JADX INFO: loaded from: classes4.dex */
abstract class i<InternalAdType extends u, UnifiedAdCallbackType extends vb.c> implements v<InternalAdType>, q6.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UnifiedAdCallbackType f16628a;

    i(UnifiedAdCallbackType unifiedadcallbacktype) {
        this.f16628a = unifiedadcallbacktype;
    }

    @Override // q6.m
    public void a() {
        this.f16628a.a();
    }

    @Override // q6.m
    public void b(oc.a aVar) {
        this.f16628a.b(aVar);
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.v
    public void c(oc.a aVar) {
        this.f16628a.c(aVar);
    }

    UnifiedAdCallbackType f() {
        return this.f16628a;
    }

    @Override // q6.m
    public void j() {
        this.f16628a.j();
    }

    @Override // q6.m
    public void onAdClicked() {
        this.f16628a.onAdClicked();
    }
}
