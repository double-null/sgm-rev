package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: FragmentLifecycleCallbacksDispatcher.java */
/* JADX INFO: loaded from: classes.dex */
class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList<a> f2650a = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f2651b;

    /* JADX INFO: compiled from: FragmentLifecycleCallbacksDispatcher.java */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f2652a;
    }

    m(n nVar) {
        this.f2651b = nVar;
    }

    void a(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment fragmentV0 = this.f2651b.v0();
        if (fragmentV0 != null) {
            fragmentV0.getParentFragmentManager().u0().a(fragment, bundle, true);
        }
        for (a aVar : this.f2650a) {
            if (!z10 || aVar.f2652a) {
                aVar.getClass();
                throw null;
            }
        }
    }

    void b(Fragment fragment, boolean z10) {
        this.f2651b.s0().f();
        Fragment fragmentV0 = this.f2651b.v0();
        if (fragmentV0 != null) {
            fragmentV0.getParentFragmentManager().u0().b(fragment, true);
        }
        for (a aVar : this.f2650a) {
            if (!z10 || aVar.f2652a) {
                aVar.getClass();
                throw null;
            }
        }
    }

    void c(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment fragmentV0 = this.f2651b.v0();
        if (fragmentV0 != null) {
            fragmentV0.getParentFragmentManager().u0().c(fragment, bundle, true);
        }
        for (a aVar : this.f2650a) {
            if (!z10 || aVar.f2652a) {
                aVar.getClass();
                throw null;
            }
        }
    }

    void d(Fragment fragment, boolean z10) {
        Fragment fragmentV0 = this.f2651b.v0();
        if (fragmentV0 != null) {
            fragmentV0.getParentFragmentManager().u0().d(fragment, true);
        }
        for (a aVar : this.f2650a) {
            if (!z10 || aVar.f2652a) {
                aVar.getClass();
                throw null;
            }
        }
    }

    void e(Fragment fragment, boolean z10) {
        Fragment fragmentV0 = this.f2651b.v0();
        if (fragmentV0 != null) {
            fragmentV0.getParentFragmentManager().u0().e(fragment, true);
        }
        for (a aVar : this.f2650a) {
            if (!z10 || aVar.f2652a) {
                aVar.getClass();
                throw null;
            }
        }
    }

    void f(Fragment fragment, boolean z10) {
        Fragment fragmentV0 = this.f2651b.v0();
        if (fragmentV0 != null) {
            fragmentV0.getParentFragmentManager().u0().f(fragment, true);
        }
        for (a aVar : this.f2650a) {
            if (!z10 || aVar.f2652a) {
                aVar.getClass();
                throw null;
            }
        }
    }

    void g(Fragment fragment, boolean z10) {
        this.f2651b.s0().f();
        Fragment fragmentV0 = this.f2651b.v0();
        if (fragmentV0 != null) {
            fragmentV0.getParentFragmentManager().u0().g(fragment, true);
        }
        for (a aVar : this.f2650a) {
            if (!z10 || aVar.f2652a) {
                aVar.getClass();
                throw null;
            }
        }
    }

    void h(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment fragmentV0 = this.f2651b.v0();
        if (fragmentV0 != null) {
            fragmentV0.getParentFragmentManager().u0().h(fragment, bundle, true);
        }
        for (a aVar : this.f2650a) {
            if (!z10 || aVar.f2652a) {
                aVar.getClass();
                throw null;
            }
        }
    }

    void i(Fragment fragment, boolean z10) {
        Fragment fragmentV0 = this.f2651b.v0();
        if (fragmentV0 != null) {
            fragmentV0.getParentFragmentManager().u0().i(fragment, true);
        }
        for (a aVar : this.f2650a) {
            if (!z10 || aVar.f2652a) {
                aVar.getClass();
                throw null;
            }
        }
    }

    void j(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment fragmentV0 = this.f2651b.v0();
        if (fragmentV0 != null) {
            fragmentV0.getParentFragmentManager().u0().j(fragment, bundle, true);
        }
        for (a aVar : this.f2650a) {
            if (!z10 || aVar.f2652a) {
                aVar.getClass();
                throw null;
            }
        }
    }

    void k(Fragment fragment, boolean z10) {
        Fragment fragmentV0 = this.f2651b.v0();
        if (fragmentV0 != null) {
            fragmentV0.getParentFragmentManager().u0().k(fragment, true);
        }
        for (a aVar : this.f2650a) {
            if (!z10 || aVar.f2652a) {
                aVar.getClass();
                throw null;
            }
        }
    }

    void l(Fragment fragment, boolean z10) {
        Fragment fragmentV0 = this.f2651b.v0();
        if (fragmentV0 != null) {
            fragmentV0.getParentFragmentManager().u0().l(fragment, true);
        }
        for (a aVar : this.f2650a) {
            if (!z10 || aVar.f2652a) {
                aVar.getClass();
                throw null;
            }
        }
    }

    void m(Fragment fragment, View view, Bundle bundle, boolean z10) {
        Fragment fragmentV0 = this.f2651b.v0();
        if (fragmentV0 != null) {
            fragmentV0.getParentFragmentManager().u0().m(fragment, view, bundle, true);
        }
        for (a aVar : this.f2650a) {
            if (!z10 || aVar.f2652a) {
                aVar.getClass();
                throw null;
            }
        }
    }

    void n(Fragment fragment, boolean z10) {
        Fragment fragmentV0 = this.f2651b.v0();
        if (fragmentV0 != null) {
            fragmentV0.getParentFragmentManager().u0().n(fragment, true);
        }
        for (a aVar : this.f2650a) {
            if (!z10 || aVar.f2652a) {
                aVar.getClass();
                throw null;
            }
        }
    }
}
