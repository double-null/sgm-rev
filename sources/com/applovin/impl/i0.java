package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class i0 implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set f6792c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j7 f6793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f6794b;

    private i0(long j10, final boolean z10, com.applovin.impl.sdk.l lVar, final Runnable runnable) {
        this.f6793a = j7.a(j10, z10, lVar, new Runnable() { // from class: com.applovin.impl.bb
            @Override // java.lang.Runnable
            public final void run() {
                this.f6196a.a(z10, runnable);
            }
        });
        this.f6794b = lVar;
        f6792c.add(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public long b() {
        return this.f6793a.c();
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f6793a.d();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f6793a.e();
        }
    }

    public static i0 a(long j10, com.applovin.impl.sdk.l lVar, Runnable runnable) {
        return a(j10, false, lVar, runnable);
    }

    public static i0 a(long j10, boolean z10, com.applovin.impl.sdk.l lVar, Runnable runnable) {
        return new i0(j10, z10, lVar, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z10, Runnable runnable) {
        if (!z10) {
            a();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a() {
        this.f6793a.a();
        AppLovinBroadcastManager.unregisterReceiver(this);
        f6792c.remove(this);
    }
}
