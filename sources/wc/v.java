package wc;

import java.io.Serializable;

/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class v<A, B, C> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A f27785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B f27786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C f27787c;

    public v(A a10, B b10, C c10) {
        this.f27785a = a10;
        this.f27786b = b10;
        this.f27787c = c10;
    }

    public final A b() {
        return this.f27785a;
    }

    public final B c() {
        return this.f27786b;
    }

    public final C e() {
        return this.f27787c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return kotlin.jvm.internal.t.a(this.f27785a, vVar.f27785a) && kotlin.jvm.internal.t.a(this.f27786b, vVar.f27786b) && kotlin.jvm.internal.t.a(this.f27787c, vVar.f27787c);
    }

    public int hashCode() {
        A a10 = this.f27785a;
        int iHashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f27786b;
        int iHashCode2 = (iHashCode + (b10 == null ? 0 : b10.hashCode())) * 31;
        C c10 = this.f27787c;
        return iHashCode2 + (c10 != null ? c10.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f27785a + ", " + this.f27786b + ", " + this.f27787c + ')';
    }
}
