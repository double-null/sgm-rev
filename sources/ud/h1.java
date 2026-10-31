package ud;

/* JADX INFO: compiled from: CancellableContinuation.kt */
/* JADX INFO: loaded from: classes5.dex */
final class h1 implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g1 f26764a;

    public h1(g1 g1Var) {
        this.f26764a = g1Var;
    }

    @Override // ud.m
    public void b(Throwable th) {
        this.f26764a.e();
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f26764a + ']';
    }
}
