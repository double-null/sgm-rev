package zd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ud.s0;

/* JADX INFO: compiled from: LockFreeLinkedList.kt */
/* JADX INFO: loaded from: classes5.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f29220a = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f29221b = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f29222c = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    private final p i() {
        Object obj;
        while (true) {
            p pVar = (p) f29221b.get(this);
            p pVar2 = pVar;
            while (true) {
                p pVar3 = null;
                while (true) {
                    obj = f29220a.get(pVar2);
                    if (obj == this) {
                        if (pVar == pVar2) {
                            return pVar2;
                        }
                        if (!androidx.concurrent.futures.b.a(f29221b, this, pVar, pVar2)) {
                            break;
                        }
                        return pVar2;
                    }
                    if (r()) {
                        return null;
                    }
                    if (!(obj instanceof y)) {
                        kotlin.jvm.internal.t.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        pVar3 = pVar2;
                        pVar2 = (p) obj;
                    } else {
                        if (pVar3 != null) {
                            break;
                        }
                        pVar2 = (p) f29221b.get(pVar2);
                    }
                }
                if (!androidx.concurrent.futures.b.a(f29220a, pVar3, pVar2, ((y) obj).f29246a)) {
                    break;
                }
                pVar2 = pVar3;
            }
        }
    }

    private final p j(p pVar) {
        while (pVar.r()) {
            pVar = (p) f29221b.get(pVar);
        }
        return pVar;
    }

    private final void k(p pVar) {
        p pVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29221b;
        do {
            pVar2 = (p) atomicReferenceFieldUpdater.get(pVar);
            if (l() != pVar) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f29221b, pVar, pVar2, this));
        if (r()) {
            pVar.i();
        }
    }

    private final y u() {
        y yVar = (y) f29222c.get(this);
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y(this);
        f29222c.set(this, yVar2);
        return yVar2;
    }

    public final boolean b(p pVar, int i10) {
        p pVarN;
        do {
            pVarN = n();
            if (pVarN instanceof n) {
                return (((n) pVarN).f29217d & i10) == 0 && pVarN.b(pVar, i10);
            }
        } while (!pVarN.f(pVar, this));
        return true;
    }

    public final boolean f(p pVar, p pVar2) {
        f29221b.set(pVar, this);
        f29220a.set(pVar, pVar2);
        if (!androidx.concurrent.futures.b.a(f29220a, this, pVar2, pVar)) {
            return false;
        }
        pVar.k(pVar2);
        return true;
    }

    public final boolean g(p pVar) {
        f29221b.set(pVar, this);
        f29220a.set(pVar, this);
        while (l() == this) {
            if (androidx.concurrent.futures.b.a(f29220a, this, this, pVar)) {
                pVar.k(this);
                return true;
            }
        }
        return false;
    }

    public final void h(int i10) {
        b(new n(i10), i10);
    }

    public final Object l() {
        return f29220a.get(this);
    }

    public final p m() {
        p pVar;
        Object objL = l();
        y yVar = objL instanceof y ? (y) objL : null;
        if (yVar != null && (pVar = yVar.f29246a) != null) {
            return pVar;
        }
        kotlin.jvm.internal.t.d(objL, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (p) objL;
    }

    public final p n() {
        p pVarI = i();
        return pVarI == null ? j((p) f29221b.get(this)) : pVarI;
    }

    public boolean r() {
        return l() instanceof y;
    }

    public boolean s() {
        return t() == null;
    }

    public final p t() {
        Object objL;
        p pVar;
        do {
            objL = l();
            if (objL instanceof y) {
                return ((y) objL).f29246a;
            }
            if (objL == this) {
                return (p) objL;
            }
            kotlin.jvm.internal.t.d(objL, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            pVar = (p) objL;
        } while (!androidx.concurrent.futures.b.a(f29220a, this, objL, pVar.u()));
        pVar.i();
        return null;
    }

    public String toString() {
        return new kotlin.jvm.internal.y(this) { // from class: zd.p.a
            @Override // pd.i
            public Object get() {
                return s0.a(this.receiver);
            }
        } + '@' + s0.b(this);
    }
}
