package j9;

import java.util.Arrays;

/* JADX INFO: compiled from: BinaryFrame.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f20700b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f20700b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f20724a.equals(bVar.f20724a) && Arrays.equals(this.f20700b, bVar.f20700b);
    }

    public int hashCode() {
        return ((527 + this.f20724a.hashCode()) * 31) + Arrays.hashCode(this.f20700b);
    }
}
