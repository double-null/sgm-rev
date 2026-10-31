package je;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes5.dex */
final class s<T> implements r2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final id.l<pd.c<?>, fe.d<T>> f20999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u<m<T>> f21000b;

    /* JADX INFO: compiled from: Caching.kt */
    public static final class a implements id.a<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ pd.c f21002b;

        public a(pd.c cVar) {
            this.f21002b = cVar;
        }

        @Override // id.a
        public final T invoke() {
            return (T) new m(s.this.b().invoke(this.f21002b));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s(id.l<? super pd.c<?>, ? extends fe.d<T>> compute) {
        kotlin.jvm.internal.t.f(compute, "compute");
        this.f20999a = compute;
        this.f21000b = new u<>();
    }

    @Override // je.r2
    public fe.d<T> a(pd.c<Object> key) {
        kotlin.jvm.internal.t.f(key, "key");
        m<T> mVar = this.f21000b.get(hd.a.a(key));
        kotlin.jvm.internal.t.e(mVar, "get(...)");
        k1 k1Var = (k1) mVar;
        T t10 = k1Var.f20954a.get();
        if (t10 == null) {
            t10 = (T) k1Var.a(new a(key));
        }
        return t10.f20962a;
    }

    public final id.l<pd.c<?>, fe.d<T>> b() {
        return this.f20999a;
    }
}
