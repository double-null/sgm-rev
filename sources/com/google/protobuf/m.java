package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: DoubleArrayList.java */
/* JADX INFO: loaded from: classes4.dex */
final class m extends c<Double> implements a0.b, RandomAccess, d1 {
    private static final m EMPTY_LIST = new m(new double[0], 0, false);
    private double[] array;
    private int size;

    m() {
        this(new double[10], 0, true);
    }

    public static m emptyList() {
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
    public boolean addAll(Collection<? extends Double> collection) {
        ensureIsMutable();
        a0.checkNotNull(collection);
        if (!(collection instanceof m)) {
            return super.addAll(collection);
        }
        m mVar = (m) collection;
        int i10 = mVar.size;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.size;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.array;
        if (i12 > dArr.length) {
            this.array = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(mVar.array, 0, this.array, this.size, mVar.size);
        this.size = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.a0.b
    public void addDouble(double d10) {
        ensureIsMutable();
        int i10 = this.size;
        double[] dArr = this.array;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.array = dArr2;
        }
        double[] dArr3 = this.array;
        int i11 = this.size;
        this.size = i11 + 1;
        dArr3[i11] = d10;
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
        if (!(obj instanceof m)) {
            return super.equals(obj);
        }
        m mVar = (m) obj;
        if (this.size != mVar.size) {
            return false;
        }
        double[] dArr = mVar.array;
        for (int i10 = 0; i10 < this.size; i10++) {
            if (Double.doubleToLongBits(this.array[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.a0.b
    public double getDouble(int i10) {
        ensureIndexInRange(i10);
        return this.array[i10];
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashLong = 1;
        for (int i10 = 0; i10 < this.size; i10++) {
            iHashLong = (iHashLong * 31) + a0.hashLong(Double.doubleToLongBits(this.array[i10]));
        }
        return iHashLong;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.array[i10] == dDoubleValue) {
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
        double[] dArr = this.array;
        System.arraycopy(dArr, i11, dArr, i10, this.size - i11);
        this.size -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.a0.b
    public double setDouble(int i10, double d10) {
        ensureIsMutable();
        ensureIndexInRange(i10);
        double[] dArr = this.array;
        double d11 = dArr[i10];
        dArr[i10] = d10;
        return d11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private m(double[] dArr, int i10, boolean z10) {
        super(z10);
        this.array = dArr;
        this.size = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public Double get(int i10) {
        return Double.valueOf(getDouble(i10));
    }

    @Override // com.google.protobuf.c, com.google.protobuf.a0.i
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public a0.i<Double> mutableCopyWithCapacity2(int i10) {
        if (i10 >= this.size) {
            return new m(Arrays.copyOf(this.array, i10), this.size, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public Double remove(int i10) {
        ensureIsMutable();
        ensureIndexInRange(i10);
        double[] dArr = this.array;
        double d10 = dArr[i10];
        int i11 = this.size;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public Double set(int i10, Double d10) {
        return Double.valueOf(setDouble(i10, d10.doubleValue()));
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Double d10) {
        addDouble(d10.doubleValue());
        return true;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public void add(int i10, Double d10) {
        addDouble(i10, d10.doubleValue());
    }

    private void addDouble(int i10, double d10) {
        int i11;
        ensureIsMutable();
        if (i10 >= 0 && i10 <= (i11 = this.size)) {
            double[] dArr = this.array;
            if (i11 < dArr.length) {
                System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
            } else {
                double[] dArr2 = new double[((i11 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i10);
                System.arraycopy(this.array, i10, dArr2, i10 + 1, this.size - i10);
                this.array = dArr2;
            }
            this.array[i10] = d10;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i10));
    }
}
