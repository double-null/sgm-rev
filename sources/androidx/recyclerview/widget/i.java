package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: OrientationHelper.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final RecyclerView.p f3421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Rect f3423c;

    /* JADX INFO: compiled from: OrientationHelper.java */
    class a extends i {
        a(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.i
        public int d(View view) {
            return this.f3421a.T(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f3421a.S(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f3421a.R(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int g(View view) {
            return this.f3421a.Q(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int h() {
            return this.f3421a.n0();
        }

        @Override // androidx.recyclerview.widget.i
        public int i() {
            return this.f3421a.n0() - this.f3421a.e0();
        }

        @Override // androidx.recyclerview.widget.i
        public int j() {
            return this.f3421a.e0();
        }

        @Override // androidx.recyclerview.widget.i
        public int k() {
            return this.f3421a.o0();
        }

        @Override // androidx.recyclerview.widget.i
        public int l() {
            return this.f3421a.X();
        }

        @Override // androidx.recyclerview.widget.i
        public int m() {
            return this.f3421a.d0();
        }

        @Override // androidx.recyclerview.widget.i
        public int n() {
            return (this.f3421a.n0() - this.f3421a.d0()) - this.f3421a.e0();
        }

        @Override // androidx.recyclerview.widget.i
        public int p(View view) {
            this.f3421a.m0(view, true, this.f3423c);
            return this.f3423c.right;
        }

        @Override // androidx.recyclerview.widget.i
        public int q(View view) {
            this.f3421a.m0(view, true, this.f3423c);
            return this.f3423c.left;
        }

        @Override // androidx.recyclerview.widget.i
        public void r(int i10) {
            this.f3421a.B0(i10);
        }
    }

    /* JADX INFO: compiled from: OrientationHelper.java */
    class b extends i {
        b(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.i
        public int d(View view) {
            return this.f3421a.O(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f3421a.R(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f3421a.S(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int g(View view) {
            return this.f3421a.U(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int h() {
            return this.f3421a.W();
        }

        @Override // androidx.recyclerview.widget.i
        public int i() {
            return this.f3421a.W() - this.f3421a.c0();
        }

        @Override // androidx.recyclerview.widget.i
        public int j() {
            return this.f3421a.c0();
        }

        @Override // androidx.recyclerview.widget.i
        public int k() {
            return this.f3421a.X();
        }

        @Override // androidx.recyclerview.widget.i
        public int l() {
            return this.f3421a.o0();
        }

        @Override // androidx.recyclerview.widget.i
        public int m() {
            return this.f3421a.f0();
        }

        @Override // androidx.recyclerview.widget.i
        public int n() {
            return (this.f3421a.W() - this.f3421a.f0()) - this.f3421a.c0();
        }

        @Override // androidx.recyclerview.widget.i
        public int p(View view) {
            this.f3421a.m0(view, true, this.f3423c);
            return this.f3423c.bottom;
        }

        @Override // androidx.recyclerview.widget.i
        public int q(View view) {
            this.f3421a.m0(view, true, this.f3423c);
            return this.f3423c.top;
        }

        @Override // androidx.recyclerview.widget.i
        public void r(int i10) {
            this.f3421a.C0(i10);
        }
    }

    /* synthetic */ i(RecyclerView.p pVar, a aVar) {
        this(pVar);
    }

    public static i a(RecyclerView.p pVar) {
        return new a(pVar);
    }

    public static i b(RecyclerView.p pVar, int i10) {
        if (i10 == 0) {
            return a(pVar);
        }
        if (i10 == 1) {
            return c(pVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static i c(RecyclerView.p pVar) {
        return new b(pVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.f3422b) {
            return 0;
        }
        return n() - this.f3422b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i10);

    public void s() {
        this.f3422b = n();
    }

    private i(RecyclerView.p pVar) {
        this.f3422b = Integer.MIN_VALUE;
        this.f3423c = new Rect();
        this.f3421a = pVar;
    }
}
