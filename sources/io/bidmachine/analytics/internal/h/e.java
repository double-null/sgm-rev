package io.bidmachine.analytics.internal.h;

import android.content.Context;
import id.l;
import io.bidmachine.analytics.AnalyticsConfig;
import io.bidmachine.analytics.Filter;
import io.bidmachine.analytics.MonitorConfig;
import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.analytics.internal.g.h;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.b0;
import kotlin.collections.o0;
import kotlin.collections.t;
import kotlin.collections.u;
import qd.p;
import rd.f0;
import wc.g0;
import wc.r;
import wc.s;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f16938a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f16939b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicBoolean f16940c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final io.bidmachine.analytics.internal.p002a.d f16941d = new io.bidmachine.analytics.internal.p002a.d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Map f16942e = o0.h();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static List f16943f = new ArrayList();

    private static final class b implements io.bidmachine.analytics.internal.h.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.bidmachine.analytics.internal.p002a.a f16948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f16949b;

        public b(io.bidmachine.analytics.internal.p002a.a aVar, String str) {
            this.f16948a = aVar;
            this.f16949b = str;
        }

        @Override // io.bidmachine.analytics.internal.h.c
        public void a(List list) {
            ArrayList arrayList = new ArrayList(u.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                io.bidmachine.analytics.internal.h.c.a aVar = (io.bidmachine.analytics.internal.h.c.a) it.next();
                String str = this.f16949b;
                long jCurrentTimeMillis = this.f16948a.d().currentTimeMillis();
                String strA = aVar.a();
                if (strA == null) {
                    strA = "";
                }
                arrayList.add(new io.bidmachine.analytics.internal.g.e(null, str, jCurrentTimeMillis, strA, io.bidmachine.analytics.internal.g.f.a(aVar.c()), aVar.b(), false, 65, null));
            }
            io.bidmachine.analytics.internal.v.a.f17387a.a(this.f16949b, arrayList);
        }
    }

    static final class c extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f16950a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context) {
            super(0);
            this.f16950a = context;
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            return this.f16950a.getFilesDir().getParentFile();
        }
    }

    static final class d extends kotlin.jvm.internal.u implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16951a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str) {
            super(1);
            this.f16951a = str;
        }

        @Override // id.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.bidmachine.analytics.internal.h.a aVar) {
            return aVar.a(this.f16951a);
        }
    }

    private e() {
    }

    public final void c(io.bidmachine.analytics.internal.p002a.a aVar) {
        if (f16939b.compareAndSet(false, true) && !io.bidmachine.analytics.internal.E.e.a(aVar.a())) {
            f16942e = a(aVar);
        }
    }

    public final void d(io.bidmachine.analytics.internal.p002a.a aVar) {
        if (f16940c.compareAndSet(false, true) && !io.bidmachine.analytics.internal.E.e.a(aVar.a())) {
            f16942e = o0.n(f16942e, b(aVar));
            Iterator it = f16943f.iterator();
            while (it.hasNext()) {
                ((id.a) it.next()).invoke();
            }
            f16943f = new ArrayList();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map b(io.bidmachine.analytics.internal.p002a.a aVar) {
        Object objC;
        Object objC2;
        Object objC3;
        Object objC4;
        Object objC5;
        Object objC6;
        Object objC7;
        Object objC8;
        Context contextA = aVar.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            r.a aVar2 = r.f27774b;
            io.bidmachine.analytics.internal.m.a aVar3 = new io.bidmachine.analytics.internal.m.a(aVar);
            aVar3.a(aVar.a());
            linkedHashMap.put(aVar3.a(), aVar3);
            objC = r.c(g0.f27756a);
        } catch (Throwable th) {
            r.a aVar4 = r.f27774b;
            objC = r.c(s.a(th));
        }
        Throwable thG = r.g(objC);
        if (thG != null) {
            f16943f.add(new f(aVar, "mimp", thG));
        }
        int i10 = 2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        try {
            io.bidmachine.analytics.internal.l.a aVar5 = new io.bidmachine.analytics.internal.l.a(aVar, null, i10, 0 == true ? 1 : 0);
            aVar5.a(aVar.a());
            linkedHashMap.put(aVar5.a(), aVar5);
            objC2 = r.c(g0.f27756a);
        } catch (Throwable th2) {
            r.a aVar6 = r.f27774b;
            objC2 = r.c(s.a(th2));
        }
        Throwable thG2 = r.g(objC2);
        if (thG2 != null) {
            f16943f.add(new f(aVar, "isimp", thG2));
        }
        try {
            io.bidmachine.analytics.internal.k.a aVar7 = new io.bidmachine.analytics.internal.k.a(aVar, null, null, 6, null);
            aVar7.a(aVar.a());
            linkedHashMap.put(aVar7.a(), aVar7);
            objC3 = r.c(g0.f27756a);
        } catch (Throwable th3) {
            r.a aVar8 = r.f27774b;
            objC3 = r.c(s.a(th3));
        }
        Throwable thG3 = r.g(objC3);
        if (thG3 != null) {
            f16943f.add(new f(aVar, "bic", thG3));
        }
        try {
            io.bidmachine.analytics.internal.u.a aVar9 = new io.bidmachine.analytics.internal.u.a(new c(contextA));
            aVar9.a(aVar.a());
            linkedHashMap.put(aVar9.a(), aVar9);
            objC4 = r.c(g0.f27756a);
        } catch (Throwable th4) {
            r.a aVar10 = r.f27774b;
            objC4 = r.c(s.a(th4));
        }
        Throwable thG4 = r.g(objC4);
        if (thG4 != null) {
            f16943f.add(new g(aVar, "aints", thG4));
        }
        try {
            io.bidmachine.analytics.internal.t.a aVar11 = new io.bidmachine.analytics.internal.t.a();
            aVar11.a(aVar.a());
            linkedHashMap.put(aVar11.a(), aVar11);
            objC5 = r.c(g0.f27756a);
        } catch (Throwable th5) {
            r.a aVar12 = r.f27774b;
            objC5 = r.c(s.a(th5));
        }
        Throwable thG5 = r.g(objC5);
        if (thG5 != null) {
            f16943f.add(new g(aVar, "aexs", thG5));
        }
        try {
            io.bidmachine.analytics.internal.p.c cVar = new io.bidmachine.analytics.internal.p.c(aVar, objArr4 == true ? 1 : 0, i10, objArr3 == true ? 1 : 0);
            cVar.a(aVar.a());
            linkedHashMap.put(cVar.a(), cVar);
            objC6 = r.c(g0.f27756a);
        } catch (Throwable th6) {
            r.a aVar13 = r.f27774b;
            objC6 = r.c(s.a(th6));
        }
        Throwable thG6 = r.g(objC6);
        if (thG6 != null) {
            f16943f.add(new g(aVar, "alog", thG6));
        }
        try {
            io.bidmachine.analytics.internal.q.f fVar = new io.bidmachine.analytics.internal.q.f(aVar, objArr2 == true ? 1 : 0, i10, objArr == true ? 1 : 0);
            fVar.a(aVar.a());
            linkedHashMap.put(fVar.a(), fVar);
            objC7 = r.c(g0.f27756a);
        } catch (Throwable th7) {
            r.a aVar14 = r.f27774b;
            objC7 = r.c(s.a(th7));
        }
        Throwable thG7 = r.g(objC7);
        if (thG7 != null) {
            f16943f.add(new g(aVar, "apur", thG7));
        }
        try {
            io.bidmachine.analytics.internal.o.a aVar15 = new io.bidmachine.analytics.internal.o.a(aVar);
            aVar15.a(aVar.a());
            linkedHashMap.put(aVar15.a(), aVar15);
            objC8 = r.c(g0.f27756a);
        } catch (Throwable th8) {
            r.a aVar16 = r.f27774b;
            objC8 = r.c(s.a(th8));
        }
        Throwable thG8 = r.g(objC8);
        if (thG8 != null) {
            f16943f.add(new g(aVar, "aapp", thG8));
        }
        return linkedHashMap;
    }

    public final Map a(io.bidmachine.analytics.internal.p002a.a aVar) {
        return o0.h();
    }

    public final void a(io.bidmachine.analytics.internal.p002a.a aVar, AnalyticsConfig analyticsConfig) {
        a(aVar, analyticsConfig.getSessionId(), f16942e.keySet());
        HashSet hashSet = new HashSet();
        a(aVar, analyticsConfig.getSessionId(), analyticsConfig.getMonitorConfigList(), hashSet);
        a(aVar, analyticsConfig.getReaderConfigList(), hashSet);
        b(aVar, analyticsConfig.getSessionId(), hashSet);
    }

    private static final class a implements io.bidmachine.analytics.internal.h.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.bidmachine.analytics.internal.p002a.a f16944a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f16945b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f16946c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Filter f16947d;

        public a(io.bidmachine.analytics.internal.p002a.a aVar, String str, String str2, Filter filter) {
            this.f16944a = aVar;
            this.f16945b = str;
            this.f16946c = str2;
            this.f16947d = filter;
        }

        @Override // io.bidmachine.analytics.internal.h.b
        public void a(Map map) {
            Filter filter = this.f16947d;
            if (filter == null || e.f16941d.a(filter, map)) {
                io.bidmachine.analytics.internal.v.a.f17387a.a(new io.bidmachine.analytics.internal.g.d(null, this.f16945b, this.f16946c, this.f16944a.d().currentTimeMillis(), map, null, 33, null));
            }
        }

        @Override // io.bidmachine.analytics.internal.h.b
        public void a(h hVar) {
            io.bidmachine.analytics.internal.v.a.f17387a.a(new io.bidmachine.analytics.internal.g.d(null, this.f16945b, this.f16946c, this.f16944a.d().currentTimeMillis(), null, hVar, 17, null));
        }
    }

    public final Map a(io.bidmachine.analytics.internal.g.a aVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : f16942e.entrySet()) {
            String str = (String) entry.getKey();
            io.bidmachine.analytics.internal.h.d dVar = (io.bidmachine.analytics.internal.h.d) entry.getValue();
            if (dVar instanceof io.bidmachine.analytics.internal.j.a) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                io.bidmachine.analytics.internal.j.a aVar2 = (io.bidmachine.analytics.internal.j.a) dVar;
                io.bidmachine.analytics.internal.j.a.b bVarB = aVar2.b();
                if (bVarB != null) {
                    linkedHashMap2.put("imd", Integer.valueOf(bVarB.b()));
                    Float fC = bVarB.c();
                    if (fC != null) {
                        linkedHashMap2.put("wp", Float.valueOf(fC.floatValue()));
                    }
                    String strE = bVarB.e();
                    if (strE != null) {
                        if (!f0.k0(strE)) {
                            linkedHashMap2.put("agency", strE);
                        }
                        List listK = t.k();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : listK) {
                            if (obj instanceof yb.g) {
                                arrayList.add(obj);
                            }
                        }
                    }
                    String strA = bVarB.a();
                    if (strA != null) {
                        if (!f0.k0(strA)) {
                            linkedHashMap2.put("imcurl", strA);
                            if (bVarB.i()) {
                                linkedHashMap2.put("clcurl", strA);
                            }
                        }
                        List listK2 = t.k();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : listK2) {
                            if (obj2 instanceof yb.g) {
                                arrayList2.add(obj2);
                            }
                        }
                    }
                }
                io.bidmachine.analytics.internal.j.a.b bVarA = aVar2.a(aVar);
                if (bVarA != null) {
                    linkedHashMap2.put("imimd", Integer.valueOf(bVarA.b()));
                    Float fC2 = bVarA.c();
                    if (fC2 != null) {
                        linkedHashMap2.put("imwp", Float.valueOf(fC2.floatValue()));
                    }
                    String strE2 = bVarA.e();
                    if (strE2 != null) {
                        if (!f0.k0(strE2)) {
                            linkedHashMap2.put("imagency", strE2);
                        }
                        List listK3 = t.k();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : listK3) {
                            if (obj3 instanceof yb.g) {
                                arrayList3.add(obj3);
                            }
                        }
                    }
                }
                linkedHashMap.put(str, linkedHashMap2);
            }
        }
        return linkedHashMap;
    }

    public final Object a(String str) {
        return qd.r.r(qd.r.w(p.i(b0.E(f16942e.values()), io.bidmachine.analytics.internal.h.a.class), new d(str)));
    }

    private final void a(io.bidmachine.analytics.internal.p002a.a aVar, String str, List list, Set set) {
        Object objC;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MonitorConfig monitorConfig = (MonitorConfig) it.next();
            String name = monitorConfig.getName();
            try {
                r.a aVar2 = r.f27774b;
                io.bidmachine.analytics.internal.h.d dVar = (io.bidmachine.analytics.internal.h.d) f16942e.get(name);
                g0 g0Var = null;
                filter = null;
                Filter filter = null;
                if (dVar != null) {
                    if (dVar instanceof io.bidmachine.analytics.internal.i.a) {
                        Filter filter2 = monitorConfig.getFilter();
                        if (filter2 != null && f16941d.a(filter2)) {
                            filter = filter2;
                        }
                        if (filter == null) {
                            monitorConfig.getFilter();
                        }
                        ((io.bidmachine.analytics.internal.i.a) dVar).a(new io.bidmachine.analytics.internal.i.a.b(str, new a(aVar, name, str, filter), a(monitorConfig.getConfigExtension())));
                    }
                    g0Var = g0.f27756a;
                }
                objC = r.c(g0Var);
            } catch (Throwable th) {
                r.a aVar3 = r.f27774b;
                objC = r.c(s.a(th));
            }
            if (r.n(objC)) {
                set.add(name);
            }
            Throwable thG = r.g(objC);
            if (thG != null) {
                f16938a.a(aVar, name, str, thG);
            }
        }
    }

    private final void b(io.bidmachine.analytics.internal.p002a.a aVar, String str, Set set) {
        Object objC;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            io.bidmachine.analytics.internal.h.d dVar = (io.bidmachine.analytics.internal.h.d) f16942e.get((String) it.next());
            if (dVar != null) {
                try {
                    r.a aVar2 = r.f27774b;
                    dVar.c(aVar.a());
                    objC = r.c(g0.f27756a);
                } catch (Throwable th) {
                    r.a aVar3 = r.f27774b;
                    objC = r.c(s.a(th));
                }
                Throwable thG = r.g(objC);
                if (thG != null) {
                    f16938a.a(aVar, dVar, str, thG);
                }
            }
        }
    }

    private final io.bidmachine.analytics.internal.i.a.InterfaceC0281a a(MonitorConfig.ConfigExtension configExtension) {
        if (configExtension == null || !(configExtension instanceof MonitorConfig.ImpConfigExtension)) {
            return null;
        }
        MonitorConfig.ImpConfigExtension impConfigExtension = (MonitorConfig.ImpConfigExtension) configExtension;
        return new io.bidmachine.analytics.internal.j.a.C0282a(impConfigExtension.getIaaQuery(), impConfigExtension.m385getRecordsTtlUwyO8pc(), null);
    }

    private final void a(io.bidmachine.analytics.internal.p002a.a aVar, List list, Set set) {
        Object objC;
        g0 g0Var;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ReaderConfig readerConfig = (ReaderConfig) it.next();
            String name = readerConfig.getName();
            try {
                r.a aVar2 = r.f27774b;
                io.bidmachine.analytics.internal.h.d dVar = (io.bidmachine.analytics.internal.h.d) f16942e.get(name);
                if (dVar != null) {
                    if (dVar instanceof io.bidmachine.analytics.internal.n.a) {
                        ((io.bidmachine.analytics.internal.n.a) dVar).a((Object) new io.bidmachine.analytics.internal.n.a.C0295a(readerConfig.getInterval(), readerConfig.getRules(), new b(aVar, name)));
                    }
                    g0Var = g0.f27756a;
                } else {
                    g0Var = null;
                }
                objC = r.c(g0Var);
            } catch (Throwable th) {
                r.a aVar3 = r.f27774b;
                objC = r.c(s.a(th));
            }
            if (r.n(objC)) {
                set.add(name);
            }
            Throwable thG = r.g(objC);
            if (thG != null) {
                f16938a.a(aVar, name, thG);
            }
        }
    }

    private final void a(io.bidmachine.analytics.internal.p002a.a aVar, io.bidmachine.analytics.internal.h.d dVar, String str, Throwable th) {
        if (dVar instanceof io.bidmachine.analytics.internal.i.a) {
            a(aVar, dVar.a(), str, th);
        } else if (dVar instanceof io.bidmachine.analytics.internal.n.a) {
            a(aVar, dVar.a(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(io.bidmachine.analytics.internal.p002a.a aVar, String str, String str2, Throwable th) {
        io.bidmachine.analytics.internal.v.a.f17387a.a(new io.bidmachine.analytics.internal.g.d(null, str, str2, aVar.d().currentTimeMillis(), null, new h(str, h.a.MONITOR_INVALID, io.bidmachine.analytics.internal.E.e.a(th)), 17, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(io.bidmachine.analytics.internal.p002a.a aVar, String str, Throwable th) {
        io.bidmachine.analytics.internal.v.a.f17387a.a(new io.bidmachine.analytics.internal.g.e(null, str, aVar.d().currentTimeMillis(), "", new io.bidmachine.analytics.internal.g.e.a.C0280a("", ""), new h(str, h.a.READER_INVALID, io.bidmachine.analytics.internal.E.e.a(th)), false, 65, null));
    }

    private final void a(io.bidmachine.analytics.internal.p002a.a aVar, String str, Set set) {
        Object objC;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            io.bidmachine.analytics.internal.h.d dVar = (io.bidmachine.analytics.internal.h.d) f16942e.get((String) it.next());
            if (dVar != null) {
                try {
                    r.a aVar2 = r.f27774b;
                    dVar.b(aVar.a());
                    objC = r.c(g0.f27756a);
                } catch (Throwable th) {
                    r.a aVar3 = r.f27774b;
                    objC = r.c(s.a(th));
                }
                Throwable thG = r.g(objC);
                if (thG != null) {
                    f16938a.a(aVar, dVar, str, thG);
                }
            }
        }
    }
}
