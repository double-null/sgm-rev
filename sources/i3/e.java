package i3;

import android.os.SystemClock;
import b2.h;
import b2.j;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.common.e1;
import d2.l;
import e3.h0;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import z2.f;

/* JADX INFO: compiled from: ReportQueue.java */
/* JADX INFO: loaded from: classes4.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f15906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f15907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f15908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f15909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f15910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final BlockingQueue<Runnable> f15911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ThreadPoolExecutor f15912g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final h<h0> f15913h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final OnDemandCounter f15914i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f15915j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f15916k;

    /* JADX INFO: compiled from: ReportQueue.java */
    private final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.google.firebase.crashlytics.internal.common.h0 f15917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TaskCompletionSource<com.google.firebase.crashlytics.internal.common.h0> f15918b;

        @Override // java.lang.Runnable
        public void run() {
            e.this.p(this.f15917a, this.f15918b);
            e.this.f15914i.e();
            double dG = e.this.g();
            f.f().b("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dG / 1000.0d)) + " s for report: " + this.f15917a.d());
            e.q(dG);
        }

        private b(com.google.firebase.crashlytics.internal.common.h0 h0Var, TaskCompletionSource<com.google.firebase.crashlytics.internal.common.h0> taskCompletionSource) {
            this.f15917a = h0Var;
            this.f15918b = taskCompletionSource;
        }
    }

    e(h<h0> hVar, j3.d dVar, OnDemandCounter onDemandCounter) {
        this(dVar.f20577f, dVar.f20578g, ((long) dVar.f20579h) * 1000, hVar, onDemandCounter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double g() {
        return Math.min(3600000.0d, (60000.0d / this.f15906a) * Math.pow(this.f15907b, h()));
    }

    private int h() {
        if (this.f15916k == 0) {
            this.f15916k = o();
        }
        int iO = (int) ((o() - this.f15916k) / this.f15908c);
        int iMin = l() ? Math.min(100, this.f15915j + iO) : Math.max(0, this.f15915j - iO);
        if (this.f15915j != iMin) {
            this.f15915j = iMin;
            this.f15916k = o();
        }
        return iMin;
    }

    private boolean k() {
        return this.f15911f.size() < this.f15910e;
    }

    private boolean l() {
        return this.f15911f.size() == this.f15910e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(CountDownLatch countDownLatch) {
        try {
            l.a(this.f15913h, b2.e.HIGHEST);
        } catch (Exception unused) {
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(TaskCompletionSource taskCompletionSource, boolean z10, com.google.firebase.crashlytics.internal.common.h0 h0Var, Exception exc) {
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (z10) {
            j();
        }
        taskCompletionSource.trySetResult(h0Var);
    }

    private long o() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(final com.google.firebase.crashlytics.internal.common.h0 h0Var, final TaskCompletionSource<com.google.firebase.crashlytics.internal.common.h0> taskCompletionSource) {
        f.f().b("Sending report through Google DataTransport: " + h0Var.d());
        final boolean z10 = SystemClock.elapsedRealtime() - this.f15909d < 2000;
        this.f15913h.a(b2.c.g(h0Var.b()), new j() { // from class: i3.c
            @Override // b2.j
            public final void a(Exception exc) {
                this.f15900a.n(taskCompletionSource, z10, h0Var, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(double d10) {
        try {
            Thread.sleep((long) d10);
        } catch (InterruptedException unused) {
        }
    }

    TaskCompletionSource<com.google.firebase.crashlytics.internal.common.h0> i(com.google.firebase.crashlytics.internal.common.h0 h0Var, boolean z10) {
        synchronized (this.f15911f) {
            TaskCompletionSource<com.google.firebase.crashlytics.internal.common.h0> taskCompletionSource = new TaskCompletionSource<>();
            if (!z10) {
                p(h0Var, taskCompletionSource);
                return taskCompletionSource;
            }
            this.f15914i.d();
            if (!k()) {
                h();
                f.f().b("Dropping report due to queue being full: " + h0Var.d());
                this.f15914i.c();
                taskCompletionSource.trySetResult(h0Var);
                return taskCompletionSource;
            }
            f.f().b("Enqueueing report: " + h0Var.d());
            f.f().b("Queue size: " + this.f15911f.size());
            this.f15912g.execute(new b(h0Var, taskCompletionSource));
            f.f().b("Closing task for report: " + h0Var.d());
            taskCompletionSource.trySetResult(h0Var);
            return taskCompletionSource;
        }
    }

    public void j() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: i3.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f15904a.m(countDownLatch);
            }
        }).start();
        e1.c(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    e(double d10, double d11, long j10, h<h0> hVar, OnDemandCounter onDemandCounter) {
        this.f15906a = d10;
        this.f15907b = d11;
        this.f15908c = j10;
        this.f15913h = hVar;
        this.f15914i = onDemandCounter;
        this.f15909d = SystemClock.elapsedRealtime();
        int i10 = (int) d10;
        this.f15910e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f15911f = arrayBlockingQueue;
        this.f15912g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f15915j = 0;
        this.f15916k = 0L;
    }
}
