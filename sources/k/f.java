package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: SupportActionModeWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public class f extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f21062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b f21063b;

    /* JADX INFO: compiled from: SupportActionModeWrapper.java */
    public static class a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ActionMode.Callback f21064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Context f21065b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ArrayList<f> f21066c = new ArrayList<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final androidx.collection.h<Menu, Menu> f21067d = new androidx.collection.h<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f21065b = context;
            this.f21064a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.f21067d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            l.d dVar = new l.d(this.f21065b, (s.a) menu);
            this.f21067d.put(menu, dVar);
            return dVar;
        }

        @Override // k.b.a
        public boolean a(b bVar, MenuItem menuItem) {
            return this.f21064a.onActionItemClicked(e(bVar), new l.c(this.f21065b, (s.b) menuItem));
        }

        @Override // k.b.a
        public boolean b(b bVar, Menu menu) {
            return this.f21064a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // k.b.a
        public boolean c(b bVar, Menu menu) {
            return this.f21064a.onPrepareActionMode(e(bVar), f(menu));
        }

        @Override // k.b.a
        public void d(b bVar) {
            this.f21064a.onDestroyActionMode(e(bVar));
        }

        public ActionMode e(b bVar) {
            int size = this.f21066c.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = this.f21066c.get(i10);
                if (fVar != null && fVar.f21063b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f21065b, bVar);
            this.f21066c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f21062a = context;
        this.f21063b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f21063b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f21063b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new l.d(this.f21062a, (s.a) this.f21063b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f21063b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f21063b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f21063b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f21063b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f21063b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f21063b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f21063b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f21063b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f21063b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f21063b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f21063b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z10) {
        this.f21063b.s(z10);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i10) {
        this.f21063b.n(i10);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i10) {
        this.f21063b.q(i10);
    }
}
