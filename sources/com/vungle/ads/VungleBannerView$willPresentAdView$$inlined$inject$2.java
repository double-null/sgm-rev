package com.vungle.ads;

import android.content.Context;
import com.vungle.ads.internal.omsdk.OMTracker;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ServiceLocator.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class VungleBannerView$willPresentAdView$$inlined$inject$2 extends u implements id.a<OMTracker.Factory> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VungleBannerView$willPresentAdView$$inlined$inject$2(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.omsdk.OMTracker$Factory, java.lang.Object] */
    @Override // id.a
    public final OMTracker.Factory invoke() {
        return ServiceLocator.Companion.getInstance(this.$context).getService(OMTracker.Factory.class);
    }
}
