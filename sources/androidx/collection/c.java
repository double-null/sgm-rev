package androidx.collection;

/* JADX INFO: compiled from: CircularIntArray.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f1612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1615d;

    public c() {
        this(8);
    }

    private void c() {
        int[] iArr = this.f1612a;
        int length = iArr.length;
        int i10 = this.f1613b;
        int i11 = length - i10;
        int i12 = length << 1;
        if (i12 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i12];
        System.arraycopy(iArr, i10, iArr2, 0, i11);
        System.arraycopy(this.f1612a, 0, iArr2, i11, this.f1613b);
        this.f1612a = iArr2;
        this.f1613b = 0;
        this.f1614c = length;
        this.f1615d = i12 - 1;
    }

    public void a(int i10) {
        int[] iArr = this.f1612a;
        int i11 = this.f1614c;
        iArr[i11] = i10;
        int i12 = this.f1615d & (i11 + 1);
        this.f1614c = i12;
        if (i12 == this.f1613b) {
            c();
        }
    }

    public void b() {
        this.f1614c = this.f1613b;
    }

    public boolean d() {
        return this.f1613b == this.f1614c;
    }

    public int e() {
        int i10 = this.f1613b;
        if (i10 == this.f1614c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i11 = this.f1612a[i10];
        this.f1613b = (i10 + 1) & this.f1615d;
        return i11;
    }

    public c(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i10 > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.f1615d = i10 - 1;
        this.f1612a = new int[i10];
    }
}
