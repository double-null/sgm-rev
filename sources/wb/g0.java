package wb;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;

/* JADX INFO: compiled from: ViewUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f27698a = new g0();

    private g0() {
    }

    public static final void a(ViewGroup container, View view) {
        kotlin.jvm.internal.t.f(container, "container");
        kotlin.jvm.internal.t.f(view, "view");
        b(container, view, null);
    }

    public static final void b(ViewGroup container, View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.t.f(container, "container");
        kotlin.jvm.internal.t.f(view, "view");
        i0.d(container, view, layoutParams);
    }

    public static final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    public static final View d(View view) {
        kotlin.jvm.internal.t.f(view, "view");
        return i0.i(view);
    }

    public static final int e() {
        return View.generateViewId();
    }

    public static final void f(View view) {
        i0.n(view);
    }

    public static final boolean g(int i10) {
        return i10 == 0;
    }

    public static final wc.g0 h(View view) {
        kotlin.jvm.internal.t.f(view, "view");
        return i0.q(view);
    }

    public static final void i(View view) {
        kotlin.jvm.internal.t.f(view, "view");
        j(view, WindowInsets.Type.systemBars() | WindowInsets.Type.displayCutout());
    }

    public static final void j(View view, int i10) {
        kotlin.jvm.internal.t.f(view, "view");
        i0.u(view, i10);
    }

    public static final void k(View view) {
        i0.w(view);
    }
}
