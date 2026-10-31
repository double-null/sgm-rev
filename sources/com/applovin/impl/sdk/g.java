package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.j7;
import com.applovin.impl.t3;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class g implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j7 f8374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f8375b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f8376c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f8377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l f8378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final WeakReference f8379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f8380g;

    public interface a {
        void onAdRefresh();
    }

    public g(l lVar, a aVar) {
        this.f8379f = new WeakReference(aVar);
        this.f8378e = lVar;
    }

    private void e() {
        if (((Boolean) this.f8378e.a(t3.O7)).booleanValue()) {
            k();
        }
    }

    private void f() {
        if (((Boolean) this.f8378e.a(t3.O7)).booleanValue()) {
            synchronized (this.f8375b) {
                if (this.f8377d) {
                    this.f8378e.Q();
                    if (p.a()) {
                        this.f8378e.Q().a("AdRefreshManager", "Fullscreen ad dismissed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                    }
                } else if (this.f8378e.o0().isApplicationPaused()) {
                    this.f8378e.Q();
                    if (p.a()) {
                        this.f8378e.Q().a("AdRefreshManager", "Waiting for the application to enter foreground to resume the timer.");
                    }
                } else {
                    j7 j7Var = this.f8374a;
                    if (j7Var != null) {
                        j7Var.e();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        l();
        a aVar = (a) this.f8379f.get();
        if (aVar != null) {
            aVar.onAdRefresh();
        }
    }

    private void k() {
        synchronized (this.f8375b) {
            j7 j7Var = this.f8374a;
            if (j7Var != null) {
                j7Var.d();
            } else {
                this.f8378e.Q();
                if (p.a()) {
                    this.f8378e.Q().a("AdRefreshManager", "An ad load is in progress. Will pause refresh once the ad finishes loading.");
                }
                this.f8376c.set(true);
            }
        }
    }

    private void l() {
        synchronized (this.f8375b) {
            this.f8374a = null;
            if (!((Boolean) this.f8378e.a(t3.P7)).booleanValue()) {
                AppLovinBroadcastManager.unregisterReceiver(this);
            }
        }
    }

    private void n() {
        synchronized (this.f8375b) {
            j7 j7Var = this.f8374a;
            if (j7Var != null) {
                j7Var.e();
            } else {
                this.f8376c.set(false);
            }
        }
    }

    public long b() {
        long jC;
        synchronized (this.f8375b) {
            j7 j7Var = this.f8374a;
            jC = j7Var != null ? j7Var.c() : -1L;
        }
        return jC;
    }

    public void c() {
        if (((Boolean) this.f8378e.a(t3.N7)).booleanValue()) {
            k();
        }
    }

    public void d() {
        boolean z10;
        a aVar;
        if (((Boolean) this.f8378e.a(t3.N7)).booleanValue()) {
            synchronized (this.f8375b) {
                if (this.f8377d) {
                    this.f8378e.Q();
                    if (p.a()) {
                        this.f8378e.Q().a("AdRefreshManager", "Application resumed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                    }
                    return;
                }
                if (this.f8378e.J().d()) {
                    this.f8378e.Q();
                    if (p.a()) {
                        this.f8378e.Q().a("AdRefreshManager", "Waiting for the full screen ad to be dismissed to resume the timer.");
                    }
                    return;
                }
                if (this.f8374a != null) {
                    long jB = this.f8380g - b();
                    long jLongValue = ((Long) this.f8378e.a(t3.M7)).longValue();
                    if (jLongValue < 0 || jB <= jLongValue) {
                        this.f8374a.e();
                        z10 = false;
                    } else {
                        a();
                        z10 = true;
                    }
                } else {
                    z10 = false;
                }
                if (!z10 || (aVar = (a) this.f8379f.get()) == null) {
                    return;
                }
                aVar.onAdRefresh();
            }
        }
    }

    public boolean g() {
        return this.f8377d;
    }

    public boolean h() {
        boolean z10;
        synchronized (this.f8375b) {
            z10 = this.f8374a != null;
        }
        return z10;
    }

    public void j() {
        synchronized (this.f8375b) {
            k();
            this.f8377d = true;
        }
    }

    public void m() {
        synchronized (this.f8375b) {
            n();
            this.f8377d = false;
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            c();
            return;
        }
        if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            d();
        } else if ("com.applovin.fullscreen_ad_displayed".equals(action)) {
            e();
        } else if ("com.applovin.fullscreen_ad_hidden".equals(action)) {
            f();
        }
    }

    public void a(long j10) {
        synchronized (this.f8375b) {
            a();
            this.f8380g = j10;
            this.f8374a = j7.a(j10, this.f8378e, new Runnable() { // from class: com.applovin.impl.sdk.h0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8398a.i();
                }
            });
            if (!((Boolean) this.f8378e.a(t3.P7)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_displayed"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_hidden"));
            }
            if (((Boolean) this.f8378e.a(t3.O7)).booleanValue() && (this.f8378e.J().d() || this.f8378e.o0().isApplicationPaused())) {
                this.f8374a.d();
            }
            if (this.f8376c.compareAndSet(true, false) && ((Boolean) this.f8378e.a(t3.Q7)).booleanValue()) {
                this.f8378e.Q();
                if (p.a()) {
                    this.f8378e.Q().a("AdRefreshManager", "Pausing refresh for a previous request.");
                }
                this.f8374a.d();
            }
        }
    }

    public void a() {
        synchronized (this.f8375b) {
            j7 j7Var = this.f8374a;
            if (j7Var != null) {
                j7Var.a();
                l();
            }
        }
    }
}
