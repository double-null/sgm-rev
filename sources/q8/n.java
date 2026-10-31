package q8;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.accessibility.CaptioningManager;
import b8.y;
import com.adjust.sdk.network.ErrorCodes;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.google.common.collect.n0;
import com.vungle.ads.internal.network.converters.vY.vgmm;
import io.bidmachine.media3.exoplayer.ExoPlaybackException;
import io.bidmachine.media3.exoplayer.h2;
import io.bidmachine.media3.exoplayer.i2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import n8.x;
import u7.d0;
import u7.e0;
import u7.f0;
import u7.g0;
import x7.l0;

/* JADX INFO: compiled from: DefaultTrackSelector.java */
/* JADX INFO: loaded from: classes4.dex */
public class n extends s implements i2.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final n0<Integer> f24510j = n0.c(new Comparator() { // from class: q8.f
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return n.V((Integer) obj, (Integer) obj2);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f24511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f24512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final q.b f24513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e f24514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private g f24515h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private u7.c f24516i;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    static final class b extends i<b> implements Comparable<b> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f24517e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f24518f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f24519g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final e f24520h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f24521i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f24522j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f24523k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f24524l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final boolean f24525m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final boolean f24526n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final int f24527o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final int f24528p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final boolean f24529q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final int f24530r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final int f24531s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f24532t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final int f24533u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final boolean f24534v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final boolean f24535w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final boolean f24536x;

        public b(int i10, e0 e0Var, int i11, e eVar, int i12, boolean z10, com.google.common.base.q<u7.q> qVar, int i13) {
            int i14;
            int iH;
            int iH2;
            super(i10, e0Var, i11);
            this.f24520h = eVar;
            int i15 = eVar.f24551y0 ? 24 : 16;
            this.f24525m = eVar.f24547u0 && (i13 & i15) != 0;
            this.f24519g = n.a0(this.f24577d.f26241d);
            this.f24521i = i2.p(i12, false);
            int i16 = 0;
            while (true) {
                i14 = Integer.MAX_VALUE;
                if (i16 >= eVar.f26119p.size()) {
                    iH = 0;
                    i16 = Integer.MAX_VALUE;
                    break;
                } else {
                    iH = n.H(this.f24577d, eVar.f26119p.get(i16), false);
                    if (iH > 0) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            this.f24523k = i16;
            this.f24522j = iH;
            this.f24524l = n.L(this.f24577d.f26243f, eVar.f26120q);
            u7.q qVar2 = this.f24577d;
            int i17 = qVar2.f26243f;
            this.f24526n = i17 == 0 || (i17 & 1) != 0;
            this.f24529q = (qVar2.f26242e & 1) != 0;
            this.f24536x = n.P(qVar2);
            u7.q qVar3 = this.f24577d;
            int i18 = qVar3.E;
            this.f24530r = i18;
            this.f24531s = qVar3.F;
            int i19 = qVar3.f26247j;
            this.f24532t = i19;
            this.f24518f = (i19 == -1 || i19 <= eVar.f26122s) && (i18 == -1 || i18 <= eVar.f26121r) && qVar.apply(qVar3);
            String[] strArrP0 = l0.p0();
            int i20 = 0;
            while (true) {
                if (i20 >= strArrP0.length) {
                    iH2 = 0;
                    i20 = Integer.MAX_VALUE;
                    break;
                } else {
                    iH2 = n.H(this.f24577d, strArrP0[i20], false);
                    if (iH2 > 0) {
                        break;
                    } else {
                        i20++;
                    }
                }
            }
            this.f24527o = i20;
            this.f24528p = iH2;
            for (int i21 = 0; i21 < eVar.f26123t.size(); i21++) {
                String str = this.f24577d.f26252o;
                if (str != null && str.equals(eVar.f26123t.get(i21))) {
                    i14 = i21;
                    break;
                }
            }
            this.f24533u = i14;
            this.f24534v = i2.o(i12) == 128;
            this.f24535w = i2.H(i12) == 64;
            this.f24517e = g(i12, z10, i15);
        }

        public static int c(List<b> list, List<b> list2) {
            return ((b) Collections.max(list)).compareTo((b) Collections.max(list2));
        }

        public static com.google.common.collect.u<b> e(int i10, e0 e0Var, e eVar, int[] iArr, boolean z10, com.google.common.base.q<u7.q> qVar, int i11) {
            com.google.common.collect.u.a aVarV = com.google.common.collect.u.v();
            for (int i12 = 0; i12 < e0Var.f26054a; i12++) {
                aVarV.a(new b(i10, e0Var, i12, eVar, iArr[i12], z10, qVar, i11));
            }
            return aVarV.m();
        }

        private int g(int i10, boolean z10, int i11) {
            if (!i2.p(i10, this.f24520h.A0)) {
                return 0;
            }
            if (!this.f24518f && !this.f24520h.f24546t0) {
                return 0;
            }
            e eVar = this.f24520h;
            if (eVar.f26124u.f26134a == 2 && !n.b0(eVar, i10, this.f24577d)) {
                return 0;
            }
            if (i2.p(i10, false) && this.f24518f && this.f24577d.f26247j != -1) {
                e eVar2 = this.f24520h;
                if (!eVar2.C && !eVar2.B && ((eVar2.C0 || !z10) && eVar2.f26124u.f26134a != 2 && (i10 & i11) != 0)) {
                    return 2;
                }
            }
            return 1;
        }

        @Override // q8.n.i
        public int a() {
            return this.f24517e;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            n0 n0VarG = (this.f24518f && this.f24521i) ? n.f24510j : n.f24510j.g();
            com.google.common.collect.m mVarF = com.google.common.collect.m.j().g(this.f24521i, bVar.f24521i).f(Integer.valueOf(this.f24523k), Integer.valueOf(bVar.f24523k), n0.e().g()).d(this.f24522j, bVar.f24522j).d(this.f24524l, bVar.f24524l).g(this.f24529q, bVar.f24529q).g(this.f24526n, bVar.f24526n).f(Integer.valueOf(this.f24527o), Integer.valueOf(bVar.f24527o), n0.e().g()).d(this.f24528p, bVar.f24528p).g(this.f24518f, bVar.f24518f).f(Integer.valueOf(this.f24533u), Integer.valueOf(bVar.f24533u), n0.e().g());
            if (this.f24520h.B) {
                mVarF = mVarF.f(Integer.valueOf(this.f24532t), Integer.valueOf(bVar.f24532t), n.f24510j.g());
            }
            com.google.common.collect.m mVarF2 = mVarF.g(this.f24534v, bVar.f24534v).g(this.f24535w, bVar.f24535w).g(this.f24536x, bVar.f24536x).f(Integer.valueOf(this.f24530r), Integer.valueOf(bVar.f24530r), n0VarG).f(Integer.valueOf(this.f24531s), Integer.valueOf(bVar.f24531s), n0VarG);
            if (Objects.equals(this.f24519g, bVar.f24519g)) {
                mVarF2 = mVarF2.f(Integer.valueOf(this.f24532t), Integer.valueOf(bVar.f24532t), n0VarG);
            }
            return mVarF2.i();
        }

        @Override // q8.n.i
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public boolean b(b bVar) {
            int i10;
            String str;
            int i11;
            if ((this.f24520h.f24549w0 || ((i11 = this.f24577d.E) != -1 && i11 == bVar.f24577d.E)) && (this.f24525m || ((str = this.f24577d.f26252o) != null && TextUtils.equals(str, bVar.f24577d.f26252o)))) {
                e eVar = this.f24520h;
                if ((eVar.f24548v0 || ((i10 = this.f24577d.F) != -1 && i10 == bVar.f24577d.F)) && (eVar.f24550x0 || (this.f24534v == bVar.f24534v && this.f24535w == bVar.f24535w))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    static final class c extends i<c> implements Comparable<c> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f24537e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f24538f;

        public c(int i10, e0 e0Var, int i11, e eVar, int i12) {
            super(i10, e0Var, i11);
            this.f24537e = i2.p(i12, eVar.A0) ? 1 : 0;
            this.f24538f = this.f24577d.e();
        }

        public static int c(List<c> list, List<c> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        public static com.google.common.collect.u<c> e(int i10, e0 e0Var, e eVar, int[] iArr) {
            com.google.common.collect.u.a aVarV = com.google.common.collect.u.v();
            for (int i11 = 0; i11 < e0Var.f26054a; i11++) {
                aVarV.a(new c(i10, e0Var, i11, eVar, iArr[i11]));
            }
            return aVarV.m();
        }

        @Override // q8.n.i
        public int a() {
            return this.f24537e;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return Integer.compare(this.f24538f, cVar.f24538f);
        }

        @Override // q8.n.i
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public boolean b(c cVar) {
            return false;
        }
    }

    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    private static final class d implements Comparable<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f24539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f24540b;

        public d(u7.q qVar, int i10) {
            this.f24539a = (qVar.f26242e & 1) != 0;
            this.f24540b = i2.p(i10, false);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return com.google.common.collect.m.j().g(this.f24540b, dVar.f24540b).g(this.f24539a, dVar.f24539a).i();
        }
    }

    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static final class e extends g0 {
        public static final e G0;

        @Deprecated
        public static final e H0;
        private static final String I0;
        private static final String J0;
        private static final String K0;
        private static final String L0;
        private static final String M0;
        private static final String N0;
        private static final String O0;
        private static final String P0;
        private static final String Q0;
        private static final String R0;
        private static final String S0;
        private static final String T0;
        private static final String U0;
        private static final String V0;
        private static final String W0;
        private static final String X0;
        private static final String Y0;
        private static final String Z0;

        /* JADX INFO: renamed from: a1, reason: collision with root package name */
        private static final String f24541a1;
        public final boolean A0;
        public final boolean B0;
        public final boolean C0;
        public final boolean D0;
        private final SparseArray<Map<x, f>> E0;
        private final SparseBooleanArray F0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final boolean f24542p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final boolean f24543q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f24544r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final boolean f24545s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final boolean f24546t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final boolean f24547u0;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        public final boolean f24548v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final boolean f24549w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final boolean f24550x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final boolean f24551y0;

        /* JADX INFO: renamed from: z0, reason: collision with root package name */
        public final boolean f24552z0;

        /* JADX INFO: compiled from: DefaultTrackSelector.java */
        public static final class a extends g0.c {
            private boolean F;
            private boolean G;
            private boolean H;
            private boolean I;
            private boolean J;
            private boolean K;
            private boolean L;
            private boolean M;
            private boolean N;
            private boolean O;
            private boolean P;
            private boolean Q;
            private boolean R;
            private boolean S;
            private boolean T;
            private final SparseArray<Map<x, f>> U;
            private final SparseBooleanArray V;

            private static SparseArray<Map<x, f>> j0(SparseArray<Map<x, f>> sparseArray) {
                SparseArray<Map<x, f>> sparseArray2 = new SparseArray<>();
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    sparseArray2.put(sparseArray.keyAt(i10), new HashMap(sparseArray.valueAt(i10)));
                }
                return sparseArray2;
            }

            private void k0() {
                this.F = true;
                this.G = false;
                this.H = true;
                this.I = false;
                this.J = true;
                this.K = false;
                this.L = false;
                this.M = false;
                this.N = false;
                this.O = true;
                this.P = true;
                this.Q = true;
                this.R = false;
                this.S = true;
                this.T = false;
            }

            @Override // u7.g0.c
            /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
            public e F() {
                return new e(this);
            }

            @Override // u7.g0.c
            /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
            public a G(int i10) {
                super.G(i10);
                return this;
            }

            protected a l0(g0 g0Var) {
                super.J(g0Var);
                return this;
            }

            @Override // u7.g0.c
            /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
            public a K(int i10) {
                super.K(i10);
                return this;
            }

            @Override // u7.g0.c
            /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
            public a L(f0 f0Var) {
                super.L(f0Var);
                return this;
            }

            @Override // u7.g0.c
            /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
            public a M(String str) {
                super.M(str);
                return this;
            }

            @Override // u7.g0.c
            /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
            public a N(String... strArr) {
                super.N(strArr);
                return this;
            }

            @Override // u7.g0.c
            /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
            public a O(int i10) {
                super.O(i10);
                return this;
            }

            @Override // u7.g0.c
            /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
            public a P(int i10, boolean z10) {
                super.P(i10, z10);
                return this;
            }

            public a() {
                this.U = new SparseArray<>();
                this.V = new SparseBooleanArray();
                k0();
            }

            private a(e eVar) {
                super(eVar);
                this.F = eVar.f24542p0;
                this.G = eVar.f24543q0;
                this.H = eVar.f24544r0;
                this.I = eVar.f24545s0;
                this.J = eVar.f24546t0;
                this.K = eVar.f24547u0;
                this.L = eVar.f24548v0;
                this.M = eVar.f24549w0;
                this.N = eVar.f24550x0;
                this.O = eVar.f24551y0;
                this.P = eVar.f24552z0;
                this.Q = eVar.A0;
                this.R = eVar.B0;
                this.S = eVar.C0;
                this.T = eVar.D0;
                this.U = j0(eVar.E0);
                this.V = eVar.F0.clone();
            }
        }

        static {
            e eVarF = new a().F();
            G0 = eVarF;
            H0 = eVarF;
            I0 = l0.C0(1000);
            J0 = l0.C0(1001);
            K0 = l0.C0(1002);
            L0 = l0.C0(ErrorCodes.MALFORMED_URL_EXCEPTION);
            M0 = l0.C0(1004);
            N0 = l0.C0(1005);
            O0 = l0.C0(ErrorCodes.SSL_HANDSHAKE_EXCEPTION);
            P0 = l0.C0(ErrorCodes.IO_EXCEPTION);
            Q0 = l0.C0(1008);
            R0 = l0.C0(1009);
            S0 = l0.C0(1010);
            T0 = l0.C0(1011);
            U0 = l0.C0(1012);
            V0 = l0.C0(1013);
            W0 = l0.C0(1014);
            X0 = l0.C0(1015);
            Y0 = l0.C0(1016);
            Z0 = l0.C0(1017);
            f24541a1 = l0.C0(1018);
        }

        private static boolean d(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean e(SparseArray<Map<x, f>> sparseArray, SparseArray<Map<x, f>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                if (iIndexOfKey < 0 || !f(sparseArray.valueAt(i10), sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        private static boolean f(Map<x, f> map, Map<x, f> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<x, f> entry : map.entrySet()) {
                x key = entry.getKey();
                if (!map2.containsKey(key) || !Objects.equals(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }

        @Override // u7.g0
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return super.equals(eVar) && this.f24542p0 == eVar.f24542p0 && this.f24543q0 == eVar.f24543q0 && this.f24544r0 == eVar.f24544r0 && this.f24545s0 == eVar.f24545s0 && this.f24546t0 == eVar.f24546t0 && this.f24547u0 == eVar.f24547u0 && this.f24548v0 == eVar.f24548v0 && this.f24549w0 == eVar.f24549w0 && this.f24550x0 == eVar.f24550x0 && this.f24551y0 == eVar.f24551y0 && this.f24552z0 == eVar.f24552z0 && this.A0 == eVar.A0 && this.B0 == eVar.B0 && this.C0 == eVar.C0 && this.D0 == eVar.D0 && d(this.F0, eVar.F0) && e(this.E0, eVar.E0);
        }

        @Override // u7.g0
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a();
        }

        public boolean h(int i10) {
            return this.F0.get(i10);
        }

        @Override // u7.g0
        public int hashCode() {
            return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f24542p0 ? 1 : 0)) * 31) + (this.f24543q0 ? 1 : 0)) * 31) + (this.f24544r0 ? 1 : 0)) * 31) + (this.f24545s0 ? 1 : 0)) * 31) + (this.f24546t0 ? 1 : 0)) * 31) + (this.f24547u0 ? 1 : 0)) * 31) + (this.f24548v0 ? 1 : 0)) * 31) + (this.f24549w0 ? 1 : 0)) * 31) + (this.f24550x0 ? 1 : 0)) * 31) + (this.f24551y0 ? 1 : 0)) * 31) + (this.f24552z0 ? 1 : 0)) * 31) + (this.A0 ? 1 : 0)) * 31) + (this.B0 ? 1 : 0)) * 31) + (this.C0 ? 1 : 0)) * 31) + (this.D0 ? 1 : 0);
        }

        @Deprecated
        public f i(int i10, x xVar) {
            Map<x, f> map = this.E0.get(i10);
            if (map != null) {
                return map.get(xVar);
            }
            return null;
        }

        @Deprecated
        public boolean j(int i10, x xVar) {
            Map<x, f> map = this.E0.get(i10);
            return map != null && map.containsKey(xVar);
        }

        private e(a aVar) {
            super(aVar);
            this.f24542p0 = aVar.F;
            this.f24543q0 = aVar.G;
            this.f24544r0 = aVar.H;
            this.f24545s0 = aVar.I;
            this.f24546t0 = aVar.J;
            this.f24547u0 = aVar.K;
            this.f24548v0 = aVar.L;
            this.f24549w0 = aVar.M;
            this.f24550x0 = aVar.N;
            this.f24551y0 = aVar.O;
            this.f24552z0 = aVar.P;
            this.A0 = aVar.Q;
            this.B0 = aVar.R;
            this.C0 = aVar.S;
            this.D0 = aVar.T;
            this.E0 = aVar.U;
            this.F0 = aVar.V;
        }
    }

    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static final class f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final String f24553d = l0.C0(0);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f24554e = l0.C0(1);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f24555f = l0.C0(2);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f24556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f24557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f24558c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || f.class != obj.getClass()) {
                return false;
            }
            f fVar = (f) obj;
            return this.f24556a == fVar.f24556a && Arrays.equals(this.f24557b, fVar.f24557b) && this.f24558c == fVar.f24558c;
        }

        public int hashCode() {
            return (((this.f24556a * 31) + Arrays.hashCode(this.f24557b)) * 31) + this.f24558c;
        }
    }

    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    private static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Spatializer f24559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f24560b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Handler f24561c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Spatializer.OnSpatializerStateChangedListener f24562d;

        /* JADX INFO: compiled from: DefaultTrackSelector.java */
        class a implements Spatializer.OnSpatializerStateChangedListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ n f24563a;

            a(n nVar) {
                this.f24563a = nVar;
            }

            @Override // android.media.Spatializer.OnSpatializerStateChangedListener
            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
                this.f24563a.Y();
            }

            @Override // android.media.Spatializer.OnSpatializerStateChangedListener
            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
                this.f24563a.Y();
            }
        }

        public g(Context context, n nVar) {
            AudioManager audioManagerC = context == null ? null : v7.d.c(context);
            if (audioManagerC == null || l0.K0((Context) x7.a.e(context))) {
                this.f24559a = null;
                this.f24560b = false;
                this.f24561c = null;
                this.f24562d = null;
                return;
            }
            Spatializer spatializer = audioManagerC.getSpatializer();
            this.f24559a = spatializer;
            this.f24560b = spatializer.getImmersiveAudioLevel() != 0;
            a aVar = new a(nVar);
            this.f24562d = aVar;
            Handler handler = new Handler((Looper) x7.a.i(Looper.myLooper()));
            this.f24561c = handler;
            Objects.requireNonNull(handler);
            spatializer.addOnSpatializerStateChangedListener(new d8.s(handler), aVar);
        }

        public boolean a(u7.c cVar, u7.q qVar) {
            int i10;
            if (Objects.equals(qVar.f26252o, "audio/eac3-joc")) {
                i10 = qVar.E;
                if (i10 == 16) {
                    i10 = 12;
                }
            } else if (Objects.equals(qVar.f26252o, "audio/iamf")) {
                i10 = qVar.E;
                if (i10 == -1) {
                    i10 = 6;
                }
            } else if (Objects.equals(qVar.f26252o, "audio/ac4")) {
                i10 = qVar.E;
                if (i10 == 18 || i10 == 21) {
                    i10 = 24;
                }
            } else {
                i10 = qVar.E;
            }
            int iM = l0.M(i10);
            if (iM == 0) {
                return false;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iM);
            int i11 = qVar.F;
            if (i11 != -1) {
                channelMask.setSampleRate(i11);
            }
            return ((Spatializer) x7.a.e(this.f24559a)).canBeSpatialized(cVar.a().f25996a, channelMask.build());
        }

        public boolean b() {
            return ((Spatializer) x7.a.e(this.f24559a)).isAvailable();
        }

        public boolean c() {
            return ((Spatializer) x7.a.e(this.f24559a)).isEnabled();
        }

        public boolean d() {
            return this.f24560b;
        }

        public void e() {
            Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener;
            Spatializer spatializer = this.f24559a;
            if (spatializer == null || (onSpatializerStateChangedListener = this.f24562d) == null || this.f24561c == null) {
                return;
            }
            spatializer.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
            this.f24561c.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    static final class h extends i<h> implements Comparable<h> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f24565e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f24566f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f24567g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f24568h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f24569i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f24570j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f24571k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f24572l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final boolean f24573m;

        public h(int i10, e0 e0Var, int i11, e eVar, int i12, String str, String str2) {
            int iH;
            super(i10, e0Var, i11);
            int i13 = 0;
            this.f24566f = i2.p(i12, false);
            int i14 = this.f24577d.f26242e & (~eVar.f26128y);
            this.f24567g = (i14 & 1) != 0;
            this.f24568h = (i14 & 2) != 0;
            com.google.common.collect.u<String> uVarI = str2 != null ? com.google.common.collect.u.I(str2) : eVar.f26125v.isEmpty() ? com.google.common.collect.u.I("") : eVar.f26125v;
            int i15 = 0;
            while (true) {
                if (i15 >= uVarI.size()) {
                    i15 = Integer.MAX_VALUE;
                    iH = 0;
                    break;
                } else {
                    iH = n.H(this.f24577d, uVarI.get(i15), eVar.f26129z);
                    if (iH > 0) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
            this.f24569i = i15;
            this.f24570j = iH;
            int iL = n.L(this.f24577d.f26243f, str2 != null ? 1088 : eVar.f26126w);
            this.f24571k = iL;
            this.f24573m = (1088 & this.f24577d.f26243f) != 0;
            int iH2 = n.H(this.f24577d, str, n.a0(str) == null);
            this.f24572l = iH2;
            boolean z10 = iH > 0 || (eVar.f26125v.isEmpty() && iL > 0) || this.f24567g || (this.f24568h && iH2 > 0);
            if (i2.p(i12, eVar.A0) && z10) {
                i13 = 1;
            }
            this.f24565e = i13;
        }

        public static int c(List<h> list, List<h> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        public static com.google.common.collect.u<h> e(int i10, e0 e0Var, e eVar, int[] iArr, String str, String str2) {
            com.google.common.collect.u.a aVarV = com.google.common.collect.u.v();
            for (int i11 = 0; i11 < e0Var.f26054a; i11++) {
                aVarV.a(new h(i10, e0Var, i11, eVar, iArr[i11], str, str2));
            }
            return aVarV.m();
        }

        @Override // q8.n.i
        public int a() {
            return this.f24565e;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(h hVar) {
            com.google.common.collect.m mVarD = com.google.common.collect.m.j().g(this.f24566f, hVar.f24566f).f(Integer.valueOf(this.f24569i), Integer.valueOf(hVar.f24569i), n0.e().g()).d(this.f24570j, hVar.f24570j).d(this.f24571k, hVar.f24571k).g(this.f24567g, hVar.f24567g).f(Boolean.valueOf(this.f24568h), Boolean.valueOf(hVar.f24568h), this.f24570j == 0 ? n0.e() : n0.e().g()).d(this.f24572l, hVar.f24572l);
            if (this.f24571k == 0) {
                mVarD = mVarD.h(this.f24573m, hVar.f24573m);
            }
            return mVarD.i();
        }

        @Override // q8.n.i
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public boolean b(h hVar) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    static abstract class i<T extends i<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f24574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e0 f24575b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f24576c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final u7.q f24577d;

        /* JADX INFO: compiled from: DefaultTrackSelector.java */
        public interface a<T extends i<T>> {
            List<T> a(int i10, e0 e0Var, int[] iArr);
        }

        public i(int i10, e0 e0Var, int i11) {
            this.f24574a = i10;
            this.f24575b = e0Var;
            this.f24576c = i11;
            this.f24577d = e0Var.a(i11);
        }

        public abstract int a();

        public abstract boolean b(T t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    static final class j extends i<j> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f24578e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final e f24579f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f24580g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f24581h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f24582i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f24583j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f24584k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f24585l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f24586m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f24587n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final int f24588o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final boolean f24589p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final int f24590q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final boolean f24591r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final int f24592s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean f24593t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final boolean f24594u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final int f24595v;

        /* JADX WARN: Code duplicated, block: B:31:0x004b  */
        /* JADX WARN: Code duplicated, block: B:51:0x0079  */
        public j(int i10, e0 e0Var, int i11, e eVar, int i12, String str, int i13, boolean z10) {
            boolean z11;
            boolean z12;
            int i14;
            int iH;
            u7.q qVar;
            int i15;
            int i16;
            int i17;
            u7.q qVar2;
            int i18;
            int i19;
            int i20;
            super(i10, e0Var, i11);
            this.f24579f = eVar;
            int i21 = eVar.f24544r0 ? 24 : 16;
            this.f24591r = eVar.f24543q0 && (i13 & i21) != 0;
            if (!z10 || (((i18 = (qVar2 = this.f24577d).f26259v) != -1 && i18 > eVar.f26104a) || ((i19 = qVar2.f26260w) != -1 && i19 > eVar.f26105b))) {
                z11 = false;
            } else {
                float f10 = qVar2.f26261x;
                if ((f10 == -1.0f || f10 <= eVar.f26106c) && ((i20 = qVar2.f26247j) == -1 || i20 <= eVar.f26107d)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            this.f24578e = z11;
            if (!z10 || (((i15 = (qVar = this.f24577d).f26259v) != -1 && i15 < eVar.f26108e) || ((i16 = qVar.f26260w) != -1 && i16 < eVar.f26109f))) {
                z12 = false;
            } else {
                float f11 = qVar.f26261x;
                if ((f11 == -1.0f || f11 >= eVar.f26110g) && ((i17 = qVar.f26247j) == -1 || i17 >= eVar.f26111h)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
            this.f24580g = z12;
            this.f24581h = i2.p(i12, false);
            u7.q qVar3 = this.f24577d;
            float f12 = qVar3.f26261x;
            this.f24582i = f12 != -1.0f && f12 >= 10.0f;
            this.f24583j = qVar3.f26247j;
            this.f24584k = qVar3.e();
            int i22 = 0;
            while (true) {
                i14 = Integer.MAX_VALUE;
                if (i22 >= eVar.f26117n.size()) {
                    i22 = Integer.MAX_VALUE;
                    iH = 0;
                    break;
                } else {
                    iH = n.H(this.f24577d, eVar.f26117n.get(i22), false);
                    if (iH > 0) {
                        break;
                    } else {
                        i22++;
                    }
                }
            }
            this.f24586m = i22;
            this.f24587n = iH;
            this.f24588o = n.L(this.f24577d.f26243f, eVar.f26118o);
            int i23 = this.f24577d.f26243f;
            this.f24589p = i23 == 0 || (i23 & 1) != 0;
            this.f24590q = n.H(this.f24577d, str, n.a0(str) == null);
            for (int i24 = 0; i24 < eVar.f26116m.size(); i24++) {
                String str2 = this.f24577d.f26252o;
                if (str2 != null && str2.equals(eVar.f26116m.get(i24))) {
                    i14 = i24;
                    break;
                }
            }
            this.f24585l = i14;
            this.f24593t = i2.o(i12) == 128;
            this.f24594u = i2.H(i12) == 64;
            this.f24595v = n.M(this.f24577d.f26252o);
            this.f24592s = j(i12, i21);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int e(j jVar, j jVar2) {
            com.google.common.collect.m mVarG = com.google.common.collect.m.j().g(jVar.f24581h, jVar2.f24581h).f(Integer.valueOf(jVar.f24586m), Integer.valueOf(jVar2.f24586m), n0.e().g()).d(jVar.f24587n, jVar2.f24587n).d(jVar.f24588o, jVar2.f24588o).g(jVar.f24589p, jVar2.f24589p).d(jVar.f24590q, jVar2.f24590q).g(jVar.f24582i, jVar2.f24582i).g(jVar.f24578e, jVar2.f24578e).g(jVar.f24580g, jVar2.f24580g).f(Integer.valueOf(jVar.f24585l), Integer.valueOf(jVar2.f24585l), n0.e().g()).g(jVar.f24593t, jVar2.f24593t).g(jVar.f24594u, jVar2.f24594u);
            if (jVar.f24593t && jVar.f24594u) {
                mVarG = mVarG.d(jVar.f24595v, jVar2.f24595v);
            }
            return mVarG.i();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int g(j jVar, j jVar2) {
            n0 n0VarG = (jVar.f24578e && jVar.f24581h) ? n.f24510j : n.f24510j.g();
            com.google.common.collect.m mVarJ = com.google.common.collect.m.j();
            if (jVar.f24579f.B) {
                mVarJ = mVarJ.f(Integer.valueOf(jVar.f24583j), Integer.valueOf(jVar2.f24583j), n.f24510j.g());
            }
            return mVarJ.f(Integer.valueOf(jVar.f24584k), Integer.valueOf(jVar2.f24584k), n0VarG).f(Integer.valueOf(jVar.f24583j), Integer.valueOf(jVar2.f24583j), n0VarG).i();
        }

        public static int h(List<j> list, List<j> list2) {
            return com.google.common.collect.m.j().f((j) Collections.max(list, new Comparator() { // from class: q8.o
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.e((n.j) obj, (n.j) obj2);
                }
            }), (j) Collections.max(list2, new Comparator() { // from class: q8.o
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.e((n.j) obj, (n.j) obj2);
                }
            }), new Comparator() { // from class: q8.o
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.e((n.j) obj, (n.j) obj2);
                }
            }).d(list.size(), list2.size()).f((j) Collections.max(list, new Comparator() { // from class: q8.p
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.g((n.j) obj, (n.j) obj2);
                }
            }), (j) Collections.max(list2, new Comparator() { // from class: q8.p
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.g((n.j) obj, (n.j) obj2);
                }
            }), new Comparator() { // from class: q8.p
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.g((n.j) obj, (n.j) obj2);
                }
            }).i();
        }

        public static com.google.common.collect.u<j> i(int i10, e0 e0Var, e eVar, int[] iArr, String str, int i11, Point point) {
            int I = n.I(e0Var, point != null ? point.x : eVar.f26112i, point != null ? point.y : eVar.f26113j, eVar.f26115l);
            com.google.common.collect.u.a aVarV = com.google.common.collect.u.v();
            for (int i12 = 0; i12 < e0Var.f26054a; i12++) {
                int iE = e0Var.a(i12).e();
                aVarV.a(new j(i10, e0Var, i12, eVar, iArr[i12], str, i11, I == Integer.MAX_VALUE || (iE != -1 && iE <= I)));
            }
            return aVarV.m();
        }

        private int j(int i10, int i11) {
            if ((this.f24577d.f26243f & Http2.INITIAL_MAX_FRAME_SIZE) != 0 || !i2.p(i10, this.f24579f.A0)) {
                return 0;
            }
            if (!this.f24578e && !this.f24579f.f24542p0) {
                return 0;
            }
            if (i2.p(i10, false) && this.f24580g && this.f24578e && this.f24577d.f26247j != -1) {
                e eVar = this.f24579f;
                if (!eVar.C && !eVar.B && (i10 & i11) != 0) {
                    return 2;
                }
            }
            return 1;
        }

        @Override // q8.n.i
        public int a() {
            return this.f24592s;
        }

        @Override // q8.n.i
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean b(j jVar) {
            return (this.f24591r || Objects.equals(this.f24577d.f26252o, jVar.f24577d.f26252o)) && (this.f24579f.f24545s0 || (this.f24593t == jVar.f24593t && this.f24594u == jVar.f24594u));
        }
    }

    public n(Context context) {
        this(context, new q8.a.b());
    }

    private static void E(s.a aVar, e eVar, q.a[] aVarArr) {
        int iD = aVar.d();
        for (int i10 = 0; i10 < iD; i10++) {
            x xVarF = aVar.f(i10);
            if (eVar.j(i10, xVarF)) {
                f fVarI = eVar.i(i10, xVarF);
                aVarArr[i10] = (fVarI == null || fVarI.f24557b.length == 0) ? null : new q.a(xVarF.b(fVarI.f24556a), fVarI.f24557b, fVarI.f24558c);
            }
        }
    }

    private static void F(s.a aVar, g0 g0Var, q.a[] aVarArr) {
        int iD = aVar.d();
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < iD; i10++) {
            G(aVar.f(i10), g0Var, map);
        }
        G(aVar.h(), g0Var, map);
        for (int i11 = 0; i11 < iD; i11++) {
            f0 f0Var = (f0) map.get(Integer.valueOf(aVar.e(i11)));
            if (f0Var != null) {
                aVarArr[i11] = (f0Var.f26067b.isEmpty() || aVar.f(i11).d(f0Var.f26066a) == -1) ? null : new q.a(f0Var.f26066a, com.google.common.primitives.f.m(f0Var.f26067b));
            }
        }
    }

    private static void G(x xVar, g0 g0Var, Map<Integer, f0> map) {
        f0 f0Var;
        for (int i10 = 0; i10 < xVar.f22837a; i10++) {
            f0 f0Var2 = g0Var.D.get(xVar.b(i10));
            if (f0Var2 != null && ((f0Var = map.get(Integer.valueOf(f0Var2.a()))) == null || (f0Var.f26067b.isEmpty() && !f0Var2.f26067b.isEmpty()))) {
                map.put(Integer.valueOf(f0Var2.a()), f0Var2);
            }
        }
    }

    protected static int H(u7.q qVar, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(qVar.f26241d)) {
            return 4;
        }
        String strA0 = a0(str);
        String strA1 = a0(qVar.f26241d);
        if (strA1 == null || strA0 == null) {
            return (z10 && strA1 == null) ? 1 : 0;
        }
        if (strA1.startsWith(strA0) || strA0.startsWith(strA1)) {
            return 3;
        }
        return l0.n1(strA1, "-")[0].equals(l0.n1(strA0, "-")[0]) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int I(e0 e0Var, int i10, int i11, boolean z10) {
        int i12;
        int i13 = Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE && i11 != Integer.MAX_VALUE) {
            for (int i14 = 0; i14 < e0Var.f26054a; i14++) {
                u7.q qVarA = e0Var.a(i14);
                int i15 = qVarA.f26259v;
                if (i15 > 0 && (i12 = qVarA.f26260w) > 0) {
                    Point pointD = u.d(z10, i10, i11, i15, i12);
                    int i16 = qVarA.f26259v;
                    int i17 = qVarA.f26260w;
                    int i18 = i16 * i17;
                    if (i16 >= ((int) (pointD.x * 0.98f)) && i17 >= ((int) (pointD.y * 0.98f)) && i18 < i13) {
                        i13 = i18;
                    }
                }
            }
        }
        return i13;
    }

    private static String K(Context context) {
        CaptioningManager captioningManager;
        Locale locale;
        if (context == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            return null;
        }
        return l0.e0(locale);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int L(int i10, int i11) {
        if (i10 == 0 || i10 != i11) {
            return Integer.bitCount(i10 & i11);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int M(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
            case "video/dolby-vision":
                return 5;
            case "video/av01":
                return 4;
            case "video/hevc":
                return 3;
            case "video/avc":
                return 1;
            case "video/x-vnd.on2.vp9":
                return 2;
            default:
                return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public boolean Q(u7.q qVar, e eVar) {
        int i10;
        g gVar;
        g gVar2;
        return !eVar.f24552z0 || (i10 = qVar.E) == -1 || i10 <= 2 || (O(qVar) && (l0.f28136a < 32 || (gVar2 = this.f24515h) == null || !gVar2.d())) || (l0.f28136a >= 32 && (gVar = this.f24515h) != null && gVar.d() && this.f24515h.b() && this.f24515h.c() && this.f24515h.a(this.f24516i, qVar));
    }

    private static boolean O(u7.q qVar) {
        String str = qVar.f26252o;
        if (str == null) {
            return false;
        }
        str.hashCode();
        switch (str) {
            case "audio/eac3-joc":
            case "audio/ac3":
            case "audio/ac4":
            case "audio/eac3":
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean P(u7.q qVar) {
        String str = qVar.f26252o;
        if (str == null) {
            return false;
        }
        str.hashCode();
        switch (str) {
            case "audio/eac3-joc":
            case "audio/ac4":
            case "audio/iamf":
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List R(final e eVar, boolean z10, int[] iArr, int i10, e0 e0Var, int[] iArr2) {
        return b.e(i10, e0Var, eVar, iArr2, z10, new com.google.common.base.q() { // from class: q8.m
            @Override // com.google.common.base.q
            public final boolean apply(Object obj) {
                return this.f24508a.Q(eVar, (u7.q) obj);
            }
        }, iArr[i10]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List S(e eVar, int i10, e0 e0Var, int[] iArr) {
        return c.e(i10, e0Var, eVar, iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List T(e eVar, String str, String str2, int i10, e0 e0Var, int[] iArr) {
        return h.e(i10, e0Var, eVar, iArr, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List U(e eVar, String str, int[] iArr, Point point, int i10, e0 e0Var, int[] iArr2) {
        return j.i(i10, e0Var, eVar, iArr2, str, iArr[i10], point);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int V(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    private static void W(e eVar, s.a aVar, int[][][] iArr, y[] yVarArr, q[] qVarArr) {
        boolean z10;
        int i10 = -1;
        boolean z11 = false;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= aVar.d()) {
                z10 = false;
                break;
            }
            int iE = aVar.e(i11);
            q qVar = qVarArr[i11];
            if (iE != 1 && qVar != null) {
                z10 = true;
                break;
            }
            if (iE == 1 && qVar != null && qVar.length() == 1) {
                if (b0(eVar, iArr[i11][aVar.f(i11).d(qVar.m())][qVar.f(0)], qVar.s())) {
                    i12++;
                    i10 = i11;
                }
            }
            i11++;
        }
        if (z10 || i12 != 1) {
            return;
        }
        int i13 = eVar.f26124u.f26135b ? 1 : 2;
        y yVar = yVarArr[i10];
        if (yVar != null && yVar.f4175b) {
            z11 = true;
        }
        yVarArr[i10] = new y(i13, z11);
    }

    private static void X(s.a aVar, int[][][] iArr, y[] yVarArr, q[] qVarArr) {
        boolean z10;
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            if (i12 >= aVar.d()) {
                z10 = true;
                break;
            }
            int iE = aVar.e(i12);
            q qVar = qVarArr[i12];
            if ((iE == 1 || iE == 2) && qVar != null && c0(iArr[i12], aVar.f(i12), qVar)) {
                if (iE == 1) {
                    if (i11 != -1) {
                        z10 = false;
                        break;
                    }
                    i11 = i12;
                } else {
                    if (i10 != -1) {
                        z10 = false;
                        break;
                    }
                    i10 = i12;
                }
            }
            i12++;
        }
        if (z10 && ((i11 == -1 || i10 == -1) ? false : true)) {
            y yVar = new y(0, true);
            yVarArr[i11] = yVar;
            yVarArr[i10] = yVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        boolean z10;
        g gVar;
        synchronized (this.f24511d) {
            z10 = this.f24514g.f24552z0 && l0.f28136a >= 32 && (gVar = this.f24515h) != null && gVar.d();
        }
        if (z10) {
            f();
        }
    }

    private void Z(h2 h2Var) {
        boolean z10;
        synchronized (this.f24511d) {
            z10 = this.f24514g.D0;
        }
        if (z10) {
            g(h2Var);
        }
    }

    protected static String a0(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b0(e eVar, int i10, u7.q qVar) {
        if (i2.B(i10) == 0) {
            return false;
        }
        if (eVar.f26124u.f26136c && (i2.B(i10) & 2048) == 0) {
            return false;
        }
        if (eVar.f26124u.f26135b) {
            return !(qVar.H != 0 || qVar.I != 0) || ((i2.B(i10) & 1024) != 0);
        }
        return true;
    }

    private static boolean c0(int[][] iArr, x xVar, q qVar) {
        if (qVar == null) {
            return false;
        }
        int iD = xVar.d(qVar.m());
        for (int i10 = 0; i10 < qVar.length(); i10++) {
            if (i2.t(iArr[iD][qVar.f(i10)]) != 32) {
                return false;
            }
        }
        return true;
    }

    private <T extends i<T>> Pair<q.a, Integer> i0(int i10, s.a aVar, int[][][] iArr, i.a<T> aVar2, Comparator<List<T>> comparator) {
        int i11;
        RandomAccess randomAccessI;
        ArrayList arrayList = new ArrayList();
        int iD = aVar.d();
        int i12 = 0;
        while (i12 < iD) {
            if (i10 == aVar.e(i12)) {
                x xVarF = aVar.f(i12);
                for (int i13 = 0; i13 < xVarF.f22837a; i13++) {
                    e0 e0VarB = xVarF.b(i13);
                    List<T> listA = aVar2.a(i12, e0VarB, iArr[i12][i13]);
                    boolean[] zArr = new boolean[e0VarB.f26054a];
                    int i14 = 0;
                    while (i14 < e0VarB.f26054a) {
                        T t10 = listA.get(i14);
                        int iA = t10.a();
                        if (zArr[i14] || iA == 0) {
                            i11 = iD;
                        } else {
                            if (iA == 1) {
                                randomAccessI = com.google.common.collect.u.I(t10);
                                i11 = iD;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(t10);
                                int i15 = i14 + 1;
                                while (i15 < e0VarB.f26054a) {
                                    T t11 = listA.get(i15);
                                    int i16 = iD;
                                    if (t11.a() == 2 && t10.b(t11)) {
                                        arrayList2.add(t11);
                                        zArr[i15] = true;
                                    }
                                    i15++;
                                    iD = i16;
                                }
                                i11 = iD;
                                randomAccessI = arrayList2;
                            }
                            arrayList.add(randomAccessI);
                        }
                        i14++;
                        iD = i11;
                    }
                }
            }
            i12++;
            iD = iD;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i17 = 0; i17 < list.size(); i17++) {
            iArr2[i17] = ((i) list.get(i17)).f24576c;
        }
        i iVar = (i) list.get(0);
        return Pair.create(new q.a(iVar.f24575b, iArr2), Integer.valueOf(iVar.f24574a));
    }

    @Override // q8.v
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public e c() {
        e eVar;
        synchronized (this.f24511d) {
            eVar = this.f24514g;
        }
        return eVar;
    }

    @Override // io.bidmachine.media3.exoplayer.i2.a
    public void a(h2 h2Var) {
        Z(h2Var);
    }

    @Override // q8.v
    public i2.a d() {
        return this;
    }

    protected q.a[] d0(s.a aVar, int[][][] iArr, int[] iArr2, e eVar) throws ExoPlaybackException {
        String str;
        int iD = aVar.d();
        q.a[] aVarArr = new q.a[iD];
        Pair<q.a, Integer> pairE0 = e0(aVar, iArr, iArr2, eVar);
        if (pairE0 != null) {
            aVarArr[((Integer) pairE0.second).intValue()] = (q.a) pairE0.first;
        }
        if (pairE0 == null) {
            str = null;
        } else {
            Object obj = pairE0.first;
            str = ((q.a) obj).f24596a.a(((q.a) obj).f24597b[0]).f26241d;
        }
        Pair<q.a, Integer> pairJ0 = j0(aVar, iArr, iArr2, eVar, str);
        Pair<q.a, Integer> pairF0 = (eVar.A || pairJ0 == null) ? f0(aVar, iArr, eVar) : null;
        if (pairF0 != null) {
            aVarArr[((Integer) pairF0.second).intValue()] = (q.a) pairF0.first;
        } else if (pairJ0 != null) {
            aVarArr[((Integer) pairJ0.second).intValue()] = (q.a) pairJ0.first;
        }
        Pair<q.a, Integer> pairH0 = h0(aVar, iArr, eVar, str);
        if (pairH0 != null) {
            aVarArr[((Integer) pairH0.second).intValue()] = (q.a) pairH0.first;
        }
        for (int i10 = 0; i10 < iD; i10++) {
            int iE = aVar.e(i10);
            if (iE != 2 && iE != 1 && iE != 3 && iE != 4) {
                aVarArr[i10] = g0(iE, aVar.f(i10), iArr[i10], eVar);
            }
        }
        return aVarArr;
    }

    protected Pair<q.a, Integer> e0(s.a aVar, int[][][] iArr, final int[] iArr2, final e eVar) throws ExoPlaybackException {
        final boolean z10 = false;
        for (int i10 = 0; i10 < aVar.d(); i10++) {
            if (2 == aVar.e(i10) && aVar.f(i10).f22837a > 0) {
                z10 = true;
                break;
            }
        }
        return i0(1, aVar, iArr, new i.a() { // from class: q8.g
            @Override // q8.n.i.a
            public final List a(int i11, e0 e0Var, int[] iArr3) {
                return this.f24499a.R(eVar, z10, iArr2, i11, e0Var, iArr3);
            }
        }, new Comparator() { // from class: q8.h
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.b.c((List) obj, (List) obj2);
            }
        });
    }

    protected Pair<q.a, Integer> f0(s.a aVar, int[][][] iArr, final e eVar) throws ExoPlaybackException {
        if (eVar.f26124u.f26134a == 2) {
            return null;
        }
        return i0(4, aVar, iArr, new i.a() { // from class: q8.i
            @Override // q8.n.i.a
            public final List a(int i10, e0 e0Var, int[] iArr2) {
                return n.S(eVar, i10, e0Var, iArr2);
            }
        }, new Comparator() { // from class: q8.j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.c.c((List) obj, (List) obj2);
            }
        });
    }

    protected q.a g0(int i10, x xVar, int[][] iArr, e eVar) throws ExoPlaybackException {
        if (eVar.f26124u.f26134a == 2) {
            return null;
        }
        int i11 = 0;
        e0 e0Var = null;
        d dVar = null;
        for (int i12 = 0; i12 < xVar.f22837a; i12++) {
            e0 e0VarB = xVar.b(i12);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < e0VarB.f26054a; i13++) {
                if (i2.p(iArr2[i13], eVar.A0)) {
                    d dVar2 = new d(e0VarB.a(i13), iArr2[i13]);
                    if (dVar == null || dVar2.compareTo(dVar) > 0) {
                        e0Var = e0VarB;
                        i11 = i13;
                        dVar = dVar2;
                    }
                }
            }
        }
        if (e0Var == null) {
            return null;
        }
        return new q.a(e0Var, i11);
    }

    @Override // q8.v
    public boolean h() {
        return true;
    }

    protected Pair<q.a, Integer> h0(s.a aVar, int[][][] iArr, final e eVar, final String str) throws ExoPlaybackException {
        if (eVar.f26124u.f26134a == 2) {
            return null;
        }
        final String strK = eVar.f26127x ? K(this.f24512e) : null;
        return i0(3, aVar, iArr, new i.a() { // from class: q8.d
            @Override // q8.n.i.a
            public final List a(int i10, e0 e0Var, int[] iArr2) {
                return n.T(eVar, str, strK, i10, e0Var, iArr2);
            }
        }, new Comparator() { // from class: q8.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.h.c((List) obj, (List) obj2);
            }
        });
    }

    @Override // q8.v
    public void j() {
        g gVar;
        if (l0.f28136a >= 32 && (gVar = this.f24515h) != null) {
            gVar.e();
        }
        super.j();
    }

    protected Pair<q.a, Integer> j0(s.a aVar, int[][][] iArr, final int[] iArr2, final e eVar, final String str) throws ExoPlaybackException {
        Context context;
        final Point pointV = null;
        if (eVar.f26124u.f26134a == 2) {
            return null;
        }
        if (eVar.f26114k && (context = this.f24512e) != null) {
            pointV = l0.V(context);
        }
        return i0(2, aVar, iArr, new i.a() { // from class: q8.k
            @Override // q8.n.i.a
            public final List a(int i10, e0 e0Var, int[] iArr3) {
                return n.U(eVar, str, iArr2, pointV, i10, e0Var, iArr3);
            }
        }, new Comparator() { // from class: q8.l
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.j.h((List) obj, (List) obj2);
            }
        });
    }

    @Override // q8.v
    public void l(u7.c cVar) {
        if (this.f24516i.equals(cVar)) {
            return;
        }
        this.f24516i = cVar;
        Y();
    }

    @Override // q8.v
    public void m(g0 g0Var) {
        if (g0Var instanceof e) {
            k0((e) g0Var);
        }
        k0(new e.a().l0(g0Var).F());
    }

    @Override // q8.s
    protected final Pair<y[], q[]> q(s.a aVar, int[][][] iArr, int[] iArr2, io.bidmachine.media3.exoplayer.source.r.b bVar, d0 d0Var) throws ExoPlaybackException {
        e eVar;
        synchronized (this.f24511d) {
            eVar = this.f24514g;
        }
        if (eVar.f24552z0 && l0.f28136a >= 32 && this.f24515h == null) {
            this.f24515h = new g(this.f24512e, this);
        }
        int iD = aVar.d();
        q.a[] aVarArrD0 = d0(aVar, iArr, iArr2, eVar);
        F(aVar, eVar, aVarArrD0);
        E(aVar, eVar, aVarArrD0);
        for (int i10 = 0; i10 < iD; i10++) {
            int iE = aVar.e(i10);
            if (eVar.h(i10) || eVar.E.contains(Integer.valueOf(iE))) {
                aVarArrD0[i10] = null;
            }
        }
        q[] qVarArrA = this.f24513f.a(aVarArrD0, b(), bVar, d0Var);
        y[] yVarArr = new y[iD];
        for (int i11 = 0; i11 < iD; i11++) {
            boolean z10 = true;
            if ((eVar.h(i11) || eVar.E.contains(Integer.valueOf(aVar.e(i11)))) || (aVar.e(i11) != -2 && qVarArrA[i11] == null)) {
                z10 = false;
            }
            yVarArr[i11] = z10 ? y.f4173c : null;
        }
        if (eVar.B0) {
            X(aVar, iArr, yVarArr, qVarArrA);
        }
        if (eVar.f26124u.f26134a != 0) {
            W(eVar, aVar, iArr, yVarArr, qVarArrA);
        }
        return Pair.create(yVarArr, qVarArrA);
    }

    public n(Context context, q.b bVar) {
        this(context, e.G0, bVar);
    }

    public n(Context context, g0 g0Var, q.b bVar) {
        this(g0Var, bVar, context);
    }

    private void k0(e eVar) {
        boolean z10;
        x7.a.e(eVar);
        synchronized (this.f24511d) {
            if (!this.f24514g.equals(eVar)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f24514g = eVar;
        }
        if (z10) {
            if (eVar.f24552z0 && this.f24512e == null) {
                x7.r.h("DefaultTrackSelector", vgmm.PSHTlBsUlxFfnA);
            }
            f();
        }
    }

    private n(g0 g0Var, q.b bVar, Context context) {
        this.f24511d = new Object();
        this.f24512e = context != null ? context.getApplicationContext() : null;
        this.f24513f = bVar;
        if (g0Var instanceof e) {
            this.f24514g = (e) g0Var;
        } else {
            this.f24514g = e.G0.a().l0(g0Var).F();
        }
        this.f24516i = u7.c.f25984g;
        if (this.f24514g.f24552z0 && context == null) {
            x7.r.h("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }
}
