package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.z0;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: FastScroller.java */
/* JADX INFO: loaded from: classes.dex */
class d extends RecyclerView.o implements RecyclerView.t {
    private static final int[] D = {R.attr.state_pressed};
    private static final int[] E = new int[0];
    int A;
    private final Runnable B;
    private final RecyclerView.u C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final StateListDrawable f3359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Drawable f3360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f3361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f3362f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final StateListDrawable f3363g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Drawable f3364h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f3365i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f3366j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f3367k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f3368l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    float f3369m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f3370n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f3371o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    float f3372p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private RecyclerView f3375s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    final ValueAnimator f3382z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f3373q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f3374r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f3376t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f3377u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f3378v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f3379w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int[] f3380x = new int[2];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int[] f3381y = new int[2];

    /* JADX INFO: compiled from: FastScroller.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.q(500);
        }
    }

    /* JADX INFO: compiled from: FastScroller.java */
    class b extends RecyclerView.u {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            d.this.B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* JADX INFO: compiled from: FastScroller.java */
    private class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f3385a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3385a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f3385a) {
                this.f3385a = false;
                return;
            }
            if (((Float) d.this.f3382z.getAnimatedValue()).floatValue() == 0.0f) {
                d dVar = d.this;
                dVar.A = 0;
                dVar.y(0);
            } else {
                d dVar2 = d.this;
                dVar2.A = 2;
                dVar2.v();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FastScroller.java */
    private class C0066d implements ValueAnimator.AnimatorUpdateListener {
        C0066d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            d.this.f3359c.setAlpha(iFloatValue);
            d.this.f3360d.setAlpha(iFloatValue);
            d.this.v();
        }
    }

