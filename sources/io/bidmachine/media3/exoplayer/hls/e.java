package io.bidmachine.media3.exoplayer.hls;

import android.net.Uri;
import c8.b2;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.google.common.collect.u;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import o8.m;
import u7.q;
import u7.v;
import x7.a0;
import x7.g0;
import x7.i0;

/* JADX INFO: compiled from: HlsMediaChunk.java */
/* JADX INFO: loaded from: classes4.dex */
final class e extends m {
    private static final AtomicInteger N = new AtomicInteger();
    private final boolean A;
    private final boolean B;
    private final b2 C;
    private final long D;
    private h8.f E;
    private l F;
    private int G;
    private boolean H;
    private volatile boolean I;
    private boolean J;
    private u<Integer> K;
    private boolean L;
    private boolean M;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f18754k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f18755l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Uri f18756m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f18757n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f18758o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final z7.d f18759p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final z7.g f18760q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final h8.f f18761r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f18762s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f18763t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final g0 f18764u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final h8.e f18765v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final List<q> f18766w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final u7.l f18767x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final j9.h f18768y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final a0 f18769z;

    private e(h8.e eVar, z7.d dVar, z7.g gVar, q qVar, boolean z10, z7.d dVar2, z7.g gVar2, boolean z11, Uri uri, List<q> list, int i10, Object obj, long j10, long j11, long j12, int i11, boolean z12, int i12, boolean z13, boolean z14, g0 g0Var, long j13, u7.l lVar, h8.f fVar, j9.h hVar, a0 a0Var, boolean z15, b2 b2Var) {
        super(dVar, gVar, qVar, i10, obj, j10, j11, j12);
        this.A = z10;
        this.f18758o = i11;
        this.M = z12;
        this.f18755l = i12;
        this.f18760q = gVar2;
        this.f18759p = dVar2;
        this.H = gVar2 != null;
        this.B = z11;
        this.f18756m = uri;
        this.f18762s = z14;
        this.f18764u = g0Var;
        this.D = j13;
        this.f18763t = z13;
        this.f18765v = eVar;
        this.f18766w = list;
        this.f18767x = lVar;
        this.f18761r = fVar;
        this.f18768y = hVar;
        this.f18769z = a0Var;
        this.f18757n = z15;
        this.C = b2Var;
        this.K = u.H();
        this.f18754k = N.getAndIncrement();
    }

