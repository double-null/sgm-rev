package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: compiled from: SimpleItemAnimator.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class l extends RecyclerView.m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f3428g = true;

    public final void A(RecyclerView.f0 f0Var) {
        I(f0Var);
        h(f0Var);
    }

    public final void B(RecyclerView.f0 f0Var) {
        J(f0Var);
    }

    public final void C(RecyclerView.f0 f0Var, boolean z10) {
        K(f0Var, z10);
        h(f0Var);
    }

    public final void D(RecyclerView.f0 f0Var, boolean z10) {
        L(f0Var, z10);
    }

    public final void E(RecyclerView.f0 f0Var) {
        M(f0Var);
        h(f0Var);
    }

    public final void F(RecyclerView.f0 f0Var) {
        N(f0Var);
    }

    public final void G(RecyclerView.f0 f0Var) {
        O(f0Var);
        h(f0Var);
    }

    public final void H(RecyclerView.f0 f0Var) {
        P(f0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean a(RecyclerView.f0 f0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i10;
        int i11;
        return (cVar == null || ((i10 = cVar.f3199a) == (i11 = cVar2.f3199a) && cVar.f3200b == cVar2.f3200b)) ? w(f0Var) : y(f0Var, i10, cVar.f3200b, i11, cVar2.f3200b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean b(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i10;
        int i11;
        int i12 = cVar.f3199a;
        int i13 = cVar.f3200b;
        if (f0Var2.shouldIgnore()) {
            int i14 = cVar.f3199a;
            i11 = cVar.f3200b;
            i10 = i14;
        } else {
            i10 = cVar2.f3199a;
            i11 = cVar2.f3200b;
        }
        return x(f0Var, f0Var2, i12, i13, i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean c(RecyclerView.f0 f0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i10 = cVar.f3199a;
        int i11 = cVar.f3200b;
        View view = f0Var.itemView;
        int left = cVar2 == null ? view.getLeft() : cVar2.f3199a;
        int top = cVar2 == null ? view.getTop() : cVar2.f3200b;
        if (f0Var.isRemoved() || (i10 == left && i11 == top)) {
            return z(f0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return y(f0Var, i10, i11, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean d(RecyclerView.f0 f0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i10 = cVar.f3199a;
        int i11 = cVar2.f3199a;
        if (i10 != i11 || cVar.f3200b != cVar2.f3200b) {
            return y(f0Var, i10, cVar.f3200b, i11, cVar2.f3200b);
        }
        E(f0Var);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean f(RecyclerView.f0 f0Var) {
        return !this.f3428g || f0Var.isInvalid();
    }

    public abstract boolean w(RecyclerView.f0 f0Var);

    public abstract boolean x(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, int i10, int i11, int i12, int i13);

    public abstract boolean y(RecyclerView.f0 f0Var, int i10, int i11, int i12, int i13);

    public abstract boolean z(RecyclerView.f0 f0Var);

    public void I(RecyclerView.f0 f0Var) {
    }

    public void J(RecyclerView.f0 f0Var) {
    }

    public void M(RecyclerView.f0 f0Var) {
    }

    public void N(RecyclerView.f0 f0Var) {
    }

    public void O(RecyclerView.f0 f0Var) {
    }

    public void P(RecyclerView.f0 f0Var) {
    }

    public void K(RecyclerView.f0 f0Var, boolean z10) {
    }

    public void L(RecyclerView.f0 f0Var, boolean z10) {
    }
}
