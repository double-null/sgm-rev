package pb;

/* JADX INFO: loaded from: classes5.dex */
public enum v0 implements wb.q {
    Portrait("portrait", 7),
    Landscape("landscape", 6);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f24236c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f24241b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        private a() {
        }
    }

    v0(String str, int i10) {
        this.f24240a = str;
        this.f24241b = i10;
    }

    public final int c() {
        return this.f24241b;
    }

    @Override // wb.q
    public String getKey() {
        return this.f24240a;
    }
}
