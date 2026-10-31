package com.explorestack.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: SchemaUtil.java */
/* JADX INFO: loaded from: classes.dex */
final class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class<?> f10344a = B();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final t2<?, ?> f10345b = D(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final t2<?, ?> f10346c = D(true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final t2<?, ?> f10347d = new w2();

    static <UT, UB> UB A(int i10, List<Integer> list, l0.e eVar, UB ub2, t2<UT, UB> t2Var) {
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
                    ub2 = (UB) M(i10, iIntValue, ub2, t2Var);
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
                    ub2 = (UB) M(i10, iIntValue2, ub2, t2Var);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    private static Class<?> B() {
        try {
            boolean z10 = j0.alwaysUseFieldBuilders;
            return j0.class;
        } catch (Throwable unused) {
            return null;
        }
    }

    static Object C(Class<?> cls, String str) {
        try {
            java.lang.reflect.Field[] declaredFields = Class.forName(cls.getName() + "$" + N(str, true) + "DefaultEntryHolder").getDeclaredFields();
            if (declaredFields.length == 1) {
                return z2.H(declaredFields[0]);
            }
            throw new IllegalStateException("Unable to look up map field default entry holder class for " + str + " in " + cls.getName());
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    private static t2<?, ?> D(boolean z10) {
        try {
            Class<?> clsE = E();
            if (clsE == null) {
                return null;
            }
            return (t2) clsE.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> E() {
        return x2.class;
    }

    static <T, FT extends e0.c<FT>> void F(z<FT> zVar, T t10, T t11) {
        e0<T> e0VarC = zVar.c(t11);
        if (e0VarC.B()) {
            return;
        }
        zVar.d(t10).I(e0VarC);
    }

    static <T> void G(a1 a1Var, T t10, T t11, long j10) {
        z2.X(t10, j10, a1Var.mergeFrom(z2.G(t10, j10), z2.G(t11, j10)));
    }

    static <T, UT, UB> void H(t2<UT, UB> t2Var, T t10, T t11) {
        t2Var.p(t10, t2Var.k(t2Var.g(t10), t2Var.g(t11)));
    }

    public static t2<?, ?> I() {
        return f10345b;
    }

    public static t2<?, ?> J() {
        return f10346c;
    }

    public static void K(Class<?> cls) {
        Class<?> cls2;
        if (!i0.class.isAssignableFrom(cls) && (cls2 = f10344a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean L(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static <UT, UB> UB M(int i10, int i11, UB ub2, t2<UT, UB> t2Var) {
        if (ub2 == null) {
            ub2 = t2Var.n();
        }
        t2Var.e(ub2, i10, i11);
        return ub2;
    }

    static String N(String str, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if ('a' > cCharAt || cCharAt > 'z') {
                if ('A' > cCharAt || cCharAt > 'Z') {
                    if ('0' <= cCharAt && cCharAt <= '9') {
                        sb2.append(cCharAt);
                    }
                    z10 = true;
                } else if (i10 != 0 || z10) {
                    sb2.append(cCharAt);
                } else {
                    sb2.append((char) (cCharAt + ' '));
                }
            } else if (z10) {
                sb2.append((char) (cCharAt - ' '));
            } else {
                sb2.append(cCharAt);
            }
            z10 = false;
        }
        return sb2.toString();
    }

    public static t2<?, ?> O() {
        return f10347d;
    }

    public static void P(int i10, List<Boolean> list, e3 e3Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        e3Var.writeBoolList(i10, list, z10);
    }

    public static void Q(int i10, List<ByteString> list, e3 e3Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        e3Var.writeBytesList(i10, list);
    }

    public static void R(int i10, List<Double> list, e3 e3Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        e3Var.writeDoubleList(i10, list, z10);
    }

    public static void S(int i10, List<Integer> list, e3 e3Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        e3Var.writeEnumList(i10, list, z10);
    }

    public static void T(int i10, List<Integer> list, e3 e3Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        e3Var.writeFixed32List(i10, list, z10);
    }

    public static void U(int i10, List<Long> list, e3 e3Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        e3Var.writeFixed64List(i10, list, z10);
    }

    public static void V(int i10, List<Float> list, e3 e3Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        e3Var.writeFloatList(i10, list, z10);
    }

    public static void W(int i10, List<?> list, e3 e3Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        e3Var.writeGroupList(i10, list);
    }

    public static void X(int i10, List<?> list, e3 e3Var, b2 b2Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        e3Var.d(i10, list, b2Var);
    }

    public static void Y(int i10, List<Integer> list, e3 e3Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        e3Var.writeInt32List(i10, list, z10);
    }

    public static void Z(int i10, List<Long> list, e3 e3Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        e3Var.writeInt64List(i10, list, z10);
    }

    static int a(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? CodedOutputStream.X(i10) + CodedOutputStream.E(size) : size * CodedOutputStream.e(i10, true);
    }

    public static void a0(int i10, List<?> list, e3 e3Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        e3Var.writeMessageList(i10, list);
    }

    static int b(List<?> list) {
        return list.size();
    }

    public static void b0(int i10, List<?> list, e3 e3Var, b2 b2Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        e3Var.b(i10, list, b2Var);
    }

    static int c(int i10, List<ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX = size * CodedOutputStream.X(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            iX += CodedOutputStream.i(list.get(i11));
        }
        return iX;
    }

    public static void c0(int i10, List<Integer> list, e3 e3Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        e3Var.writeSFixed32List(i10, list, z10);
    }

    static int d(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = e(list);
        return z10 ? CodedOutputStream.X(i10) + CodedOutputStream.E(iE) : iE + (size * CodedOutputStream.X(i10));
    }

    public static void d0(int i10, List<Long> list, e3 e3Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        e3Var.writeSFixed64List(i10, list, z10);
    }

    static int e(List<Integer> list) {
        int iM;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof k0) {
            k0 k0Var = (k0) list;
            iM = 0;
            while (i10 < size) {
                iM += CodedOutputStream.m(k0Var.getInt(i10));
                i10++;
            }
        } else {
            iM = 0;
            while (i10 < size) {
                iM += CodedOutputStream.m(list.get(i10).intValue());
                i10++;
            }
        }
        return iM;
    }

    public static void e0(int i10, List<Integer> list, e3 e3Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        e3Var.writeSInt32List(i10, list, z10);
    }

    static int f(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? CodedOutputStream.X(i10) + CodedOutputStream.E(size * 4) : size * CodedOutputStream.n(i10, 0);
    }

    public static void f0(int i10, List<Long> list, e3 e3Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        e3Var.writeSInt64List(i10, list, z10);
    }

    static int g(List<?> list) {
        return list.size() * 4;
    }

    public static void g0(int i10, List<String> list, e3 e3Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        e3Var.writeStringList(i10, list);
    }

    static int h(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? CodedOutputStream.X(i10) + CodedOutputStream.E(size * 8) : size * CodedOutputStream.p(i10, 0L);
    }

    public static void h0(int i10, List<Integer> list, e3 e3Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        e3Var.writeUInt32List(i10, list, z10);
    }

    static int i(List<?> list) {
        return list.size() * 8;
    }

    public static void i0(int i10, List<Long> list, e3 e3Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        e3Var.writeUInt64List(i10, list, z10);
    }

    static int j(int i10, List<MessageLite> list, b2 b2Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iU = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iU += CodedOutputStream.u(i10, list.get(i11), b2Var);
        }
        return iU;
    }

    static int k(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = l(list);
        return z10 ? CodedOutputStream.X(i10) + CodedOutputStream.E(iL) : iL + (size * CodedOutputStream.X(i10));
    }

    static int l(List<Integer> list) {
        int iY;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof k0) {
            k0 k0Var = (k0) list;
            iY = 0;
            while (i10 < size) {
                iY += CodedOutputStream.y(k0Var.getInt(i10));
                i10++;
            }
        } else {
            iY = 0;
            while (i10 < size) {
                iY += CodedOutputStream.y(list.get(i10).intValue());
                i10++;
            }
        }
        return iY;
    }

    static int m(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int iN = n(list);
        return z10 ? CodedOutputStream.X(i10) + CodedOutputStream.E(iN) : iN + (list.size() * CodedOutputStream.X(i10));
    }

    static int n(List<Long> list) {
        int iA;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof u0) {
            u0 u0Var = (u0) list;
            iA = 0;
            while (i10 < size) {
                iA += CodedOutputStream.A(u0Var.getLong(i10));
                i10++;
            }
        } else {
            iA = 0;
            while (i10 < size) {
                iA += CodedOutputStream.A(list.get(i10).longValue());
                i10++;
            }
        }
        return iA;
    }

    static int o(int i10, Object obj, b2 b2Var) {
        return obj instanceof p0 ? CodedOutputStream.C(i10, (p0) obj) : CodedOutputStream.H(i10, (MessageLite) obj, b2Var);
    }

    static int p(int i10, List<?> list, b2 b2Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX = CodedOutputStream.X(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            iX += obj instanceof p0 ? CodedOutputStream.D((p0) obj) : CodedOutputStream.J((MessageLite) obj, b2Var);
        }
        return iX;
    }

    static int q(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = r(list);
        return z10 ? CodedOutputStream.X(i10) + CodedOutputStream.E(iR) : iR + (size * CodedOutputStream.X(i10));
    }

    static int r(List<Integer> list) {
        int iS;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof k0) {
            k0 k0Var = (k0) list;
            iS = 0;
            while (i10 < size) {
                iS += CodedOutputStream.S(k0Var.getInt(i10));
                i10++;
            }
        } else {
            iS = 0;
            while (i10 < size) {
                iS += CodedOutputStream.S(list.get(i10).intValue());
                i10++;
            }
        }
        return iS;
    }

    static int s(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = t(list);
        return z10 ? CodedOutputStream.X(i10) + CodedOutputStream.E(iT) : iT + (size * CodedOutputStream.X(i10));
    }

    static int t(List<Long> list) {
        int iU;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof u0) {
            u0 u0Var = (u0) list;
            iU = 0;
            while (i10 < size) {
                iU += CodedOutputStream.U(u0Var.getLong(i10));
                i10++;
            }
        } else {
            iU = 0;
            while (i10 < size) {
                iU += CodedOutputStream.U(list.get(i10).longValue());
                i10++;
            }
        }
        return iU;
    }

    static int u(int i10, List<?> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iX = CodedOutputStream.X(i10) * size;
        if (list instanceof r0) {
            r0 r0Var = (r0) list;
            while (i11 < size) {
                Object raw = r0Var.getRaw(i11);
                iX += raw instanceof ByteString ? CodedOutputStream.i((ByteString) raw) : CodedOutputStream.W((String) raw);
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                iX += obj instanceof ByteString ? CodedOutputStream.i((ByteString) obj) : CodedOutputStream.W((String) obj);
                i11++;
            }
        }
        return iX;
    }

    static int v(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = w(list);
        return z10 ? CodedOutputStream.X(i10) + CodedOutputStream.E(iW) : iW + (size * CodedOutputStream.X(i10));
    }

    static int w(List<Integer> list) {
        int iZ;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof k0) {
            k0 k0Var = (k0) list;
            iZ = 0;
            while (i10 < size) {
                iZ += CodedOutputStream.Z(k0Var.getInt(i10));
                i10++;
            }
        } else {
            iZ = 0;
            while (i10 < size) {
                iZ += CodedOutputStream.Z(list.get(i10).intValue());
                i10++;
            }
        }
        return iZ;
    }

    static int x(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = y(list);
        return z10 ? CodedOutputStream.X(i10) + CodedOutputStream.E(iY) : iY + (size * CodedOutputStream.X(i10));
    }

    static int y(List<Long> list) {
        int iB0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof u0) {
            u0 u0Var = (u0) list;
            iB0 = 0;
            while (i10 < size) {
                iB0 += CodedOutputStream.b0(u0Var.getLong(i10));
                i10++;
            }
        } else {
            iB0 = 0;
            while (i10 < size) {
                iB0 += CodedOutputStream.b0(list.get(i10).longValue());
                i10++;
            }
        }
        return iB0;
    }

    static <UT, UB> UB z(int i10, List<Integer> list, l0.d<?> dVar, UB ub2, t2<UT, UB> t2Var) {
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
                    ub2 = (UB) M(i10, iIntValue, ub2, t2Var);
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
                    ub2 = (UB) M(i10, iIntValue2, ub2, t2Var);
                    it.remove();
                }
            }
        }
        return ub2;
    }
}
