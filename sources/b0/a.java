package b0;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.t2;
import androidx.core.view.u2;
import java.util.Iterator;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: PoolingContainer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f3853a = d.f3857b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f3854b = d.f3856a;

    public static final void a(View view) {
        t.f(view, "<this>");
        Iterator<View> it = u2.a(view).iterator();
        while (it.hasNext()) {
            c(it.next()).a();
        }
    }

    public static final void b(ViewGroup viewGroup) {
        t.f(viewGroup, "<this>");
        Iterator<View> it = t2.a(viewGroup).iterator();
        while (it.hasNext()) {
            c(it.next()).a();
        }
    }

    private static final c c(View view) {
        int i10 = f3853a;
        c cVar = (c) view.getTag(i10);
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        view.setTag(i10, cVar2);
        return cVar2;
    }

    public static final void d(View view, boolean z10) {
        t.f(view, "<this>");
        view.setTag(f3854b, Boolean.valueOf(z10));
    }
}
