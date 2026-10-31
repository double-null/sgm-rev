package com.applovin.shadow.okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import k9.dW.xjwcmjDeOXR;
import wc.g0;

/* JADX INFO: compiled from: Throttler.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Throttler {
    private long allocatedUntil;
    private long bytesPerSecond;
    private final Condition condition;
    private final ReentrantLock lock;
    private long maxByteCount;
    private long waitByteCount;

    public Throttler(long j10) {
        this.allocatedUntil = j10;
        this.waitByteCount = 8192L;
        this.maxByteCount = 262144L;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.t.e(conditionNewCondition, "newCondition(...)");
        this.condition = conditionNewCondition;
    }

    public static /* synthetic */ void bytesPerSecond$default(Throttler throttler, long j10, long j11, long j12, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j11 = throttler.waitByteCount;
        }
        long j13 = j11;
        if ((i10 & 4) != 0) {
            j12 = throttler.maxByteCount;
        }
        throttler.bytesPerSecond(j10, j13, j12);
    }

    private final long bytesToNanos(long j10) {
        return (j10 * 1000000000) / this.bytesPerSecond;
    }

    private final long nanosToBytes(long j10) {
        return (j10 * this.bytesPerSecond) / 1000000000;
    }

    public final long byteCountOrWaitNanos$okio(long j10, long j11) {
        if (this.bytesPerSecond == 0) {
            return j11;
        }
        long jMax = Math.max(this.allocatedUntil - j10, 0L);
        long jNanosToBytes = this.maxByteCount - nanosToBytes(jMax);
        if (jNanosToBytes >= j11) {
            this.allocatedUntil = j10 + jMax + bytesToNanos(j11);
            return j11;
        }
        long j12 = this.waitByteCount;
        if (jNanosToBytes >= j12) {
            this.allocatedUntil = j10 + bytesToNanos(this.maxByteCount);
            return jNanosToBytes;
        }
        long jMin = Math.min(j12, j11);
        long jBytesToNanos = jMax + bytesToNanos(jMin - this.maxByteCount);
        if (jBytesToNanos != 0) {
            return -jBytesToNanos;
        }
        this.allocatedUntil = j10 + bytesToNanos(this.maxByteCount);
        return jMin;
    }

    public final void bytesPerSecond(long j10) {
        bytesPerSecond$default(this, j10, 0L, 0L, 6, null);
    }

    public final Condition getCondition() {
        return this.condition;
    }

    public final ReentrantLock getLock() {
        return this.lock;
    }

    public final Sink sink(Sink sink) {
        kotlin.jvm.internal.t.f(sink, "sink");
        return new ForwardingSink(sink) { // from class: com.applovin.shadow.okio.Throttler.sink.1
            @Override // com.applovin.shadow.okio.ForwardingSink, com.applovin.shadow.okio.Sink
            public void write(Buffer source, long j10) throws IOException {
                kotlin.jvm.internal.t.f(source, "source");
                while (j10 > 0) {
                    try {
                        long jTake$okio = this.take$okio(j10);
                        super.write(source, jTake$okio);
                        j10 -= jTake$okio;
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException("interrupted");
                    }
                }
            }
        };
    }

    public final Source source(Source source) {
        kotlin.jvm.internal.t.f(source, "source");
        return new ForwardingSource(source) { // from class: com.applovin.shadow.okio.Throttler.source.1
            @Override // com.applovin.shadow.okio.ForwardingSource, com.applovin.shadow.okio.Source
            public long read(Buffer sink, long j10) throws InterruptedIOException {
                kotlin.jvm.internal.t.f(sink, "sink");
                try {
                    return super.read(sink, this.take$okio(j10));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException("interrupted");
                }
            }
        };
    }

    public final long take$okio(long j10) {
        if (!(j10 > 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        while (true) {
            try {
                long jByteCountOrWaitNanos$okio = byteCountOrWaitNanos$okio(System.nanoTime(), j10);
                if (jByteCountOrWaitNanos$okio >= 0) {
                    reentrantLock.unlock();
                    return jByteCountOrWaitNanos$okio;
                }
                this.condition.awaitNanos(-jByteCountOrWaitNanos$okio);
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final void bytesPerSecond(long j10, long j11) {
        bytesPerSecond$default(this, j10, j11, 0L, 4, null);
    }

    public final void bytesPerSecond(long j10, long j11, long j12) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        boolean z10 = j10 >= 0;
        String str = xjwcmjDeOXR.TpnCeJSFOYdABm;
        try {
            if (!z10) {
                throw new IllegalArgumentException(str.toString());
            }
            if (!(j11 > 0)) {
                throw new IllegalArgumentException(str.toString());
            }
            if (j12 >= j11) {
                this.bytesPerSecond = j10;
                this.waitByteCount = j11;
                this.maxByteCount = j12;
                this.condition.signalAll();
                g0 g0Var = g0.f27756a;
                reentrantLock.unlock();
                return;
            }
            throw new IllegalArgumentException(str.toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public Throttler() {
        this(System.nanoTime());
    }
}
