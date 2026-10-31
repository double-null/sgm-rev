package com.vungle.ads.internal.ui;

import android.net.Uri;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import com.adjust.sdk.Constants;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.EvaluateJsError;
import com.vungle.ads.OneShotSingleValueMetric;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.omsdk.WebViewObserver;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.presenter.PreloadDelegate;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.view.WebViewAPI;
import com.vungle.ads.internal.util.BlackScreenDetector;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.OnSilentModeChangeListener;
import com.vungle.ads.internal.util.ThreadUtil;
import id.p;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import kotlin.collections.b0;
import kotlin.collections.o0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import kotlinx.serialization.json.d0;
import kotlinx.serialization.json.e0;
import kotlinx.serialization.json.j;
import rd.c0;
import rd.f0;
import wc.g0;
import wc.k;
import wc.m;
import wc.q;
import wc.r;
import wc.s;
import wc.w;

/* JADX INFO: compiled from: VungleWebClient.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class VungleWebClient extends WebViewClient implements WebViewAPI, OnSilentModeChangeListener {
    private static final String COMMAND_COMPLETE = "window.vungle.mraidBridge.notifyCommandComplete()";
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "VungleWebClient";
    private final AdPayload advertisement;
    private final k blackScreenDetector$delegate;
    private boolean collectConsent;
    private final PreloadDelegate delegate;
    private WebViewAPI.WebClientErrorHandler errorHandler;
    private String gdprAccept;
    private String gdprBody;
    private String gdprDeny;
    private String gdprTitle;
    private Boolean isViewable;
    private final Long loadDuration;
    private WebView loadedWebView;
    private WebViewAPI.MraidDelegate mraidDelegate;
    private final ExecutorService offloadExecutor;
    private final OneShotSingleValueMetric partialDownloadErrorMetric;
    private final OneShotSingleValueMetric partialDownloadMetric;
    private final Placement placement;
    private final Platform platform;
    private boolean ready;
    private final SingleValueMetric skippedUrlMetric;
    private WebViewObserver webViewObserver;

    /* JADX INFO: compiled from: VungleWebClient.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: VungleWebClient.kt */
    public static final class VungleWebViewRenderProcessClient extends WebViewRenderProcessClient {
        private WebViewAPI.WebClientErrorHandler errorHandler;

        public VungleWebViewRenderProcessClient(WebViewAPI.WebClientErrorHandler webClientErrorHandler) {
            this.errorHandler = webClientErrorHandler;
        }

        @Override // android.webkit.WebViewRenderProcessClient
        public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            t.f(webView, "webView");
        }

        @Override // android.webkit.WebViewRenderProcessClient
        public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            t.f(webView, "webView");
            Logger.Companion.w(VungleWebClient.TAG, new VungleWebClient$VungleWebViewRenderProcessClient$onRenderProcessUnresponsive$1(webView, webViewRenderProcess));
            WebViewAPI.WebClientErrorHandler webClientErrorHandler = this.errorHandler;
            if (webClientErrorHandler != null) {
                webClientErrorHandler.onRenderProcessUnresponsive(webView, webViewRenderProcess);
            }
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.ui.VungleWebClient$handleBlackScreenDetection$1, reason: invalid class name */
    /* JADX INFO: compiled from: VungleWebClient.kt */
    static final class AnonymousClass1 extends u implements p<Integer, String, g0> {
        AnonymousClass1() {
            super(2);
        }

        @Override // id.p
        public /* bridge */ /* synthetic */ g0 invoke(Integer num, String str) {
            invoke(num.intValue(), str);
            return g0.f27756a;
        }

        public final void invoke(int i10, String errorMessage) {
            t.f(errorMessage, "errorMessage");
            VungleWebClient.this.notifyBlackScreenResult(i10, errorMessage);
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.ui.VungleWebClient$onPageFinished$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: VungleWebClient.kt */
    static final class C24271 extends u implements id.a<String> {
        public static final C24271 INSTANCE = new C24271();

        C24271() {
            super(0);
        }

        @Override // id.a
        public final String invoke() {
            return "onPageFinished.";
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.ui.VungleWebClient$onRenderProcessGone$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: VungleWebClient.kt */
    static final class C24281 extends u implements id.a<String> {
        final /* synthetic */ WebView $view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C24281(WebView webView) {
            super(0);
            this.$view = webView;
        }

        @Override // id.a
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onRenderProcessGone url: ");
            WebView webView = this.$view;
            sb2.append(webView != null ? webView.getUrl() : null);
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.ui.VungleWebClient$onRenderProcessGone$2, reason: invalid class name */
    /* JADX INFO: compiled from: VungleWebClient.kt */
    static final class AnonymousClass2 extends u implements id.a<String> {
        final /* synthetic */ RenderProcessGoneDetail $detail;
        final /* synthetic */ WebView $view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            super(0);
            this.$view = webView;
            this.$detail = renderProcessGoneDetail;
        }

        @Override // id.a
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onRenderProcessGone url: ");
            WebView webView = this.$view;
            sb2.append(webView != null ? webView.getUrl() : null);
            sb2.append(", did crash: ");
            RenderProcessGoneDetail renderProcessGoneDetail = this.$detail;
            sb2.append(renderProcessGoneDetail != null ? Boolean.valueOf(renderProcessGoneDetail.didCrash()) : null);
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.ui.VungleWebClient$runJavascriptOnWebView$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: VungleWebClient.kt */
    static final class C24291 extends u implements id.a<String> {
        final /* synthetic */ String $injectJs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C24291(String str) {
            super(0);
            this.$injectJs = str;
        }

        @Override // id.a
        public final String invoke() {
            return "mraid Injecting JS " + this.$injectJs;
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.ui.VungleWebClient$runJavascriptOnWebView$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: VungleWebClient.kt */
    static final class C24302 extends u implements id.a<g0> {
        final /* synthetic */ String $injectJs;
        final /* synthetic */ WebView $webView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C24302(WebView webView, String str) {
            super(0);
            this.$webView = webView;
            this.$injectJs = str;
        }

        @Override // id.a
        public /* bridge */ /* synthetic */ g0 invoke() {
            invoke2();
            return g0.f27756a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Object objC;
            WebView webView = this.$webView;
            String str = this.$injectJs;
            try {
                r.a aVar = r.f27774b;
                g0 g0Var = null;
                if (webView != null) {
                    webView.evaluateJavascript(str, null);
                    g0Var = g0.f27756a;
                }
                objC = r.c(g0Var);
            } catch (Throwable th) {
                r.a aVar2 = r.f27774b;
                objC = r.c(s.a(th));
            }
            VungleWebClient vungleWebClient = VungleWebClient.this;
            Throwable thG = r.g(objC);
            if (thG != null) {
                new EvaluateJsError("Evaluate js failed " + thG.getLocalizedMessage()).setLogEntry$vungle_ads_release(vungleWebClient.advertisement.getLogEntry$vungle_ads_release()).logErrorNoReturnValue$vungle_ads_release();
            }
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.ui.VungleWebClient$shouldInterceptRequest$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: VungleWebClient.kt */
    static final class C24311 extends u implements id.a<String> {
        public static final C24311 INSTANCE = new C24311();

        C24311() {
            super(0);
        }

        @Override // id.a
        public final String invoke() {
            return "shouldInterceptRequest called but partial download is disabled.";
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.ui.VungleWebClient$shouldInterceptRequest$3, reason: invalid class name */
    /* JADX INFO: compiled from: VungleWebClient.kt */
    static final class AnonymousClass3 extends u implements id.a<String> {
        final /* synthetic */ String $rangeHeader;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(String str) {
            super(0);
            this.$rangeHeader = str;
        }

        @Override // id.a
        public final String invoke() {
            return "Requested range exceeds cached file: " + this.$rangeHeader;
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.ui.VungleWebClient$shouldOverrideUrlLoading$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: VungleWebClient.kt */
    static final class C24323 extends u implements id.a<String> {
        final /* synthetic */ String $url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C24323(String str) {
            super(0);
            this.$url = str;
        }

        @Override // id.a
        public final String invoke() {
            return "skipped url: " + this.$url;
        }
    }

    public /* synthetic */ VungleWebClient(AdPayload adPayload, Placement placement, ExecutorService executorService, Platform platform, PreloadDelegate preloadDelegate, Long l10, int i10, kotlin.jvm.internal.k kVar) {
        this(adPayload, placement, executorService, (i10 & 8) != 0 ? null : platform, (i10 & 16) != 0 ? null : preloadDelegate, (i10 & 32) != 0 ? null : l10);
    }

    private final BlackScreenDetector getBlackScreenDetector() {
        return (BlackScreenDetector) this.blackScreenDetector$delegate.getValue();
    }

    private final void handleWebViewError(String str, String str2, boolean z10) {
        String str3 = str2 + ' ' + str;
        WebViewAPI.WebClientErrorHandler webClientErrorHandler = this.errorHandler;
        if (webClientErrorHandler != null) {
            webClientErrorHandler.onReceivedError(str3, z10);
        }
    }

    private final boolean isCriticalAsset(String str) {
        if (str.length() > 0) {
            return this.advertisement.isCriticalAsset(str);
        }
        return false;
    }

    public static /* synthetic */ void notifyBlackScreenResult$default(VungleWebClient vungleWebClient, int i10, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "";
        }
        vungleWebClient.notifyBlackScreenResult(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: notifyPropertiesChange$lambda-19, reason: not valid java name */
    public static final void m297notifyPropertiesChange$lambda19(boolean z10, VungleWebClient this$0) {
        t.f(this$0, "this$0");
        e0 e0Var = new e0();
        j.c(e0Var, "placementType", this$0.advertisement.templateType());
        Boolean bool = this$0.isViewable;
        if (bool != null) {
            j.a(e0Var, "isViewable", Boolean.valueOf(bool.booleanValue()));
        }
        j.c(e0Var, "os", "android");
        j.c(e0Var, "osVersion", String.valueOf(Build.VERSION.SDK_INT));
        j.a(e0Var, "incentivized", Boolean.valueOf(this$0.placement.isRewardedVideo()));
        Platform platform = this$0.platform;
        if (platform != null) {
            j.a(e0Var, "isSilent", Boolean.valueOf(platform.isSilentModeEnabled()));
        }
        Long l10 = this$0.loadDuration;
        if (l10 != null) {
            l10.longValue();
            j.b(e0Var, "timeLoaded", this$0.loadDuration);
        }
        if (this$0.collectConsent) {
            j.a(e0Var, "consentRequired", Boolean.TRUE);
            j.c(e0Var, "consentTitleText", this$0.gdprTitle);
            j.c(e0Var, "consentBodyText", this$0.gdprBody);
            j.c(e0Var, "consentAcceptButtonText", this$0.gdprAccept);
            j.c(e0Var, "consentDenyButtonText", this$0.gdprDeny);
        } else {
            j.a(e0Var, "consentRequired", Boolean.FALSE);
        }
        j.c(e0Var, "sdkVersion", BuildConfig.VERSION_NAME);
        String str = "window.vungle.mraidBridge.notifyPropertiesChange(" + e0Var.a() + ',' + z10 + ')';
        WebView webView = this$0.loadedWebView;
        if (webView != null) {
            this$0.runJavascriptOnWebView(webView, str);
        }
    }

    private final void runJavascriptOnWebView(WebView webView, String str) {
        Logger.Companion.w(TAG, new C24291(str));
        ThreadUtil.INSTANCE.runOnUiThread(new C24302(webView, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-11$lambda-10$lambda-9, reason: not valid java name */
    public static final void m298shouldOverrideUrlLoading$lambda11$lambda10$lambda9(WebViewAPI.MraidDelegate it, String command, d0 args, VungleWebClient this$0, WebView webView) {
        t.f(it, "$it");
        t.f(command, "$command");
        t.f(args, "$args");
        t.f(this$0, "this$0");
        if (it.processCommand(command, args)) {
            this$0.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-11$lambda-5, reason: not valid java name */
    public static final void m299shouldOverrideUrlLoading$lambda11$lambda5(VungleWebClient this$0, WebView webView) {
        t.f(this$0, "this$0");
        this$0.runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyReadyEvent(" + this$0.advertisement.createMRAIDArgs() + ')');
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-11$lambda-6, reason: not valid java name */
    public static final void m300shouldOverrideUrlLoading$lambda11$lambda6(VungleWebClient this$0, WebView webView) {
        t.f(this$0, "this$0");
        PreloadDelegate preloadDelegate = this$0.delegate;
        if (preloadDelegate != null) {
            preloadDelegate.onAdReadyToPlay();
        }
        this$0.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-11$lambda-7, reason: not valid java name */
    public static final void m301shouldOverrideUrlLoading$lambda11$lambda7(VungleWebClient this$0, WebView webView) {
        t.f(this$0, "this$0");
        PreloadDelegate preloadDelegate = this$0.delegate;
        if (preloadDelegate != null) {
            preloadDelegate.onAdFailedToPlay();
        }
        this$0.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
    }

    public final boolean getCollectConsent$vungle_ads_release() {
        return this.collectConsent;
    }

    public final WebViewAPI.WebClientErrorHandler getErrorHandler$vungle_ads_release() {
        return this.errorHandler;
    }

    public final String getGdprAccept$vungle_ads_release() {
        return this.gdprAccept;
    }

    public final String getGdprBody$vungle_ads_release() {
        return this.gdprBody;
    }

    public final String getGdprDeny$vungle_ads_release() {
        return this.gdprDeny;
    }

    public final String getGdprTitle$vungle_ads_release() {
        return this.gdprTitle;
    }

    public final WebView getLoadedWebView$vungle_ads_release() {
        return this.loadedWebView;
    }

    public final WebViewAPI.MraidDelegate getMraidDelegate$vungle_ads_release() {
        return this.mraidDelegate;
    }

    public final boolean getReady$vungle_ads_release() {
        return this.ready;
    }

    public final WebViewObserver getWebViewObserver$vungle_ads_release() {
        return this.webViewObserver;
    }

    public final void handleBlackScreenDetection(int i10) {
        getBlackScreenDetector().start(this.loadedWebView, i10, new AnonymousClass1());
    }

    public final Boolean isViewable$vungle_ads_release() {
        return this.isViewable;
    }

    public final void notifyBlackScreenResult(int i10, String errorMessage) {
        t.f(errorMessage, "errorMessage");
        WebView webView = this.loadedWebView;
        if (webView != null) {
            runJavascriptOnWebView(webView, "window.vungle.mraidBridgeExt.notifyBlackScreenResult(" + i10 + ')');
        }
        Logger.Companion.d(TAG, "Returning black screen result: " + i10 + '%');
        if (i10 >= 0) {
            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.BLACK_SCREEN_IS_DETECTED, i10, this.advertisement.getLogEntry$vungle_ads_release(), null, 8, null);
        } else {
            AnalyticsClient.INSTANCE.logError$vungle_ads_release(Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR, errorMessage, this.advertisement.getLogEntry$vungle_ads_release());
        }
    }

    public final void notifyDiskAvailableSize(long j10, long j11) {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            runJavascriptOnWebView(webView, "window.vungle.mraidBridgeExt.notifyAvailableDiskSpace(" + j10 + '-' + j11 + ')');
        }
    }

    public final void notifyPresentAppStoreFailed() {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            runJavascriptOnWebView(webView, "window.vungle.mraidBridgeExt.notifyPresentAppStoreFailed(0)");
        }
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void notifyPropertiesChange(final boolean z10) {
        this.offloadExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.ui.c
            @Override // java.lang.Runnable
            public final void run() {
                VungleWebClient.m297notifyPropertiesChange$lambda19(z10, this);
            }
        });
    }

    @Override // com.vungle.ads.internal.util.OnSilentModeChangeListener
    public void notifySilentModeChange(boolean z10) {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            e0 e0Var = new e0();
            j.a(e0Var, "isSilent", Boolean.valueOf(z10));
            runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyPropertiesChange(" + e0Var.a() + ')');
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        Logger.Companion.w(TAG, C24271.INSTANCE);
        if (webView == null) {
            return;
        }
        this.loadedWebView = webView;
        webView.setVisibility(0);
        notifyPropertiesChange(true);
        if (Build.VERSION.SDK_INT >= 29) {
            webView.setWebViewRenderProcessClient(new VungleWebViewRenderProcessClient(this.errorHandler));
        }
        WebViewObserver webViewObserver = this.webViewObserver;
        if (webViewObserver != null) {
            webViewObserver.onPageFinished(webView);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String description, String failingUrl) {
        t.f(description, "description");
        t.f(failingUrl, "failingUrl");
        super.onReceivedError(webView, i10, description, failingUrl);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        String strValueOf = String.valueOf(webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null);
        String strValueOf2 = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
        boolean z10 = webResourceRequest != null && webResourceRequest.isForMainFrame();
        Logger.Companion.e(TAG, "Http Error desc " + strValueOf + ' ' + z10 + " for URL " + strValueOf2);
        handleWebViewError(strValueOf, strValueOf2, isCriticalAsset(strValueOf2) && z10);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        this.loadedWebView = null;
        if (Build.VERSION.SDK_INT < 26) {
            Logger.Companion.w(TAG, new C24281(webView));
            WebViewAPI.WebClientErrorHandler webClientErrorHandler = this.errorHandler;
            if (webClientErrorHandler != null) {
                return webClientErrorHandler.onWebRenderingProcessGone(webView, Boolean.TRUE);
            }
            return true;
        }
        Logger.Companion.w(TAG, new AnonymousClass2(webView, renderProcessGoneDetail));
        WebViewAPI.WebClientErrorHandler webClientErrorHandler2 = this.errorHandler;
        if (webClientErrorHandler2 != null) {
            return webClientErrorHandler2.onWebRenderingProcessGone(webView, renderProcessGoneDetail != null ? Boolean.valueOf(renderProcessGoneDetail.didCrash()) : null);
        }
        return true;
    }

    public final q<Long, Long> parseRange$vungle_ads_release(String str, long j10) {
        Object objC;
        q qVar;
        try {
            r.a aVar = r.f27774b;
            if (str != null && c0.O(str, "bytes=", false, 2, null)) {
                List listK0 = f0.K0(f0.B0(str, "bytes="), new String[]{"-"}, false, 0, 6, null);
                String str2 = (String) b0.Q(listK0, 0);
                Long lR = str2 != null ? rd.b0.r(str2) : null;
                String str3 = (String) b0.Q(listK0, 1);
                Long lR2 = str3 != null ? rd.b0.r(str3) : null;
                if (lR == null) {
                    if (lR2 == null) {
                        lR = 0L;
                    } else {
                        lR = Long.valueOf(j10 - lR2.longValue());
                        lR2 = null;
                    }
                }
                qVar = new q(lR, lR2);
            } else {
                qVar = new q(0L, null);
            }
            objC = r.c(qVar);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            objC = r.c(s.a(th));
        }
        if (r.g(objC) != null) {
            objC = new q(0L, null);
        }
        return (q) objC;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setAdVisibility(boolean z10) {
        this.isViewable = Boolean.valueOf(z10);
        WebView webView = this.loadedWebView;
        if (webView != null) {
            e0 e0Var = new e0();
            j.a(e0Var, "isViewable", Boolean.valueOf(z10));
            runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyPropertiesChange(" + e0Var.a() + ')');
        }
    }

    public final void setCollectConsent$vungle_ads_release(boolean z10) {
        this.collectConsent = z10;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setConsentStatus(boolean z10, String str, String str2, String str3, String str4) {
        this.collectConsent = z10;
        this.gdprTitle = str;
        this.gdprBody = str2;
        this.gdprAccept = str3;
        this.gdprDeny = str4;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setErrorHandler(WebViewAPI.WebClientErrorHandler errorHandler) {
        t.f(errorHandler, "errorHandler");
        this.errorHandler = errorHandler;
    }

    public final void setErrorHandler$vungle_ads_release(WebViewAPI.WebClientErrorHandler webClientErrorHandler) {
        this.errorHandler = webClientErrorHandler;
    }

    public final void setGdprAccept$vungle_ads_release(String str) {
        this.gdprAccept = str;
    }

    public final void setGdprBody$vungle_ads_release(String str) {
        this.gdprBody = str;
    }

    public final void setGdprDeny$vungle_ads_release(String str) {
        this.gdprDeny = str;
    }

    public final void setGdprTitle$vungle_ads_release(String str) {
        this.gdprTitle = str;
    }

    public final void setLoadedWebView$vungle_ads_release(WebView webView) {
        this.loadedWebView = webView;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setMraidDelegate(WebViewAPI.MraidDelegate mraidDelegate) {
        this.mraidDelegate = mraidDelegate;
    }

    public final void setMraidDelegate$vungle_ads_release(WebViewAPI.MraidDelegate mraidDelegate) {
        this.mraidDelegate = mraidDelegate;
    }

    public final void setReady$vungle_ads_release(boolean z10) {
        this.ready = z10;
    }

    public final void setViewable$vungle_ads_release(Boolean bool) {
        this.isViewable = bool;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setWebViewObserver(WebViewObserver webViewObserver) {
        this.webViewObserver = webViewObserver;
    }

    public final void setWebViewObserver$vungle_ads_release(WebViewObserver webViewObserver) {
        this.webViewObserver = webViewObserver;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String scheme;
        Uri url = webResourceRequest != null ? webResourceRequest.getUrl() : null;
        if (url == null || (scheme = url.getScheme()) == null) {
            return null;
        }
        Locale ROOT = Locale.ROOT;
        t.e(ROOT, "ROOT");
        String lowerCase = scheme.toLowerCase(ROOT);
        t.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (lowerCase == null) {
            return null;
        }
        if (!t.a(lowerCase, "http") && !t.a(lowerCase, "https")) {
            return null;
        }
        if (!this.advertisement.isPartialDownloadEnabled()) {
            Logger.Companion.w(TAG, C24311.INSTANCE);
            return null;
        }
        String string = url.toString();
        t.e(string, "uri.toString()");
        AdAsset localPartialDownloadAssets = this.advertisement.getLocalPartialDownloadAssets(string);
        String localPath = localPartialDownloadAssets != null ? localPartialDownloadAssets.getLocalPath() : null;
        if (localPath == null || localPath.length() == 0) {
            return null;
        }
        File file = new File(localPath);
        if (!file.exists()) {
            return null;
        }
        long contentLength = localPartialDownloadAssets.getContentLength();
        if (contentLength <= 0) {
            return null;
        }
        long length = file.length();
        String str = webResourceRequest.getRequestHeaders().get("Range");
        this.partialDownloadMetric.setMeta(str + " cached:" + length + ' ' + string);
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.partialDownloadMetric, this.advertisement.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        q<Long, Long> range$vungle_ads_release = parseRange$vungle_ads_release(str, contentLength);
        localPartialDownloadAssets.setRangeStart(range$vungle_ads_release.e().longValue());
        localPartialDownloadAssets.setRangeEnd(range$vungle_ads_release.f());
        long jLongValue = range$vungle_ads_release.b().longValue();
        Long lC = range$vungle_ads_release.c();
        long j10 = length - jLongValue;
        Logger.Companion companion = Logger.Companion;
        companion.i(TAG, ">>request: " + url + " rangeStart=" + jLongValue + " rangeEnd=" + lC + " cachedFileLength=" + length + " availableBytes=" + j10 + " contentLength=" + contentLength + ' ');
        if (j10 <= 0) {
            companion.w(TAG, new AnonymousClass3(str));
            localPartialDownloadAssets.waitForDownload();
            length = file.length();
        }
        long jLongValue2 = lC != null ? lC.longValue() : length - 1;
        long j11 = (jLongValue2 - jLongValue) + 1;
        try {
            r.a aVar = r.f27774b;
            FileInputStream fileInputStream = new FileInputStream(file);
            WebResourceResponse webResourceResponse = new WebResourceResponse(localPartialDownloadAssets.getMimeType(), Constants.ENCODING, 206, "Partial Content", o0.k(w.a("Content-Type", localPartialDownloadAssets.getMimeType()), w.a("Accept-Ranges", "bytes"), w.a("Content-Length", String.valueOf(j11)), w.a("Content-Range", "bytes " + jLongValue + '-' + jLongValue2 + '/' + contentLength)), new BufferedInputStream(fileInputStream, 1024));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("<<Return:");
            sb2.append(webResourceResponse.getResponseHeaders());
            companion.i(TAG, sb2.toString());
            return webResourceResponse;
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            Throwable thG = r.g(r.c(s.a(th)));
            if (thG != null) {
                Logger.Companion.e(TAG, "Error serving local range video: " + thG.getMessage(), thG);
                this.partialDownloadErrorMetric.setMeta(string + ' ' + thG.getMessage());
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.partialDownloadErrorMetric, this.advertisement.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            }
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00b6 A[Catch: all -> 0x0162, TryCatch #0 {all -> 0x0162, blocks: (B:3:0x0003, B:5:0x001c, B:11:0x0028, B:13:0x002e, B:15:0x003d, B:22:0x004a, B:24:0x0056, B:26:0x005c, B:46:0x00b2, B:48:0x00b6, B:51:0x00be, B:52:0x00cb, B:54:0x00d1, B:55:0x00e4, B:33:0x0070, B:36:0x0079, B:37:0x0085, B:40:0x008e, B:41:0x0099, B:43:0x00a1, B:45:0x00a5, B:62:0x0107, B:57:0x00f6, B:59:0x00fe, B:64:0x0136, B:66:0x014e), top: B:73:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00be A[Catch: all -> 0x0162, TryCatch #0 {all -> 0x0162, blocks: (B:3:0x0003, B:5:0x001c, B:11:0x0028, B:13:0x002e, B:15:0x003d, B:22:0x004a, B:24:0x0056, B:26:0x005c, B:46:0x00b2, B:48:0x00b6, B:51:0x00be, B:52:0x00cb, B:54:0x00d1, B:55:0x00e4, B:33:0x0070, B:36:0x0079, B:37:0x0085, B:40:0x008e, B:41:0x0099, B:43:0x00a1, B:45:0x00a5, B:62:0x0107, B:57:0x00f6, B:59:0x00fe, B:64:0x0136, B:66:0x014e), top: B:73:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d1 A[Catch: all -> 0x0162, LOOP:0: B:52:0x00cb->B:54:0x00d1, LOOP_END, TryCatch #0 {all -> 0x0162, blocks: (B:3:0x0003, B:5:0x001c, B:11:0x0028, B:13:0x002e, B:15:0x003d, B:22:0x004a, B:24:0x0056, B:26:0x005c, B:46:0x00b2, B:48:0x00b6, B:51:0x00be, B:52:0x00cb, B:54:0x00d1, B:55:0x00e4, B:33:0x0070, B:36:0x0079, B:37:0x0085, B:40:0x008e, B:41:0x0099, B:43:0x00a1, B:45:0x00a5, B:62:0x0107, B:57:0x00f6, B:59:0x00fe, B:64:0x0136, B:66:0x014e), top: B:73:0x0003 }] */
    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(final WebView webView, String str) {
        final WebViewAPI.MraidDelegate mraidDelegate;
        e0 e0Var;
        try {
            Logger.Companion companion = Logger.Companion;
            companion.d(TAG, "MRAID Command " + str);
            if (str == null || str.length() == 0) {
                companion.e(TAG, "Invalid URL ");
                return false;
            }
            Uri uri = Uri.parse(str);
            t.e(uri, "parse(this)");
            String scheme = uri.getScheme();
            if (scheme == null || scheme.length() == 0) {
                return false;
            }
            String scheme2 = uri.getScheme();
            if (!t.a(scheme2, "mraid")) {
                if (!c0.B("http", scheme2, true)) {
                    if (c0.B("https", scheme2, true)) {
                    }
                }
                companion.d(TAG, "Open URL" + str);
                WebViewAPI.MraidDelegate mraidDelegate2 = this.mraidDelegate;
                if (mraidDelegate2 != null) {
                    e0 e0Var2 = new e0();
                    j.c(e0Var2, "url", str);
                    mraidDelegate2.processCommand("openNonMraid", e0Var2.a());
                }
                return true;
            }
            final String host = uri.getHost();
            if (host != null) {
                int iHashCode = host.hashCode();
                if (iHashCode != -1943542072) {
                    if (iHashCode != 88409791) {
                        if (iHashCode == 119543762 && host.equals("readyToPlay")) {
                            this.offloadExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.ui.e
                                @Override // java.lang.Runnable
                                public final void run() {
                                    VungleWebClient.m300shouldOverrideUrlLoading$lambda11$lambda6(this.f13102a, webView);
                                }
                            });
                        } else {
                            mraidDelegate = this.mraidDelegate;
                            if (mraidDelegate == null) {
                                runJavascriptOnWebView(webView, COMMAND_COMPLETE);
                                return true;
                            }
                            if (mraidDelegate != null) {
                                e0Var = new e0();
                                for (String param : uri.getQueryParameterNames()) {
                                    t.e(param, "param");
                                    j.c(e0Var, param, uri.getQueryParameter(param));
                                }
                                final d0 d0VarA = e0Var.a();
                                this.offloadExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.ui.g
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        VungleWebClient.m298shouldOverrideUrlLoading$lambda11$lambda10$lambda9(mraidDelegate, host, d0VarA, this, webView);
                                    }
                                });
                            }
                        }
                    } else if (host.equals("failToLoad")) {
                        this.offloadExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.ui.f
                            @Override // java.lang.Runnable
                            public final void run() {
                                VungleWebClient.m301shouldOverrideUrlLoading$lambda11$lambda7(this.f13104a, webView);
                            }
                        });
                    } else {
                        mraidDelegate = this.mraidDelegate;
                        if (mraidDelegate == null) {
                            runJavascriptOnWebView(webView, COMMAND_COMPLETE);
                            return true;
                        }
                        if (mraidDelegate != null) {
                            e0Var = new e0();
                            while (r2.hasNext()) {
                                t.e(param, "param");
                                j.c(e0Var, param, uri.getQueryParameter(param));
                            }
                            final d0 d0VarA2 = e0Var.a();
                            this.offloadExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.ui.g
                                @Override // java.lang.Runnable
                                public final void run() {
                                    VungleWebClient.m298shouldOverrideUrlLoading$lambda11$lambda10$lambda9(mraidDelegate, host, d0VarA2, this, webView);
                                }
                            });
                        }
                    }
                } else if (!host.equals("propertiesChangeCompleted")) {
                    mraidDelegate = this.mraidDelegate;
                    if (mraidDelegate == null) {
                        runJavascriptOnWebView(webView, COMMAND_COMPLETE);
                        return true;
                    }
                    if (mraidDelegate != null) {
                        e0Var = new e0();
                        while (r2.hasNext()) {
                            t.e(param, "param");
                            j.c(e0Var, param, uri.getQueryParameter(param));
                        }
                        final d0 d0VarA3 = e0Var.a();
                        this.offloadExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.ui.g
                            @Override // java.lang.Runnable
                            public final void run() {
                                VungleWebClient.m298shouldOverrideUrlLoading$lambda11$lambda10$lambda9(mraidDelegate, host, d0VarA3, this, webView);
                            }
                        });
                    }
                } else if (!this.ready) {
                    this.ready = true;
                    this.offloadExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.ui.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            VungleWebClient.m299shouldOverrideUrlLoading$lambda11$lambda5(this.f13100a, webView);
                        }
                    });
                }
                return true;
            }
            this.skippedUrlMetric.setMeta("url: " + str);
            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.skippedUrlMetric, this.advertisement.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            companion.w(TAG, new C24323(str));
            return false;
        } catch (Throwable th) {
            if (th instanceof OutOfMemoryError) {
                new OutOfMemory("mraid:" + str).logErrorNoReturnValue$vungle_ads_release();
            }
            return false;
        }
    }

    public VungleWebClient(AdPayload advertisement, Placement placement, ExecutorService offloadExecutor, Platform platform, PreloadDelegate preloadDelegate, Long l10) {
        t.f(advertisement, "advertisement");
        t.f(placement, "placement");
        t.f(offloadExecutor, "offloadExecutor");
        this.advertisement = advertisement;
        this.placement = placement;
        this.offloadExecutor = offloadExecutor;
        this.platform = platform;
        this.delegate = preloadDelegate;
        this.loadDuration = l10;
        this.blackScreenDetector$delegate = m.a(VungleWebClient$blackScreenDetector$2.INSTANCE);
        Sdk.SDKMetric.SDKMetricType sDKMetricType = Sdk.SDKMetric.SDKMetricType.AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET;
        this.partialDownloadMetric = new OneShotSingleValueMetric(sDKMetricType);
        this.partialDownloadErrorMetric = new OneShotSingleValueMetric(sDKMetricType);
        this.skippedUrlMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        String strValueOf = String.valueOf(webResourceError != null ? webResourceError.getDescription() : null);
        String strValueOf2 = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
        boolean z10 = webResourceRequest != null && webResourceRequest.isForMainFrame();
        Logger.Companion.e(TAG, "Error desc " + strValueOf + ' ' + z10 + " for URL " + strValueOf2);
        handleWebViewError(strValueOf, strValueOf2, isCriticalAsset(strValueOf2) && z10);
    }

    public static /* synthetic */ void getCollectConsent$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getErrorHandler$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprAccept$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprBody$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprDeny$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprTitle$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getLoadedWebView$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getMraidDelegate$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getReady$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getWebViewObserver$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void isViewable$vungle_ads_release$annotations() {
    }
}
