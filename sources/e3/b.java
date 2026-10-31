package e3;

import io.bidmachine.iab.vast.activity.IIj.KBBdKxoAiHo;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport.java */
/* JADX INFO: loaded from: classes4.dex */
final class b extends h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f14108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f14109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f14110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f14111f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f14112g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f14113h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f14114i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f14115j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final h0.f f14116k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final h0.d f14117l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final h0.a f14118m;

    /* JADX INFO: renamed from: e3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport.java */
    static final class C0196b extends h0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f14119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f14120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f14121c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f14122d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f14123e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f14124f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f14125g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f14126h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f14127i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private h0.f f14128j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private h0.d f14129k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private h0.a f14130l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private byte f14131m;

        @Override // e3.h0.b
        public h0.b b(h0.a aVar) {
            this.f14130l = aVar;
            return this;
        }

        @Override // e3.h0.b
        public h0.b c(String str) {
            this.f14125g = str;
            return this;
        }

        @Override // e3.h0.b
        public h0.b d(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f14126h = str;
            return this;
        }

        @Override // e3.h0.b
        public h0.b e(String str) {
            if (str == null) {
                throw new NullPointerException("Null displayVersion");
            }
            this.f14127i = str;
            return this;
        }

        @Override // e3.h0.b
        public h0.b f(String str) {
            this.f14124f = str;
            return this;
        }

        @Override // e3.h0.b
        public h0.b g(String str) {
            this.f14123e = str;
            return this;
        }

        @Override // e3.h0.b
        public h0.b h(String str) {
            if (str == null) {
                throw new NullPointerException("Null gmpAppId");
            }
            this.f14120b = str;
            return this;
        }

        @Override // e3.h0.b
        public h0.b i(String str) {
            if (str == null) {
                throw new NullPointerException("Null installationUuid");
            }
            this.f14122d = str;
            return this;
        }

        @Override // e3.h0.b
        public h0.b j(h0.d dVar) {
            this.f14129k = dVar;
            return this;
        }

        @Override // e3.h0.b
        public h0.b k(int i10) {
            this.f14121c = i10;
            this.f14131m = (byte) (this.f14131m | 1);
            return this;
        }

        @Override // e3.h0.b
        public h0.b l(String str) {
            if (str == null) {
                throw new NullPointerException("Null sdkVersion");
            }
            this.f14119a = str;
            return this;
        }

        @Override // e3.h0.b
        public h0.b m(h0.f fVar) {
            this.f14128j = fVar;
            return this;
        }

        C0196b() {
        }

        @Override // e3.h0.b
        public h0 a() {
            if (this.f14131m == 1 && this.f14119a != null && this.f14120b != null && this.f14122d != null && this.f14126h != null && this.f14127i != null) {
                return new b(this.f14119a, this.f14120b, this.f14121c, this.f14122d, this.f14123e, this.f14124f, this.f14125g, this.f14126h, this.f14127i, this.f14128j, this.f14129k, this.f14130l);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f14119a == null) {
                sb2.append(" sdkVersion");
            }
            if (this.f14120b == null) {
                sb2.append(" gmpAppId");
            }
            if ((1 & this.f14131m) == 0) {
                sb2.append(" platform");
            }
            if (this.f14122d == null) {
                sb2.append(" installationUuid");
            }
            if (this.f14126h == null) {
                sb2.append(" buildVersion");
            }
            if (this.f14127i == null) {
                sb2.append(" displayVersion");
            }
            throw new IllegalStateException(KBBdKxoAiHo.paMmFJRSV + ((Object) sb2));
        }

        private C0196b(h0 h0Var) {
            this.f14119a = h0Var.m();
            this.f14120b = h0Var.i();
            this.f14121c = h0Var.l();
            this.f14122d = h0Var.j();
            this.f14123e = h0Var.h();
            this.f14124f = h0Var.g();
            this.f14125g = h0Var.d();
            this.f14126h = h0Var.e();
            this.f14127i = h0Var.f();
            this.f14128j = h0Var.n();
            this.f14129k = h0Var.k();
            this.f14130l = h0Var.c();
            this.f14131m = (byte) 1;
        }
    }

    @Override // e3.h0
    public h0.a c() {
        return this.f14118m;
    }

    @Override // e3.h0
    public String d() {
        return this.f14113h;
    }

    @Override // e3.h0
    public String e() {
        return this.f14114i;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        h0.f fVar;
        h0.d dVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (this.f14107b.equals(h0Var.m()) && this.f14108c.equals(h0Var.i()) && this.f14109d == h0Var.l() && this.f14110e.equals(h0Var.j()) && ((str = this.f14111f) != null ? str.equals(h0Var.h()) : h0Var.h() == null) && ((str2 = this.f14112g) != null ? str2.equals(h0Var.g()) : h0Var.g() == null) && ((str3 = this.f14113h) != null ? str3.equals(h0Var.d()) : h0Var.d() == null) && this.f14114i.equals(h0Var.e()) && this.f14115j.equals(h0Var.f()) && ((fVar = this.f14116k) != null ? fVar.equals(h0Var.n()) : h0Var.n() == null) && ((dVar = this.f14117l) != null ? dVar.equals(h0Var.k()) : h0Var.k() == null)) {
            h0.a aVar = this.f14118m;
            if (aVar == null) {
                if (h0Var.c() == null) {
                    return true;
                }
            } else if (aVar.equals(h0Var.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // e3.h0
    public String f() {
        return this.f14115j;
    }

    @Override // e3.h0
    public String g() {
        return this.f14112g;
    }

    @Override // e3.h0
    public String h() {
        return this.f14111f;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f14107b.hashCode() ^ 1000003) * 1000003) ^ this.f14108c.hashCode()) * 1000003) ^ this.f14109d) * 1000003) ^ this.f14110e.hashCode()) * 1000003;
        String str = this.f14111f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f14112g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f14113h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f14114i.hashCode()) * 1000003) ^ this.f14115j.hashCode()) * 1000003;
        h0.f fVar = this.f14116k;
        int iHashCode5 = (iHashCode4 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        h0.d dVar = this.f14117l;
        int iHashCode6 = (iHashCode5 ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        h0.a aVar = this.f14118m;
        return iHashCode6 ^ (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // e3.h0
    public String i() {
        return this.f14108c;
    }

    @Override // e3.h0
    public String j() {
        return this.f14110e;
    }

    @Override // e3.h0
    public h0.d k() {
        return this.f14117l;
    }

    @Override // e3.h0
    public int l() {
        return this.f14109d;
    }

    @Override // e3.h0
    public String m() {
        return this.f14107b;
    }

    @Override // e3.h0
    public h0.f n() {
        return this.f14116k;
    }

    @Override // e3.h0
    protected h0.b o() {
        return new C0196b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f14107b + ", gmpAppId=" + this.f14108c + ", platform=" + this.f14109d + ", installationUuid=" + this.f14110e + ", firebaseInstallationId=" + this.f14111f + ", firebaseAuthenticationToken=" + this.f14112g + ", appQualitySessionId=" + this.f14113h + ", buildVersion=" + this.f14114i + ", displayVersion=" + this.f14115j + ", session=" + this.f14116k + ", ndkPayload=" + this.f14117l + ", appExitInfo=" + this.f14118m + "}";
    }

    private b(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, String str8, h0.f fVar, h0.d dVar, h0.a aVar) {
        this.f14107b = str;
        this.f14108c = str2;
        this.f14109d = i10;
        this.f14110e = str3;
        this.f14111f = str4;
        this.f14112g = str5;
        this.f14113h = str6;
        this.f14114i = str7;
        this.f14115j = str8;
        this.f14116k = fVar;
        this.f14117l = dVar;
        this.f14118m = aVar;
    }
}
