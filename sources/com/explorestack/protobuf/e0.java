package com.explorestack.protobuf;

import com.explorestack.protobuf.e0.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: FieldSet.java */
/* JADX INFO: loaded from: classes.dex */
final class e0<T extends c<T>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final e0 f10367d = new e0(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f2<T, Object> f10368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f10369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f10370c;

    /* JADX INFO: compiled from: FieldSet.java */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f10372b;

        static {
            int[] iArr = new int[c3.b.values().length];
            f10372b = iArr;
            try {
                iArr[c3.b.f10254c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10372b[c3.b.f10255d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10372b[c3.b.f10256e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10372b[c3.b.f10257f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10372b[c3.b.f10258g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10372b[c3.b.f10259h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10372b[c3.b.f10260i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10372b[c3.b.f10261j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10372b[c3.b.f10263l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10372b[c3.b.f10264m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10372b[c3.b.f10262k.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f10372b[c3.b.f10265n.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f10372b[c3.b.f10266o.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f10372b[c3.b.f10268q.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f10372b[c3.b.f10269r.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f10372b[c3.b.f10270s.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f10372b[c3.b.f10271t.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f10372b[c3.b.f10267p.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[c3.c.values().length];
            f10371a = iArr2;
            try {
                iArr2[c3.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f10371a[c3.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f10371a[c3.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f10371a[c3.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f10371a[c3.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f10371a[c3.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f10371a[c3.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f10371a[c3.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f10371a[c3.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: compiled from: FieldSet.java */
    static final class b<T extends c<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private f2<T, Object> f10373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f10374b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f10375c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f10376d;

        /* synthetic */ b(a aVar) {
            this();
        }

        private void d() {
            if (this.f10375c) {
                return;
            }
            this.f10373a = e0.k(this.f10373a, true);
            this.f10375c = true;
        }

        private void n(Map.Entry<T, Object> entry) {
            T key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof o0) {
                value = ((o0) value).g();
            }
            if (key.isRepeated()) {
                Object objF = f(key);
                if (objF == null) {
                    objF = new ArrayList();
                }
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    ((List) objF).add(e0.m(it.next()));
                }
                this.f10373a.put(key, objF);
                return;
            }
            if (key.getLiteJavaType() != c3.c.MESSAGE) {
                this.f10373a.put(key, e0.m(value));
                return;
            }
            Object objF2 = f(key);
            if (objF2 == null) {
                this.f10373a.put(key, e0.m(value));
            } else if (objF2 instanceof MessageLite.Builder) {
                key.internalMergeFrom((MessageLite.Builder) objF2, (MessageLite) value);
            } else {
                this.f10373a.put(key, key.internalMergeFrom(((MessageLite) objF2).toBuilder(), (MessageLite) value).build());
            }
        }

        private static Object o(Object obj) {
            return obj instanceof MessageLite.Builder ? ((MessageLite.Builder) obj).build() : obj;
        }

        private static <T extends c<T>> Object p(T t10, Object obj) {
            if (obj == null || t10.getLiteJavaType() != c3.c.MESSAGE) {
                return obj;
            }
            if (!t10.isRepeated()) {
                return o(obj);
            }
            if (!(obj instanceof List)) {
                throw new IllegalStateException("Repeated field should contains a List but actually contains type: " + obj.getClass());
            }
            List arrayList = (List) obj;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Object obj2 = arrayList.get(i10);
                Object objO = o(obj2);
                if (objO != obj2) {
                    if (arrayList == obj) {
                        arrayList = new ArrayList(arrayList);
                    }
                    arrayList.set(i10, objO);
                }
            }
            return arrayList;
        }

        private static <T extends c<T>> void q(f2<T, Object> f2Var) {
            for (int i10 = 0; i10 < f2Var.l(); i10++) {
                r(f2Var.k(i10));
            }
            Iterator it = f2Var.n().iterator();
            while (it.hasNext()) {
                r((Map.Entry) it.next());
            }
        }

        private static <T extends c<T>> void r(Map.Entry<T, Object> entry) {
            entry.setValue(p(entry.getKey(), entry.getValue()));
        }

        private void u(T t10, Object obj) {
            if (e0.F(t10.getLiteType(), obj)) {
                return;
            }
            if (t10.getLiteType().b() != c3.c.MESSAGE || !(obj instanceof MessageLite.Builder)) {
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t10.getNumber()), t10.getLiteType().b(), obj.getClass().getName()));
            }
        }

        public void a(T t10, Object obj) {
            List arrayList;
            d();
            if (!t10.isRepeated()) {
                throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
            }
            this.f10376d = this.f10376d || (obj instanceof MessageLite.Builder);
            u(t10, obj);
            Object objF = f(t10);
            if (objF == null) {
                arrayList = new ArrayList();
                this.f10373a.put(t10, arrayList);
            } else {
                arrayList = (List) objF;
            }
            arrayList.add(obj);
        }

        public e0<T> b() {
            if (this.f10373a.isEmpty()) {
                return e0.r();
            }
            this.f10375c = false;
            f2<T, Object> f2VarK = this.f10373a;
            if (this.f10376d) {
                f2VarK = e0.k(f2VarK, false);
                q(f2VarK);
            }
            e0<T> e0Var = new e0<>(f2VarK, null);
            ((e0) e0Var).f10370c = this.f10374b;
            return e0Var;
        }

        public void c(T t10) {
            d();
            this.f10373a.remove(t10);
            if (this.f10373a.isEmpty()) {
                this.f10374b = false;
            }
        }

        public Map<T, Object> e() {
            if (!this.f10374b) {
                return this.f10373a.p() ? this.f10373a : Collections.unmodifiableMap(this.f10373a);
            }
            f2 f2VarK = e0.k(this.f10373a, false);
            if (this.f10373a.p()) {
                f2VarK.q();
            } else {
                q(f2VarK);
            }
            return f2VarK;
        }

        public Object f(T t10) {
            return p(t10, g(t10));
        }

        Object g(T t10) {
            Object obj = this.f10373a.get(t10);
            return obj instanceof o0 ? ((o0) obj).g() : obj;
        }

        public Object h(T t10, int i10) {
            if (this.f10376d) {
                d();
            }
            return o(i(t10, i10));
        }

        Object i(T t10, int i10) {
            if (!t10.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object objG = g(t10);
            if (objG != null) {
                return ((List) objG).get(i10);
            }
            throw new IndexOutOfBoundsException();
        }

        public int j(T t10) {
            if (!t10.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object objF = f(t10);
            if (objF == null) {
                return 0;
            }
            return ((List) objF).size();
        }

        public boolean k(T t10) {
            if (t10.isRepeated()) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return this.f10373a.get(t10) != null;
        }

        public boolean l() {
            for (int i10 = 0; i10 < this.f10373a.l(); i10++) {
                if (!e0.E(this.f10373a.k(i10))) {
                    return false;
                }
            }
            Iterator it = this.f10373a.n().iterator();
            while (it.hasNext()) {
                if (!e0.E((Map.Entry) it.next())) {
                    return false;
                }
            }
            return true;
        }

        public void m(e0<T> e0Var) {
            d();
            for (int i10 = 0; i10 < ((e0) e0Var).f10368a.l(); i10++) {
                n(((e0) e0Var).f10368a.k(i10));
            }
            Iterator it = ((e0) e0Var).f10368a.n().iterator();
            while (it.hasNext()) {
                n((Map.Entry) it.next());
            }
        }

        public void s(T t10, Object obj) {
            d();
            if (!t10.isRepeated()) {
                u(t10, obj);
            } else {
                if (!(obj instanceof List)) {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                for (Object obj2 : arrayList) {
                    u(t10, obj2);
                    this.f10376d = this.f10376d || (obj2 instanceof MessageLite.Builder);
                }
                obj = arrayList;
            }
            if (obj instanceof o0) {
                this.f10374b = true;
            }
            this.f10376d = this.f10376d || (obj instanceof MessageLite.Builder);
            this.f10373a.put(t10, obj);
        }

        public void t(T t10, int i10, Object obj) {
            d();
            if (!t10.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            this.f10376d = this.f10376d || (obj instanceof MessageLite.Builder);
            Object objF = f(t10);
            if (objF == null) {
                throw new IndexOutOfBoundsException();
            }
            u(t10, obj);
            ((List) objF).set(i10, obj);
        }

        private b() {
            this(f2.r(16));
        }

        private b(f2<T, Object> f2Var) {
            this.f10373a = f2Var;
            this.f10375c = true;
        }
    }

    /* JADX INFO: compiled from: FieldSet.java */
    public interface c<T extends c<T>> extends Comparable<T> {
        c3.c getLiteJavaType();

        c3.b getLiteType();

        int getNumber();

        MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite);

        boolean isPacked();

        boolean isRepeated();
    }

    /* synthetic */ e0(f2 f2Var, a aVar) {
        this(f2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends c<T>> boolean E(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.getLiteJavaType() == c3.c.MESSAGE) {
            if (key.isRepeated()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((MessageLite) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof MessageLite)) {
                    if (value instanceof o0) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((MessageLite) value).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean F(c3.b bVar, Object obj) {
        l0.a(obj);
        switch (a.f10371a[bVar.b().ordinal()]) {
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
                return (obj instanceof ByteString) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof l0.c);
            case 9:
                return (obj instanceof MessageLite) || (obj instanceof o0);
            default:
                return false;
        }
    }

    private void J(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof o0) {
            value = ((o0) value).g();
        }
        if (key.isRepeated()) {
            Object objT = t(key);
            if (objT == null) {
                objT = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objT).add(m(it.next()));
            }
            this.f10368a.put(key, objT);
            return;
        }
        if (key.getLiteJavaType() != c3.c.MESSAGE) {
            this.f10368a.put(key, m(value));
            return;
        }
        Object objT2 = t(key);
        if (objT2 == null) {
            this.f10368a.put(key, m(value));
        } else {
            this.f10368a.put(key, key.internalMergeFrom(((MessageLite) objT2).toBuilder(), (MessageLite) value).build());
        }
    }

    public static <T extends c<T>> b<T> K() {
        return new b<>((a) null);
    }

    public static <T extends c<T>> e0<T> L() {
        return new e0<>();
    }

    public static Object M(n nVar, c3.b bVar, boolean z10) throws IOException {
        return z10 ? c3.d(nVar, bVar, c3.d.f10287b) : c3.d(nVar, bVar, c3.d.f10286a);
    }

    private void P(T t10, Object obj) {
        if (!F(t10.getLiteType(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t10.getNumber()), t10.getLiteType().b(), obj.getClass().getName()));
        }
    }

    static void Q(CodedOutputStream codedOutputStream, c3.b bVar, int i10, Object obj) throws IOException {
        if (bVar == c3.b.f10263l) {
            codedOutputStream.D0(i10, (MessageLite) obj);
        } else {
            codedOutputStream.b1(i10, z(bVar, false));
            R(codedOutputStream, bVar, obj);
        }
    }

    static void R(CodedOutputStream codedOutputStream, c3.b bVar, Object obj) throws IOException {
        switch (a.f10372b[bVar.ordinal()]) {
            case 1:
                codedOutputStream.u0(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.C0(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.K0(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.f1(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.I0(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.A0(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.y0(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.o0(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.F0((MessageLite) obj);
                break;
            case 10:
                codedOutputStream.N0((MessageLite) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.a1((String) obj);
                } else {
                    codedOutputStream.s0((ByteString) obj);
                }
                break;
            case 12:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.p0((byte[]) obj);
                } else {
                    codedOutputStream.s0((ByteString) obj);
                }
                break;
            case 13:
                codedOutputStream.d1(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.S0(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.U0(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.W0(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.Y0(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof l0.c)) {
                    codedOutputStream.w0(((Integer) obj).intValue());
                } else {
                    codedOutputStream.w0(((l0.c) obj).getNumber());
                }
                break;
        }
    }

    public static void S(c<?> cVar, Object obj, CodedOutputStream codedOutputStream) throws IOException {
        c3.b liteType = cVar.getLiteType();
        int number = cVar.getNumber();
        if (!cVar.isRepeated()) {
            if (obj instanceof o0) {
                Q(codedOutputStream, liteType, number, ((o0) obj).g());
                return;
            } else {
                Q(codedOutputStream, liteType, number, obj);
                return;
            }
        }
        List list = (List) obj;
        if (!cVar.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Q(codedOutputStream, liteType, number, it.next());
            }
            return;
        }
        codedOutputStream.b1(number, 2);
        Iterator it2 = list.iterator();
        int iO = 0;
        while (it2.hasNext()) {
            iO += o(liteType, it2.next());
        }
        codedOutputStream.Q0(iO);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            R(codedOutputStream, liteType, it3.next());
        }
    }

    private void U(Map.Entry<T, Object> entry, CodedOutputStream codedOutputStream) throws IOException {
        T key = entry.getKey();
        if (key.getLiteJavaType() != c3.c.MESSAGE || key.isRepeated() || key.isPacked()) {
            S(key, entry.getValue(), codedOutputStream);
            return;
        }
        Object value = entry.getValue();
        if (value instanceof o0) {
            value = ((o0) value).g();
        }
        codedOutputStream.O0(entry.getKey().getNumber(), (MessageLite) value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends c<T>> f2<T, Object> k(f2<T, Object> f2Var, boolean z10) {
        f2<T, Object> f2VarR = f2.r(16);
        for (int i10 = 0; i10 < f2Var.l(); i10++) {
            l(f2VarR, f2Var.k(i10), z10);
        }
        Iterator it = f2Var.n().iterator();
        while (it.hasNext()) {
            l(f2VarR, (Map.Entry) it.next(), z10);
        }
        return f2VarR;
    }

    private static <T extends c<T>> void l(Map<T, Object> map, Map.Entry<T, Object> entry, boolean z10) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof o0) {
            map.put(key, ((o0) value).g());
        } else if (z10 && (value instanceof List)) {
            map.put(key, new ArrayList((List) value));
        } else {
            map.put(key, value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object m(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static int n(c3.b bVar, int i10, Object obj) {
        int iX = CodedOutputStream.X(i10);
        if (bVar == c3.b.f10263l) {
            iX *= 2;
        }
        return iX + o(bVar, obj);
    }

    static int o(c3.b bVar, Object obj) {
        switch (a.f10372b[bVar.ordinal()]) {
            case 1:
                return CodedOutputStream.k(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.s(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.A(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.b0(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.y(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.q(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.o(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.f(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.v((MessageLite) obj);
            case 10:
                return obj instanceof o0 ? CodedOutputStream.D((o0) obj) : CodedOutputStream.I((MessageLite) obj);
            case 11:
                return obj instanceof ByteString ? CodedOutputStream.i((ByteString) obj) : CodedOutputStream.W((String) obj);
            case 12:
                return obj instanceof ByteString ? CodedOutputStream.i((ByteString) obj) : CodedOutputStream.g((byte[]) obj);
            case 13:
                return CodedOutputStream.Z(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.O(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.Q(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.S(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.U(((Long) obj).longValue());
            case 18:
                return obj instanceof l0.c ? CodedOutputStream.m(((l0.c) obj).getNumber()) : CodedOutputStream.m(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int p(c<?> cVar, Object obj) {
        c3.b liteType = cVar.getLiteType();
        int number = cVar.getNumber();
        if (!cVar.isRepeated()) {
            return n(liteType, number, obj);
        }
        int iN = 0;
        if (cVar.isPacked()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iN += o(liteType, it.next());
            }
            return CodedOutputStream.X(number) + iN + CodedOutputStream.M(iN);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iN += n(liteType, number, it2.next());
        }
        return iN;
    }

    public static <T extends c<T>> e0<T> r() {
        return f10367d;
    }

    private int v(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.getLiteJavaType() != c3.c.MESSAGE || key.isRepeated() || key.isPacked()) {
            return p(key, value);
        }
        return value instanceof o0 ? CodedOutputStream.B(entry.getKey().getNumber(), (o0) value) : CodedOutputStream.F(entry.getKey().getNumber(), (MessageLite) value);
    }

    static int z(c3.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.c();
    }

    public boolean A(T t10) {
        if (t10.isRepeated()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f10368a.get(t10) != null;
    }

    boolean B() {
        return this.f10368a.isEmpty();
    }

    public boolean C() {
        return this.f10369b;
    }

    public boolean D() {
        for (int i10 = 0; i10 < this.f10368a.l(); i10++) {
            if (!E(this.f10368a.k(i10))) {
                return false;
            }
        }
        Iterator it = this.f10368a.n().iterator();
        while (it.hasNext()) {
            if (!E((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> G() {
        return this.f10370c ? new o0.c(this.f10368a.entrySet().iterator()) : this.f10368a.entrySet().iterator();
    }

    public void H() {
        if (this.f10369b) {
            return;
        }
        this.f10368a.q();
        this.f10369b = true;
    }

    public void I(e0<T> e0Var) {
        for (int i10 = 0; i10 < e0Var.f10368a.l(); i10++) {
            J(e0Var.f10368a.k(i10));
        }
        Iterator it = e0Var.f10368a.n().iterator();
        while (it.hasNext()) {
            J((Map.Entry) it.next());
        }
    }

    public void N(T t10, Object obj) {
        if (!t10.isRepeated()) {
            P(t10, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                P(t10, it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof o0) {
            this.f10370c = true;
        }
        this.f10368a.put(t10, obj);
    }

    public void O(T t10, int i10, Object obj) {
        if (!t10.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objT = t(t10);
        if (objT == null) {
            throw new IndexOutOfBoundsException();
        }
        P(t10, obj);
        ((List) objT).set(i10, obj);
    }

    public void T(CodedOutputStream codedOutputStream) throws IOException {
        for (int i10 = 0; i10 < this.f10368a.l(); i10++) {
            U(this.f10368a.k(i10), codedOutputStream);
        }
        Iterator it = this.f10368a.n().iterator();
        while (it.hasNext()) {
            U((Map.Entry) it.next(), codedOutputStream);
        }
    }

    public void V(CodedOutputStream codedOutputStream) throws IOException {
        for (int i10 = 0; i10 < this.f10368a.l(); i10++) {
            Map.Entry<K, Object> entryK = this.f10368a.k(i10);
            S((c) entryK.getKey(), entryK.getValue(), codedOutputStream);
        }
        Iterator it = this.f10368a.n().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            S((c) entry.getKey(), entry.getValue(), codedOutputStream);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e0) {
            return this.f10368a.equals(((e0) obj).f10368a);
        }
        return false;
    }

    public void g(T t10, Object obj) {
        List arrayList;
        if (!t10.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        P(t10, obj);
        Object objT = t(t10);
        if (objT == null) {
            arrayList = new ArrayList();
            this.f10368a.put(t10, arrayList);
        } else {
            arrayList = (List) objT;
        }
        arrayList.add(obj);
    }

    public void h() {
        this.f10368a.clear();
        this.f10370c = false;
    }

    public int hashCode() {
        return this.f10368a.hashCode();
    }

    public void i(T t10) {
        this.f10368a.remove(t10);
        if (this.f10368a.isEmpty()) {
            this.f10370c = false;
        }
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public e0<T> clone() {
        e0<T> e0VarL = L();
        for (int i10 = 0; i10 < this.f10368a.l(); i10++) {
            Map.Entry<K, Object> entryK = this.f10368a.k(i10);
            e0VarL.N((c) entryK.getKey(), entryK.getValue());
        }
        Iterator it = this.f10368a.n().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            e0VarL.N((c) entry.getKey(), entry.getValue());
        }
        e0VarL.f10370c = this.f10370c;
        return e0VarL;
    }

    Iterator<Map.Entry<T, Object>> q() {
        return this.f10370c ? new o0.c(this.f10368a.i().iterator()) : this.f10368a.i().iterator();
    }

    public Map<T, Object> s() {
        if (!this.f10370c) {
            return this.f10368a.p() ? this.f10368a : Collections.unmodifiableMap(this.f10368a);
        }
        f2 f2VarK = k(this.f10368a, false);
        if (this.f10368a.p()) {
            f2VarK.q();
        }
        return f2VarK;
    }

    public Object t(T t10) {
        Object obj = this.f10368a.get(t10);
        return obj instanceof o0 ? ((o0) obj).g() : obj;
    }

    public int u() {
        int iV = 0;
        for (int i10 = 0; i10 < this.f10368a.l(); i10++) {
            iV += v(this.f10368a.k(i10));
        }
        Iterator it = this.f10368a.n().iterator();
        while (it.hasNext()) {
            iV += v((Map.Entry) it.next());
        }
        return iV;
    }

    public Object w(T t10, int i10) {
        if (!t10.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objT = t(t10);
        if (objT != null) {
            return ((List) objT).get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int x(T t10) {
        if (!t10.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objT = t(t10);
        if (objT == null) {
            return 0;
        }
        return ((List) objT).size();
    }

    public int y() {
        int iP = 0;
        for (int i10 = 0; i10 < this.f10368a.l(); i10++) {
            Map.Entry<K, Object> entryK = this.f10368a.k(i10);
            iP += p((c) entryK.getKey(), entryK.getValue());
        }
        Iterator it = this.f10368a.n().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iP += p((c) entry.getKey(), entry.getValue());
        }
        return iP;
    }

    private e0() {
        this.f10368a = f2.r(16);
    }

    private e0(boolean z10) {
        this(f2.r(0));
        H();
    }

    private e0(f2<T, Object> f2Var) {
        this.f10368a = f2Var;
        H();
    }
}
