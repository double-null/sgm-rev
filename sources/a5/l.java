package a5;

/* JADX INFO: loaded from: classes4.dex */
public enum l {
    NATIVE("native"),
    JAVASCRIPT("javascript"),
    NONE("none");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f86a;

    l(String str) {
        this.f86a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f86a;
    }
}
