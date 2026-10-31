package com.vungle.ads.internal.bidding;

import android.content.Context;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.network.VungleApiClient;
import id.a;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ServiceLocator.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class BidTokenEncoder$constructV6Token$$inlined$inject$1 extends u implements a<VungleApiClient> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BidTokenEncoder$constructV6Token$$inlined$inject$1(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.VungleApiClient, java.lang.Object] */
    @Override // id.a
    public final VungleApiClient invoke() {
        return ServiceLocator.Companion.getInstance(this.$context).getService(VungleApiClient.class);
    }
}
