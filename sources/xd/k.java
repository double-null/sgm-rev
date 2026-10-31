package xd;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.h0;
import ud.b2;
import wc.g0;

/* JADX INFO: compiled from: Errors.kt */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class k {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    public static final class a<T> implements xd.c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ xd.c f28504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ id.q f28505b;

        /* JADX INFO: renamed from: xd.k$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", l = {109, 110}, m = "collect")
        public static final class C0480a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            /* synthetic */ Object f28506h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            int f28507i;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f28509k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f28510l;

            public C0480a(zc.f fVar) {
                super(fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f28506h = obj;
                this.f28507i |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(xd.c cVar, id.q qVar) {
            this.f28504a = cVar;
            this.f28505b = qVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // xd.c
        public Object a(d<? super T> dVar, zc.f<? super g0> fVar) throws Throwable {
            C0480a c0480a;
            a<T> aVar;
            if (fVar instanceof C0480a) {
                c0480a = (C0480a) fVar;
                int i10 = c0480a.f28507i;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c0480a.f28507i = i10 - Integer.MIN_VALUE;
                } else {
                    c0480a = new C0480a(fVar);
                }
            } else {
                c0480a = new C0480a(fVar);
            }
            Object objD = c0480a.f28506h;
            Object objF = ad.d.f();
            int i11 = c0480a.f28507i;
            if (i11 != 0) {
                if (i11 == 1) {
                    dVar = (d) c0480a.f28510l;
                    aVar = (a) c0480a.f28509k;
                    wc.s.b(objD);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wc.s.b(objD);
                }
                return g0.f27756a;
            }
            wc.s.b(objD);
            xd.c cVar = this.f28504a;
            c0480a.f28509k = this;
            c0480a.f28510l = dVar;
            c0480a.f28507i = 1;
            objD = e.d(cVar, dVar, c0480a);
            if (objD == objF) {
                return objF;
            }
            aVar = this;
            Throwable th = (Throwable) objD;
            if (th != null) {
                id.q qVar = aVar.f28505b;
                c0480a.f28509k = null;
                c0480a.f28510l = null;
                c0480a.f28507i = 2;
                kotlin.jvm.internal.r.c(6);
                Object objInvoke = qVar.invoke(dVar, th, c0480a);
                kotlin.jvm.internal.r.c(7);
                if (objInvoke == objF) {
                    return objF;
                }
            }
            return g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: Errors.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", l = {152}, m = "catchImpl")
    static final class b<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f28511h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f28512i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f28513j;

        b(zc.f<? super b> fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f28512i = obj;
            this.f28513j |= Integer.MIN_VALUE;
            return e.d(null, null, this);
        }
    }

    /* JADX INFO: compiled from: Errors.kt */
    static final class c<T> implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d<T> f28514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0<Throwable> f28515b;

        /* JADX INFO: compiled from: Errors.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", l = {154}, m = "emit")
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f28516h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            /* synthetic */ Object f28517i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ c<T> f28518j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f28519k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(c<? super T> cVar, zc.f<? super a> fVar) {
                super(fVar);
                this.f28518j = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f28517i = obj;
                this.f28519k |= Integer.MIN_VALUE;
                return this.f28518j.b(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(d<? super T> dVar, h0<Throwable> h0Var) {
            this.f28514a = dVar;
            this.f28515b = h0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // xd.d
        public final Object b(T t10, zc.f<? super g0> fVar) throws Throwable {
            a aVar;
            c<T> cVar;
            if (fVar instanceof a) {
                aVar = (a) fVar;
                int i10 = aVar.f28519k;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f28519k = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(this, fVar);
                }
            } else {
                aVar = new a(this, fVar);
            }
            Object obj = aVar.f28517i;
            Object objF = ad.d.f();
            int i11 = aVar.f28519k;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar = (c) aVar.f28516h;
                try {
                    wc.s.b(obj);
                    return g0.f27756a;
                } catch (Throwable 
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getCodeVar()" because "ssaVar" is null
                    	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:372)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:335)
                    	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    */
                /*
                    this = this;
                    boolean r0 = r6 instanceof xd.k.c.a
                    if (r0 == 0) goto L13
                    r0 = r6
                    xd.k$c$a r0 = (xd.k.c.a) r0
                    int r1 = r0.f28519k
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f28519k = r1
                    goto L18
                L13:
                    xd.k$c$a r0 = new xd.k$c$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.f28517i
                    java.lang.Object r1 = ad.b.f()
                    int r2 = r0.f28519k
                    r3 = 1
                    if (r2 == 0) goto L37
                    if (r2 != r3) goto L2f
                    java.lang.Object r5 = r0.f28516h
                    xd.k$c r5 = (xd.k.c) r5
                    wc.s.b(r6)     // Catch: java.lang.Throwable -> L2d
                    goto L47
                L2d:
                    r6 = move-exception
                    goto L4c
                L2f:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L37:
                    wc.s.b(r6)
                    xd.d<T> r6 = r4.f28514a     // Catch: java.lang.Throwable -> L4a
                    r0.f28516h = r4     // Catch: java.lang.Throwable -> L4a
                    r0.f28519k = r3     // Catch: java.lang.Throwable -> L4a
                    java.lang.Object r5 = r6.b(r5, r0)     // Catch: java.lang.Throwable -> L4a
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    wc.g0 r5 = wc.g0.f27756a
                    return r5
                L4a:
                    r6 = move-exception
                    r5 = r4
                L4c:
                    kotlin.jvm.internal.h0<java.lang.Throwable> r5 = r5.f28515b
                    r5.f21514a = r6
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: xd.k.c.b(java.lang.Object, zc.f):java.lang.Object");
            }
        }

        public static final <T> xd.c<T> a(xd.c<? extends T> cVar, id.q<? super d<? super T>, ? super Throwable, ? super zc.f<? super g0>, ? extends Object> qVar) {
            return new a(cVar, qVar);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public static final <T> Object b(xd.c<? extends T> cVar, d<? super T> dVar, zc.f<? super Throwable> fVar) throws Throwable {
            b bVar;
            h0 h0Var;
            if (fVar instanceof b) {
                bVar = (b) fVar;
                int i10 = bVar.f28513j;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    bVar.f28513j = i10 - Integer.MIN_VALUE;
                } else {
                    bVar = new b(fVar);
                }
            } else {
                bVar = new b(fVar);
            }
            Object obj = bVar.f28512i;
            Object objF = ad.d.f();
            int i11 = bVar.f28513j;
            if (i11 == 0) {
                wc.s.b(obj);
                h0 h0Var2 = new h0();
                try {
                    d<? super Object> cVar2 = new c<>(dVar, h0Var2);
                    bVar.f28511h = h0Var2;
                    bVar.f28513j = 1;
                    if (cVar.a(cVar2, bVar) == objF) {
                        return objF;
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    h0Var = h0Var2;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h0Var = (h0) bVar.f28511h;
                try {
                    wc.s.b(obj);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            Throwable th3 = (Throwable) h0Var.f21514a;
            if (d(th, th3) || c(th, bVar.getContext())) {
                throw th;
            }
            if (th3 == null) {
                return th;
            }
            if (th instanceof CancellationException) {
                wc.f.a(th3, th);
                throw th3;
            }
            wc.f.a(th, th3);
            throw th;
        }

        private static final boolean c(Throwable th, zc.j jVar) {
            b2 b2Var = (b2) jVar.e(b2.X8);
            if (b2Var == null || !b2Var.isCancelled()) {
                return false;
            }
            return d(th, b2Var.v());
        }

        private static final boolean d(Throwable th, Throwable th2) {
            return th2 != null && kotlin.jvm.internal.t.a(th2, th);
        }
    }
