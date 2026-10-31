package k;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: compiled from: ActionMode.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f21048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f21049b;

    /* JADX INFO: compiled from: ActionMode.java */
    public interface a {
        boolean a(b bVar, MenuItem menuItem);

        boolean b(b bVar, Menu menu);

        boolean c(b bVar, Menu menu);

        void d(b bVar);
    }

    public abstract void c();

    public abstract View d();

    public abstract Menu e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public Object h() {
        return this.f21048a;
    }

    public abstract CharSequence i();

    public boolean j() {
        return this.f21049b;
    }

    public abstract void k();

    public abstract boolean l();

    public abstract void m(View view);

    public abstract void n(int i10);

    public abstract void o(CharSequence charSequence);

    public void p(Object obj) {
        this.f21048a = obj;
    }

    public abstract void q(int i10);

    public abstract void r(CharSequence charSequence);

    public void s(boolean z10) {
        this.f21049b = z10;
    }
}
