package io.bidmachine.ads.networks.gam_dynamic;

import android.view.View;
import io.bidmachine.AdsFormat;
import io.bidmachine.protobuf.Waterfall;

/* JADX INFO: compiled from: InternalBannerAd.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class w extends u {
    public w(q6.s sVar, q6.u uVar, AdsFormat adsFormat, Waterfall.Configuration.AdUnit adUnit, q6.k kVar) {
        super(sVar, uVar, adsFormat, adUnit, kVar);
    }

    protected abstract View K();
}
