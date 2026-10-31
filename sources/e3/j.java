package e3;

import java.util.List;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session.java */
/* JADX INFO: loaded from: classes4.dex */
final class j extends h0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f14209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f14210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Long f14211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f14212f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final h0.f.a f14213g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final h0.f.AbstractC0213f f14214h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final h0.f.e f14215i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final h0.f.c f14216j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List<h0.f.d> f14217k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f14218l;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session.java */
    static final class b extends h0.f.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f14219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f14220b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f14221c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f14222d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Long f14223e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f14224f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private h0.f.a f14225g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private h0.f.AbstractC0213f f14226h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private h0.f.e f14227i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private h0.f.c f14228j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private List<h0.f.d> f14229k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f14230l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private byte f14231m;

        @Override // e3.h0.f.b
        public h0.f a() {
            String str;
            String str2;
            h0.f.a aVar;
            if (this.f14231m == 7 && (str = this.f14219a) != null && (str2 = this.f14220b) != null && (aVar = this.f14225g) != null) {
                return new j(str, str2, this.f14221c, this.f14222d, this.f14223e, this.f14224f, aVar, this.f14226h, this.f14227i, this.f14228j, this.f14229k, this.f14230l);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f14219a == null) {
                sb2.append(" generator");
            }
            if (this.f14220b == null) {
                sb2.append(" identifier");
            }
            if ((this.f14231m & 1) == 0) {
                sb2.append(" startedAt");
            }
            if ((this.f14231m & 2) == 0) {
                sb2.append(" crashed");
            }
            if (this.f14225g == null) {
                sb2.append(" app");
            }
            if ((this.f14231m & 4) == 0) {
                sb2.append(" generatorType");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // e3.h0.f.b
        public h0.f.b b(h0.f.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f14225g = aVar;
            return this;
        }

        @Override // e3.h0.f.b
        public h0.f.b c(String str) {
            this.f14221c = str;
            return this;
        }

        @Override // e3.h0.f.b
        public h0.f.b d(boolean z10) {
            this.f14224f = z10;
            this.f14231m = (byte) (this.f14231m | 2);
            return this;
        }

        @Override // e3.h0.f.b
        public h0.f.b e(h0.f.c cVar) {
            this.f14228j = cVar;
            return this;
        }

        @Override // e3.h0.f.b
        public h0.f.b f(Long l10) {
            this.f14223e = l10;
            return this;
        }

        @Override // e3.h0.f.b
        public h0.f.b g(List<h0.f.d> list) {
            this.f14229k = list;
            return this;
        }

        @Override // e3.h0.f.b
        public h0.f.b h(String str) {
            if (str == null) {
                throw new NullPointerException("Null generator");
            }
            this.f14219a = str;
            return this;
        }

        @Override // e3.h0.f.b
        public h0.f.b i(int i10) {
            this.f14230l = i10;
            this.f14231m = (byte) (this.f14231m | 4);
            return this;
        }

        @Override // e3.h0.f.b
        public h0.f.b j(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f14220b = str;
            return this;
        }

        @Override // e3.h0.f.b
        public h0.f.b l(h0.f.e eVar) {
            this.f14227i = eVar;
            return this;
        }

        @Override // e3.h0.f.b
        public h0.f.b m(long j10) {
            this.f14222d = j10;
            this.f14231m = (byte) (this.f14231m | 1);
            return this;
        }

        @Override // e3.h0.f.b
        public h0.f.b n(h0.f.AbstractC0213f abstractC0213f) {
            this.f14226h = abstractC0213f;
            return this;
        }

        b() {
        }

        private b(h0.f fVar) {
            this.f14219a = fVar.g();
            this.f14220b = fVar.i();
            this.f14221c = fVar.c();
            this.f14222d = fVar.l();
            this.f14223e = fVar.e();
            this.f14224f = fVar.n();
            this.f14225g = fVar.b();
            this.f14226h = fVar.m();
            this.f14227i = fVar.k();
            this.f14228j = fVar.d();
            this.f14229k = fVar.f();
            this.f14230l = fVar.h();
            this.f14231m = (byte) 7;
        }
    }

    @Override // e3.h0.f
    public h0.f.a b() {
        return this.f14213g;
    }

    @Override // e3.h0.f
    public String c() {
        return this.f14209c;
    }

    @Override // e3.h0.f
    public h0.f.c d() {
        return this.f14216j;
    }

    @Override // e3.h0.f
    public Long e() {
        return this.f14211e;
    }

    public boolean equals(Object obj) {
        String str;
        Long l10;
        h0.f.AbstractC0213f abstractC0213f;
        h0.f.e eVar;
        h0.f.c cVar;
        List<h0.f.d> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0.f)) {
            return false;
        }
        h0.f fVar = (h0.f) obj;
        return this.f14207a.equals(fVar.g()) && this.f14208b.equals(fVar.i()) && ((str = this.f14209c) != null ? str.equals(fVar.c()) : fVar.c() == null) && this.f14210d == fVar.l() && ((l10 = this.f14211e) != null ? l10.equals(fVar.e()) : fVar.e() == null) && this.f14212f == fVar.n() && this.f14213g.equals(fVar.b()) && ((abstractC0213f = this.f14214h) != null ? abstractC0213f.equals(fVar.m()) : fVar.m() == null) && ((eVar = this.f14215i) != null ? eVar.equals(fVar.k()) : fVar.k() == null) && ((cVar = this.f14216j) != null ? cVar.equals(fVar.d()) : fVar.d() == null) && ((list = this.f14217k) != null ? list.equals(fVar.f()) : fVar.f() == null) && this.f14218l == fVar.h();
    }

    @Override // e3.h0.f
    public List<h0.f.d> f() {
        return this.f14217k;
    }

    @Override // e3.h0.f
    public String g() {
        return this.f14207a;
    }

    @Override // e3.h0.f
    public int h() {
        return this.f14218l;
    }

    public int hashCode() {
        int iHashCode = (((this.f14207a.hashCode() ^ 1000003) * 1000003) ^ this.f14208b.hashCode()) * 1000003;
        String str = this.f14209c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j10 = this.f14210d;
        int i10 = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        Long l10 = this.f14211e;
        int iHashCode3 = (((((i10 ^ (l10 == null ? 0 : l10.hashCode())) * 1000003) ^ (this.f14212f ? 1231 : 1237)) * 1000003) ^ this.f14213g.hashCode()) * 1000003;
        h0.f.AbstractC0213f abstractC0213f = this.f14214h;
        int iHashCode4 = (iHashCode3 ^ (abstractC0213f == null ? 0 : abstractC0213f.hashCode())) * 1000003;
        h0.f.e eVar = this.f14215i;
        int iHashCode5 = (iHashCode4 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        h0.f.c cVar = this.f14216j;
        int iHashCode6 = (iHashCode5 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List<h0.f.d> list = this.f14217k;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f14218l;
    }

    @Override // e3.h0.f
    public String i() {
        return this.f14208b;
    }

    @Override // e3.h0.f
    public h0.f.e k() {
        return this.f14215i;
    }

    @Override // e3.h0.f
    public long l() {
        return this.f14210d;
    }

    @Override // e3.h0.f
    public h0.f.AbstractC0213f m() {
        return this.f14214h;
    }

    @Override // e3.h0.f
    public boolean n() {
        return this.f14212f;
    }

    @Override // e3.h0.f
    public h0.f.b o() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f14207a + ", identifier=" + this.f14208b + ", appQualitySessionId=" + this.f14209c + ", startedAt=" + this.f14210d + ", endedAt=" + this.f14211e + ", crashed=" + this.f14212f + ", app=" + this.f14213g + ", user=" + this.f14214h + ", os=" + this.f14215i + ", device=" + this.f14216j + ", events=" + this.f14217k + ", generatorType=" + this.f14218l + "}";
    }

    private j(String str, String str2, String str3, long j10, Long l10, boolean z10, h0.f.a aVar, h0.f.AbstractC0213f abstractC0213f, h0.f.e eVar, h0.f.c cVar, List<h0.f.d> list, int i10) {
        this.f14207a = str;
        this.f14208b = str2;
        this.f14209c = str3;
        this.f14210d = j10;
        this.f14211e = l10;
        this.f14212f = z10;
        this.f14213g = aVar;
        this.f14214h = abstractC0213f;
        this.f14215i = eVar;
        this.f14216j = cVar;
        this.f14217k = list;
        this.f14218l = i10;
    }
}
