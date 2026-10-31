package qd;

import kotlin.jvm.internal.t;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: _SequencesJvm.kt */
/* JADX INFO: loaded from: classes5.dex */
public class p extends n {
    public static <R> g<R> i(g<?> gVar, final Class<R> klass) {
        t.f(gVar, "<this>");
        t.f(klass, "klass");
        g<R> gVarN = r.n(gVar, new id.l() { // from class: qd.o
            @Override // id.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(p.j(klass, obj));
            }
        });
        t.d(gVarN, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesJvmKt.filterIsInstance>");
        return gVarN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(Class cls, Object obj) {
        return cls.isInstance(obj);
    }
}
