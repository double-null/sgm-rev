package d2;

import java.util.Arrays;

/* JADX INFO: compiled from: EncodedPayload.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b2.b f13223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f13224b;

    public h(b2.b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f13223a = bVar;
        this.f13224b = bArr;
    }

    public byte[] a() {
        return this.f13224b;
    }

    public b2.b b() {
        return this.f13223a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f13223a.equals(hVar.f13223a)) {
            return Arrays.equals(this.f13224b, hVar.f13224b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f13223a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f13224b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f13223a + ", bytes=[...]}";
    }
}
