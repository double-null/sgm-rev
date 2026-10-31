package k2;

import android.app.job.JobInfo;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: SchedulerConfig.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: compiled from: SchedulerConfig.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private n2.a f21151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map<b2.e, b> f21152b = new HashMap();

        public a a(b2.e eVar, b bVar) {
            this.f21152b.put(eVar, bVar);
            return this;
        }

        public f b() {
            if (this.f21151a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f21152b.keySet().size() < b2.e.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map<b2.e, b> map = this.f21152b;
            this.f21152b = new HashMap();
            return f.d(this.f21151a, map);
        }

        public a c(n2.a aVar) {
            this.f21151a = aVar;
            return this;
        }
    }

    /* JADX INFO: compiled from: SchedulerConfig.java */
    public static abstract class b {

        /* JADX INFO: compiled from: SchedulerConfig.java */
        public static abstract class a {
            public abstract b a();

            public abstract a b(long j10);

            public abstract a c(Set<c> set);

            public abstract a d(long j10);
        }

        public static a a() {
            return new k2.c.b().c(Collections.emptySet());
        }

        abstract long b();

        abstract Set<c> c();

        abstract long d();
    }

    /* JADX INFO: compiled from: SchedulerConfig.java */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i10, long j10) {
        int i11 = i10 - 1;
        return (long) (Math.pow(3.0d, i11) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j10 > 1 ? j10 : 2L) * ((long) i11))));
    }

    public static a b() {
        return new a();
    }

    static f d(n2.a aVar, Map<b2.e, b> map) {
        return new k2.b(aVar, map);
    }

    public static f f(n2.a aVar) {
        return b().a(b2.e.DEFAULT, b.a().b(30000L).d(SignalManager.TWENTY_FOUR_HOURS_MILLIS).a()).a(b2.e.HIGHEST, b.a().b(1000L).d(SignalManager.TWENTY_FOUR_HOURS_MILLIS).a()).a(b2.e.VERY_LOW, b.a().b(SignalManager.TWENTY_FOUR_HOURS_MILLIS).d(SignalManager.TWENTY_FOUR_HOURS_MILLIS).c(i(c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    private static <T> Set<T> i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    private void j(JobInfo.Builder builder, Set<c> set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder c(JobInfo.Builder builder, b2.e eVar, long j10, int i10) {
        builder.setMinimumLatency(g(eVar, j10, i10));
        j(builder, h().get(eVar).c());
        return builder;
    }

    abstract n2.a e();

    public long g(b2.e eVar, long j10, int i10) {
        long time = j10 - e().getTime();
        b bVar = h().get(eVar);
        return Math.min(Math.max(a(i10, bVar.b()), time), bVar.d());
    }

    abstract Map<b2.e, b> h();
}
