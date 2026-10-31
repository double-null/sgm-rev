package je;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class l implements fe.d<Byte> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f20957a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final he.f f20958b = new m2("kotlin.Byte", he.e.b.f15834a);

    private l() {
    }

    @Override // fe.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Byte deserialize(ie.e decoder) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        return Byte.valueOf(decoder.G());
    }

    public void b(ie.f encoder, byte b10) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        encoder.g(b10);
    }

    @Override // fe.d, fe.m, fe.c
    public he.f getDescriptor() {
        return f20958b;
    }

    @Override // fe.m
    public /* bridge */ /* synthetic */ void serialize(ie.f fVar, Object obj) {
        b(fVar, ((Number) obj).byteValue());
    }
}
