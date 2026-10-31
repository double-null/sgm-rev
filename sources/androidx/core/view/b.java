package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: ActionProvider.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f1898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f1899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC0037b f1900c;

    /* JADX INFO: compiled from: ActionProvider.java */
    public interface a {
    }

    /* JADX INFO: renamed from: androidx.core.view.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ActionProvider.java */
    public interface InterfaceC0037b {
        void onActionProviderVisibilityChanged(boolean z10);
    }

    public b(Context context) {
        this.f1898a = context;
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public void h() {
        this.f1900c = null;
        this.f1899b = null;
    }

    public void i(a aVar) {
        this.f1899b = aVar;
    }

    public void j(InterfaceC0037b interfaceC0037b) {
        if (this.f1900c != null && interfaceC0037b != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f1900c = interfaceC0037b;
    }

    public void f(SubMenu subMenu) {
    }
}
