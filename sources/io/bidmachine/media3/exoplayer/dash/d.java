package io.bidmachine.media3.exoplayer.dash;

import android.os.SystemClock;
import android.util.Pair;
import b8.a0;
import c8.b2;
import com.google.common.collect.v;
import f8.i;
import f8.j;
import io.bidmachine.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import io.bidmachine.media3.exoplayer.k1;
import io.bidmachine.media3.exoplayer.source.BehindLiveWindowException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import o8.g;
import o8.l;
import o8.m;
import o8.n;
import q8.q;
import r8.k;
import s9.r;
import u7.w;
import x7.i0;
import x7.l0;
import z7.o;

/* JADX INFO: compiled from: DefaultDashChunkSource.java */
/* JADX INFO: loaded from: classes4.dex */
public class d implements io.bidmachine.media3.exoplayer.dash.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f18432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e8.b f18433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f18434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f18435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final z7.d f18436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f18437f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f18438g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f.c f18439h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final b[] f18440i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private q f18441j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private f8.c f18442k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f18443l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private IOException f18444m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f18445n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f18446o = -9223372036854775807L;

    /* JADX INFO: compiled from: DefaultDashChunkSource.java */
    public static final class a implements io.bidmachine.media3.exoplayer.dash.a.InterfaceC0322a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final z7.d.a f18447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f18448b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final o8.f.a f18449c;

        public a(z7.d.a aVar) {
            this(aVar, 1);
        }

        @Override // io.bidmachine.media3.exoplayer.dash.a.InterfaceC0322a
        public u7.q d(u7.q qVar) {
            return this.f18449c.d(qVar);
        }

        @Override // io.bidmachine.media3.exoplayer.dash.a.InterfaceC0322a
        public io.bidmachine.media3.exoplayer.dash.a e(k kVar, f8.c cVar, e8.b bVar, int i10, int[] iArr, q qVar, int i11, long j10, boolean z10, List<u7.q> list, f.c cVar2, o oVar, b2 b2Var, r8.e eVar) {
            z7.d dVarA = this.f18447a.a();
            if (oVar != null) {
                dVarA.a(oVar);
            }
            return new d(this.f18449c, kVar, cVar, bVar, i10, iArr, qVar, i11, dVarA, j10, this.f18448b, z10, list, cVar2, b2Var, eVar);
        }

        @Override // io.bidmachine.media3.exoplayer.dash.a.InterfaceC0322a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a c(boolean z10) {
            this.f18449c.c(z10);
            return this;
        }

        @Override // io.bidmachine.media3.exoplayer.dash.a.InterfaceC0322a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a b(int i10) {
            this.f18449c.b(i10);
            return this;
        }

        @Override // io.bidmachine.media3.exoplayer.dash.a.InterfaceC0322a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a a(r.a aVar) {
            this.f18449c.a(aVar);
            return this;
        }

        public a(z7.d.a aVar, int i10) {
            this(new o8.d.b(), aVar, i10);
        }

        public a(o8.f.a aVar, z7.d.a aVar2, int i10) {
            this.f18449c = aVar;
            this.f18447a = aVar2;
            this.f18448b = i10;
        }
    }

    /* JADX INFO: compiled from: DefaultDashChunkSource.java */
    protected static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final o8.f f18450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j f18451b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f8.b f18452c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final e8.e f18453d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f18454e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f18455f;

        b(long j10, j jVar, f8.b bVar, o8.f fVar, long j11, e8.e eVar) {
            this.f18454e = j10;
            this.f18451b = jVar;
            this.f18452c = bVar;
            this.f18455f = j11;
            this.f18450a = fVar;
            this.f18453d = eVar;
        }

        b b(long j10, j jVar) throws BehindLiveWindowException {
            long jG;
            long jG2;
            e8.e eVarL = this.f18451b.l();
            e8.e eVarL2 = jVar.l();
            if (eVarL == null) {
                return new b(j10, jVar, this.f18452c, this.f18450a, this.f18455f, eVarL);
            }
            if (!eVarL.i()) {
                return new b(j10, jVar, this.f18452c, this.f18450a, this.f18455f, eVarL2);
            }
            long jH = eVarL.h(j10);
            if (jH == 0) {
                return new b(j10, jVar, this.f18452c, this.f18450a, this.f18455f, eVarL2);
            }
            x7.a.i(eVarL2);
            long j11 = eVarL.j();
            long jB = eVarL.b(j11);
            long j12 = (jH + j11) - 1;
            long jB2 = eVarL.b(j12) + eVarL.c(j12, j10);
            long j13 = eVarL2.j();
            long jB3 = eVarL2.b(j13);
            long j14 = this.f18455f;
            if (jB2 != jB3) {
                if (jB2 < jB3) {
                    throw new BehindLiveWindowException();
                }
                if (jB3 < jB) {
                    jG2 = j14 - (eVarL2.g(jB, j10) - j11);
                } else {
                    jG = eVarL.g(jB3, j10);
                }
                return new b(j10, jVar, this.f18452c, this.f18450a, jG2, eVarL2);
            }
            jG = j12 + 1;
            jG2 = j14 + (jG - j13);
            return new b(j10, jVar, this.f18452c, this.f18450a, jG2, eVarL2);
        }

        b c(e8.e eVar) {
            return new b(this.f18454e, this.f18451b, this.f18452c, this.f18450a, this.f18455f, eVar);
        }

        b d(f8.b bVar) {
            return new b(this.f18454e, this.f18451b, bVar, this.f18450a, this.f18455f, this.f18453d);
        }

        public long e(long j10) {
            return ((e8.e) x7.a.i(this.f18453d)).d(this.f18454e, j10) + this.f18455f;
        }

        public long f() {
            return ((e8.e) x7.a.i(this.f18453d)).j() + this.f18455f;
        }

        public long g(long j10) {
            return (e(j10) + ((e8.e) x7.a.i(this.f18453d)).k(this.f18454e, j10)) - 1;
        }

        public long h() {
            return ((e8.e) x7.a.i(this.f18453d)).h(this.f18454e);
        }

        public long i(long j10) {
            return k(j10) + ((e8.e) x7.a.i(this.f18453d)).c(j10 - this.f18455f, this.f18454e);
        }

        public long j(long j10) {
            return ((e8.e) x7.a.i(this.f18453d)).g(j10, this.f18454e) + this.f18455f;
        }

        public long k(long j10) {
            return ((e8.e) x7.a.i(this.f18453d)).b(j10 - this.f18455f);
        }

        public i l(long j10) {
            return ((e8.e) x7.a.i(this.f18453d)).f(j10 - this.f18455f);
        }

        public boolean m(long j10, long j11) {
            return ((e8.e) x7.a.i(this.f18453d)).i() || j11 == -9223372036854775807L || i(j10) <= j11;
        }
    }

    /* JADX INFO: compiled from: DefaultDashChunkSource.java */
    protected static final class c extends o8.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final b f18456e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f18457f;

        public c(b bVar, long j10, long j11, long j12) {
            super(j10, j11);
            this.f18456e = bVar;
            this.f18457f = j12;
        }

        @Override // o8.n
        public long a() {
            c();
            return this.f18456e.k(d());
        }

        @Override // o8.n
        public long b() {
            c();
            return this.f18456e.i(d());
        }
    }

    public d(o8.f.a aVar, k kVar, f8.c cVar, e8.b bVar, int i10, int[] iArr, q qVar, int i11, z7.d dVar, long j10, int i12, boolean z10, List<u7.q> list, f.c cVar2, b2 b2Var, r8.e eVar) {
        this.f18432a = kVar;
        this.f18442k = cVar;
        this.f18433b = bVar;
        this.f18434c = iArr;
        this.f18441j = qVar;
        this.f18435d = i11;
        this.f18436e = dVar;
        this.f18443l = i10;
        this.f18437f = j10;
        this.f18438g = i12;
        this.f18439h = cVar2;
        long jG = cVar.g(i10);
        ArrayList<j> arrayListN = n();
        this.f18440i = new b[qVar.length()];
        int i13 = 0;
        while (i13 < this.f18440i.length) {
            j jVar = arrayListN.get(qVar.f(i13));
            f8.b bVarJ = bVar.j(jVar.f14717c);
            b[] bVarArr = this.f18440i;
            if (bVarJ == null) {
                bVarJ = jVar.f14717c.get(0);
            }
            int i14 = i13;
            bVarArr[i14] = new b(jG, jVar, bVarJ, aVar.e(i11, jVar.f14716b, z10, list, cVar2, b2Var), 0L, jVar.l());
            i13 = i14 + 1;
        }
    }

    private io.bidmachine.media3.exoplayer.upstream.b.a j(q qVar, List<f8.b> list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = qVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (qVar.a(i11, jElapsedRealtime)) {
                i10++;
            }
        }
        int iF = e8.b.f(list);
        return new io.bidmachine.media3.exoplayer.upstream.b.a(iF, iF - this.f18433b.g(list), length, i10);
    }

    private long k(long j10, long j11) {
        if (!this.f18442k.f14668d || this.f18440i[0].h() == 0) {
            return -9223372036854775807L;
        }
        return Math.max(0L, Math.min(m(j10), this.f18440i[0].i(this.f18440i[0].g(j10))) - j11);
    }

    private Pair<String, String> l(long j10, i iVar, b bVar) {
        long j11 = j10 + 1;
        if (j11 >= bVar.h()) {
            return null;
        }
        i iVarL = bVar.l(j11);
        String strA = i0.a(iVar.b(bVar.f18452c.f14661a), iVarL.b(bVar.f18452c.f14661a));
        String str = iVarL.f14711a + "-";
        if (iVarL.f14712b != -1) {
            str = str + (iVarL.f14711a + iVarL.f14712b);
        }
        return new Pair<>(strA, str);
    }

    private long m(long j10) {
        f8.c cVar = this.f18442k;
        long j11 = cVar.f14665a;
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j10 - l0.S0(j11 + cVar.d(this.f18443l).f14702b);
    }

    private ArrayList<j> n() {
        List<f8.a> list = this.f18442k.d(this.f18443l).f14703c;
        ArrayList<j> arrayList = new ArrayList<>();
        for (int i10 : this.f18434c) {
            arrayList.addAll(list.get(i10).f14657c);
        }
        return arrayList;
    }

    private long o(b bVar, m mVar, long j10, long j11, long j12) {
        return mVar != null ? mVar.f() : l0.q(bVar.j(j10), j11, j12);
    }

    private b r(int i10) {
        b bVar = this.f18440i[i10];
        f8.b bVarJ = this.f18433b.j(bVar.f18451b.f14717c);
        if (bVarJ == null || bVarJ.equals(bVar.f18452c)) {
            return bVar;
        }
        b bVarD = bVar.d(bVarJ);
        this.f18440i[i10] = bVarD;
        return bVarD;
    }

    @Override // o8.i
    public void a() throws IOException {
        IOException iOException = this.f18444m;
        if (iOException != null) {
            throw iOException;
        }
        this.f18432a.a();
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0153  */
    /* JADX WARN: Code duplicated, block: B:54:0x015e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0161  */
    /* JADX WARN: Code duplicated, block: B:58:0x016b  */
    /* JADX WARN: Code duplicated, block: B:60:0x017a  */
    /* JADX WARN: Code duplicated, block: B:61:0x017c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0192  */
    /* JADX WARN: Code duplicated, block: B:67:0x019a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r13v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // o8.i
    public void b(k1 k1Var, long j10, List<? extends m> list, g gVar) {
        boolean z10;
        boolean z11;
        ?? r10;
        ?? r11;
        long jE;
        long jG;
        ?? r12;
        ?? r13;
        long jO;
        long jI;
        ?? r14;
        int i10;
        int i11;
        n[] nVarArr;
        long j11;
        long j12;
        if (this.f18444m != null) {
            return;
        }
        long j13 = k1Var.f19124a;
        long j14 = j10 - j13;
        long jS0 = l0.S0(this.f18442k.f14665a) + l0.S0(this.f18442k.d(this.f18443l).f14702b) + j10;
        f.c cVar = this.f18439h;
        if (cVar == null || !cVar.i(jS0)) {
            long jS1 = l0.S0(l0.h0(this.f18437f));
            long jM = m(jS1);
            m mVar = list.isEmpty() ? null : list.get(list.size() - 1);
            int length = this.f18441j.length();
            n[] nVarArr2 = new n[length];
            int i12 = 0;
            while (i12 < length) {
                b bVar = this.f18440i[i12];
                if (bVar.f18453d == null) {
                    nVarArr2[i12] = n.f23223a;
                    i10 = i12;
                    i11 = length;
                    nVarArr = nVarArr2;
                    j11 = j14;
                    j12 = jS1;
                } else {
                    long jE2 = bVar.e(jS1);
                    long jG2 = bVar.g(jS1);
                    i10 = i12;
                    i11 = length;
                    nVarArr = nVarArr2;
                    j11 = j14;
                    j12 = jS1;
                    long jO2 = o(bVar, mVar, j10, jE2, jG2);
                    if (jO2 < jE2) {
                        nVarArr[i10] = n.f23223a;
                    } else {
                        nVarArr[i10] = new c(r(i10), jO2, jG2, jM);
                    }
                }
                i12 = i10 + 1;
                jS1 = j12;
                nVarArr2 = nVarArr;
                length = i11;
                j14 = j11;
            }
            long j15 = j14;
            long j16 = jS1;
            this.f18441j.l(j13, j15, k(j16, j13), list, nVarArr2);
            int iB = this.f18441j.b();
            this.f18446o = SystemClock.elapsedRealtime();
            b bVarR = r(iB);
            o8.f fVar = bVarR.f18450a;
            if (fVar != null) {
                j jVar = bVarR.f18451b;
                i iVarN = fVar.c() == null ? jVar.n() : null;
                i iVarM = bVarR.f18453d == null ? jVar.m() : null;
                if (iVarN != null || iVarM != null) {
                    gVar.f23177a = p(bVarR, this.f18436e, this.f18441j.s(), this.f18441j.t(), this.f18441j.i(), iVarN, iVarM, null);
                    return;
                }
            }
            long j17 = bVarR.f18454e;
            f8.c cVar2 = this.f18442k;
            if (cVar2.f14668d) {
                z10 = true;
                r10 = 1;
                if (this.f18443l == cVar2.e() - 1) {
                    z11 = true;
                }
                if (z11 || j17 != -9223372036854775807L) {
                    r11 = r10;
                } else {
                    r11 = 0;
                }
                if (bVarR.h() == 0) {
                    gVar.f23178b = r11;
                    return;
                }
                jE = bVarR.e(j16);
                jG = bVarR.g(j16);
                if (z11) {
                    jI = bVarR.i(jG);
                    if (jI + (jI - bVarR.k(jG)) >= j17) {
                        r12 = r11;
                        r14 = r10;
                    } else {
                        r12 = r11;
                        r14 = 0;
                    }
                    r12 = (r11 == true ? 1 : 0) & r14;
                }
                r12 = r11;
                r13 = r12;
                jO = o(bVarR, mVar, j10, jE, jG);
                if (jO < jE) {
                    this.f18444m = new BehindLiveWindowException();
                }
                if (jO <= jG || (this.f18445n && jO >= jG)) {
                    gVar.f23178b = r13;
                }
                if (r13 != 0 && bVarR.k(jO) >= j17) {
                    gVar.f23178b = r10;
                    return;
                }
                int iMin = (int) Math.min(this.f18438g, (jG - jO) + 1);
                if (j17 != -9223372036854775807L) {
                    while (iMin > r10 && bVarR.k((((long) iMin) + jO) - 1) >= j17) {
                        iMin--;
                    }
                }
                gVar.f23177a = q(bVarR, this.f18436e, this.f18435d, this.f18441j.s(), this.f18441j.t(), this.f18441j.i(), jO, iMin, list.isEmpty() ? j10 : -9223372036854775807L, jM, null);
                return;
            }
            z10 = true;
            z11 = false;
            r10 = z10;
            if (z11) {
                r11 = r10;
            } else {
                r11 = r10;
            }
            if (bVarR.h() == 0) {
                gVar.f23178b = r11;
                return;
            }
            jE = bVarR.e(j16);
            jG = bVarR.g(j16);
            if (z11) {
                jI = bVarR.i(jG);
                if (jI + (jI - bVarR.k(jG)) >= j17) {
                    r12 = r11;
                    r14 = r10;
                } else {
                    r12 = r11;
                    r14 = 0;
                }
                r12 = (r11 == true ? 1 : 0) & r14;
            }
            r12 = r11;
            r13 = r12;
            jO = o(bVarR, mVar, j10, jE, jG);
            if (jO < jE) {
                this.f18444m = new BehindLiveWindowException();
            } else {
                if (jO <= jG) {
                }
                gVar.f23178b = r13;
            }
        }
    }

    @Override // o8.i
    public void c(o8.e eVar) {
        v8.g gVarB;
        if (eVar instanceof l) {
            int iC = this.f18441j.c(((l) eVar).f23171d);
            b bVar = this.f18440i[iC];
            if (bVar.f18453d == null && (gVarB = ((o8.f) x7.a.i(bVar.f18450a)).b()) != null) {
                this.f18440i[iC] = bVar.c(new e8.g(gVarB, bVar.f18451b.f14718d));
            }
        }
        f.c cVar = this.f18439h;
        if (cVar != null) {
            cVar.j(eVar);
        }
    }

    @Override // o8.i
    public long d(long j10, a0 a0Var) {
        for (b bVar : this.f18440i) {
            if (bVar.f18453d != null) {
                long jH = bVar.h();
                if (jH != 0) {
                    long j11 = bVar.j(j10);
                    long jK = bVar.k(j11);
                    return a0Var.a(j10, jK, (jK >= j10 || (jH != -1 && j11 >= (bVar.f() + jH) - 1)) ? jK : bVar.k(j11 + 1));
                }
            }
        }
        return j10;
    }

    @Override // o8.i
    public boolean e(long j10, o8.e eVar, List<? extends m> list) {
        if (this.f18444m != null) {
            return false;
        }
        return this.f18441j.r(j10, eVar, list);
    }

    @Override // o8.i
    public int f(long j10, List<? extends m> list) {
        return (this.f18444m != null || this.f18441j.length() < 2) ? list.size() : this.f18441j.p(j10, list);
    }

    @Override // io.bidmachine.media3.exoplayer.dash.a
    public void g(q qVar) {
        this.f18441j = qVar;
    }

    @Override // o8.i
    public boolean h(o8.e eVar, boolean z10, io.bidmachine.media3.exoplayer.upstream.b.c cVar, io.bidmachine.media3.exoplayer.upstream.b bVar) {
        io.bidmachine.media3.exoplayer.upstream.b.C0329b c0329bB;
        if (!z10) {
            return false;
        }
        f.c cVar2 = this.f18439h;
        if (cVar2 != null && cVar2.k(eVar)) {
            return true;
        }
        if (!this.f18442k.f14668d && (eVar instanceof m)) {
            IOException iOException = cVar.f19815c;
            if ((iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((HttpDataSource$InvalidResponseCodeException) iOException).f18036d == 404) {
                b bVar2 = this.f18440i[this.f18441j.c(eVar.f23171d)];
                long jH = bVar2.h();
                if (jH != -1 && jH != 0) {
                    if (((m) eVar).f() > (bVar2.f() + jH) - 1) {
                        this.f18445n = true;
                        return true;
                    }
                }
            }
        }
        b bVar3 = this.f18440i[this.f18441j.c(eVar.f23171d)];
        f8.b bVarJ = this.f18433b.j(bVar3.f18451b.f14717c);
        if (bVarJ != null && !bVar3.f18452c.equals(bVarJ)) {
            return true;
        }
        io.bidmachine.media3.exoplayer.upstream.b.a aVarJ = j(this.f18441j, bVar3.f18451b.f14717c);
        if ((!aVarJ.a(2) && !aVarJ.a(1)) || (c0329bB = bVar.b(aVarJ, cVar)) == null || !aVarJ.a(c0329bB.f19811a)) {
            return false;
        }
        int i10 = c0329bB.f19811a;
        if (i10 == 2) {
            q qVar = this.f18441j;
            return qVar.g(qVar.c(eVar.f23171d), c0329bB.f19812b);
        }
        if (i10 != 1) {
            return false;
        }
        this.f18433b.e(bVar3.f18452c, c0329bB.f19812b);
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.dash.a
    public void i(f8.c cVar, int i10) {
        try {
            this.f18442k = cVar;
            this.f18443l = i10;
            long jG = cVar.g(i10);
            ArrayList<j> arrayListN = n();
            for (int i11 = 0; i11 < this.f18440i.length; i11++) {
                j jVar = arrayListN.get(this.f18441j.f(i11));
                b[] bVarArr = this.f18440i;
                bVarArr[i11] = bVarArr[i11].b(jG, jVar);
            }
        } catch (BehindLiveWindowException e10) {
            this.f18444m = e10;
        }
    }

    protected o8.e p(b bVar, z7.d dVar, u7.q qVar, int i10, Object obj, i iVar, i iVar2, r8.f.a aVar) {
        j jVar = bVar.f18451b;
        if (iVar != null) {
            i iVarA = iVar.a(iVar2, bVar.f18452c.f14661a);
            if (iVarA != null) {
                iVar = iVarA;
            }
        } else {
            iVar = (i) x7.a.e(iVar2);
        }
        z7.g gVarA = e8.f.a(jVar, bVar.f18452c.f14661a, iVar, 0, v.t());
        if (aVar != null) {
            gVarA = aVar.e("i").a().a(gVarA);
        }
        return new l(dVar, gVarA, qVar, i10, obj, bVar.f18450a);
    }

    protected o8.e q(b bVar, z7.d dVar, int i10, u7.q qVar, int i11, Object obj, long j10, int i12, long j11, long j12, r8.f.a aVar) {
        z7.g gVarA;
        j jVar = bVar.f18451b;
        long jK = bVar.k(j10);
        i iVarL = bVar.l(j10);
        if (bVar.f18450a == null) {
            long jI = bVar.i(j10);
            z7.g gVarA2 = e8.f.a(jVar, bVar.f18452c.f14661a, iVarL, bVar.m(j10, j12) ? 0 : 8, v.t());
            if (aVar != null) {
                aVar.b(jI - jK);
                Pair<String, String> pairL = l(j10, iVarL, bVar);
                if (pairL != null) {
                    aVar.c((String) pairL.first).d((String) pairL.second);
                }
                gVarA = aVar.a().a(gVarA2);
            } else {
                gVarA = gVarA2;
            }
            return new o8.o(dVar, gVarA, qVar, i11, obj, jK, jI, j10, i10, qVar);
        }
        int i13 = 1;
        int i14 = 1;
        while (i13 < i12) {
            i iVarA = iVarL.a(bVar.l(((long) i13) + j10), bVar.f18452c.f14661a);
            if (iVarA == null) {
                break;
            }
            i14++;
            i13++;
            iVarL = iVarA;
        }
        long j13 = (((long) i14) + j10) - 1;
        long jI2 = bVar.i(j13);
        long j14 = bVar.f18454e;
        long j15 = -9223372036854775807L;
        if (j14 != -9223372036854775807L && j14 <= jI2) {
            j15 = j14;
        }
        z7.g gVarA3 = e8.f.a(jVar, bVar.f18452c.f14661a, iVarL, bVar.m(j13, j12) ? 0 : 8, v.t());
        if (aVar != null) {
            aVar.b(jI2 - jK);
            Pair<String, String> pairL2 = l(j10, iVarL, bVar);
            if (pairL2 != null) {
                aVar.c((String) pairL2.first).d((String) pairL2.second);
            }
            gVarA3 = aVar.a().a(gVarA3);
        }
        z7.g gVar = gVarA3;
        long j16 = -jVar.f14718d;
        if (w.q(qVar.f26252o)) {
            j16 += jK;
        }
        return new o8.j(dVar, gVar, qVar, i11, obj, jK, jI2, j11, j15, j10, i14, j16, bVar.f18450a);
    }

    @Override // o8.i
    public void release() {
        for (b bVar : this.f18440i) {
            o8.f fVar = bVar.f18450a;
            if (fVar != null) {
                fVar.release();
            }
        }
    }
}
