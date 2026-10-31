package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.x2;
import androidx.core.view.y2;

/* JADX INFO: compiled from: AbsActionBarView.java */
/* JADX INFO: loaded from: classes.dex */
abstract class a extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final C0017a f1137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Context f1138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected ActionMenuView f1139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected c f1140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f1141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected x2 f1142f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f1143g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1144h;

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbsActionBarView.java */
    protected class C0017a implements y2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f1145a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f1146b;

        protected C0017a() {
        }

        @Override // androidx.core.view.y2
        public void a(View view) {
            this.f1145a = true;
        }

        @Override // androidx.core.view.y2
        public void b(View view) {
            if (this.f1145a) {
                return;
            }
            a aVar = a.this;
            aVar.f1142f = null;
            a.super.setVisibility(this.f1146b);
        }

        @Override // androidx.core.view.y2
        public void c(View view) {
            a.super.setVisibility(0);
            this.f1145a = false;
        }

        public C0017a d(x2 x2Var, int i10) {
            a.this.f1142f = x2Var;
            this.f1146b = i10;
            return this;
        }
    }

    a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    protected static int d(int i10, int i11, boolean z10) {
        return z10 ? i10 - i11 : i10 + i11;
    }

    protected int c(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    protected int e(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = i11 + ((i12 - measuredHeight) / 2);
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public x2 f(int i10, long j10) {
        x2 x2Var = this.f1142f;
        if (x2Var != null) {
            x2Var.c();
        }
        if (i10 != 0) {
            x2 x2VarB = androidx.core.view.z0.b(this).b(0.0f);
            x2VarB.f(j10);
            x2VarB.h(this.f1137a.d(x2VarB, i10));
            return x2VarB;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        x2 x2VarB2 = androidx.core.view.z0.b(this).b(1.0f);
        x2VarB2.f(j10);
        x2VarB2.h(this.f1137a.d(x2VarB2, i10));
        return x2VarB2;
    }

    public int getAnimatedVisibility() {
        return this.f1142f != null ? this.f1137a.f1146b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1141e;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, g.j.f15111a, g.a.f14980c, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(g.j.f15156j, 0));
        typedArrayObtainStyledAttributes.recycle();
        c cVar = this.f1140d;
        if (cVar != null) {
            cVar.E(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1144h = false;
        }
        if (!this.f1144h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f1144h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1144h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1143g = false;
        }
        if (!this.f1143g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f1143g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1143g = false;
        }
        return true;
    }

    public void setContentHeight(int i10) {
        this.f1141e = i10;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            x2 x2Var = this.f1142f;
            if (x2Var != null) {
                x2Var.c();
            }
            super.setVisibility(i10);
        }
    }

    a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1137a = new C0017a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(g.a.f14978a, typedValue, true) || typedValue.resourceId == 0) {
            this.f1138b = context;
        } else {
            this.f1138b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
