package io.bidmachine.iab.mraid;

import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class s0 extends WebView {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f17813g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final p0 f17814h = new p0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h1 f17815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i0 f17816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g1 f17817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f17818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f17819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final WeakReference f17820f;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        private a() {
        }
    }

    private final class b implements View.OnTouchListener {
        public b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            kotlin.jvm.internal.t.f(view, "view");
            kotlin.jvm.internal.t.f(motionEvent, "motionEvent");
            s0.this.f17815a.onTouchEvent(motionEvent);
            int action = motionEvent.getAction();
            if ((action != 0 && action != 1) || view.hasFocus()) {
                return false;
            }
            view.requestFocus();
            return false;
        }
    }

    static final class c extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f17822d = new c();

        c() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "onPause";
        }
    }

    static final class d extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f17823d = new d();

        d() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "onResume";
        }
    }

    static final class e extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Configuration f17824d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Configuration configuration) {
            super(0);
            this.f17824d = configuration;
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "onConfigurationChanged: " + g7.y.t(this.f17824d.orientation);
        }
    }

    static final class f extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f17825d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(boolean z10) {
            super(0);
            this.f17825d = z10;
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "setAudioMuted: " + this.f17825d;
        }
    }

    static final class g extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final g f17826d = new g();

        g() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "setAudioMuted: not supported";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(Context context, b1 controller) {
        super(context);
        kotlin.jvm.internal.t.f(context, "context");
        kotlin.jvm.internal.t.f(controller, "controller");
        this.f17815a = new h1(context);
        this.f17816b = new i0(context);
        this.f17820f = new WeakReference(controller);
        setScrollContainer(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setScrollBarStyle(33554432);
        setFocusableInTouchMode(false);
        setOnTouchListener(new b());
        setWebChromeClient(f17814h);
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setBackgroundColor(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(s0 this$0) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        this$0.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(s0 this$0) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        this$0.m();
    }

    private final void setAudioMuted(boolean z10) {
        try {
            if (d1.g.a("MUTE_AUDIO")) {
                d1.f.m(this, z10);
                b0.c("MraidWebView", new f(z10));
            } else {
                b0.i("MraidWebView", g.f17826d);
            }
        } catch (Throwable th) {
            b0.f("MraidWebView", th);
        }
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.f17818d = false;
        this.f17819e = true;
        try {
            k();
            removeAllViews();
            super.destroy();
        } catch (Throwable th) {
            b0.f("MraidWebView", th);
        }
        this.f17820f.clear();
    }

    public final void f() {
        b0.c("MraidWebView", c.f17822d);
        try {
            onPause();
        } catch (Throwable th) {
            b0.f("MraidWebView", th);
        }
        setAudioMuted(true);
    }

    public final void g() {
        b0.c("MraidWebView", d.f17823d);
        try {
            onResume();
        } catch (Throwable th) {
            b0.f("MraidWebView", th);
        }
        setAudioMuted(false);
    }

    public final long getClickTimeMs() {
        return this.f17815a.a();
    }

    public final b1 getController() {
        return (b1) this.f17820f.get();
    }

    public final i0 getMraidScreenMetrics() {
        return this.f17816b;
    }

    public final g1 getMraidWebViewListener() {
        return this.f17817c;
    }

    public final boolean h() {
        return this.f17819e;
    }

    public final void i() {
        this.f17818d = true;
        m();
    }

    public final void j(boolean z10) {
        if (z10) {
            g();
        } else {
            f();
        }
    }

    public final void k() {
        stopLoading();
        loadUrl("");
        f();
    }

    public final void l() {
        this.f17815a.c();
    }

    public final void m() {
        g1 g1Var;
        if (!this.f17818d || this.f17819e) {
            return;
        }
        Context context = getContext();
        kotlin.jvm.internal.t.e(context, "getContext()");
        Object parent = getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view == null) {
            view = this;
        }
        DisplayMetrics displayMetricsB = wb.g.b(context);
        boolean zI = this.f17816b.i(displayMetricsB.widthPixels, displayMetricsB.heightPixels);
        int[] iArr = new int[2];
        View viewQ = l0.q(context, view);
        kotlin.jvm.internal.t.e(viewQ, "obtainRootView(context, container)");
        viewQ.getLocationOnScreen(iArr);
        boolean zH = this.f17816b.h(iArr[0], iArr[1], viewQ.getWidth(), viewQ.getHeight()) | zI;
        view.getLocationOnScreen(iArr);
        boolean zG = zH | this.f17816b.g(iArr[0], iArr[1], view.getWidth(), view.getHeight());
        getLocationOnScreen(iArr);
        if ((!zG && !this.f17816b.f(iArr[0], iArr[1], getWidth(), getHeight())) || (g1Var = this.f17817c) == null) {
            return;
        }
        g1Var.a(this.f17816b);
    }

    public final boolean n() {
        return this.f17815a.b();
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onConfigurationChanged(Configuration newConfig) {
        kotlin.jvm.internal.t.f(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        b0.c("MraidWebView", new e(newConfig));
        wb.a0.c(new Runnable() { // from class: io.bidmachine.iab.mraid.q0
            @Override // java.lang.Runnable
            public final void run() {
                s0.c(this.f17809a);
            }
        });
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        wb.a0.c(new Runnable() { // from class: io.bidmachine.iab.mraid.r0
            @Override // java.lang.Runnable
            public final void run() {
                s0.e(this.f17811a);
            }
        });
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (i10 == 0) {
            g();
        } else {
            f();
        }
    }

    @Override // android.view.View
    protected boolean overScrollBy(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
        return false;
    }

    public final void setMraidWebViewListener(g1 g1Var) {
        this.f17817c = g1Var;
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
    }
}
