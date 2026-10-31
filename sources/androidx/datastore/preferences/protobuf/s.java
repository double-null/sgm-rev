package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.s.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: FieldSet.java */
/* JADX INFO: loaded from: classes.dex */
final class s<T extends b<T>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final s<?> f2297d = new s<>(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h1<T, Object> f2298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f2299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f2300c;

    /* JADX INFO: compiled from: FieldSet.java */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f2302b;

        static {
            int[] iArr = new int[p1.b.values().length];
            f2302b = iArr;
            try {
                iArr[p1.b.f2259c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2302b[p1.b.f2260d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2302b[p1.b.f2261e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2302b[p1.b.f2262f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2302b[p1.b.f2263g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2302b[p1.b.f2264h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2302b[p1.b.f2265i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2302b[p1.b.f2266j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2302b[p1.b.f2268l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2302b[p1.b.f2269m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2302b[p1.b.f2267k.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2302b[p1.b.f2270n.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2302b[p1.b.f2271o.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f2302b[p1.b.f2273q.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f2302b[p1.b.f2274r.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f2302b[p1.b.f2275s.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f2302b[p1.b.f2276t.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f2302b[p1.b.f2272p.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[p1.c.values().length];
            f2301a = iArr2;
            try {
                iArr2[p1.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f2301a[p1.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f2301a[p1.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f2301a[p1.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f2301a[p1.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f2301a[p1.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f2301a[p1.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f2301a[p1.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f2301a[p1.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: compiled from: FieldSet.java */
    public interface b<T extends b<T>> extends Comparable<T> {
        p0.a f(p0.a aVar, p0 p0Var);

        p1.c getLiteJavaType();

        p1.b getLiteType();

        int getNumber();

        boolean isPacked();

        boolean isRepeated();
    }

    private s() {
        this.f2298a = h1.r();
    }

    static void A(CodedOutputStream codedOutputStream, p1.b bVar, int i10, Object obj) throws IOException {
        if (bVar == p1.b.f2268l) {
            codedOutputStream.z0(i10, (p0) obj);
        } else {
            codedOutputStream.V0(i10, m(bVar, false));
            B(codedOutputStream, bVar, obj);
        }
    }

    static void B(CodedOutputStream codedOutputStream, p1.b bVar, Object obj) throws IOException {
        switch (a.f2302b[bVar.ordinal()]) {
            case 1:
                codedOutputStream.q0(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.y0(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.G0(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.Z0(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.E0(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.w0(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.u0(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.k0(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.B0((p0) obj);
                break;
            case 10:
                codedOutputStream.I0((p0) obj);
                break;
            case 11:
                if (!(obj instanceof g)) {
                    codedOutputStream.U0((String) obj);
                } else {
                    codedOutputStream.o0((g) obj);
                }
                break;
            case 12:
                if (!(obj instanceof g)) {
                    codedOutputStream.l0((byte[]) obj);
                } else {
                    codedOutputStream.o0((g) obj);
                }
                break;
            case 13:
                codedOutputStream.X0(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.M0(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.O0(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.Q0(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.S0(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof y.c)) {
                    codedOutputStream.s0(((Integer) obj).intValue());
                } else {
                    codedOutputStream.s0(((y.c) obj).getNumber());
                }
                break;
        }
    }

    private static Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static int d(p1.b bVar, int i10, Object obj) {
        int iU = CodedOutputStream.U(i10);
        if (bVar == p1.b.f2268l) {
            iU *= 2;
        }
        return iU + e(bVar, obj);
    }

    static int e(p1.b bVar, Object obj) {
        switch (a.f2302b[bVar.ordinal()]) {
            case 1:
                return CodedOutputStream.j(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.r(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.y(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.Y(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.w(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.p(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.n(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.e(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.t((p0) obj);
            case 10:
                return obj instanceof a0 ? CodedOutputStream.B((a0) obj) : CodedOutputStream.G((p0) obj);
            case 11:
                return obj instanceof g ? CodedOutputStream.h((g) obj) : CodedOutputStream.T((String) obj);
            case 12:
                return obj instanceof g ? CodedOutputStream.h((g) obj) : CodedOutputStream.f((byte[]) obj);
            case 13:
                return CodedOutputStream.W(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.L(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.N(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.P(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.R(((Long) obj).longValue());
            case 18:
                return obj instanceof y.c ? CodedOutputStream.l(((y.c) obj).getNumber()) : CodedOutputStream.l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b<?> bVar, Object obj) {
        p1.b liteType = bVar.getLiteType();
        int number = bVar.getNumber();
        if (!bVar.isRepeated()) {
            return d(liteType, number, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i10 = 0;
        if (!bVar.isPacked()) {
            int iD = 0;
            while (i10 < size) {
                iD += d(liteType, number, list.get(i10));
                i10++;
            }
            return iD;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iE = 0;
        while (i10 < size) {
            iE += e(liteType, list.get(i10));
            i10++;
        }
        return CodedOutputStream.U(number) + iE + CodedOutputStream.W(iE);
    }

    public static <T extends b<T>> s<T> h() {
        return (s<T>) f2297d;
    }

    private int k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.getLiteJavaType() != p1.c.MESSAGE || key.isRepeated() || key.isPacked()) {
            return f(key, value);
        }
        return value instanceof a0 ? CodedOutputStream.z(entry.getKey().getNumber(), (a0) value) : CodedOutputStream.D(entry.getKey().getNumber(), (p0) value);
    }

    static int m(p1.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.c();
    }

    private static <T extends b<T>> boolean q(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.getLiteJavaType() != p1.c.MESSAGE) {
            return true;
        }
        if (!key.isRepeated()) {
            return r(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!r(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private static boolean r(Object obj) {
        if (obj instanceof q0) {
            return ((q0) obj).isInitialized();
        }
        if (obj instanceof a0) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static boolean s(p1.b bVar, Object obj) {
        y.a(obj);
        switch (a.f2301a[bVar.b().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof g) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof y.c);
            case 9:
                return (obj instanceof p0) || (obj instanceof a0);
            default:
                return false;
        }
    }

    private void w(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z10 = value instanceof a0;
        if (key.isRepeated()) {
            if (z10) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object objI = i(key);
            if (objI == null) {
                objI = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objI).add(c(it.next()));
            }
            this.f2298a.put(key, objI);
            return;
        }
        if (key.getLiteJavaType() != p1.c.MESSAGE) {
            if (z10) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.f2298a.put(key, c(value));
            return;
        }
        Object objI2 = i(key);
        if (objI2 == null) {
            this.f2298a.put(key, c(value));
            if (z10) {
                this.f2300c = true;
                return;
            }
            return;
        }
        if (z10) {
            value = ((a0) value).f();
        }
        this.f2298a.put(key, key.f(((p0) objI2).toBuilder(), (p0) value).build());
    }

    public static <T extends b<T>> s<T> x() {
        return new s<>();
    }

    private void z(T t10, Object obj) {
        if (!s(t10.getLiteType(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t10.getNumber()), t10.getLiteType().b(), obj.getClass().getName()));
        }
    }

    public void a(T t10, Object obj) {
        List arrayList;
        if (!t10.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        z(t10, obj);
        Object objI = i(t10);
        if (objI == null) {
            arrayList = new ArrayList();
            this.f2298a.put(t10, arrayList);
        } else {
            arrayList = (List) objI;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public s<T> clone() {
        s<T> sVarX = x();
        int iL = this.f2298a.l();
        for (int i10 = 0; i10 < iL; i10++) {
            Map.Entry<K, Object> entryK = this.f2298a.k(i10);
            sVarX.y((b) entryK.getKey(), entryK.getValue());
        }
        Iterator it = this.f2298a.n().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sVarX.y((b) entry.getKey(), entry.getValue());
        }
        sVarX.f2300c = this.f2300c;
        return sVarX;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            return this.f2298a.equals(((s) obj).f2298a);
        }
        return false;
    }

    Iterator<Map.Entry<T, Object>> g() {
        if (n()) {
            return Collections.emptyIterator();
        }
        return this.f2300c ? new a0.c(this.f2298a.i().iterator()) : this.f2298a.i().iterator();
    }

    public int hashCode() {
        return this.f2298a.hashCode();
    }

    public Object i(T t10) {
        Object obj = this.f2298a.get(t10);
        return obj instanceof a0 ? ((a0) obj).f() : obj;
    }

    public int j() {
        int iL = this.f2298a.l();
        int iK = 0;
        for (int i10 = 0; i10 < iL; i10++) {
            iK += k(this.f2298a.k(i10));
        }
        Iterator it = this.f2298a.n().iterator();
        while (it.hasNext()) {
            iK += k((Map.Entry) it.next());
        }
        return iK;
    }

    public int l() {
        int iL = this.f2298a.l();
        int iF = 0;
        for (int i10 = 0; i10 < iL; i10++) {
            Map.Entry<K, Object> entryK = this.f2298a.k(i10);
            iF += f((b) entryK.getKey(), entryK.getValue());
        }
        Iterator it = this.f2298a.n().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iF += f((b) entry.getKey(), entry.getValue());
        }
        return iF;
    }

    boolean n() {
        return this.f2298a.isEmpty();
    }

    public boolean o() {
        return this.f2299b;
    }

    public boolean p() {
        int iL = this.f2298a.l();
        for (int i10 = 0; i10 < iL; i10++) {
            if (!q(this.f2298a.k(i10))) {
                return false;
            }
        }
        Iterator it = this.f2298a.n().iterator();
        while (it.hasNext()) {
            if (!q((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> t() {
        if (n()) {
            return Collections.emptyIterator();
        }
        return this.f2300c ? new a0.c(this.f2298a.entrySet().iterator()) : this.f2298a.entrySet().iterator();
    }

    public void u() {
        if (this.f2299b) {
            return;
        }
        int iL = this.f2298a.l();
        for (int i10 = 0; i10 < iL; i10++) {
            Map.Entry<K, Object> entryK = this.f2298a.k(i10);
            if (entryK.getValue() instanceof w) {
                ((w) entryK.getValue()).C();
            }
        }
        this.f2298a.q();
        this.f2299b = true;
    }

    public void v(s<T> sVar) {
        int iL = sVar.f2298a.l();
        for (int i10 = 0; i10 < iL; i10++) {
            w(sVar.f2298a.k(i10));
        }
        Iterator it = sVar.f2298a.n().iterator();
        while (it.hasNext()) {
            w((Map.Entry) it.next());
        }
    }

    public void y(T t10, Object obj) {
        if (!t10.isRepeated()) {
            z(t10, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                z(t10, it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof a0) {
            this.f2300c = true;
        }
        this.f2298a.put(t10, obj);
    }

    private s(boolean z10) {
        this(h1.r());
        u();
    }

    private s(h1<T, Object> h1Var) {
        this.f2298a = h1Var;
        u();
    }
}
