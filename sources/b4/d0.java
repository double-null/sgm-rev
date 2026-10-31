package b4;

/* JADX INFO: compiled from: SessionEvent.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f3935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f3936d;

    public d0(String processName, int i10, int i11, boolean z10) {
        kotlin.jvm.internal.t.f(processName, "processName");
        this.f3933a = processName;
        this.f3934b = i10;
        this.f3935c = i11;
        this.f3936d = z10;
    }

    public final int a() {
        return this.f3935c;
    }

    public final int b() {
        return this.f3934b;
    }

    public final String c() {
        return this.f3933a;
    }

    public final boolean d() {
        return this.f3936d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return kotlin.jvm.internal.t.a(this.f3933a, d0Var.f3933a) && this.f3934b == d0Var.f3934b && this.f3935c == d0Var.f3935c && this.f3936d == d0Var.f3936d;
    }

    public int hashCode() {
        return (((((this.f3933a.hashCode() * 31) + Integer.hashCode(this.f3934b)) * 31) + Integer.hashCode(this.f3935c)) * 31) + Boolean.hashCode(this.f3936d);
    }

    public String toString() {
        return "ProcessDetails(processName=" + this.f3933a + ", pid=" + this.f3934b + ", importance=" + this.f3935c + ", isDefaultProcess=" + this.f3936d + ')';
    }
}
