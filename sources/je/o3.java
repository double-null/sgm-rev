package je;

/* JADX INFO: compiled from: ValueClasses.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class o3 implements fe.d<wc.e0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o3 f20975a = new o3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final he.f f20976b = r0.a("kotlin.UShort", ge.a.B(kotlin.jvm.internal.k0.f21525a));

    private o3() {
    }

    public short a(ie.e decoder) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        return wc.e0.b(decoder.r(getDescriptor()).s());
    }

    public void b(ie.f encoder, short s10) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        encoder.n(getDescriptor()).u(s10);
    }

    @Override // fe.c
    public /* bridge */ /* synthetic */ Object deserialize(ie.e eVar) {
        return wc.e0.a(a(eVar));
    }

    @Override // fe.d, fe.m, fe.c
    public he.f getDescriptor() {
        return f20976b;
    }

    @Override // fe.m
    public /* bridge */ /* synthetic */ void serialize(ie.f fVar, Object obj) {
        b(fVar, ((wc.e0) obj).g());
    }
}
