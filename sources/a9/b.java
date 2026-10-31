package a9;

import java.io.IOException;
import java.util.Objects;
import v8.e;
import v8.q;
import v8.v;
import v8.y;

/* JADX INFO: compiled from: FlacBinarySearchSeeker.java */
/* JADX INFO: loaded from: classes4.dex */
final class b extends e {

    /* JADX INFO: renamed from: a9.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FlacBinarySearchSeeker.java */
    private static final class C0001b implements e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final y f172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f173b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final v.a f174c;

        private long c(q qVar) throws IOException {
            while (qVar.f() < qVar.getLength() - 6 && !v.h(qVar, this.f172a, this.f173b, this.f174c)) {
                qVar.g(1);
            }
            if (qVar.f() < qVar.getLength() - 6) {
                return this.f174c.f27436a;
            }
            qVar.g((int) (qVar.getLength() - qVar.f()));
            return this.f172a.f27449j;
        }

        @Override // v8.e.f
        public e.C0455e a(q qVar, long j10) throws IOException {
            long position = qVar.getPosition();
            long jC = c(qVar);
            long jF = qVar.f();
            qVar.g(Math.max(6, this.f172a.f27442c));
            long jC2 = c(qVar);
            long jF2 = qVar.f();
            if (jC > j10 || jC2 <= j10) {
                return jC2 <= j10 ? e.C0455e.f(jC2, jF2) : e.C0455e.d(jC, position);
            }
            return e.C0455e.e(jF);
        }

        private C0001b(y yVar, int i10) {
            this.f172a = yVar;
            this.f173b = i10;
            this.f174c = new v.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(final y yVar, int i10, long j10, long j11) {
        super(new e.d() { // from class: a9.a
            @Override // v8.e.d
            public final long a(long j12) {
                return yVar.i(j12);
            }
        }, new C0001b(yVar, i10), yVar.f(), 0L, yVar.f27449j, j10, j11, yVar.d(), Math.max(6, yVar.f27442c));
        Objects.requireNonNull(yVar);
    }
}
