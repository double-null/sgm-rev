package je;

import com.applovin.mediation.ads.Zfi.OgqfiHA;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class t2 extends l2<Short, short[], s2> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t2 f21013c = new t2();

    private t2() {
        super(ge.a.B(kotlin.jvm.internal.k0.f21525a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(short[] sArr) {
        kotlin.jvm.internal.t.f(sArr, "<this>");
        return sArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.l2
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public short[] r() {
        return new short[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.v, je.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(ie.c decoder, int i10, s2 builder, boolean z10) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        kotlin.jvm.internal.t.f(builder, "builder");
        builder.e(decoder.z(getDescriptor(), i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public s2 k(short[] sArr) {
        kotlin.jvm.internal.t.f(sArr, "<this>");
        return new s2(sArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.l2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(ie.d encoder, short[] sArr, int i10) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        kotlin.jvm.internal.t.f(sArr, OgqfiHA.erNTwgVZUZ);
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.s(getDescriptor(), i11, sArr[i11]);
        }
    }
}
