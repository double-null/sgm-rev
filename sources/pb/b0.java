package pb;

/* JADX INFO: loaded from: classes5.dex */
public final class b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f23943b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23944a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final b0 a(Throwable throwable) {
            kotlin.jvm.internal.t.f(throwable, "throwable");
            String message = throwable.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            return new b0(message);
        }

        private a() {
        }
    }

    public b0(String message) {
        kotlin.jvm.internal.t.f(message, "message");
        this.f23944a = message;
    }

    public static final b0 a(Throwable th) {
        return f23943b.a(th);
    }

    public final String b() {
        return this.f23944a;
    }

    public String toString() {
        return this.f23944a;
    }
}
