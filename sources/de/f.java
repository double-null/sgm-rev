package de;

import id.l;
import id.q;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ud.c3;
import ud.k0;
import ud.n;
import ud.p;
import ud.r;
import ud.s0;
import wc.g0;
import zd.b0;

/* JADX INFO: compiled from: Mutex.kt */
/* JADX INFO: loaded from: classes5.dex */
public class f extends i implements de.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f13524i = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "owner$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final q<ce.b<?>, Object, Object, q<Throwable, Object, zc.j, g0>> f13525h;
    private volatile /* synthetic */ Object owner$volatile;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: Mutex.kt */
    final class a implements n<g0>, c3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p<g0> f13526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f13527b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(p<? super g0> pVar, Object obj) {
            this.f13526a = pVar;
            this.f13527b = obj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g0 f(f fVar, a aVar, Throwable th) {
            fVar.c(aVar.f13527b);
            return g0.f27756a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g0 j(f fVar, a aVar, Throwable th, g0 g0Var, zc.j jVar) {
            f.x().set(fVar, aVar.f13527b);
            fVar.c(aVar.f13527b);
            return g0.f27756a;
        }

        @Override // ud.n
        public void H(l<? super Throwable, g0> lVar) {
            this.f13526a.H(lVar);
        }

        @Override // ud.c3
        public void a(b0<?> b0Var, int i10) {
            this.f13526a.a(b0Var, i10);
        }

        @Override // ud.n
        public boolean c() {
            return this.f13526a.c();
        }

        @Override // ud.n
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public <R extends g0> void d0(R r10, q<? super Throwable, ? super R, ? super zc.j, g0> qVar) {
            f.x().set(f.this, this.f13527b);
            p<g0> pVar = this.f13526a;
            final f fVar = f.this;
            pVar.R(r10, new l() { // from class: de.d
                @Override // id.l
                public final Object invoke(Object obj) {
                    return f.a.f(fVar, this, (Throwable) obj);
                }
            });
        }

        @Override // zc.f
        public zc.j getContext() {
            return this.f13526a.getContext();
        }

        @Override // ud.n
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void D(k0 k0Var, g0 g0Var) {
            this.f13526a.D(k0Var, g0Var);
        }

        @Override // ud.n
        public void h0(Object obj) {
            this.f13526a.h0(obj);
        }

        @Override // ud.n
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public <R extends g0> Object g(R r10, Object obj, q<? super Throwable, ? super R, ? super zc.j, g0> qVar) {
            final f fVar = f.this;
            Object objG = this.f13526a.g(r10, obj, new q() { // from class: de.e
                @Override // id.q
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return f.a.j(fVar, this, (Throwable) obj2, (g0) obj3, (zc.j) obj4);
                }
            });
            if (objG != null) {
                f.x().set(f.this, this.f13527b);
            }
            return objG;
        }

        @Override // ud.n
        public boolean k() {
            return this.f13526a.k();
        }

        @Override // zc.f
        public void resumeWith(Object obj) {
            this.f13526a.resumeWith(obj);
        }

        @Override // ud.n
        public Object w(Throwable th) {
            return this.f13526a.w(th);
        }

        @Override // ud.n
        public boolean x(Throwable th) {
            return this.f13526a.x(th);
        }
    }

    public f(boolean z10) {
        super(1, z10 ? 1 : 0);
        this.owner$volatile = z10 ? null : g.f13529a;
        this.f13525h = new q() { // from class: de.b
            @Override // id.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return f.B(this.f13517a, (ce.b) obj, obj2, obj3);
            }
        };
    }

    private final Object A(Object obj, zc.f<? super g0> fVar) {
        p pVarB = r.b(ad.c.c(fVar));
        try {
            f(new a(pVarB, obj));
            Object objZ = pVarB.z();
            if (objZ == ad.d.f()) {
                kotlin.coroutines.jvm.internal.h.c(fVar);
            }
            return objZ == ad.d.f() ? objZ : g0.f27756a;
        } catch (Throwable th) {
            pVarB.P();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q B(final f fVar, ce.b bVar, final Object obj, Object obj2) {
        return new q() { // from class: de.c
            @Override // id.q
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return f.C(this.f13518a, obj, (Throwable) obj3, obj4, (zc.j) obj5);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 C(f fVar, Object obj, Throwable th, Object obj2, zc.j jVar) {
        fVar.c(obj);
        return g0.f27756a;
    }

    private final int D(Object obj) {
        while (!r()) {
            if (obj == null) {
                return 1;
            }
            int iY = y(obj);
            if (iY == 1) {
                return 2;
            }
            if (iY == 2) {
                return 1;
            }
        }
        f13524i.set(this, obj);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater x() {
        return f13524i;
    }

    private final int y(Object obj) {
        while (b()) {
            Object obj2 = f13524i.get(this);
            if (obj2 != g.f13529a) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    static /* synthetic */ Object z(f fVar, Object obj, zc.f<? super g0> fVar2) {
        if (fVar.a(obj)) {
            return g0.f27756a;
        }
        Object objA = fVar.A(obj, fVar2);
        return objA == ad.d.f() ? objA : g0.f27756a;
    }

    @Override // de.a
    public boolean a(Object obj) {
        int iD = D(obj);
        if (iD == 0) {
            return true;
        }
        if (iD == 1) {
            return false;
        }
        if (iD != 2) {
            throw new IllegalStateException("unexpected".toString());
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    @Override // de.a
    public boolean b() {
        return j() == 0;
    }

    @Override // de.a
    public void c(Object obj) {
        while (b()) {
            Object obj2 = f13524i.get(this);
            if (obj2 != g.f13529a) {
                if (!(obj2 == obj || obj == null)) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                if (androidx.concurrent.futures.b.a(f13524i, this, obj2, g.f13529a)) {
                    q();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    @Override // de.a
    public Object d(Object obj, zc.f<? super g0> fVar) {
        return z(this, obj, fVar);
    }

    public String toString() {
        return "Mutex@" + s0.b(this) + "[isLocked=" + b() + ",owner=" + f13524i.get(this) + ']';
    }
}
