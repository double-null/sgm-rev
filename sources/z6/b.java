package z6;

import id.p;
import io.bidmachine.protobuf.rendering.Rendering;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.n0;
import kotlin.collections.t0;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import pb.b1;
import pb.c1;
import pb.k1;
import ud.k0;
import ud.o0;
import ud.p0;
import ud.t2;
import vb.k;
import wb.e0;
import wb.w;
import wc.g0;
import wc.m;
import wc.s;

/* JADX INFO: compiled from: AdaptiveResourcesCacheParamsAdapter.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements z6.c<k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k0 f28952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final id.a<xb.a> f28953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wc.k f28954c;

    /* JADX INFO: compiled from: AdaptiveResourcesCacheParamsAdapter.kt */
    static final class a extends u implements id.a<o0> {
        a() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final o0 invoke() {
            return p0.a(t2.b(null, 1, null).z(b.this.f28952a));
        }
    }

    /* JADX INFO: renamed from: z6.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AdaptiveResourcesCacheParamsAdapter.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.cache.AdaptiveResourcesCacheParamsAdapter", f = "AdaptiveResourcesCacheParamsAdapter.kt", l = {73}, m = "getCacheParams")
    static final class C0490b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f28956h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f28957i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f28958j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f28959k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f28960l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f28961m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f28962n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f28964p;

        C0490b(zc.f<? super C0490b> fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f28962n = obj;
            this.f28964p |= Integer.MIN_VALUE;
            return b.this.g(null, 0, null, this);
        }
    }

    /* JADX INFO: compiled from: AdaptiveResourcesCacheParamsAdapter.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.cache.AdaptiveResourcesCacheParamsAdapter", f = "AdaptiveResourcesCacheParamsAdapter.kt", l = {37}, m = "getCacheParams")
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f28965h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f28967j;

        c(zc.f<? super c> fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f28965h = obj;
            this.f28967j |= Integer.MIN_VALUE;
            return b.this.getCacheParams(null, this);
        }
    }

    /* JADX INFO: compiled from: AdaptiveResourcesCacheParamsAdapter.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.cache.AdaptiveResourcesCacheParamsAdapter", f = "AdaptiveResourcesCacheParamsAdapter.kt", l = {45}, m = "getCacheParams")
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f28968h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f28970j;

        d(zc.f<? super d> fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f28968h = obj;
            this.f28970j |= Integer.MIN_VALUE;
            return b.this.i(null, this);
        }
    }

    /* JADX INFO: compiled from: AdaptiveResourcesCacheParamsAdapter.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.cache.AdaptiveResourcesCacheParamsAdapter", f = "AdaptiveResourcesCacheParamsAdapter.kt", l = {57, 59}, m = "getCacheParams")
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f28971h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f28972i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f28973j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f28974k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f28975l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f28976m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f28977n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f28979p;

        e(zc.f<? super e> fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f28977n = obj;
            this.f28979p |= Integer.MIN_VALUE;
            return b.this.h(null, null, this);
        }
    }

    /* JADX INFO: compiled from: AdaptiveResourcesCacheParamsAdapter.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.cache.AdaptiveResourcesCacheParamsAdapter", f = "AdaptiveResourcesCacheParamsAdapter.kt", l = {65, 66}, m = "getCacheParams")
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f28980h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f28981i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f28982j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f28983k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f28984l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f28985m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f28986n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f28988p;

        f(zc.f<? super f> fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f28986n = obj;
            this.f28988p |= Integer.MIN_VALUE;
            return b.this.j(null, null, this);
        }
    }

    /* JADX INFO: compiled from: AdaptiveResourcesCacheParamsAdapter.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.cache.AdaptiveResourcesCacheParamsAdapter", f = "AdaptiveResourcesCacheParamsAdapter.kt", l = {95}, m = "getMetaData")
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f28989h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f28991j;

        g(zc.f<? super g> fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f28989h = obj;
            this.f28991j |= Integer.MIN_VALUE;
            return b.this.n(null, null, this);
        }
    }

    /* JADX INFO: compiled from: AdaptiveResourcesCacheParamsAdapter.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.cache.AdaptiveResourcesCacheParamsAdapter$getMetaData$2$1", f = "AdaptiveResourcesCacheParamsAdapter.kt", l = {94}, m = "invokeSuspend")
    static final class h extends l implements p<o0, zc.f<? super xb.c>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f28992h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ xb.a f28993i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f28994j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(xb.a aVar, String str, zc.f<? super h> fVar) {
            super(2, fVar);
            this.f28993i = aVar;
            this.f28994j = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            return new h(this.f28993i, this.f28994j, fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f<? super xb.c> fVar) {
            return ((h) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f28992h;
            if (i10 == 0) {
                s.b(obj);
                xb.a aVar = this.f28993i;
                String str = this.f28994j;
                this.f28992h = 1;
                obj = aVar.x(str, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return obj;
        }
    }

    public b(k0 ioDispatcher, id.a<xb.a> aVar) {
        t.f(ioDispatcher, "ioDispatcher");
        this.f28952a = ioDispatcher;
        this.f28953b = aVar;
        this.f28954c = m.a(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x0071  */
    /* JADX WARN: Code duplicated, block: B:20:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x008c  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a8 A[LOOP:0: B:23:0x00a2->B:25:0x00a8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x008c -> B:12:0x0048). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object g(java.util.List<pb.a> r20, int r21, xb.a r22, zc.f<? super java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>>> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z6.b.g(java.util.List, int, xb.a, zc.f):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00d7 -> B:30:0x00da). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object h(pb.c r10, xb.a r11, zc.f<? super java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>>> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z6.b.h(pb.c, xb.a, zc.f):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(pb.c cVar, zc.f<? super Map<String, ? extends Object>> fVar) throws Throwable {
        d dVar;
        List list;
        xb.a aVarInvoke;
        Map mapC;
        if (fVar instanceof d) {
            dVar = (d) fVar;
            int i10 = dVar.f28970j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f28970j = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(fVar);
            }
        } else {
            dVar = new d(fVar);
        }
        Object objH = dVar.f28968h;
        Object objF = ad.d.f();
        int i11 = dVar.f28970j;
        boolean z10 = true;
        if (i11 == 0) {
            s.b(objH);
            id.a<xb.a> aVar = this.f28953b;
            if (aVar == null || (aVarInvoke = aVar.invoke()) == null) {
                list = null;
            } else {
                dVar.f28970j = 1;
                objH = h(cVar, aVarInvoke, dVar);
                if (objH == objF) {
                    return objF;
                }
            }
            mapC = n0.c();
            if (list != null && !list.isEmpty()) {
                z10 = false;
            }
            if (!z10) {
                mapC.put("adaptive_resources_cache", list);
            }
            return n0.b(mapC);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(objH);
        list = (List) objH;
        mapC = n0.c();
        if (list != null) {
            z10 = false;
        }
        if (!z10) {
            mapC.put("adaptive_resources_cache", list);
        }
        return n0.b(mapC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(pb.d dVar, xb.a aVar, zc.f<? super List<? extends Map<String, ? extends Object>>> fVar) throws Throwable {
        f fVar2;
        List listC;
        Object objG;
        b bVar;
        pb.d dVar2;
        xb.a aVar2;
        List list;
        List list2;
        List list3;
        List list4;
        if (fVar instanceof f) {
            fVar2 = (f) fVar;
            int i10 = fVar2.f28988p;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar2.f28988p = i10 - Integer.MIN_VALUE;
            } else {
                fVar2 = new f(fVar);
            }
        } else {
            fVar2 = new f(fVar);
        }
        Object obj = fVar2.f28986n;
        Object objF = ad.d.f();
        int i11 = fVar2.f28988p;
        if (i11 != 0) {
            if (i11 == 1) {
                list = (List) fVar2.f28985m;
                list2 = (List) fVar2.f28984l;
                List list5 = (List) fVar2.f28983k;
                aVar2 = (xb.a) fVar2.f28982j;
                dVar2 = (pb.d) fVar2.f28981i;
                bVar = (b) fVar2.f28980h;
                s.b(obj);
                objG = obj;
                listC = list5;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list3 = (List) fVar2.f28981i;
                list4 = (List) fVar2.f28980h;
                s.b(obj);
            }
            list3.addAll((Collection) obj);
            return kotlin.collections.s.a(list4);
        }
        s.b(obj);
        listC = kotlin.collections.s.c();
        List<pb.a> listA = dVar.a();
        int iH = dVar.h();
        fVar2.f28980h = this;
        fVar2.f28981i = dVar;
        fVar2.f28982j = aVar;
        fVar2.f28983k = listC;
        fVar2.f28984l = listC;
        fVar2.f28985m = listC;
        fVar2.f28988p = 1;
        objG = g(listA, iH, aVar, fVar2);
        if (objG == objF) {
            return objF;
        }
        bVar = this;
        dVar2 = dVar;
        aVar2 = aVar;
        list = listC;
        list2 = list;
        list.addAll((Collection) objG);
        List<pb.a> listE = dVar2.e();
        int iH2 = dVar2.h();
        fVar2.f28980h = listC;
        fVar2.f28981i = list2;
        fVar2.f28982j = null;
        fVar2.f28983k = null;
        fVar2.f28984l = null;
        fVar2.f28985m = null;
        fVar2.f28988p = 2;
        Object objG2 = bVar.g(listE, iH2, aVar2, fVar2);
        if (objG2 == objF) {
            return objF;
        }
        List list6 = listC;
        obj = objG2;
        list3 = list2;
        list4 = list6;
        list3.addAll((Collection) obj);
        return kotlin.collections.s.a(list4);
    }

    private final o0 l() {
        return (o0) this.f28954c.getValue();
    }

    private final Set<String> m(pb.a aVar) {
        pb.l lVarC;
        pb.n0 n0VarA;
        b1 b1VarA;
        c1 c1VarA;
        c1 c1VarA2;
        Set setB = t0.b();
        b1 b1VarL = aVar.l();
        if (b1VarL != null && (c1VarA2 = b1VarL.a()) != null) {
            k1 k1Var = (c1VarA2 instanceof k1 ? c1VarA2 : null) != null ? (k1) c1VarA2 : null;
            if (k1Var != null) {
                setB.addAll(k1Var.a());
            }
        }
        String strN = aVar.n();
        if (strN != null) {
            if (!e0.x(strN)) {
                strN = null;
            }
            if (strN != null) {
                setB.add(strN);
            }
        }
        String strK = aVar.k();
        if (strK != null) {
            if (!e0.x(strK)) {
                strK = null;
            }
            if (strK != null) {
                setB.add(strK);
            }
        }
        pb.k kVarA = aVar.c().a();
        if (kVarA != null && (lVarC = kVarA.c()) != null) {
            pb.o0 o0Var = (lVarC instanceof pb.o0 ? lVarC : null) != null ? (pb.o0) lVarC : null;
            if (o0Var != null && (n0VarA = o0Var.a()) != null && (b1VarA = n0VarA.a()) != null && (c1VarA = b1VarA.a()) != null) {
                k1 k1Var2 = (c1VarA instanceof k1 ? c1VarA : null) != null ? (k1) c1VarA : null;
                if (k1Var2 != null) {
                    setB.addAll(k1Var2.a());
                }
            }
        }
        return t0.a(setB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(pb.a aVar, xb.a aVar2, zc.f<? super List<xb.c>> fVar) throws Throwable {
        g gVar;
        if (fVar instanceof g) {
            gVar = (g) fVar;
            int i10 = gVar.f28991j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f28991j = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(fVar);
            }
        } else {
            gVar = new g(fVar);
        }
        Object objA = gVar.f28989h;
        Object objF = ad.d.f();
        int i11 = gVar.f28991j;
        if (i11 == 0) {
            s.b(objA);
            Set<String> setM = m(aVar);
            ArrayList arrayList = new ArrayList(kotlin.collections.u.u(setM, 10));
            Iterator<T> it = setM.iterator();
            while (it.hasNext()) {
                arrayList.add(ud.k.b(l(), null, null, new h(aVar2, (String) it.next(), null), 3, null));
            }
            gVar.f28991j = 1;
            objA = ud.f.a(arrayList, gVar);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(objA);
        }
        return b0.L((Iterable) objA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // z6.c
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Object getCacheParams(k kVar, zc.f<? super Map<String, ? extends Object>> fVar) throws Throwable {
        c cVar;
        pb.c cVarH0;
        if (fVar instanceof c) {
            cVar = (c) fVar;
            int i10 = cVar.f28967j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f28967j = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(fVar);
            }
        } else {
            cVar = new c(fVar);
        }
        Object objI = cVar.f28965h;
        Object objF = ad.d.f();
        int i11 = cVar.f28967j;
        try {
            if (i11 == 0) {
                s.b(objI);
                Object objM = kVar.m("rendering_configuration");
                if (objM != null) {
                    if (((objM instanceof Rendering ? objM : null) != null ? (Rendering) objM : null) != null && (cVarH0 = new k6.b0(kVar).h0()) != null) {
                        cVar.f28967j = 1;
                        objI = i(cVarH0, cVar);
                        if (objI == objF) {
                            return objF;
                        }
                    }
                }
                return kotlin.collections.o0.h();
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(objI);
            Map map = (Map) objI;
            if (map != null) {
                return map;
            }
            return kotlin.collections.o0.h();
        } catch (Exception unused) {
            return kotlin.collections.o0.h();
        }
    }

    public /* synthetic */ b(k0 k0Var, id.a aVar, int i10, kotlin.jvm.internal.k kVar) {
        this((i10 & 1) != 0 ? w.f27717g.a().e() : k0Var, aVar);
    }
}
