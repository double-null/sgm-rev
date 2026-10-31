package io.bidmachine.media3.exoplayer.hls;

import android.net.Uri;
import android.text.TextUtils;
import b8.a0;
import c8.b2;
import com.google.common.collect.b0;
import com.google.common.collect.u;
import io.bidmachine.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import io.bidmachine.media3.exoplayer.k1;
import io.bidmachine.media3.exoplayer.source.g0;
import io.bidmachine.media3.exoplayer.source.q;
import io.bidmachine.media3.exoplayer.source.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import n8.x;
import u7.e0;
import u7.r;
import u7.v;
import u7.w;
import x7.l0;
import z7.o;

/* JADX INFO: compiled from: HlsMediaPeriod.java */
/* JADX INFO: loaded from: classes4.dex */
final class g implements q, HlsPlaylistTracker.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h8.e f18770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HlsPlaylistTracker f18771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h8.d f18772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o f18773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.bidmachine.media3.exoplayer.drm.i f18774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final io.bidmachine.media3.exoplayer.drm.h.a f18775f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.bidmachine.media3.exoplayer.upstream.b f18776g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final s.a f18777h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final r8.b f18778i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final n8.e f18781l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f18782m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f18783n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f18784o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final b2 f18785p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final long f18787r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private q.a f18788s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f18789t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private x f18790u;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f18794y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private g0 f18795z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final l.b f18786q = new b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final IdentityHashMap<n8.s, Integer> f18779j = new IdentityHashMap<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final h8.i f18780k = new h8.i();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private l[] f18791v = new l[0];

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private l[] f18792w = new l[0];

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int[][] f18793x = new int[0][];

    /* JADX INFO: compiled from: HlsMediaPeriod.java */
    private class b implements l.b {
        private b() {
        }

        @Override // io.bidmachine.media3.exoplayer.source.g0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void h(l lVar) {
            g.this.f18788s.h(g.this);
        }

        @Override // io.bidmachine.media3.exoplayer.hls.l.b
        public void m(Uri uri) {
            g.this.f18771b.g(uri);
        }

        @Override // io.bidmachine.media3.exoplayer.hls.l.b
        public void onPrepared() {
            if (g.m(g.this) > 0) {
                return;
            }
            int i10 = 0;
            for (l lVar : g.this.f18791v) {
                i10 += lVar.t().f22837a;
            }
            e0[] e0VarArr = new e0[i10];
            int i11 = 0;
            for (l lVar2 : g.this.f18791v) {
                int i12 = lVar2.t().f22837a;
                int i13 = 0;
                while (i13 < i12) {
                    e0VarArr[i11] = lVar2.t().b(i13);
                    i13++;
                    i11++;
                }
            }
            g.this.f18790u = new x(e0VarArr);
            g.this.f18788s.e(g.this);
        }
    }

    public g(h8.e eVar, HlsPlaylistTracker hlsPlaylistTracker, h8.d dVar, o oVar, r8.e eVar2, io.bidmachine.media3.exoplayer.drm.i iVar, io.bidmachine.media3.exoplayer.drm.h.a aVar, io.bidmachine.media3.exoplayer.upstream.b bVar, s.a aVar2, r8.b bVar2, n8.e eVar3, boolean z10, int i10, boolean z11, b2 b2Var, long j10) {
        this.f18770a = eVar;
        this.f18771b = hlsPlaylistTracker;
        this.f18772c = dVar;
        this.f18773d = oVar;
        this.f18774e = iVar;
        this.f18775f = aVar;
        this.f18776g = bVar;
        this.f18777h = aVar2;
        this.f18778i = bVar2;
        this.f18781l = eVar3;
        this.f18782m = z10;
        this.f18783n = i10;
        this.f18784o = z11;
        this.f18785p = b2Var;
        this.f18787r = j10;
        this.f18795z = eVar3.empty();
    }

    private static u7.q A(u7.q qVar) {
        String strS = l0.S(qVar.f26248k, 2);
        return new u7.q.b().f0(qVar.f26238a).h0(qVar.f26239b).i0(qVar.f26240c).U(qVar.f26251n).u0(w.g(strS)).S(strS).n0(qVar.f26249l).Q(qVar.f26245h).p0(qVar.f26246i).B0(qVar.f26259v).d0(qVar.f26260w).b0(qVar.f26261x).w0(qVar.f26242e).s0(qVar.f26243f).N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List B(l lVar) {
        return lVar.t().c();
    }

    static /* synthetic */ int m(g gVar) {
        int i10 = gVar.f18789t - 1;
        gVar.f18789t = i10;
        return i10;
    }

    private void s(long j10, List<io.bidmachine.media3.exoplayer.hls.playlist.d.a> list, List<l> list2, List<int[]> list3, Map<String, u7.l> map) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10).f18994d;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z10 = true;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    if (Objects.equals(str, list.get(i11).f18994d)) {
                        io.bidmachine.media3.exoplayer.hls.playlist.d.a aVar = list.get(i11);
                        arrayList3.add(Integer.valueOf(i11));
                        arrayList.add(aVar.f18991a);
                        arrayList2.add(aVar.f18992b);
                        z10 &= l0.R(aVar.f18992b.f26248k, 1) == 1;
                    }
                }
                String str2 = "audio:" + str;
                l lVarX = x(str2, 1, (Uri[]) arrayList.toArray((Uri[]) l0.j(new Uri[0])), (u7.q[]) arrayList2.toArray(new u7.q[0]), null, Collections.emptyList(), map, j10);
                list3.add(com.google.common.primitives.f.m(arrayList3));
                list2.add(lVarX);
                if (this.f18782m && z10) {
                    lVarX.g0(new e0[]{new e0(str2, (u7.q[]) arrayList2.toArray(new u7.q[0]))}, 0, new int[0]);
                }
            }
        }
    }

    private void v(io.bidmachine.media3.exoplayer.hls.playlist.d dVar, long j10, List<l> list, List<int[]> list2, Map<String, u7.l> map) {
        int i10;
        boolean z10;
        boolean z11;
        int size = dVar.f18982e.size();
        int[] iArr = new int[size];
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < dVar.f18982e.size(); i13++) {
            u7.q qVar = dVar.f18982e.get(i13).f18996b;
            if (qVar.f26260w > 0 || l0.S(qVar.f26248k, 2) != null) {
                iArr[i13] = 2;
                i11++;
            } else if (l0.S(qVar.f26248k, 1) != null) {
                iArr[i13] = 1;
                i12++;
            } else {
                iArr[i13] = -1;
            }
        }
        if (i11 > 0) {
            i10 = i11;
            z11 = false;
            z10 = true;
        } else if (i12 < size) {
            i10 = size - i12;
            z10 = false;
            z11 = true;
        } else {
            i10 = size;
            z10 = false;
            z11 = false;
        }
        Uri[] uriArr = new Uri[i10];
        u7.q[] qVarArr = new u7.q[i10];
        int[] iArr2 = new int[i10];
        int i14 = 0;
        for (int i15 = 0; i15 < dVar.f18982e.size(); i15++) {
            if ((!z10 || iArr[i15] == 2) && (!z11 || iArr[i15] != 1)) {
                io.bidmachine.media3.exoplayer.hls.playlist.d.b bVar = dVar.f18982e.get(i15);
                uriArr[i14] = bVar.f18995a;
                qVarArr[i14] = bVar.f18996b;
                iArr2[i14] = i15;
                i14++;
            }
        }
        String str = qVarArr[0].f26248k;
        int iR = l0.R(str, 2);
        int iR2 = l0.R(str, 1);
        boolean z12 = (iR2 == 1 || (iR2 == 0 && dVar.f18984g.isEmpty())) && iR <= 1 && iR2 + iR > 0;
        l lVarX = x("main", (z10 || iR2 <= 0) ? 0 : 1, uriArr, qVarArr, dVar.f18987j, dVar.f18988k, map, j10);
        list.add(lVarX);
        list2.add(iArr2);
        if (this.f18782m && z12) {
            ArrayList arrayList = new ArrayList();
            if (iR > 0) {
                u7.q[] qVarArr2 = new u7.q[i10];
                for (int i16 = 0; i16 < i10; i16++) {
                    qVarArr2[i16] = A(qVarArr[i16]);
                }
                arrayList.add(new e0("main", qVarArr2));
                if (iR2 > 0 && (dVar.f18987j != null || dVar.f18984g.isEmpty())) {
                    arrayList.add(new e0("main:audio", y(qVarArr[0], dVar.f18987j, false)));
                }
                List<u7.q> list3 = dVar.f18988k;
                if (list3 != null) {
                    for (int i17 = 0; i17 < list3.size(); i17++) {
                        arrayList.add(new e0("main:cc:" + i17, this.f18770a.d(list3.get(i17))));
                    }
                }
            } else {
                u7.q[] qVarArr3 = new u7.q[i10];
                for (int i18 = 0; i18 < i10; i18++) {
                    qVarArr3[i18] = y(qVarArr[i18], dVar.f18987j, true);
                }
                arrayList.add(new e0("main", qVarArr3));
            }
            e0 e0Var = new e0("main:id3", new u7.q.b().f0("ID3").u0("application/id3").N());
            arrayList.add(e0Var);
            lVarX.g0((e0[]) arrayList.toArray(new e0[0]), 0, arrayList.indexOf(e0Var));
        }
    }

    private void w(long j10) {
        io.bidmachine.media3.exoplayer.hls.playlist.d dVar = (io.bidmachine.media3.exoplayer.hls.playlist.d) x7.a.e(this.f18771b.f());
        Map<String, u7.l> mapZ = this.f18784o ? z(dVar.f18990m) : Collections.emptyMap();
        boolean z10 = !dVar.f18982e.isEmpty();
        List<io.bidmachine.media3.exoplayer.hls.playlist.d.a> list = dVar.f18984g;
        List<io.bidmachine.media3.exoplayer.hls.playlist.d.a> list2 = dVar.f18985h;
        this.f18789t = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (z10) {
            v(dVar, j10, arrayList, arrayList2, mapZ);
        }
        s(j10, list, arrayList, arrayList2, mapZ);
        this.f18794y = arrayList.size();
        int i10 = 0;
        while (i10 < list2.size()) {
            io.bidmachine.media3.exoplayer.hls.playlist.d.a aVar = list2.get(i10);
            String str = "subtitle:" + i10 + ":" + aVar.f18994d;
            u7.q qVar = aVar.f18992b;
            ArrayList arrayList3 = arrayList2;
            int i11 = i10;
            l lVarX = x(str, 3, new Uri[]{aVar.f18991a}, new u7.q[]{qVar}, null, Collections.emptyList(), mapZ, j10);
            arrayList3.add(new int[]{i11});
            arrayList.add(lVarX);
            lVarX.g0(new e0[]{new e0(str, this.f18770a.d(qVar))}, 0, new int[0]);
            i10 = i11 + 1;
            arrayList2 = arrayList3;
        }
        this.f18791v = (l[]) arrayList.toArray(new l[0]);
        this.f18793x = (int[][]) arrayList2.toArray(new int[0][]);
        this.f18789t = this.f18791v.length;
        for (int i12 = 0; i12 < this.f18794y; i12++) {
            this.f18791v[i12].p0(true);
        }
        for (l lVar : this.f18791v) {
            lVar.C();
        }
        this.f18792w = this.f18791v;
    }

    private l x(String str, int i10, Uri[] uriArr, u7.q[] qVarArr, u7.q qVar, List<u7.q> list, Map<String, u7.l> map, long j10) {
        return new l(str, i10, this.f18786q, new c(this.f18770a, this.f18771b, uriArr, qVarArr, this.f18772c, this.f18773d, this.f18780k, this.f18787r, list, this.f18785p, null), map, this.f18778i, j10, qVar, this.f18774e, this.f18775f, this.f18776g, this.f18777h, this.f18783n);
    }

    private static u7.q y(u7.q qVar, u7.q qVar2, boolean z10) {
        v vVar;
        int i10;
        String str;
        int i11;
        int i12;
        String str2;
        String str3;
        List<r> list;
        List<r> listH = u.H();
        if (qVar2 != null) {
            str3 = qVar2.f26248k;
            vVar = qVar2.f26249l;
            i11 = qVar2.E;
            i10 = qVar2.f26242e;
            i12 = qVar2.f26243f;
            str = qVar2.f26241d;
            str2 = qVar2.f26239b;
            list = qVar2.f26240c;
        } else {
            String strS = l0.S(qVar.f26248k, 1);
            vVar = qVar.f26249l;
            if (z10) {
                i11 = qVar.E;
                i10 = qVar.f26242e;
                i12 = qVar.f26243f;
                str = qVar.f26241d;
                str2 = qVar.f26239b;
                listH = qVar.f26240c;
            } else {
                i10 = 0;
                str = null;
                i11 = -1;
                i12 = 0;
                str2 = null;
            }
            List<r> list2 = listH;
            str3 = strS;
            list = list2;
        }
        return new u7.q.b().f0(qVar.f26238a).h0(str2).i0(list).U(qVar.f26251n).u0(w.g(str3)).S(str3).n0(vVar).Q(z10 ? qVar.f26245h : -1).p0(z10 ? qVar.f26246i : -1).R(i11).w0(i10).s0(i12).j0(str).N();
    }

    private static Map<String, u7.l> z(List<u7.l> list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap map = new HashMap();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            u7.l lVarF = list.get(i10);
            String str = lVarF.f26195c;
            i10++;
            int i11 = i10;
            while (i11 < arrayList.size()) {
                u7.l lVar = (u7.l) arrayList.get(i11);
                if (TextUtils.equals(lVar.f26195c, str)) {
                    lVarF = lVarF.f(lVar);
                    arrayList.remove(i11);
                } else {
                    i11++;
                }
            }
            map.put(str, lVarF);
        }
        return map;
    }

    public void C() {
        this.f18771b.i(this);
        for (l lVar : this.f18791v) {
            lVar.i0();
        }
        this.f18788s = null;
    }

    @Override // io.bidmachine.media3.exoplayer.hls.playlist.HlsPlaylistTracker.b
    public void a() {
        for (l lVar : this.f18791v) {
            lVar.e0();
        }
        this.f18788s.h(this);
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public long b() {
        return this.f18795z.b();
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public boolean c(k1 k1Var) {
        if (this.f18790u != null) {
            return this.f18795z.c(k1Var);
        }
        for (l lVar : this.f18791v) {
            lVar.C();
        }
        return false;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public long d(long j10, a0 a0Var) {
        for (l lVar : this.f18792w) {
            if (lVar.S()) {
                return lVar.d(j10, a0Var);
            }
        }
        return j10;
    }

    @Override // io.bidmachine.media3.exoplayer.hls.playlist.HlsPlaylistTracker.b
    public boolean e(Uri uri, io.bidmachine.media3.exoplayer.upstream.b.c cVar, boolean z10) {
        boolean zD0 = true;
        for (l lVar : this.f18791v) {
            zD0 &= lVar.d0(uri, cVar, z10);
        }
        this.f18788s.h(this);
        return zD0;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public long f() {
        return this.f18795z.f();
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public void g(long j10) {
        this.f18795z.g(j10);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00df  */
    @Override // io.bidmachine.media3.exoplayer.source.q
    public long i(q8.q[] qVarArr, boolean[] zArr, n8.s[] sVarArr, boolean[] zArr2, long j10) {
        n8.s[] sVarArr2 = sVarArr;
        int[] iArr = new int[qVarArr.length];
        int[] iArr2 = new int[qVarArr.length];
        for (int i10 = 0; i10 < qVarArr.length; i10++) {
            n8.s sVar = sVarArr2[i10];
            iArr[i10] = sVar == null ? -1 : this.f18779j.get(sVar).intValue();
            iArr2[i10] = -1;
            q8.q qVar = qVarArr[i10];
            if (qVar != null) {
                e0 e0VarM = qVar.m();
                int i11 = 0;
                while (true) {
                    l[] lVarArr = this.f18791v;
                    if (i11 >= lVarArr.length) {
                        break;
                    }
                    if (lVarArr[i11].t().d(e0VarM) != -1) {
                        iArr2[i10] = i11;
                        break;
                    }
                    i11++;
                }
            }
        }
        this.f18779j.clear();
        int length = qVarArr.length;
        n8.s[] sVarArr3 = new n8.s[length];
        n8.s[] sVarArr4 = new n8.s[qVarArr.length];
        q8.q[] qVarArr2 = new q8.q[qVarArr.length];
        l[] lVarArr2 = new l[this.f18791v.length];
        int i12 = 0;
        int i13 = 0;
        boolean z10 = false;
        while (i13 < this.f18791v.length) {
            for (int i14 = 0; i14 < qVarArr.length; i14++) {
                q8.q qVar2 = null;
                sVarArr4[i14] = iArr[i14] == i13 ? sVarArr2[i14] : null;
                if (iArr2[i14] == i13) {
                    qVar2 = qVarArr[i14];
                }
                qVarArr2[i14] = qVar2;
            }
            l lVar = this.f18791v[i13];
            int i15 = i12;
            int i16 = length;
            int i17 = i13;
            q8.q[] qVarArr3 = qVarArr2;
            l[] lVarArr3 = lVarArr2;
            boolean zM0 = lVar.m0(qVarArr2, zArr, sVarArr4, zArr2, j10, z10);
            int i18 = 0;
            boolean z11 = false;
            while (true) {
                if (i18 >= qVarArr.length) {
                    break;
                }
                n8.s sVar2 = sVarArr4[i18];
                if (iArr2[i18] == i17) {
                    x7.a.e(sVar2);
                    sVarArr3[i18] = sVar2;
                    this.f18779j.put(sVar2, Integer.valueOf(i17));
                    z11 = true;
                } else if (iArr[i18] == i17) {
                    x7.a.g(sVar2 == null);
                }
                i18++;
            }
            if (z11) {
                lVarArr3[i15] = lVar;
                i12 = i15 + 1;
                if (i15 == 0) {
                    lVar.p0(true);
                    if (zM0) {
                        this.f18780k.b();
                        z10 = true;
                    } else {
                        l[] lVarArr4 = this.f18792w;
                        if (lVarArr4.length == 0 || lVar != lVarArr4[0]) {
                            this.f18780k.b();
                            z10 = true;
                        }
                    }
                } else {
                    lVar.p0(i17 < this.f18794y);
                }
            } else {
                i12 = i15;
            }
            i13 = i17 + 1;
            sVarArr2 = sVarArr;
            lVarArr2 = lVarArr3;
            length = i16;
            qVarArr2 = qVarArr3;
        }
        System.arraycopy(sVarArr3, 0, sVarArr2, 0, length);
        l[] lVarArr5 = (l[]) l0.Y0(lVarArr2, i12);
        this.f18792w = lVarArr5;
        u uVarD = u.D(lVarArr5);
        this.f18795z = this.f18781l.a(uVarD, b0.m(uVarD, new com.google.common.base.g() { // from class: io.bidmachine.media3.exoplayer.hls.f
            @Override // com.google.common.base.g
            public final Object apply(Object obj) {
                return g.B((l) obj);
            }
        }));
        return j10;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public boolean isLoading() {
        return this.f18795z.isLoading();
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public long j(long j10) {
        l[] lVarArr = this.f18792w;
        if (lVarArr.length > 0) {
            boolean zL0 = lVarArr[0].l0(j10, false);
            int i10 = 1;
            while (true) {
                l[] lVarArr2 = this.f18792w;
                if (i10 >= lVarArr2.length) {
                    break;
                }
                lVarArr2[i10].l0(j10, zL0);
                i10++;
            }
            if (zL0) {
                this.f18780k.b();
            }
        }
        return j10;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public long k() {
        return -9223372036854775807L;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public void l(q.a aVar, long j10) {
        this.f18788s = aVar;
        this.f18771b.c(this);
        w(j10);
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public void q() throws IOException {
        for (l lVar : this.f18791v) {
            lVar.q();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public x t() {
        return (x) x7.a.e(this.f18790u);
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public void u(long j10, boolean z10) {
        for (l lVar : this.f18792w) {
            lVar.u(j10, z10);
        }
    }
}
