package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: ProtobufArrayList.java */
/* JADX INFO: loaded from: classes.dex */
final class b1<E> extends c<E> implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final b1<Object> f2110d = new b1<>(new Object[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private E[] f2111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2112c;

    private b1(E[] eArr, int i10, boolean z10) {
        super(z10);
        this.f2111b = eArr;
        this.f2112c = i10;
    }

    private static <E> E[] c(int i10) {
        return (E[]) new Object[i10];
    }

    public static <E> b1<E> d() {
        return (b1<E>) f2110d;
    }

    private void e(int i10) {
        if (i10 < 0 || i10 >= this.f2112c) {
            throw new IndexOutOfBoundsException(f(i10));
        }
    }

    private String f(int i10) {
        return "Index:" + i10 + ", Size:" + this.f2112c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        a();
        int i10 = this.f2112c;
        E[] eArr = this.f2111b;
        if (i10 == eArr.length) {
            this.f2111b = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f2111b;
        int i11 = this.f2112c;
        this.f2112c = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.y.i
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public b1<E> mutableCopyWithCapacity(int i10) {
        if (i10 >= this.f2112c) {
            return new b1<>(Arrays.copyOf(this.f2111b, i10), this.f2112c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        e(i10);
        return this.f2111b[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public E remove(int i10) {
        a();
        e(i10);
        E[] eArr = this.f2111b;
        E e10 = eArr[i10];
        int i11 = this.f2112c;
        if (i10 < i11 - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.f2112c--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        a();
        e(i10);
        E[] eArr = this.f2111b;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f2112c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        int i11;
        a();
        if (i10 >= 0 && i10 <= (i11 = this.f2112c)) {
            E[] eArr = this.f2111b;
            if (i11 < eArr.length) {
                System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
            } else {
                E[] eArr2 = (E[]) c(((i11 * 3) / 2) + 1);
                System.arraycopy(this.f2111b, 0, eArr2, 0, i10);
                System.arraycopy(this.f2111b, i10, eArr2, i10 + 1, this.f2112c - i10);
                this.f2111b = eArr2;
            }
            this.f2111b[i10] = e10;
            this.f2112c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(f(i10));
    }
}
