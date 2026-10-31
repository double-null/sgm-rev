package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.w0;
import androidx.core.view.z0;

/* JADX INFO: compiled from: StandardMenuPopup.java */
/* JADX INFO: loaded from: classes.dex */
final class l extends h implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f939v = g.g.f15088m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f944f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f945g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f946h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final w0 f947i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private PopupWindow.OnDismissListener f950l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f951m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    View f952n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private j.a f953o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ViewTreeObserver f954p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f955q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f956r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f957s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f959u;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f948j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f949k = new b();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f958t = 0;

    /* JADX INFO: compiled from: StandardMenuPopup.java */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!l.this.a() || l.this.f947i.v()) {
                return;
            }
            View view = l.this.f952n;
            if (view == null || !view.isShown()) {
                l.this.dismiss();
            } else {
                l.this.f947i.show();
            }
        }
    }

    public l(Context context, e eVar, View view, int i10, int i11, boolean z10) {
        this.f940b = context;
        this.f941c = eVar;
        this.f943e = z10;
        this.f942d = new d(eVar, LayoutInflater.from(context), z10, f939v);
        this.f945g = i10;
        this.f946h = i11;
        Resources resources = context.getResources();
        this.f944f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(g.d.f15015d));
        this.f951m = view;
        this.f947i = new w0(context, null, i10, i11);
        eVar.c(this, context);
    }

    private boolean y() {
        View view;
        if (a()) {
            return true;
        }
        if (this.f955q || (view = this.f951m) == null) {
            return false;
        }
        this.f952n = view;
        this.f947i.E(this);
        this.f947i.F(this);
        this.f947i.D(true);
        View view2 = this.f952n;
        boolean z10 = this.f954p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f954p = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f948j);
        }
        view2.addOnAttachStateChangeListener(this.f949k);
        this.f947i.x(view2);
        this.f947i.A(this.f958t);
        if (!this.f956r) {
            this.f957s = h.n(this.f942d, null, this.f940b, this.f944f);
            this.f956r = true;
        }
        this.f947i.z(this.f957s);
        this.f947i.C(2);
        this.f947i.B(l());
        this.f947i.show();
        ListView listViewM = this.f947i.m();
        listViewM.setOnKeyListener(this);
        if (this.f959u && this.f941c.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f940b).inflate(g.g.f15087l, (ViewGroup) listViewM, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f941c.x());
            }
            frameLayout.setEnabled(false);
            listViewM.addHeaderView(frameLayout, null, false);
        }
        this.f947i.k(this.f942d);
        this.f947i.show();
        return true;
    }

    @Override // l.e
    public boolean a() {
        return !this.f955q && this.f947i.a();
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z10) {
        if (eVar != this.f941c) {
            return;
        }
        dismiss();
        j.a aVar = this.f953o;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(j.a aVar) {
        this.f953o = aVar;
    }

    @Override // l.e
    public void dismiss() {
        if (a()) {
            this.f947i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e(m mVar) {
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.f940b, mVar, this.f952n, this.f943e, this.f945g, this.f946h);
            iVar.j(this.f953o);
            iVar.g(h.w(mVar));
            iVar.i(this.f950l);
            this.f950l = null;
            this.f941c.e(false);
            int iB = this.f947i.b();
            int iJ = this.f947i.j();
            if ((Gravity.getAbsoluteGravity(this.f958t, z0.n(this.f951m)) & 7) == 5) {
                iB += this.f951m.getWidth();
            }
            if (iVar.n(iB, iJ)) {
                j.a aVar = this.f953o;
                if (aVar == null) {
                    return true;
                }
                aVar.c(mVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(boolean z10) {
        this.f956r = false;
        d dVar = this.f942d;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g() {
        return false;
    }

    @Override // l.e
    public ListView m() {
        return this.f947i.m();
    }

    @Override // androidx.appcompat.view.menu.h
    public void o(View view) {
        this.f951m = view;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f955q = true;
        this.f941c.close();
        ViewTreeObserver viewTreeObserver = this.f954p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f954p = this.f952n.getViewTreeObserver();
            }
            this.f954p.removeGlobalOnLayoutListener(this.f948j);
            this.f954p = null;
        }
        this.f952n.removeOnAttachStateChangeListener(this.f949k);
        PopupWindow.OnDismissListener onDismissListener = this.f950l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.h
    public void q(boolean z10) {
        this.f942d.d(z10);
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(int i10) {
        this.f958t = i10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(int i10) {
        this.f947i.d(i10);
    }

    @Override // l.e
    public void show() {
        if (!y()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f950l = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(boolean z10) {
        this.f959u = z10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(int i10) {
        this.f947i.g(i10);
    }

    /* JADX INFO: compiled from: StandardMenuPopup.java */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = l.this.f954p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    l.this.f954p = view.getViewTreeObserver();
                }
                l lVar = l.this;
                lVar.f954p.removeGlobalOnLayoutListener(lVar.f948j);
            }
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void j(e eVar) {
    }
}
