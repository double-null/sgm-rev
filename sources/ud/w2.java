package ud;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: Interruptible.kt */
/* JADX INFO: loaded from: classes5.dex */
final class w2 extends f2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f26826g = AtomicIntegerFieldUpdater.newUpdater(w2.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Thread f26827e = Thread.currentThread();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private g1 f26828f;

    private final Void B(int i10) {
        throw new IllegalStateException(("Illegal state " + i10).toString());
    }

    public final void C(b2 b2Var) {
        int i10;
        this.f26828f = e2.l(b2Var, false, this, 1, null);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f26826g;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2 || i10 == 3) {
                    return;
                }
                B(i10);
                throw new KotlinNothingValueException();
            }
        } while (!f26826g.compareAndSet(this, i10, 0));
    }

    @Override // ud.f2
    public boolean w() {
        return true;
    }

    @Override // ud.f2
    public void x(Throwable th) {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f26826g;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                    return;
                }
                B(i10);
                throw new KotlinNothingValueException();
            }
        } while (!f26826g.compareAndSet(this, i10, 2));
        this.f26827e.interrupt();
        f26826g.set(this, 3);
    }

    public final void z() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f26826g;
        while (true) {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        B(i10);
                        throw new KotlinNothingValueException();
                    }
                }
            } else if (f26826g.compareAndSet(this, i10, 1)) {
                g1 g1Var = this.f26828f;
                if (g1Var != null) {
                    g1Var.e();
                    return;
                }
                return;
            }
        }
    }
}
