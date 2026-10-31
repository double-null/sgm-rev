package androidx.collection;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: SimpleArrayMap.java */
/* JADX INFO: loaded from: classes.dex */
public class h<K, V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static Object[] f1639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static int f1640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static Object[] f1641f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static int f1642g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int[] f1643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object[] f1644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f1645c;

    public h() {
        this.f1643a = d.f1616a;
        this.f1644b = d.f1618c;
        this.f1645c = 0;
    }

    private void a(int i10) {
        if (i10 == 8) {
            synchronized (h.class) {
                Object[] objArr = f1641f;
                if (objArr != null) {
                    this.f1644b = objArr;
                    f1641f = (Object[]) objArr[0];
                    this.f1643a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1642g--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (h.class) {
                Object[] objArr2 = f1639d;
                if (objArr2 != null) {
                    this.f1644b = objArr2;
                    f1639d = (Object[]) objArr2[0];
                    this.f1643a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1640e--;
                    return;
                }
            }
        }
        this.f1643a = new int[i10];
        this.f1644b = new Object[i10 << 1];
    }

    private static int b(int[] iArr, int i10, int i11) {
        try {
            return d.a(iArr, i10, i11);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void d(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (h.class) {
                if (f1642g < 10) {
                    objArr[0] = f1641f;
                    objArr[1] = iArr;
                    for (int i11 = (i10 << 1) - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f1641f = objArr;
                    f1642g++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (h.class) {
                if (f1640e < 10) {
                    objArr[0] = f1639d;
                    objArr[1] = iArr;
                    for (int i12 = (i10 << 1) - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f1639d = objArr;
                    f1640e++;
                }
            }
        }
    }

    public void c(int i10) {
        int i11 = this.f1645c;
        int[] iArr = this.f1643a;
        if (iArr.length < i10) {
            Object[] objArr = this.f1644b;
            a(i10);
            if (this.f1645c > 0) {
                System.arraycopy(iArr, 0, this.f1643a, 0, i11);
                System.arraycopy(objArr, 0, this.f1644b, 0, i11 << 1);
            }
            d(iArr, objArr, i11);
        }
        if (this.f1645c != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i10 = this.f1645c;
        if (i10 > 0) {
            int[] iArr = this.f1643a;
            Object[] objArr = this.f1644b;
            this.f1643a = d.f1616a;
            this.f1644b = d.f1618c;
            this.f1645c = 0;
            d(iArr, objArr, i10);
        }
        if (this.f1645c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    int e(Object obj, int i10) {
        int i11 = this.f1645c;
        if (i11 == 0) {
            return -1;
        }
        int iB = b(this.f1643a, i11, i10);
        if (iB < 0 || obj.equals(this.f1644b[iB << 1])) {
            return iB;
        }
        int i12 = iB + 1;
        while (i12 < i11 && this.f1643a[i12] == i10) {
            if (obj.equals(this.f1644b[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iB - 1; i13 >= 0 && this.f1643a[i13] == i10; i13--) {
            if (obj.equals(this.f1644b[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (size() != hVar.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f1645c; i10++) {
                try {
                    K kJ = j(i10);
                    V vN = n(i10);
                    Object obj2 = hVar.get(kJ);
                    if (vN == null) {
                        if (obj2 != null || !hVar.containsKey(kJ)) {
                            return false;
                        }
                    } else if (!vN.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i11 = 0; i11 < this.f1645c; i11++) {
                try {
                    K kJ2 = j(i11);
                    V vN2 = n(i11);
                    Object obj3 = map.get(kJ2);
                    if (vN2 == null) {
                        if (obj3 != null || !map.containsKey(kJ2)) {
                            return false;
                        }
                    } else if (!vN2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f(Object obj) {
        return obj == null ? g() : e(obj, obj.hashCode());
    }

    int g() {
        int i10 = this.f1645c;
        if (i10 == 0) {
            return -1;
        }
        int iB = b(this.f1643a, i10, 0);
        if (iB < 0 || this.f1644b[iB << 1] == null) {
            return iB;
        }
        int i11 = iB + 1;
        while (i11 < i10 && this.f1643a[i11] == 0) {
            if (this.f1644b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iB - 1; i12 >= 0 && this.f1643a[i12] == 0; i12--) {
            if (this.f1644b[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v10) {
        int iF = f(obj);
        return iF >= 0 ? (V) this.f1644b[(iF << 1) + 1] : v10;
    }

    public int hashCode() {
        int[] iArr = this.f1643a;
        Object[] objArr = this.f1644b;
        int i10 = this.f1645c;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    int i(Object obj) {
        int i10 = this.f1645c * 2;
        Object[] objArr = this.f1644b;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f1645c <= 0;
    }

    public K j(int i10) {
        return (K) this.f1644b[i10 << 1];
    }

    public void k(h<? extends K, ? extends V> hVar) {
        int i10 = hVar.f1645c;
        c(this.f1645c + i10);
        if (this.f1645c != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(hVar.j(i11), hVar.n(i11));
            }
        } else if (i10 > 0) {
            System.arraycopy(hVar.f1643a, 0, this.f1643a, 0, i10);
            System.arraycopy(hVar.f1644b, 0, this.f1644b, 0, i10 << 1);
            this.f1645c = i10;
        }
    }

    public V l(int i10) {
        Object[] objArr = this.f1644b;
        int i11 = i10 << 1;
        V v10 = (V) objArr[i11 + 1];
        int i12 = this.f1645c;
        int i13 = 0;
        if (i12 <= 1) {
            d(this.f1643a, objArr, i12);
            this.f1643a = d.f1616a;
            this.f1644b = d.f1618c;
        } else {
            int i14 = i12 - 1;
            int[] iArr = this.f1643a;
            if (iArr.length <= 8 || i12 >= iArr.length / 3) {
                if (i10 < i14) {
                    int i15 = i10 + 1;
                    int i16 = i14 - i10;
                    System.arraycopy(iArr, i15, iArr, i10, i16);
                    Object[] objArr2 = this.f1644b;
                    System.arraycopy(objArr2, i15 << 1, objArr2, i11, i16 << 1);
                }
                Object[] objArr3 = this.f1644b;
                int i17 = i14 << 1;
                objArr3[i17] = null;
                objArr3[i17 + 1] = null;
            } else {
                a(i12 > 8 ? i12 + (i12 >> 1) : 8);
                if (i12 != this.f1645c) {
                    throw new ConcurrentModificationException();
                }
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f1643a, 0, i10);
                    System.arraycopy(objArr, 0, this.f1644b, 0, i11);
                }
                if (i10 < i14) {
                    int i18 = i10 + 1;
                    int i19 = i14 - i10;
                    System.arraycopy(iArr, i18, this.f1643a, i10, i19);
                    System.arraycopy(objArr, i18 << 1, this.f1644b, i11, i19 << 1);
                }
            }
            i13 = i14;
        }
        if (i12 != this.f1645c) {
            throw new ConcurrentModificationException();
        }
        this.f1645c = i13;
        return v10;
    }

    public V m(int i10, V v10) {
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f1644b;
        V v11 = (V) objArr[i11];
        objArr[i11] = v10;
        return v11;
    }

    public V n(int i10) {
        return (V) this.f1644b[(i10 << 1) + 1];
    }

    public V put(K k10, V v10) {
        int i10;
        int iE;
        int i11 = this.f1645c;
        if (k10 == null) {
            iE = g();
            i10 = 0;
        } else {
            int iHashCode = k10.hashCode();
            i10 = iHashCode;
            iE = e(k10, iHashCode);
        }
        if (iE >= 0) {
            int i12 = (iE << 1) + 1;
            Object[] objArr = this.f1644b;
            V v11 = (V) objArr[i12];
            objArr[i12] = v10;
            return v11;
        }
        int i13 = ~iE;
        int[] iArr = this.f1643a;
        if (i11 >= iArr.length) {
            int i14 = 8;
            if (i11 >= 8) {
                i14 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i14 = 4;
            }
            Object[] objArr2 = this.f1644b;
            a(i14);
            if (i11 != this.f1645c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f1643a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f1644b, 0, objArr2.length);
            }
            d(iArr, objArr2, i11);
        }
        if (i13 < i11) {
            int[] iArr3 = this.f1643a;
            int i15 = i13 + 1;
            System.arraycopy(iArr3, i13, iArr3, i15, i11 - i13);
            Object[] objArr3 = this.f1644b;
            System.arraycopy(objArr3, i13 << 1, objArr3, i15 << 1, (this.f1645c - i13) << 1);
        }
        int i16 = this.f1645c;
        if (i11 == i16) {
            int[] iArr4 = this.f1643a;
            if (i13 < iArr4.length) {
                iArr4[i13] = i10;
                Object[] objArr4 = this.f1644b;
                int i17 = i13 << 1;
                objArr4[i17] = k10;
                objArr4[i17 + 1] = v10;
                this.f1645c = i16 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k10, V v10) {
        V v11 = get(k10);
        return v11 == null ? put(k10, v10) : v11;
    }

    public V remove(Object obj) {
        int iF = f(obj);
        if (iF >= 0) {
            return l(iF);
        }
        return null;
    }

    public V replace(K k10, V v10) {
        int iF = f(k10);
        if (iF >= 0) {
            return m(iF, v10);
        }
        return null;
    }

    public int size() {
        return this.f1645c;
    }

    public String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(this.f1645c * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f1645c; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            K kJ = j(i10);
            if (kJ != this) {
                sb2.append(kJ);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            V vN = n(i10);
            if (vN != this) {
                sb2.append(vN);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int iF = f(obj);
        if (iF < 0) {
            return false;
        }
        V vN = n(iF);
        if (obj2 != vN && (obj2 == null || !obj2.equals(vN))) {
            return false;
        }
        l(iF);
        return true;
    }

    public boolean replace(K k10, V v10, V v11) {
        int iF = f(k10);
        if (iF < 0) {
            return false;
        }
        V vN = n(iF);
        if (vN != v10 && (v10 == null || !v10.equals(vN))) {
            return false;
        }
        m(iF, v11);
        return true;
    }

    public h(int i10) {
        if (i10 == 0) {
            this.f1643a = d.f1616a;
            this.f1644b = d.f1618c;
        } else {
            a(i10);
        }
        this.f1645c = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(h<K, V> hVar) {
        this();
        if (hVar != 0) {
            k(hVar);
        }
    }
}
