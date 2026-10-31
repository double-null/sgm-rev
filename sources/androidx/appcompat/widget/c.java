package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import java.util.ArrayList;

/* JADX INFO: compiled from: ActionMenuPresenter.java */
/* JADX INFO: loaded from: classes.dex */
class c extends androidx.appcompat.view.menu.a implements androidx.core.view.b.a {
    RunnableC0018c A;
    private b B;
    final f C;
    int D;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    d f1189k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Drawable f1190l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f1191m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f1192n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f1193o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f1194p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f1195q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f1196r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f1197s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f1198t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f1199u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f1200v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f1201w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final SparseBooleanArray f1202x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    e f1203y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    a f1204z;

    /* JADX INFO: compiled from: ActionMenuPresenter.java */
    private class a extends androidx.appcompat.view.menu.i {
        public a(Context context, androidx.appcompat.view.menu.m mVar, View view) {
            super(context, mVar, view, false, g.a.f14989l);
            if (!((androidx.appcompat.view.menu.g) mVar.getItem()).l()) {
                View view2 = c.this.f1189k;
                f(view2 == null ? (View) ((androidx.appcompat.view.menu.a) c.this).f814i : view2);
            }
            j(c.this.C);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            c cVar = c.this;
            cVar.f1204z = null;
            cVar.D = 0;
            super.e();
        }
    }

