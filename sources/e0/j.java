package e0;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: DataMigrationInitializer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f13591a = new a(null);

    /* JADX INFO: compiled from: DataMigrationInitializer.kt */
    public static final class a {

        /* JADX INFO: renamed from: e0.j$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DataMigrationInitializer.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", l = {33}, m = "invokeSuspend")
        static final class C0184a extends kotlin.coroutines.jvm.internal.l implements id.p<u<T>, zc.f<? super wc.g0>, Object> {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f13592h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            /* synthetic */ Object f13593i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ List<i<T>> f13594j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0184a(List<? extends i<T>> list, zc.f<? super C0184a> fVar) {
                super(2, fVar);
                this.f13594j = list;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f<wc.g0> create(Object obj, zc.f<?> fVar) {
                C0184a c0184a = new C0184a(this.f13594j, fVar);
                c0184a.f13593i = obj;
                return c0184a;
            }

            @Override // id.p
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(u<T> uVar, zc.f<? super wc.g0> fVar) {
                return ((C0184a) create(uVar, fVar)).invokeSuspend(wc.g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = ad.d.f();
                int i10 = this.f13592h;
                if (i10 == 0) {
                    wc.s.b(obj);
                    u uVar = (u) this.f13593i;
                    a aVar = j.f13591a;
                    List<i<T>> list = this.f13594j;
                    this.f13592h = 1;
                    if (aVar.c(list, uVar, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wc.s.b(obj);
                }
                return wc.g0.f27756a;
            }
        }

        /* JADX INFO: compiled from: DataMigrationInitializer.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", l = {42, 57}, m = "runMigrations")
        static final class b<T> extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f13595h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            Object f13596i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            /* synthetic */ Object f13597j;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f13599l;

            b(zc.f<? super b> fVar) {
                super(fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f13597j = obj;
                this.f13599l |= Integer.MIN_VALUE;
                return a.this.c(null, null, this);
            }
        }

        /* JADX INFO: compiled from: DataMigrationInitializer.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", l = {44, 46}, m = "invokeSuspend")
        static final class c extends kotlin.coroutines.jvm.internal.l implements id.p<T, zc.f<? super T>, Object> {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f13600h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            Object f13601i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f13602j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f13603k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            /* synthetic */ Object f13604l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ List<i<T>> f13605m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ List<id.l<zc.f<? super wc.g0>, Object>> f13606n;

            /* JADX INFO: renamed from: e0.j$a$c$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: DataMigrationInitializer.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", l = {45}, m = "invokeSuspend")
            static final class C0185a extends kotlin.coroutines.jvm.internal.l implements id.l<zc.f<? super wc.g0>, Object> {

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                int f13607h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                final /* synthetic */ i<T> f13608i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0185a(i<T> iVar, zc.f<? super C0185a> fVar) {
                    super(1, fVar);
                    this.f13608i = iVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final zc.f<wc.g0> create(zc.f<?> fVar) {
                    return new C0185a(this.f13608i, fVar);
                }

                @Override // id.l
                /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
                public final Object invoke(zc.f<? super wc.g0> fVar) {
                    return ((C0185a) create(fVar)).invokeSuspend(wc.g0.f27756a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objF = ad.d.f();
                    int i10 = this.f13607h;
                    if (i10 == 0) {
                        wc.s.b(obj);
                        i<T> iVar = this.f13608i;
                        this.f13607h = 1;
                        if (iVar.a(this) == objF) {
                            return objF;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wc.s.b(obj);
                    }
                    return wc.g0.f27756a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(List<? extends i<T>> list, List<id.l<zc.f<? super wc.g0>, Object>> list2, zc.f<? super c> fVar) {
                super(2, fVar);
                this.f13605m = list;
                this.f13606n = list2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f<wc.g0> create(Object obj, zc.f<?> fVar) {
                c cVar = new c(this.f13605m, this.f13606n, fVar);
                cVar.f13604l = obj;
                return cVar;
            }

            @Override // id.p
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(T t10, zc.f<? super T> fVar) {
                return ((c) create(t10, fVar)).invokeSuspend(wc.g0.f27756a);
            }

            /* JADX WARN: Code duplicated, block: B:13:0x004e  */
            /* JADX WARN: Code duplicated, block: B:15:0x0064 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:16:0x0065  */
            /* JADX WARN: Code duplicated, block: B:19:0x0072  */
            /* JADX WARN: Code duplicated, block: B:21:0x008b A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:23:0x008e  */
            /* JADX WARN: Code duplicated, block: B:24:0x008f  */
            /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
                java.lang.StackOverflowError
                	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
                	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
                */
            @Override // kotlin.coroutines.jvm.internal.a
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = ad.b.f()
                    int r1 = r10.f13603k
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L3a
                    if (r1 == r3) goto L24
                    if (r1 != r2) goto L1c
                    java.lang.Object r1 = r10.f13600h
                    java.util.Iterator r1 = (java.util.Iterator) r1
                    java.lang.Object r4 = r10.f13604l
                    java.util.List r4 = (java.util.List) r4
                    wc.s.b(r11)
                    r7 = r10
                    goto L8c
                L1c:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L24:
                    java.lang.Object r1 = r10.f13602j
                    java.lang.Object r4 = r10.f13601i
                    e0.i r4 = (e0.i) r4
                    java.lang.Object r5 = r10.f13600h
                    java.util.Iterator r5 = (java.util.Iterator) r5
                    java.lang.Object r6 = r10.f13604l
                    java.util.List r6 = (java.util.List) r6
                    wc.s.b(r11)
                    r7 = r10
                    r9 = r6
                    r6 = r4
                    r4 = r9
                    goto L6a
                L3a:
                    wc.s.b(r11)
                    java.lang.Object r11 = r10.f13604l
                    java.util.List<e0.i<T>> r1 = r10.f13605m
                    java.util.List<id.l<zc.f<? super wc.g0>, java.lang.Object>> r4 = r10.f13606n
                    java.util.Iterator r1 = r1.iterator()
                    r5 = r10
                L48:
                    boolean r6 = r1.hasNext()
                    if (r6 == 0) goto L91
                    java.lang.Object r6 = r1.next()
                    e0.i r6 = (e0.i) r6
                    r5.f13604l = r4
                    r5.f13600h = r1
                    r5.f13601i = r6
                    r5.f13602j = r11
                    r5.f13603k = r3
                    java.lang.Object r7 = r6.b(r11, r5)
                    if (r7 != r0) goto L65
                    return r0
                L65:
                    r9 = r1
                    r1 = r11
                    r11 = r7
                    r7 = r5
                    r5 = r9
                L6a:
                    java.lang.Boolean r11 = (java.lang.Boolean) r11
                    boolean r11 = r11.booleanValue()
                    if (r11 == 0) goto L8e
                    e0.j$a$c$a r11 = new e0.j$a$c$a
                    r8 = 0
                    r11.<init>(r6, r8)
                    r4.add(r11)
                    r7.f13604l = r4
                    r7.f13600h = r5
                    r7.f13601i = r8
                    r7.f13602j = r8
                    r7.f13603k = r2
                    java.lang.Object r11 = r6.c(r1, r7)
                    if (r11 != r0) goto L8f
                    return r0
                L8c:
                    r5 = r7
                    goto L48
                L8e:
                    r11 = r1
                L8f:
                    r1 = r5
                    goto L8c
                L91:
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: e0.j.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:27:0x006f  */
        /* JADX WARN: Code duplicated, block: B:37:0x0098  */
        /* JADX WARN: Code duplicated, block: B:39:0x009b  */
        /* JADX WARN: Code duplicated, block: B:43:0x0081 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0069->B:45:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r9v3, types: [T, java.lang.Throwable] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0086 -> B:25:0x0069). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0089 -> B:25:0x0069). Please report as a decompilation issue!!! */
        public final <T> Object c(List<? extends i<T>> list, u<T> uVar, zc.f<? super wc.g0> fVar) throws Throwable {
            b bVar;
            List list2;
            kotlin.jvm.internal.h0 h0Var;
            Iterator<T> it;
            Throwable th;
            id.l lVar;
            if (fVar instanceof b) {
                bVar = (b) fVar;
                int i10 = bVar.f13599l;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    bVar.f13599l = i10 - Integer.MIN_VALUE;
                } else {
                    bVar = new b(fVar);
                }
            } else {
                bVar = new b(fVar);
            }
            Object obj = bVar.f13597j;
            Object objF = ad.d.f();
            int i11 = bVar.f13599l;
            if (i11 != 0) {
                if (i11 == 1) {
                    list2 = (List) bVar.f13595h;
                    wc.s.b(obj);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) bVar.f13596i;
                    h0Var = (kotlin.jvm.internal.h0) bVar.f13595h;
                    try {
                        wc.s.b(obj);
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
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
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
                        boolean r0 = r9 instanceof e0.j.a.b
                        if (r0 == 0) goto L13
                        r0 = r9
                        e0.j$a$b r0 = (e0.j.a.b) r0
                        int r1 = r0.f13599l
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f13599l = r1
                        goto L18
                    L13:
                        e0.j$a$b r0 = new e0.j$a$b
                        r0.<init>(r9)
                    L18:
                        java.lang.Object r9 = r0.f13597j
                        java.lang.Object r1 = ad.b.f()
                        int r2 = r0.f13599l
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L46
                        if (r2 == r4) goto L3e
                        if (r2 != r3) goto L36
                        java.lang.Object r7 = r0.f13596i
                        java.util.Iterator r7 = (java.util.Iterator) r7
                        java.lang.Object r8 = r0.f13595h
                        kotlin.jvm.internal.h0 r8 = (kotlin.jvm.internal.h0) r8
                        wc.s.b(r9)     // Catch: java.lang.Throwable -> L34
                        goto L69
                    L34:
                        r9 = move-exception
                        goto L82
                    L36:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L3e:
                        java.lang.Object r7 = r0.f13595h
                        java.util.List r7 = (java.util.List) r7
                        wc.s.b(r9)
                        goto L60
                    L46:
                        wc.s.b(r9)
                        java.util.ArrayList r9 = new java.util.ArrayList
                        r9.<init>()
                        e0.j$a$c r2 = new e0.j$a$c
                        r5 = 0
                        r2.<init>(r7, r9, r5)
                        r0.f13595h = r9
                        r0.f13599l = r4
                        java.lang.Object r7 = r8.a(r2, r0)
                        if (r7 != r1) goto L5f
                        return r1
                    L5f:
                        r7 = r9
                    L60:
                        kotlin.jvm.internal.h0 r8 = new kotlin.jvm.internal.h0
                        r8.<init>()
                        java.util.Iterator r7 = r7.iterator()
                    L69:
                        boolean r9 = r7.hasNext()
                        if (r9 == 0) goto L92
                        java.lang.Object r9 = r7.next()
                        id.l r9 = (id.l) r9
                        r0.f13595h = r8     // Catch: java.lang.Throwable -> L34
                        r0.f13596i = r7     // Catch: java.lang.Throwable -> L34
                        r0.f13599l = r3     // Catch: java.lang.Throwable -> L34
                        java.lang.Object r9 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L34
                        if (r9 != r1) goto L69
                        return r1
                    L82:
                        T r2 = r8.f21514a
                        if (r2 != 0) goto L89
                        r8.f21514a = r9
                        goto L69
                    L89:
                        kotlin.jvm.internal.t.c(r2)
                        java.lang.Throwable r2 = (java.lang.Throwable) r2
                        wc.e.a(r2, r9)
                        goto L69
                    L92:
                        T r7 = r8.f21514a
                        java.lang.Throwable r7 = (java.lang.Throwable) r7
                        if (r7 != 0) goto L9b
                        wc.g0 r7 = wc.g0.f27756a
                        return r7
                    L9b:
                        throw r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: e0.j.a.c(java.util.List, e0.u, zc.f):java.lang.Object");
                }

                public final <T> id.p<u<T>, zc.f<? super wc.g0>, Object> b(List<? extends i<T>> migrations) {
                    kotlin.jvm.internal.t.f(migrations, "migrations");
                    return new C0184a(migrations, null);
                }
            }
        }
