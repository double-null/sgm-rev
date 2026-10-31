package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: IntArrayList.java */
/* JADX INFO: loaded from: classes4.dex */
final class z extends c<Integer> implements a0.g, RandomAccess, d1 {
    private static final z EMPTY_LIST = new z(new int[0], 0, false);
    private int[] array;
    private int size;

    z() {
        this(new int[10], 0, true);
    }

    public static z emptyList() {
        return EMPTY_LIST;
    }

    private void ensureIndexInRange(int i10) {
        if (i10 < 0 || i10 >= this.size) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i10));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int i10) {
        return "Index:" + i10 + ", Size:" + this.size;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        ensureIsMutable();
        a0.checkNotNull(collection);
        if (!(collection instanceof z)) {
            return super.addAll(collection);
        }
        z zVar = (z) collection;
        int i10 = zVar.size;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.size;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.array;
        if (i12 > iArr.length) {
            this.array = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(zVar.array, 0, this.array, this.size, zVar.size);
        this.size = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.a0.g
    public void addInt(int i10) {
        ensureIsMutable();
        int i11 = this.size;
        int[] iArr = this.array;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.array = iArr2;
        }
        int[] iArr3 = this.array;
        int i12 = this.size;
        this.size = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return super.equals(obj);
        }
        z zVar = (z) obj;
        if (this.size != zVar.size) {
            return false;
        }
        int[] iArr = zVar.array;
        for (int i10 = 0; i10 < this.size; i10++) {
            if (this.array[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.a0.g
    public int getInt(int i10) {
        ensureIndexInRange(i10);
        return this.array[i10];
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.size; i11++) {
            i10 = (i10 * 31) + this.array[i11];
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
            if (this.array[i10] == iIntValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        ensureIsMutable();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.array;
        System.arraycopy(iArr, i11, iArr, i10, this.size - i11);
        this.size -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.a0.g
    public int setInt(int i10, int i11) {
        ensureIsMutable();
        ensureIndexInRange(i10);
        int[] iArr = this.array;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private z(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.array = iArr;
        this.size = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public Integer get(int i10) {
        return Integer.valueOf(getInt(i10));
    }

    @Override // com.google.protobuf.c, com.google.protobuf.a0.i
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public a0.i<Integer> mutableCopyWithCapacity2(int i10) {
        if (i10 >= this.size) {
            return new z(Arrays.copyOf(this.array, i10), this.size, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public Integer remove(int i10) {
        ensureIsMutable();
        ensureIndexInRange(i10);
        int[] iArr = this.array;
        int i11 = iArr[i10];
        int i12 = this.size;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public Integer set(int i10, Integer num) {
        return Integer.valueOf(setInt(i10, num.intValue()));
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Integer num) {
        addInt(num.intValue());
        return true;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public void add(int i10, Integer num) {
        addInt(i10, num.intValue());
    }

    private void addInt(int i10, int i11) {
        int i12;
        ensureIsMutable();
        if (i10 >= 0 && i10 <= (i12 = this.size)) {
            int[] iArr = this.array;
            if (i12 < iArr.length) {
                System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
            } else {
                int[] iArr2 = new int[((i12 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i10);
                System.arraycopy(this.array, i10, iArr2, i10 + 1, this.size - i10);
                this.array = iArr2;
            }
            this.array[i10] = i11;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i10));
    }
}
