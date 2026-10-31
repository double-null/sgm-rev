package me;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: ConnectionPool.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final re.g f22481a;

    public k(re.g delegate) {
        kotlin.jvm.internal.t.f(delegate, "delegate");
        this.f22481a = delegate;
    }

    public final re.g a() {
        return this.f22481a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(int i10, long j10, TimeUnit timeUnit) {
        this(new re.g(qe.e.f24785i, i10, j10, timeUnit));
        kotlin.jvm.internal.t.f(timeUnit, "timeUnit");
    }

    public k() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
