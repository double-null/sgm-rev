package p4;

import java.util.Arrays;

/* JADX INFO: compiled from: BitArray.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f23431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23432b;

    public a() {
        this.f23432b = 0;
        this.f23431a = new int[1];
    }

    private void h(int i10) {
        if (i10 > (this.f23431a.length << 5)) {
            int[] iArrL = l(i10);
            int[] iArr = this.f23431a;
            System.arraycopy(iArr, 0, iArrL, 0, iArr.length);
            this.f23431a = iArrL;
        }
    }

    private static int[] l(int i10) {
        return new int[(i10 + 31) / 32];
    }

    public void a(boolean z10) {
        h(this.f23432b + 1);
        if (z10) {
            int[] iArr = this.f23431a;
            int i10 = this.f23432b;
            int i11 = i10 / 32;
            iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
        }
        this.f23432b++;
    }

    public void b(a aVar) {
        int i10 = aVar.f23432b;
        h(this.f23432b + i10);
        for (int i11 = 0; i11 < i10; i11++) {
            a(aVar.i(i11));
        }
    }

    public void d(int i10, int i11) {
        if (i11 < 0 || i11 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        h(this.f23432b + i11);
        while (i11 > 0) {
            boolean z10 = true;
            if (((i10 >> (i11 - 1)) & 1) != 1) {
                z10 = false;
            }
            a(z10);
            i11--;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f23432b == aVar.f23432b && Arrays.equals(this.f23431a, aVar.f23431a);
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public a clone() {
        return new a((int[]) this.f23431a.clone(), this.f23432b);
    }

    public int hashCode() {
        return (this.f23432b * 31) + Arrays.hashCode(this.f23431a);
    }

    public boolean i(int i10) {
        return ((1 << (i10 & 31)) & this.f23431a[i10 / 32]) != 0;
    }

    public int j() {
        return this.f23432b;
    }

    public int k() {
        return (this.f23432b + 7) / 8;
    }

    public void m(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = 0;
            for (int i15 = 0; i15 < 8; i15++) {
                if (i(i10)) {
                    i14 |= 1 << (7 - i15);
                }
                i10++;
            }
            bArr[i11 + i13] = (byte) i14;
        }
    }

    public void n(a aVar) {
        if (this.f23432b != aVar.f23432b) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i10 = 0;
        while (true) {
            int[] iArr = this.f23431a;
            if (i10 >= iArr.length) {
                return;
            }
            iArr[i10] = iArr[i10] ^ aVar.f23431a[i10];
            i10++;
        }
    }

    public String toString() {
        int i10 = this.f23432b;
        StringBuilder sb2 = new StringBuilder(i10 + (i10 / 8) + 1);
        for (int i11 = 0; i11 < this.f23432b; i11++) {
            if ((i11 & 7) == 0) {
                sb2.append(' ');
            }
            sb2.append(i(i11) ? 'X' : '.');
        }
        return sb2.toString();
    }

    a(int[] iArr, int i10) {
        this.f23431a = iArr;
        this.f23432b = i10;
    }
}
