package yd;

import kotlin.jvm.internal.m0;
import zd.l0;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e {
    public static final <T, V> Object b(zc.j jVar, V v10, Object obj, id.p<? super V, ? super zc.f<? super T>, ? extends Object> pVar, zc.f<? super T> fVar) {
        Object objI = l0.i(jVar, obj);
        try {
            s sVar = new s(fVar, jVar);
            Object objD = !(pVar instanceof kotlin.coroutines.jvm.internal.a) ? ad.c.d(pVar, v10, sVar) : ((id.p) m0.d(pVar, 2)).invoke(v10, sVar);
            l0.f(jVar, objI);
            if (objD == ad.d.f()) {
                kotlin.coroutines.jvm.internal.h.c(fVar);
            }
            return objD;
        } catch (Throwable th) {
            l0.f(jVar, objI);
            throw th;
        }
    }

    public static /* synthetic */ Object c(zc.j jVar, Object obj, Object obj2, id.p pVar, zc.f fVar, int i10, Object obj3) {
        if ((i10 & 4) != 0) {
            obj2 = l0.g(jVar);
        }
        return b(jVar, obj, obj2, pVar, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> xd.d<T> d(xd.d<? super T> dVar, zc.j jVar) {
        return !(dVar instanceof r) ? new t(dVar, jVar) : dVar;
    }
}
