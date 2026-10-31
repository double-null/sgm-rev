package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* JADX INFO: compiled from: AppCompatButton.java */
/* JADX INFO: loaded from: classes.dex */
public class f extends Button implements androidx.core.widget.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f1257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e0 f1258b;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a.f14994q);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1257a;
        if (eVar != null) {
            eVar.b();
        }
        e0 e0Var = this.f1258b;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (androidx.core.widget.b.S8) {
            return super.getAutoSizeMaxTextSize();
        }
        e0 e0Var = this.f1258b;
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
        e0 e0Var = this.f1258b;
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
        e0 e0Var = this.f1258b;
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
        e0 e0Var = this.f1258b;
        return e0Var != null ? e0Var.h() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (androidx.core.widget.b.S8) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        e0 e0Var = this.f1258b;
        if (e0Var != null) {
            return e0Var.i();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1257a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1257a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        e0 e0Var = this.f1258b;
        if (e0Var != null) {
            e0Var.n(z10, i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        e0 e0Var = this.f1258b;
        if (e0Var == null || androidx.core.widget.b.S8 || !e0Var.l()) {
            return;
        }
        this.f1258b.c();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (androidx.core.widget.b.S8) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        e0 e0Var = this.f1258b;
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
        e0 e0Var = this.f1258b;
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
        e0 e0Var = this.f1258b;
        if (e0Var != null) {
            e0Var.u(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1257a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1257a;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.j.m(this, callback));
    }

    public void setSupportAllCaps(boolean z10) {
        e0 e0Var = this.f1258b;
        if (e0Var != null) {
            e0Var.r(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1257a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1257a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        e0 e0Var = this.f1258b;
        if (e0Var != null) {
            e0Var.p(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (androidx.core.widget.b.S8) {
            super.setTextSize(i10, f10);
            return;
        }
        e0 e0Var = this.f1258b;
        if (e0Var != null) {
            e0Var.z(i10, f10);
        }
    }

    public f(Context context, AttributeSet attributeSet, int i10) {
        super(e1.b(context), attributeSet, i10);
        e eVar = new e(this);
        this.f1257a = eVar;
        eVar.e(attributeSet, i10);
        e0 e0Var = new e0(this);
        this.f1258b = e0Var;
        e0Var.m(attributeSet, i10);
        e0Var.b();
    }
}
