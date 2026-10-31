package f8;

import java.util.Objects;

/* JADX INFO: compiled from: Descriptor.java */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14695c;

    public e(String str, String str2, String str3) {
        this.f14693a = str;
        this.f14694b = str2;
        this.f14695c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return Objects.equals(this.f14693a, eVar.f14693a) && Objects.equals(this.f14694b, eVar.f14694b) && Objects.equals(this.f14695c, eVar.f14695c);
    }

    public int hashCode() {
        int iHashCode = this.f14693a.hashCode() * 31;
        String str = this.f14694b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f14695c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
