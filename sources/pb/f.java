package pb;

/* JADX INFO: loaded from: classes5.dex */
public enum f implements wb.q {
    Appear("appear"),
    Disappear("disappear");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f24031b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24035a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final f a(String str) {
            return (f) wb.e0.l(f.values(), str);
        }

        private a() {
        }
    }

    f(String str) {
        this.f24035a = str;
    }

    @Override // wb.q
    public String getKey() {
        return this.f24035a;
    }
}
