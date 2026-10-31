package je;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i implements fe.d<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f20933a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final he.f f20934b = new m2("kotlin.Boolean", he.e.a.f15833a);

    private i() {
    }

    @Override // fe.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean deserialize(ie.e decoder) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        return Boolean.valueOf(decoder.v());
    }

    public void b(ie.f encoder, boolean z10) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        encoder.v(z10);
    }

    @Override // fe.d, fe.m, fe.c
    public he.f getDescriptor() {
        return f20934b;
    }

    @Override // fe.m
    public /* bridge */ /* synthetic */ void serialize(ie.f fVar, Object obj) {
        b(fVar, ((Boolean) obj).booleanValue());
    }
}
