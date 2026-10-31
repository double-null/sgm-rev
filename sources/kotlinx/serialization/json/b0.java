package kotlinx.serialization.json;

import kotlinx.serialization.json.internal.JsonDecodingException;

/* JADX INFO: compiled from: JsonElementSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b0 implements fe.d<a0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f21555a = new b0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final he.f f21556b = he.l.e("kotlinx.serialization.json.JsonNull", he.m.b.f15863a, new he.f[0], null, 8, null);

    private b0() {
    }

    @Override // fe.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a0 deserialize(ie.e decoder) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        s.g(decoder);
        if (decoder.B()) {
            throw new JsonDecodingException("Expected 'null' literal");
        }
        decoder.i();
        return a0.INSTANCE;
    }

    @Override // fe.m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(ie.f encoder, a0 value) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        kotlin.jvm.internal.t.f(value, "value");
        s.h(encoder);
        encoder.r();
    }

    @Override // fe.d, fe.m, fe.c
    public he.f getDescriptor() {
        return f21556b;
    }
}
