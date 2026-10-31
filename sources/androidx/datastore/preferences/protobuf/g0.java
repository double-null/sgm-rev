package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: LongArrayList.java */
/* JADX INFO: loaded from: classes.dex */
final class g0 extends c<Long> implements y.h, RandomAccess, y0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final g0 f2138d = new g0(new long[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f2139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2140c;

    g0() {
        this(new long[10], 0, true);
    }

    private void e(int i10, long j10) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f2140c)) {
            throw new IndexOutOfBoundsException(h(i10));
        }
        long[] jArr = this.f2139b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f2139b, i10, jArr2, i10 + 1, this.f2140c - i10);
            this.f2139b = jArr2;
        }
        this.f2139b[i10] = j10;
        this.f2140c++;
        ((AbstractList) this).modCount++;
    }

    private void f(int i10) {
        if (i10 < 0 || i10 >= this.f2140c) {
            throw new IndexOutOfBoundsException(h(i10));
        }
    }

    private String h(int i10) {
        return "Index:" + i10 + ", Size:" + this.f2140c;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        a();
        y.a(collection);
        if (!(collection instanceof g0)) {
            return super.addAll(collection);
        }
        g0 g0Var = (g0) collection;
        int i10 = g0Var.f2140c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f2140c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f2139b;
        if (i12 > jArr.length) {
            this.f2139b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(g0Var.f2139b, 0, this.f2139b, this.f2140c, g0Var.f2140c);
        this.f2140c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public void addLong(long j10) {
        a();
        int i10 = this.f2140c;
        long[] jArr = this.f2139b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f2139b = jArr2;
        }
        long[] jArr3 = this.f2139b;
        int i11 = this.f2140c;
        this.f2140c = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Long l10) {
        e(i10, l10.longValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean add(Long l10) {
        addLong(l10.longValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return super.equals(obj);
        }
        g0 g0Var = (g0) obj;
        if (this.f2140c != g0Var.f2140c) {
            return false;
        }
        long[] jArr = g0Var.f2139b;
        for (int i10 = 0; i10 < this.f2140c; i10++) {
            if (this.f2139b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Long get(int i10) {
        return Long.valueOf(getLong(i10));
    }

    public long getLong(int i10) {
        f(i10);
        return this.f2139b[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iF = 1;
        for (int i10 = 0; i10 < this.f2140c; i10++) {
            iF = (iF * 31) + y.f(this.f2139b[i10]);
        }
        return iF;
    }

    @Override // androidx.datastore.preferences.protobuf.y.i
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public y.h mutableCopyWithCapacity(int i10) {
        if (i10 >= this.f2140c) {
            return new g0(Arrays.copyOf(this.f2139b, i10), this.f2140c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f2139b[i10] == jLongValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Long remove(int i10) {
        a();
        f(i10);
        long[] jArr = this.f2139b;
        long j10 = jArr[i10];
        int i11 = this.f2140c;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f2140c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Long set(int i10, Long l10) {
        return Long.valueOf(setLong(i10, l10.longValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f2139b;
        System.arraycopy(jArr, i11, jArr, i10, this.f2140c - i11);
        this.f2140c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    public long setLong(int i10, long j10) {
        a();
        f(i10);
        long[] jArr = this.f2139b;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f2140c;
    }

    private g0(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f2139b = jArr;
        this.f2140c = i10;
    }
}
