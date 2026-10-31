package c8;

import android.os.Looper;
import android.util.SparseArray;
import com.adjust.sdk.network.ErrorCodes;
import io.bidmachine.media3.common.PlaybackException;
import io.bidmachine.media3.exoplayer.ExoPlaybackException;
import io.bidmachine.media3.exoplayer.audio.AudioSink;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: DefaultAnalyticsCollector.java */
/* JADX INFO: loaded from: classes4.dex */
public class r1 implements c8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x7.h f4916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u7.d0.b f4917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u7.d0.c f4918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f4919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SparseArray<b.a> f4920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private x7.q<b> f4921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private u7.y f4922g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private x7.n f4923h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f4924i;

    /* JADX INFO: compiled from: DefaultAnalyticsCollector.java */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u7.d0.b f4925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.google.common.collect.u<io.bidmachine.media3.exoplayer.source.r.b> f4926b = com.google.common.collect.u.H();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.google.common.collect.v<io.bidmachine.media3.exoplayer.source.r.b, u7.d0> f4927c = com.google.common.collect.v.t();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private io.bidmachine.media3.exoplayer.source.r.b f4928d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private io.bidmachine.media3.exoplayer.source.r.b f4929e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private io.bidmachine.media3.exoplayer.source.r.b f4930f;

        public a(u7.d0.b bVar) {
            this.f4925a = bVar;
        }

        private void b(com.google.common.collect.v.a<io.bidmachine.media3.exoplayer.source.r.b, u7.d0> aVar, io.bidmachine.media3.exoplayer.source.r.b bVar, u7.d0 d0Var) {
            if (bVar == null) {
                return;
            }
            if (d0Var.b(bVar.f19684a) != -1) {
                aVar.g(bVar, d0Var);
                return;
            }
            u7.d0 d0Var2 = this.f4927c.get(bVar);
            if (d0Var2 != null) {
                aVar.g(bVar, d0Var2);
            }
        }

        private static io.bidmachine.media3.exoplayer.source.r.b c(u7.y yVar, com.google.common.collect.u<io.bidmachine.media3.exoplayer.source.r.b> uVar, io.bidmachine.media3.exoplayer.source.r.b bVar, u7.d0.b bVar2) {
            u7.d0 d0VarU = yVar.u();
            int iH = yVar.H();
            Object objM = d0VarU.q() ? null : d0VarU.m(iH);
            int iD = (yVar.b() || d0VarU.q()) ? -1 : d0VarU.f(iH, bVar2).d(x7.l0.S0(yVar.getCurrentPosition()) - bVar2.n());
            for (int i10 = 0; i10 < uVar.size(); i10++) {
                io.bidmachine.media3.exoplayer.source.r.b bVar3 = uVar.get(i10);
                if (i(bVar3, objM, yVar.b(), yVar.q(), yVar.M(), iD)) {
                    return bVar3;
                }
            }
            if (uVar.isEmpty() && bVar != null) {
                if (i(bVar, objM, yVar.b(), yVar.q(), yVar.M(), iD)) {
                    return bVar;
                }
            }
            return null;
        }

        private static boolean i(io.bidmachine.media3.exoplayer.source.r.b bVar, Object obj, boolean z10, int i10, int i11, int i12) {
            if (bVar.f19684a.equals(obj)) {
                return (z10 && bVar.f19685b == i10 && bVar.f19686c == i11) || (!z10 && bVar.f19685b == -1 && bVar.f19688e == i12);
            }
            return false;
        }

        private void m(u7.d0 d0Var) {
            com.google.common.collect.v.a<io.bidmachine.media3.exoplayer.source.r.b, u7.d0> aVarB = com.google.common.collect.v.b();
            if (this.f4926b.isEmpty()) {
                b(aVarB, this.f4929e, d0Var);
                if (!Objects.equals(this.f4930f, this.f4929e)) {
                    b(aVarB, this.f4930f, d0Var);
                }
                if (!Objects.equals(this.f4928d, this.f4929e) && !Objects.equals(this.f4928d, this.f4930f)) {
                    b(aVarB, this.f4928d, d0Var);
                }
            } else {
                for (int i10 = 0; i10 < this.f4926b.size(); i10++) {
                    b(aVarB, this.f4926b.get(i10), d0Var);
                }
                if (!this.f4926b.contains(this.f4928d)) {
                    b(aVarB, this.f4928d, d0Var);
                }
            }
            this.f4927c = aVarB.d();
        }

        public io.bidmachine.media3.exoplayer.source.r.b d() {
            return this.f4928d;
        }

        public io.bidmachine.media3.exoplayer.source.r.b e() {
            if (this.f4926b.isEmpty()) {
                return null;
            }
            return (io.bidmachine.media3.exoplayer.source.r.b) com.google.common.collect.y.d(this.f4926b);
        }

        public u7.d0 f(io.bidmachine.media3.exoplayer.source.r.b bVar) {
            return this.f4927c.get(bVar);
        }

        public io.bidmachine.media3.exoplayer.source.r.b g() {
            return this.f4929e;
        }

        public io.bidmachine.media3.exoplayer.source.r.b h() {
            return this.f4930f;
        }

        public void j(u7.y yVar) {
            this.f4928d = c(yVar, this.f4926b, this.f4929e, this.f4925a);
        }

        public void k(List<io.bidmachine.media3.exoplayer.source.r.b> list, io.bidmachine.media3.exoplayer.source.r.b bVar, u7.y yVar) {
            this.f4926b = com.google.common.collect.u.B(list);
            if (!list.isEmpty()) {
                this.f4929e = list.get(0);
                this.f4930f = (io.bidmachine.media3.exoplayer.source.r.b) x7.a.e(bVar);
            }
            if (this.f4928d == null) {
                this.f4928d = c(yVar, this.f4926b, this.f4929e, this.f4925a);
            }
            m(yVar.u());
        }

        public void l(u7.y yVar) {
            this.f4928d = c(yVar, this.f4926b, this.f4929e, this.f4925a);
            m(yVar.u());
        }
    }

    public r1(x7.h hVar) {
        this.f4916a = (x7.h) x7.a.e(hVar);
        this.f4921f = new x7.q<>(x7.l0.X(), hVar, new x7.q.b() { // from class: c8.l
            @Override // x7.q.b
            public final void a(Object obj, u7.o oVar) {
                r1.P1((b) obj, oVar);
            }
        });
        u7.d0.b bVar = new u7.d0.b();
        this.f4917b = bVar;
        this.f4918c = new u7.d0.c();
        this.f4919d = new a(bVar);
        this.f4920e = new SparseArray<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void H2(b.a aVar, int i10, u7.y.e eVar, u7.y.e eVar2, b bVar) {
        bVar.s0(aVar, i10);
        bVar.N(aVar, eVar, eVar2, i10);
    }

    private b.a I1(io.bidmachine.media3.exoplayer.source.r.b bVar) {
        x7.a.e(this.f4922g);
        u7.d0 d0VarF = bVar == null ? null : this.f4919d.f(bVar);
        if (bVar != null && d0VarF != null) {
            return J1(d0VarF, d0VarF.h(bVar.f19684a, this.f4917b).f26020c, bVar);
        }
        int iS = this.f4922g.S();
        u7.d0 d0VarU = this.f4922g.u();
        if (!(iS < d0VarU.p())) {
            d0VarU = u7.d0.f26009a;
        }
        return J1(d0VarU, iS, null);
    }

    private b.a K1() {
        return I1(this.f4919d.e());
    }

    private b.a L1(int i10, io.bidmachine.media3.exoplayer.source.r.b bVar) {
        x7.a.e(this.f4922g);
        if (bVar != null) {
            return this.f4919d.f(bVar) != null ? I1(bVar) : J1(u7.d0.f26009a, i10, bVar);
        }
        u7.d0 d0VarU = this.f4922g.u();
        if (!(i10 < d0VarU.p())) {
            d0VarU = u7.d0.f26009a;
        }
        return J1(d0VarU, i10, null);
    }

    private b.a M1() {
        return I1(this.f4919d.g());
    }

    private b.a N1() {
        return I1(this.f4919d.h());
    }

    private b.a O1(PlaybackException playbackException) {
        io.bidmachine.media3.exoplayer.source.r.b bVar;
        return (!(playbackException instanceof ExoPlaybackException) || (bVar = ((ExoPlaybackException) playbackException).f18070o) == null) ? H1() : I1(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void S1(b.a aVar, String str, long j10, long j11, b bVar) {
        bVar.n(aVar, str, j10);
        bVar.v0(aVar, str, j11, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void T2(b.a aVar, String str, long j10, long j11, b bVar) {
        bVar.p(aVar, str, j10);
        bVar.G(aVar, str, j11, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Z2(b.a aVar, u7.l0 l0Var, b bVar) {
        bVar.g0(aVar, l0Var);
        bVar.c(aVar, l0Var.f26206a, l0Var.f26207b, 0, l0Var.f26209d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c3(u7.y yVar, b bVar, u7.o oVar) {
        bVar.u(yVar, new b.C0096b(oVar, this.f4920e));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d3() {
        final b.a aVarH1 = H1();
        e3(aVarH1, 1028, new x7.q.a() { // from class: c8.j1
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).w(aVarH1);
            }
        });
        this.f4921f.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n2(b.a aVar, int i10, b bVar) {
        bVar.f0(aVar);
        bVar.j0(aVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r2(b.a aVar, boolean z10, b bVar) {
        bVar.A(aVar, z10);
        bVar.Z(aVar, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w2(b.a aVar, n8.i iVar, n8.j jVar, int i10, b bVar) {
        bVar.U(aVar, iVar, jVar);
        bVar.x0(aVar, iVar, jVar, i10);
    }

    @Override // c8.a
    public final void A(final long j10, final int i10) {
        final b.a aVarM1 = M1();
        e3(aVarM1, 1021, new x7.q.a() { // from class: c8.c0
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).f(aVarM1, j10, i10);
            }
        });
    }

    @Override // u7.y.d
    public final void B(final int i10) {
        final b.a aVarH1 = H1();
        e3(aVarH1, 6, new x7.q.a() { // from class: c8.j0
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).q(aVarH1, i10);
            }
        });
    }

    @Override // c8.a
    public void E(final u7.y yVar, Looper looper) {
        x7.a.g(this.f4922g == null || this.f4919d.f4926b.isEmpty());
        this.f4922g = (u7.y) x7.a.e(yVar);
        this.f4923h = this.f4916a.b(looper, null);
        this.f4921f = this.f4921f.e(looper, new x7.q.b() { // from class: c8.k
            @Override // x7.q.b
            public final void a(Object obj, u7.o oVar) {
                this.f4865a.c3(yVar, (b) obj, oVar);
            }
        });
    }

    @Override // u7.y.d
    public void F(final u7.g0 g0Var) {
        final b.a aVarH1 = H1();
        e3(aVarH1, 19, new x7.q.a() { // from class: c8.g1
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).h(aVarH1, g0Var);
            }
        });
    }

    @Override // u7.y.d
    public void G(final u7.h0 h0Var) {
        final b.a aVarH1 = H1();
        e3(aVarH1, 2, new x7.q.a() { // from class: c8.q1
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).x(aVarH1, h0Var);
            }
        });
    }

    @Override // u7.y.d
    public final void H(final int i10) {
        final b.a aVarN1 = N1();
        e3(aVarN1, 21, new x7.q.a() { // from class: c8.e0
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).m(aVarN1, i10);
            }
        });
    }

    protected final b.a H1() {
        return I1(this.f4919d.d());
    }

    @Override // u7.y.d
    public final void I(final int i10) {
        final b.a aVarH1 = H1();
        e3(aVarH1, 4, new x7.q.a() { // from class: c8.y
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).e(aVarH1, i10);
            }
        });
    }

    @Override // r8.d.a
    public final void J(final int i10, final long j10, final long j11) {
        final b.a aVarK1 = K1();
        e3(aVarK1, ErrorCodes.SSL_HANDSHAKE_EXCEPTION, new x7.q.a() { // from class: c8.k1
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).H(aVarK1, i10, j10, j11);
            }
        });
    }

    protected final b.a J1(u7.d0 d0Var, int i10, io.bidmachine.media3.exoplayer.source.r.b bVar) {
        long jP;
        io.bidmachine.media3.exoplayer.source.r.b bVar2 = d0Var.q() ? null : bVar;
        long jElapsedRealtime = this.f4916a.elapsedRealtime();
        boolean z10 = d0Var.equals(this.f4922g.u()) && i10 == this.f4922g.S();
        long jB = 0;
        if (bVar2 == null || !bVar2.b()) {
            if (z10) {
                jP = this.f4922g.P();
            } else if (!d0Var.q()) {
                jB = d0Var.n(i10, this.f4918c).b();
            }
            return new b.a(jElapsedRealtime, d0Var, i10, bVar2, jP, this.f4922g.u(), this.f4922g.S(), this.f4919d.d(), this.f4922g.getCurrentPosition(), this.f4922g.d());
        }
        if (z10 && this.f4922g.q() == bVar2.f19685b && this.f4922g.M() == bVar2.f19686c) {
            jB = this.f4922g.getCurrentPosition();
        }
        jP = jB;
        return new b.a(jElapsedRealtime, d0Var, i10, bVar2, jP, this.f4922g.u(), this.f4922g.S(), this.f4919d.d(), this.f4922g.getCurrentPosition(), this.f4922g.d());
    }

    @Override // io.bidmachine.media3.exoplayer.source.s
    public final void K(int i10, io.bidmachine.media3.exoplayer.source.r.b bVar, final n8.j jVar) {
        final b.a aVarL1 = L1(i10, bVar);
        e3(aVarL1, 1005, new x7.q.a() { // from class: c8.r0
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).j(aVarL1, jVar);
            }
        });
    }

    @Override // c8.a
    public final void L() {
        if (this.f4924i) {
            return;
        }
        final b.a aVarH1 = H1();
        this.f4924i = true;
        e3(aVarH1, -1, new x7.q.a() { // from class: c8.f1
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).p0(aVarH1);
            }
        });
    }

    @Override // u7.y.d
    public final void M(final boolean z10) {
        final b.a aVarH1 = H1();
        e3(aVarH1, 9, new x7.q.a() { // from class: c8.z0
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).b(aVarH1, z10);
            }
        });
    }

    @Override // u7.y.d
    public final void N(final u7.s sVar, final int i10) {
        final b.a aVarH1 = H1();
        e3(aVarH1, 1, new x7.q.a() { // from class: c8.f
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).Q(aVarH1, sVar, i10);
            }
        });
    }

    @Override // u7.y.d
    public void O(final int i10, final boolean z10) {
        final b.a aVarH1 = H1();
        e3(aVarH1, 30, new x7.q.a() { // from class: c8.h0
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).M(aVarH1, i10, z10);
            }
        });
    }

    @Override // u7.y.d
    public final void P(final PlaybackException playbackException) {
        final b.a aVarO1 = O1(playbackException);
        e3(aVarO1, 10, new x7.q.a() { // from class: c8.x
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).a(aVarO1, playbackException);
            }
        });
    }

    @Override // io.bidmachine.media3.exoplayer.source.s
    public final void R(int i10, io.bidmachine.media3.exoplayer.source.r.b bVar, final n8.i iVar, final n8.j jVar, final int i11) {
        final b.a aVarL1 = L1(i10, bVar);
        e3(aVarL1, 1000, new x7.q.a() { // from class: c8.k0
            @Override // x7.q.a
            public final void invoke(Object obj) {
                r1.w2(aVarL1, iVar, jVar, i11, (b) obj);
            }
        });
    }

    @Override // u7.y.d
    public final void S(u7.d0 d0Var, final int i10) {
        this.f4919d.l((u7.y) x7.a.e(this.f4922g));
        final b.a aVarH1 = H1();
        e3(aVarH1, 0, new x7.q.a() { // from class: c8.o1
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).u0(aVarH1, i10);
            }
        });
    }

    @Override // io.bidmachine.media3.exoplayer.source.s
    public final void T(int i10, io.bidmachine.media3.exoplayer.source.r.b bVar, final n8.i iVar, final n8.j jVar) {
        final b.a aVarL1 = L1(i10, bVar);
        e3(aVarL1, 1002, new x7.q.a() { // from class: c8.q0
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).T(aVarL1, iVar, jVar);
            }
        });
    }

    @Override // io.bidmachine.media3.exoplayer.source.s
    public final void U(int i10, io.bidmachine.media3.exoplayer.source.r.b bVar, final n8.i iVar, final n8.j jVar, final IOException iOException, final boolean z10) {
        final b.a aVarL1 = L1(i10, bVar);
        e3(aVarL1, ErrorCodes.MALFORMED_URL_EXCEPTION, new x7.q.a() { // from class: c8.s0
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).i0(aVarL1, iVar, jVar, iOException, z10);
            }
        });
    }

    @Override // u7.y.d
    public final void V(final int i10, final int i11) {
        final b.a aVarN1 = N1();
        e3(aVarN1, 24, new x7.q.a() { // from class: c8.d
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).m0(aVarN1, i10, i11);
            }
        });
    }

    @Override // u7.y.d
    public void W(final u7.u uVar) {
        final b.a aVarH1 = H1();
        e3(aVarH1, 14, new x7.q.a() { // from class: c8.s
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).w0(aVarH1, uVar);
            }
        });
    }

    @Override // u7.y.d
    public final void Y(final u7.y.e eVar, final u7.y.e eVar2, final int i10) {
        if (i10 == 1) {
            this.f4924i = false;
        }
        this.f4919d.j((u7.y) x7.a.e(this.f4922g));
        final b.a aVarH1 = H1();
        e3(aVarH1, 11, new x7.q.a() { // from class: c8.g
            @Override // x7.q.a
            public final void invoke(Object obj) {
                r1.H2(aVarH1, i10, eVar, eVar2, (b) obj);
            }
        });
    }

    @Override // io.bidmachine.media3.exoplayer.drm.h
    public final void Z(int i10, io.bidmachine.media3.exoplayer.source.r.b bVar, final int i11) {
        final b.a aVarL1 = L1(i10, bVar);
        e3(aVarL1, 1022, new x7.q.a() { // from class: c8.a1
            @Override // x7.q.a
            public final void invoke(Object obj) {
                r1.n2(aVarL1, i11, (b) obj);
            }
        });
    }

    @Override // u7.y.d
    public final void a(final boolean z10) {
        final b.a aVarN1 = N1();
        e3(aVarN1, 23, new x7.q.a() { // from class: c8.l1
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).K(aVarN1, z10);
            }
        });
    }

    @Override // u7.y.d
    public final void a0(final boolean z10) {
        final b.a aVarH1 = H1();
        e3(aVarH1, 3, new x7.q.a() { // from class: c8.i
            @Override // x7.q.a
            public final void invoke(Object obj) {
                r1.r2(aVarH1, z10, (b) obj);
            }
        });
    }

    @Override // c8.a
    public final void b(final Exception exc) {
        final b.a aVarN1 = N1();
        e3(aVarN1, 1014, new x7.q.a() { // from class: c8.b1
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).W(aVarN1, exc);
            }
        });
    }

    @Override // io.bidmachine.media3.exoplayer.drm.h
    public final void b0(int i10, io.bidmachine.media3.exoplayer.source.r.b bVar, final Exception exc) {
        final b.a aVarL1 = L1(i10, bVar);
        e3(aVarL1, 1024, new x7.q.a() { // from class: c8.i0
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).h0(aVarL1, exc);
            }
        });
    }

    @Override // u7.y.d
    public final void c(final u7.l0 l0Var) {
        final b.a aVarN1 = N1();
        e3(aVarN1, 25, new x7.q.a() { // from class: c8.f0
            @Override // x7.q.a
            public final void invoke(Object obj) {
                r1.Z2(aVarN1, l0Var, (b) obj);
            }
        });
    }

    @Override // u7.y.d
    public final void c0(final float f10) {
        final b.a aVarN1 = N1();
        e3(aVarN1, 22, new x7.q.a() { // from class: c8.v
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).o0(aVarN1, f10);
            }
        });
    }

    @Override // c8.a
    public void d(final AudioSink.a aVar) {
        final b.a aVarN1 = N1();
        e3(aVarN1, 1032, new x7.q.a() { // from class: c8.i1
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).R(aVarN1, aVar);
            }
        });
    }

    @Override // c8.a
    public final void d0(List<io.bidmachine.media3.exoplayer.source.r.b> list, io.bidmachine.media3.exoplayer.source.r.b bVar) {
        this.f4919d.k(list, bVar, (u7.y) x7.a.e(this.f4922g));
    }

    @Override // c8.a
    public void e(final AudioSink.a aVar) {
        final b.a aVarN1 = N1();
        e3(aVarN1, 1031, new x7.q.a() { // from class: c8.m1
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).I(aVarN1, aVar);
            }
        });
    }

    @Override // u7.y.d
    public void e0(final PlaybackException playbackException) {
        final b.a aVarO1 = O1(playbackException);
        e3(aVarO1, 10, new x7.q.a() { // from class: c8.w
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).e0(aVarO1, playbackException);
            }
        });
    }

    protected final void e3(b.a aVar, int i10, x7.q.a<b> aVar2) {
        this.f4920e.put(i10, aVar);
        this.f4921f.l(i10, aVar2);
    }

    @Override // c8.a
    public final void f(final String str) {
        final b.a aVarN1 = N1();
        e3(aVarN1, 1019, new x7.q.a() { // from class: c8.n1
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).o(aVarN1, str);
            }
        });
    }

    @Override // io.bidmachine.media3.exoplayer.source.s
    public final void f0(int i10, io.bidmachine.media3.exoplayer.source.r.b bVar, final n8.i iVar, final n8.j jVar) {
        final b.a aVarL1 = L1(i10, bVar);
        e3(aVarL1, 1001, new x7.q.a() { // from class: c8.x0
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).c0(aVarL1, iVar, jVar);
            }
        });
    }

    @Override // c8.a
    public final void g(final String str, final long j10, final long j11) {
        final b.a aVarN1 = N1();
        e3(aVarN1, 1016, new x7.q.a() { // from class: c8.j
            @Override // x7.q.a
            public final void invoke(Object obj) {
                r1.T2(aVarN1, str, j11, j10, (b) obj);
            }
        });
    }

    @Override // c8.a
    public void g0(final int i10, final int i11, final boolean z10) {
        final b.a aVarN1 = N1();
        e3(aVarN1, 1033, new x7.q.a() { // from class: c8.o
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).J(aVarN1, i10, i11, z10);
            }
        });
    }

    @Override // c8.a
    public final void h(final String str) {
        final b.a aVarN1 = N1();
        e3(aVarN1, 1012, new x7.q.a() { // from class: c8.r
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).t(aVarN1, str);
            }
        });
    }

    @Override // u7.y.d
    public void h0(final u7.k kVar) {
        final b.a aVarH1 = H1();
        e3(aVarH1, 29, new x7.q.a() { // from class: c8.g0
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).L(aVarH1, kVar);
            }
        });
    }

    @Override // c8.a
    public final void i(final String str, final long j10, final long j11) {
        final b.a aVarN1 = N1();
        e3(aVarN1, 1008, new x7.q.a() { // from class: c8.u0
            @Override // x7.q.a
            public final void invoke(Object obj) {
                r1.S1(aVarN1, str, j11, j10, (b) obj);
            }
        });
    }

    @Override // u7.y.d
    public void i0(final u7.y.b bVar) {
        final b.a aVarH1 = H1();
        e3(aVarH1, 13, new x7.q.a() { // from class: c8.t
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).k0(aVarH1, bVar);
            }
        });
    }

    @Override // c8.a
    public final void j(final u7.q qVar, final b8.c cVar) {
        final b.a aVarN1 = N1();
        e3(aVarN1, 1017, new x7.q.a() { // from class: c8.m0
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).q0(aVarN1, qVar, cVar);
            }
        });
    }

    @Override // u7.y.d
    public final void j0(final boolean z10, final int i10) {
        final b.a aVarH1 = H1();
        e3(aVarH1, -1, new x7.q.a() { // from class: c8.n
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).k(aVarH1, z10, i10);
            }
        });
    }

    @Override // u7.y.d
    public void k(final List<w7.a> list) {
        final b.a aVarH1 = H1();
        e3(aVarH1, 27, new x7.q.a() { // from class: c8.c
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).Y(aVarH1, list);
            }
        });
    }

    @Override // io.bidmachine.media3.exoplayer.drm.h
    public final void k0(int i10, io.bidmachine.media3.exoplayer.source.r.b bVar) {
        final b.a aVarL1 = L1(i10, bVar);
        e3(aVarL1, 1026, new x7.q.a() { // from class: c8.h1
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).r0(aVarL1);
            }
        });
    }

    @Override // c8.a
    public final void l(final long j10) {
        final b.a aVarN1 = N1();
        e3(aVarN1, 1010, new x7.q.a() { // from class: c8.l0
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).d0(aVarN1, j10);
            }
        });
    }

    @Override // io.bidmachine.media3.exoplayer.drm.h
    public final void l0(int i10, io.bidmachine.media3.exoplayer.source.r.b bVar) {
        final b.a aVarL1 = L1(i10, bVar);
        e3(aVarL1, 1027, new x7.q.a() { // from class: c8.n0
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).r(aVarL1);
            }
        });
    }

    @Override // c8.a
    public final void m(final Exception exc) {
        final b.a aVarN1 = N1();
        e3(aVarN1, 1030, new x7.q.a() { // from class: c8.p
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).g(aVarN1, exc);
            }
        });
    }

    @Override // io.bidmachine.media3.exoplayer.drm.h
    public final void m0(int i10, io.bidmachine.media3.exoplayer.source.r.b bVar) {
        final b.a aVarL1 = L1(i10, bVar);
        e3(aVarL1, 1025, new x7.q.a() { // from class: c8.c1
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).a0(aVarL1);
            }
        });
    }

    @Override // c8.a
    public final void n(final b8.b bVar) {
        final b.a aVarN1 = N1();
        e3(aVarN1, 1015, new x7.q.a() { // from class: c8.t0
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).P(aVarN1, bVar);
            }
        });
    }

    @Override // u7.y.d
    public final void n0(final boolean z10, final int i10) {
        final b.a aVarH1 = H1();
        e3(aVarH1, 5, new x7.q.a() { // from class: c8.h
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).y(aVarH1, z10, i10);
            }
        });
    }

    @Override // c8.a
    public final void o(final b8.b bVar) {
        final b.a aVarM1 = M1();
        e3(aVarM1, 1013, new x7.q.a() { // from class: c8.v0
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).t0(aVarM1, bVar);
            }
        });
    }

    @Override // io.bidmachine.media3.exoplayer.source.s
    public final void o0(int i10, io.bidmachine.media3.exoplayer.source.r.b bVar, final n8.j jVar) {
        final b.a aVarL1 = L1(i10, bVar);
        e3(aVarL1, 1004, new x7.q.a() { // from class: c8.a0
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).X(aVarL1, jVar);
            }
        });
    }

    @Override // c8.a
    public final void p(final b8.b bVar) {
        final b.a aVarN1 = N1();
        e3(aVarN1, ErrorCodes.IO_EXCEPTION, new x7.q.a() { // from class: c8.o0
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).s(aVarN1, bVar);
            }
        });
    }

    @Override // io.bidmachine.media3.exoplayer.drm.h
    public final void p0(int i10, io.bidmachine.media3.exoplayer.source.r.b bVar) {
        final b.a aVarL1 = L1(i10, bVar);
        e3(aVarL1, 1023, new x7.q.a() { // from class: c8.e1
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).n0(aVarL1);
            }
        });
    }

    @Override // c8.a
    public final void q(final int i10, final long j10) {
        final b.a aVarM1 = M1();
        e3(aVarM1, 1018, new x7.q.a() { // from class: c8.y0
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).v(aVarM1, i10, j10);
            }
        });
    }

    @Override // u7.y.d
    public void q0(final boolean z10) {
        final b.a aVarH1 = H1();
        e3(aVarH1, 7, new x7.q.a() { // from class: c8.z
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).O(aVarH1, z10);
            }
        });
    }

    @Override // c8.a
    public final void r(final u7.q qVar, final b8.c cVar) {
        final b.a aVarN1 = N1();
        e3(aVarN1, 1009, new x7.q.a() { // from class: c8.w0
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).l(aVarN1, qVar, cVar);
            }
        });
    }

    @Override // c8.a
    public void r0(b bVar) {
        x7.a.e(bVar);
        this.f4921f.c(bVar);
    }

    @Override // c8.a
    public void release() {
        ((x7.n) x7.a.i(this.f4923h)).i(new Runnable() { // from class: c8.p0
            @Override // java.lang.Runnable
            public final void run() {
                this.f4902a.d3();
            }
        });
    }

    @Override // u7.y.d
    public void s(final w7.b bVar) {
        final b.a aVarH1 = H1();
        e3(aVarH1, 27, new x7.q.a() { // from class: c8.e
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).E(aVarH1, bVar);
            }
        });
    }

    @Override // c8.a
    public final void t(final b8.b bVar) {
        final b.a aVarM1 = M1();
        e3(aVarM1, 1020, new x7.q.a() { // from class: c8.d0
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).S(aVarM1, bVar);
            }
        });
    }

    @Override // c8.a
    public final void u(final Object obj, final long j10) {
        final b.a aVarN1 = N1();
        e3(aVarN1, 26, new x7.q.a() { // from class: c8.b0
            @Override // x7.q.a
            public final void invoke(Object obj2) {
                ((b) obj2).F(aVarN1, obj, j10);
            }
        });
    }

    @Override // u7.y.d
    public final void v(final u7.v vVar) {
        final b.a aVarH1 = H1();
        e3(aVarH1, 28, new x7.q.a() { // from class: c8.m
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).b0(aVarH1, vVar);
            }
        });
    }

    @Override // u7.y.d
    public final void w(final int i10) {
        final b.a aVarH1 = H1();
        e3(aVarH1, 8, new x7.q.a() { // from class: c8.u
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).D(aVarH1, i10);
            }
        });
    }

    @Override // u7.y.d
    public final void x(final u7.x xVar) {
        final b.a aVarH1 = H1();
        e3(aVarH1, 12, new x7.q.a() { // from class: c8.p1
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).d(aVarH1, xVar);
            }
        });
    }

    @Override // c8.a
    public final void y(final Exception exc) {
        final b.a aVarN1 = N1();
        e3(aVarN1, 1029, new x7.q.a() { // from class: c8.q
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).V(aVarN1, exc);
            }
        });
    }

    @Override // c8.a
    public final void z(final int i10, final long j10, final long j11) {
        final b.a aVarN1 = N1();
        e3(aVarN1, 1011, new x7.q.a() { // from class: c8.d1
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((b) obj).l0(aVarN1, i10, j10, j11);
            }
        });
    }

    @Override // u7.y.d
    public void Q() {
    }

    @Override // u7.y.d
    public void D(boolean z10) {
    }

    @Override // u7.y.d
    public void X(int i10) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void P1(b bVar, u7.o oVar) {
    }

    @Override // u7.y.d
    public void C(u7.y yVar, u7.y.c cVar) {
    }
}
