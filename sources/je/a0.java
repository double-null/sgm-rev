package je;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a0 extends l2<Double, double[], z> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f20864c = new a0();

    private a0() {
        super(ge.a.x(kotlin.jvm.internal.l.f21526a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(double[] dArr) {
        kotlin.jvm.internal.t.f(dArr, "<this>");
        return dArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.l2
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public double[] r() {
        return new double[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.v, je.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(ie.c decoder, int i10, z builder, boolean z10) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        kotlin.jvm.internal.t.f(builder, "builder");
        builder.e(decoder.n(getDescriptor(), i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public z k(double[] dArr) {
        kotlin.jvm.internal.t.f(dArr, "<this>");
        return new z(dArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.l2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(ie.d encoder, double[] content, int i10) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        kotlin.jvm.internal.t.f(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.k(getDescriptor(), i11, content[i11]);
        }
    }
}
