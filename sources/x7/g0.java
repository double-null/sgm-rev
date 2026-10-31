package x7;

import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: TimestampAdjuster.java */
/* JADX INFO: loaded from: classes4.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f28120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f28121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f28122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ThreadLocal<Long> f28123d = new ThreadLocal<>();

    public g0(long j10) {
        i(j10);
    }

    public static long h(long j10) {
        return l0.f1(j10, 1000000L, 90000L);
    }

    public static long k(long j10) {
        return l0.f1(j10, 90000L, 1000000L);
    }

    public static long l(long j10) {
        return k(j10) % 8589934592L;
    }

    public synchronized long a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (!g()) {
            long jLongValue = this.f28120a;
            if (jLongValue == 9223372036854775806L) {
                jLongValue = ((Long) a.e(this.f28123d.get())).longValue();
            }
            this.f28121b = jLongValue - j10;
            notifyAll();
        }
        this.f28122c = j10;
        return j10 + this.f28121b;
    }

    public synchronized long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j11 = this.f28122c;
        if (j11 != -9223372036854775807L) {
            long jK = k(j11);
            long j12 = (4294967296L + jK) / 8589934592L;
            long j13 = ((j12 - 1) * 8589934592L) + j10;
            j10 += j12 * 8589934592L;
            if (Math.abs(j13 - jK) < Math.abs(j10 - jK)) {
                j10 = j13;
            }
        }
        return a(h(j10));
    }

    public synchronized long c(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j11 = this.f28122c;
        if (j11 != -9223372036854775807L) {
            long jK = k(j11);
            long j12 = jK / 8589934592L;
            long j13 = (j12 * 8589934592L) + j10;
            j10 += (j12 + 1) * 8589934592L;
            if (j13 >= jK) {
                j10 = j13;
            }
        }
        return a(h(j10));
    }

    public synchronized long d() {
        long j10;
        j10 = this.f28120a;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            j10 = -9223372036854775807L;
        }
        return j10;
    }

    public synchronized long e() {
        long j10;
        j10 = this.f28122c;
        return j10 != -9223372036854775807L ? j10 + this.f28121b : d();
    }

    public synchronized long f() {
        return this.f28121b;
    }

    public synchronized boolean g() {
        return this.f28121b != -9223372036854775807L;
    }

    public synchronized void i(long j10) {
        this.f28120a = j10;
        this.f28121b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f28122c = -9223372036854775807L;
    }

    public synchronized void j(boolean z10, long j10, long j11) throws InterruptedException, TimeoutException {
        a.g(this.f28120a == 9223372036854775806L);
        if (g()) {
            return;
        }
        if (z10) {
            this.f28123d.set(Long.valueOf(j10));
        } else {
            long jElapsedRealtime = 0;
            long j12 = j11;
            while (!g()) {
                if (j11 == 0) {
                    wait();
                } else {
                    a.g(j12 > 0);
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    wait(j12);
                    jElapsedRealtime += SystemClock.elapsedRealtime() - jElapsedRealtime2;
                    if (jElapsedRealtime >= j11 && !g()) {
                        throw new TimeoutException("TimestampAdjuster failed to initialize in " + j11 + " milliseconds");
                    }
                    j12 = j11 - jElapsedRealtime;
                }
            }
        }
    }
}
