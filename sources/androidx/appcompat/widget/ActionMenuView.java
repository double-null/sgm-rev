package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends q0 implements androidx.appcompat.view.menu.e.b, androidx.appcompat.view.menu.k {
    e A;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private androidx.appcompat.view.menu.e f1014p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Context f1015q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f1016r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f1017s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private androidx.appcompat.widget.c f1018t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private androidx.appcompat.view.menu.j.a f1019u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    androidx.appcompat.view.menu.e.a f1020v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f1021w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f1022x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f1023y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f1024z;

    public interface a {
        boolean a();

        boolean b();
    }

    public static class c extends q0.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f1025c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f1026d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f1027e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f1028f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f1029g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f1030h;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f1025c = cVar.f1025c;
        }

        public c(int i10, int i11) {
            super(i10, i11);
            this.f1025c = false;
        }
    }

    private class d implements androidx.appcompat.view.menu.e.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e eVar2 = ActionMenuView.this.A;
            return eVar2 != null && eVar2.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.e.a aVar = ActionMenuView.this.f1020v;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    static int H(View view, int i10, int i11, int i12, int i13) {
        int i14;
        c cVar = (c) view.getLayoutParams();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i12) - i13, View.MeasureSpec.getMode(i12));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z10 = actionMenuItemView != null && actionMenuItemView.f();
        if (i11 > 0) {
            i14 = 2;
            if (!z10 || i11 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i11 * i10, Integer.MIN_VALUE), iMakeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i15 = measuredWidth / i10;
                if (measuredWidth % i10 != 0) {
                    i15++;
                }
                if (!z10 || i15 >= 2) {
                    i14 = i15;
                }
            } else {
                i14 = 0;
            }
        } else {
            i14 = 0;
        }
        cVar.f1028f = !cVar.f1025c && z10;
        cVar.f1026d = i14;
        view.measure(View.MeasureSpec.makeMeasureSpec(i10 * i14, 1073741824), iMakeMeasureSpec);
        return i14;
    }

    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v14 */
    private void I(int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        boolean z11;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingTop, -2);
        int i14 = size - paddingLeft;
        int i15 = this.f1023y;
        int i16 = i14 / i15;
        int i17 = i14 % i15;
        if (i16 == 0) {
            setMeasuredDimension(i14, 0);
            return;
        }
        int i18 = i15 + (i17 / i16);
        int childCount = getChildCount();
        int iMax = 0;
        int i19 = 0;
        boolean z12 = false;
        int i20 = 0;
        int iMax2 = 0;
        int i21 = 0;
        long j10 = 0;
        while (i19 < childCount) {
            View childAt = getChildAt(i19);
            int i22 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z13 = childAt instanceof ActionMenuItemView;
                int i23 = i20 + 1;
                if (z13) {
                    int i24 = this.f1024z;
                    r14 = 0;
                    childAt.setPadding(i24, 0, i24, 0);
                } else {
                    r14 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f1030h = r14;
                cVar.f1027e = r14;
                cVar.f1026d = r14;
                cVar.f1028f = r14;
                ((ViewGroup.MarginLayoutParams) cVar).leftMargin = r14;
                ((ViewGroup.MarginLayoutParams) cVar).rightMargin = r14;
                cVar.f1029g = z13 && ((ActionMenuItemView) childAt).f();
                int iH = H(childAt, i18, cVar.f1025c ? 1 : i16, childMeasureSpec, paddingTop);
                iMax2 = Math.max(iMax2, iH);
                if (cVar.f1028f) {
                    i21++;
                }
                if (cVar.f1025c) {
                    z12 = true;
                }
                i16 -= iH;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iH == 1) {
                    j10 |= (long) (1 << i19);
                    iMax = iMax;
                }
                i20 = i23;
            }
            i19++;
            size2 = i22;
        }
        int i25 = size2;
        boolean z14 = z12 && i20 == 2;
        boolean z15 = false;
        while (true) {
            if (i21 <= 0 || i16 <= 0) {
                z10 = z15;
                i12 = iMax;
                break;
            }
            int i26 = Integer.MAX_VALUE;
            int i27 = 0;
            int i28 = 0;
            long j11 = 0;
            while (i28 < childCount) {
                boolean z16 = z15;
                c cVar2 = (c) getChildAt(i28).getLayoutParams();
                int i29 = iMax;
                if (cVar2.f1028f) {
                    int i30 = cVar2.f1026d;
                    if (i30 < i26) {
                        j11 = 1 << i28;
                        i26 = i30;
                        i27 = 1;
                    } else if (i30 == i26) {
                        i27++;
                        j11 |= 1 << i28;
                    }
                }
                i28++;
                iMax = i29;
                z15 = z16;
            }
            z10 = z15;
            i12 = iMax;
            j10 |= j11;
            if (i27 > i16) {
                break;
            }
            int i31 = i26 + 1;
            int i32 = 0;
            while (i32 < childCount) {
                View childAt2 = getChildAt(i32);
                c cVar3 = (c) childAt2.getLayoutParams();
                int i33 = i14;
                int i34 = mode;
                long j12 = 1 << i32;
                if ((j11 & j12) == 0) {
                    if (cVar3.f1026d == i31) {
                        j10 |= j12;
                    }
                    z14 = z14;
                } else {
                    if (z14 && cVar3.f1029g && i16 == 1) {
                        int i35 = this.f1024z;
                        childAt2.setPadding(i35 + i18, 0, i35, 0);
                    }
                    cVar3.f1026d++;
                    cVar3.f1030h = true;
                    i16--;
                }
                i32++;
                mode = i34;
                i14 = i33;
                z14 = z14;
            }
            iMax = i12;
            z15 = true;
        }
        boolean z17 = !z12 && i20 == 1;
        if (i16 <= 0 || j10 == 0 || (i16 >= i20 - 1 && !z17 && iMax2 <= 1)) {
            i13 = 0;
            z11 = z10;
        } else {
            float fBitCount = Long.bitCount(j10);
            if (z17) {
                i13 = 0;
            } else {
                i13 = 0;
                if ((j10 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f1029g) {
                    fBitCount -= 0.5f;
                }
                int i36 = childCount - 1;
                if ((j10 & ((long) (1 << i36))) != 0 && !((c) getChildAt(i36).getLayoutParams()).f1029g) {
                    fBitCount -= 0.5f;
                }
            }
            int i37 = fBitCount > 0.0f ? (int) ((i16 * i18) / fBitCount) : i13;
            z11 = z10;
            for (int i38 = i13; i38 < childCount; i38++) {
                if ((j10 & ((long) (1 << i38))) != 0) {
                    View childAt3 = getChildAt(i38);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f1027e = i37;
                        cVar4.f1030h = true;
                        if (i38 == 0 && !cVar4.f1029g) {
                            ((ViewGroup.MarginLayoutParams) cVar4).leftMargin = (-i37) / 2;
                        }
                        z11 = true;
                    } else if (cVar4.f1025c) {
                        cVar4.f1027e = i37;
                        cVar4.f1030h = true;
                        ((ViewGroup.MarginLayoutParams) cVar4).rightMargin = (-i37) / 2;
                        z11 = true;
                    } else {
                        if (i38 != 0) {
                            ((ViewGroup.MarginLayoutParams) cVar4).leftMargin = i37 / 2;
                        }
                        if (i38 != childCount - 1) {
                            ((ViewGroup.MarginLayoutParams) cVar4).rightMargin = i37 / 2;
                        }
                    }
                }
            }
        }
        if (z11) {
            for (int i39 = i13; i39 < childCount; i39++) {
                View childAt4 = getChildAt(i39);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f1030h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f1026d * i18) + cVar5.f1027e, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i14, mode != 1073741824 ? i12 : i25);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.q0
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (cVar.f1414b <= 0) {
            cVar.f1414b = 16;
        }
        return cVar;
    }

    public c B() {
        c cVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        cVarGenerateDefaultLayoutParams.f1025c = true;
        return cVarGenerateDefaultLayoutParams;
    }

    protected boolean C(int i10) {
        boolean zA = false;
        if (i10 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i10 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof a)) {
            zA = false | ((a) childAt).a();
        }
        return (i10 <= 0 || !(childAt2 instanceof a)) ? zA : zA | ((a) childAt2).b();
    }

    public boolean D() {
        androidx.appcompat.widget.c cVar = this.f1018t;
        return cVar != null && cVar.A();
    }

    public boolean E() {
        androidx.appcompat.widget.c cVar = this.f1018t;
        return cVar != null && cVar.C();
    }

    public boolean F() {
        androidx.appcompat.widget.c cVar = this.f1018t;
        return cVar != null && cVar.D();
    }

    public boolean G() {
        return this.f1017s;
    }

    public androidx.appcompat.view.menu.e J() {
        return this.f1014p;
    }

    public void K(androidx.appcompat.view.menu.j.a aVar, androidx.appcompat.view.menu.e.a aVar2) {
        this.f1019u = aVar;
        this.f1020v = aVar2;
    }

    public boolean L() {
        androidx.appcompat.widget.c cVar = this.f1018t;
        return cVar != null && cVar.J();
    }

    @Override // androidx.appcompat.view.menu.k
    public void a(androidx.appcompat.view.menu.e eVar) {
        this.f1014p = eVar;
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean b(androidx.appcompat.view.menu.g gVar) {
        return this.f1014p.L(gVar, 0);
    }

    @Override // androidx.appcompat.widget.q0, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f1014p == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            this.f1014p = eVar;
            eVar.R(new d());
            androidx.appcompat.widget.c cVar = new androidx.appcompat.widget.c(context);
            this.f1018t = cVar;
            cVar.I(true);
            androidx.appcompat.widget.c cVar2 = this.f1018t;
            androidx.appcompat.view.menu.j.a bVar = this.f1019u;
            if (bVar == null) {
                bVar = new b();
            }
            cVar2.d(bVar);
            this.f1014p.c(this.f1018t, this.f1015q);
            this.f1018t.G(this);
        }
        return this.f1014p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f1018t.z();
    }

    public int getPopupTheme() {
        return this.f1016r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.c cVar = this.f1018t;
        if (cVar != null) {
            cVar.f(false);
            if (this.f1018t.D()) {
                this.f1018t.A();
                this.f1018t.J();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        x();
    }

    @Override // androidx.appcompat.widget.q0, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int width;
        int paddingLeft;
        if (!this.f1021w) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i14 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i15 = i12 - i10;
        int paddingRight = (i15 - getPaddingRight()) - getPaddingLeft();
        boolean zB = o1.b(this);
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f1025c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (C(i18)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zB) {
                        paddingLeft = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i19 = i14 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i19, width, measuredHeight + i19);
                    paddingRight -= measuredWidth;
                    i16 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin) + ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                    C(i18);
                    i17++;
                }
            }
        }
        if (childCount == 1 && i16 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i20 = (i15 / 2) - (measuredWidth2 / 2);
            int i21 = i14 - (measuredHeight2 / 2);
            childAt2.layout(i20, i21, measuredWidth2 + i20, measuredHeight2 + i21);
            return;
        }
        int i22 = i17 - (i16 ^ 1);
        int iMax = Math.max(0, i22 > 0 ? paddingRight / i22 : 0);
        if (zB) {
            int width2 = getWidth() - getPaddingRight();
            for (int i23 = 0; i23 < childCount; i23++) {
                View childAt3 = getChildAt(i23);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f1025c) {
                    int i24 = width2 - ((ViewGroup.MarginLayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i25 = i14 - (measuredHeight3 / 2);
                    childAt3.layout(i24 - measuredWidth3, i25, i24, measuredHeight3 + i25);
                    width2 = i24 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) cVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt4 = getChildAt(i26);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f1025c) {
                int i27 = paddingLeft2 + ((ViewGroup.MarginLayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i28 = i14 - (measuredHeight4 / 2);
                childAt4.layout(i27, i28, i27 + measuredWidth4, measuredHeight4 + i28);
                paddingLeft2 = i27 + measuredWidth4 + ((ViewGroup.MarginLayoutParams) cVar3).rightMargin + iMax;
            }
        }
    }

    @Override // androidx.appcompat.widget.q0, android.view.View
    protected void onMeasure(int i10, int i11) {
        androidx.appcompat.view.menu.e eVar;
        boolean z10 = this.f1021w;
        boolean z11 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.f1021w = z11;
        if (z10 != z11) {
            this.f1022x = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.f1021w && (eVar = this.f1014p) != null && size != this.f1022x) {
            this.f1022x = size;
            eVar.K(true);
        }
        int childCount = getChildCount();
        if (this.f1021w && childCount > 0) {
            I(i10, i11);
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            c cVar = (c) getChildAt(i12).getLayoutParams();
            ((ViewGroup.MarginLayoutParams) cVar).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i10, i11);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.f1018t.F(z10);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.A = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f1018t.H(drawable);
    }

    public void setOverflowReserved(boolean z10) {
        this.f1017s = z10;
    }

    public void setPopupTheme(int i10) {
        if (this.f1016r != i10) {
            this.f1016r = i10;
            if (i10 == 0) {
                this.f1015q = getContext();
            } else {
                this.f1015q = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.c cVar) {
        this.f1018t = cVar;
        cVar.G(this);
    }

    public void x() {
        androidx.appcompat.widget.c cVar = this.f1018t;
        if (cVar != null) {
            cVar.x();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.q0
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        cVar.f1414b = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.q0
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f1023y = (int) (56.0f * f10);
        this.f1024z = (int) (f10 * 4.0f);
        this.f1015q = context;
        this.f1016r = 0;
    }

    private static class b implements androidx.appcompat.view.menu.j.a {
        b() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
        }
    }
}
