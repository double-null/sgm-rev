package io.bidmachine.media3.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PlayerControlViewLayoutManager.java */
/* JADX INFO: loaded from: classes4.dex */
final class w {
    private boolean A;
    private boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.bidmachine.media3.ui.d f20254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f20255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ViewGroup f20256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ViewGroup f20257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ViewGroup f20258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ViewGroup f20259f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ViewGroup f20260g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ViewGroup f20261h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ViewGroup f20262i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final View f20263j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final View f20264k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AnimatorSet f20265l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AnimatorSet f20266m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AnimatorSet f20267n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AnimatorSet f20268o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AnimatorSet f20269p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ValueAnimator f20270q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ValueAnimator f20271r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Runnable f20272s = new Runnable() { // from class: io.bidmachine.media3.ui.j
        @Override // java.lang.Runnable
        public final void run() {
            this.f20241a.c0();
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Runnable f20273t = new Runnable() { // from class: io.bidmachine.media3.ui.p
        @Override // java.lang.Runnable
        public final void run() {
            this.f20247a.D();
        }
    };

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Runnable f20274u = new Runnable() { // from class: io.bidmachine.media3.ui.q
        @Override // java.lang.Runnable
        public final void run() {
            this.f20248a.H();
        }
    };

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Runnable f20275v = new Runnable() { // from class: io.bidmachine.media3.ui.r
        @Override // java.lang.Runnable
        public final void run() {
            this.f20249a.G();
        }
    };

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Runnable f20276w = new Runnable() { // from class: io.bidmachine.media3.ui.s
        @Override // java.lang.Runnable
        public final void run() {
            this.f20250a.E();
        }
    };

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final View.OnLayoutChangeListener f20277x = new View.OnLayoutChangeListener() { // from class: io.bidmachine.media3.ui.t
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f20251a.R(view, i10, i11, i12, i13, i14, i15, i16, i17);
        }
    };
    private boolean C = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f20279z = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final List<View> f20278y = new ArrayList();

    /* JADX INFO: compiled from: PlayerControlViewLayoutManager.java */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (w.this.f20255b != null) {
                w.this.f20255b.setVisibility(4);
            }
            if (w.this.f20256c != null) {
                w.this.f20256c.setVisibility(4);
            }
            if (w.this.f20258e != null) {
                w.this.f20258e.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (!(w.this.f20263j instanceof io.bidmachine.media3.ui.b) || w.this.A) {
                return;
            }
            ((io.bidmachine.media3.ui.b) w.this.f20263j).h(250L);
        }
    }

