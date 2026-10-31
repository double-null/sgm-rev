package n9;

import java.io.IOException;
import v8.q;

/* JADX INFO: compiled from: VarintReader.java */
/* JADX INFO: loaded from: classes4.dex */
final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long[] f22917d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f22918a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22920c;

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j10 = ((long) bArr[0]) & 255;
        if (z10) {
            j10 &= ~f22917d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (((long) bArr[i11]) & 255);
        }
        return j10;
    }

    public static int c(int i10) {
        int i11 = 0;
        while (true) {
            long[] jArr = f22917d;
            if (i11 >= jArr.length) {
                return -1;
            }
            if ((jArr[i11] & ((long) i10)) != 0) {
                return i11 + 1;
            }
            i11++;
        }
    }

    public int b() {
        return this.f22920c;
    }

    public long d(q qVar, boolean z10, boolean z11, int i10) throws IOException {
        if (this.f22919b == 0) {
            if (!qVar.e(this.f22918a, 0, 1, z10)) {
                return -1L;
            }
            int iC = c(this.f22918a[0] & 255);
            this.f22920c = iC;
            if (iC == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f22919b = 1;
        }
        int i11 = this.f22920c;
        if (i11 > i10) {
            this.f22919b = 0;
            return -2L;
        }
        if (i11 != 1) {
            qVar.readFully(this.f22918a, 1, i11 - 1);
        }
        this.f22919b = 0;
        return a(this.f22918a, this.f22920c, z11);
    }

    public void e() {
        this.f22919b = 0;
        this.f22920c = 0;
    }
}
