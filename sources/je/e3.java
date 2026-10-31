package je;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e3 extends l2<wc.x, wc.y, d3> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e3 f20896c = new e3();

    private e3() {
        super(ge.a.F(wc.x.f27788b));
    }

    @Override // je.a
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((wc.y) obj).t());
    }

    @Override // je.a
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((wc.y) obj).t());
    }

    @Override // je.l2
    public /* bridge */ /* synthetic */ wc.y r() {
        return wc.y.a(w());
    }

    @Override // je.l2
    public /* bridge */ /* synthetic */ void u(ie.d dVar, wc.y yVar, int i10) {
        z(dVar, yVar.t(), i10);
    }

    protected int v(byte[] collectionSize) {
        kotlin.jvm.internal.t.f(collectionSize, "$this$collectionSize");
        return wc.y.m(collectionSize);
    }

    protected byte[] w() {
        return wc.y.c(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.v, je.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(ie.c decoder, int i10, d3 builder, boolean z10) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        kotlin.jvm.internal.t.f(builder, "builder");
        builder.e(wc.x.b(decoder.m(getDescriptor(), i10).G()));
    }

    protected d3 y(byte[] toBuilder) {
        kotlin.jvm.internal.t.f(toBuilder, "$this$toBuilder");
        return new d3(toBuilder, null);
    }

    protected void z(ie.d encoder, byte[] content, int i10) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        kotlin.jvm.internal.t.f(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.t(getDescriptor(), i11).g(wc.y.j(content, i11));
        }
    }
}
