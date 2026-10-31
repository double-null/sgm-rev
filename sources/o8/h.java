package o8;

import b8.a0;
import b8.u;
import io.bidmachine.media3.decoder.DecoderInputBuffer;
import io.bidmachine.media3.exoplayer.k1;
import io.bidmachine.media3.exoplayer.source.f0;
import io.bidmachine.media3.exoplayer.source.g0;
import io.bidmachine.media3.exoplayer.upstream.Loader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n8.s;
import o8.i;
import u7.q;
import u7.w;
import x7.l0;
import x7.r;

/* JADX INFO: compiled from: ChunkSampleStream.java */
/* JADX INFO: loaded from: classes4.dex */
public class h<T extends i> implements s, g0, Loader.b<e>, Loader.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f23180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q[] f23181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean[] f23182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final T f23183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g0.a<h<T>> f23184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.bidmachine.media3.exoplayer.source.s.a f23185g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final io.bidmachine.media3.exoplayer.upstream.b f23186h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Loader f23187i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final g f23188j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ArrayList<o8.a> f23189k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<o8.a> f23190l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final f0 f23191m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final f0[] f23192n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final c f23193o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private e f23194p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private q f23195q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private b<T> f23196r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f23197s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f23198t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f23199u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private o8.a f23200v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f23201w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f23202x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    boolean f23203y;

    /* JADX INFO: compiled from: ChunkSampleStream.java */
    public interface b<T extends i> {
        void a(h<T> hVar);
    }

    public h(int i10, int[] iArr, q[] qVarArr, T t10, g0.a<h<T>> aVar, r8.b bVar, long j10, io.bidmachine.media3.exoplayer.drm.i iVar, io.bidmachine.media3.exoplayer.drm.h.a aVar2, io.bidmachine.media3.exoplayer.upstream.b bVar2, io.bidmachine.media3.exoplayer.source.s.a aVar3, boolean z10, s8.a aVar4) {
        this.f23179a = i10;
        int i11 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f23180b = iArr;
        this.f23181c = qVarArr == null ? new q[0] : qVarArr;
        this.f23183e = t10;
        this.f23184f = aVar;
        this.f23185g = aVar3;
        this.f23186h = bVar2;
        this.f23201w = z10;
        this.f23187i = aVar4 != null ? new Loader(aVar4) : new Loader("ChunkSampleStream");
        this.f23188j = new g();
        ArrayList<o8.a> arrayList = new ArrayList<>();
        this.f23189k = arrayList;
        this.f23190l = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f23192n = new f0[length];
        this.f23182d = new boolean[length];
        int i12 = length + 1;
        int[] iArr2 = new int[i12];
        f0[] f0VarArr = new f0[i12];
        f0 f0VarL = f0.l(bVar, iVar, aVar2);
        this.f23191m = f0VarL;
        iArr2[0] = i10;
        f0VarArr[0] = f0VarL;
        while (i11 < length) {
            f0 f0VarM = f0.m(bVar);
            this.f23192n[i11] = f0VarM;
            int i13 = i11 + 1;
            f0VarArr[i13] = f0VarM;
            iArr2[i13] = this.f23180b[i11];
            i11 = i13;
        }
        this.f23193o = new c(iArr2, f0VarArr);
        this.f23197s = j10;
        this.f23198t = j10;
    }

    private void C(int i10) {
        int iMin = Math.min(R(i10, 0), this.f23199u);
        if (iMin > 0) {
            l0.d1(this.f23189k, 0, iMin);
            this.f23199u -= iMin;
        }
    }

    private void D(int i10) {
        x7.a.g(!this.f23187i.j());
        int size = this.f23189k.size();
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (!I(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        long j10 = H().f23175h;
        o8.a aVarE = E(i10);
        if (this.f23189k.isEmpty()) {
            this.f23197s = this.f23198t;
        }
        this.f23203y = false;
        this.f23185g.F(this.f23179a, aVarE.f23174g, j10);
    }

    private o8.a E(int i10) {
        o8.a aVar = this.f23189k.get(i10);
        ArrayList<o8.a> arrayList = this.f23189k;
        l0.d1(arrayList, i10, arrayList.size());
        this.f23199u = Math.max(this.f23199u, this.f23189k.size());
        int i11 = 0;
        this.f23191m.w(aVar.h(0));
        while (true) {
            f0[] f0VarArr = this.f23192n;
            if (i11 >= f0VarArr.length) {
                return aVar;
            }
            f0 f0Var = f0VarArr[i11];
            i11++;
            f0Var.w(aVar.h(i11));
        }
    }

    private o8.a H() {
        ArrayList<o8.a> arrayList = this.f23189k;
        return arrayList.get(arrayList.size() - 1);
    }

    private boolean I(int i10) {
        int iF;
        o8.a aVar = this.f23189k.get(i10);
        if (this.f23191m.F() > aVar.h(0)) {
            return true;
        }
        int i11 = 0;
        do {
            f0[] f0VarArr = this.f23192n;
            if (i11 >= f0VarArr.length) {
                return false;
            }
            iF = f0VarArr[i11].F();
            i11++;
        } while (iF <= aVar.h(i11));
        return true;
    }

    private boolean J(e eVar) {
        return eVar instanceof o8.a;
    }

    private void L() {
        int iR = R(this.f23191m.F(), this.f23199u - 1);
        while (true) {
            int i10 = this.f23199u;
            if (i10 > iR) {
                return;
            }
            this.f23199u = i10 + 1;
            M(i10);
        }
    }

    private void M(int i10) {
        o8.a aVar = this.f23189k.get(i10);
        q qVar = aVar.f23171d;
        if (!qVar.equals(this.f23195q)) {
            this.f23185g.j(this.f23179a, qVar, aVar.f23172e, aVar.f23173f, aVar.f23174g);
        }
        this.f23195q = qVar;
    }

    private int R(int i10, int i11) {
        do {
            i11++;
            if (i11 >= this.f23189k.size()) {
                return this.f23189k.size() - 1;
            }
        } while (this.f23189k.get(i11).h(0) <= i10);
        return i11 - 1;
    }

    private void T() {
        this.f23191m.Y();
        for (f0 f0Var : this.f23192n) {
            f0Var.Y();
        }
    }

    public boolean B() {
        try {
            return this.f23202x;
        } finally {
            this.f23202x = false;
        }
    }

    public void F(long j10) {
        x7.a.g(!this.f23187i.j());
        if (K() || j10 == -9223372036854775807L || this.f23189k.isEmpty()) {
            return;
        }
        o8.a aVarH = H();
        long j11 = aVarH.f23139l;
        if (j11 == -9223372036854775807L) {
            j11 = aVarH.f23175h;
        }
        if (j11 <= j10) {
            return;
        }
        long jC = this.f23191m.C();
        if (jC <= j10) {
            return;
        }
        this.f23191m.u(j10);
        for (f0 f0Var : this.f23192n) {
            f0Var.u(j10);
        }
        this.f23185g.F(this.f23179a, j10, jC);
    }

    public T G() {
        return this.f23183e;
    }

    boolean K() {
        return this.f23197s != -9223372036854775807L;
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void o(e eVar, long j10, long j11, boolean z10) {
        this.f23194p = null;
        this.f23200v = null;
        n8.i iVar = new n8.i(eVar.f23168a, eVar.f23169b, eVar.e(), eVar.d(), j10, j11, eVar.a());
        this.f23186h.d(eVar.f23168a);
        this.f23185g.t(iVar, eVar.f23170c, this.f23179a, eVar.f23171d, eVar.f23172e, eVar.f23173f, eVar.f23174g, eVar.f23175h);
        if (z10) {
            return;
        }
        if (K()) {
            T();
        } else if (J(eVar)) {
            E(this.f23189k.size() - 1);
            if (this.f23189k.isEmpty()) {
                this.f23197s = this.f23198t;
            }
        }
        this.f23184f.h(this);
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void m(e eVar, long j10, long j11) {
        this.f23194p = null;
        this.f23183e.c(eVar);
        n8.i iVar = new n8.i(eVar.f23168a, eVar.f23169b, eVar.e(), eVar.d(), j10, j11, eVar.a());
        this.f23186h.d(eVar.f23168a);
        this.f23185g.w(iVar, eVar.f23170c, this.f23179a, eVar.f23171d, eVar.f23172e, eVar.f23173f, eVar.f23174g, eVar.f23175h);
        this.f23184f.h(this);
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public Loader.c s(e eVar, long j10, long j11, IOException iOException, int i10) {
        Loader.c cVarH;
        long jA = eVar.a();
        boolean zJ = J(eVar);
        int size = this.f23189k.size() - 1;
        boolean z10 = (jA != 0 && zJ && I(size)) ? false : true;
        n8.i iVar = new n8.i(eVar.f23168a, eVar.f23169b, eVar.e(), eVar.d(), j10, j11, jA);
        io.bidmachine.media3.exoplayer.upstream.b.c cVar = new io.bidmachine.media3.exoplayer.upstream.b.c(iVar, new n8.j(eVar.f23170c, this.f23179a, eVar.f23171d, eVar.f23172e, eVar.f23173f, l0.t1(eVar.f23174g), l0.t1(eVar.f23175h)), iOException, i10);
        if (!this.f23183e.h(eVar, z10, cVar, this.f23186h)) {
            cVarH = null;
        } else if (z10) {
            cVarH = Loader.f19788f;
            if (zJ) {
                x7.a.g(E(size) == eVar);
                if (this.f23189k.isEmpty()) {
                    this.f23197s = this.f23198t;
                }
            }
        } else {
            r.h("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            cVarH = null;
        }
        if (cVarH == null) {
            long jC = this.f23186h.c(cVar);
            cVarH = jC != -9223372036854775807L ? Loader.h(false, jC) : Loader.f19789g;
        }
        boolean z11 = !cVarH.c();
        this.f23185g.y(iVar, eVar.f23170c, this.f23179a, eVar.f23171d, eVar.f23172e, eVar.f23173f, eVar.f23174g, eVar.f23175h, iOException, z11);
        if (z11) {
            this.f23194p = null;
            this.f23186h.d(eVar.f23168a);
            this.f23184f.h(this);
        }
        return cVarH;
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void n(e eVar, long j10, long j11, int i10) {
        this.f23185g.C(i10 == 0 ? new n8.i(eVar.f23168a, eVar.f23169b, j10) : new n8.i(eVar.f23168a, eVar.f23169b, eVar.e(), eVar.d(), j10, j11, eVar.a()), eVar.f23170c, this.f23179a, eVar.f23171d, eVar.f23172e, eVar.f23173f, eVar.f23174g, eVar.f23175h, i10);
    }

    public void S(b<T> bVar) {
        this.f23196r = bVar;
        this.f23191m.U();
        for (f0 f0Var : this.f23192n) {
            f0Var.U();
        }
        this.f23187i.m(this);
    }

    public void U(long j10) {
        o8.a aVar;
        boolean zC0;
        this.f23198t = j10;
        int i10 = 0;
        this.f23201w = false;
        if (K()) {
            this.f23197s = j10;
            return;
        }
        int i11 = 0;
        while (true) {
            if (i11 < this.f23189k.size()) {
                aVar = this.f23189k.get(i11);
                long j11 = aVar.f23174g;
                if (j11 == j10 && aVar.f23138k == -9223372036854775807L) {
                    break;
                } else if (j11 <= j10) {
                    i11++;
                }
            }
            aVar = null;
            break;
        }
        if (aVar != null) {
            zC0 = this.f23191m.b0(aVar.h(0));
        } else {
            zC0 = this.f23191m.c0(j10, j10 < b());
        }
        if (zC0) {
            this.f23199u = R(this.f23191m.F(), 0);
            f0[] f0VarArr = this.f23192n;
            int length = f0VarArr.length;
            while (i10 < length) {
                f0VarArr[i10].c0(j10, true);
                i10++;
            }
            return;
        }
        this.f23197s = j10;
        this.f23203y = false;
        this.f23189k.clear();
        this.f23199u = 0;
        if (!this.f23187i.j()) {
            this.f23187i.g();
            T();
            return;
        }
        this.f23191m.s();
        f0[] f0VarArr2 = this.f23192n;
        int length2 = f0VarArr2.length;
        while (i10 < length2) {
            f0VarArr2[i10].s();
            i10++;
        }
        this.f23187i.f();
    }

    public h<T>.a V(long j10, int i10) {
        for (int i11 = 0; i11 < this.f23192n.length; i11++) {
            if (this.f23180b[i11] == i10) {
                x7.a.g(!this.f23182d[i11]);
                this.f23182d[i11] = true;
                this.f23192n[i11].c0(j10, true);
                return new a(this, this.f23192n[i11], i11);
            }
        }
        throw new IllegalStateException();
    }

    @Override // n8.s
    public void a() throws IOException {
        this.f23187i.a();
        this.f23191m.Q();
        if (this.f23187i.j()) {
            return;
        }
        this.f23183e.a();
    }

    @Override // io.bidmachine.media3.exoplayer.source.g0
    public long b() {
        if (K()) {
            return this.f23197s;
        }
        if (this.f23203y) {
            return Long.MIN_VALUE;
        }
        return H().f23175h;
    }

    @Override // io.bidmachine.media3.exoplayer.source.g0
    public boolean c(k1 k1Var) {
        List<o8.a> listEmptyList;
        long j10;
        if (this.f23203y || this.f23187i.j() || this.f23187i.i()) {
            return false;
        }
        boolean zK = K();
        if (zK) {
            listEmptyList = Collections.emptyList();
            j10 = this.f23197s;
        } else {
            listEmptyList = this.f23190l;
            j10 = H().f23175h;
        }
        this.f23183e.b(k1Var, j10, listEmptyList, this.f23188j);
        g gVar = this.f23188j;
        boolean z10 = gVar.f23178b;
        e eVar = gVar.f23177a;
        gVar.a();
        if (z10) {
            this.f23197s = -9223372036854775807L;
            this.f23203y = true;
            return true;
        }
        if (eVar == null) {
            return false;
        }
        this.f23194p = eVar;
        if (J(eVar)) {
            o8.a aVar = (o8.a) eVar;
            if (zK) {
                long j11 = aVar.f23174g;
                long j12 = this.f23197s;
                if (j11 < j12) {
                    this.f23191m.e0(j12);
                    for (f0 f0Var : this.f23192n) {
                        f0Var.e0(this.f23197s);
                    }
                    if (this.f23201w) {
                        q qVar = aVar.f23171d;
                        this.f23202x = !w.a(qVar.f26252o, qVar.f26248k);
                    }
                }
                this.f23201w = false;
                this.f23197s = -9223372036854775807L;
            }
            aVar.j(this.f23193o);
            this.f23189k.add(aVar);
        } else if (eVar instanceof l) {
            ((l) eVar).f(this.f23193o);
        }
        this.f23187i.n(eVar, this, this.f23186h.a(eVar.f23170c));
        return true;
    }

    public long d(long j10, a0 a0Var) {
        return this.f23183e.d(j10, a0Var);
    }

    @Override // n8.s
    public int e(u uVar, DecoderInputBuffer decoderInputBuffer, int i10) {
        if (K()) {
            return -3;
        }
        o8.a aVar = this.f23200v;
        if (aVar != null && aVar.h(0) <= this.f23191m.F()) {
            return -3;
        }
        L();
        return this.f23191m.V(uVar, decoderInputBuffer, i10, this.f23203y);
    }

    @Override // io.bidmachine.media3.exoplayer.source.g0
    public long f() {
        if (this.f23203y) {
            return Long.MIN_VALUE;
        }
        if (K()) {
            return this.f23197s;
        }
        long jMax = this.f23198t;
        o8.a aVarH = H();
        if (!aVarH.g()) {
            if (this.f23189k.size() > 1) {
                ArrayList<o8.a> arrayList = this.f23189k;
                aVarH = arrayList.get(arrayList.size() - 2);
            } else {
                aVarH = null;
            }
        }
        if (aVarH != null) {
            jMax = Math.max(jMax, aVarH.f23175h);
        }
        return Math.max(jMax, this.f23191m.C());
    }

    @Override // io.bidmachine.media3.exoplayer.source.g0
    public void g(long j10) {
        if (this.f23187i.i() || K()) {
            return;
        }
        if (!this.f23187i.j()) {
            int iF = this.f23183e.f(j10, this.f23190l);
            if (iF < this.f23189k.size()) {
                D(iF);
                return;
            }
            return;
        }
        e eVar = (e) x7.a.e(this.f23194p);
        if (!(J(eVar) && I(this.f23189k.size() - 1)) && this.f23183e.e(j10, eVar, this.f23190l)) {
            this.f23187i.f();
            if (J(eVar)) {
                this.f23200v = (o8.a) eVar;
            }
        }
    }

    @Override // n8.s
    public boolean h() {
        return !K() && this.f23191m.N(this.f23203y);
    }

    @Override // io.bidmachine.media3.exoplayer.source.g0
    public boolean isLoading() {
        return this.f23187i.j();
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.f
    public void p() {
        this.f23191m.W();
        for (f0 f0Var : this.f23192n) {
            f0Var.W();
        }
        this.f23183e.release();
        b<T> bVar = this.f23196r;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    @Override // n8.s
    public int r(long j10) {
        if (K()) {
            return 0;
        }
        int iH = this.f23191m.H(j10, this.f23203y);
        o8.a aVar = this.f23200v;
        if (aVar != null) {
            iH = Math.min(iH, aVar.h(0) - this.f23191m.F());
        }
        this.f23191m.h0(iH);
        L();
        return iH;
    }

    public void u(long j10, boolean z10) {
        if (K()) {
            return;
        }
        int iA = this.f23191m.A();
        this.f23191m.r(j10, z10, true);
        int iA2 = this.f23191m.A();
        if (iA2 > iA) {
            long jB = this.f23191m.B();
            int i10 = 0;
            while (true) {
                f0[] f0VarArr = this.f23192n;
                if (i10 >= f0VarArr.length) {
                    break;
                }
                f0VarArr[i10].r(jB, z10, this.f23182d[i10]);
                i10++;
            }
        }
        C(iA2);
    }

    /* JADX INFO: compiled from: ChunkSampleStream.java */
    public final class a implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h<T> f23204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f0 f23205b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f23206c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f23207d;

        public a(h<T> hVar, f0 f0Var, int i10) {
            this.f23204a = hVar;
            this.f23205b = f0Var;
            this.f23206c = i10;
        }

        private void b() {
            if (this.f23207d) {
                return;
            }
            h.this.f23185g.j(h.this.f23180b[this.f23206c], h.this.f23181c[this.f23206c], 0, null, h.this.f23198t);
            this.f23207d = true;
        }

        public void c() {
            x7.a.g(h.this.f23182d[this.f23206c]);
            h.this.f23182d[this.f23206c] = false;
        }

        @Override // n8.s
        public int e(u uVar, DecoderInputBuffer decoderInputBuffer, int i10) {
            if (h.this.K()) {
                return -3;
            }
            if (h.this.f23200v != null && h.this.f23200v.h(this.f23206c + 1) <= this.f23205b.F()) {
                return -3;
            }
            b();
            return this.f23205b.V(uVar, decoderInputBuffer, i10, h.this.f23203y);
        }

        @Override // n8.s
        public boolean h() {
            return !h.this.K() && this.f23205b.N(h.this.f23203y);
        }

        @Override // n8.s
        public int r(long j10) {
            if (h.this.K()) {
                return 0;
            }
            int iH = this.f23205b.H(j10, h.this.f23203y);
            if (h.this.f23200v != null) {
                iH = Math.min(iH, h.this.f23200v.h(this.f23206c + 1) - this.f23205b.F());
            }
            this.f23205b.h0(iH);
            if (iH > 0) {
                b();
            }
            return iH;
        }

        @Override // n8.s
        public void a() {
        }
    }
}
