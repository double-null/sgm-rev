package e0;

import kotlinx.coroutines.channels.ClosedSendChannelException;
import ud.b2;

/* JADX INFO: compiled from: SimpleActor.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ud.o0 f13581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final id.p<T, zc.f<? super wc.g0>, Object> f13582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wd.g<T> f13583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f13584d;

    /* JADX INFO: compiled from: SimpleActor.kt */
    static final class a extends kotlin.jvm.internal.u implements id.l<Throwable, wc.g0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ id.l<Throwable, wc.g0> f13585d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ i0<T> f13586e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ id.p<T, Throwable, wc.g0> f13587f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(id.l<? super Throwable, wc.g0> lVar, i0<T> i0Var, id.p<? super T, ? super Throwable, wc.g0> pVar) {
            super(1);
            this.f13585d = lVar;
            this.f13586e = i0Var;
            this.f13587f = pVar;
        }

        public final void b(Throwable th) {
            wc.g0 g0Var;
            this.f13585d.invoke(th);
            ((i0) this.f13586e).f13583c.m(th);
            do {
                Object objF = wd.k.f(((i0) this.f13586e).f13583c.l());
                if (objF != null) {
                    this.f13587f.invoke((T) objF, th);
                    g0Var = wc.g0.f27756a;
                } else {
                    g0Var = null;
                }
            } while (g0Var != null);
        }

        @Override // id.l
        public /* bridge */ /* synthetic */ wc.g0 invoke(Throwable th) {
            b(th);
            return wc.g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: SimpleActor.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {121, 121}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.l implements id.p<ud.o0, zc.f<? super wc.g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f13588h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f13589i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ i0<T> f13590j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(i0<T> i0Var, zc.f<? super b> fVar) {
            super(2, fVar);
            this.f13590j = i0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<wc.g0> create(Object obj, zc.f<?> fVar) {
            return new b(this.f13590j, fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ud.o0 o0Var, zc.f<? super wc.g0> fVar) {
            return ((b) create(o0Var, fVar)).invokeSuspend(wc.g0.f27756a);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x005a A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:19:0x005b  */
        /* JADX WARN: Code duplicated, block: B:22:0x006b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x006c  */
        /* JADX WARN: Code duplicated, block: B:26:0x007a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006c -> B:24:0x006e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = ad.b.f()
                int r1 = r7.f13589i
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                wc.s.b(r8)
                r8 = r7
                goto L6e
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                java.lang.Object r1 = r7.f13588h
                id.p r1 = (id.p) r1
                wc.s.b(r8)
                r4 = r1
                r1 = r0
                r0 = r7
                goto L60
            L26:
                wc.s.b(r8)
                e0.i0<T> r8 = r7.f13590j
                e0.e r8 = e0.i0.c(r8)
                int r8 = r8.b()
                if (r8 <= 0) goto L37
                r8 = r3
                goto L38
            L37:
                r8 = 0
            L38:
                if (r8 == 0) goto L7d
                r8 = r7
            L3b:
                e0.i0<T> r1 = r8.f13590j
                ud.o0 r1 = e0.i0.d(r1)
                ud.p0.e(r1)
                e0.i0<T> r1 = r8.f13590j
                id.p r1 = e0.i0.a(r1)
                e0.i0<T> r4 = r8.f13590j
                wd.g r4 = e0.i0.b(r4)
                r8.f13588h = r1
                r8.f13589i = r3
                java.lang.Object r4 = r4.a(r8)
                if (r4 != r0) goto L5b
                return r0
            L5b:
                r6 = r0
                r0 = r8
                r8 = r4
                r4 = r1
                r1 = r6
            L60:
                r5 = 0
                r0.f13588h = r5
                r0.f13589i = r2
                java.lang.Object r8 = r4.invoke(r8, r0)
                if (r8 != r1) goto L6c
                return r1
            L6c:
                r8 = r0
                r0 = r1
            L6e:
                e0.i0<T> r1 = r8.f13590j
                e0.e r1 = e0.i0.c(r1)
                int r1 = r1.a()
                if (r1 != 0) goto L3b
                wc.g0 r8 = wc.g0.f27756a
                return r8
            L7d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: e0.i0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i0(ud.o0 scope, id.l<? super Throwable, wc.g0> onComplete, id.p<? super T, ? super Throwable, wc.g0> onUndeliveredElement, id.p<? super T, ? super zc.f<? super wc.g0>, ? extends Object> consumeMessage) {
        kotlin.jvm.internal.t.f(scope, "scope");
        kotlin.jvm.internal.t.f(onComplete, "onComplete");
        kotlin.jvm.internal.t.f(onUndeliveredElement, "onUndeliveredElement");
        kotlin.jvm.internal.t.f(consumeMessage, "consumeMessage");
        this.f13581a = scope;
        this.f13582b = consumeMessage;
        this.f13583c = wd.j.b(Integer.MAX_VALUE, null, null, 6, null);
        this.f13584d = new e(0);
        b2 b2Var = (b2) scope.q().e(b2.X8);
        if (b2Var != null) {
            b2Var.s(new a(onComplete, this, onUndeliveredElement));
        }
    }

    public final void e(T t10) {
        Object objI = this.f13583c.i(t10);
        if (objI instanceof wd.k.a) {
            Throwable thE = wd.k.e(objI);
            if (thE != null) {
                throw thE;
            }
            throw new ClosedSendChannelException("Channel was closed normally");
        }
        if (!wd.k.i(objI)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (this.f13584d.c() == 0) {
            ud.k.d(this.f13581a, null, null, new b(this, null), 3, null);
        }
    }
}
