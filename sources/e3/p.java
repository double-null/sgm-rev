package e3;

import com.android.billingclient.gp.VRfCTjjLv;
import java.util.List;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution.java */
/* JADX INFO: loaded from: classes4.dex */
final class p extends h0.f.d.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<h0.f.d.a.b.e> f14294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h0.f.d.a.b.c f14295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h0.a f14296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h0.e f14297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h0.f.d.a.b.AbstractC0205d f14298e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<h0.f.d.a.b.AbstractC0201a> f14299f;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution.java */
    static final class b extends h0.f.d.a.b.AbstractC0203b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<h0.f.d.a.b.e> f14300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private h0.f.d.a.b.c f14301b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private h0.a f14302c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private h0.e f14303d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private h0.f.d.a.b.AbstractC0205d f14304e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List<h0.f.d.a.b.AbstractC0201a> f14305f;

        @Override // e3.h0.f.d.a.b.AbstractC0203b
        public h0.f.d.a.b a() {
            List<h0.f.d.a.b.AbstractC0201a> list;
            h0.f.d.a.b.AbstractC0205d abstractC0205d = this.f14304e;
            if (abstractC0205d != null && (list = this.f14305f) != null) {
                return new p(this.f14300a, this.f14301b, this.f14302c, this.f14303d, abstractC0205d, list);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f14304e == null) {
                sb2.append(" signal");
            }
            if (this.f14305f == null) {
                sb2.append(" binaries");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // e3.h0.f.d.a.b.AbstractC0203b
        public h0.f.d.a.b.AbstractC0203b b(h0.a aVar) {
            this.f14302c = aVar;
            return this;
        }

        @Override // e3.h0.f.d.a.b.AbstractC0203b
        public h0.f.d.a.b.AbstractC0203b c(List<h0.f.d.a.b.AbstractC0201a> list) {
            if (list == null) {
                throw new NullPointerException("Null binaries");
            }
            this.f14305f = list;
            return this;
        }

        @Override // e3.h0.f.d.a.b.AbstractC0203b
        public h0.f.d.a.b.AbstractC0203b d(h0.f.d.a.b.c cVar) {
            this.f14301b = cVar;
            return this;
        }

        @Override // e3.h0.f.d.a.b.AbstractC0203b
        public h0.f.d.a.b.AbstractC0203b e(h0.e eVar) {
            this.f14303d = eVar;
            return this;
        }

        @Override // e3.h0.f.d.a.b.AbstractC0203b
        public h0.f.d.a.b.AbstractC0203b f(h0.f.d.a.b.AbstractC0205d abstractC0205d) {
            if (abstractC0205d == null) {
                throw new NullPointerException("Null signal");
            }
            this.f14304e = abstractC0205d;
            return this;
        }

        @Override // e3.h0.f.d.a.b.AbstractC0203b
        public h0.f.d.a.b.AbstractC0203b g(List<h0.f.d.a.b.e> list) {
            this.f14300a = list;
            return this;
        }

        b() {
        }

        private b(h0.f.d.a.b bVar) {
            this.f14300a = bVar.g();
            this.f14301b = bVar.d();
            this.f14302c = bVar.b();
            this.f14303d = bVar.e();
            this.f14304e = bVar.f();
            this.f14305f = bVar.c();
        }
    }

    @Override // e3.h0.f.d.a.b
    public h0.a b() {
        return this.f14296c;
    }

    @Override // e3.h0.f.d.a.b
    public List<h0.f.d.a.b.AbstractC0201a> c() {
        return this.f14299f;
    }

    @Override // e3.h0.f.d.a.b
    public h0.f.d.a.b.c d() {
        return this.f14295b;
    }

    @Override // e3.h0.f.d.a.b
    public h0.e e() {
        return this.f14297d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0.f.d.a.b)) {
            return false;
        }
        h0.f.d.a.b bVar = (h0.f.d.a.b) obj;
        List<h0.f.d.a.b.e> list = this.f14294a;
        if (list != null ? list.equals(bVar.g()) : bVar.g() == null) {
            h0.f.d.a.b.c cVar = this.f14295b;
            if (cVar != null ? cVar.equals(bVar.d()) : bVar.d() == null) {
                h0.a aVar = this.f14296c;
                if (aVar != null ? aVar.equals(bVar.b()) : bVar.b() == null) {
                    h0.e eVar = this.f14297d;
                    if (eVar != null ? eVar.equals(bVar.e()) : bVar.e() == null) {
                        if (this.f14298e.equals(bVar.f()) && this.f14299f.equals(bVar.c())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // e3.h0.f.d.a.b
    public h0.f.d.a.b.AbstractC0205d f() {
        return this.f14298e;
    }

    @Override // e3.h0.f.d.a.b
    public List<h0.f.d.a.b.e> g() {
        return this.f14294a;
    }

    @Override // e3.h0.f.d.a.b
    public h0.f.d.a.b.AbstractC0203b h() {
        return new b(this);
    }

    public int hashCode() {
        List<h0.f.d.a.b.e> list = this.f14294a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        h0.f.d.a.b.c cVar = this.f14295b;
        int iHashCode2 = (iHashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        h0.a aVar = this.f14296c;
        int iHashCode3 = (iHashCode2 ^ (aVar == null ? 0 : aVar.hashCode())) * 1000003;
        h0.e eVar = this.f14297d;
        return ((((iHashCode3 ^ (eVar != null ? eVar.hashCode() : 0)) * 1000003) ^ this.f14298e.hashCode()) * 1000003) ^ this.f14299f.hashCode();
    }

    private p(List<h0.f.d.a.b.e> list, h0.f.d.a.b.c cVar, h0.a aVar, h0.e eVar, h0.f.d.a.b.AbstractC0205d abstractC0205d, List<h0.f.d.a.b.AbstractC0201a> list2) {
        this.f14294a = list;
        this.f14295b = cVar;
        this.f14296c = aVar;
        this.f14297d = eVar;
        this.f14298e = abstractC0205d;
        this.f14299f = list2;
    }

    public String toString() {
        return "Execution{threads=" + this.f14294a + ", exception=" + this.f14295b + ", appExitInfo=" + this.f14296c + ", profilingManagerInfo=" + this.f14297d + VRfCTjjLv.avoeeSUuwNLo + this.f14298e + ", binaries=" + this.f14299f + "}";
    }
}
