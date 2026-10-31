package io.bidmachine.ads.networks.gam;

import android.app.Activity;
import io.bidmachine.AdsFormat;

/* JADX INFO: compiled from: InternalGAMFullscreenAd.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i0 extends c0 {
    public i0(j jVar, AdsFormat adsFormat, t tVar) {
        super(jVar, adsFormat, tVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(Activity activity, j0 j0Var) {
        try {
            G(c0.a.Showing);
            K(activity, j0Var);
        } catch (Throwable th) {
            io.bidmachine.core.a.o(th);
            j0Var.b(oc.a.l("Exception showing InternalGAM object", th));
        }
    }

    public final void J(final Activity activity, final j0 j0Var) {
        io.bidmachine.core.h.S(new Runnable() { // from class: io.bidmachine.ads.networks.gam.h0
            @Override // java.lang.Runnable
            public final void run() {
                this.f16541a.I(activity, j0Var);
            }
        });
    }

    protected abstract void K(Activity activity, j0 j0Var) throws Throwable;
}
