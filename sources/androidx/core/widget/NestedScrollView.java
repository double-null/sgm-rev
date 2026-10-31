package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.f0;
import androidx.core.view.g0;
import androidx.core.view.i0;
import androidx.core.view.j0;
import androidx.core.view.n0;
import androidx.core.view.z0;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import x.p;
import x.w;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements i0, n0 {
    private static final float D = (float) (Math.log(0.78d) / Math.log(0.9d));
    private static final a E = new a();
    private static final int[] F = {R.attr.fillViewport};
    private d A;
    final c B;
    androidx.core.view.e C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f2017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f2018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f2019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private OverScroller f2020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EdgeEffect f2021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EdgeEffect f2022f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f2023g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f2024h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f2025i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private View f2026j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f2027k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private VelocityTracker f2028l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f2029m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f2030n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f2031o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f2032p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f2033q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f2034r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int[] f2035s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int[] f2036t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f2037u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f2038v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private e f2039w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final j0 f2040x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final g0 f2041y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f2042z;

    static class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            w.a(accessibilityEvent, nestedScrollView.getScrollX());
            w.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.a
        public void g(View view, p pVar) {
            int scrollRange;
            super.g(view, pVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            pVar.W(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            pVar.c0(true);
            if (nestedScrollView.getScrollY() > 0) {
                pVar.b(p.a.f27918q);
                pVar.b(p.a.B);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                pVar.b(p.a.f27917p);
                pVar.b(p.a.D);
            }
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (super.j(view, i10, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i10 != 4096) {
                if (i10 == 8192 || i10 == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.W(0, iMax, true);
                    return true;
                }
                if (i10 != 16908346) {
                    return false;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.W(0, iMin, true);
            return true;
        }
    }

    static class b {
        static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    class c implements androidx.core.view.f {
        c() {
        }

        @Override // androidx.core.view.f
        public boolean a(float f10) {
            if (f10 == 0.0f) {
                return false;
            }
            c();
            NestedScrollView.this.v((int) f10);
            return true;
        }

        @Override // androidx.core.view.f
        public float b() {
            return -NestedScrollView.this.getVerticalScrollFactorCompat();
        }

        @Override // androidx.core.view.f
        public void c() {
            NestedScrollView.this.f2020d.abortAnimation();
        }
    }

    public interface d {
        void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13);
    }

    static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2044a;

        class a implements Parcelable.Creator<e> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i10) {
                return new e[i10];
            }
        }

        e(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f2044a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f2044a);
        }

        e(Parcel parcel) {
            super(parcel);
            this.f2044a = parcel.readInt();
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, r.a.f24796a);
    }

    private void A() {
        VelocityTracker velocityTracker = this.f2028l;
        if (velocityTracker == null) {
            this.f2028l = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void B() {
        this.f2020d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f2031o = viewConfiguration.getScaledTouchSlop();
        this.f2032p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2033q = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void C() {
        if (this.f2028l == null) {
            this.f2028l = VelocityTracker.obtain();
        }
    }

    private void D(int i10, int i11) {
        this.f2023g = i10;
        this.f2034r = i11;
        X(2, 0);
    }

    private boolean E(View view) {
        return !G(view, 0, getHeight());
    }

    private static boolean F(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && F((View) parent, view2);
    }

    private boolean G(View view, int i10, int i11) {
        view.getDrawingRect(this.f2019c);
        offsetDescendantRectToMyCoords(view, this.f2019c);
        return this.f2019c.bottom + i10 >= getScrollY() && this.f2019c.top - i10 <= getScrollY() + i11;
    }

    private void H(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f2041y.e(0, scrollY2, 0, i10 - scrollY2, null, i11, iArr);
    }

    private void I(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2034r) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f2023g = (int) motionEvent.getY(i10);
            this.f2034r = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f2028l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void L() {
        VelocityTracker velocityTracker = this.f2028l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2028l = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    private int M(int i10, float f10) {
        float fD;
        int iRound;
        float width = f10 / getWidth();
        float height = i10 / getHeight();
        float f11 = 0.0f;
        if (androidx.core.widget.d.b(this.f2021e) == 0.0f) {
            if (androidx.core.widget.d.b(this.f2022f) != 0.0f) {
                fD = androidx.core.widget.d.d(this.f2022f, height, 1.0f - width);
                if (androidx.core.widget.d.b(this.f2022f) == 0.0f) {
                    this.f2022f.onRelease();
                }
            }
            iRound = Math.round(f11 * getHeight());
            if (iRound != 0) {
                invalidate();
            }
            return iRound;
        }
        fD = -androidx.core.widget.d.d(this.f2021e, -height, width);
        if (androidx.core.widget.d.b(this.f2021e) == 0.0f) {
            this.f2021e.onRelease();
        }
        f11 = fD;
        iRound = Math.round(f11 * getHeight());
        if (iRound != 0) {
            invalidate();
        }
        return iRound;
    }

    private void N(boolean z10) {
        if (z10) {
            X(2, 1);
        } else {
            Z(1);
        }
        this.f2038v = getScrollY();
        postInvalidateOnAnimation();
    }

    private boolean O(int i10, int i11, int i12) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        boolean z10 = false;
        boolean z11 = i10 == 33;
        View viewU = u(z11, i11, i12);
        if (viewU == null) {
            viewU = this;
        }
        if (i11 < scrollY || i12 > i13) {
            P(z11 ? i11 - scrollY : i12 - i13, 0, 1, true);
            z10 = true;
        }
        if (viewU != findFocus()) {
            viewU.requestFocus(i10);
        }
        return z10;
    }

    private int P(int i10, int i11, int i12, boolean z10) {
        int i13;
        int i14;
        VelocityTracker velocityTracker;
        if (i12 == 1) {
            X(2, i12);
        }
        boolean z11 = false;
        if (l(0, i10, this.f2036t, this.f2035s, i12)) {
            i13 = i10 - this.f2036t[1];
            i14 = this.f2035s[1] + 0;
        } else {
            i13 = i10;
            i14 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z12 = d() && !z10;
        boolean z13 = J(0, i13, 0, scrollY, 0, scrollRange, 0, 0, true) && !y(i12);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.f2036t;
        iArr[1] = 0;
        p(0, scrollY2, 0, i13 - scrollY2, this.f2035s, i12, iArr);
        int i15 = i14 + this.f2035s[1];
        int i16 = i13 - this.f2036t[1];
        int i17 = scrollY + i16;
        if (i17 < 0) {
            if (z12) {
                androidx.core.widget.d.d(this.f2021e, (-i16) / getHeight(), i11 / getWidth());
                if (!this.f2022f.isFinished()) {
                    this.f2022f.onRelease();
                }
            }
        } else if (i17 > scrollRange && z12) {
            androidx.core.widget.d.d(this.f2022f, i16 / getHeight(), 1.0f - (i11 / getWidth()));
            if (!this.f2021e.isFinished()) {
                this.f2021e.onRelease();
            }
        }
        if (this.f2021e.isFinished() && this.f2022f.isFinished()) {
            z11 = z13;
        } else {
            postInvalidateOnAnimation();
        }
        if (z11 && i12 == 0 && (velocityTracker = this.f2028l) != null) {
            velocityTracker.clear();
        }
        if (i12 == 1) {
            Z(i12);
            this.f2021e.onRelease();
            this.f2022f.onRelease();
        }
        return i15;
    }

    private void Q(View view) {
        view.getDrawingRect(this.f2019c);
        offsetDescendantRectToMyCoords(view, this.f2019c);
        int iG = g(this.f2019c);
        if (iG != 0) {
            scrollBy(0, iG);
        }
    }

    private boolean R(Rect rect, boolean z10) {
        int iG = g(rect);
        boolean z11 = iG != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, iG);
            } else {
                T(0, iG);
            }
        }
        return z11;
    }

    private boolean S(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        return x(-i10) < androidx.core.widget.d.b(edgeEffect) * ((float) getHeight());
    }

    private void U(int i10, int i11, int i12, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f2018b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f2020d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, height - height2))) - scrollY, i12);
            N(z10);
        } else {
            if (!this.f2020d.isFinished()) {
                a();
            }
            scrollBy(i10, i11);
        }
        this.f2018b = AnimationUtils.currentAnimationTimeMillis();
    }

    private boolean Y(MotionEvent motionEvent) {
        boolean z10;
        if (androidx.core.widget.d.b(this.f2021e) != 0.0f) {
            androidx.core.widget.d.d(this.f2021e, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        } else {
            z10 = false;
        }
        if (androidx.core.widget.d.b(this.f2022f) == 0.0f) {
            return z10;
        }
        androidx.core.widget.d.d(this.f2022f, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void a() {
        this.f2020d.abortAnimation();
        Z(1);
    }

    private boolean d() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    private boolean e() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private static int f(int i10, int i11, int i12) {
        if (i11 >= i12 || i10 < 0) {
            return 0;
        }
        return i11 + i10 > i12 ? i12 - i11 : i10;
    }

    private void q(int i10) {
        if (i10 != 0) {
            if (this.f2030n) {
                T(0, i10);
            } else {
                scrollBy(0, i10);
            }
        }
    }

    private boolean r(int i10) {
        if (androidx.core.widget.d.b(this.f2021e) != 0.0f) {
            if (S(this.f2021e, i10)) {
                this.f2021e.onAbsorb(i10);
            } else {
                v(-i10);
            }
        } else {
            if (androidx.core.widget.d.b(this.f2022f) == 0.0f) {
                return false;
            }
            int i11 = -i10;
            if (S(this.f2022f, i11)) {
                this.f2022f.onAbsorb(i11);
            } else {
                v(i11);
            }
        }
        return true;
    }

    private void s() {
        this.f2034r = -1;
        this.f2027k = false;
        L();
        Z(0);
        this.f2021e.onRelease();
        this.f2022f.onRelease();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    private View u(boolean z10, int i10, int i11) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z11 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view2 = focusables.get(i12);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i10 < bottom && top < i11) {
                boolean z12 = i10 < top && bottom < i11;
                if (view == null) {
                    view = view2;
                    z11 = z12;
                } else {
                    boolean z13 = (z10 && top < view.getTop()) || (!z10 && bottom > view.getBottom());
                    if (z11) {
                        if (z12 && z13) {
                            view = view2;
                        }
                    } else if (z12) {
                        view = view2;
                        z11 = true;
                    } else if (z13) {
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    private float x(int i10) {
        double dLog = Math.log((Math.abs(i10) * 0.35f) / (this.f2017a * 0.015f));
        float f10 = D;
        return (float) (((double) (this.f2017a * 0.015f)) * Math.exp((((double) f10) / (((double) f10) - 1.0d)) * dLog));
    }

    private boolean z(int i10, int i11) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i11 >= childAt.getTop() - scrollY && i11 < childAt.getBottom() - scrollY && i10 >= childAt.getLeft() && i10 < childAt.getRight();
    }

    boolean J(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
        boolean z11;
        boolean z12;
        int overScrollMode = getOverScrollMode();
        boolean z13 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z14 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z15 = overScrollMode == 0 || (overScrollMode == 1 && z13);
        boolean z16 = overScrollMode == 0 || (overScrollMode == 1 && z14);
        int i18 = i12 + i10;
        int i19 = !z15 ? 0 : i16;
        int i20 = i13 + i11;
        int i21 = !z16 ? 0 : i17;
        int i22 = -i19;
        int i23 = i19 + i14;
        int i24 = -i21;
        int i25 = i21 + i15;
        if (i18 > i23) {
            i18 = i23;
            z11 = true;
        } else if (i18 < i22) {
            z11 = true;
            i18 = i22;
        } else {
            z11 = false;
        }
        if (i20 > i25) {
            i20 = i25;
            z12 = true;
        } else if (i20 < i24) {
            z12 = true;
            i20 = i24;
        } else {
            z12 = false;
        }
        if (z12 && !y(1)) {
            this.f2020d.springBack(i18, i20, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i18, i20, z11, z12);
        return z11 || z12;
    }

    public boolean K(int i10) {
        boolean z10 = i10 == 130;
        int height = getHeight();
        if (z10) {
            this.f2019c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f2019c;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f2019c.top = getScrollY() - height;
            Rect rect2 = this.f2019c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f2019c;
        int i11 = rect3.top;
        int i12 = height + i11;
        rect3.bottom = i12;
        return O(i10, i11, i12);
    }

    public final void T(int i10, int i11) {
        U(i10, i11, 250, false);
    }

    void V(int i10, int i11, int i12, boolean z10) {
        U(i10 - getScrollX(), i11 - getScrollY(), i12, z10);
    }

    void W(int i10, int i11, boolean z10) {
        V(i10, i11, 250, z10);
    }

    public boolean X(int i10, int i11) {
        return this.f2041y.q(i10, i11);
    }

    public void Z(int i10) {
        this.f2041y.s(i10);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public boolean c(int i10) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !G(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            P(maxScrollAmount, 0, 1, true);
        } else {
            viewFindNextFocus.getDrawingRect(this.f2019c);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f2019c);
            P(g(this.f2019c), 0, 1, true);
            viewFindNextFocus.requestFocus(i10);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && E(viewFindFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f2020d.isFinished()) {
            return;
        }
        this.f2020d.computeScrollOffset();
        int currY = this.f2020d.getCurrY();
        int iH = h(currY - this.f2038v);
        this.f2038v = currY;
        int[] iArr = this.f2036t;
        boolean z10 = false;
        iArr[1] = 0;
        l(0, iH, iArr, null, 1);
        int i10 = iH - this.f2036t[1];
        int scrollRange = getScrollRange();
        if (i10 != 0) {
            int scrollY = getScrollY();
            J(0, i10, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i11 = i10 - scrollY2;
            int[] iArr2 = this.f2036t;
            iArr2[1] = 0;
            p(0, scrollY2, 0, i11, this.f2035s, 1, iArr2);
            i10 = i11 - this.f2036t[1];
        }
        if (i10 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z10 = true;
            }
            if (z10) {
                if (i10 < 0) {
                    if (this.f2021e.isFinished()) {
                        this.f2021e.onAbsorb((int) this.f2020d.getCurrVelocity());
                    }
                } else if (this.f2022f.isFinished()) {
                    this.f2022f.onAbsorb((int) this.f2020d.getCurrVelocity());
                }
            }
            a();
        }
        if (this.f2020d.isFinished()) {
            Z(1);
        } else {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || t(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f2041y.a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f2041y.b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return l(i10, i11, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f2041y.f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.f2021e.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft() + 0;
            } else {
                paddingLeft = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            this.f2021e.setSize(width, height);
            if (this.f2021e.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        if (this.f2022f.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (b.a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            paddingLeft2 = 0 + getPaddingLeft();
        }
        if (b.a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f2022f.setSize(width2, height2);
        if (this.f2022f.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    protected int g(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i11 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i10 - verticalFadingEdgeLength : i10;
        int i12 = rect.bottom;
        if (i12 > i11 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i11) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        }
        if (rect.top >= scrollY || i12 >= i11) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i11 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f2040x.a();
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    float getVerticalScrollFactorCompat() {
        if (this.f2042z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f2042z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f2042z;
    }

    int h(int i10) {
        int height = getHeight();
        if (i10 > 0 && androidx.core.widget.d.b(this.f2021e) != 0.0f) {
            int iRound = Math.round(((-height) / 4.0f) * androidx.core.widget.d.d(this.f2021e, ((-i10) * 4.0f) / height, 0.5f));
            if (iRound != i10) {
                this.f2021e.finish();
            }
            return i10 - iRound;
        }
        if (i10 >= 0 || androidx.core.widget.d.b(this.f2022f) == 0.0f) {
            return i10;
        }
        float f10 = height;
        int iRound2 = Math.round((f10 / 4.0f) * androidx.core.widget.d.d(this.f2022f, (i10 * 4.0f) / f10, 0.5f));
        if (iRound2 != i10) {
            this.f2022f.finish();
        }
        return i10 - iRound2;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return y(0);
    }

    @Override // androidx.core.view.h0
    public void i(View view, View view2, int i10, int i11) {
        this.f2040x.c(view, view2, i10, i11);
        X(2, i11);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f2041y.m();
    }

    @Override // androidx.core.view.h0
    public void j(View view, int i10) {
        this.f2040x.d(view, i10);
        Z(i10);
    }

    @Override // androidx.core.view.h0
    public void k(View view, int i10, int i11, int[] iArr, int i12) {
        l(i10, i11, iArr, null, i12);
    }

    public boolean l(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return this.f2041y.d(i10, i11, iArr, iArr2, i12);
    }

    @Override // androidx.core.view.i0
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        H(i13, i14, iArr);
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i10, int i11) {
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // androidx.core.view.h0
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        H(i13, i14, null);
    }

    @Override // androidx.core.view.h0
    public boolean o(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2025i = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i10;
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.f2027k) {
            if (f0.a(motionEvent, 2)) {
                i10 = 9;
                axisValue = motionEvent.getAxisValue(9);
                width = (int) motionEvent.getX();
            } else if (f0.a(motionEvent, 4194304)) {
                float axisValue2 = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                i10 = 26;
                axisValue = axisValue2;
            } else {
                i10 = 0;
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != 0.0f) {
                P(-((int) (axisValue * getVerticalScrollFactorCompat())), width, 1, f0.a(motionEvent, 8194));
                if (i10 != 0) {
                    this.C.g(motionEvent, i10);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007e  */
    /* JADX WARN: Code duplicated, block: B:33:0x009c  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action == 2 && this.f2027k) {
            return true;
        }
        int i10 = action & 255;
        if (i10 == 0) {
            int y10 = (int) motionEvent.getY();
            if (z((int) motionEvent.getX(), y10)) {
                this.f2023g = y10;
                this.f2034r = motionEvent.getPointerId(0);
                A();
                this.f2028l.addMovement(motionEvent);
                this.f2020d.computeScrollOffset();
                if (!Y(motionEvent) && this.f2020d.isFinished()) {
                    z10 = false;
                }
                this.f2027k = z10;
                X(2, 0);
            } else {
                if (!Y(motionEvent) && this.f2020d.isFinished()) {
                    z10 = false;
                }
                this.f2027k = z10;
                L();
            }
        } else if (i10 == 1) {
            this.f2027k = false;
            this.f2034r = -1;
            L();
            if (this.f2020d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            Z(0);
        } else if (i10 == 2) {
            int i11 = this.f2034r;
            if (i11 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i11);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i11 + " in onInterceptTouchEvent");
                } else {
                    int y11 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y11 - this.f2023g) > this.f2031o && (2 & getNestedScrollAxes()) == 0) {
                        this.f2027k = true;
                        this.f2023g = y11;
                        C();
                        this.f2028l.addMovement(motionEvent);
                        this.f2037u = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i10 == 3) {
            this.f2027k = false;
            this.f2034r = -1;
            L();
            if (this.f2020d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            Z(0);
        } else if (i10 == 6) {
            I(motionEvent);
        }
        return this.f2027k;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int measuredHeight = 0;
        this.f2024h = false;
        View view = this.f2026j;
        if (view != null && F(view, this)) {
            Q(this.f2026j);
        }
        this.f2026j = null;
        if (!this.f2025i) {
            if (this.f2039w != null) {
                scrollTo(getScrollX(), this.f2039w.f2044a);
                this.f2039w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iF = f(scrollY, paddingTop, measuredHeight);
            if (iF != scrollY) {
                scrollTo(getScrollX(), iF);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f2025i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f2029m && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        v((int) f11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        k(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        H(i13, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        i(view, view2, i10, 0);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (i10 == 2) {
            i10 = Sdk.SDKError.Reason.MRAID_DOWNLOAD_JS_ERROR_VALUE;
        } else if (i10 == 1) {
            i10 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i10) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        if (viewFindNextFocus == null || E(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i10, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        this.f2039w = eVar;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        eVar.f2044a = getScrollY();
        return eVar;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        d dVar = this.A;
        if (dVar != null) {
            dVar.a(this, i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !G(viewFindFocus, 0, i13)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f2019c);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f2019c);
        q(g(this.f2019c));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return o(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        j(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        C();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2037u = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(0.0f, this.f2037u);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f2028l;
                velocityTracker.computeCurrentVelocity(1000, this.f2033q);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f2034r);
                if (Math.abs(yVelocity) >= this.f2032p) {
                    if (!r(yVelocity)) {
                        int i10 = -yVelocity;
                        float f10 = i10;
                        if (!dispatchNestedPreFling(0.0f, f10)) {
                            dispatchNestedFling(0.0f, f10, true);
                            v(i10);
                        }
                    }
                } else if (this.f2020d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                s();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f2034r);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f2034r + " in onTouchEvent");
                } else {
                    int y10 = (int) motionEvent.getY(iFindPointerIndex);
                    int i11 = this.f2023g - y10;
                    int iM = i11 - M(i11, motionEvent.getX(iFindPointerIndex));
                    if (!this.f2027k && Math.abs(iM) > this.f2031o) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f2027k = true;
                        iM = iM > 0 ? iM - this.f2031o : iM + this.f2031o;
                    }
                    if (this.f2027k) {
                        int iP = P(iM, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f2023g = y10 - iP;
                        this.f2037u += iP;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f2027k && getChildCount() > 0 && this.f2020d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                s();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f2023g = (int) motionEvent.getY(actionIndex);
                this.f2034r = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                I(motionEvent);
                this.f2023g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f2034r));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f2027k && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f2020d.isFinished()) {
                a();
            }
            D((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        VelocityTracker velocityTracker2 = this.f2028l;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public void p(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        this.f2041y.e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f2024h) {
            this.f2026j = view2;
        } else {
            Q(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return R(rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (z10) {
            L();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f2024h = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iF = f(i10, width, width2);
            int iF2 = f(i11, height, height2);
            if (iF == getScrollX() && iF2 == getScrollY()) {
                return;
            }
            super.scrollTo(iF, iF2);
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f2029m) {
            this.f2029m = z10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        this.f2041y.n(z10);
    }

    public void setOnScrollChangeListener(d dVar) {
        this.A = dVar;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f2030n = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return X(i10, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        Z(0);
    }

    public boolean t(KeyEvent keyEvent) {
        this.f2019c.setEmpty();
        boolean zE = e();
        int i10 = Sdk.SDKError.Reason.MRAID_DOWNLOAD_JS_ERROR_VALUE;
        if (!zE) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, Sdk.SDKError.Reason.MRAID_DOWNLOAD_JS_ERROR_VALUE);
            return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(Sdk.SDKError.Reason.MRAID_DOWNLOAD_JS_ERROR_VALUE)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return keyEvent.isAltPressed() ? w(33) : c(33);
        }
        if (keyCode == 20) {
            return keyEvent.isAltPressed() ? w(Sdk.SDKError.Reason.MRAID_DOWNLOAD_JS_ERROR_VALUE) : c(Sdk.SDKError.Reason.MRAID_DOWNLOAD_JS_ERROR_VALUE);
        }
        if (keyCode == 62) {
            if (keyEvent.isShiftPressed()) {
                i10 = 33;
            }
            K(i10);
            return false;
        }
        if (keyCode == 92) {
            return w(33);
        }
        if (keyCode == 93) {
            return w(Sdk.SDKError.Reason.MRAID_DOWNLOAD_JS_ERROR_VALUE);
        }
        if (keyCode == 122) {
            K(33);
            return false;
        }
        if (keyCode != 123) {
            return false;
        }
        K(Sdk.SDKError.Reason.MRAID_DOWNLOAD_JS_ERROR_VALUE);
        return false;
    }

    public void v(int i10) {
        if (getChildCount() > 0) {
            this.f2020d.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            N(true);
        }
    }

    public boolean w(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f2019c;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f2019c.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f2019c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f2019c;
        return O(i10, rect3.top, rect3.bottom);
    }

    public boolean y(int i10) {
        return this.f2041y.l(i10);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2019c = new Rect();
        this.f2024h = true;
        this.f2025i = false;
        this.f2026j = null;
        this.f2027k = false;
        this.f2030n = true;
        this.f2034r = -1;
        this.f2035s = new int[2];
        this.f2036t = new int[2];
        c cVar = new c();
        this.B = cVar;
        this.C = new androidx.core.view.e(getContext(), cVar);
        this.f2021e = androidx.core.widget.d.a(context, attributeSet);
        this.f2022f = androidx.core.widget.d.a(context, attributeSet);
        this.f2017a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        B();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, F, i10, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f2040x = new j0(this);
        this.f2041y = new g0(this);
        setNestedScrollingEnabled(true);
        z0.J(this, E);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
