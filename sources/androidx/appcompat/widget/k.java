package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;

/* JADX INFO: compiled from: AppCompatEditText.java */
/* JADX INFO: loaded from: classes.dex */
public class k extends EditText {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f1327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e0 f1328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y f1329c;

    public k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a.A);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1327a;
        if (eVar != null) {
            eVar.b();
        }
        e0 e0Var = this.f1328b;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1327a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1327a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        y yVar;
        return (Build.VERSION.SDK_INT >= 28 || (yVar = this.f1329c) == null) ? super.getTextClassifier() : yVar.a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return l.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1327a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1327a;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.j.m(this, callback));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1327a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1327a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        e0 e0Var = this.f1328b;
        if (e0Var != null) {
            e0Var.p(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        y yVar;
        if (Build.VERSION.SDK_INT >= 28 || (yVar = this.f1329c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            yVar.b(textClassifier);
        }
    }

    public k(Context context, AttributeSet attributeSet, int i10) {
        super(e1.b(context), attributeSet, i10);
        e eVar = new e(this);
        this.f1327a = eVar;
        eVar.e(attributeSet, i10);
        e0 e0Var = new e0(this);
        this.f1328b = e0Var;
        e0Var.m(attributeSet, i10);
        e0Var.b();
        this.f1329c = new y(this);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
