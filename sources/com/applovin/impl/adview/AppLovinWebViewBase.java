package com.applovin.impl.adview;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.p0;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinWebViewBase extends WebView {
    public AppLovinWebViewBase(Context context) {
        super(context);
    }

    protected void applySettings(com.applovin.impl.sdk.ad.b bVar) {
        Boolean boolM;
        loadUrl("about:blank");
        int iO0 = bVar.o0();
        if (iO0 >= 0) {
            setLayerType(iO0, null);
        }
        getSettings().setMediaPlaybackRequiresUserGesture(bVar.E());
        if (bVar.E0()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        l lVarP0 = bVar.p0();
        if (lVarP0 != null) {
            WebSettings settings = getSettings();
            WebSettings.PluginState pluginStateB = lVarP0.b();
            if (pluginStateB != null) {
                settings.setPluginState(pluginStateB);
            }
            Boolean boolE = lVarP0.e();
            if (boolE != null) {
                settings.setAllowFileAccess(boolE.booleanValue());
            }
            Boolean boolI = lVarP0.i();
            if (boolI != null) {
                settings.setLoadWithOverviewMode(boolI.booleanValue());
            }
            Boolean boolQ = lVarP0.q();
            if (boolQ != null) {
                settings.setUseWideViewPort(boolQ.booleanValue());
            }
            Boolean boolD = lVarP0.d();
            if (boolD != null) {
                settings.setAllowContentAccess(boolD.booleanValue());
            }
            Boolean boolP = lVarP0.p();
            if (boolP != null) {
                settings.setBuiltInZoomControls(boolP.booleanValue());
            }
            Boolean boolH = lVarP0.h();
            if (boolH != null) {
                settings.setDisplayZoomControls(boolH.booleanValue());
            }
            Boolean boolL = lVarP0.l();
            if (boolL != null) {
                settings.setSaveFormData(boolL.booleanValue());
            }
            Boolean boolC = lVarP0.c();
            if (boolC != null) {
                settings.setGeolocationEnabled(boolC.booleanValue());
            }
            Boolean boolJ = lVarP0.j();
            if (boolJ != null) {
                settings.setNeedInitialFocus(boolJ.booleanValue());
            }
            Boolean boolF = lVarP0.f();
            if (boolF != null) {
                settings.setAllowFileAccessFromFileURLs(boolF.booleanValue());
            }
            Boolean boolG = lVarP0.g();
            if (boolG != null) {
                settings.setAllowUniversalAccessFromFileURLs(boolG.booleanValue());
            }
            Boolean boolO = lVarP0.o();
            if (boolO != null) {
                settings.setLoadsImagesAutomatically(boolO.booleanValue());
            }
            Boolean boolN = lVarP0.n();
            if (boolN != null) {
                settings.setBlockNetworkImage(boolN.booleanValue());
            }
            Integer numA = lVarP0.a();
            if (numA != null) {
                settings.setMixedContentMode(numA.intValue());
            }
            Boolean boolK = lVarP0.k();
            if (boolK != null) {
                settings.setOffscreenPreRaster(boolK.booleanValue());
            }
            if (!p0.h() || (boolM = lVarP0.m()) == null) {
                return;
            }
            settings.setAlgorithmicDarkeningAllowed(boolM.booleanValue());
        }
    }
}
