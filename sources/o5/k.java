package o5;

/* JADX INFO: loaded from: classes4.dex */
public enum k {
    NATIVE("native"),
    JAVASCRIPT("javascript"),
    NONE("none");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23090a;

    k(String str) {
        this.f23090a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f23090a;
    }
}
