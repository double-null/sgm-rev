package g7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o<T extends View> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View.OnClickListener f15480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected View f15481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected n f15482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f15483d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Runnable f15484e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Animator.AnimatorListener f15485f = new b();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.f15483d = false;
            o oVar = o.this;
            View view = oVar.f15481b;
            if (view == null || oVar.f15482c == null) {
                return;
            }
            view.animate().alpha(0.0f).setDuration(400L).setListener(o.this.f15485f).withLayer();
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            animator.removeAllListeners();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            View view = o.this.f15481b;
            if (view != null) {
                view.setClickable(view.getAlpha() != 0.0f);
            }
        }
    }

    public o(View.OnClickListener onClickListener) {
        this.f15480a = onClickListener;
    }

    protected ViewGroup.MarginLayoutParams b(Context context, n nVar) {
        return new ViewGroup.MarginLayoutParams(nVar.U(context).intValue(), nVar.p(context).intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void d(View view, n nVar) {
        if (view instanceof m) {
            ((m) view).setStyle(nVar);
        }
    }

    protected boolean e(View view, n nVar, n nVar2) {
        return !TextUtils.equals(nVar.K(), nVar2.K());
    }

    public void g(Context context, ViewGroup viewGroup, n nVar) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        n nVar2;
        n nVarG = j(context, nVar).g(nVar);
        if (!nVarG.e0().booleanValue()) {
            l();
            return;
        }
        if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b(context, nVarG));
            nVarG.b(layoutParams);
            marginLayoutParams = layoutParams;
        } else {
            if (!(viewGroup instanceof RelativeLayout)) {
                throw new IllegalArgumentException("Parent should be instance of FrameLayout or RelativeLayout");
            }
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(b(context, nVarG));
            nVarG.f(layoutParams2);
            marginLayoutParams = layoutParams2;
        }
        nVarG.c(context, marginLayoutParams);
        View view = this.f15481b;
        if (view == null || (nVar2 = this.f15482c) == null || e(view, nVar2, nVarG)) {
            y.u(this.f15481b);
            View viewH = h(context, nVarG);
            this.f15481b = viewH;
            viewGroup.addView(viewH, marginLayoutParams);
        } else {
            this.f15481b.setLayoutParams(marginLayoutParams);
            this.f15481b.setVisibility(0);
        }
        this.f15481b.setAlpha(nVarG.B().floatValue());
        nVarG.e(context, this.f15481b);
        this.f15481b.setOnClickListener(this.f15480a);
        this.f15482c = nVarG;
        d(this.f15481b, nVarG);
        c(context, this.f15481b, nVarG);
    }

    abstract View h(Context context, n nVar);

    public void i() {
        View view = this.f15481b;
        if (view != null) {
            view.bringToFront();
        }
    }

    protected abstract n j(Context context, n nVar);

    public void k() {
        this.f15483d = false;
        View view = this.f15481b;
        if (view == null || this.f15482c == null) {
            return;
        }
        view.animate().cancel();
        this.f15481b.removeCallbacks(this.f15484e);
        this.f15481b.setClickable(true);
        this.f15481b.setAlpha(this.f15482c.B().floatValue());
    }

    public void l() {
        if (this.f15481b != null) {
            k();
            y.u(this.f15481b);
            this.f15481b = null;
            this.f15482c = null;
        }
    }

    public void m() {
        View view;
        if (!n() || (view = this.f15481b) == null || this.f15482c == null) {
            return;
        }
        c(view.getContext(), this.f15481b, this.f15482c);
    }

    public boolean n() {
        return this.f15481b != null;
    }

    public void o(int i10) {
        View view = this.f15481b;
        if (view != null) {
            view.setVisibility(i10);
        }
    }

    public void p() {
        n nVar;
        Float fS;
        if (this.f15483d || this.f15481b == null || (nVar = this.f15482c) == null || (fS = nVar.s()) == null || fS.floatValue() == 0.0f) {
            return;
        }
        this.f15483d = true;
        this.f15481b.postDelayed(this.f15484e, (long) (fS.floatValue() * 1000.0f));
    }

    public void q() {
        if (this.f15481b == null || this.f15482c == null) {
            return;
        }
        k();
        p();
    }

    protected void c(Context context, View view, n nVar) {
    }
}
