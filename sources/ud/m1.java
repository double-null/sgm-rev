package ud;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: EventLoop.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class m1 extends k1 {
    protected abstract Thread C0();

    protected void D0(long j10, l1.c cVar) {
        t0.f26817i.R0(j10, cVar);
    }

    protected final void E0() {
        Thread threadC0 = C0();
        if (Thread.currentThread() != threadC0) {
            c.a();
            LockSupport.unpark(threadC0);
        }
    }
}
