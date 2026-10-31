package xc;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d<K, V> implements Map<K, V>, Serializable, jd.d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f28442n = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final d f28443o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private K[] f28444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private V[] f28445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f28446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int[] f28447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f28448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f28449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f28450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f28451h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f28452i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private xc.f<K> f28453j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private g<V> f28454k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private xc.e<K, V> f28455l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f28456m;

    /* JADX INFO: compiled from: MapBuilder.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int c(int i10) {
            return Integer.highestOneBit(od.k.d(i10, 1) * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int d(int i10) {
            return Integer.numberOfLeadingZeros(i10) + 1;
        }

        public final d e() {
            return d.f28443o;
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    public static final class b<K, V> extends C0478d<K, V> implements Iterator<Map.Entry<K, V>>, jd.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d<K, V> map) {
            super(map);
            t.f(map, "map");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public c<K, V> next() {
            a();
            if (b() >= ((d) d()).f28449f) {
                throw new NoSuchElementException();
            }
            int iB = b();
            f(iB + 1);
            g(iB);
            c<K, V> cVar = new c<>(d(), c());
            e();
            return cVar;
        }

        public final void j(StringBuilder sb2) {
            t.f(sb2, "sb");
            if (b() >= ((d) d()).f28449f) {
                throw new NoSuchElementException();
            }
            int iB = b();
            f(iB + 1);
            g(iB);
            Object obj = ((d) d()).f28444a[c()];
            if (obj == d()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append('=');
            Object[] objArr = ((d) d()).f28445b;
            t.c(objArr);
            Object obj2 = objArr[c()];
            if (obj2 == d()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            e();
        }

        public final int k() {
            if (b() >= ((d) d()).f28449f) {
                throw new NoSuchElementException();
            }
            int iB = b();
            f(iB + 1);
            g(iB);
            Object obj = ((d) d()).f28444a[c()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = ((d) d()).f28445b;
            t.c(objArr);
            Object obj2 = objArr[c()];
            int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            e();
            return iHashCode2;
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    public static final class c<K, V> implements Map.Entry<K, V>, jd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d<K, V> f28457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f28458b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f28459c;

        public c(d<K, V> map, int i10) {
            t.f(map, "map");
            this.f28457a = map;
            this.f28458b = i10;
            this.f28459c = ((d) map).f28451h;
        }

        private final void a() {
            if (((d) this.f28457a).f28451h != this.f28459c) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (t.a(entry.getKey(), getKey()) && t.a(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            a();
            return (K) ((d) this.f28457a).f28444a[this.f28458b];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            a();
            Object[] objArr = ((d) this.f28457a).f28445b;
            t.c(objArr);
            return (V) objArr[this.f28458b];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            a();
            this.f28457a.v();
            Object[] objArrS = this.f28457a.s();
            int i10 = this.f28458b;
            V v11 = (V) objArrS[i10];
            objArrS[i10] = v10;
            return v11;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: xc.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MapBuilder.kt */
    public static class C0478d<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d<K, V> f28460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f28461b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f28462c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f28463d;

        public C0478d(d<K, V> map) {
            t.f(map, "map");
            this.f28460a = map;
            this.f28462c = -1;
            this.f28463d = ((d) map).f28451h;
            e();
        }

        public final void a() {
            if (((d) this.f28460a).f28451h != this.f28463d) {
                throw new ConcurrentModificationException();
            }
        }

        public final int b() {
            return this.f28461b;
        }

        public final int c() {
            return this.f28462c;
        }

        public final d<K, V> d() {
            return this.f28460a;
        }

        public final void e() {
            while (this.f28461b < ((d) this.f28460a).f28449f) {
                int[] iArr = ((d) this.f28460a).f28446c;
                int i10 = this.f28461b;
                if (iArr[i10] >= 0) {
                    return;
                } else {
                    this.f28461b = i10 + 1;
                }
            }
        }

        public final void f(int i10) {
            this.f28461b = i10;
        }

        public final void g(int i10) {
            this.f28462c = i10;
        }

        public final boolean hasNext() {
            return this.f28461b < ((d) this.f28460a).f28449f;
        }

        public final void remove() {
            a();
            if (!(this.f28462c != -1)) {
                throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
            }
            this.f28460a.v();
            this.f28460a.o0(this.f28462c);
            this.f28462c = -1;
            this.f28463d = ((d) this.f28460a).f28451h;
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    public static final class e<K, V> extends C0478d<K, V> implements Iterator<K>, jd.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d<K, V> map) {
            super(map);
            t.f(map, "map");
        }

        @Override // java.util.Iterator
        public K next() {
            a();
            if (b() >= ((d) d()).f28449f) {
                throw new NoSuchElementException();
            }
            int iB = b();
            f(iB + 1);
            g(iB);
            K k10 = (K) ((d) d()).f28444a[c()];
            e();
            return k10;
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    public static final class f<K, V> extends C0478d<K, V> implements Iterator<V>, jd.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(d<K, V> map) {
            super(map);
            t.f(map, "map");
        }

        @Override // java.util.Iterator
        public V next() {
            a();
            if (b() >= ((d) d()).f28449f) {
                throw new NoSuchElementException();
            }
            int iB = b();
            f(iB + 1);
            g(iB);
            Object[] objArr = ((d) d()).f28445b;
            t.c(objArr);
            V v10 = (V) objArr[c()];
            e();
            return v10;
        }
    }

    static {
        d dVar = new d(0);
        dVar.f28456m = true;
        f28443o = dVar;
    }

    private d(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i10, int i11) {
        this.f28444a = kArr;
        this.f28445b = vArr;
        this.f28446c = iArr;
        this.f28447d = iArr2;
        this.f28448e = i10;
        this.f28449f = i11;
        this.f28450g = f28442n.d(N());
    }

    private final boolean B(Map<?, ?> map) {
        return size() == map.size() && x(map.entrySet());
    }

    private final void C(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        if (i10 > I()) {
            int iE = kotlin.collections.d.Companion.e(I(), i10);
            this.f28444a = (K[]) xc.c.e(this.f28444a, iE);
            V[] vArr = this.f28445b;
            this.f28445b = vArr != null ? (V[]) xc.c.e(vArr, iE) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.f28446c, iE);
            t.e(iArrCopyOf, "copyOf(...)");
            this.f28446c = iArrCopyOf;
            int iC = f28442n.c(iE);
            if (iC > N()) {
                m0(iC);
            }
        }
    }

    private final void D(int i10) {
        if (s0(i10)) {
            w(true);
        } else {
            C(this.f28449f + i10);
        }
    }

    private final int G(K k10) {
        int iD0 = d0(k10);
        int i10 = this.f28448e;
        while (true) {
            int i11 = this.f28447d[iD0];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (t.a(this.f28444a[i12], k10)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            iD0 = iD0 == 0 ? N() - 1 : iD0 - 1;
        }
    }

    private final int H(V v10) {
        int i10 = this.f28449f;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.f28446c[i10] >= 0) {
                V[] vArr = this.f28445b;
                t.c(vArr);
                if (t.a(vArr[i10], v10)) {
                    return i10;
                }
            }
        }
    }

    private final int N() {
        return this.f28447d.length;
    }

    private final int d0(K k10) {
        return ((k10 != null ? k10.hashCode() : 0) * (-1640531527)) >>> this.f28450g;
    }

    private final boolean i0(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z10 = false;
        if (collection.isEmpty()) {
            return false;
        }
        D(collection.size());
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it = collection.iterator();
        while (it.hasNext()) {
            if (j0(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    private final boolean j0(Map.Entry<? extends K, ? extends V> entry) {
        int iP = p(entry.getKey());
        V[] vArrS = s();
        if (iP >= 0) {
            vArrS[iP] = entry.getValue();
            return true;
        }
        int i10 = (-iP) - 1;
        if (t.a(entry.getValue(), vArrS[i10])) {
            return false;
        }
        vArrS[i10] = entry.getValue();
        return true;
    }

    private final boolean k0(int i10) {
        int iD0 = d0(this.f28444a[i10]);
        int i11 = this.f28448e;
        while (true) {
            int[] iArr = this.f28447d;
            if (iArr[iD0] == 0) {
                iArr[iD0] = i10 + 1;
                this.f28446c[i10] = iD0;
                return true;
            }
            i11--;
            if (i11 < 0) {
                return false;
            }
            iD0 = iD0 == 0 ? N() - 1 : iD0 - 1;
        }
    }

    private final void l0() {
        this.f28451h++;
    }

    private final void m0(int i10) {
        l0();
        int i11 = 0;
        if (this.f28449f > size()) {
            w(false);
        }
        this.f28447d = new int[i10];
        this.f28450g = f28442n.d(i10);
        while (i11 < this.f28449f) {
            int i12 = i11 + 1;
            if (!k0(i11)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i11 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o0(int i10) {
        xc.c.f(this.f28444a, i10);
        V[] vArr = this.f28445b;
        if (vArr != null) {
            xc.c.f(vArr, i10);
        }
        p0(this.f28446c[i10]);
        this.f28446c[i10] = -1;
        this.f28452i = size() - 1;
        l0();
    }

    private final void p0(int i10) {
        int iF = od.k.f(this.f28448e * 2, N() / 2);
        int i11 = 0;
        int i12 = i10;
        do {
            i10 = i10 == 0 ? N() - 1 : i10 - 1;
            i11++;
            if (i11 > this.f28448e) {
                this.f28447d[i12] = 0;
                return;
            }
            int[] iArr = this.f28447d;
            int i13 = iArr[i10];
            if (i13 == 0) {
                iArr[i12] = 0;
                return;
            }
            if (i13 < 0) {
                iArr[i12] = -1;
            } else {
                int i14 = i13 - 1;
                if (((d0(this.f28444a[i14]) - i10) & (N() - 1)) >= i11) {
                    this.f28447d[i12] = i13;
                    this.f28446c[i14] = i12;
                }
                iF--;
            }
            i12 = i10;
            i11 = 0;
            iF--;
        } while (iF >= 0);
        this.f28447d[i12] = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V[] s() {
        V[] vArr = this.f28445b;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) xc.c.d(I());
        this.f28445b = vArr2;
        return vArr2;
    }

    private final boolean s0(int i10) {
        int I = I();
        int i11 = this.f28449f;
        int i12 = I - i11;
        int size = i11 - size();
        return i12 < i10 && i12 + size >= i10 && size >= I() / 4;
    }

    private final void w(boolean z10) {
        int i10;
        V[] vArr = this.f28445b;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.f28449f;
            if (i11 >= i10) {
                break;
            }
            int[] iArr = this.f28446c;
            int i13 = iArr[i11];
            if (i13 >= 0) {
                K[] kArr = this.f28444a;
                kArr[i12] = kArr[i11];
                if (vArr != null) {
                    vArr[i12] = vArr[i11];
                }
                if (z10) {
                    iArr[i12] = i13;
                    this.f28447d[i13] = i12 + 1;
                }
                i12++;
            }
            i11++;
        }
        xc.c.g(this.f28444a, i12, i10);
        if (vArr != null) {
            xc.c.g(vArr, i12, this.f28449f);
        }
        this.f28449f = i12;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f28456m) {
            return new i(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final b<K, V> F() {
        return new b<>(this);
    }

    public final int I() {
        return this.f28444a.length;
    }

    public Set<Map.Entry<K, V>> K() {
        xc.e<K, V> eVar = this.f28455l;
        if (eVar != null) {
            return eVar;
        }
        xc.e<K, V> eVar2 = new xc.e<>(this);
        this.f28455l = eVar2;
        return eVar2;
    }

    public Set<K> U() {
        xc.f<K> fVar = this.f28453j;
        if (fVar != null) {
            return fVar;
        }
        xc.f<K> fVar2 = new xc.f<>(this);
        this.f28453j = fVar2;
        return fVar2;
    }

    public int Y() {
        return this.f28452i;
    }

    public Collection<V> a0() {
        g<V> gVar = this.f28454k;
        if (gVar != null) {
            return gVar;
        }
        g<V> gVar2 = new g<>(this);
        this.f28454k = gVar2;
        return gVar2;
    }

    @Override // java.util.Map
    public void clear() {
        v();
        int i10 = this.f28449f - 1;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                int[] iArr = this.f28446c;
                int i12 = iArr[i11];
                if (i12 >= 0) {
                    this.f28447d[i12] = 0;
                    iArr[i11] = -1;
                }
                if (i11 == i10) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        xc.c.g(this.f28444a, 0, this.f28449f);
        V[] vArr = this.f28445b;
        if (vArr != null) {
            xc.c.g(vArr, 0, this.f28449f);
        }
        this.f28452i = 0;
        this.f28449f = 0;
        l0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return G(obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return H(obj) >= 0;
    }

    public final boolean e0() {
        return this.f28456m;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return K();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof Map) && B((Map) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object obj) {
        int iG = G(obj);
        if (iG < 0) {
            return null;
        }
        V[] vArr = this.f28445b;
        t.c(vArr);
        return vArr[iG];
    }

    public final e<K, V> h0() {
        return new e<>(this);
    }

    @Override // java.util.Map
    public int hashCode() {
        b<K, V> bVarF = F();
        int iK = 0;
        while (bVarF.hasNext()) {
            iK += bVarF.k();
        }
        return iK;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return U();
    }

    public final boolean n0(Map.Entry<? extends K, ? extends V> entry) {
        t.f(entry, "entry");
        v();
        int iG = G(entry.getKey());
        if (iG < 0) {
            return false;
        }
        V[] vArr = this.f28445b;
        t.c(vArr);
        if (!t.a(vArr[iG], entry.getValue())) {
            return false;
        }
        o0(iG);
        return true;
    }

    public final int p(K k10) {
        v();
        while (true) {
            int iD0 = d0(k10);
            int iF = od.k.f(this.f28448e * 2, N() / 2);
            int i10 = 0;
            while (true) {
                int i11 = this.f28447d[iD0];
                if (i11 <= 0) {
                    if (this.f28449f >= I()) {
                        D(1);
                        break;
                    }
                    int i12 = this.f28449f;
                    int i13 = i12 + 1;
                    this.f28449f = i13;
                    this.f28444a[i12] = k10;
                    this.f28446c[i12] = iD0;
                    this.f28447d[iD0] = i13;
                    this.f28452i = size() + 1;
                    l0();
                    if (i10 > this.f28448e) {
                        this.f28448e = i10;
                    }
                    return i12;
                }
                if (t.a(this.f28444a[i11 - 1], k10)) {
                    return -i11;
                }
                i10++;
                if (i10 > iF) {
                    m0(N() * 2);
                    break;
                }
                iD0 = iD0 == 0 ? N() - 1 : iD0 - 1;
            }
        }
    }

    @Override // java.util.Map
    public V put(K k10, V v10) {
        v();
        int iP = p(k10);
        V[] vArrS = s();
        if (iP >= 0) {
            vArrS[iP] = v10;
            return null;
        }
        int i10 = (-iP) - 1;
        V v11 = vArrS[i10];
        vArrS[i10] = v10;
        return v11;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> from) {
        t.f(from, "from");
        v();
        i0(from.entrySet());
    }

    public final boolean q0(K k10) {
        v();
        int iG = G(k10);
        if (iG < 0) {
            return false;
        }
        o0(iG);
        return true;
    }

    public final boolean r0(V v10) {
        v();
        int iH = H(v10);
        if (iH < 0) {
            return false;
        }
        o0(iH);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V remove(Object obj) {
        v();
        int iG = G(obj);
        if (iG < 0) {
            return null;
        }
        V[] vArr = this.f28445b;
        t.c(vArr);
        V v10 = vArr[iG];
        o0(iG);
        return v10;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return Y();
    }

    public final Map<K, V> t() {
        v();
        this.f28456m = true;
        if (size() > 0) {
            return this;
        }
        d dVar = f28443o;
        t.d(dVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return dVar;
    }

    public final f<K, V> t0() {
        return new f<>(this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((size() * 3) + 2);
        sb2.append("{");
        b<K, V> bVarF = F();
        int i10 = 0;
        while (bVarF.hasNext()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            bVarF.j(sb2);
            i10++;
        }
        sb2.append("}");
        String string = sb2.toString();
        t.e(string, "toString(...)");
        return string;
    }

    public final void v() {
        if (this.f28456m) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return a0();
    }

    public final boolean x(Collection<?> m10) {
        t.f(m10, "m");
        for (Object obj : m10) {
            if (obj != null) {
                try {
                    if (!z((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean z(Map.Entry<? extends K, ? extends V> entry) {
        t.f(entry, "entry");
        int iG = G(entry.getKey());
        if (iG < 0) {
            return false;
        }
        V[] vArr = this.f28445b;
        t.c(vArr);
        return t.a(vArr[iG], entry.getValue());
    }

    public d() {
        this(8);
    }

    public d(int i10) {
        this(xc.c.d(i10), null, new int[i10], new int[f28442n.c(i10)], 2, 0);
    }
}
