package y7;

/* JADX INFO: compiled from: ParsableNalUnitBitArray.java */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f28783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f28786d;

    public h(byte[] bArr, int i10, int i11) {
        j(bArr, i10, i11);
    }

    private void a() {
        int i10;
        int i11 = this.f28785c;
        x7.a.g(i11 >= 0 && (i11 < (i10 = this.f28784b) || (i11 == i10 && this.f28786d == 0)));
    }

    private int g() {
        int i10 = 0;
        while (!e()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? f(i10) : 0);
    }

    private boolean k(int i10) {
        if (2 <= i10 && i10 < this.f28784b) {
            byte[] bArr = this.f28783a;
            if (bArr[i10] == 3 && bArr[i10 - 2] == 0 && bArr[i10 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public void b() {
        int i10 = this.f28786d;
        if (i10 > 0) {
            m(8 - i10);
        }
    }

    public boolean c(int i10) {
        int i11 = this.f28785c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f28786d + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f28784b) {
                break;
            }
            if (k(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f28784b;
        if (i13 >= i15) {
            return i13 == i15 && i14 == 0;
        }
        return true;
    }

    public boolean d() {
        int i10 = this.f28785c;
        int i11 = this.f28786d;
        int i12 = 0;
        while (this.f28785c < this.f28784b && !e()) {
            i12++;
        }
        boolean z10 = this.f28785c == this.f28784b;
        this.f28785c = i10;
        this.f28786d = i11;
        return !z10 && c((i12 * 2) + 1);
    }

    public boolean e() {
        boolean z10 = (this.f28783a[this.f28785c] & (128 >> this.f28786d)) != 0;
        l();
        return z10;
    }

    public int f(int i10) {
        int i11;
        this.f28786d += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f28786d;
            int i13 = 2;
            if (i11 <= 8) {
                break;
            }
            int i14 = i11 - 8;
            this.f28786d = i14;
            byte[] bArr = this.f28783a;
            int i15 = this.f28785c;
            i12 |= (bArr[i15] & 255) << i14;
            if (!k(i15 + 1)) {
                i13 = 1;
            }
            this.f28785c = i15 + i13;
        }
        byte[] bArr2 = this.f28783a;
        int i16 = this.f28785c;
        int i17 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i16] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f28786d = 0;
            this.f28785c = i16 + (k(i16 + 1) ? 2 : 1);
        }
        a();
        return i17;
    }

    public int h() {
        int iG = g();
        return (iG % 2 == 0 ? -1 : 1) * ((iG + 1) / 2);
    }

    public int i() {
        return g();
    }

    public void j(byte[] bArr, int i10, int i11) {
        this.f28783a = bArr;
        this.f28785c = i10;
        this.f28784b = i11;
        this.f28786d = 0;
        a();
    }

    public void l() {
        int i10 = this.f28786d + 1;
        this.f28786d = i10;
        if (i10 == 8) {
            this.f28786d = 0;
            int i11 = this.f28785c;
            this.f28785c = i11 + (k(i11 + 1) ? 2 : 1);
        }
        a();
    }

    public void m(int i10) {
        int i11 = this.f28785c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f28785c = i13;
        int i14 = this.f28786d + (i10 - (i12 * 8));
        this.f28786d = i14;
        if (i14 > 7) {
            this.f28785c = i13 + 1;
            this.f28786d = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.f28785c) {
                a();
                return;
            } else if (k(i11)) {
                this.f28785c++;
                i11 += 2;
            }
        }
    }
}
