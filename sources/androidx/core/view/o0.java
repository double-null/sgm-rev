package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: SoftwareKeyboardControllerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f1961a;

    /* JADX INFO: compiled from: SoftwareKeyboardControllerCompat.java */
    private static class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f1962a;

        a(View view) {
            this.f1962a = view;
        }

        @Override // androidx.core.view.o0.c
        void a() {
            View view = this.f1962a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f1962a.getWindowToken(), 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: SoftwareKeyboardControllerCompat.java */
    static class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private View f1963b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WindowInsetsController f1964c;

        b(View view) {
            super(view);
            this.f1963b = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void c(AtomicBoolean atomicBoolean, WindowInsetsController windowInsetsController, int i10) {
            atomicBoolean.set((i10 & 8) != 0);
        }

        @Override // androidx.core.view.o0.a, androidx.core.view.o0.c
        void a() {
            View view;
            WindowInsetsController windowInsetsController = this.f1964c;
            if (windowInsetsController == null) {
                View view2 = this.f1963b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController == null) {
                super.a();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.u0
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i10) {
                    o0.b.c(atomicBoolean, windowInsetsController2, i10);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            if (!atomicBoolean.get() && (view = this.f1963b) != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f1963b.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            windowInsetsController.hide(WindowInsets.Type.ime());
        }
    }

    /* JADX INFO: compiled from: SoftwareKeyboardControllerCompat.java */
    private static class c {
        c() {
        }

        void a() {
            throw null;
        }
    }

    public o0(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f1961a = new b(view);
        } else {
            this.f1961a = new a(view);
        }
    }

    public void a() {
        this.f1961a.a();
    }
}
