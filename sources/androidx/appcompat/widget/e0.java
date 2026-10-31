package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: AppCompatTextHelper.java */
/* JADX INFO: loaded from: classes.dex */
class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f1234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f1 f1235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f1 f1236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f1 f1237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f1 f1238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f1 f1239f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f1 f1240g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private f1 f1241h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final i0 f1242i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f1243j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f1244k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Typeface f1245l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f1246m;

    e0(TextView textView) {
        this.f1234a = textView;
        this.f1242i = new i0(textView);
    }

    private void A(int i10, float f10) {
        this.f1242i.u(i10, f10);
    }

    private void C(Context context, h1 h1Var) {
        String strN;
        this.f1243j = h1Var.j(g.j.M2, this.f1243j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int iJ = h1Var.j(g.j.O2, -1);
            this.f1244k = iJ;
            if (iJ != -1) {
                this.f1243j = (this.f1243j & 2) | 0;
            }
        }
        int i11 = g.j.N2;
        if (!h1Var.q(i11) && !h1Var.q(g.j.P2)) {
            int i12 = g.j.L2;
            if (h1Var.q(i12)) {
                this.f1246m = false;
                int iJ2 = h1Var.j(i12, 1);
                if (iJ2 == 1) {
                    this.f1245l = Typeface.SANS_SERIF;
                    return;
                } else if (iJ2 == 2) {
                    this.f1245l = Typeface.SERIF;
                    return;
                } else {
                    if (iJ2 != 3) {
                        return;
                    }
                    this.f1245l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f1245l = null;
        int i13 = g.j.P2;
        if (h1Var.q(i13)) {
            i11 = i13;
        }
        int i14 = this.f1244k;
        int i15 = this.f1243j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceI = h1Var.i(i11, this.f1243j, new a(this, i14, i15));
                if (typefaceI != null) {
                    if (i10 < 28 || this.f1244k == -1) {
                        this.f1245l = typefaceI;
                    } else {
                        this.f1245l = Typeface.create(Typeface.create(typefaceI, 0), this.f1244k, (this.f1243j & 2) != 0);
                    }
                }
                this.f1246m = this.f1245l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1245l != null || (strN = h1Var.n(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f1244k == -1) {
            this.f1245l = Typeface.create(strN, this.f1243j);
        } else {
            this.f1245l = Typeface.create(Typeface.create(strN, 0), this.f1244k, (this.f1243j & 2) != 0);
        }
    }

    private void a(Drawable drawable, f1 f1Var) {
        if (drawable == null || f1Var == null) {
            return;
        }
        j.i(drawable, f1Var, this.f1234a.getDrawableState());
    }

    private static f1 d(Context context, j jVar, int i10) {
        ColorStateList colorStateListF = jVar.f(context, i10);
        if (colorStateListF == null) {
            return null;
        }
        f1 f1Var = new f1();
        f1Var.f1266d = true;
        f1Var.f1263a = colorStateListF;
        return f1Var;
    }

    private void x(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f1234a.getCompoundDrawablesRelative();
            TextView textView = this.f1234a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f1234a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            TextView textView2 = this.f1234a;
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            Drawable drawable8 = compoundDrawablesRelative2[2];
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f1234a.getCompoundDrawables();
        TextView textView3 = this.f1234a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void y() {
        f1 f1Var = this.f1241h;
        this.f1235b = f1Var;
        this.f1236c = f1Var;
        this.f1237d = f1Var;
        this.f1238e = f1Var;
        this.f1239f = f1Var;
        this.f1240g = f1Var;
    }

    public void B(Typeface typeface) {
        if (this.f1246m) {
            this.f1234a.setTypeface(typeface);
            this.f1245l = typeface;
        }
    }

    void b() {
        if (this.f1235b != null || this.f1236c != null || this.f1237d != null || this.f1238e != null) {
            Drawable[] compoundDrawables = this.f1234a.getCompoundDrawables();
            a(compoundDrawables[0], this.f1235b);
            a(compoundDrawables[1], this.f1236c);
            a(compoundDrawables[2], this.f1237d);
            a(compoundDrawables[3], this.f1238e);
        }
        if (this.f1239f == null && this.f1240g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f1234a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f1239f);
        a(compoundDrawablesRelative[2], this.f1240g);
    }

    void c() {
        this.f1242i.a();
    }

    int e() {
        return this.f1242i.g();
    }

    int f() {
        return this.f1242i.h();
    }

    int g() {
        return this.f1242i.i();
    }

    int[] h() {
        return this.f1242i.j();
    }

    int i() {
        return this.f1242i.k();
    }

    ColorStateList j() {
        f1 f1Var = this.f1241h;
        if (f1Var != null) {
            return f1Var.f1263a;
        }
        return null;
    }

    PorterDuff.Mode k() {
        f1 f1Var = this.f1241h;
        if (f1Var != null) {
            return f1Var.f1264b;
        }
        return null;
    }

    boolean l() {
        return this.f1242i.o();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d3  */
    void m(AttributeSet attributeSet, int i10) {
        boolean zA;
        boolean z10;
        String strN;
        String strN2;
        Context context = this.f1234a.getContext();
        j jVarB = j.b();
        h1 h1VarT = h1.t(context, attributeSet, g.j.f15112a0, i10, 0);
        int iM = h1VarT.m(g.j.f15117b0, -1);
        int i11 = g.j.f15132e0;
        if (h1VarT.q(i11)) {
            this.f1235b = d(context, jVarB, h1VarT.m(i11, 0));
        }
        int i12 = g.j.f15122c0;
        if (h1VarT.q(i12)) {
            this.f1236c = d(context, jVarB, h1VarT.m(i12, 0));
        }
        int i13 = g.j.f15137f0;
        if (h1VarT.q(i13)) {
            this.f1237d = d(context, jVarB, h1VarT.m(i13, 0));
        }
        int i14 = g.j.f15127d0;
        if (h1VarT.q(i14)) {
            this.f1238e = d(context, jVarB, h1VarT.m(i14, 0));
        }
        int i15 = Build.VERSION.SDK_INT;
        int i16 = g.j.f15142g0;
        if (h1VarT.q(i16)) {
            this.f1239f = d(context, jVarB, h1VarT.m(i16, 0));
        }
        int i17 = g.j.f15147h0;
        if (h1VarT.q(i17)) {
            this.f1240g = d(context, jVarB, h1VarT.m(i17, 0));
        }
        h1VarT.u();
        boolean z11 = this.f1234a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (iM != -1) {
            h1 h1VarR = h1.r(context, iM, g.j.J2);
            if (z11) {
                zA = false;
                z10 = false;
            } else {
                int i18 = g.j.R2;
                if (h1VarR.q(i18)) {
                    zA = h1VarR.a(i18, false);
                    z10 = true;
                } else {
                    zA = false;
                    z10 = false;
                }
            }
            C(context, h1VarR);
            int i19 = g.j.S2;
            strN2 = h1VarR.q(i19) ? h1VarR.n(i19) : null;
            if (i15 >= 26) {
                int i20 = g.j.Q2;
                if (h1VarR.q(i20)) {
                    strN = h1VarR.n(i20);
                } else {
                    strN = null;
                }
            } else {
                strN = null;
            }
            h1VarR.u();
        } else {
            zA = false;
            z10 = false;
            strN = null;
            strN2 = null;
        }
        h1 h1VarT2 = h1.t(context, attributeSet, g.j.J2, i10, 0);
        if (!z11) {
            int i21 = g.j.R2;
            if (h1VarT2.q(i21)) {
                zA = h1VarT2.a(i21, false);
                z10 = true;
            }
        }
        int i22 = g.j.S2;
        if (h1VarT2.q(i22)) {
            strN2 = h1VarT2.n(i22);
        }
        if (i15 >= 26) {
            int i23 = g.j.Q2;
            if (h1VarT2.q(i23)) {
                strN = h1VarT2.n(i23);
            }
        }
        if (i15 >= 28) {
            int i24 = g.j.K2;
            if (h1VarT2.q(i24) && h1VarT2.e(i24, -1) == 0) {
                this.f1234a.setTextSize(0, 0.0f);
            }
        }
        C(context, h1VarT2);
        h1VarT2.u();
        if (!z11 && z10) {
            r(zA);
        }
        Typeface typeface = this.f1245l;
        if (typeface != null) {
            if (this.f1244k == -1) {
                this.f1234a.setTypeface(typeface, this.f1243j);
            } else {
                this.f1234a.setTypeface(typeface);
            }
        }
        if (strN != null) {
            this.f1234a.setFontVariationSettings(strN);
        }
        if (strN2 != null) {
            this.f1234a.setTextLocales(LocaleList.forLanguageTags(strN2));
        }
        this.f1242i.p(attributeSet, i10);
        if (androidx.core.widget.b.S8 && this.f1242i.k() != 0) {
            int[] iArrJ = this.f1242i.j();
            if (iArrJ.length > 0) {
                if (this.f1234a.getAutoSizeStepGranularity() != -1.0f) {
                    this.f1234a.setAutoSizeTextTypeUniformWithConfiguration(this.f1242i.h(), this.f1242i.g(), this.f1242i.i(), 0);
                } else {
                    this.f1234a.setAutoSizeTextTypeUniformWithPresetSizes(iArrJ, 0);
                }
            }
        }
        h1 h1VarS = h1.s(context, attributeSet, g.j.f15152i0);
        int iM2 = h1VarS.m(g.j.f15192q0, -1);
        Drawable drawableC = iM2 != -1 ? jVarB.c(context, iM2) : null;
        int iM3 = h1VarS.m(g.j.f15217v0, -1);
        Drawable drawableC2 = iM3 != -1 ? jVarB.c(context, iM3) : null;
        int iM4 = h1VarS.m(g.j.f15197r0, -1);
        Drawable drawableC3 = iM4 != -1 ? jVarB.c(context, iM4) : null;
        int iM5 = h1VarS.m(g.j.f15182o0, -1);
        Drawable drawableC4 = iM5 != -1 ? jVarB.c(context, iM5) : null;
        int iM6 = h1VarS.m(g.j.f15202s0, -1);
        Drawable drawableC5 = iM6 != -1 ? jVarB.c(context, iM6) : null;
        int iM7 = h1VarS.m(g.j.f15187p0, -1);
        x(drawableC, drawableC2, drawableC3, drawableC4, drawableC5, iM7 != -1 ? jVarB.c(context, iM7) : null);
        int i25 = g.j.f15207t0;
        if (h1VarS.q(i25)) {
            androidx.core.widget.j.f(this.f1234a, h1VarS.c(i25));
        }
        int i26 = g.j.f15212u0;
        if (h1VarS.q(i26)) {
            androidx.core.widget.j.g(this.f1234a, m0.c(h1VarS.j(i26, -1), null));
        }
        int iE = h1VarS.e(g.j.f15222w0, -1);
        int iE2 = h1VarS.e(g.j.f15227x0, -1);
        int iE3 = h1VarS.e(g.j.f15232y0, -1);
        h1VarS.u();
        if (iE != -1) {
            androidx.core.widget.j.h(this.f1234a, iE);
        }
        if (iE2 != -1) {
            androidx.core.widget.j.i(this.f1234a, iE2);
        }
        if (iE3 != -1) {
            androidx.core.widget.j.j(this.f1234a, iE3);
        }
    }

    void n(boolean z10, int i10, int i11, int i12, int i13) {
        if (androidx.core.widget.b.S8) {
            return;
        }
        c();
    }

    void o() {
        b();
    }

    void p(Context context, int i10) {
        String strN;
        h1 h1VarR = h1.r(context, i10, g.j.J2);
        int i11 = g.j.R2;
        if (h1VarR.q(i11)) {
            r(h1VarR.a(i11, false));
        }
        int i12 = Build.VERSION.SDK_INT;
        int i13 = g.j.K2;
        if (h1VarR.q(i13) && h1VarR.e(i13, -1) == 0) {
            this.f1234a.setTextSize(0, 0.0f);
        }
        C(context, h1VarR);
        if (i12 >= 26) {
            int i14 = g.j.Q2;
            if (h1VarR.q(i14) && (strN = h1VarR.n(i14)) != null) {
                this.f1234a.setFontVariationSettings(strN);
            }
        }
        h1VarR.u();
        Typeface typeface = this.f1245l;
        if (typeface != null) {
            this.f1234a.setTypeface(typeface, this.f1243j);
        }
    }

    public void q(Runnable runnable) {
        this.f1234a.post(runnable);
    }

    void r(boolean z10) {
        this.f1234a.setAllCaps(z10);
    }

    void s(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        this.f1242i.q(i10, i11, i12, i13);
    }

    void t(int[] iArr, int i10) throws IllegalArgumentException {
        this.f1242i.r(iArr, i10);
    }

    void u(int i10) {
        this.f1242i.s(i10);
    }

    void v(ColorStateList colorStateList) {
        if (this.f1241h == null) {
            this.f1241h = new f1();
        }
        f1 f1Var = this.f1241h;
        f1Var.f1263a = colorStateList;
        f1Var.f1266d = colorStateList != null;
        y();
    }

    void w(PorterDuff.Mode mode) {
        if (this.f1241h == null) {
            this.f1241h = new f1();
        }
        f1 f1Var = this.f1241h;
        f1Var.f1264b = mode;
        f1Var.f1265c = mode != null;
        y();
    }

    void z(int i10, float f10) {
        if (androidx.core.widget.b.S8 || l()) {
            return;
        }
        A(i10, f10);
    }

    /* JADX INFO: compiled from: AppCompatTextHelper.java */
    private static class a extends androidx.core.content.res.d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<e0> f1247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f1248b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f1249c;

        /* JADX INFO: renamed from: androidx.appcompat.widget.e0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AppCompatTextHelper.java */
        private class RunnableC0019a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final WeakReference<e0> f1250a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Typeface f1251b;

            RunnableC0019a(WeakReference<e0> weakReference, Typeface typeface) {
                this.f1250a = weakReference;
                this.f1251b = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                e0 e0Var = this.f1250a.get();
                if (e0Var == null) {
                    return;
                }
                e0Var.B(this.f1251b);
            }
        }

        a(e0 e0Var, int i10, int i11) {
            this.f1247a = new WeakReference<>(e0Var);
            this.f1248b = i10;
            this.f1249c = i11;
        }

        @Override // androidx.core.content.res.d.a
        /* JADX INFO: renamed from: i */
        public void g(Typeface typeface) {
            int i10;
            e0 e0Var = this.f1247a.get();
            if (e0Var == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f1248b) != -1) {
                typeface = Typeface.create(typeface, i10, (this.f1249c & 2) != 0);
            }
            e0Var.q(new RunnableC0019a(this.f1247a, typeface));
        }

        @Override // androidx.core.content.res.d.a
        /* JADX INFO: renamed from: h */
        public void f(int i10) {
        }
    }
}
