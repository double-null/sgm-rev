package pb;

/* JADX INFO: loaded from: classes5.dex */
public enum g implements wb.q {
    Linear("linear"),
    EaseIn("ease_in"),
    EaseOut("ease_out"),
    EaseInOut("ease_in_out");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f24072b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24078a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final g a(String str) {
            return (g) wb.e0.l(g.values(), str);
        }

        private a() {
        }
    }

    g(String str) {
        this.f24078a = str;
    }

    @Override // wb.q
    public String getKey() {
        return this.f24078a;
    }
}
