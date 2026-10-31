package i9;

import java.util.Arrays;
import u7.u;
import u7.v;

/* JADX INFO: compiled from: IcyInfo.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f16114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16116c;

    public c(byte[] bArr, String str, String str2) {
        this.f16114a = bArr;
        this.f16115b = str;
        this.f16116c = str2;
    }

    @Override // u7.v.a
    public void b(u.b bVar) {
        String str = this.f16115b;
        if (str != null) {
            bVar.p0(str);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f16114a, ((c) obj).f16114a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f16114a);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f16115b, this.f16116c, Integer.valueOf(this.f16114a.length));
    }
}
