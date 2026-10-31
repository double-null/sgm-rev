package com.applovin.impl;

import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public class j7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f6906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Timer f6907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f6908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f6909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f6910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f6911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f6912g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f6913h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f6914i = new Object();

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                j7.this.f6912g.run();
                synchronized (j7.this.f6914i) {
                    if (j7.this.f6911f) {
                        j7.this.f6908c = System.currentTimeMillis();
                        j7 j7Var = j7.this;
                        j7Var.f6909d = j7Var.f6910e;
                    } else {
                        j7.this.f6907b = null;
                    }
                }
            } catch (Throwable th) {
                try {
                    if (j7.this.f6906a != null) {
                        j7.this.f6906a.Q();
                        if (com.applovin.impl.sdk.p.a()) {
                            j7.this.f6906a.Q().a("Timer", "Encountered error while executing timed task", th);
                        }
                        j7.this.f6906a.E().a("Timer", "executingTimedTask", th);
                    }
                } finally {
                    synchronized (j7.this.f6914i) {
                        if (j7.this.f6911f) {
                            j7.this.f6908c = System.currentTimeMillis();
                            j7 j7Var2 = j7.this;
                            j7Var2.f6909d = j7Var2.f6910e;
                        } else {
                            j7.this.f6907b = null;
                        }
                    }
                }
            }
        }
    }

    private j7(com.applovin.impl.sdk.l lVar, Runnable runnable) {
        this.f6906a = lVar;
        this.f6912g = runnable;
    }

    public long c() {
        if (this.f6907b == null) {
            return this.f6909d - this.f6913h;
        }
        return this.f6909d - (System.currentTimeMillis() - this.f6908c);
    }

    public void d() {
        synchronized (this.f6914i) {
            Timer timer = this.f6907b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f6913h = Math.max(1L, System.currentTimeMillis() - this.f6908c);
                    this.f6907b = null;
                } catch (Throwable th) {
                    try {
                        com.applovin.impl.sdk.l lVar = this.f6906a;
                        if (lVar != null) {
                            lVar.Q();
                            if (com.applovin.impl.sdk.p.a()) {
                                this.f6906a.Q();
                                if (com.applovin.impl.sdk.p.a()) {
                                    this.f6906a.Q().a("Timer", "Encountered error while pausing timer", th);
                                }
                            }
                        }
                        this.f6907b = null;
                    } catch (Throwable th2) {
                        this.f6907b = null;
                        throw th2;
                    }
                }
            }
        }
    }

    public void e() {
        synchronized (this.f6914i) {
            long j10 = this.f6913h;
            if (j10 > 0) {
                try {
                    long j11 = this.f6909d - j10;
                    this.f6909d = j11;
                    if (j11 < 0) {
                        this.f6909d = 0L;
                    }
                    this.f6907b = new Timer();
                    a(b(), this.f6909d, this.f6911f, this.f6910e);
                    this.f6908c = System.currentTimeMillis();
                    this.f6913h = 0L;
                } catch (Throwable th) {
                    try {
                        com.applovin.impl.sdk.l lVar = this.f6906a;
                        if (lVar != null) {
                            lVar.Q();
                            if (com.applovin.impl.sdk.p.a()) {
                                this.f6906a.Q();
                                if (com.applovin.impl.sdk.p.a()) {
                                    this.f6906a.Q().a("Timer", "Encountered error while resuming timer", th);
                                }
                            }
                        }
                        this.f6913h = 0L;
                    } catch (Throwable th2) {
                        this.f6913h = 0L;
                        throw th2;
                    }
                }
            }
        }
    }

    private TimerTask b() {
        return new a();
    }

    public static j7 a(long j10, com.applovin.impl.sdk.l lVar, Runnable runnable) {
        return a(j10, false, lVar, runnable);
    }

    public static j7 a(long j10, boolean z10, com.applovin.impl.sdk.l lVar, Runnable runnable) {
        if (j10 < 0) {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Invalid fire time passed in: " + j10 + ".");
        }
        if (runnable != null) {
            j7 j7Var = new j7(lVar, runnable);
            j7Var.f6908c = System.currentTimeMillis();
            j7Var.f6909d = j10;
            j7Var.f6911f = z10;
            j7Var.f6910e = j10;
            try {
                j7Var.f6907b = new Timer();
                j7Var.a(j7Var.b(), j10, z10, j7Var.f6910e);
            } catch (OutOfMemoryError e10) {
                lVar.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    lVar.Q().a("Timer", "Failed to create timer due to OOM error", e10);
                }
            }
            return j7Var;
        }
        throw new IllegalArgumentException("Cannot create a scheduled timer. Runnable is null.");
    }

    public void a() {
        synchronized (this.f6914i) {
            Timer timer = this.f6907b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f6907b = null;
                } catch (Throwable th) {
                    try {
                        com.applovin.impl.sdk.l lVar = this.f6906a;
                        if (lVar != null) {
                            lVar.Q();
                            if (com.applovin.impl.sdk.p.a()) {
                                this.f6906a.Q();
                                if (com.applovin.impl.sdk.p.a()) {
                                    this.f6906a.Q().a("Timer", "Encountered error while cancelling timer", th);
                                }
                            }
                        }
                        this.f6907b = null;
                    } catch (Throwable th2) {
                        this.f6907b = null;
                        this.f6913h = 0L;
                        throw th2;
                    }
                }
                this.f6913h = 0L;
            }
        }
    }

    private void a(TimerTask timerTask, long j10, boolean z10, long j11) {
        if (z10) {
            this.f6907b.schedule(timerTask, j10, j11);
        } else {
            this.f6907b.schedule(timerTask, j10);
        }
    }
}
