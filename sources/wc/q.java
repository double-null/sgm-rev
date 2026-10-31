package wc;

import java.io.Serializable;

/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class q<A, B> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A f27772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B f27773b;

    public q(A a10, B b10) {
        this.f27772a = a10;
        this.f27773b = b10;
    }

    public final A b() {
        return this.f27772a;
    }

    public final B c() {
        return this.f27773b;
    }

    public final A e() {
        return this.f27772a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return kotlin.jvm.internal.t.a(this.f27772a, qVar.f27772a) && kotlin.jvm.internal.t.a(this.f27773b, qVar.f27773b);
    }

    public final B f() {
        return this.f27773b;
    }

    public int hashCode() {
        A a10 = this.f27772a;
        int iHashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f27773b;
        return iHashCode + (b10 != null ? b10.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f27772a + ", " + this.f27773b + ')';
    }
}
