package io.bidmachine.analytics.internal.v;

import com.explorestack.protobuf.Struct;
import id.p;
import io.bidmachine.analytics.MonitorConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.b0;
import kotlin.collections.u;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.k;
import ud.b2;
import ud.n0;
import ud.o0;
import ud.p0;
import ud.t2;
import ud.y0;
import wc.g0;
import wc.r;
import wc.s;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f17401g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0310b f17402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.bidmachine.analytics.internal.D.c f17403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f17404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o0 f17405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b2 f17406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f17407f = new AtomicBoolean(false);

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.v.b$b, reason: collision with other inner class name */
    public static final class C0310b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MonitorConfig f17408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f17409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Struct f17410c;

        public C0310b(MonitorConfig monitorConfig, String str, Struct struct) {
            this.f17408a = monitorConfig;
            this.f17409b = str;
            this.f17410c = struct;
        }

        public final Struct a() {
            return this.f17410c;
        }

        public final MonitorConfig b() {
            return this.f17408a;
        }

        public final String c() {
            return this.f17409b;
        }
    }

    static final class c extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17411a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f17413c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List list, zc.f fVar) {
            super(2, fVar);
            this.f17413c = list;
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f fVar) {
            return ((c) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(Object obj, zc.f fVar) {
            return b.this.new c(this.f17413c, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f17411a;
            if (i10 == 0) {
                s.b(obj);
                b bVar = b.this;
                List list = this.f17413c;
                this.f17411a = 1;
                if (bVar.a(list, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return g0.f27756a;
        }
    }

    static final class d extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17414a;

        d(zc.f fVar) {
            super(2, fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f fVar) {
            return ((d) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(Object obj, zc.f fVar) {
            return b.this.new d(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f17414a;
            if (i10 != 0) {
                if (i10 == 1) {
                    s.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    ((r) obj).p();
                }
                return g0.f27756a;
            }
            s.b(obj);
            long interval = b.this.f17402a.b().getInterval();
            this.f17414a = 1;
            if (y0.a(interval, this) == objF) {
                return objF;
            }
            b bVar = b.this;
            this.f17414a = 2;
            if (bVar.a(0, this) == objF) {
                return objF;
            }
            return g0.f27756a;
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f17416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f17417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f17418c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f17420e;

        e(zc.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f17418c = obj;
            this.f17420e |= Integer.MIN_VALUE;
            return b.this.a((List) null, this);
        }
    }

    static final class f extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17421a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f17423c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(List list, zc.f fVar) {
            super(2, fVar);
            this.f17423c = list;
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f fVar) {
            return ((f) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(Object obj, zc.f fVar) {
            return b.this.new f(this.f17423c, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objA;
            Object objF = ad.d.f();
            int i10 = this.f17421a;
            if (i10 == 0) {
                s.b(obj);
                io.bidmachine.analytics.internal.x.a aVar = new io.bidmachine.analytics.internal.x.a(b.this.f17402a.b().getUrl(), b.this.f17402a.b().getName(), b.this.f17402a.a(), this.f17423c, null, 16, null);
                this.f17421a = 1;
                objA = aVar.a(this);
                if (objA == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                objA = ((r) obj).p();
            }
            b bVar = b.this;
            List list = this.f17423c;
            if (r.n(objA)) {
                bVar.f17403b.b(list);
            }
            b bVar2 = b.this;
            List list2 = this.f17423c;
            if (r.g(objA) != null) {
                bVar2.f17403b.c(list2);
            }
            return r.b(objA);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f17424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f17425b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f17426c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f17428e;

        g(zc.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f17426c = obj;
            this.f17428e |= Integer.MIN_VALUE;
            Object objA = b.this.a(0, this);
            return objA == ad.d.f() ? objA : r.b(objA);
        }
    }

    static final class h extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17429a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ io.bidmachine.analytics.internal.g.d f17431c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(io.bidmachine.analytics.internal.g.d dVar, zc.f fVar) {
            super(2, fVar);
            this.f17431c = dVar;
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f fVar) {
            return ((h) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(Object obj, zc.f fVar) {
            return b.this.new h(this.f17431c, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f17429a;
            if (i10 == 0) {
                s.b(obj);
                if (r.n(b.this.a(this.f17431c))) {
                    b bVar = b.this;
                    int batchSize = bVar.f17402a.b().getBatchSize();
                    this.f17429a = 1;
                    if (bVar.a(batchSize, this) == objF) {
                        return objF;
                    }
                } else {
                    b bVar2 = b.this;
                    List listE = kotlin.collections.s.e(this.f17431c);
                    this.f17429a = 2;
                    if (bVar2.a(listE, this) == objF) {
                        return objF;
                    }
                }
            } else if (i10 == 1) {
                s.b(obj);
                ((r) obj).p();
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return g0.f27756a;
        }
    }

    public b(io.bidmachine.analytics.internal.E.d dVar, C0310b c0310b, io.bidmachine.analytics.internal.D.c cVar) {
        this.f17402a = c0310b;
        this.f17403b = cVar;
        this.f17404c = c0310b.b().getName();
        this.f17405d = p0.a(new n0("AnalyticsMonitor: " + c0310b.b().getName()).z(t2.b(null, 1, null)).z(dVar.c()));
    }

    public final String b() {
        return this.f17404c;
    }

    public final void b(io.bidmachine.analytics.internal.g.d dVar) {
        if (this.f17407f.get()) {
            return;
        }
        ud.k.d(this.f17405d, null, null, new h(dVar, null), 3, null);
    }

    public final void a() {
        if (this.f17407f.compareAndSet(false, true)) {
            Object objA = this.f17403b.a(this.f17402a.b().getName(), this.f17402a.c());
            if (r.n(objA)) {
                ud.k.d(this.f17405d, null, null, new c((List) objA, null), 3, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(io.bidmachine.analytics.internal.g.d dVar) {
        try {
            r.a aVar = r.f27774b;
            return this.f17403b.a(dVar);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            return r.c(s.a(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i10, zc.f fVar) throws Throwable {
        g gVar;
        b bVar;
        Object obj;
        if (fVar instanceof g) {
            gVar = (g) fVar;
            int i11 = gVar.f17428e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f17428e = i11 - Integer.MIN_VALUE;
            } else {
                gVar = new g(fVar);
            }
        } else {
            gVar = new g(fVar);
        }
        Object obj2 = gVar.f17426c;
        Object objF = ad.d.f();
        int i12 = gVar.f17428e;
        try {
            if (i12 == 0) {
                s.b(obj2);
                r.a aVar = r.f27774b;
                Object objA = this.f17403b.a(this.f17402a.b().getName(), this.f17402a.c(), this.f17402a.b().getBatchSize());
                if (r.n(objA)) {
                    List list = (List) objA;
                    if (!list.isEmpty() && list.size() >= i10) {
                        gVar.f17424a = this;
                        gVar.f17425b = objA;
                        gVar.f17428e = 1;
                        if (a(list, gVar) == objF) {
                            return objF;
                        }
                    } else {
                        a(this, false, 1, null);
                    }
                }
                bVar = this;
                obj = objA;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = gVar.f17425b;
                bVar = (b) gVar.f17424a;
                s.b(obj2);
            }
            if (r.g(obj) != null) {
                a(bVar, false, 1, null);
            }
            return r.c(r.b(obj));
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            return r.c(s.a(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(List list, zc.f fVar) throws Throwable {
        e eVar;
        Object objA;
        b bVar;
        Object obj;
        if (fVar instanceof e) {
            eVar = (e) fVar;
            int i10 = eVar.f17420e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f17420e = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(fVar);
            }
        } else {
            eVar = new e(fVar);
        }
        Object obj2 = eVar.f17418c;
        Object objF = ad.d.f();
        int i11 = eVar.f17420e;
        if (i11 == 0) {
            s.b(obj2);
            objA = this.f17403b.a(list);
            if (r.n(objA)) {
                List listF = b0.F(list, this.f17402a.b().getBatchSize());
                ArrayList arrayList = new ArrayList(u.u(listF, 10));
                Iterator it = listF.iterator();
                while (it.hasNext()) {
                    arrayList.add(ud.k.b(this.f17405d, null, null, new f((List) it.next(), null), 3, null));
                }
                eVar.f17416a = this;
                eVar.f17417b = objA;
                eVar.f17420e = 1;
                if (ud.f.a(arrayList, eVar) == objF) {
                    return objF;
                }
                bVar = this;
                obj = objA;
            } else {
                bVar = this;
            }
            if (r.g(objA) != null) {
                bVar.a(true);
            }
            return g0.f27756a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        obj = eVar.f17417b;
        bVar = (b) eVar.f17416a;
        s.b(obj2);
        bVar.a(true);
        objA = obj;
        if (r.g(objA) != null) {
            bVar.a(true);
        }
        return g0.f27756a;
    }

    static /* synthetic */ void a(b bVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        bVar.a(z10);
    }

    private final void a(boolean z10) {
        b2 b2Var;
        if (this.f17407f.get()) {
            return;
        }
        if (z10 || (b2Var = this.f17406e) == null || !b2Var.c()) {
            b2 b2Var2 = this.f17406e;
            if (b2Var2 != null) {
                b2.a.a(b2Var2, null, 1, null);
            }
            this.f17406e = ud.k.d(this.f17405d, null, null, new d(null), 3, null);
        }
    }
}
