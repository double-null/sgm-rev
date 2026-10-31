package com.explorestack.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: FloatArrayList.java */
/* JADX INFO: loaded from: classes.dex */
final class g0 extends c<Float> implements l0.f, RandomAccess, t1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final g0 f10454d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f10455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f10456c;

    static {
        g0 g0Var = new g0(new float[0], 0);
        f10454d = g0Var;
        g0Var.makeImmutable();
    }

    g0() {
        this(new float[10], 0);
    }

    private void e(int i10, float f10) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f10456c)) {
            throw new IndexOutOfBoundsException(i(i10));
        }
        float[] fArr = this.f10455b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f10455b, i10, fArr2, i10 + 1, this.f10456c - i10);
            this.f10455b = fArr2;
        }
        this.f10455b[i10] = f10;
        this.f10456c++;
        ((AbstractList) this).modCount++;
    }

    public static g0 f() {
        return f10454d;
    }

    private void g(int i10) {
        if (i10 < 0 || i10 >= this.f10456c) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    private String i(int i10) {
        return "Index:" + i10 + ", Size:" + this.f10456c;
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        a();
        l0.a(collection);
        if (!(collection instanceof g0)) {
            return super.addAll(collection);
        }
        g0 g0Var = (g0) collection;
        int i10 = g0Var.f10456c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f10456c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f10455b;
        if (i12 > fArr.length) {
            this.f10455b = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(g0Var.f10455b, 0, this.f10455b, this.f10456c, g0Var.f10456c);
        this.f10456c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public void addFloat(float f10) {
        a();
        int i10 = this.f10456c;
        float[] fArr = this.f10455b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f10455b = fArr2;
        }
        float[] fArr3 = this.f10455b;
        int i11 = this.f10456c;
        this.f10456c = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Float f10) {
        e(i10, f10.floatValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean add(Float f10) {
        addFloat(f10.floatValue());
        return true;
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return super.equals(obj);
        }
        g0 g0Var = (g0) obj;
        if (this.f10456c != g0Var.f10456c) {
            return false;
        }
        float[] fArr = g0Var.f10455b;
        for (int i10 = 0; i10 < this.f10456c; i10++) {
            if (Float.floatToIntBits(this.f10455b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public float getFloat(int i10) {
        g(i10);
        return this.f10455b[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Float get(int i10) {
        return Float.valueOf(getFloat(i10));
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f10456c; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f10455b[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f10455b[i10] == fFloatValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Float remove(int i10) {
        a();
        g(i10);
        float[] fArr = this.f10455b;
        float f10 = fArr[i10];
        int i11 = this.f10456c;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f10456c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Float set(int i10, Float f10) {
        return Float.valueOf(setFloat(i10, f10.floatValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f10455b;
        System.arraycopy(fArr, i11, fArr, i10, this.f10456c - i11);
        this.f10456c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    public float setFloat(int i10, float f10) {
        a();
        g(i10);
        float[] fArr = this.f10455b;
        float f11 = fArr[i10];
        fArr[i10] = f10;
        return f11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f10456c;
    }

    private g0(float[] fArr, int i10) {
        this.f10455b = fArr;
        this.f10456c = i10;
    }

    @Override // com.explorestack.protobuf.l0.j, com.explorestack.protobuf.l0.f
    /* JADX INFO: renamed from: mutableCopyWithCapacity, reason: merged with bridge method [inline-methods] */
    public l0.j<Float> mutableCopyWithCapacity2(int i10) {
        if (i10 >= this.f10456c) {
            return new g0(Arrays.copyOf(this.f10455b, i10), this.f10456c);
        }
        throw new IllegalArgumentException();
    }
}
