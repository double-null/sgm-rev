package v8;

/* JADX INFO: compiled from: FlacSeekTableSeekMap.java */
/* JADX INFO: loaded from: classes4.dex */
public final class x implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f27438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f27439b;

    public x(y yVar, long j10) {
        this.f27438a = yVar;
        this.f27439b = j10;
    }

    private k0 a(long j10, long j11) {
        return new k0((j10 * 1000000) / ((long) this.f27438a.f27444e), this.f27439b + j11);
    }

    @Override // v8.j0
    public j0.a d(long j10) {
        x7.a.i(this.f27438a.f27450k);
        y yVar = this.f27438a;
        y.a aVar = yVar.f27450k;
        long[] jArr = aVar.f27452a;
        long[] jArr2 = aVar.f27453b;
        int iH = x7.l0.h(jArr, yVar.i(j10), true, false);
        k0 k0VarA = a(iH == -1 ? 0L : jArr[iH], iH != -1 ? jArr2[iH] : 0L);
        if (k0VarA.f27350a == j10 || iH == jArr.length - 1) {
            return new j0.a(k0VarA);
        }
        int i10 = iH + 1;
        return new j0.a(k0VarA, a(jArr[i10], jArr2[i10]));
    }

    @Override // v8.j0
    public boolean h() {
        return true;
    }

    @Override // v8.j0
    public long k() {
        return this.f27438a.f();
    }
}
