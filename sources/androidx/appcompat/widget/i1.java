package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.core.view.x2;
import androidx.core.view.z2;

/* JADX INFO: compiled from: ToolbarWidgetWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public class i1 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Toolbar f1295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f1297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f1298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f1299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f1300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable f1301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1302h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    CharSequence f1303i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CharSequence f1304j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CharSequence f1305k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    Window.Callback f1306l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f1307m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private c f1308n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f1309o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f1310p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Drawable f1311q;

    /* JADX INFO: compiled from: ToolbarWidgetWrapper.java */
    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final l.a f1312a;

        a() {
            this.f1312a = new l.a(i1.this.f1295a.getContext(), 0, R.id.home, 0, 0, i1.this.f1303i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i1 i1Var = i1.this;
            Window.Callback callback = i1Var.f1306l;
            if (callback == null || !i1Var.f1307m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f1312a);
        }
    }

    /* JADX INFO: compiled from: ToolbarWidgetWrapper.java */
    class b extends z2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f1314a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f1315b;

        b(int i10) {
            this.f1315b = i10;
        }

        @Override // androidx.core.view.z2, androidx.core.view.y2
        public void a(View view) {
            this.f1314a = true;
        }

        @Override // androidx.core.view.y2
        public void b(View view) {
            if (this.f1314a) {
                return;
            }
            i1.this.f1295a.setVisibility(this.f1315b);
        }

        @Override // androidx.core.view.z2, androidx.core.view.y2
        public void c(View view) {
            i1.this.f1295a.setVisibility(0);
        }
    }

    public i1(Toolbar toolbar, boolean z10) {
        this(toolbar, z10, g.h.f15096a, g.e.f15037n);
    }

    private void G(CharSequence charSequence) {
        this.f1303i = charSequence;
        if ((this.f1296b & 8) != 0) {
            this.f1295a.setTitle(charSequence);
        }
    }

    private void H() {
        if ((this.f1296b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1305k)) {
                this.f1295a.setNavigationContentDescription(this.f1310p);
            } else {
                this.f1295a.setNavigationContentDescription(this.f1305k);
            }
        }
    }

    private void I() {
        if ((this.f1296b & 4) == 0) {
            this.f1295a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f1295a;
        Drawable drawable = this.f1301g;
        if (drawable == null) {
            drawable = this.f1311q;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void J() {
        Drawable drawable;
        int i10 = this.f1296b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f1300f) == null) {
            drawable = this.f1299e;
        }
        this.f1295a.setLogo(drawable);
    }

    private int x() {
        if (this.f1295a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1311q = this.f1295a.getNavigationIcon();
        return 15;
    }

    public void A(Drawable drawable) {
        this.f1300f = drawable;
        J();
    }

    public void B(int i10) {
        C(i10 == 0 ? null : getContext().getString(i10));
    }

    public void C(CharSequence charSequence) {
        this.f1305k = charSequence;
        H();
    }

    public void D(Drawable drawable) {
        this.f1301g = drawable;
        I();
    }

    public void E(CharSequence charSequence) {
        this.f1304j = charSequence;
        if ((this.f1296b & 8) != 0) {
            this.f1295a.setSubtitle(charSequence);
        }
    }

    public void F(CharSequence charSequence) {
        this.f1302h = true;
        G(charSequence);
    }

    @Override // androidx.appcompat.widget.l0
    public boolean a() {
        return this.f1295a.d();
    }

    @Override // androidx.appcompat.widget.l0
    public boolean b() {
        return this.f1295a.w();
    }

    @Override // androidx.appcompat.widget.l0
    public boolean c() {
        return this.f1295a.O();
    }

    @Override // androidx.appcompat.widget.l0
    public void collapseActionView() {
        this.f1295a.e();
    }

    @Override // androidx.appcompat.widget.l0
    public void d(Menu menu, androidx.appcompat.view.menu.j.a aVar) {
        if (this.f1308n == null) {
            c cVar = new c(this.f1295a.getContext());
            this.f1308n = cVar;
            cVar.p(g.f.f15056g);
        }
        this.f1308n.d(aVar);
        this.f1295a.I((androidx.appcompat.view.menu.e) menu, this.f1308n);
    }

    @Override // androidx.appcompat.widget.l0
    public boolean e() {
        return this.f1295a.A();
    }

    @Override // androidx.appcompat.widget.l0
    public void f() {
        this.f1307m = true;
    }

    @Override // androidx.appcompat.widget.l0
    public boolean g() {
        return this.f1295a.z();
    }

    @Override // androidx.appcompat.widget.l0
    public Context getContext() {
        return this.f1295a.getContext();
    }

    @Override // androidx.appcompat.widget.l0
    public CharSequence getTitle() {
        return this.f1295a.getTitle();
    }

    @Override // androidx.appcompat.widget.l0
    public boolean h() {
        return this.f1295a.v();
    }

    @Override // androidx.appcompat.widget.l0
    public void i(int i10) {
        View view;
        int i11 = this.f1296b ^ i10;
        this.f1296b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    H();
                }
                I();
            }
            if ((i11 & 3) != 0) {
                J();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f1295a.setTitle(this.f1303i);
                    this.f1295a.setSubtitle(this.f1304j);
                } else {
                    this.f1295a.setTitle((CharSequence) null);
                    this.f1295a.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) == 0 || (view = this.f1298d) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                this.f1295a.addView(view);
            } else {
                this.f1295a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.l0
    public Menu j() {
        return this.f1295a.getMenu();
    }

    @Override // androidx.appcompat.widget.l0
    public int k() {
        return this.f1309o;
    }

    @Override // androidx.appcompat.widget.l0
    public x2 l(int i10, long j10) {
        return androidx.core.view.z0.b(this.f1295a).b(i10 == 0 ? 1.0f : 0.0f).f(j10).h(new b(i10));
    }

    @Override // androidx.appcompat.widget.l0
    public ViewGroup m() {
        return this.f1295a;
    }

    @Override // androidx.appcompat.widget.l0
    public void o() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.l0
    public void p(boolean z10) {
        this.f1295a.setCollapsible(z10);
    }

    @Override // androidx.appcompat.widget.l0
    public void q() {
        this.f1295a.f();
    }

    @Override // androidx.appcompat.widget.l0
    public void r(a1 a1Var) {
        View view = this.f1297c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1295a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1297c);
            }
        }
        this.f1297c = a1Var;
        if (a1Var == null || this.f1309o != 2) {
            return;
        }
        this.f1295a.addView(a1Var, 0);
        Toolbar.e eVar = (Toolbar.e) this.f1297c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) eVar).width = -2;
        ((ViewGroup.MarginLayoutParams) eVar).height = -2;
        eVar.f626a = 8388691;
        a1Var.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.l0
    public void s(int i10) {
        A(i10 != 0 ? h.a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.l0
    public void setIcon(int i10) {
        setIcon(i10 != 0 ? h.a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.l0
    public void setWindowCallback(Window.Callback callback) {
        this.f1306l = callback;
    }

    @Override // androidx.appcompat.widget.l0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f1302h) {
            return;
        }
        G(charSequence);
    }

    @Override // androidx.appcompat.widget.l0
    public void t(androidx.appcompat.view.menu.j.a aVar, androidx.appcompat.view.menu.e.a aVar2) {
        this.f1295a.J(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.l0
    public void u(int i10) {
        this.f1295a.setVisibility(i10);
    }

    @Override // androidx.appcompat.widget.l0
    public int v() {
        return this.f1296b;
    }

    @Override // androidx.appcompat.widget.l0
    public void w() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void y(View view) {
        View view2 = this.f1298d;
        if (view2 != null && (this.f1296b & 16) != 0) {
            this.f1295a.removeView(view2);
        }
        this.f1298d = view;
        if (view == null || (this.f1296b & 16) == 0) {
            return;
        }
        this.f1295a.addView(view);
    }

    public void z(int i10) {
        if (i10 == this.f1310p) {
            return;
        }
        this.f1310p = i10;
        if (TextUtils.isEmpty(this.f1295a.getNavigationContentDescription())) {
            B(this.f1310p);
        }
    }

    public i1(Toolbar toolbar, boolean z10, int i10, int i11) {
        Drawable drawable;
        this.f1309o = 0;
        this.f1310p = 0;
        this.f1295a = toolbar;
        this.f1303i = toolbar.getTitle();
        this.f1304j = toolbar.getSubtitle();
        this.f1302h = this.f1303i != null;
        this.f1301g = toolbar.getNavigationIcon();
        h1 h1VarT = h1.t(toolbar.getContext(), null, g.j.f15111a, g.a.f14980c, 0);
        this.f1311q = h1VarT.f(g.j.f15166l);
        if (z10) {
            CharSequence charSequenceO = h1VarT.o(g.j.f15196r);
            if (!TextUtils.isEmpty(charSequenceO)) {
                F(charSequenceO);
            }
            CharSequence charSequenceO2 = h1VarT.o(g.j.f15186p);
            if (!TextUtils.isEmpty(charSequenceO2)) {
                E(charSequenceO2);
            }
            Drawable drawableF = h1VarT.f(g.j.f15176n);
            if (drawableF != null) {
                A(drawableF);
            }
            Drawable drawableF2 = h1VarT.f(g.j.f15171m);
            if (drawableF2 != null) {
                setIcon(drawableF2);
            }
            if (this.f1301g == null && (drawable = this.f1311q) != null) {
                D(drawable);
            }
            i(h1VarT.j(g.j.f15146h, 0));
            int iM = h1VarT.m(g.j.f15141g, 0);
            if (iM != 0) {
                y(LayoutInflater.from(this.f1295a.getContext()).inflate(iM, (ViewGroup) this.f1295a, false));
                i(this.f1296b | 16);
            }
            int iL = h1VarT.l(g.j.f15156j, 0);
            if (iL > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1295a.getLayoutParams();
                layoutParams.height = iL;
                this.f1295a.setLayoutParams(layoutParams);
            }
            int iD = h1VarT.d(g.j.f15136f, -1);
            int iD2 = h1VarT.d(g.j.f15131e, -1);
            if (iD >= 0 || iD2 >= 0) {
                this.f1295a.H(Math.max(iD, 0), Math.max(iD2, 0));
            }
            int iM2 = h1VarT.m(g.j.f15201s, 0);
            if (iM2 != 0) {
                Toolbar toolbar2 = this.f1295a;
                toolbar2.L(toolbar2.getContext(), iM2);
            }
            int iM3 = h1VarT.m(g.j.f15191q, 0);
            if (iM3 != 0) {
                Toolbar toolbar3 = this.f1295a;
                toolbar3.K(toolbar3.getContext(), iM3);
            }
            int iM4 = h1VarT.m(g.j.f15181o, 0);
            if (iM4 != 0) {
                this.f1295a.setPopupTheme(iM4);
            }
        } else {
            this.f1296b = x();
        }
        h1VarT.u();
        z(i10);
        this.f1305k = this.f1295a.getNavigationContentDescription();
        this.f1295a.setNavigationOnClickListener(new a());
    }

    @Override // androidx.appcompat.widget.l0
    public void setIcon(Drawable drawable) {
        this.f1299e = drawable;
        J();
    }

    @Override // androidx.appcompat.widget.l0
    public void n(boolean z10) {
    }
}
