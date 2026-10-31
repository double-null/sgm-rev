package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.omsdk.OMInjector;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ServiceLocator.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AdInternal$loadAd$$inlined$inject$1 extends u implements id.a<OMInjector> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdInternal$loadAd$$inlined$inject$1(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.omsdk.OMInjector, java.lang.Object] */
    @Override // id.a
    public final OMInjector invoke() {
        return ServiceLocator.Companion.getInstance(this.$context).getService(OMInjector.class);
    }
}
