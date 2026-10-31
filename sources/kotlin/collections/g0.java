package kotlin.collections;

/* JADX INFO: compiled from: IndexedValue.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f21459b;

    public g0(int i10, T t10) {
        this.f21458a = i10;
        this.f21459b = t10;
    }

    public final int a() {
        return this.f21458a;
    }

    public final T b() {
        return this.f21459b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f21458a == g0Var.f21458a && kotlin.jvm.internal.t.a(this.f21459b, g0Var.f21459b);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f21458a) * 31;
        T t10 = this.f21459b;
        return iHashCode + (t10 == null ? 0 : t10.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.f21458a + ", value=" + this.f21459b + ')';
    }
}
