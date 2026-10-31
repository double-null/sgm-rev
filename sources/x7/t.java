package x7;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: LongArrayQueue.java */
/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f28181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long[] f28184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f28185e;

    public t() {
        this(16);
    }

    private void c() {
        long[] jArr = this.f28184d;
        int length = jArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        long[] jArr2 = new long[length];
        int length2 = jArr.length;
        int i10 = this.f28181a;
        int i11 = length2 - i10;
        System.arraycopy(jArr, i10, jArr2, 0, i11);
        System.arraycopy(this.f28184d, 0, jArr2, i11, i10);
        this.f28181a = 0;
        this.f28182b = this.f28183c - 1;
        this.f28184d = jArr2;
        this.f28185e = jArr2.length - 1;
    }

    public void a(long j10) {
        if (this.f28183c == this.f28184d.length) {
            c();
        }
        int i10 = (this.f28182b + 1) & this.f28185e;
        this.f28182b = i10;
        this.f28184d[i10] = j10;
        this.f28183c++;
    }

    public void b() {
        this.f28181a = 0;
        this.f28182b = -1;
        this.f28183c = 0;
    }

    public long d() {
        if (this.f28183c != 0) {
            return this.f28184d[this.f28181a];
        }
        throw new NoSuchElementException();
    }

    public boolean e() {
        return this.f28183c == 0;
    }

    public long f() {
        int i10 = this.f28183c;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f28184d;
        int i11 = this.f28181a;
        long j10 = jArr[i11];
        this.f28181a = this.f28185e & (i11 + 1);
        this.f28183c = i10 - 1;
        return j10;
    }

    public t(int i10) {
        a.a(i10 >= 0 && i10 <= 1073741824);
        i10 = i10 == 0 ? 1 : i10;
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.f28181a = 0;
        this.f28182b = -1;
        this.f28183c = 0;
        long[] jArr = new long[i10];
        this.f28184d = jArr;
        this.f28185e = jArr.length - 1;
    }
}
