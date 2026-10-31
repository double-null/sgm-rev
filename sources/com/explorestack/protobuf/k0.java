package com.explorestack.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: IntArrayList.java */
/* JADX INFO: loaded from: classes.dex */
final class k0 extends c<Integer> implements l0.g, RandomAccess, t1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final k0 f10607d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f10608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f10609c;

    static {
        k0 k0Var = new k0(new int[0], 0);
        f10607d = k0Var;
        k0Var.makeImmutable();
    }

    k0() {
        this(new int[10], 0);
    }

    private void e(int i10, int i11) {
        int i12;
        a();
        if (i10 < 0 || i10 > (i12 = this.f10609c)) {
            throw new IndexOutOfBoundsException(i(i10));
        }
        int[] iArr = this.f10608b;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
        } else {
            int[] iArr2 = new int[((i12 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f10608b, i10, iArr2, i10 + 1, this.f10609c - i10);
            this.f10608b = iArr2;
        }
        this.f10608b[i10] = i11;
        this.f10609c++;
        ((AbstractList) this).modCount++;
    }

    public static k0 f() {
        return f10607d;
    }

    private void g(int i10) {
        if (i10 < 0 || i10 >= this.f10609c) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    private String i(int i10) {
        return "Index:" + i10 + ", Size:" + this.f10609c;
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        a();
        l0.a(collection);
        if (!(collection instanceof k0)) {
            return super.addAll(collection);
        }
        k0 k0Var = (k0) collection;
        int i10 = k0Var.f10609c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f10609c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f10608b;
        if (i12 > iArr.length) {
            this.f10608b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(k0Var.f10608b, 0, this.f10608b, this.f10609c, k0Var.f10609c);
        this.f10609c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.explorestack.protobuf.l0.g
    public void addInt(int i10) {
        a();
        int i11 = this.f10609c;
        int[] iArr = this.f10608b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f10608b = iArr2;
        }
        int[] iArr3 = this.f10608b;
        int i12 = this.f10609c;
        this.f10609c = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Integer num) {
        e(i10, num.intValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        addInt(num.intValue());
        return true;
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return super.equals(obj);
        }
        k0 k0Var = (k0) obj;
        if (this.f10609c != k0Var.f10609c) {
            return false;
        }
        int[] iArr = k0Var.f10608b;
        for (int i10 = 0; i10 < this.f10609c; i10++) {
            if (this.f10608b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.explorestack.protobuf.l0.g
    public int getInt(int i10) {
        g(i10);
        return this.f10608b[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Integer get(int i10) {
        return Integer.valueOf(getInt(i10));
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f10609c; i11++) {
            i10 = (i10 * 31) + this.f10608b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f10608b[i10] == iIntValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i10) {
        a();
        g(i10);
        int[] iArr = this.f10608b;
        int i11 = iArr[i10];
        int i12 = this.f10609c;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f10609c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Integer set(int i10, Integer num) {
        return Integer.valueOf(setInt(i10, num.intValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f10608b;
        System.arraycopy(iArr, i11, iArr, i10, this.f10609c - i11);
        this.f10609c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.explorestack.protobuf.l0.g
    public int setInt(int i10, int i11) {
        a();
        g(i10);
        int[] iArr = this.f10608b;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f10609c;
    }

    private k0(int[] iArr, int i10) {
        this.f10608b = iArr;
        this.f10609c = i10;
    }

    @Override // com.explorestack.protobuf.l0.j, com.explorestack.protobuf.l0.f
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public l0.j<Integer> mutableCopyWithCapacity2(int i10) {
        if (i10 >= this.f10609c) {
            return new k0(Arrays.copyOf(this.f10608b, i10), this.f10609c);
        }
        throw new IllegalArgumentException();
    }
}
