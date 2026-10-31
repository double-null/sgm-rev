package r6;

import android.content.Context;
import io.bidmachine.AdsFormat;
import io.bidmachine.ads.networks.gam_dynamic.u;
import io.bidmachine.protobuf.Waterfall;
import q6.k;
import q6.s;

/* JADX INFO: compiled from: VersionWrapper.java */
/* JADX INFO: loaded from: classes4.dex */
public interface b {
    void a(Context context) throws Throwable;

    int b();

    uc.a c();

    boolean d(Context context);

    u e(s sVar, q6.u uVar, AdsFormat adsFormat, Waterfall.Configuration.AdUnit adUnit, k kVar);

    uc.a getVersion() throws Throwable;
}
