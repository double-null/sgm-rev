package com.google.protobuf;

/* JADX INFO: compiled from: ManifestSchemaFactory.java */
/* JADX INFO: loaded from: classes4.dex */
final class k0 implements m1 {
    private static final r0 EMPTY_FACTORY = new a();
    private final r0 messageInfoFactory;

    /* JADX INFO: compiled from: ManifestSchemaFactory.java */
    class a implements r0 {
        a() {
        }

        @Override // com.google.protobuf.r0
        public boolean isSupported(Class<?> cls) {
            return false;
        }

        @Override // com.google.protobuf.r0
        public q0 messageInfoFor(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    /* JADX INFO: compiled from: ManifestSchemaFactory.java */
    static /* synthetic */ class b {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$ProtoSyntax;

        static {
            int[] iArr = new int[e1.values().length];
            $SwitchMap$com$google$protobuf$ProtoSyntax = iArr;
            try {
                iArr[e1.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: compiled from: ManifestSchemaFactory.java */
    private static class c implements r0 {
        private r0[] factories;

        c(r0... r0VarArr) {
            this.factories = r0VarArr;
        }

        @Override // com.google.protobuf.r0
        public boolean isSupported(Class<?> cls) {
            for (r0 r0Var : this.factories) {
                if (r0Var.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.protobuf.r0
        public q0 messageInfoFor(Class<?> cls) {
            for (r0 r0Var : this.factories) {
                if (r0Var.isSupported(cls)) {
                    return r0Var.messageInfoFor(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }
    }

    public k0() {
        this(getDefaultMessageInfoFactory());
    }

    private static boolean allowExtensions(q0 q0Var) {
        return b.$SwitchMap$com$google$protobuf$ProtoSyntax[q0Var.getSyntax().ordinal()] != 1;
    }

    private static r0 getDefaultMessageInfoFactory() {
        return new c(x.getInstance(), getDescriptorMessageInfoFactory());
    }

    private static r0 getDescriptorMessageInfoFactory() {
        try {
            return (r0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return EMPTY_FACTORY;
        }
    }

    private static <T> l1<T> newSchema(Class<T> cls, q0 q0Var) {
        if (y.class.isAssignableFrom(cls)) {
            return allowExtensions(q0Var) ? v0.newSchema(cls, q0Var, z0.lite(), i0.lite(), n1.unknownFieldSetLiteSchema(), s.lite(), p0.lite()) : v0.newSchema(cls, q0Var, z0.lite(), i0.lite(), n1.unknownFieldSetLiteSchema(), null, p0.lite());
        }
        return allowExtensions(q0Var) ? v0.newSchema(cls, q0Var, z0.full(), i0.full(), n1.unknownFieldSetFullSchema(), s.full(), p0.full()) : v0.newSchema(cls, q0Var, z0.full(), i0.full(), n1.unknownFieldSetFullSchema(), null, p0.full());
    }

    @Override // com.google.protobuf.m1
    public <T> l1<T> createSchema(Class<T> cls) {
        n1.requireGeneratedMessage(cls);
        q0 q0VarMessageInfoFor = this.messageInfoFactory.messageInfoFor(cls);
        if (q0VarMessageInfoFor.isMessageSetWireFormat()) {
            return y.class.isAssignableFrom(cls) ? w0.newSchema(n1.unknownFieldSetLiteSchema(), s.lite(), q0VarMessageInfoFor.getDefaultInstance()) : w0.newSchema(n1.unknownFieldSetFullSchema(), s.full(), q0VarMessageInfoFor.getDefaultInstance());
        }
        return newSchema(cls, q0VarMessageInfoFor);
    }

    private k0(r0 r0Var) {
        this.messageInfoFactory = (r0) a0.checkNotNull(r0Var, "messageInfoFactory");
    }
}
