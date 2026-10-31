package zd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: LockFreeTaskQueue.kt */
/* JADX INFO: loaded from: classes5.dex */
public class q<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f29227a = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public q(boolean z10) {
        this._cur$volatile = new r(8, z10);
    }

    public final boolean a(E e10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29227a;
        while (true) {
            r rVar = (r) atomicReferenceFieldUpdater.get(this);
            int iA = rVar.a(e10);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                androidx.concurrent.futures.b.a(f29227a, this, rVar, rVar.l());
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29227a;
        while (true) {
            r rVar = (r) atomicReferenceFieldUpdater.get(this);
            if (rVar.d()) {
                return;
            } else {
                androidx.concurrent.futures.b.a(f29227a, this, rVar, rVar.l());
            }
        }
    }

    public final int c() {
        return ((r) f29227a.get(this)).g();
    }

    public final E e() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29227a;
        while (true) {
            r rVar = (r) atomicReferenceFieldUpdater.get(this);
            E e10 = (E) rVar.m();
            if (e10 != r.f29231h) {
                return e10;
            }
            androidx.concurrent.futures.b.a(f29227a, this, rVar, rVar.l());
        }
    }
}
