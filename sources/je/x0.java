package je;

import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class x0<K, V, R> implements fe.d<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fe.d<K> f21033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fe.d<V> f21034b;

    public /* synthetic */ x0(fe.d dVar, fe.d dVar2, kotlin.jvm.internal.k kVar) {
        this(dVar, dVar2);
    }

    protected abstract K a(R r10);

    protected final fe.d<K> b() {
        return this.f21033a;
    }

    protected abstract V c(R r10);

    protected final fe.d<V> d() {
        return this.f21034b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fe.c
    public R deserialize(ie.e decoder) {
        R r10;
        kotlin.jvm.internal.t.f(decoder, "decoder");
        he.f descriptor = getDescriptor();
        ie.c cVarB = decoder.b(descriptor);
        if (cVarB.q()) {
            r10 = (R) e(ie.c.a.c(cVarB, getDescriptor(), 0, b(), null, 8, null), ie.c.a.c(cVarB, getDescriptor(), 1, d(), null, 8, null));
        } else {
            Object objC = c3.f20879a;
            Object objC2 = c3.f20879a;
            while (true) {
                int iF = cVarB.f(getDescriptor());
                if (iF == -1) {
                    if (objC == c3.f20879a) {
                        throw new SerializationException("Element 'key' is missing");
                    }
                    if (objC2 == c3.f20879a) {
                        throw new SerializationException("Element 'value' is missing");
                    }
                    r10 = (R) e(objC, objC2);
                    break;
                }
                if (iF == 0) {
                    objC = ie.c.a.c(cVarB, getDescriptor(), 0, b(), null, 8, null);
                } else {
                    if (iF != 1) {
                        throw new SerializationException("Invalid index: " + iF);
                    }
                    objC2 = ie.c.a.c(cVarB, getDescriptor(), 1, d(), null, 8, null);
                }
            }
        }
        cVarB.c(descriptor);
        return r10;
    }

    protected abstract R e(K k10, V v10);

    @Override // fe.m
    public void serialize(ie.f encoder, R r10) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        ie.d dVarB = encoder.b(getDescriptor());
        dVarB.E(getDescriptor(), 0, this.f21033a, a(r10));
        dVarB.E(getDescriptor(), 1, this.f21034b, c(r10));
        dVarB.c(getDescriptor());
    }

    private x0(fe.d<K> dVar, fe.d<V> dVar2) {
        this.f21033a = dVar;
        this.f21034b = dVar2;
    }
}
