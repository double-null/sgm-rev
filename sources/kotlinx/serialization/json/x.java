package kotlinx.serialization.json;

import rd.m0;

/* JADX INFO: compiled from: JsonElementSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
final class x implements fe.d<w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f21612a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final he.f f21613b = he.l.b("kotlinx.serialization.json.JsonLiteral", he.e.i.f15841a);

    private x() {
    }

    @Override // fe.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public w deserialize(ie.e decoder) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        i iVarG = s.d(decoder).g();
        if (iVarG instanceof w) {
            return (w) iVarG;
        }
        throw ke.k0.f(-1, "Unexpected JSON element, expected JsonLiteral, had " + kotlin.jvm.internal.i0.b(iVarG.getClass()), iVarG.toString());
    }

    @Override // fe.m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(ie.f encoder, w value) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        kotlin.jvm.internal.t.f(value, "value");
        s.h(encoder);
        if (value.d()) {
            encoder.G(value.a());
            return;
        }
        if (value.c() != null) {
            encoder.n(value.c()).G(value.a());
            return;
        }
        Long lR = rd.b0.r(value.a());
        if (lR != null) {
            encoder.m(lR.longValue());
            return;
        }
        wc.b0 b0VarH = m0.h(value.a());
        if (b0VarH != null) {
            encoder.n(ge.a.H(wc.b0.f27741b).getDescriptor()).m(b0VarH.g());
            return;
        }
        Double dM = rd.a0.m(value.a());
        if (dM != null) {
            encoder.f(dM.doubleValue());
            return;
        }
        Boolean boolC1 = rd.f0.c1(value.a());
        if (boolC1 != null) {
            encoder.v(boolC1.booleanValue());
        } else {
            encoder.G(value.a());
        }
    }

    @Override // fe.d, fe.m, fe.c
    public he.f getDescriptor() {
        return f21613b;
    }
}
