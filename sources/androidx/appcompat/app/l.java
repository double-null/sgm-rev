package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.a1;
import androidx.appcompat.widget.l0;
import androidx.core.view.a3;
import androidx.core.view.x2;
import androidx.core.view.y2;
import androidx.core.view.z0;
import androidx.core.view.z2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: WindowDecorActionBar.java */
/* JADX INFO: loaded from: classes.dex */
public class l extends androidx.appcompat.app.a implements ActionBarOverlayLayout.d {
    private static final Interpolator F = new AccelerateInterpolator();
    private static final Interpolator G = new DecelerateInterpolator();
    private boolean A;
    boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Activity f741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Dialog f742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ActionBarOverlayLayout f743e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ActionBarContainer f744f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    l0 f745g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ActionBarContextView f746h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    View f747i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    a1 f748j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f751m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    d f752n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    k.b f753o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    k.b.a f754p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f755q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f757s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    boolean f760v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f761w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f762x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    k.h f764z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ArrayList<Object> f749k = new ArrayList<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f750l = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ArrayList<androidx.appcompat.app.a.b> f756r = new ArrayList<>();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f758t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f759u = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f763y = true;
    final y2 C = new a();
    final y2 D = new b();
    final a3 E = new c();

    /* JADX INFO: compiled from: WindowDecorActionBar.java */
    class a extends z2 {
        a() {
        }

        @Override // androidx.core.view.y2
        public void b(View view) {
            View view2;
            l lVar = l.this;
            if (lVar.f759u && (view2 = lVar.f747i) != null) {
                view2.setTranslationY(0.0f);
                l.this.f744f.setTranslationY(0.0f);
            }
            l.this.f744f.setVisibility(8);
            l.this.f744f.setTransitioning(false);
            l lVar2 = l.this;
            lVar2.f764z = null;
            lVar2.w();
            ActionBarOverlayLayout actionBarOverlayLayout = l.this.f743e;
            if (actionBarOverlayLayout != null) {
                z0.G(actionBarOverlayLayout);
            }
        }
    }

    /* JADX INFO: compiled from: WindowDecorActionBar.java */
    class b extends z2 {
        b() {
        }

        @Override // androidx.core.view.y2
        public void b(View view) {
            l lVar = l.this;
            lVar.f764z = null;
            lVar.f744f.requestLayout();
        }
    }

    /* JADX INFO: compiled from: WindowDecorActionBar.java */
    class c implements a3 {
        c() {
        }

        @Override // androidx.core.view.a3
        public void a(View view) {
            ((View) l.this.f744f.getParent()).invalidate();
        }
    }

    /* JADX INFO: compiled from: WindowDecorActionBar.java */
    public class d extends k.b implements androidx.appcompat.view.menu.e.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Context f768c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final androidx.appcompat.view.menu.e f769d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private k.b.a f770e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private WeakReference<View> f771f;

