package io.bidmachine.media3.exoplayer;

import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: MediaSourceList.java */
/* JADX INFO: loaded from: classes4.dex */
final class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c8.b2 f18331a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f18335e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c8.a f18338h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final x7.n f18339i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f18341k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private z7.o f18342l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private n8.t f18340j = new n8.t.a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IdentityHashMap<io.bidmachine.media3.exoplayer.source.q, c> f18333c = new IdentityHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<Object, c> f18334d = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<c> f18332b = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap<c, b> f18336f = new HashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set<c> f18337g = new HashSet();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: MediaSourceList.java */
    final class a implements io.bidmachine.media3.exoplayer.source.s, io.bidmachine.media3.exoplayer.drm.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f18343a;

        public a(c cVar) {
            this.f18343a = cVar;
        }

        private Pair<Integer, io.bidmachine.media3.exoplayer.source.r.b> H(int i10, io.bidmachine.media3.exoplayer.source.r.b bVar) {
            io.bidmachine.media3.exoplayer.source.r.b bVar2 = null;
            if (bVar != null) {
                io.bidmachine.media3.exoplayer.source.r.b bVarN = d2.n(this.f18343a, bVar);
                if (bVarN == null) {
                    return null;
                }
                bVar2 = bVarN;
            }
            return Pair.create(Integer.valueOf(d2.s(this.f18343a, i10)), bVar2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void I(Pair pair, n8.j jVar) {
            d2.this.f18338h.o0(((Integer) pair.first).intValue(), (io.bidmachine.media3.exoplayer.source.r.b) pair.second, jVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void J(Pair pair) {
            d2.this.f18338h.p0(((Integer) pair.first).intValue(), (io.bidmachine.media3.exoplayer.source.r.b) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void M(Pair pair) {
            d2.this.f18338h.k0(((Integer) pair.first).intValue(), (io.bidmachine.media3.exoplayer.source.r.b) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void N(Pair pair) {
            d2.this.f18338h.m0(((Integer) pair.first).intValue(), (io.bidmachine.media3.exoplayer.source.r.b) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void O(Pair pair, int i10) {
            d2.this.f18338h.Z(((Integer) pair.first).intValue(), (io.bidmachine.media3.exoplayer.source.r.b) pair.second, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void P(Pair pair, Exception exc) {
            d2.this.f18338h.b0(((Integer) pair.first).intValue(), (io.bidmachine.media3.exoplayer.source.r.b) pair.second, exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void Q(Pair pair) {
            d2.this.f18338h.l0(((Integer) pair.first).intValue(), (io.bidmachine.media3.exoplayer.source.r.b) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void S(Pair pair, n8.i iVar, n8.j jVar) {
            d2.this.f18338h.T(((Integer) pair.first).intValue(), (io.bidmachine.media3.exoplayer.source.r.b) pair.second, iVar, jVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void V(Pair pair, n8.i iVar, n8.j jVar) {
            d2.this.f18338h.f0(((Integer) pair.first).intValue(), (io.bidmachine.media3.exoplayer.source.r.b) pair.second, iVar, jVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void W(Pair pair, n8.i iVar, n8.j jVar, IOException iOException, boolean z10) {
            d2.this.f18338h.U(((Integer) pair.first).intValue(), (io.bidmachine.media3.exoplayer.source.r.b) pair.second, iVar, jVar, iOException, z10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void X(Pair pair, n8.i iVar, n8.j jVar, int i10) {
            d2.this.f18338h.R(((Integer) pair.first).intValue(), (io.bidmachine.media3.exoplayer.source.r.b) pair.second, iVar, jVar, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void Y(Pair pair, n8.j jVar) {
            d2.this.f18338h.K(((Integer) pair.first).intValue(), (io.bidmachine.media3.exoplayer.source.r.b) x7.a.e((io.bidmachine.media3.exoplayer.source.r.b) pair.second), jVar);
        }

        @Override // io.bidmachine.media3.exoplayer.source.s
        public void K(int i10, io.bidmachine.media3.exoplayer.source.r.b bVar, final n8.j jVar) {
            final Pair<Integer, io.bidmachine.media3.exoplayer.source.r.b> pairH = H(i10, bVar);
            if (pairH != null) {
                d2.this.f18339i.i(new Runnable() { // from class: io.bidmachine.media3.exoplayer.a2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f18104a.Y(pairH, jVar);
                    }
                });
            }
        }

        @Override // io.bidmachine.media3.exoplayer.source.s
        public void R(int i10, io.bidmachine.media3.exoplayer.source.r.b bVar, final n8.i iVar, final n8.j jVar, final int i11) {
            final Pair<Integer, io.bidmachine.media3.exoplayer.source.r.b> pairH = H(i10, bVar);
            if (pairH != null) {
                d2.this.f18339i.i(new Runnable() { // from class: io.bidmachine.media3.exoplayer.u1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f19778a.X(pairH, iVar, jVar, i11);
                    }
                });
            }
        }

        @Override // io.bidmachine.media3.exoplayer.source.s
        public void T(int i10, io.bidmachine.media3.exoplayer.source.r.b bVar, final n8.i iVar, final n8.j jVar) {
            final Pair<Integer, io.bidmachine.media3.exoplayer.source.r.b> pairH = H(i10, bVar);
            if (pairH != null) {
                d2.this.f18339i.i(new Runnable() { // from class: io.bidmachine.media3.exoplayer.x1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f20001a.S(pairH, iVar, jVar);
                    }
                });
            }
        }

        @Override // io.bidmachine.media3.exoplayer.source.s
        public void U(int i10, io.bidmachine.media3.exoplayer.source.r.b bVar, final n8.i iVar, final n8.j jVar, final IOException iOException, final boolean z10) {
            final Pair<Integer, io.bidmachine.media3.exoplayer.source.r.b> pairH = H(i10, bVar);
            if (pairH != null) {
                d2.this.f18339i.i(new Runnable() { // from class: io.bidmachine.media3.exoplayer.b2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f18311a.W(pairH, iVar, jVar, iOException, z10);
                    }
                });
            }
        }

        @Override // io.bidmachine.media3.exoplayer.drm.h
        public void Z(int i10, io.bidmachine.media3.exoplayer.source.r.b bVar, final int i11) {
            final Pair<Integer, io.bidmachine.media3.exoplayer.source.r.b> pairH = H(i10, bVar);
            if (pairH != null) {
                d2.this.f18339i.i(new Runnable() { // from class: io.bidmachine.media3.exoplayer.y1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f20007a.O(pairH, i11);
                    }
                });
            }
        }

        @Override // io.bidmachine.media3.exoplayer.drm.h
        public void b0(int i10, io.bidmachine.media3.exoplayer.source.r.b bVar, final Exception exc) {
            final Pair<Integer, io.bidmachine.media3.exoplayer.source.r.b> pairH = H(i10, bVar);
            if (pairH != null) {
                d2.this.f18339i.i(new Runnable() { // from class: io.bidmachine.media3.exoplayer.w1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f19989a.P(pairH, exc);
                    }
                });
            }
        }

        @Override // io.bidmachine.media3.exoplayer.source.s
        public void f0(int i10, io.bidmachine.media3.exoplayer.source.r.b bVar, final n8.i iVar, final n8.j jVar) {
            final Pair<Integer, io.bidmachine.media3.exoplayer.source.r.b> pairH = H(i10, bVar);
            if (pairH != null) {
                d2.this.f18339i.i(new Runnable() { // from class: io.bidmachine.media3.exoplayer.r1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f19359a.V(pairH, iVar, jVar);
                    }
                });
            }
        }

        @Override // io.bidmachine.media3.exoplayer.drm.h
        public void k0(int i10, io.bidmachine.media3.exoplayer.source.r.b bVar) {
            final Pair<Integer, io.bidmachine.media3.exoplayer.source.r.b> pairH = H(i10, bVar);
            if (pairH != null) {
                d2.this.f18339i.i(new Runnable() { // from class: io.bidmachine.media3.exoplayer.c2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f18320a.M(pairH);
                    }
                });
            }
        }

        @Override // io.bidmachine.media3.exoplayer.drm.h
        public void l0(int i10, io.bidmachine.media3.exoplayer.source.r.b bVar) {
            final Pair<Integer, io.bidmachine.media3.exoplayer.source.r.b> pairH = H(i10, bVar);
            if (pairH != null) {
                d2.this.f18339i.i(new Runnable() { // from class: io.bidmachine.media3.exoplayer.v1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f19828a.Q(pairH);
                    }
                });
            }
        }

        @Override // io.bidmachine.media3.exoplayer.drm.h
        public void m0(int i10, io.bidmachine.media3.exoplayer.source.r.b bVar) {
            final Pair<Integer, io.bidmachine.media3.exoplayer.source.r.b> pairH = H(i10, bVar);
            if (pairH != null) {
                d2.this.f18339i.i(new Runnable() { // from class: io.bidmachine.media3.exoplayer.s1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f19369a.N(pairH);
                    }
                });
            }
        }

        @Override // io.bidmachine.media3.exoplayer.source.s
        public void o0(int i10, io.bidmachine.media3.exoplayer.source.r.b bVar, final n8.j jVar) {
            final Pair<Integer, io.bidmachine.media3.exoplayer.source.r.b> pairH = H(i10, bVar);
            if (pairH != null) {
                d2.this.f18339i.i(new Runnable() { // from class: io.bidmachine.media3.exoplayer.z1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f20012a.I(pairH, jVar);
                    }
                });
            }
        }

        @Override // io.bidmachine.media3.exoplayer.drm.h
        public void p0(int i10, io.bidmachine.media3.exoplayer.source.r.b bVar) {
            final Pair<Integer, io.bidmachine.media3.exoplayer.source.r.b> pairH = H(i10, bVar);
            if (pairH != null) {
                d2.this.f18339i.i(new Runnable() { // from class: io.bidmachine.media3.exoplayer.t1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f19712a.J(pairH);
                    }
                });
            }
        }
    }

    /* JADX INFO: compiled from: MediaSourceList.java */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final io.bidmachine.media3.exoplayer.source.r f18345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final io.bidmachine.media3.exoplayer.source.r.c f18346b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f18347c;

        public b(io.bidmachine.media3.exoplayer.source.r rVar, io.bidmachine.media3.exoplayer.source.r.c cVar, a aVar) {
            this.f18345a = rVar;
            this.f18346b = cVar;
            this.f18347c = aVar;
        }
    }

    /* JADX INFO: compiled from: MediaSourceList.java */
    static final class c implements p1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final io.bidmachine.media3.exoplayer.source.p f18348a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f18351d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f18352e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<io.bidmachine.media3.exoplayer.source.r.b> f18350c = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f18349b = new Object();

        public c(io.bidmachine.media3.exoplayer.source.r rVar, boolean z10) {
            this.f18348a = new io.bidmachine.media3.exoplayer.source.p(rVar, z10);
        }

        @Override // io.bidmachine.media3.exoplayer.p1
        public Object a() {
            return this.f18349b;
        }

        @Override // io.bidmachine.media3.exoplayer.p1
        public u7.d0 b() {
            return this.f18348a.W();
        }

        public void c(int i10) {
            this.f18351d = i10;
            this.f18352e = false;
            this.f18350c.clear();
        }
    }

    /* JADX INFO: compiled from: MediaSourceList.java */
    public interface d {
        void d();
    }

    public d2(d dVar, c8.a aVar, x7.n nVar, c8.b2 b2Var) {
        this.f18331a = b2Var;
        this.f18335e = dVar;
        this.f18338h = aVar;
        this.f18339i = nVar;
    }

    private void C(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            c cVarRemove = this.f18332b.remove(i12);
            this.f18334d.remove(cVarRemove.f18349b);
            g(i12, -cVarRemove.f18348a.W().p());
            cVarRemove.f18352e = true;
            if (this.f18341k) {
                v(cVarRemove);
            }
        }
    }

    private void g(int i10, int i11) {
        while (i10 < this.f18332b.size()) {
            this.f18332b.get(i10).f18351d += i11;
            i10++;
        }
    }

    private void j(c cVar) {
        b bVar = this.f18336f.get(cVar);
        if (bVar != null) {
            bVar.f18345a.o(bVar.f18346b);
        }
    }

    private void k() {
        Iterator<c> it = this.f18337g.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.f18350c.isEmpty()) {
                j(next);
                it.remove();
            }
        }
    }

    private void l(c cVar) {
        this.f18337g.add(cVar);
        b bVar = this.f18336f.get(cVar);
        if (bVar != null) {
            bVar.f18345a.f(bVar.f18346b);
        }
    }

    private static Object m(Object obj) {
        return b8.a.v(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static io.bidmachine.media3.exoplayer.source.r.b n(c cVar, io.bidmachine.media3.exoplayer.source.r.b bVar) {
        for (int i10 = 0; i10 < cVar.f18350c.size(); i10++) {
            if (cVar.f18350c.get(i10).f19687d == bVar.f19687d) {
                return bVar.a(p(cVar, bVar.f19684a));
            }
        }
        return null;
    }

    private static Object o(Object obj) {
        return b8.a.w(obj);
    }

    private static Object p(c cVar, Object obj) {
        return b8.a.y(cVar.f18349b, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int s(c cVar, int i10) {
        return i10 + cVar.f18351d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(io.bidmachine.media3.exoplayer.source.r rVar, u7.d0 d0Var) {
        this.f18335e.d();
    }

    private void v(c cVar) {
        if (cVar.f18352e && cVar.f18350c.isEmpty()) {
            b bVar = (b) x7.a.e(this.f18336f.remove(cVar));
            bVar.f18345a.g(bVar.f18346b);
            bVar.f18345a.q(bVar.f18347c);
            bVar.f18345a.b(bVar.f18347c);
            this.f18337g.remove(cVar);
        }
    }

    private void y(c cVar) {
        io.bidmachine.media3.exoplayer.source.p pVar = cVar.f18348a;
        io.bidmachine.media3.exoplayer.source.r.c cVar2 = new io.bidmachine.media3.exoplayer.source.r.c() { // from class: io.bidmachine.media3.exoplayer.q1
            @Override // io.bidmachine.media3.exoplayer.source.r.c
            public final void a(io.bidmachine.media3.exoplayer.source.r rVar, u7.d0 d0Var) {
                this.f19356a.u(rVar, d0Var);
            }
        };
        a aVar = new a(cVar);
        this.f18336f.put(cVar, new b(pVar, cVar2, aVar));
        pVar.p(x7.l0.C(), aVar);
        pVar.i(x7.l0.C(), aVar);
        pVar.h(cVar2, this.f18342l, this.f18331a);
    }

    public void A(io.bidmachine.media3.exoplayer.source.q qVar) {
        c cVar = (c) x7.a.e(this.f18333c.remove(qVar));
        cVar.f18348a.n(qVar);
        cVar.f18350c.remove(((io.bidmachine.media3.exoplayer.source.o) qVar).f19662a);
        if (!this.f18333c.isEmpty()) {
            k();
        }
        v(cVar);
    }

    public u7.d0 B(int i10, int i11, n8.t tVar) {
        x7.a.a(i10 >= 0 && i10 <= i11 && i11 <= r());
        this.f18340j = tVar;
        C(i10, i11);
        return i();
    }

    public u7.d0 D(List<c> list, n8.t tVar) {
        C(0, this.f18332b.size());
        return f(this.f18332b.size(), list, tVar);
    }

    public u7.d0 E(n8.t tVar) {
        int iR = r();
        if (tVar.getLength() != iR) {
            tVar = tVar.e().g(0, iR);
        }
        this.f18340j = tVar;
        return i();
    }

    public u7.d0 F(int i10, int i11, List<u7.s> list) {
        x7.a.a(i10 >= 0 && i10 <= i11 && i11 <= r());
        x7.a.a(list.size() == i11 - i10);
        for (int i12 = i10; i12 < i11; i12++) {
            this.f18332b.get(i12).f18348a.m(list.get(i12 - i10));
        }
        return i();
    }

    public u7.d0 f(int i10, List<c> list, n8.t tVar) {
        if (!list.isEmpty()) {
            this.f18340j = tVar;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                c cVar = list.get(i11 - i10);
                if (i11 > 0) {
                    c cVar2 = this.f18332b.get(i11 - 1);
                    cVar.c(cVar2.f18351d + cVar2.f18348a.W().p());
                } else {
                    cVar.c(0);
                }
                g(i11, cVar.f18348a.W().p());
                this.f18332b.add(i11, cVar);
                this.f18334d.put(cVar.f18349b, cVar);
                if (this.f18341k) {
                    y(cVar);
                    if (this.f18333c.isEmpty()) {
                        this.f18337g.add(cVar);
                    } else {
                        j(cVar);
                    }
                }
            }
        }
        return i();
    }

    public io.bidmachine.media3.exoplayer.source.q h(io.bidmachine.media3.exoplayer.source.r.b bVar, r8.b bVar2, long j10) {
        Object objO = o(bVar.f19684a);
        io.bidmachine.media3.exoplayer.source.r.b bVarA = bVar.a(m(bVar.f19684a));
        c cVar = (c) x7.a.e(this.f18334d.get(objO));
        l(cVar);
        cVar.f18350c.add(bVarA);
        io.bidmachine.media3.exoplayer.source.o oVarA = cVar.f18348a.a(bVarA, bVar2, j10);
        this.f18333c.put(oVarA, cVar);
        k();
        return oVarA;
    }

    public u7.d0 i() {
        if (this.f18332b.isEmpty()) {
            return u7.d0.f26009a;
        }
        int iP = 0;
        for (int i10 = 0; i10 < this.f18332b.size(); i10++) {
            c cVar = this.f18332b.get(i10);
            cVar.f18351d = iP;
            iP += cVar.f18348a.W().p();
        }
        return new g2(this.f18332b, this.f18340j);
    }

    public n8.t q() {
        return this.f18340j;
    }

    public int r() {
        return this.f18332b.size();
    }

    public boolean t() {
        return this.f18341k;
    }

    public u7.d0 w(int i10, int i11, int i12, n8.t tVar) {
        x7.a.a(i10 >= 0 && i10 <= i11 && i11 <= r() && i12 >= 0);
        this.f18340j = tVar;
        if (i10 == i11 || i10 == i12) {
            return i();
        }
        int iMin = Math.min(i10, i12);
        int iMax = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
        int iP = this.f18332b.get(iMin).f18351d;
        x7.l0.R0(this.f18332b, i10, i11, i12);
        while (iMin <= iMax) {
            c cVar = this.f18332b.get(iMin);
            cVar.f18351d = iP;
            iP += cVar.f18348a.W().p();
            iMin++;
        }
        return i();
    }

    public void x(z7.o oVar) {
        x7.a.g(!this.f18341k);
        this.f18342l = oVar;
        for (int i10 = 0; i10 < this.f18332b.size(); i10++) {
            c cVar = this.f18332b.get(i10);
            y(cVar);
            this.f18337g.add(cVar);
        }
        this.f18341k = true;
    }

    public void z() {
        for (b bVar : this.f18336f.values()) {
            try {
                bVar.f18345a.g(bVar.f18346b);
            } catch (RuntimeException e10) {
                x7.r.d("MediaSourceList", "Failed to release child source.", e10);
            }
            bVar.f18345a.q(bVar.f18347c);
            bVar.f18345a.b(bVar.f18347c);
        }
        this.f18336f.clear();
        this.f18337g.clear();
        this.f18341k = false;
    }
}
