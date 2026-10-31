package io.bidmachine.ads.networks.gam_dynamic;

import android.app.Activity;
import io.bidmachine.ContextProvider;
import io.bidmachine.RendererConfiguration;
import java.util.Map;

/* JADX INFO: compiled from: GAMFullscreenAd.java */
/* JADX INFO: loaded from: classes4.dex */
abstract class l extends vb.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final o f16633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected y f16634b;

    protected l(o oVar) {
        this.f16633a = oVar;
    }

    @Override // vb.b
    public Map<String, Object> a() {
        y yVar = this.f16634b;
        if (yVar != null) {
            return yVar.getCustomParamsMap();
        }
        return null;
    }

    @Override // vb.b
    public void d() {
        y yVar = this.f16634b;
        if (yVar != null) {
            yVar.i();
            this.f16634b = null;
        }
    }

    @Override // vb.b
    public void g() {
        super.g();
        y yVar = this.f16634b;
        if (yVar != null) {
            yVar.D();
        }
    }

    @Override // vb.h
    public void k(ContextProvider contextProvider, vb.i iVar, RendererConfiguration rendererConfiguration) throws Throwable {
        Activity activity = contextProvider.getActivity();
        if (activity == null) {
            iVar.b(oc.a.i("Activity is null"));
            return;
        }
        y yVar = this.f16634b;
        if (yVar == null) {
            iVar.b(oc.a.i("Fullscreen object is null"));
            return;
        }
        if (yVar.p()) {
            iVar.b(oc.a.i("Fullscreen object is expired"));
            return;
        }
        if (!this.f16634b.q()) {
            iVar.b(oc.a.i("Fullscreen object not loaded"));
            return;
        }
        q6.o oVarL = l();
        if (oVarL == null) {
            iVar.b(oc.a.i("Fullscreen listener is null"));
        } else {
            this.f16634b.M(activity, oVarL);
        }
    }

    protected abstract q6.o l();
}
