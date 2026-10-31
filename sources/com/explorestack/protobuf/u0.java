package com.explorestack.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: LongArrayList.java */
/* JADX INFO: loaded from: classes.dex */
final class u0 extends c<Long> implements l0.i, RandomAccess, t1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final u0 f10808d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f10809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f10810c;

    static {
        u0 u0Var = new u0(new long[0], 0);
        f10808d = u0Var;
        u0Var.makeImmutable();
    }

    u0() {
        this(new long[10], 0);
    }

    private void e(int i10, long j10) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f10810c)) {
            throw new IndexOutOfBoundsException(i(i10));
        }
        long[] jArr = this.f10809b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f10809b, i10, jArr2, i10 + 1, this.f10810c - i10);
            this.f10809b = jArr2;
        }
        this.f10809b[i10] = j10;
        this.f10810c++;
        ((AbstractList) this).modCount++;
    }

    public static u0 f() {
        return f10808d;
    }

    private void g(int i10) {
        if (i10 < 0 || i10 >= this.f10810c) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    private String i(int i10) {
        return "Index:" + i10 + ", Size:" + this.f10810c;
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        a();
        l0.a(collection);
        if (!(collection instanceof u0)) {
            return super.addAll(collection);
        }
        u0 u0Var = (u0) collection;
        int i10 = u0Var.f10810c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f10810c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f10809b;
        if (i12 > jArr.length) {
            this.f10809b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(u0Var.f10809b, 0, this.f10809b, this.f10810c, u0Var.f10810c);
        this.f10810c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public void addLong(long j10) {
        a();
        int i10 = this.f10810c;
        long[] jArr = this.f10809b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f10809b = jArr2;
        }
        long[] jArr3 = this.f10809b;
        int i11 = this.f10810c;
        this.f10810c = i11 + 1;
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

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean add(Long l10) {
        addLong(l10.longValue());
        return true;
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return super.equals(obj);
        }
        u0 u0Var = (u0) obj;
        if (this.f10810c != u0Var.f10810c) {
            return false;
        }
        long[] jArr = u0Var.f10809b;
        for (int i10 = 0; i10 < this.f10810c; i10++) {
            if (this.f10809b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public long getLong(int i10) {
        g(i10);
        return this.f10809b[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Long get(int i10) {
        return Long.valueOf(getLong(i10));
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f10810c; i11++) {
            i10 = (i10 * 31) + l0.i(this.f10809b[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f10809b[i10] == jLongValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Long remove(int i10) {
        a();
        g(i10);
        long[] jArr = this.f10809b;
        long j10 = jArr[i10];
        int i11 = this.f10810c;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f10810c--;
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
        long[] jArr = this.f10809b;
        System.arraycopy(jArr, i11, jArr, i10, this.f10810c - i11);
        this.f10810c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    public long setLong(int i10, long j10) {
        a();
        g(i10);
        long[] jArr = this.f10809b;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f10810c;
    }

    private u0(long[] jArr, int i10) {
        this.f10809b = jArr;
        this.f10810c = i10;
    }

    @Override // com.explorestack.protobuf.l0.j, com.explorestack.protobuf.l0.f
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public l0.j<Long> mutableCopyWithCapacity2(int i10) {
        if (i10 >= this.f10810c) {
            return new u0(Arrays.copyOf(this.f10809b, i10), this.f10810c);
        }
        throw new IllegalArgumentException();
    }
}
