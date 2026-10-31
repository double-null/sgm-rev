package g2;

/* JADX INFO: compiled from: GlobalMetrics.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b f15282b = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f15283a;

    /* JADX INFO: compiled from: GlobalMetrics.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e f15284a = null;

        a() {
        }

        public b a() {
            return new b(this.f15284a);
        }

        public a b(e eVar) {
            this.f15284a = eVar;
            return this;
        }
    }

    b(e eVar) {
        this.f15283a = eVar;
    }

    public static a b() {
        return new a();
    }

    public e a() {
        return this.f15283a;
    }
}
