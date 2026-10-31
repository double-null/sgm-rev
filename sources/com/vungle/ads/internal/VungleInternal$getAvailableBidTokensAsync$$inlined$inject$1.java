package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.bidding.BidTokenEncoder;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ServiceLocator.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class VungleInternal$getAvailableBidTokensAsync$$inlined$inject$1 extends u implements id.a<BidTokenEncoder> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VungleInternal$getAvailableBidTokensAsync$$inlined$inject$1(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.bidding.BidTokenEncoder, java.lang.Object] */
    @Override // id.a
    public final BidTokenEncoder invoke() {
        return ServiceLocator.Companion.getInstance(this.$context).getService(BidTokenEncoder.class);
    }
}
