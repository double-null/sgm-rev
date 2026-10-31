package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.i1;
import androidx.appcompat.widget.l0;
import androidx.core.view.z0;
import java.util.ArrayList;

/* JADX INFO: compiled from: ToolbarActionBar.java */
/* JADX INFO: loaded from: classes.dex */
class i extends androidx.appcompat.app.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    l0 f711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Window.Callback f713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList<androidx.appcompat.app.a.b> f716f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f717g = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Toolbar.f f718h;

    /* JADX INFO: compiled from: ToolbarActionBar.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.w();
        }
    }

    /* JADX INFO: compiled from: ToolbarActionBar.java */
    class b implements Toolbar.f {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.f
        public boolean onMenuItemClick(MenuItem menuItem) {
            return i.this.f713c.onMenuItemSelected(0, menuItem);
        }
    }

    /* JADX INFO: compiled from: ToolbarActionBar.java */
    private final class c implements androidx.appcompat.view.menu.j.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f721a;

        c() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
            if (this.f721a) {
                return;
            }
            this.f721a = true;
            i.this.f711a.q();
            Window.Callback callback = i.this.f713c;
            if (callback != null) {
                callback.onPanelClosed(108, eVar);
            }
            this.f721a = false;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callback = i.this.f713c;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* JADX INFO: compiled from: ToolbarActionBar.java */
    private final class d implements androidx.appcompat.view.menu.e.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            i iVar = i.this;
            if (iVar.f713c != null) {
                if (iVar.f711a.e()) {
                    i.this.f713c.onPanelClosed(108, eVar);
                } else if (i.this.f713c.onPreparePanel(0, null, eVar)) {
                    i.this.f713c.onMenuOpened(108, eVar);
                }
            }
        }
    }

    /* JADX INFO: compiled from: ToolbarActionBar.java */
    private class e extends k.j {
        public e(Window.Callback callback) {
            super(callback);
        }

        @Override // k.j, android.view.Window.Callback
        public View onCreatePanelView(int i10) {
            return i10 == 0 ? new View(i.this.f711a.getContext()) : super.onCreatePanelView(i10);
        }

        @Override // k.j, android.view.Window.Callback
        public boolean onPreparePanel(int i10, View view, Menu menu) {
            boolean zOnPreparePanel = super.onPreparePanel(i10, view, menu);
            if (zOnPreparePanel) {
                i iVar = i.this;
                if (!iVar.f712b) {
                    iVar.f711a.f();
                    i.this.f712b = true;
                }
            }
            return zOnPreparePanel;
        }
    }

    i(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f718h = bVar;
        this.f711a = new i1(toolbar, false);
        e eVar = new e(callback);
        this.f713c = eVar;
        this.f711a.setWindowCallback(eVar);
        toolbar.setOnMenuItemClickListener(bVar);
        this.f711a.setWindowTitle(charSequence);
    }

    private Menu u() {
        if (!this.f714d) {
            this.f711a.t(new c(), new d());
            this.f714d = true;
        }
        return this.f711a.j();
    }

    @Override // androidx.appcompat.app.a
    public boolean f() {
        return this.f711a.b();
    }

    @Override // androidx.appcompat.app.a
    public boolean g() {
        if (!this.f711a.h()) {
            return false;
        }
        this.f711a.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void h(boolean z10) {
        if (z10 == this.f715e) {
            return;
        }
        this.f715e = z10;
        int size = this.f716f.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f716f.get(i10).onMenuVisibilityChanged(z10);
        }
    }

    @Override // androidx.appcompat.app.a
    public int i() {
        return this.f711a.v();
    }

    @Override // androidx.appcompat.app.a
    public Context j() {
        return this.f711a.getContext();
    }

    @Override // androidx.appcompat.app.a
    public boolean k() {
        this.f711a.m().removeCallbacks(this.f717g);
        z0.E(this.f711a.m(), this.f717g);
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void l(Configuration configuration) {
        super.l(configuration);
    }

    @Override // androidx.appcompat.app.a
    void m() {
        this.f711a.m().removeCallbacks(this.f717g);
    }

    @Override // androidx.appcompat.app.a
    public boolean n(int i10, KeyEvent keyEvent) {
        Menu menuU = u();
        if (menuU == null) {
            return false;
        }
        menuU.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuU.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public boolean o(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            p();
        }
        return true;
    }

    @Override // androidx.appcompat.app.a
    public boolean p() {
        return this.f711a.c();
    }

    @Override // androidx.appcompat.app.a
    public void s(CharSequence charSequence) {
        this.f711a.setWindowTitle(charSequence);
    }

    public Window.Callback v() {
        return this.f713c;
    }

    void w() {
        Menu menuU = u();
        androidx.appcompat.view.menu.e eVar = menuU instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menuU : null;
        if (eVar != null) {
            eVar.d0();
        }
        try {
            menuU.clear();
            if (!this.f713c.onCreatePanelMenu(0, menuU) || !this.f713c.onPreparePanel(0, null, menuU)) {
                menuU.clear();
            }
        } finally {
            if (eVar != null) {
                eVar.c0();
            }
        }
    }

    @Override // androidx.appcompat.app.a
    public void q(boolean z10) {
    }

    @Override // androidx.appcompat.app.a
    public void r(boolean z10) {
    }
}
