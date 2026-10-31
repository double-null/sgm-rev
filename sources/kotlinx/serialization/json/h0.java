package kotlinx.serialization.json;

/* JADX INFO: compiled from: JsonElementSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h0 implements fe.d<g0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f21603a = new h0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final he.f f21604b = he.l.e("kotlinx.serialization.json.JsonPrimitive", he.e.i.f15841a, new he.f[0], null, 8, null);

    private h0() {
    }

    @Override // fe.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public g0 deserialize(ie.e decoder) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        i iVarG = s.d(decoder).g();
        if (iVarG instanceof g0) {
            return (g0) iVarG;
        }
        throw ke.k0.f(-1, "Unexpected JSON element, expected JsonPrimitive, had " + kotlin.jvm.internal.i0.b(iVarG.getClass()), iVarG.toString());
    }

    @Override // fe.m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(ie.f encoder, g0 value) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        kotlin.jvm.internal.t.f(value, "value");
        s.h(encoder);
        if (value instanceof a0) {
            encoder.q(b0.f21555a, a0.INSTANCE);
        } else {
            encoder.q(x.f21612a, (w) value);
        }
    }

    @Override // fe.d, fe.m, fe.c
    public he.f getDescriptor() {
        return f21604b;
    }
}
