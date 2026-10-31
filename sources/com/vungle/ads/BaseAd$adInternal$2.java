package com.vungle.ads;

import com.vungle.ads.internal.AdInternal;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: BaseAd.kt */
/* JADX INFO: loaded from: classes4.dex */
final class BaseAd$adInternal$2 extends u implements id.a<AdInternal> {
    final /* synthetic */ BaseAd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseAd$adInternal$2(BaseAd baseAd) {
        super(0);
        this.this$0 = baseAd;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // id.a
    public final AdInternal invoke() {
        BaseAd baseAd = this.this$0;
        AdInternal adInternalConstructAdInternal$vungle_ads_release = baseAd.constructAdInternal$vungle_ads_release(baseAd.getContext());
        adInternalConstructAdInternal$vungle_ads_release.setLogEntry$vungle_ads_release(this.this$0.getLogEntry$vungle_ads_release());
        return adInternalConstructAdInternal$vungle_ads_release;
    }
}