    private static z7.d h(z7.d dVar, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return dVar;
        }
        x7.a.e(bArr2);
        return new a(dVar, bArr, bArr2);
    }

    public static e i(h8.e eVar, z7.d dVar, q qVar, long j10, io.bidmachine.media3.exoplayer.hls.playlist.c cVar, c.e eVar2, Uri uri, List<q> list, int i10, Object obj, boolean z10, h8.i iVar, long j11, e eVar3, byte[] bArr, byte[] bArr2, boolean z11, b2 b2Var, r8.f.a aVar) {
        z7.d dVarH;
        z7.g gVarA;
        boolean z12;
        j9.h hVar;
        a0 a0Var;
        h8.f fVar;
        io.bidmachine.media3.exoplayer.hls.playlist.c.g gVar = eVar2.f18748a;
        z7.g gVarA2 = new z7.g.b().i(i0.f(cVar.f16102a, gVar.f18964a)).h(gVar.f18972i).g(gVar.f18973j).b(eVar2.f18751d ? 8 : 0).a();
        if (aVar != null) {
            gVarA2 = aVar.a().a(gVarA2);
        }
        z7.g gVar2 = gVarA2;
        boolean z13 = bArr != null;
        z7.d dVarH2 = h(dVar, bArr, z13 ? k((String) x7.a.e(gVar.f18971h)) : null);
        io.bidmachine.media3.exoplayer.hls.playlist.c.f fVar2 = gVar.f18965b;
        if (fVar2 != null) {
            boolean z14 = bArr2 != null;
            byte[] bArrK = z14 ? k((String) x7.a.e(fVar2.f18971h)) : null;
            boolean z15 = z14;
            gVarA = new z7.g.b().i(i0.f(cVar.f16102a, fVar2.f18964a)).h(fVar2.f18972i).g(fVar2.f18973j).a();
            if (aVar != null) {
                gVarA = aVar.e("i").a().a(gVarA);
            }
            dVarH = h(dVar, bArr2, bArrK);
            z12 = z15;
        } else {
            dVarH = null;
            gVarA = null;
            z12 = false;
        }
        long j12 = j10 + gVar.f18968e;
        long j13 = j12 + gVar.f18966c;
        int i11 = cVar.f18925j + gVar.f18967d;
        if (eVar3 != null) {
            z7.g gVar3 = eVar3.f18760q;
            boolean z16 = gVarA == gVar3 || (gVarA != null && gVar3 != null && gVarA.f29009a.equals(gVar3.f29009a) && gVarA.f29015g == eVar3.f18760q.f29015g);
            boolean z17 = uri.equals(eVar3.f18756m) && eVar3.J;
            hVar = eVar3.f18768y;
            a0Var = eVar3.f18769z;
            fVar = (z16 && z17 && !eVar3.L && eVar3.f18755l == i11) ? eVar3.E : null;
        } else {
            hVar = new j9.h();
            a0Var = new a0(10);
            fVar = null;
        }
        return new e(eVar, dVarH2, gVar2, qVar, z13, dVarH, gVarA, z12, uri, list, i10, obj, j12, j13, eVar2.f18749b, eVar2.f18750c, !eVar2.f18751d, i11, gVar.f18974k, z10, iVar.a(i11), j11, gVar.f18969f, fVar, hVar, a0Var, z11, b2Var);
    }

    private void j(z7.d dVar, z7.g gVar, boolean z10, boolean z11) throws IOException {
        z7.g gVarE;
        long position;
        long j10;
        boolean z12 = false;
        if (z10) {
            z12 = this.G != 0;
            gVarE = gVar;
        } else {
            gVarE = gVar.e(this.G);
        }
        try {
            v8.i iVarT = t(dVar, gVarE, z11);
            if (z12) {
                iVarT.k(this.G);
            }
            while (!this.I && this.E.a(iVarT)) {
                try {
                    try {
                    } catch (EOFException e10) {
                        if ((this.f23171d.f26243f & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                            throw e10;
                        }
                        this.E.d();
                        position = iVarT.getPosition();
                        j10 = gVar.f29015g;
                    }
                } catch (Throwable th) {
                    this.G = (int) (iVarT.getPosition() - gVar.f29015g);
                    throw th;
                }
            }
            position = iVarT.getPosition();
            j10 = gVar.f29015g;
            this.G = (int) (position - j10);
            z7.f.a(dVar);
        } catch (Throwable th2) {
            z7.f.a(dVar);
            throw th2;
        }
    }

    private static byte[] k(String str) {
        if (com.google.common.base.c.e(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    private static boolean o(c.e eVar, io.bidmachine.media3.exoplayer.hls.playlist.c cVar) {
        io.bidmachine.media3.exoplayer.hls.playlist.c.g gVar = eVar.f18748a;
        if (gVar instanceof io.bidmachine.media3.exoplayer.hls.playlist.c.d) {
            return ((io.bidmachine.media3.exoplayer.hls.playlist.c.d) gVar).f18957l || (eVar.f18750c == 0 && cVar.f16104c);
        }
        return cVar.f16104c;
    }

    private void q() throws IOException {
        j(this.f23176i, this.f23169b, this.A, true);
    }

    private void r() throws IOException {
        if (this.H) {
            x7.a.e(this.f18759p);
            x7.a.e(this.f18760q);
            j(this.f18759p, this.f18760q, this.B, false);
            this.G = 0;
            this.H = false;
        }
    }

    private long s(v8.q qVar) throws IOException {
        qVar.d();
        try {
            this.f18769z.S(10);
            qVar.n(this.f18769z.e(), 0, 10);
            if (this.f18769z.K() != 4801587) {
                return -9223372036854775807L;
            }
            this.f18769z.X(3);
            int iG = this.f18769z.G();
            int i10 = iG + 10;
            if (i10 > this.f18769z.b()) {
                byte[] bArrE = this.f18769z.e();
                this.f18769z.S(i10);
                System.arraycopy(bArrE, 0, this.f18769z.e(), 0, 10);
            }
            qVar.n(this.f18769z.e(), 10, iG);
            v vVarE = this.f18768y.e(this.f18769z.e(), iG);
            if (vVarE == null) {
                return -9223372036854775807L;
            }
            int iE = vVarE.e();
            for (int i11 = 0; i11 < iE; i11++) {
                v.a aVarD = vVarE.d(i11);
                if (aVarD instanceof j9.m) {
                    j9.m mVar = (j9.m) aVarD;
                    if ("com.apple.streaming.transportStreamTimestamp".equals(mVar.f20734b)) {
                        System.arraycopy(mVar.f20735c, 0, this.f18769z.e(), 0, 8);
                        this.f18769z.W(0);
                        this.f18769z.V(8);
                        return this.f18769z.A() & 8589934591L;
                    }
                }
            }
            return -9223372036854775807L;
        } catch (EOFException unused) {
        }
    }

    private v8.i t(z7.d dVar, z7.g gVar, boolean z10) throws IOException {
        long jI = dVar.i(gVar);
        if (z10) {
            try {
                this.f18764u.j(this.f18762s, this.f23174g, this.D);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e10) {
                throw new IOException(e10);
            }
        }
        v8.i iVar = new v8.i(dVar, gVar.f29015g, jI);
        if (this.E == null) {
            long jS = s(iVar);
            iVar.d();
            h8.f fVar = this.f18761r;
            h8.f fVarG = fVar != null ? fVar.g() : this.f18765v.e(gVar.f29009a, this.f23171d, this.f18766w, this.f18764u, dVar.c(), iVar, this.C);
            this.E = fVarG;
            if (fVarG.f()) {
                this.F.q0(jS != -9223372036854775807L ? this.f18764u.b(jS) : this.f23174g);
            } else {
                this.F.q0(0L);
            }
            this.F.c0();
            this.E.c(this.F);
        }
        this.F.n0(this.f18767x);
        return iVar;
    }

    public static boolean v(e eVar, Uri uri, io.bidmachine.media3.exoplayer.hls.playlist.c cVar, c.e eVar2, long j10) {
        if (eVar == null) {
            return false;
        }
        if (uri.equals(eVar.f18756m) && eVar.J) {
            return false;
        }
        return !o(eVar2, cVar) || j10 + eVar2.f18748a.f18968e < eVar.f23175h;
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.e
    public void b() {
        this.I = true;
    }

    @Override // o8.m
    public boolean g() {
        return this.J;
    }

    public int l(int i10) {
        x7.a.g(!this.f18757n);
        if (i10 >= this.K.size()) {
            return 0;
        }
        return this.K.get(i10).intValue();
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.e
    public void load() throws IOException {
        h8.f fVar;
        x7.a.e(this.F);
        if (this.E == null && (fVar = this.f18761r) != null && fVar.e()) {
            this.E = this.f18761r;
            this.H = false;
        }
        r();
        if (this.I) {
            return;
        }
        if (!this.f18763t) {
            q();
        }
        this.J = !this.I;
    }

    public void m(l lVar, u<Integer> uVar) {
        this.F = lVar;
        this.K = uVar;
    }

    public void n() {
        this.L = true;
    }

    public boolean p() {
        return this.M;
    }

    public void u() {
        this.M = true;
    }
}
