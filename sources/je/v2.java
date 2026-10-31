package je;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class v2 implements fe.d<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v2 f21024a = new v2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final he.f f21025b = new m2("kotlin.String", he.e.i.f15841a);

    private v2() {
    }

    @Override // fe.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String deserialize(ie.e decoder) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        return decoder.A();
    }

    @Override // fe.m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(ie.f encoder, String value) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        kotlin.jvm.internal.t.f(value, "value");
        encoder.G(value);
    }

    @Override // fe.d, fe.m, fe.c
    public he.f getDescriptor() {
        return f21025b;
    }
}
