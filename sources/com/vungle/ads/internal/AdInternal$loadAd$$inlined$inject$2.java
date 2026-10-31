package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.executor.SDKExecutors;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ServiceLocator.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AdInternal$loadAd$$inlined$inject$2 extends u implements id.a<SDKExecutors> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdInternal$loadAd$$inlined$inject$2(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.SDKExecutors, java.lang.Object] */
    @Override // id.a
    public final SDKExecutors invoke() {
        return ServiceLocator.Companion.getInstance(this.$context).getService(SDKExecutors.class);
    }
}
