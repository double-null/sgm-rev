package yd;

import wc.g0;
import zd.l0;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
final class t<T> implements xd.d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zc.j f28909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f28910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final id.p<T, zc.f<? super g0>, Object> f28911c;

    /* JADX INFO: compiled from: ChannelFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", l = {208}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements id.p<T, zc.f<? super g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f28912h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f28913i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ xd.d<T> f28914j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(xd.d<? super T> dVar, zc.f<? super a> fVar) {
            super(2, fVar);
            this.f28914j = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            a aVar = new a(this.f28914j, fVar);
            aVar.f28913i = obj;
            return aVar;
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T t10, zc.f<? super g0> fVar) {
            return ((a) create(t10, fVar)).invokeSuspend(g0.f27756a);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type zc.f to yd.t$a for r3v1 'this'  zc.f
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = ad.b.f()
                int r1 = r3.f28912h
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                wc.s.b(r4)
                goto L27
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                wc.s.b(r4)
                java.lang.Object r4 = r3.f28913i
                xd.d<T> r1 = r3.f28914j
                r3.f28912h = r2
                java.lang.Object r4 = r1.b(r4, r3)
                if (r4 != r0) goto L27
                return r0
            L27:
                wc.g0 r4 = wc.g0.f27756a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: yd.t.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public t(xd.d<? super T> dVar, zc.j jVar) {
        this.f28909a = jVar;
        this.f28910b = l0.g(jVar);
        this.f28911c = new a(dVar, null);
    }

    @Override // xd.d
    public Object b(T t10, zc.f<? super g0> fVar) {
        Object objB = e.b(this.f28909a, t10, this.f28910b, this.f28911c, fVar);
        return objB == ad.d.f() ? objB : g0.f27756a;
    }
}
