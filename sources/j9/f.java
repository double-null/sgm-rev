package j9;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: GeobFrame.java */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f20717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f20718e;

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f20715b = str;
        this.f20716c = str2;
        this.f20717d = str3;
        this.f20718e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return Objects.equals(this.f20715b, fVar.f20715b) && Objects.equals(this.f20716c, fVar.f20716c) && Objects.equals(this.f20717d, fVar.f20717d) && Arrays.equals(this.f20718e, fVar.f20718e);
    }

    public int hashCode() {
        String str = this.f20715b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f20716c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f20717d;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f20718e);
    }

    @Override // j9.i
    public String toString() {
        return this.f20724a + ": mimeType=" + this.f20715b + ", filename=" + this.f20716c + ", description=" + this.f20717d;
    }
}
