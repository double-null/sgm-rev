package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import com.applovin.impl.z4;
import com.pairip.VMRunner;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public class SessionTracker {
    public static final String ACTION_APPLICATION_PAUSED = "com.applovin.application_paused";
    public static final String ACTION_APPLICATION_RESUMED = "com.applovin.application_resumed";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final l f8248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8249b = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f8250c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f8251d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicInteger f8252e = new AtomicInteger();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicLong f8253f = new AtomicLong();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicLong f8254g = new AtomicLong();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicLong f8255h = new AtomicLong();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Date f8256i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Date f8257j;

    class a extends com.applovin.impl.b {
        a() {
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            SessionTracker.this.b();
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    class c extends BroadcastReceiver {
        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            VMRunner.invoke("Ebzko3Denp9QQRpm", new Object[]{this, context, intent});
        }
    }

    static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8261a;

        static {
            int[] iArr = new int[e.values().length];
            f8261a = iArr;
            try {
                iArr[e.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8261a[e.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8261a[e.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum e {
        STARTED("started"),
        PAUSED("paused"),
        RESUMED("resumed");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f8266a;

        e(String str) {
            this.f8266a = str;
        }

        public String b() {
            return this.f8266a;
        }
    }

    SessionTracker(l lVar) {
        this.f8248a = lVar;
        Application application = (Application) l.p();
        application.registerActivityLifecycleCallbacks(new a());
        application.registerComponentCallbacks(new b());
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        application.registerReceiver(new c(), intentFilter);
    }

    private void d() {
        this.f8248a.Q();
        if (p.a()) {
            this.f8248a.Q().a("SessionTracker", "Application Resumed");
        }
        this.f8254g.set(System.currentTimeMillis());
        this.f8255h.addAndGet(this.f8254g.get() - this.f8253f.get());
        boolean zBooleanValue = ((Boolean) this.f8248a.a(z4.A3)).booleanValue();
        long jLongValue = ((Long) this.f8248a.a(z4.B3)).longValue();
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_RESUMED), null);
        if (this.f8250c.getAndSet(false)) {
            return;
        }
        long millis = TimeUnit.MINUTES.toMillis(jLongValue);
        if (this.f8257j == null || System.currentTimeMillis() - this.f8257j.getTime() >= millis) {
            this.f8248a.G().trackEvent("resumed");
            if (zBooleanValue) {
                this.f8257j = new Date();
            }
        }
        if (zBooleanValue) {
            return;
        }
        this.f8257j = new Date();
    }

    public long getAppEnteredBackgroundTimeMillis() {
        return this.f8253f.get();
    }

    public long getAppEnteredForegroundTimeMillis() {
        return this.f8254g.get();
    }

    public e getCurrentApplicationState() {
        if (this.f8251d.get()) {
            return e.PAUSED;
        }
        return this.f8253f.get() != 0 ? e.RESUMED : e.STARTED;
    }

    public long getCurrentApplicationStateDurationMillis() {
        long jO;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i10 = d.f8261a[getCurrentApplicationState().ordinal()];
        if (i10 == 1) {
            jO = l.o();
        } else if (i10 == 2) {
            jO = this.f8253f.get();
        } else {
            if (i10 != 3) {
                return -1L;
            }
            jO = this.f8254g.get();
        }
        return jCurrentTimeMillis - jO;
    }

    public int getLastTrimMemoryLevel() {
        return this.f8252e.get();
    }

    public String getSessionId() {
        return this.f8249b;
    }

    public long getTotalBackgroundDurationMillis() {
        return getCurrentApplicationState() == e.PAUSED ? this.f8255h.get() + getCurrentApplicationStateDurationMillis() : this.f8255h.get();
    }

    public boolean isApplicationPaused() {
        return this.f8251d.get();
    }

    public void pauseForClick() {
        this.f8250c.set(true);
    }

    public void resumeForClick() {
        this.f8250c.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f8251d.compareAndSet(false, true)) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f8251d.compareAndSet(true, false)) {
            d();
        }
    }

    private void c() {
        this.f8248a.Q();
        if (p.a()) {
            this.f8248a.Q().a("SessionTracker", "Application Paused");
        }
        this.f8253f.set(System.currentTimeMillis());
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_PAUSED), null);
        if (this.f8250c.get()) {
            return;
        }
        boolean zBooleanValue = ((Boolean) this.f8248a.a(z4.A3)).booleanValue();
        long millis = TimeUnit.MINUTES.toMillis(((Long) this.f8248a.a(z4.C3)).longValue());
        if (this.f8256i == null || System.currentTimeMillis() - this.f8256i.getTime() >= millis) {
            this.f8248a.G().trackEvent("paused");
            if (zBooleanValue) {
                this.f8256i = new Date();
            }
        }
        if (zBooleanValue) {
            return;
        }
        this.f8256i = new Date();
    }

    class b implements ComponentCallbacks2 {
        b() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i10) {
            SessionTracker.this.f8252e.set(i10);
            if (i10 == 20) {
                SessionTracker.this.a();
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }
    }
}
