package com.applovin.impl.sdk;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f8368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f8369b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f8371d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f8372e = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f8370c = new Object();

    f(l lVar) {
        this.f8368a = lVar;
        this.f8369b = lVar.Q();
        for (com.applovin.impl.u uVar : com.applovin.impl.u.a()) {
            this.f8371d.put(uVar, new r());
            this.f8372e.put(uVar, new r());
        }
    }

    private r c(com.applovin.impl.u uVar) {
        synchronized (this.f8370c) {
            r rVarB = b(uVar);
            if (rVarB.b() > 0) {
                return rVarB;
            }
            return d(uVar);
        }
    }

    private r d(com.applovin.impl.u uVar) {
        r rVar;
        synchronized (this.f8370c) {
            rVar = (r) this.f8371d.get(uVar);
            if (rVar == null) {
                rVar = new r();
                this.f8371d.put(uVar, rVar);
            }
        }
        return rVar;
    }

    void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f8370c) {
            d(appLovinAdImpl.getAdZone()).a(appLovinAdImpl);
            if (p.a()) {
                this.f8369b.a("AdPreloadManager", "Ad enqueued: " + appLovinAdImpl);
            }
        }
    }

    public void b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f8370c) {
            c(appLovinAdImpl.getAdZone()).b(appLovinAdImpl);
        }
    }

    public AppLovinAdImpl e(com.applovin.impl.u uVar) {
        com.applovin.impl.sdk.ad.c cVar;
        synchronized (this.f8370c) {
            r rVarD = d(uVar);
            if (rVarD.b() > 0) {
                b(uVar).a(rVarD.a());
                cVar = new com.applovin.impl.sdk.ad.c(uVar, this.f8368a);
            } else {
                cVar = null;
            }
        }
        if (cVar != null) {
            if (p.a()) {
                this.f8369b.a("AdPreloadManager", "Retrieved ad of zone " + uVar + "...");
            }
        } else if (p.a()) {
            this.f8369b.a("AdPreloadManager", "Unable to retrieve ad of zone " + uVar + "...");
        }
        return cVar;
    }

    public AppLovinAdBase f(com.applovin.impl.u uVar) {
        AppLovinAdImpl appLovinAdImplD;
        synchronized (this.f8370c) {
            appLovinAdImplD = c(uVar).d();
        }
        return appLovinAdImplD;
    }

    private r b(com.applovin.impl.u uVar) {
        r rVar;
        synchronized (this.f8370c) {
            rVar = (r) this.f8372e.get(uVar);
            if (rVar == null) {
                rVar = new r();
                this.f8372e.put(uVar, rVar);
            }
        }
        return rVar;
    }

    public AppLovinAdImpl a(com.applovin.impl.u uVar) {
        AppLovinAdImpl appLovinAdImplA;
        synchronized (this.f8370c) {
            appLovinAdImplA = c(uVar).a();
        }
        return appLovinAdImplA;
    }
}
