package io.bidmachine.media3.exoplayer.dash;

import android.util.Pair;
import android.util.SparseArray;
import b8.a0;
import c8.b2;
import com.applovin.shadow.okio.internal.MoA.edUJlCZxhVnO;
import com.google.common.collect.b0;
import com.google.common.collect.f0;
import com.google.common.collect.u;
import f8.g;
import f8.j;
import io.bidmachine.media3.exoplayer.drm.i;
import io.bidmachine.media3.exoplayer.k1;
import io.bidmachine.media3.exoplayer.source.g0;
import io.bidmachine.media3.exoplayer.source.q;
import io.bidmachine.media3.exoplayer.source.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n8.x;
import o8.h;
import r8.k;
import u7.e0;
import x7.l0;
import z7.o;

/* JADX INFO: compiled from: DashMediaPeriod.java */
/* JADX INFO: loaded from: classes4.dex */
final class c implements q, g0.a<h<io.bidmachine.media3.exoplayer.dash.a>>, h.b<io.bidmachine.media3.exoplayer.dash.a> {
    private static final Pattern A = Pattern.compile(edUJlCZxhVnO.hIkGH);
    private static final Pattern B = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f18398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.bidmachine.media3.exoplayer.dash.a.InterfaceC0322a f18399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o f18400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f18401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.bidmachine.media3.exoplayer.upstream.b f18402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e8.b f18403f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f18404g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final k f18405h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final r8.b f18406i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final x f18407j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final a[] f18408k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final n8.e f18409l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final f f18410m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final s.a f18412o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final io.bidmachine.media3.exoplayer.drm.h.a f18413p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final b2 f18414q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private q.a f18415r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private g0 f18418u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private f8.c f18419v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f18420w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private List<f8.f> f18421x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f18423z;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f18422y = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private h<io.bidmachine.media3.exoplayer.dash.a>[] f18416s = H(0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private e[] f18417t = new e[0];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final IdentityHashMap<h<io.bidmachine.media3.exoplayer.dash.a>, f.c> f18411n = new IdentityHashMap<>();

    /* JADX INFO: compiled from: DashMediaPeriod.java */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f18424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18425b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f18426c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f18427d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f18428e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f18429f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f18430g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final u<u7.q> f18431h;

        private a(int i10, int i11, int[] iArr, int i12, int i13, int i14, int i15, u<u7.q> uVar) {
            this.f18425b = i10;
            this.f18424a = iArr;
            this.f18426c = i11;
            this.f18428e = i12;
            this.f18429f = i13;
            this.f18430g = i14;
            this.f18427d = i15;
            this.f18431h = uVar;
        }

        public static a a(int[] iArr, int i10, u<u7.q> uVar) {
            return new a(3, 1, iArr, i10, -1, -1, -1, uVar);
        }

        public static a b(int[] iArr, int i10) {
            return new a(5, 1, iArr, i10, -1, -1, -1, u.H());
        }

        public static a c(int i10) {
            return new a(5, 2, new int[0], -1, -1, -1, i10, u.H());
        }

        public static a d(int i10, int[] iArr, int i11, int i12, int i13) {
            return new a(i10, 0, iArr, i11, i12, i13, -1, u.H());
        }
    }

