package je;

/* JADX INFO: compiled from: BuiltInSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c0 implements fe.d<sd.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f20874a = new c0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final he.f f20875b = new m2("kotlin.time.Duration", he.e.i.f15841a);

    private c0() {
    }

    public long a(ie.e decoder) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        return sd.a.f25407b.c(decoder.A());
    }

    public void b(ie.f encoder, long j10) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        encoder.G(sd.a.F(j10));
    }

    @Override // fe.c
    public /* bridge */ /* synthetic */ Object deserialize(ie.e eVar) {
        return sd.a.e(a(eVar));
    }

    @Override // fe.d, fe.m, fe.c
    public he.f getDescriptor() {
        return f20875b;
    }

    @Override // fe.m
    public /* bridge */ /* synthetic */ void serialize(ie.f fVar, Object obj) {
        b(fVar, ((sd.a) obj).J());
    }
}
