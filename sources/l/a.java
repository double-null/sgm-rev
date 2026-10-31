package l;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: ActionMenuItem.java */
/* JADX INFO: loaded from: classes.dex */
public class a implements s.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f21616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f21617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f21618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CharSequence f21619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Intent f21620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private char f21621h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private char f21623j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Drawable f21625l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Context f21627n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f21628o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f21629p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private CharSequence f21630q;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f21622i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f21624k = 4096;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f21626m = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ColorStateList f21631r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private PorterDuff.Mode f21632s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f21633t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f21634u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f21635v = 16;

    public a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f21627n = context;
        this.f21614a = i11;
        this.f21615b = i10;
        this.f21616c = i12;
        this.f21617d = i13;
        this.f21618e = charSequence;
    }

    private void c() {
        Drawable drawable = this.f21625l;
        if (drawable != null) {
            if (this.f21633t || this.f21634u) {
                Drawable drawableJ = androidx.core.graphics.drawable.a.j(drawable);
                this.f21625l = drawableJ;
                Drawable drawableMutate = drawableJ.mutate();
                this.f21625l = drawableMutate;
                if (this.f21633t) {
                    androidx.core.graphics.drawable.a.h(drawableMutate, this.f21631r);
                }
                if (this.f21634u) {
                    androidx.core.graphics.drawable.a.i(this.f21625l, this.f21632s);
                }
            }
        }
    }

    @Override // s.b
    public androidx.core.view.b a() {
        return null;
    }

    @Override // s.b
    public s.b b(androidx.core.view.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // s.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // s.b, android.view.MenuItem
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public s.b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // s.b, android.view.MenuItem
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public s.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // s.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // s.b, android.view.MenuItem
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public s.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // s.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // s.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f21624k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f21623j;
    }

    @Override // s.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f21629p;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f21615b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f21625l;
    }

    @Override // s.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f21631r;
    }

    @Override // s.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f21632s;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f21620g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f21614a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // s.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f21622i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f21621h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f21617d;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f21618e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f21619f;
        return charSequence != null ? charSequence : this.f21618e;
    }

    @Override // s.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f21630q;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // s.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f21635v & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f21635v & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f21635v & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f21635v & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f21623j = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f21635v = (z10 ? 1 : 0) | (this.f21635v & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f21635v = (z10 ? 2 : 0) | (this.f21635v & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f21635v = (z10 ? 16 : 0) | (this.f21635v & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f21625l = drawable;
        this.f21626m = 0;
        c();
        return this;
    }

    @Override // s.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f21631r = colorStateList;
        this.f21633t = true;
        c();
        return this;
    }

    @Override // s.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f21632s = mode;
        this.f21634u = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f21620g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f21621h = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f21628o = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f21621h = c10;
        this.f21623j = Character.toLowerCase(c11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f21618e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f21619f = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        this.f21635v = (this.f21635v & 8) | (z10 ? 0 : 8);
        return this;
    }

    @Override // s.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f21623j = Character.toLowerCase(c10);
        this.f21624k = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public s.b setContentDescription(CharSequence charSequence) {
        this.f21629p = charSequence;
        return this;
    }

    @Override // s.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f21621h = c10;
        this.f21622i = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f21618e = this.f21627n.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public s.b setTooltipText(CharSequence charSequence) {
        this.f21630q = charSequence;
        return this;
    }

    @Override // s.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f21621h = c10;
        this.f21622i = KeyEvent.normalizeMetaState(i10);
        this.f21623j = Character.toLowerCase(c11);
        this.f21624k = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f21626m = i10;
        this.f21625l = androidx.core.content.a.e(this.f21627n, i10);
        c();
        return this;
    }

    @Override // s.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }
}
