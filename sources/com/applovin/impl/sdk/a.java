package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class a implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f8267e = TimeUnit.SECONDS.toMillis(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f8268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f8269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashSet f8270c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f8271d = new Object();

    /* JADX INFO: renamed from: com.applovin.impl.sdk.a$a, reason: collision with other inner class name */
    public interface InterfaceC0117a {
        void onAdExpired(com.applovin.impl.u1 u1Var);
    }

    public a(l lVar) {
        this.f8268a = lVar;
        this.f8269b = lVar.Q();
    }

    private b b(com.applovin.impl.u1 u1Var) {
        synchronized (this.f8271d) {
            try {
                if (u1Var == null) {
                    return null;
                }
                for (b bVar : this.f8270c) {
                    if (u1Var == bVar.b()) {
                        return bVar;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean a(com.applovin.impl.u1 u1Var, InterfaceC0117a interfaceC0117a) {
        synchronized (this.f8271d) {
            if (b(u1Var) != null) {
                if (p.a()) {
                    this.f8269b.a("AdExpirationManager", "Ad expiration already scheduled for ad: " + u1Var);
                }
                return true;
            }
            if (u1Var.getTimeToLiveMillis() <= f8267e) {
                if (p.a()) {
                    this.f8269b.a("AdExpirationManager", "Ad has already expired: " + u1Var);
                }
                u1Var.setExpired();
                return false;
            }
            if (p.a()) {
                this.f8269b.a("AdExpirationManager", "Scheduling ad expiration " + TimeUnit.MILLISECONDS.toSeconds(u1Var.getTimeToLiveMillis()) + " seconds from now for " + u1Var + "...");
            }
            if (this.f8270c.isEmpty()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
            this.f8270c.add(b.a(u1Var, interfaceC0117a, this.f8268a));
            return true;
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            a();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            b();
        }
    }

    private void b() {
        HashSet<b> hashSet = new HashSet();
        synchronized (this.f8271d) {
            for (b bVar : this.f8270c) {
                com.applovin.impl.u1 u1VarB = bVar.b();
                if (u1VarB == null) {
                    hashSet.add(bVar);
                } else {
                    long timeToLiveMillis = u1VarB.getTimeToLiveMillis();
                    if (timeToLiveMillis <= 0) {
                        if (p.a()) {
                            this.f8269b.a("AdExpirationManager", "Ad expired while app was paused. Preparing to notify listener for ad: " + u1VarB);
                        }
                        hashSet.add(bVar);
                    } else {
                        if (p.a()) {
                            this.f8269b.a("AdExpirationManager", "Rescheduling expiration with remaining " + TimeUnit.MILLISECONDS.toSeconds(timeToLiveMillis) + " seconds for ad: " + u1VarB);
                        }
                        bVar.a(timeToLiveMillis);
                    }
                }
            }
        }
        for (b bVar2 : hashSet) {
            a(bVar2);
            bVar2.d();
        }
    }

    public void a(com.applovin.impl.u1 u1Var) {
        synchronized (this.f8271d) {
            b bVarB = b(u1Var);
            if (bVarB != null) {
                if (p.a()) {
                    this.f8269b.a("AdExpirationManager", "Cancelling expiration timer for ad: " + u1Var);
                }
                bVarB.a();
                a(bVarB);
            }
        }
    }

    public void a(b bVar) {
        synchronized (this.f8271d) {
            this.f8270c.remove(bVar);
            if (this.f8270c.isEmpty()) {
                AppLovinBroadcastManager.unregisterReceiver(this);
            }
        }
    }

    private void a() {
        synchronized (this.f8271d) {
            Iterator it = this.f8270c.iterator();
            while (it.hasNext()) {
                ((b) it.next()).a();
            }
        }
    }
}
