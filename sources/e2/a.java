package e2;

import java.util.Arrays;

/* JADX INFO: compiled from: AutoValue_BackendRequest.java */
/* JADX INFO: loaded from: classes3.dex */
final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterable<d2.i> f13925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f13926b;

    /* JADX INFO: compiled from: AutoValue_BackendRequest.java */
    static final class b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Iterable<d2.i> f13927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f13928b;

        b() {
        }

        @Override // e2.f.a
        public f a() {
            String str = "";
            if (this.f13927a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new a(this.f13927a, this.f13928b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // e2.f.a
        public f.a b(Iterable<d2.i> iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f13927a = iterable;
            return this;
        }

        @Override // e2.f.a
        public f.a c(byte[] bArr) {
            this.f13928b = bArr;
            return this;
        }
    }

    @Override // e2.f
    public Iterable<d2.i> b() {
        return this.f13925a;
    }

    @Override // e2.f
    public byte[] c() {
        return this.f13926b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f13925a.equals(fVar.b())) {
            if (Arrays.equals(this.f13926b, fVar instanceof a ? ((a) fVar).f13926b : fVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f13925a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f13926b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f13925a + ", extras=" + Arrays.toString(this.f13926b) + "}";
    }

    private a(Iterable<d2.i> iterable, byte[] bArr) {
        this.f13925a = iterable;
        this.f13926b = bArr;
    }
}