    /* JADX INFO: compiled from: PlayerControlViewLayoutManager.java */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (w.this.f20255b != null) {
                w.this.f20255b.setVisibility(0);
            }
            if (w.this.f20256c != null) {
                w.this.f20256c.setVisibility(0);
            }
            if (w.this.f20258e != null) {
                w.this.f20258e.setVisibility(w.this.A ? 0 : 4);
            }
            if (!(w.this.f20263j instanceof io.bidmachine.media3.ui.b) || w.this.A) {
                return;
            }
            ((io.bidmachine.media3.ui.b) w.this.f20263j).u(250L);
        }
    }

    /* JADX INFO: compiled from: PlayerControlViewLayoutManager.java */
    class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.bidmachine.media3.ui.d f20282a;

        c(io.bidmachine.media3.ui.d dVar) {
            this.f20282a = dVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            w.this.Z(1);
            if (w.this.B) {
                this.f20282a.post(w.this.f20272s);
                w.this.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            w.this.Z(3);
        }
    }

    /* JADX INFO: compiled from: PlayerControlViewLayoutManager.java */
    class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.bidmachine.media3.ui.d f20284a;

        d(io.bidmachine.media3.ui.d dVar) {
            this.f20284a = dVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            w.this.Z(2);
            if (w.this.B) {
                this.f20284a.post(w.this.f20272s);
                w.this.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            w.this.Z(3);
        }
    }

    /* JADX INFO: compiled from: PlayerControlViewLayoutManager.java */
    class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.bidmachine.media3.ui.d f20286a;

        e(io.bidmachine.media3.ui.d dVar) {
            this.f20286a = dVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            w.this.Z(2);
            if (w.this.B) {
                this.f20286a.post(w.this.f20272s);
                w.this.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            w.this.Z(3);
        }
    }

    /* JADX INFO: compiled from: PlayerControlViewLayoutManager.java */
    class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            w.this.Z(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            w.this.Z(4);
        }
    }

    /* JADX INFO: compiled from: PlayerControlViewLayoutManager.java */
    class g extends AnimatorListenerAdapter {
        g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            w.this.Z(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            w.this.Z(4);
        }
    }

    /* JADX INFO: compiled from: PlayerControlViewLayoutManager.java */
    class h extends AnimatorListenerAdapter {
        h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (w.this.f20259f != null) {
                w.this.f20259f.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (w.this.f20261h != null) {
                w.this.f20261h.setVisibility(0);
                w.this.f20261h.setTranslationX(w.this.f20261h.getWidth());
                w.this.f20261h.scrollTo(w.this.f20261h.getWidth(), 0);
            }
        }
    }

    /* JADX INFO: compiled from: PlayerControlViewLayoutManager.java */
    class i extends AnimatorListenerAdapter {
        i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (w.this.f20261h != null) {
                w.this.f20261h.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (w.this.f20259f != null) {
                w.this.f20259f.setVisibility(0);
            }
        }
    }

    public w(io.bidmachine.media3.ui.d dVar) {
        this.f20254a = dVar;
        this.f20255b = dVar.findViewById(fa.r.f14813l);
        this.f20256c = (ViewGroup) dVar.findViewById(fa.r.f14808g);
        this.f20258e = (ViewGroup) dVar.findViewById(fa.r.f14824w);
        ViewGroup viewGroup = (ViewGroup) dVar.findViewById(fa.r.f14806e);
        this.f20257d = viewGroup;
        this.f20262i = (ViewGroup) dVar.findViewById(fa.r.S);
        View viewFindViewById = dVar.findViewById(fa.r.G);
        this.f20263j = viewFindViewById;
        this.f20259f = (ViewGroup) dVar.findViewById(fa.r.f14805d);
        this.f20260g = (ViewGroup) dVar.findViewById(fa.r.f14816o);
        this.f20261h = (ViewGroup) dVar.findViewById(fa.r.f14817p);
        View viewFindViewById2 = dVar.findViewById(fa.r.A);
        this.f20264k = viewFindViewById2;
        View viewFindViewById3 = dVar.findViewById(fa.r.f14827z);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: io.bidmachine.media3.ui.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f20252a.T(view);
                }
            });
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: io.bidmachine.media3.ui.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f20252a.T(view);
                }
            });
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: io.bidmachine.media3.ui.v
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f20253a.J(valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new a());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: io.bidmachine.media3.ui.k
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f20242a.K(valueAnimator);
            }
        });
        valueAnimatorOfFloat2.addListener(new b());
        Resources resources = dVar.getResources();
        int i10 = fa.o.f14779b;
        float dimension = resources.getDimension(i10) - resources.getDimension(fa.o.f14780c);
        float dimension2 = resources.getDimension(i10);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f20265l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new c(dVar));
        animatorSet.play(valueAnimatorOfFloat).with(N(0.0f, dimension, viewFindViewById)).with(N(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f20266m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new d(dVar));
        animatorSet2.play(N(dimension, dimension2, viewFindViewById)).with(N(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f20267n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new e(dVar));
        animatorSet3.play(valueAnimatorOfFloat).with(N(0.0f, dimension2, viewFindViewById)).with(N(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f20268o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new f());
        animatorSet4.play(valueAnimatorOfFloat2).with(N(dimension, 0.0f, viewFindViewById)).with(N(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f20269p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new g());
        animatorSet5.play(valueAnimatorOfFloat2).with(N(dimension2, 0.0f, viewFindViewById)).with(N(dimension2, 0.0f, viewGroup));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f20270q = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: io.bidmachine.media3.ui.n
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f20245a.L(valueAnimator);
            }
        });
        valueAnimatorOfFloat3.addListener(new h());
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f20271r = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: io.bidmachine.media3.ui.o
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f20246a.M(valueAnimator);
            }
        });
        valueAnimatorOfFloat4.addListener(new i());
    }

    private static int B(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        this.f20267n.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        Z(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        this.f20265l.start();
        U(this.f20274u, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        this.f20266m.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.f20255b;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = this.f20256c;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = this.f20258e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.f20255b;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = this.f20256c;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = this.f20258e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(ValueAnimator valueAnimator) {
        y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(ValueAnimator valueAnimator) {
        y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private static ObjectAnimator N(float f10, float f11, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", f10, f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        boolean zE0 = e0();
        if (this.A != zE0) {
            this.A = zE0;
            view.post(new Runnable() { // from class: io.bidmachine.media3.ui.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20243a.d0();
                }
            });
        }
        boolean z10 = i12 - i10 != i16 - i14;
        if (this.A || !z10) {
            return;
        }
        view.post(new Runnable() { // from class: io.bidmachine.media3.ui.m
            @Override // java.lang.Runnable
            public final void run() {
                this.f20244a.S();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        int i10;
        if (this.f20259f == null || this.f20260g == null) {
            return;
        }
        int width = (this.f20254a.getWidth() - this.f20254a.getPaddingLeft()) - this.f20254a.getPaddingRight();
        while (true) {
            if (this.f20260g.getChildCount() <= 1) {
                break;
            }
            int childCount = this.f20260g.getChildCount() - 2;
            View childAt = this.f20260g.getChildAt(childCount);
            this.f20260g.removeViewAt(childCount);
            this.f20259f.addView(childAt, 0);
        }
        View view = this.f20264k;
        if (view != null) {
            view.setVisibility(8);
        }
        int iB = B(this.f20262i);
        int childCount2 = this.f20259f.getChildCount() - 1;
        for (int i11 = 0; i11 < childCount2; i11++) {
            iB += B(this.f20259f.getChildAt(i11));
        }
        if (iB <= width) {
            ViewGroup viewGroup = this.f20261h;
            if (viewGroup == null || viewGroup.getVisibility() != 0 || this.f20271r.isStarted()) {
                return;
            }
            this.f20270q.cancel();
            this.f20271r.start();
            return;
        }
        View view2 = this.f20264k;
        if (view2 != null) {
            view2.setVisibility(0);
            iB += B(this.f20264k);
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = this.f20259f.getChildAt(i12);
            iB -= B(childAt2);
            arrayList.add(childAt2);
            if (iB <= width) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.f20259f.removeViews(0, arrayList.size());
        for (i10 = 0; i10 < arrayList.size(); i10++) {
            this.f20260g.addView((View) arrayList.get(i10), this.f20260g.getChildCount() - 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(View view) {
        W();
        if (view.getId() == fa.r.A) {
            this.f20270q.start();
        } else if (view.getId() == fa.r.f14827z) {
            this.f20271r.start();
        }
    }

    private void U(Runnable runnable, long j10) {
        if (j10 >= 0) {
            this.f20254a.postDelayed(runnable, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(int i10) {
        int i11 = this.f20279z;
        this.f20279z = i10;
        if (i10 == 2) {
            this.f20254a.setVisibility(8);
        } else if (i11 == 2) {
            this.f20254a.setVisibility(0);
        }
        if (i11 != i10) {
            this.f20254a.f0();
        }
    }

    private boolean a0(View view) {
        int id2 = view.getId();
        return id2 == fa.r.f14806e || id2 == fa.r.F || id2 == fa.r.f14826y || id2 == fa.r.J || id2 == fa.r.K || id2 == fa.r.f14818q || id2 == fa.r.f14819r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0() {
        if (!this.C) {
            Z(0);
            W();
            return;
        }
        int i10 = this.f20279z;
        if (i10 == 1) {
            this.f20268o.start();
        } else if (i10 == 2) {
            this.f20269p.start();
        } else if (i10 == 3) {
            this.B = true;
        } else if (i10 == 4) {
            return;
        }
        W();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0() {
        ViewGroup viewGroup = this.f20258e;
        if (viewGroup != null) {
            viewGroup.setVisibility(this.A ? 0 : 4);
        }
        if (this.f20263j != null) {
            int dimensionPixelSize = this.f20254a.getResources().getDimensionPixelSize(fa.o.f14781d);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f20263j.getLayoutParams();
            if (marginLayoutParams != null) {
                if (this.A) {
                    dimensionPixelSize = 0;
                }
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                this.f20263j.setLayoutParams(marginLayoutParams);
            }
            View view = this.f20263j;
            if (view instanceof io.bidmachine.media3.ui.b) {
                io.bidmachine.media3.ui.b bVar = (io.bidmachine.media3.ui.b) view;
                if (this.A) {
                    bVar.i(true);
                } else {
                    int i10 = this.f20279z;
                    if (i10 == 1) {
                        bVar.i(false);
                    } else if (i10 != 3) {
                        bVar.t();
                    }
                }
            }
        }
        for (View view2 : this.f20278y) {
            view2.setVisibility((this.A && a0(view2)) ? 4 : 0);
        }
    }

    private boolean e0() {
        int width = (this.f20254a.getWidth() - this.f20254a.getPaddingLeft()) - this.f20254a.getPaddingRight();
        int height = (this.f20254a.getHeight() - this.f20254a.getPaddingBottom()) - this.f20254a.getPaddingTop();
        int iB = B(this.f20256c);
        ViewGroup viewGroup = this.f20256c;
        int paddingLeft = iB - (viewGroup != null ? viewGroup.getPaddingLeft() + this.f20256c.getPaddingRight() : 0);
        int iZ = z(this.f20256c);
        ViewGroup viewGroup2 = this.f20256c;
        return width <= Math.max(paddingLeft, B(this.f20262i) + B(this.f20264k)) || height <= (iZ - (viewGroup2 != null ? viewGroup2.getPaddingTop() + this.f20256c.getPaddingBottom() : 0)) + (z(this.f20257d) * 2);
    }

    private void y(float f10) {
        ViewGroup viewGroup = this.f20261h;
        if (viewGroup != null) {
            this.f20261h.setTranslationX((int) (viewGroup.getWidth() * (1.0f - f10)));
        }
        ViewGroup viewGroup2 = this.f20262i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f10);
        }
        ViewGroup viewGroup3 = this.f20259f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f10);
        }
    }

    private static int z(View view) {
        if (view == null) {
            return 0;
        }
        int height = view.getHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return height;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return height + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public boolean A(View view) {
        return view != null && this.f20278y.contains(view);
    }

    public void C() {
        int i10 = this.f20279z;
        if (i10 == 3 || i10 == 2) {
            return;
        }
        V();
        if (!this.C) {
            E();
        } else if (this.f20279z == 1) {
            H();
        } else {
            D();
        }
    }

    public void F() {
        int i10 = this.f20279z;
        if (i10 == 3 || i10 == 2) {
            return;
        }
        V();
        E();
    }

    public boolean I() {
        return this.f20279z == 0 && this.f20254a.e0();
    }

    public void O() {
        this.f20254a.addOnLayoutChangeListener(this.f20277x);
    }

    public void P() {
        this.f20254a.removeOnLayoutChangeListener(this.f20277x);
    }

    public void Q(boolean z10, int i10, int i11, int i12, int i13) {
        View view = this.f20255b;
        if (view != null) {
            view.layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    public void V() {
        this.f20254a.removeCallbacks(this.f20276w);
        this.f20254a.removeCallbacks(this.f20273t);
        this.f20254a.removeCallbacks(this.f20275v);
        this.f20254a.removeCallbacks(this.f20274u);
    }

    public void W() {
        if (this.f20279z == 3) {
            return;
        }
        V();
        int showTimeoutMs = this.f20254a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.C) {
                U(this.f20276w, showTimeoutMs);
            } else if (this.f20279z == 1) {
                U(this.f20274u, 2000L);
            } else {
                U(this.f20275v, showTimeoutMs);
            }
        }
    }

    public void X(boolean z10) {
        this.C = z10;
    }

    public void Y(View view, boolean z10) {
        if (view == null) {
            return;
        }
        if (!z10) {
            view.setVisibility(8);
            this.f20278y.remove(view);
            return;
        }
        if (this.A && a0(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        this.f20278y.add(view);
    }

    public void b0() {
        if (!this.f20254a.e0()) {
            this.f20254a.setVisibility(0);
            this.f20254a.n0();
            this.f20254a.k0();
        }
        c0();
    }
}
