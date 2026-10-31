package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* JADX INFO: compiled from: AppCompatCheckedTextView.java */
/* JADX INFO: loaded from: classes.dex */
public class h extends CheckedTextView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f1271b = {R.attr.checkMark};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e0 f1272a;

    public h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e0 e0Var = this.f1272a;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return l.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(h.a.b(getContext(), i10));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.j.m(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        e0 e0Var = this.f1272a;
        if (e0Var != null) {
            e0Var.p(context, i10);
        }
    }

    public h(Context context, AttributeSet attributeSet, int i10) {
        super(e1.b(context), attributeSet, i10);
        e0 e0Var = new e0(this);
        this.f1272a = e0Var;
        e0Var.m(attributeSet, i10);
        e0Var.b();
        h1 h1VarT = h1.t(getContext(), attributeSet, f1271b, i10, 0);
        setCheckMarkDrawable(h1VarT.f(0));
        h1VarT.u();
    }
}
