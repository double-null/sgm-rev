package e3;

import com.android.billingclient.gp.VRfCTjjLv;
import java.util.List;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo.java */
/* JADX INFO: loaded from: classes4.dex */
final class c extends h0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f14141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f14143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f14144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f14145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f14146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f14147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f14148h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<h0.a.AbstractC0197a> f14149i;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo.java */
    static final class b extends h0.a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f14150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f14151b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f14152c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f14153d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f14154e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f14155f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f14156g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f14157h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private List<h0.a.AbstractC0197a> f14158i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private byte f14159j;

        b() {
        }

        @Override // e3.h0.a.b
        public h0.a.b b(List<h0.a.AbstractC0197a> list) {
            this.f14158i = list;
            return this;
        }

        @Override // e3.h0.a.b
        public h0.a.b c(int i10) {
            this.f14153d = i10;
            this.f14159j = (byte) (this.f14159j | 4);
            return this;
        }

        @Override // e3.h0.a.b
        public h0.a.b d(int i10) {
            this.f14150a = i10;
            this.f14159j = (byte) (this.f14159j | 1);
            return this;
        }

        @Override // e3.h0.a.b
        public h0.a.b e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f14151b = str;
            return this;
        }

        @Override // e3.h0.a.b
        public h0.a.b f(long j10) {
            this.f14154e = j10;
            this.f14159j = (byte) (this.f14159j | 8);
            return this;
        }

        @Override // e3.h0.a.b
        public h0.a.b g(int i10) {
            this.f14152c = i10;
            this.f14159j = (byte) (this.f14159j | 2);
            return this;
        }

        @Override // e3.h0.a.b
        public h0.a.b h(long j10) {
            this.f14155f = j10;
            this.f14159j = (byte) (this.f14159j | 16);
            return this;
        }

        @Override // e3.h0.a.b
        public h0.a.b i(long j10) {
            this.f14156g = j10;
            this.f14159j = (byte) (this.f14159j | 32);
            return this;
        }

        @Override // e3.h0.a.b
        public h0.a.b j(String str) {
            this.f14157h = str;
            return this;
        }

        @Override // e3.h0.a.b
        public h0.a a() {
            String str;
            if (this.f14159j == 63 && (str = this.f14151b) != null) {
                return new c(this.f14150a, str, this.f14152c, this.f14153d, this.f14154e, this.f14155f, this.f14156g, this.f14157h, this.f14158i);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f14159j & 1) == 0) {
                sb2.append(" pid");
            }
            if (this.f14151b == null) {
                sb2.append(" processName");
            }
            if ((this.f14159j & 2) == 0) {
                sb2.append(VRfCTjjLv.zRhKRkUFhPLNA);
            }
            if ((this.f14159j & 4) == 0) {
                sb2.append(" importance");
            }
            if ((this.f14159j & 8) == 0) {
                sb2.append(" pss");
            }
            if ((this.f14159j & 16) == 0) {
                sb2.append(" rss");
            }
            if ((this.f14159j & 32) == 0) {
                sb2.append(" timestamp");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }
    }

    @Override // e3.h0.a
    public List<h0.a.AbstractC0197a> b() {
        return this.f14149i;
    }

    @Override // e3.h0.a
    public int c() {
        return this.f14144d;
    }

    @Override // e3.h0.a
    public int d() {
        return this.f14141a;
    }

    @Override // e3.h0.a
    public String e() {
        return this.f14142b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0.a)) {
            return false;
        }
        h0.a aVar = (h0.a) obj;
        if (this.f14141a == aVar.d() && this.f14142b.equals(aVar.e()) && this.f14143c == aVar.g() && this.f14144d == aVar.c() && this.f14145e == aVar.f() && this.f14146f == aVar.h() && this.f14147g == aVar.i() && ((str = this.f14148h) != null ? str.equals(aVar.j()) : aVar.j() == null)) {
            List<h0.a.AbstractC0197a> list = this.f14149i;
            if (list == null) {
                if (aVar.b() == null) {
                    return true;
                }
            } else if (list.equals(aVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // e3.h0.a
    public long f() {
        return this.f14145e;
    }

    @Override // e3.h0.a
    public int g() {
        return this.f14143c;
    }

    @Override // e3.h0.a
    public long h() {
        return this.f14146f;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f14141a ^ 1000003) * 1000003) ^ this.f14142b.hashCode()) * 1000003) ^ this.f14143c) * 1000003) ^ this.f14144d) * 1000003;
        long j10 = this.f14145e;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f14146f;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f14147g;
        int i12 = (i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        String str = this.f14148h;
        int iHashCode2 = (i12 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<h0.a.AbstractC0197a> list = this.f14149i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // e3.h0.a
    public long i() {
        return this.f14147g;
    }

    @Override // e3.h0.a
    public String j() {
        return this.f14148h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f14141a + ", processName=" + this.f14142b + ", reasonCode=" + this.f14143c + ", importance=" + this.f14144d + ", pss=" + this.f14145e + ", rss=" + this.f14146f + ", timestamp=" + this.f14147g + ", traceFile=" + this.f14148h + ", buildIdMappingForArch=" + this.f14149i + "}";
    }

    private c(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, List<h0.a.AbstractC0197a> list) {
        this.f14141a = i10;
        this.f14142b = str;
        this.f14143c = i11;
        this.f14144d = i12;
        this.f14145e = j10;
        this.f14146f = j11;
        this.f14147g = j12;
        this.f14148h = str2;
        this.f14149i = list;
    }
}
