package je;

/* JADX INFO: compiled from: InlineClassDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class r0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: InlineClassDescriptor.kt */
    public static final class a<T> implements l0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ fe.d<T> f20996a;

        a(fe.d<T> dVar) {
            this.f20996a = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // je.l0
        public fe.d<?>[] childSerializers() {
            return new fe.d[]{this.f20996a};
        }

        @Override // fe.c
        public T deserialize(ie.e decoder) {
            kotlin.jvm.internal.t.f(decoder, "decoder");
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // fe.d, fe.m, fe.c
        public he.f getDescriptor() {
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // fe.m
        public void serialize(ie.f encoder, T t10) {
            kotlin.jvm.internal.t.f(encoder, "encoder");
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // je.l0
        public fe.d<?>[] typeParametersSerializers() {
            return l0.a.a(this);
        }
    }

    public static final <T> he.f a(String name, fe.d<T> primitiveSerializer) {
        kotlin.jvm.internal.t.f(name, "name");
        kotlin.jvm.internal.t.f(primitiveSerializer, "primitiveSerializer");
        return new q0(name, new a(primitiveSerializer));
    }
}
