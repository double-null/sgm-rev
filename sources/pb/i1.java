package pb;

/* JADX INFO: loaded from: classes5.dex */
public enum i1 implements wb.q {
    ValidCreative("valid_creative"),
    BrokenCreative("broken_creative"),
    AnyCreative("any_creative"),
    Never("never");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f24112b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24118a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final i1 a(String str) {
            return (i1) wb.e0.l(i1.values(), str);
        }

        private a() {
        }
    }

    i1(String str) {
        this.f24118a = str;
    }

    @Override // wb.q
    public String getKey() {
        return this.f24118a;
    }
}
