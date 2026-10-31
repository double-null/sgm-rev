package com.facebook.bolts;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.t;
import wc.g0;

/* JADX INFO: compiled from: CancellationTokenSource.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CancellationTokenSource implements Closeable {
    private boolean cancellationRequested;
    private boolean closed;
    private ScheduledFuture<?> scheduledCancellation;
    private final Object lock = new Object();
    private final List<CancellationTokenRegistration> registrations = new ArrayList();
    private final ScheduledExecutorService executor = BoltsExecutors.Companion.scheduled$facebook_bolts_release();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cancelAfter$lambda$6$lambda$5(CancellationTokenSource this$0) {
        t.f(this$0, "this$0");
        synchronized (this$0.lock) {
            this$0.scheduledCancellation = null;
            g0 g0Var = g0.f27756a;
        }
        this$0.cancel();
    }

    private final void cancelScheduledCancellation() {
        ScheduledFuture<?> scheduledFuture = this.scheduledCancellation;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(true);
        this.scheduledCancellation = null;
    }

    private final void notifyListeners(List<CancellationTokenRegistration> list) {
        Iterator<CancellationTokenRegistration> it = list.iterator();
        while (it.hasNext()) {
            it.next().runAction$facebook_bolts_release();
        }
    }

    private final void throwIfClosed() {
        if (!(!this.closed)) {
            throw new IllegalStateException("Object already closed".toString());
        }
    }

    public final void cancel() {
        synchronized (this.lock) {
            throwIfClosed();
            if (this.cancellationRequested) {
                return;
            }
            cancelScheduledCancellation();
            this.cancellationRequested = true;
            ArrayList arrayList = new ArrayList(this.registrations);
            g0 g0Var = g0.f27756a;
            notifyListeners(arrayList);
        }
    }

    public final void cancelAfter(long j10) {
        cancelAfter(j10, TimeUnit.MILLISECONDS);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.lock) {
            if (this.closed) {
                return;
            }
            cancelScheduledCancellation();
            Iterator<CancellationTokenRegistration> it = this.registrations.iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            this.registrations.clear();
            this.closed = true;
            g0 g0Var = g0.f27756a;
        }
    }

    public final CancellationToken getToken() {
        CancellationToken cancellationToken;
        synchronized (this.lock) {
            throwIfClosed();
            cancellationToken = new CancellationToken(this);
        }
        return cancellationToken;
    }

    public final boolean isCancellationRequested() {
        boolean z10;
        synchronized (this.lock) {
            throwIfClosed();
            z10 = this.cancellationRequested;
        }
        return z10;
    }

    public final CancellationTokenRegistration register$facebook_bolts_release(Runnable runnable) {
        CancellationTokenRegistration cancellationTokenRegistration;
        synchronized (this.lock) {
            throwIfClosed();
            cancellationTokenRegistration = new CancellationTokenRegistration(this, runnable);
            if (this.cancellationRequested) {
                cancellationTokenRegistration.runAction$facebook_bolts_release();
                g0 g0Var = g0.f27756a;
            } else {
                this.registrations.add(cancellationTokenRegistration);
            }
        }
        return cancellationTokenRegistration;
    }

    public final void throwIfCancellationRequested$facebook_bolts_release() throws CancellationException {
        synchronized (this.lock) {
            throwIfClosed();
            if (this.cancellationRequested) {
                throw new CancellationException();
            }
            g0 g0Var = g0.f27756a;
        }
    }

    public String toString() {
        l0 l0Var = l0.f21527a;
        String str = String.format(Locale.US, "%s@%s[cancellationRequested=%s]", Arrays.copyOf(new Object[]{CancellationTokenSource.class.getName(), Integer.toHexString(hashCode()), Boolean.toString(isCancellationRequested())}, 3));
        t.e(str, "format(locale, format, *args)");
        return str;
    }

    public final void unregister$facebook_bolts_release(CancellationTokenRegistration registration) {
        t.f(registration, "registration");
        synchronized (this.lock) {
            throwIfClosed();
            this.registrations.remove(registration);
        }
    }

    private final void cancelAfter(long j10, TimeUnit timeUnit) {
        if (!(j10 >= -1)) {
            throw new IllegalArgumentException("Delay must be >= -1".toString());
        }
        if (j10 == 0) {
            cancel();
            return;
        }
        synchronized (this.lock) {
            if (this.cancellationRequested) {
                return;
            }
            cancelScheduledCancellation();
            if (j10 != -1) {
                this.scheduledCancellation = this.executor.schedule(new Runnable() { // from class: com.facebook.bolts.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        CancellationTokenSource.cancelAfter$lambda$6$lambda$5(this.f11014a);
                    }
                }, j10, timeUnit);
            }
            g0 g0Var = g0.f27756a;
        }
    }
}
