package io.bidmachine.media3.exoplayer.source;

import io.bidmachine.media3.exoplayer.k1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: compiled from: MergingMediaPeriod.java */
/* JADX INFO: loaded from: classes4.dex */
final class v implements q, q.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q[] f19695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean[] f19696b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n8.e f19698d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private q.a f19701g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private n8.x f19702h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private g0 f19704j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayList<q> f19699e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap<u7.e0, u7.e0> f19700f = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IdentityHashMap<n8.s, Integer> f19697c = new IdentityHashMap<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private q[] f19703i = new q[0];

    /* JADX INFO: compiled from: MergingMediaPeriod.java */
    private static final class a implements q8.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q8.q f19705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final u7.e0 f19706b;

        public a(q8.q qVar, u7.e0 e0Var) {
            this.f19705a = qVar;
            this.f19706b = e0Var;
        }

        @Override // q8.q
        public boolean a(int i10, long j10) {
            return this.f19705a.a(i10, j10);
        }

        @Override // q8.q
        public int b() {
            return this.f19705a.b();
        }

        @Override // q8.t
        public int c(u7.q qVar) {
            return this.f19705a.k(this.f19706b.b(qVar));
        }

        @Override // q8.q
        public void d() {
            this.f19705a.d();
        }

        @Override // q8.t
        public u7.q e(int i10) {
            return this.f19706b.a(this.f19705a.f(i10));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f19705a.equals(aVar.f19705a) && this.f19706b.equals(aVar.f19706b);
        }

        @Override // q8.t
        public int f(int i10) {
            return this.f19705a.f(i10);
        }

        @Override // q8.q
        public boolean g(int i10, long j10) {
            return this.f19705a.g(i10, j10);
        }

        @Override // q8.q
        public void h(float f10) {
            this.f19705a.h(f10);
        }

        public int hashCode() {
            return ((527 + this.f19706b.hashCode()) * 31) + this.f19705a.hashCode();
        }

        @Override // q8.q
        public Object i() {
            return this.f19705a.i();
        }

        @Override // q8.q
        public void j() {
            this.f19705a.j();
        }

        @Override // q8.t
        public int k(int i10) {
            return this.f19705a.k(i10);
        }

        @Override // q8.q
        public void l(long j10, long j11, long j12, List<? extends o8.m> list, o8.n[] nVarArr) {
            this.f19705a.l(j10, j11, j12, list, nVarArr);
        }

        @Override // q8.t
        public int length() {
            return this.f19705a.length();
        }

        @Override // q8.t
        public u7.e0 m() {
            return this.f19706b;
        }

        @Override // q8.q
        public void n(boolean z10) {
            this.f19705a.n(z10);
        }

        @Override // q8.q
        public void o() {
            this.f19705a.o();
        }

        @Override // q8.q
        public int p(long j10, List<? extends o8.m> list) {
            return this.f19705a.p(j10, list);
        }

        @Override // q8.q
        public int q() {
            return this.f19705a.q();
        }

        @Override // q8.q
        public boolean r(long j10, o8.e eVar, List<? extends o8.m> list) {
            return this.f19705a.r(j10, eVar, list);
        }

        @Override // q8.q
        public u7.q s() {
            return this.f19706b.a(this.f19705a.q());
        }

        @Override // q8.q
        public int t() {
            return this.f19705a.t();
        }

        @Override // q8.q
        public void u() {
            this.f19705a.u();
        }
    }

    public v(n8.e eVar, long[] jArr, q... qVarArr) {
        this.f19698d = eVar;
        this.f19695a = qVarArr;
        this.f19704j = eVar.empty();
        this.f19696b = new boolean[qVarArr.length];
        for (int i10 = 0; i10 < qVarArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.f19696b[i10] = true;
                this.f19695a[i10] = new k0(qVarArr[i10], j10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List o(q qVar) {
        return qVar.t().c();
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public long b() {
        return this.f19704j.b();
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public boolean c(k1 k1Var) {
        if (this.f19699e.isEmpty()) {
            return this.f19704j.c(k1Var);
        }
        int size = this.f19699e.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f19699e.get(i10).c(k1Var);
        }
        return false;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public long d(long j10, b8.a0 a0Var) {
        q[] qVarArr = this.f19703i;
        return (qVarArr.length > 0 ? qVarArr[0] : this.f19695a[0]).d(j10, a0Var);
    }

    @Override // io.bidmachine.media3.exoplayer.source.q.a
    public void e(q qVar) {
        this.f19699e.remove(qVar);
        if (!this.f19699e.isEmpty()) {
            return;
        }
        int i10 = 0;
        for (q qVar2 : this.f19695a) {
            i10 += qVar2.t().f22837a;
        }
        u7.e0[] e0VarArr = new u7.e0[i10];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            q[] qVarArr = this.f19695a;
            if (i11 >= qVarArr.length) {
                this.f19702h = new n8.x(e0VarArr);
                ((q.a) x7.a.e(this.f19701g)).e(this);
                return;
            }
            n8.x xVarT = qVarArr[i11].t();
            int i13 = xVarT.f22837a;
            int i14 = 0;
            while (i14 < i13) {
                u7.e0 e0VarB = xVarT.b(i14);
                u7.q[] qVarArr2 = new u7.q[e0VarB.f26054a];
                for (int i15 = 0; i15 < e0VarB.f26054a; i15++) {
                    u7.q qVarA = e0VarB.a(i15);
                    u7.q.b bVarB = qVarA.b();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i11);
                    sb2.append(":");
                    String str = qVarA.f26238a;
                    if (str == null) {
                        str = "";
                    }
                    sb2.append(str);
                    qVarArr2[i15] = bVarB.f0(sb2.toString()).N();
                }
                u7.e0 e0Var = new u7.e0(i11 + ":" + e0VarB.f26055b, qVarArr2);
                this.f19700f.put(e0Var, e0VarB);
                e0VarArr[i12] = e0Var;
                i14++;
                i12++;
            }
            i11++;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public long f() {
        return this.f19704j.f();
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public void g(long j10) {
        this.f19704j.g(j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.bidmachine.media3.exoplayer.source.q
    public long i(q8.q[] qVarArr, boolean[] zArr, n8.s[] sVarArr, boolean[] zArr2, long j10) {
        Integer num;
        int[] iArr = new int[qVarArr.length];
        int[] iArr2 = new int[qVarArr.length];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            num = null;
            if (i11 >= qVarArr.length) {
                break;
            }
            n8.s sVar = sVarArr[i11];
            num = sVar != null ? this.f19697c.get(sVar) : null;
            iArr[i11] = num == null ? -1 : num.intValue();
            q8.q qVar = qVarArr[i11];
            if (qVar != null) {
                String str = qVar.m().f26055b;
                iArr2[i11] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i11] = -1;
            }
            i11++;
        }
        this.f19697c.clear();
        int length = qVarArr.length;
        n8.s[] sVarArr2 = new n8.s[length];
        n8.s[] sVarArr3 = new n8.s[qVarArr.length];
        Object[] objArr = new q8.q[qVarArr.length];
        ArrayList arrayList = new ArrayList(this.f19695a.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < this.f19695a.length) {
            for (int i13 = i10; i13 < qVarArr.length; i13++) {
                sVarArr3[i13] = iArr[i13] == i12 ? sVarArr[i13] : num;
                if (iArr2[i13] == i12) {
                    q8.q qVar2 = (q8.q) x7.a.e(qVarArr[i13]);
                    objArr[i13] = new a(qVar2, (u7.e0) x7.a.e(this.f19700f.get(qVar2.m())));
                } else {
                    objArr[i13] = num;
                }
            }
            int i14 = i12;
            ArrayList arrayList2 = arrayList;
            Object[] objArr2 = objArr;
            long jI = this.f19695a[i12].i(objArr, zArr, sVarArr3, zArr2, j11);
            if (i14 == 0) {
                j11 = jI;
            } else if (jI != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < qVarArr.length; i15++) {
                if (iArr2[i15] == i14) {
                    n8.s sVar2 = (n8.s) x7.a.e(sVarArr3[i15]);
                    sVarArr2[i15] = sVarArr3[i15];
                    this.f19697c.put(sVar2, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr[i15] == i14) {
                    x7.a.g(sVarArr3[i15] == 0);
                }
            }
            if (z10) {
                arrayList2.add(this.f19695a[i14]);
            }
            i12 = i14 + 1;
            arrayList = arrayList2;
            objArr = objArr2;
            i10 = 0;
            num = null;
        }
        int i16 = i10;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(sVarArr2, i16, sVarArr, i16, length);
        this.f19703i = (q[]) arrayList3.toArray(new q[i16]);
        this.f19704j = this.f19698d.a(arrayList3, com.google.common.collect.b0.m(arrayList3, new com.google.common.base.g() { // from class: io.bidmachine.media3.exoplayer.source.u
            @Override // com.google.common.base.g
            public final Object apply(Object obj) {
                return v.o((q) obj);
            }
        }));
        return j11;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public boolean isLoading() {
        return this.f19704j.isLoading();
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public long j(long j10) {
        long j11 = this.f19703i[0].j(j10);
        int i10 = 1;
        while (true) {
            q[] qVarArr = this.f19703i;
            if (i10 >= qVarArr.length) {
                return j11;
            }
            if (qVarArr[i10].j(j11) != j11) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public long k() {
        long j10 = -9223372036854775807L;
        for (q qVar : this.f19703i) {
            long jK = qVar.k();
            if (jK == -9223372036854775807L) {
                if (j10 != -9223372036854775807L && qVar.j(j10) != j10) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j10 == -9223372036854775807L) {
                for (q qVar2 : this.f19703i) {
                    if (qVar2 == qVar) {
                        break;
                    }
                    if (qVar2.j(jK) != jK) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j10 = jK;
            } else if (jK != j10) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j10;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public void l(q.a aVar, long j10) {
        this.f19701g = aVar;
        Collections.addAll(this.f19699e, this.f19695a);
        for (q qVar : this.f19695a) {
            qVar.l(this, j10);
        }
    }

    public q n(int i10) {
        return this.f19696b[i10] ? ((k0) this.f19695a[i10]).a() : this.f19695a[i10];
    }

    @Override // io.bidmachine.media3.exoplayer.source.g0.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void h(q qVar) {
        ((q.a) x7.a.e(this.f19701g)).h(this);
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public void q() throws IOException {
        for (q qVar : this.f19695a) {
            qVar.q();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public n8.x t() {
        return (n8.x) x7.a.e(this.f19702h);
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public void u(long j10, boolean z10) {
        for (q qVar : this.f19703i) {
            qVar.u(j10, z10);
        }
    }
}
