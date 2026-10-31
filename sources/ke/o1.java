package ke;

/* JADX INFO: compiled from: WriteMode.kt */
/* JADX INFO: loaded from: classes5.dex */
public enum o1 {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    POLY_OBJ('[', ']');


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ bd.a f21396h = bd.b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f21397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f21398b;

    o1(char c10, char c11) {
        this.f21397a = c10;
        this.f21398b = c11;
    }

    public static bd.a<o1> c() {
        return f21396h;
    }
}
