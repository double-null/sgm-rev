package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.x2;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends androidx.appcompat.widget.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CharSequence f972i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CharSequence f973j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private View f974k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View f975l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private LinearLayout f976m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private TextView f977n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private TextView f978o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f979p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f980q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f981r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f982s;

    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k.b f983a;

        a(k.b bVar) {
            this.f983a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f983a.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    private void i() {
        if (this.f976m == null) {
            LayoutInflater.from(getContext()).inflate(g.g.f15076a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f976m = linearLayout;
            this.f977n = (TextView) linearLayout.findViewById(g.f.f15054e);
            this.f978o = (TextView) this.f976m.findViewById(g.f.f15053d);
            if (this.f979p != 0) {
                this.f977n.setTextAppearance(getContext(), this.f979p);
            }
            if (this.f980q != 0) {
                this.f978o.setTextAppearance(getContext(), this.f980q);
            }
        }
        this.f977n.setText(this.f972i);
        this.f978o.setText(this.f973j);
        boolean z10 = !TextUtils.isEmpty(this.f972i);
        boolean z11 = !TextUtils.isEmpty(this.f973j);
        int i10 = 0;
        this.f978o.setVisibility(z11 ? 0 : 8);
        LinearLayout linearLayout2 = this.f976m;
        if (!z10 && !z11) {
            i10 = 8;
        }
        linearLayout2.setVisibility(i10);
        if (this.f976m.getParent() == null) {
            addView(this.f976m);
        }
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ x2 f(int i10, long j10) {
        return super.f(i10, j10);
    }

    public void g() {
        if (this.f974k == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f973j;
    }

    public CharSequence getTitle() {
        return this.f972i;
    }

    public void h(k.b bVar) {
        View view = this.f974k;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f982s, (ViewGroup) this, false);
            this.f974k = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f974k);
        }
        this.f974k.findViewById(g.f.f15058i).setOnClickListener(new a(bVar));
        androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) bVar.e();
        c cVar = this.f1140d;
        if (cVar != null) {
            cVar.x();
        }
        c cVar2 = new c(getContext());
        this.f1140d = cVar2;
        cVar2.I(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        eVar.c(this.f1140d, this.f1138b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f1140d.o(this);
        this.f1139c = actionMenuView;
        androidx.core.view.z0.K(actionMenuView, null);
        addView(this.f1139c, layoutParams);
    }

    public boolean j() {
        return this.f981r;
    }

    public void k() {
        removeAllViews();
        this.f975l = null;
        this.f1139c = null;
    }

    public boolean l() {
        c cVar = this.f1140d;
        if (cVar != null) {
            return cVar.J();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f1140d;
        if (cVar != null) {
            cVar.A();
            this.f1140d.B();
        }
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(getClass().getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f972i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean zB = o1.b(this);
        int paddingRight = zB ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f974k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f974k.getLayoutParams();
            int i14 = zB ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = zB ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iD = androidx.appcompat.widget.a.d(paddingRight, i14, zB);
            paddingRight = androidx.appcompat.widget.a.d(iD + e(this.f974k, iD, paddingTop, paddingTop2, zB), i15, zB);
        }
        int iE = paddingRight;
        LinearLayout linearLayout = this.f976m;
        if (linearLayout != null && this.f975l == null && linearLayout.getVisibility() != 8) {
            iE += e(this.f976m, iE, paddingTop, paddingTop2, zB);
        }
        int i16 = iE;
        View view2 = this.f975l;
        if (view2 != null) {
            e(view2, i16, paddingTop, paddingTop2, zB);
        }
        int paddingLeft = zB ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1139c;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zB);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = this.f1141e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i11);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f974k;
        if (view != null) {
            int iC = c(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f974k.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f1139c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c(this.f1139c, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f976m;
        if (linearLayout != null && this.f975l == null) {
            if (this.f981r) {
                this.f976m.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f976m.getMeasuredWidth();
                boolean z10 = measuredWidth <= paddingLeft;
                if (z10) {
                    paddingLeft -= measuredWidth;
                }
                this.f976m.setVisibility(z10 ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f975l;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = i12 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i12 >= 0) {
                paddingLeft = Math.min(i12, paddingLeft);
            }
            int i14 = layoutParams.height;
            int i15 = i14 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i14 >= 0) {
                iMin = Math.min(i14, iMin);
            }
            this.f975l.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i13), View.MeasureSpec.makeMeasureSpec(iMin, i15));
        }
        if (this.f1141e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            int measuredHeight = getChildAt(i17).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i16) {
                i16 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i16);
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.a
    public void setContentHeight(int i10) {
        this.f1141e = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f975l;
        if (view2 != null) {
            removeView(view2);
        }
        this.f975l = view;
        if (view != null && (linearLayout = this.f976m) != null) {
            removeView(linearLayout);
            this.f976m = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f973j = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f972i = charSequence;
        i();
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f981r) {
            requestLayout();
        }
        this.f981r = z10;
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a.f14987j);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        h1 h1VarT = h1.t(context, attributeSet, g.j.f15231y, i10, 0);
        androidx.core.view.z0.K(this, h1VarT.f(g.j.f15236z));
        this.f979p = h1VarT.m(g.j.D, 0);
        this.f980q = h1VarT.m(g.j.C, 0);
        this.f1141e = h1VarT.l(g.j.B, 0);
        this.f982s = h1VarT.m(g.j.A, g.g.f15079d);
        h1VarT.u();
    }
}
