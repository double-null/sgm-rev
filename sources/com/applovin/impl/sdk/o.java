package com.applovin.impl.sdk;

import android.app.ActivityManager;
import com.applovin.impl.a3;
import com.applovin.impl.f2;
import com.applovin.impl.h2;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.y3;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.internal.logging.dumpsys.Tj.ljglrLUdGZhMhQ;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class o {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final a f8651l = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f8652a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f8654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f8655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f8656e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f8659h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Object f8660i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f8653b = new AtomicBoolean();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f8657f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f8658g = new AtomicBoolean();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f8661j = new HashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f8662k = new Object();

    /* JADX INFO: loaded from: classes.dex */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f8663a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f8664b;

        protected boolean a(Object obj) {
            return obj instanceof a;
        }

        public long b() {
            return this.f8663a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a((Object) this) && b() == aVar.b() && a() == aVar.a();
        }

        public int hashCode() {
            long jB = b();
            return ((((int) (jB ^ (jB >>> 32))) + 59) * 59) + a();
        }

        public String toString() {
            return "FullScreenAdTracker.LostShowAttemptsData(lastAttemptedTimeMillis=" + b() + ", attemptCount=" + a() + ")";
        }

        static /* synthetic */ int a(a aVar) {
            int i10 = aVar.f8664b;
            aVar.f8664b = i10 + 1;
            return i10;
        }

        public int a() {
            return this.f8664b;
        }
    }

    o(l lVar) {
        this.f8652a = lVar;
    }

    public Long c() {
        return this.f8655d;
    }

    public boolean d() {
        return this.f8653b.get();
    }

    public boolean e() {
        return this.f8658g.get();
    }

    public void a(boolean z10) {
        synchronized (this.f8657f) {
            this.f8658g.set(z10);
            if (z10) {
                this.f8659h = System.currentTimeMillis();
                this.f8652a.Q();
                if (p.a()) {
                    this.f8652a.Q().a(ljglrLUdGZhMhQ.dPDFtToXKJHNNyp, "Setting fullscreen ad pending display: " + this.f8659h);
                }
                ActivityManager.MemoryInfo memoryInfoA = q7.a((ActivityManager) l.p().getSystemService("activity"));
                if (memoryInfoA != null) {
                    this.f8656e = memoryInfoA.availMem;
                }
                final Long l10 = (Long) this.f8652a.a(z4.N1);
                if (l10.longValue() >= 0) {
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.x1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f8732a.a(l10);
                        }
                    }, l10.longValue());
                }
            } else {
                this.f8659h = 0L;
                this.f8652a.Q();
                if (p.a()) {
                    this.f8652a.Q().a(ljglrLUdGZhMhQ.dPDFtToXKJHNNyp, "Setting fullscreen ad not pending display: " + System.currentTimeMillis());
                }
            }
        }
    }

    public long b() {
        return this.f8654c;
    }

    public void c(String str) {
        synchronized (this.f8662k) {
            a aVar = (a) this.f8661j.get(str);
            if (aVar == null) {
                aVar = new a();
                this.f8661j.put(str, aVar);
            }
            aVar.f8663a = System.currentTimeMillis();
            a.a(aVar);
        }
    }

    public void b(Object obj) {
        if (!y3.a(obj) && this.f8653b.compareAndSet(true, false)) {
            this.f8660i = null;
            this.f8652a.Q();
            if (p.a()) {
                this.f8652a.Q().a("FullScreenAdTracker", "Setting fullscreen ad hidden: " + System.currentTimeMillis());
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_hidden", obj);
        }
    }

    public a b(String str) {
        a aVar;
        synchronized (this.f8662k) {
            aVar = (a) this.f8661j.get(str);
            if (aVar == null) {
                aVar = f8651l;
            }
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l10) {
        if (e() && System.currentTimeMillis() - this.f8659h >= l10.longValue()) {
            this.f8652a.Q();
            if (p.a()) {
                this.f8652a.Q().a("FullScreenAdTracker", "Resetting \"pending display\" state...");
            }
            this.f8658g.set(false);
        }
    }

    public Object a() {
        return this.f8660i;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0068  */
    public void a(final Object obj) {
        if (!y3.a(obj) && this.f8653b.compareAndSet(false, true)) {
            this.f8660i = obj;
            this.f8654c = System.currentTimeMillis();
            this.f8652a.Q();
            if (p.a()) {
                this.f8652a.Q().a("FullScreenAdTracker", "Setting fullscreen ad displayed: " + this.f8654c);
            }
            ActivityManager.MemoryInfo memoryInfoA = q7.a((ActivityManager) l.p().getSystemService("activity"));
            if (memoryInfoA != null) {
                long j10 = this.f8656e;
                if (j10 > 0) {
                    this.f8655d = Long.valueOf(j10 - memoryInfoA.availMem);
                    this.f8656e = 0L;
                } else {
                    this.f8655d = null;
                }
            } else {
                this.f8655d = null;
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_displayed", obj);
            final Long l10 = (Long) this.f8652a.a(z4.O1);
            if (l10.longValue() >= 0) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.w1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8724a.a(l10, obj);
                    }
                }, l10.longValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l10, Object obj) {
        if (this.f8653b.get() && System.currentTimeMillis() - this.f8654c >= l10.longValue()) {
            this.f8652a.Q();
            if (p.a()) {
                this.f8652a.Q().a("FullScreenAdTracker", "Resetting \"display\" state...");
            }
            HashMap map = new HashMap();
            if (obj instanceof com.applovin.impl.sdk.ad.b) {
                map.putAll(h2.a((AppLovinAdImpl) obj));
            } else if (obj instanceof a3) {
                map.putAll(h2.a((a3) obj));
            }
            this.f8652a.E().a(f2.f6496j1, "fullscreenAdDisplayStateTimeout", map);
            b(obj);
        }
    }

    public void a(String str) {
        synchronized (this.f8662k) {
            this.f8661j.remove(str);
        }
    }
}
