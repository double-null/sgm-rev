package e3;

import java.util.List;
import rd.PSo.cNMUz;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application.java */
/* JADX INFO: loaded from: classes4.dex */
final class o extends h0.f.d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h0.f.d.a.b f14279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<h0.c> f14280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<h0.c> f14281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Boolean f14282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h0.f.d.a.c f14283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<h0.f.d.a.c> f14284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f14285g;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application.java */
    static final class b extends h0.f.d.a.AbstractC0200a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private h0.f.d.a.b f14286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<h0.c> f14287b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<h0.c> f14288c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Boolean f14289d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private h0.f.d.a.c f14290e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List<h0.f.d.a.c> f14291f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f14292g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private byte f14293h;

        @Override // e3.h0.f.d.a.AbstractC0200a
        public h0.f.d.a a() {
            h0.f.d.a.b bVar;
            if (this.f14293h == 1 && (bVar = this.f14286a) != null) {
                return new o(bVar, this.f14287b, this.f14288c, this.f14289d, this.f14290e, this.f14291f, this.f14292g);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f14286a == null) {
                sb2.append(" execution");
            }
            if ((1 & this.f14293h) == 0) {
                sb2.append(" uiOrientation");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // e3.h0.f.d.a.AbstractC0200a
        public h0.f.d.a.AbstractC0200a b(List<h0.f.d.a.c> list) {
            this.f14291f = list;
            return this;
        }

        @Override // e3.h0.f.d.a.AbstractC0200a
        public h0.f.d.a.AbstractC0200a c(Boolean bool) {
            this.f14289d = bool;
            return this;
        }

        @Override // e3.h0.f.d.a.AbstractC0200a
        public h0.f.d.a.AbstractC0200a d(h0.f.d.a.c cVar) {
            this.f14290e = cVar;
            return this;
        }

        @Override // e3.h0.f.d.a.AbstractC0200a
        public h0.f.d.a.AbstractC0200a e(List<h0.c> list) {
            this.f14287b = list;
            return this;
        }

        @Override // e3.h0.f.d.a.AbstractC0200a
        public h0.f.d.a.AbstractC0200a g(List<h0.c> list) {
            this.f14288c = list;
            return this;
        }

        @Override // e3.h0.f.d.a.AbstractC0200a
        public h0.f.d.a.AbstractC0200a h(int i10) {
            this.f14292g = i10;
            this.f14293h = (byte) (this.f14293h | 1);
            return this;
        }

        b() {
        }

        @Override // e3.h0.f.d.a.AbstractC0200a
        public h0.f.d.a.AbstractC0200a f(h0.f.d.a.b bVar) {
            if (bVar == null) {
                throw new NullPointerException(cNMUz.TplfucAFKxbGR);
            }
            this.f14286a = bVar;
            return this;
        }

        private b(h0.f.d.a aVar) {
            this.f14286a = aVar.f();
            this.f14287b = aVar.e();
            this.f14288c = aVar.g();
            this.f14289d = aVar.c();
            this.f14290e = aVar.d();
            this.f14291f = aVar.b();
            this.f14292g = aVar.h();
            this.f14293h = (byte) 1;
        }
    }

    @Override // e3.h0.f.d.a
    public List<h0.f.d.a.c> b() {
        return this.f14284f;
    }

    @Override // e3.h0.f.d.a
    public Boolean c() {
        return this.f14282d;
    }

    @Override // e3.h0.f.d.a
    public h0.f.d.a.c d() {
        return this.f14283e;
    }

    @Override // e3.h0.f.d.a
    public List<h0.c> e() {
        return this.f14280b;
    }

    public boolean equals(Object obj) {
        List<h0.c> list;
        List<h0.c> list2;
        Boolean bool;
        h0.f.d.a.c cVar;
        List<h0.f.d.a.c> list3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0.f.d.a)) {
            return false;
        }
        h0.f.d.a aVar = (h0.f.d.a) obj;
        return this.f14279a.equals(aVar.f()) && ((list = this.f14280b) != null ? list.equals(aVar.e()) : aVar.e() == null) && ((list2 = this.f14281c) != null ? list2.equals(aVar.g()) : aVar.g() == null) && ((bool = this.f14282d) != null ? bool.equals(aVar.c()) : aVar.c() == null) && ((cVar = this.f14283e) != null ? cVar.equals(aVar.d()) : aVar.d() == null) && ((list3 = this.f14284f) != null ? list3.equals(aVar.b()) : aVar.b() == null) && this.f14285g == aVar.h();
    }

    @Override // e3.h0.f.d.a
    public h0.f.d.a.b f() {
        return this.f14279a;
    }

    @Override // e3.h0.f.d.a
    public List<h0.c> g() {
        return this.f14281c;
    }

    @Override // e3.h0.f.d.a
    public int h() {
        return this.f14285g;
    }

    public int hashCode() {
        int iHashCode = (this.f14279a.hashCode() ^ 1000003) * 1000003;
        List<h0.c> list = this.f14280b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<h0.c> list2 = this.f14281c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f14282d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        h0.f.d.a.c cVar = this.f14283e;
        int iHashCode5 = (iHashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List<h0.f.d.a.c> list3 = this.f14284f;
        return ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.f14285g;
    }

    @Override // e3.h0.f.d.a
    public h0.f.d.a.AbstractC0200a i() {
        return new b(this);
    }

    public String toString() {
        return "Application{execution=" + this.f14279a + ", customAttributes=" + this.f14280b + ", internalKeys=" + this.f14281c + ", background=" + this.f14282d + ", currentProcessDetails=" + this.f14283e + ", appProcessDetails=" + this.f14284f + ", uiOrientation=" + this.f14285g + "}";
    }

    private o(h0.f.d.a.b bVar, List<h0.c> list, List<h0.c> list2, Boolean bool, h0.f.d.a.c cVar, List<h0.f.d.a.c> list3, int i10) {
        this.f14279a = bVar;
        this.f14280b = list;
        this.f14281c = list2;
        this.f14282d = bool;
        this.f14283e = cVar;
        this.f14284f = list3;
        this.f14285g = i10;
    }
}