    d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f3382z = valueAnimatorOfFloat;
        this.A = 0;
        this.B = new a();
        this.C = new b();
        this.f3359c = stateListDrawable;
        this.f3360d = drawable;
        this.f3363g = stateListDrawable2;
        this.f3364h = drawable2;
        this.f3361e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f3362f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f3365i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f3366j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f3357a = i11;
        this.f3358b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new C0066d());
        j(recyclerView);
    }

    private void C(float f10) {
        int[] iArrP = p();
        float fMax = Math.max(iArrP[0], Math.min(iArrP[1], f10));
        if (Math.abs(this.f3368l - fMax) < 2.0f) {
            return;
        }
        int iX = x(this.f3369m, fMax, iArrP, this.f3375s.computeVerticalScrollRange(), this.f3375s.computeVerticalScrollOffset(), this.f3374r);
        if (iX != 0) {
            this.f3375s.scrollBy(0, iX);
        }
        this.f3369m = fMax;
    }

    private void k() {
        this.f3375s.removeCallbacks(this.B);
    }

    private void l() {
        this.f3375s.removeItemDecoration(this);
        this.f3375s.removeOnItemTouchListener(this);
        this.f3375s.removeOnScrollListener(this.C);
        k();
    }

    private void m(Canvas canvas) {
        int i10 = this.f3374r;
        int i11 = this.f3365i;
        int i12 = i10 - i11;
        int i13 = this.f3371o;
        int i14 = this.f3370n;
        int i15 = i13 - (i14 / 2);
        this.f3363g.setBounds(0, 0, i14, i11);
        this.f3364h.setBounds(0, 0, this.f3373q, this.f3366j);
        canvas.translate(0.0f, i12);
        this.f3364h.draw(canvas);
        canvas.translate(i15, 0.0f);
        this.f3363g.draw(canvas);
        canvas.translate(-i15, -i12);
    }

    private void n(Canvas canvas) {
        int i10 = this.f3373q;
        int i11 = this.f3361e;
        int i12 = i10 - i11;
        int i13 = this.f3368l;
        int i14 = this.f3367k;
        int i15 = i13 - (i14 / 2);
        this.f3359c.setBounds(0, 0, i11, i14);
        this.f3360d.setBounds(0, 0, this.f3362f, this.f3374r);
        if (!s()) {
            canvas.translate(i12, 0.0f);
            this.f3360d.draw(canvas);
            canvas.translate(0.0f, i15);
            this.f3359c.draw(canvas);
            canvas.translate(-i12, -i15);
            return;
        }
        this.f3360d.draw(canvas);
        canvas.translate(this.f3361e, i15);
        canvas.scale(-1.0f, 1.0f);
        this.f3359c.draw(canvas);
        canvas.scale(-1.0f, 1.0f);
        canvas.translate(-this.f3361e, -i15);
    }

    private int[] o() {
        int[] iArr = this.f3381y;
        int i10 = this.f3358b;
        iArr[0] = i10;
        iArr[1] = this.f3373q - i10;
        return iArr;
    }

    private int[] p() {
        int[] iArr = this.f3380x;
        int i10 = this.f3358b;
        iArr[0] = i10;
        iArr[1] = this.f3374r - i10;
        return iArr;
    }

    private void r(float f10) {
        int[] iArrO = o();
        float fMax = Math.max(iArrO[0], Math.min(iArrO[1], f10));
        if (Math.abs(this.f3371o - fMax) < 2.0f) {
            return;
        }
        int iX = x(this.f3372p, fMax, iArrO, this.f3375s.computeHorizontalScrollRange(), this.f3375s.computeHorizontalScrollOffset(), this.f3373q);
        if (iX != 0) {
            this.f3375s.scrollBy(iX, 0);
        }
        this.f3372p = fMax;
    }

    private boolean s() {
        return z0.n(this.f3375s) == 1;
    }

    private void w(int i10) {
        k();
        this.f3375s.postDelayed(this.B, i10);
    }

    private int x(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f11 - f10) / i13) * i14);
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }

    private void z() {
        this.f3375s.addItemDecoration(this);
        this.f3375s.addOnItemTouchListener(this);
        this.f3375s.addOnScrollListener(this.C);
    }

    public void A() {
        int i10 = this.A;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                this.f3382z.cancel();
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.f3382z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f3382z.setDuration(500L);
        this.f3382z.setStartDelay(0L);
        this.f3382z.start();
    }

    void B(int i10, int i11) {
        int iComputeVerticalScrollRange = this.f3375s.computeVerticalScrollRange();
        int i12 = this.f3374r;
        this.f3376t = iComputeVerticalScrollRange - i12 > 0 && i12 >= this.f3357a;
        int iComputeHorizontalScrollRange = this.f3375s.computeHorizontalScrollRange();
        int i13 = this.f3373q;
        boolean z10 = iComputeHorizontalScrollRange - i13 > 0 && i13 >= this.f3357a;
        this.f3377u = z10;
        boolean z11 = this.f3376t;
        if (!z11 && !z10) {
            if (this.f3378v != 0) {
                y(0);
                return;
            }
            return;
        }
        if (z11) {
            float f10 = i12;
            this.f3368l = (int) ((f10 * (i11 + (f10 / 2.0f))) / iComputeVerticalScrollRange);
            this.f3367k = Math.min(i12, (i12 * i12) / iComputeVerticalScrollRange);
        }
        if (this.f3377u) {
            float f11 = i13;
            this.f3371o = (int) ((f11 * (i10 + (f11 / 2.0f))) / iComputeHorizontalScrollRange);
            this.f3370n = Math.min(i13, (i13 * i13) / iComputeHorizontalScrollRange);
        }
        int i14 = this.f3378v;
        if (i14 == 0 || i14 == 1) {
            y(1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f3378v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zU = u(motionEvent.getX(), motionEvent.getY());
            boolean zT = t(motionEvent.getX(), motionEvent.getY());
            if (zU || zT) {
                if (zT) {
                    this.f3379w = 1;
                    this.f3372p = (int) motionEvent.getX();
                } else if (zU) {
                    this.f3379w = 2;
                    this.f3369m = (int) motionEvent.getY();
                }
                y(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f3378v == 2) {
            this.f3369m = 0.0f;
            this.f3372p = 0.0f;
            y(1);
            this.f3379w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f3378v == 2) {
            A();
            if (this.f3379w == 1) {
                r(motionEvent.getX());
            }
            if (this.f3379w == 2) {
                C(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10 = this.f3378v;
        if (i10 == 1) {
            boolean zU = u(motionEvent.getX(), motionEvent.getY());
            boolean zT = t(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!zU && !zT) {
                return false;
            }
            if (zT) {
                this.f3379w = 1;
                this.f3372p = (int) motionEvent.getX();
            } else if (zU) {
                this.f3379w = 2;
                this.f3369m = (int) motionEvent.getY();
            }
            y(2);
        } else if (i10 != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        if (this.f3373q != this.f3375s.getWidth() || this.f3374r != this.f3375s.getHeight()) {
            this.f3373q = this.f3375s.getWidth();
            this.f3374r = this.f3375s.getHeight();
            y(0);
        } else if (this.A != 0) {
            if (this.f3376t) {
                n(canvas);
            }
            if (this.f3377u) {
                m(canvas);
            }
        }
    }

    public void j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3375s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            l();
        }
        this.f3375s = recyclerView;
        if (recyclerView != null) {
            z();
        }
    }

    void q(int i10) {
        int i11 = this.A;
        if (i11 == 1) {
            this.f3382z.cancel();
        } else if (i11 != 2) {
            return;
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.f3382z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f3382z.setDuration(i10);
        this.f3382z.start();
    }

    boolean t(float f10, float f11) {
        if (f11 >= this.f3374r - this.f3365i) {
            int i10 = this.f3371o;
            int i11 = this.f3370n;
            if (f10 >= i10 - (i11 / 2) && f10 <= i10 + (i11 / 2)) {
                return true;
            }
        }
        return false;
    }

    boolean u(float f10, float f11) {
        if (!s() ? f10 >= this.f3373q - this.f3361e : f10 <= this.f3361e) {
            int i10 = this.f3368l;
            int i11 = this.f3367k;
            if (f11 >= i10 - (i11 / 2) && f11 <= i10 + (i11 / 2)) {
                return true;
            }
        }
        return false;
    }

    void v() {
        this.f3375s.invalidate();
    }

    void y(int i10) {
        if (i10 == 2 && this.f3378v != 2) {
            this.f3359c.setState(D);
            k();
        }
        if (i10 == 0) {
            v();
        } else {
            A();
        }
        if (this.f3378v == 2 && i10 != 2) {
            this.f3359c.setState(E);
            w(1200);
        } else if (i10 == 1) {
            w(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.f3378v = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void c(boolean z10) {
    }
}
