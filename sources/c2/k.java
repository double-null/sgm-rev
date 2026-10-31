package c2;

import java.util.List;

/* JADX INFO: compiled from: AutoValue_LogRequest.java */
/* JADX INFO: loaded from: classes3.dex */
final class k extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f4626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f4627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o f4628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f4629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f4630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<t> f4631f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final x f4632g;

    /* JADX INFO: compiled from: AutoValue_LogRequest.java */
    static final class b extends u.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f4633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f4634b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private o f4635c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f4636d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f4637e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List<t> f4638f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private x f4639g;

        b() {
        }

        @Override // c2.u.a
        public u a() {
            String str = "";
            if (this.f4633a == null) {
                str = " requestTimeMs";
            }
            if (this.f4634b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new k(this.f4633a.longValue(), this.f4634b.longValue(), this.f4635c, this.f4636d, this.f4637e, this.f4638f, this.f4639g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // c2.u.a
        public u.a b(o oVar) {
            this.f4635c = oVar;
            return this;
        }

        @Override // c2.u.a
        public u.a c(List<t> list) {
            this.f4638f = list;
            return this;
        }

        @Override // c2.u.a
        u.a d(Integer num) {
            this.f4636d = num;
            return this;
        }

        @Override // c2.u.a
        u.a e(String str) {
            this.f4637e = str;
            return this;
        }

        @Override // c2.u.a
        public u.a f(x xVar) {
            this.f4639g = xVar;
            return this;
        }

        @Override // c2.u.a
        public u.a g(long j10) {
            this.f4633a = Long.valueOf(j10);
            return this;
        }

        @Override // c2.u.a
        public u.a h(long j10) {
            this.f4634b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // c2.u
    public o b() {
        return this.f4628c;
    }

    @Override // c2.u
    public List<t> c() {
        return this.f4631f;
    }

    @Override // c2.u
    public Integer d() {
        return this.f4629d;
    }

    @Override // c2.u
    public String e() {
        return this.f4630e;
    }

    public boolean equals(Object obj) {
        o oVar;
        Integer num;
        String str;
        List<t> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f4626a == uVar.g() && this.f4627b == uVar.h() && ((oVar = this.f4628c) != null ? oVar.equals(uVar.b()) : uVar.b() == null) && ((num = this.f4629d) != null ? num.equals(uVar.d()) : uVar.d() == null) && ((str = this.f4630e) != null ? str.equals(uVar.e()) : uVar.e() == null) && ((list = this.f4631f) != null ? list.equals(uVar.c()) : uVar.c() == null)) {
            x xVar = this.f4632g;
            if (xVar == null) {
                if (uVar.f() == null) {
                    return true;
                }
            } else if (xVar.equals(uVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // c2.u
    public x f() {
        return this.f4632g;
    }

    @Override // c2.u
    public long g() {
        return this.f4626a;
    }

    @Override // c2.u
    public long h() {
        return this.f4627b;
    }

    public int hashCode() {
        long j10 = this.f4626a;
        long j11 = this.f4627b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        o oVar = this.f4628c;
        int iHashCode = (i10 ^ (oVar == null ? 0 : oVar.hashCode())) * 1000003;
        Integer num = this.f4629d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f4630e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<t> list = this.f4631f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        x xVar = this.f4632g;
        return iHashCode4 ^ (xVar != null ? xVar.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f4626a + ", requestUptimeMs=" + this.f4627b + ", clientInfo=" + this.f4628c + ", logSource=" + this.f4629d + ", logSourceName=" + this.f4630e + ", logEvents=" + this.f4631f + ", qosTier=" + this.f4632g + "}";
    }

    private k(long j10, long j11, o oVar, Integer num, String str, List<t> list, x xVar) {
        this.f4626a = j10;
        this.f4627b = j11;
        this.f4628c = oVar;
        this.f4629d = num;
        this.f4630e = str;
        this.f4631f = list;
        this.f4632g = xVar;
    }
}
