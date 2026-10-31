package je;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class k0 implements fe.d<Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k0 f20952a = new k0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final he.f f20953b = new m2("kotlin.Float", he.e.C0242e.f15837a);

    private k0() {
    }

    @Override // fe.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float deserialize(ie.e decoder) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        return Float.valueOf(decoder.t());
    }

    public void b(ie.f encoder, float f10) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        encoder.x(f10);
    }

    @Override // fe.d, fe.m, fe.c
    public he.f getDescriptor() {
        return f20953b;
    }

    @Override // fe.m
    public /* bridge */ /* synthetic */ void serialize(ie.f fVar, Object obj) {
        b(fVar, ((Number) obj).floatValue());
    }
}
