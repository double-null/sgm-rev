package ud;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes5.dex */
final class q2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k0 f26811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n<wc.g0> f26812b;

    /* JADX WARN: Multi-variable type inference failed */
    public q2(k0 k0Var, n<? super wc.g0> nVar) {
        this.f26811a = k0Var;
        this.f26812b = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f26812b.D(this.f26811a, wc.g0.f27756a);
    }
}
