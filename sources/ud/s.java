package ud;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: CompletionState.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class s extends c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f26814c = AtomicIntegerFieldUpdater.newUpdater(s.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public s(zc.f<?> fVar, Throwable th, boolean z10) {
        if (th == null) {
            th = new CancellationException("Continuation " + fVar + " was cancelled normally");
        }
        super(th, z10);
        this._resumed$volatile = 0;
    }

    public final boolean e() {
        return f26814c.compareAndSet(this, 0, 1);
    }
}
