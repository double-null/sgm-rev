package androidx.core.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: DifferentialMotionFlingController.java */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f1934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f1935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f1936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f1937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private VelocityTracker f1938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f1939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f1940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f1941h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f1942i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f1943j;

    /* JADX INFO: compiled from: DifferentialMotionFlingController.java */
    interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10);
    }

    /* JADX INFO: compiled from: DifferentialMotionFlingController.java */
    interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i10);
    }

    public e(Context context, f fVar) {
        this(context, fVar, new b() { // from class: androidx.core.view.c
            @Override // androidx.core.view.e.b
            public final void a(Context context2, int[] iArr, MotionEvent motionEvent, int i10) {
                e.c(context2, iArr, motionEvent, i10);
            }
        }, new a() { // from class: androidx.core.view.d
            @Override // androidx.core.view.e.a
            public final float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
                return e.f(velocityTracker, motionEvent, i10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = p2.i(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
        iArr[1] = p2.h(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
    }

    private boolean d(MotionEvent motionEvent, int i10) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f1941h == source && this.f1942i == deviceId && this.f1940g == i10) {
            return false;
        }
        this.f1936c.a(this.f1934a, this.f1943j, motionEvent, i10);
        this.f1941h = source;
        this.f1942i = deviceId;
        this.f1940g = i10;
        return true;
    }

    private float e(MotionEvent motionEvent, int i10) {
        if (this.f1938e == null) {
            this.f1938e = VelocityTracker.obtain();
        }
        return this.f1937d.a(this.f1938e, motionEvent, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
        w0.a(velocityTracker, motionEvent);
        w0.b(velocityTracker, 1000);
        return w0.d(velocityTracker, i10);
    }

    public void g(MotionEvent motionEvent, int i10) {
        boolean zD = d(motionEvent, i10);
        if (this.f1943j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f1938e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1938e = null;
                return;
            }
            return;
        }
        float fE = e(motionEvent, i10) * this.f1935b.b();
        float fSignum = Math.signum(fE);
        if (zD || (fSignum != Math.signum(this.f1939f) && fSignum != 0.0f)) {
            this.f1935b.c();
        }
        float fAbs = Math.abs(fE);
        int[] iArr = this.f1943j;
        if (fAbs < iArr[0]) {
            return;
        }
        int i11 = iArr[1];
        float fMax = Math.max(-i11, Math.min(fE, i11));
        this.f1939f = this.f1935b.a(fMax) ? fMax : 0.0f;
    }

    e(Context context, f fVar, b bVar, a aVar) {
        this.f1940g = -1;
        this.f1941h = -1;
        this.f1942i = -1;
        this.f1943j = new int[]{Integer.MAX_VALUE, 0};
        this.f1934a = context;
        this.f1935b = fVar;
        this.f1936c = bVar;
        this.f1937d = aVar;
    }
}
