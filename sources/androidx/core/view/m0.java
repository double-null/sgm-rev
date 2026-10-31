package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: OneShotPreDrawListener.java */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f1953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewTreeObserver f1954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f1955c;

    private m0(View view, Runnable runnable) {
        this.f1953a = view;
        this.f1954b = view.getViewTreeObserver();
        this.f1955c = runnable;
    }

    public static m0 a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        m0 m0Var = new m0(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(m0Var);
        view.addOnAttachStateChangeListener(m0Var);
        return m0Var;
    }

    public void b() {
        if (this.f1954b.isAlive()) {
            this.f1954b.removeOnPreDrawListener(this);
        } else {
            this.f1953a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f1953a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f1955c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f1954b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
