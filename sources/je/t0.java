package je;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class t0 extends l2<Integer, int[], s0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t0 f21011c = new t0();

    private t0() {
        super(ge.a.z(kotlin.jvm.internal.s.f21535a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(int[] iArr) {
        kotlin.jvm.internal.t.f(iArr, "<this>");
        return iArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.l2
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public int[] r() {
        return new int[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.v, je.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(ie.c decoder, int i10, s0 builder, boolean z10) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        kotlin.jvm.internal.t.f(builder, "builder");
        builder.e(decoder.x(getDescriptor(), i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public s0 k(int[] iArr) {
        kotlin.jvm.internal.t.f(iArr, "<this>");
        return new s0(iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.l2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(ie.d encoder, int[] content, int i10) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        kotlin.jvm.internal.t.f(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.h(getDescriptor(), i11, content[i11]);
        }
    }
}
