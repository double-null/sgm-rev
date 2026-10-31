package je;

import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b3<A, B, C> implements fe.d<wc.v<? extends A, ? extends B, ? extends C>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fe.d<A> f20870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fe.d<B> f20871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fe.d<C> f20872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final he.f f20873d;

    public b3(fe.d<A> aSerializer, fe.d<B> bSerializer, fe.d<C> cSerializer) {
        kotlin.jvm.internal.t.f(aSerializer, "aSerializer");
        kotlin.jvm.internal.t.f(bSerializer, "bSerializer");
        kotlin.jvm.internal.t.f(cSerializer, "cSerializer");
        this.f20870a = aSerializer;
        this.f20871b = bSerializer;
        this.f20872c = cSerializer;
        this.f20873d = he.l.c("kotlin.Triple", new he.f[0], new id.l() { // from class: je.a3
            @Override // id.l
            public final Object invoke(Object obj) {
                return b3.d(this.f20866a, (he.a) obj);
            }
        });
    }

    private final wc.v<A, B, C> b(ie.c cVar) {
        Object objC = ie.c.a.c(cVar, getDescriptor(), 0, this.f20870a, null, 8, null);
        Object objC2 = ie.c.a.c(cVar, getDescriptor(), 1, this.f20871b, null, 8, null);
        Object objC3 = ie.c.a.c(cVar, getDescriptor(), 2, this.f20872c, null, 8, null);
        cVar.c(getDescriptor());
        return new wc.v<>(objC, objC2, objC3);
    }

    private final wc.v<A, B, C> c(ie.c cVar) {
        Object objC = c3.f20879a;
        Object objC2 = c3.f20879a;
        Object objC3 = c3.f20879a;
        while (true) {
            int iF = cVar.f(getDescriptor());
            if (iF == -1) {
                cVar.c(getDescriptor());
                if (objC == c3.f20879a) {
                    throw new SerializationException("Element 'first' is missing");
                }
                if (objC2 == c3.f20879a) {
                    throw new SerializationException("Element 'second' is missing");
                }
                if (objC3 != c3.f20879a) {
                    return new wc.v<>(objC, objC2, objC3);
                }
                throw new SerializationException("Element 'third' is missing");
            }
            if (iF == 0) {
                objC = ie.c.a.c(cVar, getDescriptor(), 0, this.f20870a, null, 8, null);
            } else if (iF == 1) {
                objC2 = ie.c.a.c(cVar, getDescriptor(), 1, this.f20871b, null, 8, null);
            } else {
                if (iF != 2) {
                    throw new SerializationException("Unexpected index " + iF);
                }
                objC3 = ie.c.a.c(cVar, getDescriptor(), 2, this.f20872c, null, 8, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wc.g0 d(b3 b3Var, he.a buildClassSerialDescriptor) {
        kotlin.jvm.internal.t.f(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        he.a.b(buildClassSerialDescriptor, "first", b3Var.f20870a.getDescriptor(), null, false, 12, null);
        he.a.b(buildClassSerialDescriptor, "second", b3Var.f20871b.getDescriptor(), null, false, 12, null);
        he.a.b(buildClassSerialDescriptor, "third", b3Var.f20872c.getDescriptor(), null, false, 12, null);
        return wc.g0.f27756a;
    }

    @Override // fe.c
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public wc.v<A, B, C> deserialize(ie.e decoder) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        ie.c cVarB = decoder.b(getDescriptor());
        return cVarB.q() ? b(cVarB) : c(cVarB);
    }

    @Override // fe.m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void serialize(ie.f encoder, wc.v<? extends A, ? extends B, ? extends C> value) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        kotlin.jvm.internal.t.f(value, "value");
        ie.d dVarB = encoder.b(getDescriptor());
        dVarB.E(getDescriptor(), 0, this.f20870a, value.b());
        dVarB.E(getDescriptor(), 1, this.f20871b, value.c());
        dVarB.E(getDescriptor(), 2, this.f20872c, value.e());
        dVarB.c(getDescriptor());
    }

    @Override // fe.d, fe.m, fe.c
    public he.f getDescriptor() {
        return this.f20873d;
    }
}
