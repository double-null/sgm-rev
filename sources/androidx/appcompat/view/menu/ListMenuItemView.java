package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.h1;
import androidx.core.view.z0;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RadioButton f790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TextView f791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CheckBox f792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ImageView f794g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ImageView f795h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private LinearLayout f796i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Drawable f797j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f798k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Context f799l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f800m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Drawable f801n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f802o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f803p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private LayoutInflater f804q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f805r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a.C);
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i10) {
        LinearLayout linearLayout = this.f796i;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    private void e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(g.g.f15083h, (ViewGroup) this, false);
        this.f792e = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(g.g.f15084i, (ViewGroup) this, false);
        this.f789b = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(g.g.f15086k, (ViewGroup) this, false);
        this.f790c = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f804q == null) {
            this.f804q = LayoutInflater.from(getContext());
        }
        return this.f804q;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f794g;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f795h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f795h.getLayoutParams();
        rect.top += this.f795h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void c(g gVar, int i10) {
        this.f788a = gVar;
        this.f803p = i10;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.i(this));
        setCheckable(gVar.isCheckable());
        h(gVar.A(), gVar.g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f788a;
    }

    public void h(boolean z10, char c10) {
        int i10 = (z10 && this.f788a.A()) ? 0 : 8;
        if (i10 == 0) {
            this.f793f.setText(this.f788a.h());
        }
        if (this.f793f.getVisibility() != i10) {
            this.f793f.setVisibility(i10);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        z0.K(this, this.f797j);
        TextView textView = (TextView) findViewById(g.f.M);
        this.f791d = textView;
        int i10 = this.f798k;
        if (i10 != -1) {
            textView.setTextAppearance(this.f799l, i10);
        }
        this.f793f = (TextView) findViewById(g.f.F);
        ImageView imageView = (ImageView) findViewById(g.f.I);
        this.f794g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f801n);
        }
        this.f795h = (ImageView) findViewById(g.f.f15067r);
        this.f796i = (LinearLayout) findViewById(g.f.f15061l);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f789b != null && this.f800m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f789b.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.f790c == null && this.f792e == null) {
            return;
        }
        if (this.f788a.m()) {
            if (this.f790c == null) {
                g();
            }
            compoundButton = this.f790c;
            view = this.f792e;
        } else {
            if (this.f792e == null) {
                e();
            }
            compoundButton = this.f792e;
            view = this.f790c;
        }
        if (z10) {
            compoundButton.setChecked(this.f788a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f792e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f790c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f788a.m()) {
            if (this.f790c == null) {
                g();
            }
            compoundButton = this.f790c;
        } else {
            if (this.f792e == null) {
                e();
            }
            compoundButton = this.f792e;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f805r = z10;
        this.f800m = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f795h;
        if (imageView != null) {
            imageView.setVisibility((this.f802o || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z10 = this.f788a.z() || this.f805r;
        if (z10 || this.f800m) {
            ImageView imageView = this.f789b;
            if (imageView == null && drawable == null && !this.f800m) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f800m) {
                this.f789b.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f789b;
            if (!z10) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f789b.getVisibility() != 0) {
                this.f789b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f791d.getVisibility() != 8) {
                this.f791d.setVisibility(8);
            }
        } else {
            this.f791d.setText(charSequence);
            if (this.f791d.getVisibility() != 0) {
                this.f791d.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        h1 h1VarT = h1.t(getContext(), attributeSet, g.j.W1, i10, 0);
        this.f797j = h1VarT.f(g.j.Y1);
        this.f798k = h1VarT.m(g.j.X1, -1);
        this.f800m = h1VarT.a(g.j.Z1, false);
        this.f799l = context;
        this.f801n = h1VarT.f(g.j.f15114a2);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, g.a.f15003z, 0);
        this.f802o = typedArrayObtainStyledAttributes.hasValue(0);
        h1VarT.u();
        typedArrayObtainStyledAttributes.recycle();
    }
}
