package com.applovin.impl;

import android.webkit.WebView;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;

/* JADX INFO: loaded from: classes.dex */
public class k4 extends h4 {
    public k4(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        super(appLovinNativeAdImpl);
    }

    @Override // com.applovin.impl.h4
    protected AdSessionContext a(WebView webView) {
        try {
            return AdSessionContext.createNativeAdSessionContext(this.f6729b.g0().b(), this.f6729b.g0().a(), this.f6728a.getOpenMeasurementVerificationScriptResources(), this.f6728a.getOpenMeasurementContentUrl(), this.f6728a.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6730c.a(this.f6731d, "Failed to create ad session context", th);
            }
            return null;
        }
    }

    @Override // com.applovin.impl.h4
    protected AdSessionConfiguration a() {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(CreativeType.NATIVE_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6730c.a(this.f6731d, "Failed to create ad session configuration", th);
            }
            return null;
        }
    }
}
