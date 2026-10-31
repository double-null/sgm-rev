package com.vungle.ads.internal.presenter;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import com.vungle.ads.AdConfig;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.IndexHtmlError;
import com.vungle.ads.LinkError;
import com.vungle.ads.MraidTemplateError;
import com.vungle.ads.NetworkUnreachable;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.VungleError;
import com.vungle.ads.WebViewError;
import com.vungle.ads.WebViewRenderProcessUnresponsive;
import com.vungle.ads.WebViewRenderingProcessGone;
import com.vungle.ads.internal.ClickCoordinateTracker;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.CommonRequestBody;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.network.Call;
import com.vungle.ads.internal.network.Callback;
import com.vungle.ads.internal.network.Response;
import com.vungle.ads.internal.network.TpatRequest;
import com.vungle.ads.internal.network.TpatSender;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.omsdk.OMTracker;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.ui.PresenterAdOpenCallback;
import com.vungle.ads.internal.ui.VungleWebClient;
import com.vungle.ads.internal.ui.view.MRAIDAdWidget;
import com.vungle.ads.internal.ui.view.WebViewAPI;
import com.vungle.ads.internal.util.ExternalRouter;
import com.vungle.ads.internal.util.HandlerScheduler;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.ThreadUtil;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.o0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import wc.g0;
import wc.k;
import wc.m;
import wc.o;
import wc.q;
import wc.w;

