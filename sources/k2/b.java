package k2;

import java.util.Map;

/* JADX INFO: compiled from: AutoValue_SchedulerConfig.java */
/* JADX INFO: loaded from: classes3.dex */
final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n2.a f21138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<b2.e, f.b> f21139b;

    b(n2.a aVar, Map<b2.e, f.b> map) {
        if (aVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.f21138a = aVar;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f21139b = map;
    }

    @Override // k2.f
    n2.a e() {
        return this.f21138a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f21138a.equals(fVar.e()) && this.f21139b.equals(fVar.h());
    }

    @Override // k2.f
    Map<b2.e, f.b> h() {
        return this.f21139b;
    }

    public int hashCode() {
        return ((this.f21138a.hashCode() ^ 1000003) * 1000003) ^ this.f21139b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f21138a + ", values=" + this.f21139b + "}";
    }
}
