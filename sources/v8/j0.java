package v8;

import io.bidmachine.analytics.internal.s.bOI.CwEo;

/* JADX INFO: compiled from: SeekMap.java */
/* JADX INFO: loaded from: classes4.dex */
public interface j0 {

    /* JADX INFO: compiled from: SeekMap.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k0 f27345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k0 f27346b;

        public a(k0 k0Var) {
            this(k0Var, k0Var);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f27345a.equals(aVar.f27345a) && this.f27346b.equals(aVar.f27346b);
        }

        public int hashCode() {
            return (this.f27345a.hashCode() * 31) + this.f27346b.hashCode();
        }

        public a(k0 k0Var, k0 k0Var2) {
            this.f27345a = (k0) x7.a.e(k0Var);
            this.f27346b = (k0) x7.a.e(k0Var2);
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[");
            sb2.append(this.f27345a);
            if (this.f27345a.equals(this.f27346b)) {
                str = "";
            } else {
                str = CwEo.QKRgCewUu + this.f27346b;
            }
            sb2.append(str);
            sb2.append("]");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: SeekMap.java */
    public static class b implements j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f27347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f27348b;

        public b(long j10) {
            this(j10, 0L);
        }

        @Override // v8.j0
        public a d(long j10) {
            return this.f27348b;
        }

        @Override // v8.j0
        public boolean h() {
            return false;
        }

        @Override // v8.j0
        public long k() {
            return this.f27347a;
        }

        public b(long j10, long j11) {
            this.f27347a = j10;
            this.f27348b = new a(j11 == 0 ? k0.f27349c : new k0(0L, j11));
        }
    }

    a d(long j10);

    boolean h();

    long k();
}
