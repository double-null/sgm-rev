package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.internal.NativeProtocol;

/* JADX INFO: compiled from: MenuItemImpl.java */
/* JADX INFO: loaded from: classes.dex */
public final class g implements s.b {
    private View A;
    private androidx.core.view.b B;
    private MenuItem.OnActionExpandListener C;
    private ContextMenu.ContextMenuInfo E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CharSequence f903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Intent f904g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private char f905h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private char f907j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Drawable f909l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    e f911n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private m f912o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Runnable f913p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f914q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private CharSequence f915r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private CharSequence f916s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f923z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f906i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f908k = 4096;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f910m = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ColorStateList f917t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private PorterDuff.Mode f918u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f919v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f920w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f921x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f922y = 16;
    private boolean D = false;

    /* JADX INFO: compiled from: MenuItemImpl.java */
    class a implements androidx.core.view.b.InterfaceC0037b {
        a() {
        }

        @Override // androidx.core.view.b.InterfaceC0037b
        public void onActionProviderVisibilityChanged(boolean z10) {
            g gVar = g.this;
            gVar.f911n.J(gVar);
        }
    }

    g(e eVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f911n = eVar;
        this.f898a = i11;
        this.f899b = i10;
        this.f900c = i12;
        this.f901d = i13;
        this.f902e = charSequence;
        this.f923z = i14;
    }

