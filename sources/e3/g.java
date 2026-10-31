package e3;

import java.util.Arrays;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_FilesPayload_File.java */
/* JADX INFO: loaded from: classes4.dex */
final class g extends h0.d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f14195b;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_FilesPayload_File.java */
    static final class b extends h0.d.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f14196a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f14197b;

        b() {
        }

        @Override // e3.h0.d.b.a
        public h0.d.b a() {
            byte[] bArr;
            String str = this.f14196a;
            if (str != null && (bArr = this.f14197b) != null) {
                return new g(str, bArr);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f14196a == null) {
                sb2.append(" filename");
            }
            if (this.f14197b == null) {
                sb2.append(" contents");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // e3.h0.d.b.a
        public h0.d.b.a b(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException("Null contents");
            }
            this.f14197b = bArr;
            return this;
        }

        @Override // e3.h0.d.b.a
        public h0.d.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null filename");
            }
            this.f14196a = str;
            return this;
        }
    }

    @Override // e3.h0.d.b
    public byte[] b() {
        return this.f14195b;
    }

    @Override // e3.h0.d.b
    public String c() {
        return this.f14194a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0.d.b)) {
            return false;
        }
        h0.d.b bVar = (h0.d.b) obj;
        if (this.f14194a.equals(bVar.c())) {
            if (Arrays.equals(this.f14195b, bVar instanceof g ? ((g) bVar).f14195b : bVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f14194a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f14195b);
    }

    public String toString() {
        return "File{filename=" + this.f14194a + ", contents=" + Arrays.toString(this.f14195b) + "}";
    }

    private g(String str, byte[] bArr) {
        this.f14194a = str;
        this.f14195b = bArr;
    }
}
