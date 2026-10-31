package com.applovin.impl;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.applovin.impl.adview.AppLovinWebViewBase;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class l0 extends AppLovinWebViewBase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Boolean f7037b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f7038a;

    public l0(Context context) {
        super(context);
        this.f7038a = new AtomicReference();
        if (f7037b == null) {
            try {
                WebView.class.getDeclaredMethod("onTouchEvent", MotionEvent.class);
                f7037b = Boolean.TRUE;
            } catch (NoSuchMethodException unused) {
                com.applovin.impl.sdk.p.h("AppLovinSdk", "WebView.onTouchEvent() not implemented");
                f7037b = Boolean.FALSE;
            }
        }
    }

    public boolean a() {
        return this.f7038a.get() != null;
    }

    public MotionEvent getAndClearLastClickEvent() {
        return (MotionEvent) this.f7038a.getAndSet(null);
    }

    public MotionEvent getLastClickEvent() {
        return (MotionEvent) this.f7038a.get();
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f7038a.set(MotionEvent.obtain(motionEvent));
        if (f7037b.booleanValue()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }
}
