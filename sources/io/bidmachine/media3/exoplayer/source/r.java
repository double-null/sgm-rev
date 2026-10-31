package io.bidmachine.media3.exoplayer.source;

import android.os.Handler;
import c8.b2;
import java.io.IOException;

/* JADX INFO: compiled from: MediaSource.java */
/* JADX INFO: loaded from: classes4.dex */
public interface r {

    /* JADX INFO: compiled from: MediaSource.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f19684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f19685b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f19686c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f19687d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f19688e;

        public b(Object obj) {
            this(obj, -1L);
        }

        public b a(Object obj) {
            return this.f19684a.equals(obj) ? this : new b(obj, this.f19685b, this.f19686c, this.f19687d, this.f19688e);
        }

        public boolean b() {
            return this.f19685b != -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f19684a.equals(bVar.f19684a) && this.f19685b == bVar.f19685b && this.f19686c == bVar.f19686c && this.f19687d == bVar.f19687d && this.f19688e == bVar.f19688e;
        }

        public int hashCode() {
            return ((((((((527 + this.f19684a.hashCode()) * 31) + this.f19685b) * 31) + this.f19686c) * 31) + ((int) this.f19687d)) * 31) + this.f19688e;
        }

        public b(Object obj, long j10) {
            this(obj, -1, -1, j10, -1);
        }

        public b(Object obj, long j10, int i10) {
            this(obj, -1, -1, j10, i10);
        }

        public b(Object obj, int i10, int i11, long j10) {
            this(obj, i10, i11, j10, -1);
        }

        private b(Object obj, int i10, int i11, long j10, int i12) {
            this.f19684a = obj;
            this.f19685b = i10;
            this.f19686c = i11;
            this.f19687d = j10;
            this.f19688e = i12;
        }
    }

    /* JADX INFO: compiled from: MediaSource.java */
    public interface c {
        void a(r rVar, u7.d0 d0Var);
    }

    q a(b bVar, r8.b bVar2, long j10);

    void b(io.bidmachine.media3.exoplayer.drm.h hVar);

    u7.s e();

    void f(c cVar);

    void g(c cVar);

    void h(c cVar, z7.o oVar, b2 b2Var);

    void i(Handler handler, io.bidmachine.media3.exoplayer.drm.h hVar);

    void j() throws IOException;

    default boolean k() {
        return true;
    }

    default u7.d0 l() {
        return null;
    }

    void n(q qVar);

    void o(c cVar);

    void p(Handler handler, s sVar);

    void q(s sVar);

    /* JADX INFO: compiled from: MediaSource.java */
    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f19683a = t.f19694b;

        a d(g8.k kVar);

        r f(u7.s sVar);

        a g(io.bidmachine.media3.exoplayer.upstream.b bVar);

        default a a(s9.r.a aVar) {
            return this;
        }

        default a b(int i10) {
            return this;
        }

        @Deprecated
        default a c(boolean z10) {
            return this;
        }

        default a e(r8.e.a aVar) {
            return this;
        }
    }

    default void m(u7.s sVar) {
    }
}
