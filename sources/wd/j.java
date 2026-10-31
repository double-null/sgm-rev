package wd;

import wc.g0;

/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class j {
    public static final <E> g<E> a(int i10, a aVar, id.l<? super E, g0> lVar) {
        g<E> eVar;
        if (i10 != -2) {
            if (i10 == -1) {
                if (aVar == a.SUSPEND) {
                    return new p(1, a.DROP_OLDEST, lVar);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
            if (i10 != 0) {
                if (i10 != Integer.MAX_VALUE) {
                    return aVar == a.SUSPEND ? new e(i10, lVar) : new p(i10, aVar, lVar);
                }
                return new e(Integer.MAX_VALUE, lVar);
            }
            eVar = aVar == a.SUSPEND ? new e<>(0, lVar) : new p<>(1, aVar, lVar);
        } else {
            eVar = aVar == a.SUSPEND ? new e<>(g.Z8.a(), lVar) : new p<>(1, aVar, lVar);
        }
        return eVar;
    }

    public static /* synthetic */ g b(int i10, a aVar, id.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            aVar = a.SUSPEND;
        }
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        return a(i10, aVar, lVar);
    }
}
