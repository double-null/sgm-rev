package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: AppCompatTextView.java */
/* JADX INFO: loaded from: classes.dex */
public class f0 extends TextView implements androidx.core.widget.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f1259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e0 f1260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y f1261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Future<v.m> f1262d;

    public f0(Context context) {
        this(context, null);
    }

    private void e() {
        Future<v.m> future = this.f1262d;
        if (future != null) {
            try {
                this.f1262d = null;
                androidx.core.widget.j.k(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1259a;
        if (eVar != null) {
            eVar.b();
        }
        e0 e0Var = this.f1260b;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (androidx.core.widget.b.S8) {
            return super.getAutoSizeMaxTextSize();
        }
        e0 e0Var = this.f1260b;
        if (e0Var != null) {
            return e0Var.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (androidx.core.widget.b.S8) {
            return super.getAutoSizeMinTextSize();
        }
        e0 e0Var = this.f1260b;
        if (e0Var != null) {
            return e0Var.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (androidx.core.widget.b.S8) {
            return super.getAutoSizeStepGranularity();
        }
        e0 e0Var = this.f1260b;
        if (e0Var != null) {
            return e0Var.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (androidx.core.widget.b.S8) {
            return super.getAutoSizeTextAvailableSizes();
        }
        e0 e0Var = this.f1260b;
        return e0Var != null ? e0Var.h() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (androidx.core.widget.b.S8) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        e0 e0Var = this.f1260b;
        if (e0Var != null) {
            return e0Var.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.j.a(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.j.b(this);
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1259a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1259a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1260b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1260b.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        e();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        y yVar;
        return (Build.VERSION.SDK_INT >= 28 || (yVar = this.f1261c) == null) ? super.getTextClassifier() : yVar.a();
    }

    public v.m.a getTextMetricsParamsCompat() {
        return androidx.core.widget.j.e(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return l.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        e0 e0Var = this.f1260b;
        if (e0Var != null) {
            e0Var.n(z10, i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        e();
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        e0 e0Var = this.f1260b;
        if (e0Var == null || androidx.core.widget.b.S8 || !e0Var.l()) {
            return;
        }
        this.f1260b.c();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (androidx.core.widget.b.S8) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        e0 e0Var = this.f1260b;
        if (e0Var != null) {
            e0Var.s(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) throws IllegalArgumentException {
        if (androidx.core.widget.b.S8) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        e0 e0Var = this.f1260b;
        if (e0Var != null) {
            e0Var.t(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (androidx.core.widget.b.S8) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        e0 e0Var = this.f1260b;
        if (e0Var != null) {
            e0Var.u(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1259a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1259a;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        e0 e0Var = this.f1260b;
        if (e0Var != null) {
            e0Var.o();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        e0 e0Var = this.f1260b;
        if (e0Var != null) {
            e0Var.o();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        e0 e0Var = this.f1260b;
        if (e0Var != null) {
            e0Var.o();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        e0 e0Var = this.f1260b;
        if (e0Var != null) {
            e0Var.o();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.j.m(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i10);
        } else {
            androidx.core.widget.j.h(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i10);
        } else {
            androidx.core.widget.j.i(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        androidx.core.widget.j.j(this, i10);
    }

    public void setPrecomputedText(v.m mVar) {
        androidx.core.widget.j.k(this, mVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1259a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1259a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1260b.v(colorStateList);
        this.f1260b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1260b.w(mode);
        this.f1260b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        e0 e0Var = this.f1260b;
        if (e0Var != null) {
            e0Var.p(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        y yVar;
        if (Build.VERSION.SDK_INT >= 28 || (yVar = this.f1261c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            yVar.b(textClassifier);
        }
    }

    public void setTextFuture(Future<v.m> future) {
        this.f1262d = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(v.m.a aVar) {
        androidx.core.widget.j.l(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (androidx.core.widget.b.S8) {
            super.setTextSize(i10, f10);
            return;
        }
        e0 e0Var = this.f1260b;
        if (e0Var != null) {
            e0Var.z(i10, f10);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i10) {
        Typeface typefaceA = (typeface == null || i10 <= 0) ? null : androidx.core.graphics.h.a(getContext(), typeface, i10);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        super.setTypeface(typeface, i10);
    }

    public f0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public f0(Context context, AttributeSet attributeSet, int i10) {
        super(e1.b(context), attributeSet, i10);
        e eVar = new e(this);
        this.f1259a = eVar;
        eVar.e(attributeSet, i10);
        e0 e0Var = new e0(this);
        this.f1260b = e0Var;
        e0Var.m(attributeSet, i10);
        e0Var.b();
        this.f1261c = new y(this);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? h.a.b(context, i10) : null, i11 != 0 ? h.a.b(context, i11) : null, i12 != 0 ? h.a.b(context, i12) : null, i13 != 0 ? h.a.b(context, i13) : null);
        e0 e0Var = this.f1260b;
        if (e0Var != null) {
            e0Var.o();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? h.a.b(context, i10) : null, i11 != 0 ? h.a.b(context, i11) : null, i12 != 0 ? h.a.b(context, i12) : null, i13 != 0 ? h.a.b(context, i13) : null);
        e0 e0Var = this.f1260b;
        if (e0Var != null) {
            e0Var.o();
        }
    }
}
