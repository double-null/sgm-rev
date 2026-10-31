package pb;

/* JADX INFO: loaded from: classes5.dex */
public enum d1 implements wb.q {
    None("none"),
    ToFill("to_fill"),
    AspectFill("aspect_fill"),
    AspectFit("aspect_fit");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f23992b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23998a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        private a() {
        }
    }

    d1(String str) {
        this.f23998a = str;
    }

    @Override // wb.q
    public String getKey() {
        return this.f23998a;
    }
}
