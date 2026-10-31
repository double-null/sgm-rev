package io.bidmachine.ads.networks.gam_dynamic;

import android.content.Context;
import io.bidmachine.AdsFormat;
import io.bidmachine.NetworkAdUnit;

/* JADX INFO: compiled from: GAMNetwork.java */
/* JADX INFO: loaded from: classes4.dex */
interface o {
    void a();

    boolean b(AdsFormat adsFormat, boolean z10);

    void c(NetworkAdUnit networkAdUnit, z zVar);

    void d(NetworkAdUnit networkAdUnit);

    void e(NetworkAdUnit networkAdUnit, a0 a0Var);

    q6.j f(NetworkAdUnit networkAdUnit, AdsFormat adsFormat);

    void g(NetworkAdUnit networkAdUnit, x xVar);

    String getVersion();

    void h(Context context);

    boolean isInitialized();
}
