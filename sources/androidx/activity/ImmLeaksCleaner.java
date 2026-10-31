package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.f;
import androidx.lifecycle.h;
import androidx.lifecycle.j;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
final class ImmLeaksCleaner implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Field f501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Field f502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Field f503e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Activity f504a;

    private static void h() {
        try {
            f500b = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f502d = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f503e = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f501c = declaredField3;
            declaredField3.setAccessible(true);
            f500b = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.h
    public void b(j jVar, f.a aVar) {
        if (aVar != f.a.ON_DESTROY) {
            return;
        }
        if (f500b == 0) {
            h();
        }
        if (f500b == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f504a.getSystemService("input_method");
            try {
                Object obj = f501c.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f502d.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f503e.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused) {
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    } catch (ClassCastException unused2) {
                    } catch (IllegalAccessException unused3) {
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
