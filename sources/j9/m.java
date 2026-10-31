package j9;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: PrivFrame.java */
/* JADX INFO: loaded from: classes4.dex */
public final class m extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f20735c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f20734b = str;
        this.f20735c = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return Objects.equals(this.f20734b, mVar.f20734b) && Arrays.equals(this.f20735c, mVar.f20735c);
    }

    public int hashCode() {
        String str = this.f20734b;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f20735c);
    }

    @Override // j9.i
    public String toString() {
        return this.f20724a + ": owner=" + this.f20734b;
    }
}
