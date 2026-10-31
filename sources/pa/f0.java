package pa;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import pb.c1;
import pb.d1;
import pb.e1;
import pb.h0;
import pb.i0;
import pb.k0;
import pb.k1;
import pb.m0;
import pb.m1;
import pb.n0;
import pb.o0;
import pb.p0;
import pb.r0;
import pb.t0;
import pb.u0;
import pb.y0;
import pb.z0;

/* JADX INFO: loaded from: classes5.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f23727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final la.g f23728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final pb.k f23729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f23730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f23731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ib.g f23732f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f23733g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Animator f23734h;

    public final class b implements la.g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f23737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d1 f23738b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Integer f23739c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final pb.o f23740d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final WeakReference f23741e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ f0 f23742f;

        public b(f0 f0Var, View view, boolean z10, d1 d1Var, Integer num, pb.o oVar) {
            kotlin.jvm.internal.t.f(view, "view");
            this.f23742f = f0Var;
            this.f23737a = z10;
            this.f23738b = d1Var;
            this.f23739c = num;
            this.f23740d = oVar;
            this.f23741e = new WeakReference(view);
        }

        @Override // la.g.a
        public void a(pb.b0 error) {
            kotlin.jvm.internal.t.f(error, "error");
        }

        @Override // la.g.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Bitmap successType) {
            kotlin.jvm.internal.t.f(successType, "successType");
            f0 f0Var = this.f23742f;
            try {
                View view = (View) this.f23741e.get();
                if (view == null) {
                    return;
                }
                kotlin.jvm.internal.t.e(view, "weakView.get() ?: return");
                f0Var.h(view, this.f23737a, successType, this.f23738b, this.f23739c, this.f23740d);
                wc.g0 g0Var = wc.g0.f27756a;
            } catch (Throwable unused) {
            }
        }
    }

    static final class c extends kotlin.jvm.internal.u implements id.l {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f23743d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f23744e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ f0 f23745f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Integer f23746g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ pb.o f23747h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ a f23748i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(View view, boolean z10, f0 f0Var, Integer num, pb.o oVar, a aVar) {
            super(1);
            this.f23743d = view;
            this.f23744e = z10;
            this.f23745f = f0Var;
            this.f23746g = num;
            this.f23747h = oVar;
            this.f23748i = aVar;
        }

        public final void b(int i10) {
            f0.s(this.f23743d, this.f23745f, this.f23746g, this.f23747h, this.f23748i, this.f23744e, i10);
        }

        @Override // id.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(((Number) obj).intValue());
            return wc.g0.f27756a;
        }
    }

    static final class d extends kotlin.jvm.internal.u implements id.l {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f23749d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ h0 f23750e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ f0 f23751f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Integer f23752g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ pb.o f23753h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ a f23754i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(View view, h0 h0Var, f0 f0Var, Integer num, pb.o oVar, a aVar) {
            super(1);
            this.f23749d = view;
            this.f23750e = h0Var;
            this.f23751f = f0Var;
            this.f23752g = num;
            this.f23753h = oVar;
            this.f23754i = aVar;
        }

        public final void a(List it) {
            kotlin.jvm.internal.t.f(it, "it");
            f0.t(this.f23749d, this.f23751f, this.f23752g, this.f23753h, this.f23754i, true, new h0(this.f23750e.c(), this.f23750e.b(), it));
        }

        @Override // id.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((List) obj);
            return wc.g0.f27756a;
        }
    }

    static final class e extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f23755d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f23756e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ f0 f23757f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Integer f23758g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ pb.o f23759h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ a f23760i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(View view, int i10, f0 f0Var, Integer num, pb.o oVar, a aVar) {
            super(0);
            this.f23755d = view;
            this.f23756e = i10;
            this.f23757f = f0Var;
            this.f23758g = num;
            this.f23759h = oVar;
            this.f23760i = aVar;
        }

        public final void a() {
            f0.s(this.f23755d, this.f23757f, this.f23758g, this.f23759h, this.f23760i, true, this.f23756e);
        }

        @Override // id.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return wc.g0.f27756a;
        }
    }

    static final class f extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f23761d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ h0 f23762e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ f0 f23763f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Integer f23764g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ pb.o f23765h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ a f23766i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(View view, h0 h0Var, f0 f0Var, Integer num, pb.o oVar, a aVar) {
            super(0);
            this.f23761d = view;
            this.f23762e = h0Var;
            this.f23763f = f0Var;
            this.f23764g = num;
            this.f23765h = oVar;
            this.f23766i = aVar;
        }

        public final void a() {
            f0.t(this.f23761d, this.f23763f, this.f23764g, this.f23765h, this.f23766i, true, this.f23762e);
        }

        @Override // id.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return wc.g0.f27756a;
        }
    }

    public static final class g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference f23767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Drawable f23768b;

        g(WeakReference weakReference, Drawable drawable) {
            this.f23767a = weakReference;
            this.f23768b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            kotlin.jvm.internal.t.f(animation, "animation");
            View view = (View) this.f23767a.get();
            if (view == null) {
                return;
            }
            view.setBackground(this.f23768b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f0(Context context, la.g repository, pb.k background) {
        kotlin.jvm.internal.t.f(context, "context");
        kotlin.jvm.internal.t.f(repository, "repository");
        kotlin.jvm.internal.t.f(background, "background");
        this.f23727a = context;
        this.f23728b = repository;
        this.f23729c = background;
        this.f23730d = new AtomicBoolean(false);
        this.f23731e = new AtomicBoolean(false);
        this.f23732f = new ib.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        this.f23733g = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Drawable newDrawable, ValueAnimator it) {
        kotlin.jvm.internal.t.f(newDrawable, "$newDrawable");
        kotlin.jvm.internal.t.f(it, "it");
        wb.e eVar = wb.e.f27687a;
        Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.t.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        newDrawable.setAlpha(eVar.r(((Float) animatedValue).floatValue()));
    }

    private final void d(View view, final Drawable drawable, a aVar) {
        b();
        if (!this.f23733g.compareAndSet(false, true)) {
            view.setBackground(drawable);
            return;
        }
        WeakReference weakReference = new WeakReference(view);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(aVar.a());
        valueAnimatorOfFloat.setInterpolator(aVar.c());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pa.e0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f0.c(drawable, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new g(weakReference, drawable));
        this.f23734h = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
    }

    public static /* synthetic */ void p(f0 f0Var, View view, boolean z10, Bitmap bitmap, d1 d1Var, Integer num, pb.o oVar, int i10, Object obj) {
        f0Var.h(view, z10, bitmap, (i10 & 8) != 0 ? null : d1Var, (i10 & 16) != 0 ? null : num, (i10 & 32) != 0 ? null : oVar);
    }

    public static /* synthetic */ void r(f0 f0Var, Object obj, View view, y0 y0Var, Integer num, pb.o oVar, a aVar, int i10, Object obj2) {
        f0Var.n(obj, view, y0Var, (i10 & 8) != 0 ? null : num, (i10 & 16) != 0 ? null : oVar, (i10 & 32) != 0 ? null : aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(View view, f0 f0Var, Integer num, pb.o oVar, a aVar, boolean z10, int i10) {
        f0Var.g(view, z10, i10, num, oVar, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(View view, f0 f0Var, Integer num, pb.o oVar, a aVar, boolean z10, h0 h0Var) {
        f0Var.k(view, z10, h0Var, num, oVar, aVar);
    }

    public final void b() {
        Animator animator = this.f23734h;
        if (animator != null) {
            animator.cancel();
            animator.removeAllListeners();
        }
        this.f23734h = null;
    }

    public final void g(View view, boolean z10, int i10, Integer num, pb.o oVar, a aVar) {
        kotlin.jvm.internal.t.f(view, "view");
        m mVar = new m();
        mVar.j(i10);
        if (num != null) {
            mVar.e(num.intValue());
        }
        if (oVar != null) {
            m.i(mVar, oVar.b(), oVar.a(), 0.0f, 0.0f, 12, null);
            view.setPadding(oVar.b(), oVar.b() - wb.e0.k(this.f23727a, 2.0f), oVar.b(), oVar.b() + wb.e0.k(this.f23727a, 2.0f));
        }
        i(view, z10, mVar, aVar);
    }

    public final void h(View view, boolean z10, Bitmap bitmap, d1 d1Var, Integer num, pb.o oVar) {
        kotlin.jvm.internal.t.f(view, "view");
        if (bitmap == null) {
            return;
        }
        ImageView.ScaleType scaleTypeA = e1.a(d1Var);
        z zVar = new z(bitmap);
        zVar.e(scaleTypeA);
        if (num != null && num.intValue() > 0) {
            zVar.i(num.intValue());
        }
        if (oVar != null) {
            zVar.a(oVar.b());
            zVar.c(oVar.a());
            view.setPadding(oVar.b(), oVar.b() - wb.e0.k(this.f23727a, 2.0f), oVar.b(), oVar.b() + wb.e0.k(this.f23727a, 2.0f));
        }
        i(view, z10, zVar, null);
    }

    public final void i(View view, boolean z10, Drawable drawable, a aVar) {
        kotlin.jvm.internal.t.f(view, "view");
        kotlin.jvm.internal.t.f(drawable, "drawable");
        if (this.f23730d.compareAndSet(false, z10)) {
            drawable.setAlpha((int) wb.e0.p(Float.valueOf(this.f23729c.a()), 255.0f));
            drawable.setBounds(0, 0, view.getWidth(), view.getHeight());
            if (aVar == null || !aVar.b(view)) {
                view.setBackground(drawable);
            } else {
                d(view, drawable, aVar);
            }
        }
    }

    public final void j(View view, boolean z10, pb.w color, Integer num, pb.o oVar, a aVar) {
        kotlin.jvm.internal.t.f(view, "view");
        kotlin.jvm.internal.t.f(color, "color");
        boolean zB = color.b();
        pb.z zVarA = color.a();
        if (zVarA instanceof u0) {
            int iA = ((u0) zVarA).a();
            e eVar = new e(view, iA, this, num, oVar, aVar);
            if (zB) {
                this.f23732f.d(view, Integer.valueOf(iA), eVar, new c(view, z10, this, num, oVar, aVar));
                return;
            } else {
                eVar.invoke();
                return;
            }
        }
        if (zVarA instanceof i0) {
            h0 h0VarA = ((i0) zVarA).a();
            f fVar = new f(view, h0VarA, this, num, oVar, aVar);
            if (zB) {
                this.f23732f.h(view, -16777216, fVar, new d(view, h0VarA, this, num, oVar, aVar));
            } else {
                fVar.invoke();
            }
        }
    }

    public final void k(View view, boolean z10, h0 gradient, Integer num, pb.o oVar, a aVar) {
        kotlin.jvm.internal.t.f(view, "view");
        kotlin.jvm.internal.t.f(gradient, "gradient");
        int iC = gradient.c().c();
        m mVar = new m(gradient.b().c(), kotlin.collections.b0.o0(gradient.a()));
        mVar.m(iC);
        if (gradient.c() == k0.Radial) {
            m.h(mVar, 0.0f, 2, 1, null);
        }
        if (num != null) {
            mVar.e(num.intValue());
        }
        if (oVar != null) {
            m.i(mVar, oVar.b(), oVar.a(), 0.0f, 0.0f, 12, null);
            view.setPadding(oVar.b(), oVar.b() - wb.e0.k(this.f23727a, 2.0f), oVar.b(), oVar.b() + wb.e0.k(this.f23727a, 2.0f));
        }
        i(view, z10, mVar, aVar);
    }

    public final void l(Object assetsHolder, View view, Integer num, pb.o oVar, boolean z10, a aVar) {
        pb.l lVarC;
        y0 y0VarB;
        kotlin.jvm.internal.t.f(assetsHolder, "assetsHolder");
        kotlin.jvm.internal.t.f(view, "view");
        if (this.f23731e.compareAndSet(false, true) && (y0VarB = this.f23729c.b()) != null) {
            try {
                r(this, assetsHolder, view, y0VarB, num, oVar, null, 32, null);
                wc.g0 g0Var = wc.g0.f27756a;
            } catch (Throwable unused) {
            }
        }
        boolean zD = this.f23729c.d();
        if (((!z10 || zD) && (z10 || !zD)) || (lVarC = this.f23729c.c()) == null) {
            return;
        }
        try {
            m(assetsHolder, view, lVarC, num, oVar, aVar);
            wc.g0 g0Var2 = wc.g0.f27756a;
        } catch (Throwable unused2) {
        }
    }

    public final void m(Object assetsHolder, View view, pb.l backgroundSource, Integer num, pb.o oVar, a aVar) {
        kotlin.jvm.internal.t.f(assetsHolder, "assetsHolder");
        kotlin.jvm.internal.t.f(view, "view");
        kotlin.jvm.internal.t.f(backgroundSource, "backgroundSource");
        if (backgroundSource instanceof pb.x) {
            j(view, true, ((pb.x) backgroundSource).a(), num, oVar, aVar);
        } else if (backgroundSource instanceof o0) {
            o(assetsHolder, view, true, ((o0) backgroundSource).a(), num, oVar);
        }
    }

    public final void n(Object assetsHolder, View view, y0 placeholder, Integer num, pb.o oVar, a aVar) {
        kotlin.jvm.internal.t.f(assetsHolder, "assetsHolder");
        kotlin.jvm.internal.t.f(view, "view");
        kotlin.jvm.internal.t.f(placeholder, "placeholder");
        z0 z0VarA = placeholder.a();
        if (z0VarA instanceof t0) {
            p(this, view, false, i.f23787a.e(((t0) z0VarA).a()), null, num, oVar, 8, null);
        } else if (z0VarA instanceof pb.y) {
            j(view, false, ((pb.y) z0VarA).a(), num, oVar, aVar);
        } else if (z0VarA instanceof p0) {
            o(assetsHolder, view, false, ((p0) z0VarA).a(), num, oVar);
        }
    }

    public final void o(Object assetsHolder, View view, boolean z10, n0 image, Integer num, pb.o oVar) {
        kotlin.jvm.internal.t.f(assetsHolder, "assetsHolder");
        kotlin.jvm.internal.t.f(view, "view");
        kotlin.jvm.internal.t.f(image, "image");
        c1 c1VarA = image.a().a();
        if (c1VarA instanceof pb.n) {
            h(view, z10, i.c(((pb.n) c1VarA).a()), image.b(), num, oVar);
            return;
        }
        if (!(c1VarA instanceof k1)) {
            if (c1VarA instanceof m0) {
                return;
            }
            boolean z11 = c1VarA instanceof m1;
        } else {
            r0 r0VarE = r0.f24202b.e(((k1) c1VarA).a());
            if (r0VarE != null) {
                this.f23728b.d(r0VarE, assetsHolder, new b(this, view, z10, image.b(), num, oVar));
            }
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f23735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TimeInterpolator f23736b;

        public a(long j10, TimeInterpolator interpolator) {
            kotlin.jvm.internal.t.f(interpolator, "interpolator");
            this.f23735a = j10;
            this.f23736b = interpolator;
        }

        public final long a() {
            return this.f23735a;
        }

        public final boolean b(View view) {
            kotlin.jvm.internal.t.f(view, "view");
            return this.f23735a > 0 && view.isLaidOut();
        }

        public final TimeInterpolator c() {
            return this.f23736b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f23735a == aVar.f23735a && kotlin.jvm.internal.t.a(this.f23736b, aVar.f23736b);
        }

        public int hashCode() {
            return (Long.hashCode(this.f23735a) * 31) + this.f23736b.hashCode();
        }

        public String toString() {
            return "AnimationConfig(durationMs=" + this.f23735a + ", interpolator=" + this.f23736b + ')';
        }

        public /* synthetic */ a(long j10, TimeInterpolator timeInterpolator, int i10, kotlin.jvm.internal.k kVar) {
            this((i10 & 1) != 0 ? 200L : j10, (i10 & 2) != 0 ? new DecelerateInterpolator() : timeInterpolator);
        }
    }
}
