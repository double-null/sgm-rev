package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: compiled from: AppCompatToggleButton.java */
/* JADX INFO: loaded from: classes.dex */
public class j0 extends ToggleButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e0 f1326a;

    public j0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    public j0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        e0 e0Var = new e0(this);
        this.f1326a = e0Var;
        e0Var.m(attributeSet, i10);
    }
}
