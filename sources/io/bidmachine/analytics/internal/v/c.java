package io.bidmachine.analytics.internal.v;

import com.explorestack.protobuf.Struct;
import id.p;
import io.bidmachine.analytics.ReaderConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.u;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.t;
import ud.k;
import ud.n0;
import ud.o0;
import ud.p0;
import ud.t2;
import ud.v0;
import wc.g0;
import wc.r;
import wc.s;
import zc.f;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f17432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.bidmachine.analytics.internal.D.e f17433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f17434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o0 f17435d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ReaderConfig f17436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f17437b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Struct f17438c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final io.bidmachine.analytics.internal.y.a.InterfaceC0314a f17439d;

        public a(ReaderConfig readerConfig, String str, Struct struct, io.bidmachine.analytics.internal.y.a.InterfaceC0314a interfaceC0314a) {
            this.f17436a = readerConfig;
            this.f17437b = str;
            this.f17438c = struct;
            this.f17439d = interfaceC0314a;
        }

        public final io.bidmachine.analytics.internal.y.a.InterfaceC0314a a() {
            return this.f17439d;
        }

        public final Struct b() {
            return this.f17438c;
        }

        public final ReaderConfig c() {
            return this.f17436a;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f17440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f17441b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f17443d;

        b(f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f17441b = obj;
            this.f17443d |= Integer.MIN_VALUE;
            Object objA = c.this.a((String) null, this);
            return objA == ad.d.f() ? objA : r.b(objA);
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.v.c$c, reason: collision with other inner class name */
    static final class C0311c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f17444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f17445b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f17447d;

        C0311c(f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f17445b = obj;
            this.f17447d |= Integer.MIN_VALUE;
            return c.this.a((List) null, this);
        }
    }

    static final class d extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17448a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f17450c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(List list, f fVar) {
            super(2, fVar);
            this.f17450c = list;
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, f fVar) {
            return ((d) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final f create(Object obj, f fVar) {
            return c.this.new d(this.f17450c, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objA;
            Object objF = ad.d.f();
            int i10 = this.f17448a;
            if (i10 == 0) {
                s.b(obj);
                io.bidmachine.analytics.internal.y.a aVar = new io.bidmachine.analytics.internal.y.a(c.this.f17432a.c().getUrl(), c.this.f17432a.c().getName(), c.this.f17432a.b(), this.f17450c, c.this.f17432a.a(), null, 32, null);
                this.f17448a = 1;
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
            c cVar = c.this;
            List list = this.f17450c;
            if (r.n(objA)) {
                io.bidmachine.analytics.internal.D.e eVar = cVar.f17433b;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((io.bidmachine.analytics.internal.g.e) obj2).b() != null) {
                        arrayList.add(obj2);
                    }
                }
                eVar.b(arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list) {
                    if (((io.bidmachine.analytics.internal.g.e) obj3).b() == null) {
                        arrayList2.add(obj3);
                    }
                }
                cVar.f17433b.c(arrayList2);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    cVar.a((io.bidmachine.analytics.internal.g.e) it.next());
                }
            }
            c cVar2 = c.this;
            List list2 = this.f17450c;
            if (r.g(objA) != null) {
                cVar2.f17433b.c(list2);
            }
            return r.b(objA);
        }
    }

    static final class e extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f17451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f17452b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f17454d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f17455e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, List list, f fVar) {
            super(2, fVar);
            this.f17454d = str;
            this.f17455e = list;
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, f fVar) {
            return ((e) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final f create(Object obj, f fVar) {
            return c.this.new e(this.f17454d, this.f17455e, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            List arrayList;
            Object objF = ad.d.f();
            int i10 = this.f17452b;
            if (i10 != 0) {
                if (i10 == 1) {
                    arrayList = (List) this.f17451a;
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
            s.b(obj);
            arrayList = new ArrayList();
            c cVar = c.this;
            String str = this.f17454d;
            List list = this.f17455e;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (((io.bidmachine.analytics.internal.g.e) obj2).b() != null) {
                    arrayList2.add(obj2);
                }
            }
            cVar.a(str, arrayList2);
            List<io.bidmachine.analytics.internal.g.e> list2 = this.f17455e;
            c cVar2 = c.this;
            for (io.bidmachine.analytics.internal.g.e eVar : list2) {
                if (r.k(cVar2.a(eVar))) {
                    arrayList.add(eVar);
                }
            }
            c cVar3 = c.this;
            String str2 = this.f17454d;
            this.f17451a = arrayList;
            this.f17452b = 1;
            if (cVar3.a(str2, this) == objF) {
                return objF;
            }
            if (!arrayList.isEmpty()) {
                c cVar4 = c.this;
                this.f17451a = null;
                this.f17452b = 2;
                if (cVar4.a(arrayList, this) == objF) {
                    return objF;
                }
            }
            return g0.f27756a;
        }
    }

    public c(io.bidmachine.analytics.internal.E.d dVar, a aVar, io.bidmachine.analytics.internal.D.e eVar) {
        this.f17432a = aVar;
        this.f17433b = eVar;
        this.f17434c = aVar.c().getName();
        this.f17435d = p0.a(new n0("AnalyticsMonitor: " + aVar.c().getName()).z(t2.b(null, 1, null)).z(dVar.c()));
    }

    public final void b(String str, List list) {
        k.d(this.f17435d, null, null, new e(str, list, null), 3, null);
    }

    public final String a() {
        return this.f17434c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(String str, List list) {
        try {
            r.a aVar = r.f27774b;
            io.bidmachine.analytics.internal.D.e eVar = this.f17433b;
            ArrayList arrayList = new ArrayList(u.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((io.bidmachine.analytics.internal.g.e) it.next()).e());
            }
            return r.c(r.b(eVar.a(str, arrayList)));
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            return r.c(s.a(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, f fVar) throws Throwable {
        b bVar;
        Object objA;
        if (fVar instanceof b) {
            bVar = (b) fVar;
            int i10 = bVar.f17443d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f17443d = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(fVar);
            }
        } else {
            bVar = new b(fVar);
        }
        Object obj = bVar.f17441b;
        Object objF = ad.d.f();
        int i11 = bVar.f17443d;
        try {
            if (i11 == 0) {
                s.b(obj);
                r.a aVar = r.f27774b;
                objA = this.f17433b.a(str);
                if (r.n(objA)) {
                    List list = (List) objA;
                    if (!list.isEmpty()) {
                        bVar.f17440a = objA;
                        bVar.f17443d = 1;
                        if (a(list, bVar) == objF) {
                            return objF;
                        }
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objA = bVar.f17440a;
                s.b(obj);
            }
            return r.c(r.b(objA));
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            return r.c(s.a(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(io.bidmachine.analytics.internal.g.e eVar) {
        try {
            r.a aVar = r.f27774b;
            if (eVar.b() != null) {
                return this.f17433b.a(eVar);
            }
            Object objA = this.f17433b.a(eVar.d(), eVar.e());
            if (r.k(objA)) {
                objA = null;
            }
            io.bidmachine.analytics.internal.g.e eVar2 = (io.bidmachine.analytics.internal.g.e) objA;
            if (eVar2 == null) {
                return this.f17433b.a(eVar);
            }
            return this.f17433b.b(eVar.a((62 & 1) != 0 ? eVar.f16898a : eVar2.c(), (62 & 2) != 0 ? eVar.f16899b : null, (62 & 4) != 0 ? eVar.f16900c : 0L, (62 & 8) != 0 ? eVar.f16901d : null, (62 & 16) != 0 ? eVar.f16902e : null, (62 & 32) != 0 ? eVar.f16903f : null, (62 & 64) != 0 ? eVar.f16904g : (this.f17432a.c().getUniqueOnly() && t.a(eVar.a(), eVar2.a())) ? false : true));
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            return r.c(s.a(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(List list, f fVar) throws Throwable {
        C0311c c0311c;
        if (fVar instanceof C0311c) {
            c0311c = (C0311c) fVar;
            int i10 = c0311c.f17447d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0311c.f17447d = i10 - Integer.MIN_VALUE;
            } else {
                c0311c = new C0311c(fVar);
            }
        } else {
            c0311c = new C0311c(fVar);
        }
        Object obj = c0311c.f17445b;
        Object objF = ad.d.f();
        int i11 = c0311c.f17447d;
        if (i11 == 0) {
            s.b(obj);
            Object objA = this.f17433b.a(list);
            if (r.n(objA)) {
                v0 v0VarB = k.b(this.f17435d, null, null, new d(list, null), 3, null);
                c0311c.f17444a = objA;
                c0311c.f17447d = 1;
                if (v0VarB.j0(c0311c) == objF) {
                    return objF;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return g0.f27756a;
    }
}
