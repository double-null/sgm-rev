package x7;

import java.util.Arrays;

/* JADX INFO: compiled from: LongArray.java */
/* JADX INFO: loaded from: classes4.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f28179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f28180b;

    public s() {
        this(32);
    }

    public void a(long j10) {
        int i10 = this.f28179a;
        long[] jArr = this.f28180b;
        if (i10 == jArr.length) {
            this.f28180b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f28180b;
        int i11 = this.f28179a;
        this.f28179a = i11 + 1;
        jArr2[i11] = j10;
    }

    public void b(long[] jArr) {
        int length = this.f28179a + jArr.length;
        long[] jArr2 = this.f28180b;
        if (length > jArr2.length) {
            this.f28180b = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.f28180b, this.f28179a, jArr.length);
        this.f28179a = length;
    }

    public long c(int i10) {
        if (i10 >= 0 && i10 < this.f28179a) {
            return this.f28180b[i10];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i10 + ", size is " + this.f28179a);
    }

    public int d() {
        return this.f28179a;
    }

    public s(int i10) {
        this.f28180b = new long[i10];
    }
}
