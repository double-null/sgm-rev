package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* JADX INFO: compiled from: ForwardingListener.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class p0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f1384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final View f1387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Runnable f1388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Runnable f1389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f1390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f1391h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int[] f1392i = new int[2];

    /* JADX INFO: compiled from: ForwardingListener.java */
    private class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = p0.this.f1387d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: compiled from: ForwardingListener.java */
    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            p0.this.e();
        }
    }

    public p0(View view) {
        this.f1387d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1384a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1385b = tapTimeout;
        this.f1386c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.f1389f;
        if (runnable != null) {
            this.f1387d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1388e;
        if (runnable2 != null) {
            this.f1387d.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) {
        n0 n0Var;
        View view = this.f1387d;
        l.e eVarB = b();
        if (eVarB == null || !eVarB.a() || (n0Var = (n0) eVarB.m()) == null || !n0Var.isShown()) {
            return false;
        }
        MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        i(view, motionEventObtainNoHistory);
        j(n0Var, motionEventObtainNoHistory);
        boolean zE = n0Var.e(motionEventObtainNoHistory, this.f1391h);
        motionEventObtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return zE && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    private boolean g(MotionEvent motionEvent) {
        View view = this.f1387d;
        if (!view.isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1391h = motionEvent.getPointerId(0);
            if (this.f1388e == null) {
                this.f1388e = new a();
            }
            view.postDelayed(this.f1388e, this.f1385b);
            if (this.f1389f == null) {
                this.f1389f = new b();
            }
            view.postDelayed(this.f1389f, this.f1386c);
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f1391h);
            if (iFindPointerIndex >= 0 && !h(view, motionEvent.getX(iFindPointerIndex), motionEvent.getY(iFindPointerIndex), this.f1384a)) {
                a();
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
        } else if (actionMasked == 3) {
            a();
        }
        return false;
    }

    private static boolean h(View view, float f10, float f11, float f12) {
        float f13 = -f12;
        return f10 >= f13 && f11 >= f13 && f10 < ((float) (view.getRight() - view.getLeft())) + f12 && f11 < ((float) (view.getBottom() - view.getTop())) + f12;
    }

    private boolean i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1392i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1392i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    public abstract l.e b();

    protected abstract boolean c();

    protected boolean d() {
        l.e eVarB = b();
        if (eVarB == null || !eVarB.a()) {
            return true;
        }
        eVarB.dismiss();
        return true;
    }

    void e() {
        a();
        View view = this.f1387d;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f1390g = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = this.f1390g;
        if (z11) {
            z10 = f(motionEvent) || !d();
        } else {
            z10 = g(motionEvent) && c();
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1387d.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f1390g = z10;
        return z10 || z11;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f1390g = false;
        this.f1391h = -1;
        Runnable runnable = this.f1388e;
        if (runnable != null) {
            this.f1387d.removeCallbacks(runnable);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
