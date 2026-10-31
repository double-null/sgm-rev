package io.bidmachine.analytics.internal.p;

import io.bidmachine.analytics.ReaderConfig;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import kotlin.collections.n0;
import kotlin.collections.o0;
import kotlin.collections.u;
import od.k;
import ud.p0;
import ud.t1;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f17195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b.a f17196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f17197c;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f17198a;

        public a(e eVar) {
            this.f17198a = eVar;
        }

        @Override // io.bidmachine.analytics.internal.p.b.a
        public b a() {
            return new b(this.f17198a, new f(), p0.a(t1.b(Executors.newSingleThreadExecutor())));
        }
    }

    public d(e eVar, b.a aVar) {
        this.f17195a = eVar;
        this.f17196b = aVar;
    }

    public final void a(io.bidmachine.analytics.internal.n.a.C0295a c0295a) {
        List<ReaderConfig.Rule> listC = c0295a.c();
        ArrayList arrayList = new ArrayList();
        for (ReaderConfig.Rule rule : listC) {
            ReaderConfig.Rule.GeneralRule generalRule = rule instanceof ReaderConfig.Rule.GeneralRule ? (ReaderConfig.Rule.GeneralRule) rule : null;
            if (generalRule != null) {
                arrayList.add(generalRule);
            }
        }
        ArrayList arrayList2 = new ArrayList(u.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ReaderConfig.Rule.GeneralRule) it.next()).getPath());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(k.d(n0.e(u.u(arrayList2, 10)), 16));
        for (Object obj : arrayList2) {
            linkedHashMap.put(obj, this.f17196b.a());
        }
        this.f17197c = o0.u(linkedHashMap);
    }

    public final void b() {
        Map map = this.f17197c;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                ((b) entry.getValue()).a((String) entry.getKey());
            }
        }
    }

    public /* synthetic */ d(e eVar, b.a aVar, int i10, kotlin.jvm.internal.k kVar) {
        this(eVar, (i10 & 2) != 0 ? new a(eVar) : aVar);
    }

    public final void a() {
        Map map = this.f17197c;
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                ((b) ((Map.Entry) it.next()).getValue()).a();
            }
        }
    }

    public final String a(ReaderConfig.Rule rule) throws FileNotFoundException {
        if (rule instanceof ReaderConfig.Rule.GeneralRule) {
            String strB = this.f17195a.b(((ReaderConfig.Rule.GeneralRule) rule).getPath());
            if (strB != null) {
                return strB;
            }
            throw new FileNotFoundException();
        }
        throw new IllegalStateException("Check failed.");
    }
}
