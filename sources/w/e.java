package w;

/* JADX INFO: compiled from: Pair.java */
/* JADX INFO: loaded from: classes.dex */
public class e<F, S> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f27487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S f27488b;

    public e(F f10, S s10) {
        this.f27487a = f10;
        this.f27488b = s10;
    }

    public static <A, B> e<A, B> a(A a10, B b10) {
        return new e<>(a10, b10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return d.a(eVar.f27487a, this.f27487a) && d.a(eVar.f27488b, this.f27488b);
    }

    public int hashCode() {
        F f10 = this.f27487a;
        int iHashCode = f10 == null ? 0 : f10.hashCode();
        S s10 = this.f27488b;
        return iHashCode ^ (s10 != null ? s10.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f27487a + " " + this.f27488b + "}";
    }
}
