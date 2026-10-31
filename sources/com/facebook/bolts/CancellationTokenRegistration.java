package com.facebook.bolts;

import java.io.Closeable;
import kotlin.jvm.internal.t;
import wc.g0;

/* JADX INFO: compiled from: CancellationTokenRegistration.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CancellationTokenRegistration implements Closeable {
    private Runnable action;
    private boolean closed;
    private CancellationTokenSource tokenSource;

    public CancellationTokenRegistration(CancellationTokenSource tokenSource, Runnable runnable) {
        t.f(tokenSource, "tokenSource");
        this.action = runnable;
        this.tokenSource = tokenSource;
    }

    private final void throwIfClosed() {
        if (!(!this.closed)) {
            throw new IllegalStateException("Object already closed".toString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (this.closed) {
                return;
            }
            this.closed = true;
            CancellationTokenSource cancellationTokenSource = this.tokenSource;
            if (cancellationTokenSource != null) {
                cancellationTokenSource.unregister$facebook_bolts_release(this);
            }
            this.tokenSource = null;
            this.action = null;
            g0 g0Var = g0.f27756a;
        }
    }

    public final void runAction$facebook_bolts_release() {
        synchronized (this) {
            throwIfClosed();
            Runnable runnable = this.action;
            if (runnable != null) {
                runnable.run();
            }
            close();
            g0 g0Var = g0.f27756a;
        }
    }
}
