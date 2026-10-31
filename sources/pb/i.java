package pb;

/* JADX INFO: loaded from: classes5.dex */
public enum i implements wb.q {
    Fade("fade"),
    Slide("slide");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f24106b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24110a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        private a() {
        }
    }

    i(String str) {
        this.f24110a = str;
    }

    @Override // wb.q
    public String getKey() {
        return this.f24110a;
    }
}
