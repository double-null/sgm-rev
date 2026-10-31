package v8;

import java.util.Arrays;

/* JADX INFO: compiled from: ChunkIndex.java */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f27325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f27326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f27327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f27328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f27329f;

    public g(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f27325b = iArr;
        this.f27326c = jArr;
        this.f27327d = jArr2;
        this.f27328e = jArr3;
        int length = iArr.length;
        this.f27324a = length;
        if (length > 0) {
            this.f27329f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f27329f = 0L;
        }
    }

    public int a(long j10) {
        return x7.l0.h(this.f27328e, j10, true, true);
    }

    @Override // v8.j0
    public j0.a d(long j10) {
        int iA = a(j10);
        k0 k0Var = new k0(this.f27328e[iA], this.f27326c[iA]);
        if (k0Var.f27350a >= j10 || iA == this.f27324a - 1) {
            return new j0.a(k0Var);
        }
        int i10 = iA + 1;
        return new j0.a(k0Var, new k0(this.f27328e[i10], this.f27326c[i10]));
    }

    @Override // v8.j0
    public boolean h() {
        return true;
    }

    @Override // v8.j0
    public long k() {
        return this.f27329f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f27324a + ", sizes=" + Arrays.toString(this.f27325b) + ", offsets=" + Arrays.toString(this.f27326c) + ", timeUs=" + Arrays.toString(this.f27328e) + ", durationsUs=" + Arrays.toString(this.f27327d) + ")";
    }
}
