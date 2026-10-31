package c8;

import android.util.SparseArray;
import io.bidmachine.media3.common.PlaybackException;
import io.bidmachine.media3.exoplayer.audio.AudioSink;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: AnalyticsListener.java */
/* JADX INFO: loaded from: classes4.dex */
public interface b {

    /* JADX INFO: compiled from: AnalyticsListener.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f4789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u7.d0 f4790b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f4791c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final io.bidmachine.media3.exoplayer.source.r.b f4792d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f4793e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final u7.d0 f4794f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f4795g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final io.bidmachine.media3.exoplayer.source.r.b f4796h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f4797i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f4798j;

        public a(long j10, u7.d0 d0Var, int i10, io.bidmachine.media3.exoplayer.source.r.b bVar, long j11, u7.d0 d0Var2, int i11, io.bidmachine.media3.exoplayer.source.r.b bVar2, long j12, long j13) {
            this.f4789a = j10;
            this.f4790b = d0Var;
            this.f4791c = i10;
            this.f4792d = bVar;
            this.f4793e = j11;
            this.f4794f = d0Var2;
            this.f4795g = i11;
            this.f4796h = bVar2;
            this.f4797i = j12;
            this.f4798j = j13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f4789a == aVar.f4789a && this.f4791c == aVar.f4791c && this.f4793e == aVar.f4793e && this.f4795g == aVar.f4795g && this.f4797i == aVar.f4797i && this.f4798j == aVar.f4798j && Objects.equals(this.f4790b, aVar.f4790b) && Objects.equals(this.f4792d, aVar.f4792d) && Objects.equals(this.f4794f, aVar.f4794f) && Objects.equals(this.f4796h, aVar.f4796h);
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.f4789a), this.f4790b, Integer.valueOf(this.f4791c), this.f4792d, Long.valueOf(this.f4793e), this.f4794f, Integer.valueOf(this.f4795g), this.f4796h, Long.valueOf(this.f4797i), Long.valueOf(this.f4798j));
        }
    }

    /* JADX INFO: renamed from: c8.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AnalyticsListener.java */
    public static final class C0096b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u7.o f4799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SparseArray<a> f4800b;

        public C0096b(u7.o oVar, SparseArray<a> sparseArray) {
            this.f4799a = oVar;
            SparseArray<a> sparseArray2 = new SparseArray<>(oVar.d());
            for (int i10 = 0; i10 < oVar.d(); i10++) {
                int iC = oVar.c(i10);
                sparseArray2.append(iC, (a) x7.a.e(sparseArray.get(iC)));
            }
            this.f4800b = sparseArray2;
        }

        public boolean a(int i10) {
            return this.f4799a.a(i10);
        }

        public int b(int i10) {
            return this.f4799a.c(i10);
        }

        public a c(int i10) {
            return (a) x7.a.e(this.f4800b.get(i10));
        }

        public int d() {
            return this.f4799a.d();
        }
    }

    default void a0(a aVar) {
    }

    @Deprecated
    default void f0(a aVar) {
    }

    default void n0(a aVar) {
    }

    @Deprecated
    default void p0(a aVar) {
    }

    default void r(a aVar) {
    }

    default void r0(a aVar) {
    }

    default void w(a aVar) {
    }

    @Deprecated
    default void A(a aVar, boolean z10) {
    }

    default void D(a aVar, int i10) {
    }

    default void E(a aVar, w7.b bVar) {
    }

    default void I(a aVar, AudioSink.a aVar2) {
    }

    default void K(a aVar, boolean z10) {
    }

    default void L(a aVar, u7.k kVar) {
    }

    default void O(a aVar, boolean z10) {
    }

    default void P(a aVar, b8.b bVar) {
    }

    default void R(a aVar, AudioSink.a aVar2) {
    }

    default void S(a aVar, b8.b bVar) {
    }

    default void V(a aVar, Exception exc) {
    }

    default void W(a aVar, Exception exc) {
    }

    default void X(a aVar, n8.j jVar) {
    }

    @Deprecated
    default void Y(a aVar, List<w7.a> list) {
    }

    default void Z(a aVar, boolean z10) {
    }

    default void a(a aVar, PlaybackException playbackException) {
    }

    default void b(a aVar, boolean z10) {
    }

    default void b0(a aVar, u7.v vVar) {
    }

    default void d(a aVar, u7.x xVar) {
    }

    default void d0(a aVar, long j10) {
    }

    default void e(a aVar, int i10) {
    }

    default void e0(a aVar, PlaybackException playbackException) {
    }

    default void g(a aVar, Exception exc) {
    }

    default void g0(a aVar, u7.l0 l0Var) {
    }

    default void h(a aVar, u7.g0 g0Var) {
    }

    default void h0(a aVar, Exception exc) {
    }

    default void j(a aVar, n8.j jVar) {
    }

    default void j0(a aVar, int i10) {
    }

    default void k0(a aVar, u7.y.b bVar) {
    }

    default void m(a aVar, int i10) {
    }

    default void o(a aVar, String str) {
    }

    default void o0(a aVar, float f10) {
    }

    default void q(a aVar, int i10) {
    }

    default void s(a aVar, b8.b bVar) {
    }

    @Deprecated
    default void s0(a aVar, int i10) {
    }

    default void t(a aVar, String str) {
    }

    default void t0(a aVar, b8.b bVar) {
    }

    default void u(u7.y yVar, C0096b c0096b) {
    }

    default void u0(a aVar, int i10) {
    }

    default void w0(a aVar, u7.u uVar) {
    }

    default void x(a aVar, u7.h0 h0Var) {
    }

    default void F(a aVar, Object obj, long j10) {
    }

    default void M(a aVar, int i10, boolean z10) {
    }

    default void Q(a aVar, u7.s sVar, int i10) {
    }

    default void T(a aVar, n8.i iVar, n8.j jVar) {
    }

    @Deprecated
    default void U(a aVar, n8.i iVar, n8.j jVar) {
    }

    default void c0(a aVar, n8.i iVar, n8.j jVar) {
    }

    default void f(a aVar, long j10, int i10) {
    }

    @Deprecated
    default void k(a aVar, boolean z10, int i10) {
    }

    default void l(a aVar, u7.q qVar, b8.c cVar) {
    }

    default void m0(a aVar, int i10, int i11) {
    }

    @Deprecated
    default void n(a aVar, String str, long j10) {
    }

    @Deprecated
    default void p(a aVar, String str, long j10) {
    }

    default void q0(a aVar, u7.q qVar, b8.c cVar) {
    }

    default void v(a aVar, int i10, long j10) {
    }

    default void y(a aVar, boolean z10, int i10) {
    }

    default void G(a aVar, String str, long j10, long j11) {
    }

    default void H(a aVar, int i10, long j10, long j11) {
    }

    default void J(a aVar, int i10, int i11, boolean z10) {
    }

    default void N(a aVar, u7.y.e eVar, u7.y.e eVar2, int i10) {
    }

    default void l0(a aVar, int i10, long j10, long j11) {
    }

    default void v0(a aVar, String str, long j10, long j11) {
    }

    default void x0(a aVar, n8.i iVar, n8.j jVar, int i10) {
    }

    @Deprecated
    default void c(a aVar, int i10, int i11, int i12, float f10) {
    }

    default void i0(a aVar, n8.i iVar, n8.j jVar, IOException iOException, boolean z10) {
    }
}
