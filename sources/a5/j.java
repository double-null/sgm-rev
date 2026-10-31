package a5;

/* JADX INFO: loaded from: classes4.dex */
public enum j {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER("other");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f78a;

    j(String str) {
        this.f78a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f78a;
    }
}
