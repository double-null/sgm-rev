package xd;

import wc.g0;

/* JADX INFO: compiled from: Emitters.kt */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class j {

    /* JADX INFO: compiled from: Emitters.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", f = "Emitters.kt", l = {212}, m = "invokeSafely$FlowKt__EmittersKt")
    static final class a<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f28486h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f28487i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f28488j;

        a(zc.f<? super a> fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f28487i = obj;
            this.f28488j |= Integer.MIN_VALUE;
            return j.c(null, null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    public static final class b<T> implements xd.c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ xd.c f28489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ id.q f28490b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {110, 117, 124}, m = "collect")
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            /* synthetic */ Object f28491h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            int f28492i;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f28494k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f28495l;

            public a(zc.f fVar) {
                super(fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f28491h = obj;
                this.f28492i |= Integer.MIN_VALUE;
                return b.this.a(null, this);
            }
        }

        public b(xd.c cVar, id.q qVar) {
            this.f28489a = cVar;
            this.f28490b = qVar;
        }

        /* JADX WARN: Code duplicated, block: B:34:0x0086 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:35:0x0087  */
        /* JADX WARN: Code duplicated, block: B:46:0x00ab A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // xd.c
        public Object a(d<? super T> dVar, zc.f<? super g0> fVar) throws Throwable {
            a aVar;
            b<T> bVar;
            w wVar;
            id.q qVar;
            yd.n nVar;
            Throwable th;
            yd.n nVar2;
            Object objInvoke;
            if (fVar instanceof a) {
                aVar = (a) fVar;
                int i10 = aVar.f28492i;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f28492i = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(fVar);
                }
            } else {
                aVar = new a(fVar);
            }
            Object obj = aVar.f28491h;
            Object objF = ad.d.f();
            int i11 = aVar.f28492i;
            if (i11 == 0) {
                wc.s.b(obj);
                try {
                    xd.c cVar = this.f28489a;
                    aVar.f28494k = this;
                    aVar.f28495l = dVar;
                    aVar.f28492i = 1;
                    if (cVar.a(dVar, aVar) == objF) {
                        return objF;
                    }
                    bVar = this;
                    nVar = new yd.n(dVar, aVar.getContext());
                    id.q qVar2 = bVar.f28490b;
                    aVar.f28494k = nVar;
                    aVar.f28495l = null;
                    aVar.f28492i = 3;
                    kotlin.jvm.internal.r.c(6);
                    objInvoke = qVar2.invoke(nVar, null, aVar);
                    kotlin.jvm.internal.r.c(7);
                    if (objInvoke == objF) {
                        return objF;
                    }
                    nVar2 = nVar;
                    nVar2.releaseIntercepted();
                    return g0.f27756a;
                } catch (Throwable th2) {
                    th = th2;
                    bVar = this;
                    wVar = new w(th);
                    qVar = bVar.f28490b;
                    aVar.f28494k = th;
                    aVar.f28495l = null;
                    aVar.f28492i = 2;
                    if (j.c(wVar, qVar, th, aVar) == objF) {
                        return objF;
                    }
                    throw th;
                }
            }
            if (i11 != 1) {
                if (i11 == 2) {
                    Throwable th3 = (Throwable) aVar.f28494k;
                    wc.s.b(obj);
                    throw th3;
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nVar2 = (yd.n) aVar.f28494k;
                try {
                    wc.s.b(obj);
                    nVar2.releaseIntercepted();
                    return g0.f27756a;
                } catch (Throwable th4) {
                    th = th4;
                    nVar2.releaseIntercepted();
                    throw th;
                }
            }
            dVar = (d) aVar.f28495l;
            bVar = (b) aVar.f28494k;
            try {
                wc.s.b(obj);
                nVar = new yd.n(dVar, aVar.getContext());
                try {
                    id.q qVar3 = bVar.f28490b;
                    aVar.f28494k = nVar;
                    aVar.f28495l = null;
                    aVar.f28492i = 3;
                    kotlin.jvm.internal.r.c(6);
                    objInvoke = qVar3.invoke(nVar, null, aVar);
                    kotlin.jvm.internal.r.c(7);
                    if (objInvoke == objF) {
                        return objF;
                    }
                    nVar2 = nVar;
                    nVar2.releaseIntercepted();
                    return g0.f27756a;
                } catch (Throwable th5) {
                    th = th5;
                    nVar2 = nVar;
                    nVar2.releaseIntercepted();
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                wVar = new w(th);
                qVar = bVar.f28490b;
                aVar.f28494k = th;
                aVar.f28495l = null;
                aVar.f28492i = 2;
                if (j.c(wVar, qVar, th, aVar) == objF) {
                    return objF;
                }
                throw th;
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    public static final class c<T> implements xd.c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ id.p f28496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ xd.c f28497b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {112, 116}, m = "collect")
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            /* synthetic */ Object f28498h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            int f28499i;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f28501k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f28502l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            Object f28503m;

            public a(zc.f fVar) {
                super(fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f28498h = obj;
                this.f28499i |= Integer.MIN_VALUE;
                return c.this.a(null, this);
            }
        }

        public c(id.p pVar, xd.c cVar) {
            this.f28496a = pVar;
            this.f28497b = cVar;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0082 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // xd.c
        public Object a(d<? super T> dVar, zc.f<? super g0> fVar) throws Throwable {
            a aVar;
            Throwable th;
            yd.n nVar;
            c<T> cVar;
            d<? super T> dVar2;
            xd.c cVar2;
            if (fVar instanceof a) {
                aVar = (a) fVar;
                int i10 = aVar.f28499i;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f28499i = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(fVar);
                }
            } else {
                aVar = new a(fVar);
            }
            Object obj = aVar.f28498h;
            Object objF = ad.d.f();
            int i11 = aVar.f28499i;
            if (i11 == 0) {
                wc.s.b(obj);
                yd.n nVar2 = new yd.n(dVar, aVar.getContext());
                try {
                    id.p pVar = this.f28496a;
                    aVar.f28501k = this;
                    aVar.f28502l = dVar;
                    aVar.f28503m = nVar2;
                    aVar.f28499i = 1;
                    kotlin.jvm.internal.r.c(6);
                    Object objInvoke = pVar.invoke(nVar2, aVar);
                    kotlin.jvm.internal.r.c(7);
                    if (objInvoke == objF) {
                        return objF;
                    }
                    cVar = this;
                    dVar2 = dVar;
                    nVar = nVar2;
                    nVar.releaseIntercepted();
                    cVar2 = cVar.f28497b;
                    aVar.f28501k = null;
                    aVar.f28502l = null;
                    aVar.f28503m = null;
                    aVar.f28499i = 2;
                    if (cVar2.a(dVar2, aVar) == objF) {
                        return objF;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    nVar = nVar2;
                    nVar.releaseIntercepted();
                    throw th;
                }
            } else if (i11 == 1) {
                nVar = (yd.n) aVar.f28503m;
                dVar2 = (d) aVar.f28502l;
                cVar = (c) aVar.f28501k;
                try {
                    wc.s.b(obj);
                    nVar.releaseIntercepted();
                    cVar2 = cVar.f28497b;
                    aVar.f28501k = null;
                    aVar.f28502l = null;
                    aVar.f28503m = null;
                    aVar.f28499i = 2;
                    if (cVar2.a(dVar2, aVar) == objF) {
                        return objF;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    nVar.releaseIntercepted();
                    throw th;
                }
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wc.s.b(obj);
            }
            return g0.f27756a;
        }
    }

    public static final void b(d<?> dVar) {
        if (dVar instanceof w) {
            throw ((w) dVar).f28575a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object c(d<? super T> dVar, id.q<? super d<? super T>, ? super Throwable, ? super zc.f<? super g0>, ? extends Object> qVar, Throwable th, zc.f<? super g0> fVar) throws Throwable {
        a aVar;
        if (fVar instanceof a) {
            aVar = (a) fVar;
            int i10 = aVar.f28488j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f28488j = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(fVar);
            }
        } else {
            aVar = new a(fVar);
        }
        Object obj = aVar.f28487i;
        Object objF = ad.d.f();
        int i11 = aVar.f28488j;
        try {
            if (i11 == 0) {
                wc.s.b(obj);
                aVar.f28486h = th;
                aVar.f28488j = 1;
                if (qVar.invoke(dVar, th, aVar) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = (Throwable) aVar.f28486h;
                wc.s.b(obj);
            }
            return g0.f27756a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                wc.f.a(th2, th);
            }
            throw th2;
        }
    }

    public static final <T> xd.c<T> d(xd.c<? extends T> cVar, id.q<? super d<? super T>, ? super Throwable, ? super zc.f<? super g0>, ? extends Object> qVar) {
        return new b(cVar, qVar);
    }

    public static final <T> xd.c<T> e(xd.c<? extends T> cVar, id.p<? super d<? super T>, ? super zc.f<? super g0>, ? extends Object> pVar) {
        return new c(pVar, cVar);
    }
}
