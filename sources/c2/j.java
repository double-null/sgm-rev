package c2;

import java.util.Arrays;
import pb.vBC.NyXuoef;

/* JADX INFO: compiled from: AutoValue_LogEvent.java */
/* JADX INFO: loaded from: classes3.dex */
final class j extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f4608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f4609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f4610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f4611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f4612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f4613f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f4614g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w f4615h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final q f4616i;

    /* JADX INFO: compiled from: AutoValue_LogEvent.java */
    static final class b extends t.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f4617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f4618b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private p f4619c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f4620d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte[] f4621e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f4622f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Long f4623g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private w f4624h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private q f4625i;

        b() {
        }

        @Override // c2.t.a
        public t.a b(p pVar) {
            this.f4619c = pVar;
            return this;
        }

        @Override // c2.t.a
        public t.a c(Integer num) {
            this.f4618b = num;
            return this;
        }

        @Override // c2.t.a
        public t.a d(long j10) {
            this.f4617a = Long.valueOf(j10);
            return this;
        }

        @Override // c2.t.a
        public t.a e(long j10) {
            this.f4620d = Long.valueOf(j10);
            return this;
        }

        @Override // c2.t.a
        public t.a f(q qVar) {
            this.f4625i = qVar;
            return this;
        }

        @Override // c2.t.a
        public t.a g(w wVar) {
            this.f4624h = wVar;
            return this;
        }

        @Override // c2.t.a
        t.a h(byte[] bArr) {
            this.f4621e = bArr;
            return this;
        }

        @Override // c2.t.a
        t.a i(String str) {
            this.f4622f = str;
            return this;
        }

        @Override // c2.t.a
        public t.a j(long j10) {
            this.f4623g = Long.valueOf(j10);
            return this;
        }

        @Override // c2.t.a
        public t a() {
            String str = "";
            if (this.f4617a == null) {
                str = " eventTimeMs";
            }
            if (this.f4620d == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f4623g == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new j(this.f4617a.longValue(), this.f4618b, this.f4619c, this.f4620d.longValue(), this.f4621e, this.f4622f, this.f4623g.longValue(), this.f4624h, this.f4625i);
            }
            throw new IllegalStateException(NyXuoef.XPVjAOga + str);
        }
    }

    @Override // c2.t
    public p b() {
        return this.f4610c;
    }

    @Override // c2.t
    public Integer c() {
        return this.f4609b;
    }

    @Override // c2.t
    public long d() {
        return this.f4608a;
    }

    @Override // c2.t
    public long e() {
        return this.f4611d;
    }

    public boolean equals(Object obj) {
        Integer num;
        p pVar;
        String str;
        w wVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f4608a == tVar.d() && ((num = this.f4609b) != null ? num.equals(tVar.c()) : tVar.c() == null) && ((pVar = this.f4610c) != null ? pVar.equals(tVar.b()) : tVar.b() == null) && this.f4611d == tVar.e()) {
            if (Arrays.equals(this.f4612e, tVar instanceof j ? ((j) tVar).f4612e : tVar.h()) && ((str = this.f4613f) != null ? str.equals(tVar.i()) : tVar.i() == null) && this.f4614g == tVar.j() && ((wVar = this.f4615h) != null ? wVar.equals(tVar.g()) : tVar.g() == null)) {
                q qVar = this.f4616i;
                if (qVar == null) {
                    if (tVar.f() == null) {
                        return true;
                    }
                } else if (qVar.equals(tVar.f())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // c2.t
    public q f() {
        return this.f4616i;
    }

    @Override // c2.t
    public w g() {
        return this.f4615h;
    }

    @Override // c2.t
    public byte[] h() {
        return this.f4612e;
    }

    public int hashCode() {
        long j10 = this.f4608a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f4609b;
        int iHashCode = (i10 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        p pVar = this.f4610c;
        int iHashCode2 = pVar == null ? 0 : pVar.hashCode();
        long j11 = this.f4611d;
        int iHashCode3 = (((((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f4612e)) * 1000003;
        String str = this.f4613f;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        long j12 = this.f4614g;
        int i11 = (((iHashCode3 ^ iHashCode4) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        w wVar = this.f4615h;
        int iHashCode5 = (i11 ^ (wVar == null ? 0 : wVar.hashCode())) * 1000003;
        q qVar = this.f4616i;
        return iHashCode5 ^ (qVar != null ? qVar.hashCode() : 0);
    }

    @Override // c2.t
    public String i() {
        return this.f4613f;
    }

    @Override // c2.t
    public long j() {
        return this.f4614g;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f4608a + ", eventCode=" + this.f4609b + ", complianceData=" + this.f4610c + ", eventUptimeMs=" + this.f4611d + ", sourceExtension=" + Arrays.toString(this.f4612e) + ", sourceExtensionJsonProto3=" + this.f4613f + ", timezoneOffsetSeconds=" + this.f4614g + ", networkConnectionInfo=" + this.f4615h + ", experimentIds=" + this.f4616i + "}";
    }

    private j(long j10, Integer num, p pVar, long j11, byte[] bArr, String str, long j12, w wVar, q qVar) {
        this.f4608a = j10;
        this.f4609b = num;
        this.f4610c = pVar;
        this.f4611d = j11;
        this.f4612e = bArr;
        this.f4613f = str;
        this.f4614g = j12;
        this.f4615h = wVar;
        this.f4616i = qVar;
    }
}
