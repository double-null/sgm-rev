package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.u0;
import androidx.appcompat.widget.w0;
import androidx.core.view.n;
import androidx.core.view.z0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: CascadingMenuPopup.java */
/* JADX INFO: loaded from: classes.dex */
final class b extends h implements View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int B = g.g.f15080e;
    boolean A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Handler f821g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View f829o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    View f830p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f832r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f833s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f834t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f835u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f837w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private j.a f838x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    ViewTreeObserver f839y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private PopupWindow.OnDismissListener f840z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<e> f822h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final List<d> f823i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f824j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f825k = new ViewOnAttachStateChangeListenerC0016b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final u0 f826l = new c();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f827m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f828n = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f836v = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f831q = C();

    /* JADX INFO: compiled from: CascadingMenuPopup.java */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.a() || b.this.f823i.size() <= 0 || b.this.f823i.get(0).f848a.v()) {
                return;
            }
            View view = b.this.f830p;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            Iterator<d> it = b.this.f823i.iterator();
            while (it.hasNext()) {
                it.next().f848a.show();
            }
        }
    }

    /* JADX INFO: compiled from: CascadingMenuPopup.java */
    class c implements u0 {

        /* JADX INFO: compiled from: CascadingMenuPopup.java */
        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f844a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MenuItem f845b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ e f846c;

            a(d dVar, MenuItem menuItem, e eVar) {
                this.f844a = dVar;
                this.f845b = menuItem;
                this.f846c = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f844a;
                if (dVar != null) {
                    b.this.A = true;
                    dVar.f849b.e(false);
                    b.this.A = false;
                }
                if (this.f845b.isEnabled() && this.f845b.hasSubMenu()) {
                    this.f846c.L(this.f845b, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.u0
        public void c(e eVar, MenuItem menuItem) {
            b.this.f821g.removeCallbacksAndMessages(null);
            int size = b.this.f823i.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (eVar == b.this.f823i.get(i10).f849b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            b.this.f821g.postAtTime(new a(i11 < b.this.f823i.size() ? b.this.f823i.get(i11) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.u0
        public void l(e eVar, MenuItem menuItem) {
            b.this.f821g.removeCallbacksAndMessages(eVar);
        }
    }

    /* JADX INFO: compiled from: CascadingMenuPopup.java */
    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w0 f848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f849b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f850c;

        public d(w0 w0Var, e eVar, int i10) {
            this.f848a = w0Var;
            this.f849b = eVar;
            this.f850c = i10;
        }

        public ListView a() {
            return this.f848a.m();
        }
    }

    public b(Context context, View view, int i10, int i11, boolean z10) {
        this.f816b = context;
        this.f829o = view;
        this.f818d = i10;
        this.f819e = i11;
        this.f820f = z10;
        Resources resources = context.getResources();
        this.f817c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(g.d.f15015d));
        this.f821g = new Handler();
    }

    private MenuItem A(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = eVar.getItem(i10);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View B(d dVar, e eVar) {
        androidx.appcompat.view.menu.d dVar2;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemA = A(dVar.f849b, eVar);
        if (menuItemA == null) {
            return null;
        }
        ListView listViewA = dVar.a();
        ListAdapter adapter = listViewA.getAdapter();
        int i10 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            dVar2 = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (androidx.appcompat.view.menu.d) adapter;
            headersCount = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i10 >= count) {
                i10 = -1;
                break;
            }
            if (menuItemA == dVar2.getItem(i10)) {
                break;
            }
            i10++;
        }
        if (i10 != -1 && (firstVisiblePosition = (i10 + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) {
            return listViewA.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int C() {
        return z0.n(this.f829o) == 1 ? 0 : 1;
    }

    private int D(int i10) {
        List<d> list = this.f823i;
        ListView listViewA = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        listViewA.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f830p.getWindowVisibleDisplayFrame(rect);
        if (this.f831q == 1) {
            return (iArr[0] + listViewA.getWidth()) + i10 > rect.right ? 0 : 1;
        }
        return iArr[0] - i10 < 0 ? 1 : 0;
    }

    private void E(e eVar) {
        d dVar;
        View viewB;
        int i10;
        int i11;
        int i12;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f816b);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, layoutInflaterFrom, this.f820f, B);
        if (!a() && this.f836v) {
            dVar2.d(true);
        } else if (a()) {
            dVar2.d(h.w(eVar));
        }
        int iN = h.n(dVar2, null, this.f816b, this.f817c);
        w0 w0VarY = y();
        w0VarY.k(dVar2);
        w0VarY.z(iN);
        w0VarY.A(this.f828n);
        if (this.f823i.size() > 0) {
            List<d> list = this.f823i;
            dVar = list.get(list.size() - 1);
            viewB = B(dVar, eVar);
        } else {
            dVar = null;
            viewB = null;
        }
        if (viewB != null) {
            w0VarY.O(false);
            w0VarY.L(null);
            int iD = D(iN);
            boolean z10 = iD == 1;
            this.f831q = iD;
            if (Build.VERSION.SDK_INT >= 26) {
                w0VarY.x(viewB);
                i11 = 0;
                i10 = 0;
            } else {
                int[] iArr = new int[2];
                this.f829o.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewB.getLocationOnScreen(iArr2);
                if ((this.f828n & 7) == 5) {
                    iArr[0] = iArr[0] + this.f829o.getWidth();
                    iArr2[0] = iArr2[0] + viewB.getWidth();
                }
                i10 = iArr2[0] - iArr[0];
                i11 = iArr2[1] - iArr[1];
            }
            if ((this.f828n & 5) == 5) {
                if (z10) {
                    i12 = i10 + iN;
                } else {
                    iN = viewB.getWidth();
                    i12 = i10 - iN;
                }
            } else if (z10) {
                iN = viewB.getWidth();
                i12 = i10 + iN;
            } else {
                i12 = i10 - iN;
            }
            w0VarY.d(i12);
            w0VarY.G(true);
            w0VarY.g(i11);
        } else {
            if (this.f832r) {
                w0VarY.d(this.f834t);
            }
            if (this.f833s) {
                w0VarY.g(this.f835u);
            }
            w0VarY.B(l());
        }
        this.f823i.add(new d(w0VarY, eVar, this.f831q));
        w0VarY.show();
        ListView listViewM = w0VarY.m();
        listViewM.setOnKeyListener(this);
        if (dVar == null && this.f837w && eVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(g.g.f15087l, (ViewGroup) listViewM, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(eVar.x());
            listViewM.addHeaderView(frameLayout, null, false);
            w0VarY.show();
        }
    }

    private w0 y() {
        w0 w0Var = new w0(this.f816b, null, this.f818d, this.f819e);
        w0Var.N(this.f826l);
        w0Var.F(this);
        w0Var.E(this);
        w0Var.x(this.f829o);
        w0Var.A(this.f828n);
        w0Var.D(true);
        w0Var.C(2);
        return w0Var;
    }

    private int z(e eVar) {
        int size = this.f823i.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (eVar == this.f823i.get(i10).f849b) {
                return i10;
            }
        }
        return -1;
    }

    @Override // l.e
    public boolean a() {
        return this.f823i.size() > 0 && this.f823i.get(0).f848a.a();
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z10) {
        int iZ = z(eVar);
        if (iZ < 0) {
            return;
        }
        int i10 = iZ + 1;
        if (i10 < this.f823i.size()) {
            this.f823i.get(i10).f849b.e(false);
        }
        d dVarRemove = this.f823i.remove(iZ);
        dVarRemove.f849b.O(this);
        if (this.A) {
            dVarRemove.f848a.M(null);
            dVarRemove.f848a.y(0);
        }
        dVarRemove.f848a.dismiss();
        int size = this.f823i.size();
        if (size > 0) {
            this.f831q = this.f823i.get(size - 1).f850c;
        } else {
            this.f831q = C();
        }
        if (size != 0) {
            if (z10) {
                this.f823i.get(0).f849b.e(false);
                return;
            }
            return;
        }
        dismiss();
        j.a aVar = this.f838x;
        if (aVar != null) {
            aVar.b(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f839y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f839y.removeGlobalOnLayoutListener(this.f824j);
            }
            this.f839y = null;
        }
        this.f830p.removeOnAttachStateChangeListener(this.f825k);
        this.f840z.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(j.a aVar) {
        this.f838x = aVar;
    }

    @Override // l.e
    public void dismiss() {
        int size = this.f823i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f823i.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f848a.a()) {
                    dVar.f848a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e(m mVar) {
        for (d dVar : this.f823i) {
            if (mVar == dVar.f849b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        j(mVar);
        j.a aVar = this.f838x;
        if (aVar != null) {
            aVar.c(mVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(boolean z10) {
        Iterator<d> it = this.f823i.iterator();
        while (it.hasNext()) {
            h.x(it.next().a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void j(e eVar) {
        eVar.c(this, this.f816b);
        if (a()) {
            E(eVar);
        } else {
            this.f822h.add(eVar);
        }
    }

    @Override // androidx.appcompat.view.menu.h
    protected boolean k() {
        return false;
    }

    @Override // l.e
    public ListView m() {
        if (this.f823i.isEmpty()) {
            return null;
        }
        List<d> list = this.f823i;
        return list.get(list.size() - 1).a();
    }

    @Override // androidx.appcompat.view.menu.h
    public void o(View view) {
        if (this.f829o != view) {
            this.f829o = view;
            this.f828n = n.a(this.f827m, z0.n(view));
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f823i.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f823i.get(i10);
            if (!dVar.f848a.a()) {
                break;
            } else {
                i10++;
            }
        }
        if (dVar != null) {
            dVar.f849b.e(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.h
    public void q(boolean z10) {
        this.f836v = z10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(int i10) {
        if (this.f827m != i10) {
            this.f827m = i10;
            this.f828n = n.a(i10, z0.n(this.f829o));
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(int i10) {
        this.f832r = true;
        this.f834t = i10;
    }

    @Override // l.e
    public void show() {
        if (a()) {
            return;
        }
        Iterator<e> it = this.f822h.iterator();
        while (it.hasNext()) {
            E(it.next());
        }
        this.f822h.clear();
        View view = this.f829o;
        this.f830p = view;
        if (view != null) {
            boolean z10 = this.f839y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f839y = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f824j);
            }
            this.f830p.addOnAttachStateChangeListener(this.f825k);
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f840z = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(boolean z10) {
        this.f837w = z10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(int i10) {
        this.f833s = true;
        this.f835u = i10;
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CascadingMenuPopup.java */
    class ViewOnAttachStateChangeListenerC0016b implements View.OnAttachStateChangeListener {
        ViewOnAttachStateChangeListenerC0016b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.f839y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.f839y = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.f839y.removeGlobalOnLayoutListener(bVar.f824j);
            }
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
