package b2;

/* JADX INFO: compiled from: Encoding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3861a;

    private b(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f3861a = str;
    }

    public static b b(String str) {
        return new b(str);
    }

    public String a() {
        return this.f3861a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f3861a.equals(((b) obj).f3861a);
        }
        return false;
    }

    public int hashCode() {
        return this.f3861a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f3861a + "\"}";
    }
}
