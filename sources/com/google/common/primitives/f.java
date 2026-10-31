package com.google.common.primitives;

import com.google.common.base.p;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: Ints.java */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends g {

    /* JADX INFO: compiled from: Ints.java */
    private static class a extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int[] f11761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f11762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f11763c;

        a(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer get(int i10) {
            p.j(i10, size());
            return Integer.valueOf(this.f11761a[this.f11762b + i10]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Integer) && f.j(this.f11761a, ((Integer) obj).intValue(), this.f11762b, this.f11763c) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Integer set(int i10, Integer num) {
            p.j(i10, size());
            int[] iArr = this.f11761a;
            int i11 = this.f11762b;
            int i12 = iArr[i11 + i10];
            iArr[i11 + i10] = ((Integer) p.l(num)).intValue();
            return Integer.valueOf(i12);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            a aVar = (a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f11761a[this.f11762b + i10] != aVar.f11761a[aVar.f11762b + i10]) {
                    return false;
                }
            }
            return true;
        }

        int[] f() {
            return Arrays.copyOfRange(this.f11761a, this.f11762b, this.f11763c);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iH = 1;
            for (int i10 = this.f11762b; i10 < this.f11763c; i10++) {
                iH = (iH * 31) + f.h(this.f11761a[i10]);
            }
            return iH;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iJ;
            if (!(obj instanceof Integer) || (iJ = f.j(this.f11761a, ((Integer) obj).intValue(), this.f11762b, this.f11763c)) < 0) {
                return -1;
            }
            return iJ - this.f11762b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iK;
            if (!(obj instanceof Integer) || (iK = f.k(this.f11761a, ((Integer) obj).intValue(), this.f11762b, this.f11763c)) < 0) {
                return -1;
            }
            return iK - this.f11762b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f11763c - this.f11762b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i10, int i11) {
            p.q(i10, i11, size());
            if (i10 == i11) {
                return Collections.emptyList();
            }
            int[] iArr = this.f11761a;
            int i12 = this.f11762b;
            return new a(iArr, i10 + i12, i12 + i11);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
            sb2.append('[');
            sb2.append(this.f11761a[this.f11762b]);
            int i10 = this.f11762b;
            while (true) {
                i10++;
                if (i10 >= this.f11763c) {
                    sb2.append(']');
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append(this.f11761a[i10]);
            }
        }

        a(int[] iArr, int i10, int i11) {
            this.f11761a = iArr;
            this.f11762b = i10;
            this.f11763c = i11;
        }
    }

    public static List<Integer> c(int... iArr) {
        return iArr.length == 0 ? Collections.emptyList() : new a(iArr);
    }

    public static int d(long j10) {
        int i10 = (int) j10;
        p.h(((long) i10) == j10, "Out of range: %s", j10);
        return i10;
    }

    public static int e(int i10, int i11, int i12) {
        p.g(i11 <= i12, "min (%s) must be less than or equal to max (%s)", i11, i12);
        return Math.min(Math.max(i10, i11), i12);
    }

    public static int f(byte[] bArr) {
        p.g(bArr.length >= 4, "array too small: %s < %s", bArr.length, 4);
        return g(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int g(byte b10, byte b11, byte b12, byte b13) {
        return (b10 << 24) | ((b11 & 255) << 16) | ((b12 & 255) << 8) | (b13 & 255);
    }

    public static int i(int[] iArr, int i10) {
        return j(iArr, i10, 0, iArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int j(int[] iArr, int i10, int i11, int i12) {
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(int[] iArr, int i10, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            if (iArr[i13] == i10) {
                return i13;
            }
        }
        return -1;
    }

    public static int l(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    public static int[] m(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).f();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = ((Number) p.l(array[i10])).intValue();
        }
        return iArr;
    }

    public static Integer n(String str) {
        return o(str, 10);
    }

    public static Integer o(String str, int i10) {
        Long lC = h.c(str, i10);
        if (lC == null || lC.longValue() != lC.intValue()) {
            return null;
        }
        return Integer.valueOf(lC.intValue());
    }

    public static int h(int i10) {
        return i10;
    }
}
