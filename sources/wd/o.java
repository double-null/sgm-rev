package wd;

import java.util.concurrent.CancellationException;
import ud.p1;

/* JADX INFO: compiled from: Channels.common.kt */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class o {
    public static final void a(u<?> uVar, Throwable th) {
        CancellationException cancellationExceptionA = null;
        if (th != null) {
            cancellationExceptionA = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionA == null) {
                cancellationExceptionA = p1.a("Channel was consumed, consumer had failed", th);
            }
        }
        uVar.f(cancellationExceptionA);
    }
}
