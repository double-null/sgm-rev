package m1;

/* JADX INFO: compiled from: SystemIdInfo.java */
/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22056b;

    public g(String str, int i10) {
        this.f22055a = str;
        this.f22056b = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f22056b != gVar.f22056b) {
            return false;
        }
        return this.f22055a.equals(gVar.f22055a);
    }

    public int hashCode() {
        return (this.f22055a.hashCode() * 31) + this.f22056b;
    }
}
