package io.bidmachine.ads.networks.gam;

import android.text.TextUtils;

/* JADX INFO: compiled from: GAMParams.java */
/* JADX INFO: loaded from: classes4.dex */
class p extends vb.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f16579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f16580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String f16581d;

    p(vb.k kVar) {
        super(kVar);
        this.f16579b = kVar.i("ad_unit_id");
        this.f16580c = kVar.i("score");
        this.f16581d = kVar.i("price");
    }

    public boolean a(vb.c cVar) {
        if (TextUtils.isEmpty(this.f16579b)) {
            cVar.c(oc.a.k("ad_unit_id"));
            return false;
        }
        if (TextUtils.isEmpty(this.f16580c)) {
            cVar.c(oc.a.k("score"));
            return false;
        }
        if (!TextUtils.isEmpty(this.f16581d)) {
            return true;
        }
        cVar.c(oc.a.k("price"));
        return false;
    }
}