    private static void d(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f921x && (this.f919v || this.f920w)) {
            drawable = androidx.core.graphics.drawable.a.j(drawable).mutate();
            if (this.f919v) {
                androidx.core.graphics.drawable.a.h(drawable, this.f917t);
            }
            if (this.f920w) {
                androidx.core.graphics.drawable.a.i(drawable, this.f918u);
            }
            this.f921x = false;
        }
        return drawable;
    }

    boolean A() {
        return this.f911n.H() && g() != 0;
    }

    public boolean B() {
        return (this.f923z & 4) == 4;
    }

    @Override // s.b
    public androidx.core.view.b a() {
        return this.B;
    }

    @Override // s.b
    public s.b b(androidx.core.view.b bVar) {
        androidx.core.view.b bVar2 = this.B;
        if (bVar2 != null) {
            bVar2.h();
        }
        this.A = null;
        this.B = bVar;
        this.f911n.K(true);
        androidx.core.view.b bVar3 = this.B;
        if (bVar3 != null) {
            bVar3.j(new a());
        }
        return this;
    }

    public void c() {
        this.f911n.I(this);
    }

    @Override // s.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f923z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f911n.f(this);
        }
        return false;
    }

    @Override // s.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f911n.k(this);
        }
        return false;
    }

    public int f() {
        return this.f901d;
    }

    char g() {
        return this.f911n.G() ? this.f907j : this.f905h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // s.b, android.view.MenuItem
    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        androidx.core.view.b bVar = this.B;
        if (bVar == null) {
            return null;
        }
        View viewD = bVar.d(this);
        this.A = viewD;
        return viewD;
    }

    @Override // s.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f908k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f907j;
    }

    @Override // s.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f915r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f899b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f909l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f910m == 0) {
            return null;
        }
        Drawable drawableB = h.a.b(this.f911n.u(), this.f910m);
        this.f910m = 0;
        this.f909l = drawableB;
        return e(drawableB);
    }

    @Override // s.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f917t;
    }

    @Override // s.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f918u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f904g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f898a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override // s.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f906i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f905h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f900c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f912o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f902e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f903f;
        return charSequence != null ? charSequence : this.f902e;
    }

    @Override // s.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f916s;
    }

    String h() {
        char cG = g();
        if (cG == 0) {
            return "";
        }
        Resources resources = this.f911n.u().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.f911n.u()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(g.h.f15106k));
        }
        int i10 = this.f911n.G() ? this.f908k : this.f906i;
        d(sb2, i10, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST, resources.getString(g.h.f15102g));
        d(sb2, i10, 4096, resources.getString(g.h.f15098c));
        d(sb2, i10, 2, resources.getString(g.h.f15097b));
        d(sb2, i10, 1, resources.getString(g.h.f15103h));
        d(sb2, i10, 4, resources.getString(g.h.f15105j));
        d(sb2, i10, 8, resources.getString(g.h.f15101f));
        if (cG == '\b') {
            sb2.append(resources.getString(g.h.f15099d));
        } else if (cG == '\n') {
            sb2.append(resources.getString(g.h.f15100e));
        } else if (cG != ' ') {
            sb2.append(cG);
        } else {
            sb2.append(resources.getString(g.h.f15104i));
        }
        return sb2.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f912o != null;
    }

    CharSequence i(k.a aVar) {
        return (aVar == null || !aVar.d()) ? getTitle() : getTitleCondensed();
    }

    @Override // s.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f922y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f922y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f922y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        androidx.core.view.b bVar = this.B;
        if (bVar == null || !bVar.g()) {
            return (this.f922y & 8) == 0;
        }
        return (this.f922y & 8) == 0 && this.B.b();
    }

    public boolean j() {
        androidx.core.view.b bVar;
        if ((this.f923z & 8) == 0) {
            return false;
        }
        if (this.A == null && (bVar = this.B) != null) {
            this.A = bVar.d(this);
        }
        return this.A != null;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f914q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        e eVar = this.f911n;
        if (eVar.h(eVar, this)) {
            return true;
        }
        Runnable runnable = this.f913p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f904g != null) {
            try {
                this.f911n.u().startActivity(this.f904g);
                return true;
            } catch (ActivityNotFoundException e10) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
            }
        }
        androidx.core.view.b bVar = this.B;
        return bVar != null && bVar.e();
    }

    public boolean l() {
        return (this.f922y & 32) == 32;
    }

    public boolean m() {
        return (this.f922y & 4) != 0;
    }

    public boolean n() {
        return (this.f923z & 1) == 1;
    }

    public boolean o() {
        return (this.f923z & 2) == 2;
    }

    @Override // s.b, android.view.MenuItem
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public s.b setActionView(int i10) {
        Context contextU = this.f911n.u();
        setActionView(LayoutInflater.from(contextU).inflate(i10, (ViewGroup) new LinearLayout(contextU), false));
        return this;
    }

    @Override // s.b, android.view.MenuItem
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public s.b setActionView(View view) {
        int i10;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i10 = this.f898a) > 0) {
            view.setId(i10);
        }
        this.f911n.I(this);
        return this;
    }

    public void r(boolean z10) {
        this.D = z10;
        this.f911n.K(false);
    }

    void s(boolean z10) {
        int i10 = this.f922y;
        int i11 = (z10 ? 2 : 0) | (i10 & (-3));
        this.f922y = i11;
        if (i10 != i11) {
            this.f911n.K(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f907j == c10) {
            return this;
        }
        this.f907j = Character.toLowerCase(c10);
        this.f911n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f922y;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f922y = i11;
        if (i10 != i11) {
            this.f911n.K(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        if ((this.f922y & 4) != 0) {
            this.f911n.T(this);
        } else {
            s(z10);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f922y |= 16;
        } else {
            this.f922y &= -17;
        }
        this.f911n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f910m = 0;
        this.f909l = drawable;
        this.f921x = true;
        this.f911n.K(false);
        return this;
    }

    @Override // s.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f917t = colorStateList;
        this.f919v = true;
        this.f921x = true;
        this.f911n.K(false);
        return this;
    }

    @Override // s.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f918u = mode;
        this.f920w = true;
        this.f921x = true;
        this.f911n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f904g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        if (this.f905h == c10) {
            return this;
        }
        this.f905h = c10;
        this.f911n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f914q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f905h = c10;
        this.f907j = Character.toLowerCase(c11);
        this.f911n.K(false);
        return this;
    }

    @Override // s.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f923z = i10;
        this.f911n.I(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f902e = charSequence;
        this.f911n.K(false);
        m mVar = this.f912o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f903f = charSequence;
        this.f911n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        if (y(z10)) {
            this.f911n.J(this);
        }
        return this;
    }

    public void t(boolean z10) {
        this.f922y = (z10 ? 4 : 0) | (this.f922y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f902e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z10) {
        if (z10) {
            this.f922y |= 32;
        } else {
            this.f922y &= -33;
        }
    }

    void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    @Override // s.b, android.view.MenuItem
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public s.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public void x(m mVar) {
        this.f912o = mVar;
        mVar.setHeaderTitle(getTitle());
    }

    boolean y(boolean z10) {
        int i10 = this.f922y;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f922y = i11;
        return i10 != i11;
    }

    public boolean z() {
        return this.f911n.A();
    }

    @Override // android.view.MenuItem
    public s.b setContentDescription(CharSequence charSequence) {
        this.f915r = charSequence;
        this.f911n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public s.b setTooltipText(CharSequence charSequence) {
        this.f916s = charSequence;
        this.f911n.K(false);
        return this;
    }

    @Override // s.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f907j == c10 && this.f908k == i10) {
            return this;
        }
        this.f907j = Character.toLowerCase(c10);
        this.f908k = KeyEvent.normalizeMetaState(i10);
        this.f911n.K(false);
        return this;
    }

    @Override // s.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f905h == c10 && this.f906i == i10) {
            return this;
        }
        this.f905h = c10;
        this.f906i = KeyEvent.normalizeMetaState(i10);
        this.f911n.K(false);
        return this;
    }

    @Override // s.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f905h = c10;
        this.f906i = KeyEvent.normalizeMetaState(i10);
        this.f907j = Character.toLowerCase(c11);
        this.f908k = KeyEvent.normalizeMetaState(i11);
        this.f911n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f909l = null;
        this.f910m = i10;
        this.f921x = true;
        this.f911n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        return setTitle(this.f911n.u().getString(i10));
    }
}
