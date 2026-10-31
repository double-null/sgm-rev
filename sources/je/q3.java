package je;

/* JADX INFO: compiled from: BuiltInSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class q3 implements fe.d<td.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q3 f20992a = new q3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final he.f f20993b = new m2("kotlin.uuid.Uuid", he.e.i.f15841a);

    private q3() {
    }

    @Override // fe.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public td.b deserialize(ie.e decoder) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        return td.b.f25788c.c(decoder.A());
    }

    @Override // fe.m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(ie.f encoder, td.b value) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        kotlin.jvm.internal.t.f(value, "value");
        encoder.G(value.toString());
    }

    @Override // fe.d, fe.m, fe.c
    public he.f getDescriptor() {
        return f20993b;
    }
}
