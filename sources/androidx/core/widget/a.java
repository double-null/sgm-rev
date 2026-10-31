package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.z0;

/* JADX INFO: compiled from: AutoScrollHelper.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f2045r = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final View f2048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Runnable f2049d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f2052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f2053h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f2057l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f2058m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f2059n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f2060o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f2061p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f2062q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final C0038a f2046a = new C0038a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Interpolator f2047b = new AccelerateInterpolator();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float[] f2050e = {0.0f, 0.0f};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float[] f2051f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float[] f2054i = {0.0f, 0.0f};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float[] f2055j = {0.0f, 0.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float[] f2056k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AutoScrollHelper.java */
    private static class C0038a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f2063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f2064b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f2065c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f2066d;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private float f2072j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f2073k;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f2067e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f2071i = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f2068f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f2069g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f2070h = 0;

        C0038a() {
        }

        private float e(long j10) {
            long j11 = this.f2067e;
            if (j10 < j11) {
                return 0.0f;
            }
            long j12 = this.f2071i;
            if (j12 < 0 || j10 < j12) {
                return a.e((j10 - j11) / this.f2063a, 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f2072j;
            return (1.0f - f10) + (f10 * a.e((j10 - j12) / this.f2073k, 0.0f, 1.0f));
        }

        private float g(float f10) {
            return ((-4.0f) * f10 * f10) + (f10 * 4.0f);
        }

        public void a() {
            if (this.f2068f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j10 = jCurrentAnimationTimeMillis - this.f2068f;
            this.f2068f = jCurrentAnimationTimeMillis;
            float f10 = j10 * fG;
            this.f2069g = (int) (this.f2065c * f10);
            this.f2070h = (int) (f10 * this.f2066d);
        }

        public int b() {
            return this.f2069g;
        }

        public int c() {
            return this.f2070h;
        }

        public int d() {
            float f10 = this.f2065c;
            return (int) (f10 / Math.abs(f10));
        }

        public int f() {
            float f10 = this.f2066d;
            return (int) (f10 / Math.abs(f10));
        }

        public boolean h() {
            return this.f2071i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f2071i + ((long) this.f2073k);
        }

        public void i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2073k = a.f((int) (jCurrentAnimationTimeMillis - this.f2067e), 0, this.f2064b);
            this.f2072j = e(jCurrentAnimationTimeMillis);
            this.f2071i = jCurrentAnimationTimeMillis;
        }

        public void j(int i10) {
            this.f2064b = i10;
        }

        public void k(int i10) {
            this.f2063a = i10;
        }

        public void l(float f10, float f11) {
            this.f2065c = f10;
            this.f2066d = f11;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2067e = jCurrentAnimationTimeMillis;
            this.f2071i = -1L;
            this.f2068f = jCurrentAnimationTimeMillis;
            this.f2072j = 0.5f;
            this.f2069g = 0;
            this.f2070h = 0;
        }
    }

    /* JADX INFO: compiled from: AutoScrollHelper.java */
    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f2060o) {
                if (aVar.f2058m) {
                    aVar.f2058m = false;
                    aVar.f2046a.m();
                }
                C0038a c0038a = a.this.f2046a;
                if (c0038a.h() || !a.this.u()) {
                    a.this.f2060o = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f2059n) {
                    aVar2.f2059n = false;
                    aVar2.c();
                }
                c0038a.a();
                a.this.j(c0038a.b(), c0038a.c());
                z0.E(a.this.f2048c, this);
            }
        }
    }

    public a(View view) {
        this.f2048c = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (int) ((1575.0f * f10) + 0.5f);
        o(f11, f11);
        float f12 = (int) ((f10 * 315.0f) + 0.5f);
        p(f12, f12);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f2045r);
        r(500);
        q(500);
    }

    private float d(int i10, float f10, float f11, float f12) {
        float fH = h(this.f2050e[i10], f11, this.f2051f[i10], f10);
        if (fH == 0.0f) {
            return 0.0f;
        }
        float f13 = this.f2054i[i10];
        float f14 = this.f2055j[i10];
        float f15 = this.f2056k[i10];
        float f16 = f13 * f12;
        return fH > 0.0f ? e(fH * f16, f14, f15) : -e((-fH) * f16, f14, f15);
    }

    static float e(float f10, float f11, float f12) {
        if (f10 > f12) {
            return f12;
        }
        return f10 < f11 ? f11 : f10;
    }

    static int f(int i10, int i11, int i12) {
        if (i10 > i12) {
            return i12;
        }
        return i10 < i11 ? i11 : i10;
    }

    private float g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f2052g;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.f2060o && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    private float h(float f10, float f11, float f12, float f13) {
        float interpolation;
        float fE = e(f10 * f11, 0.0f, f12);
        float fG = g(f11 - f13, fE) - g(f13, fE);
        if (fG < 0.0f) {
            interpolation = -this.f2047b.getInterpolation(-fG);
        } else {
            if (fG <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f2047b.getInterpolation(fG);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    private void i() {
        if (this.f2058m) {
            this.f2060o = false;
        } else {
            this.f2046a.i();
        }
    }

    private void v() {
        int i10;
        if (this.f2049d == null) {
            this.f2049d = new b();
        }
        this.f2060o = true;
        this.f2058m = true;
        if (this.f2057l || (i10 = this.f2053h) <= 0) {
            this.f2049d.run();
        } else {
            z0.F(this.f2048c, this.f2049d, i10);
        }
        this.f2057l = true;
    }

    public abstract boolean a(int i10);

    public abstract boolean b(int i10);

    void c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f2048c.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public abstract void j(int i10, int i11);

    public a k(int i10) {
        this.f2053h = i10;
        return this;
    }

    public a l(int i10) {
        this.f2052g = i10;
        return this;
    }

    public a m(boolean z10) {
        if (this.f2061p && !z10) {
            i();
        }
        this.f2061p = z10;
        return this;
    }

    public a n(float f10, float f11) {
        float[] fArr = this.f2051f;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a o(float f10, float f11) {
        float[] fArr = this.f2056k;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f2061p) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                i();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    i();
                }
            }
            return this.f2062q && this.f2060o;
        }
        this.f2059n = true;
        this.f2057l = false;
        this.f2046a.l(d(0, motionEvent.getX(), view.getWidth(), this.f2048c.getWidth()), d(1, motionEvent.getY(), view.getHeight(), this.f2048c.getHeight()));
        if (!this.f2060o && u()) {
            v();
        }
        if (this.f2062q) {
            return false;
        }
    }

    public a p(float f10, float f11) {
        float[] fArr = this.f2055j;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public a q(int i10) {
        this.f2046a.j(i10);
        return this;
    }

    public a r(int i10) {
        this.f2046a.k(i10);
        return this;
    }

    public a s(float f10, float f11) {
        float[] fArr = this.f2050e;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a t(float f10, float f11) {
        float[] fArr = this.f2054i;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    boolean u() {
        C0038a c0038a = this.f2046a;
        int iF = c0038a.f();
        int iD = c0038a.d();
        return (iF != 0 && b(iF)) || (iD != 0 && a(iD));
    }
}
