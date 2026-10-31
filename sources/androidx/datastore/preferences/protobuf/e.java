package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: BooleanArrayList.java */
/* JADX INFO: loaded from: classes.dex */
final class e extends c<Boolean> implements y.a, RandomAccess, y0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final e f2121d = new e(new boolean[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean[] f2122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2123c;

    e() {
        this(new boolean[10], 0, true);
    }

    private void e(int i10, boolean z10) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f2123c)) {
            throw new IndexOutOfBoundsException(h(i10));
        }
        boolean[] zArr = this.f2122b;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f2122b, i10, zArr2, i10 + 1, this.f2123c - i10);
            this.f2122b = zArr2;
        }
        this.f2122b[i10] = z10;
        this.f2123c++;
        ((AbstractList) this).modCount++;
    }

    private void f(int i10) {
        if (i10 < 0 || i10 >= this.f2123c) {
            throw new IndexOutOfBoundsException(h(i10));
        }
    }

    private String h(int i10) {
        return "Index:" + i10 + ", Size:" + this.f2123c;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        a();
        y.a(collection);
        if (!(collection instanceof e)) {
            return super.addAll(collection);
        }
        e eVar = (e) collection;
        int i10 = eVar.f2123c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f2123c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f2122b;
        if (i12 > zArr.length) {
            this.f2122b = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(eVar.f2122b, 0, this.f2122b, this.f2123c, eVar.f2123c);
        this.f2123c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public void addBoolean(boolean z10) {
        a();
        int i10 = this.f2123c;
        boolean[] zArr = this.f2122b;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f2122b = zArr2;
        }
        boolean[] zArr3 = this.f2122b;
        int i11 = this.f2123c;
        this.f2123c = i11 + 1;
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

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean add(Boolean bool) {
        addBoolean(bool.booleanValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return super.equals(obj);
        }
        e eVar = (e) obj;
        if (this.f2123c != eVar.f2123c) {
            return false;
        }
        boolean[] zArr = eVar.f2122b;
        for (int i10 = 0; i10 < this.f2123c; i10++) {
            if (this.f2122b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Boolean get(int i10) {
        return Boolean.valueOf(getBoolean(i10));
    }

    public boolean getBoolean(int i10) {
        f(i10);
        return this.f2122b[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iC = 1;
        for (int i10 = 0; i10 < this.f2123c; i10++) {
            iC = (iC * 31) + y.c(this.f2122b[i10]);
        }
        return iC;
    }

    @Override // androidx.datastore.preferences.protobuf.y.i
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public y.a mutableCopyWithCapacity(int i10) {
        if (i10 >= this.f2123c) {
            return new e(Arrays.copyOf(this.f2122b, i10), this.f2123c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f2122b[i10] == zBooleanValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int i10) {
        a();
        f(i10);
        boolean[] zArr = this.f2122b;
        boolean z10 = zArr[i10];
        int i11 = this.f2123c;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f2123c--;
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
        boolean[] zArr = this.f2122b;
        System.arraycopy(zArr, i11, zArr, i10, this.f2123c - i11);
        this.f2123c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    public boolean setBoolean(int i10, boolean z10) {
        a();
        f(i10);
        boolean[] zArr = this.f2122b;
        boolean z11 = zArr[i10];
        zArr[i10] = z10;
        return z11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f2123c;
    }

    private e(boolean[] zArr, int i10, boolean z10) {
        super(z10);
        this.f2122b = zArr;
        this.f2123c = i10;
    }
}
