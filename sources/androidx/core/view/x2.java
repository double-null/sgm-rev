package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: ViewPropertyAnimatorCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<View> f1986a;

    /* JADX INFO: compiled from: ViewPropertyAnimatorCompat.java */
    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ y2 f1987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f1988b;

        a(y2 y2Var, View view) {
            this.f1987a = y2Var;
            this.f1988b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f1987a.a(this.f1988b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1987a.b(this.f1988b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f1987a.c(this.f1988b);
        }
    }

    x2(View view) {
        this.f1986a = new WeakReference<>(view);
    }

    private void i(View view, y2 y2Var) {
        if (y2Var != null) {
            view.animate().setListener(new a(y2Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public x2 b(float f10) {
        View view = this.f1986a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    public void c() {
        View view = this.f1986a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = this.f1986a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public x2 f(long j10) {
        View view = this.f1986a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    public x2 g(Interpolator interpolator) {
        View view = this.f1986a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public x2 h(y2 y2Var) {
        View view = this.f1986a.get();
        if (view != null) {
            i(view, y2Var);
        }
        return this;
    }

    public x2 j(long j10) {
        View view = this.f1986a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    public x2 k(final a3 a3Var) {
        final View view = this.f1986a.get();
        if (view != null) {
            view.animate().setUpdateListener(a3Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.w2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    a3Var.a(view);
                }
            } : null);
        }
        return this;
    }

    public void l() {
        View view = this.f1986a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public x2 m(float f10) {
        View view = this.f1986a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }
}
