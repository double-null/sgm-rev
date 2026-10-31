package x3;

import com.google.firebase.installations.h;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: RequestLimiter.java */
/* JADX INFO: loaded from: classes4.dex */
class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f27999d = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f28000e = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f28001a = h.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f28002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28003c;

    e() {
    }

    private synchronized long a(int i10) {
        if (c(i10)) {
            return (long) Math.min(Math.pow(2.0d, this.f28003c) + this.f28001a.e(), f28000e);
        }
        return f27999d;
    }

    private static boolean c(int i10) {
        return i10 == 429 || (i10 >= 500 && i10 < 600);
    }

    private static boolean d(int i10) {
        return (i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404;
    }

    private synchronized void e() {
        this.f28003c = 0;
    }

    public synchronized boolean b() {
        return this.f28003c == 0 || this.f28001a.a() > this.f28002b;
    }

    public synchronized void f(int i10) {
        if (d(i10)) {
            e();
            return;
        }
        this.f28003c++;
        this.f28002b = this.f28001a.a() + a(i10);
    }
}
