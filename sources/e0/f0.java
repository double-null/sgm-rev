package e0;

/* JADX INFO: compiled from: DataStoreImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final de.a f13569a = de.g.b(false, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ud.x<wc.g0> f13570b = ud.z.b(null, 1, null);

    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.RunOnce", f = "DataStoreImpl.kt", l = {544, 497}, m = "runIfNeeded")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f13571h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f13572i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f13573j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f13575l;

        a(zc.f<? super a> fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13573j = obj;
            this.f13575l |= Integer.MIN_VALUE;
            return f0.this.c(this);
        }
    }

    public final Object a(zc.f<? super wc.g0> fVar) {
        Object objJ0 = this.f13570b.j0(fVar);
        return objJ0 == ad.d.f() ? objJ0 : wc.g0.f27756a;
    }

    protected abstract Object b(zc.f<? super wc.g0> fVar);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(zc.f<? super wc.g0> fVar) throws Throwable {
        a aVar;
        de.a aVar2;
        f0 f0Var;
        de.a aVar3;
        Throwable th;
        f0 f0Var2;
        if (fVar instanceof a) {
            aVar = (a) fVar;
            int i10 = aVar.f13575l;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f13575l = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(fVar);
            }
        } else {
            aVar = new a(fVar);
        }
        Object obj = aVar.f13573j;
        Object objF = ad.d.f();
        int i11 = aVar.f13575l;
        try {
            if (i11 == 0) {
                wc.s.b(obj);
                if (this.f13570b.k()) {
                    return wc.g0.f27756a;
                }
                aVar2 = this.f13569a;
                aVar.f13571h = this;
                aVar.f13572i = aVar2;
                aVar.f13575l = 1;
                if (aVar2.d(null, aVar) == objF) {
                    return objF;
                }
                f0Var = this;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar3 = (de.a) aVar.f13572i;
                    f0Var2 = (f0) aVar.f13571h;
                    try {
                        wc.s.b(obj);
                        ud.x<wc.g0> xVar = f0Var2.f13570b;
                        wc.g0 g0Var = wc.g0.f27756a;
                        xVar.G(g0Var);
                        aVar3.c(null);
                        return g0Var;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar3.c(null);
                        throw th;
                    }
                }
                de.a aVar4 = (de.a) aVar.f13572i;
                f0Var = (f0) aVar.f13571h;
                wc.s.b(obj);
                aVar2 = aVar4;
            }
            if (f0Var.f13570b.k()) {
                wc.g0 g0Var2 = wc.g0.f27756a;
                aVar2.c(null);
                return g0Var2;
            }
            aVar.f13571h = f0Var;
            aVar.f13572i = aVar2;
            aVar.f13575l = 2;
            if (f0Var.b(aVar) == objF) {
                return objF;
            }
            aVar3 = aVar2;
            f0Var2 = f0Var;
            ud.x<wc.g0> xVar2 = f0Var2.f13570b;
            wc.g0 g0Var3 = wc.g0.f27756a;
            xVar2.G(g0Var3);
            aVar3.c(null);
            return g0Var3;
        } catch (Throwable th3) {
            aVar3 = aVar2;
            th = th3;
            aVar3.c(null);
            throw th;
        }
    }
}
