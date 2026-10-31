package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements k0, androidx.core.view.h0, androidx.core.view.i0 {
    static final int[] B = {g.a.f14979b, R.attr.windowContentOverlay};
    private final androidx.core.view.j0 A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ContentFrameLayout f987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ActionBarContainer f988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private l0 f989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f990f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f991g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f992h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f993i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f994j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f995k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f996l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f997m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Rect f998n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Rect f999o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Rect f1000p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Rect f1001q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Rect f1002r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Rect f1003s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Rect f1004t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private d f1005u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private OverScroller f1006v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    ViewPropertyAnimator f1007w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final AnimatorListenerAdapter f1008x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Runnable f1009y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Runnable f1010z;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1007w = null;
            actionBarOverlayLayout.f995k = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1007w = null;
            actionBarOverlayLayout.f995k = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1007w = actionBarOverlayLayout.f988d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f1008x);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1007w = actionBarOverlayLayout.f988d.animate().translationY(-ActionBarOverlayLayout.this.f988d.getHeight()).setListener(ActionBarOverlayLayout.this.f1008x);
        }
    }

    public interface d {
        void a();

        void b();

        void c(boolean z10);

        void d();

        void e();

        void onWindowVisibilityChanged(int i10);
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i10, int i11) {
            super(i10, i11);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f986b = 0;
        this.f998n = new Rect();
        this.f999o = new Rect();
        this.f1000p = new Rect();
        this.f1001q = new Rect();
        this.f1002r = new Rect();
        this.f1003s = new Rect();
        this.f1004t = new Rect();
        this.f1008x = new a();
        this.f1009y = new b();
        this.f1010z = new c();
        v(context);
        this.A = new androidx.core.view.j0(this);
    }

    private void A() {
        u();
        this.f1009y.run();
    }

    private boolean B(float f10, float f11) {
        this.f1006v.fling(0, 0, 0, (int) f11, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f1006v.getFinalY() > this.f988d.getHeight();
    }

    private void p() {
        u();
        this.f1010z.run();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private boolean q(View view, Rect rect, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        e eVar = (e) view.getLayoutParams();
        if (z10) {
            int i10 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
            int i11 = rect.left;
            if (i10 != i11) {
                ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i11;
                z14 = true;
            } else {
                z14 = false;
            }
        } else {
            z14 = false;
        }
        if (z11) {
            int i12 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
            int i13 = rect.top;
            if (i12 != i13) {
                ((ViewGroup.MarginLayoutParams) eVar).topMargin = i13;
                z14 = true;
            }
        }
        if (z13) {
            int i14 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
            int i15 = rect.right;
            if (i14 != i15) {
                ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i15;
                z14 = true;
            }
        }
        if (z12) {
            int i16 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i17 = rect.bottom;
            if (i16 != i17) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i17;
                return true;
            }
        }
        return z14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private l0 t(View view) {
        if (view instanceof l0) {
            return (l0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void v(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(B);
        this.f985a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f990f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f991g = context.getApplicationInfo().targetSdkVersion < 19;
        this.f1006v = new OverScroller(context);
    }

    private void x() {
        u();
        postDelayed(this.f1010z, 600L);
    }

    private void y() {
        u();
        postDelayed(this.f1009y, 600L);
    }

    @Override // androidx.appcompat.widget.k0
    public boolean a() {
        z();
        return this.f989e.a();
    }

    @Override // androidx.appcompat.widget.k0
    public boolean b() {
        z();
        return this.f989e.b();
    }

    @Override // androidx.appcompat.widget.k0
    public boolean c() {
        z();
        return this.f989e.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.k0
    public void d(Menu menu, androidx.appcompat.view.menu.j.a aVar) {
        z();
        this.f989e.d(menu, aVar);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f990f == null || this.f991g) {
            return;
        }
        int bottom = this.f988d.getVisibility() == 0 ? (int) (this.f988d.getBottom() + this.f988d.getTranslationY() + 0.5f) : 0;
        this.f990f.setBounds(0, bottom, getWidth(), this.f990f.getIntrinsicHeight() + bottom);
        this.f990f.draw(canvas);
    }

    @Override // androidx.appcompat.widget.k0
    public boolean e() {
        z();
        return this.f989e.e();
    }

    @Override // androidx.appcompat.widget.k0
    public void f() {
        z();
        this.f989e.f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        z();
        androidx.core.view.z0.t(this);
        boolean zQ = q(this.f988d, rect, true, true, false, true);
        this.f1001q.set(rect);
        o1.a(this, this.f1001q, this.f998n);
        if (!this.f1002r.equals(this.f1001q)) {
            this.f1002r.set(this.f1001q);
            zQ = true;
        }
        if (!this.f999o.equals(this.f998n)) {
            this.f999o.set(this.f998n);
            zQ = true;
        }
        if (zQ) {
            requestLayout();
        }
        return true;
    }

    @Override // androidx.appcompat.widget.k0
    public boolean g() {
        z();
        return this.f989e.g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f988d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.A.a();
    }

    public CharSequence getTitle() {
        z();
        return this.f989e.getTitle();
    }

    @Override // androidx.appcompat.widget.k0
    public void h(int i10) {
        z();
        if (i10 == 2) {
            this.f989e.o();
        } else if (i10 == 5) {
            this.f989e.w();
        } else {
            if (i10 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.core.view.h0
    public void i(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // androidx.core.view.h0
    public void j(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.core.view.h0
    public void k(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // androidx.appcompat.widget.k0
    public void l() {
        z();
        this.f989e.q();
    }

    @Override // androidx.core.view.i0
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        n(view, i10, i11, i12, i13, i14);
    }

    @Override // androidx.core.view.h0
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // androidx.core.view.h0
    public boolean o(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        androidx.core.view.z0.G(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int measuredHeight;
        z();
        measureChildWithMargins(this.f988d, i10, 0, i11, 0);
        e eVar = (e) this.f988d.getLayoutParams();
        int iMax = Math.max(0, this.f988d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.f988d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f988d.getMeasuredState());
        boolean z10 = (androidx.core.view.z0.t(this) & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0;
        if (z10) {
            measuredHeight = this.f985a;
            if (this.f993i && this.f988d.getTabContainer() != null) {
                measuredHeight += this.f985a;
            }
        } else {
            measuredHeight = this.f988d.getVisibility() != 8 ? this.f988d.getMeasuredHeight() : 0;
        }
        this.f1000p.set(this.f998n);
        this.f1003s.set(this.f1001q);
        if (this.f992h || z10) {
            Rect rect = this.f1003s;
            rect.top += measuredHeight;
            rect.bottom += 0;
        } else {
            Rect rect2 = this.f1000p;
            rect2.top += measuredHeight;
            rect2.bottom += 0;
        }
        q(this.f987c, this.f1000p, true, true, true, true);
        if (!this.f1004t.equals(this.f1003s)) {
            this.f1004t.set(this.f1003s);
            this.f987c.a(this.f1003s);
        }
        measureChildWithMargins(this.f987c, i10, 0, i11, 0);
        e eVar2 = (e) this.f987c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f987c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f987c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f987c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.f994j || !z10) {
            return false;
        }
        if (B(f10, f11)) {
            p();
        } else {
            A();
        }
        this.f995k = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f996l + i11;
        this.f996l = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.A.b(view, view2, i10);
        this.f996l = getActionBarHideOffset();
        u();
        d dVar = this.f1005u;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f988d.getVisibility() != 0) {
            return false;
        }
        return this.f994j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f994j && !this.f995k) {
            if (this.f996l <= this.f988d.getHeight()) {
                y();
            } else {
                x();
            }
        }
        d dVar = this.f1005u;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        z();
        int i11 = this.f997m ^ i10;
        this.f997m = i10;
        boolean z10 = (i10 & 4) == 0;
        boolean z11 = (i10 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0;
        d dVar = this.f1005u;
        if (dVar != null) {
            dVar.c(!z11);
            if (z10 || !z11) {
                this.f1005u.a();
            } else {
                this.f1005u.d();
            }
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0 || this.f1005u == null) {
            return;
        }
        androidx.core.view.z0.G(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f986b = i10;
        d dVar = this.f1005u;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i10) {
        u();
        this.f988d.setTranslationY(-Math.max(0, Math.min(i10, this.f988d.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f1005u = dVar;
        if (getWindowToken() != null) {
            this.f1005u.onWindowVisibilityChanged(this.f986b);
            int i10 = this.f997m;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                androidx.core.view.z0.G(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f993i = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f994j) {
            this.f994j = z10;
            if (z10) {
                return;
            }
            u();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i10) {
        z();
        this.f989e.setIcon(i10);
    }

    public void setLogo(int i10) {
        z();
        this.f989e.s(i10);
    }

    public void setOverlayMode(boolean z10) {
        this.f992h = z10;
        this.f991g = z10 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    @Override // androidx.appcompat.widget.k0
    public void setWindowCallback(Window.Callback callback) {
        z();
        this.f989e.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.k0
    public void setWindowTitle(CharSequence charSequence) {
        z();
        this.f989e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    void u() {
        removeCallbacks(this.f1009y);
        removeCallbacks(this.f1010z);
        ViewPropertyAnimator viewPropertyAnimator = this.f1007w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean w() {
        return this.f992h;
    }

    void z() {
        if (this.f987c == null) {
            this.f987c = (ContentFrameLayout) findViewById(g.f.f15051b);
            this.f988d = (ActionBarContainer) findViewById(g.f.f15052c);
            this.f989e = t(findViewById(g.f.f15050a));
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        z();
        this.f989e.setIcon(drawable);
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }
}
