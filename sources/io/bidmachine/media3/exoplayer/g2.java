package io.bidmachine.media3.exoplayer;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PlaylistTimeline.java */
/* JADX INFO: loaded from: classes4.dex */
final class g2 extends b8.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f18652h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f18653i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f18654j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f18655k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final u7.d0[] f18656l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object[] f18657m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final HashMap<Object, Integer> f18658n;

    /* JADX INFO: compiled from: PlaylistTimeline.java */
    class a extends io.bidmachine.media3.exoplayer.source.m {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final u7.d0.c f18659f;

        a(u7.d0 d0Var) {
            super(d0Var);
            this.f18659f = new u7.d0.c();
        }

        @Override // io.bidmachine.media3.exoplayer.source.m, u7.d0
        public u7.d0.b g(int i10, u7.d0.b bVar, boolean z10) {
            u7.d0.b bVarG = super.g(i10, bVar, z10);
            if (super.n(bVarG.f26020c, this.f18659f).f()) {
                bVarG.t(bVar.f26018a, bVar.f26019b, bVar.f26020c, bVar.f26021d, bVar.f26022e, u7.b.f25944g, true);
            } else {
                bVarG.f26023f = true;
            }
            return bVarG;
        }
    }

    public g2(Collection<? extends p1> collection, n8.t tVar) {
        this(G(collection), H(collection), tVar);
    }

    private static u7.d0[] G(Collection<? extends p1> collection) {
        u7.d0[] d0VarArr = new u7.d0[collection.size()];
        Iterator<? extends p1> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            d0VarArr[i10] = it.next().b();
            i10++;
        }
        return d0VarArr;
    }

    private static Object[] H(Collection<? extends p1> collection) {
        Object[] objArr = new Object[collection.size()];
        Iterator<? extends p1> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            objArr[i10] = it.next().a();
            i10++;
        }
        return objArr;
    }

    @Override // b8.a
    protected int A(int i10) {
        return this.f18655k[i10];
    }

    @Override // b8.a
    protected u7.d0 D(int i10) {
        return this.f18656l[i10];
    }

    public g2 E(n8.t tVar) {
        u7.d0[] d0VarArr = new u7.d0[this.f18656l.length];
        int i10 = 0;
        while (true) {
            u7.d0[] d0VarArr2 = this.f18656l;
            if (i10 >= d0VarArr2.length) {
                return new g2(d0VarArr, this.f18657m, tVar);
            }
            d0VarArr[i10] = new a(d0VarArr2[i10]);
            i10++;
        }
    }

    List<u7.d0> F() {
        return Arrays.asList(this.f18656l);
    }

    @Override // u7.d0
    public int i() {
        return this.f18653i;
    }

    @Override // u7.d0
    public int p() {
        return this.f18652h;
    }

    @Override // b8.a
    protected int s(Object obj) {
        Integer num = this.f18658n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // b8.a
    protected int t(int i10) {
        return x7.l0.g(this.f18654j, i10 + 1, false, false);
    }

    @Override // b8.a
    protected int u(int i10) {
        return x7.l0.g(this.f18655k, i10 + 1, false, false);
    }

    @Override // b8.a
    protected Object x(int i10) {
        return this.f18657m[i10];
    }

    @Override // b8.a
    protected int z(int i10) {
        return this.f18654j[i10];
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private g2(u7.d0[] d0VarArr, Object[] objArr, n8.t tVar) {
        super(false, tVar);
        int i10 = 0;
        int length = d0VarArr.length;
        this.f18656l = d0VarArr;
        this.f18654j = new int[length];
        this.f18655k = new int[length];
        this.f18657m = objArr;
        this.f18658n = new HashMap<>();
        int length2 = d0VarArr.length;
        int iP = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length2) {
            u7.d0 d0Var = d0VarArr[i10];
            this.f18656l[i12] = d0Var;
            this.f18655k[i12] = iP;
            this.f18654j[i12] = i11;
            iP += d0Var.p();
            i11 += this.f18656l[i12].i();
            this.f18658n.put(objArr[i12], Integer.valueOf(i12));
            i10++;
            i12++;
        }
        this.f18652h = iP;
        this.f18653i = i11;
    }
}
