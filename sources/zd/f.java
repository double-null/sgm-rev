package zd;

import java.util.Iterator;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;

/* JADX INFO: compiled from: CoroutineExceptionHandlerImpl.common.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f {
    public static final void a(zc.j jVar, Throwable th) {
        Iterator<ud.l0> it = e.a().iterator();
        while (it.hasNext()) {
            try {
                it.next().N(jVar, th);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th2) {
                e.b(ud.m0.b(th, th2));
            }
        }
        try {
            wc.f.a(th, new DiagnosticCoroutineContextException(jVar));
        } catch (Throwable unused2) {
        }
        e.b(th);
    }
}
