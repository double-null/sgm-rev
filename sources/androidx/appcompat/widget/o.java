package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* JADX INFO: compiled from: AppCompatMultiAutoCompleteTextView.java */
/* JADX INFO: loaded from: classes.dex */
public class o extends MultiAutoCompleteTextView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f1378c = {R.attr.popupBackground};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f1379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e0 f1380b;

    public o(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a.f14993p);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1379a;
        if (eVar != null) {
            eVar.b();
        }
        e0 e0Var = this.f1380b;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1379a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1379a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return l.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1379a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1379a;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(h.a.b(getContext(), i10));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1379a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1379a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        e0 e0Var = this.f1380b;
        if (e0Var != null) {
            e0Var.p(context, i10);
        }
    }

    public o(Context context, AttributeSet attributeSet, int i10) {
        super(e1.b(context), attributeSet, i10);
        h1 h1VarT = h1.t(getContext(), attributeSet, f1378c, i10, 0);
        if (h1VarT.q(0)) {
            setDropDownBackgroundDrawable(h1VarT.f(0));
        }
        h1VarT.u();
        e eVar = new e(this);
        this.f1379a = eVar;
        eVar.e(attributeSet, i10);
        e0 e0Var = new e0(this);
        this.f1380b = e0Var;
        e0Var.m(attributeSet, i10);
        e0Var.b();
    }
}
