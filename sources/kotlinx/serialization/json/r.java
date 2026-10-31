package kotlinx.serialization.json;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: JsonElementSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class r implements fe.d<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f21606a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final he.f f21607b = he.l.d("kotlinx.serialization.json.JsonElement", he.d.b.f15832a, new he.f[0], new id.l() { // from class: kotlinx.serialization.json.l
        @Override // id.l
        public final Object invoke(Object obj) {
            return r.g((he.a) obj);
        }
    });

    private r() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wc.g0 g(he.a buildSerialDescriptor) {
        kotlin.jvm.internal.t.f(buildSerialDescriptor, "$this$buildSerialDescriptor");
        he.a.b(buildSerialDescriptor, "JsonPrimitive", s.f(new id.a() { // from class: kotlinx.serialization.json.m
            @Override // id.a
            public final Object invoke() {
                return r.h();
            }
        }), null, false, 12, null);
        he.a.b(buildSerialDescriptor, "JsonNull", s.f(new id.a() { // from class: kotlinx.serialization.json.n
            @Override // id.a
            public final Object invoke() {
                return r.i();
            }
        }), null, false, 12, null);
        he.a.b(buildSerialDescriptor, "JsonLiteral", s.f(new id.a() { // from class: kotlinx.serialization.json.o
            @Override // id.a
            public final Object invoke() {
                return r.j();
            }
        }), null, false, 12, null);
        he.a.b(buildSerialDescriptor, "JsonObject", s.f(new id.a() { // from class: kotlinx.serialization.json.p
            @Override // id.a
            public final Object invoke() {
                return r.k();
            }
        }), null, false, 12, null);
        he.a.b(buildSerialDescriptor, "JsonArray", s.f(new id.a() { // from class: kotlinx.serialization.json.q
            @Override // id.a
            public final Object invoke() {
                return r.l();
            }
        }), null, false, 12, null);
        return wc.g0.f27756a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final he.f h() {
        return h0.f21603a.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final he.f i() {
        return b0.f21555a.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final he.f j() {
        return x.f21612a.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final he.f k() {
        return f0.f21582a.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final he.f l() {
        return d.f21558a.getDescriptor();
    }

    @Override // fe.d, fe.m, fe.c
    public he.f getDescriptor() {
        return f21607b;
    }

    @Override // fe.c
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public i deserialize(ie.e decoder) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        return s.d(decoder).g();
    }

    @Override // fe.m
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void serialize(ie.f encoder, i value) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        kotlin.jvm.internal.t.f(value, "value");
        s.h(encoder);
        if (value instanceof g0) {
            encoder.q(h0.f21603a, value);
        } else if (value instanceof d0) {
            encoder.q(f0.f21582a, value);
        } else {
            if (!(value instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            encoder.q(d.f21558a, value);
        }
    }
}
