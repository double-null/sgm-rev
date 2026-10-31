package j9;

import java.util.Objects;

/* JADX INFO: compiled from: InternalFrame.java */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f20728d;

    public k(String str, String str2, String str3) {
        super("----");
        this.f20726b = str;
        this.f20727c = str2;
        this.f20728d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return Objects.equals(this.f20727c, kVar.f20727c) && Objects.equals(this.f20726b, kVar.f20726b) && Objects.equals(this.f20728d, kVar.f20728d);
    }

    public int hashCode() {
        String str = this.f20726b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f20727c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f20728d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // j9.i
    public String toString() {
        return this.f20724a + ": domain=" + this.f20726b + ", description=" + this.f20727c;
    }
}
