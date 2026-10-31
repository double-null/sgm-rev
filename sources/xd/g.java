package xd;

import wc.g0;

/* JADX INFO: compiled from: Channels.kt */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class g {

    /* JADX INFO: compiled from: Channels.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", l = {32, 33}, m = "emitAllImpl$FlowKt__ChannelsKt")
    static final class a<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f28480h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f28481i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f28482j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f28483k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f28484l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f28485m;

        a(zc.f<? super a> fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f28484l = obj;
            this.f28485m |= Integer.MIN_VALUE;
            return g.c(null, null, false, this);
        }
    }

    public static final <T> Object b(d<? super T> dVar, wd.u<? extends T> uVar, zc.f<? super g0> fVar) throws Throwable {
        Object objC = c(dVar, uVar, true, fVar);
        return objC == ad.d.f() ? objC : g0.f27756a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:24:0x0070 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0071  */
    /* JADX WARN: Code duplicated, block: B:28:0x007d A[Catch: all -> 0x009b, TRY_LEAVE, TryCatch #0 {all -> 0x009b, blocks: (B:13:0x0036, B:22:0x0060, B:26:0x0075, B:28:0x007d, B:18:0x0052, B:21:0x005c), top: B:41:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0094  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008f -> B:14:0x0039). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final <T> java.lang.Object c(xd.d<? super T> r6, wd.u<? extends T> r7, boolean r8, zc.f<? super wc.g0> r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof xd.g.a
            if (r0 == 0) goto L13
            r0 = r9
            xd.g$a r0 = (xd.g.a) r0
            int r1 = r0.f28485m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28485m = r1
            goto L18
        L13:
            xd.g$a r0 = new xd.g$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f28484l
            java.lang.Object r1 = ad.b.f()
            int r2 = r0.f28485m
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L56
            if (r2 == r4) goto L44
            if (r2 != r3) goto L3c
            boolean r8 = r0.f28483k
            java.lang.Object r6 = r0.f28482j
            wd.i r6 = (wd.i) r6
            java.lang.Object r7 = r0.f28481i
            wd.u r7 = (wd.u) r7
            java.lang.Object r2 = r0.f28480h
            xd.d r2 = (xd.d) r2
            wc.s.b(r9)     // Catch: java.lang.Throwable -> L9b
        L39:
            r9 = r6
            r6 = r2
            goto L60
        L3c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L44:
            boolean r8 = r0.f28483k
            java.lang.Object r6 = r0.f28482j
            wd.i r6 = (wd.i) r6
            java.lang.Object r7 = r0.f28481i
            wd.u r7 = (wd.u) r7
            java.lang.Object r2 = r0.f28480h
            xd.d r2 = (xd.d) r2
            wc.s.b(r9)     // Catch: java.lang.Throwable -> L9b
            goto L75
        L56:
            wc.s.b(r9)
            xd.e.j(r6)
            wd.i r9 = r7.iterator()     // Catch: java.lang.Throwable -> L9b
        L60:
            r0.f28480h = r6     // Catch: java.lang.Throwable -> L9b
            r0.f28481i = r7     // Catch: java.lang.Throwable -> L9b
            r0.f28482j = r9     // Catch: java.lang.Throwable -> L9b
            r0.f28483k = r8     // Catch: java.lang.Throwable -> L9b
            r0.f28485m = r4     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r2 = r9.b(r0)     // Catch: java.lang.Throwable -> L9b
            if (r2 != r1) goto L71
            return r1
        L71:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L75:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L9b
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L9b
            if (r9 == 0) goto L92
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> L9b
            r0.f28480h = r2     // Catch: java.lang.Throwable -> L9b
            r0.f28481i = r7     // Catch: java.lang.Throwable -> L9b
            r0.f28482j = r6     // Catch: java.lang.Throwable -> L9b
            r0.f28483k = r8     // Catch: java.lang.Throwable -> L9b
            r0.f28485m = r3     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r9 = r2.b(r9, r0)     // Catch: java.lang.Throwable -> L9b
            if (r9 != r1) goto L39
            return r1
        L92:
            if (r8 == 0) goto L98
            r6 = 0
            wd.m.a(r7, r6)
        L98:
            wc.g0 r6 = wc.g0.f27756a
            return r6
        L9b:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L9d
        L9d:
            r9 = move-exception
            if (r8 == 0) goto La3
            wd.m.a(r7, r6)
        La3:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: xd.g.c(xd.d, wd.u, boolean, zc.f):java.lang.Object");
    }
}
