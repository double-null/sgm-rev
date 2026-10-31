package com.explorestack.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: DoubleArrayList.java */
/* JADX INFO: loaded from: classes.dex */
final class r extends c<Double> implements l0.b, RandomAccess, t1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final r f10784d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double[] f10785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f10786c;

    static {
        r rVar = new r(new double[0], 0);
        f10784d = rVar;
        rVar.makeImmutable();
    }

    r() {
        this(new double[10], 0);
    }

    private void e(int i10, double d10) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f10786c)) {
            throw new IndexOutOfBoundsException(i(i10));
        }
        double[] dArr = this.f10785b;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[((i11 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f10785b, i10, dArr2, i10 + 1, this.f10786c - i10);
            this.f10785b = dArr2;
        }
        this.f10785b[i10] = d10;
        this.f10786c++;
        ((AbstractList) this).modCount++;
    }

    public static r f() {
        return f10784d;
    }

    private void g(int i10) {
        if (i10 < 0 || i10 >= this.f10786c) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    private String i(int i10) {
        return "Index:" + i10 + ", Size:" + this.f10786c;
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        a();
        l0.a(collection);
        if (!(collection instanceof r)) {
            return super.addAll(collection);
        }
        r rVar = (r) collection;
        int i10 = rVar.f10786c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f10786c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f10785b;
        if (i12 > dArr.length) {
            this.f10785b = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(rVar.f10785b, 0, this.f10785b, this.f10786c, rVar.f10786c);
        this.f10786c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public void addDouble(double d10) {
        a();
        int i10 = this.f10786c;
        double[] dArr = this.f10785b;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f10785b = dArr2;
        }
        double[] dArr3 = this.f10785b;
        int i11 = this.f10786c;
        this.f10786c = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Double d10) {
        e(i10, d10.doubleValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean add(Double d10) {
        addDouble(d10.doubleValue());
        return true;
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return super.equals(obj);
        }
        r rVar = (r) obj;
        if (this.f10786c != rVar.f10786c) {
            return false;
        }
        double[] dArr = rVar.f10785b;
        for (int i10 = 0; i10 < this.f10786c; i10++) {
            if (Double.doubleToLongBits(this.f10785b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public double getDouble(int i10) {
        g(i10);
        return this.f10785b[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Double get(int i10) {
        return Double.valueOf(getDouble(i10));
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f10786c; i11++) {
            i10 = (i10 * 31) + l0.i(Double.doubleToLongBits(this.f10785b[i11]));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f10785b[i10] == dDoubleValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Double remove(int i10) {
        a();
        g(i10);
        double[] dArr = this.f10785b;
        double d10 = dArr[i10];
        int i11 = this.f10786c;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f10786c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Double set(int i10, Double d10) {
        return Double.valueOf(setDouble(i10, d10.doubleValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f10785b;
        System.arraycopy(dArr, i11, dArr, i10, this.f10786c - i11);
        this.f10786c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    public double setDouble(int i10, double d10) {
        a();
        g(i10);
        double[] dArr = this.f10785b;
        double d11 = dArr[i10];
        dArr[i10] = d10;
        return d11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f10786c;
    }

    private r(double[] dArr, int i10) {
        this.f10785b = dArr;
        this.f10786c = i10;
    }

    @Override // com.explorestack.protobuf.l0.j, com.explorestack.protobuf.l0.f
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public l0.j<Double> mutableCopyWithCapacity2(int i10) {
        if (i10 >= this.f10786c) {
            return new r(Arrays.copyOf(this.f10785b, i10), this.f10786c);
        }
        throw new IllegalArgumentException();
    }
}
