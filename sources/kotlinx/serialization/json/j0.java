package kotlinx.serialization.json;

import ke.n1;

/* JADX INFO: compiled from: JsonTransformingSerializer.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class j0<T> implements fe.d<T> {
    private final fe.d<T> tSerializer;

    public j0(fe.d<T> tSerializer) {
        kotlin.jvm.internal.t.f(tSerializer, "tSerializer");
        this.tSerializer = tSerializer;
    }

    @Override // fe.c
    public final T deserialize(ie.e decoder) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        h hVarD = s.d(decoder);
        return (T) hVarD.d().d(this.tSerializer, transformDeserialize(hVarD.g()));
    }

    @Override // fe.d, fe.m, fe.c
    public he.f getDescriptor() {
        return this.tSerializer.getDescriptor();
    }

    @Override // fe.m
    public final void serialize(ie.f encoder, T value) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        kotlin.jvm.internal.t.f(value, "value");
        t tVarE = s.e(encoder);
        tVarE.C(transformSerialize(n1.d(tVarE.d(), value, this.tSerializer)));
    }

    protected i transformDeserialize(i element) {
        kotlin.jvm.internal.t.f(element, "element");
        return element;
    }

    protected i transformSerialize(i element) {
        kotlin.jvm.internal.t.f(element, "element");
        return element;
    }
}
