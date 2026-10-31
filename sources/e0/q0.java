package e0;

/* JADX INFO: compiled from: DataStoreImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements zc.j.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f13797c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f13798d = "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q0 f13799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m<?> f13800b;

    /* JADX INFO: compiled from: DataStoreImpl.kt */
    public static final class a {

        /* JADX INFO: renamed from: e0.q0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DataStoreImpl.kt */
        public static final class C0191a implements zc.j.c<q0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0191a f13801a = new C0191a();

            private C0191a() {
            }
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    public q0(q0 q0Var, m<?> instance) {
        kotlin.jvm.internal.t.f(instance, "instance");
        this.f13799a = q0Var;
        this.f13800b = instance;
    }

    @Override // zc.j
    public <R> R U(R r10, id.p<? super R, ? super zc.j.b, ? extends R> pVar) {
        return (R) zc.j.b.a.a(this, r10, pVar);
    }

    public final void a(k<?> candidate) {
        kotlin.jvm.internal.t.f(candidate, "candidate");
        if (this.f13800b == candidate) {
            throw new IllegalStateException(f13798d.toString());
        }
        q0 q0Var = this.f13799a;
        if (q0Var != null) {
            q0Var.a(candidate);
        }
    }

    @Override // zc.j
    public zc.j a0(zc.j.c<?> cVar) {
        return zc.j.b.a.c(this, cVar);
    }

    @Override // zc.j.b, zc.j
    public <E extends zc.j.b> E e(zc.j.c<E> cVar) {
        return (E) zc.j.b.a.b(this, cVar);
    }

    @Override // zc.j.b
    public zc.j.c<?> getKey() {
        return a.C0191a.f13801a;
    }

    @Override // zc.j
    public zc.j z(zc.j jVar) {
        return zc.j.b.a.d(this, jVar);
    }
}
