package com.applovin.impl;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class g5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakHashMap f6670a = new WeakHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f6671b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f6672c = new Handler();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f6673d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final WeakReference f6674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f6675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f6676g;

    public interface a {
        void a(int i10, int i11);
    }

    public g5(View view) {
        this.f6674e = new WeakReference(view);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            this.f6675f = null;
            return;
        }
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.na
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return this.f7715a.b();
            }
        };
        this.f6675f = onPreDrawListener;
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        synchronized (this.f6671b) {
            this.f6673d = false;
            int iMin = -1;
            int iMax = -1;
            for (Map.Entry entry : this.f6670a.entrySet()) {
                if (a((View) entry.getKey())) {
                    Integer num = (Integer) entry.getValue();
                    if (iMin == -1 && iMax == -1) {
                        iMin = num.intValue();
                        iMax = num.intValue();
                    } else {
                        iMin = Math.min(iMin, ((Integer) entry.getValue()).intValue());
                        iMax = Math.max(iMax, ((Integer) entry.getValue()).intValue());
                    }
                }
            }
            a aVar = this.f6676g;
            if (aVar != null) {
                aVar.a(iMin, iMax);
            }
        }
    }

    private void d() {
        if (this.f6673d) {
            return;
        }
        this.f6673d = true;
        this.f6672c.postDelayed(new Runnable() { // from class: com.applovin.impl.ma
            @Override // java.lang.Runnable
            public final void run() {
                this.f7126a.c();
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean b() {
        d();
        return true;
    }

    public void a() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener;
        this.f6676g = null;
        View view = (View) this.f6674e.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive() && (onPreDrawListener = this.f6675f) != null) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            }
            this.f6674e.clear();
        }
    }

    public void b(View view) {
        synchronized (this.f6671b) {
            this.f6670a.remove(view);
        }
    }

    public void a(a aVar) {
        this.f6676g = aVar;
    }

    public void a(View view, int i10) {
        synchronized (this.f6671b) {
            this.f6670a.put(view, Integer.valueOf(i10));
            d();
        }
    }

    private boolean a(View view) {
        return (view == null || view.getVisibility() != 0 || view.getParent() == null) ? false : true;
    }
}
