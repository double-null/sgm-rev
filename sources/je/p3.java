package je;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class p3 implements fe.d<wc.g0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p3 f20986b = new p3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ u1<wc.g0> f20987a = new u1<>("kotlin.Unit", wc.g0.f27756a);

    private p3() {
    }

    public void a(ie.e decoder) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        this.f20987a.deserialize(decoder);
    }

    @Override // fe.m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(ie.f encoder, wc.g0 value) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        kotlin.jvm.internal.t.f(value, "value");
        this.f20987a.serialize(encoder, value);
    }

    @Override // fe.c
    public /* bridge */ /* synthetic */ Object deserialize(ie.e eVar) {
        a(eVar);
        return wc.g0.f27756a;
    }

    @Override // fe.d, fe.m, fe.c
    public he.f getDescriptor() {
        return this.f20987a.getDescriptor();
    }
}
