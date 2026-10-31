package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.f0;
import androidx.appcompat.widget.k1;
import androidx.appcompat.widget.p0;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends f0 implements k.a, View.OnClickListener, ActionMenuView.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    g f773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CharSequence f774f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable f775g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    e.b f776h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p0 f777i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    b f778j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f779k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f780l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f781m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f782n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f783o;

    private class a extends p0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.p0
        public l.e b() {
            b bVar = ActionMenuItemView.this.f778j;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.p0
        protected boolean c() {
            l.e eVarB;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.f776h;
            return bVar != null && bVar.b(actionMenuItemView.f773e) && (eVarB = b()) != null && eVarB.a();
        }
    }

    public static abstract class b {
        public abstract l.e a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        return i10 >= 480 || (i10 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void h() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f774f);
        if (this.f775g != null && (!this.f773e.B() || (!this.f779k && !this.f780l))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.f774f : null);
        CharSequence contentDescription = this.f773e.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z12 ? null : this.f773e.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f773e.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            k1.a(this, z12 ? null : this.f773e.getTitle());
        } else {
            k1.a(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return f();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return f() && this.f773e.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void c(g gVar, int i10) {
        this.f773e = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.i(this));
        setId(gVar.getItemId());
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.f777i == null) {
            this.f777i = new a();
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean d() {
        return true;
    }

    public boolean f() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f773e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e.b bVar = this.f776h;
        if (bVar != null) {
            bVar.b(this.f773e);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f779k = g();
        h();
    }

    @Override // androidx.appcompat.widget.f0, android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        boolean zF = f();
        if (zF && (i12 = this.f782n) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f781m) : this.f781m;
        if (mode != 1073741824 && this.f781m > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i11);
        }
        if (zF || this.f775g == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f775g.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        p0 p0Var;
        if (this.f773e.hasSubMenu() && (p0Var = this.f777i) != null && p0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f780l != z10) {
            this.f780l = z10;
            g gVar = this.f773e;
            if (gVar != null) {
                gVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f775g = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f783o;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(e.b bVar) {
        this.f776h = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f782n = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f778j = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f774f = charSequence;
        h();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f779k = g();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.j.f15216v, i10, 0);
        this.f781m = typedArrayObtainStyledAttributes.getDimensionPixelSize(g.j.f15221w, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f783o = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f782n = -1;
        setSaveEnabled(false);
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }
}
