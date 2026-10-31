package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: IntArrayList.java */
/* JADX INFO: loaded from: classes.dex */
final class x extends c<Integer> implements y.g, RandomAccess, y0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final x f2390d = new x(new int[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f2391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2392c;

    x() {
        this(new int[10], 0, true);
    }

    private void e(int i10, int i11) {
        int i12;
        a();
        if (i10 < 0 || i10 > (i12 = this.f2392c)) {
            throw new IndexOutOfBoundsException(h(i10));
        }
        int[] iArr = this.f2391b;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
        } else {
            int[] iArr2 = new int[((i12 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f2391b, i10, iArr2, i10 + 1, this.f2392c - i10);
            this.f2391b = iArr2;
        }
        this.f2391b[i10] = i11;
        this.f2392c++;
        ((AbstractList) this).modCount++;
    }

    private void f(int i10) {
        if (i10 < 0 || i10 >= this.f2392c) {
            throw new IndexOutOfBoundsException(h(i10));
        }
    }

    private String h(int i10) {
        return "Index:" + i10 + ", Size:" + this.f2392c;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        a();
        y.a(collection);
        if (!(collection instanceof x)) {
            return super.addAll(collection);
        }
        x xVar = (x) collection;
        int i10 = xVar.f2392c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f2392c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f2391b;
        if (i12 > iArr.length) {
            this.f2391b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(xVar.f2391b, 0, this.f2391b, this.f2392c, xVar.f2392c);
        this.f2392c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public void addInt(int i10) {
        a();
        int i11 = this.f2392c;
        int[] iArr = this.f2391b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f2391b = iArr2;
        }
        int[] iArr3 = this.f2391b;
        int i12 = this.f2392c;
        this.f2392c = i12 + 1;
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

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        addInt(num.intValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return super.equals(obj);
        }
        x xVar = (x) obj;
        if (this.f2392c != xVar.f2392c) {
            return false;
        }
        int[] iArr = xVar.f2391b;
        for (int i10 = 0; i10 < this.f2392c; i10++) {
            if (this.f2391b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Integer get(int i10) {
        return Integer.valueOf(getInt(i10));
    }

    public int getInt(int i10) {
        f(i10);
        return this.f2391b[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f2392c; i11++) {
            i10 = (i10 * 31) + this.f2391b[i11];
        }
        return i10;
    }

    @Override // androidx.datastore.preferences.protobuf.y.i
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public y.g mutableCopyWithCapacity(int i10) {
        if (i10 >= this.f2392c) {
            return new x(Arrays.copyOf(this.f2391b, i10), this.f2392c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f2391b[i10] == iIntValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i10) {
        a();
        f(i10);
        int[] iArr = this.f2391b;
        int i11 = iArr[i10];
        int i12 = this.f2392c;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f2392c--;
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
        int[] iArr = this.f2391b;
        System.arraycopy(iArr, i11, iArr, i10, this.f2392c - i11);
        this.f2392c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    public int setInt(int i10, int i11) {
        a();
        f(i10);
        int[] iArr = this.f2391b;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f2392c;
    }

    private x(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f2391b = iArr;
        this.f2392c = i10;
    }
}
