package je;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class u0 implements fe.d<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u0 f21014a = new u0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final he.f f21015b = new m2("kotlin.Int", he.e.f.f15838a);

    private u0() {
    }

    @Override // fe.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer deserialize(ie.e decoder) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        return Integer.valueOf(decoder.h());
    }

    public void b(ie.f encoder, int i10) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        encoder.D(i10);
    }

    @Override // fe.d, fe.m, fe.c
    public he.f getDescriptor() {
        return f21015b;
    }

    @Override // fe.m
    public /* bridge */ /* synthetic */ void serialize(ie.f fVar, Object obj) {
        b(fVar, ((Number) obj).intValue());
    }
}
