package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class v1 implements com.applovin.impl.sdk.a.InterfaceC0117a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f8931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f8932b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f8933c = new Object();

    public v1(com.applovin.impl.sdk.l lVar) {
        this.f8931a = lVar;
    }

    public void a(e3 e3Var) {
        if (y3.b(e3Var)) {
            if (!this.f8931a.f().a(e3Var, this)) {
                this.f8931a.Z().destroyAd(e3Var);
                return;
            }
            synchronized (this.f8933c) {
                String adUnitId = e3Var.getAdUnitId();
                List arrayList = (List) this.f8932b.get(adUnitId);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f8932b.put(adUnitId, arrayList);
                }
                double dH = e3Var.H();
                int i10 = 0;
                while (i10 < arrayList.size() && dH <= ((e3) arrayList.get(i10)).H()) {
                    i10++;
                }
                arrayList.add(i10, e3Var);
                if (arrayList.size() > ((Integer) this.f8931a.a(t3.R8)).intValue()) {
                    e3 e3Var2 = (e3) arrayList.remove(arrayList.size() - 1);
                    this.f8931a.f().a(e3Var2);
                    this.f8931a.Z().destroyAd(e3Var2);
                    this.f8931a.R().a(f2.J0, e3Var2);
                }
            }
        }
    }

    public void b(e3 e3Var) {
        synchronized (this.f8933c) {
            List list = (List) this.f8932b.get(e3Var.getAdUnitId());
            if (CollectionUtils.isEmpty(list)) {
                return;
            }
            list.remove(e3Var);
            this.f8931a.f().a(e3Var);
        }
    }

    @Override // com.applovin.impl.sdk.a.InterfaceC0117a
    public void onAdExpired(u1 u1Var) {
        e3 e3Var = (e3) u1Var;
        this.f8931a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f8931a.Q().a("FailoverAdCacheManager", "Failover ad expired for ad unit: " + e3Var.getAdUnitId() + ". Removing from cache");
        }
        b(e3Var);
        this.f8931a.Z().destroyAd(e3Var);
        this.f8931a.R().a(f2.I0, e3Var);
    }

    public e3 a(String str) {
        synchronized (this.f8933c) {
            List list = (List) this.f8932b.get(str);
            if (CollectionUtils.isEmpty(list)) {
                return null;
            }
            return (e3) list.get(0);
        }
    }
}
