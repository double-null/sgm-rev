package com.explorestack.protobuf;

/* JADX INFO: compiled from: ManifestSchemaFactory.java */
/* JADX INFO: loaded from: classes.dex */
final class v0 implements c2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final f1 f10828b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f1 f10829a;

    /* JADX INFO: compiled from: ManifestSchemaFactory.java */
    static class a implements f1 {
        a() {
        }

        @Override // com.explorestack.protobuf.f1
        public boolean isSupported(Class<?> cls) {
            return false;
        }

        @Override // com.explorestack.protobuf.f1
        public e1 messageInfoFor(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    /* JADX INFO: compiled from: ManifestSchemaFactory.java */
    private static class b implements f1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private f1[] f10830a;

        b(f1... f1VarArr) {
            this.f10830a = f1VarArr;
        }

        @Override // com.explorestack.protobuf.f1
        public boolean isSupported(Class<?> cls) {
            for (f1 f1Var : this.f10830a) {
                if (f1Var.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.explorestack.protobuf.f1
        public e1 messageInfoFor(Class<?> cls) {
            for (f1 f1Var : this.f10830a) {
                if (f1Var.isSupported(cls)) {
                    return f1Var.messageInfoFor(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }
    }

    public v0() {
        this(a());
    }

    private static f1 a() {
        return new b(h0.a(), b());
    }

    private static f1 b() {
        try {
            int i10 = q.f10758d;
            return (f1) q.class.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f10828b;
        }
    }

    private static boolean c(e1 e1Var) {
        return e1Var.getSyntax() == u1.PROTO2;
    }

    private static <T> b2<T> d(Class<T> cls, e1 e1Var) {
        if (i0.class.isAssignableFrom(cls)) {
            return c(e1Var) ? i1.K(cls, e1Var, o1.b(), s0.b(), d2.O(), c0.b(), d1.b()) : i1.K(cls, e1Var, o1.b(), s0.b(), d2.O(), null, d1.b());
        }
        return c(e1Var) ? i1.K(cls, e1Var, o1.a(), s0.a(), d2.I(), c0.a(), d1.a()) : i1.K(cls, e1Var, o1.a(), s0.a(), d2.J(), null, d1.a());
    }

    @Override // com.explorestack.protobuf.c2
    public <T> b2<T> createSchema(Class<T> cls) {
        d2.K(cls);
        e1 e1VarMessageInfoFor = this.f10829a.messageInfoFor(cls);
        if (e1VarMessageInfoFor.isMessageSetWireFormat()) {
            return i0.class.isAssignableFrom(cls) ? j1.f(d2.O(), c0.b(), e1VarMessageInfoFor.getDefaultInstance()) : j1.f(d2.I(), c0.a(), e1VarMessageInfoFor.getDefaultInstance());
        }
        return d(cls, e1VarMessageInfoFor);
    }

    private v0(f1 f1Var) {
        this.f10829a = (f1) l0.b(f1Var, "messageInfoFactory");
    }
}
