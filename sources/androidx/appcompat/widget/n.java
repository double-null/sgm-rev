package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: compiled from: AppCompatImageHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImageView f1356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f1 f1357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f1 f1358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f1 f1359d;

    public n(ImageView imageView) {
        this.f1356a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f1359d == null) {
            this.f1359d = new f1();
        }
        f1 f1Var = this.f1359d;
        f1Var.a();
        ColorStateList colorStateListA = androidx.core.widget.g.a(this.f1356a);
        if (colorStateListA != null) {
            f1Var.f1266d = true;
            f1Var.f1263a = colorStateListA;
        }
        PorterDuff.Mode modeB = androidx.core.widget.g.b(this.f1356a);
        if (modeB != null) {
            f1Var.f1265c = true;
            f1Var.f1264b = modeB;
        }
        if (!f1Var.f1266d && !f1Var.f1265c) {
            return false;
        }
        j.i(drawable, f1Var, this.f1356a.getDrawableState());
        return true;
    }

    private boolean j() {
        return this.f1357b != null;
    }

    void b() {
        Drawable drawable = this.f1356a.getDrawable();
        if (drawable != null) {
            m0.b(drawable);
        }
        if (drawable != null) {
            if (j() && a(drawable)) {
                return;
            }
            f1 f1Var = this.f1358c;
            if (f1Var != null) {
                j.i(drawable, f1Var, this.f1356a.getDrawableState());
                return;
            }
            f1 f1Var2 = this.f1357b;
            if (f1Var2 != null) {
                j.i(drawable, f1Var2, this.f1356a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        f1 f1Var = this.f1358c;
        if (f1Var != null) {
            return f1Var.f1263a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        f1 f1Var = this.f1358c;
        if (f1Var != null) {
            return f1Var.f1264b;
        }
        return null;
    }

    boolean e() {
        return !(this.f1356a.getBackground() instanceof RippleDrawable);
    }

    public void f(AttributeSet attributeSet, int i10) {
        int iM;
        h1 h1VarT = h1.t(this.f1356a.getContext(), attributeSet, g.j.R, i10, 0);
        try {
            Drawable drawable = this.f1356a.getDrawable();
            if (drawable == null && (iM = h1VarT.m(g.j.S, -1)) != -1 && (drawable = h.a.b(this.f1356a.getContext(), iM)) != null) {
                this.f1356a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                m0.b(drawable);
            }
            int i11 = g.j.T;
            if (h1VarT.q(i11)) {
                androidx.core.widget.g.c(this.f1356a, h1VarT.c(i11));
            }
            int i12 = g.j.U;
            if (h1VarT.q(i12)) {
                androidx.core.widget.g.d(this.f1356a, m0.c(h1VarT.j(i12, -1), null));
            }
        } finally {
            h1VarT.u();
        }
    }

    public void g(int i10) {
        if (i10 != 0) {
            Drawable drawableB = h.a.b(this.f1356a.getContext(), i10);
            if (drawableB != null) {
                m0.b(drawableB);
            }
            this.f1356a.setImageDrawable(drawableB);
        } else {
            this.f1356a.setImageDrawable(null);
        }
        b();
    }

    void h(ColorStateList colorStateList) {
        if (this.f1358c == null) {
            this.f1358c = new f1();
        }
        f1 f1Var = this.f1358c;
        f1Var.f1263a = colorStateList;
        f1Var.f1266d = true;
        b();
    }

    void i(PorterDuff.Mode mode) {
        if (this.f1358c == null) {
            this.f1358c = new f1();
        }
        f1 f1Var = this.f1358c;
        f1Var.f1264b = mode;
        f1Var.f1265c = true;
        b();
    }
}
