package com.vungle.ads;

import android.content.Context;
import com.vungle.ads.internal.InterstitialAdInternal;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: InterstitialAd.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class InterstitialAd extends BaseFullscreenAd {
    public /* synthetic */ InterstitialAd(Context context, String str, AdConfig adConfig, int i10, k kVar) {
        this(context, str, (i10 & 4) != 0 ? new AdConfig() : adConfig);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterstitialAd(Context context, String placementId, AdConfig adConfig) {
        super(context, placementId, adConfig);
        t.f(context, "context");
        t.f(placementId, "placementId");
        t.f(adConfig, "adConfig");
    }

    @Override // com.vungle.ads.BaseAd
    public InterstitialAdInternal constructAdInternal$vungle_ads_release(Context context) {
        t.f(context, "context");
        return new InterstitialAdInternal(context);
    }
}
