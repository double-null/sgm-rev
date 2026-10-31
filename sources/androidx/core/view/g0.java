package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: NestedScrollingChildHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewParent f1944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewParent f1945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f1946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f1947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int[] f1948e;

    public g0(View view) {
        this.f1946c = view;
    }

    private boolean h(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent viewParentI;
        int i15;
        int i16;
        int[] iArr3;
        if (!m() || (viewParentI = i(i14)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f1946c.getLocationInWindow(iArr);
            i15 = iArr[0];
            i16 = iArr[1];
        } else {
            i15 = 0;
            i16 = 0;
        }
        if (iArr2 == null) {
            int[] iArrJ = j();
            iArrJ[0] = 0;
            iArrJ[1] = 0;
            iArr3 = iArrJ;
        } else {
            iArr3 = iArr2;
        }
        v2.d(viewParentI, this.f1946c, i10, i11, i12, i13, i14, iArr3);
        if (iArr != null) {
            this.f1946c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i15;
            iArr[1] = iArr[1] - i16;
        }
        return true;
    }

    private ViewParent i(int i10) {
        if (i10 == 0) {
            return this.f1944a;
        }
        if (i10 != 1) {
            return null;
        }
        return this.f1945b;
    }

    private int[] j() {
        if (this.f1948e == null) {
            this.f1948e = new int[2];
        }
        return this.f1948e;
    }

    private void o(int i10, ViewParent viewParent) {
        if (i10 == 0) {
            this.f1944a = viewParent;
        } else {
            if (i10 != 1) {
                return;
            }
            this.f1945b = viewParent;
        }
    }

    public boolean a(float f10, float f11, boolean z10) {
        ViewParent viewParentI;
        if (!m() || (viewParentI = i(0)) == null) {
            return false;
        }
        return v2.a(viewParentI, this.f1946c, f10, f11, z10);
    }

    public boolean b(float f10, float f11) {
        ViewParent viewParentI;
        if (!m() || (viewParentI = i(0)) == null) {
            return false;
        }
        return v2.b(viewParentI, this.f1946c, f10, f11);
    }

    public boolean c(int i10, int i11, int[] iArr, int[] iArr2) {
        return d(i10, i11, iArr, iArr2, 0);
    }

    public boolean d(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        ViewParent viewParentI;
        int i13;
        int i14;
        if (!m() || (viewParentI = i(i12)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f1946c.getLocationInWindow(iArr2);
            i13 = iArr2[0];
            i14 = iArr2[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr == null) {
            iArr = j();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        v2.c(viewParentI, this.f1946c, i10, i11, iArr, i12);
        if (iArr2 != null) {
            this.f1946c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i13;
            iArr2[1] = iArr2[1] - i14;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public void e(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        h(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public boolean f(int i10, int i11, int i12, int i13, int[] iArr) {
        return h(i10, i11, i12, i13, iArr, 0, null);
    }

    public boolean g(int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        return h(i10, i11, i12, i13, iArr, i14, null);
    }

    public boolean k() {
        return l(0);
    }

    public boolean l(int i10) {
        return i(i10) != null;
    }

    public boolean m() {
        return this.f1947d;
    }

    public void n(boolean z10) {
        if (this.f1947d) {
            z0.V(this.f1946c);
        }
        this.f1947d = z10;
    }

    public boolean p(int i10) {
        return q(i10, 0);
    }

    public boolean q(int i10, int i11) {
        if (l(i11)) {
            return true;
        }
        if (!m()) {
            return false;
        }
        View view = this.f1946c;
        for (ViewParent parent = this.f1946c.getParent(); parent != null; parent = parent.getParent()) {
            if (v2.f(parent, view, this.f1946c, i10, i11)) {
                o(i11, parent);
                v2.e(parent, view, this.f1946c, i10, i11);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void r() {
        s(0);
    }

    public void s(int i10) {
        ViewParent viewParentI = i(i10);
        if (viewParentI != null) {
            v2.g(viewParentI, this.f1946c, i10);
            o(i10, null);
        }
    }
}
