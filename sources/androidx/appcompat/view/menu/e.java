package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.p2;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: MenuBuilder.java */
/* JADX INFO: loaded from: classes.dex */
public class e implements s.a {
    private static final int[] A = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f872e;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f880m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    CharSequence f881n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Drawable f882o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    View f883p;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private g f891x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f893z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f879l = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f884q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f885r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f886s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f887t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f888u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ArrayList<g> f889v = new ArrayList<>();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private CopyOnWriteArrayList<WeakReference<j>> f890w = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f892y = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList<g> f873f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList<g> f874g = new ArrayList<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f875h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList<g> f876i = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList<g> f877j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f878k = true;

    /* JADX INFO: compiled from: MenuBuilder.java */
    public interface a {
        boolean a(e eVar, MenuItem menuItem);

        void b(e eVar);
    }

    /* JADX INFO: compiled from: MenuBuilder.java */
    public interface b {
        boolean b(g gVar);
    }

    public e(Context context) {
        this.f868a = context;
        this.f869b = context.getResources();
        b0(true);
    }

    private static int B(int i10) {
        int i11 = ((-65536) & i10) >> 16;
        if (i11 >= 0) {
            int[] iArr = A;
            if (i11 < iArr.length) {
                return (i10 & Settings.DEFAULT_INITIAL_WINDOW_SIZE) | (iArr[i11] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void N(int i10, boolean z10) {
        if (i10 < 0 || i10 >= this.f873f.size()) {
            return;
        }
        this.f873f.remove(i10);
        if (z10) {
            K(true);
        }
    }

    private void W(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources resourcesC = C();
        if (view != null) {
            this.f883p = view;
            this.f881n = null;
            this.f882o = null;
        } else {
            if (i10 > 0) {
                this.f881n = resourcesC.getText(i10);
            } else if (charSequence != null) {
                this.f881n = charSequence;
            }
            if (i11 > 0) {
                this.f882o = androidx.core.content.a.e(u(), i11);
            } else if (drawable != null) {
                this.f882o = drawable;
            }
            this.f883p = null;
        }
        K(false);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    private void b0(boolean z10) {
        boolean z11;
        if (z10) {
            z11 = this.f869b.getConfiguration().keyboard != 1 && p2.l(ViewConfiguration.get(this.f868a), this.f868a);
        }
        this.f871d = z11;
    }

    private g g(int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        return new g(this, i10, i11, i12, i13, charSequence, i14);
    }

    private void i(boolean z10) {
        if (this.f890w.isEmpty()) {
            return;
        }
        d0();
        for (WeakReference<j> weakReference : this.f890w) {
            j jVar = weakReference.get();
            if (jVar == null) {
                this.f890w.remove(weakReference);
            } else {
                jVar.f(z10);
            }
        }
        c0();
    }

    private boolean j(m mVar, j jVar) {
        if (this.f890w.isEmpty()) {
            return false;
        }
        boolean zE = jVar != null ? jVar.e(mVar) : false;
        for (WeakReference<j> weakReference : this.f890w) {
            j jVar2 = weakReference.get();
            if (jVar2 == null) {
                this.f890w.remove(weakReference);
            } else if (!zE) {
                zE = jVar2.e(mVar);
            }
        }
        return zE;
    }

    private static int n(ArrayList<g> arrayList, int i10) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f() <= i10) {
                return size + 1;
            }
        }
        return 0;
    }

    boolean A() {
        return this.f887t;
    }

    Resources C() {
        return this.f869b;
    }

    public ArrayList<g> E() {
        if (!this.f875h) {
            return this.f874g;
        }
        this.f874g.clear();
        int size = this.f873f.size();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = this.f873f.get(i10);
            if (gVar.isVisible()) {
                this.f874g.add(gVar);
            }
        }
        this.f875h = false;
        this.f878k = true;
        return this.f874g;
    }

    public boolean F() {
        return this.f892y;
    }

    boolean G() {
        return this.f870c;
    }

    public boolean H() {
        return this.f871d;
    }

    void I(g gVar) {
        this.f878k = true;
        K(true);
    }

    void J(g gVar) {
        this.f875h = true;
        K(true);
    }

    public void K(boolean z10) {
        if (this.f884q) {
            this.f885r = true;
            if (z10) {
                this.f886s = true;
                return;
            }
            return;
        }
        if (z10) {
            this.f875h = true;
            this.f878k = true;
        }
        i(z10);
    }

    public boolean L(MenuItem menuItem, int i10) {
        return M(menuItem, null, i10);
    }

    public boolean M(MenuItem menuItem, j jVar, int i10) {
        g gVar = (g) menuItem;
        if (gVar == null || !gVar.isEnabled()) {
            return false;
        }
        boolean zK = gVar.k();
        androidx.core.view.b bVarA = gVar.a();
        boolean z10 = bVarA != null && bVarA.a();
        if (gVar.j()) {
            zK |= gVar.expandActionView();
            if (zK) {
                e(true);
            }
        } else if (gVar.hasSubMenu() || z10) {
            if ((i10 & 4) == 0) {
                e(false);
            }
            if (!gVar.hasSubMenu()) {
                gVar.x(new m(u(), this, gVar));
            }
            m mVar = (m) gVar.getSubMenu();
            if (z10) {
                bVarA.f(mVar);
            }
            zK |= j(mVar, jVar);
            if (!zK) {
                e(true);
            }
        } else if ((i10 & 1) == 0) {
            e(true);
        }
        return zK;
    }

    public void O(j jVar) {
        for (WeakReference<j> weakReference : this.f890w) {
            j jVar2 = weakReference.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.f890w.remove(weakReference);
            }
        }
    }

