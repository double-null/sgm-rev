package com.vungle.ads.internal.ui.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.platform.WebViewUtil;
import com.vungle.ads.internal.presenter.WebViewManager;
import com.vungle.ads.internal.util.HandlerScheduler;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.ViewUtility;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.jvm.internal.t;
import wc.g0;
import wc.k;
import wc.m;
import wc.o;
import wc.r;
import wc.s;

/* JADX INFO: compiled from: MRAIDAdWidget.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class MRAIDAdWidget extends RelativeLayout {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "MRAIDAdWidget";
    private CloseDelegate closeDelegate;
    private final String eventId;
    private OnViewTouchListener onViewTouchListener;
    private OrientationDelegate orientationDelegate;
    private final k platform$delegate;
    private WebView webView;

    /* JADX INFO: compiled from: MRAIDAdWidget.kt */
    @Retention(RetentionPolicy.RUNTIME)
    public @interface AdStopReason {
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final int IS_AD_FINISHED_BY_API = 4;
        public static final int IS_AD_FINISHING = 2;
        public static final int IS_CHANGING_CONFIGURATION = 1;

        /* JADX INFO: compiled from: MRAIDAdWidget.kt */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int IS_AD_FINISHED_BY_API = 4;
            public static final int IS_AD_FINISHING = 2;
            public static final int IS_CHANGING_CONFIGURATION = 1;

            private Companion() {
            }
        }
    }

    /* JADX INFO: compiled from: MRAIDAdWidget.kt */
    public static final class AudioContextWrapper extends ContextWrapper {
        public AudioContextWrapper(Context context) {
            super(context);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String name) {
            t.f(name, "name");
            Object systemService = t.a("audio", name) ? getApplicationContext().getSystemService(name) : super.getSystemService(name);
            t.e(systemService, "if (AUDIO_SERVICE == nam…rvice(name)\n            }");
            return systemService;
        }
    }

    /* JADX INFO: compiled from: MRAIDAdWidget.kt */
    public interface CloseDelegate {
        void close();
    }

    /* JADX INFO: compiled from: MRAIDAdWidget.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: MRAIDAdWidget.kt */
    static final class DestroyRunnable implements Runnable {
        private final MRAIDAdWidget widget;

        public DestroyRunnable(MRAIDAdWidget widget) {
            t.f(widget, "widget");
            this.widget = widget;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: run$lambda-0, reason: not valid java name */
        public static final void m309run$lambda0(DestroyRunnable this$0) {
            t.f(this$0, "this$0");
            this$0.run();
        }

        @Override // java.lang.Runnable
        public void run() {
            g0 g0Var;
            WebView webView = this.widget.webView;
            if (webView == null) {
                return;
            }
            if (!t.a(Looper.myLooper(), Looper.getMainLooper())) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.vungle.ads.internal.ui.view.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        MRAIDAdWidget.DestroyRunnable.m309run$lambda0(this.f13118a);
                    }
                });
                return;
            }
            try {
                try {
                    r.a aVar = r.f27774b;
                    webView.onPause();
                    r.c(g0.f27756a);
                } catch (Throwable th) {
                    r.a aVar2 = r.f27774b;
                    r.c(s.a(th));
                }
                try {
                    webView.stopLoading();
                    r.c(g0.f27756a);
                } catch (Throwable th2) {
                    r.a aVar3 = r.f27774b;
                    r.c(s.a(th2));
                }
                try {
                    webView.setWebChromeClient(null);
                    r.c(g0.f27756a);
                } catch (Throwable th3) {
                    r.a aVar4 = r.f27774b;
                    r.c(s.a(th3));
                }
                try {
                    webView.setWebViewClient(new WebViewClient());
                    r.c(g0.f27756a);
                } catch (Throwable th4) {
                    r.a aVar5 = r.f27774b;
                    r.c(s.a(th4));
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    try {
                        webView.setWebViewRenderProcessClient(null);
                        r.c(g0.f27756a);
                    } catch (Throwable th5) {
                        r.a aVar6 = r.f27774b;
                        r.c(s.a(th5));
                    }
                }
                try {
                    webView.loadUrl("about:blank");
                    r.c(g0.f27756a);
                } catch (Throwable th6) {
                    r.a aVar7 = r.f27774b;
                    r.c(s.a(th6));
                }
                try {
                    webView.clearHistory();
                    r.c(g0.f27756a);
                } catch (Throwable th7) {
                    r.a aVar8 = r.f27774b;
                    r.c(s.a(th7));
                }
                try {
                    webView.removeAllViews();
                    r.c(g0.f27756a);
                } catch (Throwable th8) {
                    r.a aVar9 = r.f27774b;
                    r.c(s.a(th8));
                }
                try {
                    this.widget.removeAllViews();
                    r.c(g0.f27756a);
                } catch (Throwable th9) {
                    r.a aVar10 = r.f27774b;
                    r.c(s.a(th9));
                }
                try {
                    String eventId = this.widget.getEventId();
                    if (eventId != null) {
                        WebViewManager.INSTANCE.destroyWebView(eventId);
                        g0Var = g0.f27756a;
                    } else {
                        g0Var = null;
                    }
                    r.c(g0Var);
                } catch (Throwable th10) {
                    r.a aVar11 = r.f27774b;
                    r.c(s.a(th10));
                }
                try {
                    webView.destroy();
                    r.c(g0.f27756a);
                } catch (Throwable th11) {
                    r.a aVar12 = r.f27774b;
                    r.c(s.a(th11));
                }
                this.widget.webView = null;
            } catch (Throwable th12) {
                Logger.Companion.e(MRAIDAdWidget.TAG, "Destroy webview: " + th12.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: MRAIDAdWidget.kt */
    public interface OnViewTouchListener {
        boolean onTouch(MotionEvent motionEvent);
    }

    /* JADX INFO: compiled from: MRAIDAdWidget.kt */
    public interface OrientationDelegate {
        void setOrientation(int i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MRAIDAdWidget(Context context) throws InstantiationException {
        this(context, null, 2, 0 == true ? 1 : 0);
        t.f(context, "context");
    }

    private final void bindListeners() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.vungle.ads.internal.ui.view.g
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return MRAIDAdWidget.m308bindListeners$lambda0(this.f13117a, view, motionEvent);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: bindListeners$lambda-0, reason: not valid java name */
    public static final boolean m308bindListeners$lambda0(MRAIDAdWidget this$0, View view, MotionEvent motionEvent) {
        t.f(this$0, "this$0");
        OnViewTouchListener onViewTouchListener = this$0.onViewTouchListener;
        if (onViewTouchListener != null) {
            return onViewTouchListener.onTouch(motionEvent);
        }
        return false;
    }

    private final Platform getPlatform() {
        return (Platform) this.platform$delegate.getValue();
    }

    private final void prepare() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.setLayerType(getPlatform().isProblematicMaliDevice() ? 0 : 2, null);
            webView.setBackgroundColor(0);
            webView.setVisibility(8);
        }
    }

    public final void close() {
        CloseDelegate closeDelegate = this.closeDelegate;
        if (closeDelegate != null) {
            closeDelegate.close();
        }
    }

    public final void destroyWebView(long j10) {
        try {
            r.a aVar = r.f27774b;
            ViewParent parent = getParent();
            g0 g0Var = null;
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this);
                g0Var = g0.f27756a;
            }
            r.c(g0Var);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            r.c(s.a(th));
        }
        try {
            removeAllViews();
            r.c(g0.f27756a);
        } catch (Throwable th2) {
            r.a aVar3 = r.f27774b;
            r.c(s.a(th2));
        }
        if (j10 <= 0) {
            new DestroyRunnable(this).run();
        } else {
            new HandlerScheduler().schedule(new DestroyRunnable(this), j10);
        }
    }

    public final CloseDelegate getCloseDelegate$vungle_ads_release() {
        return this.closeDelegate;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final OnViewTouchListener getOnViewTouchListener$vungle_ads_release() {
        return this.onViewTouchListener;
    }

    public final OrientationDelegate getOrientationDelegate$vungle_ads_release() {
        return this.orientationDelegate;
    }

    public final String getUrl() {
        WebView webView = this.webView;
        if (webView != null) {
            return webView.getUrl();
        }
        return null;
    }

    public final void linkWebView(WebViewClient vngWebViewClient, AdPayload.WebViewSettings webViewSettings) {
        t.f(vngWebViewClient, "vngWebViewClient");
        WebView webView = this.webView;
        if (webView != null) {
            WebViewUtil.INSTANCE.applyWebSettings(webView, webViewSettings);
            webView.setWebViewClient(vngWebViewClient);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        ViewGroup.LayoutParams layoutParams;
        super.onAttachedToWindow();
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = -1;
            layoutParams2.width = -1;
        }
        WebView webView = this.webView;
        if (webView == null || (layoutParams = webView.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = -1;
        layoutParams.width = -1;
    }

    public final void pauseWeb() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.onPause();
        }
    }

    public final void resumeWeb() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.setVisibility(0);
        }
        WebView webView2 = this.webView;
        if (webView2 != null) {
            webView2.onResume();
        }
    }

    public final void setCloseDelegate(CloseDelegate closeDelegate) {
        t.f(closeDelegate, "closeDelegate");
        this.closeDelegate = closeDelegate;
    }

    public final void setCloseDelegate$vungle_ads_release(CloseDelegate closeDelegate) {
        this.closeDelegate = closeDelegate;
    }

    public final void setOnViewTouchListener(OnViewTouchListener onViewTouchListener) {
        this.onViewTouchListener = onViewTouchListener;
    }

    public final void setOnViewTouchListener$vungle_ads_release(OnViewTouchListener onViewTouchListener) {
        this.onViewTouchListener = onViewTouchListener;
    }

    public final void setOrientation(int i10) {
        OrientationDelegate orientationDelegate = this.orientationDelegate;
        if (orientationDelegate != null) {
            orientationDelegate.setOrientation(i10);
        }
    }

    public final void setOrientationDelegate(OrientationDelegate orientationDelegate) {
        this.orientationDelegate = orientationDelegate;
    }

    public final void setOrientationDelegate$vungle_ads_release(OrientationDelegate orientationDelegate) {
        this.orientationDelegate = orientationDelegate;
    }

    public final void showWebsite(String url) {
        t.f(url, "url");
        Logger.Companion.d(TAG, "loadUrl: " + url);
        WebView webView = this.webView;
        if (webView != null) {
            webView.loadUrl(url);
        }
    }

    public /* synthetic */ MRAIDAdWidget(Context context, String str, int i10, kotlin.jvm.internal.k kVar) throws InstantiationException {
        this(context, (i10 & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MRAIDAdWidget(Context context, String str) throws InstantiationException {
        super(context);
        t.f(context, "context");
        this.eventId = str;
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        this.platform$delegate = m.b(o.SYNCHRONIZED, new MRAIDAdWidget$special$$inlined$inject$1(context));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(layoutParams);
        WebView webView = ViewUtility.INSTANCE.getWebView(context, str);
        this.webView = webView;
        if (webView != null) {
            webView.setLayoutParams(layoutParams);
        }
        WebView webView2 = this.webView;
        if (webView2 != null) {
            webView2.setTag("VungleWebView");
        }
        addView(this.webView, layoutParams);
        bindListeners();
        prepare();
    }

    public static /* synthetic */ void getCloseDelegate$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getOnViewTouchListener$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getOrientationDelegate$vungle_ads_release$annotations() {
    }
}
