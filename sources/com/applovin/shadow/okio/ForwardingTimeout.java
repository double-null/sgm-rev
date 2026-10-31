package com.applovin.shadow.okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: ForwardingTimeout.kt */
/* JADX INFO: loaded from: classes.dex */
public class ForwardingTimeout extends Timeout {
    private Timeout delegate;

    public ForwardingTimeout(Timeout delegate) {
        kotlin.jvm.internal.t.f(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // com.applovin.shadow.okio.Timeout
    public Timeout clearDeadline() {
        return this.delegate.clearDeadline();
    }

    @Override // com.applovin.shadow.okio.Timeout
    public Timeout clearTimeout() {
        return this.delegate.clearTimeout();
    }

    @Override // com.applovin.shadow.okio.Timeout
    public long deadlineNanoTime() {
        return this.delegate.deadlineNanoTime();
    }

    public final Timeout delegate() {
        return this.delegate;
    }

    @Override // com.applovin.shadow.okio.Timeout
    public boolean hasDeadline() {
        return this.delegate.hasDeadline();
    }

    /* JADX INFO: renamed from: setDelegate, reason: collision with other method in class */
    public final /* synthetic */ void m156setDelegate(Timeout timeout) {
        kotlin.jvm.internal.t.f(timeout, "<set-?>");
        this.delegate = timeout;
    }

    @Override // com.applovin.shadow.okio.Timeout
    public void throwIfReached() throws IOException {
        this.delegate.throwIfReached();
    }

    @Override // com.applovin.shadow.okio.Timeout
    public Timeout timeout(long j10, TimeUnit unit) {
        kotlin.jvm.internal.t.f(unit, "unit");
        return this.delegate.timeout(j10, unit);
    }

    @Override // com.applovin.shadow.okio.Timeout
    public long timeoutNanos() {
        return this.delegate.timeoutNanos();
    }

    @Override // com.applovin.shadow.okio.Timeout
    public Timeout deadlineNanoTime(long j10) {
        return this.delegate.deadlineNanoTime(j10);
    }

    public final ForwardingTimeout setDelegate(Timeout delegate) {
        kotlin.jvm.internal.t.f(delegate, "delegate");
        this.delegate = delegate;
        return this;
    }
}
