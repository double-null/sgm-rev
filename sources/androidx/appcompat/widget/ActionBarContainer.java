package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Drawable f966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Drawable f967f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Drawable f968g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f969h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f970i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f971j;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        androidx.core.view.z0.K(this, new b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.j.f15111a);
        this.f966e = typedArrayObtainStyledAttributes.getDrawable(g.j.f15116b);
        this.f967f = typedArrayObtainStyledAttributes.getDrawable(g.j.f15126d);
        this.f971j = typedArrayObtainStyledAttributes.getDimensionPixelSize(g.j.f15156j, -1);
        boolean z10 = true;
        if (getId() == g.f.H) {
            this.f969h = true;
            this.f968g = typedArrayObtainStyledAttributes.getDrawable(g.j.f15121c);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f969h ? this.f966e != null || this.f967f != null : this.f968g != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f966e;
        if (drawable != null && drawable.isStateful()) {
            this.f966e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f967f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f967f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f968g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f968g.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f963b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f966e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f967f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f968g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f964c = findViewById(g.f.f15050a);
        this.f965d = findViewById(g.f.f15055f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f962a || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048 A[PHI: r0
      0x0048: PHI (r0v8 boolean) = (r0v1 boolean), (r0v1 boolean), (r0v0 boolean) binds: [B:31:0x00a5, B:33:0x00a9, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Drawable drawable;
        super.onLayout(z10, i10, i11, i12, i13);
        View view = this.f963b;
        boolean z11 = true;
        boolean z12 = false;
        boolean z13 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i14 = layoutParams.bottomMargin;
            view.layout(i10, measuredHeight2 - i14, i12, measuredHeight - i14);
        }
        if (this.f969h) {
            Drawable drawable2 = this.f968g;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z11 = z12;
            }
        } else {
            if (this.f966e != null) {
                if (this.f964c.getVisibility() == 0) {
                    this.f966e.setBounds(this.f964c.getLeft(), this.f964c.getTop(), this.f964c.getRight(), this.f964c.getBottom());
                } else {
                    View view2 = this.f965d;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f966e.setBounds(0, 0, 0, 0);
                    } else {
                        this.f966e.setBounds(this.f965d.getLeft(), this.f965d.getTop(), this.f965d.getRight(), this.f965d.getBottom());
                    }
                }
                z12 = true;
            }
            this.f970i = z13;
            if (!z13 || (drawable = this.f967f) == null) {
                z11 = z12;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z11) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int iA;
        int i12;
        if (this.f964c == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.f971j) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f964c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        View view = this.f963b;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        if (b(this.f964c)) {
            iA = !b(this.f965d) ? a(this.f965d) : 0;
        } else {
            iA = a(this.f964c);
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(iA + a(this.f963b), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i11) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f966e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f966e);
        }
        this.f966e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f964c;
            if (view != null) {
                this.f966e.setBounds(view.getLeft(), this.f964c.getTop(), this.f964c.getRight(), this.f964c.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f969h ? this.f966e != null || this.f967f != null : this.f968g != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f968g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f968g);
        }
        this.f968g = drawable;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f969h && (drawable2 = this.f968g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f969h ? !(this.f966e != null || this.f967f != null) : this.f968g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f967f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f967f);
        }
        this.f967f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f970i && (drawable2 = this.f967f) != null) {
                drawable2.setBounds(this.f963b.getLeft(), this.f963b.getTop(), this.f963b.getRight(), this.f963b.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f969h ? this.f966e != null || this.f967f != null : this.f968g != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(a1 a1Var) {
        View view = this.f963b;
        if (view != null) {
            removeView(view);
        }
        this.f963b = a1Var;
        if (a1Var != null) {
            addView(a1Var);
            ViewGroup.LayoutParams layoutParams = a1Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            a1Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z10) {
        this.f962a = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f966e;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f967f;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f968g;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f966e && !this.f969h) || (drawable == this.f967f && this.f970i) || ((drawable == this.f968g && this.f969h) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }
}
