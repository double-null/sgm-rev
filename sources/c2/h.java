package c2;

/* JADX INFO: compiled from: AutoValue_ExternalPRequestContext.java */
/* JADX INFO: loaded from: classes3.dex */
final class h extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f4604a;

    /* JADX INFO: compiled from: AutoValue_ExternalPRequestContext.java */
    static final class b extends r.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f4605a;

        b() {
        }

        @Override // c2.r.a
        public r a() {
            return new h(this.f4605a);
        }

        @Override // c2.r.a
        public r.a b(Integer num) {
            this.f4605a = num;
            return this;
        }
    }

    @Override // c2.r
    public Integer b() {
        return this.f4604a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        Integer num = this.f4604a;
        Integer numB = ((r) obj).b();
        if (num == null) {
            return numB == null;
        }
        return num.equals(numB);
    }

    public int hashCode() {
        Integer num = this.f4604a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f4604a + "}";
    }

    private h(Integer num) {
        this.f4604a = num;
    }
}
