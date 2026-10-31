package io.bidmachine.analytics.internal.q;

import java.util.Collection;
import java.util.List;
import kotlin.collections.b0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import wc.k;
import wc.m;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f17212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0300a f17213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0300a f17214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k f17215d = m.a(new c());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f17216e = m.a(new b());

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.q.a$a, reason: collision with other inner class name */
    public static final class C0300a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f17217a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f17218b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f17219c;

        public C0300a(List list, List list2, List list3) {
            this.f17217a = list;
            this.f17218b = list2;
            this.f17219c = list3;
        }

        public final C0300a a(List list, List list2, List list3) {
            return new C0300a(list, list2, list3);
        }

        public final List b() {
            return this.f17219c;
        }

        public final List c() {
            return this.f17218b;
        }

        public final boolean d() {
            return this.f17217a.isEmpty() && this.f17218b.isEmpty() && this.f17219c.isEmpty();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0300a)) {
                return false;
            }
            C0300a c0300a = (C0300a) obj;
            return t.a(this.f17217a, c0300a.f17217a) && t.a(this.f17218b, c0300a.f17218b) && t.a(this.f17219c, c0300a.f17219c);
        }

        public int hashCode() {
            return (((this.f17217a.hashCode() * 31) + this.f17218b.hashCode()) * 31) + this.f17219c.hashCode();
        }

        public String toString() {
            return super.toString();
        }

        public static /* synthetic */ C0300a a(C0300a c0300a, List list, List list2, List list3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = c0300a.f17217a;
            }
            if ((i10 & 2) != 0) {
                list2 = c0300a.f17218b;
            }
            if ((i10 & 4) != 0) {
                list3 = c0300a.f17219c;
            }
            return c0300a.a(list, list2, list3);
        }

        public final List a() {
            return this.f17217a;
        }

        public /* synthetic */ C0300a(List list, List list2, List list3, int i10, kotlin.jvm.internal.k kVar) {
            this((i10 & 1) != 0 ? kotlin.collections.t.k() : list, (i10 & 2) != 0 ? kotlin.collections.t.k() : list2, (i10 & 4) != 0 ? kotlin.collections.t.k() : list3);
        }
    }

    static final class b extends u implements id.a {
        b() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return a.this.d().hashCode() + '_' + b0.V(kotlin.collections.t.n(Integer.valueOf(a.this.c().a().size()), Integer.valueOf(a.this.c().c().size()), Integer.valueOf(a.this.c().b().size()), Integer.valueOf(a.this.e().a().size()), Integer.valueOf(a.this.e().c().size()), Integer.valueOf(a.this.e().b().size())), "_", null, null, 0, null, null, 62, null);
        }
    }

    static final class c extends u implements id.a {
        c() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            a aVar = a.this;
            jSONObject.put("ver", aVar.a());
            jSONObject.put("iaa", new JSONArray((Collection) aVar.c().a()));
            jSONObject.put("iah", new JSONArray((Collection) aVar.c().c()));
            jSONObject.put("iad", new JSONArray((Collection) aVar.c().b()));
            jSONObject.put("sua", new JSONArray((Collection) aVar.e().a()));
            jSONObject.put("suh", new JSONArray((Collection) aVar.e().c()));
            jSONObject.put("sud", new JSONArray((Collection) aVar.e().b()));
            return jSONObject.toString();
        }
    }

    public a(String str, C0300a c0300a, C0300a c0300a2) {
        this.f17212a = str;
        this.f17213b = c0300a;
        this.f17214c = c0300a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String d() {
        return (String) this.f17215d.getValue();
    }

    public final String b() {
        return (String) this.f17216e.getValue();
    }

    public final C0300a c() {
        return this.f17213b;
    }

    public final C0300a e() {
        return this.f17214c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return t.a(this.f17212a, aVar.f17212a) && t.a(this.f17213b, aVar.f17213b) && t.a(this.f17214c, aVar.f17214c);
    }

    public final boolean f() {
        return this.f17213b.d() && this.f17214c.d();
    }

    public int hashCode() {
        return (((this.f17212a.hashCode() * 31) + this.f17213b.hashCode()) * 31) + this.f17214c.hashCode();
    }

    public String toString() {
        return d();
    }

    public final String a() {
        return this.f17212a;
    }
}
