package a5;

/* JADX INFO: loaded from: classes4.dex */
public enum e {
    HTML("html"),
    NATIVE("native"),
    JAVASCRIPT("javascript");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47a;

    e(String str) {
        this.f47a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f47a;
    }
}
