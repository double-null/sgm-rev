package fe;

import java.lang.annotation.Annotation;
import java.util.List;
import je.a2;
import kotlin.KotlinNothingValueException;
import wc.g0;

/* JADX INFO: compiled from: ContextualSerializer.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b<T> implements d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pd.c<T> f14958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d<T> f14959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<d<?>> f14960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final he.f f14961d;

    public b(pd.c<T> serializableClass, d<T> dVar, d<?>[] typeArgumentsSerializers) {
        kotlin.jvm.internal.t.f(serializableClass, "serializableClass");
        kotlin.jvm.internal.t.f(typeArgumentsSerializers, "typeArgumentsSerializers");
        this.f14958a = serializableClass;
        this.f14959b = dVar;
        this.f14960c = kotlin.collections.m.c(typeArgumentsSerializers);
        this.f14961d = he.b.c(he.l.d("kotlinx.serialization.ContextualSerializer", he.m.a.f15862a, new he.f[0], new id.l() { // from class: fe.a
            @Override // id.l
            public final Object invoke(Object obj) {
                return b.b(this.f14957a, (he.a) obj);
            }
        }), serializableClass);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 b(b bVar, he.a buildSerialDescriptor) {
        he.f descriptor;
        kotlin.jvm.internal.t.f(buildSerialDescriptor, "$this$buildSerialDescriptor");
        d<T> dVar = bVar.f14959b;
        List<Annotation> annotations = (dVar == null || (descriptor = dVar.getDescriptor()) == null) ? null : descriptor.getAnnotations();
        if (annotations == null) {
            annotations = kotlin.collections.t.k();
        }
        buildSerialDescriptor.h(annotations);
        return g0.f27756a;
    }

    private final d<T> c(le.c cVar) {
        d<T> dVarB = cVar.b(this.f14958a, this.f14960c);
        if (dVarB != null || (dVarB = this.f14959b) != null) {
            return dVarB;
        }
        a2.f(this.f14958a);
        throw new KotlinNothingValueException();
    }

    @Override // fe.c
    public T deserialize(ie.e decoder) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        return (T) decoder.C(c(decoder.a()));
    }

    @Override // fe.d, fe.m, fe.c
    public he.f getDescriptor() {
        return this.f14961d;
    }

    @Override // fe.m
    public void serialize(ie.f encoder, T value) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        kotlin.jvm.internal.t.f(value, "value");
        encoder.q(c(encoder.a()), value);
    }
}