/* JADX INFO: compiled from: MRAIDPresenter.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class MRAIDPresenter implements WebViewAPI.MraidDelegate, WebViewAPI.WebClientErrorHandler {
    private static final String ACTION = "action";
    public static final String ACTION_WITH_VALUE = "actionWithValue";
    public static final String CLOSE = "close";
    public static final String CONSENT_ACTION = "consentAction";
    public static final String DETECT_BLACK_SCREEN = "detectBlackScreen";
    public static final String ERROR = "error";
    public static final String GET_AVAILABLE_DISK_SPACE = "getAvailableDiskSpace";
    public static final String OPEN = "open";
    private static final String OPEN_APP_STORE = "openAppStore";
    private static final String OPEN_NON_MRAID = "openNonMraid";
    public static final String OPEN_PRIVACY = "openPrivacy";
    public static final String PING_URL = "pingUrl";
    public static final String SET_ORIENTATION_PROPERTIES = "setOrientationProperties";
    public static final String SUCCESSFUL_VIEW = "successfulView";
    private static final String TAG = "MRAIDPresenter";
    public static final String TPAT = "tpat";
    public static final String UPDATE_SIGNALS = "updateSignals";
    private static final String USE_CUSTOM_CLOSE = "useCustomClose";
    private static final String USE_CUSTOM_PRIVACY = "useCustomPrivacy";
    public static final String VIDEO_LENGTH = "videoLength";
    private Long adStartTime;
    private final MRAIDAdWidget adWidget;
    private final AdPayload advertisement;
    private OpenActivityDelegate appStoreDelegate;
    private boolean backEnabled;
    private AdEventListener bus;
    private final k clickCoordinateTracker$delegate;
    private boolean cp0Fired;
    private Executor executor;
    private final AtomicBoolean isDestroying;
    private long lastUserInteractionTimestamp;
    private final k logEntry$delegate;
    private final OMTracker omTracker;
    private final k pathProvider$delegate;
    private final Placement placement;
    private final Platform platform;
    private PresenterDelegate presenterDelegate;
    private final k scheduler$delegate;
    private final AtomicBoolean sendReportIncentivized;
    private final k signalManager$delegate;
    private final k tpatSender$delegate;
    private String userId;
    private long videoLength;
    private final k vungleApiClient$delegate;
    private final VungleWebClient vungleWebClient;
    public static final Companion Companion = new Companion(null);
    private static final Map<String, Sdk.SDKMetric.SDKMetricType> eventMap = o0.k(w.a(Constants.CHECKPOINT_0, Sdk.SDKMetric.SDKMetricType.AD_START_EVENT), w.a(Constants.CLICK_URL, Sdk.SDKMetric.SDKMetricType.AD_CLICK_EVENT));

    /* JADX INFO: renamed from: com.vungle.ads.internal.presenter.MRAIDPresenter$closeView$2, reason: invalid class name */
    /* JADX INFO: compiled from: MRAIDPresenter.kt */
    static final class AnonymousClass2 extends u implements id.a<g0> {
        AnonymousClass2() {
            super(0);
        }

        @Override // id.a
        public /* bridge */ /* synthetic */ g0 invoke() {
            invoke2();
            return g0.f27756a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MRAIDPresenter.this.adWidget.close();
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.presenter.MRAIDPresenter$logInlineInstallFailure$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: MRAIDPresenter.kt */
    static final class C24251 extends u implements id.a<g0> {
        C24251() {
            super(0);
        }

        @Override // id.a
        public /* bridge */ /* synthetic */ g0 invoke() {
            invoke2();
            return g0.f27756a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MRAIDPresenter.this.vungleWebClient.notifyPresentAppStoreFailed();
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.presenter.MRAIDPresenter$processCommand$3, reason: invalid class name */
    /* JADX INFO: compiled from: MRAIDPresenter.kt */
    static final class AnonymousClass3 extends u implements id.a<g0> {
        AnonymousClass3() {
            super(0);
        }

        @Override // id.a
        public /* bridge */ /* synthetic */ g0 invoke() {
            invoke2();
            return g0.f27756a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MRAIDPresenter.this.adWidget.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.presenter.MRAIDPresenter$processCommand$7, reason: invalid class name */
    /* JADX INFO: compiled from: MRAIDPresenter.kt */
    static final class AnonymousClass7 extends u implements id.a<g0> {
        final /* synthetic */ MraidTemplateError $exception;
        final /* synthetic */ boolean $isFatal;
        final /* synthetic */ String $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass7(MraidTemplateError mraidTemplateError, boolean z10, String str) {
            super(0);
            this.$exception = mraidTemplateError;
            this.$isFatal = z10;
            this.$message = str;
        }

        @Override // id.a
        public /* bridge */ /* synthetic */ g0 invoke() {
            invoke2();
            return g0.f27756a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MRAIDPresenter.this.handleWebViewException(this.$exception, this.$isFatal, this.$message);
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.presenter.MRAIDPresenter$processCommand$8, reason: invalid class name */
    /* JADX INFO: compiled from: MRAIDPresenter.kt */
    static final class AnonymousClass8 extends u implements id.a<g0> {
        final /* synthetic */ long $availableDiskSpace;
        final /* synthetic */ long $webviewSize;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass8(long j10, long j11) {
            super(0);
            this.$availableDiskSpace = j10;
            this.$webviewSize = j11;
        }

        @Override // id.a
        public /* bridge */ /* synthetic */ g0 invoke() {
            invoke2();
            return g0.f27756a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MRAIDPresenter.this.vungleWebClient.notifyDiskAvailableSize(this.$availableDiskSpace, this.$webviewSize);
        }
    }

    public MRAIDPresenter(MRAIDAdWidget adWidget, AdPayload advertisement, Placement placement, VungleWebClient vungleWebClient, Executor executor, OMTracker omTracker, Platform platform) {
        t.f(adWidget, "adWidget");
        t.f(advertisement, "advertisement");
        t.f(placement, "placement");
        t.f(vungleWebClient, "vungleWebClient");
        t.f(executor, "executor");
        t.f(omTracker, "omTracker");
        t.f(platform, "platform");
        this.adWidget = adWidget;
        this.advertisement = advertisement;
        this.placement = placement;
        this.vungleWebClient = vungleWebClient;
        this.executor = executor;
        this.omTracker = omTracker;
        this.platform = platform;
        this.isDestroying = new AtomicBoolean(false);
        this.sendReportIncentivized = new AtomicBoolean(false);
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        Context context = adWidget.getContext();
        t.e(context, "adWidget.context");
        o oVar = o.SYNCHRONIZED;
        this.vungleApiClient$delegate = m.b(oVar, new MRAIDPresenter$special$$inlined$inject$1(context));
        Context context2 = adWidget.getContext();
        t.e(context2, "adWidget.context");
        this.pathProvider$delegate = m.b(oVar, new MRAIDPresenter$special$$inlined$inject$2(context2));
        Context context3 = adWidget.getContext();
        t.e(context3, "adWidget.context");
        this.signalManager$delegate = m.b(oVar, new MRAIDPresenter$special$$inlined$inject$3(context3));
        Context context4 = adWidget.getContext();
        t.e(context4, "adWidget.context");
        this.tpatSender$delegate = m.b(oVar, new MRAIDPresenter$special$$inlined$inject$4(context4));
        this.scheduler$delegate = m.a(MRAIDPresenter$scheduler$2.INSTANCE);
        this.logEntry$delegate = m.a(new MRAIDPresenter$logEntry$2(this));
        this.clickCoordinateTracker$delegate = m.a(new MRAIDPresenter$clickCoordinateTracker$2(this));
    }

    private final void closeView() {
        ThreadUtil threadUtil = ThreadUtil.INSTANCE;
        if (threadUtil.isMainThread()) {
            this.executor.execute(new Runnable() { // from class: com.vungle.ads.internal.presenter.c
                @Override // java.lang.Runnable
                public final void run() {
                    MRAIDPresenter.m275closeView$lambda3(this.f13089a);
                }
            });
        } else {
            sendAdCloseEvent();
        }
        threadUtil.runOnUiThread(new AnonymousClass2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: closeView$lambda-3, reason: not valid java name */
    public static final void m275closeView$lambda3(MRAIDPresenter this$0) {
        t.f(this$0, "this$0");
        this$0.sendAdCloseEvent();
    }

    private final PresenterAdOpenCallback createDeeplinkCallback(final String str) {
        return new PresenterAdOpenCallback() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter.createDeeplinkCallback.1
            @Override // com.vungle.ads.internal.ui.PresenterAdOpenCallback
            public void onDeeplinkClick(boolean z10) {
                if (!z10) {
                    new LinkError(Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED, "Fail to open " + str).setLogEntry$vungle_ads_release(this.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                }
                List tpatUrls$default = AdPayload.getTpatUrls$default(this.advertisement, Constants.DEEPLINK_CLICK, String.valueOf(z10), null, 4, null);
                if (tpatUrls$default != null) {
                    MRAIDPresenter mRAIDPresenter = this;
                    Iterator it = tpatUrls$default.iterator();
                    while (it.hasNext()) {
                        TpatSender.sendTpat$default(mRAIDPresenter.getTpatSender(), new TpatRequest.Builder((String) it.next()).tpatKey(Constants.DEEPLINK_CLICK).withLogEntry(mRAIDPresenter.getLogEntry()).build(), false, 2, null);
                    }
                }
            }
        };
    }

    public static /* synthetic */ void getAdStartTime$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getBackEnabled$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getBus$annotations() {
    }

    public static /* synthetic */ void getClickCoordinateTracker$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getLastUserInteractionTimestamp$vungle_ads_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LogEntry getLogEntry() {
        return (LogEntry) this.logEntry$delegate.getValue();
    }

    private final PathProvider getPathProvider() {
        return (PathProvider) this.pathProvider$delegate.getValue();
    }

    private final HandlerScheduler getScheduler() {
        return (HandlerScheduler) this.scheduler$delegate.getValue();
    }

    private final SignalManager getSignalManager() {
        return (SignalManager) this.signalManager$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TpatSender getTpatSender() {
        return (TpatSender) this.tpatSender$delegate.getValue();
    }

    public static /* synthetic */ void getUserId$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getVideoLength$vungle_ads_release$annotations() {
    }

    private final VungleApiClient getVungleApiClient() {
        return (VungleApiClient) this.vungleApiClient$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleWebViewException(VungleError vungleError, boolean z10, String str) {
        Logger.Companion.e(TAG, "handleWebViewException: " + vungleError.getLocalizedMessage() + ", fatal: " + z10 + ", errorMsg: " + str);
        vungleError.setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        if (z10) {
            makeBusError(vungleError);
            closeView();
        }
    }

    static /* synthetic */ void handleWebViewException$default(MRAIDPresenter mRAIDPresenter, VungleError vungleError, boolean z10, String str, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        mRAIDPresenter.handleWebViewException(vungleError, z10, str);
    }

    public static /* synthetic */ void isDestroying$vungle_ads_release$annotations() {
    }

    private final boolean launchInlineInstall(String str) {
        q<Boolean, String> qVar;
        ExternalRouter externalRouter = ExternalRouter.INSTANCE;
        Context context = this.adWidget.getContext();
        t.e(context, "adWidget.context");
        Intent intentFromUrl$vungle_ads_release = externalRouter.getIntentFromUrl$vungle_ads_release(context, str);
        if (intentFromUrl$vungle_ads_release == null) {
            logInlineInstallFailure("url: " + str + ", message: intent is null");
            return false;
        }
        q<Boolean, String> qVarCheckInlineInstallIntent$vungle_ads_release = checkInlineInstallIntent$vungle_ads_release(intentFromUrl$vungle_ads_release);
        boolean zBooleanValue = qVarCheckInlineInstallIntent$vungle_ads_release.b().booleanValue();
        String strC = qVarCheckInlineInstallIntent$vungle_ads_release.c();
        if (!zBooleanValue) {
            logInlineInstallFailure("url: " + str + ", message: resolveInfo " + strC);
            return false;
        }
        OpenActivityDelegate openActivityDelegate = this.appStoreDelegate;
        if (openActivityDelegate == null || (qVar = openActivityDelegate.openInlineInstall(intentFromUrl$vungle_ads_release)) == null) {
            qVar = new q<>(Boolean.FALSE, null);
        }
        boolean zBooleanValue2 = qVar.b().booleanValue();
        String strC2 = qVar.c();
        if (zBooleanValue2) {
            logInlineInstallSuccess$vungle_ads_release("url: " + str);
            return true;
        }
        logInlineInstallFailure("url: " + str + ", message: " + strC2);
        return false;
    }

    private final VungleError loadMraidAd() {
        String indexFilePath = this.advertisement.getIndexFilePath();
        File file = indexFilePath != null ? new File(indexFilePath) : null;
        if (file == null || !file.exists()) {
            Sdk.SDKError.Reason reason = Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Fail to load html ");
            sb2.append(file != null ? file.getPath() : null);
            return new IndexHtmlError(reason, sb2.toString());
        }
        this.adWidget.linkWebView(this.vungleWebClient, this.advertisement.getWebViewSettings());
        this.adWidget.showWebsite(AdPayload.FILE_SCHEME + file.getPath());
        return null;
    }

    private final void logInlineInstallFailure(String str) {
        ThreadUtil.INSTANCE.runOnUiThread(new C24251());
        SingleValueMetric singleValueMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.INLINE_INSTALL_STATUS);
        singleValueMetric.setValue(2L);
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        analyticsClient.logMetric$vungle_ads_release(singleValueMetric, getLogEntry(), str);
        analyticsClient.logError$vungle_ads_release(Sdk.SDKError.Reason.INLINE_INSTALL_ERROR, String.valueOf(str), getLogEntry());
    }

    static /* synthetic */ void logInlineInstallFailure$default(MRAIDPresenter mRAIDPresenter, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        mRAIDPresenter.logInlineInstallFailure(str);
    }

    public static /* synthetic */ void logInlineInstallSuccess$vungle_ads_release$default(MRAIDPresenter mRAIDPresenter, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        mRAIDPresenter.logInlineInstallSuccess$vungle_ads_release(str);
    }

    private final void makeBusError(VungleError vungleError) {
        AdEventListener adEventListener = this.bus;
        if (adEventListener != null) {
            adEventListener.onError(vungleError, this.placement.getReferenceId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: prepare$lambda-15, reason: not valid java name */
    public static final void m276prepare$lambda15(MRAIDPresenter this$0) {
        t.f(this$0, "this$0");
        this$0.backEnabled = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: processCommand$lambda-11, reason: not valid java name */
    public static final void m277processCommand$lambda11(final MRAIDPresenter this$0) {
        t.f(this$0, "this$0");
        List list = null;
        CommonRequestBody.AdSizeParam adSizeParam = null;
        Call<Void> callRi = this$0.getVungleApiClient().ri(new CommonRequestBody.RequestParam(list, adSizeParam, this$0.adStartTime, this$0.advertisement.advAppId(), this$0.placement.getReferenceId(), this$0.userId, (CommonRequestBody.CSBParam) null, 67, (kotlin.jvm.internal.k) null));
        if (callRi != null) {
            callRi.enqueue(new Callback<Void>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$processCommand$6$1
                @Override // com.vungle.ads.internal.network.Callback
                public void onFailure(Call<Void> call, Throwable th) {
                    Logger.Companion.d("MRAIDPresenter", "send RI Failure");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Error RI API calls: ");
                    sb2.append(th != null ? th.getLocalizedMessage() : null);
                    new NetworkUnreachable(sb2.toString()).setLogEntry$vungle_ads_release(this.this$0.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                }

                @Override // com.vungle.ads.internal.network.Callback
                public void onResponse(Call<Void> call, Response<Void> response) {
                    Logger.Companion.d("MRAIDPresenter", "send RI success");
                }
            });
            return;
        }
        Logger.Companion.e(TAG, "Invalid ri call.");
        new NetworkUnreachable("Error RI API for placement: " + this$0.placement.getReferenceId()).setLogEntry$vungle_ads_release(this$0.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
    }

    private final void reportErrorAndCloseAd(VungleError vungleError) {
        vungleError.setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        makeBusError(vungleError);
        closeView();
    }

    private final void sendAdCloseEvent() {
        Long l10 = this.adStartTime;
        if (l10 != null) {
            List<String> tpatUrls = this.advertisement.getTpatUrls(Constants.AD_CLOSE, String.valueOf(System.currentTimeMillis() - l10.longValue()), String.valueOf(this.platform.getVolumeLevel()));
            if (tpatUrls != null) {
                Iterator<T> it = tpatUrls.iterator();
                while (it.hasNext()) {
                    TpatSender.sendTpat$default(getTpatSender(), new TpatRequest.Builder((String) it.next()).tpatKey(Constants.AD_CLOSE).withLogEntry(getLogEntry()).build(), false, 2, null);
                }
            }
        }
    }

    private final void triggerEventMetricForTpat(String str) {
        Sdk.SDKMetric.SDKMetricType sDKMetricType = eventMap.get(str);
        if (sDKMetricType != null) {
            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, new SingleValueMetric(sDKMetricType), getLogEntry(), (String) null, 4, (Object) null);
        }
    }

    public final q<Boolean, String> checkInlineInstallIntent$vungle_ads_release(Intent intent) {
        t.f(intent, "intent");
        ComponentName componentNameResolveActivity = intent.resolveActivity(this.adWidget.getContext().getPackageManager());
        String packageName = componentNameResolveActivity != null ? componentNameResolveActivity.getPackageName() : null;
        return new q<>(Boolean.valueOf(t.a(packageName, "com.android.vending")), packageName);
    }

    public final void detach(@MRAIDAdWidget.AdStopReason int i10) {
        AdEventListener adEventListener;
        Logger.Companion.d(TAG, "detach()");
        boolean z10 = (i10 & 1) != 0;
        boolean z11 = (i10 & 2) != 0;
        this.vungleWebClient.setWebViewObserver(null);
        this.vungleWebClient.setMraidDelegate(null);
        if (!z10 && z11 && !this.isDestroying.getAndSet(true) && (adEventListener = this.bus) != null) {
            adEventListener.onNext("end", null, this.placement.getReferenceId());
        }
        this.adWidget.destroyWebView(this.omTracker.stop());
    }

    public final Long getAdStartTime$vungle_ads_release() {
        return this.adStartTime;
    }

    public final boolean getBackEnabled$vungle_ads_release() {
        return this.backEnabled;
    }

    public final AdEventListener getBus() {
        return this.bus;
    }

    public final ClickCoordinateTracker getClickCoordinateTracker$vungle_ads_release() {
        return (ClickCoordinateTracker) this.clickCoordinateTracker$delegate.getValue();
    }

    public final long getLastUserInteractionTimestamp$vungle_ads_release() {
        return this.lastUserInteractionTimestamp;
    }

    public final String getUserId$vungle_ads_release() {
        return this.userId;
    }

    public final long getVideoLength$vungle_ads_release() {
        return this.videoLength;
    }

    public final Long getViewStatus() {
        return !this.cp0Fired ? 1L : null;
    }

    public final void handleExit() {
        if (this.backEnabled) {
            this.adWidget.showWebsite("javascript:window.vungle.mraidBridgeExt.requestMRAIDClose()");
        }
    }

    public final AtomicBoolean isDestroying$vungle_ads_release() {
        return this.isDestroying;
    }

    public final void logInlineInstallSuccess$vungle_ads_release(String str) {
        SingleValueMetric singleValueMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.INLINE_INSTALL_STATUS);
        singleValueMetric.setValue(1L);
        AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(singleValueMetric, getLogEntry(), str);
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI.WebClientErrorHandler
    public void onReceivedError(String errorDesc, boolean z10) {
        t.f(errorDesc, "errorDesc");
        if (z10) {
            reportErrorAndCloseAd(new WebViewError(errorDesc));
        }
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI.WebClientErrorHandler
    public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        handleWebViewException$default(this, new WebViewRenderProcessUnresponsive("fatal=true"), true, null, 4, null);
    }

    public final void onViewConfigurationChanged() {
        this.vungleWebClient.notifyPropertiesChange(true);
    }

    public final void onViewTouched(MotionEvent motionEvent) {
        if (motionEvent != null) {
            Logger.Companion.d(TAG, "user interaction");
            this.lastUserInteractionTimestamp = System.currentTimeMillis();
            getClickCoordinateTracker$vungle_ads_release().trackCoordinate(motionEvent);
        }
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI.WebClientErrorHandler
    public boolean onWebRenderingProcessGone(WebView webView, Boolean bool) {
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        handleWebViewException$default(this, new WebViewRenderingProcessGone("didCrash=" + zBooleanValue), zBooleanValue, null, 4, null);
        return true;
    }

    public final void prepare() {
        int i10;
        String alertTitleText;
        String alertBodyText;
        String alertContinueButtonText;
        String alertCloseButtonText;
        VungleError vungleErrorLoadMraidAd;
        int settings;
        boolean z10 = false;
        this.isDestroying.set(false);
        AdConfig adConfig = this.advertisement.getAdConfig();
        if (adConfig != null && (settings = adConfig.getSettings()) > 0) {
            this.backEnabled = (settings & 2) == 2;
        }
        AdConfig adConfig2 = this.advertisement.getAdConfig();
        Integer numValueOf = adConfig2 != null ? Integer.valueOf(adConfig2.getAdOrientation()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            i10 = 7;
        } else {
            i10 = (numValueOf != null && numValueOf.intValue() == 1) ? 6 : 4;
        }
        this.adWidget.setOrientation(i10);
        this.omTracker.start();
        this.vungleWebClient.setMraidDelegate(this);
        this.vungleWebClient.setErrorHandler(this);
        this.vungleWebClient.setAdVisibility(false);
        if (!this.advertisement.usePreloading() && (vungleErrorLoadMraidAd = loadMraidAd()) != null) {
            reportErrorAndCloseAd(vungleErrorLoadMraidAd);
            return;
        }
        this.adStartTime = Long.valueOf(System.currentTimeMillis());
        PresenterDelegate presenterDelegate = this.presenterDelegate;
        this.userId = presenterDelegate != null ? presenterDelegate.getUserId() : null;
        PresenterDelegate presenterDelegate2 = this.presenterDelegate;
        if (presenterDelegate2 == null || (alertTitleText = presenterDelegate2.getAlertTitleText()) == null) {
            alertTitleText = "";
        }
        PresenterDelegate presenterDelegate3 = this.presenterDelegate;
        if (presenterDelegate3 == null || (alertBodyText = presenterDelegate3.getAlertBodyText()) == null) {
            alertBodyText = "";
        }
        PresenterDelegate presenterDelegate4 = this.presenterDelegate;
        if (presenterDelegate4 == null || (alertContinueButtonText = presenterDelegate4.getAlertContinueButtonText()) == null) {
            alertContinueButtonText = "";
        }
        PresenterDelegate presenterDelegate5 = this.presenterDelegate;
        if (presenterDelegate5 == null || (alertCloseButtonText = presenterDelegate5.getAlertCloseButtonText()) == null) {
            alertCloseButtonText = "";
        }
        this.advertisement.setIncentivizedText(alertTitleText, alertBodyText, alertContinueButtonText, alertCloseButtonText);
        ConfigManager configManager = ConfigManager.INSTANCE;
        if (configManager.getGDPRIsCountryDataProtected() && t.a("unknown", PrivacyManager.INSTANCE.getConsentStatus())) {
            z10 = true;
        }
        this.vungleWebClient.setConsentStatus(z10, configManager.getGDPRConsentTitle(), configManager.getGDPRConsentMessage(), configManager.getGDPRButtonAccept(), configManager.getGDPRButtonDeny());
        if (z10) {
            PrivacyManager.INSTANCE.updateGdprConsent("opted_out_by_timeout", "vungle_modal", "");
        }
        int showCloseDelay = this.advertisement.getShowCloseDelay(Boolean.valueOf(this.placement.isRewardedVideo()));
        if (showCloseDelay > 0) {
            getScheduler().schedule(new Runnable() { // from class: com.vungle.ads.internal.presenter.a
                @Override // java.lang.Runnable
                public final void run() {
                    MRAIDPresenter.m276prepare$lambda15(this.f13087a);
                }
            }, showCloseDelay);
        } else {
            this.backEnabled = true;
        }
        AdEventListener adEventListener = this.bus;
        if (adEventListener != null) {
            adEventListener.onNext("start", null, this.placement.getReferenceId());
        }
    }

    public final void setAdStartTime$vungle_ads_release(Long l10) {
        this.adStartTime = l10;
    }

    public final void setAdVisibility(boolean z10) {
        this.vungleWebClient.setAdVisibility(z10);
    }

    public final void setBackEnabled$vungle_ads_release(boolean z10) {
        this.backEnabled = z10;
    }

    public final void setBus(AdEventListener adEventListener) {
        this.bus = adEventListener;
    }

    public final void setEventListener(AdEventListener adEventListener) {
        this.bus = adEventListener;
    }

    public final void setLastUserInteractionTimestamp$vungle_ads_release(long j10) {
        this.lastUserInteractionTimestamp = j10;
    }

    public final void setOpenActivityDelegate$vungle_ads_release(OpenActivityDelegate openActivityDelegate) {
        this.appStoreDelegate = openActivityDelegate;
    }

    public final void setPresenterDelegate$vungle_ads_release(PresenterDelegate presenterDelegate) {
        this.presenterDelegate = presenterDelegate;
    }

    public final void setUserId$vungle_ads_release(String str) {
        this.userId = str;
    }

    public final void setVideoLength$vungle_ads_release(long j10) {
        this.videoLength = j10;
    }

    public final boolean shouldBlockAutoRedirect$vungle_ads_release() {
        ConfigManager configManager = ConfigManager.INSTANCE;
        if (configManager.allowAutoRedirects()) {
            return false;
        }
        return this.lastUserInteractionTimestamp == 0 || System.currentTimeMillis() - this.lastUserInteractionTimestamp > configManager.afterClickDuration();
    }

    public final void start() {
        Logger.Companion.d(TAG, "start()");
        this.adWidget.resumeWeb();
        setAdVisibility(true);
    }

    public final void stop() {
        Logger.Companion.d(TAG, "stop()");
        this.adWidget.pauseWeb();
        setAdVisibility(false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:264:0x064b  */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0262, code lost:
    
        if (r28.equals(com.vungle.ads.internal.presenter.MRAIDPresenter.OPEN_NON_MRAID) == false) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0266, code lost:
    
        r0 = r27.advertisement.adUnit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x026c, code lost:
    
        if (r0 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x026e, code lost:
    
        r11 = r0.getDeeplinkUrl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0272, code lost:
    
        r0 = com.vungle.ads.internal.util.JsonUtil.INSTANCE.getContentStringValue(r29, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x027e, code lost:
    
        if (com.vungle.ads.internal.util.FileUtility.INSTANCE.isValidUrl(r0) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0280, code lost:
    
        new com.vungle.ads.InvalidCTAUrl("Invalid CTA Url (" + r0 + ')').setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02a8, code lost:
    
        if (shouldBlockAutoRedirect$vungle_ads_release() == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02aa, code lost:
    
        r27.lastUserInteractionTimestamp = 0;
        com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, new com.vungle.ads.SingleValueMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT), getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02c7, code lost:
    
        r27.lastUserInteractionTimestamp = 0;
        r18 = com.vungle.ads.internal.util.ExternalRouter.INSTANCE;
        r1 = r27.adWidget.getContext();
        kotlin.jvm.internal.t.e(r1, "adWidget.context");
        r0 = r18.launch$vungle_ads_release(r11, r0, r1, getLogEntry(), createDeeplinkCallback(r11));
        r1 = r27.bus;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02ea, code lost:
    
        if (r1 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02ec, code lost:
    
        r1.onNext(com.vungle.ads.internal.presenter.MRAIDPresenter.OPEN, "adClick", r27.placement.getReferenceId());
        r1 = wc.g0.f27756a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02f7, code lost:
    
        if (r0 == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02f9, code lost:
    
        r0 = r27.bus;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02fb, code lost:
    
        if (r0 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02fd, code lost:
    
        r0.onNext(com.vungle.ads.internal.presenter.MRAIDPresenter.OPEN, "adLeftApplication", r27.placement.getReferenceId());
        r0 = wc.g0.f27756a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x024d, code lost:
    
        if (r28.equals(com.vungle.ads.internal.presenter.MRAIDPresenter.OPEN) == false) goto L267;
     */
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
    @Override // com.vungle.ads.internal.ui.view.WebViewAPI.MraidDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean processCommand(java.lang.String r28, kotlinx.serialization.json.d0 r29) {
        /*
            Method dump skipped, instruction units count: 1752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.presenter.MRAIDPresenter.processCommand(java.lang.String, kotlinx.serialization.json.d0):boolean");
    }

    /* JADX INFO: compiled from: MRAIDPresenter.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final Map<String, Sdk.SDKMetric.SDKMetricType> getEventMap$vungle_ads_release() {
            return MRAIDPresenter.eventMap;
        }

        public static /* synthetic */ void getACTION_WITH_VALUE$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getCLOSE$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getCONSENT_ACTION$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getDETECT_BLACK_SCREEN$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getERROR$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getEventMap$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getGET_AVAILABLE_DISK_SPACE$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getOPEN$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getOPEN_PRIVACY$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getPING_URL$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getSET_ORIENTATION_PROPERTIES$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getSUCCESSFUL_VIEW$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getTPAT$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getUPDATE_SIGNALS$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getVIDEO_LENGTH$vungle_ads_release$annotations() {
        }
    }
}
