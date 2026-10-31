package je;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class j0 extends l2<Float, float[], i0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j0 f20946c = new j0();

    private j0() {
        super(ge.a.y(kotlin.jvm.internal.m.f21528a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(float[] fArr) {
        kotlin.jvm.internal.t.f(fArr, "<this>");
        return fArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.l2
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public float[] r() {
        return new float[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.v, je.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(ie.c decoder, int i10, i0 builder, boolean z10) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        kotlin.jvm.internal.t.f(builder, "builder");
        builder.e(decoder.j(getDescriptor(), i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public i0 k(float[] fArr) {
        kotlin.jvm.internal.t.f(fArr, "<this>");
        return new i0(fArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.l2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(ie.d encoder, float[] content, int i10) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        kotlin.jvm.internal.t.f(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.e(getDescriptor(), i11, content[i11]);
        }
    }
}
