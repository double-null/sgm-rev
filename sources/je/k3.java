package je;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class k3 extends l2<wc.b0, wc.c0, j3> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k3 f20956c = new k3();

    private k3() {
        super(ge.a.H(wc.b0.f27741b));
    }

    @Override // je.a
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((wc.c0) obj).t());
    }

    @Override // je.a
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((wc.c0) obj).t());
    }

    @Override // je.l2
    public /* bridge */ /* synthetic */ wc.c0 r() {
        return wc.c0.a(w());
    }

    @Override // je.l2
    public /* bridge */ /* synthetic */ void u(ie.d dVar, wc.c0 c0Var, int i10) {
        z(dVar, c0Var.t(), i10);
    }

    protected int v(long[] collectionSize) {
        kotlin.jvm.internal.t.f(collectionSize, "$this$collectionSize");
        return wc.c0.m(collectionSize);
    }

    protected long[] w() {
        return wc.c0.c(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.v, je.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(ie.c decoder, int i10, j3 builder, boolean z10) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        kotlin.jvm.internal.t.f(builder, "builder");
        builder.e(wc.b0.b(decoder.m(getDescriptor(), i10).k()));
    }

    protected j3 y(long[] toBuilder) {
        kotlin.jvm.internal.t.f(toBuilder, "$this$toBuilder");
        return new j3(toBuilder, null);
    }

    protected void z(ie.d encoder, long[] content, int i10) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        kotlin.jvm.internal.t.f(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.t(getDescriptor(), i11).m(wc.c0.j(content, i11));
        }
    }
}
