package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: SchemaUtil.java */
/* JADX INFO: loaded from: classes.dex */
final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class<?> f2141a = B();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k1<?, ?> f2142b = C();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final k1<?, ?> f2143c = new m1();

    static <UT, UB> UB A(Object obj, int i10, List<Integer> list, y.e eVar, UB ub2, k1<UT, UB> k1Var) {
        if (eVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int iIntValue = list.get(i12).intValue();
                if (eVar.isInRange(iIntValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(iIntValue));
                    }
                    i11++;
                } else {
                    ub2 = (UB) J(obj, i10, iIntValue, ub2, k1Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (!eVar.isInRange(iIntValue2)) {
                    ub2 = (UB) J(obj, i10, iIntValue2, ub2, k1Var);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    private static Class<?> B() {
        if (a1.f2102d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static k1<?, ?> C() {
        try {
            Class<?> clsD = D();
            if (clsD == null) {
                return null;
            }
            return (k1) clsD.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> D() {
        if (a1.f2102d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static <T, FT extends s.b<FT>> void E(o<FT> oVar, T t10, T t11) {
        s<T> sVarC = oVar.c(t11);
        if (sVarC.n()) {
            return;
        }
        oVar.d(t10).v(sVarC);
    }

    static <T> void F(k0 k0Var, T t10, T t11, long j10) {
        n1.O(t10, j10, k0Var.mergeFrom(n1.z(t10, j10), n1.z(t11, j10)));
    }

    static <T, UT, UB> void G(k1<UT, UB> k1Var, T t10, T t11) {
        k1Var.p(t10, k1Var.k(k1Var.g(t10), k1Var.g(t11)));
    }

    public static void H(Class<?> cls) {
        Class<?> cls2;
        if (!w.class.isAssignableFrom(cls) && !a1.f2102d && (cls2 = f2141a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean I(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static <UT, UB> UB J(Object obj, int i10, int i11, UB ub2, k1<UT, UB> k1Var) {
        if (ub2 == null) {
            ub2 = k1Var.f(obj);
        }
        k1Var.e(ub2, i10, i11);
        return ub2;
    }

    public static k1<?, ?> K() {
        return f2142b;
    }

    public static k1<?, ?> L() {
        return f2143c;
    }

    public static void M(int i10, List<Boolean> list, q1 q1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.writeBoolList(i10, list, z10);
    }

    public static void N(int i10, List<g> list, q1 q1Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.writeBytesList(i10, list);
    }

    public static void O(int i10, List<Double> list, q1 q1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.writeDoubleList(i10, list, z10);
    }

    public static void P(int i10, List<Integer> list, q1 q1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.writeEnumList(i10, list, z10);
    }

    public static void Q(int i10, List<Integer> list, q1 q1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.writeFixed32List(i10, list, z10);
    }

    public static void R(int i10, List<Long> list, q1 q1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.writeFixed64List(i10, list, z10);
    }

    public static void S(int i10, List<Float> list, q1 q1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.writeFloatList(i10, list, z10);
    }

    public static void T(int i10, List<?> list, q1 q1Var, e1 e1Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.a(i10, list, e1Var);
    }

    public static void U(int i10, List<Integer> list, q1 q1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.writeInt32List(i10, list, z10);
    }

    public static void V(int i10, List<Long> list, q1 q1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.writeInt64List(i10, list, z10);
    }

    public static void W(int i10, List<?> list, q1 q1Var, e1 e1Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.f(i10, list, e1Var);
    }

    public static void X(int i10, List<Integer> list, q1 q1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.writeSFixed32List(i10, list, z10);
    }

    public static void Y(int i10, List<Long> list, q1 q1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.writeSFixed64List(i10, list, z10);
    }

    public static void Z(int i10, List<Integer> list, q1 q1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.writeSInt32List(i10, list, z10);
    }

    static int a(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? CodedOutputStream.U(i10) + CodedOutputStream.C(size) : size * CodedOutputStream.d(i10, true);
    }

    public static void a0(int i10, List<Long> list, q1 q1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.writeSInt64List(i10, list, z10);
    }

    static int b(List<?> list) {
        return list.size();
    }

    public static void b0(int i10, List<String> list, q1 q1Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.writeStringList(i10, list);
    }

    static int c(int i10, List<g> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iU = size * CodedOutputStream.U(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            iU += CodedOutputStream.h(list.get(i11));
        }
        return iU;
    }

    public static void c0(int i10, List<Integer> list, q1 q1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.writeUInt32List(i10, list, z10);
    }

    static int d(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = e(list);
        return z10 ? CodedOutputStream.U(i10) + CodedOutputStream.C(iE) : iE + (size * CodedOutputStream.U(i10));
    }

    public static void d0(int i10, List<Long> list, q1 q1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.writeUInt64List(i10, list, z10);
    }

    static int e(List<Integer> list) {
        int iL;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            x xVar = (x) list;
            iL = 0;
            while (i10 < size) {
                iL += CodedOutputStream.l(xVar.getInt(i10));
                i10++;
            }
        } else {
            iL = 0;
            while (i10 < size) {
                iL += CodedOutputStream.l(list.get(i10).intValue());
                i10++;
            }
        }
        return iL;
    }

    static int f(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? CodedOutputStream.U(i10) + CodedOutputStream.C(size * 4) : size * CodedOutputStream.m(i10, 0);
    }

    static int g(List<?> list) {
        return list.size() * 4;
    }

    static int h(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? CodedOutputStream.U(i10) + CodedOutputStream.C(size * 8) : size * CodedOutputStream.o(i10, 0L);
    }

    static int i(List<?> list) {
        return list.size() * 8;
    }

    static int j(int i10, List<p0> list, e1 e1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iS = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iS += CodedOutputStream.s(i10, list.get(i11), e1Var);
        }
        return iS;
    }

    static int k(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = l(list);
        return z10 ? CodedOutputStream.U(i10) + CodedOutputStream.C(iL) : iL + (size * CodedOutputStream.U(i10));
    }

    static int l(List<Integer> list) {
        int iW;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            x xVar = (x) list;
            iW = 0;
            while (i10 < size) {
                iW += CodedOutputStream.w(xVar.getInt(i10));
                i10++;
            }
        } else {
            iW = 0;
            while (i10 < size) {
                iW += CodedOutputStream.w(list.get(i10).intValue());
                i10++;
            }
        }
        return iW;
    }

    static int m(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int iN = n(list);
        return z10 ? CodedOutputStream.U(i10) + CodedOutputStream.C(iN) : iN + (list.size() * CodedOutputStream.U(i10));
    }

    static int n(List<Long> list) {
        int iY;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof g0) {
            g0 g0Var = (g0) list;
            iY = 0;
            while (i10 < size) {
                iY += CodedOutputStream.y(g0Var.getLong(i10));
                i10++;
            }
        } else {
            iY = 0;
            while (i10 < size) {
                iY += CodedOutputStream.y(list.get(i10).longValue());
                i10++;
            }
        }
        return iY;
    }

    static int o(int i10, Object obj, e1 e1Var) {
        return obj instanceof b0 ? CodedOutputStream.A(i10, (b0) obj) : CodedOutputStream.F(i10, (p0) obj, e1Var);
    }

    static int p(int i10, List<?> list, e1 e1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iU = CodedOutputStream.U(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            iU += obj instanceof b0 ? CodedOutputStream.B((b0) obj) : CodedOutputStream.H((p0) obj, e1Var);
        }
        return iU;
    }

    static int q(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = r(list);
        return z10 ? CodedOutputStream.U(i10) + CodedOutputStream.C(iR) : iR + (size * CodedOutputStream.U(i10));
    }

    static int r(List<Integer> list) {
        int iP;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            x xVar = (x) list;
            iP = 0;
            while (i10 < size) {
                iP += CodedOutputStream.P(xVar.getInt(i10));
                i10++;
            }
        } else {
            iP = 0;
            while (i10 < size) {
                iP += CodedOutputStream.P(list.get(i10).intValue());
                i10++;
            }
        }
        return iP;
    }

    static int s(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = t(list);
        return z10 ? CodedOutputStream.U(i10) + CodedOutputStream.C(iT) : iT + (size * CodedOutputStream.U(i10));
    }

    static int t(List<Long> list) {
        int iR;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof g0) {
            g0 g0Var = (g0) list;
            iR = 0;
            while (i10 < size) {
                iR += CodedOutputStream.R(g0Var.getLong(i10));
                i10++;
            }
        } else {
            iR = 0;
            while (i10 < size) {
                iR += CodedOutputStream.R(list.get(i10).longValue());
                i10++;
            }
        }
        return iR;
    }

    static int u(int i10, List<?> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iU = CodedOutputStream.U(i10) * size;
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            while (i11 < size) {
                Object raw = c0Var.getRaw(i11);
                iU += raw instanceof g ? CodedOutputStream.h((g) raw) : CodedOutputStream.T((String) raw);
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                iU += obj instanceof g ? CodedOutputStream.h((g) obj) : CodedOutputStream.T((String) obj);
                i11++;
            }
        }
        return iU;
    }

    static int v(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = w(list);
        return z10 ? CodedOutputStream.U(i10) + CodedOutputStream.C(iW) : iW + (size * CodedOutputStream.U(i10));
    }

    static int w(List<Integer> list) {
        int iW;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            x xVar = (x) list;
            iW = 0;
            while (i10 < size) {
                iW += CodedOutputStream.W(xVar.getInt(i10));
                i10++;
            }
        } else {
            iW = 0;
            while (i10 < size) {
                iW += CodedOutputStream.W(list.get(i10).intValue());
                i10++;
            }
        }
        return iW;
    }

    static int x(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = y(list);
        return z10 ? CodedOutputStream.U(i10) + CodedOutputStream.C(iY) : iY + (size * CodedOutputStream.U(i10));
    }

    static int y(List<Long> list) {
        int iY;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof g0) {
            g0 g0Var = (g0) list;
            iY = 0;
            while (i10 < size) {
                iY += CodedOutputStream.Y(g0Var.getLong(i10));
                i10++;
            }
        } else {
            iY = 0;
            while (i10 < size) {
                iY += CodedOutputStream.Y(list.get(i10).longValue());
                i10++;
            }
        }
        return iY;
    }

    static <UT, UB> UB z(Object obj, int i10, List<Integer> list, y.d<?> dVar, UB ub2, k1<UT, UB> k1Var) {
        if (dVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int iIntValue = list.get(i12).intValue();
                if (dVar.findValueByNumber(iIntValue) != null) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(iIntValue));
                    }
                    i11++;
                } else {
                    ub2 = (UB) J(obj, i10, iIntValue, ub2, k1Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (dVar.findValueByNumber(iIntValue2) == null) {
                    ub2 = (UB) J(obj, i10, iIntValue2, ub2, k1Var);
                    it.remove();
                }
            }
        }
        return ub2;
    }
}
