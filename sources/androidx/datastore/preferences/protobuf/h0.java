package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: ManifestSchemaFactory.java */
/* JADX INFO: loaded from: classes.dex */
final class h0 implements f1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o0 f2167b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o0 f2168a;

    /* JADX INFO: compiled from: ManifestSchemaFactory.java */
    class a implements o0 {
        a() {
        }

        @Override // androidx.datastore.preferences.protobuf.o0
        public boolean isSupported(Class<?> cls) {
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.o0
        public n0 messageInfoFor(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    /* JADX INFO: compiled from: ManifestSchemaFactory.java */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2169a;

        static {
            int[] iArr = new int[z0.values().length];
            f2169a = iArr;
            try {
                iArr[z0.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: compiled from: ManifestSchemaFactory.java */
    private static class c implements o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private o0[] f2170a;

        c(o0... o0VarArr) {
            this.f2170a = o0VarArr;
        }

        @Override // androidx.datastore.preferences.protobuf.o0
        public boolean isSupported(Class<?> cls) {
            for (o0 o0Var : this.f2170a) {
                if (o0Var.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.o0
        public n0 messageInfoFor(Class<?> cls) {
            for (o0 o0Var : this.f2170a) {
                if (o0Var.isSupported(cls)) {
                    return o0Var.messageInfoFor(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }
    }

    public h0() {
        this(b());
    }

    private static boolean a(n0 n0Var) {
        return b.f2169a[n0Var.getSyntax().ordinal()] != 1;
    }

    private static o0 b() {
        return new c(v.a(), c());
    }

    private static o0 c() {
        if (a1.f2102d) {
            return f2167b;
        }
        try {
            return (o0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f2167b;
        }
    }

    private static <T> e1<T> d(Class<T> cls, n0 n0Var) {
        if (e(cls)) {
            return s0.H(cls, n0Var, w0.b(), f0.b(), g1.L(), a(n0Var) ? q.b() : null, m0.b());
        }
        return s0.H(cls, n0Var, w0.a(), f0.a(), g1.K(), a(n0Var) ? q.a() : null, m0.a());
    }

    private static boolean e(Class<?> cls) {
        return a1.f2102d || w.class.isAssignableFrom(cls);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public <T> e1<T> createSchema(Class<T> cls) {
        g1.H(cls);
        n0 n0VarMessageInfoFor = this.f2168a.messageInfoFor(cls);
        if (n0VarMessageInfoFor.isMessageSetWireFormat()) {
            return e(cls) ? t0.e(g1.L(), q.b(), n0VarMessageInfoFor.getDefaultInstance()) : t0.e(g1.K(), q.a(), n0VarMessageInfoFor.getDefaultInstance());
        }
        return d(cls, n0VarMessageInfoFor);
    }

    private h0(o0 o0Var) {
        this.f2168a = (o0) y.b(o0Var, "messageInfoFactory");
    }
}
