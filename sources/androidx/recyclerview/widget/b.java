package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ChildHelper.java */
/* JADX INFO: loaded from: classes.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final InterfaceC0064b f3301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final a f3302b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final List<View> f3303c = new ArrayList();

    /* JADX INFO: compiled from: ChildHelper.java */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f3304a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        a f3305b;

        a() {
        }

        private void c() {
            if (this.f3305b == null) {
                this.f3305b = new a();
            }
        }

        void a(int i10) {
            if (i10 < 64) {
                this.f3304a &= ~(1 << i10);
                return;
            }
            a aVar = this.f3305b;
            if (aVar != null) {
                aVar.a(i10 - 64);
            }
        }

        int b(int i10) {
            a aVar = this.f3305b;
            if (aVar == null) {
                return i10 >= 64 ? Long.bitCount(this.f3304a) : Long.bitCount(this.f3304a & ((1 << i10) - 1));
            }
            return i10 < 64 ? Long.bitCount(this.f3304a & ((1 << i10) - 1)) : aVar.b(i10 - 64) + Long.bitCount(this.f3304a);
        }

        boolean d(int i10) {
            if (i10 < 64) {
                return (this.f3304a & (1 << i10)) != 0;
            }
            c();
            return this.f3305b.d(i10 - 64);
        }

        void e(int i10, boolean z10) {
            if (i10 >= 64) {
                c();
                this.f3305b.e(i10 - 64, z10);
                return;
            }
            long j10 = this.f3304a;
            boolean z11 = (Long.MIN_VALUE & j10) != 0;
            long j11 = (1 << i10) - 1;
            this.f3304a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z10) {
                h(i10);
            } else {
                a(i10);
            }
            if (z11 || this.f3305b != null) {
                c();
                this.f3305b.e(0, z11);
            }
        }

        boolean f(int i10) {
            if (i10 >= 64) {
                c();
                return this.f3305b.f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f3304a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f3304a = j12;
            long j13 = j10 - 1;
            this.f3304a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f3305b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f3305b.f(0);
            }
            return z10;
        }

        void g() {
            this.f3304a = 0L;
            a aVar = this.f3305b;
            if (aVar != null) {
                aVar.g();
            }
        }

        void h(int i10) {
            if (i10 < 64) {
                this.f3304a |= 1 << i10;
            } else {
                c();
                this.f3305b.h(i10 - 64);
            }
        }

        public String toString() {
            if (this.f3305b == null) {
                return Long.toBinaryString(this.f3304a);
            }
            return this.f3305b.toString() + "xx" + Long.toBinaryString(this.f3304a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ChildHelper.java */
    interface InterfaceC0064b {
        View a(int i10);

        void addView(View view, int i10);

        void b(View view);

        int c();

        RecyclerView.f0 d(View view);

        void e(int i10);

        void f();

        int g(View view);

        void h(View view);

        void i(int i10);

        void j(View view, int i10, ViewGroup.LayoutParams layoutParams);
    }

    b(InterfaceC0064b interfaceC0064b) {
        this.f3301a = interfaceC0064b;
    }

    private int h(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int iC = this.f3301a.c();
        int i11 = i10;
        while (i11 < iC) {
            int iB = i10 - (i11 - this.f3302b.b(i11));
            if (iB == 0) {
                while (this.f3302b.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += iB;
        }
        return -1;
    }

    private void l(View view) {
        this.f3303c.add(view);
        this.f3301a.b(view);
    }

    private boolean t(View view) {
        if (!this.f3303c.remove(view)) {
            return false;
        }
        this.f3301a.h(view);
        return true;
    }

    void a(View view, int i10, boolean z10) {
        int iC = i10 < 0 ? this.f3301a.c() : h(i10);
        this.f3302b.e(iC, z10);
        if (z10) {
            l(view);
        }
        this.f3301a.addView(view, iC);
    }

    void b(View view, boolean z10) {
        a(view, -1, z10);
    }

    void c(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int iC = i10 < 0 ? this.f3301a.c() : h(i10);
        this.f3302b.e(iC, z10);
        if (z10) {
            l(view);
        }
        this.f3301a.j(view, iC, layoutParams);
    }

    void d(int i10) {
        int iH = h(i10);
        this.f3302b.f(iH);
        this.f3301a.e(iH);
    }

    View e(int i10) {
        int size = this.f3303c.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = this.f3303c.get(i11);
            RecyclerView.f0 f0VarD = this.f3301a.d(view);
            if (f0VarD.getLayoutPosition() == i10 && !f0VarD.isInvalid() && !f0VarD.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    View f(int i10) {
        return this.f3301a.a(h(i10));
    }

    int g() {
        return this.f3301a.c() - this.f3303c.size();
    }

    View i(int i10) {
        return this.f3301a.a(i10);
    }

    int j() {
        return this.f3301a.c();
    }

    void k(View view) {
        int iG = this.f3301a.g(view);
        if (iG >= 0) {
            this.f3302b.h(iG);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    int m(View view) {
        int iG = this.f3301a.g(view);
        if (iG == -1 || this.f3302b.d(iG)) {
            return -1;
        }
        return iG - this.f3302b.b(iG);
    }

    boolean n(View view) {
        return this.f3303c.contains(view);
    }

    void o() {
        this.f3302b.g();
        for (int size = this.f3303c.size() - 1; size >= 0; size--) {
            this.f3301a.h(this.f3303c.get(size));
            this.f3303c.remove(size);
        }
        this.f3301a.f();
    }

    void p(View view) {
        int iG = this.f3301a.g(view);
        if (iG < 0) {
            return;
        }
        if (this.f3302b.f(iG)) {
            t(view);
        }
        this.f3301a.i(iG);
    }

    void q(int i10) {
        int iH = h(i10);
        View viewA = this.f3301a.a(iH);
        if (viewA == null) {
            return;
        }
        if (this.f3302b.f(iH)) {
            t(viewA);
        }
        this.f3301a.i(iH);
    }

    boolean r(View view) {
        int iG = this.f3301a.g(view);
        if (iG == -1) {
            t(view);
            return true;
        }
        if (!this.f3302b.d(iG)) {
            return false;
        }
        this.f3302b.f(iG);
        t(view);
        this.f3301a.i(iG);
        return true;
    }

    void s(View view) {
        int iG = this.f3301a.g(view);
        if (iG < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f3302b.d(iG)) {
            this.f3302b.a(iG);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f3302b.toString() + ", hidden list:" + this.f3303c.size();
    }
}
