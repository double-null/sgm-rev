package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: compiled from: WindowInsetsControllerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f1990a;

    /* JADX INFO: compiled from: WindowInsetsControllerCompat.java */
    private static class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Window f1991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final o0 f1992b;

        a(Window window, o0 o0Var) {
            this.f1991a = window;
            this.f1992b = o0Var;
        }

        private void c(int i10) {
            if (i10 == 1) {
                d(4);
            } else if (i10 == 2) {
                d(2);
            } else {
                if (i10 != 8) {
                    return;
                }
                this.f1992b.a();
            }
        }

        @Override // androidx.core.view.y3.e
        void a(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    c(i11);
                }
            }
        }

        @Override // androidx.core.view.y3.e
        void b(int i10) {
            if (i10 == 0) {
                e(6144);
                return;
            }
            if (i10 == 1) {
                e(4096);
                d(2048);
            } else {
                if (i10 != 2) {
                    return;
                }
                e(2048);
                d(4096);
            }
        }

        protected void d(int i10) {
            View decorView = this.f1991a.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        protected void e(int i10) {
            View decorView = this.f1991a.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }
    }

    /* JADX INFO: compiled from: WindowInsetsControllerCompat.java */
    private static class b extends a {
        b(Window window, o0 o0Var) {
            super(window, o0Var);
        }
    }

    /* JADX INFO: compiled from: WindowInsetsControllerCompat.java */
    private static class c extends b {
        c(Window window, o0 o0Var) {
            super(window, o0Var);
        }
    }

    /* JADX INFO: compiled from: WindowInsetsControllerCompat.java */
    private static class e {
        e() {
        }

        void a(int i10) {
            throw null;
        }

        void b(int i10) {
            throw null;
        }
    }

    public y3(Window window, View view) {
        o0 o0Var = new o0(view);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f1990a = new d(window, this, o0Var);
        } else if (i10 >= 26) {
            this.f1990a = new c(window, o0Var);
        } else {
            this.f1990a = new b(window, o0Var);
        }
    }

    public void a(int i10) {
        this.f1990a.a(i10);
    }

    public void b(int i10) {
        this.f1990a.b(i10);
    }

    /* JADX INFO: compiled from: WindowInsetsControllerCompat.java */
    private static class d extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final y3 f1993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final WindowInsetsController f1994b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final o0 f1995c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final androidx.collection.h<Object, WindowInsetsController.OnControllableInsetsChangedListener> f1996d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected Window f1997e;

        d(Window window, y3 y3Var, o0 o0Var) {
            this(window.getInsetsController(), y3Var, o0Var);
            this.f1997e = window;
        }

        @Override // androidx.core.view.y3.e
        void a(int i10) {
            if ((i10 & 8) != 0) {
                this.f1995c.a();
            }
            this.f1994b.hide(i10 & (-9));
        }

        @Override // androidx.core.view.y3.e
        void b(int i10) {
            this.f1994b.setSystemBarsBehavior(i10);
        }

        d(WindowInsetsController windowInsetsController, y3 y3Var, o0 o0Var) {
            this.f1996d = new androidx.collection.h<>();
            this.f1994b = windowInsetsController;
            this.f1993a = y3Var;
            this.f1995c = o0Var;
        }
    }
}
