package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.s.b;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: ExtensionSchema.java */
/* JADX INFO: loaded from: classes.dex */
abstract class o<T extends s.b<T>> {
    o() {
    }

    abstract int a(Map.Entry<?, ?> entry);

    abstract Object b(n nVar, p0 p0Var, int i10);

    abstract s<T> c(Object obj);

    abstract s<T> d(Object obj);

    abstract boolean e(p0 p0Var);

    abstract void f(Object obj);

    abstract <UT, UB> UB g(Object obj, d1 d1Var, Object obj2, n nVar, s<T> sVar, UB ub2, k1<UT, UB> k1Var) throws IOException;

    abstract void h(d1 d1Var, Object obj, n nVar, s<T> sVar) throws IOException;

    abstract void i(g gVar, Object obj, n nVar, s<T> sVar) throws IOException;

    abstract void j(q1 q1Var, Map.Entry<?, ?> entry) throws IOException;
}
