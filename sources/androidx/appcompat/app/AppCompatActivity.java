package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.n1;
import androidx.core.app.l1;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatActivity extends androidx.fragment.app.e implements d, l1.a {
    private e mDelegate;
    private Resources mResources;

    public AppCompatActivity() {
    }

    private boolean performMenuItemShortcut(int i10, KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().c(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        getDelegate().d(context);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.f()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.h, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.o(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i10) {
        return (T) getDelegate().g(i10);
    }

    @Override // androidx.lifecycle.e
    public /* bridge */ /* synthetic */ m0.a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    public e getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = e.e(this, this);
        }
        return this.mDelegate;
    }

    public b getDrawerToggleDelegate() {
        return getDelegate().i();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return getDelegate().k();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.mResources == null && n1.b()) {
            this.mResources = new n1(this, super.getResources());
        }
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    public a getSupportActionBar() {
        return getDelegate().l();
    }

    @Override // androidx.core.app.l1.a
    public Intent getSupportParentActivityIntent() {
        return androidx.core.app.i.a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().n();
    }

    @Override // androidx.fragment.app.e, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        getDelegate().q(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        e delegate = getDelegate();
        delegate.m();
        delegate.r(bundle);
        super.onCreate(bundle);
    }

    public void onCreateSupportNavigateUpTaskStack(l1 l1Var) {
        l1Var.c(this);
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        getDelegate().s();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (performMenuItemShortcut(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // androidx.fragment.app.e, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.i() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    @Override // androidx.fragment.app.e, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().t(bundle);
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        getDelegate().u();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        getDelegate().v(bundle);
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    protected void onStart() {
        super.onStart();
        getDelegate().w();
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    protected void onStop() {
        super.onStop();
        getDelegate().x();
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        l1 l1VarE = l1.e(this);
        onCreateSupportNavigateUpTaskStack(l1VarE);
        onPrepareSupportNavigateUpTaskStack(l1VarE);
        l1VarE.h();
        try {
            androidx.core.app.b.m(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        getDelegate().F(charSequence);
    }

    @Override // androidx.appcompat.app.d
    public k.b onWindowStartingSupportActionMode(k.b.a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.p()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i10) {
        getDelegate().A(i10);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().D(toolbar);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        super.setTheme(i10);
        getDelegate().E(i10);
    }

    public k.b startSupportActionMode(k.b.a aVar) {
        return getDelegate().G(aVar);
    }

    @Override // androidx.fragment.app.e
    public void supportInvalidateOptionsMenu() {
        getDelegate().n();
    }

    public void supportNavigateUpTo(Intent intent) {
        androidx.core.app.i.e(this, intent);
    }

    public boolean supportRequestWindowFeature(int i10) {
        return getDelegate().z(i10);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return androidx.core.app.i.f(this, intent);
    }

    public AppCompatActivity(int i10) {
        super(i10);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        getDelegate().B(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().C(view, layoutParams);
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    protected void onNightModeChanged(int i10) {
    }

    public void onPrepareSupportNavigateUpTaskStack(l1 l1Var) {
    }

    @Override // androidx.appcompat.app.d
    public void onSupportActionModeFinished(k.b bVar) {
    }

    @Override // androidx.appcompat.app.d
    public void onSupportActionModeStarted(k.b bVar) {
    }

    @Deprecated
    public void setSupportProgress(int i10) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z10) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z10) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z10) {
    }
}
