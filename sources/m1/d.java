package m1;

/* JADX INFO: compiled from: Preference.java */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f22050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f22051b;

    public d(String str, boolean z10) {
        this(str, z10 ? 1L : 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f22050a.equals(dVar.f22050a)) {
            return false;
        }
        Long l10 = this.f22051b;
        Long l11 = dVar.f22051b;
        if (l10 != null) {
            return l10.equals(l11);
        }
        return l11 == null;
    }

    public int hashCode() {
        int iHashCode = this.f22050a.hashCode() * 31;
        Long l10 = this.f22051b;
        return iHashCode + (l10 != null ? l10.hashCode() : 0);
    }

    public d(String str, long j10) {
        this.f22050a = str;
        this.f22051b = Long.valueOf(j10);
    }
}
