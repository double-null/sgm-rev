package ud;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes5.dex */
final class g<T> extends a<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Thread f26745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k1 f26746e;

    public g(zc.j jVar, Thread thread, k1 k1Var) {
        super(jVar, true, true);
        this.f26745d = thread;
        this.f26746e = k1Var;
    }

    @Override // ud.g2
    protected void A(Object obj) {
        if (kotlin.jvm.internal.t.a(Thread.currentThread(), this.f26745d)) {
            return;
        }
        Thread thread = this.f26745d;
        c.a();
        LockSupport.unpark(thread);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T Y0() throws Throwable {
        c.a();
        try {
            k1 k1Var = this.f26746e;
            if (k1Var != null) {
                k1.w0(k1Var, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    k1 k1Var2 = this.f26746e;
                    long jZ0 = k1Var2 != null ? k1Var2.z0() : Long.MAX_VALUE;
                    if (k()) {
                        k1 k1Var3 = this.f26746e;
                        if (k1Var3 != null) {
                            k1.r0(k1Var3, false, 1, null);
                        }
                        c.a();
                        T t10 = (T) h2.h(o0());
                        c0 c0Var = t10 instanceof c0 ? (c0) t10 : null;
                        if (c0Var == null) {
                            return t10;
                        }
                        throw c0Var.f26724a;
                    }
                    c.a();
                    LockSupport.parkNanos(this, jZ0);
                } catch (Throwable th) {
                    k1 k1Var4 = this.f26746e;
                    if (k1Var4 != null) {
                        k1.r0(k1Var4, false, 1, null);
                    }
                    throw th;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            L(interruptedException);
            throw interruptedException;
        } catch (Throwable th2) {
            c.a();
            throw th2;
        }
    }

    @Override // ud.g2
    protected boolean v0() {
        return true;
    }
}
