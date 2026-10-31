package pb;

/* JADX INFO: loaded from: classes5.dex */
public enum b implements wb.q {
    Mraid("mraid"),
    Video("video"),
    Image("image"),
    Label("label"),
    Countdown("countdown"),
    Progress("progress");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f23934b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23942a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        private a() {
        }
    }

    b(String str) {
        this.f23942a = str;
    }

    @Override // wb.q
    public String getKey() {
        return this.f23942a;
    }
}
