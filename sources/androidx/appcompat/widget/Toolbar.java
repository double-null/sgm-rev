package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    private ColorStateList A;
    private boolean B;
    private boolean C;
    private final ArrayList<View> D;
    private final ArrayList<View> E;
    private final int[] F;
    f G;
    private final ActionMenuView.e H;
    private i1 I;
    private androidx.appcompat.widget.c J;
    private d K;
    private androidx.appcompat.view.menu.j.a L;
    private androidx.appcompat.view.menu.e.a M;
    private boolean N;
    private final Runnable O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ActionMenuView f1098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f1099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f1100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ImageButton f1101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ImageView f1102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f1103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CharSequence f1104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ImageButton f1105h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    View f1106i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Context f1107j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f1108k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f1109l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f1110m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f1111n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f1112o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f1113p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f1114q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f1115r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f1116s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private z0 f1117t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f1118u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f1119v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f1120w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private CharSequence f1121x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private CharSequence f1122y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ColorStateList f1123z;

    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            f fVar = Toolbar.this.G;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.O();
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a.L);
    }

    private int B(View view, int i10, int[] iArr, int i11) {
        e eVar = (e) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int iMax = i10 + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        int iQ = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iQ, iMax + measuredWidth, view.getMeasuredHeight() + iQ);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
    }

    private int C(View view, int i10, int[] iArr, int i11) {
        e eVar = (e) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int iMax = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int iQ = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iQ, iMax, view.getMeasuredHeight() + iQ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    private int D(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i14) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + iMax + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private void E(View view, int i10, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i14 >= 0) {
            if (mode != 0) {
                i14 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void F() {
        removeCallbacks(this.O);
        post(this.O);
    }

    private boolean M() {
        if (!this.N) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (N(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean N(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List<View> list, int i10) {
        boolean z10 = androidx.core.view.z0.n(this) == 1;
        int childCount = getChildCount();
        int iA = androidx.core.view.n.a(i10, androidx.core.view.z0.n(this));
        list.clear();
        if (!z10) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f1130b == 0 && N(childAt) && p(eVar.f626a) == iA) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f1130b == 0 && N(childAt2) && p(eVar2.f626a) == iA) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z10) {
        e eVarGenerateLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            eVarGenerateLayoutParams = generateDefaultLayoutParams();
        } else {
            eVarGenerateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (e) layoutParams;
        }
        eVarGenerateLayoutParams.f1130b = 1;
        if (!z10 || this.f1106i == null) {
            addView(view, eVarGenerateLayoutParams);
        } else {
            view.setLayoutParams(eVarGenerateLayoutParams);
            this.E.add(view);
        }
    }

    private MenuInflater getMenuInflater() {
        return new k.g(getContext());
    }

    private void h() {
        if (this.f1117t == null) {
            this.f1117t = new z0();
        }
    }

    private void i() {
        if (this.f1102e == null) {
            this.f1102e = new AppCompatImageView(getContext());
        }
    }

    private void j() {
        k();
        if (this.f1098a.J() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.f1098a.getMenu();
            if (this.K == null) {
                this.K = new d();
            }
            this.f1098a.setExpandedActionViewsExclusive(true);
            eVar.c(this.K, this.f1107j);
        }
    }

    private void k() {
        if (this.f1098a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1098a = actionMenuView;
            actionMenuView.setPopupTheme(this.f1108k);
            this.f1098a.setOnMenuItemClickListener(this.H);
            this.f1098a.K(this.L, this.M);
            e eVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            eVarGenerateDefaultLayoutParams.f626a = (this.f1111n & 112) | 8388613;
            this.f1098a.setLayoutParams(eVarGenerateDefaultLayoutParams);
            c(this.f1098a, false);
        }
    }

    private void l() {
        if (this.f1101d == null) {
            this.f1101d = new m(getContext(), null, g.a.K);
            e eVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            eVarGenerateDefaultLayoutParams.f626a = (this.f1111n & 112) | 8388611;
            this.f1101d.setLayoutParams(eVarGenerateDefaultLayoutParams);
        }
    }

    private int p(int i10) {
        int iN = androidx.core.view.z0.n(this);
        int iA = androidx.core.view.n.a(i10, iN) & 7;
        if (iA == 1 || iA == 3 || iA == 5) {
            return iA;
        }
        return iN == 1 ? 5 : 3;
    }

    private int q(View view, int i10) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int iR = r(eVar.f626a);
        if (iR == 48) {
            return getPaddingTop() - i11;
        }
        if (iR == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i12 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        if (iMax < i12) {
            iMax = i12;
        } else {
            int i13 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i14 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            if (i13 < i14) {
                iMax = Math.max(0, iMax - (i14 - i13));
            }
        }
        return paddingTop + iMax;
    }

    private int r(int i10) {
        int i11 = i10 & 112;
        return (i11 == 16 || i11 == 48 || i11 == 80) ? i11 : this.f1120w & 112;
    }

    private int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return androidx.core.view.q.b(marginLayoutParams) + androidx.core.view.q.a(marginLayoutParams);
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int u(List<View> list, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int size = list.size();
        int i12 = 0;
        int measuredWidth = 0;
        while (i12 < size) {
            View view = list.get(i12);
            e eVar = (e) view.getLayoutParams();
            int i13 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - i10;
            int i14 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - i11;
            int iMax = Math.max(0, i13);
            int iMax2 = Math.max(0, i14);
            int iMax3 = Math.max(0, -i13);
            int iMax4 = Math.max(0, -i14);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i12++;
            i11 = iMax4;
            i10 = iMax3;
        }
        return measuredWidth;
    }

    private boolean y(View view) {
        return view.getParent() == this || this.E.contains(view);
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f1098a;
        return actionMenuView != null && actionMenuView.F();
    }

    void G() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((e) childAt.getLayoutParams()).f1130b != 2 && childAt != this.f1098a) {
                removeViewAt(childCount);
                this.E.add(childAt);
            }
        }
    }

    public void H(int i10, int i11) {
        h();
        this.f1117t.g(i10, i11);
    }

    public void I(androidx.appcompat.view.menu.e eVar, androidx.appcompat.widget.c cVar) {
        if (eVar == null && this.f1098a == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.e eVarJ = this.f1098a.J();
        if (eVarJ == eVar) {
            return;
        }
        if (eVarJ != null) {
            eVarJ.O(this.J);
            eVarJ.O(this.K);
        }
        if (this.K == null) {
            this.K = new d();
        }
        cVar.F(true);
        if (eVar != null) {
            eVar.c(cVar, this.f1107j);
            eVar.c(this.K, this.f1107j);
        } else {
            cVar.i(this.f1107j, null);
            this.K.i(this.f1107j, null);
            cVar.f(true);
            this.K.f(true);
        }
        this.f1098a.setPopupTheme(this.f1108k);
        this.f1098a.setPresenter(cVar);
        this.J = cVar;
    }

    public void J(androidx.appcompat.view.menu.j.a aVar, androidx.appcompat.view.menu.e.a aVar2) {
        this.L = aVar;
        this.M = aVar2;
        ActionMenuView actionMenuView = this.f1098a;
        if (actionMenuView != null) {
            actionMenuView.K(aVar, aVar2);
        }
    }

    public void K(Context context, int i10) {
        this.f1110m = i10;
        TextView textView = this.f1100c;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public void L(Context context, int i10) {
        this.f1109l = i10;
        TextView textView = this.f1099b;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public boolean O() {
        ActionMenuView actionMenuView = this.f1098a;
        return actionMenuView != null && actionMenuView.L();
    }

    void a() {
        for (int size = this.E.size() - 1; size >= 0; size--) {
            addView(this.E.get(size));
        }
        this.E.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f1098a) != null && actionMenuView.G();
    }

    public void e() {
        d dVar = this.K;
        androidx.appcompat.view.menu.g gVar = dVar == null ? null : dVar.f1128b;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f1098a;
        if (actionMenuView != null) {
            actionMenuView.x();
        }
    }

    void g() {
        if (this.f1105h == null) {
            m mVar = new m(getContext(), null, g.a.K);
            this.f1105h = mVar;
            mVar.setImageDrawable(this.f1103f);
            this.f1105h.setContentDescription(this.f1104g);
            e eVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            eVarGenerateDefaultLayoutParams.f626a = (this.f1111n & 112) | 8388611;
            eVarGenerateDefaultLayoutParams.f1130b = 2;
            this.f1105h.setLayoutParams(eVarGenerateDefaultLayoutParams);
            this.f1105h.setOnClickListener(new c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f1105h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f1105h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        z0 z0Var = this.f1117t;
        if (z0Var != null) {
            return z0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f1119v;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        z0 z0Var = this.f1117t;
        if (z0Var != null) {
            return z0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        z0 z0Var = this.f1117t;
        if (z0Var != null) {
            return z0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        z0 z0Var = this.f1117t;
        if (z0Var != null) {
            return z0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f1118u;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e eVarJ;
        ActionMenuView actionMenuView = this.f1098a;
        return actionMenuView != null && (eVarJ = actionMenuView.J()) != null && eVarJ.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.f1119v, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return androidx.core.view.z0.n(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return androidx.core.view.z0.n(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1118u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1102e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1102e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f1098a.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1101d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1101d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    androidx.appcompat.widget.c getOuterActionMenuPresenter() {
        return this.J;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f1098a.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f1107j;
    }

    public int getPopupTheme() {
        return this.f1108k;
    }

    public CharSequence getSubtitle() {
        return this.f1122y;
    }

    final TextView getSubtitleTextView() {
        return this.f1100c;
    }

    public CharSequence getTitle() {
        return this.f1121x;
    }

    public int getTitleMarginBottom() {
        return this.f1116s;
    }

    public int getTitleMarginEnd() {
        return this.f1114q;
    }

    public int getTitleMarginStart() {
        return this.f1113p;
    }

    public int getTitleMarginTop() {
        return this.f1115r;
    }

    final TextView getTitleTextView() {
        return this.f1099b;
    }

    public l0 getWrapper() {
        if (this.I == null) {
            this.I = new i1(this, true);
        }
        return this.I;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        if (layoutParams instanceof androidx.appcompat.app.a.C0014a) {
            return new e((androidx.appcompat.app.a.C0014a) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.O);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.C = false;
        }
        if (!this.C) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0289  */
    /* JADX WARN: Code duplicated, block: B:102:0x028c  */
    /* JADX WARN: Code duplicated, block: B:105:0x029f A[LOOP:0: B:104:0x029d->B:105:0x029f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:108:0x02c1 A[LOOP:1: B:107:0x02bf->B:108:0x02c1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x02eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:114:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:117:0x02fa A[LOOP:2: B:116:0x02f8->B:117:0x02fa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    /* JADX WARN: Code duplicated, block: B:21:0x0068  */
    /* JADX WARN: Code duplicated, block: B:24:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    /* JADX WARN: Code duplicated, block: B:26:0x007f  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:40:0x0100  */
    /* JADX WARN: Code duplicated, block: B:42:0x0105  */
    /* JADX WARN: Code duplicated, block: B:43:0x011d  */
    /* JADX WARN: Code duplicated, block: B:49:0x012b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x012d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0130  */
    /* JADX WARN: Code duplicated, block: B:53:0x0134  */
    /* JADX WARN: Code duplicated, block: B:54:0x0137  */
    /* JADX WARN: Code duplicated, block: B:57:0x0147  */
    /* JADX WARN: Code duplicated, block: B:59:0x014f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x0168  */
    /* JADX WARN: Code duplicated, block: B:68:0x016c  */
    /* JADX WARN: Code duplicated, block: B:70:0x017e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0181  */
    /* JADX WARN: Code duplicated, block: B:73:0x018c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0198  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:80:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:87:0x021b  */
    /* JADX WARN: Code duplicated, block: B:89:0x021e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0227 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0229  */
    /* JADX WARN: Code duplicated, block: B:93:0x022d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0241  */
    /* JADX WARN: Code duplicated, block: B:97:0x0264  */
    /* JADX WARN: Code duplicated, block: B:99:0x0267  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iB;
        int iC;
        int iMax;
        int iMin;
        boolean zN;
        boolean zN2;
        int measuredHeight;
        TextView textView;
        TextView textView2;
        e eVar;
        e eVar2;
        boolean z11;
        int i14;
        int i15;
        int paddingTop;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int iMax2;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int size;
        int i28;
        int i29;
        int size2;
        int i30;
        int i31;
        int i32;
        int size3;
        boolean z12 = androidx.core.view.z0.n(this) == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i33 = width - paddingRight;
        int[] iArr = this.F;
        iArr[1] = 0;
        iArr[0] = 0;
        int iO = androidx.core.view.z0.o(this);
        int iMin2 = iO >= 0 ? Math.min(iO, i13 - i11) : 0;
        if (N(this.f1101d)) {
            if (z12) {
                iC = C(this.f1101d, i33, iArr, iMin2);
                iB = paddingLeft;
            } else {
                iB = B(this.f1101d, paddingLeft, iArr, iMin2);
            }
            if (N(this.f1105h)) {
                if (z12) {
                    iC = C(this.f1105h, iC, iArr, iMin2);
                } else {
                    iB = B(this.f1105h, iB, iArr, iMin2);
                }
            }
            if (N(this.f1098a)) {
                if (z12) {
                    iB = B(this.f1098a, iB, iArr, iMin2);
                } else {
                    iC = C(this.f1098a, iC, iArr, iMin2);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iB);
            iArr[1] = Math.max(0, currentContentInsetRight - (i33 - iC));
            iMax = Math.max(iB, currentContentInsetLeft);
            iMin = Math.min(iC, i33 - currentContentInsetRight);
            if (N(this.f1106i)) {
                if (z12) {
                    iMin = C(this.f1106i, iMin, iArr, iMin2);
                } else {
                    iMax = B(this.f1106i, iMax, iArr, iMin2);
                }
            }
            if (N(this.f1102e)) {
                if (z12) {
                    iMin = C(this.f1102e, iMin, iArr, iMin2);
                } else {
                    iMax = B(this.f1102e, iMax, iArr, iMin2);
                }
            }
            zN = N(this.f1099b);
            zN2 = N(this.f1100c);
            if (zN) {
                e eVar3 = (e) this.f1099b.getLayoutParams();
                measuredHeight = ((ViewGroup.MarginLayoutParams) eVar3).topMargin + this.f1099b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin + 0;
            } else {
                measuredHeight = 0;
            }
            if (zN2) {
                e eVar4 = (e) this.f1100c.getLayoutParams();
                measuredHeight += ((ViewGroup.MarginLayoutParams) eVar4).topMargin + this.f1100c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar4).bottomMargin;
            }
            if (!zN || zN2) {
                if (zN) {
                    textView = this.f1099b;
                } else {
                    textView = this.f1100c;
                }
                if (zN2) {
                    textView2 = this.f1100c;
                } else {
                    textView2 = this.f1099b;
                }
                eVar = (e) textView.getLayoutParams();
                eVar2 = (e) textView2.getLayoutParams();
                z11 = (!zN && this.f1099b.getMeasuredWidth() > 0) || (zN2 && this.f1100c.getMeasuredWidth() > 0);
                i14 = this.f1120w & 112;
                i15 = paddingLeft;
                if (i14 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + this.f1115r;
                } else if (i14 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    i23 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                    i24 = this.f1115r;
                    if (iMax2 < i23 + i24) {
                        iMax2 = i23 + i24;
                    } else {
                        i25 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                        i26 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                        i27 = this.f1116s;
                        if (i25 < i26 + i27) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) eVar2).bottomMargin + i27) - i25));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin) - this.f1116s) - measuredHeight;
                }
                if (z12) {
                    if (z11) {
                        i20 = this.f1113p;
                    } else {
                        i20 = 0;
                    }
                    int i34 = i20 - iArr[1];
                    iMin -= Math.max(0, i34);
                    iArr[1] = Math.max(0, -i34);
                    if (zN) {
                        e eVar5 = (e) this.f1099b.getLayoutParams();
                        int measuredWidth = iMin - this.f1099b.getMeasuredWidth();
                        int measuredHeight2 = this.f1099b.getMeasuredHeight() + paddingTop;
                        this.f1099b.layout(measuredWidth, paddingTop, iMin, measuredHeight2);
                        i21 = measuredWidth - this.f1114q;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) eVar5).bottomMargin;
                    } else {
                        i21 = iMin;
                    }
                    if (zN2) {
                        int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e) this.f1100c.getLayoutParams())).topMargin;
                        this.f1100c.layout(iMin - this.f1100c.getMeasuredWidth(), i35, iMin, this.f1100c.getMeasuredHeight() + i35);
                        i22 = iMin - this.f1114q;
                    } else {
                        i22 = iMin;
                    }
                    if (z11) {
                        iMin = Math.min(i21, i22);
                    }
                    iMax = iMax;
                } else {
                    if (z11) {
                        i17 = this.f1113p;
                        i16 = 0;
                    } else {
                        i16 = 0;
                        i17 = 0;
                    }
                    int i36 = i17 - iArr[i16];
                    iMax += Math.max(i16, i36);
                    iArr[i16] = Math.max(i16, -i36);
                    if (zN) {
                        e eVar6 = (e) this.f1099b.getLayoutParams();
                        int measuredWidth2 = this.f1099b.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f1099b.getMeasuredHeight() + paddingTop;
                        this.f1099b.layout(iMax, paddingTop, measuredWidth2, measuredHeight3);
                        i18 = measuredWidth2 + this.f1114q;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) eVar6).bottomMargin;
                    } else {
                        i18 = iMax;
                    }
                    if (zN2) {
                        int i37 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e) this.f1100c.getLayoutParams())).topMargin;
                        int measuredWidth3 = this.f1100c.getMeasuredWidth() + iMax;
                        this.f1100c.layout(iMax, i37, measuredWidth3, this.f1100c.getMeasuredHeight() + i37);
                        i19 = measuredWidth3 + this.f1114q;
                    } else {
                        i19 = iMax;
                    }
                    if (z11) {
                        iMax = Math.max(i18, i19);
                    }
                }
                b(this.D, 3);
                size = this.D.size();
                for (i28 = i16; i28 < size; i28++) {
                    iMax = B(this.D.get(i28), iMax, iArr, iMin2);
                }
                i29 = iMin2;
                b(this.D, 5);
                size2 = this.D.size();
                for (i30 = i16; i30 < size2; i30++) {
                    iMin = C(this.D.get(i30), iMin, iArr, i29);
                }
                b(this.D, 1);
                int iU = u(this.D, iArr);
                i31 = (i15 + (((width - i15) - paddingRight) / 2)) - (iU / 2);
                i32 = iU + i31;
                if (i31 >= iMax) {
                    if (i32 > iMin) {
                        iMax = i31 - (i32 - iMin);
                    } else {
                        iMax = i31;
                    }
                }
                size3 = this.D.size();
                while (i16 < size3) {
                    iMax = B(this.D.get(i16), iMax, iArr, i29);
                    i16++;
                }
                this.D.clear();
            }
            i15 = paddingLeft;
            iMin2 = iMin2;
            i16 = 0;
            b(this.D, 3);
            size = this.D.size();
            while (i28 < size) {
                iMax = B(this.D.get(i28), iMax, iArr, iMin2);
            }
            i29 = iMin2;
            b(this.D, 5);
            size2 = this.D.size();
            while (i30 < size2) {
                iMin = C(this.D.get(i30), iMin, iArr, i29);
            }
            b(this.D, 1);
            int iU2 = u(this.D, iArr);
            i31 = (i15 + (((width - i15) - paddingRight) / 2)) - (iU2 / 2);
            i32 = iU2 + i31;
            if (i31 >= iMax) {
                if (i32 > iMin) {
                    iMax = i31 - (i32 - iMin);
                } else {
                    iMax = i31;
                }
            }
            size3 = this.D.size();
            while (i16 < size3) {
                iMax = B(this.D.get(i16), iMax, iArr, i29);
                i16++;
            }
            this.D.clear();
        }
        iB = paddingLeft;
        iC = i33;
        if (N(this.f1105h)) {
            if (z12) {
                iC = C(this.f1105h, iC, iArr, iMin2);
            } else {
                iB = B(this.f1105h, iB, iArr, iMin2);
            }
        }
        if (N(this.f1098a)) {
            if (z12) {
                iB = B(this.f1098a, iB, iArr, iMin2);
            } else {
                iC = C(this.f1098a, iC, iArr, iMin2);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iB);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i33 - iC));
        iMax = Math.max(iB, currentContentInsetLeft2);
        iMin = Math.min(iC, i33 - currentContentInsetRight2);
        if (N(this.f1106i)) {
            if (z12) {
                iMin = C(this.f1106i, iMin, iArr, iMin2);
            } else {
                iMax = B(this.f1106i, iMax, iArr, iMin2);
            }
        }
        if (N(this.f1102e)) {
            if (z12) {
                iMin = C(this.f1102e, iMin, iArr, iMin2);
            } else {
                iMax = B(this.f1102e, iMax, iArr, iMin2);
            }
        }
        zN = N(this.f1099b);
        zN2 = N(this.f1100c);
        if (zN) {
            e eVar7 = (e) this.f1099b.getLayoutParams();
            measuredHeight = ((ViewGroup.MarginLayoutParams) eVar7).topMargin + this.f1099b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar7).bottomMargin + 0;
        } else {
            measuredHeight = 0;
        }
        if (zN2) {
            e eVar8 = (e) this.f1100c.getLayoutParams();
            measuredHeight += ((ViewGroup.MarginLayoutParams) eVar8).topMargin + this.f1100c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar8).bottomMargin;
        }
        if (zN) {
            if (zN) {
                textView = this.f1099b;
            } else {
                textView = this.f1100c;
            }
            if (zN2) {
                textView2 = this.f1100c;
            } else {
                textView2 = this.f1099b;
            }
            eVar = (e) textView.getLayoutParams();
            eVar2 = (e) textView2.getLayoutParams();
            if (zN) {
            }
            i14 = this.f1120w & 112;
            i15 = paddingLeft;
            if (i14 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + this.f1115r;
            } else if (i14 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i23 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                i24 = this.f1115r;
                if (iMax2 < i23 + i24) {
                    iMax2 = i23 + i24;
                } else {
                    i25 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i26 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                    i27 = this.f1116s;
                    if (i25 < i26 + i27) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) eVar2).bottomMargin + i27) - i25));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin) - this.f1116s) - measuredHeight;
            }
            if (z12) {
                if (z11) {
                    i20 = this.f1113p;
                } else {
                    i20 = 0;
                }
                int i38 = i20 - iArr[1];
                iMin -= Math.max(0, i38);
                iArr[1] = Math.max(0, -i38);
                if (zN) {
                    e eVar9 = (e) this.f1099b.getLayoutParams();
                    int measuredWidth4 = iMin - this.f1099b.getMeasuredWidth();
                    int measuredHeight4 = this.f1099b.getMeasuredHeight() + paddingTop;
                    this.f1099b.layout(measuredWidth4, paddingTop, iMin, measuredHeight4);
                    i21 = measuredWidth4 - this.f1114q;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) eVar9).bottomMargin;
                } else {
                    i21 = iMin;
                }
                if (zN2) {
                    int i39 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e) this.f1100c.getLayoutParams())).topMargin;
                    this.f1100c.layout(iMin - this.f1100c.getMeasuredWidth(), i39, iMin, this.f1100c.getMeasuredHeight() + i39);
                    i22 = iMin - this.f1114q;
                } else {
                    i22 = iMin;
                }
                if (z11) {
                    iMin = Math.min(i21, i22);
                }
                iMax = iMax;
                i16 = 0;
            } else {
                if (z11) {
                    i17 = this.f1113p;
                    i16 = 0;
                } else {
                    i16 = 0;
                    i17 = 0;
                }
                int i310 = i17 - iArr[i16];
                iMax += Math.max(i16, i310);
                iArr[i16] = Math.max(i16, -i310);
                if (zN) {
                    e eVar10 = (e) this.f1099b.getLayoutParams();
                    int measuredWidth5 = this.f1099b.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f1099b.getMeasuredHeight() + paddingTop;
                    this.f1099b.layout(iMax, paddingTop, measuredWidth5, measuredHeight5);
                    i18 = measuredWidth5 + this.f1114q;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) eVar10).bottomMargin;
                } else {
                    i18 = iMax;
                }
                if (zN2) {
                    int i311 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e) this.f1100c.getLayoutParams())).topMargin;
                    int measuredWidth6 = this.f1100c.getMeasuredWidth() + iMax;
                    this.f1100c.layout(iMax, i311, measuredWidth6, this.f1100c.getMeasuredHeight() + i311);
                    i19 = measuredWidth6 + this.f1114q;
                } else {
                    i19 = iMax;
                }
                if (z11) {
                    iMax = Math.max(i18, i19);
                }
            }
        } else {
            if (zN) {
                textView = this.f1099b;
            } else {
                textView = this.f1100c;
            }
            if (zN2) {
                textView2 = this.f1100c;
            } else {
                textView2 = this.f1099b;
            }
            eVar = (e) textView.getLayoutParams();
            eVar2 = (e) textView2.getLayoutParams();
            if (zN) {
            }
            i14 = this.f1120w & 112;
            i15 = paddingLeft;
            if (i14 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + this.f1115r;
            } else if (i14 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i23 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                i24 = this.f1115r;
                if (iMax2 < i23 + i24) {
                    iMax2 = i23 + i24;
                } else {
                    i25 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i26 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                    i27 = this.f1116s;
                    if (i25 < i26 + i27) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) eVar2).bottomMargin + i27) - i25));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin) - this.f1116s) - measuredHeight;
            }
            if (z12) {
                if (z11) {
                    i20 = this.f1113p;
                } else {
                    i20 = 0;
                }
                int i312 = i20 - iArr[1];
                iMin -= Math.max(0, i312);
                iArr[1] = Math.max(0, -i312);
                if (zN) {
                    e eVar11 = (e) this.f1099b.getLayoutParams();
                    int measuredWidth7 = iMin - this.f1099b.getMeasuredWidth();
                    int measuredHeight6 = this.f1099b.getMeasuredHeight() + paddingTop;
                    this.f1099b.layout(measuredWidth7, paddingTop, iMin, measuredHeight6);
                    i21 = measuredWidth7 - this.f1114q;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) eVar11).bottomMargin;
                } else {
                    i21 = iMin;
                }
                if (zN2) {
                    int i313 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e) this.f1100c.getLayoutParams())).topMargin;
                    this.f1100c.layout(iMin - this.f1100c.getMeasuredWidth(), i313, iMin, this.f1100c.getMeasuredHeight() + i313);
                    i22 = iMin - this.f1114q;
                } else {
                    i22 = iMin;
                }
                if (z11) {
                    iMin = Math.min(i21, i22);
                }
                iMax = iMax;
                i16 = 0;
            } else {
                if (z11) {
                    i17 = this.f1113p;
                    i16 = 0;
                } else {
                    i16 = 0;
                    i17 = 0;
                }
                int i314 = i17 - iArr[i16];
                iMax += Math.max(i16, i314);
                iArr[i16] = Math.max(i16, -i314);
                if (zN) {
                    e eVar12 = (e) this.f1099b.getLayoutParams();
                    int measuredWidth8 = this.f1099b.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f1099b.getMeasuredHeight() + paddingTop;
                    this.f1099b.layout(iMax, paddingTop, measuredWidth8, measuredHeight7);
                    i18 = measuredWidth8 + this.f1114q;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) eVar12).bottomMargin;
                } else {
                    i18 = iMax;
                }
                if (zN2) {
                    int i315 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e) this.f1100c.getLayoutParams())).topMargin;
                    int measuredWidth9 = this.f1100c.getMeasuredWidth() + iMax;
                    this.f1100c.layout(iMax, i315, measuredWidth9, this.f1100c.getMeasuredHeight() + i315);
                    i19 = measuredWidth9 + this.f1114q;
                } else {
                    i19 = iMax;
                }
                if (z11) {
                    iMax = Math.max(i18, i19);
                }
            }
        }
        b(this.D, 3);
        size = this.D.size();
        while (i28 < size) {
            iMax = B(this.D.get(i28), iMax, iArr, iMin2);
        }
        i29 = iMin2;
        b(this.D, 5);
        size2 = this.D.size();
        while (i30 < size2) {
            iMin = C(this.D.get(i30), iMin, iArr, i29);
        }
        b(this.D, 1);
        int iU3 = u(this.D, iArr);
        i31 = (i15 + (((width - i15) - paddingRight) / 2)) - (iU3 / 2);
        i32 = iU3 + i31;
        if (i31 >= iMax) {
            if (i32 > iMin) {
                iMax = i31 - (i32 - iMin);
            } else {
                iMax = i31;
            }
        }
        size3 = this.D.size();
        while (i16 < size3) {
            iMax = B(this.D.get(i16), iMax, iArr, i29);
            i16++;
        }
        this.D.clear();
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int measuredHeight;
        int iCombineMeasuredStates2;
        int iMax2;
        int[] iArr = this.F;
        boolean zB = o1.b(this);
        int i12 = !zB ? 1 : 0;
        if (N(this.f1101d)) {
            E(this.f1101d, i10, 0, i11, 0, this.f1112o);
            measuredWidth = this.f1101d.getMeasuredWidth() + s(this.f1101d);
            iMax = Math.max(0, this.f1101d.getMeasuredHeight() + t(this.f1101d));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f1101d.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (N(this.f1105h)) {
            E(this.f1105h, i10, 0, i11, 0, this.f1112o);
            measuredWidth = this.f1105h.getMeasuredWidth() + s(this.f1105h);
            iMax = Math.max(iMax, this.f1105h.getMeasuredHeight() + t(this.f1105h));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1105h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = 0 + Math.max(currentContentInsetStart, measuredWidth);
        iArr[zB ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (N(this.f1098a)) {
            E(this.f1098a, i10, iMax3, i11, 0, this.f1112o);
            measuredWidth2 = this.f1098a.getMeasuredWidth() + s(this.f1098a);
            iMax = Math.max(iMax, this.f1098a.getMeasuredHeight() + t(this.f1098a));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1098a.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr[i12] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (N(this.f1106i)) {
            iMax4 += D(this.f1106i, i10, iMax4, i11, 0, iArr);
            iMax = Math.max(iMax, this.f1106i.getMeasuredHeight() + t(this.f1106i));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1106i.getMeasuredState());
        }
        if (N(this.f1102e)) {
            iMax4 += D(this.f1102e, i10, iMax4, i11, 0, iArr);
            iMax = Math.max(iMax, this.f1102e.getMeasuredHeight() + t(this.f1102e));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1102e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((e) childAt.getLayoutParams()).f1130b == 0 && N(childAt)) {
                iMax4 += D(childAt, i10, iMax4, i11, 0, iArr);
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + t(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i14 = this.f1115r + this.f1116s;
        int i15 = this.f1113p + this.f1114q;
        if (N(this.f1099b)) {
            D(this.f1099b, i10, iMax4 + i15, i11, i14, iArr);
            int measuredWidth3 = this.f1099b.getMeasuredWidth() + s(this.f1099b);
            measuredHeight = this.f1099b.getMeasuredHeight() + t(this.f1099b);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f1099b.getMeasuredState());
            iMax2 = measuredWidth3;
        } else {
            measuredHeight = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (N(this.f1100c)) {
            iMax2 = Math.max(iMax2, D(this.f1100c, i10, iMax4 + i15, i11, measuredHeight + i14, iArr));
            measuredHeight += this.f1100c.getMeasuredHeight() + t(this.f1100c);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f1100c.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax4 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, (-16777216) & iCombineMeasuredStates2), M() ? 0 : View.resolveSizeAndState(Math.max(Math.max(iMax, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        ActionMenuView actionMenuView = this.f1098a;
        androidx.appcompat.view.menu.e eVarJ = actionMenuView != null ? actionMenuView.J() : null;
        int i10 = gVar.f1131c;
        if (i10 != 0 && this.K != null && eVarJ != null && (menuItemFindItem = eVarJ.findItem(i10)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (gVar.f1132d) {
            F();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        h();
        this.f1117t.f(i10 == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        g gVar2 = new g(super.onSaveInstanceState());
        d dVar = this.K;
        if (dVar != null && (gVar = dVar.f1128b) != null) {
            gVar2.f1131c = gVar.getItemId();
        }
        gVar2.f1132d = A();
        return gVar2;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.B = false;
        }
        if (!this.B) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.B = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(h.a.b(getContext(), i10));
    }

    public void setCollapsible(boolean z10) {
        this.N = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f1119v) {
            this.f1119v = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f1118u) {
            this.f1118u = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(h.a.b(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(h.a.b(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f1101d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.G = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f1098a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f1108k != i10) {
            this.f1108k = i10;
            if (i10 == 0) {
                this.f1107j = getContext();
            } else {
                this.f1107j = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMarginBottom(int i10) {
        this.f1116s = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f1114q = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f1113p = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f1115r = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public boolean v() {
        d dVar = this.K;
        return (dVar == null || dVar.f1128b == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f1098a;
        return actionMenuView != null && actionMenuView.D();
    }

    public void x(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public boolean z() {
        ActionMenuView actionMenuView = this.f1098a;
        return actionMenuView != null && actionMenuView.E();
    }

    public static class e extends androidx.appcompat.app.a.C0014a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f1130b;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1130b = 0;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public e(int i10, int i11) {
            super(i10, i11);
            this.f1130b = 0;
            this.f626a = 8388627;
        }

        public e(e eVar) {
            super((androidx.appcompat.app.a.C0014a) eVar);
            this.f1130b = 0;
            this.f1130b = eVar.f1130b;
        }

        public e(androidx.appcompat.app.a.C0014a c0014a) {
            super(c0014a);
            this.f1130b = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1130b = 0;
            a(marginLayoutParams);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1130b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1120w = 8388627;
        this.D = new ArrayList<>();
        this.E = new ArrayList<>();
        this.F = new int[2];
        this.H = new a();
        this.O = new b();
        h1 h1VarT = h1.t(getContext(), attributeSet, g.j.T2, i10, 0);
        this.f1109l = h1VarT.m(g.j.f15220v3, 0);
        this.f1110m = h1VarT.m(g.j.f15175m3, 0);
        this.f1120w = h1VarT.k(g.j.U2, this.f1120w);
        this.f1111n = h1VarT.k(g.j.V2, 48);
        int iD = h1VarT.d(g.j.f15190p3, 0);
        int i11 = g.j.f15215u3;
        iD = h1VarT.q(i11) ? h1VarT.d(i11, iD) : iD;
        this.f1116s = iD;
        this.f1115r = iD;
        this.f1114q = iD;
        this.f1113p = iD;
        int iD2 = h1VarT.d(g.j.f15205s3, -1);
        if (iD2 >= 0) {
            this.f1113p = iD2;
        }
        int iD3 = h1VarT.d(g.j.f15200r3, -1);
        if (iD3 >= 0) {
            this.f1114q = iD3;
        }
        int iD4 = h1VarT.d(g.j.f15210t3, -1);
        if (iD4 >= 0) {
            this.f1115r = iD4;
        }
        int iD5 = h1VarT.d(g.j.f15195q3, -1);
        if (iD5 >= 0) {
            this.f1116s = iD5;
        }
        this.f1112o = h1VarT.e(g.j.f15145g3, -1);
        int iD6 = h1VarT.d(g.j.f15125c3, Integer.MIN_VALUE);
        int iD7 = h1VarT.d(g.j.Y2, Integer.MIN_VALUE);
        int iE = h1VarT.e(g.j.f15115a3, 0);
        int iE2 = h1VarT.e(g.j.f15120b3, 0);
        h();
        this.f1117t.e(iE, iE2);
        if (iD6 != Integer.MIN_VALUE || iD7 != Integer.MIN_VALUE) {
            this.f1117t.g(iD6, iD7);
        }
        this.f1118u = h1VarT.d(g.j.f15130d3, Integer.MIN_VALUE);
        this.f1119v = h1VarT.d(g.j.Z2, Integer.MIN_VALUE);
        this.f1103f = h1VarT.f(g.j.X2);
        this.f1104g = h1VarT.o(g.j.W2);
        CharSequence charSequenceO = h1VarT.o(g.j.f15185o3);
        if (!TextUtils.isEmpty(charSequenceO)) {
            setTitle(charSequenceO);
        }
        CharSequence charSequenceO2 = h1VarT.o(g.j.f15170l3);
        if (!TextUtils.isEmpty(charSequenceO2)) {
            setSubtitle(charSequenceO2);
        }
        this.f1107j = getContext();
        setPopupTheme(h1VarT.m(g.j.f15165k3, 0));
        Drawable drawableF = h1VarT.f(g.j.f15160j3);
        if (drawableF != null) {
            setNavigationIcon(drawableF);
        }
        CharSequence charSequenceO3 = h1VarT.o(g.j.f15155i3);
        if (!TextUtils.isEmpty(charSequenceO3)) {
            setNavigationContentDescription(charSequenceO3);
        }
        Drawable drawableF2 = h1VarT.f(g.j.f15135e3);
        if (drawableF2 != null) {
            setLogo(drawableF2);
        }
        CharSequence charSequenceO4 = h1VarT.o(g.j.f15140f3);
        if (!TextUtils.isEmpty(charSequenceO4)) {
            setLogoDescription(charSequenceO4);
        }
        int i12 = g.j.f15225w3;
        if (h1VarT.q(i12)) {
            setTitleTextColor(h1VarT.c(i12));
        }
        int i13 = g.j.f15180n3;
        if (h1VarT.q(i13)) {
            setSubtitleTextColor(h1VarT.c(i13));
        }
        int i14 = g.j.f15150h3;
        if (h1VarT.q(i14)) {
            x(h1VarT.m(i14, 0));
        }
        h1VarT.u();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f1105h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f1105h.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f1105h;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f1103f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!y(this.f1102e)) {
                c(this.f1102e, true);
            }
        } else {
            ImageView imageView = this.f1102e;
            if (imageView != null && y(imageView)) {
                removeView(this.f1102e);
                this.E.remove(this.f1102e);
            }
        }
        ImageView imageView2 = this.f1102e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f1102e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f1101d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!y(this.f1101d)) {
                c(this.f1101d, true);
            }
        } else {
            ImageButton imageButton = this.f1101d;
            if (imageButton != null && y(imageButton)) {
                removeView(this.f1101d);
                this.E.remove(this.f1101d);
            }
        }
        ImageButton imageButton2 = this.f1101d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1100c;
            if (textView != null && y(textView)) {
                removeView(this.f1100c);
                this.E.remove(this.f1100c);
            }
        } else {
            if (this.f1100c == null) {
                Context context = getContext();
                f0 f0Var = new f0(context);
                this.f1100c = f0Var;
                f0Var.setSingleLine();
                this.f1100c.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1110m;
                if (i10 != 0) {
                    this.f1100c.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f1100c.setTextColor(colorStateList);
                }
            }
            if (!y(this.f1100c)) {
                c(this.f1100c, true);
            }
        }
        TextView textView2 = this.f1100c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1122y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f1100c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1099b;
            if (textView != null && y(textView)) {
                removeView(this.f1099b);
                this.E.remove(this.f1099b);
            }
        } else {
            if (this.f1099b == null) {
                Context context = getContext();
                f0 f0Var = new f0(context);
                this.f1099b = f0Var;
                f0Var.setSingleLine();
                this.f1099b.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1109l;
                if (i10 != 0) {
                    this.f1099b.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f1123z;
                if (colorStateList != null) {
                    this.f1099b.setTextColor(colorStateList);
                }
            }
            if (!y(this.f1099b)) {
                c(this.f1099b, true);
            }
        }
        TextView textView2 = this.f1099b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1121x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1123z = colorStateList;
        TextView textView = this.f1099b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class g extends c0.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f1131c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f1132d;

        static class a implements Parcelable.ClassLoaderCreator<g> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i10) {
                return new g[i10];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1131c = parcel.readInt();
            this.f1132d = parcel.readInt() != 0;
        }

        @Override // c0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1131c);
            parcel.writeInt(this.f1132d ? 1 : 0);
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }
    }

    private class d implements androidx.appcompat.view.menu.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        androidx.appcompat.view.menu.e f1127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        androidx.appcompat.view.menu.g f1128b;

        d() {
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean c(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f1105h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1105h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1105h);
            }
            Toolbar.this.f1106i = gVar.getActionView();
            this.f1128b = gVar;
            ViewParent parent2 = Toolbar.this.f1106i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1106i);
                }
                e eVarGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                eVarGenerateDefaultLayoutParams.f626a = (toolbar4.f1111n & 112) | 8388611;
                eVarGenerateDefaultLayoutParams.f1130b = 2;
                toolbar4.f1106i.setLayoutParams(eVarGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1106i);
            }
            Toolbar.this.G();
            Toolbar.this.requestLayout();
            gVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.f1106i;
            if (callback instanceof k.c) {
                ((k.c) callback).onActionViewExpanded();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean e(androidx.appcompat.view.menu.m mVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public void f(boolean z10) {
            if (this.f1128b != null) {
                androidx.appcompat.view.menu.e eVar = this.f1127a;
                boolean z11 = false;
                if (eVar != null) {
                    int size = eVar.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f1127a.getItem(i10) == this.f1128b) {
                            z11 = true;
                            break;
                        }
                    }
                }
                if (z11) {
                    return;
                }
                h(this.f1127a, this.f1128b);
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean g() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean h(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            KeyEvent.Callback callback = Toolbar.this.f1106i;
            if (callback instanceof k.c) {
                ((k.c) callback).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1106i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1105h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1106i = null;
            toolbar3.a();
            this.f1128b = null;
            Toolbar.this.requestLayout();
            gVar.r(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public void i(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f1127a;
            if (eVar2 != null && (gVar = this.f1128b) != null) {
                eVar2.f(gVar);
            }
            this.f1127a = eVar;
        }

        @Override // androidx.appcompat.view.menu.j
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
        }
    }
}
