package d2;

import com.facebook.internal.logging.dumpsys.Tj.ljglrLUdGZhMhQ;
import java.util.Arrays;

/* JADX INFO: compiled from: AutoValue_TransportContext.java */
/* JADX INFO: loaded from: classes3.dex */
final class d extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f13202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f13203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b2.e f13204c;

    /* JADX INFO: compiled from: AutoValue_TransportContext.java */
    static final class b extends p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f13205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f13206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private b2.e f13207c;

        b() {
        }

        @Override // d2.p.a
        public p a() {
            String str = "";
            if (this.f13205a == null) {
                str = " backendName";
            }
            if (this.f13207c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new d(this.f13205a, this.f13206b, this.f13207c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // d2.p.a
        public p.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f13205a = str;
            return this;
        }

        @Override // d2.p.a
        public p.a c(byte[] bArr) {
            this.f13206b = bArr;
            return this;
        }

        @Override // d2.p.a
        public p.a d(b2.e eVar) {
            if (eVar == null) {
                throw new NullPointerException(ljglrLUdGZhMhQ.pLALZwJqYU);
            }
            this.f13207c = eVar;
            return this;
        }
    }

    @Override // d2.p
    public String b() {
        return this.f13202a;
    }

    @Override // d2.p
    public byte[] c() {
        return this.f13203b;
    }

    @Override // d2.p
    public b2.e d() {
        return this.f13204c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f13202a.equals(pVar.b())) {
            if (Arrays.equals(this.f13203b, pVar instanceof d ? ((d) pVar).f13203b : pVar.c()) && this.f13204c.equals(pVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f13202a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f13203b)) * 1000003) ^ this.f13204c.hashCode();
    }

    private d(String str, byte[] bArr, b2.e eVar) {
        this.f13202a = str;
        this.f13203b = bArr;
        this.f13204c = eVar;
    }
}
