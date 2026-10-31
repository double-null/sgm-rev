package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* JADX INFO: compiled from: AppCompatCompoundButtonHelper.java */
/* JADX INFO: loaded from: classes.dex */
class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CompoundButton f1276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f1277b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f1278c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f1279d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f1280e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f1281f;

    i(CompoundButton compoundButton) {
        this.f1276a = compoundButton;
    }

    void a() {
        Drawable drawableA = androidx.core.widget.c.a(this.f1276a);
        if (drawableA != null) {
            if (this.f1279d || this.f1280e) {
                Drawable drawableMutate = androidx.core.graphics.drawable.a.j(drawableA).mutate();
                if (this.f1279d) {
                    androidx.core.graphics.drawable.a.h(drawableMutate, this.f1277b);
                }
                if (this.f1280e) {
                    androidx.core.graphics.drawable.a.i(drawableMutate, this.f1278c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f1276a.getDrawableState());
                }
                this.f1276a.setButtonDrawable(drawableMutate);
            }
        }
    }

    ColorStateList c() {
        return this.f1277b;
    }

    PorterDuff.Mode d() {
        return this.f1278c;
    }

    void e(AttributeSet attributeSet, int i10) {
        boolean z10;
        int resourceId;
        int resourceId2;
        TypedArray typedArrayObtainStyledAttributes = this.f1276a.getContext().obtainStyledAttributes(attributeSet, g.j.R0, i10, 0);
        try {
            int i11 = g.j.T0;
            if (!typedArrayObtainStyledAttributes.hasValue(i11) || (resourceId2 = typedArrayObtainStyledAttributes.getResourceId(i11, 0)) == 0) {
                z10 = false;
            } else {
                try {
                    CompoundButton compoundButton = this.f1276a;
                    compoundButton.setButtonDrawable(h.a.b(compoundButton.getContext(), resourceId2));
                    z10 = true;
                } catch (Resources.NotFoundException unused) {
                    z10 = false;
                }
            }
            if (!z10) {
                int i12 = g.j.S0;
                if (typedArrayObtainStyledAttributes.hasValue(i12) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(i12, 0)) != 0) {
                    CompoundButton compoundButton2 = this.f1276a;
                    compoundButton2.setButtonDrawable(h.a.b(compoundButton2.getContext(), resourceId));
                }
            }
            int i13 = g.j.U0;
            if (typedArrayObtainStyledAttributes.hasValue(i13)) {
                androidx.core.widget.c.b(this.f1276a, typedArrayObtainStyledAttributes.getColorStateList(i13));
            }
            int i14 = g.j.V0;
            if (typedArrayObtainStyledAttributes.hasValue(i14)) {
                androidx.core.widget.c.c(this.f1276a, m0.c(typedArrayObtainStyledAttributes.getInt(i14, -1), null));
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    void f() {
        if (this.f1281f) {
            this.f1281f = false;
        } else {
            this.f1281f = true;
            a();
        }
    }

    void g(ColorStateList colorStateList) {
        this.f1277b = colorStateList;
        this.f1279d = true;
        a();
    }

    void h(PorterDuff.Mode mode) {
        this.f1278c = mode;
        this.f1280e = true;
        a();
    }

    int b(int i10) {
        return i10;
    }
}
