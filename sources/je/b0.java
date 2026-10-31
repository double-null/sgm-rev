package je;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b0 implements fe.d<Double> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f20867a = new b0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final he.f f20868b = new m2("kotlin.Double", he.e.d.f15836a);

    private b0() {
    }

    @Override // fe.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Double deserialize(ie.e decoder) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        return Double.valueOf(decoder.u());
    }

    public void b(ie.f encoder, double d10) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        encoder.f(d10);
    }

    @Override // fe.d, fe.m, fe.c
    public he.f getDescriptor() {
        return f20868b;
    }

    @Override // fe.m
    public /* bridge */ /* synthetic */ void serialize(ie.f fVar, Object obj) {
        b(fVar, ((Number) obj).doubleValue());
    }
}
