package io.bidmachine.ads.networks.gam_dynamic;

import android.app.Activity;
import io.bidmachine.AdsFormat;
import io.bidmachine.protobuf.Waterfall;

/* JADX INFO: compiled from: InternalFullscreenAd.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class y extends u {
    public y(q6.s sVar, q6.u uVar, AdsFormat adsFormat, Waterfall.Configuration.AdUnit adUnit, q6.k kVar) {
        super(sVar, uVar, adsFormat, adUnit, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(Activity activity, q6.o oVar) {
        try {
            J(u.a.Showing);
            N(activity, oVar);
        } catch (Throwable th) {
            io.bidmachine.core.a.o(th);
            oVar.b(oc.a.l("Exception showing InternalAd object", th));
        }
    }

    public final void M(final Activity activity, final q6.o oVar) {
        io.bidmachine.core.h.S(new Runnable() { // from class: q6.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f24455a.L(activity, oVar);
            }
        });
    }

    protected abstract void N(Activity activity, q6.o oVar) throws Throwable;
}
