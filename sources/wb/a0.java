package wb;

import android.app.Activity;
import android.view.Window;

/* JADX INFO: compiled from: UiUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f27682a = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final dc.d f27683b = new fc.c();

    private a0() {
    }

    public static final void a(Activity activity) {
        kotlin.jvm.internal.t.f(activity, "activity");
        b0.a(activity);
    }

    public static final void b(Activity activity) {
        kotlin.jvm.internal.t.f(activity, "activity");
        b0.e(activity);
    }

    public static final boolean c(Runnable runnable) {
        if (runnable == null) {
            return false;
        }
        return f27683b.c(runnable);
    }

    public static final void d(Activity activity) {
        kotlin.jvm.internal.t.f(activity, "activity");
        b0.h(activity);
    }

    public static final wc.g0 e(Window window, int i10) {
        return b0.k(window, i10);
    }
}
