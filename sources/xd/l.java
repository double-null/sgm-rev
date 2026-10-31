package xd;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import wc.g0;

/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class l {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    public static final class a<T> implements xd.c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ xd.c f28520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ id.p f28521b;

        public a(xd.c cVar, id.p pVar) {
            this.f28520a = cVar;
            this.f28521b = pVar;
        }

        @Override // xd.c
        public Object a(xd.d<? super T> dVar, zc.f<? super g0> fVar) {
            Object objA = this.f28520a.a(new b(new e0(), dVar, this.f28521b), fVar);
            return objA == ad.d.f() ? objA : g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: Limit.kt */
    static final class b<T> implements xd.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e0 f28522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ xd.d<T> f28523b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ id.p<T, zc.f<? super Boolean>, Object> f28524c;

        /* JADX INFO: compiled from: Limit.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", l = {33, 34, 36}, m = "emit")
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f28525h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            Object f28526i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            /* synthetic */ Object f28527j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ b<T> f28528k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f28529l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(b<? super T> bVar, zc.f<? super a> fVar) {
                super(fVar);
                this.f28528k = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f28527j = obj;
                this.f28529l |= Integer.MIN_VALUE;
                return this.f28528k.b(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(e0 e0Var, xd.d<? super T> dVar, id.p<? super T, ? super zc.f<? super Boolean>, ? extends Object> pVar) {
            this.f28522a = e0Var;
            this.f28523b = dVar;
            this.f28524c = pVar;
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0074  */
        /* JADX WARN: Code duplicated, block: B:33:0x0087 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:36:0x008b  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // xd.d
        public final Object b(T t10, zc.f<? super g0> fVar) throws Throwable {
            a aVar;
            b<T> bVar;
            xd.d<T> dVar;
            if (fVar instanceof a) {
                aVar = (a) fVar;
                int i10 = aVar.f28529l;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f28529l = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(this, fVar);
                }
            } else {
                aVar = new a(this, fVar);
            }
            Object objInvoke = aVar.f28527j;
            Object objF = ad.d.f();
            int i11 = aVar.f28529l;
            if (i11 == 0) {
                wc.s.b(objInvoke);
                if (this.f28522a.f21509a) {
                    xd.d<T> dVar2 = this.f28523b;
                    aVar.f28529l = 1;
                    if (dVar2.b(t10, aVar) == objF) {
                        return objF;
                    }
                    return g0.f27756a;
                }
                id.p<T, zc.f<? super Boolean>, Object> pVar = this.f28524c;
                aVar.f28525h = this;
                aVar.f28526i = t10;
                aVar.f28529l = 2;
                objInvoke = pVar.invoke(t10, aVar);
                if (objInvoke == objF) {
                    return objF;
                }
                bVar = this;
                if (!((Boolean) objInvoke).booleanValue()) {
                    return g0.f27756a;
                }
                bVar.f28522a.f21509a = true;
                dVar = bVar.f28523b;
                aVar.f28525h = null;
                aVar.f28526i = null;
                aVar.f28529l = 3;
                if (dVar.b(t10, aVar) == objF) {
                    return objF;
                }
            } else {
                if (i11 == 1) {
                    wc.s.b(objInvoke);
                    return g0.f27756a;
                }
                if (i11 == 2) {
                    t10 = (T) aVar.f28526i;
                    bVar = (b) aVar.f28525h;
                    wc.s.b(objInvoke);
                    if (!((Boolean) objInvoke).booleanValue()) {
                        return g0.f27756a;
                    }
                    bVar.f28522a.f21509a = true;
                    dVar = bVar.f28523b;
                    aVar.f28525h = null;
                    aVar.f28526i = null;
                    aVar.f28529l = 3;
                    if (dVar.b(t10, aVar) == objF) {
                        return objF;
                    }
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wc.s.b(objInvoke);
                }
            }
            return g0.f27756a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    public static final class c<T> implements xd.c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ xd.c f28530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ id.p f28531b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", f = "Limit.kt", l = {120}, m = "collect")
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            /* synthetic */ Object f28532h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            int f28533i;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f28535k;

            public a(zc.f fVar) {
                super(fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f28532h = obj;
                this.f28533i |= Integer.MIN_VALUE;
                return c.this.a(null, this);
            }
        }

        public c(xd.c cVar, id.p pVar) {
            this.f28530a = cVar;
            this.f28531b = pVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // xd.c
        public Object a(xd.d<? super T> dVar, zc.f<? super g0> fVar) throws Throwable {
            a aVar;
            d dVar2;
            if (fVar instanceof a) {
                aVar = (a) fVar;
                int i10 = aVar.f28533i;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f28533i = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(fVar);
                }
            } else {
                aVar = new a(fVar);
            }
            Object obj = aVar.f28532h;
            Object objF = ad.d.f();
            int i11 = aVar.f28533i;
            if (i11 == 0) {
                wc.s.b(obj);
                xd.c cVar = this.f28530a;
                d dVar3 = new d(this.f28531b, dVar);
                try {
                    aVar.f28535k = dVar3;
                    aVar.f28533i = 1;
                    if (cVar.a(dVar3, aVar) == objF) {
                        return objF;
                    }
                } catch (AbortFlowException e10) {
                    e = e10;
                    dVar2 = dVar3;
                    yd.i.a(e, dVar2);
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dVar2 = (d) aVar.f28535k;
                try {
                    wc.s.b(obj);
                } catch (AbortFlowException e11) {
                    e = e11;
                    yd.i.a(e, dVar2);
                }
            }
            return g0.f27756a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Limit.kt */
    public static final class d<T> implements xd.d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ id.p f28536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ xd.d f28537b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1", f = "Limit.kt", l = {Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE}, m = "emit")
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f28538h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            /* synthetic */ Object f28539i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f28540j;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f28542l;

            public a(zc.f fVar) {
                super(fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f28539i = obj;
                this.f28540j |= Integer.MIN_VALUE;
                return d.this.b(null, this);
            }
        }

        public d(id.p pVar, xd.d dVar) {
            this.f28536a = pVar;
            this.f28537b = dVar;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x007e  */
        /* JADX WARN: Code duplicated, block: B:29:0x0081  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // xd.d
        public Object b(T t10, zc.f<? super g0> fVar) throws Throwable {
            a aVar;
            Object obj;
            Object obj2;
            d<T> dVar;
            if (fVar instanceof a) {
                aVar = (a) fVar;
                int i10 = aVar.f28540j;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f28540j = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(fVar);
                }
            } else {
                aVar = new a(fVar);
            }
            Object obj3 = aVar.f28539i;
            Object objF = ad.d.f();
            int i11 = aVar.f28540j;
            boolean z10 = true;
            if (i11 != 0) {
                if (i11 == 1) {
                    Object obj4 = aVar.f28542l;
                    d<T> dVar2 = (d) aVar.f28538h;
                    wc.s.b(obj3);
                    obj2 = obj4;
                    dVar = dVar2;
                    obj = obj3;
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dVar = (d) aVar.f28538h;
                    wc.s.b(obj3);
                }
                if (z10) {
                    return g0.f27756a;
                }
                throw new AbortFlowException(dVar);
            }
            wc.s.b(obj3);
            id.p pVar = this.f28536a;
            aVar.f28538h = this;
            aVar.f28542l = t10;
            aVar.f28540j = 1;
            kotlin.jvm.internal.r.c(6);
            Object objInvoke = pVar.invoke(t10, aVar);
            kotlin.jvm.internal.r.c(7);
            if (objInvoke == objF) {
                return objF;
            }
            obj = objInvoke;
            obj2 = t10;
            dVar = this;
            if (((Boolean) obj).booleanValue()) {
                xd.d dVar3 = dVar.f28537b;
                aVar.f28538h = dVar;
                aVar.f28542l = null;
                aVar.f28540j = 2;
                if (dVar3.b(obj2, aVar) == objF) {
                    return objF;
                }
            } else {
                z10 = false;
            }
            if (z10) {
                return g0.f27756a;
            }
            throw new AbortFlowException(dVar);
        }
    }

    public static final <T> xd.c<T> a(xd.c<? extends T> cVar, id.p<? super T, ? super zc.f<? super Boolean>, ? extends Object> pVar) {
        return new a(cVar, pVar);
    }

    public static final <T> xd.c<T> b(xd.c<? extends T> cVar, id.p<? super T, ? super zc.f<? super Boolean>, ? extends Object> pVar) {
        return new c(cVar, pVar);
    }
}
