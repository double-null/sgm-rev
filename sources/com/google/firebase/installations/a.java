package com.google.firebase.installations;

/* JADX INFO: compiled from: AutoValue_InstallationTokenResult.java */
/* JADX INFO: loaded from: classes4.dex */
final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f12247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f12248c;

    /* JADX INFO: compiled from: AutoValue_InstallationTokenResult.java */
    static final class b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f12249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f12250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f12251c;

        b() {
        }

        @Override // com.google.firebase.installations.f.a
        public f a() {
            String str = "";
            if (this.f12249a == null) {
                str = " token";
            }
            if (this.f12250b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f12251c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f12249a, this.f12250b.longValue(), this.f12251c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.f.a
        public f.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f12249a = str;
            return this;
        }

        @Override // com.google.firebase.installations.f.a
        public f.a c(long j10) {
            this.f12251c = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.firebase.installations.f.a
        public f.a d(long j10) {
            this.f12250b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // com.google.firebase.installations.f
    public String b() {
        return this.f12246a;
    }

    @Override // com.google.firebase.installations.f
    public long c() {
        return this.f12248c;
    }

    @Override // com.google.firebase.installations.f
    public long d() {
        return this.f12247b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f12246a.equals(fVar.b()) && this.f12247b == fVar.d() && this.f12248c == fVar.c();
    }

    public int hashCode() {
        int iHashCode = (this.f12246a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f12247b;
        long j11 = this.f12248c;
        return ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f12246a + ", tokenExpirationTimestamp=" + this.f12247b + ", tokenCreationTimestamp=" + this.f12248c + "}";
    }

    private a(String str, long j10, long j11) {
        this.f12246a = str;
        this.f12247b = j10;
        this.f12248c = j11;
    }
}
