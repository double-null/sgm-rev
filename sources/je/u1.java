package je;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: ObjectSerializer.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class u1<T> implements fe.d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f21016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<? extends Annotation> f21017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wc.k f21018c;

    public u1(final String serialName, T objectInstance) {
        kotlin.jvm.internal.t.f(serialName, "serialName");
        kotlin.jvm.internal.t.f(objectInstance, "objectInstance");
        this.f21016a = objectInstance;
        this.f21017b = kotlin.collections.t.k();
        this.f21018c = wc.m.b(wc.o.PUBLICATION, new id.a() { // from class: je.s1
            @Override // id.a
            public final Object invoke() {
                return u1.c(serialName, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final he.f c(String str, final u1 u1Var) {
        return he.l.d(str, he.n.d.f15867a, new he.f[0], new id.l() { // from class: je.t1
            @Override // id.l
            public final Object invoke(Object obj) {
                return u1.d(this.f21012a, (he.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wc.g0 d(u1 u1Var, he.a buildSerialDescriptor) {
        kotlin.jvm.internal.t.f(buildSerialDescriptor, "$this$buildSerialDescriptor");
        buildSerialDescriptor.h(u1Var.f21017b);
        return wc.g0.f27756a;
    }

    @Override // fe.c
    public T deserialize(ie.e decoder) {
        int iF;
        kotlin.jvm.internal.t.f(decoder, "decoder");
        he.f descriptor = getDescriptor();
        ie.c cVarB = decoder.b(descriptor);
        if (cVarB.q() || (iF = cVarB.f(getDescriptor())) == -1) {
            wc.g0 g0Var = wc.g0.f27756a;
            cVarB.c(descriptor);
            return this.f21016a;
        }
        throw new SerializationException("Unexpected index " + iF);
    }

    @Override // fe.d, fe.m, fe.c
    public he.f getDescriptor() {
        return (he.f) this.f21018c.getValue();
    }

    @Override // fe.m
    public void serialize(ie.f encoder, T value) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        kotlin.jvm.internal.t.f(value, "value");
        encoder.b(getDescriptor()).c(getDescriptor());
    }
}