    public c(int i10, f8.c cVar, e8.b bVar, int i11, io.bidmachine.media3.exoplayer.dash.a.InterfaceC0322a interfaceC0322a, o oVar, r8.e eVar, i iVar, io.bidmachine.media3.exoplayer.drm.h.a aVar, io.bidmachine.media3.exoplayer.upstream.b bVar2, s.a aVar2, long j10, k kVar, r8.b bVar3, n8.e eVar2, f.b bVar4, b2 b2Var) {
        this.f18398a = i10;
        this.f18419v = cVar;
        this.f18403f = bVar;
        this.f18420w = i11;
        this.f18399b = interfaceC0322a;
        this.f18400c = oVar;
        this.f18401d = iVar;
        this.f18413p = aVar;
        this.f18402e = bVar2;
        this.f18412o = aVar2;
        this.f18404g = j10;
        this.f18405h = kVar;
        this.f18406i = bVar3;
        this.f18409l = eVar2;
        this.f18414q = b2Var;
        this.f18410m = new f(cVar, bVar4, bVar3);
        this.f18418u = eVar2.empty();
        g gVarD = cVar.d(i11);
        List<f8.f> list = gVarD.f14704d;
        this.f18421x = list;
        Pair<x, a[]> pairS = s(iVar, interfaceC0322a, gVarD.f14703c, list);
        this.f18407j = (x) pairS.first;
        this.f18408k = (a[]) pairS.second;
    }

