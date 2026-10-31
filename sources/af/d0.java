package af;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Timeout.kt */
/* JADX INFO: loaded from: classes5.dex */
public class d0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f347d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d0 f348e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f351c;

    /* JADX INFO: compiled from: Timeout.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    public d0 a() {
        this.f349a = false;
        return this;
    }

    public d0 b() {
        this.f351c = 0L;
        return this;
    }

    public long c() {
        if (this.f349a) {
            return this.f350b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public d0 d(long j10) {
        this.f349a = true;
        this.f350b = j10;
        return this;
    }

    public boolean e() {
        return this.f349a;
    }

    public void f() throws IOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f349a && this.f350b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public d0 g(long j10, TimeUnit unit) {
        kotlin.jvm.internal.t.f(unit, "unit");
        if (j10 >= 0) {
            this.f351c = unit.toNanos(j10);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j10).toString());
    }

    public long h() {
        return this.f351c;
    }

    /* JADX INFO: compiled from: Timeout.kt */
    public static final class a extends d0 {
        a() {
        }

        @Override // af.d0
        public d0 g(long j10, TimeUnit unit) {
            kotlin.jvm.internal.t.f(unit, "unit");
            return this;
        }

        @Override // af.d0
        public void f() {
        }

        @Override // af.d0
        public d0 d(long j10) {
            return this;
        }
    }
}
