package j9;

import java.util.Objects;

/* JADX INFO: compiled from: CommentFrame.java */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f20714d;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f20712b = str;
        this.f20713c = str2;
        this.f20714d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return Objects.equals(this.f20713c, eVar.f20713c) && Objects.equals(this.f20712b, eVar.f20712b) && Objects.equals(this.f20714d, eVar.f20714d);
    }

    public int hashCode() {
        String str = this.f20712b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f20713c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f20714d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // j9.i
    public String toString() {
        return this.f20724a + ": language=" + this.f20712b + ", description=" + this.f20713c + ", text=" + this.f20714d;
    }
}
