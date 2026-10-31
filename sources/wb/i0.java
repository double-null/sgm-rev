package wb;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Insets;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;

/* JADX INFO: compiled from: ViewUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i0 {

    /* JADX INFO: compiled from: ViewUtils.kt */
    static final class a extends kotlin.jvm.internal.u implements id.l<Throwable, wc.g0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f27701d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ b f27702e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, b bVar) {
            super(1);
            this.f27701d = view;
            this.f27702e = bVar;
        }

        public final void b(Throwable th) {
            this.f27701d.removeOnLayoutChangeListener(this.f27702e);
        }

        @Override // id.l
        public /* bridge */ /* synthetic */ wc.g0 invoke(Throwable th) {
            b(th);
            return wc.g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: ViewUtils.kt */
    public static final class b implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f27703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ud.n<View> f27704b;

        /* JADX WARN: Multi-variable type inference failed */
        b(View view, ud.n<? super View> nVar) {
            this.f27703a = view;
            this.f27704b = nVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            kotlin.jvm.internal.t.f(view, "view");
            this.f27703a.removeOnLayoutChangeListener(this);
            this.f27704b.resumeWith(wc.r.c(view));
        }
    }

    /* JADX INFO: compiled from: ViewUtils.kt */
    public static final class c implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f27705a;

        c(View view) {
            this.f27705a = view;
        }

        @Override // wb.v
        public void p() {
            this.f27705a.setVisibility(8);
        }
    }

    /* JADX INFO: compiled from: ViewUtils.kt */
    public static final class d implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f27706a;

        d(View view) {
            this.f27706a = view;
        }

        @Override // wb.v
        public void p() {
            this.f27706a.setVisibility(0);
        }
    }

    public static final void b(View view, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        kotlin.jvm.internal.t.f(view, "<this>");
        kotlin.jvm.internal.t.f(onPreDrawListener, "onPreDrawListener");
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            c(viewTreeObserver, onPreDrawListener);
        }
    }

    public static final void c(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        kotlin.jvm.internal.t.f(viewTreeObserver, "<this>");
        kotlin.jvm.internal.t.f(onPreDrawListener, "onPreDrawListener");
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
        }
    }

    public static final void d(ViewGroup viewGroup, View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.t.f(viewGroup, "<this>");
        kotlin.jvm.internal.t.f(view, "view");
        try {
            viewGroup.removeAllViews();
            wc.g0 g0Var = wc.g0.f27756a;
        } catch (Throwable unused) {
        }
        f(viewGroup, view, 0, layoutParams, 2, null);
    }

    public static final void e(ViewGroup viewGroup, View view, int i10, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.t.f(viewGroup, "<this>");
        kotlin.jvm.internal.t.f(view, "view");
        try {
            q(view);
            if (layoutParams != null) {
                viewGroup.addView(view, i10, layoutParams);
            } else {
                viewGroup.addView(view, i10);
            }
            wc.g0 g0Var = wc.g0.f27756a;
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ void f(ViewGroup viewGroup, View view, int i10, ViewGroup.LayoutParams layoutParams, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = -1;
        }
        if ((i11 & 4) != 0) {
            layoutParams = null;
        }
        e(viewGroup, view, i10, layoutParams);
    }

    public static final Object g(View view, zc.f<? super View> fVar) {
        ud.p pVar = new ud.p(ad.c.c(fVar), 1);
        pVar.G();
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            b bVar = new b(view, pVar);
            pVar.H(new a(view, bVar));
            view.addOnLayoutChangeListener(bVar);
            if (!view.isLaidOut() && !view.isLayoutRequested()) {
                view.requestLayout();
            }
        } else {
            pVar.resumeWith(wc.r.c(view));
        }
        Object objZ = pVar.z();
        if (objZ == ad.d.f()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objZ;
    }

    public static final Activity h(View view) {
        kotlin.jvm.internal.t.f(view, "<this>");
        View viewI = i(view);
        Context context = viewI != null ? viewI.getContext() : null;
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return e0.n((ContextWrapper) context, 0, 1, null);
        }
        return null;
    }

    public static final View i(View view) {
        kotlin.jvm.internal.t.f(view, "<this>");
        if (o(view)) {
            return view;
        }
        ViewParent parent = view.getParent();
        View view2 = null;
        while (parent instanceof View) {
            view2 = (View) parent;
            if (o(view2)) {
                break;
            }
            parent = view2.getParent();
        }
        return view2;
    }

    public static final Window j(View view) {
        kotlin.jvm.internal.t.f(view, "<this>");
        Activity activityH = h(view);
        if (activityH != null) {
            return activityH.getWindow();
        }
        return null;
    }

    public static final int k(View view) {
        kotlin.jvm.internal.t.f(view, "<this>");
        Context context = view.getContext();
        kotlin.jvm.internal.t.e(context, "context");
        return e0.C(context, view.getHeight());
    }

    public static final Rect l(View view) {
        kotlin.jvm.internal.t.f(view, "<this>");
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return new Rect(iArr[0], iArr[1], view.getWidth() + iArr[0], view.getHeight() + iArr[1]);
    }

    public static final int m(View view) {
        kotlin.jvm.internal.t.f(view, "<this>");
        Context context = view.getContext();
        kotlin.jvm.internal.t.e(context, "context");
        return e0.C(context, view.getWidth());
    }

    public static final void n(View view) {
        if (view == null) {
            return;
        }
        a0.c(new c(view));
    }

    public static final boolean o(View view) {
        kotlin.jvm.internal.t.f(view, "<this>");
        return view.getId() == 16908290;
    }

    public static final boolean p(View view) {
        kotlin.jvm.internal.t.f(view, "<this>");
        return g0.g(view.getVisibility());
    }

    public static final wc.g0 q(View view) {
        kotlin.jvm.internal.t.f(view, "<this>");
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return null;
        }
        viewGroup.removeView(view);
        return wc.g0.f27756a;
    }

    public static final void r(View view, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        kotlin.jvm.internal.t.f(view, "<this>");
        kotlin.jvm.internal.t.f(onPreDrawListener, "onPreDrawListener");
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            s(viewTreeObserver, onPreDrawListener);
        }
    }

    public static final void s(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        kotlin.jvm.internal.t.f(viewTreeObserver, "<this>");
        kotlin.jvm.internal.t.f(onPreDrawListener, "onPreDrawListener");
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        }
    }

    public static final void t(View view, Integer num) {
        if (view == null || num == null) {
            return;
        }
        try {
            view.setBackgroundColor(num.intValue());
            wc.g0 g0Var = wc.g0.f27756a;
        } catch (Throwable unused) {
        }
    }

    public static final void u(View view, final int i10) {
        kotlin.jvm.internal.t.f(view, "<this>");
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: wb.h0
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                return i0.v(i10, view2, windowInsets);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets v(int i10, View selfView, WindowInsets windowInsets) {
        kotlin.jvm.internal.t.f(selfView, "selfView");
        kotlin.jvm.internal.t.f(windowInsets, "windowInsets");
        Insets insets = windowInsets.getInsets(i10);
        kotlin.jvm.internal.t.e(insets, "windowInsets.getInsets(typeInsets)");
        selfView.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return windowInsets;
    }

    public static final void w(View view) {
        if (view == null) {
            return;
        }
        a0.c(new d(view));
    }
}
