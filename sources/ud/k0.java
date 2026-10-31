package ud;

/* JADX INFO: compiled from: CoroutineDispatcher.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class k0 extends zc.a implements zc.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f26776b = new a(null);

    /* JADX INFO: compiled from: CoroutineDispatcher.kt */
    public static final class a extends zc.b<zc.g, k0> {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final k0 d(zc.j.b bVar) {
            if (bVar instanceof k0) {
                return (k0) bVar;
            }
            return null;
        }

        private a() {
            super(zc.g.f29179a9, new id.l() { // from class: ud.j0
                @Override // id.l
                public final Object invoke(Object obj) {
                    return k0.a.d((zc.j.b) obj);
                }
            });
        }
    }

    public k0() {
        super(zc.g.f29179a9);
    }

    public static /* synthetic */ k0 p0(k0 k0Var, int i10, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        return k0Var.o0(i10, str);
    }

    @Override // zc.a, zc.j
    public zc.j a0(zc.j.c<?> cVar) {
        return zc.g.a.b(this, cVar);
    }

    @Override // zc.a, zc.j.b, zc.j
    public <E extends zc.j.b> E e(zc.j.c<E> cVar) {
        return (E) zc.g.a.a(this, cVar);
    }

    @Override // zc.g
    public final void i0(zc.f<?> fVar) {
        kotlin.jvm.internal.t.d(fVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((zd.g) fVar).s();
    }

    public abstract void m0(zc.j jVar, Runnable runnable);

    public boolean n0(zc.j jVar) {
        return true;
    }

    public k0 o0(int i10, String str) {
        zd.m.a(i10);
        return new zd.l(this, i10, str);
    }

    @Override // zc.g
    public final <T> zc.f<T> t(zc.f<? super T> fVar) {
        return new zd.g(this, fVar);
    }

    public String toString() {
        return s0.a(this) + '@' + s0.b(this);
    }
}
