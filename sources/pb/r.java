package pb;

/* JADX INFO: loaded from: classes5.dex */
public enum r implements wb.q {
    ColorHistogram("color_histogram"),
    BrightnessVariance("brightness_variance"),
    EdgeDetection("edge_detection");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f24196b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24201a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final r a(String str) {
            return (r) wb.e0.l(r.values(), str);
        }

        private a() {
        }
    }

    r(String str) {
        this.f24201a = str;
    }

    @Override // wb.q
    public String getKey() {
        return this.f24201a;
    }
}
