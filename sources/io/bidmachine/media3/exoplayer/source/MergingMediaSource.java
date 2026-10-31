package io.bidmachine.media3.exoplayer.source;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class MergingMediaSource extends io.bidmachine.media3.exoplayer.source.c<Integer> {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final u7.s f19398w = new u7.s.c().c("MergingMediaSource").a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f19399k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f19400l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final r[] f19401m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List<List<c>> f19402n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final u7.d0[] f19403o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ArrayList<r> f19404p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final n8.e f19405q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Map<Object, Long> f19406r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final com.google.common.collect.g0<Object, io.bidmachine.media3.exoplayer.source.b> f19407s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f19408t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long[][] f19409u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private IllegalMergeException f19410v;

    public static final class IllegalMergeException extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f19411a;

        public IllegalMergeException(int i10) {
            this.f19411a = i10;
        }
    }

    private static final class b extends m {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long[] f19412f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long[] f19413g;

        public b(u7.d0 d0Var, Map<Object, Long> map) {
            super(d0Var);
            int iP = d0Var.p();
            this.f19413g = new long[d0Var.p()];
            u7.d0.c cVar = new u7.d0.c();
            for (int i10 = 0; i10 < iP; i10++) {
                this.f19413g[i10] = d0Var.n(i10, cVar).f26047m;
            }
            int i11 = d0Var.i();
            this.f19412f = new long[i11];
            u7.d0.b bVar = new u7.d0.b();
            for (int i12 = 0; i12 < i11; i12++) {
                d0Var.g(i12, bVar, true);
                long jLongValue = ((Long) x7.a.e(map.get(bVar.f26019b))).longValue();
                long[] jArr = this.f19412f;
                jLongValue = jLongValue == Long.MIN_VALUE ? bVar.f26021d : jLongValue;
                jArr[i12] = jLongValue;
                long j10 = bVar.f26021d;
                if (j10 != -9223372036854775807L) {
                    long[] jArr2 = this.f19413g;
                    int i13 = bVar.f26020c;
                    jArr2[i13] = jArr2[i13] - (j10 - jLongValue);
                }
            }
        }

        @Override // io.bidmachine.media3.exoplayer.source.m, u7.d0
        public u7.d0.b g(int i10, u7.d0.b bVar, boolean z10) {
            super.g(i10, bVar, z10);
            bVar.f26021d = this.f19412f[i10];
            return bVar;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        @Override // io.bidmachine.media3.exoplayer.source.m, u7.d0
        public u7.d0.c o(int i10, u7.d0.c cVar, long j10) {
            long jMin;
            super.o(i10, cVar, j10);
            long j11 = this.f19413g[i10];
            cVar.f26047m = j11;
            if (j11 != -9223372036854775807L) {
                long j12 = cVar.f26046l;
                if (j12 == -9223372036854775807L) {
                    jMin = cVar.f26046l;
                } else {
                    jMin = Math.min(j12, j11);
                }
            } else {
                jMin = cVar.f26046l;
            }
            cVar.f26046l = jMin;
            return cVar;
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r.b f19414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final q f19415b;

        private c(r.b bVar, q qVar) {
            this.f19414a = bVar;
            this.f19415b = qVar;
        }
    }

    public MergingMediaSource(r... rVarArr) {
        this(false, rVarArr);
    }

    private void J() {
        u7.d0.b bVar = new u7.d0.b();
        for (int i10 = 0; i10 < this.f19408t; i10++) {
            long j10 = -this.f19403o[0].f(i10, bVar).n();
            int i11 = 1;
            while (true) {
                u7.d0[] d0VarArr = this.f19403o;
                if (i11 < d0VarArr.length) {
                    this.f19409u[i10][i11] = j10 - (-d0VarArr[i11].f(i10, bVar).n());
                    i11++;
                }
            }
        }
    }

    private void M() {
        u7.d0[] d0VarArr;
        u7.d0.b bVar = new u7.d0.b();
        for (int i10 = 0; i10 < this.f19408t; i10++) {
            int i11 = 0;
            long j10 = Long.MIN_VALUE;
            while (true) {
                d0VarArr = this.f19403o;
                if (i11 >= d0VarArr.length) {
                    break;
                }
                long j11 = d0VarArr[i11].f(i10, bVar).j();
                if (j11 != -9223372036854775807L) {
                    long j12 = j11 + this.f19409u[i10][i11];
                    if (j10 == Long.MIN_VALUE || j12 < j10) {
                        j10 = j12;
                    }
                }
                i11++;
            }
            Object objM = d0VarArr[0].m(i10);
            this.f19406r.put(objM, Long.valueOf(j10));
            Iterator<io.bidmachine.media3.exoplayer.source.b> it = this.f19407s.get(objM).iterator();
            while (it.hasNext()) {
                it.next().v(0L, j10);
            }
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.c, io.bidmachine.media3.exoplayer.source.a
    protected void B() {
        super.B();
        Arrays.fill(this.f19403o, (Object) null);
        this.f19408t = -1;
        this.f19410v = null;
        this.f19404p.clear();
        Collections.addAll(this.f19404p, this.f19401m);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.bidmachine.media3.exoplayer.source.c
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public r.b D(Integer num, r.b bVar) {
        List<c> list = this.f19402n.get(num.intValue());
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10).f19414a.equals(bVar)) {
                return this.f19402n.get(0).get(i10).f19414a;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.bidmachine.media3.exoplayer.source.c
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void G(Integer num, r rVar, u7.d0 d0Var) {
        if (this.f19410v != null) {
            return;
        }
        if (this.f19408t == -1) {
            this.f19408t = d0Var.i();
        } else if (d0Var.i() != this.f19408t) {
            this.f19410v = new IllegalMergeException(0);
            return;
        }
        if (this.f19409u.length == 0) {
            this.f19409u = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f19408t, this.f19403o.length);
        }
        this.f19404p.remove(rVar);
        this.f19403o[num.intValue()] = d0Var;
        if (this.f19404p.isEmpty()) {
            if (this.f19399k) {
                J();
            }
            u7.d0 bVar = this.f19403o[0];
            if (this.f19400l) {
                M();
                bVar = new b(bVar, this.f19406r);
            }
            A(bVar);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    public q a(r.b bVar, r8.b bVar2, long j10) {
        int length = this.f19401m.length;
        q[] qVarArr = new q[length];
        int iB = this.f19403o[0].b(bVar.f19684a);
        for (int i10 = 0; i10 < length; i10++) {
            r.b bVarA = bVar.a(this.f19403o[i10].m(iB));
            qVarArr[i10] = this.f19401m[i10].a(bVarA, bVar2, j10 - this.f19409u[iB][i10]);
            this.f19402n.get(i10).add(new c(bVarA, qVarArr[i10]));
        }
        v vVar = new v(this.f19405q, this.f19409u[iB], qVarArr);
        if (!this.f19400l) {
            return vVar;
        }
        io.bidmachine.media3.exoplayer.source.b bVar3 = new io.bidmachine.media3.exoplayer.source.b(vVar, false, 0L, ((Long) x7.a.e(this.f19406r.get(bVar.f19684a))).longValue());
        this.f19407s.put(bVar.f19684a, bVar3);
        return bVar3;
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    public u7.s e() {
        r[] rVarArr = this.f19401m;
        return rVarArr.length > 0 ? rVarArr[0].e() : f19398w;
    }

    @Override // io.bidmachine.media3.exoplayer.source.c, io.bidmachine.media3.exoplayer.source.r
    public void j() throws IOException {
        IllegalMergeException illegalMergeException = this.f19410v;
        if (illegalMergeException != null) {
            throw illegalMergeException;
        }
        super.j();
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    public void m(u7.s sVar) {
        this.f19401m[0].m(sVar);
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    public void n(q qVar) {
        if (this.f19400l) {
            io.bidmachine.media3.exoplayer.source.b bVar = (io.bidmachine.media3.exoplayer.source.b) qVar;
            for (Map.Entry<Object, io.bidmachine.media3.exoplayer.source.b> entry : this.f19407s.b()) {
                if (entry.getValue().equals(bVar)) {
                    this.f19407s.remove(entry.getKey(), entry.getValue());
                    break;
                }
            }
            qVar = bVar.f19427a;
        }
        v vVar = (v) qVar;
        for (int i10 = 0; i10 < this.f19401m.length; i10++) {
            List<c> list = this.f19402n.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                if (list.get(i11).f19415b.equals(qVar)) {
                    list.remove(i11);
                    break;
                }
            }
            this.f19401m[i10].n(vVar.n(i10));
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.c, io.bidmachine.media3.exoplayer.source.a
    protected void z(z7.o oVar) {
        super.z(oVar);
        for (int i10 = 0; i10 < this.f19401m.length; i10++) {
            I(Integer.valueOf(i10), this.f19401m[i10]);
        }
    }

    public MergingMediaSource(boolean z10, r... rVarArr) {
        this(z10, false, rVarArr);
    }

    public MergingMediaSource(boolean z10, boolean z11, r... rVarArr) {
        this(z10, z11, new n8.f(), rVarArr);
    }

    public MergingMediaSource(boolean z10, boolean z11, n8.e eVar, r... rVarArr) {
        this.f19399k = z10;
        this.f19400l = z11;
        this.f19401m = rVarArr;
        this.f19405q = eVar;
        this.f19404p = new ArrayList<>(Arrays.asList(rVarArr));
        this.f19408t = -1;
        this.f19402n = new ArrayList(rVarArr.length);
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            this.f19402n.add(new ArrayList());
        }
        this.f19403o = new u7.d0[rVarArr.length];
        this.f19409u = new long[0][];
        this.f19406r = new HashMap();
        this.f19407s = com.google.common.collect.h0.a().a().e();
    }
}
