package n8;

import android.net.Uri;
import u7.d0;

/* JADX INFO: compiled from: SinglePeriodTimeline.java */
/* JADX INFO: loaded from: classes4.dex */
public final class u extends d0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Object f22819r = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final u7.s f22820s = new u7.s.c().c("SinglePeriodTimeline").f(Uri.EMPTY).a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f22821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f22822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f22823g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f22824h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f22825i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f22826j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f22827k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f22828l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f22829m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f22830n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Object f22831o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final u7.s f22832p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final u7.s.g f22833q;

    public u(long j10, boolean z10, boolean z11, boolean z12, Object obj, u7.s sVar) {
        this(j10, j10, 0L, 0L, z10, z11, z12, obj, sVar);
    }

    @Override // u7.d0
    public int b(Object obj) {
        return f22819r.equals(obj) ? 0 : -1;
    }

    @Override // u7.d0
    public d0.b g(int i10, d0.b bVar, boolean z10) {
        x7.a.c(i10, 0, 1);
        return bVar.s(null, z10 ? f22819r : null, 0, this.f22824h, -this.f22826j);
    }

    @Override // u7.d0
    public int i() {
        return 1;
    }

    @Override // u7.d0
    public Object m(int i10) {
        x7.a.c(i10, 0, 1);
        return f22819r;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e A[PHI: r1
      0x002e: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x000d, B:5:0x0011, B:7:0x0017, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // u7.d0
    public d0.c o(int i10, d0.c cVar, long j10) {
        long j11;
        x7.a.c(i10, 0, 1);
        long j12 = this.f22827k;
        boolean z10 = this.f22829m;
        if (!z10 || this.f22830n || j10 == 0) {
            j11 = j12;
        } else {
            long j13 = this.f22825i;
            if (j13 != -9223372036854775807L) {
                j12 += j10;
                if (j12 <= j13) {
                    j11 = j12;
                }
            }
            j11 = -9223372036854775807L;
        }
        return cVar.g(d0.c.f26025q, this.f22832p, this.f22831o, this.f22821e, this.f22822f, this.f22823g, this.f22828l, z10, this.f22833q, j11, this.f22825i, 0, 0, this.f22826j);
    }

    @Override // u7.d0
    public int p() {
        return 1;
    }

    public u(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, Object obj, u7.s sVar) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j10, j11, j12, j13, z10, z11, false, obj, sVar, z12 ? sVar.f26304d : null);
    }

    public u(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, u7.s sVar, u7.s.g gVar) {
        this.f22821e = j10;
        this.f22822f = j11;
        this.f22823g = j12;
        this.f22824h = j13;
        this.f22825i = j14;
        this.f22826j = j15;
        this.f22827k = j16;
        this.f22828l = z10;
        this.f22829m = z11;
        this.f22830n = z12;
        this.f22831o = obj;
        this.f22832p = (u7.s) x7.a.e(sVar);
        this.f22833q = gVar;
    }
}
