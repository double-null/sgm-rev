package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: compiled from: LinearSmoothScroller.java */
/* JADX INFO: loaded from: classes.dex */
public class g extends RecyclerView.a0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected PointF f3414k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final DisplayMetrics f3415l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f3417n;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final LinearInterpolator f3412i = new LinearInterpolator();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final DecelerateInterpolator f3413j = new DecelerateInterpolator();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f3416m = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected int f3418o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected int f3419p = 0;

    public g(Context context) {
        this.f3415l = context.getResources().getDisplayMetrics();
    }

    private float A() {
        if (!this.f3416m) {
            this.f3417n = v(this.f3415l);
            this.f3416m = true;
        }
        return this.f3417n;
    }

    private int y(int i10, int i11) {
        int i12 = i10 - i11;
        if (i10 * i12 <= 0) {
            return 0;
        }
        return i12;
    }

    protected int B() {
        PointF pointF = this.f3414k;
        if (pointF != null) {
            float f10 = pointF.y;
            if (f10 != 0.0f) {
                return f10 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    protected void C(RecyclerView.a0.a aVar) {
        PointF pointFA = a(f());
        if (pointFA == null || (pointFA.x == 0.0f && pointFA.y == 0.0f)) {
            aVar.b(f());
            r();
            return;
        }
        i(pointFA);
        this.f3414k = pointFA;
        this.f3418o = (int) (pointFA.x * 10000.0f);
        this.f3419p = (int) (pointFA.y * 10000.0f);
        aVar.d((int) (this.f3418o * 1.2f), (int) (this.f3419p * 1.2f), (int) (x(10000) * 1.2f), this.f3412i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0
    protected void l(int i10, int i11, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
        if (c() == 0) {
            r();
            return;
        }
        this.f3418o = y(this.f3418o, i10);
        int iY = y(this.f3419p, i11);
        this.f3419p = iY;
        if (this.f3418o == 0 && iY == 0) {
            C(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0
    protected void n() {
        this.f3419p = 0;
        this.f3418o = 0;
        this.f3414k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0
    protected void o(View view, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
        int iT = t(view, z());
        int iU = u(view, B());
        int iW = w((int) Math.sqrt((iT * iT) + (iU * iU)));
        if (iW > 0) {
            aVar.d(-iT, -iU, iW, this.f3413j);
        }
    }

    public int s(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == -1) {
            return i12 - i10;
        }
        if (i14 != 0) {
            if (i14 == 1) {
                return i13 - i11;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i15 = i12 - i10;
        if (i15 > 0) {
            return i15;
        }
        int i16 = i13 - i11;
        if (i16 < 0) {
            return i16;
        }
        return 0;
    }

    public int t(View view, int i10) {
        RecyclerView.p pVarE = e();
        if (pVarE == null || !pVarE.k()) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        return s(pVarE.Q(view) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, pVarE.T(view) + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, pVarE.d0(), pVarE.n0() - pVarE.e0(), i10);
    }

    public int u(View view, int i10) {
        RecyclerView.p pVarE = e();
        if (pVarE == null || !pVarE.l()) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        return s(pVarE.U(view) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, pVarE.O(view) + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin, pVarE.f0(), pVarE.W() - pVarE.c0(), i10);
    }

    protected float v(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    protected int w(int i10) {
        return (int) Math.ceil(((double) x(i10)) / 0.3356d);
    }

    protected int x(int i10) {
        return (int) Math.ceil(Math.abs(i10) * A());
    }

    protected int z() {
        PointF pointF = this.f3414k;
        if (pointF != null) {
            float f10 = pointF.x;
            if (f10 != 0.0f) {
                return f10 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0
    protected void m() {
    }
}
