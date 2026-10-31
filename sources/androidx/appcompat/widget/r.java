package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;

/* JADX INFO: compiled from: AppCompatRadioButton.java */
/* JADX INFO: loaded from: classes.dex */
public class r extends RadioButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f1415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f1416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e0 f1417c;

    public r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a.E);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1416b;
        if (eVar != null) {
            eVar.b();
        }
        e0 e0Var = this.f1417c;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        i iVar = this.f1415a;
        return iVar != null ? iVar.b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1416b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1416b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        i iVar = this.f1415a;
        if (iVar != null) {
            return iVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        i iVar = this.f1415a;
        if (iVar != null) {
            return iVar.d();
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1416b;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1416b;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        i iVar = this.f1415a;
        if (iVar != null) {
            iVar.f();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1416b;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1416b;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        i iVar = this.f1415a;
        if (iVar != null) {
            iVar.g(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        i iVar = this.f1415a;
        if (iVar != null) {
            iVar.h(mode);
        }
    }

    public r(Context context, AttributeSet attributeSet, int i10) {
        super(e1.b(context), attributeSet, i10);
        i iVar = new i(this);
        this.f1415a = iVar;
        iVar.e(attributeSet, i10);
        e eVar = new e(this);
        this.f1416b = eVar;
        eVar.e(attributeSet, i10);
        e0 e0Var = new e0(this);
        this.f1417c = e0Var;
        e0Var.m(attributeSet, i10);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(h.a.b(getContext(), i10));
    }
}
