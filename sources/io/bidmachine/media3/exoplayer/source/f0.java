package io.bidmachine.media3.exoplayer.source;

import io.bidmachine.media3.decoder.DecoderInputBuffer;
import io.bidmachine.media3.exoplayer.drm.DrmSession;
import java.io.IOException;
import java.util.Objects;
import v8.o0;

/* JADX INFO: compiled from: SampleQueue.java */
/* JADX INFO: loaded from: classes4.dex */
public class f0 implements o0 {
    private u7.q A;
    private u7.q B;
    private long C;
    private boolean E;
    private long F;
    private boolean G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f19536a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.bidmachine.media3.exoplayer.drm.i f19539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.bidmachine.media3.exoplayer.drm.h.a f19540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d f19541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private u7.q f19542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private DrmSession f19543h;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f19551p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f19552q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f19553r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f19554s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f19558w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f19561z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f19537b = new b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f19544i = 1000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long[] f19545j = new long[1000];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long[] f19546k = new long[1000];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long[] f19549n = new long[1000];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int[] f19548m = new int[1000];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int[] f19547l = new int[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private o0.a[] f19550o = new o0.a[1000];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j0<c> f19538c = new j0<>(new x7.l() { // from class: io.bidmachine.media3.exoplayer.source.e0
        @Override // x7.l
        public final void accept(Object obj) {
            f0.O((f0.c) obj);
        }
    });

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f19555t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f19556u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f19557v = Long.MIN_VALUE;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f19560y = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f19559x = true;
    private boolean D = true;

    /* JADX INFO: compiled from: SampleQueue.java */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f19563b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public o0.a f19564c;

        b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: SampleQueue.java */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u7.q f19565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final io.bidmachine.media3.exoplayer.drm.i.b f19566b;

        private c(u7.q qVar, io.bidmachine.media3.exoplayer.drm.i.b bVar) {
            this.f19565a = qVar;
            this.f19566b = bVar;
        }
    }

    /* JADX INFO: compiled from: SampleQueue.java */
    public interface d {
        void a(u7.q qVar);
    }

    protected f0(r8.b bVar, io.bidmachine.media3.exoplayer.drm.i iVar, io.bidmachine.media3.exoplayer.drm.h.a aVar) {
        this.f19539d = iVar;
        this.f19540e = aVar;
        this.f19536a = new d0(bVar);
    }

    private long E(int i10) {
        long jMax = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int iG = G(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            jMax = Math.max(jMax, this.f19549n[iG]);
            if ((this.f19548m[iG] & 1) != 0) {
                break;
            }
            iG--;
            if (iG == -1) {
                iG = this.f19544i - 1;
            }
        }
        return jMax;
    }

