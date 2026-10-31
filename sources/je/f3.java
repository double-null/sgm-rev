package je;

/* JADX INFO: compiled from: ValueClasses.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f3 implements fe.d<wc.x> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f3 f20903a = new f3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final he.f f20904b = r0.a("kotlin.UByte", ge.a.v(kotlin.jvm.internal.e.f21508a));

    private f3() {
    }

    public byte a(ie.e decoder) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        return wc.x.b(decoder.r(getDescriptor()).G());
    }

    public void b(ie.f encoder, byte b10) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        encoder.n(getDescriptor()).g(b10);
    }

    @Override // fe.c
    public /* bridge */ /* synthetic */ Object deserialize(ie.e eVar) {
        return wc.x.a(a(eVar));
    }

    @Override // fe.d, fe.m, fe.c
    public he.f getDescriptor() {
        return f20904b;
    }

    @Override // fe.m
    public /* bridge */ /* synthetic */ void serialize(ie.f fVar, Object obj) {
        b(fVar, ((wc.x) obj).g());
    }
}
