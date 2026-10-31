package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.x2;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: DropDownListView.java */
/* JADX INFO: loaded from: classes.dex */
class n0 extends ListView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f1360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f1365f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Field f1366g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f1367h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f1368i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f1369j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f1370k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private x2 f1371l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private androidx.core.widget.h f1372m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    b f1373n;

    /* JADX INFO: compiled from: DropDownListView.java */
    private static class a extends i.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f1374b;

        a(Drawable drawable) {
            super(drawable);
            this.f1374b = true;
        }

        void c(boolean z10) {
            this.f1374b = z10;
        }

        @Override // i.a, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f1374b) {
                super.draw(canvas);
            }
        }

        @Override // i.a, android.graphics.drawable.Drawable
        public void setHotspot(float f10, float f11) {
            if (this.f1374b) {
                super.setHotspot(f10, f11);
            }
        }

        @Override // i.a, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i10, int i11, int i12, int i13) {
            if (this.f1374b) {
                super.setHotspotBounds(i10, i11, i12, i13);
            }
        }

        @Override // i.a, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f1374b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // i.a, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z10, boolean z11) {
            if (this.f1374b) {
                return super.setVisible(z10, z11);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: DropDownListView.java */
    private class b implements Runnable {
        b() {
        }

        public void a() {
            n0 n0Var = n0.this;
            n0Var.f1373n = null;
            n0Var.removeCallbacks(this);
        }

        public void c() {
            n0.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            n0 n0Var = n0.this;
            n0Var.f1373n = null;
            n0Var.drawableStateChanged();
        }
    }

    n0(Context context, boolean z10) {
        super(context, null, g.a.f15003z);
        this.f1360a = new Rect();
        this.f1361b = 0;
        this.f1362c = 0;
        this.f1363d = 0;
        this.f1364e = 0;
        this.f1369j = z10;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1366g = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e10) {
            e10.printStackTrace();
        }
    }

    private void a() {
        this.f1370k = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f1365f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        x2 x2Var = this.f1371l;
        if (x2Var != null) {
            x2Var.c();
            this.f1371l = null;
        }
    }

    private void b(View view, int i10) {
        performItemClick(view, i10, getItemIdAtPosition(i10));
    }

    private void c(Canvas canvas) {
        Drawable selector;
        if (this.f1360a.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f1360a);
        selector.draw(canvas);
    }

    private void f(int i10, View view) {
        Rect rect = this.f1360a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1361b;
        rect.top -= this.f1362c;
        rect.right += this.f1363d;
        rect.bottom += this.f1364e;
        try {
            boolean z10 = this.f1366g.getBoolean(this);
            if (view.isEnabled() != z10) {
                this.f1366g.set(this, Boolean.valueOf(!z10));
                if (i10 != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
        }
    }

    private void g(int i10, View view) {
        Drawable selector = getSelector();
        boolean z10 = (selector == null || i10 == -1) ? false : true;
        if (z10) {
            selector.setVisible(false, false);
        }
        f(i10, view);
        if (z10) {
            Rect rect = this.f1360a;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            androidx.core.graphics.drawable.a.d(selector, fExactCenterX, fExactCenterY);
        }
    }

    private void h(int i10, View view, float f10, float f11) {
        g(i10, view);
        Drawable selector = getSelector();
        if (selector == null || i10 == -1) {
            return;
        }
        androidx.core.graphics.drawable.a.d(selector, f10, f11);
    }

    private void i(View view, int i10, float f10, float f11) {
        View childAt;
        this.f1370k = true;
        drawableHotspotChanged(f10, f11);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i11 = this.f1365f;
        if (i11 != -1 && (childAt = getChildAt(i11 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f1365f = i10;
        view.drawableHotspotChanged(f10 - view.getLeft(), f11 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i10, view, f10, f11);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    private boolean j() {
        return this.f1370k;
    }

    private void k() {
        Drawable selector = getSelector();
        if (selector != null && j() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z10) {
        a aVar = this.f1367h;
        if (aVar != null) {
            aVar.c(z10);
        }
    }

    public int d(int i10, int i11, int i12, int i13, int i14) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        View view = null;
        while (i15 < count) {
            int itemViewType = adapter.getItemViewType(i15);
            if (itemViewType != i16) {
                view = null;
                i16 = itemViewType;
            }
            view = adapter.getView(i15, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i18 = layoutParams.height;
            view.measure(i10, i18 > 0 ? View.MeasureSpec.makeMeasureSpec(i18, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i15 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i13) {
                return (i14 < 0 || i15 <= i14 || i17 <= 0 || measuredHeight == i13) ? i13 : i17;
            }
            if (i14 >= 0 && i15 >= i14) {
                i17 = measuredHeight;
            }
            i15++;
        }
        return measuredHeight;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f1373n != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        k();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    /* JADX WARN: Code duplicated, block: B:31:0x0069  */
    /* JADX WARN: Code duplicated, block: B:9:0x0011  */
    public boolean e(MotionEvent motionEvent, int i10) {
        boolean z10;
        boolean z11;
        androidx.core.widget.h hVar;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            z10 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z10 = true;
                    z11 = false;
                } else {
                    z11 = false;
                    z10 = false;
                }
                if (z10 || z11) {
                    a();
                }
                if (z10) {
                    if (this.f1372m == null) {
                        this.f1372m = new androidx.core.widget.h(this);
                    }
                    this.f1372m.m(true);
                    this.f1372m.onTouch(this, motionEvent);
                } else {
                    hVar = this.f1372m;
                    if (hVar != null) {
                        hVar.m(false);
                    }
                }
                return z10;
            }
            z10 = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i10);
        if (iFindPointerIndex < 0) {
            z11 = false;
            z10 = false;
        } else {
            int x10 = (int) motionEvent.getX(iFindPointerIndex);
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x10, y10);
            if (iPointToPosition == -1) {
                z11 = true;
            } else {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                i(childAt, iPointToPosition, x10, y10);
                if (actionMasked == 1) {
                    b(childAt, iPointToPosition);
                }
                z10 = true;
                z11 = false;
            }
        }
        if (z10) {
            a();
        } else {
            a();
        }
        if (z10) {
            if (this.f1372m == null) {
                this.f1372m = new androidx.core.widget.h(this);
            }
            this.f1372m.m(true);
            this.f1372m.onTouch(this, motionEvent);
        } else {
            hVar = this.f1372m;
            if (hVar != null) {
                hVar.m(false);
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f1369j || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f1369j || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f1369j || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f1369j && this.f1368i) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f1373n = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1373n == null) {
            b bVar = new b();
            this.f1373n = bVar;
            bVar.c();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                }
                k();
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1365f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.f1373n;
        if (bVar != null) {
            bVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    void setListSelectionHidden(boolean z10) {
        this.f1368i = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.f1367h = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1361b = rect.left;
        this.f1362c = rect.top;
        this.f1363d = rect.right;
        this.f1364e = rect.bottom;
    }
}
