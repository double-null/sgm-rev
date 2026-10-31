package com.applovin.shadow.okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import wc.g0;

/* JADX INFO: compiled from: Pipe.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Pipe {
    private final Buffer buffer = new Buffer();
    private boolean canceled;
    private final Condition condition;
    private Sink foldedSink;
    private final ReentrantLock lock;
    private final long maxBufferSize;
    private final Sink sink;
    private boolean sinkClosed;
    private final Source source;
    private boolean sourceClosed;

    public Pipe(long j10) {
        this.maxBufferSize = j10;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.t.e(conditionNewCondition, "newCondition(...)");
        this.condition = conditionNewCondition;
        if (j10 >= 1) {
            this.sink = new Sink() { // from class: com.applovin.shadow.okio.Pipe.sink.1
                private final Timeout timeout = new Timeout();

                @Override // com.applovin.shadow.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    boolean zHasDeadline;
                    ReentrantLock lock = Pipe.this.getLock();
                    Pipe pipe = Pipe.this;
                    lock.lock();
                    try {
                        if (pipe.getSinkClosed$okio()) {
                            lock.unlock();
                            return;
                        }
                        Sink foldedSink$okio = pipe.getFoldedSink$okio();
                        if (foldedSink$okio == null) {
                            if (pipe.getSourceClosed$okio() && pipe.getBuffer$okio().size() > 0) {
                                throw new IOException("source is closed");
                            }
                            pipe.setSinkClosed$okio(true);
                            pipe.getCondition().signalAll();
                            foldedSink$okio = null;
                        }
                        g0 g0Var = g0.f27756a;
                        lock.unlock();
                        if (foldedSink$okio != null) {
                            Pipe pipe2 = Pipe.this;
                            Timeout timeout = foldedSink$okio.timeout();
                            Timeout timeout2 = pipe2.sink().timeout();
                            long jTimeoutNanos = timeout.timeoutNanos();
                            timeout.timeout(Timeout.Companion.minTimeout(timeout2.timeoutNanos(), timeout.timeoutNanos()), TimeUnit.NANOSECONDS);
                            if (!timeout.hasDeadline()) {
                                if (timeout2.hasDeadline()) {
                                    timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                                }
                                try {
                                    foldedSink$okio.close();
                                    if (zHasDeadline) {
                                        return;
                                    } else {
                                        return;
                                    }
                                } finally {
                                    timeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                                    if (timeout2.hasDeadline()) {
                                        timeout.clearDeadline();
                                    }
                                }
                            }
                            long jDeadlineNanoTime = timeout.deadlineNanoTime();
                            if (timeout2.hasDeadline()) {
                                timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                            }
                            try {
                                foldedSink$okio.close();
                            } finally {
                                timeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                                if (timeout2.hasDeadline()) {
                                    timeout.deadlineNanoTime(jDeadlineNanoTime);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                }

                @Override // com.applovin.shadow.okio.Sink, java.io.Flushable
                public void flush() {
                    boolean zHasDeadline;
                    ReentrantLock lock = Pipe.this.getLock();
                    Pipe pipe = Pipe.this;
                    lock.lock();
                    try {
                        if (!(!pipe.getSinkClosed$okio())) {
                            throw new IllegalStateException("closed".toString());
                        }
                        if (pipe.getCanceled$okio()) {
                            throw new IOException("canceled");
                        }
                        Sink foldedSink$okio = pipe.getFoldedSink$okio();
                        if (foldedSink$okio == null) {
                            if (pipe.getSourceClosed$okio() && pipe.getBuffer$okio().size() > 0) {
                                throw new IOException("source is closed");
                            }
                            foldedSink$okio = null;
                        }
                        g0 g0Var = g0.f27756a;
                        lock.unlock();
                        if (foldedSink$okio != null) {
                            Pipe pipe2 = Pipe.this;
                            Timeout timeout = foldedSink$okio.timeout();
                            Timeout timeout2 = pipe2.sink().timeout();
                            long jTimeoutNanos = timeout.timeoutNanos();
                            timeout.timeout(Timeout.Companion.minTimeout(timeout2.timeoutNanos(), timeout.timeoutNanos()), TimeUnit.NANOSECONDS);
                            if (!timeout.hasDeadline()) {
                                if (timeout2.hasDeadline()) {
                                    timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                                }
                                try {
                                    foldedSink$okio.flush();
                                    if (zHasDeadline) {
                                        return;
                                    } else {
                                        return;
                                    }
                                } finally {
                                    timeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                                    if (timeout2.hasDeadline()) {
                                        timeout.clearDeadline();
                                    }
                                }
                            }
                            long jDeadlineNanoTime = timeout.deadlineNanoTime();
                            if (timeout2.hasDeadline()) {
                                timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                            }
                            try {
                                foldedSink$okio.flush();
                            } finally {
                                timeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                                if (timeout2.hasDeadline()) {
                                    timeout.deadlineNanoTime(jDeadlineNanoTime);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                }

                @Override // com.applovin.shadow.okio.Sink
                public Timeout timeout() {
                    return this.timeout;
                }

                @Override // com.applovin.shadow.okio.Sink
                public void write(Buffer source, long j11) {
                    Sink foldedSink$okio;
                    boolean zHasDeadline;
                    kotlin.jvm.internal.t.f(source, "source");
                    ReentrantLock lock = Pipe.this.getLock();
                    Pipe pipe = Pipe.this;
                    lock.lock();
                    try {
                        if (!(!pipe.getSinkClosed$okio())) {
                            throw new IllegalStateException("closed".toString());
                        }
                        if (pipe.getCanceled$okio()) {
                            throw new IOException("canceled");
                        }
                        while (true) {
                            if (j11 <= 0) {
                                foldedSink$okio = null;
                                break;
                            }
                            foldedSink$okio = pipe.getFoldedSink$okio();
                            if (foldedSink$okio != null) {
                                break;
                            }
                            if (pipe.getSourceClosed$okio()) {
                                throw new IOException("source is closed");
                            }
                            long maxBufferSize$okio = pipe.getMaxBufferSize$okio() - pipe.getBuffer$okio().size();
                            if (maxBufferSize$okio == 0) {
                                this.timeout.awaitSignal(pipe.getCondition());
                                if (pipe.getCanceled$okio()) {
                                    throw new IOException("canceled");
                                }
                            } else {
                                long jMin = Math.min(maxBufferSize$okio, j11);
                                pipe.getBuffer$okio().write(source, jMin);
                                j11 -= jMin;
                                pipe.getCondition().signalAll();
                            }
                        }
                        g0 g0Var = g0.f27756a;
                        lock.unlock();
                        if (foldedSink$okio != null) {
                            Pipe pipe2 = Pipe.this;
                            Timeout timeout = foldedSink$okio.timeout();
                            Timeout timeout2 = pipe2.sink().timeout();
                            long jTimeoutNanos = timeout.timeoutNanos();
                            timeout.timeout(Timeout.Companion.minTimeout(timeout2.timeoutNanos(), timeout.timeoutNanos()), TimeUnit.NANOSECONDS);
                            if (!timeout.hasDeadline()) {
                                if (timeout2.hasDeadline()) {
                                    timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                                }
                                try {
                                    foldedSink$okio.write(source, j11);
                                    if (zHasDeadline) {
                                        return;
                                    } else {
                                        return;
                                    }
                                } finally {
                                    timeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                                    if (timeout2.hasDeadline()) {
                                        timeout.clearDeadline();
                                    }
                                }
                            }
                            long jDeadlineNanoTime = timeout.deadlineNanoTime();
                            if (timeout2.hasDeadline()) {
                                timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                            }
                            try {
                                foldedSink$okio.write(source, j11);
                            } finally {
                                timeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                                if (timeout2.hasDeadline()) {
                                    timeout.deadlineNanoTime(jDeadlineNanoTime);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                }
            };
            this.source = new Source() { // from class: com.applovin.shadow.okio.Pipe.source.1
                private final Timeout timeout = new Timeout();

                @Override // com.applovin.shadow.okio.Source, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    ReentrantLock lock = Pipe.this.getLock();
                    Pipe pipe = Pipe.this;
                    lock.lock();
                    try {
                        pipe.setSourceClosed$okio(true);
                        pipe.getCondition().signalAll();
                        g0 g0Var = g0.f27756a;
                    } finally {
                        lock.unlock();
                    }
                }

                @Override // com.applovin.shadow.okio.Source
                public long read(Buffer sink, long j11) {
                    kotlin.jvm.internal.t.f(sink, "sink");
                    ReentrantLock lock = Pipe.this.getLock();
                    Pipe pipe = Pipe.this;
                    lock.lock();
                    try {
                        if (!(!pipe.getSourceClosed$okio())) {
                            throw new IllegalStateException("closed".toString());
                        }
                        if (pipe.getCanceled$okio()) {
                            throw new IOException("canceled");
                        }
                        while (pipe.getBuffer$okio().size() == 0) {
                            if (pipe.getSinkClosed$okio()) {
                                lock.unlock();
                                return -1L;
                            }
                            this.timeout.awaitSignal(pipe.getCondition());
                            if (pipe.getCanceled$okio()) {
                                throw new IOException("canceled");
                            }
                        }
                        long j12 = pipe.getBuffer$okio().read(sink, j11);
                        pipe.getCondition().signalAll();
                        lock.unlock();
                        return j12;
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                }

                @Override // com.applovin.shadow.okio.Source
                public Timeout timeout() {
                    return this.timeout;
                }
            };
        } else {
            throw new IllegalArgumentException(("maxBufferSize < 1: " + j10).toString());
        }
    }

    private final void forward(Sink sink, id.l<? super Sink, g0> lVar) {
        Timeout timeout = sink.timeout();
        Timeout timeout2 = sink().timeout();
        long jTimeoutNanos = timeout.timeoutNanos();
        timeout.timeout(Timeout.Companion.minTimeout(timeout2.timeoutNanos(), timeout.timeoutNanos()), TimeUnit.NANOSECONDS);
        if (!timeout.hasDeadline()) {
            if (timeout2.hasDeadline()) {
                timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
            }
            try {
                lVar.invoke(sink);
                g0 g0Var = g0.f27756a;
                kotlin.jvm.internal.r.b(1);
                return;
            } finally {
                kotlin.jvm.internal.r.b(1);
                timeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                if (timeout2.hasDeadline()) {
                    timeout.clearDeadline();
                }
                kotlin.jvm.internal.r.a(1);
            }
        }
        long jDeadlineNanoTime = timeout.deadlineNanoTime();
        if (timeout2.hasDeadline()) {
            timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
        }
        try {
            lVar.invoke(sink);
            g0 g0Var2 = g0.f27756a;
            kotlin.jvm.internal.r.b(1);
        } finally {
            kotlin.jvm.internal.r.b(1);
            timeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
            if (timeout2.hasDeadline()) {
                timeout.deadlineNanoTime(jDeadlineNanoTime);
            }
            kotlin.jvm.internal.r.a(1);
        }
    }

    /* JADX INFO: renamed from: -deprecated_sink, reason: not valid java name */
    public final Sink m160deprecated_sink() {
        return this.sink;
    }

    /* JADX INFO: renamed from: -deprecated_source, reason: not valid java name */
    public final Source m161deprecated_source() {
        return this.source;
    }

    public final void cancel() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.canceled = true;
            this.buffer.clear();
            this.condition.signalAll();
            g0 g0Var = g0.f27756a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void fold(Sink sink) throws IOException {
        kotlin.jvm.internal.t.f(sink, "sink");
        while (true) {
            ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            try {
                if (!(this.foldedSink == null)) {
                    throw new IllegalStateException("sink already folded".toString());
                }
                if (this.canceled) {
                    this.foldedSink = sink;
                    throw new IOException("canceled");
                }
                if (this.buffer.exhausted()) {
                    this.sourceClosed = true;
                    this.foldedSink = sink;
                    reentrantLock.unlock();
                    return;
                }
                boolean z10 = this.sinkClosed;
                Buffer buffer = new Buffer();
                Buffer buffer2 = this.buffer;
                buffer.write(buffer2, buffer2.size());
                this.condition.signalAll();
                g0 g0Var = g0.f27756a;
                reentrantLock.unlock();
                try {
                    sink.write(buffer, buffer.size());
                    if (z10) {
                        sink.close();
                    } else {
                        sink.flush();
                    }
                } catch (Throwable th) {
                    ReentrantLock reentrantLock2 = this.lock;
                    reentrantLock2.lock();
                    try {
                        this.sourceClosed = true;
                        this.condition.signalAll();
                        g0 g0Var2 = g0.f27756a;
                        throw th;
                    } finally {
                        reentrantLock2.unlock();
                    }
                }
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
    }

    public final Buffer getBuffer$okio() {
        return this.buffer;
    }

    public final boolean getCanceled$okio() {
        return this.canceled;
    }

    public final Condition getCondition() {
        return this.condition;
    }

    public final Sink getFoldedSink$okio() {
        return this.foldedSink;
    }

    public final ReentrantLock getLock() {
        return this.lock;
    }

    public final long getMaxBufferSize$okio() {
        return this.maxBufferSize;
    }

    public final boolean getSinkClosed$okio() {
        return this.sinkClosed;
    }

    public final boolean getSourceClosed$okio() {
        return this.sourceClosed;
    }

    public final void setCanceled$okio(boolean z10) {
        this.canceled = z10;
    }

    public final void setFoldedSink$okio(Sink sink) {
        this.foldedSink = sink;
    }

    public final void setSinkClosed$okio(boolean z10) {
        this.sinkClosed = z10;
    }

    public final void setSourceClosed$okio(boolean z10) {
        this.sourceClosed = z10;
    }

    public final Sink sink() {
        return this.sink;
    }

    public final Source source() {
        return this.source;
    }
}
