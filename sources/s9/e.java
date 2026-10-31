package s9;

import java.util.List;

/* JADX INFO: compiled from: CuesWithTiming.java */
/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.common.collect.u<w7.a> f25316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f25317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f25318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f25319d;

    public e(List<w7.a> list, long j10, long j11) {
        this.f25316a = com.google.common.collect.u.B(list);
        this.f25317b = j10;
        this.f25318c = j11;
        long j12 = -9223372036854775807L;
        if (j10 != -9223372036854775807L && j11 != -9223372036854775807L) {
            j12 = j10 + j11;
        }
        this.f25319d = j12;
    }
}
