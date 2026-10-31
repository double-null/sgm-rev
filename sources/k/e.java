package k;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: StandaloneActionMode.java */
/* JADX INFO: loaded from: classes.dex */
public class e extends b implements androidx.appcompat.view.menu.e.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f21055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ActionBarContextView f21056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b.a f21057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private WeakReference<View> f21058f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f21059g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f21060h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private androidx.appcompat.view.menu.e f21061i;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z10) {
        this.f21055c = context;
        this.f21056d = actionBarContextView;
        this.f21057e = aVar;
        androidx.appcompat.view.menu.e eVarS = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).S(1);
        this.f21061i = eVarS;
        eVarS.R(this);
        this.f21060h = z10;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.f21057e.a(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        k();
        this.f21056d.l();
    }

    @Override // k.b
    public void c() {
        if (this.f21059g) {
            return;
        }
        this.f21059g = true;
        this.f21056d.sendAccessibilityEvent(32);
        this.f21057e.d(this);
    }

    @Override // k.b
    public View d() {
        WeakReference<View> weakReference = this.f21058f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // k.b
    public Menu e() {
        return this.f21061i;
    }

    @Override // k.b
    public MenuInflater f() {
        return new g(this.f21056d.getContext());
    }

    @Override // k.b
    public CharSequence g() {
        return this.f21056d.getSubtitle();
    }

    @Override // k.b
    public CharSequence i() {
        return this.f21056d.getTitle();
    }

    @Override // k.b
    public void k() {
        this.f21057e.c(this, this.f21061i);
    }

    @Override // k.b
    public boolean l() {
        return this.f21056d.j();
    }

    @Override // k.b
    public void m(View view) {
        this.f21056d.setCustomView(view);
        this.f21058f = view != null ? new WeakReference<>(view) : null;
    }

    @Override // k.b
    public void n(int i10) {
        o(this.f21055c.getString(i10));
    }

    @Override // k.b
    public void o(CharSequence charSequence) {
        this.f21056d.setSubtitle(charSequence);
    }

    @Override // k.b
    public void q(int i10) {
        r(this.f21055c.getString(i10));
    }

    @Override // k.b
    public void r(CharSequence charSequence) {
        this.f21056d.setTitle(charSequence);
    }

    @Override // k.b
    public void s(boolean z10) {
        super.s(z10);
        this.f21056d.setTitleOptional(z10);
    }
}
