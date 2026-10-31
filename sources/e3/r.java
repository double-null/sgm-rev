package e3;

import java.util.List;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.java */
/* JADX INFO: loaded from: classes4.dex */
final class r extends h0.f.d.a.b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<h0.f.d.a.b.e.AbstractC0208b> f14317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h0.f.d.a.b.c f14318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f14319e;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.java */
    static final class b extends h0.f.d.a.b.c.AbstractC0204a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f14320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f14321b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<h0.f.d.a.b.e.AbstractC0208b> f14322c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private h0.f.d.a.b.c f14323d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f14324e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f14325f;

        b() {
        }

        @Override // e3.h0.f.d.a.b.c.AbstractC0204a
        public h0.f.d.a.b.c a() {
            String str;
            List<h0.f.d.a.b.e.AbstractC0208b> list;
            if (this.f14325f == 1 && (str = this.f14320a) != null && (list = this.f14322c) != null) {
                return new r(str, this.f14321b, list, this.f14323d, this.f14324e);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f14320a == null) {
                sb2.append(" type");
            }
            if (this.f14322c == null) {
                sb2.append(" frames");
            }
            if ((1 & this.f14325f) == 0) {
                sb2.append(" overflowCount");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // e3.h0.f.d.a.b.c.AbstractC0204a
        public h0.f.d.a.b.c.AbstractC0204a b(h0.f.d.a.b.c cVar) {
            this.f14323d = cVar;
            return this;
        }

        @Override // e3.h0.f.d.a.b.c.AbstractC0204a
        public h0.f.d.a.b.c.AbstractC0204a c(List<h0.f.d.a.b.e.AbstractC0208b> list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f14322c = list;
            return this;
        }

        @Override // e3.h0.f.d.a.b.c.AbstractC0204a
        public h0.f.d.a.b.c.AbstractC0204a d(int i10) {
            this.f14324e = i10;
            this.f14325f = (byte) (this.f14325f | 1);
            return this;
        }

        @Override // e3.h0.f.d.a.b.c.AbstractC0204a
        public h0.f.d.a.b.c.AbstractC0204a e(String str) {
            this.f14321b = str;
            return this;
        }

        @Override // e3.h0.f.d.a.b.c.AbstractC0204a
        public h0.f.d.a.b.c.AbstractC0204a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f14320a = str;
            return this;
        }
    }

    @Override // e3.h0.f.d.a.b.c
    public h0.f.d.a.b.c b() {
        return this.f14318d;
    }

    @Override // e3.h0.f.d.a.b.c
    public List<h0.f.d.a.b.e.AbstractC0208b> c() {
        return this.f14317c;
    }

    @Override // e3.h0.f.d.a.b.c
    public int d() {
        return this.f14319e;
    }

    @Override // e3.h0.f.d.a.b.c
    public String e() {
        return this.f14316b;
    }

    public boolean equals(Object obj) {
        String str;
        h0.f.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0.f.d.a.b.c)) {
            return false;
        }
        h0.f.d.a.b.c cVar2 = (h0.f.d.a.b.c) obj;
        return this.f14315a.equals(cVar2.f()) && ((str = this.f14316b) != null ? str.equals(cVar2.e()) : cVar2.e() == null) && this.f14317c.equals(cVar2.c()) && ((cVar = this.f14318d) != null ? cVar.equals(cVar2.b()) : cVar2.b() == null) && this.f14319e == cVar2.d();
    }

    @Override // e3.h0.f.d.a.b.c
    public String f() {
        return this.f14315a;
    }

    public int hashCode() {
        int iHashCode = (this.f14315a.hashCode() ^ 1000003) * 1000003;
        String str = this.f14316b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f14317c.hashCode()) * 1000003;
        h0.f.d.a.b.c cVar = this.f14318d;
        return ((iHashCode2 ^ (cVar != null ? cVar.hashCode() : 0)) * 1000003) ^ this.f14319e;
    }

    public String toString() {
        return "Exception{type=" + this.f14315a + ", reason=" + this.f14316b + ", frames=" + this.f14317c + ", causedBy=" + this.f14318d + ", overflowCount=" + this.f14319e + "}";
    }

    private r(String str, String str2, List<h0.f.d.a.b.e.AbstractC0208b> list, h0.f.d.a.b.c cVar, int i10) {
        this.f14315a = str;
        this.f14316b = str2;
        this.f14317c = list;
        this.f14318d = cVar;
        this.f14319e = i10;
    }
}
