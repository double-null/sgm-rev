package d2;

import g7.EinF.ZHgPsTG;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: AutoValue_EventInternal.java */
/* JADX INFO: loaded from: classes3.dex */
final class b extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f13172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f13173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f13174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f13175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f13176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<String, String> f13177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Integer f13178g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f13179h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final byte[] f13180i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final byte[] f13181j;

    /* JADX INFO: renamed from: d2.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AutoValue_EventInternal.java */
    static final class C0173b extends i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f13182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f13183b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private h f13184c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f13185d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Long f13186e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map<String, String> f13187f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Integer f13188g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f13189h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private byte[] f13190i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private byte[] f13191j;

        C0173b() {
        }

        @Override // d2.i.a
        public i d() {
            String str = "";
            if (this.f13182a == null) {
                str = " transportName";
            }
            if (this.f13184c == null) {
                str = str + " encodedPayload";
            }
            if (this.f13185d == null) {
                str = str + " eventMillis";
            }
            if (this.f13186e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f13187f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new b(this.f13182a, this.f13183b, this.f13184c, this.f13185d.longValue(), this.f13186e.longValue(), this.f13187f, this.f13188g, this.f13189h, this.f13190i, this.f13191j);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // d2.i.a
        protected Map<String, String> e() {
            Map<String, String> map = this.f13187f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // d2.i.a
        protected i.a f(Map<String, String> map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f13187f = map;
            return this;
        }

        @Override // d2.i.a
        public i.a g(Integer num) {
            this.f13183b = num;
            return this;
        }

        @Override // d2.i.a
        public i.a h(h hVar) {
            if (hVar == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f13184c = hVar;
            return this;
        }

        @Override // d2.i.a
        public i.a i(long j10) {
            this.f13185d = Long.valueOf(j10);
            return this;
        }

        @Override // d2.i.a
        public i.a j(byte[] bArr) {
            this.f13190i = bArr;
            return this;
        }

        @Override // d2.i.a
        public i.a k(byte[] bArr) {
            this.f13191j = bArr;
            return this;
        }

        @Override // d2.i.a
        public i.a l(Integer num) {
            this.f13188g = num;
            return this;
        }

        @Override // d2.i.a
        public i.a m(String str) {
            this.f13189h = str;
            return this;
        }

        @Override // d2.i.a
        public i.a n(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f13182a = str;
            return this;
        }

        @Override // d2.i.a
        public i.a o(long j10) {
            this.f13186e = Long.valueOf(j10);
            return this;
        }
    }

    @Override // d2.i
    protected Map<String, String> c() {
        return this.f13177f;
    }

    @Override // d2.i
    public Integer d() {
        return this.f13173b;
    }

    @Override // d2.i
    public h e() {
        return this.f13174c;
    }

    public boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f13172a.equals(iVar.n()) && ((num = this.f13173b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.f13174c.equals(iVar.e()) && this.f13175d == iVar.f() && this.f13176e == iVar.o() && this.f13177f.equals(iVar.c()) && ((num2 = this.f13178g) != null ? num2.equals(iVar.l()) : iVar.l() == null) && ((str = this.f13179h) != null ? str.equals(iVar.m()) : iVar.m() == null)) {
            boolean z10 = iVar instanceof b;
            if (Arrays.equals(this.f13180i, z10 ? ((b) iVar).f13180i : iVar.g())) {
                if (Arrays.equals(this.f13181j, z10 ? ((b) iVar).f13181j : iVar.h())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // d2.i
    public long f() {
        return this.f13175d;
    }

    @Override // d2.i
    public byte[] g() {
        return this.f13180i;
    }

    @Override // d2.i
    public byte[] h() {
        return this.f13181j;
    }

    public int hashCode() {
        int iHashCode = (this.f13172a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f13173b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f13174c.hashCode()) * 1000003;
        long j10 = this.f13175d;
        int i10 = (iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f13176e;
        int iHashCode3 = (((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f13177f.hashCode()) * 1000003;
        Integer num2 = this.f13178g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f13179h;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f13180i)) * 1000003) ^ Arrays.hashCode(this.f13181j);
    }

    @Override // d2.i
    public Integer l() {
        return this.f13178g;
    }

    @Override // d2.i
    public String m() {
        return this.f13179h;
    }

    @Override // d2.i
    public String n() {
        return this.f13172a;
    }

    @Override // d2.i
    public long o() {
        return this.f13176e;
    }

    private b(String str, Integer num, h hVar, long j10, long j11, Map<String, String> map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f13172a = str;
        this.f13173b = num;
        this.f13174c = hVar;
        this.f13175d = j10;
        this.f13176e = j11;
        this.f13177f = map;
        this.f13178g = num2;
        this.f13179h = str2;
        this.f13180i = bArr;
        this.f13181j = bArr2;
    }

    public String toString() {
        return ZHgPsTG.aazbNpehWwR + this.f13172a + ", code=" + this.f13173b + ", encodedPayload=" + this.f13174c + ", eventMillis=" + this.f13175d + ", uptimeMillis=" + this.f13176e + ", autoMetadata=" + this.f13177f + ", productId=" + this.f13178g + ", pseudonymousId=" + this.f13179h + ", experimentIdsClear=" + Arrays.toString(this.f13180i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f13181j) + "}";
    }
}
