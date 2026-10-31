package e0;

/* JADX INFO: compiled from: SingleProcessCoordinator.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f13609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final de.a f13610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f13611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final xd.c<wc.g0> f13612d;

    /* JADX INFO: compiled from: SingleProcessCoordinator.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", l = {66, 41}, m = "lock")
    static final class a<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f13613h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f13614i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f13615j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f13617l;

        a(zc.f<? super a> fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13615j = obj;
            this.f13617l |= Integer.MIN_VALUE;
            return j0.this.d(null, this);
        }
    }

    /* JADX INFO: compiled from: SingleProcessCoordinator.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", l = {50}, m = "tryLock")
    static final class b<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f13618h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f13619i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f13620j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f13622l;

        b(zc.f<? super b> fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13620j = obj;
            this.f13622l |= Integer.MIN_VALUE;
            return j0.this.e(null, this);
        }
    }

    /* JADX INFO: compiled from: SingleProcessCoordinator.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessCoordinator$updateNotifications$1", f = "SingleProcessCoordinator.kt", l = {}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.l implements id.p<xd.d<? super wc.g0>, zc.f<? super wc.g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f13623h;

        c(zc.f<? super c> fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<wc.g0> create(Object obj, zc.f<?> fVar) {
            return new c(fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(xd.d<? super wc.g0> dVar, zc.f<? super wc.g0> fVar) {
            return ((c) create(dVar, fVar)).invokeSuspend(wc.g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ad.d.f();
            if (this.f13623h != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wc.s.b(obj);
            return wc.g0.f27756a;
        }
    }

    public j0(String filePath) {
        kotlin.jvm.internal.t.f(filePath, "filePath");
        this.f13609a = filePath;
        this.f13610b = de.g.b(false, 1, null);
        this.f13611c = new e(0);
        this.f13612d = xd.e.m(new c(null));
    }

    @Override // e0.v
    public Object a(zc.f<? super Integer> fVar) {
        return kotlin.coroutines.jvm.internal.b.c(this.f13611c.b());
    }

    @Override // e0.v
    public Object b(zc.f<? super Integer> fVar) {
        return kotlin.coroutines.jvm.internal.b.c(this.f13611c.d());
    }

    @Override // e0.v
    public xd.c<wc.g0> c() {
        return this.f13612d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // e0.v
    public <T> Object d(id.l<? super zc.f<? super T>, ? extends Object> lVar, zc.f<? super T> fVar) throws Throwable {
        a aVar;
        de.a aVar2;
        Throwable th;
        de.a aVar3;
        if (fVar instanceof a) {
            aVar = (a) fVar;
            int i10 = aVar.f13617l;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f13617l = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(fVar);
            }
        } else {
            aVar = new a(fVar);
        }
        Object obj = aVar.f13615j;
        Object objF = ad.d.f();
        int i11 = aVar.f13617l;
        try {
            if (i11 == 0) {
                wc.s.b(obj);
                aVar2 = this.f13610b;
                aVar.f13613h = lVar;
                aVar.f13614i = aVar2;
                aVar.f13617l = 1;
                if (aVar2.d(null, aVar) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar3 = (de.a) aVar.f13613h;
                    try {
                        wc.s.b(obj);
                        aVar3.c(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar3.c(null);
                        throw th;
                    }
                }
                de.a aVar4 = (de.a) aVar.f13614i;
                id.l<? super zc.f<? super T>, ? extends Object> lVar2 = (id.l) aVar.f13613h;
                wc.s.b(obj);
                aVar2 = aVar4;
                lVar = lVar2;
            }
            aVar.f13613h = aVar2;
            aVar.f13614i = null;
            aVar.f13617l = 2;
            Object objInvoke = lVar.invoke(aVar);
            if (objInvoke == objF) {
                return objF;
            }
            de.a aVar5 = aVar2;
            obj = objInvoke;
            aVar3 = aVar5;
            aVar3.c(null);
            return obj;
        } catch (Throwable th3) {
            de.a aVar6 = aVar2;
            th = th3;
            aVar3 = aVar6;
            aVar3.c(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // e0.v
    public <T> Object e(id.p<? super Boolean, ? super zc.f<? super T>, ? extends Object> pVar, zc.f<? super T> fVar) throws Throwable {
        b bVar;
        de.a aVar;
        Throwable th;
        boolean z10;
        if (fVar instanceof b) {
            bVar = (b) fVar;
            int i10 = bVar.f13622l;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f13622l = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(fVar);
            }
        } else {
            bVar = new b(fVar);
        }
        Object obj = bVar.f13620j;
        Object objF = ad.d.f();
        int i11 = bVar.f13622l;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = bVar.f13619i;
            aVar = (de.a) bVar.f13618h;
            try {
                wc.s.b(obj);
                if (z10) {
                    aVar.c(null);
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (z10) {
                    aVar.c(null);
                }
                throw th;
            }
        }
        wc.s.b(obj);
        de.a aVar2 = this.f13610b;
        boolean zA = aVar2.a(null);
        try {
            Boolean boolA = kotlin.coroutines.jvm.internal.b.a(zA);
            bVar.f13618h = aVar2;
            bVar.f13619i = zA;
            bVar.f13622l = 1;
            Object objInvoke = pVar.invoke(boolA, bVar);
            if (objInvoke == objF) {
                return objF;
            }
            aVar = aVar2;
            obj = objInvoke;
            z10 = zA;
            if (z10) {
                aVar.c(null);
            }
            return obj;
        } catch (Throwable th3) {
            aVar = aVar2;
            th = th3;
            z10 = zA;
            if (z10) {
                aVar.c(null);
            }
            throw th;
        }
    }
}
