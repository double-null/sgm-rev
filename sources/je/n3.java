package je;

import com.vungle.ads.internal.persistence.mP.RHIpdOnfgiYkEj;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class n3 extends l2<wc.e0, wc.f0, m3> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n3 f20969c = new n3();

    private n3() {
        super(ge.a.I(wc.e0.f27751b));
    }

    @Override // je.a
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((wc.f0) obj).t());
    }

    @Override // je.a
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((wc.f0) obj).t());
    }

    @Override // je.l2
    public /* bridge */ /* synthetic */ wc.f0 r() {
        return wc.f0.a(w());
    }

    @Override // je.l2
    public /* bridge */ /* synthetic */ void u(ie.d dVar, wc.f0 f0Var, int i10) {
        z(dVar, f0Var.t(), i10);
    }

    protected int v(short[] collectionSize) {
        kotlin.jvm.internal.t.f(collectionSize, "$this$collectionSize");
        return wc.f0.m(collectionSize);
    }

    protected short[] w() {
        return wc.f0.c(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.v, je.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(ie.c decoder, int i10, m3 builder, boolean z10) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        kotlin.jvm.internal.t.f(builder, "builder");
        builder.e(wc.e0.b(decoder.m(getDescriptor(), i10).s()));
    }

    protected m3 y(short[] toBuilder) {
        kotlin.jvm.internal.t.f(toBuilder, "$this$toBuilder");
        return new m3(toBuilder, null);
    }

    protected void z(ie.d dVar, short[] content, int i10) {
        kotlin.jvm.internal.t.f(dVar, RHIpdOnfgiYkEj.xbjDUdOayE);
        kotlin.jvm.internal.t.f(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.t(getDescriptor(), i11).u(wc.f0.j(content, i11));
        }
    }
}
