package wd;

import ud.o0;
import wc.g0;

/* JADX INFO: compiled from: Channels.kt */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class n {

    /* JADX INFO: compiled from: Channels.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", l = {39}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements id.p<o0, zc.f<? super k<? extends g0>>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f27852h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private /* synthetic */ Object f27853i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ v<E> f27854j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ E f27855k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(v<? super E> vVar, E e10, zc.f<? super a> fVar) {
            super(2, fVar);
            this.f27854j = vVar;
            this.f27855k = e10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            a aVar = new a(this.f27854j, this.f27855k, fVar);
            aVar.f27853i = obj;
            return aVar;
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f<? super k<g0>> fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

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
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objC;
            Object objF = ad.d.f();
            int i10 = this.f27852h;
            try {
                if (i10 == 0) {
                    wc.s.b(obj);
                    v<E> vVar = this.f27854j;
                    E e10 = this.f27855k;
                    wc.r.a aVar = wc.r.f27774b;
                    this.f27852h = 1;
                    if (vVar.j(e10, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wc.s.b(obj);
                }
                objC = wc.r.c(g0.f27756a);
            } catch (Throwable th) {
                wc.r.a aVar2 = wc.r.f27774b;
                objC = wc.r.c(wc.s.a(th));
            }
            return k.b(wc.r.n(objC) ? k.f27846b.c(g0.f27756a) : k.f27846b.a(wc.r.g(objC)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> Object a(v<? super E> vVar, E e10) {
        Object objI = vVar.i(e10);
        if (objI instanceof k.c) {
            return ((k) ud.j.b(null, new a(vVar, e10, null), 1, null)).k();
        }
        return k.f27846b.c(g0.f27756a);
    }
}
