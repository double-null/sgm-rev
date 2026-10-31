package e3;

import sc.NfwM.XDucgbzInpQa;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails.java */
/* JADX INFO: loaded from: classes4.dex */
final class v extends h0.f.d.a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f14352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f14353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f14354d;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails.java */
    static final class b extends h0.f.d.a.c.AbstractC0210a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f14355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f14356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f14357c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f14358d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte f14359e;

        b() {
        }

        @Override // e3.h0.f.d.a.c.AbstractC0210a
        public h0.f.d.a.c a() {
            String str;
            if (this.f14359e == 7 && (str = this.f14355a) != null) {
                return new v(str, this.f14356b, this.f14357c, this.f14358d);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f14355a == null) {
                sb2.append(" processName");
            }
            if ((this.f14359e & 1) == 0) {
                sb2.append(" pid");
            }
            if ((this.f14359e & 2) == 0) {
                sb2.append(" importance");
            }
            if ((this.f14359e & 4) == 0) {
                sb2.append(" defaultProcess");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // e3.h0.f.d.a.c.AbstractC0210a
        public h0.f.d.a.c.AbstractC0210a b(boolean z10) {
            this.f14358d = z10;
            this.f14359e = (byte) (this.f14359e | 4);
            return this;
        }

        @Override // e3.h0.f.d.a.c.AbstractC0210a
        public h0.f.d.a.c.AbstractC0210a c(int i10) {
            this.f14357c = i10;
            this.f14359e = (byte) (this.f14359e | 2);
            return this;
        }

        @Override // e3.h0.f.d.a.c.AbstractC0210a
        public h0.f.d.a.c.AbstractC0210a d(int i10) {
            this.f14356b = i10;
            this.f14359e = (byte) (this.f14359e | 1);
            return this;
        }

        @Override // e3.h0.f.d.a.c.AbstractC0210a
        public h0.f.d.a.c.AbstractC0210a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f14355a = str;
            return this;
        }
    }

    @Override // e3.h0.f.d.a.c
    public int b() {
        return this.f14353c;
    }

    @Override // e3.h0.f.d.a.c
    public int c() {
        return this.f14352b;
    }

    @Override // e3.h0.f.d.a.c
    public String d() {
        return this.f14351a;
    }

    @Override // e3.h0.f.d.a.c
    public boolean e() {
        return this.f14354d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0.f.d.a.c)) {
            return false;
        }
        h0.f.d.a.c cVar = (h0.f.d.a.c) obj;
        return this.f14351a.equals(cVar.d()) && this.f14352b == cVar.c() && this.f14353c == cVar.b() && this.f14354d == cVar.e();
    }

    public int hashCode() {
        return ((((((this.f14351a.hashCode() ^ 1000003) * 1000003) ^ this.f14352b) * 1000003) ^ this.f14353c) * 1000003) ^ (this.f14354d ? 1231 : 1237);
    }

    private v(String str, int i10, int i11, boolean z10) {
        this.f14351a = str;
        this.f14352b = i10;
        this.f14353c = i11;
        this.f14354d = z10;
    }

    public String toString() {
        return XDucgbzInpQa.ImuvCVOAmUsWxg + this.f14351a + ", pid=" + this.f14352b + ", importance=" + this.f14353c + ", defaultProcess=" + this.f14354d + "}";
    }
}
