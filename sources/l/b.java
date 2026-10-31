package l;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: BaseMenuWrapper.java */
/* JADX INFO: loaded from: classes.dex */
abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f21636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<s.b, MenuItem> f21637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<s.c, SubMenu> f21638c;

    b(Context context) {
        this.f21636a = context;
    }

    final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof s.b)) {
            return menuItem;
        }
        s.b bVar = (s.b) menuItem;
        if (this.f21637b == null) {
            this.f21637b = new androidx.collection.a();
        }
        MenuItem menuItem2 = this.f21637b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        c cVar = new c(this.f21636a, bVar);
        this.f21637b.put(bVar, cVar);
        return cVar;
    }

    final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof s.c)) {
            return subMenu;
        }
        s.c cVar = (s.c) subMenu;
        if (this.f21638c == null) {
            this.f21638c = new androidx.collection.a();
        }
        SubMenu subMenu2 = this.f21638c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        f fVar = new f(this.f21636a, cVar);
        this.f21638c.put(cVar, fVar);
        return fVar;
    }

    final void e() {
        Map<s.b, MenuItem> map = this.f21637b;
        if (map != null) {
            map.clear();
        }
        Map<s.c, SubMenu> map2 = this.f21638c;
        if (map2 != null) {
            map2.clear();
        }
    }

    final void f(int i10) {
        Map<s.b, MenuItem> map = this.f21637b;
        if (map == null) {
            return;
        }
        Iterator<s.b> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (i10 == it.next().getGroupId()) {
                it.remove();
            }
        }
    }

    final void g(int i10) {
        Map<s.b, MenuItem> map = this.f21637b;
        if (map == null) {
            return;
        }
        Iterator<s.b> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (i10 == it.next().getItemId()) {
                it.remove();
                return;
            }
        }
    }
}
