package c2;

import java.util.Arrays;

/* JADX INFO: compiled from: AutoValue_ExperimentIds.java */
/* JADX INFO: loaded from: classes3.dex */
final class g extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f4600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f4601b;

    /* JADX INFO: compiled from: AutoValue_ExperimentIds.java */
    static final class b extends q.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private byte[] f4602a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f4603b;

        b() {
        }

        @Override // c2.q.a
        public q a() {
            return new g(this.f4602a, this.f4603b);
        }

        @Override // c2.q.a
        public q.a b(byte[] bArr) {
            this.f4602a = bArr;
            return this;
        }

        @Override // c2.q.a
        public q.a c(byte[] bArr) {
            this.f4603b = bArr;
            return this;
        }
    }

    @Override // c2.q
    public byte[] b() {
        return this.f4600a;
    }

    @Override // c2.q
    public byte[] c() {
        return this.f4601b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        boolean z10 = qVar instanceof g;
        if (Arrays.equals(this.f4600a, z10 ? ((g) qVar).f4600a : qVar.b())) {
            if (Arrays.equals(this.f4601b, z10 ? ((g) qVar).f4601b : qVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((Arrays.hashCode(this.f4600a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f4601b);
    }

    public String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f4600a) + ", encryptedBlob=" + Arrays.toString(this.f4601b) + "}";
    }

    private g(byte[] bArr, byte[] bArr2) {
        this.f4600a = bArr;
        this.f4601b = bArr2;
    }
}
