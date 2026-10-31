package e3;

import com.facebook.appevents.eventdeactivation.ksG.UomBEukHFwrS;
import java.util.List;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.java */
/* JADX INFO: loaded from: classes4.dex */
final class t extends h0.f.d.a.b.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f14334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<h0.f.d.a.b.e.AbstractC0208b> f14335c;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.java */
    static final class b extends h0.f.d.a.b.e.AbstractC0207a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f14336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f14337b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<h0.f.d.a.b.e.AbstractC0208b> f14338c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte f14339d;

        b() {
        }

        @Override // e3.h0.f.d.a.b.e.AbstractC0207a
        public h0.f.d.a.b.e.AbstractC0207a b(List<h0.f.d.a.b.e.AbstractC0208b> list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f14338c = list;
            return this;
        }

        @Override // e3.h0.f.d.a.b.e.AbstractC0207a
        public h0.f.d.a.b.e.AbstractC0207a c(int i10) {
            this.f14337b = i10;
            this.f14339d = (byte) (this.f14339d | 1);
            return this;
        }

        @Override // e3.h0.f.d.a.b.e.AbstractC0207a
        public h0.f.d.a.b.e.AbstractC0207a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f14336a = str;
            return this;
        }

        @Override // e3.h0.f.d.a.b.e.AbstractC0207a
        public h0.f.d.a.b.e a() {
            String str;
            List<h0.f.d.a.b.e.AbstractC0208b> list;
            if (this.f14339d == 1 && (str = this.f14336a) != null && (list = this.f14338c) != null) {
                return new t(str, this.f14337b, list);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f14336a == null) {
                sb2.append(" name");
            }
            if ((1 & this.f14339d) == 0) {
                sb2.append(" importance");
            }
            if (this.f14338c == null) {
                sb2.append(" frames");
            }
            throw new IllegalStateException(UomBEukHFwrS.ioHnO + ((Object) sb2));
        }
    }

    @Override // e3.h0.f.d.a.b.e
    public List<h0.f.d.a.b.e.AbstractC0208b> b() {
        return this.f14335c;
    }

    @Override // e3.h0.f.d.a.b.e
    public int c() {
        return this.f14334b;
    }

    @Override // e3.h0.f.d.a.b.e
    public String d() {
        return this.f14333a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0.f.d.a.b.e)) {
            return false;
        }
        h0.f.d.a.b.e eVar = (h0.f.d.a.b.e) obj;
        return this.f14333a.equals(eVar.d()) && this.f14334b == eVar.c() && this.f14335c.equals(eVar.b());
    }

    public int hashCode() {
        return ((((this.f14333a.hashCode() ^ 1000003) * 1000003) ^ this.f14334b) * 1000003) ^ this.f14335c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f14333a + ", importance=" + this.f14334b + ", frames=" + this.f14335c + "}";
    }

    private t(String str, int i10, List<h0.f.d.a.b.e.AbstractC0208b> list) {
        this.f14333a = str;
        this.f14334b = i10;
        this.f14335c = list;
    }
}
