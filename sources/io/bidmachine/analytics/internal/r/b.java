package io.bidmachine.analytics.internal.r;

import id.p;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b0;
import kotlin.collections.j0;
import kotlin.jvm.internal.u;
import od.h;
import org.json.JSONException;
import org.json.JSONObject;
import wc.k;
import wc.m;
import wc.r;
import wc.s;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f17371a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k f17372b = m.a(C0306b.f17377a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final k f17373c = m.a(c.f17378a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final k f17374d = m.a(d.f17379a);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final k f17375e = m.a(a.f17376a);

    static final class a extends u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f17376a = new a();

        a() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.E.e.a("YXV0b1JlbmV3aW5n");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.r.b$b, reason: collision with other inner class name */
    static final class C0306b extends u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0306b f17377a = new C0306b();

        C0306b() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.E.e.a("cHJvZHVjdElk");
        }
    }

    static final class c extends u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f17378a = new c();

        c() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.E.e.a("cHVyY2hhc2VUaW1l");
        }
    }

    static final class d extends u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f17379a = new d();

        d() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.E.e.a("cXVhbnRpdHk=");
        }
    }

    public static final class e implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return yc.b.a(((io.bidmachine.analytics.internal.r.a) obj2).a(), ((io.bidmachine.analytics.internal.r.a) obj).a());
        }
    }

    static final class f extends u implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f17380a = new f();

        f() {
            super(2);
        }

        public final List a(JSONObject jSONObject, boolean z10) {
            return b.f17371a.a(jSONObject, z10);
        }

        @Override // id.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((JSONObject) obj, ((Boolean) obj2).booleanValue());
        }
    }

    static final class g extends u implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f17381a = new g();

        g() {
            super(2);
        }

        public final List a(JSONObject jSONObject, boolean z10) {
            return b.f17371a.b(jSONObject, z10);
        }

        @Override // id.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((JSONObject) obj, ((Boolean) obj2).booleanValue());
        }
    }

    private b() {
    }

    public final String c() {
        return (String) f17373c.getValue();
    }

    public final String d() {
        return (String) f17374d.getValue();
    }

    public final String a() {
        return (String) f17375e.getValue();
    }

    public final String b() {
        return (String) f17372b.getValue();
    }

    private final List b(io.bidmachine.analytics.internal.q.a.C0300a c0300a) {
        return a(c0300a, g.f17381a);
    }

    public final List a(io.bidmachine.analytics.internal.q.a aVar) {
        return b0.i0(b0.c0(b(aVar.e()), a(aVar.c())), new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List b(JSONObject jSONObject, boolean z10) throws JSONException {
        io.bidmachine.analytics.internal.r.a.EnumC0305a enumC0305a;
        String string = jSONObject.getString(b());
        Date date = new Date(jSONObject.getLong(c()));
        int iOptInt = jSONObject.optInt(d(), 1);
        if (jSONObject.optBoolean(a(), false)) {
            enumC0305a = io.bidmachine.analytics.internal.r.a.EnumC0305a.SUBS_AUTO_RENEWABLE;
        } else {
            enumC0305a = io.bidmachine.analytics.internal.r.a.EnumC0305a.SUBS_NON_AUTO_RENEWABLE;
        }
        io.bidmachine.analytics.internal.r.a aVar = new io.bidmachine.analytics.internal.r.a(string, enumC0305a, date, z10);
        h hVarN = od.k.n(0, iOptInt);
        ArrayList arrayList = new ArrayList(kotlin.collections.u.u(hVarN, 10));
        Iterator<Integer> it = hVarN.iterator();
        while (it.hasNext()) {
            ((j0) it).nextInt();
            arrayList.add(io.bidmachine.analytics.internal.r.a.a(aVar, null, null, null, false, 15, null));
        }
        return arrayList;
    }

    private final List a(io.bidmachine.analytics.internal.q.a.C0300a c0300a) {
        return a(c0300a, f.f17380a);
    }

    private final List a(io.bidmachine.analytics.internal.q.a.C0300a c0300a, p pVar) {
        Object objC;
        Object objC2;
        Object objC3;
        Object objC4;
        List listA = c0300a.a();
        ArrayList<JSONObject> arrayList = new ArrayList();
        Iterator it = listA.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            try {
                r.a aVar = r.f27774b;
                objC4 = r.c(new JSONObject(str));
            } catch (Throwable th) {
                r.a aVar2 = r.f27774b;
                objC4 = r.c(s.a(th));
            }
            JSONObject jSONObject = (JSONObject) (r.k(objC4) ? null : objC4);
            if (jSONObject != null) {
                arrayList.add(jSONObject);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (JSONObject jSONObject2 : arrayList) {
            try {
                r.a aVar3 = r.f27774b;
                objC3 = r.c((List) pVar.invoke(jSONObject2, Boolean.TRUE));
            } catch (Throwable th2) {
                r.a aVar4 = r.f27774b;
                objC3 = r.c(s.a(th2));
            }
            if (r.k(objC3)) {
                objC3 = null;
            }
            List list = (List) objC3;
            if (list != null) {
                arrayList2.add(list);
            }
        }
        List<String> listC = c0300a.c();
        ArrayList<JSONObject> arrayList3 = new ArrayList();
        for (String str2 : listC) {
            try {
                r.a aVar5 = r.f27774b;
                objC2 = r.c(new JSONObject(str2));
            } catch (Throwable th3) {
                r.a aVar6 = r.f27774b;
                objC2 = r.c(s.a(th3));
            }
            if (r.k(objC2)) {
                objC2 = null;
            }
            JSONObject jSONObject3 = (JSONObject) objC2;
            if (jSONObject3 != null) {
                arrayList3.add(jSONObject3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (JSONObject jSONObject4 : arrayList3) {
            try {
                r.a aVar7 = r.f27774b;
                objC = r.c((List) pVar.invoke(jSONObject4, Boolean.FALSE));
            } catch (Throwable th4) {
                r.a aVar8 = r.f27774b;
                objC = r.c(s.a(th4));
            }
            if (r.k(objC)) {
                objC = null;
            }
            List list2 = (List) objC;
            if (list2 != null) {
                arrayList4.add(list2);
            }
        }
        return b0.c0(kotlin.collections.u.w(arrayList2), kotlin.collections.u.w(arrayList4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List a(JSONObject jSONObject, boolean z10) throws JSONException {
        String string = jSONObject.getString(b());
        Date date = new Date(jSONObject.getLong(c()));
        int iOptInt = jSONObject.optInt(d(), 1);
        io.bidmachine.analytics.internal.r.a aVar = new io.bidmachine.analytics.internal.r.a(string, io.bidmachine.analytics.internal.r.a.EnumC0305a.INAPP_CONSUMABLE, date, z10);
        h hVarN = od.k.n(0, iOptInt);
        ArrayList arrayList = new ArrayList(kotlin.collections.u.u(hVarN, 10));
        Iterator<Integer> it = hVarN.iterator();
        while (it.hasNext()) {
            ((j0) it).nextInt();
            arrayList.add(io.bidmachine.analytics.internal.r.a.a(aVar, null, null, null, false, 15, null));
        }
        return arrayList;
    }
}
