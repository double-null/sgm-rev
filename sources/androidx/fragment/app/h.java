package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* JADX INFO: compiled from: FragmentContainerView.java */
/* JADX INFO: loaded from: classes.dex */
public final class h extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<View> f2639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<View> f2640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f2641c;

    h(Context context, AttributeSet attributeSet, n nVar) {
        String str;
        super(context, attributeSet);
        this.f2641c = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j0.c.f20534h);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(j0.c.f20535i) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(j0.c.f20536j);
        typedArrayObtainStyledAttributes.recycle();
        int id2 = getId();
        Fragment fragmentG0 = nVar.g0(id2);
        if (classAttribute == null || fragmentG0 != null) {
            return;
        }
        if (id2 > 0) {
            Fragment fragmentA = nVar.p0().a(context.getClassLoader(), classAttribute);
            fragmentA.onInflate(context, attributeSet, (Bundle) null);
            nVar.m().m(true).c(this, fragmentA, string).i();
            return;
        }
        if (string != null) {
            str = " with tag " + string;
        } else {
            str = "";
        }
        throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
    }

    private void a(View view) {
        ArrayList<View> arrayList = this.f2640b;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.f2639a == null) {
            this.f2639a = new ArrayList<>();
        }
        this.f2639a.add(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (n.y0(view) != null) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        if (n.y0(view) != null) {
            return super.addViewInLayout(view, i10, layoutParams, z10);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.f2641c && this.f2639a != null) {
            for (int i10 = 0; i10 < this.f2639a.size(); i10++) {
                super.drawChild(canvas, this.f2639a.get(i10), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        ArrayList<View> arrayList;
        if (!this.f2641c || (arrayList = this.f2639a) == null || arrayList.size() <= 0 || !this.f2639a.contains(view)) {
            return super.drawChild(canvas, view, j10);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f2640b;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f2639a;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f2641c = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            getChildAt(i10).dispatchApplyWindowInsets(new WindowInsets(windowInsets));
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z10) {
        if (z10) {
            a(view);
        }
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i10) {
        a(getChildAt(i10));
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            a(getChildAt(i12));
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            a(getChildAt(i12));
        }
        super.removeViewsInLayout(i10, i11);
    }

    void setDrawDisappearingViewsLast(boolean z10) {
        this.f2641c = z10;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f2640b == null) {
                this.f2640b = new ArrayList<>();
            }
            this.f2640b.add(view);
        }
        super.startViewTransition(view);
    }
}