    /* JADX INFO: compiled from: ActionMenuPresenter.java */
    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public l.e a() {
            a aVar = c.this.f1204z;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ActionMenuPresenter.java */
    private class RunnableC0018c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e f1207a;

        public RunnableC0018c(e eVar) {
            this.f1207a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.a) c.this).f808c != null) {
                ((androidx.appcompat.view.menu.a) c.this).f808c.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.a) c.this).f814i;
            if (view != null && view.getWindowToken() != null && this.f1207a.m()) {
                c.this.f1203y = this.f1207a;
            }
            c.this.A = null;
        }
    }

    /* JADX INFO: compiled from: ActionMenuPresenter.java */
    private class d extends AppCompatImageView implements ActionMenuView.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float[] f1209c;

        /* JADX INFO: compiled from: ActionMenuPresenter.java */
        class a extends p0 {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ c f1211j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, c cVar) {
                super(view);
                this.f1211j = cVar;
            }

            @Override // androidx.appcompat.widget.p0
            public l.e b() {
                e eVar = c.this.f1203y;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // androidx.appcompat.widget.p0
            public boolean c() {
                c.this.J();
                return true;
            }

            @Override // androidx.appcompat.widget.p0
            public boolean d() {
                c cVar = c.this;
                if (cVar.A != null) {
                    return false;
                }
                cVar.A();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, g.a.f14988k);
            this.f1209c = new float[2];
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            k1.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.J();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.e(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    /* JADX INFO: compiled from: ActionMenuPresenter.java */
    private class e extends androidx.appcompat.view.menu.i {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z10) {
            super(context, eVar, view, z10, g.a.f14989l);
            h(8388613);
            j(c.this.C);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            if (((androidx.appcompat.view.menu.a) c.this).f808c != null) {
                ((androidx.appcompat.view.menu.a) c.this).f808c.close();
            }
            c.this.f1203y = null;
            super.e();
        }
    }

    /* JADX INFO: compiled from: ActionMenuPresenter.java */
    private class f implements androidx.appcompat.view.menu.j.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
            if (eVar instanceof androidx.appcompat.view.menu.m) {
                eVar.D().e(false);
            }
            androidx.appcompat.view.menu.j.a aVarM = c.this.m();
            if (aVarM != null) {
                aVarM.b(eVar, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            if (eVar == null) {
                return false;
            }
            c.this.D = ((androidx.appcompat.view.menu.m) eVar).getItem().getItemId();
            androidx.appcompat.view.menu.j.a aVarM = c.this.m();
            if (aVarM != null) {
                return aVarM.c(eVar);
            }
            return false;
        }
    }

    public c(Context context) {
        super(context, g.g.f15078c, g.g.f15077b);
        this.f1202x = new SparseBooleanArray();
        this.C = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View y(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f814i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof androidx.appcompat.view.menu.k.a) && ((androidx.appcompat.view.menu.k.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public boolean A() {
        Object obj;
        RunnableC0018c runnableC0018c = this.A;
        if (runnableC0018c != null && (obj = this.f814i) != null) {
            ((View) obj).removeCallbacks(runnableC0018c);
            this.A = null;
            return true;
        }
        e eVar = this.f1203y;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean B() {
        a aVar = this.f1204z;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean C() {
        return this.A != null || D();
    }

    public boolean D() {
        e eVar = this.f1203y;
        return eVar != null && eVar.d();
    }

    public void E(Configuration configuration) {
        if (!this.f1197s) {
            this.f1196r = k.a.b(this.f807b).d();
        }
        androidx.appcompat.view.menu.e eVar = this.f808c;
        if (eVar != null) {
            eVar.K(true);
        }
    }

    public void F(boolean z10) {
        this.f1200v = z10;
    }

    public void G(ActionMenuView actionMenuView) {
        this.f814i = actionMenuView;
        actionMenuView.a(this.f808c);
    }

    public void H(Drawable drawable) {
        d dVar = this.f1189k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f1191m = true;
            this.f1190l = drawable;
        }
    }

    public void I(boolean z10) {
        this.f1192n = z10;
        this.f1193o = true;
    }

    public boolean J() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.f1192n || D() || (eVar = this.f808c) == null || this.f814i == null || this.A != null || eVar.z().isEmpty()) {
            return false;
        }
        RunnableC0018c runnableC0018c = new RunnableC0018c(new e(this.f807b, this.f808c, this.f1189k, true));
        this.A = runnableC0018c;
        ((View) this.f814i).post(runnableC0018c);
        super.e(null);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
        x();
        super.b(eVar, z10);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public boolean e(androidx.appcompat.view.menu.m mVar) {
        boolean z10 = false;
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.m mVar2 = mVar;
        while (mVar2.e0() != this.f808c) {
            mVar2 = (androidx.appcompat.view.menu.m) mVar2.e0();
        }
        View viewY = y(mVar2.getItem());
        if (viewY == null) {
            return false;
        }
        this.D = mVar.getItem().getItemId();
        int size = mVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = mVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                z10 = true;
                break;
            }
        }
        a aVar = new a(this.f807b, mVar, viewY);
        this.f1204z = aVar;
        aVar.g(z10);
        this.f1204z.k();
        super.e(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void f(boolean z10) {
        super.f(z10);
        ((View) this.f814i).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.f808c;
        boolean z11 = false;
        if (eVar != null) {
            ArrayList<androidx.appcompat.view.menu.g> arrayListS = eVar.s();
            int size = arrayListS.size();
            for (int i10 = 0; i10 < size; i10++) {
                androidx.core.view.b bVarA = arrayListS.get(i10).a();
                if (bVarA != null) {
                    bVarA.i(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.f808c;
        ArrayList<androidx.appcompat.view.menu.g> arrayListZ = eVar2 != null ? eVar2.z() : null;
        if (this.f1192n && arrayListZ != null) {
            int size2 = arrayListZ.size();
            if (size2 == 1) {
                z11 = !arrayListZ.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z11 = true;
            }
        }
        if (z11) {
            if (this.f1189k == null) {
                this.f1189k = new d(this.f806a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1189k.getParent();
            if (viewGroup != this.f814i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1189k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f814i;
                actionMenuView.addView(this.f1189k, actionMenuView.B());
            }
        } else {
            d dVar = this.f1189k;
            if (dVar != null) {
                Object parent = dVar.getParent();
                Object obj = this.f814i;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f1189k);
                }
            }
        }
        ((ActionMenuView) this.f814i).setOverflowReserved(this.f1192n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.widget.c] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.appcompat.view.menu.g] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.j
    public boolean g() {
        ArrayList<androidx.appcompat.view.menu.g> arrayListE;
        int size;
        int i10;
        int iH;
        ?? r10;
        c cVar = this;
        androidx.appcompat.view.menu.e eVar = cVar.f808c;
        View view = null;
        ?? r11 = 0;
        if (eVar != null) {
            arrayListE = eVar.E();
            size = arrayListE.size();
        } else {
            arrayListE = null;
            size = 0;
        }
        int i11 = cVar.f1196r;
        int i12 = cVar.f1195q;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f814i;
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            androidx.appcompat.view.menu.g gVar = arrayListE.get(i15);
            if (gVar.o()) {
                i13++;
            } else if (gVar.n()) {
                i14++;
            } else {
                z10 = true;
            }
            if (cVar.f1200v && gVar.isActionViewExpanded()) {
                i11 = 0;
            }
        }
        if (cVar.f1192n && (z10 || i14 + i13 > i11)) {
            i11--;
        }
        int i16 = i11 - i13;
        SparseBooleanArray sparseBooleanArray = cVar.f1202x;
        sparseBooleanArray.clear();
        if (cVar.f1198t) {
            int i17 = cVar.f1201w;
            iH = i12 / i17;
            i10 = i17 + ((i12 % i17) / iH);
        } else {
            i10 = 0;
            iH = 0;
        }
        int i18 = 0;
        int i19 = 0;
        ?? r12 = cVar;
        while (i18 < size) {
            androidx.appcompat.view.menu.g gVar2 = arrayListE.get(i18);
            if (gVar2.o()) {
                View viewN = r12.n(gVar2, view, viewGroup);
                if (r12.f1198t) {
                    iH -= ActionMenuView.H(viewN, i10, iH, iMakeMeasureSpec, r11);
                } else {
                    viewN.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewN.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                int groupId = gVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                gVar2.u(true);
                r10 = r11;
            } else if (gVar2.n()) {
                int groupId2 = gVar2.getGroupId();
                boolean z11 = sparseBooleanArray.get(groupId2);
                boolean z12 = (i16 > 0 || z11) && i12 > 0 && (!r12.f1198t || iH > 0);
                boolean z13 = z12;
                if (z12) {
                    View viewN2 = r12.n(gVar2, null, viewGroup);
                    if (r12.f1198t) {
                        int iH2 = ActionMenuView.H(viewN2, i10, iH, iMakeMeasureSpec, 0);
                        iH -= iH2;
                        if (iH2 == 0) {
                            z13 = false;
                        }
                    } else {
                        viewN2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z14 = z13;
                    int measuredWidth2 = viewN2.getMeasuredWidth();
                    i12 -= measuredWidth2;
                    if (i19 == 0) {
                        i19 = measuredWidth2;
                    }
                    z12 = z14 & (!r12.f1198t ? i12 + i19 <= 0 : i12 < 0);
                }
                if (z12 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z11) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i20 = 0; i20 < i18; i20++) {
                        androidx.appcompat.view.menu.g gVar3 = arrayListE.get(i20);
                        if (gVar3.getGroupId() == groupId2) {
                            if (gVar3.l()) {
                                i16++;
                            }
                            gVar3.u(false);
                        }
                    }
                }
                if (z12) {
                    i16--;
                }
                gVar2.u(z12);
                r10 = 0;
            } else {
                r10 = r11;
                gVar2.u(r10);
            }
            i18++;
            r11 = r10;
            size = size;
            view = null;
            r12 = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void i(Context context, androidx.appcompat.view.menu.e eVar) {
        super.i(context, eVar);
        Resources resources = context.getResources();
        k.a aVarB = k.a.b(context);
        if (!this.f1193o) {
            this.f1192n = aVarB.h();
        }
        if (!this.f1199u) {
            this.f1194p = aVarB.c();
        }
        if (!this.f1197s) {
            this.f1196r = aVarB.d();
        }
        int measuredWidth = this.f1194p;
        if (this.f1192n) {
            if (this.f1189k == null) {
                d dVar = new d(this.f806a);
                this.f1189k = dVar;
                if (this.f1191m) {
                    dVar.setImageDrawable(this.f1190l);
                    this.f1190l = null;
                    this.f1191m = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1189k.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f1189k.getMeasuredWidth();
        } else {
            this.f1189k = null;
        }
        this.f1195q = measuredWidth;
        this.f1201w = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.a
    public void j(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.k.a aVar) {
        aVar.c(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f814i);
        if (this.B == null) {
            this.B = new b();
        }
        actionMenuItemView.setPopupCallback(this.B);
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean l(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.f1189k) {
            return false;
        }
        return super.l(viewGroup, i10);
    }

    @Override // androidx.appcompat.view.menu.a
    public View n(androidx.appcompat.view.menu.g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.j()) {
            actionView = super.n(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public androidx.appcompat.view.menu.k o(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.k kVar = this.f814i;
        androidx.appcompat.view.menu.k kVarO = super.o(viewGroup);
        if (kVar != kVarO) {
            ((ActionMenuView) kVarO).setPresenter(this);
        }
        return kVarO;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean q(int i10, androidx.appcompat.view.menu.g gVar) {
        return gVar.l();
    }

    public boolean x() {
        return A() | B();
    }

    public Drawable z() {
        d dVar = this.f1189k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f1191m) {
            return this.f1190l;
        }
        return null;
    }
}
