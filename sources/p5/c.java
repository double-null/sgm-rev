package p5;

/* JADX INFO: loaded from: classes4.dex */
public enum c {
    PREROLL("preroll"),
    f23469c("midroll"),
    POSTROLL("postroll"),
    STANDALONE("standalone");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23473a;

    c(String str) {
        this.f23473a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f23473a;
    }
}
