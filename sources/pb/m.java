package pb;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f24178c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String base64) {
        super(r0.b.PRELOAD, null);
        kotlin.jvm.internal.t.f(base64, "base64");
        this.f24178c = base64;
    }

    public final String b() {
        return this.f24178c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && kotlin.jvm.internal.t.a(this.f24178c, ((m) obj).f24178c);
    }

    public int hashCode() {
        return this.f24178c.hashCode();
    }

    public String toString() {
        return "Base64MediaSource(base64=" + this.f24178c + ')';
    }
}
