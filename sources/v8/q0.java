package v8;

/* JADX INFO: compiled from: VorbisBitArray.java */
/* JADX INFO: loaded from: classes4.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f27414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f27417d;

    public q0(byte[] bArr) {
        this.f27414a = bArr;
        this.f27415b = bArr.length;
    }

    private void a() {
        int i10;
        int i11 = this.f27416c;
        x7.a.g(i11 >= 0 && (i11 < (i10 = this.f27415b) || (i11 == i10 && this.f27417d == 0)));
    }

    public int b() {
        return (this.f27416c * 8) + this.f27417d;
    }

    public boolean c() {
        boolean z10 = (((this.f27414a[this.f27416c] & 255) >> this.f27417d) & 1) == 1;
        e(1);
        return z10;
    }

    public int d(int i10) {
        int i11 = this.f27416c;
        int iMin = Math.min(i10, 8 - this.f27417d);
        int i12 = i11 + 1;
        int i13 = ((this.f27414a[i11] & 255) >> this.f27417d) & (255 >> (8 - iMin));
        while (iMin < i10) {
            i13 |= (this.f27414a[i12] & 255) << iMin;
            iMin += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        e(i10);
        return i14;
    }

    public void e(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f27416c + i11;
        this.f27416c = i12;
        int i13 = this.f27417d + (i10 - (i11 * 8));
        this.f27417d = i13;
        if (i13 > 7) {
            this.f27416c = i12 + 1;
            this.f27417d = i13 - 8;
        }
        a();
    }
}
