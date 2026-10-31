package io.bidmachine.media3.exoplayer.hls.playlist;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.common.collect.y;
import i8.e;
import io.bidmachine.iab.vast.activity.IIj.KBBdKxoAiHo;
import io.bidmachine.media3.common.ParserException;
import io.bidmachine.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import io.bidmachine.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import io.bidmachine.media3.exoplayer.source.s;
import io.bidmachine.media3.exoplayer.upstream.Loader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import n8.i;
import n8.j;
import x7.l0;
import z7.g;

/* JADX INFO: compiled from: DefaultHlsPlaylistTracker.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements HlsPlaylistTracker, Loader.b<io.bidmachine.media3.exoplayer.upstream.c<i8.d>> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final HlsPlaylistTracker.a f18888p = new HlsPlaylistTracker.a() { // from class: i8.b
        @Override // io.bidmachine.media3.exoplayer.hls.playlist.HlsPlaylistTracker.a
        public final HlsPlaylistTracker a(h8.d dVar, io.bidmachine.media3.exoplayer.upstream.b bVar, e eVar, r8.e eVar2) {
            return new io.bidmachine.media3.exoplayer.hls.playlist.a(dVar, bVar, eVar, eVar2);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h8.d f18889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f18890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.bidmachine.media3.exoplayer.upstream.b f18891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap<Uri, c> f18892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CopyOnWriteArrayList<HlsPlaylistTracker.b> f18893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final double f18894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private s.a f18895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Loader f18896h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f18897i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private HlsPlaylistTracker.c f18898j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private d f18899k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Uri f18900l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private io.bidmachine.media3.exoplayer.hls.playlist.c f18901m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f18902n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f18903o;

    /* JADX INFO: compiled from: DefaultHlsPlaylistTracker.java */
    private class b implements HlsPlaylistTracker.b {
        private b() {
        }

        @Override // io.bidmachine.media3.exoplayer.hls.playlist.HlsPlaylistTracker.b
        public void a() {
            a.this.f18893e.remove(this);
        }

        @Override // io.bidmachine.media3.exoplayer.hls.playlist.HlsPlaylistTracker.b
        public boolean e(Uri uri, io.bidmachine.media3.exoplayer.upstream.b.c cVar, boolean z10) {
            c cVar2;
            if (a.this.f18901m == null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                List<d.b> list = ((d) l0.i(a.this.f18899k)).f18982e;
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    c cVar3 = (c) a.this.f18892d.get(list.get(i11).f18995a);
                    if (cVar3 != null && jElapsedRealtime < cVar3.f18912h) {
                        i10++;
                    }
                }
                io.bidmachine.media3.exoplayer.upstream.b.C0329b c0329bB = a.this.f18891c.b(new io.bidmachine.media3.exoplayer.upstream.b.a(1, 0, a.this.f18899k.f18982e.size(), i10), cVar);
                if (c0329bB != null && c0329bB.f19811a == 2 && (cVar2 = (c) a.this.f18892d.get(uri)) != null) {
                    cVar2.h(c0329bB.f19812b);
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: DefaultHlsPlaylistTracker.java */
    final class c implements Loader.b<io.bidmachine.media3.exoplayer.upstream.c<i8.d>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f18905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Loader f18906b = new Loader("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final z7.d f18907c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private io.bidmachine.media3.exoplayer.hls.playlist.c f18908d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f18909e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f18910f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f18911g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f18912h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f18913i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private IOException f18914j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f18915k;

        public c(Uri uri) {
            this.f18905a = uri;
            this.f18907c = a.this.f18889a.a(4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean h(long j10) {
            this.f18912h = SystemClock.elapsedRealtime() + j10;
            return this.f18905a.equals(a.this.f18900l) && !a.this.P();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void p(Uri uri) {
            this.f18913i = false;
            r(uri);
        }

        private void r(Uri uri) {
            io.bidmachine.media3.exoplayer.upstream.c.a<i8.d> aVarB = a.this.f18890b.b(a.this.f18899k, this.f18908d);
            g gVarA = new g.b().i(uri).b(1).a();
            a.v(a.this);
            io.bidmachine.media3.exoplayer.upstream.c cVar = new io.bidmachine.media3.exoplayer.upstream.c(this.f18907c, gVarA, 4, aVarB);
            this.f18906b.n(cVar, this, a.this.f18891c.a(cVar.f19819c));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t(final Uri uri) {
            this.f18912h = 0L;
            if (this.f18913i || this.f18906b.j() || this.f18906b.i()) {
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime >= this.f18911g) {
                r(uri);
            } else {
                this.f18913i = true;
                a.this.f18897i.postDelayed(new Runnable() { // from class: io.bidmachine.media3.exoplayer.hls.playlist.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f18917a.p(uri);
                    }
                }, this.f18911g - jElapsedRealtime);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void z(io.bidmachine.media3.exoplayer.hls.playlist.c cVar, i iVar) {
            boolean z10;
            long j10;
            io.bidmachine.media3.exoplayer.hls.playlist.c cVar2 = this.f18908d;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f18909e = jElapsedRealtime;
            io.bidmachine.media3.exoplayer.hls.playlist.c cVarJ = a.this.J(cVar2, cVar);
            this.f18908d = cVarJ;
            IOException playlistStuckException = null;
            if (cVarJ != cVar2) {
                this.f18914j = null;
                this.f18910f = jElapsedRealtime;
                a.this.W(this.f18905a, cVarJ);
            } else if (!cVarJ.f18930o) {
                long size = cVar.f18926k + ((long) cVar.f18933r.size());
                io.bidmachine.media3.exoplayer.hls.playlist.c cVar3 = this.f18908d;
                if (size < cVar3.f18926k) {
                    playlistStuckException = new HlsPlaylistTracker.PlaylistResetException(this.f18905a);
                    z10 = true;
                } else {
                    z10 = false;
                    if (jElapsedRealtime - this.f18910f > l0.t1(cVar3.f18928m) * a.this.f18894f) {
                        playlistStuckException = new HlsPlaylistTracker.PlaylistStuckException(this.f18905a);
                    }
                }
                if (playlistStuckException != null) {
                    this.f18914j = playlistStuckException;
                    a.this.R(this.f18905a, new io.bidmachine.media3.exoplayer.upstream.b.c(iVar, new j(4), playlistStuckException, 1), z10);
                }
            }
            io.bidmachine.media3.exoplayer.hls.playlist.c cVar4 = this.f18908d;
            if (cVar4.f18937v.f18979e) {
                j10 = 0;
            } else {
                j10 = cVar4 != cVar2 ? cVar4.f18928m : cVar4.f18928m / 2;
            }
            this.f18911g = (jElapsedRealtime + l0.t1(j10)) - iVar.f22784f;
            if (this.f18908d.f18930o) {
                return;
            }
            if (this.f18905a.equals(a.this.f18900l) || this.f18915k) {
                t(i());
            }
        }

        public void A() {
            this.f18906b.l();
        }

        public void B(boolean z10) {
            this.f18915k = z10;
        }

        public io.bidmachine.media3.exoplayer.hls.playlist.c j() {
            return this.f18908d;
        }

        public boolean k() {
            return this.f18915k;
        }

        public boolean l() {
            int i10;
            if (this.f18908d == null) {
                return false;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jMax = Math.max(30000L, l0.t1(this.f18908d.f18936u));
            io.bidmachine.media3.exoplayer.hls.playlist.c cVar = this.f18908d;
            return cVar.f18930o || (i10 = cVar.f18919d) == 2 || i10 == 1 || this.f18909e + jMax > jElapsedRealtime;
        }

        public void q(boolean z10) {
            t(z10 ? i() : this.f18905a);
        }

        public void u() throws IOException {
            this.f18906b.a();
            IOException iOException = this.f18914j;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // io.bidmachine.media3.exoplayer.upstream.Loader.b
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public void o(io.bidmachine.media3.exoplayer.upstream.c<i8.d> cVar, long j10, long j11, boolean z10) {
            i iVar = new i(cVar.f19817a, cVar.f19818b, cVar.e(), cVar.c(), j10, j11, cVar.a());
            a.this.f18891c.d(cVar.f19817a);
            a.this.f18895g.s(iVar, 4);
        }

        @Override // io.bidmachine.media3.exoplayer.upstream.Loader.b
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public void m(io.bidmachine.media3.exoplayer.upstream.c<i8.d> cVar, long j10, long j11) {
            i8.d dVarD = cVar.d();
            i iVar = new i(cVar.f19817a, cVar.f19818b, cVar.e(), cVar.c(), j10, j11, cVar.a());
            if (dVarD instanceof io.bidmachine.media3.exoplayer.hls.playlist.c) {
                z((io.bidmachine.media3.exoplayer.hls.playlist.c) dVarD, iVar);
                a.this.f18895g.v(iVar, 4);
            } else {
                this.f18914j = ParserException.e("Loaded playlist has unexpected type.", null);
                a.this.f18895g.z(iVar, 4, this.f18914j, true);
            }
            a.this.f18891c.d(cVar.f19817a);
        }

        @Override // io.bidmachine.media3.exoplayer.upstream.Loader.b
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public Loader.c s(io.bidmachine.media3.exoplayer.upstream.c<i8.d> cVar, long j10, long j11, IOException iOException, int i10) {
            Loader.c cVarH;
            i iVar = new i(cVar.f19817a, cVar.f19818b, cVar.e(), cVar.c(), j10, j11, cVar.a());
            boolean z10 = iOException instanceof HlsPlaylistParser.DeltaUpdateException;
            if ((cVar.e().getQueryParameter("_HLS_msn") != null) || z10) {
                int i11 = iOException instanceof HttpDataSource$InvalidResponseCodeException ? ((HttpDataSource$InvalidResponseCodeException) iOException).f18036d : Integer.MAX_VALUE;
                if (z10 || i11 == 400 || i11 == 503) {
                    this.f18911g = SystemClock.elapsedRealtime();
                    q(false);
                    ((s.a) l0.i(a.this.f18895g)).z(iVar, cVar.f19819c, iOException, true);
                    return Loader.f19788f;
                }
            }
            io.bidmachine.media3.exoplayer.upstream.b.c cVar2 = new io.bidmachine.media3.exoplayer.upstream.b.c(iVar, new j(cVar.f19819c), iOException, i10);
            if (a.this.R(this.f18905a, cVar2, false)) {
                long jC = a.this.f18891c.c(cVar2);
                cVarH = jC != -9223372036854775807L ? Loader.h(false, jC) : Loader.f19789g;
            } else {
                cVarH = Loader.f19788f;
            }
            boolean zC = true ^ cVarH.c();
            a.this.f18895g.z(iVar, cVar.f19819c, iOException, zC);
            if (zC) {
                a.this.f18891c.d(cVar.f19817a);
            }
            return cVarH;
        }

        @Override // io.bidmachine.media3.exoplayer.upstream.Loader.b
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public void n(io.bidmachine.media3.exoplayer.upstream.c<i8.d> cVar, long j10, long j11, int i10) {
            a.this.f18895g.B(i10 == 0 ? new i(cVar.f19817a, cVar.f19818b, j10) : new i(cVar.f19817a, cVar.f19818b, cVar.e(), cVar.c(), j10, j11, cVar.a()), cVar.f19819c, i10);
        }

        private Uri i() {
            io.bidmachine.media3.exoplayer.hls.playlist.c cVar = this.f18908d;
            if (cVar != null) {
                io.bidmachine.media3.exoplayer.hls.playlist.c.h hVar = cVar.f18937v;
                if (hVar.f18975a != -9223372036854775807L || hVar.f18979e) {
                    Uri.Builder builderBuildUpon = this.f18905a.buildUpon();
                    io.bidmachine.media3.exoplayer.hls.playlist.c cVar2 = this.f18908d;
                    if (cVar2.f18937v.f18979e) {
                        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(cVar2.f18926k + ((long) cVar2.f18933r.size())));
                        io.bidmachine.media3.exoplayer.hls.playlist.c cVar3 = this.f18908d;
                        if (cVar3.f18929n != -9223372036854775807L) {
                            List<io.bidmachine.media3.exoplayer.hls.playlist.c.d> list = cVar3.f18934s;
                            int size = list.size();
                            if (!list.isEmpty() && ((io.bidmachine.media3.exoplayer.hls.playlist.c.d) y.d(list)).f18958m) {
                                size--;
                            }
                            builderBuildUpon.appendQueryParameter(KBBdKxoAiHo.wXc, String.valueOf(size));
                        }
                    }
                    io.bidmachine.media3.exoplayer.hls.playlist.c.h hVar2 = this.f18908d.f18937v;
                    if (hVar2.f18975a != -9223372036854775807L) {
                        builderBuildUpon.appendQueryParameter("_HLS_skip", hVar2.f18976b ? "v2" : "YES");
                    }
                    return builderBuildUpon.build();
                }
            }
            return this.f18905a;
        }
    }

    public a(h8.d dVar, io.bidmachine.media3.exoplayer.upstream.b bVar, e eVar, r8.e eVar2) {
        this(dVar, bVar, eVar, eVar2, 3.5d);
    }

    private void H(List<Uri> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = list.get(i10);
            this.f18892d.put(uri, new c(uri));
        }
    }

    private static io.bidmachine.media3.exoplayer.hls.playlist.c.f I(io.bidmachine.media3.exoplayer.hls.playlist.c cVar, io.bidmachine.media3.exoplayer.hls.playlist.c cVar2) {
        int i10 = (int) (cVar2.f18926k - cVar.f18926k);
        List<io.bidmachine.media3.exoplayer.hls.playlist.c.f> list = cVar.f18933r;
        if (i10 < list.size()) {
            return list.get(i10);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public io.bidmachine.media3.exoplayer.hls.playlist.c J(io.bidmachine.media3.exoplayer.hls.playlist.c cVar, io.bidmachine.media3.exoplayer.hls.playlist.c cVar2) {
        if (cVar2.f(cVar)) {
            return cVar2.c(L(cVar, cVar2), K(cVar, cVar2));
        }
        return cVar2.f18930o ? cVar.d() : cVar;
    }

    private int K(io.bidmachine.media3.exoplayer.hls.playlist.c cVar, io.bidmachine.media3.exoplayer.hls.playlist.c cVar2) {
        io.bidmachine.media3.exoplayer.hls.playlist.c.f fVarI;
        if (cVar2.f18924i) {
            return cVar2.f18925j;
        }
        io.bidmachine.media3.exoplayer.hls.playlist.c cVar3 = this.f18901m;
        int i10 = cVar3 != null ? cVar3.f18925j : 0;
        return (cVar == null || (fVarI = I(cVar, cVar2)) == null) ? i10 : (cVar.f18925j + fVarI.f18967d) - cVar2.f18933r.get(0).f18967d;
    }

    private long L(io.bidmachine.media3.exoplayer.hls.playlist.c cVar, io.bidmachine.media3.exoplayer.hls.playlist.c cVar2) {
        if (cVar2.f18931p) {
            return cVar2.f18923h;
        }
        io.bidmachine.media3.exoplayer.hls.playlist.c cVar3 = this.f18901m;
        long j10 = cVar3 != null ? cVar3.f18923h : 0L;
        if (cVar == null) {
            return j10;
        }
        int size = cVar.f18933r.size();
        io.bidmachine.media3.exoplayer.hls.playlist.c.f fVarI = I(cVar, cVar2);
        if (fVarI != null) {
            return cVar.f18923h + fVarI.f18968e;
        }
        return ((long) size) == cVar2.f18926k - cVar.f18926k ? cVar.e() : j10;
    }

    private Uri M(Uri uri) {
        io.bidmachine.media3.exoplayer.hls.playlist.c.e eVar;
        io.bidmachine.media3.exoplayer.hls.playlist.c cVar = this.f18901m;
        if (cVar == null || !cVar.f18937v.f18979e || (eVar = cVar.f18935t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(eVar.f18960b));
        int i10 = eVar.f18961c;
        if (i10 != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i10));
        }
        return builderBuildUpon.build();
    }

    private boolean N(Uri uri) {
        List<d.b> list = this.f18899k.f18982e;
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (uri.equals(list.get(i10).f18995a)) {
                return true;
            }
        }
        return false;
    }

    private void O(Uri uri) {
        c cVar = this.f18892d.get(uri);
        io.bidmachine.media3.exoplayer.hls.playlist.c cVarJ = cVar.j();
        if (cVar.k()) {
            return;
        }
        cVar.B(true);
        if (cVarJ == null || cVarJ.f18930o) {
            return;
        }
        cVar.q(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean P() {
        List<d.b> list = this.f18899k.f18982e;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = (c) x7.a.e(this.f18892d.get(list.get(i10).f18995a));
            if (jElapsedRealtime > cVar.f18912h) {
                Uri uri = cVar.f18905a;
                this.f18900l = uri;
                cVar.t(M(uri));
                return true;
            }
        }
        return false;
    }

    private void Q(Uri uri) {
        if (uri.equals(this.f18900l) || !N(uri)) {
            return;
        }
        io.bidmachine.media3.exoplayer.hls.playlist.c cVar = this.f18901m;
        if (cVar == null || !cVar.f18930o) {
            this.f18900l = uri;
            c cVar2 = this.f18892d.get(uri);
            io.bidmachine.media3.exoplayer.hls.playlist.c cVar3 = cVar2.f18908d;
            if (cVar3 == null || !cVar3.f18930o) {
                cVar2.t(M(uri));
            } else {
                this.f18901m = cVar3;
                this.f18898j.d(cVar3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean R(Uri uri, io.bidmachine.media3.exoplayer.upstream.b.c cVar, boolean z10) {
        Iterator<HlsPlaylistTracker.b> it = this.f18893e.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= !it.next().e(uri, cVar, z10);
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(Uri uri, io.bidmachine.media3.exoplayer.hls.playlist.c cVar) {
        if (uri.equals(this.f18900l)) {
            if (this.f18901m == null) {
                this.f18902n = !cVar.f18930o;
                this.f18903o = cVar.f18923h;
            }
            this.f18901m = cVar;
            this.f18898j.d(cVar);
        }
        Iterator<HlsPlaylistTracker.b> it = this.f18893e.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    static /* synthetic */ r8.e v(a aVar) {
        aVar.getClass();
        return null;
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void o(io.bidmachine.media3.exoplayer.upstream.c<i8.d> cVar, long j10, long j11, boolean z10) {
        i iVar = new i(cVar.f19817a, cVar.f19818b, cVar.e(), cVar.c(), j10, j11, cVar.a());
        this.f18891c.d(cVar.f19817a);
        this.f18895g.s(iVar, 4);
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public void m(io.bidmachine.media3.exoplayer.upstream.c<i8.d> cVar, long j10, long j11) {
        i8.d dVarD = cVar.d();
        boolean z10 = dVarD instanceof io.bidmachine.media3.exoplayer.hls.playlist.c;
        d dVarE = z10 ? d.e(dVarD.f16102a) : (d) dVarD;
        this.f18899k = dVarE;
        this.f18900l = dVarE.f18982e.get(0).f18995a;
        this.f18893e.add(new b());
        H(dVarE.f18981d);
        i iVar = new i(cVar.f19817a, cVar.f19818b, cVar.e(), cVar.c(), j10, j11, cVar.a());
        c cVar2 = this.f18892d.get(this.f18900l);
        if (z10) {
            cVar2.z((io.bidmachine.media3.exoplayer.hls.playlist.c) dVarD, iVar);
        } else {
            cVar2.q(false);
        }
        this.f18891c.d(cVar.f19817a);
        this.f18895g.v(iVar, 4);
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public Loader.c s(io.bidmachine.media3.exoplayer.upstream.c<i8.d> cVar, long j10, long j11, IOException iOException, int i10) {
        i iVar = new i(cVar.f19817a, cVar.f19818b, cVar.e(), cVar.c(), j10, j11, cVar.a());
        long jC = this.f18891c.c(new io.bidmachine.media3.exoplayer.upstream.b.c(iVar, new j(cVar.f19819c), iOException, i10));
        boolean z10 = jC == -9223372036854775807L;
        this.f18895g.z(iVar, cVar.f19819c, iOException, z10);
        if (z10) {
            this.f18891c.d(cVar.f19817a);
        }
        return z10 ? Loader.f19789g : Loader.h(false, jC);
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public void n(io.bidmachine.media3.exoplayer.upstream.c<i8.d> cVar, long j10, long j11, int i10) {
        this.f18895g.B(i10 == 0 ? new i(cVar.f19817a, cVar.f19818b, j10) : new i(cVar.f19817a, cVar.f19818b, cVar.e(), cVar.c(), j10, j11, cVar.a()), cVar.f19819c, i10);
    }

    @Override // io.bidmachine.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public void a(Uri uri) {
        c cVar = this.f18892d.get(uri);
        if (cVar != null) {
            cVar.B(false);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public void b(Uri uri) throws IOException {
        this.f18892d.get(uri).u();
    }

    @Override // io.bidmachine.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public void c(HlsPlaylistTracker.b bVar) {
        x7.a.e(bVar);
        this.f18893e.add(bVar);
    }

    @Override // io.bidmachine.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public long d() {
        return this.f18903o;
    }

    @Override // io.bidmachine.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public void e(Uri uri, s.a aVar, HlsPlaylistTracker.c cVar) {
        this.f18897i = l0.A();
        this.f18895g = aVar;
        this.f18898j = cVar;
        io.bidmachine.media3.exoplayer.upstream.c cVar2 = new io.bidmachine.media3.exoplayer.upstream.c(this.f18889a.a(4), new g.b().i(uri).b(1).a(), 4, this.f18890b.a());
        x7.a.g(this.f18896h == null);
        Loader loader = new Loader("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.f18896h = loader;
        loader.n(cVar2, this, this.f18891c.a(cVar2.f19819c));
    }

    @Override // io.bidmachine.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public d f() {
        return this.f18899k;
    }

    @Override // io.bidmachine.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public void g(Uri uri) {
        this.f18892d.get(uri).q(true);
    }

    @Override // io.bidmachine.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public boolean h(Uri uri) {
        return this.f18892d.get(uri).l();
    }

    @Override // io.bidmachine.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public void i(HlsPlaylistTracker.b bVar) {
        this.f18893e.remove(bVar);
    }

    @Override // io.bidmachine.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public boolean j() {
        return this.f18902n;
    }

    @Override // io.bidmachine.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public boolean k(Uri uri, long j10) {
        c cVar = this.f18892d.get(uri);
        if (cVar != null) {
            return !cVar.h(j10);
        }
        return false;
    }

    @Override // io.bidmachine.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public void l() throws IOException {
        Loader loader = this.f18896h;
        if (loader != null) {
            loader.a();
        }
        Uri uri = this.f18900l;
        if (uri != null) {
            b(uri);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public io.bidmachine.media3.exoplayer.hls.playlist.c p(Uri uri, boolean z10) {
        io.bidmachine.media3.exoplayer.hls.playlist.c cVarJ = this.f18892d.get(uri).j();
        if (cVarJ != null && z10) {
            Q(uri);
            O(uri);
        }
        return cVarJ;
    }

    @Override // io.bidmachine.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public void stop() {
        this.f18900l = null;
        this.f18901m = null;
        this.f18899k = null;
        this.f18903o = -9223372036854775807L;
        this.f18896h.l();
        this.f18896h = null;
        Iterator<c> it = this.f18892d.values().iterator();
        while (it.hasNext()) {
            it.next().A();
        }
        this.f18897i.removeCallbacksAndMessages(null);
        this.f18897i = null;
        this.f18892d.clear();
    }

    public a(h8.d dVar, io.bidmachine.media3.exoplayer.upstream.b bVar, e eVar, r8.e eVar2, double d10) {
        this.f18889a = dVar;
        this.f18890b = eVar;
        this.f18891c = bVar;
        this.f18894f = d10;
        this.f18893e = new CopyOnWriteArrayList<>();
        this.f18892d = new HashMap<>();
        this.f18903o = -9223372036854775807L;
    }
}
