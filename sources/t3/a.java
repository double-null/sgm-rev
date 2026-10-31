package t3;

import java.util.List;

/* JADX INFO: compiled from: AutoValue_HeartBeatResult.java */
/* JADX INFO: loaded from: classes4.dex */
final class a extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f25473b;

    a(String str, List<String> list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f25472a = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.f25473b = list;
    }

    @Override // t3.v
    public List<String> b() {
        return this.f25473b;
    }

    @Override // t3.v
    public String c() {
        return this.f25472a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f25472a.equals(vVar.c()) && this.f25473b.equals(vVar.b());
    }

    public int hashCode() {
        return ((this.f25472a.hashCode() ^ 1000003) * 1000003) ^ this.f25473b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f25472a + ", usedDates=" + this.f25473b + "}";
    }
}
