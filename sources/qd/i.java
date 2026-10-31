package qd;

import java.util.Iterator;
import wc.g0;

/* JADX INFO: compiled from: SequenceBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class i<T> {
    public abstract Object a(T t10, zc.f<? super g0> fVar);

    public abstract Object b(Iterator<? extends T> it, zc.f<? super g0> fVar);

    public final Object d(g<? extends T> gVar, zc.f<? super g0> fVar) {
        Object objB = b(gVar.iterator(), fVar);
        return objB == ad.d.f() ? objB : g0.f27756a;
    }
}
