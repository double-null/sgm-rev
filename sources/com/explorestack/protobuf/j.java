package com.explorestack.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: BooleanArrayList.java */
/* JADX INFO: loaded from: classes.dex */
final class j extends c<Boolean> implements l0.a, RandomAccess, t1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final j f10520d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean[] f10521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f10522c;

    static {
        j jVar = new j(new boolean[0], 0);
        f10520d = jVar;
        jVar.makeImmutable();
    }

    j() {
        this(new boolean[10], 0);
    }

    private void e(int i10, boolean z10) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f10522c)) {
            throw new IndexOutOfBoundsException(i(i10));
        }
        boolean[] zArr = this.f10521b;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f10521b, i10, zArr2, i10 + 1, this.f10522c - i10);
            this.f10521b = zArr2;
        }
        this.f10521b[i10] = z10;
        this.f10522c++;
        ((AbstractList) this).modCount++;
    }

    public static j f() {
        return f10520d;
    }

    private void g(int i10) {
        if (i10 < 0 || i10 >= this.f10522c) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    private String i(int i10) {
        return "Index:" + i10 + ", Size:" + this.f10522c;
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        a();
        l0.a(collection);
        if (!(collection instanceof j)) {
            return super.addAll(collection);
        }
        j jVar = (j) collection;
        int i10 = jVar.f10522c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f10522c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f10521b;
        if (i12 > zArr.length) {
            this.f10521b = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(jVar.f10521b, 0, this.f10521b, this.f10522c, jVar.f10522c);
        this.f10522c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public void addBoolean(boolean z10) {
        a();
        int i10 = this.f10522c;
        boolean[] zArr = this.f10521b;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f10521b = zArr2;
        }
        boolean[] zArr3 = this.f10521b;
        int i11 = this.f10522c;
        this.f10522c = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Boolean bool) {
        e(i10, bool.booleanValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean add(Boolean bool) {
        addBoolean(bool.booleanValue());
        return true;
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return super.equals(obj);
        }
        j jVar = (j) obj;
        if (this.f10522c != jVar.f10522c) {
            return false;
        }
        boolean[] zArr = jVar.f10521b;
        for (int i10 = 0; i10 < this.f10522c; i10++) {
            if (this.f10521b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public boolean getBoolean(int i10) {
        g(i10);
        return this.f10521b[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Boolean get(int i10) {
        return Boolean.valueOf(getBoolean(i10));
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iD = 1;
        for (int i10 = 0; i10 < this.f10522c; i10++) {
            iD = (iD * 31) + l0.d(this.f10521b[i10]);
        }
        return iD;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f10521b[i10] == zBooleanValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int i10) {
        a();
        g(i10);
        boolean[] zArr = this.f10521b;
        boolean z10 = zArr[i10];
        int i11 = this.f10522c;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f10522c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Boolean set(int i10, Boolean bool) {
        return Boolean.valueOf(setBoolean(i10, bool.booleanValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f10521b;
        System.arraycopy(zArr, i11, zArr, i10, this.f10522c - i11);
        this.f10522c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    public boolean setBoolean(int i10, boolean z10) {
        a();
        g(i10);
        boolean[] zArr = this.f10521b;
        boolean z11 = zArr[i10];
        zArr[i10] = z10;
        return z11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f10522c;
    }

    private j(boolean[] zArr, int i10) {
        this.f10521b = zArr;
        this.f10522c = i10;
    }

    @Override // com.explorestack.protobuf.l0.j, com.explorestack.protobuf.l0.f
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public l0.j<Boolean> mutableCopyWithCapacity2(int i10) {
        if (i10 >= this.f10522c) {
            return new j(Arrays.copyOf(this.f10521b, i10), this.f10522c);
        }
        throw new IllegalArgumentException();
    }
}
