package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: compiled from: LinearLayoutCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class q0 extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f1403f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f1404g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1405h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int[] f1406i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f1407j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Drawable f1408k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f1409l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f1410m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f1411n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f1412o;

    public q0(Context context) {
        this(context, null);
    }

    private void g(int i10, int i11) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i12 = 0; i12 < i10; i12++) {
            View viewO = o(i12);
            if (viewO.getVisibility() != 8) {
                a aVar = (a) viewO.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).height == -1) {
                    int i13 = ((ViewGroup.MarginLayoutParams) aVar).width;
                    ((ViewGroup.MarginLayoutParams) aVar).width = viewO.getMeasuredWidth();
                    measureChildWithMargins(viewO, i11, 0, iMakeMeasureSpec, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).width = i13;
                }
            }
        }
    }

    private void h(int i10, int i11) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i12 = 0; i12 < i10; i12++) {
            View viewO = o(i12);
            if (viewO.getVisibility() != 8) {
                a aVar = (a) viewO.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).width == -1) {
                    int i13 = ((ViewGroup.MarginLayoutParams) aVar).height;
                    ((ViewGroup.MarginLayoutParams) aVar).height = viewO.getMeasuredHeight();
                    measureChildWithMargins(viewO, iMakeMeasureSpec, 0, i11, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).height = i13;
                }
            }
        }
    }

    private void w(View view, int i10, int i11, int i12, int i13) {
        view.layout(i10, i11, i12 + i10, i13 + i11);
    }

    void c(Canvas canvas) {
        int right;
        int left;
        int i10;
        int virtualChildCount = getVirtualChildCount();
        boolean zB = o1.b(this);
        for (int i11 = 0; i11 < virtualChildCount; i11++) {
            View viewO = o(i11);
            if (viewO != null && viewO.getVisibility() != 8 && p(i11)) {
                a aVar = (a) viewO.getLayoutParams();
                f(canvas, zB ? viewO.getRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin : (viewO.getLeft() - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - this.f1409l);
            }
        }
        if (p(virtualChildCount)) {
            View viewO2 = o(virtualChildCount - 1);
            if (viewO2 != null) {
                a aVar2 = (a) viewO2.getLayoutParams();
                if (zB) {
                    left = viewO2.getLeft() - ((ViewGroup.MarginLayoutParams) aVar2).leftMargin;
                    i10 = this.f1409l;
                    right = left - i10;
                } else {
                    right = viewO2.getRight() + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
                }
            } else if (zB) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i10 = this.f1409l;
                right = left - i10;
            }
            f(canvas, right);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    void d(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i10 = 0; i10 < virtualChildCount; i10++) {
            View viewO = o(i10);
            if (viewO != null && viewO.getVisibility() != 8 && p(i10)) {
                e(canvas, (viewO.getTop() - ((ViewGroup.MarginLayoutParams) ((a) viewO.getLayoutParams())).topMargin) - this.f1410m);
            }
        }
        if (p(virtualChildCount)) {
            View viewO2 = o(virtualChildCount - 1);
            e(canvas, viewO2 == null ? (getHeight() - getPaddingBottom()) - this.f1410m : viewO2.getBottom() + ((ViewGroup.MarginLayoutParams) ((a) viewO2.getLayoutParams())).bottomMargin);
        }
    }

    void e(Canvas canvas, int i10) {
        this.f1408k.setBounds(getPaddingLeft() + this.f1412o, i10, (getWidth() - getPaddingRight()) - this.f1412o, this.f1410m + i10);
        this.f1408k.draw(canvas);
    }

    void f(Canvas canvas, int i10) {
        this.f1408k.setBounds(i10, getPaddingTop() + this.f1412o, this.f1409l + i10, (getHeight() - getPaddingBottom()) - this.f1412o);
        this.f1408k.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.f1399b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f1399b;
        if (childCount <= i11) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i11);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f1399b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f1400c;
        if (this.f1401d == 1 && (i10 = this.f1402e & 112) != 48) {
            if (i10 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1403f) / 2;
            } else if (i10 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1403f;
            }
        }
        return bottom + ((ViewGroup.MarginLayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1399b;
    }

    public Drawable getDividerDrawable() {
        return this.f1408k;
    }

    public int getDividerPadding() {
        return this.f1412o;
    }

    public int getDividerWidth() {
        return this.f1409l;
    }

    public int getGravity() {
        return this.f1402e;
    }

    public int getOrientation() {
        return this.f1401d;
    }

    public int getShowDividers() {
        return this.f1411n;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1404g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i10 = this.f1401d;
        if (i10 == 0) {
            return new a(-2, -2);
        }
        if (i10 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    int l(View view, int i10) {
        return 0;
    }

    int m(View view) {
        return 0;
    }

    int n(View view) {
        return 0;
    }

    View o(int i10) {
        return getChildAt(i10);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f1408k == null) {
            return;
        }
        if (this.f1401d == 1) {
            d(canvas);
        } else {
            c(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f1401d == 1) {
            r(i10, i11, i12, i13);
        } else {
            q(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f1401d == 1) {
            v(i10, i11);
        } else {
            t(i10, i11);
        }
    }

    protected boolean p(int i10) {
        if (i10 == 0) {
            return (this.f1411n & 1) != 0;
        }
        if (i10 == getChildCount()) {
            return (this.f1411n & 4) != 0;
        }
        if ((this.f1411n & 2) == 0) {
            return false;
        }
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (getChildAt(i11).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00af  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00df  */
    /* JADX WARN: Code duplicated, block: B:44:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ff  */
    void q(int i10, int i11, int i12, int i13) {
        int paddingLeft;
        int i14;
        int i15;
        boolean z10;
        int baseline;
        int i16;
        int i17;
        int measuredHeight;
        boolean zB = o1.b(this);
        int paddingTop = getPaddingTop();
        int i18 = i13 - i11;
        int paddingBottom = i18 - getPaddingBottom();
        int paddingBottom2 = (i18 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i19 = this.f1402e;
        int i20 = i19 & 112;
        boolean z11 = this.f1398a;
        int[] iArr = this.f1406i;
        int[] iArr2 = this.f1407j;
        int iA = androidx.core.view.n.a(8388615 & i19, androidx.core.view.z0.n(this));
        boolean z12 = true;
        if (iA != 1) {
            paddingLeft = iA != 5 ? getPaddingLeft() : ((getPaddingLeft() + i12) - i10) - this.f1403f;
        } else {
            paddingLeft = getPaddingLeft() + (((i12 - i10) - this.f1403f) / 2);
        }
        if (zB) {
            i14 = virtualChildCount - 1;
            i15 = -1;
        } else {
            i14 = 0;
            i15 = 1;
        }
        int iL = 0;
        while (iL < virtualChildCount) {
            int i21 = i14 + (i15 * iL);
            View viewO = o(i21);
            if (viewO == null) {
                paddingLeft += u(i21);
                z10 = z12;
            } else {
                if (viewO.getVisibility() != 8) {
                    int measuredWidth = viewO.getMeasuredWidth();
                    int measuredHeight2 = viewO.getMeasuredHeight();
                    a aVar = (a) viewO.getLayoutParams();
                    int i22 = iL;
                    if (z11) {
                        virtualChildCount = virtualChildCount;
                        baseline = ((ViewGroup.MarginLayoutParams) aVar).height != -1 ? viewO.getBaseline() : -1;
                        i16 = aVar.f1414b;
                        if (i16 < 0) {
                            i16 = i20;
                        }
                        i17 = i16 & 112;
                        i20 = i20;
                        if (i17 != 16) {
                            if (i17 != 48) {
                                measuredHeight = ((ViewGroup.MarginLayoutParams) aVar).topMargin + paddingTop;
                                if (baseline != -1) {
                                    z10 = true;
                                    measuredHeight += iArr[1] - baseline;
                                }
                            } else if (i17 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                measuredHeight = (paddingBottom - measuredHeight2) - ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight -= iArr2[2] - (viewO.getMeasuredHeight() - baseline);
                                }
                            }
                            z10 = true;
                        } else {
                            z10 = true;
                            measuredHeight = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop) + ((ViewGroup.MarginLayoutParams) aVar).topMargin) - ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                        }
                        if (p(i21)) {
                            paddingLeft += this.f1409l;
                        }
                        int i23 = ((ViewGroup.MarginLayoutParams) aVar).leftMargin + paddingLeft;
                        paddingTop = paddingTop;
                        w(viewO, i23 + m(viewO), measuredHeight, measuredWidth, measuredHeight2);
                        int iN = i23 + measuredWidth + ((ViewGroup.MarginLayoutParams) aVar).rightMargin + n(viewO);
                        iL = i22 + l(viewO, i21);
                        paddingLeft = iN;
                    } else {
                        virtualChildCount = virtualChildCount;
                    }
                    i16 = aVar.f1414b;
                    if (i16 < 0) {
                        i16 = i20;
                    }
                    i17 = i16 & 112;
                    i20 = i20;
                    if (i17 != 16) {
                        if (i17 != 48) {
                            measuredHeight = ((ViewGroup.MarginLayoutParams) aVar).topMargin + paddingTop;
                            if (baseline != -1) {
                                z10 = true;
                                measuredHeight += iArr[1] - baseline;
                            }
                        } else if (i17 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            measuredHeight = (paddingBottom - measuredHeight2) - ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight -= iArr2[2] - (viewO.getMeasuredHeight() - baseline);
                            }
                        }
                        z10 = true;
                    } else {
                        z10 = true;
                        measuredHeight = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop) + ((ViewGroup.MarginLayoutParams) aVar).topMargin) - ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                    }
                    if (p(i21)) {
                        paddingLeft += this.f1409l;
                    }
                    int i24 = ((ViewGroup.MarginLayoutParams) aVar).leftMargin + paddingLeft;
                    paddingTop = paddingTop;
                    w(viewO, i24 + m(viewO), measuredHeight, measuredWidth, measuredHeight2);
                    int iN2 = i24 + measuredWidth + ((ViewGroup.MarginLayoutParams) aVar).rightMargin + n(viewO);
                    iL = i22 + l(viewO, i21);
                    paddingLeft = iN2;
                } else {
                    z10 = true;
                }
                iL++;
                virtualChildCount = virtualChildCount;
                i20 = i20;
                z12 = z10;
                paddingTop = paddingTop;
            }
            iL++;
            virtualChildCount = virtualChildCount;
            i20 = i20;
            z12 = z10;
            paddingTop = paddingTop;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009f  */
    void r(int i10, int i11, int i12, int i13) {
        int paddingTop;
        int i14;
        int i15;
        int i16;
        int i17;
        int paddingLeft = getPaddingLeft();
        int i18 = i12 - i10;
        int paddingRight = i18 - getPaddingRight();
        int paddingRight2 = (i18 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i19 = this.f1402e;
        int i20 = i19 & 112;
        int i21 = i19 & 8388615;
        if (i20 != 16) {
            paddingTop = i20 != 80 ? getPaddingTop() : ((getPaddingTop() + i13) - i11) - this.f1403f;
        } else {
            paddingTop = getPaddingTop() + (((i13 - i11) - this.f1403f) / 2);
        }
        int iL = 0;
        while (iL < virtualChildCount) {
            View viewO = o(iL);
            if (viewO == null) {
                paddingTop += u(iL);
            } else {
                if (viewO.getVisibility() != 8) {
                    int measuredWidth = viewO.getMeasuredWidth();
                    int measuredHeight = viewO.getMeasuredHeight();
                    a aVar = (a) viewO.getLayoutParams();
                    int i22 = aVar.f1414b;
                    if (i22 < 0) {
                        i22 = i21;
                    }
                    int iA = androidx.core.view.n.a(i22, androidx.core.view.z0.n(this)) & 7;
                    if (iA != 1) {
                        if (iA != 5) {
                            i16 = ((ViewGroup.MarginLayoutParams) aVar).leftMargin + paddingLeft;
                        } else {
                            i14 = paddingRight - measuredWidth;
                            i15 = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                        }
                        int i23 = i16;
                        if (p(iL)) {
                            paddingTop += this.f1410m;
                        }
                        int i24 = paddingTop + ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                        w(viewO, i23, i24 + m(viewO), measuredWidth, measuredHeight);
                        int iN = i24 + measuredHeight + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin + n(viewO);
                        iL += l(viewO, iL);
                        paddingTop = iN;
                        i17 = 1;
                    } else {
                        i14 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
                        i15 = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                    }
                    i16 = i14 - i15;
                    int i25 = i16;
                    if (p(iL)) {
                        paddingTop += this.f1410m;
                    }
                    int i26 = paddingTop + ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                    w(viewO, i25, i26 + m(viewO), measuredWidth, measuredHeight);
                    int iN2 = i26 + measuredHeight + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin + n(viewO);
                    iL += l(viewO, iL);
                    paddingTop = iN2;
                    i17 = 1;
                }
                iL += i17;
            }
            i17 = 1;
            iL += i17;
        }
    }

    void s(View view, int i10, int i11, int i12, int i13, int i14) {
        measureChildWithMargins(view, i11, i12, i13, i14);
    }

    public void setBaselineAligned(boolean z10) {
        this.f1398a = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f1399b = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f1408k) {
            return;
        }
        this.f1408k = drawable;
        if (drawable != null) {
            this.f1409l = drawable.getIntrinsicWidth();
            this.f1410m = drawable.getIntrinsicHeight();
        } else {
            this.f1409l = 0;
            this.f1410m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.f1412o = i10;
    }

    public void setGravity(int i10) {
        if (this.f1402e != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f1402e = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f1402e;
        if ((8388615 & i12) != i11) {
            this.f1402e = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f1405h = z10;
    }

    public void setOrientation(int i10) {
        if (this.f1401d != i10) {
            this.f1401d = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f1411n) {
            requestLayout();
        }
        this.f1411n = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f1402e;
        if ((i12 & 112) != i11) {
            this.f1402e = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f1404g = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:197:0x0452  */
    /* JADX WARN: Code duplicated, block: B:60:0x0177  */
    /* JADX WARN: Code duplicated, block: B:67:0x0199  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:77:0x01cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:84:0x01dd  */
    void t(int i10, int i11) {
        int[] iArr;
        int i12;
        int iMax;
        int iMax2;
        int i13;
        int i14;
        int baseline;
        int i15;
        int i16;
        byte b10;
        int i17;
        int i18;
        boolean z10;
        boolean z11;
        View view;
        int i19;
        boolean z12;
        int i20;
        int measuredHeight;
        int iL;
        int baseline2;
        int i21;
        this.f1403f = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (this.f1406i == null || this.f1407j == null) {
            this.f1406i = new int[4];
            this.f1407j = new int[4];
        }
        int[] iArr2 = this.f1406i;
        int[] iArr3 = this.f1407j;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        boolean z13 = this.f1398a;
        boolean z14 = this.f1405h;
        int i22 = 1073741824;
        boolean z15 = mode == 1073741824;
        int iL2 = 0;
        int iMax3 = 0;
        int iMax4 = 0;
        int iMax5 = 0;
        int iMax6 = 0;
        boolean z16 = false;
        int iCombineMeasuredStates = 0;
        boolean z17 = false;
        boolean z18 = true;
        float f10 = 0.0f;
        while (true) {
            iArr = iArr3;
            if (iL2 >= virtualChildCount) {
                break;
            }
            View viewO = o(iL2);
            if (viewO == null) {
                this.f1403f += u(iL2);
            } else {
                if (viewO.getVisibility() == 8) {
                    iL2 += l(viewO, iL2);
                } else {
                    if (p(iL2)) {
                        this.f1403f += this.f1409l;
                    }
                    a aVar = (a) viewO.getLayoutParams();
                    float f11 = aVar.f1413a;
                    float f12 = f10 + f11;
                    if (mode == i22 && ((ViewGroup.MarginLayoutParams) aVar).width == 0 && f11 > 0.0f) {
                        if (z15) {
                            this.f1403f += ((ViewGroup.MarginLayoutParams) aVar).leftMargin + ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                        } else {
                            int i23 = this.f1403f;
                            this.f1403f = Math.max(i23, ((ViewGroup.MarginLayoutParams) aVar).leftMargin + i23 + ((ViewGroup.MarginLayoutParams) aVar).rightMargin);
                        }
                        if (z13) {
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                            viewO.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                            i18 = iL2;
                            z10 = z14;
                            z11 = z13;
                            view = viewO;
                        } else {
                            i18 = iL2;
                            z10 = z14;
                            z11 = z13;
                            view = viewO;
                            z16 = true;
                            i19 = 1073741824;
                        }
                        if (mode2 == i19 && ((ViewGroup.MarginLayoutParams) aVar).height == -1) {
                            z12 = true;
                            z17 = true;
                        } else {
                            z12 = false;
                        }
                        i20 = ((ViewGroup.MarginLayoutParams) aVar).topMargin + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i20;
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        if (z11 && (baseline2 = view.getBaseline()) != -1) {
                            i21 = aVar.f1414b;
                            if (i21 < 0) {
                                i21 = this.f1402e;
                            }
                            int i24 = (((i21 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i24] = Math.max(iArr2[i24], baseline2);
                            iArr[i24] = Math.max(iArr[i24], measuredHeight - baseline2);
                        }
                        iMax4 = Math.max(iMax4, measuredHeight);
                        if (z18 || ((ViewGroup.MarginLayoutParams) aVar).height != -1) {
                            z18 = false;
                        } else {
                            z18 = true;
                        }
                        if (aVar.f1413a > 0.0f) {
                            if (!z12) {
                                i20 = measuredHeight;
                            }
                            iMax6 = Math.max(iMax6, i20);
                        } else {
                            int i25 = iMax6;
                            if (!z12) {
                                i20 = measuredHeight;
                            }
                            iMax5 = Math.max(iMax5, i20);
                            iMax6 = i25;
                        }
                        int i26 = i18;
                        iL = l(view, i26) + i26;
                        f10 = f12;
                    } else {
                        if (((ViewGroup.MarginLayoutParams) aVar).width != 0 || f11 <= 0.0f) {
                            b10 = -2;
                            i17 = Integer.MIN_VALUE;
                        } else {
                            b10 = -2;
                            ((ViewGroup.MarginLayoutParams) aVar).width = -2;
                            i17 = 0;
                        }
                        i18 = iL2;
                        int i27 = i17;
                        z10 = z14;
                        z11 = z13;
                        s(viewO, i18, i10, f12 == 0.0f ? this.f1403f : 0, i11, 0);
                        if (i27 != Integer.MIN_VALUE) {
                            ((ViewGroup.MarginLayoutParams) aVar).width = i27;
                        }
                        int measuredWidth = viewO.getMeasuredWidth();
                        if (z15) {
                            view = viewO;
                            this.f1403f += ((ViewGroup.MarginLayoutParams) aVar).leftMargin + measuredWidth + ((ViewGroup.MarginLayoutParams) aVar).rightMargin + n(view);
                        } else {
                            view = viewO;
                            int i28 = this.f1403f;
                            this.f1403f = Math.max(i28, i28 + measuredWidth + ((ViewGroup.MarginLayoutParams) aVar).leftMargin + ((ViewGroup.MarginLayoutParams) aVar).rightMargin + n(view));
                        }
                        if (z10) {
                            iMax3 = Math.max(measuredWidth, iMax3);
                        }
                    }
                    i19 = 1073741824;
                    if (mode2 == i19) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    i20 = ((ViewGroup.MarginLayoutParams) aVar).topMargin + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                    measuredHeight = view.getMeasuredHeight() + i20;
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    if (z11) {
                        i21 = aVar.f1414b;
                        if (i21 < 0) {
                            i21 = this.f1402e;
                        }
                        int i29 = (((i21 & 112) >> 4) & (-2)) >> 1;
                        iArr2[i29] = Math.max(iArr2[i29], baseline2);
                        iArr[i29] = Math.max(iArr[i29], measuredHeight - baseline2);
                    }
                    iMax4 = Math.max(iMax4, measuredHeight);
                    if (z18) {
                        z18 = false;
                    } else {
                        z18 = false;
                    }
                    if (aVar.f1413a > 0.0f) {
                        if (!z12) {
                            i20 = measuredHeight;
                        }
                        iMax6 = Math.max(iMax6, i20);
                    } else {
                        int i210 = iMax6;
                        if (!z12) {
                            i20 = measuredHeight;
                        }
                        iMax5 = Math.max(iMax5, i20);
                        iMax6 = i210;
                    }
                    int i211 = i18;
                    iL = l(view, i211) + i211;
                    f10 = f12;
                }
                int i30 = iL + 1;
                iArr3 = iArr;
                z14 = z10;
                z13 = z11;
                i22 = i19;
                iL2 = i30;
            }
            z10 = z14;
            z11 = z13;
            int i31 = i22;
            iL = iL2;
            i19 = i31;
            int i32 = iL + 1;
            iArr3 = iArr;
            z14 = z10;
            z13 = z11;
            i22 = i19;
            iL2 = i32;
        }
        boolean z19 = z14;
        boolean z20 = z13;
        int i33 = iMax4;
        int i34 = iMax5;
        int i35 = iMax6;
        int i36 = iCombineMeasuredStates;
        if (this.f1403f > 0 && p(virtualChildCount)) {
            this.f1403f += this.f1409l;
        }
        int i37 = iArr2[1];
        int iMax7 = (i37 == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) ? i33 : Math.max(i33, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(i37, iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
        if (z19 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.f1403f = 0;
            int iL3 = 0;
            while (iL3 < virtualChildCount) {
                View viewO2 = o(iL3);
                if (viewO2 == null) {
                    this.f1403f += u(iL3);
                } else if (viewO2.getVisibility() == 8) {
                    iL3 += l(viewO2, iL3);
                } else {
                    a aVar2 = (a) viewO2.getLayoutParams();
                    if (z15) {
                        this.f1403f += ((ViewGroup.MarginLayoutParams) aVar2).leftMargin + iMax3 + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin + n(viewO2);
                    } else {
                        int i38 = this.f1403f;
                        this.f1403f = Math.max(i38, i38 + iMax3 + ((ViewGroup.MarginLayoutParams) aVar2).leftMargin + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin + n(viewO2));
                    }
                    iL3++;
                    iMax7 = iMax7;
                }
                iL3++;
                iMax7 = iMax7;
            }
        }
        int i39 = iMax7;
        int paddingLeft = this.f1403f + getPaddingLeft() + getPaddingRight();
        this.f1403f = paddingLeft;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i10, 0);
        int i40 = (16777215 & iResolveSizeAndState) - this.f1403f;
        if (z16 || (i40 != 0 && f10 > 0.0f)) {
            float f13 = this.f1404g;
            if (f13 > 0.0f) {
                f10 = f13;
            }
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            this.f1403f = 0;
            int i41 = i34;
            int iMax8 = -1;
            int iCombineMeasuredStates2 = i36;
            int i42 = 0;
            while (i42 < virtualChildCount) {
                View viewO3 = o(i42);
                if (viewO3 == null || viewO3.getVisibility() == 8) {
                    i13 = i40;
                    virtualChildCount = virtualChildCount;
                } else {
                    a aVar3 = (a) viewO3.getLayoutParams();
                    float f14 = aVar3.f1413a;
                    if (f14 > 0.0f) {
                        int i43 = (int) ((i40 * f14) / f10);
                        float f15 = f10 - f14;
                        int i44 = i40 - i43;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) aVar3).topMargin + ((ViewGroup.MarginLayoutParams) aVar3).bottomMargin, ((ViewGroup.MarginLayoutParams) aVar3).height);
                        if (((ViewGroup.MarginLayoutParams) aVar3).width == 0) {
                            i16 = 1073741824;
                            if (mode == 1073741824) {
                                if (i43 <= 0) {
                                    i43 = 0;
                                }
                                viewO3.measure(View.MeasureSpec.makeMeasureSpec(i43, 1073741824), childMeasureSpec);
                            }
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, viewO3.getMeasuredState() & (-16777216));
                            f10 = f15;
                            i13 = i44;
                        } else {
                            i16 = 1073741824;
                        }
                        int measuredWidth2 = viewO3.getMeasuredWidth() + i43;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        viewO3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i16), childMeasureSpec);
                        iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, viewO3.getMeasuredState() & (-16777216));
                        f10 = f15;
                        i13 = i44;
                    } else {
                        i13 = i40;
                    }
                    if (z15) {
                        this.f1403f += viewO3.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) aVar3).leftMargin + ((ViewGroup.MarginLayoutParams) aVar3).rightMargin + n(viewO3);
                    } else {
                        int i45 = this.f1403f;
                        this.f1403f = Math.max(i45, viewO3.getMeasuredWidth() + i45 + ((ViewGroup.MarginLayoutParams) aVar3).leftMargin + ((ViewGroup.MarginLayoutParams) aVar3).rightMargin + n(viewO3));
                    }
                    boolean z21 = mode2 != 1073741824 && ((ViewGroup.MarginLayoutParams) aVar3).height == -1;
                    int i46 = ((ViewGroup.MarginLayoutParams) aVar3).topMargin + ((ViewGroup.MarginLayoutParams) aVar3).bottomMargin;
                    int measuredHeight2 = viewO3.getMeasuredHeight() + i46;
                    iMax8 = Math.max(iMax8, measuredHeight2);
                    if (!z21) {
                        i46 = measuredHeight2;
                    }
                    int iMax9 = Math.max(i41, i46);
                    if (z18) {
                        i14 = -1;
                        boolean z22 = ((ViewGroup.MarginLayoutParams) aVar3).height == -1;
                        if (z20 && (baseline = viewO3.getBaseline()) != i14) {
                            i15 = aVar3.f1414b;
                            if (i15 < 0) {
                                i15 = this.f1402e;
                            }
                            int i47 = (((i15 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i47] = Math.max(iArr2[i47], baseline);
                            iArr[i47] = Math.max(iArr[i47], measuredHeight2 - baseline);
                        }
                        z18 = z22;
                        i41 = iMax9;
                        f10 = f10;
                    } else {
                        i14 = -1;
                    }
                    if (z20) {
                        i15 = aVar3.f1414b;
                        if (i15 < 0) {
                            i15 = this.f1402e;
                        }
                        int i48 = (((i15 & 112) >> 4) & (-2)) >> 1;
                        iArr2[i48] = Math.max(iArr2[i48], baseline);
                        iArr[i48] = Math.max(iArr[i48], measuredHeight2 - baseline);
                    }
                    z18 = z22;
                    i41 = iMax9;
                    f10 = f10;
                }
                i42++;
                i40 = i13;
                virtualChildCount = virtualChildCount;
            }
            i12 = virtualChildCount;
            this.f1403f += getPaddingLeft() + getPaddingRight();
            int i49 = iArr2[1];
            iMax = (i49 == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) ? iMax8 : Math.max(iMax8, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(i49, iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
            iMax2 = i41;
            i36 = iCombineMeasuredStates2;
        } else {
            iMax2 = Math.max(i34, i35);
            if (z19 && mode != 1073741824) {
                for (int i50 = 0; i50 < virtualChildCount; i50++) {
                    View viewO4 = o(i50);
                    if (viewO4 != null && viewO4.getVisibility() != 8 && ((a) viewO4.getLayoutParams()).f1413a > 0.0f) {
                        viewO4.measure(View.MeasureSpec.makeMeasureSpec(iMax3, 1073741824), View.MeasureSpec.makeMeasureSpec(viewO4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i12 = virtualChildCount;
            iMax = i39;
        }
        if (z18 || mode2 == 1073741824) {
            iMax2 = iMax;
        }
        setMeasuredDimension(iResolveSizeAndState | (i36 & (-16777216)), View.resolveSizeAndState(Math.max(iMax2 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, i36 << 16));
        if (z17) {
            g(i12, i10);
        }
    }

    int u(int i10) {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:150:0x0325  */
    /* JADX WARN: Code duplicated, block: B:156:0x0333  */
    void v(int i10, int i11) {
        int i12;
        int iCombineMeasuredStates;
        int iMax;
        int i13;
        int i14;
        int i15;
        boolean z10;
        boolean z11;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        View view;
        int iMax2;
        boolean z12;
        int iMax3;
        this.f1403f = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int i25 = this.f1399b;
        boolean z13 = this.f1405h;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int iMax4 = 0;
        int i29 = 0;
        int iL = 0;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = true;
        float f10 = 0.0f;
        while (true) {
            int i30 = 8;
            int i31 = iMax4;
            if (iL >= virtualChildCount) {
                int i32 = i26;
                int i33 = i28;
                int i34 = i29;
                int i35 = virtualChildCount;
                int i36 = mode2;
                int iMax5 = i27;
                if (this.f1403f > 0) {
                    i12 = i35;
                    if (p(i12)) {
                        this.f1403f += this.f1410m;
                    }
                } else {
                    i12 = i35;
                }
                if (z13 && (i36 == Integer.MIN_VALUE || i36 == 0)) {
                    this.f1403f = 0;
                    int iL2 = 0;
                    while (iL2 < i12) {
                        View viewO = o(iL2);
                        if (viewO == null) {
                            this.f1403f += u(iL2);
                        } else if (viewO.getVisibility() == i30) {
                            iL2 += l(viewO, iL2);
                        } else {
                            a aVar = (a) viewO.getLayoutParams();
                            int i37 = this.f1403f;
                            this.f1403f = Math.max(i37, i37 + i33 + ((ViewGroup.MarginLayoutParams) aVar).topMargin + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin + n(viewO));
                        }
                        iL2++;
                        i30 = 8;
                    }
                }
                int paddingTop = this.f1403f + getPaddingTop() + getPaddingBottom();
                this.f1403f = paddingTop;
                int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i11, 0);
                int i38 = (16777215 & iResolveSizeAndState) - this.f1403f;
                if (z14 || (i38 != 0 && f10 > 0.0f)) {
                    float f11 = this.f1404g;
                    if (f11 > 0.0f) {
                        f10 = f11;
                    }
                    this.f1403f = 0;
                    int i39 = i38;
                    int i40 = i34;
                    iCombineMeasuredStates = i32;
                    int i41 = 0;
                    while (i41 < i12) {
                        View viewO2 = o(i41);
                        if (viewO2.getVisibility() == 8) {
                            i13 = i39;
                        } else {
                            a aVar2 = (a) viewO2.getLayoutParams();
                            float f12 = aVar2.f1413a;
                            if (f12 > 0.0f) {
                                int i42 = (int) ((i39 * f12) / f10);
                                float f13 = f10 - f12;
                                i13 = i39 - i42;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) aVar2).leftMargin + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin, ((ViewGroup.MarginLayoutParams) aVar2).width);
                                if (((ViewGroup.MarginLayoutParams) aVar2).height == 0) {
                                    i16 = 1073741824;
                                    if (i36 == 1073741824) {
                                        if (i42 <= 0) {
                                            i42 = 0;
                                        }
                                        viewO2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i42, 1073741824));
                                    }
                                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewO2.getMeasuredState() & (-256));
                                    f10 = f13;
                                } else {
                                    i16 = 1073741824;
                                }
                                int measuredHeight = viewO2.getMeasuredHeight() + i42;
                                if (measuredHeight < 0) {
                                    measuredHeight = 0;
                                }
                                viewO2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i16));
                                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewO2.getMeasuredState() & (-256));
                                f10 = f13;
                            } else {
                                i13 = i39;
                            }
                            int i43 = ((ViewGroup.MarginLayoutParams) aVar2).leftMargin + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
                            int measuredWidth = viewO2.getMeasuredWidth() + i43;
                            iMax5 = Math.max(iMax5, measuredWidth);
                            float f14 = f10;
                            if (mode != 1073741824) {
                                i14 = iCombineMeasuredStates;
                                i15 = -1;
                                z10 = ((ViewGroup.MarginLayoutParams) aVar2).width == -1;
                                if (!z10) {
                                    i43 = measuredWidth;
                                }
                                int iMax6 = Math.max(i40, i43);
                                if (z16 || ((ViewGroup.MarginLayoutParams) aVar2).width != i15) {
                                    z11 = false;
                                } else {
                                    z11 = true;
                                }
                                int i44 = this.f1403f;
                                this.f1403f = Math.max(i44, viewO2.getMeasuredHeight() + i44 + ((ViewGroup.MarginLayoutParams) aVar2).topMargin + ((ViewGroup.MarginLayoutParams) aVar2).bottomMargin + n(viewO2));
                                z16 = z11;
                                iCombineMeasuredStates = i14;
                                i40 = iMax6;
                                f10 = f14;
                            } else {
                                i14 = iCombineMeasuredStates;
                                i15 = -1;
                            }
                            if (!z10) {
                                i43 = measuredWidth;
                            }
                            int iMax7 = Math.max(i40, i43);
                            if (z16) {
                                z11 = false;
                            } else {
                                z11 = false;
                            }
                            int i45 = this.f1403f;
                            this.f1403f = Math.max(i45, viewO2.getMeasuredHeight() + i45 + ((ViewGroup.MarginLayoutParams) aVar2).topMargin + ((ViewGroup.MarginLayoutParams) aVar2).bottomMargin + n(viewO2));
                            z16 = z11;
                            iCombineMeasuredStates = i14;
                            i40 = iMax7;
                            f10 = f14;
                        }
                        i41++;
                        i39 = i13;
                    }
                    this.f1403f += getPaddingTop() + getPaddingBottom();
                    iMax = i40;
                } else {
                    iMax = Math.max(i34, i31);
                    if (z13 && i36 != 1073741824) {
                        for (int i46 = 0; i46 < i12; i46++) {
                            View viewO3 = o(i46);
                            if (viewO3 != null && viewO3.getVisibility() != 8 && ((a) viewO3.getLayoutParams()).f1413a > 0.0f) {
                                viewO3.measure(View.MeasureSpec.makeMeasureSpec(viewO3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i33, 1073741824));
                            }
                        }
                    }
                    iCombineMeasuredStates = i32;
                }
                if (z16 || mode == 1073741824) {
                    iMax = iMax5;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, iCombineMeasuredStates), iResolveSizeAndState);
                if (z15) {
                    h(i12, i11);
                    return;
                }
                return;
            }
            View viewO4 = o(iL);
            if (viewO4 == null) {
                this.f1403f += u(iL);
                i20 = virtualChildCount;
                i21 = mode2;
                iMax4 = i31;
            } else {
                int i47 = i26;
                if (viewO4.getVisibility() == 8) {
                    iL += l(viewO4, iL);
                    i20 = virtualChildCount;
                    iMax4 = i31;
                    i26 = i47;
                    i21 = mode2;
                } else {
                    if (p(iL)) {
                        this.f1403f += this.f1410m;
                    }
                    a aVar3 = (a) viewO4.getLayoutParams();
                    float f15 = aVar3.f1413a;
                    float f16 = f10 + f15;
                    if (mode2 == 1073741824 && ((ViewGroup.MarginLayoutParams) aVar3).height == 0 && f15 > 0.0f) {
                        int i48 = this.f1403f;
                        this.f1403f = Math.max(i48, ((ViewGroup.MarginLayoutParams) aVar3).topMargin + i48 + ((ViewGroup.MarginLayoutParams) aVar3).bottomMargin);
                        iMax2 = i28;
                        view = viewO4;
                        i23 = i29;
                        z14 = true;
                        i18 = i47;
                        i19 = i27;
                        i20 = virtualChildCount;
                        i21 = mode2;
                        i22 = i31;
                        i24 = iL;
                    } else {
                        int i49 = i27;
                        if (((ViewGroup.MarginLayoutParams) aVar3).height != 0 || f15 <= 0.0f) {
                            i17 = Integer.MIN_VALUE;
                        } else {
                            ((ViewGroup.MarginLayoutParams) aVar3).height = -2;
                            i17 = 0;
                        }
                        i18 = i47;
                        int i50 = i17;
                        i19 = i49;
                        int i51 = i28;
                        i20 = virtualChildCount;
                        i21 = mode2;
                        i22 = i31;
                        i23 = i29;
                        i24 = iL;
                        s(viewO4, iL, i10, 0, i11, f16 == 0.0f ? this.f1403f : 0);
                        if (i50 != Integer.MIN_VALUE) {
                            ((ViewGroup.MarginLayoutParams) aVar3).height = i50;
                        }
                        int measuredHeight2 = viewO4.getMeasuredHeight();
                        int i52 = this.f1403f;
                        view = viewO4;
                        this.f1403f = Math.max(i52, i52 + measuredHeight2 + ((ViewGroup.MarginLayoutParams) aVar3).topMargin + ((ViewGroup.MarginLayoutParams) aVar3).bottomMargin + n(view));
                        iMax2 = z13 ? Math.max(measuredHeight2, i51) : i51;
                    }
                    if (i25 >= 0 && i25 == i24 + 1) {
                        this.f1400c = this.f1403f;
                    }
                    if (i24 < i25 && aVar3.f1413a > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (mode == 1073741824 || ((ViewGroup.MarginLayoutParams) aVar3).width != -1) {
                        z12 = false;
                    } else {
                        z12 = true;
                        z15 = true;
                    }
                    int i53 = ((ViewGroup.MarginLayoutParams) aVar3).leftMargin + ((ViewGroup.MarginLayoutParams) aVar3).rightMargin;
                    int measuredWidth2 = view.getMeasuredWidth() + i53;
                    int iMax8 = Math.max(i19, measuredWidth2);
                    int iCombineMeasuredStates2 = View.combineMeasuredStates(i18, view.getMeasuredState());
                    z16 = z16 && ((ViewGroup.MarginLayoutParams) aVar3).width == -1;
                    if (aVar3.f1413a > 0.0f) {
                        if (!z12) {
                            i53 = measuredWidth2;
                        }
                        iMax4 = Math.max(i22, i53);
                        iMax3 = i23;
                    } else {
                        if (!z12) {
                            i53 = measuredWidth2;
                        }
                        iMax3 = Math.max(i23, i53);
                        iMax4 = i22;
                    }
                    int iL3 = l(view, i24) + i24;
                    i28 = iMax2;
                    f10 = f16;
                    i29 = iMax3;
                    i26 = iCombineMeasuredStates2;
                    iL = iL3;
                    i27 = iMax8;
                }
            }
            iL++;
            mode2 = i21;
            virtualChildCount = i20;
        }
    }

    public q0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public q0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1398a = true;
        this.f1399b = -1;
        this.f1400c = 0;
        this.f1402e = 8388659;
        h1 h1VarT = h1.t(context, attributeSet, g.j.f15118b1, i10, 0);
        int iJ = h1VarT.j(g.j.f15128d1, -1);
        if (iJ >= 0) {
            setOrientation(iJ);
        }
        int iJ2 = h1VarT.j(g.j.f15123c1, -1);
        if (iJ2 >= 0) {
            setGravity(iJ2);
        }
        boolean zA = h1VarT.a(g.j.f15133e1, true);
        if (!zA) {
            setBaselineAligned(zA);
        }
        this.f1404g = h1VarT.h(g.j.f15143g1, -1.0f);
        this.f1399b = h1VarT.j(g.j.f15138f1, -1);
        this.f1405h = h1VarT.a(g.j.f15158j1, false);
        setDividerDrawable(h1VarT.f(g.j.f15148h1));
        this.f1411n = h1VarT.j(g.j.f15163k1, 0);
        this.f1412o = h1VarT.e(g.j.f15153i1, 0);
        h1VarT.u();
    }

    /* JADX INFO: compiled from: LinearLayoutCompat.java */
    public static class a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f1413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1414b;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1414b = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.j.f15168l1);
            this.f1413a = typedArrayObtainStyledAttributes.getFloat(g.j.f15178n1, 0.0f);
            this.f1414b = typedArrayObtainStyledAttributes.getInt(g.j.f15173m1, -1);
            typedArrayObtainStyledAttributes.recycle();
        }

        public a(int i10, int i11) {
            super(i10, i11);
            this.f1414b = -1;
            this.f1413a = 0.0f;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1414b = -1;
        }
    }
}
