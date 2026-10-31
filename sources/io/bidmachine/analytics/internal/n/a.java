package io.bidmachine.analytics.internal.n;

import android.content.Context;
import id.p;
import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.analytics.internal.E.e;
import io.bidmachine.analytics.internal.g.h;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.u;
import ud.b2;
import ud.o0;
import ud.p0;
import ud.t2;
import wc.g0;
import wc.k;
import wc.m;
import wc.r;
import wc.s;
import zc.f;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends io.bidmachine.analytics.internal.h.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k f17148d = m.a(d.f17166a);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b2 f17149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C0295a f17150f;

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.n.a$a, reason: collision with other inner class name */
    public static final class C0295a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f17151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f17152b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final io.bidmachine.analytics.internal.h.c f17153c;

        public C0295a(long j10, List list, io.bidmachine.analytics.internal.h.c cVar) {
            this.f17151a = j10;
            this.f17152b = list;
            this.f17153c = cVar;
        }

        public final io.bidmachine.analytics.internal.h.c a() {
            return this.f17153c;
        }

        public final long b() {
            return this.f17151a;
        }

        public final List c() {
            return this.f17152b;
        }
    }

    static final class b extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f17154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f17155b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f17156c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f17157d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f17158e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ C0295a f17159f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ a f17160g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C0295a c0295a, a aVar, f fVar) {
            super(2, fVar);
            this.f17159f = c0295a;
            this.f17160g = aVar;
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, f fVar) {
            return ((b) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final f create(Object obj, f fVar) {
            b bVar = new b(this.f17159f, this.f17160g, fVar);
            bVar.f17158e = obj;
            return bVar;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0066  */
        /* JADX WARN: Code duplicated, block: B:19:0x007c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:20:0x007d  */
        /* JADX WARN: Code duplicated, block: B:23:0x008a  */
        /* JADX WARN: Code duplicated, block: B:26:0x008f  */
        /* JADX WARN: Code duplicated, block: B:27:0x0092  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00c2 -> B:12:0x0046). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = ad.b.f()
                int r1 = r11.f17157d
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L3d
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r1 = r11.f17158e
                ud.o0 r1 = (ud.o0) r1
                wc.s.b(r12)
                goto L45
            L17:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1f:
                java.lang.Object r1 = r11.f17156c
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r5 = r11.f17155b
                java.util.Collection r5 = (java.util.Collection) r5
                java.lang.Object r6 = r11.f17154a
                io.bidmachine.analytics.internal.n.a r6 = (io.bidmachine.analytics.internal.n.a) r6
                java.lang.Object r7 = r11.f17158e
                ud.o0 r7 = (ud.o0) r7
                wc.s.b(r12)
                wc.r r12 = (wc.r) r12
                java.lang.Object r12 = r12.p()
                r8 = r5
                r5 = r1
                r1 = r0
                r0 = r11
                goto L84
            L3d:
                wc.s.b(r12)
                java.lang.Object r12 = r11.f17158e
                r1 = r12
                ud.o0 r1 = (ud.o0) r1
            L45:
                r12 = r11
            L46:
                boolean r5 = ud.p0.f(r1)
                if (r5 == 0) goto Lc4
                io.bidmachine.analytics.internal.n.a$a r5 = r12.f17159f
                java.util.List r5 = r5.c()
                io.bidmachine.analytics.internal.n.a r6 = r12.f17160g
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.Iterator r5 = r5.iterator()
                r10 = r5
                r5 = r1
                r1 = r10
            L60:
                boolean r8 = r1.hasNext()
                if (r8 == 0) goto L98
                java.lang.Object r8 = r1.next()
                io.bidmachine.analytics.ReaderConfig$Rule r8 = (io.bidmachine.analytics.ReaderConfig.Rule) r8
                r12.f17158e = r5
                r12.f17154a = r6
                r12.f17155b = r7
                r12.f17156c = r1
                r12.f17157d = r3
                java.lang.Object r8 = io.bidmachine.analytics.internal.n.a.a(r6, r8, r12)
                if (r8 != r0) goto L7d
                return r0
            L7d:
                r10 = r0
                r0 = r12
                r12 = r8
                r8 = r7
                r7 = r5
                r5 = r1
                r1 = r10
            L84:
                boolean r9 = wc.r.k(r12)
                if (r9 == 0) goto L8b
                r12 = r4
            L8b:
                io.bidmachine.analytics.internal.h.c$a r12 = (io.bidmachine.analytics.internal.h.c.a) r12
                if (r12 == 0) goto L92
                r8.add(r12)
            L92:
                r12 = r0
                r0 = r1
                r1 = r5
                r5 = r7
                r7 = r8
                goto L60
            L98:
                java.util.List r7 = (java.util.List) r7
                io.bidmachine.analytics.internal.n.a r1 = r12.f17160g
                boolean r1 = r1.c()
                if (r1 == 0) goto Lab
                io.bidmachine.analytics.internal.n.a$a r1 = r12.f17159f
                io.bidmachine.analytics.internal.h.c r1 = r1.a()
                r1.a(r7)
            Lab:
                io.bidmachine.analytics.internal.n.a$a r1 = r12.f17159f
                long r6 = r1.b()
                r12.f17158e = r5
                r12.f17154a = r4
                r12.f17155b = r4
                r12.f17156c = r4
                r12.f17157d = r2
                java.lang.Object r1 = ud.y0.a(r6, r12)
                if (r1 != r0) goto Lc2
                return r0
            Lc2:
                r1 = r5
                goto L46
            Lc4:
                wc.g0 r12 = wc.g0.f27756a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.n.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f17161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f17162b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f17163c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f17165e;

        c(f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f17163c = obj;
            this.f17165e |= Integer.MIN_VALUE;
            Object objB = a.this.b(null, this);
            return objB == ad.d.f() ? objB : r.b(objB);
        }
    }

    static final class d extends u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f17166a = new d();

        d() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o0 invoke() {
            return p0.a(t2.b(null, 1, null).z(io.bidmachine.analytics.internal.E.d.f16823g.a().c()));
        }
    }

    public abstract Object a(ReaderConfig.Rule rule, f fVar);

    public boolean c() {
        return true;
    }

    @Override // io.bidmachine.analytics.internal.h.d
    public void e(Context context) {
        b2 b2Var = this.f17149e;
        if (b2Var != null) {
            b2.a.a(b2Var, null, 1, null);
        }
    }

    @Override // io.bidmachine.analytics.internal.h.d
    public void f(Context context) {
        b2 b2Var = this.f17149e;
        if (b2Var != null) {
            b2.a.a(b2Var, null, 1, null);
        }
        C0295a c0295a = this.f17150f;
        if (c0295a == null) {
            return;
        }
        this.f17149e = ud.k.d(b(), null, null, new b(c0295a, this, null), 3, null);
    }

    @Override // io.bidmachine.analytics.internal.h.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(C0295a c0295a) {
        this.f17150f = c0295a;
    }

    public final o0 b() {
        return (o0) this.f17148d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ReaderConfig.Rule rule, f fVar) throws Throwable {
        c cVar;
        a aVar;
        Object objC;
        h.a aVar2;
        String strA;
        if (fVar instanceof c) {
            cVar = (c) fVar;
            int i10 = cVar.f17165e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f17165e = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(fVar);
            }
        } else {
            cVar = new c(fVar);
        }
        Object objA = cVar.f17163c;
        Object objF = ad.d.f();
        int i11 = cVar.f17165e;
        if (i11 == 0) {
            s.b(objA);
            try {
                r.a aVar3 = r.f27774b;
                cVar.f17161a = this;
                cVar.f17162b = rule;
                cVar.f17165e = 1;
                objA = a(rule, cVar);
                if (objA == objF) {
                    return objF;
                }
                aVar = this;
            } catch (Throwable th) {
                th = th;
                aVar = this;
                r.a aVar4 = r.f27774b;
                objC = r.c(s.a(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rule = (ReaderConfig.Rule) cVar.f17162b;
            aVar = (a) cVar.f17161a;
            try {
                s.b(objA);
            } catch (Throwable th2) {
                th = th2;
                r.a aVar5 = r.f27774b;
                objC = r.c(s.a(th));
            }
        }
        objC = r.c((String) objA);
        ReaderConfig.Rule rule2 = rule;
        String str = (String) (r.k(objC) ? null : objC);
        if (str != null) {
            return r.c(new io.bidmachine.analytics.internal.h.c.a(rule2, str, null, 4, null));
        }
        Throwable thG = r.g(objC);
        if (!(thG instanceof CancellationException)) {
            if (thG instanceof FileNotFoundException) {
                aVar2 = h.a.READER_NO_CONTENT;
            } else if (thG instanceof SecurityException) {
                aVar2 = h.a.READER_NO_ACCESS;
            } else {
                aVar2 = thG instanceof IllegalStateException ? h.a.READER_BAD_CONTENT : h.a.READER_INVALID;
            }
            if (thG == null || (strA = e.a(thG)) == null) {
                strA = "";
            }
            return r.c(new io.bidmachine.analytics.internal.h.c.a(rule2, null, new h(aVar.a(), aVar2, strA), 2, null));
        }
        throw thG;
    }
}
