package com.google.common.base;

import com.google.ads.mediation.ZRT.wHzciBnJlYkdX;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Stopwatch.java */
/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f11475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f11476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f11477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f11478d;

    /* JADX INFO: compiled from: Stopwatch.java */
    /* JADX INFO: loaded from: classes.dex */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11479a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f11479a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11479a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11479a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11479a[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11479a[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11479a[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11479a[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    u(z zVar) {
        this.f11475a = (z) p.m(zVar, "ticker");
    }

    private static TimeUnit b(long j10) {
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(j10, timeUnit2) > 0) {
            return timeUnit;
        }
        TimeUnit timeUnit3 = TimeUnit.HOURS;
        if (timeUnit3.convert(j10, timeUnit2) > 0) {
            return timeUnit3;
        }
        TimeUnit timeUnit4 = TimeUnit.MINUTES;
        if (timeUnit4.convert(j10, timeUnit2) > 0) {
            return timeUnit4;
        }
        TimeUnit timeUnit5 = TimeUnit.SECONDS;
        if (timeUnit5.convert(j10, timeUnit2) > 0) {
            return timeUnit5;
        }
        TimeUnit timeUnit6 = TimeUnit.MILLISECONDS;
        if (timeUnit6.convert(j10, timeUnit2) > 0) {
            return timeUnit6;
        }
        TimeUnit timeUnit7 = TimeUnit.MICROSECONDS;
        return timeUnit7.convert(j10, timeUnit2) > 0 ? timeUnit7 : timeUnit2;
    }

    public static u c(z zVar) {
        return new u(zVar).e();
    }

    private long d() {
        return this.f11476b ? (this.f11475a.read() - this.f11478d) + this.f11477c : this.f11477c;
    }

    public u e() {
        p.s(!this.f11476b, "This stopwatch is already running.");
        this.f11476b = true;
        this.f11478d = this.f11475a.read();
        return this;
    }

    public String toString() {
        long jD = d();
        TimeUnit timeUnitB = b(jD);
        return o.b(jD / TimeUnit.NANOSECONDS.convert(1L, timeUnitB)) + " " + a(timeUnitB);
    }

    private static String a(TimeUnit timeUnit) {
        switch (a.f11479a[timeUnit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "μs";
            case 3:
                return wHzciBnJlYkdX.uUV;
            case 4:
                return "s";
            case 5:
                return "min";
            case 6:
                return "h";
            case 7:
                return "d";
            default:
                throw new AssertionError();
        }
    }
}
