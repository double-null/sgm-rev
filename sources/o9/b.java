package o9;

import java.math.RoundingMode;
import v8.e0;
import v8.j0;
import x7.l0;

/* JADX INFO: compiled from: IndexSeeker.java */
/* JADX INFO: loaded from: classes4.dex */
final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f23233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e0 f23235c;

    public b(long j10, long j11, long j12) {
        this.f23235c = new e0(new long[]{j11}, new long[]{0}, j10);
        this.f23233a = j12;
        int i10 = -2147483647;
        if (j10 == -9223372036854775807L) {
            this.f23234b = -2147483647;
            return;
        }
        long jH1 = l0.h1(j11 - j12, 8L, j10, RoundingMode.HALF_UP);
        if (jH1 > 0 && jH1 <= 2147483647L) {
            i10 = (int) jH1;
        }
        this.f23234b = i10;
    }

    public boolean a(long j10) {
        return this.f23235c.c(j10, 100000L);
    }

    @Override // o9.g
    public long b(long j10) {
        return this.f23235c.b(j10);
    }

    public void c(long j10, long j11) {
        if (a(j10)) {
            return;
        }
        this.f23235c.a(j10, j11);
    }

    @Override // v8.j0
    public j0.a d(long j10) {
        return this.f23235c.d(j10);
    }

    void e(long j10) {
        this.f23235c.e(j10);
    }

    @Override // o9.g
    public long g() {
        return this.f23233a;
    }

    @Override // v8.j0
    public boolean h() {
        return this.f23235c.h();
    }

    @Override // o9.g
    public int j() {
        return this.f23234b;
    }

    @Override // v8.j0
    public long k() {
        return this.f23235c.k();
    }
}