        public d(Context context, k.b.a aVar) {
            this.f768c = context;
            this.f770e = aVar;
            androidx.appcompat.view.menu.e eVarS = new androidx.appcompat.view.menu.e(context).S(1);
            this.f769d = eVarS;
            eVarS.R(this);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            k.b.a aVar = this.f770e;
            if (aVar != null) {
                return aVar.a(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (this.f770e == null) {
                return;
            }
            k();
            l.this.f746h.l();
        }

        @Override // k.b
        public void c() {
            l lVar = l.this;
            if (lVar.f752n != this) {
                return;
            }
            if (l.v(lVar.f760v, lVar.f761w, false)) {
                this.f770e.d(this);
            } else {
                l lVar2 = l.this;
                lVar2.f753o = this;
                lVar2.f754p = this.f770e;
            }
            this.f770e = null;
            l.this.u(false);
            l.this.f746h.g();
            l.this.f745g.m().sendAccessibilityEvent(32);
            l lVar3 = l.this;
            lVar3.f743e.setHideOnContentScrollEnabled(lVar3.B);
            l.this.f752n = null;
        }

        @Override // k.b
        public View d() {
            WeakReference<View> weakReference = this.f771f;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // k.b
        public Menu e() {
            return this.f769d;
        }

        @Override // k.b
        public MenuInflater f() {
            return new k.g(this.f768c);
        }

        @Override // k.b
        public CharSequence g() {
            return l.this.f746h.getSubtitle();
        }

        @Override // k.b
        public CharSequence i() {
            return l.this.f746h.getTitle();
        }

        @Override // k.b
        public void k() {
            if (l.this.f752n != this) {
                return;
            }
            this.f769d.d0();
            try {
                this.f770e.c(this, this.f769d);
            } finally {
                this.f769d.c0();
            }
        }

        @Override // k.b
        public boolean l() {
            return l.this.f746h.j();
        }

        @Override // k.b
        public void m(View view) {
            l.this.f746h.setCustomView(view);
            this.f771f = new WeakReference<>(view);
        }

        @Override // k.b
        public void n(int i10) {
            o(l.this.f739a.getResources().getString(i10));
        }

        @Override // k.b
        public void o(CharSequence charSequence) {
            l.this.f746h.setSubtitle(charSequence);
        }

        @Override // k.b
        public void q(int i10) {
            r(l.this.f739a.getResources().getString(i10));
        }

        @Override // k.b
        public void r(CharSequence charSequence) {
            l.this.f746h.setTitle(charSequence);
        }

        @Override // k.b
        public void s(boolean z10) {
            super.s(z10);
            l.this.f746h.setTitleOptional(z10);
        }

        public boolean t() {
            this.f769d.d0();
            try {
                return this.f770e.b(this, this.f769d);
            } finally {
                this.f769d.c0();
            }
        }
    }

    public l(Activity activity, boolean z10) {
        this.f741c = activity;
        View decorView = activity.getWindow().getDecorView();
        C(decorView);
        if (z10) {
            return;
        }
        this.f747i = decorView.findViewById(R.id.content);
    }

    private void B() {
        if (this.f762x) {
            this.f762x = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f743e;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            L(false);
        }
    }

    private void C(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(g.f.f15065p);
        this.f743e = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f745g = z(view.findViewById(g.f.f15050a));
        this.f746h = (ActionBarContextView) view.findViewById(g.f.f15055f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(g.f.f15052c);
        this.f744f = actionBarContainer;
        l0 l0Var = this.f745g;
        if (l0Var == null || this.f746h == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f739a = l0Var.getContext();
        boolean z10 = (this.f745g.v() & 4) != 0;
        if (z10) {
            this.f751m = true;
        }
        k.a aVarB = k.a.b(this.f739a);
        I(aVarB.a() || z10);
        G(aVarB.g());
        TypedArray typedArrayObtainStyledAttributes = this.f739a.obtainStyledAttributes(null, g.j.f15111a, g.a.f14980c, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(g.j.f15161k, false)) {
            H(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(g.j.f15151i, 0);
        if (dimensionPixelSize != 0) {
            F(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void G(boolean z10) {
        this.f757s = z10;
        if (z10) {
            this.f744f.setTabContainer(null);
            this.f745g.r(this.f748j);
        } else {
            this.f745g.r(null);
            this.f744f.setTabContainer(this.f748j);
        }
        boolean z11 = A() == 2;
        a1 a1Var = this.f748j;
        if (a1Var != null) {
            if (z11) {
                a1Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f743e;
                if (actionBarOverlayLayout != null) {
                    z0.G(actionBarOverlayLayout);
                }
            } else {
                a1Var.setVisibility(8);
            }
        }
        this.f745g.p(!this.f757s && z11);
        this.f743e.setHasNonEmbeddedTabs(!this.f757s && z11);
    }

    private boolean J() {
        return z0.y(this.f744f);
    }

    private void K() {
        if (this.f762x) {
            return;
        }
        this.f762x = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f743e;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        L(false);
    }

    private void L(boolean z10) {
        if (v(this.f760v, this.f761w, this.f762x)) {
            if (this.f763y) {
                return;
            }
            this.f763y = true;
            y(z10);
            return;
        }
        if (this.f763y) {
            this.f763y = false;
            x(z10);
        }
    }

    static boolean v(boolean z10, boolean z11, boolean z12) {
        if (z12) {
            return true;
        }
        return (z10 || z11) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private l0 z(View view) {
        if (view instanceof l0) {
            return (l0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't make a decor toolbar out of ");
        sb2.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb2.toString());
    }

    public int A() {
        return this.f745g.k();
    }

    public void D(boolean z10) {
        E(z10 ? 4 : 0, 4);
    }

    public void E(int i10, int i11) {
        int iV = this.f745g.v();
        if ((i11 & 4) != 0) {
            this.f751m = true;
        }
        this.f745g.i((i10 & i11) | ((~i11) & iV));
    }

    public void F(float f10) {
        z0.N(this.f744f, f10);
    }

    public void H(boolean z10) {
        if (z10 && !this.f743e.w()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.B = z10;
        this.f743e.setHideOnContentScrollEnabled(z10);
    }

    public void I(boolean z10) {
        this.f745g.n(z10);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.f761w) {
            this.f761w = false;
            L(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(boolean z10) {
        this.f759u = z10;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (this.f761w) {
            return;
        }
        this.f761w = true;
        L(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        k.h hVar = this.f764z;
        if (hVar != null) {
            hVar.a();
            this.f764z = null;
        }
    }

    @Override // androidx.appcompat.app.a
    public boolean g() {
        l0 l0Var = this.f745g;
        if (l0Var == null || !l0Var.h()) {
            return false;
        }
        this.f745g.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void h(boolean z10) {
        if (z10 == this.f755q) {
            return;
        }
        this.f755q = z10;
        int size = this.f756r.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f756r.get(i10).onMenuVisibilityChanged(z10);
        }
    }

    @Override // androidx.appcompat.app.a
    public int i() {
        return this.f745g.v();
    }

    @Override // androidx.appcompat.app.a
    public Context j() {
        if (this.f740b == null) {
            TypedValue typedValue = new TypedValue();
            this.f739a.getTheme().resolveAttribute(g.a.f14984g, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f740b = new ContextThemeWrapper(this.f739a, i10);
            } else {
                this.f740b = this.f739a;
            }
        }
        return this.f740b;
    }

    @Override // androidx.appcompat.app.a
    public void l(Configuration configuration) {
        G(k.a.b(this.f739a).g());
    }

    @Override // androidx.appcompat.app.a
    public boolean n(int i10, KeyEvent keyEvent) {
        Menu menuE;
        d dVar = this.f752n;
        if (dVar == null || (menuE = dVar.e()) == null) {
            return false;
        }
        menuE.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuE.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int i10) {
        this.f758t = i10;
    }

    @Override // androidx.appcompat.app.a
    public void q(boolean z10) {
        if (this.f751m) {
            return;
        }
        D(z10);
    }

    @Override // androidx.appcompat.app.a
    public void r(boolean z10) {
        k.h hVar;
        this.A = z10;
        if (z10 || (hVar = this.f764z) == null) {
            return;
        }
        hVar.a();
    }

    @Override // androidx.appcompat.app.a
    public void s(CharSequence charSequence) {
        this.f745g.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public k.b t(k.b.a aVar) {
        d dVar = this.f752n;
        if (dVar != null) {
            dVar.c();
        }
        this.f743e.setHideOnContentScrollEnabled(false);
        this.f746h.k();
        d dVar2 = new d(this.f746h.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f752n = dVar2;
        dVar2.k();
        this.f746h.h(dVar2);
        u(true);
        this.f746h.sendAccessibilityEvent(32);
        return dVar2;
    }

    public void u(boolean z10) {
        x2 x2VarL;
        x2 x2VarF;
        if (z10) {
            K();
        } else {
            B();
        }
        if (!J()) {
            if (z10) {
                this.f745g.u(4);
                this.f746h.setVisibility(0);
                return;
            } else {
                this.f745g.u(0);
                this.f746h.setVisibility(8);
                return;
            }
        }
        if (z10) {
            x2VarF = this.f745g.l(4, 100L);
            x2VarL = this.f746h.f(0, 200L);
        } else {
            x2VarL = this.f745g.l(0, 200L);
            x2VarF = this.f746h.f(8, 100L);
        }
        k.h hVar = new k.h();
        hVar.d(x2VarF, x2VarL);
        hVar.h();
    }

    void w() {
        k.b.a aVar = this.f754p;
        if (aVar != null) {
            aVar.d(this.f753o);
            this.f753o = null;
            this.f754p = null;
        }
    }

    public void x(boolean z10) {
        View view;
        k.h hVar = this.f764z;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f758t != 0 || (!this.A && !z10)) {
            this.C.b(null);
            return;
        }
        this.f744f.setAlpha(1.0f);
        this.f744f.setTransitioning(true);
        k.h hVar2 = new k.h();
        float f10 = -this.f744f.getHeight();
        if (z10) {
            int[] iArr = {0, 0};
            this.f744f.getLocationInWindow(iArr);
            f10 -= iArr[1];
        }
        x2 x2VarM = z0.b(this.f744f).m(f10);
        x2VarM.k(this.E);
        hVar2.c(x2VarM);
        if (this.f759u && (view = this.f747i) != null) {
            hVar2.c(z0.b(view).m(f10));
        }
        hVar2.f(F);
        hVar2.e(250L);
        hVar2.g(this.C);
        this.f764z = hVar2;
        hVar2.h();
    }

    public void y(boolean z10) {
        View view;
        View view2;
        k.h hVar = this.f764z;
        if (hVar != null) {
            hVar.a();
        }
        this.f744f.setVisibility(0);
        if (this.f758t == 0 && (this.A || z10)) {
            this.f744f.setTranslationY(0.0f);
            float f10 = -this.f744f.getHeight();
            if (z10) {
                int[] iArr = {0, 0};
                this.f744f.getLocationInWindow(iArr);
                f10 -= iArr[1];
            }
            this.f744f.setTranslationY(f10);
            k.h hVar2 = new k.h();
            x2 x2VarM = z0.b(this.f744f).m(0.0f);
            x2VarM.k(this.E);
            hVar2.c(x2VarM);
            if (this.f759u && (view2 = this.f747i) != null) {
                view2.setTranslationY(f10);
                hVar2.c(z0.b(this.f747i).m(0.0f));
            }
            hVar2.f(G);
            hVar2.e(250L);
            hVar2.g(this.D);
            this.f764z = hVar2;
            hVar2.h();
        } else {
            this.f744f.setAlpha(1.0f);
            this.f744f.setTranslationY(0.0f);
            if (this.f759u && (view = this.f747i) != null) {
                view.setTranslationY(0.0f);
            }
            this.D.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f743e;
        if (actionBarOverlayLayout != null) {
            z0.G(actionBarOverlayLayout);
        }
    }

    public l(Dialog dialog) {
        this.f742d = dialog;
        C(dialog.getWindow().getDecorView());
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }
}
