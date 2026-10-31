package je;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class q extends l2<Character, char[], p> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f20988c = new q();

    private q() {
        super(ge.a.w(kotlin.jvm.internal.g.f21512a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(char[] cArr) {
        kotlin.jvm.internal.t.f(cArr, "<this>");
        return cArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.l2
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public char[] r() {
        return new char[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.v, je.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(ie.c decoder, int i10, p builder, boolean z10) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        kotlin.jvm.internal.t.f(builder, "builder");
        builder.e(decoder.o(getDescriptor(), i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public p k(char[] cArr) {
        kotlin.jvm.internal.t.f(cArr, "<this>");
        return new p(cArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.l2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(ie.d encoder, char[] content, int i10) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        kotlin.jvm.internal.t.f(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.F(getDescriptor(), i11, content[i11]);
        }
    }
}
