package io.bidmachine.media3.exoplayer.hls;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import b8.a0;
import c8.b2;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.google.common.collect.u;
import com.google.common.collect.y;
import io.bidmachine.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import io.bidmachine.media3.exoplayer.k1;
import io.bidmachine.media3.exoplayer.source.BehindLiveWindowException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import o8.m;
import o8.n;
import u7.e0;
import u7.q;
import x7.i0;
import x7.l0;
import z7.o;

/* JADX INFO: compiled from: HlsChunkSource.java */
/* JADX INFO: loaded from: classes4.dex */
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h8.e f18719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z7.d f18720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z7.d f18721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h8.i f18722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Uri[] f18723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final q[] f18724f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HlsPlaylistTracker f18725g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e0 f18726h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<q> f18727i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final b2 f18729k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f18730l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f18731m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private IOException f18733o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Uri f18734p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f18735q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private q8.q f18736r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f18738t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f18739u = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final io.bidmachine.media3.exoplayer.hls.b f18728j = new io.bidmachine.media3.exoplayer.hls.b(4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte[] f18732n = l0.f28141f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f18737s = -9223372036854775807L;

    /* JADX INFO: compiled from: HlsChunkSource.java */
    private static final class a extends o8.k {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private byte[] f18740l;

        public a(z7.d dVar, z7.g gVar, q qVar, int i10, Object obj, byte[] bArr) {
            super(dVar, gVar, 3, qVar, i10, obj, bArr);
        }

        @Override // o8.k
        protected void f(byte[] bArr, int i10) {
            this.f18740l = Arrays.copyOf(bArr, i10);
        }

        public byte[] i() {
            return this.f18740l;
        }
    }

    /* JADX INFO: compiled from: HlsChunkSource.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o8.e f18741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f18742b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Uri f18743c;

        public b() {
            a();
        }

        public void a() {
            this.f18741a = null;
            this.f18742b = false;
            this.f18743c = null;
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.media3.exoplayer.hls.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HlsChunkSource.java */
    static final class C0324c extends o8.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List<io.bidmachine.media3.exoplayer.hls.playlist.c.g> f18744e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f18745f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f18746g;

        public C0324c(String str, long j10, List<io.bidmachine.media3.exoplayer.hls.playlist.c.g> list) {
            super(0L, list.size() - 1);
            this.f18746g = str;
            this.f18745f = j10;
            this.f18744e = list;
        }

        @Override // o8.n
        public long a() {
            c();
            return this.f18745f + this.f18744e.get((int) d()).f18968e;
        }

        @Override // o8.n
        public long b() {
            c();
            io.bidmachine.media3.exoplayer.hls.playlist.c.g gVar = this.f18744e.get((int) d());
            return this.f18745f + gVar.f18968e + gVar.f18966c;
        }
    }

    /* JADX INFO: compiled from: HlsChunkSource.java */
    private static final class d extends q8.c {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f18747i;

        public d(e0 e0Var, int[] iArr) {
            super(e0Var, iArr);
            this.f18747i = c(e0Var.a(iArr[0]));
        }

        @Override // q8.q
        public int b() {
            return this.f18747i;
        }

        @Override // q8.q
        public Object i() {
            return null;
        }

        @Override // q8.q
        public void l(long j10, long j11, long j12, List<? extends m> list, n[] nVarArr) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (a(this.f18747i, jElapsedRealtime)) {
                for (int i10 = this.f24489b - 1; i10 >= 0; i10--) {
                    if (!a(i10, jElapsedRealtime)) {
                        this.f18747i = i10;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        @Override // q8.q
        public int t() {
            return 0;
        }
    }

    /* JADX INFO: compiled from: HlsChunkSource.java */
    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final io.bidmachine.media3.exoplayer.hls.playlist.c.g f18748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f18749b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f18750c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f18751d;

        public e(io.bidmachine.media3.exoplayer.hls.playlist.c.g gVar, long j10, int i10) {
            this.f18748a = gVar;
            this.f18749b = j10;
            this.f18750c = i10;
            this.f18751d = (gVar instanceof io.bidmachine.media3.exoplayer.hls.playlist.c.d) && ((io.bidmachine.media3.exoplayer.hls.playlist.c.d) gVar).f18958m;
        }
    }

    public c(h8.e eVar, HlsPlaylistTracker hlsPlaylistTracker, Uri[] uriArr, q[] qVarArr, h8.d dVar, o oVar, h8.i iVar, long j10, List<q> list, b2 b2Var, r8.e eVar2) {
        this.f18719a = eVar;
        this.f18725g = hlsPlaylistTracker;
        this.f18723e = uriArr;
        this.f18724f = qVarArr;
        this.f18722d = iVar;
        this.f18730l = j10;
        this.f18727i = list;
        this.f18729k = b2Var;
        z7.d dVarA = dVar.a(1);
        this.f18720b = dVarA;
        if (oVar != null) {
            dVarA.a(oVar);
        }
        this.f18721c = dVar.a(3);
        this.f18726h = new e0(qVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((qVarArr[i10].f26243f & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        this.f18736r = new d(this.f18726h, com.google.common.primitives.f.m(arrayList));
    }

    private void b() {
        this.f18725g.a(this.f18723e[this.f18736r.q()]);
    }

    private static Uri e(io.bidmachine.media3.exoplayer.hls.playlist.c cVar, io.bidmachine.media3.exoplayer.hls.playlist.c.g gVar) {
        String str;
        if (gVar == null || (str = gVar.f18970g) == null) {
            return null;
        }
        return i0.f(cVar.f16102a, str);
    }

    private Pair<Long, Integer> g(io.bidmachine.media3.exoplayer.hls.e eVar, boolean z10, io.bidmachine.media3.exoplayer.hls.playlist.c cVar, long j10, long j11) {
        int i10 = -1;
        if (eVar != null && !z10) {
            if (!eVar.g()) {
                return new Pair<>(Long.valueOf(eVar.f23222j), Integer.valueOf(eVar.f18758o));
            }
            Long lValueOf = Long.valueOf(eVar.f18758o == -1 ? eVar.f() : eVar.f23222j);
            int i11 = eVar.f18758o;
            return new Pair<>(lValueOf, Integer.valueOf(i11 != -1 ? i11 + 1 : -1));
        }
        long j12 = cVar.f18936u + j10;
        if (eVar != null && !this.f18735q) {
            j11 = eVar.f23174g;
        }
        if (!cVar.f18930o && j11 >= j12) {
            return new Pair<>(Long.valueOf(cVar.f18926k + ((long) cVar.f18933r.size())), -1);
        }
        long j13 = j11 - j10;
        int iE = l0.e(cVar.f18933r, Long.valueOf(j13), true, !this.f18725g.j() || eVar == null);
        long j14 = ((long) iE) + cVar.f18926k;
        if (iE >= 0) {
            io.bidmachine.media3.exoplayer.hls.playlist.c.f fVar = cVar.f18933r.get(iE);
            List<io.bidmachine.media3.exoplayer.hls.playlist.c.d> list = j13 < fVar.f18968e + fVar.f18966c ? fVar.f18963m : cVar.f18934s;
            for (int i12 = 0; i12 < list.size(); i12++) {
                io.bidmachine.media3.exoplayer.hls.playlist.c.d dVar = list.get(i12);
                if (j13 < dVar.f18968e + dVar.f18966c) {
                    if (!dVar.f18957l) {
                        break;
                    }
                    j14 += list == cVar.f18934s ? 1L : 0L;
                    i10 = i12;
                    break;
                }
            }
        }
        return new Pair<>(Long.valueOf(j14), Integer.valueOf(i10));
    }

    private static e h(io.bidmachine.media3.exoplayer.hls.playlist.c cVar, long j10, int i10) {
        int i11 = (int) (j10 - cVar.f18926k);
        if (i11 == cVar.f18933r.size()) {
            if (i10 == -1) {
                i10 = 0;
            }
            if (i10 < cVar.f18934s.size()) {
                return new e(cVar.f18934s.get(i10), j10, i10);
            }
            return null;
        }
        io.bidmachine.media3.exoplayer.hls.playlist.c.f fVar = cVar.f18933r.get(i11);
        if (i10 == -1) {
            return new e(fVar, j10, -1);
        }
        if (i10 < fVar.f18963m.size()) {
            return new e(fVar.f18963m.get(i10), j10, i10);
        }
        int i12 = i11 + 1;
        if (i12 < cVar.f18933r.size()) {
            return new e(cVar.f18933r.get(i12), j10 + 1, -1);
        }
        if (cVar.f18934s.isEmpty()) {
            return null;
        }
        return new e(cVar.f18934s.get(0), j10 + 1, 0);
    }

    static List<io.bidmachine.media3.exoplayer.hls.playlist.c.g> j(io.bidmachine.media3.exoplayer.hls.playlist.c cVar, long j10, int i10) {
        int i11 = (int) (j10 - cVar.f18926k);
        if (i11 < 0 || cVar.f18933r.size() < i11) {
            return u.H();
        }
        ArrayList arrayList = new ArrayList();
        if (i11 < cVar.f18933r.size()) {
            if (i10 != -1) {
                io.bidmachine.media3.exoplayer.hls.playlist.c.f fVar = cVar.f18933r.get(i11);
                if (i10 == 0) {
                    arrayList.add(fVar);
                } else if (i10 < fVar.f18963m.size()) {
                    List<io.bidmachine.media3.exoplayer.hls.playlist.c.d> list = fVar.f18963m;
                    arrayList.addAll(list.subList(i10, list.size()));
                }
                i11++;
            }
            List<io.bidmachine.media3.exoplayer.hls.playlist.c.f> list2 = cVar.f18933r;
            arrayList.addAll(list2.subList(i11, list2.size()));
            i10 = 0;
        }
        if (cVar.f18929n != -9223372036854775807L) {
            int i12 = i10 != -1 ? i10 : 0;
            if (i12 < cVar.f18934s.size()) {
                List<io.bidmachine.media3.exoplayer.hls.playlist.c.d> list3 = cVar.f18934s;
                arrayList.addAll(list3.subList(i12, list3.size()));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private o8.e n(Uri uri, int i10, boolean z10, r8.f.a aVar) {
        if (uri == null) {
            return null;
        }
        byte[] bArrC = this.f18728j.c(uri);
        if (bArrC != null) {
            this.f18728j.b(uri, bArrC);
            return null;
        }
        z7.g gVarA = new z7.g.b().i(uri).b(1).a();
        if (aVar != null) {
            if (z10) {
                aVar.e("i");
            }
            gVarA = aVar.a().a(gVarA);
        }
        return new a(this.f18721c, gVarA, this.f18724f[i10], this.f18736r.t(), this.f18736r.i(), this.f18732n);
    }

    private long u(long j10) {
        long j11 = this.f18737s;
        if (j11 != -9223372036854775807L) {
            return j11 - j10;
        }
        return -9223372036854775807L;
    }

    private void y(io.bidmachine.media3.exoplayer.hls.playlist.c cVar) {
        this.f18737s = cVar.f18930o ? -9223372036854775807L : cVar.e() - this.f18725g.d();
    }

    public n[] a(io.bidmachine.media3.exoplayer.hls.e eVar, long j10) {
        int i10;
        int iB = eVar == null ? -1 : this.f18726h.b(eVar.f23171d);
        int length = this.f18736r.length();
        n[] nVarArr = new n[length];
        boolean z10 = false;
        int i11 = 0;
        while (i11 < length) {
            int iF = this.f18736r.f(i11);
            Uri uri = this.f18723e[iF];
            if (this.f18725g.h(uri)) {
                io.bidmachine.media3.exoplayer.hls.playlist.c cVarP = this.f18725g.p(uri, z10);
                x7.a.e(cVarP);
                long jD = cVarP.f18923h - this.f18725g.d();
                i10 = i11;
                Pair<Long, Integer> pairG = g(eVar, iF != iB ? true : z10, cVarP, jD, j10);
                nVarArr[i10] = new C0324c(cVarP.f16102a, jD, j(cVarP, ((Long) pairG.first).longValue(), ((Integer) pairG.second).intValue()));
            } else {
                nVarArr[i11] = n.f23223a;
                i10 = i11;
            }
            i11 = i10 + 1;
            z10 = false;
        }
        return nVarArr;
    }

    public long c(long j10, a0 a0Var) {
        int iB = this.f18736r.b();
        Uri[] uriArr = this.f18723e;
        io.bidmachine.media3.exoplayer.hls.playlist.c cVarP = (iB >= uriArr.length || iB == -1) ? null : this.f18725g.p(uriArr[this.f18736r.q()], true);
        if (cVarP == null || cVarP.f18933r.isEmpty()) {
            return j10;
        }
        long jD = cVarP.f18923h - this.f18725g.d();
        long j11 = j10 - jD;
        int iE = l0.e(cVarP.f18933r, Long.valueOf(j11), true, true);
        long j12 = cVarP.f18933r.get(iE).f18968e;
        return a0Var.a(j11, j12, (!cVarP.f16104c || iE == cVarP.f18933r.size() - 1) ? j12 : cVarP.f18933r.get(iE + 1).f18968e) + jD;
    }

    public int d(io.bidmachine.media3.exoplayer.hls.e eVar) {
        if (eVar.f18758o == -1) {
            return 1;
        }
        io.bidmachine.media3.exoplayer.hls.playlist.c cVar = (io.bidmachine.media3.exoplayer.hls.playlist.c) x7.a.e(this.f18725g.p(this.f18723e[this.f18726h.b(eVar.f23171d)], false));
        int i10 = (int) (eVar.f23222j - cVar.f18926k);
        if (i10 < 0) {
            return 1;
        }
        List<io.bidmachine.media3.exoplayer.hls.playlist.c.d> list = i10 < cVar.f18933r.size() ? cVar.f18933r.get(i10).f18963m : cVar.f18934s;
        if (eVar.f18758o >= list.size()) {
            return 2;
        }
        io.bidmachine.media3.exoplayer.hls.playlist.c.d dVar = list.get(eVar.f18758o);
        if (dVar.f18958m) {
            return 0;
        }
        return Objects.equals(Uri.parse(i0.e(cVar.f16102a, dVar.f18964a)), eVar.f23169b.f29009a) ? 1 : 2;
    }

    public void f(k1 k1Var, long j10, List<io.bidmachine.media3.exoplayer.hls.e> list, boolean z10, b bVar) {
        io.bidmachine.media3.exoplayer.hls.playlist.c cVar;
        long jD;
        Uri uri;
        io.bidmachine.media3.exoplayer.hls.e eVar = list.isEmpty() ? null : (io.bidmachine.media3.exoplayer.hls.e) y.d(list);
        int iB = eVar == null ? -1 : this.f18726h.b(eVar.f23171d);
        long j11 = k1Var.f19124a;
        long jMax = j10 - j11;
        long jU = u(j11);
        if (eVar != null && !this.f18735q) {
            long jC = eVar.c();
            jMax = Math.max(0L, jMax - jC);
            if (jU != -9223372036854775807L) {
                jU = Math.max(0L, jU - jC);
            }
        }
        this.f18736r.l(j11, jMax, jU, list, a(eVar, j10));
        int iQ = this.f18736r.q();
        boolean z11 = iB != iQ;
        Uri uri2 = this.f18723e[iQ];
        if (!this.f18725g.h(uri2)) {
            bVar.f18743c = uri2;
            this.f18738t &= uri2.equals(this.f18734p);
            this.f18734p = uri2;
            return;
        }
        io.bidmachine.media3.exoplayer.hls.playlist.c cVarP = this.f18725g.p(uri2, true);
        x7.a.e(cVarP);
        this.f18735q = cVarP.f16104c;
        y(cVarP);
        long jD2 = cVarP.f18923h - this.f18725g.d();
        Pair<Long, Integer> pairG = g(eVar, z11, cVarP, jD2, j10);
        long jLongValue = ((Long) pairG.first).longValue();
        int iIntValue = ((Integer) pairG.second).intValue();
        if (jLongValue >= cVarP.f18926k || eVar == null || !z11) {
            cVar = cVarP;
            jD = jD2;
            uri = uri2;
        } else {
            uri = this.f18723e[iB];
            io.bidmachine.media3.exoplayer.hls.playlist.c cVarP2 = this.f18725g.p(uri, true);
            x7.a.e(cVarP2);
            jD = cVarP2.f18923h - this.f18725g.d();
            Pair<Long, Integer> pairG2 = g(eVar, false, cVarP2, jD, j10);
            jLongValue = ((Long) pairG2.first).longValue();
            iIntValue = ((Integer) pairG2.second).intValue();
            cVar = cVarP2;
            iQ = iB;
        }
        if (iQ != iB && iB != -1) {
            this.f18725g.a(this.f18723e[iB]);
        }
        if (jLongValue < cVar.f18926k) {
            this.f18733o = new BehindLiveWindowException();
            return;
        }
        e eVarH = h(cVar, jLongValue, iIntValue);
        if (eVarH == null) {
            if (!cVar.f18930o) {
                bVar.f18743c = uri;
                this.f18738t &= uri.equals(this.f18734p);
                this.f18734p = uri;
                return;
            } else {
                if (z10 || cVar.f18933r.isEmpty()) {
                    bVar.f18742b = true;
                    return;
                }
                eVarH = new e((io.bidmachine.media3.exoplayer.hls.playlist.c.g) y.d(cVar.f18933r), (cVar.f18926k + ((long) cVar.f18933r.size())) - 1, -1);
            }
        }
        this.f18738t = false;
        this.f18734p = null;
        this.f18739u = SystemClock.elapsedRealtime();
        Uri uriE = e(cVar, eVarH.f18748a.f18965b);
        o8.e eVarN = n(uriE, iQ, true, null);
        bVar.f18741a = eVarN;
        if (eVarN != null) {
            return;
        }
        Uri uriE2 = e(cVar, eVarH.f18748a);
        o8.e eVarN2 = n(uriE2, iQ, false, null);
        bVar.f18741a = eVarN2;
        if (eVarN2 != null) {
            return;
        }
        boolean zV = io.bidmachine.media3.exoplayer.hls.e.v(eVar, uri, cVar, eVarH, jD);
        if (zV && eVarH.f18751d) {
            return;
        }
        bVar.f18741a = io.bidmachine.media3.exoplayer.hls.e.i(this.f18719a, this.f18720b, this.f18724f[iQ], jD, cVar, eVarH, uri, this.f18727i, this.f18736r.t(), this.f18736r.i(), this.f18731m, this.f18722d, this.f18730l, eVar, this.f18728j.a(uriE2), this.f18728j.a(uriE), zV, this.f18729k, null);
    }

    public int i(long j10, List<? extends m> list) {
        return (this.f18733o != null || this.f18736r.length() < 2) ? list.size() : this.f18736r.p(j10, list);
    }

    public e0 k() {
        return this.f18726h;
    }

    public q8.q l() {
        return this.f18736r;
    }

    public boolean m() {
        return this.f18735q;
    }

    public boolean o(o8.e eVar, long j10) {
        q8.q qVar = this.f18736r;
        return qVar.g(qVar.k(this.f18726h.b(eVar.f23171d)), j10);
    }

    public void p() throws IOException {
        IOException iOException = this.f18733o;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = this.f18734p;
        if (uri == null || !this.f18738t) {
            return;
        }
        this.f18725g.b(uri);
    }

    public boolean q(Uri uri) {
        return l0.s(this.f18723e, uri);
    }

    public void r(o8.e eVar) {
        if (eVar instanceof a) {
            a aVar = (a) eVar;
            this.f18732n = aVar.g();
            this.f18728j.b(aVar.f23169b.f29009a, (byte[]) x7.a.e(aVar.i()));
        }
    }

    public boolean s(Uri uri, long j10) {
        int iK;
        int i10 = 0;
        while (true) {
            Uri[] uriArr = this.f18723e;
            if (i10 >= uriArr.length) {
                i10 = -1;
                break;
            }
            if (uriArr[i10].equals(uri)) {
                break;
            }
            i10++;
        }
        if (i10 == -1 || (iK = this.f18736r.k(i10)) == -1) {
            return true;
        }
        this.f18738t |= uri.equals(this.f18734p);
        return j10 == -9223372036854775807L || (this.f18736r.g(iK, j10) && this.f18725g.k(uri, j10));
    }

    public void t() {
        b();
        this.f18733o = null;
    }

    public void v(boolean z10) {
        this.f18731m = z10;
    }

    public void w(q8.q qVar) {
        b();
        this.f18736r = qVar;
    }

    public boolean x(long j10, o8.e eVar, List<? extends m> list) {
        if (this.f18733o != null) {
            return false;
        }
        return this.f18736r.r(j10, eVar, list);
    }
}
