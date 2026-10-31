package q9;

import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import v8.j0;
import v8.k0;
import v8.q;
import v8.s;
import x7.l0;

/* JADX INFO: compiled from: DefaultOggSeeker.java */
/* JADX INFO: loaded from: classes4.dex */
final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f24616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f24617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f24618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f24619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f24620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f24621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f24622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f24623h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f24624i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f24625j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f24626k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f24627l;

    /* JADX INFO: compiled from: DefaultOggSeeker.java */
    private final class b implements j0 {
        private b() {
        }

        @Override // v8.j0
        public j0.a d(long j10) {
            return new j0.a(new k0(j10, l0.q((a.this.f24617b + BigInteger.valueOf(a.this.f24619d.c(j10)).multiply(BigInteger.valueOf(a.this.f24618c - a.this.f24617b)).divide(BigInteger.valueOf(a.this.f24621f)).longValue()) - 30000, a.this.f24617b, a.this.f24618c - 1)));
        }

        @Override // v8.j0
        public boolean h() {
            return true;
        }

        @Override // v8.j0
        public long k() {
            return a.this.f24619d.b(a.this.f24621f);
        }
    }

    public a(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        x7.a.a(j10 >= 0 && j11 > j10);
        this.f24619d = iVar;
        this.f24617b = j10;
        this.f24618c = j11;
        if (j12 == j11 - j10 || z10) {
            this.f24621f = j13;
            this.f24620e = 4;
        } else {
            this.f24620e = 0;
        }
        this.f24616a = new f();
    }

    private long i(q qVar) throws IOException {
        if (this.f24624i == this.f24625j) {
            return -1L;
        }
        long position = qVar.getPosition();
        if (!this.f24616a.d(qVar, this.f24625j)) {
            long j10 = this.f24624i;
            if (j10 != position) {
                return j10;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f24616a.a(qVar, false);
        qVar.d();
        long j11 = this.f24623h;
        f fVar = this.f24616a;
        long j12 = fVar.f24646c;
        long j13 = j11 - j12;
        int i10 = fVar.f24651h + fVar.f24652i;
        if (0 <= j13 && j13 < 72000) {
            return -1L;
        }
        if (j13 < 0) {
            this.f24625j = position;
            this.f24627l = j12;
        } else {
            this.f24624i = qVar.getPosition() + ((long) i10);
            this.f24626k = this.f24616a.f24646c;
        }
        long j14 = this.f24625j;
        long j15 = this.f24624i;
        if (j14 - j15 < 100000) {
            this.f24625j = j15;
            return j15;
        }
        long position2 = qVar.getPosition() - (((long) i10) * (j13 <= 0 ? 2L : 1L));
        long j16 = this.f24625j;
        long j17 = this.f24624i;
        return l0.q(position2 + ((j13 * (j16 - j17)) / (this.f24627l - this.f24626k)), j17, j16 - 1);
    }

    private void k(q qVar) throws IOException {
        while (true) {
            this.f24616a.c(qVar);
            this.f24616a.a(qVar, false);
            f fVar = this.f24616a;
            if (fVar.f24646c > this.f24623h) {
                qVar.d();
                return;
            } else {
                qVar.k(fVar.f24651h + fVar.f24652i);
                this.f24624i = qVar.getPosition();
                this.f24626k = this.f24616a.f24646c;
            }
        }
    }

    @Override // q9.g
    public long a(q qVar) throws IOException {
        int i10 = this.f24620e;
        if (i10 == 0) {
            long position = qVar.getPosition();
            this.f24622g = position;
            this.f24620e = 1;
            long j10 = this.f24618c - 65307;
            if (j10 > position) {
                return j10;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long jI = i(qVar);
                if (jI != -1) {
                    return jI;
                }
                this.f24620e = 3;
            } else if (i10 != 3) {
                if (i10 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            k(qVar);
            this.f24620e = 4;
            return -(this.f24626k + 2);
        }
        this.f24621f = j(qVar);
        this.f24620e = 4;
        return this.f24622g;
    }

    @Override // q9.g
    public void c(long j10) {
        this.f24623h = l0.q(j10, 0L, this.f24621f - 1);
        this.f24620e = 2;
        this.f24624i = this.f24617b;
        this.f24625j = this.f24618c;
        this.f24626k = 0L;
        this.f24627l = this.f24621f;
    }

    @Override // q9.g
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public b b() {
        if (this.f24621f != 0) {
            return new b();
        }
        return null;
    }

    long j(q qVar) throws IOException {
        this.f24616a.b();
        if (!this.f24616a.c(qVar)) {
            throw new EOFException();
        }
        this.f24616a.a(qVar, false);
        f fVar = this.f24616a;
        qVar.k(fVar.f24651h + fVar.f24652i);
        long j10 = this.f24616a.f24646c;
        while (true) {
            f fVar2 = this.f24616a;
            if ((fVar2.f24645b & 4) == 4 || !fVar2.c(qVar) || qVar.getPosition() >= this.f24618c || !this.f24616a.a(qVar, true)) {
                break;
            }
            f fVar3 = this.f24616a;
            if (!s.e(qVar, fVar3.f24651h + fVar3.f24652i)) {
                break;
            }
            j10 = this.f24616a.f24646c;
        }
        return j10;
    }
}
