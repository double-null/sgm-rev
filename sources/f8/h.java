package f8;

import java.util.Objects;

/* JADX INFO: compiled from: ProgramInformation.java */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f14709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f14710e;

    public h(String str, String str2, String str3, String str4, String str5) {
        this.f14706a = str;
        this.f14707b = str2;
        this.f14708c = str3;
        this.f14709d = str4;
        this.f14710e = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Objects.equals(this.f14706a, hVar.f14706a) && Objects.equals(this.f14707b, hVar.f14707b) && Objects.equals(this.f14708c, hVar.f14708c) && Objects.equals(this.f14709d, hVar.f14709d) && Objects.equals(this.f14710e, hVar.f14710e);
    }

    public int hashCode() {
        String str = this.f14706a;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f14707b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f14708c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f14709d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f14710e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
