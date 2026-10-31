package x8;

import com.google.common.collect.c1;
import io.bidmachine.media3.common.ParserException;
import java.io.IOException;
import java.util.ArrayList;
import s9.r;
import s9.s;
import u7.w;
import v8.g0;
import v8.i0;
import v8.j0;
import v8.o0;
import v8.p;
import v8.q;
import x7.a0;

/* JADX INFO: compiled from: AviExtractor.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0 f28206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f28207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f28208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r.a f28209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f28210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private v8.r f28211f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private x8.c f28212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f28213h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private e[] f28214i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f28215j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private e f28216k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f28217l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f28218m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f28219n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f28220o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f28221p;

    /* JADX INFO: renamed from: x8.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AviExtractor.java */
    private class C0469b implements j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f28222a;

        public C0469b(long j10) {
            this.f28222a = j10;
        }

        @Override // v8.j0
        public j0.a d(long j10) {
            j0.a aVarI = b.this.f28214i[0].i(j10);
            for (int i10 = 1; i10 < b.this.f28214i.length; i10++) {
                j0.a aVarI2 = b.this.f28214i[i10].i(j10);
                if (aVarI2.f27345a.f27351b < aVarI.f27345a.f27351b) {
                    aVarI = aVarI2;
                }
            }
            return aVarI;
        }

        @Override // v8.j0
        public boolean h() {
            return true;
        }

        @Override // v8.j0
        public long k() {
            return this.f28222a;
        }
    }

    /* JADX INFO: compiled from: AviExtractor.java */
    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f28224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f28225b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f28226c;

        private c() {
        }

        public void a(a0 a0Var) {
            this.f28224a = a0Var.u();
            this.f28225b = a0Var.u();
            this.f28226c = 0;
        }

        public void b(a0 a0Var) throws ParserException {
            a(a0Var);
            if (this.f28224a == 1414744396) {
                this.f28226c = a0Var.u();
                return;
            }
            throw ParserException.b("LIST expected, found: " + this.f28224a, null);
        }
    }

    public b(int i10, r.a aVar) {
        this.f28209d = aVar;
        this.f28208c = (i10 & 1) == 0;
        this.f28206a = new a0(12);
        this.f28207b = new c();
        this.f28211f = new g0();
        this.f28214i = new e[0];
        this.f28218m = -1L;
        this.f28219n = -1L;
        this.f28217l = -1;
        this.f28213h = -9223372036854775807L;
    }

    private static void d(q qVar) throws IOException {
        if ((qVar.getPosition() & 1) == 1) {
            qVar.k(1);
        }
    }

    private e g(int i10) {
        for (e eVar : this.f28214i) {
            if (eVar.j(i10)) {
                return eVar;
            }
        }
        return null;
    }

    private void h(a0 a0Var) throws IOException {
        f fVarC = f.c(1819436136, a0Var);
        if (fVarC.getType() != 1819436136) {
            throw ParserException.b("Unexpected header list type " + fVarC.getType(), null);
        }
        x8.c cVar = (x8.c) fVarC.b(x8.c.class);
        if (cVar == null) {
            throw ParserException.b("AviHeader not found", null);
        }
        this.f28212g = cVar;
        this.f28213h = ((long) cVar.f28229c) * ((long) cVar.f28227a);
        ArrayList arrayList = new ArrayList();
        c1<x8.a> it = fVarC.f28252a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            x8.a next = it.next();
            if (next.getType() == 1819440243) {
                int i11 = i10 + 1;
                e eVarM = m((f) next, i10);
                if (eVarM != null) {
                    arrayList.add(eVarM);
                }
                i10 = i11;
            }
        }
        this.f28214i = (e[]) arrayList.toArray(new e[0]);
        this.f28211f.r();
    }

    private void j(a0 a0Var) {
        int i10;
        long jK = k(a0Var);
        while (true) {
            if (a0Var.a() < 16) {
                break;
            }
            int iU = a0Var.u();
            int iU2 = a0Var.u();
            long jU = ((long) a0Var.u()) + jK;
            a0Var.X(4);
            e eVarG = g(iU);
            if (eVarG != null) {
                eVarG.b(jU, (iU2 & 16) == 16);
            }
        }
        for (e eVar : this.f28214i) {
            eVar.c();
        }
        this.f28221p = true;
        if (this.f28214i.length == 0) {
            this.f28211f.h(new j0.b(this.f28213h));
        } else {
            this.f28211f.h(new C0469b(this.f28213h));
        }
    }

    private long k(a0 a0Var) {
        if (a0Var.a() < 16) {
            return 0L;
        }
        int iF = a0Var.f();
        a0Var.X(8);
        long jU = a0Var.u();
        long j10 = this.f28218m;
        long j11 = jU <= j10 ? j10 + 8 : 0L;
        a0Var.W(iF);
        return j11;
    }

    private e m(f fVar, int i10) {
        d dVar = (d) fVar.b(d.class);
        g gVar = (g) fVar.b(g.class);
        if (dVar == null) {
            x7.r.h("AviExtractor", "Missing Stream Header");
            return null;
        }
        if (gVar == null) {
            x7.r.h("AviExtractor", "Missing Stream Format");
            return null;
        }
        long jA = dVar.a();
        u7.q qVar = gVar.f28254a;
        u7.q.b bVarB = qVar.b();
        bVarB.e0(i10);
        int i11 = dVar.f28236f;
        if (i11 != 0) {
            bVarB.k0(i11);
        }
        h hVar = (h) fVar.b(h.class);
        if (hVar != null) {
            bVarB.h0(hVar.f28255a);
        }
        int iK = w.k(qVar.f26252o);
        if (iK != 1 && iK != 2) {
            return null;
        }
        o0 o0VarE = this.f28211f.e(i10, iK);
        o0VarE.a(bVarB.N());
        o0VarE.g(jA);
        this.f28213h = Math.max(this.f28213h, jA);
        return new e(i10, dVar, o0VarE);
    }

    private int n(q qVar) throws IOException {
        if (qVar.getPosition() >= this.f28219n) {
            return -1;
        }
        e eVar = this.f28216k;
        if (eVar == null) {
            d(qVar);
            qVar.n(this.f28206a.e(), 0, 12);
            this.f28206a.W(0);
            int iU = this.f28206a.u();
            if (iU == 1414744396) {
                this.f28206a.W(8);
                qVar.k(this.f28206a.u() != 1769369453 ? 8 : 12);
                qVar.d();
                return 0;
            }
            int iU2 = this.f28206a.u();
            if (iU == 1263424842) {
                this.f28215j = qVar.getPosition() + ((long) iU2) + 8;
                return 0;
            }
            qVar.k(8);
            qVar.d();
            e eVarG = g(iU);
            if (eVarG == null) {
                this.f28215j = qVar.getPosition() + ((long) iU2);
                return 0;
            }
            eVarG.n(iU2);
            this.f28216k = eVarG;
        } else if (eVar.m(qVar)) {
            this.f28216k = null;
        }
        return 0;
    }

    private boolean o(q qVar, i0 i0Var) throws IOException {
        boolean z10;
        if (this.f28215j != -1) {
            long position = qVar.getPosition();
            long j10 = this.f28215j;
            if (j10 < position || j10 > 262144 + position) {
                i0Var.f27344a = j10;
                z10 = true;
            } else {
                qVar.k((int) (j10 - position));
                z10 = false;
            }
        } else {
            z10 = false;
        }
        this.f28215j = -1L;
        return z10;
    }

    @Override // v8.p
    public void a(long j10, long j11) {
        this.f28215j = -1L;
        this.f28216k = null;
        for (e eVar : this.f28214i) {
            eVar.o(j10);
        }
        if (j10 != 0) {
            this.f28210e = 6;
        } else if (this.f28214i.length == 0) {
            this.f28210e = 0;
        } else {
            this.f28210e = 3;
        }
    }

    @Override // v8.p
    public void c(v8.r rVar) {
        this.f28210e = 0;
        if (this.f28208c) {
            rVar = new s(rVar, this.f28209d);
        }
        this.f28211f = rVar;
        this.f28215j = -1L;
    }

    @Override // v8.p
    public boolean e(q qVar) throws IOException {
        qVar.n(this.f28206a.e(), 0, 12);
        this.f28206a.W(0);
        if (this.f28206a.u() != 1179011410) {
            return false;
        }
        this.f28206a.X(4);
        return this.f28206a.u() == 541677121;
    }

    @Override // v8.p
    public int l(q qVar, i0 i0Var) throws IOException {
        if (o(qVar, i0Var)) {
            return 1;
        }
        switch (this.f28210e) {
            case 0:
                if (!e(qVar)) {
                    throw ParserException.b("AVI Header List not found", null);
                }
                qVar.k(12);
                this.f28210e = 1;
                return 0;
            case 1:
                qVar.readFully(this.f28206a.e(), 0, 12);
                this.f28206a.W(0);
                this.f28207b.b(this.f28206a);
                c cVar = this.f28207b;
                if (cVar.f28226c == 1819436136) {
                    this.f28217l = cVar.f28225b;
                    this.f28210e = 2;
                    return 0;
                }
                throw ParserException.b("hdrl expected, found: " + this.f28207b.f28226c, null);
            case 2:
                int i10 = this.f28217l - 4;
                a0 a0Var = new a0(i10);
                qVar.readFully(a0Var.e(), 0, i10);
                h(a0Var);
                this.f28210e = 3;
                return 0;
            case 3:
                if (this.f28218m != -1) {
                    long position = qVar.getPosition();
                    long j10 = this.f28218m;
                    if (position != j10) {
                        this.f28215j = j10;
                        return 0;
                    }
                }
                qVar.n(this.f28206a.e(), 0, 12);
                qVar.d();
                this.f28206a.W(0);
                this.f28207b.a(this.f28206a);
                int iU = this.f28206a.u();
                int i11 = this.f28207b.f28224a;
                if (i11 == 1179011410) {
                    qVar.k(12);
                    return 0;
                }
                if (i11 != 1414744396 || iU != 1769369453) {
                    this.f28215j = qVar.getPosition() + ((long) this.f28207b.f28225b) + 8;
                    return 0;
                }
                long position2 = qVar.getPosition();
                this.f28218m = position2;
                this.f28219n = position2 + ((long) this.f28207b.f28225b) + 8;
                if (!this.f28221p) {
                    if (((x8.c) x7.a.e(this.f28212g)).a()) {
                        this.f28210e = 4;
                        this.f28215j = this.f28219n;
                        return 0;
                    }
                    this.f28211f.h(new j0.b(this.f28213h));
                    this.f28221p = true;
                }
                this.f28215j = qVar.getPosition() + 12;
                this.f28210e = 6;
                return 0;
            case 4:
                qVar.readFully(this.f28206a.e(), 0, 8);
                this.f28206a.W(0);
                int iU2 = this.f28206a.u();
                int iU3 = this.f28206a.u();
                if (iU2 == 829973609) {
                    this.f28210e = 5;
                    this.f28220o = iU3;
                } else {
                    this.f28215j = qVar.getPosition() + ((long) iU3);
                }
                return 0;
            case 5:
                a0 a0Var2 = new a0(this.f28220o);
                qVar.readFully(a0Var2.e(), 0, this.f28220o);
                j(a0Var2);
                this.f28210e = 6;
                this.f28215j = this.f28218m;
                return 0;
            case 6:
                return n(qVar);
            default:
                throw new AssertionError();
        }
    }

    @Override // v8.p
    public void release() {
    }
}
