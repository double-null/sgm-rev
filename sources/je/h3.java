package je;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h3 extends l2<wc.z, wc.a0, g3> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h3 f20932c = new h3();

    private h3() {
        super(ge.a.G(wc.z.f27793b));
    }

    @Override // je.a
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((wc.a0) obj).t());
    }

    @Override // je.a
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((wc.a0) obj).t());
    }

    @Override // je.l2
    public /* bridge */ /* synthetic */ wc.a0 r() {
        return wc.a0.a(w());
    }

    @Override // je.l2
    public /* bridge */ /* synthetic */ void u(ie.d dVar, wc.a0 a0Var, int i10) {
        z(dVar, a0Var.t(), i10);
    }

    protected int v(int[] collectionSize) {
        kotlin.jvm.internal.t.f(collectionSize, "$this$collectionSize");
        return wc.a0.m(collectionSize);
    }

    protected int[] w() {
        return wc.a0.c(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.v, je.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(ie.c decoder, int i10, g3 builder, boolean z10) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        kotlin.jvm.internal.t.f(builder, "builder");
        builder.e(wc.z.b(decoder.m(getDescriptor(), i10).h()));
    }

    protected g3 y(int[] toBuilder) {
        kotlin.jvm.internal.t.f(toBuilder, "$this$toBuilder");
        return new g3(toBuilder, null);
    }

    protected void z(ie.d encoder, int[] content, int i10) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        kotlin.jvm.internal.t.f(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.t(getDescriptor(), i11).D(wc.a0.j(content, i11));
        }
    }
}
