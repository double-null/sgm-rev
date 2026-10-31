package je;

/* JADX INFO: compiled from: ValueClasses.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i3 implements fe.d<wc.z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i3 f20942a = new i3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final he.f f20943b = r0.a("kotlin.UInt", ge.a.z(kotlin.jvm.internal.s.f21535a));

    private i3() {
    }

    public int a(ie.e decoder) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        return wc.z.b(decoder.r(getDescriptor()).h());
    }

    public void b(ie.f encoder, int i10) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        encoder.n(getDescriptor()).D(i10);
    }

    @Override // fe.c
    public /* bridge */ /* synthetic */ Object deserialize(ie.e eVar) {
        return wc.z.a(a(eVar));
    }

    @Override // fe.d, fe.m, fe.c
    public he.f getDescriptor() {
        return f20943b;
    }

    @Override // fe.m
    public /* bridge */ /* synthetic */ void serialize(ie.f fVar, Object obj) {
        b(fVar, ((wc.z) obj).g());
    }
}
