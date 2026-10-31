package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* JADX INFO: compiled from: AppCompatSeekBarHelper.java */
/* JADX INFO: loaded from: classes.dex */
class u extends q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SeekBar f1453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f1454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ColorStateList f1455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f1456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1457h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f1458i;

    u(SeekBar seekBar) {
        super(seekBar);
        this.f1455f = null;
        this.f1456g = null;
        this.f1457h = false;
        this.f1458i = false;
        this.f1453d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f1454e;
        if (drawable != null) {
            if (this.f1457h || this.f1458i) {
                Drawable drawableJ = androidx.core.graphics.drawable.a.j(drawable.mutate());
                this.f1454e = drawableJ;
                if (this.f1457h) {
                    androidx.core.graphics.drawable.a.h(drawableJ, this.f1455f);
                }
                if (this.f1458i) {
                    androidx.core.graphics.drawable.a.i(this.f1454e, this.f1456g);
                }
                if (this.f1454e.isStateful()) {
                    this.f1454e.setState(this.f1453d.getDrawableState());
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.q
    void c(AttributeSet attributeSet, int i10) {
        super.c(attributeSet, i10);
        h1 h1VarT = h1.t(this.f1453d.getContext(), attributeSet, g.j.V, i10, 0);
        Drawable drawableG = h1VarT.g(g.j.W);
        if (drawableG != null) {
            this.f1453d.setThumb(drawableG);
        }
        j(h1VarT.f(g.j.X));
        int i11 = g.j.Z;
        if (h1VarT.q(i11)) {
            this.f1456g = m0.c(h1VarT.j(i11, -1), this.f1456g);
            this.f1458i = true;
        }
        int i12 = g.j.Y;
        if (h1VarT.q(i12)) {
            this.f1455f = h1VarT.c(i12);
            this.f1457h = true;
        }
        h1VarT.u();
        f();
    }

    void g(Canvas canvas) {
        if (this.f1454e != null) {
            int max = this.f1453d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1454e.getIntrinsicWidth();
                int intrinsicHeight = this.f1454e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1454e.setBounds(-i10, -i11, i10, i11);
                float width = ((this.f1453d.getWidth() - this.f1453d.getPaddingLeft()) - this.f1453d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f1453d.getPaddingLeft(), this.f1453d.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f1454e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    void h() {
        Drawable drawable = this.f1454e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1453d.getDrawableState())) {
            this.f1453d.invalidateDrawable(drawable);
        }
    }

    void i() {
        Drawable drawable = this.f1454e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.f1454e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1454e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1453d);
            androidx.core.graphics.drawable.a.f(drawable, androidx.core.view.z0.n(this.f1453d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1453d.getDrawableState());
            }
            f();
        }
        this.f1453d.invalidate();
    }
}
