package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.g0;
import be.LNO.fzLzfW;

/* JADX INFO: compiled from: FragmentController.java */
/* JADX INFO: loaded from: classes2.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k<?> f2642a;

    private i(k<?> kVar) {
        this.f2642a = kVar;
    }

    public static i b(k<?> kVar) {
        return new i((k) w.h.d(kVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        k<?> kVar = this.f2642a;
        kVar.f2648e.k(kVar, kVar, fragment);
    }

    public void c() {
        this.f2642a.f2648e.y();
    }

    public void d(Configuration configuration) {
        this.f2642a.f2648e.A(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.f2642a.f2648e.B(menuItem);
    }

    public void f() {
        this.f2642a.f2648e.C();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.f2642a.f2648e.D(menu, menuInflater);
    }

    public void h() {
        this.f2642a.f2648e.E();
    }

    public void i() {
        this.f2642a.f2648e.G();
    }

    public void j(boolean z10) {
        this.f2642a.f2648e.H(z10);
    }

    public boolean k(MenuItem menuItem) {
        return this.f2642a.f2648e.J(menuItem);
    }

    public void l(Menu menu) {
        this.f2642a.f2648e.K(menu);
    }

    public void m() {
        this.f2642a.f2648e.M();
    }

    public void n(boolean z10) {
        this.f2642a.f2648e.N(z10);
    }

    public boolean o(Menu menu) {
        return this.f2642a.f2648e.O(menu);
    }

    public void p() {
        this.f2642a.f2648e.Q();
    }

    public void q() {
        this.f2642a.f2648e.R();
    }

    public void r() {
        this.f2642a.f2648e.T();
    }

    public boolean s() {
        return this.f2642a.f2648e.a0(true);
    }

    public n t() {
        return this.f2642a.f2648e;
    }

    public void u() {
        this.f2642a.f2648e.R0();
    }

    public View v(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f2642a.f2648e.t0().onCreateView(view, str, context, attributeSet);
    }

    public Parcelable x() {
        return this.f2642a.f2648e.f1();
    }

    public void w(Parcelable parcelable) {
        k<?> kVar = this.f2642a;
        if (!(kVar instanceof g0)) {
            throw new IllegalStateException(fzLzfW.yQkppxHi);
        }
        kVar.f2648e.d1(parcelable);
    }
}
