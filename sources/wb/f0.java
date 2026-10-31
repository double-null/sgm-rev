package wb;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: ViewShowState.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<ViewGroup> f27695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewGroup.LayoutParams f27696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27697c = -1;

    public final void a() {
        WeakReference<ViewGroup> weakReference = this.f27695a;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f27695a = null;
        this.f27696b = null;
        this.f27697c = -1;
    }

    public final void b(View view) {
        ViewGroup viewGroup;
        kotlin.jvm.internal.t.f(view, "view");
        WeakReference<ViewGroup> weakReference = this.f27695a;
        if (weakReference != null && (viewGroup = weakReference.get()) != null) {
            i0.e(viewGroup, view, this.f27697c, this.f27696b);
        }
        a();
    }

    public final void c(View view) {
        kotlin.jvm.internal.t.f(view, "view");
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        this.f27695a = new WeakReference<>(viewGroup);
        this.f27696b = view.getLayoutParams();
        viewGroup.indexOfChild(view);
    }
}
