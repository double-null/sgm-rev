package j9;

import java.util.Objects;

/* JADX INFO: compiled from: UrlLinkFrame.java */
/* JADX INFO: loaded from: classes4.dex */
public final class o extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20740c;

    public o(String str, String str2, String str3) {
        super(str);
        this.f20739b = str2;
        this.f20740c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        return this.f20724a.equals(oVar.f20724a) && Objects.equals(this.f20739b, oVar.f20739b) && Objects.equals(this.f20740c, oVar.f20740c);
    }

    public int hashCode() {
        int iHashCode = (527 + this.f20724a.hashCode()) * 31;
        String str = this.f20739b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f20740c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // j9.i
    public String toString() {
        return this.f20724a + ": url=" + this.f20740c;
    }
}