    private static int[][] A(List<f8.a> list) {
        f8.e eVarW;
        Integer num;
        int size = list.size();
        HashMap mapF = f0.f(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i10 = 0; i10 < size; i10++) {
            mapF.put(Long.valueOf(list.get(i10).f14655a), Integer.valueOf(i10));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i10));
            arrayList.add(arrayList2);
            sparseArray.put(i10, arrayList2);
        }
        for (int i11 = 0; i11 < size; i11++) {
            f8.a aVar = list.get(i11);
            f8.e eVarY = y(aVar.f14659e);
            if (eVarY == null) {
                eVarY = y(aVar.f14660f);
            }
            int iIntValue = (eVarY == null || (num = (Integer) mapF.get(Long.valueOf(Long.parseLong(eVarY.f14694b)))) == null) ? i11 : num.intValue();
            if (iIntValue == i11 && (eVarW = w(aVar.f14660f)) != null) {
                for (String str : l0.m1(eVarW.f14694b, ",")) {
                    Integer num2 = (Integer) mapF.get(Long.valueOf(Long.parseLong(str)));
                    if (num2 != null && v(aVar, list.get(num2.intValue()))) {
                        iIntValue = Math.min(iIntValue, num2.intValue());
                    }
                }
            }
            if (iIntValue != i11) {
                List list2 = (List) sparseArray.get(i11);
                List list3 = (List) sparseArray.get(iIntValue);
                list3.addAll(list2);
                sparseArray.put(i11, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i12 = 0; i12 < size2; i12++) {
            int[] iArrM = com.google.common.primitives.f.m((Collection) arrayList.get(i12));
            iArr[i12] = iArrM;
            Arrays.sort(iArrM);
        }
        return iArr;
    }

    private int B(int i10, int[] iArr) {
        int i11 = iArr[i10];
        if (i11 == -1) {
            return -1;
        }
        int i12 = this.f18408k[i11].f18428e;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            if (i14 == i12 && this.f18408k[i14].f18426c == 0) {
                return i13;
            }
        }
        return -1;
    }

    private int[] C(q8.q[] qVarArr) {
        int[] iArr = new int[qVarArr.length];
        for (int i10 = 0; i10 < qVarArr.length; i10++) {
            q8.q qVar = qVarArr[i10];
            if (qVar != null) {
                iArr[i10] = this.f18407j.d(qVar.m());
            } else {
                iArr[i10] = -1;
            }
        }
        return iArr;
    }

    private static boolean D(List<f8.a> list, int[] iArr) {
        for (int i10 : iArr) {
            List<j> list2 = list.get(i10).f14657c;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                if (!list2.get(i11).f14719e.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int E(int i10, List<f8.a> list, int[][] iArr, boolean[] zArr, u7.q[][] qVarArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (D(list, iArr[i12])) {
                zArr[i12] = true;
                i11++;
            }
            u7.q[] qVarArrZ = z(list, iArr[i12]);
            qVarArr[i12] = qVarArrZ;
            if (qVarArrZ.length != 0) {
                i11++;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List F(h hVar) {
        return u.I(Integer.valueOf(hVar.f23179a));
    }

    private static void G(io.bidmachine.media3.exoplayer.dash.a.InterfaceC0322a interfaceC0322a, u7.q[] qVarArr) {
        for (int i10 = 0; i10 < qVarArr.length; i10++) {
            qVarArr[i10] = interfaceC0322a.d(qVarArr[i10]);
        }
    }

    private static h<io.bidmachine.media3.exoplayer.dash.a>[] H(int i10) {
        return new h[i10];
    }

    private static u7.q[] J(f8.e eVar, Pattern pattern, u7.q qVar) {
        String str = eVar.f14694b;
        if (str == null) {
            return new u7.q[]{qVar};
        }
        String[] strArrM1 = l0.m1(str, ";");
        u7.q[] qVarArr = new u7.q[strArrM1.length];
        for (int i10 = 0; i10 < strArrM1.length; i10++) {
            Matcher matcher = pattern.matcher(strArrM1[i10]);
            if (!matcher.matches()) {
                return new u7.q[]{qVar};
            }
            int i11 = Integer.parseInt(matcher.group(1));
            qVarArr[i10] = qVar.b().f0(qVar.f26238a + ":" + i11).O(i11).j0(matcher.group(2)).N();
        }
        return qVarArr;
    }

    private void L(q8.q[] qVarArr, boolean[] zArr, n8.s[] sVarArr) {
        for (int i10 = 0; i10 < qVarArr.length; i10++) {
            if (qVarArr[i10] == null || !zArr[i10]) {
                n8.s sVar = sVarArr[i10];
                if (sVar instanceof h) {
                    ((h) sVar).S(this);
                } else if (sVar instanceof h.a) {
                    ((h.a) sVar).c();
                }
                sVarArr[i10] = null;
            }
        }
    }

    private void M(q8.q[] qVarArr, n8.s[] sVarArr, int[] iArr) {
        boolean z10;
        for (int i10 = 0; i10 < qVarArr.length; i10++) {
            n8.s sVar = sVarArr[i10];
            if ((sVar instanceof n8.h) || (sVar instanceof h.a)) {
                int iB = B(i10, iArr);
                if (iB == -1) {
                    z10 = sVarArr[i10] instanceof n8.h;
                } else {
                    n8.s sVar2 = sVarArr[i10];
                    z10 = (sVar2 instanceof h.a) && ((h.a) sVar2).f23204a == sVarArr[iB];
                }
                if (!z10) {
                    n8.s sVar3 = sVarArr[i10];
                    if (sVar3 instanceof h.a) {
                        ((h.a) sVar3).c();
                    }
                    sVarArr[i10] = null;
                }
            }
        }
    }

    private void N(q8.q[] qVarArr, n8.s[] sVarArr, boolean[] zArr, long j10, int[] iArr) {
        for (int i10 = 0; i10 < qVarArr.length; i10++) {
            q8.q qVar = qVarArr[i10];
            if (qVar != null) {
                n8.s sVar = sVarArr[i10];
                if (sVar == null) {
                    zArr[i10] = true;
                    a aVar = this.f18408k[iArr[i10]];
                    int i11 = aVar.f18426c;
                    if (i11 == 0) {
                        sVarArr[i10] = r(aVar, qVar, j10);
                    } else if (i11 == 2) {
                        sVarArr[i10] = new e(this.f18421x.get(aVar.f18427d), qVar.m().a(0), this.f18419v.f14668d);
                    }
                } else if (sVar instanceof h) {
                    ((io.bidmachine.media3.exoplayer.dash.a) ((h) sVar).G()).g(qVar);
                }
            }
        }
        for (int i12 = 0; i12 < qVarArr.length; i12++) {
            if (sVarArr[i12] == null && qVarArr[i12] != null) {
                a aVar2 = this.f18408k[iArr[i12]];
                if (aVar2.f18426c == 1) {
                    int iB = B(i12, iArr);
                    if (iB == -1) {
                        sVarArr[i12] = new n8.h();
                    } else {
                        sVarArr[i12] = ((h) sVarArr[iB]).V(j10, aVar2.f18425b);
                    }
                }
            }
        }
    }

    private static void o(List<f8.f> list, e0[] e0VarArr, a[] aVarArr, int i10) {
        int i11 = 0;
        while (i11 < list.size()) {
            f8.f fVar = list.get(i11);
            e0VarArr[i10] = new e0(fVar.a() + ":" + i11, new u7.q.b().f0(fVar.a()).u0("application/x-emsg").N());
            aVarArr[i10] = a.c(i11);
            i11++;
            i10++;
        }
    }

    private static int p(i iVar, io.bidmachine.media3.exoplayer.dash.a.InterfaceC0322a interfaceC0322a, List<f8.a> list, int[][] iArr, int i10, boolean[] zArr, u7.q[][] qVarArr, e0[] e0VarArr, a[] aVarArr) {
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        int i15 = 0;
        while (i14 < i10) {
            int[] iArr2 = iArr[i14];
            ArrayList arrayList = new ArrayList();
            for (int i16 : iArr2) {
                arrayList.addAll(list.get(i16).f14657c);
            }
            int size = arrayList.size();
            u7.q[] qVarArr2 = new u7.q[size];
            for (int i17 = 0; i17 < size; i17++) {
                u7.q qVar = ((j) arrayList.get(i17)).f14716b;
                qVarArr2[i17] = qVar.b().V(iVar.n(qVar)).N();
            }
            f8.a aVar = list.get(iArr2[0]);
            long j10 = aVar.f14655a;
            String string = j10 != -1 ? Long.toString(j10) : "unset:" + i14;
            int i18 = i15 + 1;
            if (zArr[i14]) {
                i11 = i18 + 1;
            } else {
                i11 = i18;
                i18 = -1;
            }
            if (qVarArr[i14].length != 0) {
                i12 = i11 + 1;
            } else {
                i12 = i11;
                i11 = -1;
            }
            G(interfaceC0322a, qVarArr2);
            e0VarArr[i15] = new e0(string, qVarArr2);
            aVarArr[i15] = a.d(aVar.f14656b, iArr2, i15, i18, i11);
            if (i18 != -1) {
                String str = string + ":emsg";
                e0VarArr[i18] = new e0(str, new u7.q.b().f0(str).u0("application/x-emsg").N());
                aVarArr[i18] = a.b(iArr2, i15);
                i13 = -1;
            } else {
                i13 = -1;
            }
            if (i11 != i13) {
                aVarArr[i11] = a.a(iArr2, i15, u.D(qVarArr[i14]));
                G(interfaceC0322a, qVarArr[i14]);
                e0VarArr[i11] = new e0(string + ":cc", qVarArr[i14]);
            }
            i14++;
            i15 = i12;
        }
        return i15;
    }

    private h<io.bidmachine.media3.exoplayer.dash.a> r(a aVar, q8.q qVar, long j10) {
        int i10;
        e0 e0VarB;
        int i11;
        int i12 = aVar.f18429f;
        boolean z10 = i12 != -1;
        f.c cVarK = null;
        if (z10) {
            e0VarB = this.f18407j.b(i12);
            i10 = 1;
        } else {
            i10 = 0;
            e0VarB = null;
        }
        int i13 = aVar.f18430g;
        u<u7.q> uVarH = i13 != -1 ? this.f18408k[i13].f18431h : u.H();
        int size = i10 + uVarH.size();
        u7.q[] qVarArr = new u7.q[size];
        int[] iArr = new int[size];
        if (z10) {
            qVarArr[0] = e0VarB.a(0);
            iArr[0] = 5;
            i11 = 1;
        } else {
            i11 = 0;
        }
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < uVarH.size(); i14++) {
            u7.q qVar2 = uVarH.get(i14);
            qVarArr[i11] = qVar2;
            iArr[i11] = 3;
            arrayList.add(qVar2);
            i11++;
        }
        if (this.f18419v.f14668d && z10) {
            cVarK = this.f18410m.k();
        }
        f.c cVar = cVarK;
        h<io.bidmachine.media3.exoplayer.dash.a> hVar = new h<>(aVar.f18425b, iArr, qVarArr, this.f18399b.e(this.f18405h, this.f18419v, this.f18403f, this.f18420w, aVar.f18424a, qVar, aVar.f18425b, this.f18404g, z10, arrayList, cVar, this.f18400c, this.f18414q, null), this, this.f18406i, j10, this.f18401d, this.f18413p, this.f18402e, this.f18412o, this.f18422y, null);
        synchronized (this) {
            this.f18411n.put(hVar, cVar);
        }
        return hVar;
    }

    private static Pair<x, a[]> s(i iVar, io.bidmachine.media3.exoplayer.dash.a.InterfaceC0322a interfaceC0322a, List<f8.a> list, List<f8.f> list2) {
        int[][] iArrA = A(list);
        int length = iArrA.length;
        boolean[] zArr = new boolean[length];
        u7.q[][] qVarArr = new u7.q[length][];
        int iE = E(length, list, iArrA, zArr, qVarArr) + length + list2.size();
        e0[] e0VarArr = new e0[iE];
        a[] aVarArr = new a[iE];
        o(list2, e0VarArr, aVarArr, p(iVar, interfaceC0322a, list, iArrA, length, zArr, qVarArr, e0VarArr, aVarArr));
        return Pair.create(new x(e0VarArr), aVarArr);
    }

    private static boolean v(f8.a aVar, f8.a aVar2) {
        if (aVar.f14656b != aVar2.f14656b) {
            return false;
        }
        if (aVar.f14657c.isEmpty() || aVar2.f14657c.isEmpty()) {
            return true;
        }
        u7.q qVar = aVar.f14657c.get(0).f14716b;
        u7.q qVar2 = aVar2.f14657c.get(0).f14716b;
        return Objects.equals(qVar.f26241d, qVar2.f26241d) && qVar.f26243f == qVar2.f26243f;
    }

    private static f8.e w(List<f8.e> list) {
        return x(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    private static f8.e x(List<f8.e> list, String str) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            f8.e eVar = list.get(i10);
            if (str.equals(eVar.f14693a)) {
                return eVar;
            }
        }
        return null;
    }

    private static f8.e y(List<f8.e> list) {
        return x(list, "http://dashif.org/guidelines/trickmode");
    }

    private static u7.q[] z(List<f8.a> list, int[] iArr) {
        for (int i10 : iArr) {
            f8.a aVar = list.get(i10);
            List<f8.e> list2 = list.get(i10).f14658d;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                f8.e eVar = list2.get(i11);
                if ("urn:scte:dash:cc:cea-608:2015".equals(eVar.f14693a)) {
                    return J(eVar, A, new u7.q.b().u0("application/cea-608").f0(aVar.f14655a + ":cea608").N());
                }
                if ("urn:scte:dash:cc:cea-708:2015".equals(eVar.f14693a)) {
                    return J(eVar, B, new u7.q.b().u0("application/cea-708").f0(aVar.f14655a + ":cea708").N());
                }
            }
        }
        return new u7.q[0];
    }

    @Override // io.bidmachine.media3.exoplayer.source.g0.a
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void h(h<io.bidmachine.media3.exoplayer.dash.a> hVar) {
        this.f18415r.h(this);
    }

    public void K() {
        this.f18410m.o();
        for (h<io.bidmachine.media3.exoplayer.dash.a> hVar : this.f18416s) {
            hVar.S(this);
        }
        this.f18415r = null;
    }

    public void O(f8.c cVar, int i10) {
        this.f18419v = cVar;
        this.f18420w = i10;
        this.f18410m.q(cVar);
        h<io.bidmachine.media3.exoplayer.dash.a>[] hVarArr = this.f18416s;
        if (hVarArr != null) {
            for (h<io.bidmachine.media3.exoplayer.dash.a> hVar : hVarArr) {
                ((io.bidmachine.media3.exoplayer.dash.a) hVar.G()).i(cVar, i10);
            }
            this.f18415r.h(this);
        }
        this.f18421x = cVar.d(i10).f14704d;
        for (e eVar : this.f18417t) {
            for (f8.f fVar : this.f18421x) {
                if (fVar.a().equals(eVar.b())) {
                    eVar.d(fVar, cVar.f14668d && i10 == cVar.e() - 1);
                    break;
                }
            }
        }
    }

    @Override // o8.h.b
    public synchronized void a(h<io.bidmachine.media3.exoplayer.dash.a> hVar) {
        f.c cVarRemove = this.f18411n.remove(hVar);
        if (cVarRemove != null) {
            cVarRemove.o();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public long b() {
        return this.f18418u.b();
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public boolean c(k1 k1Var) {
        return this.f18418u.c(k1Var);
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public long d(long j10, a0 a0Var) {
        for (h<io.bidmachine.media3.exoplayer.dash.a> hVar : this.f18416s) {
            if (hVar.f23179a == 2) {
                return hVar.d(j10, a0Var);
            }
        }
        return j10;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public long f() {
        return this.f18418u.f();
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public void g(long j10) {
        for (h<io.bidmachine.media3.exoplayer.dash.a> hVar : this.f18416s) {
            if (!hVar.isLoading()) {
                hVar.F(this.f18419v.g(this.f18420w));
            }
        }
        this.f18418u.g(j10);
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public long i(q8.q[] qVarArr, boolean[] zArr, n8.s[] sVarArr, boolean[] zArr2, long j10) {
        int[] iArrC = C(qVarArr);
        L(qVarArr, zArr, sVarArr);
        M(qVarArr, sVarArr, iArrC);
        N(qVarArr, sVarArr, zArr2, j10, iArrC);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (n8.s sVar : sVarArr) {
            if (sVar instanceof h) {
                arrayList.add((h) sVar);
            } else if (sVar instanceof e) {
                arrayList2.add((e) sVar);
            }
        }
        h<io.bidmachine.media3.exoplayer.dash.a>[] hVarArrH = H(arrayList.size());
        this.f18416s = hVarArrH;
        arrayList.toArray(hVarArrH);
        e[] eVarArr = new e[arrayList2.size()];
        this.f18417t = eVarArr;
        arrayList2.toArray(eVarArr);
        this.f18418u = this.f18409l.a(arrayList, b0.m(arrayList, new com.google.common.base.g() { // from class: io.bidmachine.media3.exoplayer.dash.b
            @Override // com.google.common.base.g
            public final Object apply(Object obj) {
                return c.F((h) obj);
            }
        }));
        if (this.f18422y) {
            this.f18422y = false;
            this.f18423z = j10;
        }
        return j10;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public boolean isLoading() {
        return this.f18418u.isLoading();
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public long j(long j10) {
        for (h<io.bidmachine.media3.exoplayer.dash.a> hVar : this.f18416s) {
            hVar.U(j10);
        }
        for (e eVar : this.f18417t) {
            eVar.c(j10);
        }
        return j10;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public long k() {
        for (h<io.bidmachine.media3.exoplayer.dash.a> hVar : this.f18416s) {
            if (hVar.B()) {
                return this.f18423z;
            }
        }
        return -9223372036854775807L;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public void l(q.a aVar, long j10) {
        this.f18415r = aVar;
        aVar.e(this);
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public void q() throws IOException {
        this.f18405h.a();
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public x t() {
        return this.f18407j;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public void u(long j10, boolean z10) {
        for (h<io.bidmachine.media3.exoplayer.dash.a> hVar : this.f18416s) {
            hVar.u(j10, z10);
        }
    }
}
