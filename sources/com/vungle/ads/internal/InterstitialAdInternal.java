package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.internal.model.Placement;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: InterstitialAdInternal.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class InterstitialAdInternal extends FullscreenAdInternal {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterstitialAdInternal(Context context) {
        super(context);
        t.f(context, "context");
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdTypeForPlacement(Placement placement) {
        t.f(placement, "placement");
        return placement.isInterstitial() || placement.isAppOpen();
    }
}
