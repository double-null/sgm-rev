package ud;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes5.dex */
final class z1 extends f2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f26839f = AtomicIntegerFieldUpdater.newUpdater(z1.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final id.l<Throwable, wc.g0> f26840e;

    /* JADX WARN: Multi-variable type inference failed */
    public z1(id.l<? super Throwable, wc.g0> lVar) {
        this.f26840e = lVar;
    }

    @Override // ud.f2
    public boolean w() {
        return true;
    }

    @Override // ud.f2
    public void x(Throwable th) {
        if (f26839f.compareAndSet(this, 0, 1)) {
            this.f26840e.invoke(th);
        }
    }
}
