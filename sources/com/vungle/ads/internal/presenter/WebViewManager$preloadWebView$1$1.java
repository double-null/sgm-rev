package com.vungle.ads.internal.presenter;

import android.content.Context;
import android.webkit.WebView;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.platform.WebViewUtil;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.VungleWebClient;
import com.vungle.ads.internal.util.Logger;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import wc.g0;
import wc.k;
import wc.m;
import wc.o;
import wc.r;
import wc.s;

/* JADX INFO: compiled from: WebViewManager.kt */
/* JADX INFO: loaded from: classes4.dex */
final class WebViewManager$preloadWebView$1$1 extends u implements id.a<g0> {
    final /* synthetic */ AdPayload $adv;
    final /* synthetic */ Context $context;
    final /* synthetic */ PreloadDelegate $delegate;
    final /* synthetic */ String $key;
    final /* synthetic */ Long $loadDuration;
    final /* synthetic */ Placement $placement;
    final /* synthetic */ String $templatePath;
    final /* synthetic */ AdPayload.WebViewSettings $webSettings;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebViewManager$preloadWebView$1$1(Context context, AdPayload adPayload, Placement placement, PreloadDelegate preloadDelegate, Long l10, String str, String str2, AdPayload.WebViewSettings webViewSettings) {
        super(0);
        this.$context = context;
        this.$adv = adPayload;
        this.$placement = placement;
        this.$delegate = preloadDelegate;
        this.$loadDuration = l10;
        this.$templatePath = str;
        this.$key = str2;
        this.$webSettings = webViewSettings;
    }

    /* JADX INFO: renamed from: invoke$lambda-3$lambda-1, reason: not valid java name */
    private static final Executors m281invoke$lambda3$lambda1(k<? extends Executors> kVar) {
        return kVar.getValue();
    }

    /* JADX INFO: renamed from: invoke$lambda-3$lambda-2, reason: not valid java name */
    private static final Platform m282invoke$lambda3$lambda2(k<? extends Platform> kVar) {
        return kVar.getValue();
    }

    @Override // id.a
    public /* bridge */ /* synthetic */ g0 invoke() {
        invoke2();
        return g0.f27756a;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Object objC;
        WebViewManager webViewManager = WebViewManager.INSTANCE;
        Context context = this.$context;
        AdPayload adPayload = this.$adv;
        Placement placement = this.$placement;
        PreloadDelegate preloadDelegate = this.$delegate;
        Long l10 = this.$loadDuration;
        String str = this.$templatePath;
        String str2 = this.$key;
        AdPayload.WebViewSettings webViewSettings = this.$webSettings;
        try {
            r.a aVar = r.f27774b;
            WebView webView = new WebView(context.getApplicationContext());
            WebViewUtil.INSTANCE.applyWebSettings(webView, webViewSettings);
            ServiceLocator.Companion companion = ServiceLocator.Companion;
            o oVar = o.SYNCHRONIZED;
            VungleWebClient vungleWebClient = new VungleWebClient(adPayload, placement, m281invoke$lambda3$lambda1(m.b(oVar, new WebViewManager$preloadWebView$1$1$invoke$lambda3$$inlined$inject$1(context))).getOffloadExecutor(), m282invoke$lambda3$lambda2(m.b(oVar, new WebViewManager$preloadWebView$1$1$invoke$lambda3$$inlined$inject$2(context))), preloadDelegate, l10);
            ConfigManager configManager = ConfigManager.INSTANCE;
            vungleWebClient.setConsentStatus(configManager.getGDPRIsCountryDataProtected() && t.a("unknown", PrivacyManager.INSTANCE.getConsentStatus()), configManager.getGDPRConsentTitle(), configManager.getGDPRConsentMessage(), configManager.getGDPRButtonAccept(), configManager.getGDPRButtonDeny());
            webView.setWebViewClient(vungleWebClient);
            webView.loadUrl(str);
            WebViewManager.webViewCache.put(String.valueOf(str2), new WebViewManager.WebViewEntry(webView, vungleWebClient));
            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.CONCURRENT_CACHED_WEBVIEW_COUNT, WebViewManager.webViewCache.size(), adPayload.getLogEntry$vungle_ads_release(), null, 8, null);
            objC = r.c(Integer.valueOf(Logger.Companion.d("WebViewManager", "Preload complete. Cache size: " + WebViewManager.webViewCache.size())));
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            objC = r.c(s.a(th));
        }
        PreloadDelegate preloadDelegate2 = this.$delegate;
        Throwable thG = r.g(objC);
        if (thG != null) {
            Logger.Companion.e("WebViewManager", "Preload webview failed", thG);
            preloadDelegate2.onAdReadyToPlay();
        }
    }
}
