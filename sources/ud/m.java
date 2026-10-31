package ud;

/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface m extends n2 {

    /* JADX INFO: compiled from: CancellableContinuationImpl.kt */
    public static final class a implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final id.l<Throwable, wc.g0> f26791a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(id.l<? super Throwable, wc.g0> lVar) {
            this.f26791a = lVar;
        }

        @Override // ud.m
        public void b(Throwable th) {
            this.f26791a.invoke(th);
        }

        public String toString() {
            return "CancelHandler.UserSupplied[" + s0.a(this.f26791a) + '@' + s0.b(this) + ']';
        }
    }

    void b(Throwable th);
}
