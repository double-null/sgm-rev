package pb;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f24217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f24218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f24219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f24220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f24221e;

    public t(double d10, int i10, String adElementName, long j10, List<q> algorithmResults) {
        kotlin.jvm.internal.t.f(adElementName, "adElementName");
        kotlin.jvm.internal.t.f(algorithmResults, "algorithmResults");
        this.f24217a = d10;
        this.f24218b = i10;
        this.f24219c = adElementName;
        this.f24220d = j10;
        this.f24221e = algorithmResults;
    }

    public final String a() {
        return this.f24219c;
    }

    public final int b() {
        return this.f24218b;
    }

    public final List<q> c() {
        return this.f24221e;
    }

    public final long d() {
        return this.f24220d;
    }

    public final double e() {
        return this.f24217a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.t.a(t.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.t.d(obj, "null cannot be cast to non-null type io.bidmachine.rendering.model.BrokenCreativeEvent");
        t tVar = (t) obj;
        return this.f24217a == tVar.f24217a && this.f24218b == tVar.f24218b && kotlin.jvm.internal.t.a(this.f24219c, tVar.f24219c);
    }

    public int hashCode() {
        return (((Double.hashCode(this.f24217a) * 31) + this.f24218b) * 31) + this.f24219c.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("isBroken - ");
        sb2.append(this.f24217a);
        sb2.append(" (");
        sb2.append(this.f24217a == 1.0d);
        sb2.append("), adPhaseSequence - ");
        sb2.append(this.f24218b);
        sb2.append(", adElementName - ");
        sb2.append(this.f24219c);
        sb2.append(", durationMs - ");
        sb2.append(this.f24220d);
        return sb2.toString();
    }
}
