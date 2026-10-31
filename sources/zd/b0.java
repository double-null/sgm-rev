package zd;

import com.facebook.internal.NativeProtocol;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import ud.n2;
import zd.b0;

/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b0<S extends b0<S>> extends b<S> implements n2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f29186d = AtomicIntegerFieldUpdater.newUpdater(b0.class, "cleanedAndPointers$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f29187c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public b0(long j10, S s10, int i10) {
        super(s10);
        this.f29187c = j10;
        this.cleanedAndPointers$volatile = i10 << 16;
    }

    @Override // zd.b
    public boolean k() {
        return f29186d.get(this) == r() && !l();
    }

    public final boolean p() {
        return f29186d.addAndGet(this, -65536) == r() && !l();
    }

    public abstract int r();

    public abstract void s(int i10, Throwable th, zc.j jVar);

    public final void t() {
        if (f29186d.incrementAndGet(this) == r()) {
            n();
        }
    }

    public final boolean u() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f29186d;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (!(i10 != r() || l())) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST + i10));
        return true;
    }
}
