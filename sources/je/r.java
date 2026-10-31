package je;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class r implements fe.d<Character> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f20994a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final he.f f20995b = new m2("kotlin.Char", he.e.c.f15835a);

    private r() {
    }

    @Override // fe.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Character deserialize(ie.e decoder) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        return Character.valueOf(decoder.w());
    }

    public void b(ie.f encoder, char c10) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        encoder.y(c10);
    }

    @Override // fe.d, fe.m, fe.c
    public he.f getDescriptor() {
        return f20995b;
    }

    @Override // fe.m
    public /* bridge */ /* synthetic */ void serialize(ie.f fVar, Object obj) {
        b(fVar, ((Character) obj).charValue());
    }
}
