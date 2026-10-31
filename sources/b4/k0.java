package b4;

/* JADX INFO: compiled from: SessionEvent.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f3963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r0 f3964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f3965c;

    public k0(j eventType, r0 sessionData, b applicationInfo) {
        kotlin.jvm.internal.t.f(eventType, "eventType");
        kotlin.jvm.internal.t.f(sessionData, "sessionData");
        kotlin.jvm.internal.t.f(applicationInfo, "applicationInfo");
        this.f3963a = eventType;
        this.f3964b = sessionData;
        this.f3965c = applicationInfo;
    }

    public final b a() {
        return this.f3965c;
    }

    public final j b() {
        return this.f3963a;
    }

    public final r0 c() {
        return this.f3964b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.f3963a == k0Var.f3963a && kotlin.jvm.internal.t.a(this.f3964b, k0Var.f3964b) && kotlin.jvm.internal.t.a(this.f3965c, k0Var.f3965c);
    }

    public int hashCode() {
        return (((this.f3963a.hashCode() * 31) + this.f3964b.hashCode()) * 31) + this.f3965c.hashCode();
    }

    public String toString() {
        return "SessionEvent(eventType=" + this.f3963a + ", sessionData=" + this.f3964b + ", applicationInfo=" + this.f3965c + ')';
    }
}
