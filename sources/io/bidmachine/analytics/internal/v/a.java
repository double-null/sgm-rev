package io.bidmachine.analytics.internal.v;

import id.p;
import io.bidmachine.analytics.AnalyticsConfig;
import io.bidmachine.analytics.MonitorConfig;
import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.analytics.internal.D.e;
import io.bidmachine.analytics.internal.E.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.b0;
import kotlin.collections.n0;
import kotlin.collections.u;
import kotlin.collections.y;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.t;
import od.k;
import ud.o0;
import ud.p0;
import ud.t2;
import wc.g0;
import wc.s;
import zc.f;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f17387a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d f17388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final o0 f17389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Map f17390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Map f17391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final List f17392f;

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.v.a$a, reason: collision with other inner class name */
    static final class C0309a extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ io.bidmachine.analytics.internal.D.c f17394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f17395c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f17396d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0309a(io.bidmachine.analytics.internal.D.c cVar, String str, List list, f fVar) {
            super(2, fVar);
            this.f17394b = cVar;
            this.f17395c = str;
            this.f17396d = list;
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, f fVar) {
            return ((C0309a) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final f create(Object obj, f fVar) {
            return new C0309a(this.f17394b, this.f17395c, this.f17396d, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ad.d.f();
            if (this.f17393a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            this.f17394b.a(this.f17395c, this.f17396d);
            return g0.f27756a;
        }
    }

    static final class b extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f17398b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f17399c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f17400d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(e eVar, List list, List list2, f fVar) {
            super(2, fVar);
            this.f17398b = eVar;
            this.f17399c = list;
            this.f17400d = list2;
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, f fVar) {
            return ((b) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final f create(Object obj, f fVar) {
            return new b(this.f17398b, this.f17399c, this.f17400d, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ad.d.f();
            if (this.f17397a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            this.f17398b.a(this.f17399c, this.f17400d);
            return g0.f27756a;
        }
    }

    static {
        d dVarA = d.f16823g.a();
        f17388b = dVarA;
        f17389c = p0.a(t2.b(null, 1, null).z(dVarA.b()));
        f17390d = kotlin.collections.o0.h();
        f17391e = kotlin.collections.o0.h();
        f17392f = Collections.synchronizedList(new ArrayList());
    }

    private a() {
    }

    public final void a(io.bidmachine.analytics.internal.p002a.a aVar, AnalyticsConfig analyticsConfig) {
        synchronized (this) {
            io.bidmachine.analytics.internal.D.c cVarD = aVar.b().d();
            e eVarE = aVar.b().e();
            a aVar2 = f17387a;
            aVar2.a(f17390d);
            f17390d = aVar2.a(analyticsConfig, cVarD);
            f17391e = aVar2.a(aVar, analyticsConfig, eVarE);
            aVar2.a(analyticsConfig.getSessionId());
            String sessionId = analyticsConfig.getSessionId();
            List<MonitorConfig> monitorConfigList = analyticsConfig.getMonitorConfigList();
            ArrayList arrayList = new ArrayList(u.u(monitorConfigList, 10));
            Iterator<T> it = monitorConfigList.iterator();
            while (it.hasNext()) {
                arrayList.add(((MonitorConfig) it.next()).getName());
            }
            aVar2.a(cVarD, sessionId, arrayList);
            a aVar3 = f17387a;
            List<ReaderConfig> readerConfigList = analyticsConfig.getReaderConfigList();
            ArrayList arrayList2 = new ArrayList(u.u(readerConfigList, 10));
            Iterator<T> it2 = readerConfigList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((ReaderConfig) it2.next()).getName());
            }
            List<ReaderConfig> readerConfigList2 = analyticsConfig.getReaderConfigList();
            ArrayList<List> arrayList3 = new ArrayList(u.u(readerConfigList2, 10));
            Iterator<T> it3 = readerConfigList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((ReaderConfig) it3.next()).getRules());
            }
            ArrayList arrayList4 = new ArrayList();
            for (List list : arrayList3) {
                ArrayList arrayList5 = new ArrayList(u.u(list, 10));
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    arrayList5.add(io.bidmachine.analytics.internal.g.f.a((ReaderConfig.Rule) it4.next()));
                }
                y.z(arrayList4, arrayList5);
            }
            aVar3.a(eVarE, arrayList2, arrayList4);
            g0 g0Var = g0.f27756a;
        }
    }

    private final void a(Map map) {
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((io.bidmachine.analytics.internal.v.b) it.next()).a();
        }
    }

    private final Map a(AnalyticsConfig analyticsConfig, io.bidmachine.analytics.internal.D.c cVar) {
        List<MonitorConfig> monitorConfigList = analyticsConfig.getMonitorConfigList();
        ArrayList arrayList = new ArrayList();
        for (Object obj : monitorConfigList) {
            if (((MonitorConfig) obj).isReportEnabled()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(u.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new io.bidmachine.analytics.internal.v.b(d.f16823g.a(), new io.bidmachine.analytics.internal.v.b.C0310b((MonitorConfig) it.next(), analyticsConfig.getSessionId(), analyticsConfig.getExtras()), cVar));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(k.d(n0.e(u.u(arrayList2, 10)), 16));
        for (Object obj2 : arrayList2) {
            linkedHashMap.put(((io.bidmachine.analytics.internal.v.b) obj2).b(), obj2);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x00ae  */
    private final Map a(io.bidmachine.analytics.internal.p002a.a aVar, AnalyticsConfig analyticsConfig, e eVar) {
        c cVar;
        io.bidmachine.analytics.internal.y.a.InterfaceC0314a bVar;
        List<ReaderConfig> readerConfigList = analyticsConfig.getReaderConfigList();
        ArrayList arrayList = new ArrayList();
        for (ReaderConfig readerConfig : readerConfigList) {
            switch (readerConfig.getName()) {
                case "aapp":
                    bVar = new io.bidmachine.analytics.internal.z.b(aVar.c().a());
                    cVar = new c(d.f16823g.a(), new c.a(readerConfig, analyticsConfig.getSessionId(), analyticsConfig.getExtras(), bVar), eVar);
                    break;
                case "aexs":
                    bVar = new io.bidmachine.analytics.internal.z.a();
                    cVar = new c(d.f16823g.a(), new c.a(readerConfig, analyticsConfig.getSessionId(), analyticsConfig.getExtras(), bVar), eVar);
                    break;
                case "alog":
                    bVar = new io.bidmachine.analytics.internal.z.d(aVar.c().b());
                    cVar = new c(d.f16823g.a(), new c.a(readerConfig, analyticsConfig.getSessionId(), analyticsConfig.getExtras(), bVar), eVar);
                    break;
                case "apur":
                    bVar = new io.bidmachine.analytics.internal.z.e(aVar.c().c());
                    cVar = new c(d.f16823g.a(), new c.a(readerConfig, analyticsConfig.getSessionId(), analyticsConfig.getExtras(), bVar), eVar);
                    break;
                case "aints":
                    bVar = new io.bidmachine.analytics.internal.z.c(aVar.a().getFilesDir().getParentFile());
                    cVar = new c(d.f16823g.a(), new c.a(readerConfig, analyticsConfig.getSessionId(), analyticsConfig.getExtras(), bVar), eVar);
                    break;
                default:
                    cVar = null;
                    break;
            }
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(k.d(n0.e(u.u(arrayList, 10)), 16));
        for (Object obj : arrayList) {
            linkedHashMap.put(((c) obj).a(), obj);
        }
        return linkedHashMap;
    }

    private final void a(String str) {
        List list = f17392f;
        List listP0 = b0.p0(list);
        list.clear();
        Iterator it = listP0.iterator();
        while (it.hasNext()) {
            f17387a.a(io.bidmachine.analytics.internal.g.d.a((io.bidmachine.analytics.internal.g.d) it.next(), null, null, str, 0L, null, null, 59, null));
        }
    }

    private final void a(io.bidmachine.analytics.internal.D.c cVar, String str, List list) {
        ud.k.d(f17389c, f17388b.c(), null, new C0309a(cVar, str, list, null), 2, null);
    }

    private final void a(e eVar, List list, List list2) {
        ud.k.d(f17389c, f17388b.c(), null, new b(eVar, list, list2, null), 2, null);
    }

    public final void a(io.bidmachine.analytics.internal.g.d dVar) {
        if (t.a(dVar.e(), "")) {
            f17392f.add(dVar);
            return;
        }
        io.bidmachine.analytics.internal.v.b bVar = (io.bidmachine.analytics.internal.v.b) f17390d.get(dVar.d());
        if (bVar != null) {
            bVar.b(dVar);
        }
    }

    public final void a(io.bidmachine.analytics.internal.g.e eVar) {
        a(eVar.d(), kotlin.collections.s.e(eVar));
    }

    public final void a(String str, List list) {
        c cVar = (c) f17391e.get(str);
        if (cVar != null) {
            cVar.b(str, list);
        }
    }
}
