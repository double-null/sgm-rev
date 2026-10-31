package o8;

import android.util.SparseArray;
import c8.b2;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import u7.q;
import u7.w;
import v8.i0;
import v8.j0;
import v8.o0;
import v8.p;
import v8.r;
import x7.a0;
import x7.l0;

/* JADX INFO: compiled from: BundledChunkExtractor.java */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements r, f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final b f23147j = new b();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final i0 f23148k = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f23149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q f23151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseArray<a> f23152d = new SparseArray<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23153e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f.b f23154f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f23155g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private j0 f23156h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private q[] f23157i;

    /* JADX INFO: compiled from: BundledChunkExtractor.java */
    private static final class a implements o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f23158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f23159b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final q f23160c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final v8.m f23161d = new v8.m();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public q f23162e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private o0 f23163f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f23164g;

        public a(int i10, int i11, q qVar) {
            this.f23158a = i10;
            this.f23159b = i11;
            this.f23160c = qVar;
        }

        @Override // v8.o0
        public void a(q qVar) {
            q qVar2 = this.f23160c;
            if (qVar2 != null) {
                qVar = qVar.j(qVar2);
            }
            this.f23162e = qVar;
            ((o0) l0.i(this.f23163f)).a(this.f23162e);
        }

        @Override // v8.o0
        public void d(a0 a0Var, int i10, int i11) {
            ((o0) l0.i(this.f23163f)).b(a0Var, i10);
        }

        @Override // v8.o0
        public int e(u7.h hVar, int i10, boolean z10, int i11) throws IOException {
            return ((o0) l0.i(this.f23163f)).c(hVar, i10, z10);
        }

        @Override // v8.o0
        public void f(long j10, int i10, int i11, int i12, o0.a aVar) {
            long j11 = this.f23164g;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                this.f23163f = this.f23161d;
            }
            ((o0) l0.i(this.f23163f)).f(j10, i10, i11, i12, aVar);
        }

        public void h(f.b bVar, long j10) {
            if (bVar == null) {
                this.f23163f = this.f23161d;
                return;
            }
            this.f23164g = j10;
            o0 o0VarE = bVar.e(this.f23158a, this.f23159b);
            this.f23163f = o0VarE;
            q qVar = this.f23162e;
            if (qVar != null) {
                o0VarE.a(qVar);
            }
        }
    }

    /* JADX INFO: compiled from: BundledChunkExtractor.java */
    public static final class b implements f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private s9.r.a f23165a = new s9.h();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f23166b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f23167c;

        @Override // o8.f.a
        public q d(q qVar) {
            String str;
            if (!this.f23166b || !this.f23165a.a(qVar)) {
                return qVar;
            }
            q.b bVarW = qVar.b().u0("application/x-media3-cues").W(this.f23165a.b(qVar));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(qVar.f26252o);
            if (qVar.f26248k != null) {
                str = " " + qVar.f26248k;
            } else {
                str = "";
            }
            sb2.append(str);
            return bVarW.S(sb2.toString()).y0(Long.MAX_VALUE).N();
        }

        @Override // o8.f.a
        public f e(int i10, q qVar, boolean z10, List<q> list, o0 o0Var, b2 b2Var) {
            p hVar;
            String str = qVar.f26251n;
            if (!w.s(str)) {
                if (w.r(str)) {
                    hVar = new n9.e(this.f23165a, this.f23166b ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    hVar = new d9.a(1);
                } else if (Objects.equals(str, "image/png")) {
                    hVar = new r9.a();
                } else {
                    int i11 = z10 ? 4 : 0;
                    if (!this.f23166b) {
                        i11 |= 32;
                    }
                    hVar = new p9.h(this.f23165a, i11 | p9.h.j(this.f23167c), null, null, list, o0Var);
                }
            } else {
                if (!this.f23166b) {
                    return null;
                }
                hVar = new s9.n(this.f23165a.c(qVar), qVar);
            }
            return new d(hVar, i10, qVar);
        }

        @Override // o8.f.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public b c(boolean z10) {
            this.f23166b = z10;
            return this;
        }

        @Override // o8.f.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b b(int i10) {
            this.f23167c = i10;
            return this;
        }

        @Override // o8.f.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public b a(s9.r.a aVar) {
            this.f23165a = (s9.r.a) x7.a.e(aVar);
            return this;
        }
    }

    public d(p pVar, int i10, q qVar) {
        this.f23149a = pVar;
        this.f23150b = i10;
        this.f23151c = qVar;
    }

    @Override // o8.f
    public boolean a(v8.q qVar) throws IOException {
        int iL = this.f23149a.l(qVar, f23148k);
        x7.a.g(iL != 1);
        return iL == 0;
    }

    @Override // o8.f
    public v8.g b() {
        j0 j0Var = this.f23156h;
        if (j0Var instanceof v8.g) {
            return (v8.g) j0Var;
        }
        return null;
    }

    @Override // o8.f
    public q[] c() {
        return this.f23157i;
    }

    @Override // o8.f
    public void d(f.b bVar, long j10, long j11) {
        this.f23154f = bVar;
        this.f23155g = j11;
        if (!this.f23153e) {
            this.f23149a.c(this);
            if (j10 != -9223372036854775807L) {
                this.f23149a.a(0L, j10);
            }
            this.f23153e = true;
            return;
        }
        p pVar = this.f23149a;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        pVar.a(0L, j10);
        for (int i10 = 0; i10 < this.f23152d.size(); i10++) {
            this.f23152d.valueAt(i10).h(bVar, j11);
        }
    }

    @Override // v8.r
    public o0 e(int i10, int i11) {
        a aVar = this.f23152d.get(i10);
        if (aVar == null) {
            x7.a.g(this.f23157i == null);
            aVar = new a(i10, i11, i11 == this.f23150b ? this.f23151c : null);
            aVar.h(this.f23154f, this.f23155g);
            this.f23152d.put(i10, aVar);
        }
        return aVar;
    }

    @Override // v8.r
    public void h(j0 j0Var) {
        this.f23156h = j0Var;
    }

    @Override // v8.r
    public void r() {
        q[] qVarArr = new q[this.f23152d.size()];
        for (int i10 = 0; i10 < this.f23152d.size(); i10++) {
            qVarArr[i10] = (q) x7.a.i(this.f23152d.valueAt(i10).f23162e);
        }
        this.f23157i = qVarArr;
    }

    @Override // o8.f
    public void release() {
        this.f23149a.release();
    }
}
