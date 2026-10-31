package com.vungle.ads.internal.executor;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: NamedThreadFactory.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class NamedThreadFactory implements ThreadFactory {
    private final AtomicInteger atomicInteger;
    private final String name;
    private final ThreadFactory threadFactory;

    public NamedThreadFactory(String name) {
        t.f(name, "name");
        this.name = name;
        this.threadFactory = java.util.concurrent.Executors.defaultThreadFactory();
        this.atomicInteger = new AtomicInteger(0);
    }

    public final String getName() {
        return this.name;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable r10) {
        t.f(r10, "r");
        Thread t10 = this.threadFactory.newThread(r10);
        t10.setName(this.name + "-th-" + this.atomicInteger.incrementAndGet());
        t.e(t10, "t");
        return t10;
    }
}
