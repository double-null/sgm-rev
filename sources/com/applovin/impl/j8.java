package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public class j8 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Set f6916f = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f6917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f6918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Runnable f6919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f6920d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Timer f6921e;

    class a extends TimerTask {

        /* JADX INFO: renamed from: com.applovin.impl.j8$a$a, reason: collision with other inner class name */
        class C0110a implements AppLovinBroadcastManager.Receiver {
            C0110a() {
            }

            @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
            public void onReceive(Intent intent, Map map) {
                AppLovinBroadcastManager.unregisterReceiver(this);
                j8.this.c();
            }
        }

        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (!j8.this.f6918b.o0().isApplicationPaused() || j8.this.f6917a) {
                j8.this.c();
            } else {
                AppLovinBroadcastManager.registerReceiver(new C0110a(), new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
        }
    }

    private j8(long j10, boolean z10, com.applovin.impl.sdk.l lVar, Runnable runnable) {
        Timer timer = new Timer();
        this.f6921e = timer;
        if (j10 < 0) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Invalid timer length: " + j10);
        }
        if (lVar == null) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Sdk is null");
        }
        if (runnable == null) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Runnable is null.");
        }
        this.f6917a = z10;
        this.f6918b = lVar;
        this.f6919c = runnable;
        f6916f.add(this);
        timer.schedule(b(), j10);
    }

    public static j8 a(long j10, boolean z10, com.applovin.impl.sdk.l lVar, Runnable runnable) {
        return new j8(j10, z10, lVar, runnable);
    }

    private TimerTask b() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Runnable runnable = this.f6919c;
        if (runnable != null) {
            runnable.run();
            a();
        }
    }

    public void a() {
        synchronized (this.f6920d) {
            this.f6921e.cancel();
            this.f6919c = null;
            f6916f.remove(this);
        }
    }
}
