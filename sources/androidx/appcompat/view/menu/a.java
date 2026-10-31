package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: compiled from: BaseMenuPresenter.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Context f807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected e f808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected LayoutInflater f809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected LayoutInflater f810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private j.a f811f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f812g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f813h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected k f814i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f815j;

    public a(Context context, int i10, int i11) {
        this.f806a = context;
        this.f809d = LayoutInflater.from(context);
        this.f812g = i10;
        this.f813h = i11;
    }

    protected void a(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f814i).addView(view, i10);
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z10) {
        j.a aVar = this.f811f;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean c(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(j.a aVar) {
        this.f811f = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e(m mVar) {
        j.a aVar = this.f811f;
        if (aVar != null) {
            return aVar.c(mVar);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.j
    public void f(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) this.f814i;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.f808c;
        int i10 = 0;
        if (eVar != null) {
            eVar.r();
            ArrayList<g> arrayListE = this.f808c.E();
            int size = arrayListE.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                g gVar = arrayListE.get(i12);
                if (q(i11, gVar)) {
                    View childAt = viewGroup.getChildAt(i11);
                    g itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                    View viewN = n(gVar, childAt, viewGroup);
                    if (gVar != itemData) {
                        viewN.setPressed(false);
                        viewN.jumpDrawablesToCurrentState();
                    }
                    if (viewN != childAt) {
                        a(viewN, i11);
                    }
                    i11++;
                }
            }
            i10 = i11;
        }
        while (i10 < viewGroup.getChildCount()) {
            if (!l(viewGroup, i10)) {
                i10++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean h(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(Context context, e eVar) {
        this.f807b = context;
        this.f810e = LayoutInflater.from(context);
        this.f808c = eVar;
    }

    public abstract void j(g gVar, k.a aVar);

    public k.a k(ViewGroup viewGroup) {
        return (k.a) this.f809d.inflate(this.f813h, viewGroup, false);
    }

    protected boolean l(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    public j.a m() {
        return this.f811f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View n(g gVar, View view, ViewGroup viewGroup) {
        k.a aVarK = view instanceof k.a ? (k.a) view : k(viewGroup);
        j(gVar, aVarK);
        return (View) aVarK;
    }

    public k o(ViewGroup viewGroup) {
        if (this.f814i == null) {
            k kVar = (k) this.f809d.inflate(this.f812g, viewGroup, false);
            this.f814i = kVar;
            kVar.a(this.f808c);
            f(true);
        }
        return this.f814i;
    }

    public void p(int i10) {
        this.f815j = i10;
    }

    public abstract boolean q(int i10, g gVar);
}
