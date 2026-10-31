package b5;

/* JADX INFO: loaded from: classes4.dex */
public enum c {
    PREROLL("preroll"),
    MIDROLL("midroll"),
    POSTROLL("postroll"),
    STANDALONE("standalone");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4101a;

    c(String str) {
        this.f4101a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f4101a;
    }
}