    private int G(int i10) {
        int i11 = this.f19553r + i10;
        int i12 = this.f19544i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    private boolean K() {
        return this.f19554s != this.f19551p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void O(c cVar) {
        cVar.f19566b.release();
    }

    private boolean P(int i10) {
        DrmSession drmSession = this.f19543h;
        return drmSession == null || drmSession.k() == 4 || ((this.f19548m[i10] & 1073741824) == 0 && this.f19543h.b());
    }

    private void R(u7.q qVar, b8.u uVar) {
        u7.q qVar2 = this.f19542g;
        boolean z10 = qVar2 == null;
        u7.l lVar = qVar2 == null ? null : qVar2.f26256s;
        this.f19542g = qVar;
        u7.l lVar2 = qVar.f26256s;
        io.bidmachine.media3.exoplayer.drm.i iVar = this.f19539d;
        uVar.f4168b = iVar != null ? qVar.c(iVar.n(qVar)) : qVar;
        uVar.f4167a = this.f19543h;
        if (this.f19539d == null) {
            return;
        }
        if (z10 || !Objects.equals(lVar, lVar2)) {
            DrmSession drmSession = this.f19543h;
            DrmSession drmSessionO = this.f19539d.o(this.f19540e, qVar);
            this.f19543h = drmSessionO;
            uVar.f4167a = drmSessionO;
            if (drmSession != null) {
                drmSession.f(this.f19540e);
            }
        }
    }

    private synchronized int S(b8.u uVar, DecoderInputBuffer decoderInputBuffer, boolean z10, boolean z11, b bVar) {
        decoderInputBuffer.f18058e = false;
        if (!K()) {
            if (!z11 && !this.f19558w) {
                u7.q qVar = this.B;
                if (qVar == null || (!z10 && qVar == this.f19542g)) {
                    return -3;
                }
                R((u7.q) x7.a.e(qVar), uVar);
                return -5;
            }
            decoderInputBuffer.o(4);
            decoderInputBuffer.f18059f = Long.MIN_VALUE;
            return -4;
        }
        u7.q qVar2 = this.f19538c.e(F()).f19565a;
        if (!z10 && qVar2 == this.f19542g) {
            int iG = G(this.f19554s);
            if (!P(iG)) {
                decoderInputBuffer.f18058e = true;
                return -3;
            }
            decoderInputBuffer.o(this.f19548m[iG]);
            if (this.f19554s == this.f19551p - 1 && (z11 || this.f19558w)) {
                decoderInputBuffer.e(536870912);
            }
            decoderInputBuffer.f18059f = this.f19549n[iG];
            bVar.f19562a = this.f19547l[iG];
            bVar.f19563b = this.f19546k[iG];
            bVar.f19564c = this.f19550o[iG];
            return -4;
        }
        R(qVar2, uVar);
        return -5;
    }

    private void X() {
        DrmSession drmSession = this.f19543h;
        if (drmSession != null) {
            drmSession.f(this.f19540e);
            this.f19543h = null;
            this.f19542g = null;
        }
    }

    private synchronized void a0() {
        this.f19554s = 0;
        this.f19536a.o();
    }

    private synchronized boolean f0(u7.q qVar) {
        this.f19560y = false;
        if (Objects.equals(qVar, this.B)) {
            return false;
        }
        if (this.f19538c.g() || !this.f19538c.f().f19565a.equals(qVar)) {
            this.B = qVar;
        } else {
            this.B = this.f19538c.f().f19565a;
        }
        boolean z10 = this.D;
        u7.q qVar2 = this.B;
        this.D = z10 & u7.w.a(qVar2.f26252o, qVar2.f26248k);
        this.E = false;
        return true;
    }

    private synchronized boolean i(long j10) {
        if (this.f19551p == 0) {
            return j10 > this.f19556u;
        }
        if (D() >= j10) {
            return false;
        }
        v(this.f19552q + k(j10));
        return true;
    }

    private synchronized void j(long j10, int i10, long j11, int i11, o0.a aVar) {
        int i12 = this.f19551p;
        if (i12 > 0) {
            int iG = G(i12 - 1);
            x7.a.a(this.f19546k[iG] + ((long) this.f19547l[iG]) <= j11);
        }
        this.f19558w = (536870912 & i10) != 0;
        this.f19557v = Math.max(this.f19557v, j10);
        int iG2 = G(this.f19551p);
        this.f19549n[iG2] = j10;
        this.f19546k[iG2] = j11;
        this.f19547l[iG2] = i11;
        this.f19548m[iG2] = i10;
        this.f19550o[iG2] = aVar;
        this.f19545j[iG2] = this.C;
        if (this.f19538c.g() || !this.f19538c.f().f19565a.equals(this.B)) {
            u7.q qVar = (u7.q) x7.a.e(this.B);
            io.bidmachine.media3.exoplayer.drm.i iVar = this.f19539d;
            this.f19538c.a(J(), new c(qVar, iVar != null ? iVar.m(this.f19540e, qVar) : io.bidmachine.media3.exoplayer.drm.i.b.f18582a));
        }
        int i13 = this.f19551p + 1;
        this.f19551p = i13;
        int i14 = this.f19544i;
        if (i13 == i14) {
            int i15 = i14 + 1000;
            long[] jArr = new long[i15];
            long[] jArr2 = new long[i15];
            long[] jArr3 = new long[i15];
            int[] iArr = new int[i15];
            int[] iArr2 = new int[i15];
            o0.a[] aVarArr = new o0.a[i15];
            int i16 = this.f19553r;
            int i17 = i14 - i16;
            System.arraycopy(this.f19546k, i16, jArr2, 0, i17);
            System.arraycopy(this.f19549n, this.f19553r, jArr3, 0, i17);
            System.arraycopy(this.f19548m, this.f19553r, iArr, 0, i17);
            System.arraycopy(this.f19547l, this.f19553r, iArr2, 0, i17);
            System.arraycopy(this.f19550o, this.f19553r, aVarArr, 0, i17);
            System.arraycopy(this.f19545j, this.f19553r, jArr, 0, i17);
            int i18 = this.f19553r;
            System.arraycopy(this.f19546k, 0, jArr2, i17, i18);
            System.arraycopy(this.f19549n, 0, jArr3, i17, i18);
            System.arraycopy(this.f19548m, 0, iArr, i17, i18);
            System.arraycopy(this.f19547l, 0, iArr2, i17, i18);
            System.arraycopy(this.f19550o, 0, aVarArr, i17, i18);
            System.arraycopy(this.f19545j, 0, jArr, i17, i18);
            this.f19546k = jArr2;
            this.f19549n = jArr3;
            this.f19548m = iArr;
            this.f19547l = iArr2;
            this.f19550o = aVarArr;
            this.f19545j = jArr;
            this.f19553r = 0;
            this.f19544i = i15;
        }
    }

    private int k(long j10) {
        int i10 = this.f19551p;
        int iG = G(i10 - 1);
        while (i10 > this.f19554s && this.f19549n[iG] >= j10) {
            i10--;
            iG--;
            if (iG == -1) {
                iG = this.f19544i - 1;
            }
        }
        return i10;
    }

    public static f0 l(r8.b bVar, io.bidmachine.media3.exoplayer.drm.i iVar, io.bidmachine.media3.exoplayer.drm.h.a aVar) {
        return new f0(bVar, (io.bidmachine.media3.exoplayer.drm.i) x7.a.e(iVar), (io.bidmachine.media3.exoplayer.drm.h.a) x7.a.e(aVar));
    }

    public static f0 m(r8.b bVar) {
        return new f0(bVar, null, null);
    }

    private synchronized long n(long j10, boolean z10, boolean z11) {
        int i10;
        int i11 = this.f19551p;
        if (i11 != 0) {
            long[] jArr = this.f19549n;
            int i12 = this.f19553r;
            if (j10 >= jArr[i12]) {
                if (z11 && (i10 = this.f19554s) != i11) {
                    i11 = i10 + 1;
                }
                int iY = y(i12, i11, j10, z10);
                if (iY == -1) {
                    return -1L;
                }
                return q(iY);
            }
        }
        return -1L;
    }

    private synchronized long o() {
        int i10 = this.f19551p;
        if (i10 == 0) {
            return -1L;
        }
        return q(i10);
    }

    private long q(int i10) {
        this.f19556u = Math.max(this.f19556u, E(i10));
        this.f19551p -= i10;
        int i11 = this.f19552q + i10;
        this.f19552q = i11;
        int i12 = this.f19553r + i10;
        this.f19553r = i12;
        int i13 = this.f19544i;
        if (i12 >= i13) {
            this.f19553r = i12 - i13;
        }
        int i14 = this.f19554s - i10;
        this.f19554s = i14;
        if (i14 < 0) {
            this.f19554s = 0;
        }
        this.f19538c.d(i11);
        if (this.f19551p != 0) {
            return this.f19546k[this.f19553r];
        }
        int i15 = this.f19553r;
        if (i15 == 0) {
            i15 = this.f19544i;
        }
        int i16 = i15 - 1;
        return this.f19546k[i16] + ((long) this.f19547l[i16]);
    }

    private long v(int i10) {
        int iJ = J() - i10;
        boolean z10 = false;
        x7.a.a(iJ >= 0 && iJ <= this.f19551p - this.f19554s);
        int i11 = this.f19551p - iJ;
        this.f19551p = i11;
        this.f19557v = Math.max(this.f19556u, E(i11));
        if (iJ == 0 && this.f19558w) {
            z10 = true;
        }
        this.f19558w = z10;
        this.f19538c.c(i10);
        int i12 = this.f19551p;
        if (i12 == 0) {
            return 0L;
        }
        int iG = G(i12 - 1);
        return this.f19546k[iG] + ((long) this.f19547l[iG]);
    }

    private int x(int i10, int i11, long j10, boolean z10) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f19549n[i10] >= j10) {
                return i12;
            }
            i10++;
            if (i10 == this.f19544i) {
                i10 = 0;
            }
        }
        if (z10) {
            return i11;
        }
        return -1;
    }

    private int y(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.f19549n[i10];
            if (j11 > j10) {
                return i12;
            }
            if (!z10 || (this.f19548m[i10] & 1) != 0) {
                if (j11 == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f19544i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public final int A() {
        return this.f19552q;
    }

    public final synchronized long B() {
        return this.f19551p == 0 ? Long.MIN_VALUE : this.f19549n[this.f19553r];
    }

    public final synchronized long C() {
        return this.f19557v;
    }

    public final synchronized long D() {
        return Math.max(this.f19556u, E(this.f19554s));
    }

    public final int F() {
        return this.f19552q + this.f19554s;
    }

    public final synchronized int H(long j10, boolean z10) {
        int iG = G(this.f19554s);
        if (K() && j10 >= this.f19549n[iG]) {
            if (j10 > this.f19557v && z10) {
                return this.f19551p - this.f19554s;
            }
            int iY = y(iG, this.f19551p - this.f19554s, j10, true);
            if (iY == -1) {
                return 0;
            }
            return iY;
        }
        return 0;
    }

    public final synchronized u7.q I() {
        return this.f19560y ? null : this.B;
    }

    public final int J() {
        return this.f19552q + this.f19551p;
    }

    protected final void L() {
        this.f19561z = true;
    }

    public final synchronized boolean M() {
        return this.f19558w;
    }

    public synchronized boolean N(boolean z10) {
        u7.q qVar;
        boolean z11 = true;
        if (K()) {
            if (this.f19538c.e(F()).f19565a != this.f19542g) {
                return true;
            }
            return P(G(this.f19554s));
        }
        if (!z10 && !this.f19558w && ((qVar = this.B) == null || qVar == this.f19542g)) {
            z11 = false;
        }
        return z11;
    }

    public void Q() throws IOException {
        DrmSession drmSession = this.f19543h;
        if (drmSession != null && drmSession.k() == 1) {
            throw ((DrmSession.DrmSessionException) x7.a.e(this.f19543h.getError()));
        }
    }

    public final synchronized long T() {
        return K() ? this.f19545j[G(this.f19554s)] : this.C;
    }

    public void U() {
        s();
        X();
    }

    public int V(b8.u uVar, DecoderInputBuffer decoderInputBuffer, int i10, boolean z10) {
        int iS = S(uVar, decoderInputBuffer, (i10 & 2) != 0, z10, this.f19537b);
        if (iS == -4 && !decoderInputBuffer.j()) {
            boolean z11 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                if (z11) {
                    this.f19536a.f(decoderInputBuffer, this.f19537b);
                } else {
                    this.f19536a.m(decoderInputBuffer, this.f19537b);
                }
            }
            if (!z11) {
                this.f19554s++;
            }
        }
        return iS;
    }

    public void W() {
        Z(true);
        X();
    }

    public final void Y() {
        Z(false);
    }

    public void Z(boolean z10) {
        this.f19536a.n();
        this.f19551p = 0;
        this.f19552q = 0;
        this.f19553r = 0;
        this.f19554s = 0;
        this.f19559x = true;
        this.f19555t = Long.MIN_VALUE;
        this.f19556u = Long.MIN_VALUE;
        this.f19557v = Long.MIN_VALUE;
        this.f19558w = false;
        this.f19538c.b();
        if (z10) {
            this.A = null;
            this.B = null;
            this.f19560y = true;
            this.D = true;
        }
    }

    @Override // v8.o0
    public final void a(u7.q qVar) {
        u7.q qVarZ = z(qVar);
        this.f19561z = false;
        this.A = qVar;
        boolean zF0 = f0(qVarZ);
        d dVar = this.f19541f;
        if (dVar == null || !zF0) {
            return;
        }
        dVar.a(qVarZ);
    }

    public final synchronized boolean b0(int i10) {
        a0();
        int i11 = this.f19552q;
        if (i10 >= i11 && i10 <= this.f19551p + i11) {
            this.f19555t = Long.MIN_VALUE;
            this.f19554s = i10 - i11;
            return true;
        }
        return false;
    }

    public final synchronized boolean c0(long j10, boolean z10) {
        a0();
        int iG = G(this.f19554s);
        if (K() && j10 >= this.f19549n[iG] && (j10 <= this.f19557v || z10)) {
            int iX = this.D ? x(iG, this.f19551p - this.f19554s, j10, z10) : y(iG, this.f19551p - this.f19554s, j10, true);
            if (iX == -1) {
                return false;
            }
            this.f19555t = j10;
            this.f19554s += iX;
            return true;
        }
        return false;
    }

    @Override // v8.o0
    public final void d(x7.a0 a0Var, int i10, int i11) {
        this.f19536a.q(a0Var, i10);
    }

    public final void d0(long j10) {
        if (this.F != j10) {
            this.F = j10;
            L();
        }
    }

    @Override // v8.o0
    public final int e(u7.h hVar, int i10, boolean z10, int i11) throws IOException {
        return this.f19536a.p(hVar, i10, z10);
    }

    public final void e0(long j10) {
        this.f19555t = j10;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0054  */
    @Override // v8.o0
    public void f(long j10, int i10, int i11, int i12, o0.a aVar) {
        int i13;
        if (this.f19561z) {
            a((u7.q) x7.a.i(this.A));
        }
        int i14 = i10 & 1;
        boolean z10 = i14 != 0;
        if (this.f19559x) {
            if (!z10) {
                return;
            } else {
                this.f19559x = false;
            }
        }
        long j11 = this.F + j10;
        if (!this.D) {
            i13 = i10;
        } else {
            if (j11 < this.f19555t) {
                return;
            }
            if (i14 == 0) {
                if (!this.E) {
                    x7.r.h("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.B);
                    this.E = true;
                }
                i13 = i10 | 1;
            } else {
                i13 = i10;
            }
        }
        if (this.G) {
            if (!z10 || !i(j11)) {
                return;
            } else {
                this.G = false;
            }
        }
        j(j11, i13, (this.f19536a.e() - ((long) i11)) - ((long) i12), i11, aVar);
    }

    public final void g0(d dVar) {
        this.f19541f = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    public final synchronized void h0(int i10) {
        boolean z10;
        if (i10 >= 0) {
            try {
                if (this.f19554s + i10 <= this.f19551p) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            z10 = false;
        }
        x7.a.a(z10);
        this.f19554s += i10;
    }

    public final void i0(long j10) {
        this.C = j10;
    }

    public final void j0() {
        this.G = true;
    }

    public synchronized long p() {
        int i10 = this.f19554s;
        if (i10 == 0) {
            return -1L;
        }
        return q(i10);
    }

    public final void r(long j10, boolean z10, boolean z11) {
        this.f19536a.b(n(j10, z10, z11));
    }

    public final void s() {
        this.f19536a.b(o());
    }

    public final void t() {
        this.f19536a.b(p());
    }

    public final void u(long j10) {
        if (this.f19551p == 0) {
            return;
        }
        x7.a.a(j10 > D());
        w(this.f19552q + k(j10));
    }

    public final void w(int i10) {
        this.f19536a.c(v(i10));
    }

    protected u7.q z(u7.q qVar) {
        return (this.F == 0 || qVar.f26257t == Long.MAX_VALUE) ? qVar : qVar.b().y0(qVar.f26257t + this.F).N();
    }
}
