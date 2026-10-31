package com.applovin.impl;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import kotlinx.coroutines.channels.eY.oqHAiWkeGzWld;

/* JADX INFO: loaded from: classes2.dex */
public class i8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f6836a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Runnable f6840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f6841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final WeakReference f6842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f6843h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f6846k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f6847l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f6848m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f6849n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f6837b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f6838c = new Rect();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private WeakReference f6844i = new WeakReference(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private WeakReference f6845j = new WeakReference(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f6850o = Long.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f6839d = new Handler(Looper.getMainLooper());

    /* JADX INFO: loaded from: classes.dex */
    public interface a {
        void onLogVisibilityImpression();
    }

    public i8(final View view, com.applovin.impl.sdk.l lVar, a aVar) {
        this.f6836a = lVar.Q();
        this.f6843h = ((Long) lVar.a(z4.C1)).longValue();
        this.f6842g = new WeakReference(view);
        final WeakReference weakReference = new WeakReference(aVar);
        this.f6840e = new Runnable() { // from class: com.applovin.impl.gb
            @Override // java.lang.Runnable
            public final void run() {
                this.f6705a.a(weakReference);
            }
        };
        this.f6841f = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.hb
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return this.f6773a.a(view);
            }
        };
    }

    private void c(View view) {
        View viewB = g8.b((View) this.f6842g.get());
        if (viewB == null) {
            viewB = g8.b(view);
        }
        if (viewB == null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6836a.a("VisibilityTracker", "Unable to set view tree observer due to no root view.");
                return;
            }
            return;
        }
        ViewTreeObserver viewTreeObserver = viewB.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f6844i = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnPreDrawListener(this.f6841f);
        } else if (com.applovin.impl.sdk.p.a()) {
            this.f6836a.k("VisibilityTracker", "Unable to set view tree observer since the view tree observer is not alive.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(WeakReference weakReference) {
        View view = (View) this.f6842g.get();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        View view2 = (View) this.f6845j.get();
        if (viewGroup == null || view2 == null) {
            return;
        }
        if (!a(viewGroup, view2)) {
            a();
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f6836a.a("VisibilityTracker", oqHAiWkeGzWld.bxpoFYPERtmFT);
        }
        b();
        a aVar = (a) weakReference.get();
        if (aVar != null) {
            aVar.onLogVisibilityImpression();
        }
    }

    public void b() {
        synchronized (this.f6837b) {
            this.f6839d.removeMessages(0);
            b((View) this.f6842g.get());
            this.f6850o = Long.MIN_VALUE;
            this.f6845j.clear();
        }
    }

    private boolean b(View view, View view2) {
        if (view2 == null || view2.getVisibility() != 0 || view.getParent() == null || view2.getWidth() <= 0 || view2.getHeight() <= 0 || !view2.getGlobalVisibleRect(this.f6838c)) {
            return false;
        }
        long jPxToDp = AppLovinSdkUtils.pxToDp(view2.getContext(), this.f6838c.width()) * AppLovinSdkUtils.pxToDp(view2.getContext(), this.f6838c.height());
        if (jPxToDp < this.f6846k) {
            return false;
        }
        if ((jPxToDp / (AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getWidth()) * AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getHeight()))) * 100.0f < this.f6847l) {
            return false;
        }
        return (((float) ((long) (this.f6838c.width() * this.f6838c.height()))) / ((float) ((long) (view2.getWidth() * view2.getHeight())))) * 100.0f >= this.f6848m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(View view) {
        a();
        b(view);
        return true;
    }

    public void a(j3 j3Var) {
        View viewV0;
        if (j3Var instanceof d3) {
            viewV0 = j3Var.z();
        } else if (!(j3Var instanceof f3)) {
            return;
        } else {
            viewV0 = ((f3) j3Var).v0();
        }
        a(j3Var.n0(), j3Var.p0(), j3Var.q0(), j3Var.r0(), viewV0);
    }

    private void b(View view) {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f6844i.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f6841f);
        } else if (view != null) {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnPreDrawListener(this.f6841f);
            } else if (com.applovin.impl.sdk.p.a()) {
                this.f6836a.a("VisibilityTracker", "Could not remove on pre-draw listener. View tree observer is not alive.");
            }
        } else if (com.applovin.impl.sdk.p.a()) {
            this.f6836a.a("VisibilityTracker", "Could not remove on pre-draw listener. Root view is null.");
        }
        this.f6844i.clear();
    }

    public void a(int i10, float f10, float f11, long j10, View view) {
        synchronized (this.f6837b) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6836a.a("VisibilityTracker", "Tracking visibility for " + view);
            }
            b();
            WeakReference weakReference = new WeakReference(view);
            this.f6845j = weakReference;
            this.f6846k = i10;
            this.f6847l = f10;
            this.f6848m = f11;
            this.f6849n = j10;
            c((View) weakReference.get());
        }
    }

    private void a() {
        this.f6839d.postDelayed(this.f6840e, this.f6843h);
    }

    private boolean a(View view, View view2) {
        if (!b(view, view2)) {
            return false;
        }
        if (this.f6850o == Long.MIN_VALUE) {
            this.f6850o = SystemClock.uptimeMillis();
        }
        return SystemClock.uptimeMillis() - this.f6850o >= this.f6849n;
    }
}
