package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: CodedOutputStreamWriter.java */
/* JADX INFO: loaded from: classes.dex */
final class j implements q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CodedOutputStream f2206a;

    /* JADX INFO: compiled from: CodedOutputStreamWriter.java */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2207a;

        static {
            int[] iArr = new int[p1.b.values().length];
            f2207a = iArr;
            try {
                iArr[p1.b.f2266j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2207a[p1.b.f2265i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2207a[p1.b.f2263g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2207a[p1.b.f2273q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2207a[p1.b.f2275s.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2207a[p1.b.f2271o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2207a[p1.b.f2264h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2207a[p1.b.f2261e.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2207a[p1.b.f2274r.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2207a[p1.b.f2276t.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2207a[p1.b.f2262f.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2207a[p1.b.f2267k.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private j(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) y.b(codedOutputStream, "output");
        this.f2206a = codedOutputStream2;
        codedOutputStream2.f2084a = this;
    }

    private void A(int i10, g0 g0Var, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < g0Var.size()) {
                this.f2206a.F0(i10, g0Var.getLong(i11));
                i11++;
            }
            return;
        }
        this.f2206a.V0(i10, 2);
        int iY = 0;
        for (int i12 = 0; i12 < g0Var.size(); i12++) {
            iY += CodedOutputStream.y(g0Var.getLong(i12));
        }
        this.f2206a.X0(iY);
        while (i11 < g0Var.size()) {
            this.f2206a.G0(g0Var.getLong(i11));
            i11++;
        }
    }

    private void B(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f2206a.F0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f2206a.V0(i10, 2);
        int iY = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iY += CodedOutputStream.y(list.get(i12).longValue());
        }
        this.f2206a.X0(iY);
        while (i11 < list.size()) {
            this.f2206a.G0(list.get(i11).longValue());
            i11++;
        }
    }

    private void C(int i10, Object obj) throws IOException {
        if (obj instanceof String) {
            this.f2206a.T0(i10, (String) obj);
        } else {
            this.f2206a.n0(i10, (g) obj);
        }
    }

    private void D(int i10, x xVar, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < xVar.size()) {
                this.f2206a.L0(i10, xVar.getInt(i11));
                i11++;
            }
            return;
        }
        this.f2206a.V0(i10, 2);
        int iL = 0;
        for (int i12 = 0; i12 < xVar.size(); i12++) {
            iL += CodedOutputStream.L(xVar.getInt(i12));
        }
        this.f2206a.X0(iL);
        while (i11 < xVar.size()) {
            this.f2206a.M0(xVar.getInt(i11));
            i11++;
        }
    }

    private void E(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f2206a.L0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f2206a.V0(i10, 2);
        int iL = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iL += CodedOutputStream.L(list.get(i12).intValue());
        }
        this.f2206a.X0(iL);
        while (i11 < list.size()) {
            this.f2206a.M0(list.get(i11).intValue());
            i11++;
        }
    }

    private void F(int i10, g0 g0Var, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < g0Var.size()) {
                this.f2206a.N0(i10, g0Var.getLong(i11));
                i11++;
            }
            return;
        }
        this.f2206a.V0(i10, 2);
        int iN = 0;
        for (int i12 = 0; i12 < g0Var.size(); i12++) {
            iN += CodedOutputStream.N(g0Var.getLong(i12));
        }
        this.f2206a.X0(iN);
        while (i11 < g0Var.size()) {
            this.f2206a.O0(g0Var.getLong(i11));
            i11++;
        }
    }

    private void G(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f2206a.N0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f2206a.V0(i10, 2);
        int iN = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iN += CodedOutputStream.N(list.get(i12).longValue());
        }
        this.f2206a.X0(iN);
        while (i11 < list.size()) {
            this.f2206a.O0(list.get(i11).longValue());
            i11++;
        }
    }

    private void H(int i10, x xVar, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < xVar.size()) {
                this.f2206a.P0(i10, xVar.getInt(i11));
                i11++;
            }
            return;
        }
        this.f2206a.V0(i10, 2);
        int iP = 0;
        for (int i12 = 0; i12 < xVar.size(); i12++) {
            iP += CodedOutputStream.P(xVar.getInt(i12));
        }
        this.f2206a.X0(iP);
        while (i11 < xVar.size()) {
            this.f2206a.Q0(xVar.getInt(i11));
            i11++;
        }
    }

    private void J(int i10, g0 g0Var, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < g0Var.size()) {
                this.f2206a.R0(i10, g0Var.getLong(i11));
                i11++;
            }
            return;
        }
        this.f2206a.V0(i10, 2);
        int iR = 0;
        for (int i12 = 0; i12 < g0Var.size(); i12++) {
            iR += CodedOutputStream.R(g0Var.getLong(i12));
        }
        this.f2206a.X0(iR);
        while (i11 < g0Var.size()) {
            this.f2206a.S0(g0Var.getLong(i11));
            i11++;
        }
    }

    private void K(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f2206a.R0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f2206a.V0(i10, 2);
        int iR = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iR += CodedOutputStream.R(list.get(i12).longValue());
        }
        this.f2206a.X0(iR);
        while (i11 < list.size()) {
            this.f2206a.S0(list.get(i11).longValue());
            i11++;
        }
    }

    private void L(int i10, x xVar, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < xVar.size()) {
                this.f2206a.W0(i10, xVar.getInt(i11));
                i11++;
            }
            return;
        }
        this.f2206a.V0(i10, 2);
        int iW = 0;
        for (int i12 = 0; i12 < xVar.size(); i12++) {
            iW += CodedOutputStream.W(xVar.getInt(i12));
        }
        this.f2206a.X0(iW);
        while (i11 < xVar.size()) {
            this.f2206a.X0(xVar.getInt(i11));
            i11++;
        }
    }

    private void N(int i10, g0 g0Var, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < g0Var.size()) {
                this.f2206a.Y0(i10, g0Var.getLong(i11));
                i11++;
            }
            return;
        }
        this.f2206a.V0(i10, 2);
        int iY = 0;
        for (int i12 = 0; i12 < g0Var.size(); i12++) {
            iY += CodedOutputStream.Y(g0Var.getLong(i12));
        }
        this.f2206a.X0(iY);
        while (i11 < g0Var.size()) {
            this.f2206a.Z0(g0Var.getLong(i11));
            i11++;
        }
    }

    private void O(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f2206a.Y0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f2206a.V0(i10, 2);
        int iY = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iY += CodedOutputStream.Y(list.get(i12).longValue());
        }
        this.f2206a.X0(iY);
        while (i11 < list.size()) {
            this.f2206a.Z0(list.get(i11).longValue());
            i11++;
        }
    }

    public static j g(CodedOutputStream codedOutputStream) {
        j jVar = codedOutputStream.f2084a;
        return jVar != null ? jVar : new j(codedOutputStream);
    }

    private void h(int i10, e eVar, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < eVar.size()) {
                this.f2206a.j0(i10, eVar.getBoolean(i11));
                i11++;
            }
            return;
        }
        this.f2206a.V0(i10, 2);
        int iE = 0;
        for (int i12 = 0; i12 < eVar.size(); i12++) {
            iE += CodedOutputStream.e(eVar.getBoolean(i12));
        }
        this.f2206a.X0(iE);
        while (i11 < eVar.size()) {
            this.f2206a.k0(eVar.getBoolean(i11));
            i11++;
        }
    }

    private void i(int i10, List<Boolean> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f2206a.j0(i10, list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        this.f2206a.V0(i10, 2);
        int iE = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iE += CodedOutputStream.e(list.get(i12).booleanValue());
        }
        this.f2206a.X0(iE);
        while (i11 < list.size()) {
            this.f2206a.k0(list.get(i11).booleanValue());
            i11++;
        }
    }

    private <V> void j(int i10, boolean z10, V v10, i0.a<Boolean, V> aVar) throws IOException {
        this.f2206a.V0(i10, 2);
        this.f2206a.X0(i0.b(aVar, Boolean.valueOf(z10), v10));
        i0.e(this.f2206a, aVar, Boolean.valueOf(z10), v10);
    }

    private <V> void k(int i10, i0.a<Integer, V> aVar, Map<Integer, V> map) throws IOException {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            iArr[i11] = it.next().intValue();
            i11++;
        }
        Arrays.sort(iArr);
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = iArr[i12];
            V v10 = map.get(Integer.valueOf(i13));
            this.f2206a.V0(i10, 2);
            this.f2206a.X0(i0.b(aVar, Integer.valueOf(i13), v10));
            i0.e(this.f2206a, aVar, Integer.valueOf(i13), v10);
        }
    }

    private <V> void l(int i10, i0.a<Long, V> aVar, Map<Long, V> map) throws IOException {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator<Long> it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            jArr[i11] = it.next().longValue();
            i11++;
        }
        Arrays.sort(jArr);
        for (int i12 = 0; i12 < size; i12++) {
            long j10 = jArr[i12];
            V v10 = map.get(Long.valueOf(j10));
            this.f2206a.V0(i10, 2);
            this.f2206a.X0(i0.b(aVar, Long.valueOf(j10), v10));
            i0.e(this.f2206a, aVar, Long.valueOf(j10), v10);
        }
    }

    private <K, V> void m(int i10, i0.a<K, V> aVar, Map<K, V> map) throws IOException {
        switch (a.f2207a[aVar.f2197a.ordinal()]) {
            case 1:
                V v10 = map.get(Boolean.FALSE);
                if (v10 != null) {
                    j(i10, false, v10, aVar);
                }
                V v11 = map.get(Boolean.TRUE);
                if (v11 != null) {
                    j(i10, true, v11, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                k(i10, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                l(i10, aVar, map);
                return;
            case 12:
                n(i10, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f2197a);
        }
    }

    private <V> void n(int i10, i0.a<String, V> aVar, Map<String, V> map) throws IOException {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator<String> it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            strArr[i11] = it.next();
            i11++;
        }
        Arrays.sort(strArr);
        for (int i12 = 0; i12 < size; i12++) {
            String str = strArr[i12];
            V v10 = map.get(str);
            this.f2206a.V0(i10, 2);
            this.f2206a.X0(i0.b(aVar, str, v10));
            i0.e(this.f2206a, aVar, str, v10);
        }
    }

    private void o(int i10, k kVar, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < kVar.size()) {
                this.f2206a.p0(i10, kVar.getDouble(i11));
                i11++;
            }
            return;
        }
        this.f2206a.V0(i10, 2);
        int iJ = 0;
        for (int i12 = 0; i12 < kVar.size(); i12++) {
            iJ += CodedOutputStream.j(kVar.getDouble(i12));
        }
        this.f2206a.X0(iJ);
        while (i11 < kVar.size()) {
            this.f2206a.q0(kVar.getDouble(i11));
            i11++;
        }
    }

    private void p(int i10, List<Double> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f2206a.p0(i10, list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        this.f2206a.V0(i10, 2);
        int iJ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iJ += CodedOutputStream.j(list.get(i12).doubleValue());
        }
        this.f2206a.X0(iJ);
        while (i11 < list.size()) {
            this.f2206a.q0(list.get(i11).doubleValue());
            i11++;
        }
    }

    private void q(int i10, x xVar, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < xVar.size()) {
                this.f2206a.r0(i10, xVar.getInt(i11));
                i11++;
            }
            return;
        }
        this.f2206a.V0(i10, 2);
        int iL = 0;
        for (int i12 = 0; i12 < xVar.size(); i12++) {
            iL += CodedOutputStream.l(xVar.getInt(i12));
        }
        this.f2206a.X0(iL);
        while (i11 < xVar.size()) {
            this.f2206a.s0(xVar.getInt(i11));
            i11++;
        }
    }

    private void r(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f2206a.r0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f2206a.V0(i10, 2);
        int iL = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iL += CodedOutputStream.l(list.get(i12).intValue());
        }
        this.f2206a.X0(iL);
        while (i11 < list.size()) {
            this.f2206a.s0(list.get(i11).intValue());
            i11++;
        }
    }

    private void s(int i10, x xVar, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < xVar.size()) {
                this.f2206a.t0(i10, xVar.getInt(i11));
                i11++;
            }
            return;
        }
        this.f2206a.V0(i10, 2);
        int iN = 0;
        for (int i12 = 0; i12 < xVar.size(); i12++) {
            iN += CodedOutputStream.n(xVar.getInt(i12));
        }
        this.f2206a.X0(iN);
        while (i11 < xVar.size()) {
            this.f2206a.u0(xVar.getInt(i11));
            i11++;
        }
    }

    private void t(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f2206a.t0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f2206a.V0(i10, 2);
        int iN = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iN += CodedOutputStream.n(list.get(i12).intValue());
        }
        this.f2206a.X0(iN);
        while (i11 < list.size()) {
            this.f2206a.u0(list.get(i11).intValue());
            i11++;
        }
    }

    private void u(int i10, g0 g0Var, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < g0Var.size()) {
                this.f2206a.v0(i10, g0Var.getLong(i11));
                i11++;
            }
            return;
        }
        this.f2206a.V0(i10, 2);
        int iP = 0;
        for (int i12 = 0; i12 < g0Var.size(); i12++) {
            iP += CodedOutputStream.p(g0Var.getLong(i12));
        }
        this.f2206a.X0(iP);
        while (i11 < g0Var.size()) {
            this.f2206a.w0(g0Var.getLong(i11));
            i11++;
        }
    }

    private void v(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f2206a.v0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f2206a.V0(i10, 2);
        int iP = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iP += CodedOutputStream.p(list.get(i12).longValue());
        }
        this.f2206a.X0(iP);
        while (i11 < list.size()) {
            this.f2206a.w0(list.get(i11).longValue());
            i11++;
        }
    }

    private void w(int i10, u uVar, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < uVar.size()) {
                this.f2206a.x0(i10, uVar.getFloat(i11));
                i11++;
            }
            return;
        }
        this.f2206a.V0(i10, 2);
        int iR = 0;
        for (int i12 = 0; i12 < uVar.size(); i12++) {
            iR += CodedOutputStream.r(uVar.getFloat(i12));
        }
        this.f2206a.X0(iR);
        while (i11 < uVar.size()) {
            this.f2206a.y0(uVar.getFloat(i11));
            i11++;
        }
    }

    private void x(int i10, List<Float> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f2206a.x0(i10, list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        this.f2206a.V0(i10, 2);
        int iR = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iR += CodedOutputStream.r(list.get(i12).floatValue());
        }
        this.f2206a.X0(iR);
        while (i11 < list.size()) {
            this.f2206a.y0(list.get(i11).floatValue());
            i11++;
        }
    }

    private void y(int i10, x xVar, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < xVar.size()) {
                this.f2206a.D0(i10, xVar.getInt(i11));
                i11++;
            }
            return;
        }
        this.f2206a.V0(i10, 2);
        int iW = 0;
        for (int i12 = 0; i12 < xVar.size(); i12++) {
            iW += CodedOutputStream.w(xVar.getInt(i12));
        }
        this.f2206a.X0(iW);
        while (i11 < xVar.size()) {
            this.f2206a.E0(xVar.getInt(i11));
            i11++;
        }
    }

    private void z(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f2206a.D0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f2206a.V0(i10, 2);
        int iW = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iW += CodedOutputStream.w(list.get(i12).intValue());
        }
        this.f2206a.X0(iW);
        while (i11 < list.size()) {
            this.f2206a.E0(list.get(i11).intValue());
            i11++;
        }
    }

    public void I(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f2206a.P0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f2206a.V0(i10, 2);
        int iP = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iP += CodedOutputStream.P(list.get(i12).intValue());
        }
        this.f2206a.X0(iP);
        while (i11 < list.size()) {
            this.f2206a.Q0(list.get(i11).intValue());
            i11++;
        }
    }

    public void M(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f2206a.W0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f2206a.V0(i10, 2);
        int iW = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iW += CodedOutputStream.W(list.get(i12).intValue());
        }
        this.f2206a.X0(iW);
        while (i11 < list.size()) {
            this.f2206a.X0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void a(int i10, List<?> list, e1 e1Var) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            e(i10, list.get(i11), e1Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void b(int i10, g gVar) throws IOException {
        this.f2206a.n0(i10, gVar);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void c(int i10, Object obj, e1 e1Var) throws IOException {
        this.f2206a.H0(i10, (p0) obj, e1Var);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public <K, V> void d(int i10, i0.a<K, V> aVar, Map<K, V> map) throws IOException {
        if (this.f2206a.d0()) {
            m(i10, aVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f2206a.V0(i10, 2);
            this.f2206a.X0(i0.b(aVar, entry.getKey(), entry.getValue()));
            i0.e(this.f2206a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void e(int i10, Object obj, e1 e1Var) throws IOException {
        this.f2206a.A0(i10, (p0) obj, e1Var);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void f(int i10, List<?> list, e1 e1Var) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            c(i10, list.get(i11), e1Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public q1.a fieldOrder() {
        return q1.a.ASCENDING;
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeBool(int i10, boolean z10) throws IOException {
        this.f2206a.j0(i10, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeBoolList(int i10, List<Boolean> list, boolean z10) throws IOException {
        if (list instanceof e) {
            h(i10, (e) list, z10);
        } else {
            i(i10, list, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeBytesList(int i10, List<g> list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f2206a.n0(i10, list.get(i11));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeDouble(int i10, double d10) throws IOException {
        this.f2206a.p0(i10, d10);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeDoubleList(int i10, List<Double> list, boolean z10) throws IOException {
        if (list instanceof k) {
            o(i10, (k) list, z10);
        } else {
            p(i10, list, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    @Deprecated
    public void writeEndGroup(int i10) throws IOException {
        this.f2206a.V0(i10, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeEnum(int i10, int i11) throws IOException {
        this.f2206a.r0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeEnumList(int i10, List<Integer> list, boolean z10) throws IOException {
        if (list instanceof x) {
            q(i10, (x) list, z10);
        } else {
            r(i10, list, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeFixed32(int i10, int i11) throws IOException {
        this.f2206a.t0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeFixed32List(int i10, List<Integer> list, boolean z10) throws IOException {
        if (list instanceof x) {
            s(i10, (x) list, z10);
        } else {
            t(i10, list, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeFixed64(int i10, long j10) throws IOException {
        this.f2206a.v0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeFixed64List(int i10, List<Long> list, boolean z10) throws IOException {
        if (list instanceof g0) {
            u(i10, (g0) list, z10);
        } else {
            v(i10, list, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeFloat(int i10, float f10) throws IOException {
        this.f2206a.x0(i10, f10);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeFloatList(int i10, List<Float> list, boolean z10) throws IOException {
        if (list instanceof u) {
            w(i10, (u) list, z10);
        } else {
            x(i10, list, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeInt32(int i10, int i11) throws IOException {
        this.f2206a.D0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeInt32List(int i10, List<Integer> list, boolean z10) throws IOException {
        if (list instanceof x) {
            y(i10, (x) list, z10);
        } else {
            z(i10, list, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeInt64(int i10, long j10) throws IOException {
        this.f2206a.F0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeInt64List(int i10, List<Long> list, boolean z10) throws IOException {
        if (list instanceof g0) {
            A(i10, (g0) list, z10);
        } else {
            B(i10, list, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public final void writeMessageSetItem(int i10, Object obj) throws IOException {
        if (obj instanceof g) {
            this.f2206a.K0(i10, (g) obj);
        } else {
            this.f2206a.J0(i10, (p0) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeSFixed32(int i10, int i11) throws IOException {
        this.f2206a.L0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeSFixed32List(int i10, List<Integer> list, boolean z10) throws IOException {
        if (list instanceof x) {
            D(i10, (x) list, z10);
        } else {
            E(i10, list, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeSFixed64(int i10, long j10) throws IOException {
        this.f2206a.N0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeSFixed64List(int i10, List<Long> list, boolean z10) throws IOException {
        if (list instanceof g0) {
            F(i10, (g0) list, z10);
        } else {
            G(i10, list, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeSInt32(int i10, int i11) throws IOException {
        this.f2206a.P0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeSInt32List(int i10, List<Integer> list, boolean z10) throws IOException {
        if (list instanceof x) {
            H(i10, (x) list, z10);
        } else {
            I(i10, list, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeSInt64(int i10, long j10) throws IOException {
        this.f2206a.R0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeSInt64List(int i10, List<Long> list, boolean z10) throws IOException {
        if (list instanceof g0) {
            J(i10, (g0) list, z10);
        } else {
            K(i10, list, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    @Deprecated
    public void writeStartGroup(int i10) throws IOException {
        this.f2206a.V0(i10, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeString(int i10, String str) throws IOException {
        this.f2206a.T0(i10, str);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeStringList(int i10, List<String> list) throws IOException {
        int i11 = 0;
        if (!(list instanceof c0)) {
            while (i11 < list.size()) {
                this.f2206a.T0(i10, list.get(i11));
                i11++;
            }
        } else {
            c0 c0Var = (c0) list;
            while (i11 < list.size()) {
                C(i10, c0Var.getRaw(i11));
                i11++;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeUInt32(int i10, int i11) throws IOException {
        this.f2206a.W0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeUInt32List(int i10, List<Integer> list, boolean z10) throws IOException {
        if (list instanceof x) {
            L(i10, (x) list, z10);
        } else {
            M(i10, list, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeUInt64(int i10, long j10) throws IOException {
        this.f2206a.Y0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void writeUInt64List(int i10, List<Long> list, boolean z10) throws IOException {
        if (list instanceof g0) {
            N(i10, (g0) list, z10);
        } else {
            O(i10, list, z10);
        }
    }
}
