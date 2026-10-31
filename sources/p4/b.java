package p4;

import java.util.Arrays;

/* JADX INFO: compiled from: BitMatrix.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f23435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f23436d;

    public b(int i10) {
        this(i10, i10);
    }

    private String a(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(this.f23434b * (this.f23433a + 1));
        for (int i10 = 0; i10 < this.f23434b; i10++) {
            for (int i11 = 0; i11 < this.f23433a; i11++) {
                sb2.append(g(i11, i10) ? str : str2);
            }
            sb2.append(str3);
        }
        return sb2.toString();
    }

    public void b() {
        int length = this.f23436d.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f23436d[i10] = 0;
        }
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public b clone() {
        return new b(this.f23433a, this.f23434b, this.f23435c, (int[]) this.f23436d.clone());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f23433a == bVar.f23433a && this.f23434b == bVar.f23434b && this.f23435c == bVar.f23435c && Arrays.equals(this.f23436d, bVar.f23436d);
    }

    public boolean g(int i10, int i11) {
        return ((this.f23436d[(i11 * this.f23435c) + (i10 / 32)] >>> (i10 & 31)) & 1) != 0;
    }

    public int h() {
        return this.f23434b;
    }

    public int hashCode() {
        int i10 = this.f23433a;
        return (((((((i10 * 31) + i10) * 31) + this.f23434b) * 31) + this.f23435c) * 31) + Arrays.hashCode(this.f23436d);
    }

    public int i() {
        return this.f23433a;
    }

    public void j(int i10, int i11) {
        int i12 = (i11 * this.f23435c) + (i10 / 32);
        int[] iArr = this.f23436d;
        iArr[i12] = (1 << (i10 & 31)) | iArr[i12];
    }

    public void k(int i10, int i11, int i12, int i13) {
        if (i11 < 0 || i10 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i13 <= 0 || i12 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i14 = i12 + i10;
        int i15 = i13 + i11;
        if (i15 > this.f23434b || i14 > this.f23433a) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i11 < i15) {
            int i16 = this.f23435c * i11;
            for (int i17 = i10; i17 < i14; i17++) {
                int[] iArr = this.f23436d;
                int i18 = (i17 / 32) + i16;
                iArr[i18] = iArr[i18] | (1 << (i17 & 31));
            }
            i11++;
        }
    }

    public String l(String str, String str2) {
        return a(str, str2, "\n");
    }

    public String toString() {
        return l("X ", "  ");
    }

    public b(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f23433a = i10;
        this.f23434b = i11;
        int i12 = (i10 + 31) / 32;
        this.f23435c = i12;
        this.f23436d = new int[i12 * i11];
    }

    private b(int i10, int i11, int i12, int[] iArr) {
        this.f23433a = i10;
        this.f23434b = i11;
        this.f23435c = i12;
        this.f23436d = iArr;
    }
}
