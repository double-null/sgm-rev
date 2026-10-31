package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: DoubleArrayList.java */
/* JADX INFO: loaded from: classes.dex */
final class k extends c<Double> implements y.b, RandomAccess, y0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final k f2211d = new k(new double[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double[] f2212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2213c;

    k() {
        this(new double[10], 0, true);
    }

    private void e(int i10, double d10) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f2213c)) {
            throw new IndexOutOfBoundsException(h(i10));
        }
        double[] dArr = this.f2212b;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[((i11 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f2212b, i10, dArr2, i10 + 1, this.f2213c - i10);
            this.f2212b = dArr2;
        }
        this.f2212b[i10] = d10;
        this.f2213c++;
        ((AbstractList) this).modCount++;
    }

    private void f(int i10) {
        if (i10 < 0 || i10 >= this.f2213c) {
            throw new IndexOutOfBoundsException(h(i10));
        }
    }

    private String h(int i10) {
        return "Index:" + i10 + ", Size:" + this.f2213c;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        a();
        y.a(collection);
        if (!(collection instanceof k)) {
            return super.addAll(collection);
        }
        k kVar = (k) collection;
        int i10 = kVar.f2213c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f2213c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f2212b;
        if (i12 > dArr.length) {
            this.f2212b = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(kVar.f2212b, 0, this.f2212b, this.f2213c, kVar.f2213c);
        this.f2213c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public void addDouble(double d10) {
        a();
        int i10 = this.f2213c;
        double[] dArr = this.f2212b;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f2212b = dArr2;
        }
        double[] dArr3 = this.f2212b;
        int i11 = this.f2213c;
        this.f2213c = i11 + 1;
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

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean add(Double d10) {
        addDouble(d10.doubleValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return super.equals(obj);
        }
        k kVar = (k) obj;
        if (this.f2213c != kVar.f2213c) {
            return false;
        }
        double[] dArr = kVar.f2212b;
        for (int i10 = 0; i10 < this.f2213c; i10++) {
            if (Double.doubleToLongBits(this.f2212b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Double get(int i10) {
        return Double.valueOf(getDouble(i10));
    }

    public double getDouble(int i10) {
        f(i10);
        return this.f2212b[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iF = 1;
        for (int i10 = 0; i10 < this.f2213c; i10++) {
            iF = (iF * 31) + y.f(Double.doubleToLongBits(this.f2212b[i10]));
        }
        return iF;
    }

    @Override // androidx.datastore.preferences.protobuf.y.i
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public y.b mutableCopyWithCapacity(int i10) {
        if (i10 >= this.f2213c) {
            return new k(Arrays.copyOf(this.f2212b, i10), this.f2213c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f2212b[i10] == dDoubleValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Double remove(int i10) {
        a();
        f(i10);
        double[] dArr = this.f2212b;
        double d10 = dArr[i10];
        int i11 = this.f2213c;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f2213c--;
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
        double[] dArr = this.f2212b;
        System.arraycopy(dArr, i11, dArr, i10, this.f2213c - i11);
        this.f2213c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    public double setDouble(int i10, double d10) {
        a();
        f(i10);
        double[] dArr = this.f2212b;
        double d11 = dArr[i10];
        dArr[i10] = d10;
        return d11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f2213c;
    }

    private k(double[] dArr, int i10, boolean z10) {
        super(z10);
        this.f2212b = dArr;
        this.f2213c = i10;
    }
}
