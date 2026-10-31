package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: compiled from: AppCompatBackgroundHelper.java */
/* JADX INFO: loaded from: classes.dex */
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f1228a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f1 f1231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f1 f1232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f1 f1233f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1230c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f1229b = j.b();

    e(View view) {
        this.f1228a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f1233f == null) {
            this.f1233f = new f1();
        }
        f1 f1Var = this.f1233f;
        f1Var.a();
        ColorStateList colorStateListI = androidx.core.view.z0.i(this.f1228a);
        if (colorStateListI != null) {
            f1Var.f1266d = true;
            f1Var.f1263a = colorStateListI;
        }
        PorterDuff.Mode modeJ = androidx.core.view.z0.j(this.f1228a);
        if (modeJ != null) {
            f1Var.f1265c = true;
            f1Var.f1264b = modeJ;
        }
        if (!f1Var.f1266d && !f1Var.f1265c) {
            return false;
        }
        j.i(drawable, f1Var, this.f1228a.getDrawableState());
        return true;
    }

    private boolean k() {
        return this.f1231d != null;
    }

    void b() {
        Drawable background = this.f1228a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            f1 f1Var = this.f1232e;
            if (f1Var != null) {
                j.i(background, f1Var, this.f1228a.getDrawableState());
                return;
            }
            f1 f1Var2 = this.f1231d;
            if (f1Var2 != null) {
                j.i(background, f1Var2, this.f1228a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        f1 f1Var = this.f1232e;
        if (f1Var != null) {
            return f1Var.f1263a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        f1 f1Var = this.f1232e;
        if (f1Var != null) {
            return f1Var.f1264b;
        }
        return null;
    }

    void e(AttributeSet attributeSet, int i10) {
        h1 h1VarT = h1.t(this.f1228a.getContext(), attributeSet, g.j.A3, i10, 0);
        try {
            int i11 = g.j.B3;
            if (h1VarT.q(i11)) {
                this.f1230c = h1VarT.m(i11, -1);
                ColorStateList colorStateListF = this.f1229b.f(this.f1228a.getContext(), this.f1230c);
                if (colorStateListF != null) {
                    h(colorStateListF);
                }
            }
            int i12 = g.j.C3;
            if (h1VarT.q(i12)) {
                androidx.core.view.z0.L(this.f1228a, h1VarT.c(i12));
            }
            int i13 = g.j.D3;
            if (h1VarT.q(i13)) {
                androidx.core.view.z0.M(this.f1228a, m0.c(h1VarT.j(i13, -1), null));
            }
        } finally {
            h1VarT.u();
        }
    }

    void f(Drawable drawable) {
        this.f1230c = -1;
        h(null);
        b();
    }

    void g(int i10) {
        this.f1230c = i10;
        j jVar = this.f1229b;
        h(jVar != null ? jVar.f(this.f1228a.getContext(), i10) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1231d == null) {
                this.f1231d = new f1();
            }
            f1 f1Var = this.f1231d;
            f1Var.f1263a = colorStateList;
            f1Var.f1266d = true;
        } else {
            this.f1231d = null;
        }
        b();
    }

    void i(ColorStateList colorStateList) {
        if (this.f1232e == null) {
            this.f1232e = new f1();
        }
        f1 f1Var = this.f1232e;
        f1Var.f1263a = colorStateList;
        f1Var.f1266d = true;
        b();
    }

    void j(PorterDuff.Mode mode) {
        if (this.f1232e == null) {
            this.f1232e = new f1();
        }
        f1 f1Var = this.f1232e;
        f1Var.f1264b = mode;
        f1Var.f1265c = true;
        b();
    }
}
