package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: AppCompatPopupWindow.java */
/* JADX INFO: loaded from: classes.dex */
class p extends PopupWindow {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f1382b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1383a;

    public p(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a(context, attributeSet, i10, i11);
    }

    private void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        h1 h1VarT = h1.t(context, attributeSet, g.j.f15119b2, i10, i11);
        int i12 = g.j.f15129d2;
        if (h1VarT.q(i12)) {
            b(h1VarT.a(i12, false));
        }
        setBackgroundDrawable(h1VarT.f(g.j.f15124c2));
        h1VarT.u();
    }

    private void b(boolean z10) {
        if (f1382b) {
            this.f1383a = z10;
        } else {
            androidx.core.widget.i.a(this, z10);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11) {
        if (f1382b && this.f1383a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i10, int i11, int i12, int i13) {
        if (f1382b && this.f1383a) {
            i11 -= view.getHeight();
        }
        super.update(view, i10, i11, i12, i13);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11, int i12) {
        if (f1382b && this.f1383a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11, i12);
    }
}
