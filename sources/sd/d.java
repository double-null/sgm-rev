package sd;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: DurationUnitJvm.kt */
/* JADX INFO: loaded from: classes5.dex */
public enum d {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);


    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ bd.a f25422j = bd.b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimeUnit f25423a;

    d(TimeUnit timeUnit) {
        this.f25423a = timeUnit;
    }

    public final TimeUnit c() {
        return this.f25423a;
    }
}
