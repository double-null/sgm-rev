package n8;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: LoadEventInfo.java */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final AtomicLong f22778h = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z7.g f22780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f22781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, List<String>> f22782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f22783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f22784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f22785g;

    public i(long j10, z7.g gVar, long j11) {
        this(j10, gVar, gVar.f29009a, Collections.emptyMap(), j11, 0L, 0L);
    }

    public static long a() {
        return f22778h.getAndIncrement();
    }

    public i(long j10, z7.g gVar, Uri uri, Map<String, List<String>> map, long j11, long j12, long j13) {
        this.f22779a = j10;
        this.f22780b = gVar;
        this.f22781c = uri;
        this.f22782d = map;
        this.f22783e = j11;
        this.f22784f = j12;
        this.f22785g = j13;
    }
}
