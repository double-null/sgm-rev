package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: FloatArrayList.java */
/* JADX INFO: loaded from: classes.dex */
final class u extends c<Float> implements y.f, RandomAccess, y0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final u f2367d = new u(new float[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f2368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2369c;

    u() {
        this(new float[10], 0, true);
    }

    private void e(int i10, float f10) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f2369c)) {
            throw new IndexOutOfBoundsException(h(i10));
        }
        float[] fArr = this.f2368b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f2368b, i10, fArr2, i10 + 1, this.f2369c - i10);
            this.f2368b = fArr2;
        }
        this.f2368b[i10] = f10;
        this.f2369c++;
        ((AbstractList) this).modCount++;
    }

    private void f(int i10) {
        if (i10 < 0 || i10 >= this.f2369c) {
            throw new IndexOutOfBoundsException(h(i10));
        }
    }

    private String h(int i10) {
        return "Index:" + i10 + ", Size:" + this.f2369c;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        a();
        y.a(collection);
        if (!(collection instanceof u)) {
            return super.addAll(collection);
        }
        u uVar = (u) collection;
        int i10 = uVar.f2369c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f2369c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f2368b;
        if (i12 > fArr.length) {
            this.f2368b = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(uVar.f2368b, 0, this.f2368b, this.f2369c, uVar.f2369c);
        this.f2369c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public void addFloat(float f10) {
        a();
        int i10 = this.f2369c;
        float[] fArr = this.f2368b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f2368b = fArr2;
        }
        float[] fArr3 = this.f2368b;
        int i11 = this.f2369c;
        this.f2369c = i11 + 1;
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

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean add(Float f10) {
        addFloat(f10.floatValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return super.equals(obj);
        }
        u uVar = (u) obj;
        if (this.f2369c != uVar.f2369c) {
            return false;
        }
        float[] fArr = uVar.f2368b;
        for (int i10 = 0; i10 < this.f2369c; i10++) {
            if (Float.floatToIntBits(this.f2368b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Float get(int i10) {
        return Float.valueOf(getFloat(i10));
    }

    public float getFloat(int i10) {
        f(i10);
        return this.f2368b[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f2369c; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f2368b[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // androidx.datastore.preferences.protobuf.y.i
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public y.f mutableCopyWithCapacity(int i10) {
        if (i10 >= this.f2369c) {
            return new u(Arrays.copyOf(this.f2368b, i10), this.f2369c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f2368b[i10] == fFloatValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Float remove(int i10) {
        a();
        f(i10);
        float[] fArr = this.f2368b;
        float f10 = fArr[i10];
        int i11 = this.f2369c;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f2369c--;
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
        float[] fArr = this.f2368b;
        System.arraycopy(fArr, i11, fArr, i10, this.f2369c - i11);
        this.f2369c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    public float setFloat(int i10, float f10) {
        a();
        f(i10);
        float[] fArr = this.f2368b;
        float f11 = fArr[i10];
        fArr[i10] = f10;
        return f11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f2369c;
    }

    private u(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.f2368b = fArr;
        this.f2369c = i10;
    }
}
