package t8;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import x7.l0;

/* JADX INFO: compiled from: VideoFrameReleaseHelper.java */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t8.a f25649a = new t8.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f25650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f25651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f25652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Surface f25653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f25654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f25655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f25656h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f25657i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f25658j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f25659k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f25660l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f25661m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f25662n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f25663o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f25664p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f25665q;

    /* JADX INFO: compiled from: VideoFrameReleaseHelper.java */
    private static final class a {
        public static void a(Surface surface, float f10) {
            try {
                surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e10) {
                x7.r.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
            }
        }
    }

    /* JADX INFO: compiled from: VideoFrameReleaseHelper.java */
    private static final class c implements Choreographer.FrameCallback, Handler.Callback {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final c f25668f = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile long f25669a = -9223372036854775807L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f25670b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final HandlerThread f25671c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Choreographer f25672d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f25673e;

        private c() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f25671c = handlerThread;
            handlerThread.start();
            Handler handlerZ = l0.z(handlerThread.getLooper(), this);
            this.f25670b = handlerZ;
            handlerZ.sendEmptyMessage(1);
        }

        private void b() {
            Choreographer choreographer = this.f25672d;
            if (choreographer != null) {
                int i10 = this.f25673e + 1;
                this.f25673e = i10;
                if (i10 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        private void c() {
            try {
                this.f25672d = Choreographer.getInstance();
            } catch (RuntimeException e10) {
                x7.r.i("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
        }

        public static c d() {
            return f25668f;
        }

        private void f() {
            Choreographer choreographer = this.f25672d;
            if (choreographer != null) {
                int i10 = this.f25673e - 1;
                this.f25673e = i10;
                if (i10 == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f25669a = -9223372036854775807L;
                }
            }
        }

        public void a() {
            this.f25670b.sendEmptyMessage(2);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            this.f25669a = j10;
            ((Choreographer) x7.a.e(this.f25672d)).postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.f25670b.sendEmptyMessage(3);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                c();
                return true;
            }
            if (i10 == 2) {
                b();
                return true;
            }
            if (i10 != 3) {
                return false;
            }
            f();
            return true;
        }
    }

    public i(Context context) {
        b bVarF = f(context);
        this.f25650b = bVarF;
        this.f25651c = bVarF != null ? c.d() : null;
        this.f25659k = -9223372036854775807L;
        this.f25660l = -9223372036854775807L;
        this.f25654f = -1.0f;
        this.f25657i = 1.0f;
        this.f25658j = 0;
    }

    private static boolean c(long j10, long j11) {
        return Math.abs(j10 - j11) <= 20000000;
    }

    private void d() {
        Surface surface;
        if (l0.f28136a < 30 || (surface = this.f25653e) == null || this.f25658j == Integer.MIN_VALUE || this.f25656h == 0.0f) {
            return;
        }
        this.f25656h = 0.0f;
        a.a(surface, 0.0f);
    }

    private static long e(long j10, long j11, long j12) {
        long j13;
        long j14 = j11 + (((j10 - j11) / j12) * j12);
        if (j10 <= j14) {
            j13 = j14 - j12;
        } else {
            j14 = j12 + j14;
            j13 = j14;
        }
        return j14 - j10 < j10 - j13 ? j14 : j13;
    }

    private b f(Context context) {
        DisplayManager displayManager;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            return null;
        }
        return new b(displayManager);
    }

    private void n() {
        this.f25661m = 0L;
        this.f25664p = -1L;
        this.f25662n = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.f25659k = refreshRate;
            this.f25660l = (refreshRate * 80) / 100;
        } else {
            x7.r.h("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.f25659k = -9223372036854775807L;
            this.f25660l = -9223372036854775807L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    private void q() {
        if (l0.f28136a < 30 || this.f25653e == null) {
            return;
        }
        float fB = this.f25649a.e() ? this.f25649a.b() : this.f25654f;
        float f10 = this.f25655g;
        if (fB == f10) {
            return;
        }
        boolean z10 = true;
        if (fB != -1.0f && f10 != -1.0f) {
            if (Math.abs(fB - this.f25655g) < (this.f25649a.e() && (this.f25649a.d() > 5000000000L ? 1 : (this.f25649a.d() == 5000000000L ? 0 : -1)) >= 0 ? 0.02f : 1.0f)) {
                z10 = false;
            }
        } else if (fB == -1.0f && this.f25649a.c() < 30) {
            z10 = false;
        }
        if (z10) {
            this.f25655g = fB;
            r(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0021  */
    private void r(boolean z10) {
        Surface surface;
        float f10;
        if (l0.f28136a < 30 || (surface = this.f25653e) == null || this.f25658j == Integer.MIN_VALUE) {
            return;
        }
        if (this.f25652d) {
            float f11 = this.f25655g;
            if (f11 != -1.0f) {
                f10 = f11 * this.f25657i;
            } else {
                f10 = 0.0f;
            }
        } else {
            f10 = 0.0f;
        }
        if (z10 || this.f25656h != f10) {
            this.f25656h = f10;
            a.a(surface, f10);
        }
    }

    public long b(long j10) {
        long j11;
        if (this.f25664p == -1 || !this.f25649a.e()) {
            j11 = j10;
        } else {
            long jA = this.f25665q + ((long) ((this.f25649a.a() * (this.f25661m - this.f25664p)) / this.f25657i));
            if (c(j10, jA)) {
                j11 = jA;
            } else {
                n();
                j11 = j10;
            }
        }
        this.f25662n = this.f25661m;
        this.f25663o = j11;
        c cVar = this.f25651c;
        if (cVar == null || this.f25659k == -9223372036854775807L) {
            return j11;
        }
        long j12 = cVar.f25669a;
        return j12 == -9223372036854775807L ? j11 : e(j11, j12, this.f25659k) - this.f25660l;
    }

    public void g(float f10) {
        this.f25654f = f10;
        this.f25649a.g();
        q();
    }

    public void h(long j10) {
        long j11 = this.f25662n;
        if (j11 != -1) {
            this.f25664p = j11;
            this.f25665q = this.f25663o;
        }
        this.f25661m++;
        this.f25649a.f(j10 * 1000);
        q();
    }

    public void i(float f10) {
        this.f25657i = f10;
        n();
        r(false);
    }

    public void j() {
        n();
    }

    public void k() {
        this.f25652d = true;
        n();
        if (this.f25650b != null) {
            ((c) x7.a.e(this.f25651c)).a();
            this.f25650b.b();
        }
        r(false);
    }

    public void l() {
        this.f25652d = false;
        b bVar = this.f25650b;
        if (bVar != null) {
            bVar.c();
            ((c) x7.a.e(this.f25651c)).e();
        }
        d();
    }

    public void m(Surface surface) {
        if (this.f25653e == surface) {
            return;
        }
        d();
        this.f25653e = surface;
        r(true);
    }

    public void o(int i10) {
        if (this.f25658j == i10) {
            return;
        }
        this.f25658j = i10;
        r(true);
    }

    /* JADX INFO: compiled from: VideoFrameReleaseHelper.java */
    private final class b implements DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DisplayManager f25666a;

        public b(DisplayManager displayManager) {
            this.f25666a = displayManager;
        }

        private Display a() {
            return this.f25666a.getDisplay(0);
        }

        public void b() {
            this.f25666a.registerDisplayListener(this, l0.A());
            i.this.p(a());
        }

        public void c() {
            this.f25666a.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            if (i10 == 0) {
                i.this.p(a());
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }
    }
}
