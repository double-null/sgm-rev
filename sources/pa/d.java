package pa;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes5.dex */
public interface d {
    void b();

    void c();

    void c(g7.e eVar);

    void d();

    void destroy();

    default void f(ViewGroup rootContainer) {
        kotlin.jvm.internal.t.f(rootContainer, "rootContainer");
    }

    pb.a g();

    boolean h();

    View o();

    default void m() {
    }
}
