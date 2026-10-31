package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: ListPopupWindow.java */
/* JADX INFO: loaded from: classes.dex */
public class t0 implements l.e {
    private static Method H;
    private static Method I;
    private final c A;
    private Runnable B;
    final Handler C;
    private final Rect D;
    private Rect E;
    private boolean F;
    PopupWindow G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f1420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ListAdapter f1421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    n0 f1422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1424e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f1425f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f1426g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f1427h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f1428i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f1429j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f1430k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f1431l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f1432m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f1433n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f1434o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int f1435p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private View f1436q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f1437r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private DataSetObserver f1438s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private View f1439t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Drawable f1440u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private AdapterView.OnItemClickListener f1441v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private AdapterView.OnItemSelectedListener f1442w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final g f1443x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final f f1444y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final e f1445z;

    /* JADX INFO: compiled from: ListPopupWindow.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewR = t0.this.r();
            if (viewR == null || viewR.getWindowToken() == null) {
                return;
            }
            t0.this.show();
        }
    }

    /* JADX INFO: compiled from: ListPopupWindow.java */
    private class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            t0.this.p();
        }
    }

    /* JADX INFO: compiled from: ListPopupWindow.java */
    private class d extends DataSetObserver {
        d() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (t0.this.a()) {
                t0.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            t0.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: ListPopupWindow.java */
    private class f implements View.OnTouchListener {
        f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = t0.this.G) != null && popupWindow.isShowing() && x10 >= 0 && x10 < t0.this.G.getWidth() && y10 >= 0 && y10 < t0.this.G.getHeight()) {
                t0 t0Var = t0.this;
                t0Var.C.postDelayed(t0Var.f1443x, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            t0 t0Var2 = t0.this;
            t0Var2.C.removeCallbacks(t0Var2.f1443x);
            return false;
        }
    }

    /* JADX INFO: compiled from: ListPopupWindow.java */
    private class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n0 n0Var = t0.this.f1422c;
            if (n0Var == null || !androidx.core.view.z0.x(n0Var) || t0.this.f1422c.getCount() <= t0.this.f1422c.getChildCount()) {
                return;
            }
            int childCount = t0.this.f1422c.getChildCount();
            t0 t0Var = t0.this;
            if (childCount <= t0Var.f1435p) {
                t0Var.G.setInputMethodMode(2);
                t0.this.show();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                H = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                I = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public t0(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    private void H(boolean z10) {
        if (Build.VERSION.SDK_INT > 28) {
            this.G.setIsClippedToScreen(z10);
            return;
        }
        Method method = H;
        if (method != null) {
            try {
                method.invoke(this.G, Boolean.valueOf(z10));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    private int o() {
        int measuredHeight;
        int i10;
        int iMakeMeasureSpec;
        View view;
        int i11;
        if (this.f1422c == null) {
            Context context = this.f1420a;
            this.B = new a();
            n0 n0VarQ = q(context, !this.F);
            this.f1422c = n0VarQ;
            Drawable drawable = this.f1440u;
            if (drawable != null) {
                n0VarQ.setSelector(drawable);
            }
            this.f1422c.setAdapter(this.f1421b);
            this.f1422c.setOnItemClickListener(this.f1441v);
            this.f1422c.setFocusable(true);
            this.f1422c.setFocusableInTouchMode(true);
            this.f1422c.setOnItemSelectedListener(new b());
            this.f1422c.setOnScrollListener(this.f1445z);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f1442w;
            if (onItemSelectedListener != null) {
                this.f1422c.setOnItemSelectedListener(onItemSelectedListener);
            }
            n0 n0Var = this.f1422c;
            View view2 = this.f1436q;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i12 = this.f1437r;
                if (i12 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(n0Var, layoutParams);
                } else if (i12 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f1437r);
                } else {
                    linearLayout.addView(n0Var, layoutParams);
                    linearLayout.addView(view2);
                }
                int i13 = this.f1424e;
                if (i13 >= 0) {
                    i11 = Integer.MIN_VALUE;
                } else {
                    i13 = 0;
                    i11 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i13, i11), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
                view = n0Var;
            }
            this.G.setContentView(view);
        } else {
            View view3 = this.f1436q;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.G.getBackground();
        if (background != null) {
            background.getPadding(this.D);
            Rect rect = this.D;
            int i14 = rect.top;
            i10 = rect.bottom + i14;
            if (!this.f1428i) {
                this.f1426g = -i14;
            }
        } else {
            this.D.setEmpty();
            i10 = 0;
        }
        int iS = s(r(), this.f1426g, this.G.getInputMethodMode() == 2);
        if (this.f1433n || this.f1423d == -1) {
            return iS + i10;
        }
        int i15 = this.f1424e;
        if (i15 == -2) {
            int i16 = this.f1420a.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.D;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i15 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
        } else {
            int i17 = this.f1420a.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.D;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - (rect3.left + rect3.right), 1073741824);
        }
        int iD = this.f1422c.d(iMakeMeasureSpec, 0, -1, iS - measuredHeight, -1);
        if (iD > 0) {
            measuredHeight += i10 + this.f1422c.getPaddingTop() + this.f1422c.getPaddingBottom();
        }
        return iD + measuredHeight;
    }

    private int s(View view, int i10, boolean z10) {
        return this.G.getMaxAvailableHeight(view, i10, z10);
    }

    private void w() {
        View view = this.f1436q;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1436q);
            }
        }
    }

    public void A(int i10) {
        this.f1432m = i10;
    }

    public void B(Rect rect) {
        this.E = rect != null ? new Rect(rect) : null;
    }

    public void C(int i10) {
        this.G.setInputMethodMode(i10);
    }

    public void D(boolean z10) {
        this.F = z10;
        this.G.setFocusable(z10);
    }

    public void E(PopupWindow.OnDismissListener onDismissListener) {
        this.G.setOnDismissListener(onDismissListener);
    }

    public void F(AdapterView.OnItemClickListener onItemClickListener) {
        this.f1441v = onItemClickListener;
    }

    public void G(boolean z10) {
        this.f1431l = true;
        this.f1430k = z10;
    }

    public void I(int i10) {
        this.f1437r = i10;
    }

    public void J(int i10) {
        n0 n0Var = this.f1422c;
        if (!a() || n0Var == null) {
            return;
        }
        n0Var.setListSelectionHidden(false);
        n0Var.setSelection(i10);
        if (n0Var.getChoiceMode() != 0) {
            n0Var.setItemChecked(i10, true);
        }
    }

    public void K(int i10) {
        this.f1424e = i10;
    }

    @Override // l.e
    public boolean a() {
        return this.G.isShowing();
    }

    public int b() {
        return this.f1425f;
    }

    public void d(int i10) {
        this.f1425f = i10;
    }

    @Override // l.e
    public void dismiss() {
        this.G.dismiss();
        w();
        this.G.setContentView(null);
        this.f1422c = null;
        this.C.removeCallbacks(this.f1443x);
    }

    public void g(int i10) {
        this.f1426g = i10;
        this.f1428i = true;
    }

    public Drawable getBackground() {
        return this.G.getBackground();
    }

    public int j() {
        if (this.f1428i) {
            return this.f1426g;
        }
        return 0;
    }

    public void k(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1438s;
        if (dataSetObserver == null) {
            this.f1438s = new d();
        } else {
            ListAdapter listAdapter2 = this.f1421b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1421b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1438s);
        }
        n0 n0Var = this.f1422c;
        if (n0Var != null) {
            n0Var.setAdapter(this.f1421b);
        }
    }

    @Override // l.e
    public ListView m() {
        return this.f1422c;
    }

    public void n(Drawable drawable) {
        this.G.setBackgroundDrawable(drawable);
    }

    public void p() {
        n0 n0Var = this.f1422c;
        if (n0Var != null) {
            n0Var.setListSelectionHidden(true);
            n0Var.requestLayout();
        }
    }

    n0 q(Context context, boolean z10) {
        return new n0(context, z10);
    }

    public View r() {
        return this.f1439t;
    }

    @Override // l.e
    public void show() {
        int iO = o();
        boolean zU = u();
        androidx.core.widget.i.b(this.G, this.f1427h);
        if (this.G.isShowing()) {
            if (androidx.core.view.z0.x(r())) {
                int width = this.f1424e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = r().getWidth();
                }
                int i10 = this.f1423d;
                if (i10 == -1) {
                    if (!zU) {
                        iO = -1;
                    }
                    if (zU) {
                        this.G.setWidth(this.f1424e == -1 ? -1 : 0);
                        this.G.setHeight(0);
                    } else {
                        this.G.setWidth(this.f1424e == -1 ? -1 : 0);
                        this.G.setHeight(-1);
                    }
                } else if (i10 != -2) {
                    iO = i10;
                }
                this.G.setOutsideTouchable((this.f1434o || this.f1433n) ? false : true);
                this.G.update(r(), this.f1425f, this.f1426g, width < 0 ? -1 : width, iO < 0 ? -1 : iO);
                return;
            }
            return;
        }
        int width2 = this.f1424e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = r().getWidth();
        }
        int i11 = this.f1423d;
        if (i11 == -1) {
            iO = -1;
        } else if (i11 != -2) {
            iO = i11;
        }
        this.G.setWidth(width2);
        this.G.setHeight(iO);
        H(true);
        this.G.setOutsideTouchable((this.f1434o || this.f1433n) ? false : true);
        this.G.setTouchInterceptor(this.f1444y);
        if (this.f1431l) {
            androidx.core.widget.i.a(this.G, this.f1430k);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = I;
            if (method != null) {
                try {
                    method.invoke(this.G, this.E);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            this.G.setEpicenterBounds(this.E);
        }
        androidx.core.widget.i.c(this.G, r(), this.f1425f, this.f1426g, this.f1432m);
        this.f1422c.setSelection(-1);
        if (!this.F || this.f1422c.isInTouchMode()) {
            p();
        }
        if (this.F) {
            return;
        }
        this.C.post(this.A);
    }

    public int t() {
        return this.f1424e;
    }

    public boolean u() {
        return this.G.getInputMethodMode() == 2;
    }

    public boolean v() {
        return this.F;
    }

    public void x(View view) {
        this.f1439t = view;
    }

    public void y(int i10) {
        this.G.setAnimationStyle(i10);
    }

    public void z(int i10) {
        Drawable background = this.G.getBackground();
        if (background == null) {
            K(i10);
            return;
        }
        background.getPadding(this.D);
        Rect rect = this.D;
        this.f1424e = rect.left + rect.right + i10;
    }

    public t0(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f1423d = -2;
        this.f1424e = -2;
        this.f1427h = 1002;
        this.f1429j = true;
        this.f1432m = 0;
        this.f1433n = false;
        this.f1434o = false;
        this.f1435p = Integer.MAX_VALUE;
        this.f1437r = 0;
        this.f1443x = new g();
        this.f1444y = new f();
        this.f1445z = new e();
        this.A = new c();
        this.D = new Rect();
        this.f1420a = context;
        this.C = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.j.f15183o1, i10, i11);
        this.f1425f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(g.j.f15188p1, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(g.j.f15193q1, 0);
        this.f1426g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1428i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        p pVar = new p(context, attributeSet, i10, i11);
        this.G = pVar;
        pVar.setInputMethodMode(1);
    }

    /* JADX INFO: compiled from: ListPopupWindow.java */
    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            n0 n0Var;
            if (i10 == -1 || (n0Var = t0.this.f1422c) == null) {
                return;
            }
            n0Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: compiled from: ListPopupWindow.java */
    private class e implements AbsListView.OnScrollListener {
        e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
            if (i10 != 1 || t0.this.u() || t0.this.G.getContentView() == null) {
                return;
            }
            t0 t0Var = t0.this;
            t0Var.C.removeCallbacks(t0Var.f1443x);
            t0.this.f1443x.run();
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }
    }
}
