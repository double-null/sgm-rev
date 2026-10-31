package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: compiled from: LayoutState.java */
/* JADX INFO: loaded from: classes.dex */
class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f3404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f3405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f3406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f3407e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f3410h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f3411i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f3403a = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f3408f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f3409g = 0;

    f() {
    }

    boolean a(RecyclerView.b0 b0Var) {
        int i10 = this.f3405c;
        return i10 >= 0 && i10 < b0Var.b();
    }

    View b(RecyclerView.w wVar) {
        View viewO = wVar.o(this.f3405c);
        this.f3405c += this.f3406d;
        return viewO;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f3404b + ", mCurrentPosition=" + this.f3405c + ", mItemDirection=" + this.f3406d + ", mLayoutDirection=" + this.f3407e + ", mStartLine=" + this.f3408f + ", mEndLine=" + this.f3409g + '}';
    }
}
