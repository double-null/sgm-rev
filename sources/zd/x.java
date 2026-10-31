package zd;

import kotlinx.coroutines.internal.UndeliveredElementException;

/* JADX INFO: compiled from: OnUndeliveredElement.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class x {
    public static final <E> void a(id.l<? super E, wc.g0> lVar, E e10, zc.j jVar) {
        UndeliveredElementException undeliveredElementExceptionB = b(lVar, e10, null);
        if (undeliveredElementExceptionB != null) {
            ud.m0.a(jVar, undeliveredElementExceptionB);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> UndeliveredElementException b(id.l<? super E, wc.g0> lVar, E e10, UndeliveredElementException undeliveredElementException) {
        try {
            lVar.invoke(e10);
        } catch (Throwable th) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th) {
                return new UndeliveredElementException("Exception in undelivered element handler for " + e10, th);
            }
            wc.f.a(undeliveredElementException, th);
        }
        return undeliveredElementException;
    }

    public static /* synthetic */ UndeliveredElementException c(id.l lVar, Object obj, UndeliveredElementException undeliveredElementException, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            undeliveredElementException = null;
        }
        return b(lVar, obj, undeliveredElementException);
    }
}
