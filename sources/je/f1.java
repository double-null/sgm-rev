package je;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f1 implements fe.d<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f1 f20900a = new f1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final he.f f20901b = new m2("kotlin.Long", he.e.g.f15839a);

    private f1() {
    }

    @Override // fe.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Long deserialize(ie.e decoder) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        return Long.valueOf(decoder.k());
    }

    public void b(ie.f encoder, long j10) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        encoder.m(j10);
    }

    @Override // fe.d, fe.m, fe.c
    public he.f getDescriptor() {
        return f20901b;
    }

    @Override // fe.m
    public /* bridge */ /* synthetic */ void serialize(ie.f fVar, Object obj) {
        b(fVar, ((Number) obj).longValue());
    }
}
