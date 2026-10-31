package o5;

/* JADX INFO: loaded from: classes4.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f23092b;

    private l(String str, String str2) {
        this.f23091a = str;
        this.f23092b = str2;
    }

    public static l a(String str, String str2) {
        w5.g.d(str, "Name is null or empty");
        w5.g.d(str2, "Version is null or empty");
        return new l(str, str2);
    }

    public String b() {
        return this.f23091a;
    }

    public String c() {
        return this.f23092b;
    }
}
