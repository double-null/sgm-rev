package l;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: MenuItemWrapperICS.java */
/* JADX INFO: loaded from: classes.dex */
public class c extends l.b implements MenuItem {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s.b f21639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Method f21640e;

    /* JADX INFO: compiled from: MenuItemWrapperICS.java */
    private class a extends androidx.core.view.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final ActionProvider f21641d;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f21641d = actionProvider;
        }

        @Override // androidx.core.view.b
        public boolean a() {
            return this.f21641d.hasSubMenu();
        }

        @Override // androidx.core.view.b
        public View c() {
            return this.f21641d.onCreateActionView();
        }

        @Override // androidx.core.view.b
        public boolean e() {
            return this.f21641d.onPerformDefaultAction();
        }

        @Override // androidx.core.view.b
        public void f(SubMenu subMenu) {
            this.f21641d.onPrepareSubMenu(c.this.d(subMenu));
        }
    }

    /* JADX INFO: compiled from: MenuItemWrapperICS.java */
    private class b extends a implements ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private androidx.core.view.b.InterfaceC0037b f21643f;

        b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // androidx.core.view.b
        public boolean b() {
            return this.f21641d.isVisible();
        }

        @Override // androidx.core.view.b
        public View d(MenuItem menuItem) {
            return this.f21641d.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.b
        public boolean g() {
            return this.f21641d.overridesItemVisibility();
        }

        @Override // androidx.core.view.b
        public void j(androidx.core.view.b.InterfaceC0037b interfaceC0037b) {
            this.f21643f = interfaceC0037b;
            this.f21641d.setVisibilityListener(interfaceC0037b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z10) {
            androidx.core.view.b.InterfaceC0037b interfaceC0037b = this.f21643f;
            if (interfaceC0037b != null) {
                interfaceC0037b.onActionProviderVisibilityChanged(z10);
            }
        }
    }

    /* JADX INFO: renamed from: l.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MenuItemWrapperICS.java */
    static class C0349c extends FrameLayout implements k.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final CollapsibleActionView f21645a;

        /* JADX WARN: Multi-variable type inference failed */
        C0349c(View view) {
            super(view.getContext());
            this.f21645a = (CollapsibleActionView) view;
            addView(view);
        }

        View a() {
            return (View) this.f21645a;
        }

        @Override // k.c
        public void onActionViewCollapsed() {
            this.f21645a.onActionViewCollapsed();
        }

        @Override // k.c
        public void onActionViewExpanded() {
            this.f21645a.onActionViewExpanded();
        }
    }

    /* JADX INFO: compiled from: MenuItemWrapperICS.java */
    private class d implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MenuItem.OnActionExpandListener f21646a;

        d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f21646a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f21646a.onMenuItemActionCollapse(c.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f21646a.onMenuItemActionExpand(c.this.c(menuItem));
        }
    }

    /* JADX INFO: compiled from: MenuItemWrapperICS.java */
    private class e implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f21648a;

        e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f21648a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f21648a.onMenuItemClick(c.this.c(menuItem));
        }
    }

    public c(Context context, s.b bVar) {
        super(context);
        if (bVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f21639d = bVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f21639d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f21639d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        androidx.core.view.b bVarA = this.f21639d.a();
        if (bVarA instanceof a) {
            return ((a) bVarA).f21641d;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f21639d.getActionView();
        return actionView instanceof C0349c ? ((C0349c) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f21639d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f21639d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f21639d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f21639d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f21639d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f21639d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f21639d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f21639d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f21639d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f21639d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f21639d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f21639d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f21639d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return d(this.f21639d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f21639d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f21639d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f21639d.getTooltipText();
    }

    public void h(boolean z10) {
        try {
            if (this.f21640e == null) {
                this.f21640e = this.f21639d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f21640e.invoke(this.f21639d, Boolean.valueOf(z10));
        } catch (Exception e10) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f21639d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f21639d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f21639d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f21639d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f21639d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f21639d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this.f21636a, actionProvider);
        s.b bVar2 = this.f21639d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.b(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0349c(view);
        }
        this.f21639d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f21639d.setAlphabeticShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f21639d.setCheckable(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f21639d.setChecked(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f21639d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f21639d.setEnabled(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f21639d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f21639d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f21639d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f21639d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f21639d.setNumericShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f21639d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f21639d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f21639d.setShortcut(c10, c11);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i10) {
        this.f21639d.setShowAsAction(i10);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i10) {
        this.f21639d.setShowAsActionFlags(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f21639d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f21639d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f21639d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        return this.f21639d.setVisible(z10);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f21639d.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f21639d.setIcon(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f21639d.setNumericShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f21639d.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f21639d.setTitle(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i10) {
        this.f21639d.setActionView(i10);
        View actionView = this.f21639d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f21639d.setActionView(new C0349c(actionView));
        }
        return this;
    }
}
