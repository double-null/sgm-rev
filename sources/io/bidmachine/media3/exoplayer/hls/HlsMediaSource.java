package io.bidmachine.media3.exoplayer.hls;

import android.os.Looper;
import io.bidmachine.analytics.internal.s.bOI.CwEo;
import io.bidmachine.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import io.bidmachine.media3.exoplayer.source.q;
import io.bidmachine.media3.exoplayer.source.t;
import java.io.IOException;
import java.util.List;
import n8.u;
import s9.r;
import u7.b0;
import u7.s;
import x7.l0;
import z7.o;

/* JADX INFO: loaded from: classes4.dex */
public final class HlsMediaSource extends io.bidmachine.media3.exoplayer.source.a implements HlsPlaylistTracker.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final h8.e f18681h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final h8.d f18682i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final n8.e f18683j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final io.bidmachine.media3.exoplayer.drm.i f18684k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final io.bidmachine.media3.exoplayer.upstream.b f18685l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f18686m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f18687n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f18688o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final HlsPlaylistTracker f18689p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final long f18690q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final long f18691r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private s.g f18692s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private o f18693t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private s f18694u;

    public static final class Factory implements t {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final /* synthetic */ int f18695s = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final h8.d f18696c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private h8.e f18697d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private r.a f18698e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f18699f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f18700g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private i8.e f18701h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private HlsPlaylistTracker.a f18702i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private n8.e f18703j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private r8.e.a f18704k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private g8.k f18705l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private io.bidmachine.media3.exoplayer.upstream.b f18706m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f18707n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f18708o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f18709p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private long f18710q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private long f18711r;

        public Factory(z7.d.a aVar) {
            this(new h8.b(aVar));
        }

        @Override // io.bidmachine.media3.exoplayer.source.r.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public HlsMediaSource f(s sVar) {
            x7.a.e(sVar.f26302b);
            if (this.f18697d == null) {
                this.f18697d = new h8.c();
            }
            r.a aVar = this.f18698e;
            if (aVar != null) {
                this.f18697d.a(aVar);
            }
            this.f18697d.c(this.f18699f);
            this.f18697d.b(this.f18700g);
            h8.e eVar = this.f18697d;
            i8.e eVar2 = this.f18701h;
            List<b0> list = sVar.f26302b.f26397d;
            i8.e cVar = !list.isEmpty() ? new i8.c(eVar2, list) : eVar2;
            r8.e.a aVar2 = this.f18704k;
            if (aVar2 != null) {
                aVar2.a(sVar);
            }
            h8.d dVar = this.f18696c;
            n8.e eVar3 = this.f18703j;
            io.bidmachine.media3.exoplayer.drm.i iVarA = this.f18705l.a(sVar);
            io.bidmachine.media3.exoplayer.upstream.b bVar = this.f18706m;
            return new HlsMediaSource(sVar, dVar, eVar, eVar3, null, iVarA, bVar, this.f18702i.a(this.f18696c, bVar, cVar, null), this.f18710q, this.f18707n, this.f18708o, this.f18709p, this.f18711r);
        }

        @Override // io.bidmachine.media3.exoplayer.source.r.a
        @Deprecated
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Factory c(boolean z10) {
            this.f18699f = z10;
            return this;
        }

        @Override // io.bidmachine.media3.exoplayer.source.r.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Factory b(int i10) {
            this.f18700g = i10;
            return this;
        }

        @Override // io.bidmachine.media3.exoplayer.source.r.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Factory e(r8.e.a aVar) {
            this.f18704k = (r8.e.a) x7.a.e(aVar);
            return this;
        }

        @Override // io.bidmachine.media3.exoplayer.source.r.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public Factory g(io.bidmachine.media3.exoplayer.upstream.b bVar) {
            this.f18706m = (io.bidmachine.media3.exoplayer.upstream.b) x7.a.f(bVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // io.bidmachine.media3.exoplayer.source.r.a
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Factory a(r.a aVar) {
            this.f18698e = aVar;
            return this;
        }

        public Factory(h8.d dVar) {
            this.f18696c = (h8.d) x7.a.e(dVar);
            this.f18705l = new io.bidmachine.media3.exoplayer.drm.g();
            this.f18701h = new i8.a();
            this.f18702i = io.bidmachine.media3.exoplayer.hls.playlist.a.f18888p;
            this.f18706m = new io.bidmachine.media3.exoplayer.upstream.a();
            this.f18703j = new n8.f();
            this.f18708o = 1;
            this.f18710q = -9223372036854775807L;
            this.f18707n = true;
            c(true);
        }

        @Override // io.bidmachine.media3.exoplayer.source.r.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public Factory d(g8.k kVar) {
            this.f18705l = (g8.k) x7.a.f(kVar, CwEo.PjtbgDmdjv);
            return this;
        }
    }

    static {
        u7.t.a("media3.exoplayer.hls");
    }

    private u C(io.bidmachine.media3.exoplayer.hls.playlist.c cVar, long j10, long j11, d dVar) {
        long jD = cVar.f18923h - this.f18689p.d();
        long j12 = cVar.f18930o ? jD + cVar.f18936u : -9223372036854775807L;
        long jG = G(cVar);
        long j13 = this.f18692s.f26376a;
        J(cVar, l0.q(j13 != -9223372036854775807L ? l0.S0(j13) : I(cVar, jG), jG, cVar.f18936u + jG));
        return new u(j10, j11, -9223372036854775807L, j12, cVar.f18936u, jD, H(cVar, jG), true, !cVar.f18930o, cVar.f18919d == 2 && cVar.f18921f, dVar, e(), this.f18692s);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    private u D(io.bidmachine.media3.exoplayer.hls.playlist.c cVar, long j10, long j11, d dVar) {
        long j12;
        if (cVar.f18920e == -9223372036854775807L || cVar.f18933r.isEmpty()) {
            j12 = 0;
        } else if (cVar.f18922g) {
            j12 = cVar.f18920e;
        } else {
            long j13 = cVar.f18920e;
            if (j13 == cVar.f18936u) {
                j12 = cVar.f18920e;
            } else {
                j12 = F(cVar.f18933r, j13).f18968e;
            }
        }
        long j14 = cVar.f18936u;
        return new u(j10, j11, -9223372036854775807L, j14, j14, 0L, j12, true, false, true, dVar, e(), null);
    }

    private static io.bidmachine.media3.exoplayer.hls.playlist.c.d E(List<io.bidmachine.media3.exoplayer.hls.playlist.c.d> list, long j10) {
        io.bidmachine.media3.exoplayer.hls.playlist.c.d dVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            io.bidmachine.media3.exoplayer.hls.playlist.c.d dVar2 = list.get(i10);
            long j11 = dVar2.f18968e;
            if (j11 > j10 || !dVar2.f18957l) {
                if (j11 > j10) {
                    break;
                }
            } else {
                dVar = dVar2;
            }
        }
        return dVar;
    }

    private static io.bidmachine.media3.exoplayer.hls.playlist.c.f F(List<io.bidmachine.media3.exoplayer.hls.playlist.c.f> list, long j10) {
        return list.get(l0.e(list, Long.valueOf(j10), true, true));
    }

    private long G(io.bidmachine.media3.exoplayer.hls.playlist.c cVar) {
        if (cVar.f18931p) {
            return l0.S0(l0.h0(this.f18690q)) - cVar.e();
        }
        return 0L;
    }

    private long H(io.bidmachine.media3.exoplayer.hls.playlist.c cVar, long j10) {
        long jS0 = cVar.f18920e;
        if (jS0 == -9223372036854775807L) {
            jS0 = (cVar.f18936u + j10) - l0.S0(this.f18692s.f26376a);
        }
        if (cVar.f18922g) {
            return jS0;
        }
        io.bidmachine.media3.exoplayer.hls.playlist.c.d dVarE = E(cVar.f18934s, jS0);
        if (dVarE != null) {
            return dVarE.f18968e;
        }
        if (cVar.f18933r.isEmpty()) {
            return 0L;
        }
        io.bidmachine.media3.exoplayer.hls.playlist.c.f fVarF = F(cVar.f18933r, jS0);
        io.bidmachine.media3.exoplayer.hls.playlist.c.d dVarE2 = E(fVarF.f18963m, jS0);
        return dVarE2 != null ? dVarE2.f18968e : fVarF.f18968e;
    }

    private static long I(io.bidmachine.media3.exoplayer.hls.playlist.c cVar, long j10) {
        long j11;
        io.bidmachine.media3.exoplayer.hls.playlist.c.h hVar = cVar.f18937v;
        long j12 = cVar.f18920e;
        if (j12 != -9223372036854775807L) {
            j11 = cVar.f18936u - j12;
        } else {
            long j13 = hVar.f18978d;
            if (j13 == -9223372036854775807L || cVar.f18929n == -9223372036854775807L) {
                long j14 = hVar.f18977c;
                j11 = j14 != -9223372036854775807L ? j14 : cVar.f18928m * 3;
            } else {
                j11 = j13;
            }
        }
        return j11 + j10;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    private void J(io.bidmachine.media3.exoplayer.hls.playlist.c cVar, long j10) {
        boolean z10;
        s.g gVar = e().f26304d;
        if (gVar.f26379d == -3.4028235E38f && gVar.f26380e == -3.4028235E38f) {
            io.bidmachine.media3.exoplayer.hls.playlist.c.h hVar = cVar.f18937v;
            if (hVar.f18977c == -9223372036854775807L && hVar.f18978d == -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        this.f18692s = new s.g.a().k(l0.t1(j10)).j(z10 ? 1.0f : this.f18692s.f26379d).h(z10 ? 1.0f : this.f18692s.f26380e).f();
    }

    @Override // io.bidmachine.media3.exoplayer.source.a
    protected void B() {
        this.f18689p.stop();
        this.f18684k.release();
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    public q a(io.bidmachine.media3.exoplayer.source.r.b bVar, r8.b bVar2, long j10) {
        io.bidmachine.media3.exoplayer.source.s.a aVarU = u(bVar);
        return new g(this.f18681h, this.f18689p, this.f18682i, this.f18693t, null, this.f18684k, s(bVar), this.f18685l, aVarU, bVar2, this.f18683j, this.f18686m, this.f18687n, this.f18688o, x(), this.f18691r);
    }

    @Override // io.bidmachine.media3.exoplayer.hls.playlist.HlsPlaylistTracker.c
    public void d(io.bidmachine.media3.exoplayer.hls.playlist.c cVar) {
        long jT1 = cVar.f18931p ? l0.t1(cVar.f18923h) : -9223372036854775807L;
        int i10 = cVar.f18919d;
        long j10 = (i10 == 2 || i10 == 1) ? jT1 : -9223372036854775807L;
        d dVar = new d((io.bidmachine.media3.exoplayer.hls.playlist.d) x7.a.e(this.f18689p.f()), cVar);
        A(this.f18689p.j() ? C(cVar, j10, jT1, dVar) : D(cVar, j10, jT1, dVar));
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    public synchronized s e() {
        return this.f18694u;
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    public void j() throws IOException {
        this.f18689p.l();
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    public synchronized void m(s sVar) {
        this.f18694u = sVar;
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    public void n(q qVar) {
        ((g) qVar).C();
    }

    @Override // io.bidmachine.media3.exoplayer.source.a
    protected void z(o oVar) {
        this.f18693t = oVar;
        this.f18684k.l((Looper) x7.a.e(Looper.myLooper()), x());
        this.f18684k.k();
        this.f18689p.e(((s.h) x7.a.e(e().f26302b)).f26394a, u(null), this);
    }

    private HlsMediaSource(s sVar, h8.d dVar, h8.e eVar, n8.e eVar2, r8.e eVar3, io.bidmachine.media3.exoplayer.drm.i iVar, io.bidmachine.media3.exoplayer.upstream.b bVar, HlsPlaylistTracker hlsPlaylistTracker, long j10, boolean z10, int i10, boolean z11, long j11) {
        this.f18694u = sVar;
        this.f18692s = sVar.f26304d;
        this.f18682i = dVar;
        this.f18681h = eVar;
        this.f18683j = eVar2;
        this.f18684k = iVar;
        this.f18685l = bVar;
        this.f18689p = hlsPlaylistTracker;
        this.f18690q = j10;
        this.f18686m = z10;
        this.f18687n = i10;
        this.f18688o = z11;
        this.f18691r = j11;
    }
}
