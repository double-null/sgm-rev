package s9;

import java.util.Objects;

/* JADX INFO: compiled from: SubtitleParser.java */
/* JADX INFO: loaded from: classes4.dex */
public interface r {

    /* JADX INFO: compiled from: SubtitleParser.java */
    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f25343a = new C0414a();

        /* JADX INFO: renamed from: s9.r$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SubtitleParser.java */
        class C0414a implements a {
            C0414a() {
            }

            @Override // s9.r.a
            public boolean a(u7.q qVar) {
                return false;
            }

            @Override // s9.r.a
            public int b(u7.q qVar) {
                return 1;
            }

            @Override // s9.r.a
            public r c(u7.q qVar) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }
        }

        boolean a(u7.q qVar);

        int b(u7.q qVar);

        r c(u7.q qVar);
    }

    /* JADX INFO: compiled from: SubtitleParser.java */
    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final b f25344c = new b(-9223372036854775807L, false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f25345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f25346b;

        private b(long j10, boolean z10) {
            this.f25345a = j10;
            this.f25346b = z10;
        }

        public static b b() {
            return f25344c;
        }

        public static b c(long j10) {
            return new b(j10, true);
        }
    }

    default k a(byte[] bArr, int i10, int i11) {
        final com.google.common.collect.u.a aVarV = com.google.common.collect.u.v();
        b bVar = b.f25344c;
        Objects.requireNonNull(aVarV);
        b(bArr, i10, i11, bVar, new x7.l() { // from class: s9.q
            @Override // x7.l
            public final void accept(Object obj) {
                aVarV.a((e) obj);
            }
        });
        return new g(aVarV.m());
    }

    void b(byte[] bArr, int i10, int i11, b bVar, x7.l<e> lVar);

    int c();

    default void reset() {
    }
}
