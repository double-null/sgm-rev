package a5;

/* JADX INFO: loaded from: classes4.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f87a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f88b;

    private m(String str, String str2) {
        this.f87a = str;
        this.f88b = str2;
    }

    public static m a(String str, String str2) {
        i5.g.f(str, "Name is null or empty");
        i5.g.f(str2, "Version is null or empty");
        return new m(str, str2);
    }

    public String b() {
        return this.f87a;
    }

    public String c() {
        return this.f88b;
    }
}
