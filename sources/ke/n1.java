package ke;

/* JADX INFO: compiled from: TreeJsonEncoder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class n1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(he.f fVar) {
        return (fVar.d() instanceof he.e) || fVar.d() == he.m.b.f15863a;
    }

    public static final <T> kotlinx.serialization.json.i d(kotlinx.serialization.json.b json, T t10, fe.m<? super T> serializer) {
        kotlin.jvm.internal.t.f(json, "json");
        kotlin.jvm.internal.t.f(serializer, "serializer");
        final kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        new t0(json, new id.l() { // from class: ke.m1
            @Override // id.l
            public final Object invoke(Object obj) {
                return n1.e(h0Var, (kotlinx.serialization.json.i) obj);
            }
        }).q(serializer, t10);
        T t11 = h0Var.f21514a;
        if (t11 != null) {
            return (kotlinx.serialization.json.i) t11;
        }
        kotlin.jvm.internal.t.u("result");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final wc.g0 e(kotlin.jvm.internal.h0 h0Var, kotlinx.serialization.json.i it) {
        kotlin.jvm.internal.t.f(it, "it");
        h0Var.f21514a = it;
        return wc.g0.f27756a;
    }
}
