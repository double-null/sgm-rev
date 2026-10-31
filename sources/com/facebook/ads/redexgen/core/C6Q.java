package com.facebook.ads.redexgen.core;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6Q, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C6Q extends C1764fg {
    public InterfaceC1622dM A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A06(NativeAdLayout nativeAdLayout, C1621dL c1621dL, NativeAd nativeAd, C1281Ur c1281Ur) {
        C1435aK c1435aK = new C1435aK(c1621dL);
        MediaView mediaView = new MediaView(c1621dL);
        AdOptionsView adOptionsView = new AdOptionsView(c1621dL, nativeAd, nativeAdLayout);
        c1281Ur.A09(adOptionsView, 28);
        this.A00 = new EP(c1621dL, nativeAd, c1281Ur, C1164Qc.A0L(nativeAd.getInternalNativeAd()).A18(), c1435aK, mediaView, adOptionsView);
        XP.A0K(nativeAdLayout, c1281Ur.A00());
        nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, c1435aK, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.R8, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
