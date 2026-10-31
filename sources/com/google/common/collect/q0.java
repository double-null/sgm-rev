package com.google.common.collect;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: RegularImmutableMap.java */
/* JADX INFO: loaded from: classes4.dex */
final class q0<K, V> extends v<K, V> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final v<Object, Object> f11668h = new q0(null, new Object[0], 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient Object f11669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final transient Object[] f11670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient int f11671g;

    /* JADX INFO: compiled from: RegularImmutableMap.java */
    static class a<K, V> extends w<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final transient v<K, V> f11672c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final transient Object[] f11673d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final transient int f11674e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final transient int f11675f;

        /* JADX INFO: renamed from: com.google.common.collect.q0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RegularImmutableMap.java */
        class C0144a extends u<Map.Entry<K, V>> {
            C0144a() {
            }

            @Override // java.util.List
            /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> get(int i10) {
                com.google.common.base.p.j(i10, a.this.f11675f);
                int i11 = i10 * 2;
                Object obj = a.this.f11673d[a.this.f11674e + i11];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f11673d[i11 + (a.this.f11674e ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // com.google.common.collect.s
            public boolean o() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f11675f;
            }

            @Override // com.google.common.collect.u, com.google.common.collect.s
            Object writeReplace() {
                return super.writeReplace();
            }
        }

        a(v<K, V> vVar, Object[] objArr, int i10, int i11) {
            this.f11672c = vVar;
            this.f11673d = objArr;
            this.f11674e = i10;
            this.f11675f = i11;
        }

        @Override // com.google.common.collect.w
        u<Map.Entry<K, V>> B() {
            return new C0144a();
        }

        @Override // com.google.common.collect.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f11672c.get(key));
        }

        @Override // com.google.common.collect.s
        int e(Object[] objArr, int i10) {
            return c().e(objArr, i10);
        }

        @Override // com.google.common.collect.s
        boolean o() {
            return true;
        }

        @Override // com.google.common.collect.w, com.google.common.collect.s, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: p */
        public c1<Map.Entry<K, V>> iterator() {
            return c().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f11675f;
        }

        @Override // com.google.common.collect.w, com.google.common.collect.s
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* JADX INFO: compiled from: RegularImmutableMap.java */
    static final class b<K> extends w<K> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final transient v<K, ?> f11677c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final transient u<K> f11678d;

        b(v<K, ?> vVar, u<K> uVar) {
            this.f11677c = vVar;
            this.f11678d = uVar;
        }

        @Override // com.google.common.collect.w, com.google.common.collect.s
        public u<K> c() {
            return this.f11678d;
        }

        @Override // com.google.common.collect.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f11677c.get(obj) != null;
        }

        @Override // com.google.common.collect.s
        int e(Object[] objArr, int i10) {
            return c().e(objArr, i10);
        }

        @Override // com.google.common.collect.s
        boolean o() {
            return true;
        }

        @Override // com.google.common.collect.w, com.google.common.collect.s, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: p */
        public c1<K> iterator() {
            return c().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f11677c.size();
        }

        @Override // com.google.common.collect.w, com.google.common.collect.s
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* JADX INFO: compiled from: RegularImmutableMap.java */
    static final class c extends u<Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final transient Object[] f11679c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final transient int f11680d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final transient int f11681e;

        c(Object[] objArr, int i10, int i11) {
            this.f11679c = objArr;
            this.f11680d = i10;
            this.f11681e = i11;
        }

        @Override // java.util.List
        public Object get(int i10) {
            com.google.common.base.p.j(i10, this.f11681e);
            Object obj = this.f11679c[(i10 * 2) + this.f11680d];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // com.google.common.collect.s
        boolean o() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f11681e;
        }

        @Override // com.google.common.collect.u, com.google.common.collect.s
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    private q0(Object obj, Object[] objArr, int i10) {
        this.f11669e = obj;
        this.f11670f = objArr;
        this.f11671g = i10;
    }

    static <K, V> q0<K, V> B(int i10, Object[] objArr) {
        return C(i10, objArr, null);
    }

    static <K, V> q0<K, V> C(int i10, Object[] objArr, v.a<K, V> aVar) {
        if (i10 == 0) {
            return (q0) f11668h;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            h.a(obj, obj2);
            return new q0<>(null, objArr, 1);
        }
        com.google.common.base.p.o(i10, objArr.length >> 1);
        Object objD = D(objArr, i10, w.v(i10), 0);
        if (objD instanceof Object[]) {
            Object[] objArr2 = (Object[]) objD;
            v.a.C0145a c0145a = (v.a.C0145a) objArr2[2];
            if (aVar == null) {
                throw c0145a.a();
            }
            aVar.f11714e = c0145a;
            Object obj3 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objD = obj3;
            i10 = iIntValue;
        }
        return new q0<>(objD, objArr, i10);
    }

    private static Object D(Object[] objArr, int i10, int i11, int i12) {
        v.a.C0145a c0145a = null;
        if (i10 == 1) {
            Object obj = objArr[i12];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i12 ^ 1];
            Objects.requireNonNull(obj2);
            h.a(obj, obj2);
            return null;
        }
        int i13 = i11 - 1;
        int i14 = -1;
        if (i11 <= 128) {
            byte[] bArr = new byte[i11];
            Arrays.fill(bArr, (byte) -1);
            int i15 = 0;
            for (int i16 = 0; i16 < i10; i16++) {
                int i17 = (i16 * 2) + i12;
                int i18 = (i15 * 2) + i12;
                Object obj3 = objArr[i17];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i17 ^ 1];
                Objects.requireNonNull(obj4);
                h.a(obj3, obj4);
                int iB = r.b(obj3.hashCode());
                while (true) {
                    int i19 = iB & i13;
                    int i20 = bArr[i19] & 255;
                    if (i20 == 255) {
                        bArr[i19] = (byte) i18;
                        if (i15 < i16) {
                            objArr[i18] = obj3;
                            objArr[i18 ^ 1] = obj4;
                        }
                        i15++;
                        break;
                    }
                    if (obj3.equals(objArr[i20])) {
                        int i21 = i20 ^ 1;
                        Object obj5 = objArr[i21];
                        Objects.requireNonNull(obj5);
                        c0145a = new v.a.C0145a(obj3, obj4, obj5);
                        objArr[i21] = obj4;
                        break;
                    }
                    iB = i19 + 1;
                }
            }
            return i15 == i10 ? bArr : new Object[]{bArr, Integer.valueOf(i15), c0145a};
        }
        if (i11 <= 32768) {
            short[] sArr = new short[i11];
            Arrays.fill(sArr, (short) -1);
            int i22 = 0;
            for (int i23 = 0; i23 < i10; i23++) {
                int i24 = (i23 * 2) + i12;
                int i25 = (i22 * 2) + i12;
                Object obj6 = objArr[i24];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i24 ^ 1];
                Objects.requireNonNull(obj7);
                h.a(obj6, obj7);
                int iB2 = r.b(obj6.hashCode());
                while (true) {
                    int i26 = iB2 & i13;
                    int i27 = sArr[i26] & 65535;
                    if (i27 == 65535) {
                        sArr[i26] = (short) i25;
                        if (i22 < i23) {
                            objArr[i25] = obj6;
                            objArr[i25 ^ 1] = obj7;
                        }
                        i22++;
                        break;
                    }
                    if (obj6.equals(objArr[i27])) {
                        int i28 = i27 ^ 1;
                        Object obj8 = objArr[i28];
                        Objects.requireNonNull(obj8);
                        c0145a = new v.a.C0145a(obj6, obj7, obj8);
                        objArr[i28] = obj7;
                        break;
                    }
                    iB2 = i26 + 1;
                }
            }
            return i22 == i10 ? sArr : new Object[]{sArr, Integer.valueOf(i22), c0145a};
        }
        int[] iArr = new int[i11];
        Arrays.fill(iArr, -1);
        int i29 = 0;
        int i30 = 0;
        while (i29 < i10) {
            int i31 = (i29 * 2) + i12;
            int i32 = (i30 * 2) + i12;
            Object obj9 = objArr[i31];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i31 ^ 1];
            Objects.requireNonNull(obj10);
            h.a(obj9, obj10);
            int iB3 = r.b(obj9.hashCode());
            while (true) {
                int i33 = iB3 & i13;
                int i34 = iArr[i33];
                if (i34 == i14) {
                    iArr[i33] = i32;
                    if (i30 < i29) {
                        objArr[i32] = obj9;
                        objArr[i32 ^ 1] = obj10;
                    }
                    i30++;
                    break;
                }
                if (obj9.equals(objArr[i34])) {
                    int i35 = i34 ^ 1;
                    Object obj11 = objArr[i35];
                    Objects.requireNonNull(obj11);
                    c0145a = new v.a.C0145a(obj9, obj10, obj11);
                    objArr[i35] = obj10;
                    break;
                }
                iB3 = i33 + 1;
                i14 = -1;
            }
            i29++;
            i14 = -1;
        }
        return i30 == i10 ? iArr : new Object[]{iArr, Integer.valueOf(i30), c0145a};
    }

    static Object F(Object obj, Object[] objArr, int i10, int i11, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i10 == 1) {
            Object obj3 = objArr[i11];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i11 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iB = r.b(obj2.hashCode());
            while (true) {
                int i12 = iB & length;
                int i13 = bArr[i12] & 255;
                if (i13 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i13])) {
                    return objArr[i13 ^ 1];
                }
                iB = i12 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iB2 = r.b(obj2.hashCode());
            while (true) {
                int i14 = iB2 & length2;
                int i15 = sArr[i14] & 65535;
                if (i15 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i15])) {
                    return objArr[i15 ^ 1];
                }
                iB2 = i14 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iB3 = r.b(obj2.hashCode());
            while (true) {
                int i16 = iB3 & length3;
                int i17 = iArr[i16];
                if (i17 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i17])) {
                    return objArr[i17 ^ 1];
                }
                iB3 = i16 + 1;
            }
        }
    }

    @Override // com.google.common.collect.v
    w<Map.Entry<K, V>> g() {
        return new a(this, this.f11670f, 0, this.f11671g);
    }

    @Override // com.google.common.collect.v, java.util.Map
    public V get(Object obj) {
        V v10 = (V) F(this.f11669e, this.f11670f, this.f11671g, 0, obj);
        if (v10 == null) {
            return null;
        }
        return v10;
    }

    @Override // com.google.common.collect.v
    w<K> k() {
        return new b(this, new c(this.f11670f, 0, this.f11671g));
    }

    @Override // com.google.common.collect.v
    s<V> n() {
        return new c(this.f11670f, 1, this.f11671g);
    }

    @Override // com.google.common.collect.v
    boolean p() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f11671g;
    }

    @Override // com.google.common.collect.v
    Object writeReplace() {
        return super.writeReplace();
    }
}
