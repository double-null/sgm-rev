package cc;

/* JADX INFO: compiled from: Method.kt */
/* JADX INFO: loaded from: classes5.dex */
public enum d {
    Get("GET"),
    Post("POST"),
    Head("HEAD");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5475a;

    d(String str) {
        this.f5475a = str;
    }

    public final String c() {
        return this.f5475a;
    }
}
