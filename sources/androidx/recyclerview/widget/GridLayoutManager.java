package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import com.applovin.mediation.ads.Zfi.OgqfiHA;
import java.util.Arrays;
import x.p;

/* JADX INFO: loaded from: classes2.dex */
public class GridLayoutManager extends LinearLayoutManager {
    boolean I;
    int J;
    int[] K;
    View[] L;
    final SparseIntArray M;
    final SparseIntArray N;
    c O;
    final Rect P;
    private boolean Q;

    /* JADX INFO: loaded from: classes.dex */
    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int e(int i10, int i11) {
            return i10 % i11;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i10) {
            return 1;
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final SparseIntArray f3107a = new SparseIntArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final SparseIntArray f3108b = new SparseIntArray();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f3109c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f3110d = false;

        static int a(SparseIntArray sparseIntArray, int i10) {
            int size = sparseIntArray.size() - 1;
            int i11 = 0;
            while (i11 <= size) {
                int i12 = (i11 + size) >>> 1;
                if (sparseIntArray.keyAt(i12) < i10) {
                    i11 = i12 + 1;
                } else {
                    size = i12 - 1;
                }
            }
            int i13 = i11 - 1;
            if (i13 < 0 || i13 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i13);
        }

        int b(int i10, int i11) {
            if (!this.f3110d) {
                return d(i10, i11);
            }
            int i12 = this.f3108b.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int iD = d(i10, i11);
            this.f3108b.put(i10, iD);
            return iD;
        }

        int c(int i10, int i11) {
            if (!this.f3109c) {
                return e(i10, i11);
            }
            int i12 = this.f3107a.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int iE = e(i10, i11);
            this.f3107a.put(i10, iE);
            return iE;
        }

        public int d(int i10, int i11) {
            int i12;
            int i13;
            int iC;
            int iA;
            if (!this.f3110d || (iA = a(this.f3108b, i10)) == -1) {
                i12 = 0;
                i13 = 0;
                iC = 0;
            } else {
                i12 = this.f3108b.get(iA);
                i13 = iA + 1;
                iC = c(iA, i11) + f(iA);
                if (iC == i11) {
                    i12++;
                    iC = 0;
                }
            }
            int iF = f(i10);
            while (i13 < i10) {
                int iF2 = f(i13);
                iC += iF2;
                if (iC == i11) {
                    i12++;
                    iC = 0;
                } else if (iC > i11) {
                    i12++;
                    iC = iF2;
                }
                i13++;
            }
            return iC + iF > i11 ? i12 + 1 : i12;
        }

        public abstract int e(int i10, int i11);

        public abstract int f(int i10);

        public void g() {
            this.f3108b.clear();
        }

        public void h() {
            this.f3107a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new a();
        this.P = new Rect();
        Y2(RecyclerView.p.h0(context, attributeSet, i10, i11).f3225b);
    }

    private void I2(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (z10) {
            i13 = 1;
            i12 = i10;
            i11 = 0;
        } else {
            i11 = i10 - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View view = this.L[i11];
            b bVar = (b) view.getLayoutParams();
            int iU2 = U2(wVar, b0Var, g0(view));
            bVar.f3106f = iU2;
            bVar.f3105e = i14;
            i14 += iU2;
            i11 += i13;
        }
    }

    private void J2() {
        int iJ = J();
        for (int i10 = 0; i10 < iJ; i10++) {
            b bVar = (b) I(i10).getLayoutParams();
            int iA = bVar.a();
            this.M.put(iA, bVar.f());
            this.N.put(iA, bVar.e());
        }
    }

    private void K2(int i10) {
        this.K = L2(this.K, this.J, i10);
    }

    static int[] L2(int[] iArr, int i10, int i11) {
        int i12;
        if (iArr == null || iArr.length != i10 + 1 || iArr[iArr.length - 1] != i11) {
            iArr = new int[i10 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i11 / i10;
        int i15 = i11 % i10;
        int i16 = 0;
        for (int i17 = 1; i17 <= i10; i17++) {
            i13 += i15;
            if (i13 <= 0 || i10 - i13 >= i15) {
                i12 = i14;
            } else {
                i12 = i14 + 1;
                i13 -= i10;
            }
            i16 += i12;
            iArr[i17] = i16;
        }
        return iArr;
    }

    private void M2() {
        this.M.clear();
        this.N.clear();
    }

    private int N2(RecyclerView.b0 b0Var) {
        if (J() != 0 && b0Var.b() != 0) {
            S1();
            boolean zM2 = m2();
            View viewW1 = W1(!zM2, true);
            View viewV1 = V1(!zM2, true);
            if (viewW1 != null && viewV1 != null) {
                int iB = this.O.b(g0(viewW1), this.J);
                int iB2 = this.O.b(g0(viewV1), this.J);
                int iMax = this.f3116x ? Math.max(0, ((this.O.b(b0Var.b() - 1, this.J) + 1) - Math.max(iB, iB2)) - 1) : Math.max(0, Math.min(iB, iB2));
                if (zM2) {
                    return Math.round((iMax * (Math.abs(this.f3113u.d(viewV1) - this.f3113u.g(viewW1)) / ((this.O.b(g0(viewV1), this.J) - this.O.b(g0(viewW1), this.J)) + 1))) + (this.f3113u.m() - this.f3113u.g(viewW1)));
                }
                return iMax;
            }
        }
        return 0;
    }

    private int O2(RecyclerView.b0 b0Var) {
        if (J() != 0 && b0Var.b() != 0) {
            S1();
            View viewW1 = W1(!m2(), true);
            View viewV1 = V1(!m2(), true);
            if (viewW1 != null && viewV1 != null) {
                if (!m2()) {
                    return this.O.b(b0Var.b() - 1, this.J) + 1;
                }
                return (int) (((this.f3113u.d(viewV1) - this.f3113u.g(viewW1)) / ((this.O.b(g0(viewV1), this.J) - this.O.b(g0(viewW1), this.J)) + 1)) * (this.O.b(b0Var.b() - 1, this.J) + 1));
            }
        }
        return 0;
    }

    private void P2(RecyclerView.w wVar, RecyclerView.b0 b0Var, LinearLayoutManager.a aVar, int i10) {
        boolean z10 = i10 == 1;
        int iT2 = T2(wVar, b0Var, aVar.f3120b);
        if (z10) {
            while (iT2 > 0) {
                int i11 = aVar.f3120b;
                if (i11 <= 0) {
                    return;
                }
                int i12 = i11 - 1;
                aVar.f3120b = i12;
                iT2 = T2(wVar, b0Var, i12);
            }
            return;
        }
        int iB = b0Var.b() - 1;
        int i13 = aVar.f3120b;
        while (i13 < iB) {
            int i14 = i13 + 1;
            int iT3 = T2(wVar, b0Var, i14);
            if (iT3 <= iT2) {
                break;
            }
            i13 = i14;
            iT2 = iT3;
        }
        aVar.f3120b = i13;
    }

    private void Q2() {
        View[] viewArr = this.L;
        if (viewArr == null || viewArr.length != this.J) {
            this.L = new View[this.J];
        }
    }

    private int S2(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i10) {
        if (!b0Var.e()) {
            return this.O.b(i10, this.J);
        }
        int iF = wVar.f(i10);
        if (iF != -1) {
            return this.O.b(iF, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
        return 0;
    }

    private int T2(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i10) {
        if (!b0Var.e()) {
            return this.O.c(i10, this.J);
        }
        int i11 = this.N.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int iF = wVar.f(i10);
        if (iF != -1) {
            return this.O.c(iF, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 0;
    }

    private int U2(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i10) {
        if (!b0Var.e()) {
            return this.O.f(i10);
        }
        int i11 = this.M.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int iF = wVar.f(i10);
        if (iF != -1) {
            return this.O.f(iF);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 1;
    }

    private void V2(float f10, int i10) {
        K2(Math.max(Math.round(f10 * this.J), i10));
    }

    private void W2(View view, int i10, boolean z10) {
        int iK;
        int iK2;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f3229b;
        int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i12 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int iR2 = R2(bVar.f3105e, bVar.f3106f);
        if (this.f3111s == 1) {
            iK2 = RecyclerView.p.K(iR2, i10, i12, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            iK = RecyclerView.p.K(this.f3113u.n(), X(), i11, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int iK3 = RecyclerView.p.K(iR2, i10, i11, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int iK4 = RecyclerView.p.K(this.f3113u.n(), o0(), i12, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            iK = iK3;
            iK2 = iK4;
        }
        X2(view, iK2, iK, z10);
    }

    private void X2(View view, int i10, int i11, boolean z10) {
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        if (z10 ? G1(view, i10, i11, qVar) : E1(view, i10, i11, qVar)) {
            view.measure(i10, i11);
        }
    }

    private void Z2() {
        int iW;
        int iF0;
        if (k2() == 1) {
            iW = n0() - e0();
            iF0 = d0();
        } else {
            iW = W() - c0();
            iF0 = f0();
        }
        K2(iW - iF0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void B1(Rect rect, int i10, int i11) {
        int iN;
        int iN2;
        if (this.K == null) {
            super.B1(rect, i10, i11);
        }
        int iD0 = d0() + e0();
        int iF0 = f0() + c0();
        if (this.f3111s == 1) {
            iN2 = RecyclerView.p.n(i11, rect.height() + iF0, a0());
            int[] iArr = this.K;
            iN = RecyclerView.p.n(i10, iArr[iArr.length - 1] + iD0, b0());
        } else {
            iN = RecyclerView.p.n(i10, rect.width() + iD0, b0());
            int[] iArr2 = this.K;
            iN2 = RecyclerView.p.n(i11, iArr2[iArr2.length - 1] + iF0, a0());
        }
        A1(iN, iN2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q D() {
        return this.f3111s == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q E(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q F(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0107  */
    /* JADX WARN: Code duplicated, block: B:81:0x010d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0123  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
    
        if (r13 == (r2 > r15)) goto L49;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View I0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.w r26, androidx.recyclerview.widget.RecyclerView.b0 r27) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.I0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public boolean K1() {
        return this.D == null && !this.I;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void L0(RecyclerView.w wVar, RecyclerView.b0 b0Var, p pVar) {
        super.L0(wVar, b0Var, pVar);
        pVar.W(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void M1(RecyclerView.b0 b0Var, LinearLayoutManager.c cVar, RecyclerView.p.c cVar2) {
        int iF = this.J;
        for (int i10 = 0; i10 < this.J && cVar.c(b0Var) && iF > 0; i10++) {
            int i11 = cVar.f3131d;
            cVar2.a(i11, Math.max(0, cVar.f3134g));
            iF -= this.O.f(i11);
            cVar.f3131d += cVar.f3132e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int N(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.f3111s == 1) {
            return this.J;
        }
        if (b0Var.b() < 1) {
            return 0;
        }
        return S2(wVar, b0Var, b0Var.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void O0(RecyclerView.w wVar, RecyclerView.b0 b0Var, View view, p pVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.N0(view, pVar);
            return;
        }
        b bVar = (b) layoutParams;
        int iS2 = S2(wVar, b0Var, bVar.a());
        if (this.f3111s == 0) {
            pVar.Y(p.f.a(bVar.e(), bVar.f(), iS2, 1, false, false));
        } else {
            pVar.Y(p.f.a(iS2, 1, bVar.e(), bVar.f(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Q0(RecyclerView recyclerView, int i10, int i11) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void R0(RecyclerView recyclerView) {
        this.O.h();
        this.O.g();
    }

    int R2(int i10, int i11) {
        if (this.f3111s != 1 || !l2()) {
            int[] iArr = this.K;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.K;
        int i12 = this.J;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void S0(RecyclerView recyclerView, int i10, int i11, int i12) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void T0(RecyclerView recyclerView, int i10, int i11) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void V0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void W0(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (b0Var.e()) {
            J2();
        }
        super.W0(wVar, b0Var);
        M2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void X0(RecyclerView.b0 b0Var) {
        super.X0(b0Var);
        this.I = false;
    }

    public void Y2(int i10) {
        if (i10 == this.J) {
            return;
        }
        this.I = true;
        if (i10 >= 1) {
            this.J = i10;
            this.O.h();
            s1();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i10);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    View e2(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z10, boolean z11) {
        int i10;
        int iJ;
        int iJ2 = J();
        int i11 = 1;
        if (z11) {
            iJ = J() - 1;
            i10 = -1;
            i11 = -1;
        } else {
            i10 = iJ2;
            iJ = 0;
        }
        int iB = b0Var.b();
        S1();
        int iM = this.f3113u.m();
        int i12 = this.f3113u.i();
        View view = null;
        View view2 = null;
        while (iJ != i10) {
            View viewI = I(iJ);
            int iG0 = g0(viewI);
            if (iG0 >= 0 && iG0 < iB && T2(wVar, b0Var, iG0) == 0) {
                if (((RecyclerView.q) viewI.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = viewI;
                    }
                } else {
                    if (this.f3113u.g(viewI) < i12 && this.f3113u.d(viewI) >= iM) {
                        return viewI;
                    }
                    if (view == null) {
                        view = viewI;
                    }
                }
            }
            iJ += i11;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int j0(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.f3111s == 0) {
            return this.J;
        }
        if (b0Var.b() < 1) {
            return 0;
        }
        return S2(wVar, b0Var, b0Var.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean m(RecyclerView.q qVar) {
        return qVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void p2(RecyclerView.w wVar, RecyclerView.b0 b0Var, LinearLayoutManager.a aVar, int i10) {
        super.p2(wVar, b0Var, aVar, i10);
        Z2();
        if (b0Var.b() > 0 && !b0Var.e()) {
            P2(wVar, b0Var, aVar, i10);
        }
        Q2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int r(RecyclerView.b0 b0Var) {
        return this.Q ? N2(b0Var) : super.r(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int s(RecyclerView.b0 b0Var) {
        return this.Q ? O2(b0Var) : super.s(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int u(RecyclerView.b0 b0Var) {
        return this.Q ? N2(b0Var) : super.u(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int v(RecyclerView.b0 b0Var) {
        return this.Q ? O2(b0Var) : super.v(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int v1(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        Z2();
        Q2();
        return super.v1(i10, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int x1(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        Z2();
        Q2();
        return super.x1(i10, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void z2(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.z2(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void n2(RecyclerView.w wVar, RecyclerView.b0 b0Var, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int iF;
        int i15;
        int iF2;
        int iF3;
        int i16;
        int iK;
        int iK2;
        View viewD;
        int iL = this.f3113u.l();
        boolean z10 = iL != 1073741824;
        int i17 = J() > 0 ? this.K[this.J] : 0;
        if (z10) {
            Z2();
        }
        boolean z11 = cVar.f3132e == 1;
        int iT2 = this.J;
        if (!z11) {
            iT2 = T2(wVar, b0Var, cVar.f3131d) + U2(wVar, b0Var, cVar.f3131d);
        }
        int i18 = 0;
        while (i18 < this.J && cVar.c(b0Var) && iT2 > 0) {
            int i19 = cVar.f3131d;
            int iU2 = U2(wVar, b0Var, i19);
            if (iU2 > this.J) {
                throw new IllegalArgumentException("Item at position " + i19 + " requires " + iU2 + " spans but GridLayoutManager has only " + this.J + OgqfiHA.WMS);
            }
            iT2 -= iU2;
            if (iT2 < 0 || (viewD = cVar.d(wVar)) == null) {
                break;
            }
            this.L[i18] = viewD;
            i18++;
        }
        if (i18 == 0) {
            bVar.f3125b = true;
            return;
        }
        I2(wVar, b0Var, i18, z11);
        float f10 = 0.0f;
        int i20 = 0;
        for (int i21 = 0; i21 < i18; i21++) {
            View view = this.L[i21];
            if (cVar.f3139l == null) {
                if (z11) {
                    d(view);
                } else {
                    e(view, 0);
                }
            } else if (z11) {
                b(view);
            } else {
                c(view, 0);
            }
            j(view, this.P);
            W2(view, iL, false);
            int iE = this.f3113u.e(view);
            if (iE > i20) {
                i20 = iE;
            }
            float f11 = (this.f3113u.f(view) * 1.0f) / ((b) view.getLayoutParams()).f3106f;
            if (f11 > f10) {
                f10 = f11;
            }
        }
        if (z10) {
            V2(f10, i17);
            i20 = 0;
            for (int i22 = 0; i22 < i18; i22++) {
                View view2 = this.L[i22];
                W2(view2, 1073741824, true);
                int iE2 = this.f3113u.e(view2);
                if (iE2 > i20) {
                    i20 = iE2;
                }
            }
        }
        for (int i23 = 0; i23 < i18; i23++) {
            View view3 = this.L[i23];
            if (this.f3113u.e(view3) != i20) {
                b bVar2 = (b) view3.getLayoutParams();
                Rect rect = bVar2.f3229b;
                int i24 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar2).topMargin + ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin;
                int i25 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar2).leftMargin + ((ViewGroup.MarginLayoutParams) bVar2).rightMargin;
                int iR2 = R2(bVar2.f3105e, bVar2.f3106f);
                if (this.f3111s == 1) {
                    iK2 = RecyclerView.p.K(iR2, 1073741824, i25, ((ViewGroup.MarginLayoutParams) bVar2).width, false);
                    iK = View.MeasureSpec.makeMeasureSpec(i20 - i24, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i20 - i25, 1073741824);
                    iK = RecyclerView.p.K(iR2, 1073741824, i24, ((ViewGroup.MarginLayoutParams) bVar2).height, false);
                    iK2 = iMakeMeasureSpec;
                }
                X2(view3, iK2, iK, true);
            }
        }
        bVar.f3124a = i20;
        if (this.f3111s == 1) {
            if (cVar.f3133f == -1) {
                iF = cVar.f3129b;
                i16 = iF - i20;
            } else {
                i16 = cVar.f3129b;
                iF = i16 + i20;
            }
            i13 = i16;
            i14 = 0;
            i12 = 0;
        } else {
            if (cVar.f3133f == -1) {
                i11 = cVar.f3129b;
                i10 = i11 - i20;
            } else {
                i10 = cVar.f3129b;
                i11 = i10 + i20;
            }
            i12 = i10;
            i13 = 0;
            i14 = i11;
            iF = 0;
        }
        int i26 = 0;
        while (i26 < i18) {
            View view4 = this.L[i26];
            b bVar3 = (b) view4.getLayoutParams();
            if (this.f3111s == 1) {
                if (l2()) {
                    int iD0 = d0() + this.K[this.J - bVar3.f3105e];
                    iF2 = iD0;
                    iF3 = iD0 - this.f3113u.f(view4);
                } else {
                    int iD1 = d0() + this.K[bVar3.f3105e];
                    iF3 = iD1;
                    iF2 = this.f3113u.f(view4) + iD1;
                }
                i15 = i13;
            } else {
                int iF0 = f0() + this.K[bVar3.f3105e];
                i15 = iF0;
                iF2 = i14;
                iF3 = i12;
                iF = this.f3113u.f(view4) + iF0;
            }
            y0(view4, iF3, i15, iF2, iF);
            if (bVar3.c() || bVar3.b()) {
                bVar.f3126c = true;
            }
            bVar.f3127d |= view4.hasFocusable();
            i26++;
            iF = iF;
            i14 = iF2;
            i12 = iF3;
            i13 = i15;
        }
        Arrays.fill(this.L, (Object) null);
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class b extends RecyclerView.q {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3105e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f3106f;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3105e = -1;
            this.f3106f = 0;
        }

        public int e() {
            return this.f3105e;
        }

        public int f() {
            return this.f3106f;
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f3105e = -1;
            this.f3106f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3105e = -1;
            this.f3106f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3105e = -1;
            this.f3106f = 0;
        }
    }
}
