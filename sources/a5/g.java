package a5;

/* JADX INFO: loaded from: classes4.dex */
public enum g {
    CTV("ctv"),
    MOBILE("mobile"),
    OTHER("other");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f59a;

    g(String str) {
        this.f59a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f59a;
    }
}
