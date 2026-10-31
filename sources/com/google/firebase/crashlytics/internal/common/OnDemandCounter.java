package com.google.firebase.crashlytics.internal.common;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class OnDemandCounter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicInteger f12090a = new AtomicInteger();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f12091b = new AtomicInteger();

    public int a() {
        return this.f12091b.get();
    }

    public int b() {
        return this.f12090a.get();
    }

    public void c() {
        this.f12091b.getAndIncrement();
    }

    public void d() {
        this.f12090a.getAndIncrement();
    }

    public void e() {
        this.f12091b.set(0);
    }
}
