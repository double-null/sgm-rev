package o5;

/* JADX INFO: loaded from: classes4.dex */
public enum f {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO("video"),
    AUDIO("audio");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23062a;

    f(String str) {
        this.f23062a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f23062a;
    }
}
