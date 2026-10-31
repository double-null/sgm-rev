package o9;

import android.util.Pair;
import j9.l;
import v8.j0;
import v8.k0;
import x7.l0;

/* JADX INFO: compiled from: MlltSeeker.java */
/* JADX INFO: loaded from: classes4.dex */
final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f23236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f23237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f23238c;

    private c(long[] jArr, long[] jArr2, long j10) {
        this.f23236a = jArr;
        this.f23237b = jArr2;
        this.f23238c = j10 == -9223372036854775807L ? l0.S0(jArr2[jArr2.length - 1]) : j10;
    }

    public static c a(long j10, l lVar, long j11) {
        int length = lVar.f20732e.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += (long) (lVar.f20730c + lVar.f20732e[i12]);
            j12 += (long) (lVar.f20731d + lVar.f20733f[i12]);
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new c(jArr, jArr2, j11);
    }

    private static Pair<Long, Long> c(long j10, long[] jArr, long[] jArr2) {
        int iH = l0.h(jArr, j10, true, true);
        long j11 = jArr[iH];
        long j12 = jArr2[iH];
        int i10 = iH + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i10];
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((j13 == j11 ? 0.0d : (j10 - j11) / (j13 - j11)) * (jArr2[i10] - j12))) + j12));
    }

    @Override // o9.g
    public long b(long j10) {
        return l0.S0(((Long) c(j10, this.f23236a, this.f23237b).second).longValue());
    }

    @Override // v8.j0
    public j0.a d(long j10) {
        Pair<Long, Long> pairC = c(l0.t1(l0.q(j10, 0L, this.f23238c)), this.f23237b, this.f23236a);
        return new j0.a(new k0(l0.S0(((Long) pairC.first).longValue()), ((Long) pairC.second).longValue()));
    }

    @Override // o9.g
    public long g() {
        return -1L;
    }

    @Override // v8.j0
    public boolean h() {
        return true;
    }

    @Override // o9.g
    public int j() {
        return -2147483647;
    }

    @Override // v8.j0
    public long k() {
        return this.f23238c;
    }
}
