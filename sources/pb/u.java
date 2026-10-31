package pb;

/* JADX INFO: loaded from: classes5.dex */
public enum u implements wb.q {
    FullLoad("full_load"),
    PartialLoad("partial_load"),
    StreamLoad("stream_load");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f24223b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24228a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        private a() {
        }
    }

    u(String str) {
        this.f24228a = str;
    }

    @Override // wb.q
    public String getKey() {
        return this.f24228a;
    }
}