    public void P(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(t());
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).P(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 <= 0 || (menuItemFindItem = findItem(i11)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void Q(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(t(), sparseArray);
        }
    }

    public void R(a aVar) {
        this.f872e = aVar;
    }

    public e S(int i10) {
        this.f879l = i10;
        return this;
    }

    void T(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f873f.size();
        d0();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = this.f873f.get(i10);
            if (gVar.getGroupId() == groupId && gVar.m() && gVar.isCheckable()) {
                gVar.s(gVar == menuItem);
            }
        }
        c0();
    }

    protected e U(int i10) {
        W(0, null, i10, null, null);
        return this;
    }

    protected e V(Drawable drawable) {
        W(0, null, 0, drawable, null);
        return this;
    }

    protected e X(int i10) {
        W(i10, null, 0, null, null);
        return this;
    }

    protected e Y(CharSequence charSequence) {
        W(0, charSequence, 0, null, null);
        return this;
    }

    protected e Z(View view) {
        W(0, null, 0, null, view);
        return this;
    }

    protected MenuItem a(int i10, int i11, int i12, CharSequence charSequence) {
        int iB = B(i12);
        g gVarG = g(i10, i11, i12, iB, charSequence, this.f879l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f880m;
        if (contextMenuInfo != null) {
            gVarG.v(contextMenuInfo);
        }
        ArrayList<g> arrayList = this.f873f;
        arrayList.add(n(arrayList, iB), gVarG);
        K(true);
        return gVarG;
    }

    public void a0(boolean z10) {
        this.f893z = z10;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f868a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i10, i11, i12, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(j jVar) {
        c(jVar, this.f868a);
    }

    public void c(j jVar, Context context) {
        this.f890w.add(new WeakReference<>(jVar));
        jVar.i(context, this);
        this.f878k = true;
    }

    public void c0() {
        this.f884q = false;
        if (this.f885r) {
            this.f885r = false;
            K(this.f886s);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        g gVar = this.f891x;
        if (gVar != null) {
            f(gVar);
        }
        this.f873f.clear();
        K(true);
    }

    public void clearHeader() {
        this.f882o = null;
        this.f881n = null;
        this.f883p = null;
        K(false);
    }

    @Override // android.view.Menu
    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f872e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public void d0() {
        if (this.f884q) {
            return;
        }
        this.f884q = true;
        this.f885r = false;
        this.f886s = false;
    }

    public final void e(boolean z10) {
        if (this.f888u) {
            return;
        }
        this.f888u = true;
        for (WeakReference<j> weakReference : this.f890w) {
            j jVar = weakReference.get();
            if (jVar == null) {
                this.f890w.remove(weakReference);
            } else {
                jVar.b(this, z10);
            }
        }
        this.f888u = false;
    }

    public boolean f(g gVar) {
        boolean zH = false;
        if (!this.f890w.isEmpty() && this.f891x == gVar) {
            d0();
            for (WeakReference<j> weakReference : this.f890w) {
                j jVar = weakReference.get();
                if (jVar != null) {
                    zH = jVar.h(this, gVar);
                    if (zH) {
                        break;
                    }
                } else {
                    this.f890w.remove(weakReference);
                }
            }
            c0();
            if (zH) {
                this.f891x = null;
            }
        }
        return zH;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f873f.get(i11);
            if (gVar.getItemId() == i10) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (menuItemFindItem = gVar.getSubMenu().findItem(i10)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return this.f873f.get(i10);
    }

    boolean h(e eVar, MenuItem menuItem) {
        a aVar = this.f872e;
        return aVar != null && aVar.a(eVar, menuItem);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f893z) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f873f.get(i10).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return p(i10, keyEvent) != null;
    }

    public boolean k(g gVar) {
        boolean zC = false;
        if (this.f890w.isEmpty()) {
            return false;
        }
        d0();
        for (WeakReference<j> weakReference : this.f890w) {
            j jVar = weakReference.get();
            if (jVar != null) {
                zC = jVar.c(this, gVar);
                if (zC) {
                    break;
                }
            } else {
                this.f890w.remove(weakReference);
            }
        }
        c0();
        if (zC) {
            this.f891x = gVar;
        }
        return zC;
    }

    public int l(int i10) {
        return m(i10, 0);
    }

    public int m(int i10, int i11) {
        int size = size();
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < size) {
            if (this.f873f.get(i11).getGroupId() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public int o(int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f873f.get(i11).getItemId() == i10) {
                return i11;
            }
        }
        return -1;
    }

    g p(int i10, KeyEvent keyEvent) {
        ArrayList<g> arrayList = this.f889v;
        arrayList.clear();
        q(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zG = G();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = arrayList.get(i11);
            char alphabeticShortcut = zG ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zG && alphabeticShortcut == '\b' && i10 == 67))) {
                return gVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return L(findItem(i10), i11);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        g gVarP = p(i10, keyEvent);
        boolean zL = gVarP != null ? L(gVarP, i11) : false;
        if ((i11 & 2) != 0) {
            e(true);
        }
        return zL;
    }

    void q(List<g> list, int i10, KeyEvent keyEvent) {
        boolean zG = G();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.f873f.size();
            for (int i11 = 0; i11 < size; i11++) {
                g gVar = this.f873f.get(i11);
                if (gVar.hasSubMenu()) {
                    ((e) gVar.getSubMenu()).q(list, i10, keyEvent);
                }
                char alphabeticShortcut = zG ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
                if (((modifiers & 69647) == ((zG ? gVar.getAlphabeticModifiers() : gVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zG && alphabeticShortcut == '\b' && i10 == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    public void r() {
        ArrayList<g> arrayListE = E();
        if (this.f878k) {
            boolean zG = false;
            for (WeakReference<j> weakReference : this.f890w) {
                j jVar = weakReference.get();
                if (jVar == null) {
                    this.f890w.remove(weakReference);
                } else {
                    zG |= jVar.g();
                }
            }
            if (zG) {
                this.f876i.clear();
                this.f877j.clear();
                int size = arrayListE.size();
                for (int i10 = 0; i10 < size; i10++) {
                    g gVar = arrayListE.get(i10);
                    if (gVar.l()) {
                        this.f876i.add(gVar);
                    } else {
                        this.f877j.add(gVar);
                    }
                }
            } else {
                this.f876i.clear();
                this.f877j.clear();
                this.f877j.addAll(E());
            }
            this.f878k = false;
        }
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        int iL = l(i10);
        if (iL >= 0) {
            int size = this.f873f.size() - iL;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= size || this.f873f.get(iL).getGroupId() != i10) {
                    break;
                }
                N(iL, false);
                i11 = i12;
            }
            K(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        N(o(i10), true);
    }

    public ArrayList<g> s() {
        r();
        return this.f876i;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int size = this.f873f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f873f.get(i11);
            if (gVar.getGroupId() == i10) {
                gVar.t(z11);
                gVar.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f892y = z10;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        int size = this.f873f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f873f.get(i11);
            if (gVar.getGroupId() == i10) {
                gVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        int size = this.f873f.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f873f.get(i11);
            if (gVar.getGroupId() == i10 && gVar.y(z10)) {
                z11 = true;
            }
        }
        if (z11) {
            K(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f870c = z10;
        K(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f873f.size();
    }

    protected String t() {
        return "android:menu:actionviewstates";
    }

    public Context u() {
        return this.f868a;
    }

    public g v() {
        return this.f891x;
    }

    public Drawable w() {
        return this.f882o;
    }

    public CharSequence x() {
        return this.f881n;
    }

    public View y() {
        return this.f883p;
    }

    public ArrayList<g> z() {
        r();
        return this.f877j;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return a(0, 0, 0, this.f869b.getString(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f869b.getString(i10));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        g gVar = (g) a(i10, i11, i12, charSequence);
        m mVar = new m(this.f868a, this, gVar);
        gVar.x(mVar);
        return mVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f869b.getString(i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f869b.getString(i13));
    }

    public e D() {
        return this;
    }
}
