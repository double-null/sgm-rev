package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

/* JADX INFO: compiled from: ScrollingTabContainerView.java */
/* JADX INFO: loaded from: classes.dex */
public class a1 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Interpolator f1148j = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Runnable f1149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f1150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    q0 f1151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Spinner f1152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f1153e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f1154f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f1155g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f1156h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f1157i;

    /* JADX INFO: compiled from: ScrollingTabContainerView.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f1158a;

        a(View view) {
            this.f1158a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            a1.this.smoothScrollTo(this.f1158a.getLeft() - ((a1.this.getWidth() - this.f1158a.getWidth()) / 2), 0);
            a1.this.f1149a = null;
        }
    }

    /* JADX INFO: compiled from: ScrollingTabContainerView.java */
    private class b extends BaseAdapter {
        b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return a1.this.f1151c.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            return ((d) a1.this.f1151c.getChildAt(i10)).b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                return a1.this.c((androidx.appcompat.app.a.c) getItem(i10), true);
            }
            ((d) view).a((androidx.appcompat.app.a.c) getItem(i10));
            return view;
        }
    }

    /* JADX INFO: compiled from: ScrollingTabContainerView.java */
    private class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).b().e();
            int childCount = a1.this.f1151c.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = a1.this.f1151c.getChildAt(i10);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* JADX INFO: compiled from: ScrollingTabContainerView.java */
    private class d extends LinearLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int[] f1162a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.appcompat.app.a.c f1163b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private TextView f1164c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ImageView f1165d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private View f1166e;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(Context context, androidx.appcompat.app.a.c cVar, boolean z10) {
            int i10 = g.a.f14981d;
            super(context, null, i10);
            int[] iArr = {R.attr.background};
            this.f1162a = iArr;
            this.f1163b = cVar;
            h1 h1VarT = h1.t(context, null, iArr, i10, 0);
            if (h1VarT.q(0)) {
                setBackgroundDrawable(h1VarT.f(0));
            }
            h1VarT.u();
            if (z10) {
                setGravity(8388627);
            }
            c();
        }

        public void a(androidx.appcompat.app.a.c cVar) {
            this.f1163b = cVar;
            c();
        }

        public androidx.appcompat.app.a.c b() {
            return this.f1163b;
        }

        public void c() {
            androidx.appcompat.app.a.c cVar = this.f1163b;
            View viewB = cVar.b();
            if (viewB != null) {
                ViewParent parent = viewB.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewB);
                    }
                    addView(viewB);
                }
                this.f1166e = viewB;
                TextView textView = this.f1164c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1165d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1165d.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f1166e;
            if (view != null) {
                removeView(view);
                this.f1166e = null;
            }
            Drawable drawableC = cVar.c();
            CharSequence charSequenceD = cVar.d();
            if (drawableC != null) {
                if (this.f1165d == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f1165d = appCompatImageView;
                }
                this.f1165d.setImageDrawable(drawableC);
                this.f1165d.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1165d;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1165d.setImageDrawable(null);
                }
            }
            boolean z10 = !TextUtils.isEmpty(charSequenceD);
            if (z10) {
                if (this.f1164c == null) {
                    f0 f0Var = new f0(getContext(), null, g.a.f14982e);
                    f0Var.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    f0Var.setLayoutParams(layoutParams2);
                    addView(f0Var);
                    this.f1164c = f0Var;
                }
                this.f1164c.setText(charSequenceD);
                this.f1164c.setVisibility(0);
            } else {
                TextView textView2 = this.f1164c;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1164c.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1165d;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            k1.a(this, z10 ? null : cVar.a());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (a1.this.f1154f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = a1.this.f1154f;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            boolean z11 = isSelected() != z10;
            super.setSelected(z10);
            if (z11 && z10) {
                sendAccessibilityEvent(4);
            }
        }
    }

    private Spinner b() {
        v vVar = new v(getContext(), null, g.a.f14985h);
        vVar.setLayoutParams(new q0.a(-2, -1));
        vVar.setOnItemSelectedListener(this);
        return vVar;
    }

    private boolean d() {
        Spinner spinner = this.f1152d;
        return spinner != null && spinner.getParent() == this;
    }

    private void e() {
        if (d()) {
            return;
        }
        if (this.f1152d == null) {
            this.f1152d = b();
        }
        removeView(this.f1151c);
        addView(this.f1152d, new ViewGroup.LayoutParams(-2, -1));
        if (this.f1152d.getAdapter() == null) {
            this.f1152d.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f1149a;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f1149a = null;
        }
        this.f1152d.setSelection(this.f1157i);
    }

    private boolean f() {
        if (!d()) {
            return false;
        }
        removeView(this.f1152d);
        addView(this.f1151c, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1152d.getSelectedItemPosition());
        return false;
    }

    public void a(int i10) {
        View childAt = this.f1151c.getChildAt(i10);
        Runnable runnable = this.f1149a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f1149a = aVar;
        post(aVar);
    }

    d c(androidx.appcompat.app.a.c cVar, boolean z10) {
        d dVar = new d(getContext(), cVar, z10);
        if (z10) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1156h));
        } else {
            dVar.setFocusable(true);
            if (this.f1150b == null) {
                this.f1150b = new c();
            }
            dVar.setOnClickListener(this.f1150b);
        }
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1149a;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        k.a aVarB = k.a.b(getContext());
        setContentHeight(aVarB.f());
        this.f1155g = aVarB.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1149a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        ((d) view).b().e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        boolean z10 = mode == 1073741824;
        setFillViewport(z10);
        int childCount = this.f1151c.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f1154f = -1;
        } else {
            if (childCount > 2) {
                this.f1154f = (int) (View.MeasureSpec.getSize(i10) * 0.4f);
            } else {
                this.f1154f = View.MeasureSpec.getSize(i10) / 2;
            }
            this.f1154f = Math.min(this.f1154f, this.f1155g);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1156h, 1073741824);
        if (!z10 && this.f1153e) {
            this.f1151c.measure(0, iMakeMeasureSpec);
            if (this.f1151c.getMeasuredWidth() > View.MeasureSpec.getSize(i10)) {
                e();
            } else {
                f();
            }
        } else {
            f();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i10, iMakeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z10 || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.f1157i);
    }

    public void setAllowCollapse(boolean z10) {
        this.f1153e = z10;
    }

    public void setContentHeight(int i10) {
        this.f1156h = i10;
        requestLayout();
    }

    public void setTabSelected(int i10) {
        this.f1157i = i10;
        int childCount = this.f1151c.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = this.f1151c.getChildAt(i11);
            boolean z10 = i11 == i10;
            childAt.setSelected(z10);
            if (z10) {
                a(i10);
            }
            i11++;
        }
        Spinner spinner = this.f1152d;
        if (spinner == null || i10 < 0) {
            return;
        }
        spinner.setSelection(i10);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
