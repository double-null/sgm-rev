package je;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class u2 implements fe.d<Short> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u2 f21019a = new u2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final he.f f21020b = new m2("kotlin.Short", he.e.h.f15840a);

    private u2() {
    }

    @Override // fe.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Short deserialize(ie.e decoder) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        return Short.valueOf(decoder.s());
    }

    public void b(ie.f encoder, short s10) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        encoder.u(s10);
    }

    @Override // fe.d, fe.m, fe.c
    public he.f getDescriptor() {
        return f21020b;
    }

    @Override // fe.m
    public /* bridge */ /* synthetic */ void serialize(ie.f fVar, Object obj) {
        b(fVar, ((Number) obj).shortValue());
    }
}
