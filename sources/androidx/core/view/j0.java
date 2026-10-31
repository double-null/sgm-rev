package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: NestedScrollingParentHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1950b;

    public j0(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f1949a | this.f1950b;
    }

    public void b(View view, View view2, int i10) {
        c(view, view2, i10, 0);
    }

    public void c(View view, View view2, int i10, int i11) {
        if (i11 == 1) {
            this.f1950b = i10;
        } else {
            this.f1949a = i10;
        }
    }

    public void d(View view, int i10) {
        if (i10 == 1) {
            this.f1950b = 0;
        } else {
            this.f1949a = 0;
        }
    }
}
