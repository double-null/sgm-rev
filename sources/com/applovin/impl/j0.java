package com.applovin.impl;

import android.app.Activity;
import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.View;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f6873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f6874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f6875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f6876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f6877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f6878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f6879g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f6880h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f6881i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f6883k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f6884l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Integer f6885m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile boolean f6886n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile boolean f6887o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Handler f6888p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private HandlerThread f6889q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private c f6891s;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private WeakReference f6882j = new WeakReference(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Runnable f6890r = new Runnable() { // from class: com.applovin.impl.kb
        @Override // java.lang.Runnable
        public final void run() {
            this.f7009a.a();
        }
    };

    class b implements PixelCopy.OnPixelCopyFinishedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f6893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bitmap f6894b;

        b(d dVar, Bitmap bitmap) {
            this.f6893a = dVar;
            this.f6894b = bitmap;
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public void onPixelCopyFinished(int i10) {
            if (i10 == 0) {
                this.f6893a.a(this.f6894b);
                return;
            }
            com.applovin.impl.sdk.p unused = j0.this.f6874b;
            if (com.applovin.impl.sdk.p.a()) {
                j0.this.f6874b.b("BlackViewDetector", "Failed to capture screenshot with error code: " + i10);
            }
            this.f6893a.a(true);
        }
    }

    public interface c {
        void a(int i10, int i11);

        void a(int i10, int i11, int i12);
    }

    private interface d {
        void a(Bitmap bitmap);

        void a(boolean z10);
    }

    public j0(com.applovin.impl.sdk.l lVar) {
        this.f6873a = lVar;
        this.f6874b = lVar.Q();
        this.f6875c = ((Long) lVar.a(z4.f9320p6)).longValue();
        this.f6876d = ((Long) lVar.a(z4.f9311o6)).longValue();
        this.f6879g = ((Integer) lVar.a(z4.f9329q6)).intValue();
        this.f6880h = ((Integer) lVar.a(z4.f9338r6)).intValue();
        this.f6881i = ((Integer) lVar.a(z4.f9347s6)).intValue();
        this.f6877e = ((Integer) lVar.a(z4.f9400y6)).intValue();
        this.f6878f = ((Integer) lVar.a(z4.f9408z6)).intValue();
    }

    static /* synthetic */ int a(j0 j0Var) {
        int i10 = j0Var.f6884l;
        j0Var.f6884l = i10 + 1;
        return i10;
    }

    static /* synthetic */ int f(j0 j0Var) {
        int i10 = j0Var.f6883k;
        j0Var.f6883k = i10 + 1;
        return i10;
    }

    private void c() {
        if (this.f6883k >= this.f6878f && !this.f6887o) {
            this.f6887o = true;
            h();
        }
        if (this.f6883k < this.f6877e || this.f6886n) {
            return;
        }
        this.f6886n = true;
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        c cVar = this.f6891s;
        if (cVar != null) {
            cVar.a(this.f6877e, this.f6883k, this.f6884l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        c cVar = this.f6891s;
        if (cVar != null) {
            cVar.a(this.f6883k, this.f6884l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        this.f6891s = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f6875c <= 0) {
            if (this.f6883k == 1) {
                if (!this.f6887o) {
                    this.f6887o = true;
                    h();
                }
                if (!this.f6886n) {
                    this.f6886n = true;
                    i();
                }
            }
            k();
            return;
        }
        c();
        if (this.f6888p == null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6874b.k("BlackViewDetector", "Monitoring handler was unexpectedly null");
            }
            k();
        } else if (this.f6886n && this.f6887o) {
            k();
        } else {
            this.f6888p.postDelayed(this.f6890r, this.f6875c);
        }
    }

    private void h() {
        View view = (View) this.f6882j.get();
        if (com.applovin.impl.sdk.p.a()) {
            this.f6874b.k("BlackViewDetector", "Notifying black view confirmed: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.nb
            @Override // java.lang.Runnable
            public final void run() {
                this.f7716a.d();
            }
        });
    }

    private void i() {
        View view = (View) this.f6882j.get();
        if (com.applovin.impl.sdk.p.a()) {
            this.f6874b.k("BlackViewDetector", "Notifying black view detected: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.lb
            @Override // java.lang.Runnable
            public final void run() {
                this.f7077a.e();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.f6883k = 0;
        this.f6885m = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.f6882j.get() != null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6874b.a("BlackViewDetector", "Stopped monitoring view: " + this.f6882j.get());
            }
            this.f6882j.clear();
        }
        Handler handler = this.f6888p;
        if (handler != null) {
            handler.removeCallbacks(this.f6890r);
            this.f6888p = null;
        }
        if (this.f6891s != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7127a.f();
                }
            });
        }
    }

    public void b() {
        k();
        HandlerThread handlerThread = this.f6889q;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f6889q = null;
        }
    }

    public void a(View view, c cVar) {
        if (((Boolean) this.f6873a.a(z4.f9302n6)).booleanValue()) {
            View view2 = (View) this.f6882j.get();
            if (view2 != null) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f6874b.k("BlackViewDetector", "Monitoring is already in progress for a view: " + view2);
                    return;
                }
                return;
            }
            if (com.applovin.impl.sdk.p.a()) {
                this.f6874b.a("BlackViewDetector", "Started monitoring view: " + view);
            }
            try {
                if (this.f6889q == null) {
                    HandlerThread handlerThread = new HandlerThread("AppLovinSdk:black_view_detector");
                    this.f6889q = handlerThread;
                    handlerThread.start();
                } else {
                    this.f6873a.E().a(f2.U0, "BlackViewDetector:maybeStartMonitoring() unexpectedly called multiple times");
                    k();
                }
                this.f6891s = cVar;
                this.f6882j = new WeakReference(view);
                j();
                this.f6886n = false;
                this.f6887o = false;
                Handler handler = new Handler(this.f6889q.getLooper());
                this.f6888p = handler;
                handler.postDelayed(this.f6890r, this.f6876d);
            } catch (Throwable th) {
                k();
                this.f6873a.E().a("BlackViewDetector", "maybeStartMonitoring", th);
            }
        }
    }

    class a implements d {
        a() {
        }

        @Override // com.applovin.impl.j0.d
        public void a(Bitmap bitmap) {
            try {
                j0.a(j0.this);
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int i10 = width / j0.this.f6879g;
                int i11 = height / j0.this.f6879g;
                int i12 = i10 / 2;
                for (int i13 = i11 / 2; i13 < height; i13 += i11) {
                    for (int i14 = i12; i14 < width; i14 += i10) {
                        int pixel = bitmap.getPixel(i14, i13);
                        if (j0.this.a(pixel)) {
                            bitmap.recycle();
                            j0.this.j();
                            j0.this.g();
                            return;
                        }
                        if (j0.this.f6885m == null) {
                            j0.this.f6885m = Integer.valueOf(pixel);
                        }
                    }
                }
                j0.f(j0.this);
                bitmap.recycle();
                j0.this.g();
            } catch (Exception e10) {
                j0.this.f6873a.E().a("BlackViewDetector", "onScreenshotCaptured", e10);
                j0.this.k();
            }
        }

        @Override // com.applovin.impl.j0.d
        public void a(boolean z10) {
            if (z10) {
                j0.this.k();
            } else {
                j0.this.g();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        ActivityManager.MemoryInfo memoryInfoA;
        View view = (View) this.f6882j.get();
        if (view == null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6874b.k("BlackViewDetector", "Monitored view no longer exists.");
            }
            k();
            return;
        }
        Long l10 = (Long) this.f6873a.a(z4.f9383w6);
        if (l10.longValue() > 0 && (memoryInfoA = q7.a((ActivityManager) com.applovin.impl.sdk.l.p().getSystemService("activity"))) != null && memoryInfoA.availMem < l10.longValue()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6874b.k("BlackViewDetector", "Cancelling black view detection due to low memory");
                return;
            }
            return;
        }
        if (this.f6873a.o0().isApplicationPaused()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6874b.a("BlackViewDetector", "App is backgrounded - skipping black view detection");
            }
            j();
            g();
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f6874b.a("BlackViewDetector", "Checking for black view: " + view);
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth != 0 && measuredHeight != 0) {
            a(view, new a());
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f6874b.k("BlackViewDetector", "Monitored view is not visible due to dimensions (width = " + measuredWidth + ", height = " + measuredHeight + ")");
        }
        j();
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x004e  */
    public boolean a(int i10) {
        boolean z10;
        int iRed = Color.red(i10);
        int iGreen = Color.green(i10);
        int iBlue = Color.blue(i10);
        Integer num = this.f6885m;
        if (num != null) {
            int iRed2 = Color.red(num.intValue());
            int iGreen2 = Color.green(this.f6885m.intValue());
            int iBlue2 = Color.blue(this.f6885m.intValue());
            if (Math.abs(iRed - iRed2) > this.f6881i || Math.abs(iGreen - iGreen2) > this.f6881i || Math.abs(iBlue - iBlue2) > this.f6881i) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        int i11 = this.f6880h;
        return iRed > i11 || iGreen > i11 || iBlue > i11 || z10;
    }

    private void a(View view, d dVar) {
        if (p0.e()) {
            Activity activityA = this.f6873a.e().a();
            if (activityA == null) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f6874b.b("BlackViewDetector", "Failed to capture screenshot due to no active activity");
                }
                dVar.a(false);
                return;
            }
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i10 = iArr[0];
            int i11 = iArr[1];
            Rect rect = new Rect(i10, i11, i10 + measuredWidth, i11 + measuredHeight);
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                PixelCopy.request(activityA.getWindow(), rect, bitmapCreateBitmap, new b(dVar, bitmapCreateBitmap), new Handler());
                return;
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f6874b.b("BlackViewDetector", "Failed to capture screenshot due to exception: " + th);
                }
                dVar.a(true);
                return;
            }
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f6874b.k("BlackViewDetector", "Unable to capture screenshots on views below API 26");
        }
        dVar.a(true);
    }
}
