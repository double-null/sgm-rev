package b8;

import x7.l0;

/* JADX INFO: compiled from: SeekParameters.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f4121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a0 f4122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a0 f4123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a0 f4124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a0 f4125g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4127b;

    static {
        a0 a0Var = new a0(0L, 0L);
        f4121c = a0Var;
        f4122d = new a0(Long.MAX_VALUE, Long.MAX_VALUE);
        f4123e = new a0(Long.MAX_VALUE, 0L);
        f4124f = new a0(0L, Long.MAX_VALUE);
        f4125g = a0Var;
    }

    public a0(long j10, long j11) {
        x7.a.a(j10 >= 0);
        x7.a.a(j11 >= 0);
        this.f4126a = j10;
        this.f4127b = j11;
    }

    public long a(long j10, long j11, long j12) {
        long j13 = this.f4126a;
        if (j13 == 0 && this.f4127b == 0) {
            return j10;
        }
        long jP1 = l0.p1(j10, j13, Long.MIN_VALUE);
        long jC = l0.c(j10, this.f4127b, Long.MAX_VALUE);
        boolean z10 = jP1 <= j11 && j11 <= jC;
        boolean z11 = jP1 <= j12 && j12 <= jC;
        if (z10 && z11) {
            return Math.abs(j11 - j10) <= Math.abs(j12 - j10) ? j11 : j12;
        }
        if (z10) {
            return j11;
        }
        return z11 ? j12 : jP1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a0.class != obj.getClass()) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f4126a == a0Var.f4126a && this.f4127b == a0Var.f4127b;
    }

    public int hashCode() {
        return (((int) this.f4126a) * 31) + ((int) this.f4127b);
    }
}
