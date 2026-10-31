package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: compiled from: AppCompatDelegate.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f630a = -100;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final androidx.collection.b<WeakReference<e>> f631b = new androidx.collection.b<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f632c = new Object();

    e() {
    }

    public static e e(Activity activity, d dVar) {
        return new f(activity, dVar);
    }

    public static e f(Dialog dialog, d dVar) {
        return new f(dialog, dVar);
    }

    public static int h() {
        return f630a;
    }

    static void o(e eVar) {
        synchronized (f632c) {
            y(eVar);
            f631b.add(new WeakReference<>(eVar));
        }
    }

    static void p(e eVar) {
        synchronized (f632c) {
            y(eVar);
        }
    }

    private static void y(e eVar) {
        synchronized (f632c) {
            Iterator<WeakReference<e>> it = f631b.iterator();
            while (it.hasNext()) {
                e eVar2 = it.next().get();
                if (eVar2 == eVar || eVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void A(int i10);

    public abstract void B(View view);

    public abstract void C(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void D(Toolbar toolbar);

    public abstract void F(CharSequence charSequence);

    public abstract k.b G(k.b.a aVar);

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public abstract <T extends View> T g(int i10);

    public abstract b i();

    public int j() {
        return -100;
    }

    public abstract MenuInflater k();

    public abstract a l();

    public abstract void m();

    public abstract void n();

    public abstract void q(Configuration configuration);

    public abstract void r(Bundle bundle);

    public abstract void s();

    public abstract void t(Bundle bundle);

    public abstract void u();

    public abstract void v(Bundle bundle);

    public abstract void w();

    public abstract void x();

    public abstract boolean z(int i10);

    public void E(int i10) {
    }

    public void d(Context context) {
    }
}
