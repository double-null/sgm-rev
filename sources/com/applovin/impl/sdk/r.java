package com.applovin.impl.sdk;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue f8679a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f8680b = new Object();

    r() {
    }

    void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f8680b) {
            if (b() <= 25) {
                this.f8679a.offer(appLovinAdImpl);
            } else {
                p.h("AppLovinSdk", "Maximum queue capacity reached - discarding ad...");
            }
        }
    }

    int b() {
        int size;
        synchronized (this.f8680b) {
            size = this.f8679a.size();
        }
        return size;
    }

    boolean c() {
        boolean z10;
        synchronized (this.f8680b) {
            z10 = b() == 0;
        }
        return z10;
    }

    AppLovinAdImpl d() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.f8680b) {
            appLovinAdImpl = (AppLovinAdImpl) this.f8679a.peek();
        }
        return appLovinAdImpl;
    }

    void b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f8680b) {
            this.f8679a.remove(appLovinAdImpl);
        }
    }

    AppLovinAdImpl a() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.f8680b) {
            appLovinAdImpl = !c() ? (AppLovinAdImpl) this.f8679a.poll() : null;
        }
        return appLovinAdImpl;
    }
}
